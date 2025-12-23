package com.nemonotfound.nemos.woodcutter.client.gui.screen;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.crafting.display.SlotDisplayContext;
import org.jetbrains.annotations.NotNull;

import static com.nemonotfound.nemos.woodcutter.Constants.MOD_ID;

public class WoodcutterScreen extends AbstractContainerScreen<WoodcutterMenu> {
    private static final Identifier BACKGROUND_TEXTURE = Identifier.fromNamespaceAndPath(MOD_ID, "textures/gui/container/woodcutter.png");
    private static final Identifier SCROLLER_SPRITE = Identifier.fromNamespaceAndPath(MOD_ID, "container/woodcutter/scroller");
    private static final Identifier SCROLLER_DISABLED_SPRITE = Identifier.fromNamespaceAndPath(MOD_ID, "container/woodcutter/scroller_disabled");
    private static final Identifier RECIPE_SELECTED_SPRITE = Identifier.fromNamespaceAndPath(MOD_ID, "container/woodcutter/recipe_selected");
    private static final Identifier RECIPE_HIGHLIGHTED_SPRITE = Identifier.fromNamespaceAndPath(MOD_ID, "container/woodcutter/recipe_highlighted");
    private static final Identifier RECIPE_DISABLED_SPRITE = Identifier.fromNamespaceAndPath(MOD_ID, "container/woodcutter/recipe_disabled");
    private static final Identifier RECIPE_SPRITE = Identifier.fromNamespaceAndPath(MOD_ID, "container/woodcutter/recipe");

    private static final int SCROLLER_WIDTH = 12;
    private static final int SCROLLER_HEIGHT = 15;
    private static final int RECIPES_COLUMNS = 4;
    private static final int RECIPES_ROWS = 3;
    private static final int RECIPES_IMAGE_SIZE_WIDTH = 16;
    private static final int RECIPES_IMAGE_SIZE_HEIGHT = 18;
    private static final int SCROLLER_FULL_HEIGHT = 54;
    private static final int RELATIVE_RECIPE_X = 52;
    private static final int RELATIVE_RECIPE_Y = 14;
    private float scrollOffset;
    private boolean scrolling;
    private int firstVisibleRecipeIndex;
    private boolean areRecipesDisplayed;

    public WoodcutterScreen(WoodcutterMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
        menu.registerUpdateListener(this::containerChanged);
        --this.titleLabelY;
    }

