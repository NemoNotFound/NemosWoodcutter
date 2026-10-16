package com.nemonotfound.nemos.woodcutter.datagen.language;

import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class WoodcutterTurkishProvider extends FabricLanguageProvider {

    public WoodcutterTurkishProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, "tr_tr", registries);
    }

    @Override
    public void generateTranslations(HolderLookup.@NotNull Provider registries, TranslationBuilder translations) {
        translations.add("container.woodcutter", "Odun Kesici");
        translations.add("itemGroup.nemos_woodcutter.woodcutters", "Odun Kesiciler");
        translations.add("resourcePack.nemos_woodcutter.dark_mode.name", "Koyu Mod");
        translations.add("resourcePack.nemos_woodcutter.dark_mode.description", "Odun kesici için koyu arayüz");
        translations.add("resourcePack.nemos_woodcutter.classic.name", "Klasik");
        translations.add("resourcePack.nemos_woodcutter.classic.description", "Klasik odun kesici dokuları");

        translations.add(WoodcutterBlocks.WOODCUTTERS.oak().get(), "Meşe Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.spruce().get(), "Ladin Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.birch().get(), "Huş Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.jungle().get(), "Orman Ağacı Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.acacia().get(), "Akasya Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.cherry().get(), "Kiraz Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.darkOak().get(), "Koyu Meşe Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.paleOak().get(), "Soluk Meşe Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.mangrove().get(), "Mangrov Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.poplar().get(), "Kavak Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.bamboo().get(), "Bambu Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.crimson().get(), "Kızıl Odun Kesici");
        translations.add(WoodcutterBlocks.WOODCUTTERS.warped().get(), "Çarpık Odun Kesici");
    }
}
