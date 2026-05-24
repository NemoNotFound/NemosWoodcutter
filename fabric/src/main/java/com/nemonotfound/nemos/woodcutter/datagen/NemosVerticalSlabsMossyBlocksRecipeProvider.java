package com.nemonotfound.nemos.woodcutter.datagen;

import com.nemonotfound.nemos.mossy.blocks.tags.NemosMossyItemTags;
import com.nemonotfound.nemos.mossy.blocks.world.level.block.MossyBlocks;
import com.nemonotfound.nemos.vertical.slabs.world.item.VerticalSlabItems;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.woodcutter.Constants.NEMOS_MOSSY_BLOCKS_MOD_ID;
import static com.nemonotfound.nemos.woodcutter.Constants.NEMOS_VERTICAL_SLABS_MOD_ID;

public class NemosVerticalSlabsMossyBlocksRecipeProvider extends FabricRecipeProvider {

    public NemosVerticalSlabsMossyBlocksRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider, @NonNull RecipeOutput recipeOutput) {
        return new WoodcutterRecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                if (!Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID)) {
                    return;
                }

                var modDependencies = List.of(NEMOS_VERTICAL_SLABS_MOD_ID, NEMOS_MOSSY_BLOCKS_MOD_ID);

                var hasMossyOakWoodCriteria = "hasMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, VerticalSlabItems.MOSSY_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_OAK_PLANKS, VerticalSlabItems.MOSSY_OAK_VERTICAL_SLAB, 2);

                var hasMossySpruceWoodCriteria = "hasMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, VerticalSlabItems.MOSSY_SPRUCE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_SPRUCE_PLANKS, VerticalSlabItems.MOSSY_SPRUCE_VERTICAL_SLAB, 2);

                var hasMossyBirchWoodCriteria = "hasMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, VerticalSlabItems.MOSSY_BIRCH_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BIRCH_PLANKS, VerticalSlabItems.MOSSY_BIRCH_VERTICAL_SLAB, 2);

                var hasMossyJungleWoodCriteria = "hasMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, VerticalSlabItems.MOSSY_JUNGLE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_JUNGLE_PLANKS, VerticalSlabItems.MOSSY_JUNGLE_VERTICAL_SLAB, 2);

                var hasMossyAcaciaWoodCriteria = "hasMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, VerticalSlabItems.MOSSY_ACACIA_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_ACACIA_PLANKS, VerticalSlabItems.MOSSY_ACACIA_VERTICAL_SLAB, 2);

                var hasMossyDarkOakWoodCriteria = "hasMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, VerticalSlabItems.MOSSY_DARK_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_DARK_OAK_PLANKS, VerticalSlabItems.MOSSY_DARK_OAK_VERTICAL_SLAB, 2);

                var hasMossyMangroveCriteria = "hasMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, VerticalSlabItems.MOSSY_MANGROVE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_MANGROVE_PLANKS, VerticalSlabItems.MOSSY_MANGROVE_VERTICAL_SLAB, 2);

                var hasMossyCherryWoodCriteria = "hasMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, VerticalSlabItems.MOSSY_CHERRY_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_CHERRY_PLANKS, VerticalSlabItems.MOSSY_CHERRY_VERTICAL_SLAB, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, VerticalSlabItems.MOSSY_BAMBOO_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, VerticalSlabItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, VerticalSlabItems.MOSSY_BAMBOO_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, VerticalSlabItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_MOSAIC, VerticalSlabItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 2);

                var hasMossyCrimsonWoodCriteria = "hasMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, VerticalSlabItems.MOSSY_CRIMSON_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_CRIMSON_PLANKS, VerticalSlabItems.MOSSY_CRIMSON_VERTICAL_SLAB, 2);

                var hasMossyWarpedWoodCriteria = "hasMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, VerticalSlabItems.MOSSY_WARPED_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_WARPED_PLANKS, VerticalSlabItems.MOSSY_WARPED_VERTICAL_SLAB, 2);

                var hasPaleMossyOakWoodCriteria = "hasPaleMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, VerticalSlabItems.PALE_MOSSY_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_OAK_PLANKS, VerticalSlabItems.PALE_MOSSY_OAK_VERTICAL_SLAB, 2);

                var hasPaleMossySpruceWoodCriteria = "hasPaleMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, VerticalSlabItems.PALE_MOSSY_SPRUCE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_PLANKS, VerticalSlabItems.PALE_MOSSY_SPRUCE_VERTICAL_SLAB, 2);

                var hasPaleMossyBirchWoodCriteria = "hasPaleMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, VerticalSlabItems.PALE_MOSSY_BIRCH_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_PLANKS, VerticalSlabItems.PALE_MOSSY_BIRCH_VERTICAL_SLAB, 2);

                var hasPaleMossyJungleWoodCriteria = "hasPaleMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, VerticalSlabItems.PALE_MOSSY_JUNGLE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_PLANKS, VerticalSlabItems.PALE_MOSSY_JUNGLE_VERTICAL_SLAB, 2);

                var hasPaleMossyAcaciaWoodCriteria = "hasPaleMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, VerticalSlabItems.PALE_MOSSY_ACACIA_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_PLANKS, VerticalSlabItems.PALE_MOSSY_ACACIA_VERTICAL_SLAB, 2);

                var hasPaleMossyDarkOakWoodCriteria = "hasPaleMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, VerticalSlabItems.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS, VerticalSlabItems.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB, 2);

                var hasPaleMossyMangroveCriteria = "hasPaleMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, VerticalSlabItems.PALE_MOSSY_MANGROVE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_PLANKS, VerticalSlabItems.PALE_MOSSY_MANGROVE_VERTICAL_SLAB, 2);

                var hasPaleMossyCherryWoodCriteria = "hasPaleMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, VerticalSlabItems.PALE_MOSSY_CHERRY_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_PLANKS, VerticalSlabItems.PALE_MOSSY_CHERRY_VERTICAL_SLAB, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, VerticalSlabItems.PALE_MOSSY_BAMBOO_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, VerticalSlabItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, VerticalSlabItems.PALE_MOSSY_BAMBOO_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, VerticalSlabItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_MOSAIC, VerticalSlabItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 2);

                var hasPaleMossyCrimsonWoodCriteria = "hasPaleMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, VerticalSlabItems.PALE_MOSSY_CRIMSON_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_PLANKS, VerticalSlabItems.PALE_MOSSY_CRIMSON_VERTICAL_SLAB, 2);

                var hasPaleMossyWarpedWoodCriteria = "hasPaleMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, VerticalSlabItems.PALE_MOSSY_WARPED_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_PLANKS, VerticalSlabItems.PALE_MOSSY_WARPED_VERTICAL_SLAB, 2);

                var hasCrimsonMossyOakWoodCriteria = "hasCrimsonMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, VerticalSlabItems.CRIMSON_MOSSY_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_OAK_VERTICAL_SLAB, 2);

                var hasCrimsonMossySpruceWoodCriteria = "hasCrimsonMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, VerticalSlabItems.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB, 2);

                var hasCrimsonMossyBirchWoodCriteria = "hasCrimsonMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, VerticalSlabItems.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB, 2);

                var hasCrimsonMossyJungleWoodCriteria = "hasCrimsonMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, VerticalSlabItems.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB, 2);

                var hasCrimsonMossyAcaciaWoodCriteria = "hasCrimsonMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, VerticalSlabItems.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB, 2);

                var hasCrimsonMossyDarkOakWoodCriteria = "hasCrimsonMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, VerticalSlabItems.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB, 2);

                var hasCrimsonMossyMangroveCriteria = "hasCrimsonMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, VerticalSlabItems.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB, 2);

                var hasCrimsonMossyCherryWoodCriteria = "hasCrimsonMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, VerticalSlabItems.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC, VerticalSlabItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 2);

                var hasCrimsonMossyCrimsonWoodCriteria = "hasCrimsonMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, VerticalSlabItems.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB, 2);

                var hasCrimsonMossyWarpedWoodCriteria = "hasCrimsonMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, VerticalSlabItems.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS, VerticalSlabItems.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB, 2);

                var hasWarpedMossyOakWoodCriteria = "hasWarpedMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, VerticalSlabItems.WARPED_MOSSY_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_PLANKS, VerticalSlabItems.WARPED_MOSSY_OAK_VERTICAL_SLAB, 2);

                var hasWarpedMossySpruceWoodCriteria = "hasWarpedMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, VerticalSlabItems.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS, VerticalSlabItems.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB, 2);

                var hasWarpedMossyBirchWoodCriteria = "hasWarpedMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, VerticalSlabItems.WARPED_MOSSY_BIRCH_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_PLANKS, VerticalSlabItems.WARPED_MOSSY_BIRCH_VERTICAL_SLAB, 2);

                var hasWarpedMossyJungleWoodCriteria = "hasWarpedMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, VerticalSlabItems.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS, VerticalSlabItems.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB, 2);

                var hasWarpedMossyAcaciaWoodCriteria = "hasWarpedMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, VerticalSlabItems.WARPED_MOSSY_ACACIA_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_PLANKS, VerticalSlabItems.WARPED_MOSSY_ACACIA_VERTICAL_SLAB, 2);

                var hasWarpedMossyDarkOakWoodCriteria = "hasWarpedMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, VerticalSlabItems.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS, VerticalSlabItems.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB, 2);

                var hasWarpedMossyMangroveCriteria = "hasWarpedMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, VerticalSlabItems.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS, VerticalSlabItems.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB, 2);

                var hasWarpedMossyCherryWoodCriteria = "hasWarpedMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, VerticalSlabItems.WARPED_MOSSY_CHERRY_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_PLANKS, VerticalSlabItems.WARPED_MOSSY_CHERRY_VERTICAL_SLAB, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, VerticalSlabItems.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, VerticalSlabItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, VerticalSlabItems.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, VerticalSlabItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_MOSAIC, VerticalSlabItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB, 2);

                var hasWarpedMossyCrimsonWoodCriteria = "hasWarpedMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, VerticalSlabItems.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS, VerticalSlabItems.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB, 2);

                var hasWarpedMossyWarpedWoodCriteria = "hasWarpedMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, VerticalSlabItems.WARPED_MOSSY_WARPED_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_PLANKS, VerticalSlabItems.WARPED_MOSSY_WARPED_VERTICAL_SLAB, 2);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Vertical Slabs x Nemo's Mossy Blocks Woodcutting Recipes";
    }
}
