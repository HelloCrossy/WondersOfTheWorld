package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.ServalEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ServalModel extends ZawaBaseModel<ServalEntity> {
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

    public static class Adult extends ServalModel {
        public ModelRenderer BackPoint;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer Body;
        public ModelRenderer Hips;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;

        public Adult() {
            texWidth = 48;
            texHeight = 48;
            this.Tail1 = new ModelRenderer(this, 0, 27);
            this.Tail1.mirror = true;
            this.Tail1.setPos(0.0F, 0.6F, 4.0F);
            this.Tail1.addBox(-0.99F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.41887902047863906F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 32, 0);
            this.ArmBaseLeft.setPos(2.1F, -1.8F, 1.2F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.24434609527920614F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 18, 10);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.1F, -1.0F, -0.9F);
            this.EarRight.addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.1563815016444822F, 0.3490658503988659F, -0.24434609527920614F);
            this.ForearmLeft = new ModelRenderer(this, 40, 9);
            this.ForearmLeft.mirror = true;
            this.ForearmLeft.setPos(-0.02F, 3.0F, -1.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 28, 42);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.1F, 4.3F, 0.3F);
            this.HandLeft.addBox(-1.0F, -0.5F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.017453292519943295F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 8, 27);
            this.Tail2.mirror = true;
            this.Tail2.setPos(0.0F, 4.0F, -1.0F);
            this.Tail2.addBox(-1.02F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.13962634015954636F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, -0.2F, -4.5F);
            this.Head.addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.20943951023931953F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 12, 0);
            this.NeckLower.setPos(0.0F, 2.8F, 0.5F);
            this.NeckLower.addBox(-1.0F, -1.0F, -7.3F, 2.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.2792526803190927F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 32, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.1F, -1.8F, 1.2F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.24434609527920614F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 38, 42);
            this.FootRight.setPos(0.01F, 6.2F, -1.1F);
            this.FootRight.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 30, 9);
            this.ArmLeft.setPos(0.1F, 5.3F, 1.0F);
            this.ArmLeft.addBox(-1.0F, -1.0F, -2.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 26, 31);
            this.Hips.setPos(0.0F, -6.0F, 9.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.24434609527920614F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 20, 14);
            this.ThighRight.setPos(-2.0F, -4.3F, 10.7F);
            this.ThighRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.17453292519943295F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 33);
            this.Body.setPos(0.0F, 6.0F, 0.0F);
            this.Body.addBox(-2.5F, -6.0F, 0.0F, 5.0F, 6.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.17453292519943295F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 30, 9);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-0.1F, 5.3F, 1.0F);
            this.ArmRight.addBox(-1.0F, -1.0F, -2.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 18, 10);
            this.EarLeft.setPos(1.1F, -1.0F, -0.9F);
            this.EarLeft.addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.1563815016444822F, -0.3490658503988659F, 0.24434609527920614F);
            this.FootLeft = new ModelRenderer(this, 38, 42);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.01F, 6.2F, -1.3F);
            this.FootLeft.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 26, 0);
            this.Snout.setPos(0.0F, 0.4F, -3.5F);
            this.Snout.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.17453292519943295F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 38, 16);
            this.LowerLegRight.setPos(0.02F, 3.8F, 2.7F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.7330382858376184F, -0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 28, 42);
            this.HandRight.setPos(-0.1F, 4.3F, 0.3F);
            this.HandRight.addBox(-1.0F, -0.5F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 38, 16);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.02F, 3.8F, 2.7F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.7330382858376184F, -0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 26, 4);
            this.Mouth.setPos(0.0F, 0.5F, -0.4F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 17);
            this.Chest.setPos(0.0F, 11.9F, -6.6F);
            this.Chest.addBox(-3.0F, -3.5F, -1.0F, 6.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.17453292519943295F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 8);
            this.Neck.setPos(0.0F, -1.7F, 1.0F);
            this.Neck.addBox(-1.5F, -1.5F, -6.0F, 3.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.06981317007977318F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 20, 23);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.1F, 5.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.7330382858376184F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 20, 23);
            this.UpperLegRight.setPos(-0.1F, 5.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.7330382858376184F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 40, 9);
            this.ForearmRight.setPos(0.02F, 3.0F, -1.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 20, 14);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.0F, -4.3F, 10.7F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.17453292519943295F, 0.0F, 0.0F);
            this.BackPoint = new ModelRenderer(this, 0, 47);
            this.BackPoint.setPos(0.0F, -3.5F, 3.0F);
            this.BackPoint.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 12, 0);
            this.TopSnout.setPos(0.0F, -1.9F, 0.7F);
            this.TopSnout.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.296705972839036F, 0.0F, 0.0F);
            this.Hips.addChild(this.Tail1);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.EarRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Tail1.addChild(this.Tail2);
            this.Neck.addChild(this.Head);
            this.Neck.addChild(this.NeckLower);
            this.Chest.addChild(this.ArmBaseRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Body.addChild(this.Hips);
            this.Body.addChild(this.ThighRight);
            this.BackPoint.addChild(this.Body);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Head.addChild(this.EarLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.Snout);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ForearmRight.addChild(this.HandRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Snout.addChild(this.Mouth);
            this.Chest.addChild(this.Neck);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Body.addChild(this.ThighLeft);
            this.Chest.addChild(this.BackPoint);
            this.Snout.addChild(this.TopSnout);
            this.saveBase();
        }

        @Override
        public void setupAnim(ServalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
            this.Head.xRot = headPitch / (180F / (float) Math.PI) * 0.5F + 0.21F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.07F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.21F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.419F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.140F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.6F;
            float degree = 0.2F;
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                speed = 1.8F;
                degree = 0.1F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) - 0.17F;
                this.Body.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.6F) * degree * -1.8F * limbSwingAmount + 0.174F;
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.8F) - 0.24F;
                this.Neck.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) - 0.07F;
                this.Head.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.0F) + 0.4F;
                this.Chest.y = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) + 11.9F;

                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) + 1.2F;
                this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.0F) + 0.14F;

                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6.0F) + 0.0F;
                this.ArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) - 0.2F;
                this.HandLeft.xRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 5.0F) + 0.2F;
                this.ArmBaseRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6.0F) + 0.0F;
                this.ArmRight.xRot = MathHelper.cos(7.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) - 0.2F;
                this.HandRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 5.0F) + 0.2F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -5.0F) - 0.1F;
                this.UpperLegLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.733F;
                this.LowerLegLeft.xRot = MathHelper.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) - 0.733F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.17F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -5.0F) - 0.1F;
                this.UpperLegRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.733F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) - 0.733F;
                this.FootRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.17F;

            } else {
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.2F) - 0.07F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.2F) + 0.21F;

                this.Chest.y = MathHelper.cos(limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.1F) + 11.9F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.02F) - 0.175F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.1F) + 0.175F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.2F) - 0.244F;

                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1.8F) + 0.24F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.0F) - 0.169F;
                this.HandLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -3.0F) + 0.017F;
                this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.8F) + 0.24F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.0F) - 0.169F;
                this.HandRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 3.0F) + 0.017F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.5F) - 0.175F;
                this.UpperLegLeft.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.3F) + 0.733F;
                this.LowerLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.0F) - 0.733F;
                this.FootLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * degree * -1.5F * limbSwingAmount + 0.17F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.5F) - 0.175F;
                this.UpperLegRight.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1.3F) + 0.733F;
                this.LowerLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.0F) - 0.733F;
                this.FootRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * degree * 1.5F * limbSwingAmount + 0.17F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.2F) + 0.419F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.4F) + 0.140F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.8F);
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.8F);
            }
        }
    }

    public static class Child extends ServalModel {
        public ModelRenderer BackPoint;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Snout2;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout1;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            texWidth = 64;
            texHeight = 64;
            this.UpperLegRight = new ModelRenderer(this, 16, 6);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 3.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6979571971673044F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 16);
            this.Neck.setPos(0.0F, -0.7F, 1.2F);
            this.Neck.addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.5298819715581228F, 0.0F, 0.0F);
            this.BackPoint = new ModelRenderer(this, 0, 0);
            this.BackPoint.setPos(0.0F, -2.0F, 4.0F);
            this.BackPoint.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackPoint, -0.019999998568980413F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 16, 0);
            this.ThighLeft.setPos(1.4F, 1.4F, 1.1F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 29, 6);
            this.ArmLeft.setPos(-0.1F, 2.85F, 0.5F);
            this.ArmLeft.addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 16, 6);
            this.UpperLegLeft.setPos(-0.1F, 3.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6979571971673044F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 16, 15);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.1F, 2.4F, -1.0F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.04694935787733287F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 42, 5);
            this.Tail2.setPos(0.0F, 2.0F, -1.0F);
            this.Tail2.addBox(-0.52F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.18448129660947843F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 42, 10);
            this.Tail3.setPos(0.0F, 2.0F, 0.0F);
            this.Tail3.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.15917402578451204F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 16, 15);
            this.FootLeft.setPos(0.1F, 2.4F, -1.0F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.04694935787733287F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 25, 24);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.8F, -1.0F, -0.2F);
            this.EarRight.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.273493095119092F, 0.6352998743575469F, -0.2792526803190927F);
            this.TopSnout = new ModelRenderer(this, 12, 20);
            this.TopSnout.setPos(0.0F, -1.2F, -0.2F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2834414665291375F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 0, 21);
            this.NeckLower.setPos(0.0F, 1.3F, 0.5F);
            this.NeckLower.addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.2569124705540972F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 16, 10);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.02F, 2.0F, 1.8F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6979571971673044F, -0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 29, 14);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 1.7F, 0.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.02007128598181587F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 29, 10);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.02F, 1.3F, -0.5F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 25, 24);
            this.EarLeft.setPos(0.8F, -1.0F, -0.2F);
            this.EarLeft.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.27366763203903305F, -0.6352998743575469F, 0.2792526803190927F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 17.1F, -4.0F);
            this.Chest.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.194604204939465F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 27);
            this.Hips.setPos(0.0F, -4.0F, 4.0F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.13962634015954636F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 41, 1);
            this.Tail1.setPos(0.0F, 0.0F, 3.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.33876840514893825F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 16, 26);
            this.Head.setPos(0.0F, -0.6F, -2.0F);
            this.Head.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7628834000677549F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 16, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, 1.4F, 1.1F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 29, 14);
            this.HandLeft.setPos(0.1F, 1.7F, 0.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.02007128598181587F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 28, 0);
            this.ArmBaseLeft.setPos(1.4F, -0.3F, 1.65F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.20943951023931953F, 0.0F, 0.0F);
            this.Snout1 = new ModelRenderer(this, 11, 23);
            this.Snout1.setPos(0.0F, 0.0F, 0.0F);
            this.Snout1.addBox(-0.8F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout1, 0.017453292519943295F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 29, 6);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.1F, 2.85F, 0.5F);
            this.ArmRight.addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Snout2 = new ModelRenderer(this, 11, 23);
            this.Snout2.setPos(0.0F, 0.5F, -1.9F);
            this.Snout2.addBox(-0.2F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout2, 0.2834414665291375F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 8);
            this.Body.setPos(0.0F, 4.0F, -1.2F);
            this.Body.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.18657568971450084F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 28, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.4F, -0.3F, 1.65F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.20943951023931953F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 12, 26);
            this.Mouth.setPos(0.0F, 0.0F, -0.9F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 29, 10);
            this.ForearmLeft.setPos(-0.02F, 1.3F, -0.5F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 16, 10);
            this.LowerLegLeft.setPos(-0.02F, 2.0F, 1.8F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6979571971673044F, -0.0F, 0.0F);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.Neck);
            this.Chest.addChild(this.BackPoint);
            this.Hips.addChild(this.ThighLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Tail1.addChild(this.Tail2);
            this.Tail2.addChild(this.Tail3);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarRight);
            this.Snout2.addChild(this.TopSnout);
            this.Neck.addChild(this.NeckLower);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ForearmRight.addChild(this.HandRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Head.addChild(this.EarLeft);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.Tail1);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Snout2.addChild(this.Snout1);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Head.addChild(this.Snout2);
            this.BackPoint.addChild(this.Body);
            this.Chest.addChild(this.ArmBaseRight);
            this.Snout2.addChild(this.Mouth);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(ServalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.763F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.530F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.763F;
            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.339F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.184F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 0.75f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.530F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.763F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 17.7F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.195F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.140F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
                this.ForearmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.020F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
                this.ForearmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.020F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.698F;
                this.LowerLegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.698F;
                this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.047F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.698F;
                this.LowerLegRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.698F;
                this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.047F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.339F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.184F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
            }
        }
    }
}
