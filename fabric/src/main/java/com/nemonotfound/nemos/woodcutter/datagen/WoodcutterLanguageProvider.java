package com.nemonotfound.nemos.woodcutter.datagen;

import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class WoodcutterLanguageProvider extends FabricLanguageProvider {

    public WoodcutterLanguageProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    public void generateTranslations(HolderLookup.@NotNull Provider registries, TranslationBuilder translations) {
        translations.add("container.woodcutter", "Woodcutter");
        translations.add("itemGroup.nemos_woodcutter.woodcutters", "Woodcutters");
        translations.add("resourcePack.nemos_woodcutter.dark_mode.name", "Dark Mode");
        translations.add("resourcePack.nemos_woodcutter.dark_mode.description", "Dark GUI for the woodcutter");
        translations.add("resourcePack.nemos_woodcutter.classic.name", "Classic");
        translations.add("resourcePack.nemos_woodcutter.classic.description", "Classic woodcutter textures");

        translations.add(WoodcutterBlocks.WOODCUTTERS.oak().get(), "Oak Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.spruce().get(), "Spruce Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.birch().get(), "Birch Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.jungle().get(), "Jungle Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.acacia().get(), "Acacia Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.cherry().get(), "Cherry Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.darkOak().get(), "Dark Oak Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.paleOak().get(), "Pale Oak Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.mangrove().get(), "Mangrove Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.poplar().get(), "Poplar Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.bamboo().get(), "Bamboo Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.crimson().get(), "Crimson Woodcutter");
        translations.add(WoodcutterBlocks.WOODCUTTERS.warped().get(), "Warped Woodcutter");
    }
}
