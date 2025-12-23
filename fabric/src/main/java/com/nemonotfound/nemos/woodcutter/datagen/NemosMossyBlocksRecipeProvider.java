package com.nemonotfound.nemos.woodcutter.datagen;

import com.devnemo.nemos.mossy.blocks.tags.NemosMossyItemTags;
import com.devnemo.nemos.mossy.blocks.world.item.NemosMossyItems;
import com.devnemo.nemos.mossy.blocks.world.level.block.NemosMossyBlocks;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.woodcutter.Constants.NEMOS_MOSSY_BLOCKS_MOD_ID;

public class NemosMossyBlocksRecipeProvider extends FabricRecipeProvider {

    public NemosMossyBlocksRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
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

                var modDependencies = List.of(NEMOS_MOSSY_BLOCKS_MOD_ID);

                var hasMossyOakWoodCriteria = "hasMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, NemosMossyItems.MOSSY_OAK_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, NemosMossyItems.MOSSY_OAK_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, NemosMossyItems.MOSSY_OAK_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, NemosMossyItems.MOSSY_OAK_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, NemosMossyItems.MOSSY_OAK_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, NemosMossyItems.MOSSY_OAK_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, NemosMossyItems.MOSSY_OAK_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, NemosMossyItems.MOSSY_OAK_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_OAK_WOOD, hasMossyOakWoodCriteria, NemosMossyItems.MOSSY_OAK_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_OAK_LOG.get(), Items.STRIPPED_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_OAK_WOOD.get(), Items.STRIPPED_OAK_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), NemosMossyItems.MOSSY_OAK_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), NemosMossyItems.MOSSY_OAK_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), NemosMossyItems.MOSSY_OAK_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), NemosMossyItems.MOSSY_OAK_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), NemosMossyItems.MOSSY_OAK_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), NemosMossyItems.MOSSY_OAK_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), NemosMossyItems.MOSSY_OAK_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_OAK_PLANKS.get(), NemosMossyItems.MOSSY_OAK_TRAPDOOR.get(), 2);

                var hasMossySpruceWoodCriteria = "hasMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, NemosMossyItems.MOSSY_SPRUCE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, NemosMossyItems.MOSSY_SPRUCE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, NemosMossyItems.MOSSY_SPRUCE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, NemosMossyItems.MOSSY_SPRUCE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, NemosMossyItems.MOSSY_SPRUCE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, NemosMossyItems.MOSSY_SPRUCE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, NemosMossyItems.MOSSY_SPRUCE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, NemosMossyItems.MOSSY_SPRUCE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_SPRUCE_WOOD, hasMossySpruceWoodCriteria, NemosMossyItems.MOSSY_SPRUCE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_LOG.get(), Items.STRIPPED_SPRUCE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_WOOD.get(), Items.STRIPPED_SPRUCE_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.MOSSY_SPRUCE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), 2, NemosMossyItems.MOSSY_SPRUCE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.MOSSY_SPRUCE_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.MOSSY_SPRUCE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.MOSSY_SPRUCE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.MOSSY_SPRUCE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.MOSSY_SPRUCE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.MOSSY_SPRUCE_TRAPDOOR.get(), 2);

                var hasMossyBirchWoodCriteria = "hasMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, NemosMossyItems.MOSSY_BIRCH_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, NemosMossyItems.MOSSY_BIRCH_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, NemosMossyItems.MOSSY_BIRCH_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, NemosMossyItems.MOSSY_BIRCH_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, NemosMossyItems.MOSSY_BIRCH_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, NemosMossyItems.MOSSY_BIRCH_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, NemosMossyItems.MOSSY_BIRCH_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, NemosMossyItems.MOSSY_BIRCH_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_BIRCH_WOOD, hasMossyBirchWoodCriteria, NemosMossyItems.MOSSY_BIRCH_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_LOG.get(), Items.STRIPPED_BIRCH_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_WOOD.get(), Items.STRIPPED_BIRCH_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.MOSSY_BIRCH_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), 2, NemosMossyItems.MOSSY_BIRCH_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.MOSSY_BIRCH_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.MOSSY_BIRCH_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.MOSSY_BIRCH_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.MOSSY_BIRCH_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.MOSSY_BIRCH_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.MOSSY_BIRCH_TRAPDOOR.get(), 2);

                var hasMossyJungleWoodCriteria = "hasMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, NemosMossyItems.MOSSY_JUNGLE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, NemosMossyItems.MOSSY_JUNGLE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, NemosMossyItems.MOSSY_JUNGLE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, NemosMossyItems.MOSSY_JUNGLE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, NemosMossyItems.MOSSY_JUNGLE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, NemosMossyItems.MOSSY_JUNGLE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, NemosMossyItems.MOSSY_JUNGLE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, NemosMossyItems.MOSSY_JUNGLE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_JUNGLE_WOOD, hasMossyJungleWoodCriteria, NemosMossyItems.MOSSY_JUNGLE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_LOG.get(), Items.STRIPPED_JUNGLE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_WOOD.get(), Items.STRIPPED_JUNGLE_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.MOSSY_JUNGLE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), 2, NemosMossyItems.MOSSY_JUNGLE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.MOSSY_JUNGLE_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.MOSSY_JUNGLE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.MOSSY_JUNGLE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.MOSSY_JUNGLE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.MOSSY_JUNGLE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.MOSSY_JUNGLE_TRAPDOOR.get(), 2);

