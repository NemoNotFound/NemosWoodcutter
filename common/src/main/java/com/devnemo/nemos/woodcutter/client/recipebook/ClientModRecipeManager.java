package com.devnemo.nemos.woodcutter.client.recipebook;

import com.devnemo.nemos.woodcutter.recipe.display.WoodcuttingRecipeDisplay;

public class ClientModRecipeManager {

    private final WoodcuttingRecipeDisplay.Grouping woodcuttingRecipes;

    public ClientModRecipeManager(WoodcuttingRecipeDisplay.Grouping woodcuttingRecipes) {
        this.woodcuttingRecipes = woodcuttingRecipes;
    }

    public WoodcuttingRecipeDisplay.Grouping getWoodcutterRecipes() {
        return this.woodcuttingRecipes;
    }
}
