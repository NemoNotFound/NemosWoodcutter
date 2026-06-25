package com.nemonotfound.nemos.woodcutter.recipe;

import net.minecraft.advancements.triggers.Criterion;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeUnlockAdvancementBuilder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WoodcuttingRecipeJsonBuilder implements RecipeBuilder {

    private final RecipeCategory category;
    private final SingleWithCountRecipe.RecipeFactory<?> recipeFactory;
    private final Ingredient input;
    private final int inputCount;
    private final RecipeUnlockAdvancementBuilder advancementBuilder = new RecipeUnlockAdvancementBuilder();
    private final ItemStackTemplate result;
    @Nullable
    private String group;
    private List<String> modDependencies = new ArrayList<>();

    public WoodcuttingRecipeJsonBuilder(
            RecipeCategory category,
            SingleWithCountRecipe.RecipeFactory<?> recipeFactory,
            Ingredient input,
            int inputCount,
            ItemStackTemplate result
    ) {
        this.category = category;
        this.recipeFactory = recipeFactory;
        this.input = input;
        this.inputCount = inputCount;
        this.result = result;
    }

    public static WoodcuttingRecipeJsonBuilder createWoodcutting(RecipeCategory category, Ingredient input, ItemLike result) {
        return createWoodcutting(category, input, 1, result, 1);
    }

    public static WoodcuttingRecipeJsonBuilder createWoodcutting(RecipeCategory category, Ingredient input, ItemLike result, int count) {
        return createWoodcutting(category, input, 1, result, count);
    }

    public static WoodcuttingRecipeJsonBuilder createWoodcutting(RecipeCategory category, Ingredient input, int inputCount, ItemLike result) {
        return createWoodcutting(category, input, inputCount, result, 1);
    }

    public static WoodcuttingRecipeJsonBuilder createWoodcutting(RecipeCategory category, Ingredient input, int inputCount, ItemLike result, int count) {
        return new WoodcuttingRecipeJsonBuilder(category, WoodcuttingRecipe::new, input, inputCount, new ItemStackTemplate(result.asItem(), count));
    }

    @Override
    public @NotNull RecipeBuilder unlockedBy(@NotNull String name, @NotNull Criterion<?> criterion) {
        this.advancementBuilder.unlockedBy(name, criterion);
        return this;
    }

    @Override
    public @NotNull RecipeBuilder group(@Nullable String group) {
        this.group = group;
        return this;
    }

    @Override
    public @NonNull ResourceKey<Recipe<?>> defaultId() {
        return RecipeBuilder.getDefaultRecipeId(this.result);
    }

    public @NotNull RecipeBuilder modDependencies(@Nullable List<String> modDependencies) {
        this.modDependencies = modDependencies;
        return this;
    }

    @Override
    public void save(RecipeOutput output, @NonNull ResourceKey<Recipe<?>> id) {
        SingleWithCountRecipe recipe = this.recipeFactory.create(new Recipe.CommonInfo(true), Objects.requireNonNullElse(this.group, ""), this.modDependencies, this.input, this.inputCount, this.result);
        output.accept(id, recipe, this.advancementBuilder.build(output, id, category));
    }
}
