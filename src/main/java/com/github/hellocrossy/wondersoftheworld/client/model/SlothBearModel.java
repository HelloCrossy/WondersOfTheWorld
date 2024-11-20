package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SlothBearEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SlothBearModel extends ZawaBaseModel<SlothBearEntity> {
    protected ModelRenderer Chest;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends SlothBearModel {

        public ModelRenderer ArmRight;
        public ModelRenderer Neck;
        public ModelRenderer Body;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer NeckBase;
        public ModelRenderer Head;
        public ModelRenderer CheekRight;
        public ModelRenderer Mouth;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer CheekLeft;
        public ModelRenderer TopSnout;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;


        public Adult() {
            texWidth = 64;
            texHeight = 64;
            this.FootRight = new ModelRenderer(this, 32, 28);
            this.FootRight.setPos(0.1F, 5.0F, 0.5F);
            this.FootRight.addBox(-1.5F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.18203784630933073F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 26);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.6F, 4.5F, 1.9F);
            this.ThighLeft.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.046076694083573545F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 26);
            this.ThighRight.setPos(-2.6F, 4.5F, 1.9F);
            this.ThighRight.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.046076694083573545F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 50, 28);
            this.ForearmLeft.mirror = true;
            this.ForearmLeft.setPos(0.0F, 3.0F, 2.5F);
            this.ForearmLeft.addBox(-1.5F, -0.5F, -3.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.27296950100402556F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 50, 38);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 5.5F, -1.0F);
            this.HandLeft.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 50, 28);
            this.ForearmRight.setPos(0.0F, 3.0F, 2.5F);
            this.ForearmRight.addBox(-1.5F, -0.5F, -3.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.27296950100402556F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 49);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.8F, -0.9F, 0.8F);
            this.EarLeft.addBox(-0.5F, -2.5F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3251548249991576F, -0.0712094321497881F, -0.27593656206399647F);
            this.LegLeft = new ModelRenderer(this, 18, 26);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 5.0F, -2.0F);
            this.LegLeft.addBox(-1.5F, -1.0F, -0.5F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.36407569261866146F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 32, 28);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 5.0F, 0.5F);
            this.FootLeft.addBox(-1.5F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.18203784630933073F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 15, 45);
            this.TopSnout.setPos(0.0F, -2.0F, -0.28F);
            this.TopSnout.addBox(-1.0F, -0.6F, -2.3F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.20141099501435536F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 46, 18);
            this.ArmRight.setPos(-2.6F, 1.5F, -1.0F);
            this.ArmRight.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.09093165469469484F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 23, 56);
            this.CheekLeft.mirror = true;
            this.CheekLeft.setPos(2.0F, 1.2F, 0.5F);
            this.CheekLeft.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, 0.04555309164612875F, -0.2275909337942703F, 0.27314402127920984F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 14.0F, -5.5F);
            this.Chest.addBox(-3.5F, -3.8F, -2.5F, 7.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.27296950100402556F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 23, 56);
            this.CheekRight.setPos(-2.0F, 1.2F, 0.5F);
            this.CheekRight.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, 0.04555309164612875F, 0.2275909337942703F, -0.27314402127920984F);
            this.LegRight = new ModelRenderer(this, 18, 26);
            this.LegRight.setPos(0.0F, 5.0F, -2.0F);
            this.LegRight.addBox(-1.5F, -1.0F, -0.5F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.36407569261866146F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 30, 47);
            this.NeckBase.setPos(0.0F, 4.2F, 2.0F);
            this.NeckBase.addBox(-1.5F, -0.5F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.2925171866289913F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 50, 0);
            this.Tail1.setPos(0.0F, 0.0F, 4.0F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.7873180362272864F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 24, 0);
            this.Body.setPos(0.0F, -3.5F, 3.0F);
            this.Body.addBox(-4.0F, -0.5F, -0.5F, 8.0F, 8.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.22794000763415243F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 13);
            this.Hips.setPos(0.0F, 0.2F, 9.5F);
            this.Hips.addBox(-3.5F, -0.5F, -0.5F, 7.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.27296950100402556F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 18);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(2.6F, 1.5F, -1.0F);
            this.ArmLeft.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.09093165469469484F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 15, 50);
            this.Snout.setPos(0.0F, 2.2F, -2.0F);
            this.Snout.addBox(-1.5F, -2.0F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.11676252795710604F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 50, 38);
            this.HandRight.setPos(0.1F, 5.5F, -1.0F);
            this.HandRight.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 16, 55);
            this.Mouth.setPos(0.0F, 2.3F, -1.4F);
            this.Mouth.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.0911061832922575F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 49);
            this.EarRight.setPos(-1.8F, -0.9F, 0.8F);
            this.EarRight.addBox(-2.5F, -2.5F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3251548249991576F, 0.07086036663228437F, 0.2747148202691658F);
            this.Head = new ModelRenderer(this, 0, 55);
            this.Head.setPos(0.0F, 1.8F, -3.0F);
            this.Head.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.1637118858344389F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 31, 38);
            this.Neck.setPos(0.0F, -2.8F, -0.9F);
            this.Neck.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.2864085275891084F, 0.0F, 0.0F);
            this.LegRight.addChild(this.FootRight);
            this.Hips.addChild(this.ThighLeft);
            this.Hips.addChild(this.ThighRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Head.addChild(this.EarLeft);
            this.ThighLeft.addChild(this.LegLeft);
            this.LegLeft.addChild(this.FootLeft);
            this.Snout.addChild(this.TopSnout);
            this.Chest.addChild(this.ArmRight);
            this.Head.addChild(this.CheekLeft);
            this.Head.addChild(this.CheekRight);
            this.ThighRight.addChild(this.LegRight);
            this.Neck.addChild(this.NeckBase);
            this.Hips.addChild(this.Tail1);
            this.Chest.addChild(this.Body);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmLeft);
            this.Head.addChild(this.Snout);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.Mouth);
            this.Head.addChild(this.EarRight);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Neck);
            this.saveBase();

        }

        @Override
        public void setupAnim(SlothBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * 0.1F) * 0.2F * limbSwingAmount - 0.286F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * 0.1F) * -0.4F * limbSwingAmount + 0.164F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.7f;

                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount - 0.227F;
                this.Chest.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount + 0.273F;
                this.Hips.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.273F;
                this.Head.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.164F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.046F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.364F;
                this.FootLeft.xRot = MathHelper.cos(-4.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.182F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.046F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.364F;
                this.FootRight.xRot = MathHelper.cos(-4.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.182F;

                this.ForearmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.273F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.091F;
                this.HandLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.091F;
                this.ForearmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.273F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.091F;
                this.HandRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.091F;

            }
        }
    }

    public static class Child extends SlothBearModel {
        public ModelRenderer Hips;
        public ModelRenderer Body;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft_1;
        public ModelRenderer EarLeft_2;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;

        public Child() {
            texWidth = 48;
            texHeight = 32;
            this.ArmBaseRight = new ModelRenderer(this, 32, 17);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.4F, -0.2F, -1.2F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.27000000980955996F, -0.03490658503988659F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 3);
            this.Mouth.setPos(0.0F, 0.5F, 0.1F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.10471975511965977F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 9, 21);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.5F, -0.6F, 0.3F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.06999999915262065F, 0.0F, 0.0F);
            this.EarLeft_2 = new ModelRenderer(this, 39, 15);
            this.EarLeft_2.setPos(-1.6F, -1.0F, 0.0F);
            this.EarLeft_2.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft_2, 0.0F, -0.19547687289441354F, -0.35185837453889574F);
            this.Hips = new ModelRenderer(this, 30, 0);
            this.Hips.setPos(0.0F, 0.3F, 7.0F);
            this.Hips.addBox(-2.5F, -3.0F, 0.0F, 5.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.17000000864227952F, -0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 19, 22);
            this.ArmLeft.setPos(-0.02F, 3.5F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.20999998913548354F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 20, 3);
            this.Snout.setPos(0.0F, 0.2F, -1.2F);
            this.Snout.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2792526803190927F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 20, 0);
            this.Nose.setPos(0.0F, -1.6F, -0.3F);
            this.Nose.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.2792526803190927F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 0);
            this.EarLeft.setPos(1.3F, -3.1F, -0.4F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.21083577230933448F, -0.2617993877991494F, 0.8726646259971648F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 17.5F, -3.5F);
            this.Chest.addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.02999999993406522F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 19, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.02F, 3.5F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.20999998913548354F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 27);
            this.UpperLegLeft.setPos(-0.02F, 4.0F, -1.3F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.49000000239072294F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 27);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.02F, 4.0F, -1.3F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.49000000239072294F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 24);
            this.Tail1.setPos(0.0F, -2.0F, 2.0F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.2217304763960306F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 9, 21);
            this.ThighLeft.setPos(2.5F, -0.6F, 0.3F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.06999999915262065F, 0.0F, 0.0F);
            this.EarLeft_1 = new ModelRenderer(this, 39, 15);
            this.EarLeft_1.setPos(1.6F, -1.0F, 0.0F);
            this.EarLeft_1.addBox(0.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft_1, 0.0F, 0.19547687289441354F, 0.35185837453889574F);
            this.ArmBaseLeft = new ModelRenderer(this, 32, 17);
            this.ArmBaseLeft.setPos(2.4F, -0.2F, -1.2F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.27000000980955996F, 0.03490658503988659F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 35, 26);
            this.Neck2.setPos(0.0F, 1.8F, 0.0F);
            this.Neck2.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.20943951023931953F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.4F, -3.1F, -0.4F);
            this.EarRight.addBox(-2.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.21083577230933448F, 0.2617993877991494F, -0.8726646259971648F);
            this.FootLeft = new ModelRenderer(this, 8, 28);
            this.FootLeft.setPos(0.02F, 2.8F, 0.7F);
            this.FootLeft.addBox(-1.0F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.20999998913548354F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 8, 28);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.02F, 2.8F, 0.7F);
            this.FootRight.addBox(-1.0F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.20999998913548354F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 14);
            this.Neck.setPos(0.0F, -2.1F, -2.5F);
            this.Neck.addBox(-2.0F, -0.5F, -2.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.01468673524083903F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 30, 7);
            this.Body.setPos(0.0F, 0.2F, 1.2F);
            this.Body.addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.1399999983052413F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 29, 25);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.02F, 3.0F, -1.3F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.06999999915262065F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 16, 14);
            this.Head.setPos(0.0F, 2.0F, -2.3F);
            this.Head.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.20184310954597753F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 29, 25);
            this.HandLeft.setPos(0.02F, 3.0F, -1.3F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.06999999915262065F, 0.0F, 0.0F);
            this.Body.addChild(this.ArmBaseRight);
            this.Snout.addChild(this.Mouth);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.EarLeft_2);
            this.Chest.addChild(this.Hips);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.Snout);
            this.Snout.addChild(this.Nose);
            this.Head.addChild(this.EarLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Hips.addChild(this.Tail1);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.EarLeft_1);
            this.Body.addChild(this.ArmBaseLeft);
            this.Neck.addChild(this.Neck2);
            this.Head.addChild(this.EarRight);
            this.UpperLegLeft.addChild(this.FootLeft);
            this.UpperLegRight.addChild(this.FootRight);
            this.Body.addChild(this.Neck);
            this.Chest.addChild(this.Body);
            this.ArmRight.addChild(this.HandRight);
            this.Neck.addChild(this.Head);
            this.ArmLeft.addChild(this.HandLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(SlothBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            this.Neck.xRot = MathHelper.cos(limbSwing * 0.1F) * 0.1F * limbSwingAmount -0.015F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * 0.1F) * -0.2F * limbSwingAmount + 0.202F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 0.8F;
            if (this.isSwimming) {
                limbSwing = (float)entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 2.0F;
            }

            this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.27F;
            this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.21F;
            this.HandLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.07F;
            this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.27F;
            this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.21F;
            this.HandRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.07F;

            this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.07F;
            this.UpperLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.49F;
            this.FootLeft.xRot = MathHelper.cos(-4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.21F;
            this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.07F;
            this.UpperLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.49F;
            this.FootRight.xRot = MathHelper.cos(-4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.21F;

            this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount - 0.139F;
            this.Chest.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount + 0.03F;
            this.Hips.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.17F;
            this.Body.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.05F * limbSwingAmount + 0.2F;
            this.Head.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.202F;
            this.Neck.xRot = this.isSwimming ? -0.2F : -0.015F;

            }
        }
    }
