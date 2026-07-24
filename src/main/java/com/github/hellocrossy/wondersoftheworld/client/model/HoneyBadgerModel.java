package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.HoneyBadgerEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class HoneyBadgerModel extends ZawaBaseModel<HoneyBadgerEntity> {
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

    public static class Adult extends HoneyBadgerModel {


        public ModelRenderer Body;
        public ModelRenderer ArmLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail2;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Nose;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Adult() {

            this.texWidth = 64;
            this.texHeight = 64;
            this.FootLeft = new ModelRenderer(this, 52, 34);
            this.FootLeft.setPos(0.0F, 3.5F, 1.3F);
            this.FootLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.46914448828868976F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 24);
            this.Hips.setPos(0.0F, 0.0F, 8.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.27366763203903305F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 10);
            this.Body.setPos(0.0F, -2.5F, 2.5F);
            this.Body.addBox(-3.5F, -0.5F, 0.0F, 7.0F, 6.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.1563815016444822F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 40, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.5F, -0.5F, 0.5F);
            this.EarRight.addBox(-1.5F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.5473352640780661F, 0.2738421523142173F);
            this.ThighRight = new ModelRenderer(this, 48, 18);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.3F, 1.5F, 1.5F);
            this.ThighRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 22, 8);
            this.Head.setPos(0.0F, 2.6F, -3.0F);
            this.Head.addBox(-2.5F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5473352640780661F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 52, 27);
            this.LegLeft.setPos(0.0F, 5.0F, -2.0F);
            this.LegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.6255260065779288F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 42, 11);
            this.Snout.setPos(0.0F, 1.6F, -1.8F);
            this.Snout.addBox(-1.5F, -2.1F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.23457224414434488F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 54, 7);
            this.ForearmLeft.setPos(0.0F, 3.0F, 1.5F);
            this.ForearmLeft.addBox(-1.0F, -0.1F, -3.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.46914448828868976F, 0.0F, 0.27366763203903305F);
            this.Neck = new ModelRenderer(this, 22, 0);
            this.Neck.setPos(0.0F, -2.0F, -2.0F);
            this.Neck.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.46914448828868976F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 36, 4);
            this.NeckLower.setPos(0.0F, 3.0F, -2.0F);
            this.NeckLower.addBox(-1.5F, -1.0F, -0.2F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.03909537541112055F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 52, 34);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 3.5F, 1.3F);
            this.FootRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.46914448828868976F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 54, 7);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 3.0F, 1.5F);
            this.ForearmRight.addBox(-1.0F, -0.1F, -3.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.46914448828868976F, 0.0F, -0.27366763203903305F);
            this.Nose = new ModelRenderer(this, 42, 15);
            this.Nose.setPos(0.0F, 0.0F, -2.0F);
            this.Nose.addBox(-1.0F, -0.2F, -1.0F, 2.0F, 2.0F, 1.0F, -0.01F, -0.2F, 0.0F);
            this.setRotateAngle(Nose, 0.1563815016444822F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 39);
            this.Tail2.setPos(0.0F, 0.0F, 2.0F);
            this.Tail2.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.27366763203903305F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 33);
            this.Tail1.setPos(0.0F, 2.5F, 4.4F);
            this.Tail1.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3127630032889644F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 41, 19);
            this.Mouth.setPos(0.0F, 1.9F, -2.0F);
            this.Mouth.addBox(-1.0F, -1.0F, -1.7F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.27366763203903305F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 48, 18);
            this.ThighLeft.setPos(2.3F, 1.5F, 1.5F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 50, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-2.5F, 0.9F, -0.5F);
            this.ArmRight.addBox(-1.4F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 32, 17);
            this.TopSnout.setPos(0.0F, -3.1F, -0.6F);
            this.TopSnout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.5864306020384839F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 52, 27);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 5.0F, -2.0F);
            this.LegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.6255260065779288F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 54, 14);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.3F, 3.2F, -1.9F);
            this.HandRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.27366763203903305F, -0.0781907508222411F, 0.19547687289441354F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 17.0F, -5.5F);
            this.Chest.addBox(-3.0F, -2.5F, -2.5F, 6.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.1563815016444822F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 40, 0);
            this.EarLeft.setPos(2.5F, -0.5F, 0.5F);
            this.EarLeft.addBox(-0.5F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.5473352640780661F, -0.2738421523142173F);
            this.ArmLeft = new ModelRenderer(this, 50, 0);
            this.ArmLeft.setPos(2.5F, 0.9F, -0.5F);
            this.ArmLeft.addBox(-1.4F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 54, 14);
            this.HandLeft.setPos(-0.3F, 3.2F, -1.9F);
            this.HandLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.27366763203903305F, 0.0781907508222411F, -0.19547687289441354F);
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.EarRight);
            this.Hips.addChild(this.ThighRight);
            this.Neck.addChild(this.Head);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.Snout);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.Neck);
            this.Neck.addChild(this.NeckLower);
            this.LegRight.addChild(this.FootRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.TopSnout.addChild(this.Nose);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.Mouth);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.ArmRight);
            this.Snout.addChild(this.TopSnout);
            this.ThighRight.addChild(this.LegRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.ArmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(HoneyBadgerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.547F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.469F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.547F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.312F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.273F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 0.75f;
                float degree = 0.75f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.469F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.547F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 17.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.156F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.156F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.273F;

                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F + 0.195F;
                this.ForearmLeft.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.469F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.195F;
                this.ForearmRight.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.469F;
                this.HandRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.117F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.0F) * 0.5F + 0.625F;
                this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.469F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.117F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F + 0.625F;
                this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.469F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.312F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.273F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }
    }

    public static class Child extends HoneyBadgerModel {


        public ModelRenderer Body;
        public ModelRenderer ArmLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail2;
        public ModelRenderer LegRight;
        public ModelRenderer FooRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {

            this.texWidth = 32;
            this.texHeight = 32;
            this.FootLeft = new ModelRenderer(this, 22, 14);
            this.FootLeft.setPos(-0.1F, 2.0F, 1.3F);
            this.FootLeft.addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.46914448828868976F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 24, 3);
            this.Snout.setPos(0.0F, 0.7F, -0.7F);
            this.Snout.addBox(-0.9F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.2343977238691606F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 13);
            this.ArmLeft.setPos(1.5F, -0.3F, 0.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.FooRight = new ModelRenderer(this, 22, 14);
            this.FooRight.mirror = true;
            this.FooRight.setPos(0.1F, 2.0F, 1.3F);
            this.FooRight.addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FooRight, -0.46914448828868976F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 16, 14);
            this.HandLeft.setPos(-0.3F, 2.0F, -1.5F);
            this.HandLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.27366763203903305F, 0.0781907508222411F, -0.19547687289441354F);
            this.Mouth = new ModelRenderer(this, 16, 19);
            this.Mouth.setPos(0.0F, 1.0F, -0.8F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.23457224414434488F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 14, 25);
            this.Body.setPos(0.0F, -1.5F, 3.5F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.27366763203903305F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 10, 14);
            this.ForearmLeft.setPos(0.1F, 2.0F, 1.0F);
            this.ForearmLeft.addBox(-0.5F, -0.1F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.46914448828868976F, 0.0F, 0.27366763203903305F);
            this.Neck = new ModelRenderer(this, 0, 8);
            this.Neck.setPos(0.0F, -1.8F, -1.0F);
            this.Neck.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.3909537457888271F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 24);
            this.Tail1.setPos(0.0F, 1.5F, 3.5F);
            this.Tail1.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3127630032889644F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 16, 14);
            this.HandRight.setPos(0.3F, 2.0F, -1.5F);
            this.HandRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.27366763203903305F, -0.0781907508222411F, 0.19547687289441354F);
            this.EarRight = new ModelRenderer(this, 21, 7);
            this.EarRight.setPos(-2.0F, -0.3F, 0.0F);
            this.EarRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.5473352640780661F, 0.11746065899211351F);
            this.ArmRight = new ModelRenderer(this, 0, 13);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.5F, -0.3F, 0.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 18);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 0.8F, 2.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 24, 10);
            this.Nose.setPos(0.0F, -1.75F, -0.4F);
            this.Nose.addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.5864306020384839F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 18);
            this.ThighLeft.setPos(2.0F, 0.8F, 2.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 10, 8);
            this.Head.setPos(0.0F, 1.9F, -1.5F);
            this.Head.addBox(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.46914448828868976F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 20.2F, -2.5F);
            this.Chest.addBox(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.1563815016444822F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 21, 7);
            this.EarLeft.setPos(2.0F, -0.3F, 0.0F);
            this.EarLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.5473352640780661F, -0.11746065899211351F);
            this.LegLeft = new ModelRenderer(this, 10, 20);
            this.LegLeft.setPos(0.0F, 3.0F, -1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.6255260065779288F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 10, 20);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 3.0F, -1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.6255260065779288F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 10, 14);
            this.ForearmRight.setPos(-0.1F, 2.0F, 1.0F);
            this.ForearmRight.addBox(-0.5F, -0.1F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.46914448828868976F, 0.0F, -0.27366763203903305F);
            this.Tail2 = new ModelRenderer(this, 0, 28);
            this.Tail2.setPos(0.0F, 0.0F, 2.0F);
            this.Tail2.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.27366763203903305F, 0.0F, 0.0F);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.ArmLeft);
            this.LegRight.addChild(this.FooRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Mouth);
            this.Chest.addChild(this.Body);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.Neck);
            this.Body.addChild(this.Tail1);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmRight);
            this.Body.addChild(this.ThighRight);
            this.Snout.addChild(this.Nose);
            this.Body.addChild(this.ThighLeft);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.EarLeft);
            this.ThighLeft.addChild(this.LegLeft);
            this.ThighRight.addChild(this.LegRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Tail1.addChild(this.Tail2); this.FootLeft = new ModelRenderer(this, 22, 14);
            this.FootLeft.setPos(-0.1F, 2.0F, 1.3F);
            this.FootLeft.addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.46914448828868976F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 24, 3);
            this.Snout.setPos(0.0F, 0.7F, -0.7F);
            this.Snout.addBox(-0.9F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.2343977238691606F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 13);
            this.ArmLeft.setPos(1.5F, -0.3F, 0.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.FooRight = new ModelRenderer(this, 22, 14);
            this.FooRight.mirror = true;
            this.FooRight.setPos(0.1F, 2.0F, 1.3F);
            this.FooRight.addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FooRight, -0.46914448828868976F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 16, 14);
            this.HandLeft.setPos(-0.3F, 2.0F, -1.5F);
            this.HandLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.27366763203903305F, 0.0781907508222411F, -0.19547687289441354F);
            this.Mouth = new ModelRenderer(this, 16, 19);
            this.Mouth.setPos(0.0F, 1.0F, -0.8F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.23457224414434488F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 14, 25);
            this.Body.setPos(0.0F, -1.5F, 3.5F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.27366763203903305F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 10, 14);
            this.ForearmLeft.setPos(0.1F, 2.0F, 1.0F);
            this.ForearmLeft.addBox(-0.5F, -0.1F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.46914448828868976F, 0.0F, 0.27366763203903305F);
            this.Neck = new ModelRenderer(this, 0, 8);
            this.Neck.setPos(0.0F, -1.8F, -1.0F);
            this.Neck.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.3909537457888271F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 24);
            this.Tail1.setPos(0.0F, 1.5F, 3.5F);
            this.Tail1.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3127630032889644F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 16, 14);
            this.HandRight.setPos(0.3F, 2.0F, -1.5F);
            this.HandRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.27366763203903305F, -0.0781907508222411F, 0.19547687289441354F);
            this.EarRight = new ModelRenderer(this, 21, 7);
            this.EarRight.setPos(-2.0F, -0.3F, 0.0F);
            this.EarRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.5473352640780661F, 0.11746065899211351F);
            this.ArmRight = new ModelRenderer(this, 0, 13);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.5F, -0.3F, 0.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 18);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 0.8F, 2.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 24, 10);
            this.Nose.setPos(0.0F, -1.75F, -0.4F);
            this.Nose.addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.5864306020384839F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 18);
            this.ThighLeft.setPos(2.0F, 0.8F, 2.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 10, 8);
            this.Head.setPos(0.0F, 1.9F, -1.5F);
            this.Head.addBox(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.46914448828868976F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 20.2F, -2.5F);
            this.Chest.addBox(-2.0F, -1.5F, -1.5F, 4.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.1563815016444822F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 21, 7);
            this.EarLeft.setPos(2.0F, -0.3F, 0.0F);
            this.EarLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.5473352640780661F, -0.11746065899211351F);
            this.LegLeft = new ModelRenderer(this, 10, 20);
            this.LegLeft.setPos(0.0F, 3.0F, -1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.6255260065779288F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 10, 20);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 3.0F, -1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.6255260065779288F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 10, 14);
            this.ForearmRight.setPos(-0.1F, 2.0F, 1.0F);
            this.ForearmRight.addBox(-0.5F, -0.1F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.46914448828868976F, 0.0F, -0.27366763203903305F);
            this.Tail2 = new ModelRenderer(this, 0, 28);
            this.Tail2.setPos(0.0F, 0.0F, 2.0F);
            this.Tail2.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.27366763203903305F, 0.0F, 0.0F);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.ArmLeft);
            this.LegRight.addChild(this.FooRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Mouth);
            this.Chest.addChild(this.Body);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.Neck);
            this.Body.addChild(this.Tail1);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmRight);
            this.Body.addChild(this.ThighRight);
            this.Snout.addChild(this.Nose);
            this.Body.addChild(this.ThighLeft);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.EarLeft);
            this.ThighLeft.addChild(this.LegLeft);
            this.ThighRight.addChild(this.LegRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Tail1.addChild(this.Tail2);
            this.saveBase();
        }

        @Override
        public void setupAnim(HoneyBadgerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.469F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.39F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.469F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.312F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.273F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 0.9f;
                float degree = 0.8f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.39F;;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.469F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 20.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.156F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F -0.273F;

                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F + 0.117F;
                this.ForearmLeft.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.469F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.273F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.117F;
                this.ForearmRight.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.469F;
                this.HandRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.273F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.0F) * 0.5F + 0.625F;
                this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.469F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F + 0.625F;
                this.FooRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.469F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.312F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.273F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }
    }
}
