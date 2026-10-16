package com.nemonotfound.nemos.woodcutter.datagen.language;

import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class WoodcutterRussianProvider extends FabricLanguageProvider {

    public WoodcutterRussianProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, "ru_ru", registries);
    }

    @Override
    public void generateTranslations(HolderLookup.@NotNull Provider registries, TranslationBuilder translations) {
        translations.add("container.woodcutter", "Дереворез");
        translations.add("itemGroup.nemos_woodcutter.woodcutters", "Дереворезы");
        translations.add("resourcePack.nemos_woodcutter.dark_mode.name", "Тёмный режим");
        translations.add("resourcePack.nemos_woodcutter.dark_mode.description", "Тёмный интерфейс деревореза");
        translations.add("resourcePack.nemos_woodcutter.classic.name", "Классический");
        translations.add("resourcePack.nemos_woodcutter.classic.description", "Классические текстуры деревореза");

        translations.add(WoodcutterBlocks.WOODCUTTERS.oak().get(), "Дубовый дереворез");
        translations.add(WoodcutterBlocks.WOODCUTTERS.spruce().get(), "Еловый дереворез");
        translations.add(WoodcutterBlocks.WOODCUTTERS.birch().get(), "Берёзовый дереворез");
        translations.add(WoodcutterBlocks.WOODCUTTERS.jungle().get(), "Дереворез из джунглевого дерева");
        translations.add(WoodcutterBlocks.WOODCUTTERS.acacia().get(), "Акациевый дереворез");
        translations.add(WoodcutterBlocks.WOODCUTTERS.cherry().get(), "Вишнёвый дереворез");
        translations.add(WoodcutterBlocks.WOODCUTTERS.darkOak().get(), "Дереворез из тёмного дуба");
        translations.add(WoodcutterBlocks.WOODCUTTERS.paleOak().get(), "Дереворез из бледного дуба");
        translations.add(WoodcutterBlocks.WOODCUTTERS.mangrove().get(), "Мангровый дереворез");
        translations.add(WoodcutterBlocks.WOODCUTTERS.poplar().get(), "Тополевый дереворез");
        translations.add(WoodcutterBlocks.WOODCUTTERS.bamboo().get(), "Бамбуковый дереворез");
        translations.add(WoodcutterBlocks.WOODCUTTERS.crimson().get(), "Багровый дереворез");
        translations.add(WoodcutterBlocks.WOODCUTTERS.warped().get(), "Искажённый дереворез");
    }
}
