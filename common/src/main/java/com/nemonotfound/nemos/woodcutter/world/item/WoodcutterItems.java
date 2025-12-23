package com.nemonotfound.nemos.woodcutter.world.item;

import com.nemonotfound.nemos.woodcutter.platform.Services;
import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class WoodcutterItems {

    public static final Supplier<Item> WOODCUTTER = registerBlockItem("woodcutter", WoodcutterBlocks.WOODCUTTER);

    public static void init() {}

    private static Supplier<Item> registerBlockItem(String id, Supplier<Block> blockSupplier) {
        return Services.REGISTRY_HELPER.registerItem(
                id,
                properties -> new BlockItem(blockSupplier.get(), properties),
                new Item.Properties().useBlockDescriptionPrefix()
        );
    }
}
