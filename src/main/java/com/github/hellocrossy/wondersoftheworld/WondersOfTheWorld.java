package com.github.hellocrossy.wondersoftheworld;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(WondersOfTheWorld.MOD_ID)
public class WondersOfTheWorld
{
    public static final String MOD_ID = "wondersoftheworld";
    public WondersOfTheWorld() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
    }
    private void setup(final FMLCommonSetupEvent event) {}
}