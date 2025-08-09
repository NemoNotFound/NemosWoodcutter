package com.devnemo.nemos.woodcutter.platform;

import com.devnemo.nemos.woodcutter.platform.services.IRegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

import static com.devnemo.nemos.woodcutter.Constants.MOD_ID;

public class FabricRegistryHelper implements IRegistryHelper {

    @Override
    public Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
        return registerSupplierWithResourceKey(BuiltInRegistries.BLOCK, id, key -> function.apply(properties.setId(key)));
    }

    @Override
    public Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, Supplier<BlockBehaviour.Properties> properties) {
        return registerSupplierWithResourceKey(BuiltInRegistries.BLOCK, id, key -> function.apply(properties.get().setId(key)));
    }

    @Override
    public Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Item.Properties properties) {
        return registerSupplierWithResourceKey(BuiltInRegistries.ITEM, id, key -> function.apply(properties.setId(key)));
    }

    @Override
    public Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Supplier<Item.Properties> properties) {
        return  registerSupplierWithResourceKey(BuiltInRegistries.ITEM, id, key -> function.apply(properties.get().setId(key)));
    }

    @Override
    public <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String id, Supplier<T> creativeModeTab) {
        return registerSupplier(BuiltInRegistries.CREATIVE_MODE_TAB, id, creativeModeTab);
    }

    @Override
    public CreativeModeTab.Builder createCreativeModeTab() {
        return FabricItemGroup.builder();
    }

    private static <T, R extends Registry<? super T>> Supplier<T> registerSupplier(R registry, String id, Supplier<T> object) {
        final var resourceLocation = ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
        final var registeredObject = Registry.register((Registry<T>) registry, resourceLocation, object.get());

        return () -> registeredObject;
    }

    private static <T, R extends Registry<T>> Supplier<T> registerSupplierWithResourceKey(R registry, String id, Function<ResourceKey<T>, T> object) {
        final var resourceLocation = ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
        final var registeredObject = Registry.register(registry, resourceLocation, object.apply(ResourceKey.create(registry.key(), resourceLocation)));

        return () -> registeredObject;
    }
}