                var hasMossyAcaciaWoodCriteria = "hasMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, NemosMossyItems.MOSSY_ACACIA_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, NemosMossyItems.MOSSY_ACACIA_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, NemosMossyItems.MOSSY_ACACIA_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, NemosMossyItems.MOSSY_ACACIA_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, NemosMossyItems.MOSSY_ACACIA_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, NemosMossyItems.MOSSY_ACACIA_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, NemosMossyItems.MOSSY_ACACIA_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, NemosMossyItems.MOSSY_ACACIA_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_ACACIA_WOOD, hasMossyAcaciaWoodCriteria, NemosMossyItems.MOSSY_ACACIA_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_LOG.get(), Items.STRIPPED_ACACIA_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_WOOD.get(), Items.STRIPPED_ACACIA_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.MOSSY_ACACIA_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), 2, NemosMossyItems.MOSSY_ACACIA_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.MOSSY_ACACIA_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.MOSSY_ACACIA_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.MOSSY_ACACIA_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.MOSSY_ACACIA_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.MOSSY_ACACIA_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.MOSSY_ACACIA_TRAPDOOR.get(), 2);

                var hasMossyDarkOakWoodCriteria = "hasMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, NemosMossyItems.MOSSY_DARK_OAK_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, NemosMossyItems.MOSSY_DARK_OAK_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, NemosMossyItems.MOSSY_DARK_OAK_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, NemosMossyItems.MOSSY_DARK_OAK_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, NemosMossyItems.MOSSY_DARK_OAK_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, NemosMossyItems.MOSSY_DARK_OAK_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, NemosMossyItems.MOSSY_DARK_OAK_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, NemosMossyItems.MOSSY_DARK_OAK_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_DARK_OAK_WOOD, hasMossyDarkOakWoodCriteria, NemosMossyItems.MOSSY_DARK_OAK_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_LOG.get(), Items.STRIPPED_DARK_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_WOOD.get(), Items.STRIPPED_DARK_OAK_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.MOSSY_DARK_OAK_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), 2, NemosMossyItems.MOSSY_DARK_OAK_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.MOSSY_DARK_OAK_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.MOSSY_DARK_OAK_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.MOSSY_DARK_OAK_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.MOSSY_DARK_OAK_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.MOSSY_DARK_OAK_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.MOSSY_DARK_OAK_TRAPDOOR.get(), 2);

                var hasMossyMangroveCriteria = "hasMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, NemosMossyItems.MOSSY_MANGROVE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, NemosMossyItems.MOSSY_MANGROVE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, NemosMossyItems.MOSSY_MANGROVE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, NemosMossyItems.MOSSY_MANGROVE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, NemosMossyItems.MOSSY_MANGROVE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, NemosMossyItems.MOSSY_MANGROVE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, NemosMossyItems.MOSSY_MANGROVE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, NemosMossyItems.MOSSY_MANGROVE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_MANGROVE_WOOD, hasMossyMangroveCriteria, NemosMossyItems.MOSSY_MANGROVE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_LOG.get(), Items.STRIPPED_MANGROVE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_WOOD.get(), Items.STRIPPED_MANGROVE_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.MOSSY_MANGROVE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), 2, NemosMossyItems.MOSSY_MANGROVE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.MOSSY_MANGROVE_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.MOSSY_MANGROVE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.MOSSY_MANGROVE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.MOSSY_MANGROVE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.MOSSY_MANGROVE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.MOSSY_MANGROVE_TRAPDOOR.get(), 2);

                var hasMossyCherryWoodCriteria = "hasMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, NemosMossyItems.MOSSY_CHERRY_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, NemosMossyItems.MOSSY_CHERRY_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, NemosMossyItems.MOSSY_CHERRY_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, NemosMossyItems.MOSSY_CHERRY_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, NemosMossyItems.MOSSY_CHERRY_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, NemosMossyItems.MOSSY_CHERRY_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, NemosMossyItems.MOSSY_CHERRY_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, NemosMossyItems.MOSSY_CHERRY_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CHERRY_WOOD, hasMossyCherryWoodCriteria, NemosMossyItems.MOSSY_CHERRY_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_LOG.get(), Items.STRIPPED_CHERRY_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_WOOD.get(), Items.STRIPPED_CHERRY_WOOD);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.MOSSY_CHERRY_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), 2, NemosMossyItems.MOSSY_CHERRY_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.MOSSY_CHERRY_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.MOSSY_CHERRY_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.MOSSY_CHERRY_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.MOSSY_CHERRY_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.MOSSY_CHERRY_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.MOSSY_CHERRY_TRAPDOOR.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_MOSAIC.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_MOSAIC_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_MOSAIC_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.MOSSY_BAMBOO_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.MOSSY_BAMBOO_MOSAIC.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.MOSSY_BAMBOO_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), 2, NemosMossyItems.MOSSY_BAMBOO_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.MOSSY_BAMBOO_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.MOSSY_BAMBOO_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.MOSSY_BAMBOO_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.MOSSY_BAMBOO_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.MOSSY_BAMBOO_MOSAIC_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.MOSSY_BAMBOO_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.MOSSY_BAMBOO_MOSAIC_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.MOSSY_BAMBOO_TRAPDOOR.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_MOSAIC.get(), NemosMossyItems.MOSSY_BAMBOO_MOSAIC_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_BAMBOO_MOSAIC.get(), NemosMossyItems.MOSSY_BAMBOO_MOSAIC_STAIRS.get());

