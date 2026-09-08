package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.BlackFootedCatEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BlackFootedCatModel extends ZawaBaseModel<BlackFootedCatEntity> {
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

    public static class Adult extends BlackFootedCatModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail2_1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer CheekLeft;
        public ModelRenderer EarRight;
        public ModelRenderer CheekRight;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;


        public Adult() {
            texWidth = 64;
            texHeight = 32;
            this.LowerLegRight = new ModelRenderer(this, 17, 23);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 1.6F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6829473549475088F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 28, 24);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.5F, -1.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 19, 8);
            this.ArmBaseLeft.setPos(1.4F, 0.0F, 0.0F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.08412487294218292F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 28, 24);
            this.FootLeft.setPos(0.0F, 2.5F, -1.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 27, 0);
            this.TopSnout.setPos(0.0F, -1.0F, 0.6F);
            this.TopSnout.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3141592653589793F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 23, 28);
            this.Tail2.setPos(0.01F, 0.1F, 1.3F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.1F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.27436576307404054F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 28, 19);
            this.UpperLegLeft.setPos(0.0F, 3.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 12, 0);
            this.EarLeft.setPos(1.5F, -0.5F, -0.4F);
            this.EarLeft.addBox(-1.0F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3127630032889644F, -0.4300491170387584F, 0.23457224414434488F);
            this.Neck = new ModelRenderer(this, 14, 0);
            this.Neck.setPos(0.0F, -1.6F, -1.0F);
            this.Neck.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.5864306020384839F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 28, 19);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 3.0F, -2.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 29, 3);
            this.CheekLeft.setPos(1.2F, 1.21F, -1.7F);
            this.CheekLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, -0.11728612207217244F, 0.0781907508222411F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 17, 23);
            this.LowerLegLeft.setPos(0.0F, 1.6F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6829473549475088F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 21, 13);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(-0.01F, 1.9F, -2.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 19, 8);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.4F, 0.0F, 0.0F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.08412487294218292F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 15, 17);
            this.ThighLeft.setPos(1.1F, 1.0F, 1.5F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.3057816929388898F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 12, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.5F, -0.5F, -0.4F);
            this.EarRight.addBox(-1.0F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3127630032889644F, 0.4300491170387584F, -0.23457224414434488F);
            this.Mouth = new ModelRenderer(this, 28, 3);
            this.Mouth.setPos(0.0F, 0.8F, -0.9F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.19547687289441354F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 15, 17);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.1F, 1.0F, 1.5F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.3057816929388898F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 26);
            this.Head.setPos(0.0F, 1.2F, -1.1F);
            this.Head.addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7822565654175363F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 33, 0);
            this.Snout.setPos(0.0F, -0.2F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.17453292519943295F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 15, 28);
            this.Tail1.setPos(0.0F, 0.0F, 3.0F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.7037167490777915F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 29, 9);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 2.0F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06475171591477989F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 29, 3);
            this.CheekRight.setPos(-1.2F, 1.21F, -1.7F);
            this.CheekRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, -0.11728612207217244F, -0.0781907508222411F, 0.0F);
            this.Tail2_1 = new ModelRenderer(this, 31, 28);
            this.Tail2_1.setPos(0.01F, 0.1F, 1.5F);
            this.Tail2_1.addBox(-1.0F, 0.0F, 0.1F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2_1, 0.27436576307404054F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 28, 24);
            this.HandLeft.setPos(0.0F, 1.0F, 0.8F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0781907508222411F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 21, 13);
            this.ForearmLeft.setPos(0.01F, 1.9F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 15);
            this.Hips.setPos(0.0F, 0.0F, 4.0F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.35185837453889574F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 29, 9);
            this.UpperArmLeft.setPos(0.0F, 2.0F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06475171591477989F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 28, 24);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 1.0F, 0.8F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0781907508222411F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 7);
            this.Body.setPos(0.0F, -2.0F, 1.0F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.0781907508222411F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 18.8F, -2.0F);
            this.Chest.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.03909537541112055F, 0.0F, 0.0F);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Snout.addChild(this.TopSnout);
            this.Tail1.addChild(this.Tail2);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.Neck);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.CheekLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.UpperArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.Mouth);
            this.Hips.addChild(this.ThighRight);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail1);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Head.addChild(this.CheekRight);
            this.Tail2.addChild(this.Tail2_1);
            this.ForearmLeft.addChild(this.HandLeft);
            this.UpperArmLeft.addChild(this.ForearmLeft);
            this.Body.addChild(this.Hips);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Body);
            this.saveBase();

        }

        @Override
        public void setupAnim(BlackFootedCatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.782F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.08F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.586F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.08F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.782F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.703F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.274F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 0.9f;
            float degree = 1.0f;
            this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.039F;
            this.Chest.y = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 1.1F) * 0.5F + 18.8F;
            this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.078F;
            this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.351F;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.586F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F + 0.782F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.703F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.274F;

            this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.084F;
            this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F - 0.064F;
            this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.078F;
            this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.084F;
            this.UpperArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F - 0.064F;
            this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.078F;

            this.ThighLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.305F;
            this.UpperLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.682F;
            this.LowerLegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.682F;
            this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.305F;
            this.UpperLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.682F;
            this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.682F;
            this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
        }
    }

    public static class Child extends BlackFootedCatModel {
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer CheekLeft;
        public ModelRenderer Snout;
        public ModelRenderer CheekRIght;
        public ModelRenderer EarLeft_1;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            texWidth = 32;
            texHeight = 16;
            this.ArmRight = new ModelRenderer(this, 14, 13);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.02F, 1.6F, 0.4F);
            this.ArmRight.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.47123889803846897F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 28, 14);
            this.UpperLegLeft.setPos(0.0F, 1.5F, -0.9F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.9897762028270176F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 14, 0);
            this.Head.setPos(0.0F, 0.8F, -1.1F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.6646214111173737F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 14, 11);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.3F, 0.4F, -0.8F);
            this.ArmBaseRight.addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.21781708265940905F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 14, 11);
            this.ArmBaseLeft.setPos(1.3F, 0.4F, -0.8F);
            this.ArmBaseLeft.addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.21781708265940905F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 20, 13);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-0.01F, 0.9F, 1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(LegRight, -1.0224139077762113F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 24, 0);
            this.Tail2.setPos(0.0F, 0.0F, 1.2F);
            this.Tail2.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.2738421523142173F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 10, 14);
            this.HandLeft.setPos(0.0F, 1.7F, -0.5F);
            this.HandLeft.addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, 0.01F, -0.1F, 0.0F);
            this.setRotateAngle(HandLeft, 0.3186971254089062F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 21, 4);
            this.Neck.setPos(0.0F, -1.0F, -0.5F);
            this.Neck.addBox(-1.0F, -0.6F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(Neck, -0.5864306020384839F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 14, 13);
            this.ArmLeft.setPos(-0.02F, 1.6F, 0.4F);
            this.ArmLeft.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.47123889803846897F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 24, 10);
            this.ThighLeft.setPos(1.3F, 1.3F, 1.7F);
            this.ThighLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.03909537541112055F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 20, 13);
            this.LegLeft.setPos(0.01F, 0.9F, 1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(LegLeft, -1.0224139077762113F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 5, 12);
            this.CheekLeft.setPos(1.1F, 1.5F, -0.7F);
            this.CheekLeft.addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, -0.11728612207217244F, 0.0781907508222411F, 0.0F);
            this.Snout = new ModelRenderer(this, 14, 9);
            this.Snout.setPos(0.0F, 0.6F, -0.6F);
            this.Snout.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0781907508222411F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 1, 12);
            this.Tail1.setPos(0.0F, 0.0F, 2.7F);
            this.Tail1.addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.3F);
            this.setRotateAngle(Tail1, -0.9773843811168246F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 24, 14);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.01F, 1.8F, -0.5F);
            this.FootRight.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.02F, -0.1F, 0.1F);
            this.setRotateAngle(FootRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 19, 11);
            this.Mouth.setPos(0.0F, 0.5F, -0.5F);
            this.Mouth.addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.19547687289441354F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 24, 10);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.3F, 1.3F, 1.7F);
            this.ThighRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 10, 14);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 1.7F, -0.5F);
            this.HandRight.addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, 0.01F, -0.1F, 0.0F);
            this.setRotateAngle(HandRight, 0.3186971254089062F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -1.1F, 1.7F);
            this.Body.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 3.0F, -0.1F, -0.1F, 0.0F);
            this.setRotateAngle(Body, -0.11728612207217244F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 14, 5);
            this.Nose.setPos(0.0F, 0.2F, 0.1F);
            this.Nose.addBox(-0.5F, -1.2F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.23457224414434488F, 0.0F, 0.0F);
            this.EarLeft_1 = new ModelRenderer(this, 22, 0);
            this.EarLeft_1.mirror = true;
            this.EarLeft_1.setPos(-1.4F, -1.4F, -0.2F);
            this.EarLeft_1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft_1, 0.11676252795710604F, 0.3186971254089062F, -0.2275909337942703F);
            this.FootLeft = new ModelRenderer(this, 24, 14);
            this.FootLeft.setPos(-0.01F, 1.8F, -0.5F);
            this.FootLeft.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.02F, -0.1F, 0.1F);
            this.setRotateAngle(FootLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.CheekRIght = new ModelRenderer(this, 5, 12);
            this.CheekRIght.mirror = true;
            this.CheekRIght.setPos(-1.1F, 1.5F, -0.7F);
            this.CheekRIght.addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRIght, -0.11728612207217244F, -0.0781907508222411F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 6);
            this.Chest.setPos(0.0F, 20.4F, 0.0F);
            this.Chest.addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, -0.3F, -0.1F, 0.0F);
            this.setRotateAngle(Chest, 0.03909537541112055F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 22, 0);
            this.EarLeft.setPos(1.4F, -1.4F, -0.2F);
            this.EarLeft.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.11676252795710604F, -0.3186971254089062F, 0.2275909337942703F);
            this.UpperLegRight = new ModelRenderer(this, 28, 14);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 1.5F, -0.9F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.9897762028270176F, 0.0F, 0.0F);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.ArmBaseRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.UpperLegRight.addChild(this.LegRight);
            this.Tail1.addChild(this.Tail2);
            this.ArmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.Neck);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Body.addChild(this.ThighLeft);
            this.UpperLegLeft.addChild(this.LegLeft);
            this.Head.addChild(this.CheekLeft);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.Tail1);
            this.LegRight.addChild(this.FootRight);
            this.Snout.addChild(this.Mouth);
            this.Body.addChild(this.ThighRight);
            this.ArmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Body);
            this.Snout.addChild(this.Nose);
            this.Head.addChild(this.EarLeft_1);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.CheekRIght);
            this.Head.addChild(this.EarLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(BlackFootedCatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 0.8f;
          }
    }
}