    @Override
    public void render(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        super.render(guiGraphics, mouseX, mouseY, delta);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float delta, int mouseX, int mouseY) {
        var xPos = this.leftPos;
        var yPos = this.topPos;
        guiGraphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND_TEXTURE, xPos, yPos, 0.0F, 0.0F, this.imageWidth, this.imageHeight, 256, 256);
        var yPosAfterScrolling = (int)(41.0F * this.scrollOffset);
        var scrollerTexture = this.isScrollBarActive() ? SCROLLER_SPRITE : SCROLLER_DISABLED_SPRITE;
        guiGraphics.blitSprite(RenderPipelines.GUI_TEXTURED, scrollerTexture, xPos + 119, yPos + SCROLLER_HEIGHT + yPosAfterScrolling, SCROLLER_WIDTH, SCROLLER_HEIGHT);
        var recipeXPos = this.leftPos + RELATIVE_RECIPE_X;
        var recipeYPos = this.topPos + RELATIVE_RECIPE_Y;
        var scrollOffset = this.firstVisibleRecipeIndex + 12;
        this.renderButtons(guiGraphics, mouseX, mouseY, recipeXPos, recipeYPos, scrollOffset);
        this.renderRecipes(guiGraphics, recipeXPos, recipeYPos, scrollOffset);
    }

    @Override
    protected void renderTooltip(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY) {
        super.renderTooltip(guiGraphics, mouseX, mouseY);

        if (this.areRecipesDisplayed) {
            var firstRecipeX = this.leftPos + RELATIVE_RECIPE_X;
            var firstRecipeY = this.topPos + RELATIVE_RECIPE_Y;
            var scrollOffset = this.firstVisibleRecipeIndex + 12;
            var visibleRecipes = this.menu.getVisibleRecipes();

            for (int recipeIndex = this.firstVisibleRecipeIndex; recipeIndex < scrollOffset && recipeIndex < visibleRecipes.size(); recipeIndex++) {
                var visibleRecipeIndex = recipeIndex - this.firstVisibleRecipeIndex;
                var mouseDistanceToRecipeX = firstRecipeX + visibleRecipeIndex % RECIPES_COLUMNS * RECIPES_IMAGE_SIZE_WIDTH;
                var mouseDistanceToRecipeY = firstRecipeY + visibleRecipeIndex / RECIPES_COLUMNS * RECIPES_IMAGE_SIZE_HEIGHT + 2;

                if (mouseX >= mouseDistanceToRecipeX && mouseX < mouseDistanceToRecipeX + RECIPES_IMAGE_SIZE_WIDTH && mouseY >= mouseDistanceToRecipeY && mouseY < mouseDistanceToRecipeY + RECIPES_IMAGE_SIZE_HEIGHT) {
                    var contextmap = SlotDisplayContext.fromLevel(this.minecraft.level);
                    var slotDisplay = visibleRecipes.entries().get(recipeIndex).recipe().optionDisplay();
                    guiGraphics.setTooltipForNextFrame(this.font, slotDisplay.resolveForFirstStack(contextmap), mouseX, mouseY);
                }
            }
        }
    }

    private void renderButtons(GuiGraphics guiGraphics, int mouseX, int mouseY, int xPosForRecipe,
                               int yPosForRecipe, int lastVisibleElementIndex) {
        for (var i = this.firstVisibleRecipeIndex; i < lastVisibleElementIndex && i < this.menu.getAvailableRecipeCount(); ++i) {
            var yPosWithoutScrollOffset = i - this.firstVisibleRecipeIndex;
            int k = xPosForRecipe + yPosWithoutScrollOffset % RECIPES_COLUMNS * RECIPES_IMAGE_SIZE_WIDTH;
            int l = yPosWithoutScrollOffset / RECIPES_COLUMNS;
            int m = yPosForRecipe + l * RECIPES_IMAGE_SIZE_HEIGHT + 2;
            int actualInput = this.menu.inputSlot.getItem().getCount();
            int expectedInput = this.menu.getVisibleRecipes().entries().get(i).inputCount();

            if (actualInput < expectedInput) {
                guiGraphics.blitSprite(RenderPipelines.GUI_TEXTURED, RECIPE_DISABLED_SPRITE, k, m - 1, RECIPES_IMAGE_SIZE_WIDTH, RECIPES_IMAGE_SIZE_HEIGHT);
            } else {
                renderRecipeBackgroundForCraftableRecipe(guiGraphics, i, mouseX, mouseY, k, m);
            }
        }
    }

    private void renderRecipeBackgroundForCraftableRecipe(GuiGraphics guiGraphics, int i, int mouseX, int mouseY, int k, int m) {
        var texture = i == this.menu.getSelectedRecipeIndex() ? RECIPE_SELECTED_SPRITE :
                (mouseX >= k && mouseY >= m && mouseX < k + RECIPES_IMAGE_SIZE_WIDTH && mouseY < m + RECIPES_IMAGE_SIZE_HEIGHT ? RECIPE_HIGHLIGHTED_SPRITE : RECIPE_SPRITE);

        guiGraphics.blitSprite(RenderPipelines.GUI_TEXTURED, texture, k, m - 1, RECIPES_IMAGE_SIZE_WIDTH, RECIPES_IMAGE_SIZE_HEIGHT);
    }

    private void renderRecipes(GuiGraphics guiGraphics, int x, int y, int startIndex) {
        var availableRecipes = this.menu.getVisibleRecipes();
        var contextMap = SlotDisplayContext.fromLevel(this.minecraft.level);

        for (int i = this.firstVisibleRecipeIndex; i < startIndex && i < availableRecipes.size(); ++i) {
            var yPosWithoutScrollOffset = i - this.firstVisibleRecipeIndex;
            var k = x + yPosWithoutScrollOffset % RECIPES_COLUMNS * RECIPES_IMAGE_SIZE_WIDTH;
            var l = yPosWithoutScrollOffset / RECIPES_COLUMNS;
            var m = y + l * RECIPES_IMAGE_SIZE_HEIGHT + 2;
            var slotDisplay = (availableRecipes.entries().get(i)).recipe().optionDisplay();

            guiGraphics.renderItem(slotDisplay.resolveForFirstStack(contextMap), k, m);
        }
    }

    @Override
    public boolean mouseClicked(@NotNull MouseButtonEvent mouseButtonEvent, boolean bl) {
        this.scrolling = false;
        var mouseX = mouseButtonEvent.x();
        var mouseY = mouseButtonEvent.y();

        if (this.areRecipesDisplayed) {
            var firstRecipeX = this.leftPos + RELATIVE_RECIPE_X;
            var firstRecipeY = this.topPos + RELATIVE_RECIPE_Y;
            var maxVisibleRecipeCount = 12;
            var lastVisibleRecipeIndex = this.firstVisibleRecipeIndex + maxVisibleRecipeCount;

            for (int recipeIndex = this.firstVisibleRecipeIndex; recipeIndex < lastVisibleRecipeIndex; ++recipeIndex) {
                var visibleRecipeIndex = recipeIndex - this.firstVisibleRecipeIndex;
                var mouseDistanceToRecipeX = mouseX - (firstRecipeX + visibleRecipeIndex % 4 * RECIPES_IMAGE_SIZE_WIDTH);
                var mouseDistanceToRecipeY = mouseY - (firstRecipeY + visibleRecipeIndex / 4 * RECIPES_IMAGE_SIZE_HEIGHT);

                if (mouseDistanceToRecipeX >= 0.0 && mouseDistanceToRecipeY >= 0.0 && mouseDistanceToRecipeX < RECIPES_IMAGE_SIZE_WIDTH && mouseDistanceToRecipeY < RECIPES_IMAGE_SIZE_HEIGHT && this.menu.clickMenuButton(this.minecraft.player, recipeIndex)) {
                    handleRecipeSelect(recipeIndex);

                    return true;
                }
            }

            firstRecipeX = this.leftPos + 119;
            firstRecipeY = this.topPos + 9;

            if (mouseX >= firstRecipeX && mouseX < firstRecipeX + maxVisibleRecipeCount && mouseY >= firstRecipeY && mouseY < firstRecipeY + SCROLLER_FULL_HEIGHT) {
                this.scrolling = true;
            }
        }

        return super.mouseClicked(mouseButtonEvent, bl);
    }

    private void handleRecipeSelect(int recipeIndex) {
        var recipeInputCount = this.menu.getVisibleRecipes().entries().get(recipeIndex).inputCount();
        var inputCount = this.menu.inputSlot.getItem().getCount();
        var hasEnoughMaterials = inputCount >= recipeInputCount;

        if (hasEnoughMaterials) {
            Minecraft.getInstance().getSoundManager().play(SimpleSoundInstance.forUI(SoundEvents.UI_STONECUTTER_SELECT_RECIPE, 1.0f));
            this.minecraft.gameMode.handleInventoryButtonClick((this.menu).containerId, recipeIndex);

        } else {
            Minecraft.getInstance().getSoundManager().play(SimpleSoundInstance.forUI(SoundEvents.UI_STONECUTTER_SELECT_RECIPE, 4.0f));
        }
    }

    @Override
    public boolean mouseDragged(@NotNull MouseButtonEvent mouseButtonEvent, double dragX, double dragY) {
        var mouseY = mouseButtonEvent.y();

        if (this.scrolling && this.isScrollBarActive()) {
            int i = this.topPos + RELATIVE_RECIPE_Y;
            int j = i + SCROLLER_FULL_HEIGHT;
            this.scrollOffset = ((float) mouseY - i - 7.5F) / (j - i - 15.0F);
            this.scrollOffset = Mth.clamp(this.scrollOffset, 0.0F, 1.0F);
            this.firstVisibleRecipeIndex = (int) (this.scrollOffset * this.getOffscreenRows() + 0.5) * RECIPES_COLUMNS;

            return true;
        } else {
            return super.mouseDragged(mouseButtonEvent, dragX, dragY);
        }
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        if (super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount)) {
            return true;
        } else {
            if (this.isScrollBarActive()) {
                int i = this.getOffscreenRows();
                float f = (float) verticalAmount / i;
                this.scrollOffset = Mth.clamp(this.scrollOffset - f, 0.0F, 1.0F);
                this.firstVisibleRecipeIndex = (int) (this.scrollOffset * i + 0.5) * RECIPES_COLUMNS;
            }

            return true;
        }
    }

    private boolean isScrollBarActive() {
        return this.areRecipesDisplayed && (this.menu).getAvailableRecipeCount() > 12;
    }

    protected int getOffscreenRows() {
        return ((this.menu).getAvailableRecipeCount() + RECIPES_COLUMNS - 1) / RECIPES_COLUMNS - RECIPES_ROWS;
    }

    private void containerChanged() {
        this.areRecipesDisplayed = (this.menu).canCraft();

        if (!this.areRecipesDisplayed) {
            this.scrollOffset = 0.0f;
            this.firstVisibleRecipeIndex = 0;
        }
    }
}

