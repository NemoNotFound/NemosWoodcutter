package com.nemonotfound.nemos.woodcutter.world.level.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.Locale;

public enum WoodcutterVariant {
    OAK,
    SPRUCE,
    BIRCH,
    JUNGLE,
    ACACIA,
    CHERRY,
    DARK_OAK,
    PALE_OAK,
    MANGROVE,
    POPLAR,
    BAMBOO,
    CRIMSON,
    WARPED;

    public String woodName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public String id() {
        return woodName() + "_woodcutter";
    }

    public TagKey<Item> ingredients() {
        String path = switch (this) {
            case BAMBOO -> "bamboo_blocks";
            case CRIMSON -> "crimson_stems";
            case WARPED -> "warped_stems";
            default -> woodName() + "_logs";
        };
        return TagKey.create(Registries.ITEM, Identifier.withDefaultNamespace(path));
    }
}
