package com.nemonotfound.nemos.woodcutter.datagen;

import com.nemonotfound.nemos.mossy.blocks.tags.NemosMossyItemTags;
import com.nemonotfound.nemos.mossy.blocks.world.item.MossyItems;
import com.nemonotfound.nemos.mossy.blocks.world.level.block.MossyBlocks;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.woodcutter.Constants.NEMOS_MOSSY_BLOCKS_MOD_ID;

public class NemosMossyBlocksRecipeProvider extends FabricRecipeProvider {

    public NemosMossyBlocksRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
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

                var modDependencies = List.of(NEMOS_MOSSY_BLOCKS_MOD_ID);

                var hasMossyOakWoodCriteria = "hasMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, MossyItems.MOSSY_OAK_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, MossyItems.MOSSY_OAK_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, MossyItems.MOSSY_OAK_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, MossyItems.MOSSY_OAK_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, MossyItems.MOSSY_OAK_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, MossyItems.MOSSY_OAK_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, MossyItems.MOSSY_OAK_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, MossyItems.MOSSY_OAK_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, MossyItems.MOSSY_OAK_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_OAK_LOG, Items.STRIPPED_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_OAK_WOOD, Items.STRIPPED_OAK_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_OAK_PLANKS, MossyItems.MOSSY_OAK_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_OAK_PLANKS, MossyItems.MOSSY_OAK_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_OAK_PLANKS, MossyItems.MOSSY_OAK_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_OAK_PLANKS, MossyItems.MOSSY_OAK_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_OAK_PLANKS, MossyItems.MOSSY_OAK_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_OAK_PLANKS, MossyItems.MOSSY_OAK_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_OAK_PLANKS, MossyItems.MOSSY_OAK_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_OAK_PLANKS, MossyItems.MOSSY_OAK_TRAPDOOR, 2);

                var hasMossySpruceWoodCriteria = "hasMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, MossyItems.MOSSY_SPRUCE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, MossyItems.MOSSY_SPRUCE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, MossyItems.MOSSY_SPRUCE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, MossyItems.MOSSY_SPRUCE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, MossyItems.MOSSY_SPRUCE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, MossyItems.MOSSY_SPRUCE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, MossyItems.MOSSY_SPRUCE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, MossyItems.MOSSY_SPRUCE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, MossyItems.MOSSY_SPRUCE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_SPRUCE_LOG, Items.STRIPPED_SPRUCE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_SPRUCE_WOOD, Items.STRIPPED_SPRUCE_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_SPRUCE_PLANKS, MossyItems.MOSSY_SPRUCE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_SPRUCE_PLANKS, 2, MossyItems.MOSSY_SPRUCE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_SPRUCE_PLANKS, MossyItems.MOSSY_SPRUCE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_SPRUCE_PLANKS, MossyItems.MOSSY_SPRUCE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_SPRUCE_PLANKS, MossyItems.MOSSY_SPRUCE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_SPRUCE_PLANKS, MossyItems.MOSSY_SPRUCE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_SPRUCE_PLANKS, MossyItems.MOSSY_SPRUCE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_SPRUCE_PLANKS, MossyItems.MOSSY_SPRUCE_TRAPDOOR, 2);

                var hasMossyBirchWoodCriteria = "hasMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, MossyItems.MOSSY_BIRCH_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, MossyItems.MOSSY_BIRCH_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, MossyItems.MOSSY_BIRCH_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, MossyItems.MOSSY_BIRCH_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, MossyItems.MOSSY_BIRCH_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, MossyItems.MOSSY_BIRCH_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, MossyItems.MOSSY_BIRCH_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, MossyItems.MOSSY_BIRCH_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, MossyItems.MOSSY_BIRCH_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BIRCH_LOG, Items.STRIPPED_BIRCH_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BIRCH_WOOD, Items.STRIPPED_BIRCH_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BIRCH_PLANKS, MossyItems.MOSSY_BIRCH_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BIRCH_PLANKS, 2, MossyItems.MOSSY_BIRCH_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BIRCH_PLANKS, MossyItems.MOSSY_BIRCH_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_BIRCH_PLANKS, MossyItems.MOSSY_BIRCH_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BIRCH_PLANKS, MossyItems.MOSSY_BIRCH_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BIRCH_PLANKS, MossyItems.MOSSY_BIRCH_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BIRCH_PLANKS, MossyItems.MOSSY_BIRCH_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BIRCH_PLANKS, MossyItems.MOSSY_BIRCH_TRAPDOOR, 2);

                var hasMossyJungleWoodCriteria = "hasMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, MossyItems.MOSSY_JUNGLE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, MossyItems.MOSSY_JUNGLE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, MossyItems.MOSSY_JUNGLE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, MossyItems.MOSSY_JUNGLE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, MossyItems.MOSSY_JUNGLE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, MossyItems.MOSSY_JUNGLE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, MossyItems.MOSSY_JUNGLE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, MossyItems.MOSSY_JUNGLE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, MossyItems.MOSSY_JUNGLE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_JUNGLE_LOG, Items.STRIPPED_JUNGLE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_JUNGLE_WOOD, Items.STRIPPED_JUNGLE_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_JUNGLE_PLANKS, MossyItems.MOSSY_JUNGLE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_JUNGLE_PLANKS, 2, MossyItems.MOSSY_JUNGLE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_JUNGLE_PLANKS, MossyItems.MOSSY_JUNGLE_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_JUNGLE_PLANKS, MossyItems.MOSSY_JUNGLE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_JUNGLE_PLANKS, MossyItems.MOSSY_JUNGLE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_JUNGLE_PLANKS, MossyItems.MOSSY_JUNGLE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_JUNGLE_PLANKS, MossyItems.MOSSY_JUNGLE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_JUNGLE_PLANKS, MossyItems.MOSSY_JUNGLE_TRAPDOOR, 2);

                var hasMossyAcaciaWoodCriteria = "hasMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, MossyItems.MOSSY_ACACIA_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, MossyItems.MOSSY_ACACIA_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, MossyItems.MOSSY_ACACIA_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, MossyItems.MOSSY_ACACIA_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, MossyItems.MOSSY_ACACIA_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, MossyItems.MOSSY_ACACIA_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, MossyItems.MOSSY_ACACIA_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, MossyItems.MOSSY_ACACIA_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, MossyItems.MOSSY_ACACIA_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_ACACIA_LOG, Items.STRIPPED_ACACIA_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_ACACIA_WOOD, Items.STRIPPED_ACACIA_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_ACACIA_PLANKS, MossyItems.MOSSY_ACACIA_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_ACACIA_PLANKS, 2, MossyItems.MOSSY_ACACIA_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_ACACIA_PLANKS, MossyItems.MOSSY_ACACIA_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_ACACIA_PLANKS, MossyItems.MOSSY_ACACIA_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_ACACIA_PLANKS, MossyItems.MOSSY_ACACIA_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_ACACIA_PLANKS, MossyItems.MOSSY_ACACIA_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_ACACIA_PLANKS, MossyItems.MOSSY_ACACIA_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_ACACIA_PLANKS, MossyItems.MOSSY_ACACIA_TRAPDOOR, 2);

