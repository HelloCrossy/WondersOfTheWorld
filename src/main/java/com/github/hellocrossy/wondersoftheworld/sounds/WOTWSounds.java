package com.github.hellocrossy.wondersoftheworld.sounds;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WOTWSounds {
    public static final DeferredRegister<SoundEvent> REGISTRAR = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WondersOfTheWorld.MOD_ID);


    private static RegistryObject<SoundEvent> registerSound(String name) {
        return REGISTRAR.register(name, () -> new SoundEvent(new ResourceLocation(WondersOfTheWorld.MOD_ID, name)));
    }
}