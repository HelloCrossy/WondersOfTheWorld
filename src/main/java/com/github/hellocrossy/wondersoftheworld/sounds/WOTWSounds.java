package com.github.hellocrossy.wondersoftheworld.sounds;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WOTWSounds {
    public static final DeferredRegister<SoundEvent> REGISTRAR = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WondersOfTheWorld.MOD_ID);

    public static RegistryObject<SoundEvent> KIWI_AMBIENT = registerSound("kiwi_ambient");
    public static RegistryObject<SoundEvent> KIWI_HURT = registerSound("kiwi_hurt");
    public static RegistryObject<SoundEvent> FENNEC_FOX_AMBIENT = registerSound("fennec_fox_ambient");
    public static RegistryObject<SoundEvent> FENNEC_FOX_HURT = registerSound("fennec_fox_hurt");
    public static RegistryObject<SoundEvent> MARGAY_AMBIENT = registerSound("margay_ambient");
    public static RegistryObject<SoundEvent> MARGAY_HURT = registerSound("margay_hurt");
    public static RegistryObject<SoundEvent> MOUSE_DEER_AMBIENT = registerSound("mouse_deer_ambient");
    public static RegistryObject<SoundEvent> MOUSE_DEER_HURT = registerSound("mouse_deer_hurt");
    private static RegistryObject<SoundEvent> registerSound(String name) {
        return REGISTRAR.register(name, () -> new SoundEvent(new ResourceLocation(WondersOfTheWorld.MOD_ID, name)));
    }
}