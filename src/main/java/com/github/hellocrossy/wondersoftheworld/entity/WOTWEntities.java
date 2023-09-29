package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.render.entity.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

public class WOTWEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(WondersOfTheWorld.MOD_ID, Zawa.ENTITIES_GROUP);

    public static final RegistryObject<EntityType<ServalEntity>> SERVAL =
            REGISTRY.builder (ServalEntity::new, EntityClassification.CREATURE)
                    .attributes(ServalEntity::registerAttributes)
                    .renderer(() -> ServalRenderer::new)
                    .spawns(10, 1, 1, ZawaSpawnCategory.DRY_SAVANNA, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.9F, 0.9F).clientTrackingRange(10))
                    .build("serval");

    public static final RegistryObject<EntityType<EmuEntity>> EMU =
            REGISTRY.builder (EmuEntity::new, EntityClassification.CREATURE)
                    .attributes(EmuEntity::registerAttributes)
                    .renderer(() -> EmuRenderer::new)
                    .spawns(10, 1, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.DRY_SAVANNA,ZawaSpawnCategory.WET_SAVANNA )
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.6F).clientTrackingRange(10))
                    .build("emu");

    public static final RegistryObject<EntityType<TakaheEntity>> TAKAHE =
            REGISTRY.builder (TakaheEntity::new, EntityClassification.CREATURE)
                    .attributes(TakaheEntity::registerAttributes)
                    .renderer(() -> TakaheRenderer::new)
                    .spawns(8, 1, 4, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.WET_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.85F, 0.85F).clientTrackingRange(10))
                    .build("takahe");

    public static final RegistryObject<EntityType<KiwiEntity>> KIWI =
            REGISTRY.builder(KiwiEntity::new, EntityClassification.CREATURE)
                    .attributes(KiwiEntity::registerAttributes)
                    .renderer(() -> KiwiRenderer::new)
                    .spawn(ZawaSpawnCategory.WET_FOREST, 8, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(0.5F, 0.5F).clientTrackingRange(10))
                    .build("kiwi");

    public static final RegistryObject<EntityType<SaigaAntelopeEntity>> SAIGA_ANTELOPE =
            REGISTRY.builder(SaigaAntelopeEntity::new, EntityClassification.CREATURE)
                    .attributes(SaigaAntelopeEntity::registerAttributes)
                    .renderer(() -> SaigaAntelopeRenderer::new)
                    .spawn(ZawaSpawnCategory.DRY_SAVANNA, 2, 1, 6)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.25F).clientTrackingRange(10))
                    .build("saiga_antelope");

    public static final RegistryObject<EntityType<BongoEntity>> BONGO =
            REGISTRY.builder(BongoEntity::new, EntityClassification.CREATURE)
                    .attributes(BongoEntity::registerAttributes)
                    .renderer(() -> BongoRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 2, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 1.8F).clientTrackingRange(10))
                    .build("bongo");

    public static final RegistryObject<EntityType<OscarEntity>> OSCAR =
            REGISTRY.builder(OscarEntity::new, EntityClassification.WATER_AMBIENT)
            .attributes(OscarEntity::registerAttributes)
            .renderer (() -> OscarRenderer::new)
            .spawns(10, 3, 5, ZawaSpawnCategory.DEEP_RAINFOREST)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
            .build("oscar");

    public static final RegistryObject<EntityType<DiscusFishEntity>> DISCUS_FISH =
            REGISTRY.builder(DiscusFishEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(DiscusFishEntity::registerAttributes)
                    .renderer (() -> DiscusFishRenderer::new)
                    .spawns(10, 3, 5, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("discus_fish");

    public static final RegistryObject<EntityType<TakinEntity>> TAKIN =
            REGISTRY.builder(TakinEntity::new, EntityClassification.CREATURE)
                    .attributes(TakinEntity::registerAttributes)
                    .renderer(() -> TakinRenderer::new)
                    .spawns(10, 1, 4, ZawaSpawnCategory.TEMPERATE_ALPINE, ZawaSpawnCategory.TUNDRA_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.75F, 1.6F).clientTrackingRange(10))
                    .build("takin");

    public static final RegistryObject<EntityType<FennecFoxEntity>> FENNEC_FOX =
            REGISTRY.builder(FennecFoxEntity::new, EntityClassification.CREATURE)
                    .attributes(FennecFoxEntity::registerAttributes)
                    .renderer(() -> FennecFoxRenderer::new)
                    .spawns(10, 2, 4, ZawaSpawnCategory.HOT_DESERT)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.75F).clientTrackingRange(10))
                    .build("fennec_fox");

    public static final RegistryObject<EntityType<TibetanAntelopeEntity>> TIBETAN_ANTELOPE =
            REGISTRY.builder(TibetanAntelopeEntity::new, EntityClassification.CREATURE)
                    .attributes(TibetanAntelopeEntity::registerAttributes)
                    .renderer(() -> TibetanAntelopeRenderer::new)
                    .spawns(10, 1, 5, ZawaSpawnCategory.TUNDRA_ALPINE, ZawaSpawnCategory.DRY_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.5F, 1.6F).clientTrackingRange(10))
                    .build("tibetan_antelope");

    public static final RegistryObject<EntityType<OryxEntity>> ORYX =
            REGISTRY.builder(OryxEntity::new, EntityClassification.CREATURE)
                    .attributes(OryxEntity::registerAttributes)
                    .renderer(() -> OryxRenderer::new)
                    .spawns(8, 1, 4, ZawaSpawnCategory.HOT_DESERT, ZawaSpawnCategory.DRY_SAVANNA, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(1.5F, 2.0F).clientTrackingRange(10))
                    .build("oryx");

    public static final RegistryObject<EntityType<TuracoEntity>> TURACO =
            REGISTRY.builder(TuracoEntity::new, EntityClassification.CREATURE)
                    .attributes(TuracoEntity::registerAttributes)
                    .renderer(() -> TuracoRenderer::new)
                    .spawns(10, 2, 4, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.TROPICAL_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build("turaco");

    public static final RegistryObject<EntityType<VultureEntity>> VULTURE =
            REGISTRY.builder(VultureEntity::new, EntityClassification.CREATURE)
                    .attributes(VultureEntity::registerAttributes)
                    .renderer(() -> VultureRenderer::new)
                    .spawns(15, 2, 4, ZawaSpawnCategory.DEEP_RAINFOREST, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(8))
                    .build("vulture");

    public static final RegistryObject<EntityType<LowlandNyalaEntity>> LOWLAND_NYALA =
            REGISTRY.builder(LowlandNyalaEntity::new, EntityClassification.CREATURE)
                    .attributes(LowlandNyalaEntity::registerAttributes)
                    .renderer(() -> LowlandNyalaRenderer::new)
                    .spawns(10, 1, 5, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.75F, 1.8F).clientTrackingRange(10))
                    .build("lowland_nyala");

    public static final RegistryObject<EntityType<TitEntity>> TIT =
            REGISTRY.builder(TitEntity::new, EntityClassification.CREATURE)
                    .attributes(TitEntity::registerAttributes)
                    .renderer(() -> TitRenderer::new)
                    .spawns(15, 1, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.TEMPERATE_ALPINE, ZawaSpawnCategory.DRY_FOREST, ZawaSpawnCategory.WET_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.5F, 0.5F).clientTrackingRange(10))
                    .build("tit");
    public static final RegistryObject<EntityType<MouseDeerEntity>> MOUSE_DEER =
            REGISTRY.builder(MouseDeerEntity::new, EntityClassification.CREATURE)
                    .attributes(MouseDeerEntity::registerAttributes)
                    .renderer(() -> MouseDeerRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.DEEP_RAINFOREST, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.5F, 0.5F).clientTrackingRange(10))
                    .build("mouse_deer");
    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(TAKIN.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(BONGO.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(ORYX.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(LOWLAND_NYALA.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TIBETAN_ANTELOPE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(SAIGA_ANTELOPE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(SERVAL.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TAKAHE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(EMU.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(KIWI.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(VULTURE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaFlyingEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TURACO.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaFlyingEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(FENNEC_FOX.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(MOUSE_DEER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TIT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaFlyingEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(DISCUS_FISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(OSCAR.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkLandSpawnRulesWithLeaves);
    }
}



