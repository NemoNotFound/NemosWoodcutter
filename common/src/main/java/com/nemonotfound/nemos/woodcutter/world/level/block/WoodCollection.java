package com.nemonotfound.nemos.woodcutter.world.level.block;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.function.TriFunction;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public record WoodCollection<T>(
        T oak,
        T spruce,
        T birch,
        T jungle,
        T acacia,
        T cherry,
        T darkOak,
        T paleOak,
        T mangrove,
        T poplar,
        T bamboo,
        T crimson,
        T warped
) {
    public static final WoodCollection<WoodcutterVariant> VALUES = new WoodCollection<>(
            WoodcutterVariant.OAK,
            WoodcutterVariant.SPRUCE,
            WoodcutterVariant.BIRCH,
            WoodcutterVariant.JUNGLE,
            WoodcutterVariant.ACACIA,
            WoodcutterVariant.CHERRY,
            WoodcutterVariant.DARK_OAK,
            WoodcutterVariant.PALE_OAK,
            WoodcutterVariant.MANGROVE,
            WoodcutterVariant.POPLAR,
            WoodcutterVariant.BAMBOO,
            WoodcutterVariant.CRIMSON,
            WoodcutterVariant.WARPED);
    public static final WoodCollection<String> NAMES = VALUES.map(WoodcutterVariant::woodName);

    public static <T> WoodCollection<T> create(T value) {
        return new WoodCollection<>(value, value, value, value, value, value, value, value, value, value, value, value, value);
    }

    public static <B extends Block, Id> WoodCollection<Supplier<Block>> registerBlocks(
            WoodCollection<Id> ids,
            TriFunction<Id, Function<BlockBehaviour.Properties, Block>, BlockBehaviour.Properties, Supplier<Block>> register,
            BiFunction<WoodcutterVariant, BlockBehaviour.Properties, B> blockFactory,
            Function<WoodcutterVariant, BlockBehaviour.Properties> propertiesSupplier
    ) {
        return zipMap(VALUES, ids, (wood, id) ->
                register.apply(id, properties -> blockFactory.apply(wood, properties), propertiesSupplier.apply(wood)));
    }

    public static <Id> WoodCollection<Supplier<Item>> registerBlockItems(
            WoodCollection<Id> ids, WoodCollection<Supplier<Block>> blocks,
            TriFunction<Id, Supplier<Block>, WoodcutterVariant, Supplier<Item>> itemFactory
    ) {
        return zipMap(VALUES, ids, (wood, id) -> itemFactory.apply(id, blocks.pick(wood), wood));
    }

    public static WoodCollection<String> prefixWithWood(WoodCollection<String> ids) {
        return zipMap(NAMES, ids, (wood, id) -> wood + "_" + id);
    }

    public List<T> asList() {
        return List.of(oak, spruce, birch, jungle, acacia, cherry, darkOak, paleOak, mangrove, poplar, bamboo, crimson, warped);
    }

    public void forEach(Consumer<T> consumer) {
        consumer.accept(oak);
        consumer.accept(spruce);
        consumer.accept(birch);
        consumer.accept(jungle);
        consumer.accept(acacia);
        consumer.accept(cherry);
        consumer.accept(darkOak);
        consumer.accept(paleOak);
        consumer.accept(mangrove);
        consumer.accept(poplar);
        consumer.accept(bamboo);
        consumer.accept(crimson);
        consumer.accept(warped);
    }

    public T pick(WoodcutterVariant wood) {
        return switch (wood) {
            case OAK -> oak;
            case SPRUCE -> spruce;
            case BIRCH -> birch;
            case JUNGLE -> jungle;
            case ACACIA -> acacia;
            case CHERRY -> cherry;
            case DARK_OAK -> darkOak;
            case PALE_OAK -> paleOak;
            case MANGROVE -> mangrove;
            case POPLAR -> poplar;
            case BAMBOO -> bamboo;
            case CRIMSON -> crimson;
            case WARPED -> warped;
        };
    }

    public <U> WoodCollection<U> map(Function<T, U> mapper) {
        return new WoodCollection<>(
                mapper.apply(oak),
                mapper.apply(spruce),
                mapper.apply(birch),
                mapper.apply(jungle),
                mapper.apply(acacia),
                mapper.apply(cherry),
                mapper.apply(darkOak),
                mapper.apply(paleOak),
                mapper.apply(mangrove),
                mapper.apply(poplar),
                mapper.apply(bamboo),
                mapper.apply(crimson),
                mapper.apply(warped));
    }

    public static <T, U, R> WoodCollection<R> zipMap(
            WoodCollection<T> first, WoodCollection<U> second, BiFunction<T, U, R> operation) {
        return new WoodCollection<>(
                operation.apply(first.oak(), second.oak()),
                operation.apply(first.spruce(), second.spruce()),
                operation.apply(first.birch(), second.birch()),
                operation.apply(first.jungle(), second.jungle()),
                operation.apply(first.acacia(), second.acacia()),
                operation.apply(first.cherry(), second.cherry()),
                operation.apply(first.darkOak(), second.darkOak()),
                operation.apply(first.paleOak(), second.paleOak()),
                operation.apply(first.mangrove(), second.mangrove()),
                operation.apply(first.poplar(), second.poplar()),
                operation.apply(first.bamboo(), second.bamboo()),
                operation.apply(first.crimson(), second.crimson()),
                operation.apply(first.warped(), second.warped()));
    }
}
