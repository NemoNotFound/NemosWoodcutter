package com.nemonotfound.nemos.woodcutter.recipe;

import com.mojang.serialization.MapCodec;
import com.nemonotfound.nemos.woodcutter.recipe.book.ModRecipeBookCategory;
import com.nemonotfound.nemos.woodcutter.recipe.display.WoodcutterRecipeDisplay;
import com.nemonotfound.nemos.woodcutter.world.item.WoodcutterItems;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.item.crafting.display.RecipeDisplay;
import net.minecraft.world.item.crafting.display.SlotDisplay;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WoodcuttingRecipe extends SingleWithCountRecipe {

    public static final MapCodec<WoodcuttingRecipe> MAP_CODEC = simpleMapCodec(WoodcuttingRecipe::new);
    public static final StreamCodec<RegistryFriendlyByteBuf, WoodcuttingRecipe> STREAM_CODEC = simpleStreamCodec(WoodcuttingRecipe::new);
    public static final RecipeSerializer<WoodcuttingRecipe> SERIALIZER = new RecipeSerializer<>(MAP_CODEC, STREAM_CODEC);

    public WoodcuttingRecipe(Recipe.CommonInfo commonInfo, String group, List<String> modDependencies, Ingredient ingredient, int inputCount, ItemStackTemplate result) {
        super(commonInfo, group, modDependencies, ingredient, inputCount, result);
    }

    @Override
    public @NotNull RecipeSerializer<WoodcuttingRecipe> getSerializer() {
        return SERIALIZER;
    }

    @Override
    public @NotNull RecipeType<WoodcuttingRecipe> getType() {
        return WoodcutterRecipeTypes.WOODCUTTING.get();
    }

    @Override
    public @NotNull List<RecipeDisplay> display() {
        return List.of(new WoodcutterRecipeDisplay(this.ingredient().display(), this.createResultDisplay(),
                new SlotDisplay.ItemSlotDisplay(WoodcutterItems.WOODCUTTER.get())));
    }

    public SlotDisplay createResultDisplay() {
        return new SlotDisplay.ItemStackSlotDisplay(this.result());
    }

    @Override
    public @NotNull RecipeBookCategory recipeBookCategory() {
        return ModRecipeBookCategory.WOODCUTTER.get();
    }
}
