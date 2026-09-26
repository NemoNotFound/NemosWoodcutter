package com.nemonotfound.nemos.woodcutter.platform;

import com.nemonotfound.nemos.woodcutter.Constants;
import com.nemonotfound.nemos.woodcutter.NeoForgeNemosWoodcutter;
import com.nemonotfound.nemos.woodcutter.platform.services.IRegistryHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.List;
import java.util.function.Supplier;

public class NeoForgeRegistryHelper implements IRegistryHelper {

    @Override
    public Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
        return NeoForgeNemosWoodcutter.BLOCKS.register(id, () -> function.apply(properties.setId(createResourceKey(Registries.BLOCK, id))));
    }

    @Override
    public Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, Supplier<BlockBehaviour.Properties> properties) {
        return NeoForgeNemosWoodcutter.BLOCKS.register(id, () -> function.apply(properties.get().setId(createResourceKey(Registries.BLOCK, id))));
    }

    @Override
    public Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Item.Properties properties) {
        return NeoForgeNemosWoodcutter.ITEMS.register(id, () -> function.apply(properties.setId(createResourceKey(Registries.ITEM, id))));
    }

    @Override
    public Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Supplier<Item.Properties> properties) {
        return NeoForgeNemosWoodcutter.ITEMS.register(id, () -> function.apply(properties.get().setId(createResourceKey(Registries.ITEM, id))));
    }

    @Override
    public <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String id, Supplier<T> creativeModeTab) {
        return NeoForgeNemosWoodcutter.CREATIVE_TABS.register(id, creativeModeTab);
    }

    @Override
    public CreativeModeTab.Builder createCreativeModeTab(Supplier<List<Item>> items) {
        return CreativeModeTab.builder()
                .displayItems((_, output) -> items.get().forEach(output::accept));
    }

    private static <T> ResourceKey<T> createResourceKey(ResourceKey<Registry<T>> registryResourceKey, String id) {
        return ResourceKey.create(registryResourceKey, Identifier.fromNamespaceAndPath(Constants.MOD_ID, id));
    }
}
