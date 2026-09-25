package com.nemonotfound.nemos.woodcutter;

import com.nemonotfound.nemos.woodcutter.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.minecraft.resources.Identifier;

import static com.nemonotfound.nemos.woodcutter.Constants.*;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator fabricDataGenerator) {
        net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(WoodcuttingRecipeProvider::new);

        var biomesOPlentyPack = fabricDataGenerator.createBuiltinResourcePack(Identifier.fromNamespaceAndPath(MOD_ID, BIOMES_O_PLENTY_MOD_ID));
        biomesOPlentyPack.addProvider(BiomesOPlentyRecipeProvider::new);

        var nemosMossyBlocksPack = fabricDataGenerator.createBuiltinResourcePack(Identifier.fromNamespaceAndPath(MOD_ID, NEMOS_MOSSY_BLOCKS_MOD_ID));
        nemosMossyBlocksPack.addProvider(NemosMossyBlocksRecipeProvider::new);

        var nemosVerticalSlabsPack = fabricDataGenerator.createBuiltinResourcePack(Identifier.fromNamespaceAndPath(MOD_ID, NEMOS_VERTICAL_SLABS_MOD_ID));
        nemosVerticalSlabsPack.addProvider(NemosVerticalSlabsRecipeProvider::new);

        var nemosVerticalSlabsBiomesOPlentyPack = fabricDataGenerator.createBuiltinResourcePack(
                Identifier.fromNamespaceAndPath(MOD_ID, NEMOS_VERTICAL_SLABS_MOD_ID + "_" + BIOMES_O_PLENTY_MOD_ID)
        );
        nemosVerticalSlabsBiomesOPlentyPack.addProvider(NemosVerticalSlabsBiomesOPlentyRecipeProvider::new);

        var nemosVerticalSlabsMossyBlocksPack = fabricDataGenerator.createBuiltinResourcePack(
                Identifier.fromNamespaceAndPath(MOD_ID, NEMOS_VERTICAL_SLABS_MOD_ID + "_" + NEMOS_MOSSY_BLOCKS_MOD_ID)
        );
        nemosVerticalSlabsMossyBlocksPack.addProvider(NemosVerticalSlabsMossyBlocksRecipeProvider::new);
    }
}
