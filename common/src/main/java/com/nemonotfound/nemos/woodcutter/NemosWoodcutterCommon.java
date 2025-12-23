package com.nemonotfound.nemos.woodcutter;

import com.nemonotfound.nemos.woodcutter.world.item.WoodcutterItems;
import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;

public class NemosWoodcutterCommon {

    public static void init() {
        Constants.LOG.info("Thank you for using Nemo's Woodcutter!");

        WoodcutterBlocks.init();
        WoodcutterItems.init();
    }
}