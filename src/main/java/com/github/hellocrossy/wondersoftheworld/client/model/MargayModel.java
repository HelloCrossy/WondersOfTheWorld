package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.MargayEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class MargayModel extends ZawaBaseModel<MargayEntity> {
    public ModelRenderer Chest;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends MargayModel {


        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
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
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;

        public Adult() {
            this.texWidth = 128;
            this.texHeight = 64;
            this.LowerLegRight = new ModelRenderer(this, 46, 7);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 2.6F, 2.7F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6586872889974319F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 22, 11);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.2F, -1.9F, -2.0F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 18, 39);
            this.NeckLower.setPos(-0.1F, -3.1F, -1.6F);
            this.NeckLower.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -1.7950711090445568F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 14);
            this.ArmLeft.setPos(-0.02F, 1.6F, -2.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.09005898673974631F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 17.9F, -3.2F);
            this.Chest.addBox(-2.0F, -4.0F, -4.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.17086773310445458F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 36, 53);
            this.Snout.setPos(0.5F, 0.6F, -1.8F);
            this.Snout.addBox(-1.5F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.20193458912942175F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 18, 30);
            this.Neck.setPos(0.0F, -2.8F, -3.2F);
            this.Neck.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.040390777766464F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 54, 16);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 3.0F, 1.2F);
            this.HandRight.addBox(-0.98F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0781907508222411F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 62, 35);
            this.Tail1.setPos(0.0F, 0.4F, 2.6F);
            this.Tail1.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.7033676752379093F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 32, 22);
            this.ThighLeft.setPos(1.6F, 1.2F, 0.4F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.4557054783483638F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 13);
            this.Body.setPos(0.0F, -3.9F, -1.1F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.22584559788437325F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 26, 47);
            this.EarLeft.setPos(1.2F, -0.7F, 0.0F);
            this.EarLeft.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3672172905985735F, -0.7813839141073446F, 0.3642502295386026F);
            this.EarRight = new ModelRenderer(this, 26, 47);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.2F, -0.7F, 0.0F);
            this.EarRight.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3672172905985735F, 0.7813839141073446F, -0.3642502295386026F);
            this.LowerLegLeft = new ModelRenderer(this, 46, 7);
            this.LowerLegLeft.setPos(0.0F, 2.6F, 2.7F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6586872889974319F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 48, 25);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 4.0F, -1.7F);
            this.UpperLegRight.addBox(-1.48F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.46321039945826153F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 62, 51);
            this.Tail3.setPos(0.0F, 5.0F, 0.0F);
            this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.3546508986789256F, 0.0F, 0.0169296942436877F);
            this.Hips = new ModelRenderer(this, 0, 30);
            this.Hips.setPos(0.0F, 0.0F, 7.0F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3513347637790725F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 48, 25);
            this.UpperLegLeft.setPos(0.0F, 4.0F, -1.7F);
            this.UpperLegLeft.addBox(-1.52F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.46321039945826153F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 39, 58);
            this.Mouth.setPos(0.0F, 0.0F, 0.1F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.006457718315602803F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 54, 16);
            this.HandLeft.setPos(0.0F, 3.0F, 1.2F);
            this.HandLeft.addBox(-1.02F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0781907508222411F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 62, 43);
            this.Tail2.setPos(0.0F, 5.0F, -1.5F);
            this.Tail2.addBox(-0.98F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.4572762773383198F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 36, 10);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-0.4F, 3.5F, 1.5F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.18203784630933073F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 22, 11);
            this.ArmBaseLeft.setPos(2.2F, -1.9F, -2.0F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 54, 16);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 4.0F, -1.0F);
            this.FootRight.addBox(-0.98F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.05201081204232616F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 38, 48);
            this.TopSnout.setPos(0.0F, -0.7F, -2.2F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3186971254089062F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 46, 14);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.02F, 1.6F, -2.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.09005898673974631F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 32, 22);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.6F, 1.2F, 0.4F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.4557054783483638F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 54, 16);
            this.FootLeft.setPos(0.0F, 4.0F, -1.0F);
            this.FootLeft.addBox(-1.02F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.05201081204232616F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 16, 51);
            this.Head.setPos(0.0F, -2.3F, -0.3F);
            this.Head.addBox(-1.5F, -1.5F, -2.6F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.8281587433871148F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 36, 10);
            this.UpperArmLeft.setPos(-0.6F, 3.5F, 1.5F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.18203784630933073F, 0.0F, 0.0F);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Neck.addChild(this.NeckLower);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.Neck);
            this.ArmRight.addChild(this.HandRight);
            this.Hips.addChild(this.Tail1);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.EarRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Tail2.addChild(this.Tail3);
            this.Body.addChild(this.Hips);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Snout.addChild(this.Mouth);
            this.ArmLeft.addChild(this.HandLeft);
            this.Tail1.addChild(this.Tail2);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Snout.addChild(this.TopSnout);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Hips.addChild(this.ThighRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.Head);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(MargayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.828F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.08F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 1.04F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.08F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.828F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.703F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.457F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 0.9f;
                float degree = 1.0f;
                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.170F;
                this.Chest.y = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 1.1F) * 0.5F + 17.9F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.225F;
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.351F;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F + 1.04F;
                this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.828F;
                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.703F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
                this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.457F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.349F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F - 0.182F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.090F;
                this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.349F;
                this.UpperArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F - 0.182F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.090F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.078F;

                this.ThighLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.455F;
                this.UpperLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.463F;
                this.LowerLegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.658F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.052F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.455F;
                this.UpperLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.463F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.658F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.052F;
        }
    }

    public static class Child extends MargayModel {

        public ModelRenderer ArmBaseLeft;
        public ModelRenderer BackPoint;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Snout1;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;

        public Child() {
            this.texWidth = 48;
            this.texHeight = 32;
            this.EarLeft = new ModelRenderer(this, 25, 26);
            this.EarLeft.setPos(0.6F, -0.5F, -0.2F);
            this.EarLeft.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.27366763203903305F, -0.47891835606830785F, 0.2792526803190927F);
            this.UpperLegRight = new ModelRenderer(this, 16, 6);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 3.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6981317007977318F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 18.7F, -4.0F);
            this.Chest.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.02007128598181587F, 0.0F, 0.0F);
            this.Snout1 = new ModelRenderer(this, 11, 23);
            this.Snout1.setPos(0.0F, 0.5F, -1.8F);
            this.Snout1.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout1, 0.2834414665291375F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 25, 26);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.6F, -0.5F, -0.2F);
            this.EarRight.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.273493095119092F, 0.47891835606830785F, -0.2792526803190927F);
            this.ArmBaseRight = new ModelRenderer(this, 28, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.4F, -0.5F, 1.65F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 16, 0);
            this.ThighLeft.setPos(1.4F, -2.5F, 2.3F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 28, 0);
            this.ArmBaseLeft.setPos(1.4F, -0.5F, 1.65F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 16, 14);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.1F, 1.4F, -1.0F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.04747295615358847F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 16, 14);
            this.FootLeft.setPos(0.1F, 1.4F, -1.0F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.04747295615358847F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 16, 10);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.02F, 2.0F, 1.8F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6981317007977318F, -0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 29, 6);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.1F, 2.85F, 0.5F);
            this.ArmRight.addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 29, 13);
            this.HandLeft.setPos(0.1F, 0.7F, 0.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.02007128598181587F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 29, 13);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 0.7F, 0.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.02007128598181587F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 29, 6);
            this.ArmLeft.setPos(-0.1F, 2.85F, 0.5F);
            this.ArmLeft.addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 40, 10);
            this.Tail3.setPos(0.0F, 3.0F, 0.0F);
            this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.5501277882180959F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 16, 26);
            this.Head.setPos(0.0F, -0.6F, -2.0F);
            this.Head.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8414232164074996F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 29, 10);
            this.ForearmLeft.setPos(-0.02F, 1.3F, -0.5F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 12, 20);
            this.TopSnout.setPos(0.0F, -1.2F, -0.2F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2834414665291375F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 16, 6);
            this.UpperLegLeft.setPos(-0.1F, 3.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6981317007977318F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 40, 15);
            this.Tail4.setPos(0.0F, 3.0F, 0.0F);
            this.Tail4.addBox(-1.02F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.45012043006830416F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 29, 10);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.02F, 1.3F, -0.5F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 16, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, -2.5F, 2.3F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 16, 10);
            this.LowerLegLeft.setPos(-0.02F, 2.0F, 1.8F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6981317007977318F, -0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 40, 0);
            this.Tail1.setPos(0.0F, -4.0F, 4.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.46233771485855624F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 0, 21);
            this.NeckLower.setPos(0.0F, 1.3F, 0.5F);
            this.NeckLower.addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.2569124705540972F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 40, 5);
            this.Tail2.setPos(0.0F, 3.0F, -2.0F);
            this.Tail2.addBox(-1.02F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.392350007858842F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 16);
            this.Neck.setPos(0.0F, -0.4F, 1.2F);
            this.Neck.addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7405432069475162F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 12, 26);
            this.Mouth.setPos(0.0F, 0.0F, -0.9F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.BackPoint = new ModelRenderer(this, 0, 0);
            this.BackPoint.setPos(0.0F, -2.0F, 4.0F);
            this.BackPoint.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackPoint, -0.019999998568980413F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 8);
            this.Hips.setPos(0.0F, 4.0F, -0.2F);
            this.Hips.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.04747295615358847F, 0.0F, 0.0F);
            this.Head.addChild(this.EarLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.Snout1);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Tail2.addChild(this.Tail3);
            this.Neck.addChild(this.Head);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Snout1.addChild(this.TopSnout);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Tail3.addChild(this.Tail4);
            this.ArmRight.addChild(this.ForearmRight);
            this.Hips.addChild(this.ThighRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Hips.addChild(this.Tail1);
            this.Neck.addChild(this.NeckLower);
            this.Tail1.addChild(this.Tail2);
            this.Chest.addChild(this.Neck);
            this.Snout1.addChild(this.Mouth);
            this.Chest.addChild(this.BackPoint);
            this.BackPoint.addChild(this.Hips);
            this.saveBase();

        }

        @Override
        public void setupAnim(MargayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.841F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.740F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.841F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.34F) * 0.5F + 0.462F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.05F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.392F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 0.6f;
                float degree = 1.0f;
                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.020F;
                this.Chest.y = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 18.7F;
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.047F;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.740F;
                this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F + 0.841F;
                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.462F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
                this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.392F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F - 0.020F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F - 0.020F;

                this.ThighLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.698F;
                this.LowerLegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.698F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.047F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.UpperLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.698F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.698F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.047F;
        }
    }
}
