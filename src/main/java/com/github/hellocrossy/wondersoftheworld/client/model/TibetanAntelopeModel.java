package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TibetanAntelopeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;


public abstract class TibetanAntelopeModel extends ZawaBaseModel<TibetanAntelopeEntity> {
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

    public static class Adult extends TibetanAntelopeModel {


        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Horn1Left;
        public ModelRenderer Horn1Right;
        public ModelRenderer TopSnout;
        public ModelRenderer Nose;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -4.3F, 0.3F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 9.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.11344640137963141F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 56, 42);
            this.Horn1Left.setPos(0.3F, -2.5F, -1.5F);
            this.Horn1Left.addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.02F, 0.0F, 0.02F);
            this.setRotateAngle(Horn1Left, -0.24434609527920614F, -0.017453292519943295F, 0.19198621771937624F);
            this.Horn1Right = new ModelRenderer(this, 60, 42);
            this.Horn1Right.mirror = true;
            this.Horn1Right.setPos(-0.3F, -2.5F, -1.5F);
            this.Horn1Right.addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.02F, 0.0F, 0.02F);
            this.setRotateAngle(Horn1Right, -0.24434609527920614F, 0.017453292519943295F, -0.19198621771937624F);
            this.ForearmLeft = new ModelRenderer(this, 46, 17);
            this.ForearmLeft.setPos(-0.1F, 5.0F, -2.5F);
            this.ForearmLeft.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 47, 55);
            this.Head.setPos(0.0F, 0.7F, -4.9F);
            this.Head.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7435102347179734F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 46, 24);
            this.HandLeft.setPos(-0.1F, 4.4F, 0.8F);
            this.HandLeft.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 40, 35);
            this.ThighLeft.setPos(2.1F, 3.3F, 1.2F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.08726646259971647F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 34);
            this.Neck.setPos(0.0F, -2.1F, -2.0F);
            this.Neck.addBox(-1.5F, -2.0F, -5.5F, 3.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.49148471469844207F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 60, 38);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(0.0F, -4.0F, 0.0F);
            this.Horn2Right.addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, 0.0F, 0.0F, -0.13962634015954636F);
            this.Horn4Right = new ModelRenderer(this, 60, 31);
            this.Horn4Right.mirror = true;
            this.Horn4Right.setPos(-0.5F, -3.0F, 0.0F);
            this.Horn4Right.addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Right, 0.19198621771937624F, 0.0F, 0.20943951023931953F);
            this.Tail = new ModelRenderer(this, 0, 1);
            this.Tail.setPos(0.0F, 1.0F, 4.0F);
            this.Tail.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.2792526803190927F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 54, 9);
            this.ArmRight.setPos(-0.1F, 5.0F, 0.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.9773843811168246F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 12, 45);
            this.UpperLegLeft.setPos(-0.1F, 6.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.8391543363168068F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 21, 52);
            this.LowerLegLeft.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6780603877681861F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 22, 22);
            this.Chest.setPos(0.0F, 9.9F, -7.0F);
            this.Chest.addBox(-2.5F, -4.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.1308996938995747F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 36, 55);
            this.Snout.setPos(0.0F, 0.0F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.1F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 56, 24);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 4.4F, 0.8F);
            this.HandRight.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 44, 9);
            this.ArmLeft.setPos(0.1F, 5.4F, 0.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.9773843811168246F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 56, 17);
            this.ForearmRight.setPos(0.1F, 5.0F, -2.5F);
            this.ForearmRight.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 36, 0);
            this.ArmBaseLeft.setPos(2.1F, 1.5F, -1.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 1.0995574287564276F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 0, 55);
            this.NeckLower.setPos(0.0F, 0.7F, -4.0F);
            this.NeckLower.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.18291049761952247F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 56, 50);
            this.EarLeft.setPos(1.6F, -0.5F, 0.0F);
            this.EarLeft.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 1.2482594224368004F, 0.5759586531581287F, 0.15707963267948966F);
            this.Horn3Right = new ModelRenderer(this, 56, 34);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(-0.5F, -3.0F, 1.0F);
            this.Horn3Right.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.22689280275926282F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 20, 60);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 6.0F, -1.0F);
            this.FootRight.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn4Left = new ModelRenderer(this, 56, 31);
            this.Horn4Left.setPos(0.5F, -3.0F, 0.0F);
            this.Horn4Left.addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Left, 0.19198621771937624F, 0.0F, -0.20943951023931953F);
            this.ThighRight = new ModelRenderer(this, 24, 35);
            this.ThighRight.setPos(-1.9F, 3.3F, 1.2F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.08726646259971647F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 60, 34);
            this.Horn3Left.setPos(0.5F, -3.0F, 1.0F);
            this.Horn3Left.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.22689280275926282F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 36, 46);
            this.Nose.setPos(0.0F, -0.2F, -3.8F);
            this.Nose.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.296705972839036F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 50, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.1F, 1.5F, -1.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 1.0995574287564276F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 13, 52);
            this.LowerLegRight.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6780603877681861F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 36, 50);
            this.TopSnout.setPos(0.0F, -2.0F, -0.5F);
            this.TopSnout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.6255260065779288F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 48, 50);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.6F, -0.5F, 0.0F);
            this.EarRight.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 1.2482594224368004F, -0.5759586531581287F, -0.15707963267948966F);
            this.Horn2Left = new ModelRenderer(this, 56, 38);
            this.Horn2Left.setPos(0.0F, -4.0F, 0.0F);
            this.Horn2Left.addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, 0.0F, 0.0F, 0.13962634015954636F);
            this.UpperLegRight = new ModelRenderer(this, 0, 45);
            this.UpperLegRight.setPos(0.1F, 6.0F, -1.5F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.8391543363168068F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.4F, 12.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.24312437012913227F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 28, 60);
            this.FootLeft.setPos(-0.1F, 6.0F, -1.0F);
            this.FootLeft.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.Horn1Left);
            this.Head.addChild(this.Horn1Right);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Neck.addChild(this.Head);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.Neck);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Horn3Right.addChild(this.Horn4Right);
            this.Hips.addChild(this.Tail);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.Snout);
            this.ForearmRight.addChild(this.HandRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck.addChild(this.NeckLower);
            this.Head.addChild(this.EarLeft);
            this.Horn2Right.addChild(this.Horn3Right);
            this.LowerLegRight.addChild(this.FootRight);
            this.Horn3Left.addChild(this.Horn4Left);
            this.Hips.addChild(this.ThighRight);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Snout.addChild(this.Nose);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Snout.addChild(this.TopSnout);
            this.Head.addChild(this.EarRight);
            this.Horn1Left.addChild(this.Horn2Left);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Body.addChild(this.Hips);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(TibetanAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.743F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.491F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.743F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;


            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.491F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.743F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 9.9F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.130F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.113F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.243F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 1.099F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.977F;
                this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.6F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 1.099F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.977F;
                this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.6F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.087F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.839F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.678F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.087F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.839F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.678F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }


    public static class Child extends TibetanAntelopeModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer NoseLeft;
        public ModelRenderer NoseRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.ForearmLeft = new ModelRenderer(this, 26, 0);
            this.ForearmLeft.setPos(-0.05F, 3.0F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, -0.6F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.03490658503988659F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 14, 0);
            this.Tail.setPos(0.0F, 0.5F, 3.0F);
            this.Tail.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.4300491170387584F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 10, 25);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 2.6F, 2.1F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 2.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.46774822621867485F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 9, 18);
            this.Head.setPos(0.0F, 0.5F, -3.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5864306020384839F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 21);
            this.ThighLeft.setPos(1.3F, 0.8F, 1.3F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.20943951023931953F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 25);
            this.LowerLegLeft.setPos(0.0F, 2.6F, 2.1F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 2.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.46774822621867485F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 11);
            this.Chest.setPos(0.0F, 15.3F, -3.5F);
            this.Chest.addBox(-1.5F, -2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.12217304763960307F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 14, 0);
            this.Neck.setPos(0.0F, -1.7F, -0.9F);
            this.Neck.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.4007275802789315F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 0);
            this.EarLeft.setPos(0.8F, -0.9F, 1.9F);
            this.EarLeft.addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 1.064650843716541F, 0.33161255787892263F, 0.2617993877991494F);
            this.UpperLegLeft = new ModelRenderer(this, 21, 15);
            this.UpperLegLeft.setPos(-0.1F, 4.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6649704183782286F, 0.0F, 0.0F);
            this.NoseLeft = new ModelRenderer(this, 0, 4);
            this.NoseLeft.setPos(0.0F, -0.2F, -1.3F);
            this.NoseLeft.addBox(-0.3F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NoseLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 12, 11);
            this.Hips.setPos(0.0F, 0.2F, 6.0F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3909537457888271F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 23, 21);
            this.Snout.setPos(0.0F, 0.4F, -1.7F);
            this.Snout.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.1F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 25, 25);
            this.ArmLeft.setPos(-0.05F, 3.0F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.17784904345452918F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 25, 25);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.05F, 3.0F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.17784904345452918F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 21);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.3F, 0.8F, 1.3F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.20943951023931953F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 24, 12);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 2.0F, 1.2F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.05235987755982988F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 26, 0);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.05F, 3.0F, -2.0F);
            this.ForearmRight.addBox(-1.0F, -0.6F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.03490658503988659F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 21, 6);
            this.ArmBaseLeft.setPos(1.3F, -0.1F, 0.1F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3141592653589793F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 17, 21);
            this.NeckLower.setPos(0.0F, 2.0F, -2.5F);
            this.NeckLower.addBox(0.0F, -2.0F, -0.1F, 1.0F, 2.0F, 4.0F, 0.02F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.31293754020890546F, 0.0F, 0.0F);
            this.NoseRight = new ModelRenderer(this, 0, 4);
            this.NoseRight.mirror = true;
            this.NoseRight.setPos(0.0F, 0.0F, 0.0F);
            this.NoseRight.addBox(-0.7F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 24, 12);
            this.HandLeft.setPos(0.1F, 2.0F, 1.2F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.05235987755982988F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 24, 12);
            this.FootLeft.setPos(0.1F, 3.7F, 0.4F);
            this.FootLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.02617993877991494F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 24, 12);
            this.FootRight.setPos(-0.1F, 3.7F, 0.4F);
            this.FootRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.02617993877991494F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.8F, -0.9F, 1.9F);
            this.EarRight.addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 1.064650843716541F, -0.33161255787892263F, -0.2617993877991494F);
            this.ArmBaseRight = new ModelRenderer(this, 21, 6);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.3F, -0.1F, 0.1F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3141592653589793F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -2.5F, 0.5F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.12217304763960307F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 21, 15);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 4.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6649704183782286F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 9, 11);
            this.TopSnout.setPos(0.0F, -0.2F, -1.0F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.5864306020384839F, 0.0F, 0.0F);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Hips.addChild(this.Tail);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.EarLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Snout.addChild(this.NoseLeft);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.Snout);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Hips.addChild(this.ThighRight);
            this.ForearmRight.addChild(this.HandRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck.addChild(this.NeckLower);
            this.NoseLeft.addChild(this.NoseRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Chest.addChild(this.Body);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Snout.addChild(this.TopSnout);
            this.saveBase();
        }

        @Override
        public void setupAnim(TibetanAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.8f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.400F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.586F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.3F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.122F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.113F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.390F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.314F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.177F;
                this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.034F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.052F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.314F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.177F;
                this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.034F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.052F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.209F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.664F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.467F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.209F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.664F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.467F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

            }
        }
    }
}

