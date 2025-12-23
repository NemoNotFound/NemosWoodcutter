package com.nemonotfound.nemos.woodcutter;

import com.nemonotfound.nemos.woodcutter.item.ModCreativeModeTabs;
import com.nemonotfound.nemos.woodcutter.item.recipe.ModRecipeSerializerFabric;
import com.nemonotfound.nemos.woodcutter.item.recipe.ModRecipeTypesFabric;
import com.nemonotfound.nemos.woodcutter.item.recipe.book.ModRecipeBookCategoryFabric;
import com.nemonotfound.nemos.woodcutter.item.recipe.display.ModRecipeDisplaysFabric;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import com.nemonotfound.nemos.woodcutter.screen.ModMenuTypesFabric;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
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

        ModCreativeModeTabs.register();
        ModRecipeSerializerFabric.register();
        ModRecipeTypesFabric.register();
        ModRecipeBookCategoryFabric.register();
        ModRecipeDisplaysFabric.register();
        ModMenuTypesFabric.register();
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
                        Component.literal("Nemo's Vertical Slabs x Biomes O' Plenty"),
                        PackActivationType.ALWAYS_ENABLED
                ));
    }

    private void registerBuiltInNemosVerticalSlabsXBiomesOPlentyDataPack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceLoader.registerBuiltinPack(
                        Identifier.fromNamespaceAndPath(MOD_ID, NEMOS_VERTICAL_SLABS_MOD_ID + "_" + BIOMES_O_PLENTY_MOD_ID),
                        container,
                        Component.literal("Nemo's Vertical Slabs x Nemo's Mossy Blocks"),
                        PackActivationType.ALWAYS_ENABLED
                ));
    }
}
