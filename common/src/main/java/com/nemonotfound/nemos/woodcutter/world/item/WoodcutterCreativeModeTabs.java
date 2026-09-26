package com.nemonotfound.nemos.woodcutter.world.item;

import com.nemonotfound.nemos.woodcutter.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class WoodcutterCreativeModeTabs {

    public static final Supplier<CreativeModeTab> WOODCUTTERS = Services.REGISTRY_HELPER.registerCreativeModeTab(
            "woodcutters",
            () -> Services.REGISTRY_HELPER.createCreativeModeTab(
                            () -> WoodcutterItems.WOODCUTTERS.map(Supplier::get).asList())
                    .title(Component.translatable("itemGroup.nemos_woodcutter.woodcutters"))
                    .icon(() -> new ItemStack(WoodcutterItems.WOODCUTTERS.oak().get()))
                    .build()
    );

    public static void init() {}
}