                var hasMossyDarkOakWoodCriteria = "hasMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, MossyItems.MOSSY_DARK_OAK_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, MossyItems.MOSSY_DARK_OAK_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, MossyItems.MOSSY_DARK_OAK_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, MossyItems.MOSSY_DARK_OAK_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, MossyItems.MOSSY_DARK_OAK_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, MossyItems.MOSSY_DARK_OAK_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, MossyItems.MOSSY_DARK_OAK_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, MossyItems.MOSSY_DARK_OAK_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, MossyItems.MOSSY_DARK_OAK_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_DARK_OAK_PLANKS, MossyItems.MOSSY_DARK_OAK_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_DARK_OAK_PLANKS, 2, MossyItems.MOSSY_DARK_OAK_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_DARK_OAK_PLANKS, MossyItems.MOSSY_DARK_OAK_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_DARK_OAK_PLANKS, MossyItems.MOSSY_DARK_OAK_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_DARK_OAK_PLANKS, MossyItems.MOSSY_DARK_OAK_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_DARK_OAK_PLANKS, MossyItems.MOSSY_DARK_OAK_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_DARK_OAK_PLANKS, MossyItems.MOSSY_DARK_OAK_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_DARK_OAK_PLANKS, MossyItems.MOSSY_DARK_OAK_TRAPDOOR, 2);

                var hasMossyMangroveCriteria = "hasMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, MossyItems.MOSSY_MANGROVE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, MossyItems.MOSSY_MANGROVE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, MossyItems.MOSSY_MANGROVE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, MossyItems.MOSSY_MANGROVE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, MossyItems.MOSSY_MANGROVE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, MossyItems.MOSSY_MANGROVE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, MossyItems.MOSSY_MANGROVE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, MossyItems.MOSSY_MANGROVE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, MossyItems.MOSSY_MANGROVE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_MANGROVE_LOG, Items.STRIPPED_MANGROVE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_MANGROVE_WOOD, Items.STRIPPED_MANGROVE_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_MANGROVE_PLANKS, MossyItems.MOSSY_MANGROVE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_MANGROVE_PLANKS, 2, MossyItems.MOSSY_MANGROVE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_MANGROVE_PLANKS, MossyItems.MOSSY_MANGROVE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_MANGROVE_PLANKS, MossyItems.MOSSY_MANGROVE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_MANGROVE_PLANKS, MossyItems.MOSSY_MANGROVE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_MANGROVE_PLANKS, MossyItems.MOSSY_MANGROVE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_MANGROVE_PLANKS, MossyItems.MOSSY_MANGROVE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_MANGROVE_PLANKS, MossyItems.MOSSY_MANGROVE_TRAPDOOR, 2);

                var hasMossyCherryWoodCriteria = "hasMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, MossyItems.MOSSY_CHERRY_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, MossyItems.MOSSY_CHERRY_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, MossyItems.MOSSY_CHERRY_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, MossyItems.MOSSY_CHERRY_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, MossyItems.MOSSY_CHERRY_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, MossyItems.MOSSY_CHERRY_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, MossyItems.MOSSY_CHERRY_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, MossyItems.MOSSY_CHERRY_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, MossyItems.MOSSY_CHERRY_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_CHERRY_LOG, Items.STRIPPED_CHERRY_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_CHERRY_WOOD, Items.STRIPPED_CHERRY_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_CHERRY_PLANKS, MossyItems.MOSSY_CHERRY_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_CHERRY_PLANKS, 2, MossyItems.MOSSY_CHERRY_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_CHERRY_PLANKS, MossyItems.MOSSY_CHERRY_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_CHERRY_PLANKS, MossyItems.MOSSY_CHERRY_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_CHERRY_PLANKS, MossyItems.MOSSY_CHERRY_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_CHERRY_PLANKS, MossyItems.MOSSY_CHERRY_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_CHERRY_PLANKS, MossyItems.MOSSY_CHERRY_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_CHERRY_PLANKS, MossyItems.MOSSY_CHERRY_TRAPDOOR, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_MOSAIC, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_MOSAIC_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_MOSAIC_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BAMBOO_BLOCK, MossyItems.MOSSY_BAMBOO_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, MossyItems.MOSSY_BAMBOO_MOSAIC);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, MossyItems.MOSSY_BAMBOO_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, 2, MossyItems.MOSSY_BAMBOO_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, MossyItems.MOSSY_BAMBOO_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, MossyItems.MOSSY_BAMBOO_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, MossyItems.MOSSY_BAMBOO_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, MossyItems.MOSSY_BAMBOO_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, MossyItems.MOSSY_BAMBOO_MOSAIC_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, MossyItems.MOSSY_BAMBOO_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, MossyItems.MOSSY_BAMBOO_MOSAIC_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_BAMBOO_PLANKS, MossyItems.MOSSY_BAMBOO_TRAPDOOR, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_MOSAIC, MossyItems.MOSSY_BAMBOO_MOSAIC_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_BAMBOO_MOSAIC, MossyItems.MOSSY_BAMBOO_MOSAIC_STAIRS);

                var hasMossyCrimsonWoodCriteria = "hasMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, MossyItems.MOSSY_CRIMSON_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, MossyItems.MOSSY_CRIMSON_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, MossyItems.MOSSY_CRIMSON_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, MossyItems.MOSSY_CRIMSON_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, MossyItems.MOSSY_CRIMSON_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, MossyItems.MOSSY_CRIMSON_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, MossyItems.MOSSY_CRIMSON_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, MossyItems.MOSSY_CRIMSON_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, MossyItems.MOSSY_CRIMSON_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_CRIMSON_STEM, Items.STRIPPED_CRIMSON_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_HYPHAE);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_CRIMSON_PLANKS, MossyItems.MOSSY_CRIMSON_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_CRIMSON_PLANKS, 2, MossyItems.MOSSY_CRIMSON_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_CRIMSON_PLANKS, MossyItems.MOSSY_CRIMSON_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_CRIMSON_PLANKS, MossyItems.MOSSY_CRIMSON_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_CRIMSON_PLANKS, MossyItems.MOSSY_CRIMSON_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_CRIMSON_PLANKS, MossyItems.MOSSY_CRIMSON_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_CRIMSON_PLANKS, MossyItems.MOSSY_CRIMSON_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_CRIMSON_PLANKS, MossyItems.MOSSY_CRIMSON_TRAPDOOR, 2);

                var hasMossyWarpedWoodCriteria = "hasMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, MossyItems.MOSSY_WARPED_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, MossyItems.MOSSY_WARPED_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, MossyItems.MOSSY_WARPED_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, MossyItems.MOSSY_WARPED_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, MossyItems.MOSSY_WARPED_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, MossyItems.MOSSY_WARPED_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, MossyItems.MOSSY_WARPED_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, MossyItems.MOSSY_WARPED_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, MossyItems.MOSSY_WARPED_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_WARPED_STEM, Items.STRIPPED_WARPED_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_WARPED_HYPHAE, Items.STRIPPED_WARPED_HYPHAE);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_WARPED_PLANKS, MossyItems.MOSSY_WARPED_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_WARPED_PLANKS, 2, MossyItems.MOSSY_WARPED_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_WARPED_PLANKS, MossyItems.MOSSY_WARPED_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.MOSSY_WARPED_PLANKS, MossyItems.MOSSY_WARPED_FENCE, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_WARPED_PLANKS, MossyItems.MOSSY_WARPED_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_WARPED_PLANKS, MossyItems.MOSSY_WARPED_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.MOSSY_WARPED_PLANKS, MossyItems.MOSSY_WARPED_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.MOSSY_WARPED_PLANKS, MossyItems.MOSSY_WARPED_TRAPDOOR, 2);

