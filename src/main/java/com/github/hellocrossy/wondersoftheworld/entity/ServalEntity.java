package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.sounds.WOTWSounds;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.NonTamedTargetGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class ServalEntity extends ZawaLandEntity {
    public ServalEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.30F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 2.0);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return WOTWEntities.SERVAL.get().create(world);
    }

    @Override
    protected void registerGoals() {
        //super.registerGoals();
        //this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 2.0D, 2.5D, true));
        //this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
        //this.targetSelector.addGoal(3, new NonTamedTargetGoal<>(this, PlayerEntity.class, true, (entity) -> this.distanceToSqr(entity) <= 10.0D));
    }
    @Override
    public float getMaleRatio() {
        return 0.33F;
    }
    @Override
    protected SoundEvent getAmbientSound() {
        return WOTWSounds.SERVAL_AMBIENT.get();
    }
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return WOTWSounds.SERVAL_HURT.get();
    }
        @Override
        public boolean doHurtTarget(Entity entity) {
            boolean didHurtTarget = super.doHurtTarget(entity);
            if (didHurtTarget) playSound(WOTWSounds.SERVAL_ATTACK.get(), 1.0F, 1.0F);
            return didHurtTarget;
        }

    }





