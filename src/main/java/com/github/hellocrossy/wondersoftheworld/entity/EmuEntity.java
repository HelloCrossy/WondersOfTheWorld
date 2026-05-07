package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.item.WOTWItems;
import com.github.hellocrossy.wondersoftheworld.sounds.WOTWSounds;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.item.ItemStack;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;
import java.util.logging.Level;

public class EmuEntity extends ZawaLandEntity implements OviparousEntity {
    public EmuEntity(EntityType<? extends ZawaLandEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 28.0).add(Attributes.ATTACK_DAMAGE, 5.0);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return WOTWEntities.EMU.get().create(world);
    }
    @Override
    protected void customServerAiStep() {
        if (getMoveControl().hasWanted()) setSprinting(getMoveControl().getSpeedModifier() >= 1.33D);
        super.customServerAiStep();
    }

    @Override
    public ItemStack getBreedEggItem() {
        return WOTWItems.EMU_EGG.get().getDefaultInstance();
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
    public boolean doHurtTarget(Entity entity) {
        boolean didHurtTarget = super.doHurtTarget(entity);
        if (didHurtTarget) playSound(WOTWSounds.EMU_ATTACK.get(), 1.0F, 1.0F);
        return didHurtTarget;
    }
    @Override
    protected SoundEvent getAmbientSound() {
        return WOTWSounds.EMU_AMBIENT.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return WOTWSounds.EMU_HURT.get();
    }
}