                var hasPaleMossyOakWoodCriteria = "hasPaleMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, MossyItems.PALE_MOSSY_OAK_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, MossyItems.PALE_MOSSY_OAK_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, MossyItems.PALE_MOSSY_OAK_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, MossyItems.PALE_MOSSY_OAK_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, MossyItems.PALE_MOSSY_OAK_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, MossyItems.PALE_MOSSY_OAK_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, MossyItems.PALE_MOSSY_OAK_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, MossyItems.PALE_MOSSY_OAK_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, MossyItems.PALE_MOSSY_OAK_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_OAK_LOG, Items.STRIPPED_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_OAK_WOOD, Items.STRIPPED_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_OAK_PLANKS, MossyItems.PALE_MOSSY_OAK_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_OAK_PLANKS, MossyItems.PALE_MOSSY_OAK_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_OAK_PLANKS, MossyItems.PALE_MOSSY_OAK_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_OAK_PLANKS, MossyItems.PALE_MOSSY_OAK_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_OAK_PLANKS, MossyItems.PALE_MOSSY_OAK_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_OAK_PLANKS, MossyItems.PALE_MOSSY_OAK_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_OAK_PLANKS, MossyItems.PALE_MOSSY_OAK_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_OAK_PLANKS, MossyItems.PALE_MOSSY_OAK_TRAPDOOR, 2);

                var hasPaleMossySpruceWoodCriteria = "hasPaleMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, MossyItems.PALE_MOSSY_SPRUCE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, MossyItems.PALE_MOSSY_SPRUCE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, MossyItems.PALE_MOSSY_SPRUCE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, MossyItems.PALE_MOSSY_SPRUCE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, MossyItems.PALE_MOSSY_SPRUCE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, MossyItems.PALE_MOSSY_SPRUCE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, MossyItems.PALE_MOSSY_SPRUCE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, MossyItems.PALE_MOSSY_SPRUCE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, MossyItems.PALE_MOSSY_SPRUCE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_LOG, Items.STRIPPED_SPRUCE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_WOOD, Items.STRIPPED_SPRUCE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_PLANKS, MossyItems.PALE_MOSSY_SPRUCE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_PLANKS, 2, MossyItems.PALE_MOSSY_SPRUCE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_PLANKS, MossyItems.PALE_MOSSY_SPRUCE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_PLANKS, MossyItems.PALE_MOSSY_SPRUCE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_PLANKS, MossyItems.PALE_MOSSY_SPRUCE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_PLANKS, MossyItems.PALE_MOSSY_SPRUCE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_PLANKS, MossyItems.PALE_MOSSY_SPRUCE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_SPRUCE_PLANKS, MossyItems.PALE_MOSSY_SPRUCE_TRAPDOOR, 2);

                var hasPaleMossyBirchWoodCriteria = "hasPaleMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, MossyItems.PALE_MOSSY_BIRCH_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, MossyItems.PALE_MOSSY_BIRCH_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, MossyItems.PALE_MOSSY_BIRCH_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, MossyItems.PALE_MOSSY_BIRCH_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, MossyItems.PALE_MOSSY_BIRCH_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, MossyItems.PALE_MOSSY_BIRCH_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, MossyItems.PALE_MOSSY_BIRCH_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, MossyItems.PALE_MOSSY_BIRCH_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, MossyItems.PALE_MOSSY_BIRCH_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_LOG, Items.STRIPPED_BIRCH_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_WOOD, Items.STRIPPED_BIRCH_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_PLANKS, MossyItems.PALE_MOSSY_BIRCH_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_PLANKS, 2, MossyItems.PALE_MOSSY_BIRCH_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_PLANKS, MossyItems.PALE_MOSSY_BIRCH_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_PLANKS, MossyItems.PALE_MOSSY_BIRCH_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_PLANKS, MossyItems.PALE_MOSSY_BIRCH_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_PLANKS, MossyItems.PALE_MOSSY_BIRCH_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_PLANKS, MossyItems.PALE_MOSSY_BIRCH_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BIRCH_PLANKS, MossyItems.PALE_MOSSY_BIRCH_TRAPDOOR, 2);

                var hasPaleMossyJungleWoodCriteria = "hasPaleMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, MossyItems.PALE_MOSSY_JUNGLE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, MossyItems.PALE_MOSSY_JUNGLE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, MossyItems.PALE_MOSSY_JUNGLE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, MossyItems.PALE_MOSSY_JUNGLE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, MossyItems.PALE_MOSSY_JUNGLE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, MossyItems.PALE_MOSSY_JUNGLE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, MossyItems.PALE_MOSSY_JUNGLE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, MossyItems.PALE_MOSSY_JUNGLE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, MossyItems.PALE_MOSSY_JUNGLE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_LOG, Items.STRIPPED_JUNGLE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_WOOD, Items.STRIPPED_JUNGLE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_PLANKS, MossyItems.PALE_MOSSY_JUNGLE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_PLANKS, 2, MossyItems.PALE_MOSSY_JUNGLE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_PLANKS, MossyItems.PALE_MOSSY_JUNGLE_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_PLANKS, MossyItems.PALE_MOSSY_JUNGLE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_PLANKS, MossyItems.PALE_MOSSY_JUNGLE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_PLANKS, MossyItems.PALE_MOSSY_JUNGLE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_PLANKS, MossyItems.PALE_MOSSY_JUNGLE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_JUNGLE_PLANKS, MossyItems.PALE_MOSSY_JUNGLE_TRAPDOOR, 2);

                var hasPaleMossyAcaciaWoodCriteria = "hasPaleMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, MossyItems.PALE_MOSSY_ACACIA_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, MossyItems.PALE_MOSSY_ACACIA_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, MossyItems.PALE_MOSSY_ACACIA_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, MossyItems.PALE_MOSSY_ACACIA_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, MossyItems.PALE_MOSSY_ACACIA_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, MossyItems.PALE_MOSSY_ACACIA_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, MossyItems.PALE_MOSSY_ACACIA_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, MossyItems.PALE_MOSSY_ACACIA_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, MossyItems.PALE_MOSSY_ACACIA_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_LOG, Items.STRIPPED_ACACIA_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_WOOD, Items.STRIPPED_ACACIA_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_PLANKS, MossyItems.PALE_MOSSY_ACACIA_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_PLANKS, 2, MossyItems.PALE_MOSSY_ACACIA_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_PLANKS, MossyItems.PALE_MOSSY_ACACIA_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_PLANKS, MossyItems.PALE_MOSSY_ACACIA_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_PLANKS, MossyItems.PALE_MOSSY_ACACIA_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_PLANKS, MossyItems.PALE_MOSSY_ACACIA_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_PLANKS, MossyItems.PALE_MOSSY_ACACIA_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_ACACIA_PLANKS, MossyItems.PALE_MOSSY_ACACIA_TRAPDOOR, 2);

