package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SquirrelMonkeyEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class SquirrelMonkeyModel extends ZawaBaseModel<SquirrelMonkeyEntity> {
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

    public static class Adult extends SquirrelMonkeyModel {

        public ModelRenderer ArmBaseRight;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer FingerRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer FingerLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Tail6;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Head;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer TopHead;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth1;
        public ModelRenderer Mouth2;


        public Adult() {
            texWidth = 64;
            texHeight = 64;
            this.LegRight = new ModelRenderer(this, 51, 42);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 4.0F, -1.0F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.4098033003787853F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 16, 53);
            this.Snout.setPos(0.0F, -0.4F, -2.1F);
            this.Snout.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.19547687289441354F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 17, 50);
            this.TopSnout.setPos(0.0F, 0.0F, -1.5F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.44191736127864206F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 48, 49);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 4.3F, 2.0F);
            this.FootRight.addBox(-1.5F, -0.5F, -4.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.22078414371937996F, 0.0F, 0.0F);
            this.Mouth2 = new ModelRenderer(this, 16, 56);
            this.Mouth2.setPos(0.0F, 0.0F, -0.7F);
            this.Mouth2.addBox(-0.2F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 34, 18);
            this.Tail4.setPos(0.0F, 0.0F, 4.0F);
            this.Tail4.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.5026548112585615F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 35, 24);
            this.Tail5.setPos(0.0F, 0.0F, 4.0F);
            this.Tail5.addBox(-1.02F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.5026548112585615F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 50, 10);
            this.ArmBaseLeft.setPos(1.9F, -1.9F, -1.4F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.14032447119455382F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 34, 0);
            this.Tail1.setPos(0.0F, 0.0F, 6.0F);
            this.Tail1.addBox(-1.02F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.0110692410066373F, 0.0F, 0.0F);
            this.FingerRight = new ModelRenderer(this, 55, 24);
            this.FingerRight.mirror = true;
            this.FingerRight.setPos(1.0F, 0.1F, -1.0F);
            this.FingerRight.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerRight, 0.0F, -0.5864306020384839F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 49, 33);
            this.ThighLeft.setPos(2.0F, 2.2F, 4.3F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 34, 12);
            this.Tail3.setPos(0.0F, 0.0F, 4.0F);
            this.Tail3.addBox(-1.02F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.5026548112585615F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 51, 42);
            this.LegLeft.setPos(0.0F, 4.0F, -1.0F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.4098033003787853F, 0.0F, 0.0F);
            this.Mouth1 = new ModelRenderer(this, 16, 56);
            this.Mouth1.setPos(0.0F, 0.6F, -0.6F);
            this.Mouth1.addBox(-0.8F, 0.0F, -0.7F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth1, -0.0911061832922575F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 26, 57);
            this.EarLeft.setPos(1.5F, -0.3F, -1.1F);
            this.EarLeft.addBox(-0.6F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.7037167490777915F, 0.5473352640780661F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 52, 17);
            this.ArmLeft.setPos(-0.1F, 3.9F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.4098033003787853F, 0.0F, 0.0911061832922575F);
            this.Tail6 = new ModelRenderer(this, 35, 29);
            this.Tail6.setPos(0.0F, 0.0F, 3.0F);
            this.Tail6.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.42446406875869874F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 48, 49);
            this.FootLeft.setPos(0.0F, 4.3F, 2.0F);
            this.FootLeft.addBox(-1.5F, -0.5F, -4.0F, 3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.22078414371937996F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 52);
            this.Head.setPos(0.0F, -0.02F, -3.9F);
            this.Head.addBox(-1.5F, -2.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3707079291288539F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 50, 10);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.9F, -1.9F, -1.5F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.14032447119455382F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 52, 17);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.1F, 3.9F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.4098033003787853F, 0.0F, -0.0911061832922575F);
            this.FingerLeft = new ModelRenderer(this, 55, 24);
            this.FingerLeft.setPos(-1.0F, 0.1F, -1.0F);
            this.FingerLeft.addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FingerLeft, 0.0F, 0.5864306020384839F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 33);
            this.Neck.setPos(0.0F, -1.4F, 0.5F);
            this.Neck.addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 5.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.46914448828868976F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 48, 24);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 3.3F, -0.4F);
            this.HandRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0911061832922575F, 0.04555309164612875F, 0.0911061832922575F);
            this.TopHead = new ModelRenderer(this, 26, 54);
            this.TopHead.setPos(0.0F, -1.2F, -1.1F);
            this.TopHead.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 2, 2);
            this.Chest.setPos(0.0F, 18.0F, -4.1F);
            this.Chest.addBox(-2.5F, -4.0F, -2.5F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.1783726542143524F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 14);
            this.Body.setPos(0.0F, -4.0F, 3.5F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.2724458902442024F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 26, 57);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.5F, -0.3F, -1.1F);
            this.EarRight.addBox(-0.6F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.7037167490777915F, -0.5473352640780661F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 48, 24);
            this.HandLeft.setPos(0.0F, 3.3F, -0.4F);
            this.HandLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0911061832922575F, -0.04555309164612875F, -0.0911061832922575F);
            this.Tail2 = new ModelRenderer(this, 34, 6);
            this.Tail2.setPos(0.0F, 2.0F, 4.0F);
            this.Tail2.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.15149458439942998F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 49, 33);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 2.2F, 4.3F);
            this.ThighRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.Snout);
            this.Snout.addChild(this.TopSnout);
            this.LegRight.addChild(this.FootRight);
            this.Mouth1.addChild(this.Mouth2);
            this.Tail3.addChild(this.Tail4);
            this.Tail4.addChild(this.Tail5);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Body.addChild(this.Tail1);
            this.HandRight.addChild(this.FingerRight);
            this.Body.addChild(this.ThighLeft);
            this.Tail2.addChild(this.Tail3);
            this.ThighLeft.addChild(this.LegLeft);
            this.Snout.addChild(this.Mouth1);
            this.Head.addChild(this.EarLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Tail5.addChild(this.Tail6);
            this.LegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.HandLeft.addChild(this.FingerLeft);
            this.Chest.addChild(this.Neck);
            this.ArmRight.addChild(this.HandRight);
            this.Head.addChild(this.TopHead);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.EarRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Tail1.addChild(this.Tail2);
            this.Body.addChild(this.ThighRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(SquirrelMonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
            this.Head.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            if (this.isHeld) {
                this.Tail3.xRot = 0.0F;
            }

            this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -1.011F);
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isHeld ? 0.0F : 0.151F);
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.47F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.5f;
                float degree = 0.4f;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.087F;
                this.LegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.410F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.087F;
                this.LegRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + + 0.410F;
                this.FootRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F + 0.178F;
                this.Body.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F - 0.272F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + -0.15F + 18.0F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.47F;
                this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.371F;

                this.Tail1.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + -1.011F;

                this.ArmBaseLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.140F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.410F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.091F;
                this.ArmBaseRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 4.0F * limbSwingAmount * 0.5F + 0.410F;
                this.ArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.410F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.0F * limbSwingAmount * 0.5F + 0.091F;

            } else {
                float speed = 0.9f;
                float degree = 0.6f;
                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.140F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + - 0.410F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.091F;
                this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.140F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.410F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.091F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.410F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.220F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.410F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F -0.220F;

                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.178F);
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.272F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.47F;

                this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : - 1.011F);
                this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.151F);
                this.Tail3.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.503F);
                this.Tail4.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.503F);
            }
        }
    }

    public static class Child extends SquirrelMonkeyModel {
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Head;
        public ModelRenderer Snout1;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer ManeTop;
        public ModelRenderer Snout2;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;

        public Child() {
            texWidth = 64;
            texHeight = 32;
            this.FootLeft = new ModelRenderer(this, 20, 14);
            this.FootLeft.setPos(-0.1F, 2.3F, 0.7F);
            this.FootLeft.addBox(-0.92F, 0.0F, -1.8F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.3909537457888271F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 36, 10);
            this.Tail4.setPos(0.0F, 0.0F, 2.0F);
            this.Tail4.addBox(-0.52F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.17697639214433747F, 0.0F, 0.0F);
            this.ManeTop = new ModelRenderer(this, 35, 16);
            this.ManeTop.setPos(0.0F, -1.7F, 0.8F);
            this.ManeTop.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 21, 9);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.1F, 3.8F, -1.3F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.45256388036845185F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 43, 21);
            this.EarLeft.setPos(1.5F, -0.5F, -0.6F);
            this.EarLeft.addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.299847570818948F, 0.43319071501867035F, 0.0F);
            this.FootRight = new ModelRenderer(this, 20, 14);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 2.3F, 0.7F);
            this.FootRight.addBox(-1.08F, 0.0F, -1.8F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.3909537457888271F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 8, 5);
            this.ArmLeft.setPos(-0.12F, 2.9F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.2914699983988585F, 0.0F, 0.12217304763960307F);
            this.Mouth = new ModelRenderer(this, 52, 26);
            this.Mouth.setPos(0.3F, 0.4F, 0.1F);
            this.Mouth.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 1.6006414410250331F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 43, 21);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.5F, -0.5F, -0.6F);
            this.EarRight.addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.299847570818948F, -0.43319071501867035F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 35, 0);
            this.Tail1.setPos(0.0F, 0.0F, 4.0F);
            this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.1976449806554086F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 52, 20);
            this.TopSnout.setPos(0.3F, 0.0F, -1.0F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.4115486362886824F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 8, 10);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.4F, -1.2F);
            this.HandRight.addBox(-0.98F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.13823007808953144F, 0.0F, 0.12217304763960307F);
            this.Snout1 = new ModelRenderer(this, 52, 23);
            this.Snout1.mirror = true;
            this.Snout1.setPos(-0.2F, 0.2F, -1.6F);
            this.Snout1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout1, 0.2361430431343009F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 37, 13);
            this.Tail5.setPos(0.0F, 0.0F, 2.0F);
            this.Tail5.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.1378810125720277F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 24);
            this.Chest.setPos(0.0F, 18.3F, -1.6F);
            this.Chest.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.20821778508924568F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 2, 17);
            this.Neck.setPos(0.0F, -0.4F, -0.5F);
            this.Neck.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.5864306020384839F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 16, 24);
            this.Body.setPos(0.0F, -2.0F, 2.0F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.16667894689440982F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 36, 7);
            this.Tail3.setPos(0.0F, 0.0F, 2.0F);
            this.Tail3.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.37245326503875104F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 21, 9);
            this.LegLeft.setPos(-0.1F, 3.8F, -1.3F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.45256388036845185F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 34, 20);
            this.Head.setPos(0.0F, 0.5F, -2.6F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.42202061845855104F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 8, 0);
            this.ArmBaseLeft.setPos(1.5F, -0.3F, -0.8F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.05794493000107876F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 18, 2);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.7F, 1.6F, 2.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.11431906933457996F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 8, 10);
            this.HandLeft.setPos(0.0F, 2.4F, -1.2F);
            this.HandLeft.addBox(-1.02F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.13823007808953144F, 0.0F, -0.12217304763960307F);
            this.Snout2 = new ModelRenderer(this, 52, 23);
            this.Snout2.setPos(0.6F, 0.0F, 0.0F);
            this.Snout2.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 8, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.5F, -0.3F, -0.8F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.05794493000107876F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 18, 2);
            this.ThighLeft.setPos(1.7F, 1.6F, 2.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.11431906933457996F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 36, 4);
            this.Tail2.setPos(0.0F, 1.0F, 3.0F);
            this.Tail2.addBox(-0.52F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.2160717633942688F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 8, 5);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.12F, 2.9F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.2914699983988585F, 0.0F, -0.12217304763960307F);
            this.LegLeft.addChild(this.FootLeft);
            this.Tail3.addChild(this.Tail4);
            this.Head.addChild(this.ManeTop);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.EarLeft);
            this.LegRight.addChild(this.FootRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Snout1.addChild(this.Mouth);
            this.Head.addChild(this.EarRight);
            this.Body.addChild(this.Tail1);
            this.Snout1.addChild(this.TopSnout);
            this.ArmRight.addChild(this.HandRight);
            this.Head.addChild(this.Snout1);
            this.Tail4.addChild(this.Tail5);
            this.Chest.addChild(this.Neck);
            this.Chest.addChild(this.Body);
            this.Tail2.addChild(this.Tail3);
            this.ThighLeft.addChild(this.LegLeft);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Body.addChild(this.ThighRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Snout1.addChild(this.Snout2);
            this.Chest.addChild(this.ArmBaseRight);
            this.Body.addChild(this.ThighLeft);
            this.Tail1.addChild(this.Tail2);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(SquirrelMonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
            this.Head.yRot = (float)Math.toRadians((double)netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F -1.198F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.216F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F + -0.4F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.058F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.291F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.138F;
                this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.058F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.291F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.138F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F -0.114F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.456F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F -0.391F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F -0.114F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.456F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F -0.391F;

                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : + 0.208F);
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.167F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F + -0.586F;


                this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : - 1.197F);
                this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.216F);
            }
        }
    }
}
