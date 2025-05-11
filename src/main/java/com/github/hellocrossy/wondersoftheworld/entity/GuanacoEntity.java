package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.sounds.WOTWSounds;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NonTameRandomTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class GuanacoEntity extends ZawaLandEntity {
    public GuanacoEntity(EntityType<? extends ZawaLandEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 28.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return WOTWEntities.GUANACO.get().create(world);
    }

    @Override
    protected void customServerAiStep() {
        if (getMoveControl().hasWanted()) setSprinting(getMoveControl().getSpeedModifier() >= 1.33D);
        super.customServerAiStep();
    }

    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.85F;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 2.0, 1.33, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(3, new NonTameRandomTargetGoal<>(this, Player.class, true, (entity) -> this.distanceToSqr(entity) <= 10.0));
    }

    @Override
    public float getMaleRatio() {
        return 0.66F;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return WOTWSounds.GUANACO_AMBIENT.get();
    }
}