                var hasMossyCrimsonWoodCriteria = "hasMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, NemosMossyItems.MOSSY_CRIMSON_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, NemosMossyItems.MOSSY_CRIMSON_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, NemosMossyItems.MOSSY_CRIMSON_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, NemosMossyItems.MOSSY_CRIMSON_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, NemosMossyItems.MOSSY_CRIMSON_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, NemosMossyItems.MOSSY_CRIMSON_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, NemosMossyItems.MOSSY_CRIMSON_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, NemosMossyItems.MOSSY_CRIMSON_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_CRIMSON_WOOD, hasMossyCrimsonWoodCriteria, NemosMossyItems.MOSSY_CRIMSON_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_STEM.get(), Items.STRIPPED_CRIMSON_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_HYPHAE.get(), Items.STRIPPED_CRIMSON_HYPHAE);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.MOSSY_CRIMSON_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), 2, NemosMossyItems.MOSSY_CRIMSON_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.MOSSY_CRIMSON_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.MOSSY_CRIMSON_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.MOSSY_CRIMSON_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.MOSSY_CRIMSON_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.MOSSY_CRIMSON_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.MOSSY_CRIMSON_TRAPDOOR.get(), 2);

                var hasMossyWarpedWoodCriteria = "hasMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, NemosMossyItems.MOSSY_WARPED_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, NemosMossyItems.MOSSY_WARPED_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, NemosMossyItems.MOSSY_WARPED_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, NemosMossyItems.MOSSY_WARPED_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, NemosMossyItems.MOSSY_WARPED_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, NemosMossyItems.MOSSY_WARPED_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, NemosMossyItems.MOSSY_WARPED_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, NemosMossyItems.MOSSY_WARPED_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.MOSSY_WARPED_WOOD, hasMossyWarpedWoodCriteria, NemosMossyItems.MOSSY_WARPED_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_WARPED_STEM.get(), Items.STRIPPED_WARPED_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_WARPED_HYPHAE.get(), Items.STRIPPED_WARPED_HYPHAE);
                
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), NemosMossyItems.MOSSY_WARPED_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), 2, NemosMossyItems.MOSSY_WARPED_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), NemosMossyItems.MOSSY_WARPED_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), NemosMossyItems.MOSSY_WARPED_FENCE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), NemosMossyItems.MOSSY_WARPED_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), NemosMossyItems.MOSSY_WARPED_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), NemosMossyItems.MOSSY_WARPED_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.MOSSY_WARPED_PLANKS.get(), NemosMossyItems.MOSSY_WARPED_TRAPDOOR.get(), 2);

                var hasPaleMossyOakWoodCriteria = "hasPaleMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, NemosMossyItems.PALE_MOSSY_OAK_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, NemosMossyItems.PALE_MOSSY_OAK_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, NemosMossyItems.PALE_MOSSY_OAK_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, NemosMossyItems.PALE_MOSSY_OAK_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, NemosMossyItems.PALE_MOSSY_OAK_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, NemosMossyItems.PALE_MOSSY_OAK_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, NemosMossyItems.PALE_MOSSY_OAK_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, NemosMossyItems.PALE_MOSSY_OAK_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_OAK_WOOD, hasPaleMossyOakWoodCriteria, NemosMossyItems.PALE_MOSSY_OAK_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_LOG.get(), Items.STRIPPED_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_WOOD.get(), Items.STRIPPED_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_OAK_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_OAK_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_OAK_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_OAK_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_OAK_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_OAK_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_OAK_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_OAK_TRAPDOOR.get(), 2);

                var hasPaleMossySpruceWoodCriteria = "hasPaleMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, NemosMossyItems.PALE_MOSSY_SPRUCE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, NemosMossyItems.PALE_MOSSY_SPRUCE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, NemosMossyItems.PALE_MOSSY_SPRUCE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, NemosMossyItems.PALE_MOSSY_SPRUCE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, NemosMossyItems.PALE_MOSSY_SPRUCE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, NemosMossyItems.PALE_MOSSY_SPRUCE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, NemosMossyItems.PALE_MOSSY_SPRUCE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, NemosMossyItems.PALE_MOSSY_SPRUCE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD, hasPaleMossySpruceWoodCriteria, NemosMossyItems.PALE_MOSSY_SPRUCE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_LOG.get(), Items.STRIPPED_SPRUCE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_WOOD.get(), Items.STRIPPED_SPRUCE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_SPRUCE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), 2, NemosMossyItems.PALE_MOSSY_SPRUCE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_SPRUCE_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_SPRUCE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_SPRUCE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_SPRUCE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_SPRUCE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_SPRUCE_TRAPDOOR.get(), 2);

                var hasPaleMossyBirchWoodCriteria = "hasPaleMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, NemosMossyItems.PALE_MOSSY_BIRCH_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, NemosMossyItems.PALE_MOSSY_BIRCH_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, NemosMossyItems.PALE_MOSSY_BIRCH_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, NemosMossyItems.PALE_MOSSY_BIRCH_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, NemosMossyItems.PALE_MOSSY_BIRCH_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, NemosMossyItems.PALE_MOSSY_BIRCH_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, NemosMossyItems.PALE_MOSSY_BIRCH_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, NemosMossyItems.PALE_MOSSY_BIRCH_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD, hasPaleMossyBirchWoodCriteria, NemosMossyItems.PALE_MOSSY_BIRCH_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_LOG.get(), Items.STRIPPED_BIRCH_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_WOOD.get(), Items.STRIPPED_BIRCH_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BIRCH_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), 2, NemosMossyItems.PALE_MOSSY_BIRCH_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BIRCH_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BIRCH_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BIRCH_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BIRCH_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BIRCH_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BIRCH_TRAPDOOR.get(), 2);

                var hasPaleMossyJungleWoodCriteria = "hasPaleMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, NemosMossyItems.PALE_MOSSY_JUNGLE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, NemosMossyItems.PALE_MOSSY_JUNGLE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, NemosMossyItems.PALE_MOSSY_JUNGLE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, NemosMossyItems.PALE_MOSSY_JUNGLE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, NemosMossyItems.PALE_MOSSY_JUNGLE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, NemosMossyItems.PALE_MOSSY_JUNGLE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, NemosMossyItems.PALE_MOSSY_JUNGLE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, NemosMossyItems.PALE_MOSSY_JUNGLE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD, hasPaleMossyJungleWoodCriteria, NemosMossyItems.PALE_MOSSY_JUNGLE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_LOG.get(), Items.STRIPPED_JUNGLE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_WOOD.get(), Items.STRIPPED_JUNGLE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_JUNGLE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), 2, NemosMossyItems.PALE_MOSSY_JUNGLE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_JUNGLE_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_JUNGLE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_JUNGLE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_JUNGLE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_JUNGLE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_JUNGLE_TRAPDOOR.get(), 2);

                var hasPaleMossyAcaciaWoodCriteria = "hasPaleMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, NemosMossyItems.PALE_MOSSY_ACACIA_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, NemosMossyItems.PALE_MOSSY_ACACIA_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, NemosMossyItems.PALE_MOSSY_ACACIA_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, NemosMossyItems.PALE_MOSSY_ACACIA_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, NemosMossyItems.PALE_MOSSY_ACACIA_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, NemosMossyItems.PALE_MOSSY_ACACIA_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, NemosMossyItems.PALE_MOSSY_ACACIA_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, NemosMossyItems.PALE_MOSSY_ACACIA_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD, hasPaleMossyAcaciaWoodCriteria, NemosMossyItems.PALE_MOSSY_ACACIA_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_LOG.get(), Items.STRIPPED_ACACIA_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_WOOD.get(), Items.STRIPPED_ACACIA_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.PALE_MOSSY_ACACIA_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), 2, NemosMossyItems.PALE_MOSSY_ACACIA_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.PALE_MOSSY_ACACIA_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.PALE_MOSSY_ACACIA_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.PALE_MOSSY_ACACIA_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.PALE_MOSSY_ACACIA_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.PALE_MOSSY_ACACIA_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.PALE_MOSSY_ACACIA_TRAPDOOR.get(), 2);

                var hasPaleMossyDarkOakWoodCriteria = "hasPaleMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, NemosMossyItems.PALE_MOSSY_DARK_OAK_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, NemosMossyItems.PALE_MOSSY_DARK_OAK_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, NemosMossyItems.PALE_MOSSY_DARK_OAK_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, NemosMossyItems.PALE_MOSSY_DARK_OAK_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, NemosMossyItems.PALE_MOSSY_DARK_OAK_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, NemosMossyItems.PALE_MOSSY_DARK_OAK_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, NemosMossyItems.PALE_MOSSY_DARK_OAK_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, NemosMossyItems.PALE_MOSSY_DARK_OAK_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD, hasPaleMossyDarkOakWoodCriteria, NemosMossyItems.PALE_MOSSY_DARK_OAK_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_LOG.get(), Items.STRIPPED_DARK_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_WOOD.get(), Items.STRIPPED_DARK_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_DARK_OAK_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), 2, NemosMossyItems.PALE_MOSSY_DARK_OAK_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_DARK_OAK_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_DARK_OAK_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_DARK_OAK_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_DARK_OAK_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_DARK_OAK_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.PALE_MOSSY_DARK_OAK_TRAPDOOR.get(), 2);

                var hasPaleMossyMangroveCriteria = "hasPaleMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, NemosMossyItems.PALE_MOSSY_MANGROVE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, NemosMossyItems.PALE_MOSSY_MANGROVE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, NemosMossyItems.PALE_MOSSY_MANGROVE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, NemosMossyItems.PALE_MOSSY_MANGROVE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, NemosMossyItems.PALE_MOSSY_MANGROVE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, NemosMossyItems.PALE_MOSSY_MANGROVE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, NemosMossyItems.PALE_MOSSY_MANGROVE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, NemosMossyItems.PALE_MOSSY_MANGROVE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD, hasPaleMossyMangroveCriteria, NemosMossyItems.PALE_MOSSY_MANGROVE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_LOG.get(), Items.STRIPPED_MANGROVE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_WOOD.get(), Items.STRIPPED_MANGROVE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_MANGROVE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), 2, NemosMossyItems.PALE_MOSSY_MANGROVE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_MANGROVE_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_MANGROVE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_MANGROVE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_MANGROVE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_MANGROVE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.PALE_MOSSY_MANGROVE_TRAPDOOR.get(), 2);

                var hasPaleMossyCherryWoodCriteria = "hasPaleMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, NemosMossyItems.PALE_MOSSY_CHERRY_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, NemosMossyItems.PALE_MOSSY_CHERRY_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, NemosMossyItems.PALE_MOSSY_CHERRY_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, NemosMossyItems.PALE_MOSSY_CHERRY_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, NemosMossyItems.PALE_MOSSY_CHERRY_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, NemosMossyItems.PALE_MOSSY_CHERRY_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, NemosMossyItems.PALE_MOSSY_CHERRY_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, NemosMossyItems.PALE_MOSSY_CHERRY_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD, hasPaleMossyCherryWoodCriteria, NemosMossyItems.PALE_MOSSY_CHERRY_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_LOG.get(), Items.STRIPPED_CHERRY_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_WOOD.get(), Items.STRIPPED_CHERRY_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CHERRY_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), 2, NemosMossyItems.PALE_MOSSY_CHERRY_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CHERRY_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CHERRY_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CHERRY_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CHERRY_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CHERRY_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CHERRY_TRAPDOOR.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_MOSAIC.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_MOSAIC_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_MOSAIC_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_MOSAIC.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), 2, NemosMossyItems.PALE_MOSSY_BAMBOO_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_MOSAIC_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_MOSAIC_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_TRAPDOOR.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_MOSAIC.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_MOSAIC_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_BAMBOO_MOSAIC.get(), NemosMossyItems.PALE_MOSSY_BAMBOO_MOSAIC_STAIRS.get());

                var hasPaleMossyCrimsonWoodCriteria = "hasPaleMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, NemosMossyItems.PALE_MOSSY_CRIMSON_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, NemosMossyItems.PALE_MOSSY_CRIMSON_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, NemosMossyItems.PALE_MOSSY_CRIMSON_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, NemosMossyItems.PALE_MOSSY_CRIMSON_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, NemosMossyItems.PALE_MOSSY_CRIMSON_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, NemosMossyItems.PALE_MOSSY_CRIMSON_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, NemosMossyItems.PALE_MOSSY_CRIMSON_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, NemosMossyItems.PALE_MOSSY_CRIMSON_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD, hasPaleMossyCrimsonWoodCriteria, NemosMossyItems.PALE_MOSSY_CRIMSON_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_STEM.get(), Items.STRIPPED_CRIMSON_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_HYPHAE.get(), Items.STRIPPED_CRIMSON_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CRIMSON_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), 2, NemosMossyItems.PALE_MOSSY_CRIMSON_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CRIMSON_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CRIMSON_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CRIMSON_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CRIMSON_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CRIMSON_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.PALE_MOSSY_CRIMSON_TRAPDOOR.get(), 2);

                var hasPaleMossyWarpedWoodCriteria = "hasPaleMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, NemosMossyItems.PALE_MOSSY_WARPED_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, NemosMossyItems.PALE_MOSSY_WARPED_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, NemosMossyItems.PALE_MOSSY_WARPED_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, NemosMossyItems.PALE_MOSSY_WARPED_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, NemosMossyItems.PALE_MOSSY_WARPED_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, NemosMossyItems.PALE_MOSSY_WARPED_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, NemosMossyItems.PALE_MOSSY_WARPED_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, NemosMossyItems.PALE_MOSSY_WARPED_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD, hasPaleMossyWarpedWoodCriteria, NemosMossyItems.PALE_MOSSY_WARPED_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_STEM.get(), Items.STRIPPED_WARPED_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_HYPHAE.get(), Items.STRIPPED_WARPED_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.PALE_MOSSY_WARPED_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), 2, NemosMossyItems.PALE_MOSSY_WARPED_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.PALE_MOSSY_WARPED_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.PALE_MOSSY_WARPED_FENCE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.PALE_MOSSY_WARPED_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.PALE_MOSSY_WARPED_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.PALE_MOSSY_WARPED_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.PALE_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.PALE_MOSSY_WARPED_TRAPDOOR.get(), 2);

                var hasCrimsonMossyOakWoodCriteria = "hasCrimsonMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_OAK_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_OAK_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_OAK_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_OAK_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_OAK_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_OAK_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_OAK_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_OAK_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD, hasCrimsonMossyOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_OAK_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_LOG.get(), Items.STRIPPED_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_WOOD.get(), Items.STRIPPED_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_OAK_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_OAK_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_OAK_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_OAK_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_OAK_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_OAK_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_OAK_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_OAK_TRAPDOOR.get(), 2);

                var hasCrimsonMossySpruceWoodCriteria = "hasCrimsonMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD, hasCrimsonMossySpruceWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_LOG.get(), Items.STRIPPED_SPRUCE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_WOOD.get(), Items.STRIPPED_SPRUCE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_SPRUCE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), 2, NemosMossyItems.CRIMSON_MOSSY_SPRUCE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_SPRUCE_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_SPRUCE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_SPRUCE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_SPRUCE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_SPRUCE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_SPRUCE_TRAPDOOR.get(), 2);

                var hasCrimsonMossyBirchWoodCriteria = "hasCrimsonMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_BIRCH_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_BIRCH_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_BIRCH_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_BIRCH_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_BIRCH_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_BIRCH_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_BIRCH_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_BIRCH_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD, hasCrimsonMossyBirchWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_BIRCH_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_LOG.get(), Items.STRIPPED_BIRCH_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_WOOD.get(), Items.STRIPPED_BIRCH_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BIRCH_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), 2, NemosMossyItems.CRIMSON_MOSSY_BIRCH_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BIRCH_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BIRCH_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BIRCH_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BIRCH_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BIRCH_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BIRCH_TRAPDOOR.get(), 2);

                var hasCrimsonMossyJungleWoodCriteria = "hasCrimsonMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD, hasCrimsonMossyJungleWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_LOG.get(), Items.STRIPPED_JUNGLE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_WOOD.get(), Items.STRIPPED_JUNGLE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_JUNGLE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), 2, NemosMossyItems.CRIMSON_MOSSY_JUNGLE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_JUNGLE_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_JUNGLE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_JUNGLE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_JUNGLE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_JUNGLE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_JUNGLE_TRAPDOOR.get(), 2);

                var hasCrimsonMossyAcaciaWoodCriteria = "hasCrimsonMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_ACACIA_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_ACACIA_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_ACACIA_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_ACACIA_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_ACACIA_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_ACACIA_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_ACACIA_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_ACACIA_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD, hasCrimsonMossyAcaciaWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_ACACIA_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_LOG.get(), Items.STRIPPED_ACACIA_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_WOOD.get(), Items.STRIPPED_ACACIA_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_ACACIA_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), 2, NemosMossyItems.CRIMSON_MOSSY_ACACIA_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_ACACIA_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_ACACIA_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_ACACIA_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_ACACIA_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_ACACIA_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_ACACIA_TRAPDOOR.get(), 2);

                var hasCrimsonMossyDarkOakWoodCriteria = "hasCrimsonMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD, hasCrimsonMossyDarkOakWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_LOG.get(), Items.STRIPPED_DARK_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_WOOD.get(), Items.STRIPPED_DARK_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), 2, NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_TRAPDOOR.get(), 2);

                var hasCrimsonMossyMangroveCriteria = "hasCrimsonMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD, hasCrimsonMossyMangroveCriteria, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_LOG.get(), Items.STRIPPED_MANGROVE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_WOOD.get(), Items.STRIPPED_MANGROVE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_MANGROVE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), 2, NemosMossyItems.CRIMSON_MOSSY_MANGROVE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_MANGROVE_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_MANGROVE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_MANGROVE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_MANGROVE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_MANGROVE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_MANGROVE_TRAPDOOR.get(), 2);

                var hasCrimsonMossyCherryWoodCriteria = "hasCrimsonMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CHERRY_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CHERRY_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CHERRY_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CHERRY_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CHERRY_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CHERRY_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CHERRY_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CHERRY_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD, hasCrimsonMossyCherryWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CHERRY_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_LOG.get(), Items.STRIPPED_CHERRY_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_WOOD.get(), Items.STRIPPED_CHERRY_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CHERRY_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), 2, NemosMossyItems.CRIMSON_MOSSY_CHERRY_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CHERRY_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CHERRY_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CHERRY_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CHERRY_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CHERRY_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CHERRY_TRAPDOOR.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), 2, NemosMossyItems.CRIMSON_MOSSY_BAMBOO_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_TRAPDOOR.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_BAMBOO_MOSAIC.get(), NemosMossyItems.CRIMSON_MOSSY_BAMBOO_MOSAIC_STAIRS.get());

                var hasCrimsonMossyCrimsonWoodCriteria = "hasCrimsonMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD, hasCrimsonMossyCrimsonWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_STEM.get(), Items.STRIPPED_CRIMSON_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_HYPHAE.get(), Items.STRIPPED_CRIMSON_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CRIMSON_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), 2, NemosMossyItems.CRIMSON_MOSSY_CRIMSON_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CRIMSON_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CRIMSON_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CRIMSON_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CRIMSON_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CRIMSON_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_CRIMSON_TRAPDOOR.get(), 2);

                var hasCrimsonMossyWarpedWoodCriteria = "hasCrimsonMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_WARPED_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_WARPED_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_WARPED_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_WARPED_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_WARPED_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_WARPED_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_WARPED_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_WARPED_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD, hasCrimsonMossyWarpedWoodCriteria, NemosMossyItems.CRIMSON_MOSSY_WARPED_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_STEM.get(), Items.STRIPPED_WARPED_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_HYPHAE.get(), Items.STRIPPED_WARPED_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_WARPED_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), 2, NemosMossyItems.CRIMSON_MOSSY_WARPED_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_WARPED_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_WARPED_FENCE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_WARPED_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_WARPED_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_WARPED_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.CRIMSON_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.CRIMSON_MOSSY_WARPED_TRAPDOOR.get(), 2);

                var hasWarpedMossyOakWoodCriteria = "hasWarpedMossyOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_OAK_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_OAK_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_OAK_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_OAK_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_OAK_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_OAK_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_OAK_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_OAK_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD, hasWarpedMossyOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_OAK_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_LOG.get(), Items.STRIPPED_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_WOOD.get(), Items.STRIPPED_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_OAK_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_OAK_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_OAK_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_OAK_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_OAK_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_OAK_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_OAK_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_OAK_TRAPDOOR.get(), 2);

                var hasWarpedMossySpruceWoodCriteria = "hasWarpedMossySpruceWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, NemosMossyItems.WARPED_MOSSY_SPRUCE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, NemosMossyItems.WARPED_MOSSY_SPRUCE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, NemosMossyItems.WARPED_MOSSY_SPRUCE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, NemosMossyItems.WARPED_MOSSY_SPRUCE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, NemosMossyItems.WARPED_MOSSY_SPRUCE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, NemosMossyItems.WARPED_MOSSY_SPRUCE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, NemosMossyItems.WARPED_MOSSY_SPRUCE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, NemosMossyItems.WARPED_MOSSY_SPRUCE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD, hasWarpedMossySpruceWoodCriteria, NemosMossyItems.WARPED_MOSSY_SPRUCE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_LOG.get(), Items.STRIPPED_SPRUCE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_WOOD.get(), Items.STRIPPED_SPRUCE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_SPRUCE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), 2, NemosMossyItems.WARPED_MOSSY_SPRUCE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_SPRUCE_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_SPRUCE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_SPRUCE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_SPRUCE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_SPRUCE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_SPRUCE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_SPRUCE_TRAPDOOR.get(), 2);

                var hasWarpedMossyBirchWoodCriteria = "hasWarpedMossyBirchWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, NemosMossyItems.WARPED_MOSSY_BIRCH_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, NemosMossyItems.WARPED_MOSSY_BIRCH_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, NemosMossyItems.WARPED_MOSSY_BIRCH_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, NemosMossyItems.WARPED_MOSSY_BIRCH_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, NemosMossyItems.WARPED_MOSSY_BIRCH_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, NemosMossyItems.WARPED_MOSSY_BIRCH_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, NemosMossyItems.WARPED_MOSSY_BIRCH_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, NemosMossyItems.WARPED_MOSSY_BIRCH_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD, hasWarpedMossyBirchWoodCriteria, NemosMossyItems.WARPED_MOSSY_BIRCH_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_LOG.get(), Items.STRIPPED_BIRCH_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_WOOD.get(), Items.STRIPPED_BIRCH_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BIRCH_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), 2, NemosMossyItems.WARPED_MOSSY_BIRCH_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BIRCH_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BIRCH_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BIRCH_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BIRCH_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BIRCH_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BIRCH_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BIRCH_TRAPDOOR.get(), 2);

                var hasWarpedMossyJungleWoodCriteria = "hasWarpedMossyJungleWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, NemosMossyItems.WARPED_MOSSY_JUNGLE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, NemosMossyItems.WARPED_MOSSY_JUNGLE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, NemosMossyItems.WARPED_MOSSY_JUNGLE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, NemosMossyItems.WARPED_MOSSY_JUNGLE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, NemosMossyItems.WARPED_MOSSY_JUNGLE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, NemosMossyItems.WARPED_MOSSY_JUNGLE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, NemosMossyItems.WARPED_MOSSY_JUNGLE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, NemosMossyItems.WARPED_MOSSY_JUNGLE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD, hasWarpedMossyJungleWoodCriteria, NemosMossyItems.WARPED_MOSSY_JUNGLE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_LOG.get(), Items.STRIPPED_JUNGLE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_WOOD.get(), Items.STRIPPED_JUNGLE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_JUNGLE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), 2, NemosMossyItems.WARPED_MOSSY_JUNGLE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_JUNGLE_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_JUNGLE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_JUNGLE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_JUNGLE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_JUNGLE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_JUNGLE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_JUNGLE_TRAPDOOR.get(), 2);

                var hasWarpedMossyAcaciaWoodCriteria = "hasWarpedMossyAcaciaWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, NemosMossyItems.WARPED_MOSSY_ACACIA_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, NemosMossyItems.WARPED_MOSSY_ACACIA_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, NemosMossyItems.WARPED_MOSSY_ACACIA_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, NemosMossyItems.WARPED_MOSSY_ACACIA_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, NemosMossyItems.WARPED_MOSSY_ACACIA_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, NemosMossyItems.WARPED_MOSSY_ACACIA_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, NemosMossyItems.WARPED_MOSSY_ACACIA_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, NemosMossyItems.WARPED_MOSSY_ACACIA_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD, hasWarpedMossyAcaciaWoodCriteria, NemosMossyItems.WARPED_MOSSY_ACACIA_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_LOG.get(), Items.STRIPPED_ACACIA_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_WOOD.get(), Items.STRIPPED_ACACIA_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_ACACIA_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), 2, NemosMossyItems.WARPED_MOSSY_ACACIA_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_ACACIA_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_ACACIA_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_ACACIA_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_ACACIA_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_ACACIA_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_ACACIA_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_ACACIA_TRAPDOOR.get(), 2);

                var hasWarpedMossyDarkOakWoodCriteria = "hasWarpedMossyDarkOakWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_DARK_OAK_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_DARK_OAK_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_DARK_OAK_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_DARK_OAK_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_DARK_OAK_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_DARK_OAK_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_DARK_OAK_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_DARK_OAK_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD, hasWarpedMossyDarkOakWoodCriteria, NemosMossyItems.WARPED_MOSSY_DARK_OAK_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_LOG.get(), Items.STRIPPED_DARK_OAK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_WOOD.get(), Items.STRIPPED_DARK_OAK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_DARK_OAK_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), 2, NemosMossyItems.WARPED_MOSSY_DARK_OAK_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_DARK_OAK_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_DARK_OAK_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_DARK_OAK_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_DARK_OAK_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_DARK_OAK_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_DARK_OAK_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_DARK_OAK_TRAPDOOR.get(), 2);

                var hasWarpedMossyMangroveCriteria = "hasWarpedMossyMangrove";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, NemosMossyItems.WARPED_MOSSY_MANGROVE_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, NemosMossyItems.WARPED_MOSSY_MANGROVE_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, NemosMossyItems.WARPED_MOSSY_MANGROVE_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, NemosMossyItems.WARPED_MOSSY_MANGROVE_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, NemosMossyItems.WARPED_MOSSY_MANGROVE_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, NemosMossyItems.WARPED_MOSSY_MANGROVE_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, NemosMossyItems.WARPED_MOSSY_MANGROVE_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, NemosMossyItems.WARPED_MOSSY_MANGROVE_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD, hasWarpedMossyMangroveCriteria, NemosMossyItems.WARPED_MOSSY_MANGROVE_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_LOG.get(), Items.STRIPPED_MANGROVE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_WOOD.get(), Items.STRIPPED_MANGROVE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_MANGROVE_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), 2, NemosMossyItems.WARPED_MOSSY_MANGROVE_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_MANGROVE_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_MANGROVE_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_MANGROVE_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_MANGROVE_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_MANGROVE_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_MANGROVE_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_MANGROVE_TRAPDOOR.get(), 2);

                var hasWarpedMossyCherryWoodCriteria = "hasWarpedMossyCherryWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, NemosMossyItems.WARPED_MOSSY_CHERRY_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, NemosMossyItems.WARPED_MOSSY_CHERRY_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, NemosMossyItems.WARPED_MOSSY_CHERRY_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, NemosMossyItems.WARPED_MOSSY_CHERRY_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, NemosMossyItems.WARPED_MOSSY_CHERRY_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, NemosMossyItems.WARPED_MOSSY_CHERRY_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, NemosMossyItems.WARPED_MOSSY_CHERRY_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, NemosMossyItems.WARPED_MOSSY_CHERRY_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD, hasWarpedMossyCherryWoodCriteria, NemosMossyItems.WARPED_MOSSY_CHERRY_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_LOG.get(), Items.STRIPPED_CHERRY_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_WOOD.get(), Items.STRIPPED_CHERRY_WOOD);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CHERRY_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), 2, NemosMossyItems.WARPED_MOSSY_CHERRY_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CHERRY_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CHERRY_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CHERRY_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CHERRY_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CHERRY_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CHERRY_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CHERRY_TRAPDOOR.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_MOSAIC.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_BLOCK.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_MOSAIC.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), 2, NemosMossyItems.WARPED_MOSSY_BAMBOO_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_TRAPDOOR.get(), 2);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_MOSAIC.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_BAMBOO_MOSAIC.get(), NemosMossyItems.WARPED_MOSSY_BAMBOO_MOSAIC_STAIRS.get());

                var hasWarpedMossyCrimsonWoodCriteria = "hasWarpedMossyCrimsonWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, NemosMossyItems.WARPED_MOSSY_CRIMSON_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, NemosMossyItems.WARPED_MOSSY_CRIMSON_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, NemosMossyItems.WARPED_MOSSY_CRIMSON_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, NemosMossyItems.WARPED_MOSSY_CRIMSON_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, NemosMossyItems.WARPED_MOSSY_CRIMSON_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, NemosMossyItems.WARPED_MOSSY_CRIMSON_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, NemosMossyItems.WARPED_MOSSY_CRIMSON_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, NemosMossyItems.WARPED_MOSSY_CRIMSON_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD, hasWarpedMossyCrimsonWoodCriteria, NemosMossyItems.WARPED_MOSSY_CRIMSON_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_STEM.get(), Items.STRIPPED_CRIMSON_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_HYPHAE.get(), Items.STRIPPED_CRIMSON_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CRIMSON_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), 2, NemosMossyItems.WARPED_MOSSY_CRIMSON_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CRIMSON_FENCE_GATE.get());
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CRIMSON_FENCE.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CRIMSON_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CRIMSON_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CRIMSON_STAIRS.get());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_CRIMSON_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_CRIMSON_TRAPDOOR.get(), 2);

                var hasWarpedMossyWarpedWoodCriteria = "hasWarpedMossyWarpedWood";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, NemosMossyItems.WARPED_MOSSY_WARPED_PLANKS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, NemosMossyItems.WARPED_MOSSY_WARPED_BUTTON.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, NemosMossyItems.WARPED_MOSSY_WARPED_DOOR.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, NemosMossyItems.WARPED_MOSSY_WARPED_FENCE_GATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, NemosMossyItems.WARPED_MOSSY_WARPED_FENCE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, NemosMossyItems.WARPED_MOSSY_WARPED_PRESSURE_PLATE.get(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, NemosMossyItems.WARPED_MOSSY_WARPED_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, NemosMossyItems.WARPED_MOSSY_WARPED_STAIRS.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD, hasWarpedMossyWarpedWoodCriteria, NemosMossyItems.WARPED_MOSSY_WARPED_TRAPDOOR.get(), 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_STEM.get(), Items.STRIPPED_WARPED_STEM);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_HYPHAE.get(), Items.STRIPPED_WARPED_HYPHAE);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_WARPED_BUTTON.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), 2, NemosMossyItems.WARPED_MOSSY_WARPED_DOOR.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_WARPED_FENCE_GATE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_WARPED_FENCE.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_WARPED_PRESSURE_PLATE.get(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_WARPED_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_WARPED_STAIRS.get(), 1);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, NemosMossyBlocks.WARPED_MOSSY_WARPED_PLANKS.get(), NemosMossyItems.WARPED_MOSSY_WARPED_TRAPDOOR.get(), 2);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Mossy Blocks Woodcutting Recipes";
    }
}
