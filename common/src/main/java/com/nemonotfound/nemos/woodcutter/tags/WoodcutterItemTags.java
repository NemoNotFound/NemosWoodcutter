package com.nemonotfound.nemos.woodcutter.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.nemonotfound.nemos.woodcutter.Constants.MOD_ID;

public final class WoodcutterItemTags {

    public static final TagKey<Item> WOODCUTTERS = bind("woodcutters");

    private WoodcutterItemTags() {}

    private static TagKey<Item> bind(String path) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, path));
    }
}
