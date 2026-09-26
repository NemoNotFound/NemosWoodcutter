package com.nemonotfound.nemos.woodcutter.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static com.nemonotfound.nemos.woodcutter.Constants.MOD_ID;

public final class WoodcutterBlockTags {

    public static final TagKey<Block> WOODCUTTERS = bind(MOD_ID, "woodcutters");

    public static final TagKey<Block> STONECUTTER_DANGER = bind("dangerclose", "stonecutter_danger");
    public static final TagKey<Block> LEGACY_STONECUTTER_DANGER = bind("danger_close", "stonecutter_danger");

    private WoodcutterBlockTags() {}

    private static TagKey<Block> bind(String namespace, String path) {
        return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(namespace, path));
    }
}
