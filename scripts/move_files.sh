#!/bin/bash

move_files() {
  local -a ids=("$@")
  local directoryName
  directoryName=$(IFS=_; echo "${ids[*]}")

  local src="../common/src/generated/resources/data/minecraft/recipe"
  local dest="../common/src/main/resources/resourcepacks/${directoryName}/data/nemos_woodcutter/recipe"

  # Build JSON array from bash args for jq comparison
  local expected_json
  expected_json="$(printf '%s\n' "${ids[@]}" | jq -R . | jq -s '.')"

  find "$src" -type f -name "*.json" -print0 | while IFS= read -r -d '' FILE; do
    if jq -e --argjson expected "$expected_json" \
         'has("modDependencies") and (.modDependencies == $expected)' \
         "$FILE" >/dev/null 2>&1; then

      REL_PATH="${FILE#$src/}"                     # preserve subfolder structure
      DEST_PATH="$dest/$(dirname "$REL_PATH")"
      mkdir -p "$DEST_PATH"

      echo "Moving: $FILE -> $DEST_PATH/"
      mv "$FILE" "$DEST_PATH/"

      # --- move matching advancement with same json filename ---
      base_name="$(basename "$REL_PATH" .json)"
      rel_dir="$(dirname "$REL_PATH")"
      [[ "$rel_dir" == "." ]] && rel_dir=""        # handle top-level recipes

      # Strip the trailing '/recipe' to get the data root
      src_root="${src%/recipe}"
      dest_root="${dest%/recipe}"

      # 1) mirrored path under advancements/recipes
      try1="$src_root/advancement/recipes/${rel_dir:+$rel_dir/}$base_name.json"

      moved=0
      if [[ -f "$try1" ]]; then
        adv_rel="${try1#$src_root/}"
        adv_dest_dir="$dest_root/$(dirname "$adv_rel")"
        mkdir -p "$adv_dest_dir"
        echo "Moving advancement: $try1 -> $adv_dest_dir/"
        mv "$try1" "$adv_dest_dir/"
        moved=1
      fi

      # 2) any category level like advancements/recipes/building_blocks/...
      if [[ $moved -eq 0 ]]; then
        for cand in "$src_root/advancement/recipes"/*/${rel_dir:+$rel_dir/}"$base_name.json"; do
          [[ -f "$cand" ]] || continue
          adv_rel="${cand#$src_root/}"
          adv_dest_dir="$dest_root/$(dirname "$adv_rel")"
          mkdir -p "$adv_dest_dir"
          echo "Moving advancement: $cand -> $adv_dest_dir/"
          mv "$cand" "$adv_dest_dir/"
        done
      fi
      # ---------------------------------------------------------
    fi
  done
}

move_files "biomesoplenty"
move_files "nemos_mossy_blocks"
move_files "nemos_vertical_slabs"
move_files "nemos_vertical_slabs" "biomesoplenty"
move_files "nemos_vertical_slabs" "nemos_mossy_blocks"
