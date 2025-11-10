package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.render.entity.*;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.ambient.ZawaAmbientFishEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

public class WOTWEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(WondersOfTheWorld.MOD_ID);

    public static final RegistryObject<EntityType<ServalEntity>> SERVAL =
            REGISTRY.builder(ServalEntity::new, MobCategory.CREATURE)
                    .attributes(ServalEntity::registerAttributes)
                    .spawns(10, 1, 1, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 1.0F).clientTrackingRange(10))
                    .build("serval");

    public static final RegistryObject<EntityType<EmuEntity>> EMU =
            REGISTRY.builder(EmuEntity::new, MobCategory.CREATURE)
                    .attributes(EmuEntity::registerAttributes)
                    .spawns(10, 3, 5, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 1.4F).clientTrackingRange(10))
                    .build("emu");

    public static final RegistryObject<EntityType<KiwiEntity>> KIWI =
            REGISTRY.builder(KiwiEntity::new, MobCategory.CREATURE)
                    .attributes(KiwiEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.TEMPERATE_FOREST, 5, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.5F, 0.5F).clientTrackingRange(10))
                    .build("kiwi");

    public static final RegistryObject<EntityType<SaigaAntelopeEntity>> SAIGA_ANTELOPE =
            REGISTRY.builder(SaigaAntelopeEntity::new, MobCategory.CREATURE)
                    .attributes(SaigaAntelopeEntity::registerAttributes)
                    .spawns(8, 2, 4, ZawaSpawnCategory.TEMPERATE_ALPINE, ZawaSpawnCategory.COLD_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 0.95F).clientTrackingRange(10))
                    .build("saiga_antelope");

    public static final RegistryObject<EntityType<WesternLowlandBongoEntity>> WESTERN_LOWLAND_BONGO =
            REGISTRY.builder(WesternLowlandBongoEntity::new, MobCategory.CREATURE)
                    .attributes(WesternLowlandBongoEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 2, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 1.5F).clientTrackingRange(10))
                    .build("western_lowland_bongo");

    public static final RegistryObject<EntityType<OscarEntity>> OSCAR =
            REGISTRY.builder(OscarEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(OscarEntity::registerAttributes)
                    .spawns(10, 2, 4, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("oscar");

    public static final RegistryObject<EntityType<DiscusFishEntity>> DISCUS_FISH =
            REGISTRY.builder(DiscusFishEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(DiscusFishEntity::registerAttributes)
                    .spawns(15, 3, 5, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("discus_fish");

    public static final RegistryObject<EntityType<TakinEntity>> TAKIN =
            REGISTRY.builder(TakinEntity::new, MobCategory.CREATURE)
                    .attributes(TakinEntity::registerAttributes)
                    .spawns(8, 2, 4, ZawaSpawnCategory.TEMPERATE_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.25F, 1.5F).clientTrackingRange(10))
                    .build("takin");

    public static final RegistryObject<EntityType<FennecFoxEntity>> FENNEC_FOX =
            REGISTRY.builder(FennecFoxEntity::new, MobCategory.CREATURE)
                    .attributes(FennecFoxEntity::registerAttributes)
                    .spawns(10, 1, 2, ZawaSpawnCategory.HOT_DESERT)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.65F).clientTrackingRange(10))
                    .build("fennec_fox");

    public static final RegistryObject<EntityType<TibetanAntelopeEntity>> TIBETAN_ANTELOPE =
            REGISTRY.builder(TibetanAntelopeEntity::new, MobCategory.CREATURE)
                    .attributes(TibetanAntelopeEntity::registerAttributes)
                    .spawns(5, 3, 4, ZawaSpawnCategory.COLD_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(0.9F, 1.2F).clientTrackingRange(10))
                    .build("tibetan_antelope");
    public static final RegistryObject<EntityType<LowlandNyalaEntity>> LOWLAND_NYALA =
            REGISTRY.builder(LowlandNyalaEntity::new, MobCategory.CREATURE)
                    .attributes(LowlandNyalaEntity::registerAttributes)
                    .spawns(10, 3, 4, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.1F, 1.5F).clientTrackingRange(10))
                    .build("lowland_nyala");

    public static final RegistryObject<EntityType<MouseDeerEntity>> MOUSE_DEER =
            REGISTRY.builder(MouseDeerEntity::new, MobCategory.CREATURE)
                    .attributes(MouseDeerEntity::registerAttributes)
                    .spawns(5, 1, 2, ZawaSpawnCategory.WET_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.55F, 0.55F).clientTrackingRange(10))
                    .build("mouse_deer");
    public static final RegistryObject<EntityType<HoopoeEntity>> HOOPOE =
            REGISTRY.builder(HoopoeEntity::new, MobCategory.CREATURE)
                    .attributes(HoopoeEntity::registerAttributes)
                    .spawns(15, 3, 5, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.45F, 0.45F).clientTrackingRange(8))
                    .build("hoopoe");
    public static final RegistryObject<EntityType<MargayEntity>> MARGAY =
            REGISTRY.builder(MargayEntity::new, MobCategory.CREATURE)
                    .attributes(MargayEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
                    .build("margay");
    public static final RegistryObject<EntityType<CaimanEntity>> CAIMAN =
            REGISTRY.builder(CaimanEntity::new, MobCategory.CREATURE)
                    .attributes(CaimanEntity::registerAttributes)
                    .spawns(8, 1, 2, ZawaSpawnCategory.SLOW_FRESH_WATER)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 0.4F).clientTrackingRange(10))
                    .build("caiman");

    public static final RegistryObject<EntityType<HamsterEntity>> HAMSTER =
            REGISTRY.builder(HamsterEntity::new, MobCategory.CREATURE)
                    .attributes(HamsterEntity::registerAttributes)
                    .spawns(15, 2, 4, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(0.3F, 0.3F).clientTrackingRange(10))
                    .build("hamster");

    public static final RegistryObject<EntityType<GuanacoEntity>> GUANACO =
            REGISTRY.builder(GuanacoEntity::new, MobCategory.CREATURE)
                    .attributes(GuanacoEntity::registerAttributes)
                    .spawns(8, 2, 4, ZawaSpawnCategory.DRY_SAVANNA, ZawaSpawnCategory.DRY_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(1.5F, 1.8F).clientTrackingRange(10))
                    .build("guanaco");

    public static final RegistryObject<EntityType<CaracalEntity>> CARACAL =
            REGISTRY.builder(CaracalEntity::new, MobCategory.CREATURE)
                    .attributes(CaracalEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.85F, 1.0F).clientTrackingRange(10))
                    .build("caracal");

    public static final RegistryObject<EntityType<SlothBearEntity>> SLOTH_BEAR =
            REGISTRY.builder(SlothBearEntity::new, MobCategory.CREATURE)
                    .attributes(SlothBearEntity::registerAttributes)
                    .spawns(5, 1, 1, ZawaSpawnCategory.DRY_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.3F, 1.2F).clientTrackingRange(10))
                    .build("sloth_bear");

    public static final RegistryObject<EntityType<PallasCatEntity>> PALLAS_CAT =
            REGISTRY.builder(PallasCatEntity::new, MobCategory.CREATURE)
                    .attributes(PallasCatEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.TUNDRA_ALPINE)
                    .data(entityBuilder -> entityBuilder.sized(0.7F, 0.5F).clientTrackingRange(10))
                    .build("pallas_cat");

    public static final RegistryObject<EntityType<ManakinEntity>> MANAKIN =
            REGISTRY.builder(ManakinEntity::new, MobCategory.CREATURE)
                    .attributes(ManakinEntity::registerAttributes)
                    .spawns(10, 2, 5, ZawaSpawnCategory.TEMPERATE_FOREST, ZawaSpawnCategory.DRY_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
                    .build("manakin");

    public static final RegistryObject<EntityType<TamarinEntity>> TAMARIN =
            REGISTRY.builder(TamarinEntity::new, MobCategory.CREATURE)
                    .attributes(TamarinEntity::registerAttributes)
                    .spawns(10, 2, 4, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.3F, 0.4F).clientTrackingRange(10))
                    .build("tamarin");

    public static final RegistryObject<EntityType<SquirrelMonkeyEntity>> SQUIRREL_MONKEY =
            REGISTRY.builder(SquirrelMonkeyEntity::new, MobCategory.CREATURE)
                    .attributes(SquirrelMonkeyEntity::registerAttributes)
                    .spawns(10, 4, 5, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.75F, 0.7F).clientTrackingRange(10))
                    .build("squirrel_monkey");

    public static final RegistryObject<EntityType<TetraEntity>> TETRA =
            REGISTRY.builder(TetraEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(TetraEntity::registerAttributes)
                    .spawns(15, 4, 7, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("tetra");

    public static final RegistryObject<EntityType<FlowerhornCichlidEntity>> FLOWERHORN_CICHILID =
            REGISTRY.builder(FlowerhornCichlidEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(FlowerhornCichlidEntity::registerAttributes)
                    .spawns(10, 1, 1, ZawaSpawnCategory.WET_RAINFOREST, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("flowerhorn_cichlid");

    public static final RegistryObject<EntityType<WarthogEntity>> WARTHOG =
            REGISTRY.builder(WarthogEntity::new, MobCategory.CREATURE)
                    .attributes(WarthogEntity::registerAttributes)
                    .spawns(10, 1, 2, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.7F).clientTrackingRange(10))
                    .build("warthog");

    public static final RegistryObject<EntityType<PygmyHippoEntity>> PYGMY_HIPPO =
            REGISTRY.builder(PygmyHippoEntity::new, MobCategory.CREATURE)
                    .attributes(PygmyHippoEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.DEEP_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 0.9F).clientTrackingRange(10))
                    .build("pygmy_hippo");

    public static final RegistryObject<EntityType<HammerkopEntity>> HAMMERKOP =
            REGISTRY.builder(HammerkopEntity::new, MobCategory.CREATURE)
                    .attributes(HammerkopEntity::registerAttributes)
                    .spawns(15, 3, 5, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.45F, 0.45F).clientTrackingRange(8))
                    .build("hammerkop");

    public static final RegistryObject<EntityType<QuetzalEntity>> QUETZAL =
            REGISTRY.builder(QuetzalEntity::new, MobCategory.CREATURE)
                    .attributes(QuetzalEntity::registerAttributes)
                    .spawns(15, 3, 5, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.45F, 0.45F).clientTrackingRange(8))
                    .build("quetzal");

    public static final RegistryObject<EntityType<KillifishEntity>> KILLIFISH =
            REGISTRY.builder(KillifishEntity::new, MobCategory.WATER_AMBIENT)
                    .attributes(KillifishEntity::registerAttributes)
                    .spawns(10, 2, 3, ZawaSpawnCategory.WET_RAINFOREST)
                    .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
                    .build("killifish");

    public static final RegistryObject<EntityType<HoneyBadgerEntity>> HONEY_BADGER =
            REGISTRY.builder(HoneyBadgerEntity::new, MobCategory.CREATURE)
                    .attributes(HoneyBadgerEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.DRY_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.7F).clientTrackingRange(10))
                    .build("honey_badger");

    public static final RegistryObject<EntityType<GaboonViperEntity>> GABOON_VIPER =
            REGISTRY.builder(GaboonViperEntity::new, MobCategory.CREATURE)
                    .attributes(GaboonViperEntity::registerAttributes)
                    .spawns(8, 1, 1, ZawaSpawnCategory.WET_FOREST)
                    .data(entityBuilder -> entityBuilder.sized(1.6F, 0.3F).clientTrackingRange(10))
                    .build("gaboon_viper");

    public static final RegistryObject<EntityType<DikDikEntity>> DIK_DIK =
            REGISTRY.builder(DikDikEntity::new, MobCategory.CREATURE)
                    .attributes(DikDikEntity::registerAttributes)
                    .spawns(10, 1, 2, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
                    .build("dik_dik");

    public static final RegistryObject<EntityType<CapeBuffaloEntity>> CAPE_BUFFALO =
            REGISTRY.builder(CapeBuffaloEntity::new, MobCategory.CREATURE)
                    .attributes(CapeBuffaloEntity::registerAttributes)
                    .spawns(10, 3, 5, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 1.4F).clientTrackingRange(10))
                    .build("cape_buffalo");

    public static final RegistryObject<EntityType<OryxEntity>> ORYX =
            REGISTRY.builder(OryxEntity::new, MobCategory.CREATURE)
                    .attributes(OryxEntity::registerAttributes)
                    .spawns(2, 3, 4, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 1.4F).clientTrackingRange(10))
                    .build("oryx");

    public static final RegistryObject<EntityType<SableAntelopeEntity>> SABLE_ANTELOPE =
            REGISTRY.builder(SableAntelopeEntity::new, MobCategory.CREATURE)
                    .attributes(SableAntelopeEntity::registerAttributes)
                    .spawns(8, 2, 4, ZawaSpawnCategory.WET_SAVANNA)
                    .data(entityBuilder -> entityBuilder.sized(1.4F, 1.4F).clientTrackingRange(10))
                    .build("sable_antelope");

    public static final RegistryObject<EntityType<SouthernCaracaraEntity>> SOUTHERN_CARACARA =
            REGISTRY.builder(SouthernCaracaraEntity::new, MobCategory.CREATURE)
                    .attributes(SouthernCaracaraEntity::registerAttributes)
                    .spawns(8, 1, 2, ZawaSpawnCategory.DRY_RAINFOREST)
                    .data(entityBuilder -> entityBuilder.sized(0.45F, 0.45F).clientTrackingRange(8))
                    .build("southern_caracara");

    public static void registerSpawnPlacements() {
        SpawnPlacements.register(TAKIN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(WESTERN_LOWLAND_BONGO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(LOWLAND_NYALA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(TIBETAN_ANTELOPE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SAIGA_ANTELOPE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SERVAL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(EMU.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(KIWI.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(FENNEC_FOX.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(MOUSE_DEER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(HOOPOE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaFlyingEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(MARGAY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(DISCUS_FISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(OSCAR.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);

        SpawnPlacements.register(CAIMAN.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(HAMSTER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(GUANACO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(CARACAL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(PALLAS_CAT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SLOTH_BEAR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(MANAKIN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaFlyingEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(TAMARIN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(SQUIRREL_MONKEY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(TETRA.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(FLOWERHORN_CICHILID.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);

        SpawnPlacements.register(PYGMY_HIPPO.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaSemiAquaticEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(WARTHOG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(QUETZAL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaFlyingEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(HAMMERKOP.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaFlyingEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(KILLIFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaAmbientFishEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(HONEY_BADGER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(CAPE_BUFFALO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SABLE_ANTELOPE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(DIK_DIK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(GABOON_VIPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(ORYX.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SOUTHERN_CARACARA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRules);
    }

    public static void registerRenderers() {
        EntityRenderers.register(SERVAL.get(), ServalRenderer::new);
        EntityRenderers.register(EMU.get(), EmuRenderer::new);
        EntityRenderers.register(KIWI.get(), KiwiRenderer::new);
        EntityRenderers.register(SAIGA_ANTELOPE.get(), SaigaAntelopeRenderer::new);
        EntityRenderers.register(WESTERN_LOWLAND_BONGO.get(), WesternLowlandBongoRenderer::new);
        EntityRenderers.register(OSCAR.get(), OscarRenderer::new);
        EntityRenderers.register(DISCUS_FISH.get(), DiscusFishRenderer::new);
        EntityRenderers.register(TAKIN.get(), TakinRenderer::new);
        EntityRenderers.register(FENNEC_FOX.get(), FennecFoxRenderer::new);
        EntityRenderers.register(TIBETAN_ANTELOPE.get(), TibetanAntelopeRenderer::new);
        EntityRenderers.register(LOWLAND_NYALA.get(), LowlandNyalaRenderer::new);
        EntityRenderers.register(MOUSE_DEER.get(), MouseDeerRenderer::new);
        EntityRenderers.register(HOOPOE.get(), HoopoeRenderer::new);
        EntityRenderers.register(MARGAY.get(), MargayRenderer::new);
        EntityRenderers.register(CAIMAN.get(), CaimanRenderer::new);
        EntityRenderers.register(HAMSTER.get(), HamsterRenderer::new);
        EntityRenderers.register(GUANACO.get(), GuanacoRenderer::new);
        EntityRenderers.register(CARACAL.get(), CaracalRenderer::new);
        EntityRenderers.register(SLOTH_BEAR.get(), SlothBearRenderer::new);
        EntityRenderers.register(PALLAS_CAT.get(), PallasCatRenderer::new);
        EntityRenderers.register(MANAKIN.get(), ManakinRenderer::new);
        EntityRenderers.register(TAMARIN.get(), TamarinRenderer::new);
        EntityRenderers.register(SQUIRREL_MONKEY.get(), SquirrelMonkeyRenderer::new);
        EntityRenderers.register(TETRA.get(), TetraRenderer::new);
        EntityRenderers.register(FLOWERHORN_CICHILID.get(), FlowerhornCichlidRenderer::new);
        EntityRenderers.register(WARTHOG.get(), WarthogRenderer::new);
        EntityRenderers.register(PYGMY_HIPPO.get(), PygmyHippoRenderer::new);
        EntityRenderers.register(HAMMERKOP.get(), HammerkopRenderer::new);
        EntityRenderers.register(QUETZAL.get(), QuetzalRenderer::new);
        EntityRenderers.register(KILLIFISH.get(), KillifishRenderer::new);
        EntityRenderers.register(HONEY_BADGER.get(), HoneyBadgerRenderer::new);
        EntityRenderers.register(GABOON_VIPER.get(), GaboonViperRenderer::new);
        EntityRenderers.register(DIK_DIK.get(), DikDikRenderer::new);
        EntityRenderers.register(CAPE_BUFFALO.get(), CapeBuffaloRenderer::new);
        EntityRenderers.register(ORYX.get(), OryxRenderer::new);
        EntityRenderers.register(SABLE_ANTELOPE.get(), SableAntelopeRenderer::new);
        EntityRenderers.register(SOUTHERN_CARACARA.get(), SouthernCaracaraRenderer::new);
    }
}



