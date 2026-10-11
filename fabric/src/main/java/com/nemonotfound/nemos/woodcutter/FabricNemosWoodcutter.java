package com.nemonotfound.nemos.woodcutter;

import com.nemonotfound.nemos.woodcutter.item.recipe.ModRecipeSerializerFabric;
import com.nemonotfound.nemos.woodcutter.item.recipe.ModRecipeTypesFabric;
import com.nemonotfound.nemos.woodcutter.item.recipe.book.ModRecipeBookCategoryFabric;
import com.nemonotfound.nemos.woodcutter.item.recipe.display.ModRecipeDisplaysFabric;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import com.nemonotfound.nemos.woodcutter.references.WoodcutterBlockItemIds;
import com.nemonotfound.nemos.woodcutter.screen.ModMenuTypesFabric;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import static com.nemonotfound.nemos.woodcutter.Constants.*;

public class FabricNemosWoodcutter implements ModInitializer {

    @Override
    public void onInitialize() {
        NemosWoodcutterCommon.init();

        addWoodcutterAlias();
        addMoreWoodcutterVariantsAliases();

        if (Services.MOD_LOADER_HELPER.isModLoaded(WILDER_WILD_MOD_ID)) {
            registerBuiltInWilderWildDataPack();
        }

        if (Services.MOD_LOADER_HELPER.isModLoaded(BETTER_ARCHEOLOGY_MOD_ID)) {
            registerBuiltInBetterArcheologyDataPack();
        }

        if (Services.MOD_LOADER_HELPER.isModLoaded(BIOMES_O_PLENTY_MOD_ID)) {
            registerBuiltInBiomesOPlentyDataPack();
        }

        if (Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID)) {
            registerBuiltInNemosMossyBlocksDataPack();
        }

        if (Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_VERTICAL_SLABS_MOD_ID)) {
            registerBuiltInNemosVerticalSlabs();
        }

        if (Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_VERTICAL_SLABS_MOD_ID) && Services.MOD_LOADER_HELPER.isModLoaded(BIOMES_O_PLENTY_MOD_ID)) {
            registerBuiltInNemosVerticalSlabsXBiomesOPlentyDataPack();
        }

        if (Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_VERTICAL_SLABS_MOD_ID) && Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID)) {
            registerBuiltInNemosVerticalSlabsXNemosMossyBlocksDataPack();
        }

        ModRecipeSerializerFabric.register();
        ModRecipeTypesFabric.register();
        ModRecipeBookCategoryFabric.register();
        ModRecipeDisplaysFabric.register();
        ModMenuTypesFabric.register();
    }

    // Will be removed in 26.4
    @Deprecated(forRemoval = true)
    private static void addWoodcutterAlias() {
        var oldId = Identifier.fromNamespaceAndPath(MOD_ID, "woodcutter");
        var oakId = Identifier.fromNamespaceAndPath(MOD_ID, "oak_woodcutter");
        net.minecraft.core.registries.BuiltInRegistries.BLOCK.addAlias(oldId, oakId);
        net.minecraft.core.registries.BuiltInRegistries.ITEM.addAlias(oldId, oakId);
    }

    // Will be removed in 26.4
    @Deprecated(forRemoval = true)
    private static void addMoreWoodcutterVariantsAliases() {
        WoodcutterBlockItemIds.WOODCUTTERS.forEach(id -> {
            var oldId = Identifier.fromNamespaceAndPath("more_nemos_woodcutter_variants", id);
            var newId = Identifier.fromNamespaceAndPath(MOD_ID, id);

            net.minecraft.core.registries.BuiltInRegistries.BLOCK.addAlias(oldId, newId);
            net.minecraft.core.registries.BuiltInRegistries.ITEM.addAlias(oldId, newId);
        });
    }

    private void registerBuiltInWilderWildDataPack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceLoader.registerBuiltinPack(
                        Identifier.fromNamespaceAndPath(MOD_ID, WILDER_WILD_MOD_ID),
                        container,
                        Component.literal("Wilder Wild"),
                        PackActivationType.ALWAYS_ENABLED
                ));
    }

    private void registerBuiltInBetterArcheologyDataPack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceLoader.registerBuiltinPack(
                        Identifier.fromNamespaceAndPath(MOD_ID, BETTER_ARCHEOLOGY_MOD_ID),
                        container,
                        Component.literal("Better Archeology"),
                        PackActivationType.ALWAYS_ENABLED
                ));
    }

    private void registerBuiltInBiomesOPlentyDataPack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceLoader.registerBuiltinPack(
                        Identifier.fromNamespaceAndPath(MOD_ID, BIOMES_O_PLENTY_MOD_ID),
                        container,
                        Component.literal("Biomes O' Plenty"),
                        PackActivationType.ALWAYS_ENABLED
                ));
    }

    private void registerBuiltInNemosMossyBlocksDataPack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceLoader.registerBuiltinPack(
                        Identifier.fromNamespaceAndPath(MOD_ID, NEMOS_MOSSY_BLOCKS_MOD_ID),
                        container,
                        Component.literal("Nemo's Mossy Blocks"),
                        PackActivationType.ALWAYS_ENABLED
                ));
    }

    private void registerBuiltInNemosVerticalSlabs() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceLoader.registerBuiltinPack(
                        Identifier.fromNamespaceAndPath(MOD_ID, NEMOS_VERTICAL_SLABS_MOD_ID),
                        container,
                        Component.literal("Nemo's Vertical Slabs"),
                        PackActivationType.ALWAYS_ENABLED
                ));
    }

    private void registerBuiltInNemosVerticalSlabsXNemosMossyBlocksDataPack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceLoader.registerBuiltinPack(
                        Identifier.fromNamespaceAndPath(MOD_ID, NEMOS_VERTICAL_SLABS_MOD_ID + "_" + NEMOS_MOSSY_BLOCKS_MOD_ID),
                        container,
                        Component.literal("Nemo's Vertical Slabs x Nemo's Mossy Blocks"),
                        PackActivationType.ALWAYS_ENABLED
                ));
    }

    private void registerBuiltInNemosVerticalSlabsXBiomesOPlentyDataPack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceLoader.registerBuiltinPack(
                        Identifier.fromNamespaceAndPath(MOD_ID, NEMOS_VERTICAL_SLABS_MOD_ID + "_" + BIOMES_O_PLENTY_MOD_ID),
                        container,
                        Component.literal("Nemo's Vertical Slabs x Biomes O' Plenty"),
                        PackActivationType.ALWAYS_ENABLED
                ));
    }
}
