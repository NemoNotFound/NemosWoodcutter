package com.nemonotfound.nemos.woodcutter.datagen;

import com.nemonotfound.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import com.nemonotfound.nemos.woodcutter.recipe.WoodcuttingRecipeJsonBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;

public abstract class WoodcutterRecipeProvider extends RecipeProvider {

    protected WoodcutterRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, List<String> modDependencies, TagKey<Item> inputTag, String criteria, Item result) {
        String inputName = inputTag.location().getPath();
        Ingredient ingredient = tag(inputTag);

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, result)
                .modDependencies(modDependencies)
                .unlockedBy(criteria, this.has(inputTag));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, TagKey<Item> inputTag, String criteria, Item result) {
        String inputName = inputTag.location().getPath();
        Ingredient ingredient = tag(inputTag);

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, result)
                .unlockedBy(criteria, this.has(inputTag));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, TagKey<Item> inputTag, String criteria, int inputCount, Item result) {
        String inputName = inputTag.location().getPath();
        Ingredient ingredient = tag(inputTag);

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, inputCount, result)
                .unlockedBy(criteria, this.has(inputTag));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, List<String> modDependencies, TagKey<Item> inputTag, String criteria, Item result, int outputCount) {
        String inputName = inputTag.location().getPath();
        Ingredient ingredient = tag(inputTag);

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, result, outputCount)
                .modDependencies(modDependencies)
                .unlockedBy(criteria, this.has(inputTag));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, TagKey<Item> inputTag, String criteria, Item result, int outputCount) {
        String inputName = inputTag.location().getPath();
        Ingredient ingredient = tag(inputTag);

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, result, outputCount)
                .unlockedBy(criteria, this.has(inputTag));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, List<String> modDependencies, ItemLike input, Item result) {
        Ingredient ingredient = Ingredient.of(input);
        String inputName = BuiltInRegistries.ITEM.getKey(input.asItem()).getPath();

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, result)
                .modDependencies(modDependencies)
                .unlockedBy(getHasName(input), this.has(input));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, ItemLike input, Item result) {
        Ingredient ingredient = Ingredient.of(input);
        String inputName = BuiltInRegistries.ITEM.getKey(input.asItem()).getPath();

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, result)
                .unlockedBy(getHasName(input), this.has(input));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, List<String> modDependencies, ItemLike input, int inputCount, Item result) {
        Ingredient ingredient = Ingredient.of(input);
        String inputName = BuiltInRegistries.ITEM.getKey(input.asItem()).getPath();

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, inputCount, result)
                .modDependencies(modDependencies)
                .unlockedBy(getHasName(input), this.has(input));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, ItemLike input, int inputCount, Item result) {
        Ingredient ingredient = Ingredient.of(input);
        String inputName = BuiltInRegistries.ITEM.getKey(input.asItem()).getPath();

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, inputCount, result)
                .unlockedBy(getHasName(input), this.has(input));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, List<String> modDependencies, ItemLike input, Item result, int outputCount) {
        Ingredient ingredient = Ingredient.of(input);
        String inputName = BuiltInRegistries.ITEM.getKey(input.asItem()).getPath();

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, result, outputCount)
                .modDependencies(modDependencies)
                .unlockedBy(getHasName(input), this.has(input));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, ItemLike input, Item result, int outputCount) {
        Ingredient ingredient = Ingredient.of(input);
        String inputName = BuiltInRegistries.ITEM.getKey(input.asItem()).getPath();

        var recipeBuilder = WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, result, outputCount)
                .unlockedBy(getHasName(input), this.has(input));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, List<String> modDependencies, ItemLike input, int inputCount, Item result, int outputCount) {
        Ingredient ingredient = Ingredient.of(input);
        String inputName = BuiltInRegistries.ITEM.getKey(input.asItem()).getPath();

        var recipeBuilder= WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, inputCount, result, outputCount)
                .modDependencies(modDependencies)
                .unlockedBy(getHasName(input), this.has(input));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected void createWoodcuttingRecipe(RecipeCategory recipeCategory, ItemLike input, int inputCount, Item result, int outputCount) {
        Ingredient ingredient = Ingredient.of(input);
        String inputName = BuiltInRegistries.ITEM.getKey(input.asItem()).getPath();

        var recipeBuilder= WoodcuttingRecipeJsonBuilder.createWoodcutting(recipeCategory, ingredient, inputCount, result, outputCount)
                .unlockedBy(getHasName(input), this.has(input));

        saveWoodcutting(recipeBuilder, result, inputName);
    }

    protected static String convertBetween(ItemLike to, String from) {
        return getItemName(to) + "_from_" + from;
    }

    private void saveWoodcutting(RecipeBuilder recipeBuilder, Item result, String inputName) {
        recipeBuilder.save(output, convertBetween(result, inputName) + "_woodcutting");
    }

    protected void createWoodCutterRecipe() {
        this.shaped(RecipeCategory.DECORATIONS, WoodcutterBlocks.WOODCUTTER.get())
                .define('I', Items.IRON_INGOT)
                .define('#', ItemTags.LOGS)
                .pattern(" I ")
                .pattern("###")
                .unlockedBy("has_logs", this.has(ItemTags.LOGS))
                .save(output);
    }
}
