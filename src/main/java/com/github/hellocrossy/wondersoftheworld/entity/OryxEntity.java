package com.github.hellocrossy.wondersoftheworld.entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.level.LevelAccessor;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class OryxEntity extends ZawaLandEntity implements SpeciesVariantsEntity {
    public OryxEntity(EntityType<? extends ZawaLandEntity> type, Level world) {
        super(type, world);
    }

    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 32.0).add(Attributes.ATTACK_DAMAGE, 5.0);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return WOTWEntities.ORYX.get().create(world);
    }
    @Override
    public int getVariantByBiome(LevelAccessor levelAccessor) {
        return random.nextInt(getWildVariants());
    }

    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.85F;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
    }

    @Override
    public float getMaleRatio() {
        return 0.17F;
    }
}