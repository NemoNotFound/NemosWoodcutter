package com.nemonotfound.nemos.woodcutter;


import com.nemonotfound.nemos.woodcutter.item.ModCreativeModeTabs;
import com.nemonotfound.nemos.woodcutter.item.recipe.ModRecipeSerializerNeoForge;
import com.nemonotfound.nemos.woodcutter.item.recipe.ModRecipeTypesNeoForge;
import com.nemonotfound.nemos.woodcutter.item.recipe.book.ModRecipeBookCategoryNeoForge;
import com.nemonotfound.nemos.woodcutter.item.recipe.display.ModRecipeDisplaysNeoForge;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import com.nemonotfound.nemos.woodcutter.screen.ModMenuTypesNeoForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.nemonotfound.nemos.woodcutter.Constants.*;

@Mod(Constants.MOD_ID)
@EventBusSubscriber(modid = MOD_ID)
public class NeoForgeNemosWoodcutter {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public NeoForgeNemosWoodcutter(IEventBus eventBus) {
        NemosWoodcutterCommon.init();

        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CREATIVE_TABS.register(eventBus);

        eventBus.addListener(ModCreativeModeTabs::modifyFunctionalItemGroup);

        ModRecipeSerializerNeoForge.register(eventBus);
        ModRecipeTypesNeoForge.register(eventBus);
        ModRecipeBookCategoryNeoForge.register(eventBus);
        ModRecipeDisplaysNeoForge.register(eventBus);
        ModMenuTypesNeoForge.register(eventBus);
    }

    @SubscribeEvent
    public static void addBuiltInResourcePacks(AddPackFindersEvent event) {
        var packType = event.getPackType();

        if (packType == PackType.CLIENT_RESOURCES) {
            event.addPackFinders(
                    Identifier.fromNamespaceAndPath(MOD_ID, "resourcepacks/dark_mode"),
                    PackType.CLIENT_RESOURCES,
                    Component.translatable("resourcePack.nemos_woodcutter.dark_mode.name"),
                    PackSource.BUILT_IN,
                    false,
                    Pack.Position.TOP
            );
        }

        if (packType == PackType.SERVER_DATA) {
            registerBuiltInBiomesOPlentyDataPack(event);
            registerBuiltInNemosMossyBlocksDataPack(event);
            registerBuiltInNemosVerticalSlabsDataPack(event);
        }
    }

    public static void registerBuiltInBiomesOPlentyDataPack(AddPackFindersEvent event) {
        if (!Services.MOD_LOADER_HELPER.isModLoaded(BIOMES_O_PLENTY_MOD_ID)) {
            return;
        }

        event.addPackFinders(
                Identifier.fromNamespaceAndPath(MOD_ID, "resourcepacks/biomesoplenty"),
                PackType.SERVER_DATA,
                Component.literal("Biomes O' Plenty"),
                PackSource.BUILT_IN,
                true,
                Pack.Position.TOP
        );
    }

    public static void registerBuiltInNemosMossyBlocksDataPack(AddPackFindersEvent event) {
        if (!Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID)) {
            return;
        }

        event.addPackFinders(
                Identifier.fromNamespaceAndPath(MOD_ID, "resourcepacks/nemos_mossy_blocks"),
                PackType.SERVER_DATA,
                Component.literal("Nemo's Mossy Blocks"),
                PackSource.BUILT_IN,
                true,
                Pack.Position.TOP
        );
    }

    public static void registerBuiltInNemosVerticalSlabsDataPack(AddPackFindersEvent event) {
        if (!Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_VERTICAL_SLABS_MOD_ID)) {
            return;
        }

        event.addPackFinders(
                Identifier.fromNamespaceAndPath(MOD_ID, "resourcepacks/nemos_vertical_slabs"),
                PackType.SERVER_DATA,
                Component.literal("Nemo's Vertical Slabs"),
                PackSource.BUILT_IN,
                true,
                Pack.Position.TOP
        );
    }
}