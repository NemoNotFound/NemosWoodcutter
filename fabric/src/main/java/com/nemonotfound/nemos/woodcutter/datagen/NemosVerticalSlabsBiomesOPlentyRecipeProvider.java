package com.nemonotfound.nemos.woodcutter.datagen;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.init.ModTags;
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

import static com.nemonotfound.nemos.woodcutter.Constants.BIOMES_O_PLENTY_MOD_ID;
import static com.nemonotfound.nemos.woodcutter.Constants.NEMOS_VERTICAL_SLABS_MOD_ID;

public class NemosVerticalSlabsBiomesOPlentyRecipeProvider extends FabricRecipeProvider {

    public NemosVerticalSlabsBiomesOPlentyRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new WoodcutterRecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                if (!(Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_VERTICAL_SLABS_MOD_ID) && Services.MOD_LOADER_HELPER.isModLoaded(BIOMES_O_PLENTY_MOD_ID))) {
                    return;
                }

                var modDependencies = List.of(NEMOS_VERTICAL_SLABS_MOD_ID, BIOMES_O_PLENTY_MOD_ID);

                var hasFirLogsCriteria = "has_fir_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, NemosVerticalItems.FIR_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.FIR_PLANKS, NemosVerticalItems.FIR_VERTICAL_SLAB.get(), 2);

                var hasPineLogsCriteria = "has_pine_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, NemosVerticalItems.PINE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.PINE_PLANKS, NemosVerticalItems.PINE_VERTICAL_SLAB.get(), 2);

                var hasMapleLogsCriteria = "has_maple_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, NemosVerticalItems.MAPLE_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAPLE_PLANKS, NemosVerticalItems.MAPLE_VERTICAL_SLAB.get(), 2);

                var hasRedwoodLogsCriteria = "has_redwood_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, NemosVerticalItems.REDWOOD_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.REDWOOD_PLANKS, NemosVerticalItems.REDWOOD_VERTICAL_SLAB.get(), 2);

                var hasMahoganyLogsCriteria = "has_mahogany_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, NemosVerticalItems.MAHOGANY_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAHOGANY_PLANKS, NemosVerticalItems.MAHOGANY_VERTICAL_SLAB.get(), 2);

                var hasJacarandaLogsCriteria = "has_jacaranda_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, NemosVerticalItems.JACARANDA_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.JACARANDA_PLANKS, NemosVerticalItems.JACARANDA_VERTICAL_SLAB.get(), 2);

                var hasPalmLogsCriteria = "has_palm_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, NemosVerticalItems.PALM_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.PALM_PLANKS, NemosVerticalItems.PALM_VERTICAL_SLAB.get(), 2);

                var hasWillowLogsCriteria = "has_willow_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, NemosVerticalItems.WILLOW_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.WILLOW_PLANKS, NemosVerticalItems.WILLOW_VERTICAL_SLAB.get(), 2);

                var hasDeadLogsCriteria = "has_dead_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, NemosVerticalItems.DEAD_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.DEAD_PLANKS, NemosVerticalItems.DEAD_VERTICAL_SLAB.get(), 2);

                var hasMagicLogsCriteria = "has_magic_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, NemosVerticalItems.MAGIC_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAGIC_PLANKS, NemosVerticalItems.MAGIC_VERTICAL_SLAB.get(), 2);

                var hasUmbranLogsCriteria = "has_umbran_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, NemosVerticalItems.UMBRAN_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.UMBRAN_PLANKS, NemosVerticalItems.UMBRAN_VERTICAL_SLAB.get(), 2);

                var hasHellbarkLogsCriteria = "has_hellbark_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, NemosVerticalItems.HELLBARK_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.HELLBARK_PLANKS, NemosVerticalItems.HELLBARK_VERTICAL_SLAB.get(), 2);

                var hasEmpyrealLogsCriteria = "has_empyreal_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, NemosVerticalItems.EMPYREAL_VERTICAL_SLAB.get(), 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.EMPYREAL_PLANKS, NemosVerticalItems.EMPYREAL_VERTICAL_SLAB.get(), 2);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Vertical Slabs x Biomes O' Plenty Woodcutting Recipes";
    }
}
