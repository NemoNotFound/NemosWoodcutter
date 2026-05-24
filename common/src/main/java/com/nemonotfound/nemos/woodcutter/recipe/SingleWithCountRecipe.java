package com.nemonotfound.nemos.woodcutter.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public abstract class SingleWithCountRecipe implements Recipe<SingleRecipeInput> {

    protected final Recipe.CommonInfo commonInfo;
    private final String group;
    private final List<String> modDependencies;
    private final Ingredient ingredient;
    private final int inputCount;
    private final ItemStackTemplate result;
    @Nullable
    private PlacementInfo ingredientPlacement;

    public SingleWithCountRecipe(Recipe.CommonInfo commonInfo, String group, List<String> modDependencies, Ingredient ingredient, int inputCount, ItemStackTemplate result) {
        this.commonInfo = commonInfo;
        this.group = group;
        this.modDependencies = modDependencies;
        this.ingredient = ingredient;
        this.inputCount = inputCount;
        this.result = result;
    }

    @Override
    public abstract @NotNull RecipeSerializer<? extends SingleWithCountRecipe> getSerializer();

    @Override
    public abstract @NotNull RecipeType<? extends SingleWithCountRecipe> getType();

    public boolean matches(SingleRecipeInput singleStackRecipeInput, @NotNull Level world) {
        return this.ingredient.test(singleStackRecipeInput.item());
    }

    @Override
    public @NotNull String group() {
        return this.group;
    }

    public List<String> modDependencies() {
        return this.modDependencies;
    }

    public Ingredient ingredient() {
        return this.ingredient;
    }

    public int inputCount() {
        return this.inputCount;
    }

    protected ItemStackTemplate result() {
        return this.result;
    }

    @Override
    public @NotNull PlacementInfo placementInfo() {
        if (this.ingredientPlacement == null) {
            this.ingredientPlacement = PlacementInfo.create(this.ingredient);
        }

        return this.ingredientPlacement;
    }

    @Override
    public boolean showNotification() {
        return this.commonInfo.showNotification();
    }

    public @NotNull ItemStack assemble(SingleRecipeInput input) {
        return this.result.create();
    }

    @FunctionalInterface
    public interface RecipeFactory<T extends SingleWithCountRecipe> {
        T create(Recipe.CommonInfo commonInfo, String group, List<String> modDependencies, Ingredient ingredient, int inputCount, ItemStackTemplate result);
    }

    public static <T extends SingleWithCountRecipe> MapCodec<T> simpleMapCodec(RecipeFactory<T> recipeFactory) {
        return RecordCodecBuilder.mapCodec(
                instance -> instance.group(
                                Recipe.CommonInfo.MAP_CODEC.forGetter(o -> o.commonInfo),
                                Codec.STRING.optionalFieldOf("group", "").forGetter(SingleWithCountRecipe::group),
                                Codec.list(Codec.STRING).optionalFieldOf("modDependencies", List.of()).forGetter(SingleWithCountRecipe::modDependencies),
                                Ingredient.CODEC.fieldOf("ingredient").forGetter(SingleWithCountRecipe::ingredient),
                                Codec.INT.fieldOf("inputCount").forGetter(SingleWithCountRecipe::inputCount),
                                ItemStackTemplate.CODEC.fieldOf("result").forGetter(SingleWithCountRecipe::result)
                        )
                        .apply(instance, recipeFactory::create)
        );
    }

    public static <T extends SingleWithCountRecipe> StreamCodec<RegistryFriendlyByteBuf, T> simpleStreamCodec(RecipeFactory<T> recipeFactory) {
        return StreamCodec.composite(
                Recipe.CommonInfo.STREAM_CODEC,
                o -> o.commonInfo,
                ByteBufCodecs.STRING_UTF8,
                SingleWithCountRecipe::group,
                ByteBufCodecs.collection(ArrayList::new, ByteBufCodecs.STRING_UTF8),
                SingleWithCountRecipe::modDependencies,
                Ingredient.CONTENTS_STREAM_CODEC,
                SingleWithCountRecipe::ingredient,
                ByteBufCodecs.INT,
                SingleWithCountRecipe::inputCount,
                ItemStackTemplate.STREAM_CODEC,
                SingleWithCountRecipe::result,
                recipeFactory::create
        );
    }
}
