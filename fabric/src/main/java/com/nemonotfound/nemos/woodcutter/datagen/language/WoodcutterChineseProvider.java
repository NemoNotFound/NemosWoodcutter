package com.nemonotfound.nemos.woodcutter.datagen.language;

import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class WoodcutterChineseProvider extends FabricLanguageProvider {

    public WoodcutterChineseProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, "zh_cn", registries);
    }

    @Override
    public void generateTranslations(HolderLookup.@NotNull Provider registries, TranslationBuilder translations) {
        translations.add("container.woodcutter", "切木机");
        translations.add("itemGroup.nemos_woodcutter.woodcutters", "切木机");
        translations.add("resourcePack.nemos_woodcutter.dark_mode.name", "深色模式");
        translations.add("resourcePack.nemos_woodcutter.dark_mode.description", "切木机的深色界面");
        translations.add("resourcePack.nemos_woodcutter.classic.name", "经典");
        translations.add("resourcePack.nemos_woodcutter.classic.description", "经典切木机纹理");

        translations.add(WoodcutterBlocks.WOODCUTTERS.oak().get(), "橡木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.spruce().get(), "云杉木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.birch().get(), "白桦木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.jungle().get(), "丛林木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.acacia().get(), "金合欢木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.cherry().get(), "樱花木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.darkOak().get(), "深色橡木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.paleOak().get(), "苍白橡木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.mangrove().get(), "红树木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.poplar().get(), "杨木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.bamboo().get(), "竹切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.crimson().get(), "绯红木切木机");
        translations.add(WoodcutterBlocks.WOODCUTTERS.warped().get(), "诡异木切木机");
    }
}
