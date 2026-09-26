package com.nemonotfound.nemos.woodcutter.datagen;

import com.nemonotfound.nemos.woodcutter.tags.WoodcutterBlockTags;
import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.BlockTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.woodcutter.tags.WoodcutterBlockTags.WOODCUTTERS;

public class WoodcutterBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {

    public WoodcutterBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider registries) {
        WoodcutterBlocks.WOODCUTTERS.forEach(
                block -> builder(WOODCUTTERS)
                        .add(BuiltInRegistries.BLOCK.getResourceKey(block.get()).orElseThrow())
        );
        builder(BlockTags.MINEABLE_WITH_AXE).addTag(WOODCUTTERS);
        builder(WoodcutterBlockTags.STONECUTTER_DANGER).addTag(WOODCUTTERS);
        builder(WoodcutterBlockTags.LEGACY_STONECUTTER_DANGER).addTag(WOODCUTTERS);
    }
}
