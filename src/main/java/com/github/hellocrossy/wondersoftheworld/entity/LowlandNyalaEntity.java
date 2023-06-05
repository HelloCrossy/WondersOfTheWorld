package com.github.hellocrossy.wondersoftheworld.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class LowlandNyalaEntity extends ZawaLandEntity {
    public LowlandNyalaEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 21.0).add(Attributes.ATTACK_DAMAGE, 3.0);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return WOTWEntities.LOWLAND_NYALA.get().create(world);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 2.0D, 2.5D, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }
}
