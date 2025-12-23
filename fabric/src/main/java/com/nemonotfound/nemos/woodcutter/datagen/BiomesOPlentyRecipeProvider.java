package com.nemonotfound.nemos.woodcutter.datagen;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.init.ModTags;
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

public class BiomesOPlentyRecipeProvider extends FabricRecipeProvider {
    
    public BiomesOPlentyRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, RecipeOutput recipeOutput) {
        return new WoodcutterRecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                if (!Services.MOD_LOADER_HELPER.isModLoaded(BIOMES_O_PLENTY_MOD_ID)) {
                    return;
                }

                var modDependencies = List.of(BIOMES_O_PLENTY_MOD_ID);

                var hasFirLogsCriteria = "has_fir_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.FIR_LOG, BOPItems.STRIPPED_FIR_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.FIR_WOOD, BOPItems.STRIPPED_FIR_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.FIR_PLANKS, 2, BOPItems.FIR_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.FIR_PLANKS, BOPItems.FIR_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.FIR_PLANKS, 2, BOPItems.FIR_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.FIR_PLANKS, BOPItems.FIR_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.FIR_PLANKS, BOPItems.FIR_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.FIR_PLANKS, BOPItems.FIR_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.FIR_PLANKS, BOPItems.FIR_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.FIR_PLANKS, BOPItems.FIR_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.FIR_PLANKS, BOPItems.FIR_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.FIR_PLANKS, BOPItems.FIR_TRAPDOOR, 2);

                var hasPineLogsCriteria = "has_pine_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.PINE_LOG, BOPItems.STRIPPED_PINE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.PINE_WOOD, BOPItems.STRIPPED_PINE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.PINE_PLANKS, 2, BOPItems.PINE_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.PINE_PLANKS, BOPItems.PINE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.PINE_PLANKS, 2, BOPItems.PINE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.PINE_PLANKS, BOPItems.PINE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.PINE_PLANKS, BOPItems.PINE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.PINE_PLANKS, BOPItems.PINE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.PINE_PLANKS, BOPItems.PINE_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.PINE_PLANKS, BOPItems.PINE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.PINE_PLANKS, BOPItems.PINE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.PINE_PLANKS, BOPItems.PINE_TRAPDOOR, 2);

                var hasMapleLogsCriteria = "has_maple_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAPLE_LOG, BOPItems.STRIPPED_MAPLE_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAPLE_WOOD, BOPItems.STRIPPED_MAPLE_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.MAPLE_PLANKS, 2, BOPItems.MAPLE_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAPLE_PLANKS, 2, BOPItems.MAPLE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_TRAPDOOR, 2);

                var hasRedwoodLogsCriteria = "has_redwood_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.REDWOOD_LOG, BOPItems.STRIPPED_REDWOOD_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.REDWOOD_WOOD, BOPItems.STRIPPED_REDWOOD_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.REDWOOD_PLANKS, 2, BOPItems.REDWOOD_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.REDWOOD_PLANKS, 2, BOPItems.REDWOOD_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_TRAPDOOR, 2);

                var hasMahoganyLogsCriteria = "has_mahogany_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAHOGANY_LOG, BOPItems.STRIPPED_MAHOGANY_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAHOGANY_WOOD, BOPItems.STRIPPED_MAHOGANY_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.MAHOGANY_PLANKS, 2, BOPItems.MAHOGANY_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAHOGANY_PLANKS, 2, BOPItems.MAHOGANY_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_TRAPDOOR, 2);

                var hasJacarandaLogsCriteria = "has_jacaranda_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.JACARANDA_LOG, BOPItems.STRIPPED_JACARANDA_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.JACARANDA_WOOD, BOPItems.STRIPPED_JACARANDA_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.JACARANDA_PLANKS, 2, BOPItems.JACARANDA_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.JACARANDA_PLANKS, 2, BOPItems.JACARANDA_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_TRAPDOOR, 2);

                var hasPalmLogsCriteria = "has_palm_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.PALM_LOG, BOPItems.STRIPPED_PALM_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.PALM_WOOD, BOPItems.STRIPPED_PALM_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.PALM_PLANKS, 2, BOPItems.PALM_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.PALM_PLANKS, BOPItems.PALM_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.PALM_PLANKS, 2, BOPItems.PALM_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.PALM_PLANKS, BOPItems.PALM_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.PALM_PLANKS, BOPItems.PALM_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.PALM_PLANKS, BOPItems.PALM_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.PALM_PLANKS, BOPItems.PALM_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.PALM_PLANKS, BOPItems.PALM_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.PALM_PLANKS, BOPItems.PALM_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.PALM_PLANKS, BOPItems.PALM_TRAPDOOR, 2);

                var hasWillowLogsCriteria = "has_willow_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.WILLOW_LOG, BOPItems.STRIPPED_WILLOW_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.WILLOW_WOOD, BOPItems.STRIPPED_WILLOW_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.WILLOW_PLANKS, 2, BOPItems.WILLOW_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.WILLOW_PLANKS, 2, BOPItems.WILLOW_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_TRAPDOOR, 2);

                var hasDeadLogsCriteria = "has_dead_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.DEAD_LOG, BOPItems.STRIPPED_DEAD_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.DEAD_WOOD, BOPItems.STRIPPED_DEAD_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.DEAD_PLANKS, 2, BOPItems.DEAD_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.DEAD_PLANKS, 2, BOPItems.DEAD_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_TRAPDOOR, 2);

                var hasMagicLogsCriteria = "has_magic_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAGIC_LOG, BOPItems.STRIPPED_MAGIC_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAGIC_WOOD, BOPItems.STRIPPED_MAGIC_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.MAGIC_PLANKS, 2, BOPItems.MAGIC_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAGIC_PLANKS, 2, BOPItems.MAGIC_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_TRAPDOOR, 2);

                var hasUmbranLogsCriteria = "has_umbran_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.UMBRAN_LOG, BOPItems.STRIPPED_UMBRAN_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.UMBRAN_WOOD, BOPItems.STRIPPED_UMBRAN_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.UMBRAN_PLANKS, 2, BOPItems.UMBRAN_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.UMBRAN_PLANKS, 2, BOPItems.UMBRAN_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_TRAPDOOR, 2);

                var hasHellbarkLogsCriteria = "has_hellbark_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.HELLBARK_LOG, BOPItems.STRIPPED_HELLBARK_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.HELLBARK_WOOD, BOPItems.STRIPPED_HELLBARK_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.HELLBARK_PLANKS, 2, BOPItems.HELLBARK_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.HELLBARK_PLANKS, 2, BOPItems.HELLBARK_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_TRAPDOOR, 2);

                var hasEmpyrealLogsCriteria = "has_empyreal_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.EMPYREAL_LOG, BOPItems.STRIPPED_EMPYREAL_LOG);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.EMPYREAL_WOOD, BOPItems.STRIPPED_EMPYREAL_WOOD);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, modDependencies, BOPBlocks.EMPYREAL_PLANKS, 2, BOPItems.EMPYREAL_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.EMPYREAL_PLANKS, 2, BOPItems.EMPYREAL_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, modDependencies, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, modDependencies, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, modDependencies, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_TRAPDOOR, 2);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Biomes O' Plenty Woodcutting Recipes";
    }
}
