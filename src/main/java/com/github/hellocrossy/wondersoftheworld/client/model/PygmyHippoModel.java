package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.PygmyHippoEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PygmyHippoModel extends ZawaBaseModel<PygmyHippoEntity> {
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

    public static class Adult extends PygmyHippoModel {
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer Body;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer NeckBottom;
        public ModelRenderer Head;
        public ModelRenderer Mouth;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft_1;
        public ModelRenderer Nose;
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
        public ModelRenderer UpperArmRight;
        public ModelRenderer LowerArmRight;
        public ModelRenderer HandRight;

        public Adult() {
            texWidth = 64;
            texHeight = 64;
            this.EarRight = new ModelRenderer(this, 36, 22);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.2F, -1.6F, 0.5F);
            this.EarRight.addBox(-1.8F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3141592653589793F, 0.4886921905584123F, 0.3490658503988659F);
            this.LowerArmLeft = new ModelRenderer(this, 52, 50);
            this.LowerArmLeft.setPos(0.0F, 2.3F, 0.0F);
            this.LowerArmLeft.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.039968039204879874F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 36, 22);
            this.EarLeft.setPos(2.2F, -1.6F, 0.5F);
            this.EarLeft.addBox(-0.2F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3141592653589793F, -0.4886921905584123F, -0.3490658503988659F);
            this.Head = new ModelRenderer(this, 44, 0);
            this.Head.setPos(0.0F, 3.7F, -4.5F);
            this.Head.addBox(-2.5F, -3.5F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.1672025410094762F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 52, 50);
            this.LowerArmRight.setPos(0.0F, 2.3F, 0.0F);
            this.LowerArmRight.addBox(-0.99F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.039968039204879874F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 42, 49);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.3F, -1.3F);
            this.HandRight.addBox(-1.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 34);
            this.Hips.setPos(0.0F, -7.8F, 9.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2300344007391748F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 49);
            this.ThighLeft.setPos(3.2F, 1.4F, 3.1F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 49);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.2F, 1.4F, 3.1F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 17, 50);
            this.LowerLegLeft.setPos(0.0F, 1.7F, 2.7F);
            this.LowerLegLeft.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3499385017090576F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 14);
            this.Body.setPos(0.0F, 3.5F, 1.2F);
            this.Body.addBox(-4.5F, -7.8F, 0.0F, 9.0F, 9.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.03001966363364517F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 14.0F, -5.0F);
            this.Chest.addBox(-4.0F, -4.0F, -2.0F, 8.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.03001966363364517F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 24, 39);
            this.Neck.setPos(0.0F, -3.9F, -1.6F);
            this.Neck.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.07941248429469336F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 37, 11);
            this.Snout.setPos(0.0F, -1.6F, -1.7F);
            this.Snout.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.1249655717796329F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 52, 44);
            this.Tail1.setPos(0.0F, 0.2F, 5.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3534291735288517F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 45, 14);
            this.Mouth.setPos(0.0F, 0.4F, -1.1F);
            this.Mouth.addBox(-1.3F, 0.0F, -3.8F, 3.0F, 2.0F, 4.0F, -0.1F, -0.1F, -0.1F);
            this.setRotateAngle(Mouth, -0.006283185556850939F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 42, 49);
            this.HandLeft.setPos(0.0F, 2.3F, -1.3F);
            this.HandLeft.addBox(-1.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 17, 50);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 1.7F, 2.7F);
            this.LowerLegRight.addBox(-0.99F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3499385017090576F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 29, 60);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 3.2F, -1.2F);
            this.FootRight.addBox(-1.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.1399754139994285F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 18, 57);
            this.UpperLegLeft.setPos(-0.1F, 7.6F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4399974884488039F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 29, 60);
            this.FootLeft.setPos(0.0F, 3.2F, -1.2F);
            this.FootLeft.addBox(-1.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.1399754139994285F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 28, 1);
            this.Nose.setPos(0.0F, -1.5F, -2.0F);
            this.Nose.addBox(-2.0F, 0.0F, -2.1F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.15009832232941506F, 0.0F, 0.0F);
            this.NeckBottom = new ModelRenderer(this, 32, 29);
            this.NeckBottom.setPos(0.0F, 3.9F, 1.2F);
            this.NeckBottom.addBox(-1.5F, 0.0F, -5.0F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBottom, -0.40142572795869574F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 18, 57);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-0.1F, 7.6F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4399974884488039F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 51, 57);
            this.UpperArmLeft.setPos(0.0F, 3.9F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.09005898673974631F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 52, 37);
            this.Tail2.setPos(0.0F, 3.0F, 0.0F);
            this.Tail2.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.1672025410094762F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 51, 57);
            this.UpperArmRight.setPos(0.0F, 3.9F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.09005898673974631F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 38, 54);
            this.ArmBaseLeft.setPos(2.8F, 0.6F, -0.2F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.09005898673974631F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 38, 54);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.8F, 0.6F, -0.2F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.09005898673974631F, 0.0F, 0.0F);
            this.EarLeft_1 = new ModelRenderer(this, 44, 21);
            this.EarLeft_1.setPos(0.0F, 0.6F, 1.2F);
            this.EarLeft_1.addBox(-3.0F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Head.addChild(this.EarRight);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Head.addChild(this.EarLeft);
            this.Neck.addChild(this.Head);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.LowerArmRight.addChild(this.HandRight);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.Hips.addChild(this.ThighRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.Body);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.Mouth);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Snout.addChild(this.Nose);
            this.Neck.addChild(this.NeckBottom);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Tail1.addChild(this.Tail2);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.EarLeft_1);
            this.saveBase();
        }

        @Override
        public void setupAnim(PygmyHippoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.167F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.079F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.167F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.353F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.167F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.8f;
                float degree = 0.5f;

            } else {
                float speed = 2.0f;
                float degree = 0.8f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.079F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.167F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.353F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.167F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 14.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.03F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.03F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.23F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.09F;
                this.UpperArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
                this.LowerArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.039F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.09F;
                this.UpperArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
                this.LowerArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.039F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.439F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.349F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.139F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.439F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.349F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.139F;
            }
        }
    }

    public static class Child extends PygmyHippoModel {
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LegLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LegRight;
        public ModelRenderer HandRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft_1;
        public ModelRenderer HandLeft_2;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight_1;
        public ModelRenderer HandRight_2;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer Cheek;
        public Child() {
            texWidth = 64;
            texHeight = 64;
            this.ThighLeft = new ModelRenderer(this, 4, 0);
            this.ThighLeft.setPos(2.5F, 2.3F, 3.0F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.21362829644936432F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 4, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.5F, 2.3F, 3.0F);
            this.ThighRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.21362829644936432F, 0.0F, 0.0F);
            this.HandRight_2 = new ModelRenderer(this, 20, 15);
            this.HandRight_2.mirror = true;
            this.HandRight_2.setPos(0.0F, 1.9F, 1.1F);
            this.HandRight_2.addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, -0.2F, 0.0F, 0.2F);
            this.setRotateAngle(HandRight_2, 0.03909537541112055F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 20, 7);
            this.ArmLeft.setPos(0.0F, 4.3F, 0.0F);
            this.ArmLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.08726646259971647F, -0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 20, 0);
            this.ArmBaseRight.setPos(-2.1F, 1.0F, -0.2F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.021642082891177254F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 36, 11);
            this.Body.setPos(0.0F, -3.6F, 1.5F);
            this.Body.addBox(-4.0F, -0.3F, -0.3F, 8.0F, 8.0F, 7.0F, 0.0F, -0.3F, 0.3F);
            this.setRotateAngle(Body, -0.1563815016444822F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 42, 0);
            this.Chest.setPos(0.0F, 15.6F, -4.0F);
            this.Chest.addBox(-3.5F, -3.5F, -2.0F, 7.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.15655603856442327F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 4, 15);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.2F, 1.9F, 2.5F);
            this.LegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.6108652381980153F, -0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 46);
            this.Snout.setPos(0.0F, -2.2F, -2.2F);
            this.Snout.addBox(-2.0F, -0.2F, -3.0F, 4.0F, 4.0F, 4.0F, -0.2F, -0.1F, 0.0F);
            this.setRotateAngle(Snout, 0.15620696472454113F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 37);
            this.Mouth.setPos(0.0F, 1.8F, -1.7F);
            this.Mouth.addBox(-1.5F, -0.4F, -2.6F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.1F);
            this.Neck = new ModelRenderer(this, 40, 45);
            this.Neck.mirror = true;
            this.Neck.setPos(0.0F, -2.5F, -2.0F);
            this.Neck.addBox(-2.0F, -0.5F, -1.7F, 4.0F, 4.0F, 2.0F, 0.0F, 0.3F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 4, 10);
            this.UpperLegLeft.setPos(0.3F, 5.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6108652381980153F, 0.0F, 0.0F);
            this.HandLeft_1 = new ModelRenderer(this, 20, 11);
            this.HandLeft_1.setPos(0.0F, 0.2F, -1.0F);
            this.HandLeft_1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft_1, -0.08726646259971647F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 33);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.0F, -1.7F, 0.7F);
            this.EarRight.addBox(-1.3F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.5338962208482264F, 0.46914448828868976F, -1.2121311122468401F);
            this.Tail = new ModelRenderer(this, 54, 37);
            this.Tail.setPos(0.0F, 0.2F, 4.6F);
            this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.3700098147386033F, -0.0F, 0.0F);
            this.HandLeft_2 = new ModelRenderer(this, 20, 15);
            this.HandLeft_2.setPos(0.0F, 1.9F, 1.1F);
            this.HandLeft_2.addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, -0.2F, 0.0F, 0.2F);
            this.setRotateAngle(HandLeft_2, 0.03909537541112055F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 54);
            this.Head.setPos(0.0F, 1.7F, -2.4F);
            this.Head.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 4.0F, -0.2F, 0.0F, 0.1F);
            this.setRotateAngle(Head, 0.0781907508222411F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 4, 21);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.9F, -0.9F);
            this.HandRight.addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, -0.2F, 0.0F, 0.2F);
            this.setRotateAngle(HandRight, 0.10890854132970453F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 4, 21);
            this.HandLeft.setPos(0.0F, 2.9F, -0.9F);
            this.HandLeft.addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, -0.2F, 0.0F, 0.2F);
            this.setRotateAngle(HandLeft, 0.10890854132970453F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 20, 7);
            this.ArmRight.setPos(0.0F, 4.3F, 0.0F);
            this.ArmRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.08726646259971647F, -0.0F, 0.0F);
            this.HandRight_1 = new ModelRenderer(this, 20, 11);
            this.HandRight_1.setPos(0.0F, 0.2F, -1.0F);
            this.HandRight_1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight_1, -0.08726646259971647F, 0.0F, 0.0F);
            this.Cheek = new ModelRenderer(this, 9, 40);
            this.Cheek.setPos(0.0F, 1.2F, 0.5F);
            this.Cheek.addBox(-3.0F, -1.5F, -1.5F, 6.0F, 3.0F, 3.0F, -0.2F, -0.1F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 4, 15);
            this.LegLeft.setPos(-0.2F, 1.9F, 2.5F);
            this.LegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.6108652381980153F, -0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 4, 10);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-0.3F, 5.0F, -2.0F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6108652381980153F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 33);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -1.7F, 0.7F);
            this.EarLeft.addBox(-0.7F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.5338962208482264F, -0.46914448828868976F, 1.2121311122468401F);
            this.ArmBaseLeft = new ModelRenderer(this, 20, 0);
            this.ArmBaseLeft.setPos(2.1F, 1.0F, -0.2F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.021642082891177254F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 40, 26);
            this.Hips.setPos(0.0F, 0.1F, 7.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.31293754020890546F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighLeft);
            this.Hips.addChild(this.ThighRight);
            this.HandRight_1.addChild(this.HandRight_2);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Chest.addChild(this.Body);
            this.UpperLegRight.addChild(this.LegRight);
            this.Head.addChild(this.Snout);
            this.Head.addChild(this.Mouth);
            this.Chest.addChild(this.Neck);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmLeft.addChild(this.HandLeft_1);
            this.Head.addChild(this.EarRight);
            this.Hips.addChild(this.Tail);
            this.HandLeft_1.addChild(this.HandLeft_2);
            this.Neck.addChild(this.Head);
            this.LegRight.addChild(this.HandRight);
            this.LegLeft.addChild(this.HandLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ArmRight.addChild(this.HandRight_1);
            this.Head.addChild(this.Cheek);
            this.UpperLegLeft.addChild(this.LegLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Body.addChild(this.Hips);
            this.saveBase();
        }

        @Override
        public void setupAnim(PygmyHippoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 0.75f;
               
            }
        }
    }
}

