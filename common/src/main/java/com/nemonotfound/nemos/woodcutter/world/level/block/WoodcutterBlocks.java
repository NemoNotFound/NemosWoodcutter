package com.nemonotfound.nemos.woodcutter.world.level.block;

import com.nemonotfound.nemos.woodcutter.platform.Services;
import com.nemonotfound.nemos.woodcutter.references.WoodcutterBlockItemIds;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;
import java.util.function.Supplier;

public class WoodcutterBlocks {

    public static final WoodCollection<Supplier<Block>> WOODCUTTERS = WoodCollection.registerBlocks(
            WoodcutterBlockItemIds.WOODCUTTERS,
            WoodcutterBlocks::register,
            (_, properties) -> new WoodcutterBlock(properties),
            _ -> BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)
    );

    public static void init() {}

    private static Supplier<Block> register(
            String blockId,
            Function<BlockBehaviour.Properties, Block> function,
            BlockBehaviour.Properties properties
    ) {
        return Services.REGISTRY_HELPER.registerBlock(
                blockId,
                function,
                properties
        );
    }
}
