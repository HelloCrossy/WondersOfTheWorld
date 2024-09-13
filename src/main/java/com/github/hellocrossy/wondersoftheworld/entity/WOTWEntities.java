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
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

public class WOTWEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(WondersOfTheWorld.MOD_ID, Zawa.ENTITIES_GROUP);

    public static final RegistryObject<EntityType<ServalEntity>> SERVAL =
            REGISTRY.builder(ServalEntity::new, EntityClassification.CREATURE)
                    .attributes(ServalEntity::registerAttributes)
                    .renderer(() -> ServalRenderer::new)
                    .spawns(10, 1, 1, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 1.0F).clientTrackingRange(10))
                    .build("serval");

    public static final RegistryObject<EntityType<EmuEntity>> EMU =
            REGISTRY.builder(EmuEntity::new, EntityClassification.CREATURE)
                    .attributes(EmuEntity::registerAttributes)
                    .renderer(() -> EmuRenderer::new)
                    .spawns(10, 3, 5, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 1.4F).clientTrackingRange(10))
                    .build("emu");

    public static final RegistryObject<EntityType<KiwiEntity>> KIWI =
            REGISTRY.builder(KiwiEntity::new, EntityClassification.CREATURE)
                    .attributes(KiwiEntity::registerAttributes)
                    .renderer(() -> KiwiRenderer::new)
                    .spawn(ZawaSpawnCategory.TEMPERATE_FOREST, 5, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.5F, 0.5F).clientTrackingRange(10))
                    .build("kiwi");

    public static final RegistryObject<EntityType<SaigaAntelopeEntity>> SAIGA_ANTELOPE =
            REGISTRY.builder(SaigaAntelopeEntity::new, EntityClassification.CREATURE)
                    .attributes(SaigaAntelopeEntity::registerAttributes)
                    .renderer(() -> SaigaAntelopeRenderer::new)
                    .spawns(8, 2, 4, ZawaSpawnCategory.TEMPERATE_ALPINE, ZawaSpawnCategory.COLD_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 0.95F).clientTrackingRange(10))
                    .build("saiga_antelope");

    public static final RegistryObject<EntityType<WesternLowlandBongoEntity>> WESTERN_LOWLAND_BONGO =
            REGISTRY.builder(WesternLowlandBongoEntity::new, EntityClassification.CREATURE)
                    .attributes(WesternLowlandBongoEntity::registerAttributes)
                    .renderer(() -> WesternLowlandBongoRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 2, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 1.5F).clientTrackingRange(10))
                    .build("western_lowland_bongo");

    public static final RegistryObject<EntityType<OscarEntity>> OSCAR =
            REGISTRY.builder(OscarEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(OscarEntity::registerAttributes)
                    .renderer(() -> OscarRenderer::new)
                    .spawns(10, 2, 4, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("oscar");

    public static final RegistryObject<EntityType<DiscusFishEntity>> DISCUS_FISH =
            REGISTRY.builder(DiscusFishEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(DiscusFishEntity::registerAttributes)
                    .renderer(() -> DiscusFishRenderer::new)
                    .spawns(15, 3, 5, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("discus_fish");

    public static final RegistryObject<EntityType<TakinEntity>> TAKIN =
            REGISTRY.builder(TakinEntity::new, EntityClassification.CREATURE)
                    .attributes(TakinEntity::registerAttributes)
                    .renderer(() -> TakinRenderer::new)
                    .spawns(8, 2, 4, ZawaSpawnCategory.TEMPERATE_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.25F, 1.5F).clientTrackingRange(10))
                    .build("takin");

    public static final RegistryObject<EntityType<FennecFoxEntity>> FENNEC_FOX =
            REGISTRY.builder(FennecFoxEntity::new, EntityClassification.CREATURE)
                    .attributes(FennecFoxEntity::registerAttributes)
                    .renderer(() -> FennecFoxRenderer::new)
                    .spawns(10, 1, 2, ZawaSpawnCategory.HOT_DESERT)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.65F).clientTrackingRange(10))
                    .build("fennec_fox");

    public static final RegistryObject<EntityType<TibetanAntelopeEntity>> TIBETAN_ANTELOPE =
            REGISTRY.builder(TibetanAntelopeEntity::new, EntityClassification.CREATURE)
                    .attributes(TibetanAntelopeEntity::registerAttributes)
                    .renderer(() -> TibetanAntelopeRenderer::new)
                    .spawns(5, 3, 4, ZawaSpawnCategory.COLD_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(0.9F, 1.2F).clientTrackingRange(10))
                    .build("tibetan_antelope");
    public static final RegistryObject<EntityType<LowlandNyalaEntity>> LOWLAND_NYALA =
            REGISTRY.builder(LowlandNyalaEntity::new, EntityClassification.CREATURE)
                    .attributes(LowlandNyalaEntity::registerAttributes)
                    .renderer(() -> LowlandNyalaRenderer::new)
                    .spawns(10, 3, 4, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.1F, 1.5F).clientTrackingRange(10))
                    .build("lowland_nyala");

    public static final RegistryObject<EntityType<MouseDeerEntity>> MOUSE_DEER =
            REGISTRY.builder(MouseDeerEntity::new, EntityClassification.CREATURE)
                    .attributes(MouseDeerEntity::registerAttributes)
                    .renderer(() -> MouseDeerRenderer::new)
                    .spawns(5, 1, 2, ZawaSpawnCategory.WET_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.55F, 0.55F).clientTrackingRange(10))
                    .build("mouse_deer");
    public static final RegistryObject<EntityType<HoopoeEntity>> HOOPOE =
            REGISTRY.builder(HoopoeEntity::new, EntityClassification.CREATURE)
                    .attributes(HoopoeEntity::registerAttributes)
                    .renderer(() -> HoopoeRenderer::new)
                    .spawns(15, 3, 5, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.45F, 0.45F).clientTrackingRange(8))
                    .build("hoopoe");
    public static final RegistryObject<EntityType<MargayEntity>> MARGAY =
            REGISTRY.builder(MargayEntity::new, EntityClassification.CREATURE)
                    .attributes(MargayEntity::registerAttributes)
                    .renderer(() -> MargayRenderer::new)
                    .spawns(8, 1, 1, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
                    .build("margay");
    public static final RegistryObject<EntityType<CaimanEntity>> CAIMAN =
            REGISTRY.builder(CaimanEntity::new, EntityClassification.CREATURE)
                    .attributes(CaimanEntity::registerAttributes)
                    .renderer(() -> CaimanRenderer::new)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("caiman");

    public static final RegistryObject<EntityType<HamsterEntity>> HAMSTER =
            REGISTRY.builder(HamsterEntity::new, EntityClassification.CREATURE)
                    .attributes(HamsterEntity::registerAttributes)
                    .renderer(() -> HamsterRenderer::new)
                    .spawns(15, 2, 4, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(0.3F, 0.3F).clientTrackingRange(10))
                    .build("hamster");

    public static final RegistryObject<EntityType<GuanacoEntity>> GUANACO =
            REGISTRY.builder(GuanacoEntity::new, EntityClassification.CREATURE)
                    .attributes(GuanacoEntity::registerAttributes)
                    .renderer(() -> GuanacoRenderer::new)
                    .spawns(8, 2, 4, ZawaSpawnCategory.DRY_SAVANNA, ZawaSpawnCategory.DRY_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.5F, 1.8F).clientTrackingRange(10))
                    .build("guanaco");

    public static final RegistryObject<EntityType<CaracalEntity>> CARACAL =
            REGISTRY.builder(CaracalEntity::new, EntityClassification.CREATURE)
                    .attributes(CaracalEntity::registerAttributes)
                    .renderer(() -> CaracalRenderer::new)
                    .spawns(8, 1, 1, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.85F, 1.0F).clientTrackingRange(10))
                    .build("caracal");

    public static final RegistryObject<EntityType<SlothBearEntity>> SLOTH_BEAR =
            REGISTRY.builder(SlothBearEntity::new, EntityClassification.CREATURE)
                    .attributes(SlothBearEntity::registerAttributes)
                    .renderer(() -> SlothBearRenderer::new)
                    .spawns(5, 1, 1, ZawaSpawnCategory.DRY_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.3F, 1.2F).clientTrackingRange(10))
                    .build("sloth_bear");

    public static final RegistryObject<EntityType<PallasCatEntity>> PALLAS_CAT =
            REGISTRY.builder(PallasCatEntity::new, EntityClassification.CREATURE)
                    .attributes(PallasCatEntity::registerAttributes)
                    .renderer(() -> PallasCatRenderer::new)
                    .spawns(8, 1, 1, ZawaSpawnCategory.TUNDRA_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.7F, 0.5F).clientTrackingRange(10))
                    .build("pallas_cat");

    public static final RegistryObject<EntityType<ManakinEntity>> MANAKIN =
            REGISTRY.builder(ManakinEntity::new, EntityClassification.CREATURE)
                    .attributes(ManakinEntity::registerAttributes)
                    .renderer(() -> ManakinRenderer::new)
                    .spawns(10, 2, 5, ZawaSpawnCategory.TEMPERATE_FOREST, ZawaSpawnCategory.DRY_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
                    .build("manakin");

    public static final RegistryObject<EntityType<TamarinEntity>> TAMARIN =
            REGISTRY.builder(TamarinEntity::new, EntityClassification.CREATURE)
                    .attributes(TamarinEntity::registerAttributes)
                    .renderer(() -> TamarinRenderer::new)
                    .spawns(10, 2, 4, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.3F, 0.4F).clientTrackingRange(10))
                    .build("tamarin");

    public static final RegistryObject<EntityType<SquirrelMonkeyEntity>> SQUIRREL_MONKEY =
            REGISTRY.builder(SquirrelMonkeyEntity::new, EntityClassification.CREATURE)
                    .attributes(SquirrelMonkeyEntity::registerAttributes)
                    .renderer(() -> SquirrelMonkeyRenderer::new)
                    .spawns(10, 4, 5, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.7F).clientTrackingRange(10))
                    .build("squirrel_monkey");

    public static final RegistryObject<EntityType<TetraEntity>> TETRA =
            REGISTRY.builder(TetraEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(TetraEntity::registerAttributes)
                    .renderer(() -> TetraRenderer::new)
                    .spawns(15, 4, 7, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("tetra");

    public static final RegistryObject<EntityType<FlowerhornCichlidEntity>> FLOWERHORN_CICHILID =
            REGISTRY.builder(FlowerhornCichlidEntity::new, EntityClassification.WATER_AMBIENT)
                    .attributes(FlowerhornCichlidEntity::registerAttributes)
                    .renderer(() -> FlowerhornCichlidRenderer::new)
                    .spawns(10, 1, 1, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("flowerhorn_cichlid");

    public static final RegistryObject<EntityType<WarthogEntity>> WARTHOG =
            REGISTRY.builder(WarthogEntity::new, EntityClassification.CREATURE)
                    .attributes(WarthogEntity::registerAttributes)
                    .renderer(() -> WarthogRenderer::new)
                    .spawns(10, 1, 2, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.7F).clientTrackingRange(10))
                    .build("warthog");

    public static final RegistryObject<EntityType<PygmyHippoEntity>> PYGMY_HIPPO =
            REGISTRY.builder(PygmyHippoEntity::new, EntityClassification.CREATURE)
                    .attributes(PygmyHippoEntity::registerAttributes)
                    .renderer(() -> PygmyHippoRenderer::new)
                    .spawns(8, 1, 1, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.7F).clientTrackingRange(10))
                    .build("pygmy_hippo");


    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(TAKIN.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(WESTERN_LOWLAND_BONGO.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(LOWLAND_NYALA.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TIBETAN_ANTELOPE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(SAIGA_ANTELOPE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(SERVAL.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(EMU.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(KIWI.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(FENNEC_FOX.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(MOUSE_DEER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(HOOPOE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaFlyingEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(MARGAY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(DISCUS_FISH.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(OSCAR.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);

        EntitySpawnPlacementRegistry.register(CAIMAN.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(HAMSTER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(GUANACO.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(CARACAL.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(PALLAS_CAT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(SLOTH_BEAR.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(MANAKIN.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaFlyingEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TAMARIN.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(SQUIRREL_MONKEY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TETRA.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(FLOWERHORN_CICHILID.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);

        EntitySpawnPlacementRegistry.register(PYGMY_HIPPO.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(WARTHOG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
    }
}



