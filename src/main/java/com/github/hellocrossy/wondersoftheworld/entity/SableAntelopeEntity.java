package com.github.hellocrossy.wondersoftheworld.entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class SableAntelopeEntity extends ZawaLandEntity {
    public SableAntelopeEntity(EntityType<? extends ZawaLandEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 32.0).add(Attributes.ATTACK_DAMAGE, 5.0);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return WOTWEntities.SABLE_ANTELOPE.get().create(world);
    }

    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.85F;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 4.0, 1.33, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }

    @Override
    public float getMaleRatio() {
        return 0.17F;
    }
}
