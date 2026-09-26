package com.nemonotfound.nemos.woodcutter.datagen;

import com.nemonotfound.nemos.woodcutter.world.item.WoodcutterItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.woodcutter.tags.WoodcutterItemTags.WOODCUTTERS;

public class WoodcutterItemTagProvider extends FabricTagsProvider.ItemTagsProvider {

    public WoodcutterItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider registries) {
        WoodcutterItems.WOODCUTTERS.forEach(item ->
                builder(WOODCUTTERS).add(BuiltInRegistries.ITEM.getResourceKey(item.get()).orElseThrow()));
    }
}
