package com.nemonotfound.nemos.woodcutter;

import com.nemonotfound.nemos.woodcutter.datagen.*;
import com.nemonotfound.nemos.woodcutter.datagen.WoodcuttingRecipeProvider;
import com.nemonotfound.nemos.woodcutter.datagen.recipe.*;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;

import static com.nemonotfound.nemos.woodcutter.Constants.*;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(@NonNull FabricDataGenerator fabricDataGenerator) {
        if (Services.MOD_LOADER_HELPER.isModLoaded(WILDER_WILD_MOD_ID)) {
            createModCompRecipes(fabricDataGenerator, WILDER_WILD_MOD_ID, WilderWildRecipeProvider::new);
            return;
        }

        Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(WoodcuttingRecipeProvider::new);
        pack.addProvider(WoodcutterModelProvider::new);
        pack.addProvider(WoodcutterBlockTagProvider::new);
        pack.addProvider(WoodcutterItemTagProvider::new);
        pack.addProvider(WoodcutterLootProvider::new);
        pack.addProvider(WoodcutterLanguageProvider::new);

        createModCompRecipes(fabricDataGenerator, BETTER_ARCHEOLOGY_MOD_ID, BetterArcheologyRecipeProvider::new);
        createModCompRecipes(fabricDataGenerator, BIOMES_O_PLENTY_MOD_ID, BiomesOPlentyRecipeProvider::new);
        createModCompRecipes(fabricDataGenerator, NEMOS_MOSSY_BLOCKS_MOD_ID, NemosMossyBlocksRecipeProvider::new);
        createModCompRecipes(fabricDataGenerator, NEMOS_VERTICAL_SLABS_MOD_ID, NemosVerticalSlabsRecipeProvider::new);
        createModCompRecipes(fabricDataGenerator, NEMOS_VERTICAL_SLABS_MOD_ID + "_" + BIOMES_O_PLENTY_MOD_ID, NemosVerticalSlabsBiomesOPlentyRecipeProvider::new);
        createModCompRecipes(fabricDataGenerator, NEMOS_VERTICAL_SLABS_MOD_ID + "_" + NEMOS_MOSSY_BLOCKS_MOD_ID, NemosVerticalSlabsMossyBlocksRecipeProvider::new);
    }

    private static void createModCompRecipes(FabricDataGenerator fabricDataGenerator, String id, Pack.RegistryDependentFactory<?> factory) {
        fabricDataGenerator.createBuiltinResourcePack(Identifier.fromNamespaceAndPath(MOD_ID, id))
                .addProvider(factory);
    }
}