                var hasPaleMossyDarkOakWoodCriteria = "hasPaleMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, MossyItems.PALE_MOSSY_DARK_OAK_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, MossyItems.PALE_MOSSY_DARK_OAK_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, MossyItems.PALE_MOSSY_DARK_OAK_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, MossyItems.PALE_MOSSY_DARK_OAK_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, MossyItems.PALE_MOSSY_DARK_OAK_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, MossyItems.PALE_MOSSY_DARK_OAK_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, MossyItems.PALE_MOSSY_DARK_OAK_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, MossyItems.PALE_MOSSY_DARK_OAK_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, MossyItems.PALE_MOSSY_DARK_OAK_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS, MossyItems.PALE_MOSSY_DARK_OAK_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS, 2, MossyItems.PALE_MOSSY_DARK_OAK_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS, MossyItems.PALE_MOSSY_DARK_OAK_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS, MossyItems.PALE_MOSSY_DARK_OAK_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS, MossyItems.PALE_MOSSY_DARK_OAK_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS, MossyItems.PALE_MOSSY_DARK_OAK_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS, MossyItems.PALE_MOSSY_DARK_OAK_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS, MossyItems.PALE_MOSSY_DARK_OAK_TRAPDOOR, 2);

                var hasPaleMossyMangroveCriteria = "hasPaleMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, MossyItems.PALE_MOSSY_MANGROVE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, MossyItems.PALE_MOSSY_MANGROVE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, MossyItems.PALE_MOSSY_MANGROVE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, MossyItems.PALE_MOSSY_MANGROVE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, MossyItems.PALE_MOSSY_MANGROVE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, MossyItems.PALE_MOSSY_MANGROVE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, MossyItems.PALE_MOSSY_MANGROVE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, MossyItems.PALE_MOSSY_MANGROVE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, MossyItems.PALE_MOSSY_MANGROVE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_LOG, Items.STRIPPED_MANGROVE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_WOOD, Items.STRIPPED_MANGROVE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_PLANKS, MossyItems.PALE_MOSSY_MANGROVE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_PLANKS, 2, MossyItems.PALE_MOSSY_MANGROVE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_PLANKS, MossyItems.PALE_MOSSY_MANGROVE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_PLANKS, MossyItems.PALE_MOSSY_MANGROVE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_PLANKS, MossyItems.PALE_MOSSY_MANGROVE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_PLANKS, MossyItems.PALE_MOSSY_MANGROVE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_PLANKS, MossyItems.PALE_MOSSY_MANGROVE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_MANGROVE_PLANKS, MossyItems.PALE_MOSSY_MANGROVE_TRAPDOOR, 2);

                var hasPaleMossyCherryWoodCriteria = "hasPaleMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, MossyItems.PALE_MOSSY_CHERRY_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, MossyItems.PALE_MOSSY_CHERRY_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, MossyItems.PALE_MOSSY_CHERRY_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, MossyItems.PALE_MOSSY_CHERRY_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, MossyItems.PALE_MOSSY_CHERRY_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, MossyItems.PALE_MOSSY_CHERRY_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, MossyItems.PALE_MOSSY_CHERRY_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, MossyItems.PALE_MOSSY_CHERRY_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, MossyItems.PALE_MOSSY_CHERRY_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_LOG, Items.STRIPPED_CHERRY_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_WOOD, Items.STRIPPED_CHERRY_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_PLANKS, MossyItems.PALE_MOSSY_CHERRY_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_PLANKS, 2, MossyItems.PALE_MOSSY_CHERRY_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_PLANKS, MossyItems.PALE_MOSSY_CHERRY_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_PLANKS, MossyItems.PALE_MOSSY_CHERRY_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_PLANKS, MossyItems.PALE_MOSSY_CHERRY_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_PLANKS, MossyItems.PALE_MOSSY_CHERRY_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_PLANKS, MossyItems.PALE_MOSSY_CHERRY_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_CHERRY_PLANKS, MossyItems.PALE_MOSSY_CHERRY_TRAPDOOR, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_MOSAIC, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_MOSAIC_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_MOSAIC_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_BLOCK, MossyItems.PALE_MOSSY_BAMBOO_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, MossyItems.PALE_MOSSY_BAMBOO_MOSAIC);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, MossyItems.PALE_MOSSY_BAMBOO_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, 2, MossyItems.PALE_MOSSY_BAMBOO_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, MossyItems.PALE_MOSSY_BAMBOO_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, MossyItems.PALE_MOSSY_BAMBOO_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, MossyItems.PALE_MOSSY_BAMBOO_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, MossyItems.PALE_MOSSY_BAMBOO_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, MossyItems.PALE_MOSSY_BAMBOO_MOSAIC_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, MossyItems.PALE_MOSSY_BAMBOO_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, MossyItems.PALE_MOSSY_BAMBOO_MOSAIC_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_PLANKS, MossyItems.PALE_MOSSY_BAMBOO_TRAPDOOR, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_MOSAIC, MossyItems.PALE_MOSSY_BAMBOO_MOSAIC_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_BAMBOO_MOSAIC, MossyItems.PALE_MOSSY_BAMBOO_MOSAIC_STAIRS);

                var hasPaleMossyCrimsonWoodCriteria = "hasPaleMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, MossyItems.PALE_MOSSY_CRIMSON_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, MossyItems.PALE_MOSSY_CRIMSON_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, MossyItems.PALE_MOSSY_CRIMSON_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, MossyItems.PALE_MOSSY_CRIMSON_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, MossyItems.PALE_MOSSY_CRIMSON_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, MossyItems.PALE_MOSSY_CRIMSON_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, MossyItems.PALE_MOSSY_CRIMSON_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, MossyItems.PALE_MOSSY_CRIMSON_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, MossyItems.PALE_MOSSY_CRIMSON_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_STEM, Items.STRIPPED_CRIMSON_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_PLANKS, MossyItems.PALE_MOSSY_CRIMSON_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_PLANKS, 2, MossyItems.PALE_MOSSY_CRIMSON_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_PLANKS, MossyItems.PALE_MOSSY_CRIMSON_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_PLANKS, MossyItems.PALE_MOSSY_CRIMSON_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_PLANKS, MossyItems.PALE_MOSSY_CRIMSON_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_PLANKS, MossyItems.PALE_MOSSY_CRIMSON_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_PLANKS, MossyItems.PALE_MOSSY_CRIMSON_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_CRIMSON_PLANKS, MossyItems.PALE_MOSSY_CRIMSON_TRAPDOOR, 2);

                var hasPaleMossyWarpedWoodCriteria = "hasPaleMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, MossyItems.PALE_MOSSY_WARPED_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, MossyItems.PALE_MOSSY_WARPED_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, MossyItems.PALE_MOSSY_WARPED_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, MossyItems.PALE_MOSSY_WARPED_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, MossyItems.PALE_MOSSY_WARPED_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, MossyItems.PALE_MOSSY_WARPED_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, MossyItems.PALE_MOSSY_WARPED_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, MossyItems.PALE_MOSSY_WARPED_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, MossyItems.PALE_MOSSY_WARPED_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_STEM, Items.STRIPPED_WARPED_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_HYPHAE, Items.STRIPPED_WARPED_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_PLANKS, MossyItems.PALE_MOSSY_WARPED_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_PLANKS, 2, MossyItems.PALE_MOSSY_WARPED_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_PLANKS, MossyItems.PALE_MOSSY_WARPED_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_PLANKS, MossyItems.PALE_MOSSY_WARPED_FENCE, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_PLANKS, MossyItems.PALE_MOSSY_WARPED_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_PLANKS, MossyItems.PALE_MOSSY_WARPED_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_PLANKS, MossyItems.PALE_MOSSY_WARPED_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.PALE_MOSSY_WARPED_PLANKS, MossyItems.PALE_MOSSY_WARPED_TRAPDOOR, 2);

