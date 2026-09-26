package com.nemonotfound.nemos.woodcutter.references;

import com.nemonotfound.nemos.woodcutter.world.level.block.WoodCollection;

public final class WoodcutterBlockItemIds {

    public static final WoodCollection<String> WOODCUTTERS = WoodCollection.prefixWithWood(WoodCollection.create("woodcutter"));

    private WoodcutterBlockItemIds() {}
}
