package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.render.entity.EmuRenderer;
import com.github.hellocrossy.wondersoftheworld.client.render.entity.KiwiRenderer;
import com.github.hellocrossy.wondersoftheworld.client.render.entity.ServalRenderer;
import com.github.hellocrossy.wondersoftheworld.client.render.entity.TakaheRenderer;
import com.github.hellocrossy.wondersoftheworld.item.WOTWItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.animal.ZawaEntities;

public class WOTWEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENTITIES, WondersOfTheWorld.MOD_ID);

    public static final RegistryObject<EntityType<ServalEntity>> SERVAL =
            new Builder<>(ServalEntity::new, EntityClassification.CREATURE)
                    .attributes(ServalEntity::registerAttributes)
                    .renderer(() -> ServalRenderer::new)
                    .spawns(15, 1, 1, ZawaSpawnCategory.DRY_SAVANNA, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.5F, 1.5F).clientTrackingRange(10))
                    .build(REGISTRAR, "serval");

    public static final RegistryObject<EntityType<EmuEntity>> EMU =
            new Builder<>(EmuEntity::new, EntityClassification.CREATURE)
                    .attributes(EmuEntity::registerAttributes)
                    .renderer(() -> EmuRenderer::new)
                    .spawns(10, 1, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_SAVANNA,ZawaSpawnCategory.WET_SAVANNA )
                    .data(entityBuilder -> entityBuilder.sized(3.0F, 2.5F).clientTrackingRange(10))
                    .build(REGISTRAR, "emu");

    public static final RegistryObject<EntityType<TakaheEntity>> TAKAHE =
            new Builder<>(TakaheEntity::new, EntityClassification.CREATURE)
                    .attributes(TakaheEntity::registerAttributes)
                    .renderer(() -> TakaheRenderer::new)
                    .spawns(5, 1, 4, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.WET_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "takahe");

    public static final RegistryObject<EntityType<KiwiEntity>> KIWI =
            new Builder<>(KiwiEntity::new, EntityClassification.CREATURE)
                    .attributes(KiwiEntity::registerAttributes)
                    .renderer(() -> KiwiRenderer::new)
                    .spawn(ZawaSpawnCategory.WET_FOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "kiwi");

    public static class Builder<T extends Entity> extends ZawaEntities.Builder<T> {
        public Builder(EntityType.IFactory<T> factory, EntityClassification category) {
            super(factory, category);
            setupMod(WondersOfTheWorld.MOD_ID, WOTWItems.REGISTRAR, Zawa.ENTITIES_GROUP);
        }

    }
}



