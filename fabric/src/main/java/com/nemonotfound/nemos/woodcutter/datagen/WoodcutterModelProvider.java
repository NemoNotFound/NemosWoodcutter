package com.nemonotfound.nemos.woodcutter.datagen;

import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlock;
import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterVariant;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

import static com.nemonotfound.nemos.woodcutter.Constants.MOD_ID;
import static net.minecraft.client.data.models.BlockModelGenerators.*;

public class WoodcutterModelProvider extends FabricModelProvider {

    private static final ModelTemplate WOODCUTTER = new ModelTemplate(
            Optional.of(Identifier.fromNamespaceAndPath(MOD_ID, "block/woodcutter")), Optional.empty(),
            TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);

    public WoodcutterModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NotNull BlockModelGenerators generators) {
        for (var variant : WoodcutterVariant.values()) {
            var block = WoodcutterBlocks.WOODCUTTERS.pick(variant).get();

            String texturePrefix = "block/" + variant.id();

            var textures = new TextureMapping()
                    .put(TextureSlot.BOTTOM, new Material(Identifier.fromNamespaceAndPath(MOD_ID, texturePrefix + "_bottom")))
                    .put(TextureSlot.TOP, new Material(Identifier.fromNamespaceAndPath(MOD_ID, texturePrefix + "_top")))
                    .put(TextureSlot.SIDE, new Material(Identifier.fromNamespaceAndPath(MOD_ID, texturePrefix + "_side")));

            var model = WOODCUTTER.create(block, textures, generators.modelOutput);

            generators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block, plainVariant(model))
                    .with(PropertyDispatch.modify(WoodcutterBlock.FACING)
                            .select(Direction.NORTH, NOP)
                            .select(Direction.EAST, Y_ROT_90)
                            .select(Direction.SOUTH, Y_ROT_180)
                            .select(Direction.WEST, Y_ROT_270)));
            generators.registerSimpleItemModel(block, model);
        }
    }

    @Override
    public void generateItemModels(@NotNull ItemModelGenerators generators) {}
}
