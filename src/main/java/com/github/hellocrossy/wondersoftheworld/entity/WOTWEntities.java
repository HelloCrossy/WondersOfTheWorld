package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.render.entity.*;
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
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "serval");

    public static final RegistryObject<EntityType<EmuEntity>> EMU =
            new Builder<>(EmuEntity::new, EntityClassification.CREATURE)
                    .attributes(EmuEntity::registerAttributes)
                    .renderer(() -> EmuRenderer::new)
                    .spawns(10, 1, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_SAVANNA,ZawaSpawnCategory.WET_SAVANNA )
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
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

    public static final RegistryObject<EntityType<SaigaAntelopeEntity>> SAIGA_ANTELOPE =
            new Builder<>(SaigaAntelopeEntity::new, EntityClassification.CREATURE)
                    .attributes(SaigaAntelopeEntity::registerAttributes)
                    .renderer(() -> SaigaAntelopeRenderer::new)
                    .spawn(ZawaSpawnCategory.DRY_SAVANNA, 3, 1, 3)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "saiga_antelope");

    public static final RegistryObject<EntityType<BongoEntity>> BONGO =
            new Builder<>(BongoEntity::new, EntityClassification.CREATURE)
                    .attributes(BongoEntity::registerAttributes)
                    .renderer(() -> BongoRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 3, 1, 3)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "bongo");

    public static final RegistryObject<EntityType<OscarEntity>> OSCAR =
            new Builder<>(OscarEntity::new, EntityClassification.WATER_AMBIENT)
            .attributes(OscarEntity::registerAttributes)
            .renderer (() -> OscarRenderer::new)
            .spawns(10, 2, 6, ZawaSpawnCategory.DEEP_RAINFOREST)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
            .build(REGISTRAR, "oscar");

    public static final RegistryObject<EntityType<DiscusFishEntity>> DISCUS_FISH =
            new Builder<>(DiscusFishEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(DiscusFishEntity::registerAttributes)
                    .renderer (() -> DiscusFishRenderer::new)
                    .spawns(10, 2, 6, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build(REGISTRAR, "discus_fish");

    public static final RegistryObject<EntityType<TakinEntity>> TAKIN =
            new Builder<>(TakinEntity::new, EntityClassification.CREATURE)
                    .attributes(TakinEntity::registerAttributes)
                    .renderer(() -> TakinRenderer::new)
                    .spawns(5, 1, 4, ZawaSpawnCategory.TEMPERATE_ALPINE, ZawaSpawnCategory.TUNDRA_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "takin");

    public static final RegistryObject<EntityType<FennecFoxEntity>> FENNEC_FOX =
            new Builder<>(FennecFoxEntity::new, EntityClassification.CREATURE)
                    .attributes(FennecFoxEntity::registerAttributes)
                    .renderer(() -> FennecFoxRenderer::new)
                    .spawns(5, 1, 4, ZawaSpawnCategory.HOT_DESERT)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "fennec_fox");

    public static final RegistryObject<EntityType<TibetanAntelopeEntity>> TIBETAN_ANTELOPE =
            new Builder<>(TibetanAntelopeEntity::new, EntityClassification.CREATURE)
                    .attributes(TibetanAntelopeEntity::registerAttributes)
                    .renderer(() -> TibetanAntelopeRenderer::new)
                    .spawns(5, 1, 4, ZawaSpawnCategory.TUNDRA_ALPINE, ZawaSpawnCategory.DRY_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "tibetan_antelope");

    public static final RegistryObject<EntityType<OryxEntity>> ORYX =
            new Builder<>(OryxEntity::new, EntityClassification.CREATURE)
                    .attributes(OryxEntity::registerAttributes)
                    .renderer(() -> OryxRenderer::new)
                    .spawns(10, 1, 4, ZawaSpawnCategory.HOT_DESERT, ZawaSpawnCategory.DRY_SAVANNA, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "oryx");

    public static final RegistryObject<EntityType<TuracoEntity>> TURACO =
            new Builder<>(TuracoEntity::new, EntityClassification.CREATURE)
                    .attributes(TuracoEntity::registerAttributes)
                    .renderer(() -> TuracoRenderer::new)
                    .spawns(10, 1, 4, ZawaSpawnCategory.HOT_DESERT, ZawaSpawnCategory.DRY_SAVANNA, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "turaco");


    public static class Builder<T extends Entity> extends ZawaEntities.Builder<T> {
        public Builder(EntityType.IFactory<T> factory, EntityClassification category) {
            super(factory, category);
            setupMod(WondersOfTheWorld.MOD_ID, WOTWItems.REGISTRAR, Zawa.ENTITIES_GROUP);
        }

    }
}



