package com.github.hellocrossy.wondersoftheworld.sounds;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WOTWSounds {
    public static final DeferredRegister<SoundEvent> REGISTRAR = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WondersOfTheWorld.MOD_ID);

    public static RegistryObject<SoundEvent> TAKIN_AMBIENT = registerSound("takin_ambient");
    public static RegistryObject<SoundEvent> SERVAL_AMBIENT = registerSound("serval_ambient");
    public static RegistryObject<SoundEvent> SERVAL_HURT = registerSound("serval_hurt");
    public static RegistryObject<SoundEvent> SERVAL_ATTACK = registerSound("serval_attack");
    public static RegistryObject<SoundEvent> FENNEC_FOX_AMBIENT = registerSound("fennec_fox_ambient");
    public static RegistryObject<SoundEvent> FENNEC_FOX_HURT = registerSound("fennec_fox_hurt");
    public static RegistryObject<SoundEvent> EMU_AMBIENT = registerSound("emu_ambient");
    public static RegistryObject<SoundEvent> EMU_HURT = registerSound("emu_hurt");
    public static RegistryObject<SoundEvent> EMU_ATTACK = registerSound("emu_attack");
    public static RegistryObject<SoundEvent> KIWI_AMBIENT = registerSound("kiwi_ambient");
    public static RegistryObject<SoundEvent> KIWI_HURT = registerSound("kiwi_hurt");
    public static RegistryObject<SoundEvent> MOUSE_DEER_AMBIENT = registerSound("mouse_deer_ambient");
    public static RegistryObject<SoundEvent> MOUSE_DEER_HURT = registerSound("mouse_deer_hurt");
    public static RegistryObject<SoundEvent> MARGAY_AMBIENT = registerSound("margay_ambient");
    public static RegistryObject<SoundEvent> MARGAY_HURT = registerSound("margay_hurt");
    public static RegistryObject<SoundEvent> MARGAY_ATTACK = registerSound("margay_attack");
    public static RegistryObject<SoundEvent> HOOPOE_AMBIENT = registerSound("hoopoe_ambient");
    public static RegistryObject<SoundEvent> HOOPOE_HURT = registerSound("hoopoe_hurt");
    public static RegistryObject<SoundEvent> SLOTH_BEAR_AMBIENT = registerSound("sloth_bear_ambient");
    public static RegistryObject<SoundEvent> SLOTH_BEAR_HURT = registerSound("sloth_bear_hurt");
    public static RegistryObject<SoundEvent> SLOTH_BEAR_ATTACK = registerSound("sloth_bear_attack");
    public static RegistryObject<SoundEvent> HAMSTER_AMBIENT = registerSound("hamster_ambient");
    public static RegistryObject<SoundEvent> HAMSTER_HURT = registerSound("hamster_hurt");
    public static RegistryObject<SoundEvent> PALLAS_CAT_AMBIENT = registerSound("pallas_cat_ambient");
    //public static RegistryObject<SoundEvent> PALLAS_CAT_HURT = registerSound("pallas_cat_hurt");
    //public static RegistryObject<SoundEvent> PALLAS_CAT_ATTACK = registerSound("pallas_cat_attack");
    public static RegistryObject<SoundEvent> TAMARIN_AMBIENT = registerSound("tamarin_ambient");
    public static RegistryObject<SoundEvent> TAMARIN_HURT = registerSound("tamarin_hurt");
    public static RegistryObject<SoundEvent> CARACAL_AMBIENT = registerSound("caracal_ambient");
    public static RegistryObject<SoundEvent> CARACAL_HURT = registerSound("caracal_hurt");
    public static RegistryObject<SoundEvent> CARACAL_ATTACK = registerSound("caracal_attack");
    public static RegistryObject<SoundEvent> MANAKIN_AMBIENT = registerSound("manakin_ambient");
    public static RegistryObject<SoundEvent> MANAKIN_HURT = registerSound("manakin_hurt");
    public static RegistryObject<SoundEvent> CAIMAN_AMBIENT = registerSound("caiman_ambient");
    public static RegistryObject<SoundEvent> CAIMAN_HURT = registerSound("caiman_hurt");
    public static RegistryObject<SoundEvent> CAIMAN_ATTACK = registerSound("caiman_attack");
    public static RegistryObject<SoundEvent> SQUIRREL_MONKEY_AMBIENT = registerSound("squirrel_monkey_ambient");
    public static RegistryObject<SoundEvent> SQUIRREL_MONKEY_HURT = registerSound("squirrel_monkey_hurt");
    public static RegistryObject<SoundEvent> GUANACO_AMBIENT = registerSound("guanaco_ambient");



    private static RegistryObject<SoundEvent> registerSound(String name) {
        return REGISTRAR.register(name, () -> new SoundEvent(new ResourceLocation(WondersOfTheWorld.MOD_ID, name)));
    }
}