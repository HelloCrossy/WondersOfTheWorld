package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.sounds.WOTWSounds;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import org.zawamod.zawa.world.entity.ClimbingEntity;
import org.zawamod.zawa.world.entity.SittingEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class SquirrelMonkeyEntity extends ZawaLandEntity implements SpeciesVariantsEntity, ClimbingEntity {
    public static final DataParameter<Boolean> CLIMBING;

    public SquirrelMonkeyEntity(EntityType<? extends ZawaLandEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.30F).add(Attributes.MAX_HEALTH, 10.0).add(Attributes.ATTACK_DAMAGE, 0.5);
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

    protected PathNavigator createNavigation(Level world) {
        return new ClimberPathNavigator(this, world);
    }

    public void tick() {
        super.tick();
        if (!this.level.isClientSide && this.horizontalCollision) {
            this.setClimbing(this.isClimbableBlock(this.level, this.blockPosition().relative(this.getDirection())));
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
    public int getVariantByBiome(ILevel iLevel) {
        return random.nextInt(getWildVariants());
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return WOTWEntities.SQUIRREL_MONKEY.get().create(world);
    }

    public boolean isClimbing() {
        return this.entityData.get(CLIMBING);
    }

    public void setClimbing(boolean climbing) {
        this.entityData.set(CLIMBING, climbing);
    }

    static {
        CLIMBING = EntityDataManager.defineId(SquirrelMonkeyEntity.class, DataSerializers.BOOLEAN);
    }
    @Override
    protected SoundEvent getAmbientSound() {
        return WOTWSounds.SQUIRREL_MONKEY_AMBIENT.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return WOTWSounds.SQUIRREL_MONKEY_HURT.get();
    }
}



