package com.nemonotfound.nemos.woodcutter.datagen;

import com.devnemo.nemos.vertical.slabs.world.item.NemosVerticalItems;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.woodcutter.Constants.NEMOS_VERTICAL_SLABS_MOD_ID;

public class NemosVerticalSlabsRecipeProvider extends FabricRecipeProvider {

    public NemosVerticalSlabsRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new WoodcutterRecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                if (!Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_VERTICAL_SLABS_MOD_ID)) {
                    return;
                }

                var modDependencies = List.of(NEMOS_VERTICAL_SLABS_MOD_ID);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.ACACIA_PLANKS, NemosVerticalItems.ACACIA_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.BAMBOO_PLANKS, NemosVerticalItems.BAMBOO_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.BAMBOO_MOSAIC, NemosVerticalItems.BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.BIRCH_PLANKS, NemosVerticalItems.BIRCH_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.CHERRY_PLANKS, NemosVerticalItems.CHERRY_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.PALE_OAK_PLANKS, NemosVerticalItems.PALE_OAK_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.CRIMSON_PLANKS, NemosVerticalItems.CRIMSON_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.DARK_OAK_PLANKS, NemosVerticalItems.DARK_OAK_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.JUNGLE_PLANKS, NemosVerticalItems.JUNGLE_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.MANGROVE_PLANKS, NemosVerticalItems.MANGROVE_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.OAK_PLANKS, NemosVerticalItems.OAK_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.SPRUCE_PLANKS, NemosVerticalItems.SPRUCE_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.WARPED_PLANKS, NemosVerticalItems.WARPED_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.BAMBOO_BLOCKS, "bamboo_blocks", NemosVerticalItems.BAMBOO_MOSAIC_VERTICAL_SLAB.get(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.BAMBOO_BLOCKS, "bamboo_blocks", NemosVerticalItems.BAMBOO_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.BIRCH_LOGS, "birch_logs", NemosVerticalItems.BIRCH_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.CHERRY_LOGS, "cherry_logs", NemosVerticalItems.CHERRY_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.PALE_OAK_LOGS, "pale_oak_logs", NemosVerticalItems.PALE_OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.CRIMSON_STEMS, "crimson_stems", NemosVerticalItems.CRIMSON_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.DARK_OAK_LOGS, "dark_oak_logs", NemosVerticalItems.DARK_OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.JUNGLE_LOGS, "jungle_logs", NemosVerticalItems.JUNGLE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.MANGROVE_LOGS, "mangrove_logs", NemosVerticalItems.MANGROVE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.OAK_LOGS, "oak_logs", NemosVerticalItems.OAK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.SPRUCE_LOGS, "spruce_logs", NemosVerticalItems.SPRUCE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.WARPED_STEMS, "warped_stems", NemosVerticalItems.WARPED_VERTICAL_SLAB.get(), 8);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Vertical Slabs Woodcutting Recipes";
    }
}
