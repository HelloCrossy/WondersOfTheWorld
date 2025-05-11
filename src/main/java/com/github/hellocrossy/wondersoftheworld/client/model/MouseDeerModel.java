package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.MouseDeerEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class MouseDeerModel extends ZawaBaseModel<MouseDeerEntity> {
    public ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends MouseDeerModel {
        public ModelRenderer Hips;
        public ModelRenderer Chest;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer LegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer Neck1;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Head;
        public ModelRenderer Neck2;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Mouth;
        public ModelRenderer Nose;
        public ModelRenderer ToothLeft;
        public ModelRenderer ToothRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer LowerArmRight;


        public Adult() {
            texWidth = 64;
            texHeight = 32;
            this.LegLeft = new ModelRenderer(this, 28, 9);
            this.LegLeft.setPos(0.2F, 1.0F, -3.7F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 1.0946705281561322F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 35, 6);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(-0.3F, 2.7F, 1.0F);
            this.ForearmRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.46914448828868976F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 34, 0);
            this.ArmLeft.setPos(1.5F, -0.1F, 0.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.03071779466865263F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 28, 9);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.2F, 1.0F, -3.7F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 1.0946705281561322F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 34, 28);
            this.Mouth.setPos(0.0F, 0.6F, 0.1F);
            this.Mouth.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.012566371113701878F, 0.0F, 0.0F);
            this.ToothLeft = new ModelRenderer(this, 37, 24);
            this.ToothLeft.setPos(-0.2F, -0.1F, -1.4F);
            this.ToothLeft.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToothLeft, 0.1563815016444822F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 0, 0);
            this.Tail.setPos(0.0F, 0.8F, 2.1F);
            this.Tail.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.5497787143782138F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 21, 0);
            this.ThighLeft.setPos(1.6F, 2.8F, 2.9F);
            this.ThighLeft.addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.6429792990978721F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 21, 8);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.1F, 2.5F, 0.3F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -1.3267992387765453F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 36, 12);
            this.LowerArmLeft.setPos(0.0F, 2.8F, -1.2F);
            this.LowerArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 19, 27);
            this.Nose.setPos(0.0F, -1.0F, 0.4F);
            this.Nose.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.5082398928281348F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 20);
            this.Chest.setPos(0.0F, 0.3F, -3.0F);
            this.Chest.addBox(-1.5F, -2.2F, -1.2F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.41887902047863906F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 21, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.6F, 2.8F, 2.9F);
            this.ThighRight.addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.6352998743575469F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 23, 19);
            this.Head.setPos(0.0F, -0.1F, -4.4F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.0555751236166873F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 21, 8);
            this.LowerLegLeft.setPos(-0.1F, 2.5F, 0.3F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -1.3267992387765453F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 35, 6);
            this.ForearmLeft.setPos(0.3F, 2.7F, 1.0F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.46914448828868976F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 12);
            this.Hips.setPos(0.0F, -2.4F, 2.9F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.47944193353861736F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 27, 26);
            this.Snout.setPos(0.0F, 0.3F, -1.4F);
            this.Snout.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.07679448875222618F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 36, 12);
            this.LowerArmRight.mirror = true;
            this.LowerArmRight.setPos(0.0F, 2.8F, -1.2F);
            this.LowerArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.ToothRight = new ModelRenderer(this, 37, 24);
            this.ToothRight.mirror = true;
            this.ToothRight.setPos(-0.8F, -0.1F, -1.4F);
            this.ToothRight.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToothRight, 0.1563815016444822F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 37, 18);
            this.EarLeft.setPos(1.0F, -0.8F, 0.9F);
            this.EarLeft.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -1.0164797856562695F, -0.7031931716074818F, 1.5247196451948906F);
            this.Neck2 = new ModelRenderer(this, 16, 22);
            this.Neck2.setPos(0.0F, 0.5F, -0.4F);
            this.Neck2.addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, 1.5313518484155695F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 37, 18);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.0F, -0.8F, 0.9F);
            this.EarRight.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -1.0164797856562695F, 0.7031931716074818F, -1.5247196451948906F);
            this.ArmRight = new ModelRenderer(this, 34, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.5F, -0.1F, 0.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.03071779466865263F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 17.0F, -0.5F);
            this.Body.addBox(-2.0F, -2.5F, -3.0F, 4.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.07853981633974483F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 13, 14);
            this.Neck1.setPos(0.0F, 0.2F, -0.2F);
            this.Neck1.addBox(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -1.4510667294554411F, 0.0F, 0.0F);
            this.ThighLeft.addChild(this.LegLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Snout.addChild(this.Mouth);
            this.Snout.addChild(this.ToothLeft);
            this.Hips.addChild(this.Tail);
            this.Hips.addChild(this.ThighLeft);
            this.LegRight.addChild(this.LowerLegRight);
            this.ForearmLeft.addChild(this.LowerArmLeft);
            this.Snout.addChild(this.Nose);
            this.Body.addChild(this.Chest);
            this.Hips.addChild(this.ThighRight);
            this.Neck1.addChild(this.Head);
            this.LegLeft.addChild(this.LowerLegLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.Snout);
            this.ForearmRight.addChild(this.LowerArmRight);
            this.Snout.addChild(this.ToothRight);
            this.Head.addChild(this.EarLeft);
            this.Neck1.addChild(this.Neck2);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmRight);
            this.Chest.addChild(this.Neck1);
            this.saveBase();

        }

        @Override
        public void setupAnim(MouseDeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            //    this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * - 1.451F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            //    this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.055F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.451F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.055F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.6f;
                float degree = 0.6f;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.6F) * 0.5F + 1.055F;
                this.Neck1.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F - 1.451F;
                this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.078F;
                this.Body.y = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 17.0F;

                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.030F;
                this.ForearmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.469F;
                this.LowerArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.030F;
                this.ForearmRight.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.469F;
                this.LowerArmRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.642F;
                this.ThighLeft.z = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.094F;
                this.LowerLegLeft.xRot = MathHelper.cos(7.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 1.326F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.642F;
                this.ThighRight.z = MathHelper.cos(5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.094F;
                this.LowerLegRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 1.326F;


            } else {
                float speed = 0.45f;
                float degree = 0.45f;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.055F;
                this.Neck1.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 1.451F;
                this.Body.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.078F;
                this.Body.y = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 17.0F;

                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.030F;
                this.ForearmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.469F;
                this.LowerArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.030F;
                this.ForearmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.469F;
                this.LowerArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.642F;
                this.ThighLeft.z = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.094F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 1.326F;
                this.ThighRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.642F;
                this.ThighRight.z = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 2.9F;
                this.LegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.094F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 1.326F;
            }
        }
    }

    public static class Child extends MouseDeerModel {
        public ModelRenderer Hips;
        public ModelRenderer Chest;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer LegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer Neck1;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Head;
        public ModelRenderer Neck2;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Mouth;
        public ModelRenderer Nose;
        public ModelRenderer ToothLeft;
        public ModelRenderer ToothRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer LowerArmRight;


        public Child() {
            texWidth = 64;
            texHeight = 32;
            this.LegLeft = new ModelRenderer(this, 28, 9);
            this.LegLeft.setPos(0.2F, 1.0F, -3.7F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 1.0946705281561322F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 35, 6);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(-0.3F, 2.7F, 1.0F);
            this.ForearmRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.46914448828868976F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 34, 0);
            this.ArmLeft.setPos(1.5F, -0.1F, 0.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.03071779466865263F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 28, 9);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.2F, 1.0F, -3.7F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 1.0946705281561322F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 34, 28);
            this.Mouth.setPos(0.0F, 0.6F, 0.1F);
            this.Mouth.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.012566371113701878F, 0.0F, 0.0F);
            this.ToothLeft = new ModelRenderer(this, 37, 24);
            this.ToothLeft.setPos(-0.2F, -0.1F, -1.4F);
            this.ToothLeft.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToothLeft, 0.1563815016444822F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 0, 0);
            this.Tail.setPos(0.0F, 0.8F, 2.1F);
            this.Tail.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.5497787143782138F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 21, 0);
            this.ThighLeft.setPos(1.6F, 2.8F, 2.9F);
            this.ThighLeft.addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.6429792990978721F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 21, 8);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.1F, 2.5F, 0.3F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -1.3267992387765453F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 36, 12);
            this.LowerArmLeft.setPos(0.0F, 2.8F, -1.2F);
            this.LowerArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 19, 27);
            this.Nose.setPos(0.0F, -1.0F, 0.4F);
            this.Nose.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.5082398928281348F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 20);
            this.Chest.setPos(0.0F, 0.3F, -3.0F);
            this.Chest.addBox(-1.5F, -2.2F, -1.2F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.41887902047863906F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 21, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.6F, 2.8F, 2.9F);
            this.ThighRight.addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.6352998743575469F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 23, 19);
            this.Head.setPos(0.0F, -0.1F, -4.4F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.0555751236166873F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 21, 8);
            this.LowerLegLeft.setPos(-0.1F, 2.5F, 0.3F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -1.3267992387765453F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 35, 6);
            this.ForearmLeft.setPos(0.3F, 2.7F, 1.0F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.46914448828868976F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 12);
            this.Hips.setPos(0.0F, -2.4F, 2.9F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.47944193353861736F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 27, 26);
            this.Snout.setPos(0.0F, 0.3F, -1.4F);
            this.Snout.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.07679448875222618F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 36, 12);
            this.LowerArmRight.mirror = true;
            this.LowerArmRight.setPos(0.0F, 2.8F, -1.2F);
            this.LowerArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, 0.0F, 0.0F);
            this.ToothRight = new ModelRenderer(this, 37, 24);
            this.ToothRight.mirror = true;
            this.ToothRight.setPos(-0.8F, -0.1F, -1.4F);
            this.ToothRight.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToothRight, 0.1563815016444822F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 37, 18);
            this.EarLeft.setPos(1.0F, -0.8F, 0.9F);
            this.EarLeft.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -1.0164797856562695F, -0.7031931716074818F, 1.5247196451948906F);
            this.Neck2 = new ModelRenderer(this, 16, 22);
            this.Neck2.setPos(0.0F, 0.5F, -0.4F);
            this.Neck2.addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, 1.5313518484155695F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 37, 18);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.0F, -0.8F, 0.9F);
            this.EarRight.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -1.0164797856562695F, 0.7031931716074818F, -1.5247196451948906F);
            this.ArmRight = new ModelRenderer(this, 34, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.5F, -0.1F, 0.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.03071779466865263F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 17.0F, -0.5F);
            this.Body.addBox(-2.0F, -2.5F, -3.0F, 4.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.07853981633974483F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 13, 14);
            this.Neck1.setPos(0.0F, 0.2F, -0.2F);
            this.Neck1.addBox(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -1.4510667294554411F, 0.0F, 0.0F);
            this.ThighLeft.addChild(this.LegLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Snout.addChild(this.Mouth);
            this.Snout.addChild(this.ToothLeft);
            this.Hips.addChild(this.Tail);
            this.Hips.addChild(this.ThighLeft);
            this.LegRight.addChild(this.LowerLegRight);
            this.ForearmLeft.addChild(this.LowerArmLeft);
            this.Snout.addChild(this.Nose);
            this.Body.addChild(this.Chest);
            this.Hips.addChild(this.ThighRight);
            this.Neck1.addChild(this.Head);
            this.LegLeft.addChild(this.LowerLegLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.Snout);
            this.ForearmRight.addChild(this.LowerArmRight);
            this.Snout.addChild(this.ToothRight);
            this.Head.addChild(this.EarLeft);
            this.Neck1.addChild(this.Neck2);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmRight);
            this.Chest.addChild(this.Neck1);
            this.saveBase();

        }

        @Override
        public void setupAnim(MouseDeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            //    this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * - 1.451F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            //    this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.055F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.451F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.055F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.6F) * 0.5F + 1.055F;
                this.Neck1.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F - 1.451F;
                this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.078F;
                this.Body.y = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 17.0F;

                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.030F;
                this.ForearmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.469F;
                this.LowerArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.030F;
                this.ForearmRight.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.469F;
                this.LowerArmRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.642F;
                this.ThighLeft.z = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.094F;
                this.LowerLegLeft.xRot = MathHelper.cos(7.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 1.326F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.642F;
                this.ThighRight.z = MathHelper.cos(5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.094F;
                this.LowerLegRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 1.326F;


            } else {
                float speed = 0.9f;
                float degree = 0.6f;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.055F;
                this.Neck1.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 1.451F;
                this.Body.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.078F;
                this.Body.y = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 17.0F;

                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.030F;
                this.ForearmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.469F;
                this.LowerArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.030F;
                this.ForearmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.469F;
                this.LowerArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.642F;
                this.ThighLeft.z = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.094F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 1.326F;
                this.ThighRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.642F;
                this.ThighRight.z = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 2.9F;
                this.LegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.094F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 1.326F;
            }
        }
    }
}
