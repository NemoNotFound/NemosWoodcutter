package com.nemonotfound.nemos.woodcutter.item;

import com.nemonotfound.nemos.woodcutter.world.item.WoodcutterItems;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

import static com.nemonotfound.nemos.woodcutter.Constants.LOG;

public class ModCreativeModeTabs {

    public static void register() {
        LOG.info("Registering creative mode tabs");

        modifyFunctionalItemGroup();
    }

    private static void modifyFunctionalItemGroup() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS)
                .register(entries -> entries.insertAfter(Items.STONECUTTER, WoodcutterItems.WOODCUTTER.get()));
    }
}
