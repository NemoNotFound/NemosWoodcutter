package com.nemonotfound.nemos.woodcutter.datagen.recipe;

import com.nemonotfound.nemos.woodcutter.datagen.WoodcutterRecipeProvider;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.frozenblock.wilderwild.registry.WWItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.woodcutter.Constants.WILDER_WILD_MOD_ID;

public class WilderWildRecipeProvider extends FabricRecipeProvider {
    private static final TagKey<Item> BAOBAB_LOGS = itemTag("baobab_logs");
    private static final TagKey<Item> CYPRESS_LOGS = itemTag("cypress_logs");
    private static final TagKey<Item> MAPLE_LOGS = itemTag("maple_logs");
    private static final TagKey<Item> PALM_LOGS = itemTag("palm_logs");
    private static final TagKey<Item> WILLOW_LOGS = itemTag("willow_logs");
    private static final TagKey<Item> HOLLOWED_OAK_LOGS = itemTag("hollowed_oak_logs");
    private static final TagKey<Item> HOLLOWED_SPRUCE_LOGS = itemTag("hollowed_spruce_logs");
    private static final TagKey<Item> HOLLOWED_BIRCH_LOGS = itemTag("hollowed_birch_logs");
    private static final TagKey<Item> HOLLOWED_JUNGLE_LOGS = itemTag("hollowed_jungle_logs");
    private static final TagKey<Item> HOLLOWED_ACACIA_LOGS = itemTag("hollowed_acacia_logs");
    private static final TagKey<Item> HOLLOWED_DARK_OAK_LOGS = itemTag("hollowed_dark_oak_logs");
    private static final TagKey<Item> HOLLOWED_MANGROVE_LOGS = itemTag("hollowed_mangrove_logs");
    private static final TagKey<Item> HOLLOWED_CHERRY_LOGS = itemTag("hollowed_cherry_logs");
    private static final TagKey<Item> HOLLOWED_PALE_OAK_LOGS = itemTag("hollowed_pale_oak_logs");
    private static final TagKey<Item> HOLLOWED_POPLAR_LOGS = itemTag("hollowed_poplar_logs");
    private static final TagKey<Item> HOLLOWED_CRIMSON_STEMS = itemTag("hollowed_crimson_stems");
    private static final TagKey<Item> HOLLOWED_WARPED_STEMS = itemTag("hollowed_warped_stems");
    private static final TagKey<Item> HOLLOWED_BAOBAB_LOGS = itemTag("hollowed_baobab_logs");
    private static final TagKey<Item> HOLLOWED_CYPRESS_LOGS = itemTag("hollowed_cypress_logs");
    private static final TagKey<Item> HOLLOWED_MAPLE_LOGS = itemTag("hollowed_maple_logs");
    private static final TagKey<Item> HOLLOWED_PALM_LOGS = itemTag("hollowed_palm_logs");
    private static final TagKey<Item> HOLLOWED_WILLOW_LOGS = itemTag("hollowed_willow_logs");

