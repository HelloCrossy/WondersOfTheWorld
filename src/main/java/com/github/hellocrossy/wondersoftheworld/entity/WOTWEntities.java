package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.entity.animal.ZawaEntities;

public class WOTWEntities {public static final DeferredRegister<EntityType<?>> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENTITIES, WondersOfTheWorld.MOD_ID);
}
public static class Builder<T extends Entity> extends ZawaEntities.Builder<T> {public Builder(EntityType.IFactory<T> factory, EntityClassification category) {
    super(factory, category);
    setupMod(WondersOfTheWorld.MOD_ID, WOTWItems.REGISTRAR, Zawa.ENTITIES_GROUP);}