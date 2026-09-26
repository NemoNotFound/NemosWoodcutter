package com.nemonotfound.nemos.woodcutter.datagen;

import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class WoodcutterLootProvider extends FabricBlockLootSubProvider {

    public WoodcutterLootProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    public void generate() {
        WoodcutterBlocks.WOODCUTTERS.forEach(block -> dropSelf(block.get()));
    }
}