                var hasCrimsonMossyOakWoodCriteria = "hasCrimsonMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, MossyItems.CRIMSON_MOSSY_OAK_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, MossyItems.CRIMSON_MOSSY_OAK_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, MossyItems.CRIMSON_MOSSY_OAK_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, MossyItems.CRIMSON_MOSSY_OAK_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, MossyItems.CRIMSON_MOSSY_OAK_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, MossyItems.CRIMSON_MOSSY_OAK_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, MossyItems.CRIMSON_MOSSY_OAK_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, MossyItems.CRIMSON_MOSSY_OAK_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, MossyItems.CRIMSON_MOSSY_OAK_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_LOG, Items.STRIPPED_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_WOOD, Items.STRIPPED_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_OAK_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_OAK_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_OAK_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_OAK_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_OAK_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_OAK_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_OAK_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_OAK_TRAPDOOR, 2);

                var hasCrimsonMossySpruceWoodCriteria = "hasCrimsonMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, MossyItems.CRIMSON_MOSSY_SPRUCE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, MossyItems.CRIMSON_MOSSY_SPRUCE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, MossyItems.CRIMSON_MOSSY_SPRUCE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, MossyItems.CRIMSON_MOSSY_SPRUCE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, MossyItems.CRIMSON_MOSSY_SPRUCE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, MossyItems.CRIMSON_MOSSY_SPRUCE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, MossyItems.CRIMSON_MOSSY_SPRUCE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, MossyItems.CRIMSON_MOSSY_SPRUCE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, MossyItems.CRIMSON_MOSSY_SPRUCE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_LOG, Items.STRIPPED_SPRUCE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_WOOD, Items.STRIPPED_SPRUCE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS, MossyItems.CRIMSON_MOSSY_SPRUCE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS, 2, MossyItems.CRIMSON_MOSSY_SPRUCE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS, MossyItems.CRIMSON_MOSSY_SPRUCE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS, MossyItems.CRIMSON_MOSSY_SPRUCE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS, MossyItems.CRIMSON_MOSSY_SPRUCE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS, MossyItems.CRIMSON_MOSSY_SPRUCE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS, MossyItems.CRIMSON_MOSSY_SPRUCE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS, MossyItems.CRIMSON_MOSSY_SPRUCE_TRAPDOOR, 2);

                var hasCrimsonMossyBirchWoodCriteria = "hasCrimsonMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, MossyItems.CRIMSON_MOSSY_BIRCH_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, MossyItems.CRIMSON_MOSSY_BIRCH_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, MossyItems.CRIMSON_MOSSY_BIRCH_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, MossyItems.CRIMSON_MOSSY_BIRCH_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, MossyItems.CRIMSON_MOSSY_BIRCH_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, MossyItems.CRIMSON_MOSSY_BIRCH_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, MossyItems.CRIMSON_MOSSY_BIRCH_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, MossyItems.CRIMSON_MOSSY_BIRCH_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, MossyItems.CRIMSON_MOSSY_BIRCH_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_LOG, Items.STRIPPED_BIRCH_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_WOOD, Items.STRIPPED_BIRCH_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS, MossyItems.CRIMSON_MOSSY_BIRCH_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS, 2, MossyItems.CRIMSON_MOSSY_BIRCH_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS, MossyItems.CRIMSON_MOSSY_BIRCH_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS, MossyItems.CRIMSON_MOSSY_BIRCH_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS, MossyItems.CRIMSON_MOSSY_BIRCH_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS, MossyItems.CRIMSON_MOSSY_BIRCH_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS, MossyItems.CRIMSON_MOSSY_BIRCH_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS, MossyItems.CRIMSON_MOSSY_BIRCH_TRAPDOOR, 2);

                var hasCrimsonMossyJungleWoodCriteria = "hasCrimsonMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, MossyItems.CRIMSON_MOSSY_JUNGLE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, MossyItems.CRIMSON_MOSSY_JUNGLE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, MossyItems.CRIMSON_MOSSY_JUNGLE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, MossyItems.CRIMSON_MOSSY_JUNGLE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, MossyItems.CRIMSON_MOSSY_JUNGLE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, MossyItems.CRIMSON_MOSSY_JUNGLE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, MossyItems.CRIMSON_MOSSY_JUNGLE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, MossyItems.CRIMSON_MOSSY_JUNGLE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, MossyItems.CRIMSON_MOSSY_JUNGLE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_LOG, Items.STRIPPED_JUNGLE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_WOOD, Items.STRIPPED_JUNGLE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS, MossyItems.CRIMSON_MOSSY_JUNGLE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS, 2, MossyItems.CRIMSON_MOSSY_JUNGLE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS, MossyItems.CRIMSON_MOSSY_JUNGLE_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS, MossyItems.CRIMSON_MOSSY_JUNGLE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS, MossyItems.CRIMSON_MOSSY_JUNGLE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS, MossyItems.CRIMSON_MOSSY_JUNGLE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS, MossyItems.CRIMSON_MOSSY_JUNGLE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS, MossyItems.CRIMSON_MOSSY_JUNGLE_TRAPDOOR, 2);

                var hasCrimsonMossyAcaciaWoodCriteria = "hasCrimsonMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, MossyItems.CRIMSON_MOSSY_ACACIA_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, MossyItems.CRIMSON_MOSSY_ACACIA_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, MossyItems.CRIMSON_MOSSY_ACACIA_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, MossyItems.CRIMSON_MOSSY_ACACIA_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, MossyItems.CRIMSON_MOSSY_ACACIA_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, MossyItems.CRIMSON_MOSSY_ACACIA_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, MossyItems.CRIMSON_MOSSY_ACACIA_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, MossyItems.CRIMSON_MOSSY_ACACIA_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, MossyItems.CRIMSON_MOSSY_ACACIA_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_LOG, Items.STRIPPED_ACACIA_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_WOOD, Items.STRIPPED_ACACIA_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS, MossyItems.CRIMSON_MOSSY_ACACIA_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS, 2, MossyItems.CRIMSON_MOSSY_ACACIA_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS, MossyItems.CRIMSON_MOSSY_ACACIA_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS, MossyItems.CRIMSON_MOSSY_ACACIA_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS, MossyItems.CRIMSON_MOSSY_ACACIA_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS, MossyItems.CRIMSON_MOSSY_ACACIA_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS, MossyItems.CRIMSON_MOSSY_ACACIA_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS, MossyItems.CRIMSON_MOSSY_ACACIA_TRAPDOOR, 2);

