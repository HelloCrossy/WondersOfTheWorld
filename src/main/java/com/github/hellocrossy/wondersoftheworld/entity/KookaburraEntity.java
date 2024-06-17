package com.github.hellocrossy.wondersoftheworld.entity;

import com.github.hellocrossy.wondersoftheworld.item.WOTWItems;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.NonTamedTargetGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

import javax.annotation.Nullable;

public class KookaburraEntity extends ZawaFlyingEntity implements OviparousEntity, SpeciesVariantsEntity {
    public KookaburraEntity(EntityType<? extends ZawaFlyingEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.FLYING_SPEED, 0.60F).add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 3.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return WOTWEntities.KOOKABURRA.get().create(world);
    }
    @Override
    public ItemStack getBreedEggItem() {
        return WOTWItems.KOOKABURRA_EGG.get().getDefaultInstance();
    }
    @Override
    public int getVariantByBiome(IWorld iWorld) {
        return random.nextInt(getWildVariants());
    }
    @Override
    protected void registerGoals() {
         super.registerGoals();
         this.goalSelector.addGoal(1, new PanicGoal(this, 1.33D));
    }
}
