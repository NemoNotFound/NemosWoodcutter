package com.nemonotfound.nemos.woodcutter.datagen.recipe;

import com.nemonotfound.nemos.woodcutter.datagen.WoodcutterRecipeProvider;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import net.Pandarix.block.ModBlocks;
import net.Pandarix.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.crafting.Recipe;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.woodcutter.Constants.BETTER_ARCHEOLOGY_MOD_ID;

public class BetterArcheologyRecipeProvider extends FabricRecipeProvider {
    public BetterArcheologyRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider,
                                                           @NonNull BootstrapContext<Recipe<?>> recipeOutput,
                                                           @NonNull BootstrapContext<Advancement> advancementOutput) {
        return new WoodcutterRecipeProvider(recipeOutput, advancementOutput) {
            @Override
            public void buildRecipes() {
                if (!Services.MOD_LOADER_HELPER.isModLoaded(BETTER_ARCHEOLOGY_MOD_ID)) {
                    return;
                }

                var dependencies = List.of(BETTER_ARCHEOLOGY_MOD_ID);
                var logs = ModTags.Items.ROTTEN_LOGS;
                var criteria = "has_rotten_logs";
                var planks = ModBlocks.ROTTEN_PLANKS.get().asItem();

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, dependencies, logs, criteria, planks, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, dependencies, planks, 2, ModBlocks.ROTTEN_DOOR.get().asItem(), 2);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, dependencies, planks, ModBlocks.ROTTEN_FENCE.get().asItem());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, dependencies, planks, ModBlocks.ROTTEN_FENCE_GATE.get().asItem());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, dependencies, planks, ModBlocks.ROTTEN_PRESSURE_PLATE.get().asItem(), 4);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, dependencies, planks, ModBlocks.ROTTEN_SLAB.get().asItem(), 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, dependencies, planks, ModBlocks.ROTTEN_STAIRS.get().asItem());
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, dependencies, planks, ModBlocks.ROTTEN_TRAPDOOR.get().asItem(), 2);

                createWoodcuttingRecipe(RecipeCategory.REDSTONE, dependencies, logs, criteria, ModBlocks.ROTTEN_DOOR.get().asItem(), 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, dependencies, logs, criteria, ModBlocks.ROTTEN_FENCE.get().asItem(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, dependencies, logs, criteria, ModBlocks.ROTTEN_FENCE_GATE.get().asItem(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, dependencies, logs, criteria, ModBlocks.ROTTEN_PRESSURE_PLATE.get().asItem(), 16);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, dependencies, logs, criteria, ModBlocks.ROTTEN_SLAB.get().asItem(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, dependencies, logs, criteria, ModBlocks.ROTTEN_STAIRS.get().asItem(), 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, dependencies, logs, criteria, ModBlocks.ROTTEN_TRAPDOOR.get().asItem(), 8);
            }
        };
    }
}