                var hasCrimsonMossyDarkOakWoodCriteria = "hasCrimsonMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, MossyItems.CRIMSON_MOSSY_DARK_OAK_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, MossyItems.CRIMSON_MOSSY_DARK_OAK_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, MossyItems.CRIMSON_MOSSY_DARK_OAK_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, MossyItems.CRIMSON_MOSSY_DARK_OAK_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, MossyItems.CRIMSON_MOSSY_DARK_OAK_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, MossyItems.CRIMSON_MOSSY_DARK_OAK_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, MossyItems.CRIMSON_MOSSY_DARK_OAK_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, MossyItems.CRIMSON_MOSSY_DARK_OAK_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, MossyItems.CRIMSON_MOSSY_DARK_OAK_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_DARK_OAK_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS, 2, MossyItems.CRIMSON_MOSSY_DARK_OAK_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_DARK_OAK_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_DARK_OAK_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_DARK_OAK_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_DARK_OAK_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_DARK_OAK_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS, MossyItems.CRIMSON_MOSSY_DARK_OAK_TRAPDOOR, 2);

                var hasCrimsonMossyMangroveCriteria = "hasCrimsonMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, MossyItems.CRIMSON_MOSSY_MANGROVE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, MossyItems.CRIMSON_MOSSY_MANGROVE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, MossyItems.CRIMSON_MOSSY_MANGROVE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, MossyItems.CRIMSON_MOSSY_MANGROVE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, MossyItems.CRIMSON_MOSSY_MANGROVE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, MossyItems.CRIMSON_MOSSY_MANGROVE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, MossyItems.CRIMSON_MOSSY_MANGROVE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, MossyItems.CRIMSON_MOSSY_MANGROVE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, MossyItems.CRIMSON_MOSSY_MANGROVE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_LOG, Items.STRIPPED_MANGROVE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_WOOD, Items.STRIPPED_MANGROVE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS, MossyItems.CRIMSON_MOSSY_MANGROVE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS, 2, MossyItems.CRIMSON_MOSSY_MANGROVE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS, MossyItems.CRIMSON_MOSSY_MANGROVE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS, MossyItems.CRIMSON_MOSSY_MANGROVE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS, MossyItems.CRIMSON_MOSSY_MANGROVE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS, MossyItems.CRIMSON_MOSSY_MANGROVE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS, MossyItems.CRIMSON_MOSSY_MANGROVE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS, MossyItems.CRIMSON_MOSSY_MANGROVE_TRAPDOOR, 2);

                var hasCrimsonMossyCherryWoodCriteria = "hasCrimsonMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, MossyItems.CRIMSON_MOSSY_CHERRY_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, MossyItems.CRIMSON_MOSSY_CHERRY_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, MossyItems.CRIMSON_MOSSY_CHERRY_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, MossyItems.CRIMSON_MOSSY_CHERRY_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, MossyItems.CRIMSON_MOSSY_CHERRY_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, MossyItems.CRIMSON_MOSSY_CHERRY_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, MossyItems.CRIMSON_MOSSY_CHERRY_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, MossyItems.CRIMSON_MOSSY_CHERRY_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, MossyItems.CRIMSON_MOSSY_CHERRY_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_LOG, Items.STRIPPED_CHERRY_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_WOOD, Items.STRIPPED_CHERRY_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS, MossyItems.CRIMSON_MOSSY_CHERRY_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS, 2, MossyItems.CRIMSON_MOSSY_CHERRY_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS, MossyItems.CRIMSON_MOSSY_CHERRY_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS, MossyItems.CRIMSON_MOSSY_CHERRY_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS, MossyItems.CRIMSON_MOSSY_CHERRY_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS, MossyItems.CRIMSON_MOSSY_CHERRY_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS, MossyItems.CRIMSON_MOSSY_CHERRY_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS, MossyItems.CRIMSON_MOSSY_CHERRY_TRAPDOOR, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK, MossyItems.CRIMSON_MOSSY_BAMBOO_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, MossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, MossyItems.CRIMSON_MOSSY_BAMBOO_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, 2, MossyItems.CRIMSON_MOSSY_BAMBOO_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, MossyItems.CRIMSON_MOSSY_BAMBOO_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, MossyItems.CRIMSON_MOSSY_BAMBOO_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, MossyItems.CRIMSON_MOSSY_BAMBOO_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, MossyItems.CRIMSON_MOSSY_BAMBOO_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, MossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, MossyItems.CRIMSON_MOSSY_BAMBOO_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, MossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS, MossyItems.CRIMSON_MOSSY_BAMBOO_TRAPDOOR, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC, MossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC, MossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_STAIRS);

                var hasCrimsonMossyCrimsonWoodCriteria = "hasCrimsonMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, MossyItems.CRIMSON_MOSSY_CRIMSON_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, MossyItems.CRIMSON_MOSSY_CRIMSON_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, MossyItems.CRIMSON_MOSSY_CRIMSON_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, MossyItems.CRIMSON_MOSSY_CRIMSON_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, MossyItems.CRIMSON_MOSSY_CRIMSON_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, MossyItems.CRIMSON_MOSSY_CRIMSON_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, MossyItems.CRIMSON_MOSSY_CRIMSON_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, MossyItems.CRIMSON_MOSSY_CRIMSON_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, MossyItems.CRIMSON_MOSSY_CRIMSON_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_STEM, Items.STRIPPED_CRIMSON_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS, MossyItems.CRIMSON_MOSSY_CRIMSON_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS, 2, MossyItems.CRIMSON_MOSSY_CRIMSON_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS, MossyItems.CRIMSON_MOSSY_CRIMSON_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS, MossyItems.CRIMSON_MOSSY_CRIMSON_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS, MossyItems.CRIMSON_MOSSY_CRIMSON_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS, MossyItems.CRIMSON_MOSSY_CRIMSON_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS, MossyItems.CRIMSON_MOSSY_CRIMSON_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS, MossyItems.CRIMSON_MOSSY_CRIMSON_TRAPDOOR, 2);

                var hasCrimsonMossyWarpedWoodCriteria = "hasCrimsonMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, MossyItems.CRIMSON_MOSSY_WARPED_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, MossyItems.CRIMSON_MOSSY_WARPED_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, MossyItems.CRIMSON_MOSSY_WARPED_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, MossyItems.CRIMSON_MOSSY_WARPED_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, MossyItems.CRIMSON_MOSSY_WARPED_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, MossyItems.CRIMSON_MOSSY_WARPED_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, MossyItems.CRIMSON_MOSSY_WARPED_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, MossyItems.CRIMSON_MOSSY_WARPED_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, MossyItems.CRIMSON_MOSSY_WARPED_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_STEM, Items.STRIPPED_WARPED_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_HYPHAE, Items.STRIPPED_WARPED_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS, MossyItems.CRIMSON_MOSSY_WARPED_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS, 2, MossyItems.CRIMSON_MOSSY_WARPED_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS, MossyItems.CRIMSON_MOSSY_WARPED_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS, MossyItems.CRIMSON_MOSSY_WARPED_FENCE, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS, MossyItems.CRIMSON_MOSSY_WARPED_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS, MossyItems.CRIMSON_MOSSY_WARPED_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS, MossyItems.CRIMSON_MOSSY_WARPED_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS, MossyItems.CRIMSON_MOSSY_WARPED_TRAPDOOR, 2);

