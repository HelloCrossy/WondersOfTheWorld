package com.github.hellocrossy.wondersoftheworld.entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class SaigaAntelopeEntity extends ZawaLandEntity {
    public SaigaAntelopeEntity(EntityType<? extends ZawaLandEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 24.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
    }

    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.85F;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return WOTWEntities.SAIGA_ANTELOPE.get().create(world);
    }

    @Override
    public float getMaleRatio() {
        return 0.17F;
    }
}

