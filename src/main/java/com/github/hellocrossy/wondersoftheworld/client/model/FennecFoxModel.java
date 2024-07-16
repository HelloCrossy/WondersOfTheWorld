package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.FennecFoxEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class FennecFoxModel extends ZawaBaseModel<FennecFoxEntity> {
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

    public static class Adult extends FennecFoxModel {


        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
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
        public ModelRenderer CheekRight;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Adult() {

            this.texWidth = 64;
            this.texHeight = 64;
            this.ArmBaseLeft = new ModelRenderer(this, 19, 35);
            this.ArmBaseLeft.setPos(1.6F, 0.0F, 0.0F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.162315623764424F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 34, 0);
            this.Head.setPos(0.0F, 2.1F, -2.5F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8991936386169619F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 27, 14);
            this.ThighRight.setPos(-1.6F, 1.1F, 1.0F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 53, 10);
            this.Nose.setPos(0.0F, -0.5F, 0.0F);
            this.Nose.addBox(-0.5F, -1.2F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.23457224414434488F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 32, 23);
            this.UpperLegLeft.setPos(0.0F, 5.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -2.9F, 0.5F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.11728612207217244F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 40, 38);
            this.HandRight.setPos(0.0F, 1.5F, 0.8F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0781907508222411F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 22, 23);
            this.LowerLegLeft.setPos(0.0F, 2.6F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6829473549475088F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.0F, 7.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.23457224414434488F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 22, 23);
            this.LowerLegRight.setPos(0.0F, 2.6F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6829473549475088F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 31, 33);
            this.ForearmLeft.setPos(0.0F, 1.9F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 31);
            this.Tail1.setPos(0.0F, 0.0F, 3.0F);
            this.Tail1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.8600982340775168F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 27, 14);
            this.ThighLeft.setPos(1.6F, 1.1F, 1.0F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 32, 23);
            this.UpperLegRight.setPos(0.0F, 5.0F, -2.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 31, 33);
            this.ForearmRight.setPos(0.0F, 1.9F, -2.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 22, 30);
            this.FootRight.setPos(0.0F, 3.0F, -1.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 51, 0);
            this.EarRight.setPos(-1.9F, -2.0F, 0.0F);
            this.EarRight.addBox(-1.5F, -3.5F, 0.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.27314402127920984F, 0.3186971254089062F, -0.2275909337942703F);
            this.Tail2 = new ModelRenderer(this, 0, 39);
            this.Tail2.setPos(0.0F, 0.0F, 4.0F);
            this.Tail2.addBox(-1.5F, 0.0F, 0.1F, 3.0F, 3.0F, 6.0F, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(Tail2, 0.27436576307404054F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 17, 0);
            this.Neck.setPos(0.0F, -2.5F, -1.0F);
            this.Neck.addBox(-1.5F, -0.5F, -2.5F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6646214111173737F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 53, 14);
            this.Mouth.setPos(0.0F, 1.0F, -0.5F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.0781907508222411F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 31, 38);
            this.UpperArmLeft.setPos(0.0F, 4.0F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06475171591477989F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 40, 38);
            this.HandLeft.setPos(0.0F, 1.5F, 0.8F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0781907508222411F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 22, 30);
            this.FootLeft.setPos(0.0F, 3.0F, -1.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 51, 0);
            this.EarLeft.setPos(1.9F, -2.0F, 0.0F);
            this.EarLeft.addBox(-1.5F, -3.5F, 0.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.27314402127920984F, -0.3186971254089062F, 0.2275909337942703F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 15.3F, -4.0F);
            this.Chest.addBox(-2.5F, -3.0F, -1.5F, 5.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.11728612207217244F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 40, 8);
            this.CheekLeft.setPos(1.1F, 1.1F, -1.2F);
            this.CheekLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, -0.11728612207217244F, 0.0781907508222411F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 31, 38);
            this.UpperArmRight.setPos(0.0F, 4.0F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06475171591477989F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 30, 9);
            this.Snout.setPos(0.0F, 0.5F, -1.3F);
            this.Snout.addBox(-1.0F, -1.0F, -2.4F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0781907508222411F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 19, 35);
            this.ArmBaseRight.setPos(-1.6F, 0.0F, 0.0F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.162315623764424F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 40, 8);
            this.CheekRight.setPos(-1.1F, 1.1F, -1.2F);
            this.CheekRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, -0.11728612207217244F, -0.0781907508222411F, 0.0F);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighRight);
            this.Snout.addChild(this.Nose);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Chest.addChild(this.Body);
            this.ForearmRight.addChild(this.HandRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Body.addChild(this.Hips);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.UpperArmLeft.addChild(this.ForearmLeft);
            this.Hips.addChild(this.Tail1);
            this.Hips.addChild(this.ThighLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.UpperArmRight.addChild(this.ForearmRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarRight);
            this.Tail1.addChild(this.Tail2);
            this.Chest.addChild(this.Neck);
            this.Snout.addChild(this.Mouth);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.CheekLeft);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.CheekRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(FennecFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.899F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.665F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.899F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.860F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.274F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.75f;
                float degree = 0.5f;
                this.Neck.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.665F;
                this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.899F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -3F) * 0.5F + 15.3F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.117F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.117F;
                this.Hips.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.7F) * 0.5F + -0.235F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.860F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.1F) * 0.5F + 0.274F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.9F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.2F) * 0.5F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.162F;
                this.ArmBaseLeft.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F;
                this.ForearmLeft.xRot = MathHelper.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 0.052F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.162F;
                this.ArmBaseRight.y = MathHelper.cos(3.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F;
                this.ForearmRight.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 0.052F;
                this.HandRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.162F;

                this.ThighLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.228F;
                this.UpperLegLeft.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.683F;
                this.LowerLegLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2.0F) * 0.5F - 0.683F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.228F;
                this.UpperLegRight.xRot = MathHelper.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.683F;
                this.LowerLegRight.xRot = MathHelper.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2.0F) * 0.5F - 0.683F;
                this.FootRight.xRot = MathHelper.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F;

            } else {
                float speed = 0.9f;
                float degree = 0.8f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.665F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.899F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.3F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.117F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.117F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.235F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F + 0.162F;
                this.ForearmLeft.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.052F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.162F;
                this.ForearmRight.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.052F;
                this.HandRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.078F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.228F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.683F;
                this.LowerLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 0.683F;
                this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.228F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.683F;
                this.LowerLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.683F;
                this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.860F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.274F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

            }
        }
    }

    public static class Child extends FennecFoxModel {


        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
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
        public ModelRenderer CheekRight;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {

            this.texWidth = 64;
            this.texHeight = 64;
            this.ArmBaseLeft = new ModelRenderer(this, 19, 35);
            this.ArmBaseLeft.setPos(1.6F, 0.0F, 0.0F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.162315623764424F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 34, 0);
            this.Head.setPos(0.0F, 2.1F, -2.5F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8991936386169619F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 27, 14);
            this.ThighRight.setPos(-1.6F, 1.1F, 1.0F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 53, 10);
            this.Nose.setPos(0.0F, -0.5F, 0.0F);
            this.Nose.addBox(-0.5F, -1.2F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.23457224414434488F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 32, 23);
            this.UpperLegLeft.setPos(0.0F, 5.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -2.9F, 0.5F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.11728612207217244F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 40, 38);
            this.HandRight.setPos(0.0F, 1.5F, 0.8F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0781907508222411F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 22, 23);
            this.LowerLegLeft.setPos(0.0F, 2.6F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6829473549475088F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.0F, 7.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.23457224414434488F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 22, 23);
            this.LowerLegRight.setPos(0.0F, 2.6F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6829473549475088F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 31, 33);
            this.ForearmLeft.setPos(0.0F, 1.9F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 31);
            this.Tail1.setPos(0.0F, 0.0F, 3.0F);
            this.Tail1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.8600982340775168F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 27, 14);
            this.ThighLeft.setPos(1.6F, 1.1F, 1.0F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 32, 23);
            this.UpperLegRight.setPos(0.0F, 5.0F, -2.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 31, 33);
            this.ForearmRight.setPos(0.0F, 1.9F, -2.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 22, 30);
            this.FootRight.setPos(0.0F, 3.0F, -1.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 51, 0);
            this.EarRight.setPos(-1.9F, -2.0F, 0.0F);
            this.EarRight.addBox(-1.5F, -3.5F, 0.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.27314402127920984F, 0.3186971254089062F, -0.2275909337942703F);
            this.Tail2 = new ModelRenderer(this, 0, 39);
            this.Tail2.setPos(0.0F, 0.0F, 4.0F);
            this.Tail2.addBox(-1.5F, 0.0F, 0.1F, 3.0F, 3.0F, 6.0F, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(Tail2, 0.27436576307404054F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 17, 0);
            this.Neck.setPos(0.0F, -2.5F, -1.0F);
            this.Neck.addBox(-1.5F, -0.5F, -2.5F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6646214111173737F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 53, 14);
            this.Mouth.setPos(0.0F, 1.0F, -0.5F);
            this.Mouth.addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.0781907508222411F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 31, 38);
            this.UpperArmLeft.setPos(0.0F, 4.0F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06475171591477989F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 40, 38);
            this.HandLeft.setPos(0.0F, 1.5F, 0.8F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.4F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0781907508222411F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 22, 30);
            this.FootLeft.setPos(0.0F, 3.0F, -1.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 51, 0);
            this.EarLeft.setPos(1.9F, -2.0F, 0.0F);
            this.EarLeft.addBox(-1.5F, -3.5F, 0.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.27314402127920984F, -0.3186971254089062F, 0.2275909337942703F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 15.3F, -4.0F);
            this.Chest.addBox(-2.5F, -3.0F, -1.5F, 5.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.11728612207217244F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 40, 8);
            this.CheekLeft.setPos(1.1F, 1.1F, -1.2F);
            this.CheekLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, -0.11728612207217244F, 0.0781907508222411F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 31, 38);
            this.UpperArmRight.setPos(0.0F, 4.0F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06475171591477989F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 30, 9);
            this.Snout.setPos(0.0F, 0.5F, -1.3F);
            this.Snout.addBox(-1.0F, -1.0F, -2.4F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0781907508222411F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 19, 35);
            this.ArmBaseRight.setPos(-1.6F, 0.0F, 0.0F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.162315623764424F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 40, 8);
            this.CheekRight.setPos(-1.1F, 1.1F, -1.2F);
            this.CheekRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, -0.11728612207217244F, -0.0781907508222411F, 0.0F);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighRight);
            this.Snout.addChild(this.Nose);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Chest.addChild(this.Body);
            this.ForearmRight.addChild(this.HandRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Body.addChild(this.Hips);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.UpperArmLeft.addChild(this.ForearmLeft);
            this.Hips.addChild(this.Tail1);
            this.Hips.addChild(this.ThighLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.UpperArmRight.addChild(this.ForearmRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarRight);
            this.Tail1.addChild(this.Tail2);
            this.Chest.addChild(this.Neck);
            this.Snout.addChild(this.Mouth);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.CheekLeft);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.CheekRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(FennecFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.899F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.665F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.899F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.860F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.274F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.75f;
                float degree = 0.5f;
                this.Neck.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.665F;
                this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.899F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -3F) * 0.5F + 15.3F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.117F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.117F;
                this.Hips.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.7F) * 0.5F + -0.235F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.860F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.1F) * 0.5F + 0.274F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.9F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.2F) * 0.5F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.162F;
                this.ArmBaseLeft.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F;
                this.ForearmLeft.xRot = MathHelper.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 0.052F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.162F;
                this.ArmBaseRight.y = MathHelper.cos(3.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F;
                this.ForearmRight.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 0.052F;
                this.HandRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.162F;

                this.ThighLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.228F;
                this.UpperLegLeft.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.683F;
                this.LowerLegLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2.0F) * 0.5F - 0.683F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.228F;
                this.UpperLegRight.xRot = MathHelper.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.683F;
                this.LowerLegRight.xRot = MathHelper.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2.0F) * 0.5F - 0.683F;
                this.FootRight.xRot = MathHelper.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F;

            } else {
                float speed = 0.9f;
                float degree = 0.8f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.665F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.899F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.3F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.117F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.117F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.235F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F + 0.162F;
                this.ForearmLeft.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.052F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.162F;
                this.ForearmRight.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.052F;
                this.HandRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.078F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.228F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.683F;
                this.LowerLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 0.683F;
                this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.228F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.683F;
                this.LowerLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.683F;
                this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.860F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.274F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

            }
        }
    }
}


 