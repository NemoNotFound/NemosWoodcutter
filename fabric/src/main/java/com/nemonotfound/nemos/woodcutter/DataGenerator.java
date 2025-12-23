package com.nemonotfound.nemos.woodcutter;

import com.nemonotfound.nemos.woodcutter.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator fabricDataGenerator) {
        net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(WoodcuttingRecipeProvider::new);
        pack.addProvider(BiomesOPlentyRecipeProvider::new);
        pack.addProvider(NemosMossyBlocksRecipeProvider::new);
        pack.addProvider(NemosVerticalSlabsRecipeProvider::new);
        pack.addProvider(NemosVerticalSlabsBiomesOPlentyRecipeProvider::new);
        pack.addProvider(NemosVerticalSlabsMossyBlocksRecipeProvider::new);
    }
}
