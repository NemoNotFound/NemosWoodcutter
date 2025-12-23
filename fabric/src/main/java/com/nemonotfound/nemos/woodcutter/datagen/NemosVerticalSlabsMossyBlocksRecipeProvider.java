package com.nemonotfound.nemos.woodcutter.datagen;

import com.devnemo.nemos.mossy.blocks.tags.NemosMossyItemTags;
import com.devnemo.nemos.mossy.blocks.world.level.block.NemosMossyBlocks;
import com.devnemo.nemos.vertical.slabs.world.item.NemosVerticalItems;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.woodcutter.Constants.NEMOS_MOSSY_BLOCKS_MOD_ID;
import static com.nemonotfound.nemos.woodcutter.Constants.NEMOS_VERTICAL_SLABS_MOD_ID;

public class NemosVerticalSlabsMossyBlocksRecipeProvider extends FabricRecipeProvider {

    public NemosVerticalSlabsMossyBlocksRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new WoodcutterRecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                if (!Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID)) {
                    return;
                }

                var modDependencies = List.of(NEMOS_VERTICAL_SLABS_MOD_ID, NEMOS_MOSSY_BLOCKS_MOD_ID);

                var hasMossyOakWoodCriteria = "hasMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, NemosVerticalItems.MOSSY_OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), NemosVerticalItems.MOSSY_OAK_VERTICAL_SLAB.get(), 2);

                var hasMossySpruceWoodCriteria = "hasMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, NemosVerticalItems.MOSSY_SPRUCE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), NemosVerticalItems.MOSSY_SPRUCE_VERTICAL_SLAB.get(), 2);

                var hasMossyBirchWoodCriteria = "hasMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, NemosVerticalItems.MOSSY_BIRCH_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), NemosVerticalItems.MOSSY_BIRCH_VERTICAL_SLAB.get(), 2);

                var hasMossyJungleWoodCriteria = "hasMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, NemosVerticalItems.MOSSY_JUNGLE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), NemosVerticalItems.MOSSY_JUNGLE_VERTICAL_SLAB.get(), 2);

                var hasMossyAcaciaWoodCriteria = "hasMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, NemosVerticalItems.MOSSY_ACACIA_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), NemosVerticalItems.MOSSY_ACACIA_VERTICAL_SLAB.get(), 2);

                var hasMossyDarkOakWoodCriteria = "hasMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, NemosVerticalItems.MOSSY_DARK_OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), NemosVerticalItems.MOSSY_DARK_OAK_VERTICAL_SLAB.get(), 2);

                var hasMossyMangroveCriteria = "hasMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, NemosVerticalItems.MOSSY_MANGROVE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), NemosVerticalItems.MOSSY_MANGROVE_VERTICAL_SLAB.get(), 2);

                var hasMossyCherryWoodCriteria = "hasMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, NemosVerticalItems.MOSSY_CHERRY_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), NemosVerticalItems.MOSSY_CHERRY_VERTICAL_SLAB.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosVerticalItems.MOSSY_BAMBOO_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosVerticalItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosVerticalItems.MOSSY_BAMBOO_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosVerticalItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_MOSAIC.get(), NemosVerticalItems.MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 2);

                var hasMossyCrimsonWoodCriteria = "hasMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, NemosVerticalItems.MOSSY_CRIMSON_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), NemosVerticalItems.MOSSY_CRIMSON_VERTICAL_SLAB.get(), 2);

                var hasMossyWarpedWoodCriteria = "hasMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, NemosVerticalItems.MOSSY_WARPED_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), NemosVerticalItems.MOSSY_WARPED_VERTICAL_SLAB.get(), 2);

                var hasPaleMossyOakWoodCriteria = "hasPaleMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, NemosVerticalItems.PALE_MOSSY_OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_OAK_VERTICAL_SLAB.get(), 2);

                var hasPaleMossySpruceWoodCriteria = "hasPaleMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, NemosVerticalItems.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_SPRUCE_VERTICAL_SLAB.get(), 2);

                var hasPaleMossyBirchWoodCriteria = "hasPaleMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, NemosVerticalItems.PALE_MOSSY_BIRCH_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_BIRCH_VERTICAL_SLAB.get(), 2);

                var hasPaleMossyJungleWoodCriteria = "hasPaleMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, NemosVerticalItems.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_JUNGLE_VERTICAL_SLAB.get(), 2);

                var hasPaleMossyAcaciaWoodCriteria = "hasPaleMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, NemosVerticalItems.PALE_MOSSY_ACACIA_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_ACACIA_VERTICAL_SLAB.get(), 2);

                var hasPaleMossyDarkOakWoodCriteria = "hasPaleMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, NemosVerticalItems.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), 2);

                var hasPaleMossyMangroveCriteria = "hasPaleMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, NemosVerticalItems.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_MANGROVE_VERTICAL_SLAB.get(), 2);

                var hasPaleMossyCherryWoodCriteria = "hasPaleMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, NemosVerticalItems.PALE_MOSSY_CHERRY_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_CHERRY_VERTICAL_SLAB.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosVerticalItems.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosVerticalItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_BAMBOO_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_MOSAIC.get(), NemosVerticalItems.PALE_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 2);

                var hasPaleMossyCrimsonWoodCriteria = "hasPaleMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, NemosVerticalItems.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_CRIMSON_VERTICAL_SLAB.get(), 2);

                var hasPaleMossyWarpedWoodCriteria = "hasPaleMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, NemosVerticalItems.PALE_MOSSY_WARPED_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), NemosVerticalItems.PALE_MOSSY_WARPED_VERTICAL_SLAB.get(), 2);

                var hasCrimsonMossyOakWoodCriteria = "hasCrimsonMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, NemosVerticalItems.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_OAK_VERTICAL_SLAB.get(), 2);

                var hasCrimsonMossySpruceWoodCriteria = "hasCrimsonMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, NemosVerticalItems.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_SPRUCE_VERTICAL_SLAB.get(), 2);

                var hasCrimsonMossyBirchWoodCriteria = "hasCrimsonMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, NemosVerticalItems.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_BIRCH_VERTICAL_SLAB.get(), 2);

                var hasCrimsonMossyJungleWoodCriteria = "hasCrimsonMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, NemosVerticalItems.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_JUNGLE_VERTICAL_SLAB.get(), 2);

                var hasCrimsonMossyAcaciaWoodCriteria = "hasCrimsonMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, NemosVerticalItems.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_ACACIA_VERTICAL_SLAB.get(), 2);

                var hasCrimsonMossyDarkOakWoodCriteria = "hasCrimsonMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, NemosVerticalItems.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), 2);

                var hasCrimsonMossyMangroveCriteria = "hasCrimsonMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, NemosVerticalItems.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_MANGROVE_VERTICAL_SLAB.get(), 2);

                var hasCrimsonMossyCherryWoodCriteria = "hasCrimsonMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, NemosVerticalItems.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_CHERRY_VERTICAL_SLAB.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosVerticalItems.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosVerticalItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_BAMBOO_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC.get(), NemosVerticalItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 2);

                var hasCrimsonMossyCrimsonWoodCriteria = "hasCrimsonMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, NemosVerticalItems.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_CRIMSON_VERTICAL_SLAB.get(), 2);

                var hasCrimsonMossyWarpedWoodCriteria = "hasCrimsonMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, NemosVerticalItems.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), NemosVerticalItems.CRIMSON_MOSSY_WARPED_VERTICAL_SLAB.get(), 2);

                var hasWarpedMossyOakWoodCriteria = "hasWarpedMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, NemosVerticalItems.WARPED_MOSSY_OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_OAK_VERTICAL_SLAB.get(), 2);

                var hasWarpedMossySpruceWoodCriteria = "hasWarpedMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, NemosVerticalItems.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_SPRUCE_VERTICAL_SLAB.get(), 2);

                var hasWarpedMossyBirchWoodCriteria = "hasWarpedMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, NemosVerticalItems.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_BIRCH_VERTICAL_SLAB.get(), 2);

                var hasWarpedMossyJungleWoodCriteria = "hasWarpedMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, NemosVerticalItems.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_JUNGLE_VERTICAL_SLAB.get(), 2);

                var hasWarpedMossyAcaciaWoodCriteria = "hasWarpedMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, NemosVerticalItems.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_ACACIA_VERTICAL_SLAB.get(), 2);

                var hasWarpedMossyDarkOakWoodCriteria = "hasWarpedMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, NemosVerticalItems.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_DARK_OAK_VERTICAL_SLAB.get(), 2);

                var hasWarpedMossyMangroveCriteria = "hasWarpedMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, NemosVerticalItems.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_MANGROVE_VERTICAL_SLAB.get(), 2);

                var hasWarpedMossyCherryWoodCriteria = "hasWarpedMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, NemosVerticalItems.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_CHERRY_VERTICAL_SLAB.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosVerticalItems.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosVerticalItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_BAMBOO_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_MOSAIC.get(), NemosVerticalItems.WARPED_MOSSY_BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 2);

                var hasWarpedMossyCrimsonWoodCriteria = "hasWarpedMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, NemosVerticalItems.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_CRIMSON_VERTICAL_SLAB.get(), 2);

                var hasWarpedMossyWarpedWoodCriteria = "hasWarpedMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, NemosVerticalItems.WARPED_MOSSY_WARPED_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), NemosVerticalItems.WARPED_MOSSY_WARPED_VERTICAL_SLAB.get(), 2);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Vertical Slabs x Nemo's Mossy Blocks Woodcutting Recipes";
    }
}
