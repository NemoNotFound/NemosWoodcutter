package com.nemonotfound.nemos.woodcutter.datagen;

import com.nemonotfound.nemos.vertical.slabs.world.item.VerticalSlabItems;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.woodcutter.Constants.NEMOS_VERTICAL_SLABS_MOD_ID;

public class NemosVerticalSlabsRecipeProvider extends FabricRecipeProvider {

    public NemosVerticalSlabsRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider, @NonNull RecipeOutput recipeOutput) {
        return new WoodcutterRecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                if (!Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_VERTICAL_SLABS_MOD_ID)) {
                    return;
                }

                var modDependencies = List.of(NEMOS_VERTICAL_SLABS_MOD_ID);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.ACACIA_PLANKS, VerticalSlabItems.ACACIA_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.BAMBOO_PLANKS, VerticalSlabItems.BAMBOO_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.BAMBOO_MOSAIC, VerticalSlabItems.BAMBOO_MOSAIC_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.BIRCH_PLANKS, VerticalSlabItems.BIRCH_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.CHERRY_PLANKS, VerticalSlabItems.CHERRY_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.PALE_OAK_PLANKS, VerticalSlabItems.PALE_OAK_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.CRIMSON_PLANKS, VerticalSlabItems.CRIMSON_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.DARK_OAK_PLANKS, VerticalSlabItems.DARK_OAK_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.JUNGLE_PLANKS, VerticalSlabItems.JUNGLE_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.MANGROVE_PLANKS, VerticalSlabItems.MANGROVE_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.OAK_PLANKS, VerticalSlabItems.OAK_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.SPRUCE_PLANKS, VerticalSlabItems.SPRUCE_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, Blocks.WARPED_PLANKS, VerticalSlabItems.WARPED_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.BAMBOO_BLOCKS, "bamboo_blocks", VerticalSlabItems.BAMBOO_MOSAIC_VERTICAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.BAMBOO_BLOCKS, "bamboo_blocks", VerticalSlabItems.BAMBOO_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.BIRCH_LOGS, "birch_logs", VerticalSlabItems.BIRCH_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.CHERRY_LOGS, "cherry_logs", VerticalSlabItems.CHERRY_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.PALE_OAK_LOGS, "pale_oak_logs", VerticalSlabItems.PALE_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.CRIMSON_STEMS, "crimson_stems", VerticalSlabItems.CRIMSON_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.DARK_OAK_LOGS, "dark_oak_logs", VerticalSlabItems.DARK_OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.JUNGLE_LOGS, "jungle_logs", VerticalSlabItems.JUNGLE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.MANGROVE_LOGS, "mangrove_logs", VerticalSlabItems.MANGROVE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.OAK_LOGS, "oak_logs", VerticalSlabItems.OAK_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.SPRUCE_LOGS, "spruce_logs", VerticalSlabItems.SPRUCE_VERTICAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ItemTags.WARPED_STEMS, "warped_stems", VerticalSlabItems.WARPED_VERTICAL_SLAB, 8);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Vertical Slabs Woodcutting Recipes";
    }
}
