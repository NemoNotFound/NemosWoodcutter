package com.nemonotfound.nemos.woodcutter;


import com.nemonotfound.nemos.woodcutter.client.gui.screen.ModMenuTypes;
import com.nemonotfound.nemos.woodcutter.client.gui.screen.WoodcutterScreen;
import com.nemonotfound.nemos.woodcutter.item.ModCreativeModeTabs;
import com.nemonotfound.nemos.woodcutter.item.recipe.ModRecipeSerializerForge;
import com.nemonotfound.nemos.woodcutter.item.recipe.ModRecipeTypesForge;
import com.nemonotfound.nemos.woodcutter.item.recipe.book.ModRecipeBookCategoryForge;
import com.nemonotfound.nemos.woodcutter.item.recipe.display.ModRecipeDisplaysForge;
import com.nemonotfound.nemos.woodcutter.platform.Services;
import com.nemonotfound.nemos.woodcutter.screen.ModMenuTypesForge;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackSelectionConfig;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Optional;

import static com.nemonotfound.nemos.woodcutter.Constants.*;

@Mod(MOD_ID)
public class ForgeNemosWoodcutter {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public ForgeNemosWoodcutter(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();
        NemosWoodcutterCommon.init();

        BLOCKS.register(modBusGroup);
        ITEMS.register(modBusGroup);
        CREATIVE_TABS.register(modBusGroup);

        AddPackFindersEvent.BUS.addListener(this::addBuiltInResourcePack);

        BuildCreativeModeTabContentsEvent.BUS.addListener(ModCreativeModeTabs::modifyFunctionalItemGroup);

        ModRecipeSerializerForge.register(modBusGroup);
        ModRecipeTypesForge.register(modBusGroup);
        ModRecipeBookCategoryForge.register(modBusGroup);
        ModRecipeDisplaysForge.register(modBusGroup);
        ModMenuTypesForge.register(modBusGroup);
    }

    public void addBuiltInResourcePack(AddPackFindersEvent event) {
        if (event.getPackType().equals(PackType.SERVER_DATA)) {
            registerBuiltInBiomesOPlentyDataPack(event);
            registerBuiltInNemosMossyBlocksDataPack(event);
        }
    }

    public void registerBuiltInBiomesOPlentyDataPack(AddPackFindersEvent event) {
        if (!Services.MOD_LOADER_HELPER.isModLoaded(BIOMES_O_PLENTY_MOD_ID)) {
            return;
        }

        var resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource("resourcepacks/biomesoplenty");
        var packLocationInfo = new PackLocationInfo(
                "builtin/biomesoplenty",
                Component.literal("Biomes O' Plenty"),
                PackSource.BUILT_IN,
                Optional.empty());
        var pathResourcesSupplier = new PathPackResources.PathResourcesSupplier(resourcePath);
        var packSelectionConfig = new PackSelectionConfig(true, Pack.Position.TOP, false);
        var pack = Pack.readMetaAndCreate(packLocationInfo,
                pathResourcesSupplier,
                PackType.SERVER_DATA,
                packSelectionConfig);

        event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
    }

    public void registerBuiltInNemosMossyBlocksDataPack(AddPackFindersEvent event) {
        if (!Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID)) {
            return;
        }

        var resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource("resourcepacks/nemos_mossy_blocks");
        var packLocationInfo = new PackLocationInfo(
                "builtin/nemos_mossy_blocks",
                Component.literal("Nemo's Mossy Blocks"),
                PackSource.BUILT_IN,
                Optional.empty());
        var pathResourcesSupplier = new PathPackResources.PathResourcesSupplier(resourcePath);
        var packSelectionConfig = new PackSelectionConfig(true, Pack.Position.TOP, false);
        var pack = Pack.readMetaAndCreate(packLocationInfo,
                pathResourcesSupplier,
                PackType.SERVER_DATA,
                packSelectionConfig);

        event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.BOTH, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.WOODCUTTER_SCREEN_HANDLER.get(), WoodcutterScreen::new);
        }

        @SubscribeEvent
        public static void addBuiltInResourcePack(AddPackFindersEvent event) {
            if (event.getPackType() == PackType.CLIENT_RESOURCES) {
                var resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource("resourcepacks/dark_mode");
                var packLocationInfo = new PackLocationInfo(
                        "builtin/dark_mode",
                        Component.translatable("resourcePack.nemos_woodcutter.dark_mode.name"),
                        PackSource.BUILT_IN,
                        Optional.empty());
                var pathResourcesSupplier = new PathPackResources.PathResourcesSupplier(resourcePath);
                var packSelectionConfig = new PackSelectionConfig(false, Pack.Position.TOP, false);
                var pack = Pack.readMetaAndCreate(packLocationInfo,
                        pathResourcesSupplier,
                        PackType.CLIENT_RESOURCES,
                        packSelectionConfig);

                event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
            }
        }
    }
}