    public WilderWildRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider,
            @NonNull BootstrapContext<Recipe<?>> recipeOutput,
            @NonNull BootstrapContext<Advancement> advancementOutput) {
        return new WoodcutterRecipeProvider(recipeOutput, advancementOutput) {
            @Override
            public void buildRecipes() {
                if (!Services.MOD_LOADER_HELPER.isModLoaded(WILDER_WILD_MOD_ID)) {
                    return;
                }

                var modDependencies = List.of(WILDER_WILD_MOD_ID);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, WWItems.BAOBAB_PLANKS.get(), 2, WWItems.BAOBAB_BOAT.get());
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_BOAT.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.BAOBAB_PLANKS.get(), WWItems.BAOBAB_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.BAOBAB_PLANKS.get(), 2, WWItems.BAOBAB_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.BAOBAB_PLANKS.get(), WWItems.BAOBAB_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.BAOBAB_PLANKS.get(), WWItems.BAOBAB_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.BAOBAB_PLANKS.get(), WWItems.BAOBAB_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.BAOBAB_PLANKS.get(), WWItems.BAOBAB_SIGN.get(), 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.BAOBAB_PLANKS.get(), WWItems.BAOBAB_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.BAOBAB_PLANKS.get(), WWItems.BAOBAB_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.BAOBAB_PLANKS.get(), WWItems.BAOBAB_TRAPDOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.BAOBAB_LOG.get(), WWItems.STRIPPED_BAOBAB_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.BAOBAB_WOOD.get(), WWItems.STRIPPED_BAOBAB_WOOD.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.BAOBAB_LOG.get(), WWItems.BAOBAB_SHELF.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.STRIPPED_BAOBAB_LOG.get(), WWItems.BAOBAB_SHELF.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_SIGN.get(), 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BAOBAB_LOGS, "has_baobab_logs", WWItems.BAOBAB_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, WWItems.CYPRESS_PLANKS.get(), 2, WWItems.CYPRESS_BOAT.get());
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_BOAT.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.CYPRESS_PLANKS.get(), WWItems.CYPRESS_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.CYPRESS_PLANKS.get(), 2, WWItems.CYPRESS_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.CYPRESS_PLANKS.get(), WWItems.CYPRESS_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.CYPRESS_PLANKS.get(), WWItems.CYPRESS_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.CYPRESS_PLANKS.get(), WWItems.CYPRESS_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.CYPRESS_PLANKS.get(), WWItems.CYPRESS_SIGN.get(), 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.CYPRESS_PLANKS.get(), WWItems.CYPRESS_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.CYPRESS_PLANKS.get(), WWItems.CYPRESS_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.CYPRESS_PLANKS.get(), WWItems.CYPRESS_TRAPDOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.CYPRESS_LOG.get(), WWItems.STRIPPED_CYPRESS_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.CYPRESS_WOOD.get(), WWItems.STRIPPED_CYPRESS_WOOD.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.CYPRESS_LOG.get(), WWItems.CYPRESS_SHELF.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.STRIPPED_CYPRESS_LOG.get(), WWItems.CYPRESS_SHELF.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_SIGN.get(), 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, CYPRESS_LOGS, "has_cypress_logs", WWItems.CYPRESS_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, WWItems.MAPLE_PLANKS.get(), 2, WWItems.MAPLE_BOAT.get());
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_BOAT.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.MAPLE_PLANKS.get(), WWItems.MAPLE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.MAPLE_PLANKS.get(), 2, WWItems.MAPLE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.MAPLE_PLANKS.get(), WWItems.MAPLE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.MAPLE_PLANKS.get(), WWItems.MAPLE_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.MAPLE_PLANKS.get(), WWItems.MAPLE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.MAPLE_PLANKS.get(), WWItems.MAPLE_SIGN.get(), 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.MAPLE_PLANKS.get(), WWItems.MAPLE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.MAPLE_PLANKS.get(), WWItems.MAPLE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.MAPLE_PLANKS.get(), WWItems.MAPLE_TRAPDOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.MAPLE_LOG.get(), WWItems.STRIPPED_MAPLE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.MAPLE_WOOD.get(), WWItems.STRIPPED_MAPLE_WOOD.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.MAPLE_LOG.get(), WWItems.MAPLE_SHELF.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.STRIPPED_MAPLE_LOG.get(), WWItems.MAPLE_SHELF.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_SIGN.get(), 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MAPLE_LOGS, "has_maple_logs", WWItems.MAPLE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, WWItems.PALM_PLANKS.get(), 2, WWItems.PALM_BOAT.get());
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_BOAT.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.PALM_PLANKS.get(), WWItems.PALM_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.PALM_PLANKS.get(), 2, WWItems.PALM_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.PALM_PLANKS.get(), WWItems.PALM_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.PALM_PLANKS.get(), WWItems.PALM_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.PALM_PLANKS.get(), WWItems.PALM_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.PALM_PLANKS.get(), WWItems.PALM_SIGN.get(), 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.PALM_PLANKS.get(), WWItems.PALM_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.PALM_PLANKS.get(), WWItems.PALM_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.PALM_PLANKS.get(), WWItems.PALM_TRAPDOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.PALM_LOG.get(), WWItems.STRIPPED_PALM_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.PALM_WOOD.get(), WWItems.STRIPPED_PALM_WOOD.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.PALM_LOG.get(), WWItems.PALM_SHELF.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.STRIPPED_PALM_LOG.get(), WWItems.PALM_SHELF.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_SIGN.get(), 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, PALM_LOGS, "has_palm_logs", WWItems.PALM_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, WWItems.WILLOW_PLANKS.get(), 2, WWItems.WILLOW_BOAT.get());
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_BOAT.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.WILLOW_PLANKS.get(), WWItems.WILLOW_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.WILLOW_PLANKS.get(), 2, WWItems.WILLOW_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.WILLOW_PLANKS.get(), WWItems.WILLOW_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.WILLOW_PLANKS.get(), WWItems.WILLOW_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.WILLOW_PLANKS.get(), WWItems.WILLOW_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.WILLOW_PLANKS.get(), WWItems.WILLOW_SIGN.get(), 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.WILLOW_PLANKS.get(), WWItems.WILLOW_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.WILLOW_PLANKS.get(), WWItems.WILLOW_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WWItems.WILLOW_PLANKS.get(), WWItems.WILLOW_TRAPDOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.WILLOW_LOG.get(), WWItems.STRIPPED_WILLOW_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.WILLOW_WOOD.get(), WWItems.STRIPPED_WILLOW_WOOD.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.WILLOW_LOG.get(), WWItems.WILLOW_SHELF.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WWItems.STRIPPED_WILLOW_LOG.get(), WWItems.WILLOW_SHELF.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_SIGN.get(), 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, WILLOW_LOGS, "has_willow_logs", WWItems.WILLOW_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.OAK_LOG, WWItems.HOLLOWED_OAK_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_OAK_LOG, WWItems.STRIPPED_HOLLOWED_OAK_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_OAK_LOG.get(), WWItems.STRIPPED_HOLLOWED_OAK_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_OAK_LOGS, "has_hollowed_oak_logs", Items.OAK_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.SPRUCE_LOG, WWItems.HOLLOWED_SPRUCE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_SPRUCE_LOG, WWItems.STRIPPED_HOLLOWED_SPRUCE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_SPRUCE_LOG.get(), WWItems.STRIPPED_HOLLOWED_SPRUCE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_SPRUCE_LOGS, "has_hollowed_spruce_logs", Items.SPRUCE_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.BIRCH_LOG, WWItems.HOLLOWED_BIRCH_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_BIRCH_LOG, WWItems.STRIPPED_HOLLOWED_BIRCH_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_BIRCH_LOG.get(), WWItems.STRIPPED_HOLLOWED_BIRCH_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_BIRCH_LOGS, "has_hollowed_birch_logs", Items.BIRCH_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.JUNGLE_LOG, WWItems.HOLLOWED_JUNGLE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_JUNGLE_LOG, WWItems.STRIPPED_HOLLOWED_JUNGLE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_JUNGLE_LOG.get(), WWItems.STRIPPED_HOLLOWED_JUNGLE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_JUNGLE_LOGS, "has_hollowed_jungle_logs", Items.JUNGLE_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.ACACIA_LOG, WWItems.HOLLOWED_ACACIA_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_ACACIA_LOG, WWItems.STRIPPED_HOLLOWED_ACACIA_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_ACACIA_LOG.get(), WWItems.STRIPPED_HOLLOWED_ACACIA_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_ACACIA_LOGS, "has_hollowed_acacia_logs", Items.ACACIA_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.DARK_OAK_LOG, WWItems.HOLLOWED_DARK_OAK_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_DARK_OAK_LOG, WWItems.STRIPPED_HOLLOWED_DARK_OAK_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_DARK_OAK_LOG.get(), WWItems.STRIPPED_HOLLOWED_DARK_OAK_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_DARK_OAK_LOGS, "has_hollowed_dark_oak_logs", Items.DARK_OAK_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.MANGROVE_LOG, WWItems.HOLLOWED_MANGROVE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_MANGROVE_LOG, WWItems.STRIPPED_HOLLOWED_MANGROVE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_MANGROVE_LOG.get(), WWItems.STRIPPED_HOLLOWED_MANGROVE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_MANGROVE_LOGS, "has_hollowed_mangrove_logs", Items.MANGROVE_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.CHERRY_LOG, WWItems.HOLLOWED_CHERRY_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_CHERRY_LOG, WWItems.STRIPPED_HOLLOWED_CHERRY_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_CHERRY_LOG.get(), WWItems.STRIPPED_HOLLOWED_CHERRY_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_CHERRY_LOGS, "has_hollowed_cherry_logs", Items.CHERRY_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.PALE_OAK_LOG, WWItems.HOLLOWED_PALE_OAK_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_PALE_OAK_LOG, WWItems.STRIPPED_HOLLOWED_PALE_OAK_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_PALE_OAK_LOG.get(), WWItems.STRIPPED_HOLLOWED_PALE_OAK_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_PALE_OAK_LOGS, "has_hollowed_pale_oak_logs", Items.PALE_OAK_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.POPLAR_LOG, WWItems.HOLLOWED_POPLAR_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_POPLAR_LOG, WWItems.STRIPPED_HOLLOWED_POPLAR_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_POPLAR_LOG.get(), WWItems.STRIPPED_HOLLOWED_POPLAR_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_POPLAR_LOGS, "has_hollowed_poplar_logs", Items.POPLAR_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.CRIMSON_STEM, WWItems.HOLLOWED_CRIMSON_STEM.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_CRIMSON_STEM, WWItems.STRIPPED_HOLLOWED_CRIMSON_STEM.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_CRIMSON_STEM.get(), WWItems.STRIPPED_HOLLOWED_CRIMSON_STEM.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_CRIMSON_STEMS, "has_hollowed_crimson_stems", Items.CRIMSON_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.WARPED_STEM, WWItems.HOLLOWED_WARPED_STEM.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Items.STRIPPED_WARPED_STEM, WWItems.STRIPPED_HOLLOWED_WARPED_STEM.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_WARPED_STEM.get(), WWItems.STRIPPED_HOLLOWED_WARPED_STEM.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_WARPED_STEMS, "has_hollowed_warped_stems", Items.WARPED_PLANKS, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.BAOBAB_LOG.get(), WWItems.HOLLOWED_BAOBAB_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.STRIPPED_BAOBAB_LOG.get(), WWItems.STRIPPED_HOLLOWED_BAOBAB_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_BAOBAB_LOG.get(), WWItems.STRIPPED_HOLLOWED_BAOBAB_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_BAOBAB_LOGS, "has_hollowed_baobab_logs", WWItems.BAOBAB_PLANKS.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.CYPRESS_LOG.get(), WWItems.HOLLOWED_CYPRESS_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.STRIPPED_CYPRESS_LOG.get(), WWItems.STRIPPED_HOLLOWED_CYPRESS_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_CYPRESS_LOG.get(), WWItems.STRIPPED_HOLLOWED_CYPRESS_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_CYPRESS_LOGS, "has_hollowed_cypress_logs", WWItems.CYPRESS_PLANKS.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.MAPLE_LOG.get(), WWItems.HOLLOWED_MAPLE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.STRIPPED_MAPLE_LOG.get(), WWItems.STRIPPED_HOLLOWED_MAPLE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_MAPLE_LOG.get(), WWItems.STRIPPED_HOLLOWED_MAPLE_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_MAPLE_LOGS, "has_hollowed_maple_logs", WWItems.MAPLE_PLANKS.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.PALM_LOG.get(), WWItems.HOLLOWED_PALM_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.STRIPPED_PALM_LOG.get(), WWItems.STRIPPED_HOLLOWED_PALM_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_PALM_LOG.get(), WWItems.STRIPPED_HOLLOWED_PALM_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_PALM_LOGS, "has_hollowed_palm_logs", WWItems.PALM_PLANKS.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.WILLOW_LOG.get(), WWItems.HOLLOWED_WILLOW_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.STRIPPED_WILLOW_LOG.get(), WWItems.STRIPPED_HOLLOWED_WILLOW_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, WWItems.HOLLOWED_WILLOW_LOG.get(), WWItems.STRIPPED_HOLLOWED_WILLOW_LOG.get());
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, HOLLOWED_WILLOW_LOGS, "has_hollowed_willow_logs", WWItems.WILLOW_PLANKS.get(), 2);

            }
        };
    }

    private static TagKey<Item> itemTag(String path) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(WILDER_WILD_MOD_ID, path));
    }

    @Override
    public @NotNull String getName() {
        return "Wilder Wild Woodcutting Recipes";
    }
}
