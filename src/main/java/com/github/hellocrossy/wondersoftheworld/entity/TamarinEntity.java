package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.sounds.WOTWSounds;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WallClimberNavigation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import org.zawamod.zawa.world.entity.ClimbingEntity;
import org.zawamod.zawa.world.entity.SittingEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class TamarinEntity extends ZawaLandEntity implements SpeciesVariantsEntity, ClimbingEntity {
    public static final EntityDataAccessor<Boolean> CLIMBING;

    public TamarinEntity(EntityType<? extends ZawaLandEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.30F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(7, new SittingEntity.SitGoal(this));
    }

    @Override
    protected void customServerAiStep() {
        if (getMoveControl().hasWanted()) setSprinting(getMoveControl().getSpeedModifier() >= 1.33D);
        super.customServerAiStep();
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, false);
    }

    protected PathNavigation createNavigation(Level world) {
        return new WallClimberNavigation(this, world);
    }

    public void tick() {
        super.tick();
        if (!this.level().isClientSide && this.horizontalCollision) {
            this.setClimbing(this.isClimbableBlock(this.level(), this.blockPosition().relative(this.getDirection())));
        }

    }

    public boolean onClimbable() {
        return this.isClimbing();
    }

    public boolean causeFallDamage(float distance, float damageMultiplier) {
        return false;
    }

    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.85F;
    }

    @Override
    public int getVariantByBiome(LevelAccessor iWorld) {
        return random.nextInt(getWildVariants());
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return WOTWEntities.TAMARIN.get().create(world);
    }

    public boolean isClimbing() {
        return this.entityData.get(CLIMBING);
    }

    public void setClimbing(boolean climbing) {
        this.entityData.set(CLIMBING, climbing);
    }

    static {
        CLIMBING = SynchedEntityData.defineId(TamarinEntity.class, EntityDataSerializers.BOOLEAN);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return WOTWSounds.TAMARIN_AMBIENT.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return WOTWSounds.TAMARIN_HURT.get();
    }
}


