package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SaigaAntelopeModel extends ZawaBaseModel<SaigaAntelopeEntity> {
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

    public static class Adult extends SaigaAntelopeModel {


        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Horn1Right;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Horn1Left;
        public ModelRenderer Snout;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Snout1;
        public ModelRenderer Mouth;
        public ModelRenderer Snout2;

        public Adult() {

            texWidth = 64;
            texHeight = 64;
            this.Body = new ModelRenderer(this, 34, 30);
            this.Body.setPos(0.0F, 3.5F, 2.0F);
            this.Body.addBox(-3.5F, -7.0F, 0.0F, 7.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2609267198442009F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 6, 22);
            this.Mouth.setPos(0.0F, 2.7F, -0.7F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.8F, 2.0F, 1.0F, 2.0F, 0.08F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.30543261909900765F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 1, 0);
            this.Head.setPos(0.0F, -3.8F, -0.2F);
            this.Head.addBox(-2.0F, -2.5F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.6370451769779303F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 38, 14);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 4.8F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08699999668789724F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 50, 1);
            this.ThighLeft.setPos(2.2F, 1.8F, 3.0F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.15707963267948966F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 38, 22);
            this.ArmLeft.setPos(-0.05F, 2.8F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, -0.00999999F);
            this.UpperArmLeft = new ModelRenderer(this, 38, 14);
            this.UpperArmLeft.setPos(0.0F, 4.8F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08699999668789724F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 47);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.7F, -1.5F, -0.5F);
            this.EarRight.addBox(-1.0F, -2.5F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.5585053606381855F, 0.20943951023931953F, -1.2217304763960306F);
            this.Snout1 = new ModelRenderer(this, 14, 24);
            this.Snout1.setPos(0.0F, 0.0F, -2.0F);
            this.Snout1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout1, -1.0477211286669073F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 52, 13);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 6.0F, -1.8F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6630000120667062F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 35, 2);
            this.ArmBaseLeft.setPos(2.2F, -0.5F, -0.2F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 14, 19);
            this.Snout.setPos(0.0F, -1.9F, -2.6F);
            this.Snout.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 2.0F, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.24696408249929488F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 0, 61);
            this.Horn3Left.setPos(0.0F, -1.6F, 0.0F);
            this.Horn3Left.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.3490658503988659F, 0.0F, -0.17453292519943295F);
            this.Tail = new ModelRenderer(this, 11, 44);
            this.Tail.setPos(0.0F, 0.0F, 5.0F);
            this.Tail.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.3490658503988659F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 17, 40);
            this.Hips.setPos(0.0F, -7.0F, 8.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.20891591612425317F, -0.001745329278001762F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 0, 52);
            this.Horn1Left.setPos(1.0F, -2.3F, -1.9F);
            this.Horn1Left.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.00999999F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left, -0.3853686975087674F, -0.03490658503988659F, 0.2617993877991494F);
            this.Horn2Left = new ModelRenderer(this, 0, 56);
            this.Horn2Left.setPos(0.0F, -2.0F, 0.0F);
            this.Horn2Left.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, -0.2617993877991494F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 53, 21);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.05F, 3.0F, 3.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.7670000479017721F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 35, 2);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.2F, -0.5F, -0.2F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.Snout2 = new ModelRenderer(this, 15, 28);
            this.Snout2.setPos(0.0F, 2.0F, 0.0F);
            this.Snout2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout2, 0.7037167490777915F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 38, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.05F, 2.8F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, -0.00999999F);
            this.ThighRight = new ModelRenderer(this, 50, 1);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, 1.8F, 3.0F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.15707963267948966F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 16, 9);
            this.NeckLower.setPos(0.0F, -4.6F, -2.0F);
            this.NeckLower.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.2275909337942703F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 53, 21);
            this.LowerLegLeft.setPos(-0.05F, 3.0F, 3.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.7670000479017721F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 47);
            this.EarLeft.setPos(1.7F, -1.5F, -0.5F);
            this.EarLeft.addBox(-1.0F, -2.5F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.5585053606381855F, -0.20943951023931953F, 1.2217304763960306F);
            this.Horn3Right = new ModelRenderer(this, 0, 61);
            this.Horn3Right.setPos(0.0F, -1.6F, 0.0F);
            this.Horn3Right.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.3490658503988659F, 0.0F, 0.17453292519943295F);
            this.Neck = new ModelRenderer(this, 1, 9);
            this.Neck.setPos(0.0F, -1.5F, -1.8F);
            this.Neck.addBox(-1.5F, -5.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.075068330952604F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 0, 41);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 6.0F, -1.4F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 0, 56);
            this.Horn2Right.setPos(0.0F, -2.0F, 0.0F);
            this.Horn2Right.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, -0.2617993877991494F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 41);
            this.FootLeft.setPos(-0.1F, 6.0F, -1.4F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 52, 13);
            this.UpperLegLeft.setPos(0.0F, 6.0F, -1.8F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6630000120667062F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 0, 41);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 4.3F, 0.6F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.03909537541112055F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 0, 41);
            this.HandLeft.setPos(-0.1F, 4.3F, 0.6F);
            this.HandLeft.addBox(-1.0F, -0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.03909537541112055F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 0, 52);
            this.Horn1Right.setPos(-1.0F, -2.3F, -1.9F);
            this.Horn1Right.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.00999999F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, -0.3853686975087674F, 0.03490658503988659F, -0.2617993877991494F);
            this.Chest = new ModelRenderer(this, 14, 52);
            this.Chest.setPos(0.0F, 10.8F, -6.0F);
            this.Chest.addBox(-3.0F, -3.5F, -2.5F, 6.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.22599999464857057F, 0.0F, 0.0F);
            this.Chest.addChild(this.Body);
            this.Snout.addChild(this.Mouth);
            this.Neck.addChild(this.Head);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Hips.addChild(this.ThighLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.Snout1);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.Snout);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Hips.addChild(this.Tail);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.Horn1Left);
            this.Horn1Left.addChild(this.Horn2Left);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Snout1.addChild(this.Snout2);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Hips.addChild(this.ThighRight);
            this.Neck.addChild(this.NeckLower);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.EarLeft);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Chest.addChild(this.Neck);
            this.LowerLegRight.addChild(this.FootRight);
            this.Horn1Right.addChild(this.Horn2Right);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmRight.addChild(this.HandRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Horn1Right);
            this.saveBase();

        }

        @Override
        public void setupAnim(SaigaAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.637F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.075F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.637F;
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
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.075F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.637F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 10.8F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.226F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.261F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.209F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.349F;
                this.UpperArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.349F;
                this.UpperArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.157F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.767F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.157F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.767F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends SaigaAntelopeModel {

        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;


        public Child() {
            texWidth = 64;
            texHeight = 64;
            this.Tail = new ModelRenderer(this, 11, 44);
            this.Tail.setPos(0.0F, 0.2F, 4.0F);
            this.Tail.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.3490658503988659F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 53, 30);
            this.FootLeft.setPos(-0.1F, 4.8F, -1.4F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 12, 12);
            this.EarLeft.setPos(1.2F, -0.7F, -1.1F);
            this.EarLeft.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.5585053606381855F, -0.20943951023931953F, 1.2217304763960306F);
            this.ArmBaseLeft = new ModelRenderer(this, 35, 2);
            this.ArmBaseLeft.setPos(1.7F, -0.5F, -0.2F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 52, 13);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 4.0F, -1.3F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6630506121274178F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 20, 10);
            this.Mouth.setPos(0.0F, 1.7F, -0.4F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, -0.01999998F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.500909508638178F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 27, 36);
            this.Hips.setPos(0.0F, -5.0F, 7.0F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.20891591612425317F, -0.001745329278001762F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 38, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.05F, 2.8F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, -0.01F);
            this.LowerLegRight = new ModelRenderer(this, 53, 21);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.05F, 2.0F, 3.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.7670722195673133F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 19, 1);
            this.Snout.setPos(0.0F, -1.0F, -2.7F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.40334560078853393F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 35, 2);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.7F, -0.5F, -0.2F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 14, 52);
            this.Chest.setPos(0.0F, 14.6F, -5.3F);
            this.Chest.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2260201348043143F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 37, 27);
            this.HandLeft.setPos(-0.1F, 1.4F, 0.6F);
            this.HandLeft.addBox(-1.0F, -0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.03909537541112055F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 52, 13);
            this.UpperLegLeft.setPos(-0.1F, 4.0F, -1.3F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6630506121274178F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 50, 1);
            this.ThighLeft.setPos(1.7F, 1.4F, 1.6F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.15707963267948966F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 38, 22);
            this.ArmLeft.setPos(-0.05F, 2.8F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, -0.01F);
            this.Body = new ModelRenderer(this, 36, 49);
            this.Body.setPos(0.0F, 2.5F, 1.0F);
            this.Body.addBox(-2.5F, -5.0F, 0.0F, 5.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2609267198442009F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 38, 14);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.1F, 3.8F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08691739708221274F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 38, 14);
            this.UpperArmLeft.setPos(-0.1F, 3.8F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08691739708221274F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 50, 1);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.7F, 1.4F, 1.6F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.15707963267948966F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 53, 21);
            this.LowerLegLeft.setPos(-0.05F, 2.0F, 3.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.7670722195673133F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 53, 30);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 4.8F, -1.4F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, -2.0F, 0.8F);
            this.Head.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.6370451769779303F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 1, 9);
            this.Neck.setPos(0.0F, -0.6F, -1.8F);
            this.Neck.addBox(-1.0F, -3.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.1185814536872996F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 12, 12);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.2F, -0.7F, -1.1F);
            this.EarRight.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.5585053606381855F, 0.20943951023931953F, -1.2217304763960306F);
            this.HandRight = new ModelRenderer(this, 37, 27);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 1.4F, 0.6F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.03909537541112055F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 20, 6);
            this.TopSnout.setPos(0.0F, -0.1F, -2.0F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.2F, -0.2F, -0.2F);
            this.setRotateAngle(TopSnout, -0.7740534966278743F, 0.0F, 0.0F);
            this.Hips.addChild(this.Tail);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Snout.addChild(this.Mouth);
            this.Body.addChild(this.Hips);
            this.UpperArmRight.addChild(this.ArmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Hips.addChild(this.ThighLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.Body);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Hips.addChild(this.ThighRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.EarRight);
            this.ArmRight.addChild(this.HandRight);
            this.Snout.addChild(this.TopSnout);
            this.saveBase();
        }

        @Override
        public void setupAnim(SaigaAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.637F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.119F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.637F;

            this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.349F;
            this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.8f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.119F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.637F;
                this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.349F;
                this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 14.6F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.226F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.261F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.201F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.349F;
                this.UpperArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F -0.039F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.349F;
                this.UpperArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.087F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F -0.039F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.157F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.767F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.117F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.157F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.767F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.117F;
            }
        }
    }
}