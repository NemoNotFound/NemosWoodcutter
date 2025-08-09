package com.devnemo.nemos.woodcutter;


import com.devnemo.nemos.woodcutter.client.gui.screen.WoodcutterScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

import static com.devnemo.nemos.woodcutter.client.gui.screen.ModMenuTypes.WOODCUTTER_SCREEN_HANDLER;

@Mod(value = Constants.MOD_ID, dist = Dist.CLIENT)
public class NeoForgeNemosWoodcutterClient {

    public NeoForgeNemosWoodcutterClient(IEventBus eventBus) {
        eventBus.addListener(this::registerScreen);
    }

    @SubscribeEvent
    public void registerScreen(RegisterMenuScreensEvent event) {
        event.register(WOODCUTTER_SCREEN_HANDLER.get(), WoodcutterScreen::new);
    }
}