                var hasWarpedMossyOakWoodCriteria = "hasWarpedMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, MossyItems.WARPED_MOSSY_OAK_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, MossyItems.WARPED_MOSSY_OAK_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, MossyItems.WARPED_MOSSY_OAK_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, MossyItems.WARPED_MOSSY_OAK_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, MossyItems.WARPED_MOSSY_OAK_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, MossyItems.WARPED_MOSSY_OAK_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, MossyItems.WARPED_MOSSY_OAK_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, MossyItems.WARPED_MOSSY_OAK_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, MossyItems.WARPED_MOSSY_OAK_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_LOG, Items.STRIPPED_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_WOOD, Items.STRIPPED_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_PLANKS, MossyItems.WARPED_MOSSY_OAK_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_PLANKS, MossyItems.WARPED_MOSSY_OAK_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_PLANKS, MossyItems.WARPED_MOSSY_OAK_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_PLANKS, MossyItems.WARPED_MOSSY_OAK_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_PLANKS, MossyItems.WARPED_MOSSY_OAK_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_PLANKS, MossyItems.WARPED_MOSSY_OAK_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_PLANKS, MossyItems.WARPED_MOSSY_OAK_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_OAK_PLANKS, MossyItems.WARPED_MOSSY_OAK_TRAPDOOR, 2);

                var hasWarpedMossySpruceWoodCriteria = "hasWarpedMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, MossyItems.WARPED_MOSSY_SPRUCE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, MossyItems.WARPED_MOSSY_SPRUCE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, MossyItems.WARPED_MOSSY_SPRUCE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, MossyItems.WARPED_MOSSY_SPRUCE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, MossyItems.WARPED_MOSSY_SPRUCE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, MossyItems.WARPED_MOSSY_SPRUCE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, MossyItems.WARPED_MOSSY_SPRUCE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, MossyItems.WARPED_MOSSY_SPRUCE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, MossyItems.WARPED_MOSSY_SPRUCE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_LOG, Items.STRIPPED_SPRUCE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_WOOD, Items.STRIPPED_SPRUCE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS, MossyItems.WARPED_MOSSY_SPRUCE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS, 2, MossyItems.WARPED_MOSSY_SPRUCE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS, MossyItems.WARPED_MOSSY_SPRUCE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS, MossyItems.WARPED_MOSSY_SPRUCE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS, MossyItems.WARPED_MOSSY_SPRUCE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS, MossyItems.WARPED_MOSSY_SPRUCE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS, MossyItems.WARPED_MOSSY_SPRUCE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS, MossyItems.WARPED_MOSSY_SPRUCE_TRAPDOOR, 2);

                var hasWarpedMossyBirchWoodCriteria = "hasWarpedMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, MossyItems.WARPED_MOSSY_BIRCH_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, MossyItems.WARPED_MOSSY_BIRCH_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, MossyItems.WARPED_MOSSY_BIRCH_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, MossyItems.WARPED_MOSSY_BIRCH_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, MossyItems.WARPED_MOSSY_BIRCH_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, MossyItems.WARPED_MOSSY_BIRCH_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, MossyItems.WARPED_MOSSY_BIRCH_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, MossyItems.WARPED_MOSSY_BIRCH_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, MossyItems.WARPED_MOSSY_BIRCH_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_LOG, Items.STRIPPED_BIRCH_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_WOOD, Items.STRIPPED_BIRCH_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_PLANKS, MossyItems.WARPED_MOSSY_BIRCH_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_PLANKS, 2, MossyItems.WARPED_MOSSY_BIRCH_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_PLANKS, MossyItems.WARPED_MOSSY_BIRCH_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_PLANKS, MossyItems.WARPED_MOSSY_BIRCH_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_PLANKS, MossyItems.WARPED_MOSSY_BIRCH_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_PLANKS, MossyItems.WARPED_MOSSY_BIRCH_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_PLANKS, MossyItems.WARPED_MOSSY_BIRCH_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BIRCH_PLANKS, MossyItems.WARPED_MOSSY_BIRCH_TRAPDOOR, 2);

                var hasWarpedMossyJungleWoodCriteria = "hasWarpedMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, MossyItems.WARPED_MOSSY_JUNGLE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, MossyItems.WARPED_MOSSY_JUNGLE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, MossyItems.WARPED_MOSSY_JUNGLE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, MossyItems.WARPED_MOSSY_JUNGLE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, MossyItems.WARPED_MOSSY_JUNGLE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, MossyItems.WARPED_MOSSY_JUNGLE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, MossyItems.WARPED_MOSSY_JUNGLE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, MossyItems.WARPED_MOSSY_JUNGLE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, MossyItems.WARPED_MOSSY_JUNGLE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_LOG, Items.STRIPPED_JUNGLE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_WOOD, Items.STRIPPED_JUNGLE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS, MossyItems.WARPED_MOSSY_JUNGLE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS, 2, MossyItems.WARPED_MOSSY_JUNGLE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS, MossyItems.WARPED_MOSSY_JUNGLE_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS, MossyItems.WARPED_MOSSY_JUNGLE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS, MossyItems.WARPED_MOSSY_JUNGLE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS, MossyItems.WARPED_MOSSY_JUNGLE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS, MossyItems.WARPED_MOSSY_JUNGLE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS, MossyItems.WARPED_MOSSY_JUNGLE_TRAPDOOR, 2);

                var hasWarpedMossyAcaciaWoodCriteria = "hasWarpedMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, MossyItems.WARPED_MOSSY_ACACIA_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, MossyItems.WARPED_MOSSY_ACACIA_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, MossyItems.WARPED_MOSSY_ACACIA_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, MossyItems.WARPED_MOSSY_ACACIA_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, MossyItems.WARPED_MOSSY_ACACIA_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, MossyItems.WARPED_MOSSY_ACACIA_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, MossyItems.WARPED_MOSSY_ACACIA_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, MossyItems.WARPED_MOSSY_ACACIA_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, MossyItems.WARPED_MOSSY_ACACIA_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_LOG, Items.STRIPPED_ACACIA_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_WOOD, Items.STRIPPED_ACACIA_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_PLANKS, MossyItems.WARPED_MOSSY_ACACIA_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_PLANKS, 2, MossyItems.WARPED_MOSSY_ACACIA_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_PLANKS, MossyItems.WARPED_MOSSY_ACACIA_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_PLANKS, MossyItems.WARPED_MOSSY_ACACIA_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_PLANKS, MossyItems.WARPED_MOSSY_ACACIA_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_PLANKS, MossyItems.WARPED_MOSSY_ACACIA_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_PLANKS, MossyItems.WARPED_MOSSY_ACACIA_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_ACACIA_PLANKS, MossyItems.WARPED_MOSSY_ACACIA_TRAPDOOR, 2);

