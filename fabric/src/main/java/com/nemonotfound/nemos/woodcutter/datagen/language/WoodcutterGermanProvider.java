package com.nemonotfound.nemos.woodcutter.datagen.language;

import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class WoodcutterGermanProvider extends FabricLanguageProvider {

    public WoodcutterGermanProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, "de_de", registries);
    }

    @Override
    public void generateTranslations(HolderLookup.@NotNull Provider registries, TranslationBuilder translations) {
        translations.add("container.woodcutter", "Holzsäge");
        translations.add("itemGroup.nemos_woodcutter.woodcutters", "Holzsägen");
        translations.add("resourcePack.nemos_woodcutter.dark_mode.name", "Dunkler Modus");
        translations.add("resourcePack.nemos_woodcutter.dark_mode.description", "Dunkle Benutzeroberfläche für die Holzsäge");
        translations.add("resourcePack.nemos_woodcutter.classic.name", "Klassisch");
        translations.add("resourcePack.nemos_woodcutter.classic.description", "Klassische Holzsägen-Texturen");

        translations.add(WoodcutterBlocks.WOODCUTTERS.oak().get(), "Eichenholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.spruce().get(), "Fichtenholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.birch().get(), "Birkenholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.jungle().get(), "Tropenholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.acacia().get(), "Akazienholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.cherry().get(), "Kirschholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.darkOak().get(), "Schwarzeichenholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.paleOak().get(), "Blasseichenholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.mangrove().get(), "Mangrovenholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.poplar().get(), "Pappelholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.bamboo().get(), "Bambusholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.crimson().get(), "Karmesinholzsäge");
        translations.add(WoodcutterBlocks.WOODCUTTERS.warped().get(), "Wirrholzsäge");
    }
}