                var hasWarpedMossyDarkOakWoodCriteria = "hasWarpedMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, MossyItems.WARPED_MOSSY_DARK_OAK_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, MossyItems.WARPED_MOSSY_DARK_OAK_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, MossyItems.WARPED_MOSSY_DARK_OAK_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, MossyItems.WARPED_MOSSY_DARK_OAK_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, MossyItems.WARPED_MOSSY_DARK_OAK_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, MossyItems.WARPED_MOSSY_DARK_OAK_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, MossyItems.WARPED_MOSSY_DARK_OAK_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, MossyItems.WARPED_MOSSY_DARK_OAK_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, MossyItems.WARPED_MOSSY_DARK_OAK_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS, MossyItems.WARPED_MOSSY_DARK_OAK_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS, 2, MossyItems.WARPED_MOSSY_DARK_OAK_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS, MossyItems.WARPED_MOSSY_DARK_OAK_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS, MossyItems.WARPED_MOSSY_DARK_OAK_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS, MossyItems.WARPED_MOSSY_DARK_OAK_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS, MossyItems.WARPED_MOSSY_DARK_OAK_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS, MossyItems.WARPED_MOSSY_DARK_OAK_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS, MossyItems.WARPED_MOSSY_DARK_OAK_TRAPDOOR, 2);

                var hasWarpedMossyMangroveCriteria = "hasWarpedMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, MossyItems.WARPED_MOSSY_MANGROVE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, MossyItems.WARPED_MOSSY_MANGROVE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, MossyItems.WARPED_MOSSY_MANGROVE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, MossyItems.WARPED_MOSSY_MANGROVE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, MossyItems.WARPED_MOSSY_MANGROVE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, MossyItems.WARPED_MOSSY_MANGROVE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, MossyItems.WARPED_MOSSY_MANGROVE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, MossyItems.WARPED_MOSSY_MANGROVE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, MossyItems.WARPED_MOSSY_MANGROVE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_LOG, Items.STRIPPED_MANGROVE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_WOOD, Items.STRIPPED_MANGROVE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS, MossyItems.WARPED_MOSSY_MANGROVE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS, 2, MossyItems.WARPED_MOSSY_MANGROVE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS, MossyItems.WARPED_MOSSY_MANGROVE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS, MossyItems.WARPED_MOSSY_MANGROVE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS, MossyItems.WARPED_MOSSY_MANGROVE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS, MossyItems.WARPED_MOSSY_MANGROVE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS, MossyItems.WARPED_MOSSY_MANGROVE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS, MossyItems.WARPED_MOSSY_MANGROVE_TRAPDOOR, 2);

                var hasWarpedMossyCherryWoodCriteria = "hasWarpedMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, MossyItems.WARPED_MOSSY_CHERRY_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, MossyItems.WARPED_MOSSY_CHERRY_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, MossyItems.WARPED_MOSSY_CHERRY_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, MossyItems.WARPED_MOSSY_CHERRY_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, MossyItems.WARPED_MOSSY_CHERRY_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, MossyItems.WARPED_MOSSY_CHERRY_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, MossyItems.WARPED_MOSSY_CHERRY_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, MossyItems.WARPED_MOSSY_CHERRY_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, MossyItems.WARPED_MOSSY_CHERRY_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_LOG, Items.STRIPPED_CHERRY_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_WOOD, Items.STRIPPED_CHERRY_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_PLANKS, MossyItems.WARPED_MOSSY_CHERRY_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_PLANKS, 2, MossyItems.WARPED_MOSSY_CHERRY_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_PLANKS, MossyItems.WARPED_MOSSY_CHERRY_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_PLANKS, MossyItems.WARPED_MOSSY_CHERRY_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_PLANKS, MossyItems.WARPED_MOSSY_CHERRY_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_PLANKS, MossyItems.WARPED_MOSSY_CHERRY_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_PLANKS, MossyItems.WARPED_MOSSY_CHERRY_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_CHERRY_PLANKS, MossyItems.WARPED_MOSSY_CHERRY_TRAPDOOR, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_MOSAIC, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK, MossyItems.WARPED_MOSSY_BAMBOO_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, MossyItems.WARPED_MOSSY_BAMBOO_MOSAIC);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, MossyItems.WARPED_MOSSY_BAMBOO_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, 2, MossyItems.WARPED_MOSSY_BAMBOO_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, MossyItems.WARPED_MOSSY_BAMBOO_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, MossyItems.WARPED_MOSSY_BAMBOO_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, MossyItems.WARPED_MOSSY_BAMBOO_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, MossyItems.WARPED_MOSSY_BAMBOO_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, MossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, MossyItems.WARPED_MOSSY_BAMBOO_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, MossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS, MossyItems.WARPED_MOSSY_BAMBOO_TRAPDOOR, 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_MOSAIC, MossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_BAMBOO_MOSAIC, MossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_STAIRS);

                var hasWarpedMossyCrimsonWoodCriteria = "hasWarpedMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, MossyItems.WARPED_MOSSY_CRIMSON_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, MossyItems.WARPED_MOSSY_CRIMSON_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, MossyItems.WARPED_MOSSY_CRIMSON_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, MossyItems.WARPED_MOSSY_CRIMSON_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, MossyItems.WARPED_MOSSY_CRIMSON_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, MossyItems.WARPED_MOSSY_CRIMSON_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, MossyItems.WARPED_MOSSY_CRIMSON_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, MossyItems.WARPED_MOSSY_CRIMSON_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, MossyItems.WARPED_MOSSY_CRIMSON_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_STEM, Items.STRIPPED_CRIMSON_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS, MossyItems.WARPED_MOSSY_CRIMSON_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS, 2, MossyItems.WARPED_MOSSY_CRIMSON_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS, MossyItems.WARPED_MOSSY_CRIMSON_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS, MossyItems.WARPED_MOSSY_CRIMSON_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS, MossyItems.WARPED_MOSSY_CRIMSON_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS, MossyItems.WARPED_MOSSY_CRIMSON_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS, MossyItems.WARPED_MOSSY_CRIMSON_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS, MossyItems.WARPED_MOSSY_CRIMSON_TRAPDOOR, 2);

                var hasWarpedMossyWarpedWoodCriteria = "hasWarpedMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, MossyItems.WARPED_MOSSY_WARPED_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, MossyItems.WARPED_MOSSY_WARPED_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, MossyItems.WARPED_MOSSY_WARPED_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, MossyItems.WARPED_MOSSY_WARPED_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, MossyItems.WARPED_MOSSY_WARPED_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, MossyItems.WARPED_MOSSY_WARPED_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, MossyItems.WARPED_MOSSY_WARPED_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, MossyItems.WARPED_MOSSY_WARPED_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, MossyItems.WARPED_MOSSY_WARPED_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_STEM, Items.STRIPPED_WARPED_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_HYPHAE, Items.STRIPPED_WARPED_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_PLANKS, MossyItems.WARPED_MOSSY_WARPED_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_PLANKS, 2, MossyItems.WARPED_MOSSY_WARPED_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_PLANKS, MossyItems.WARPED_MOSSY_WARPED_FENCE_GATE, 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_PLANKS, MossyItems.WARPED_MOSSY_WARPED_FENCE, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_PLANKS, MossyItems.WARPED_MOSSY_WARPED_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_PLANKS, MossyItems.WARPED_MOSSY_WARPED_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_PLANKS, MossyItems.WARPED_MOSSY_WARPED_STAIRS, 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, MossyBlocks.WARPED_MOSSY_WARPED_PLANKS, MossyItems.WARPED_MOSSY_WARPED_TRAPDOOR, 2);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Mossy Blocks Woodcutting Recipes";
    }
}
