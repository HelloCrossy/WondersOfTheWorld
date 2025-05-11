package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.FennecFoxEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.world.entity.Entity;
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
                float speed = 0.5f;
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
                float speed = 0.75f;
                float degree = 0.75f;
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

            this.texWidth = 32;
            this.texHeight = 16;
            this.ThighLeft = new ModelRenderer(this, 24, 10);
            this.ThighLeft.setPos(0.7F, 1.3F, 1.7F);
            this.ThighLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.03909537541112055F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 20, 13);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-0.01F, 0.9F, 1.0F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(LegRight, -1.0224139077762113F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 26, 1);
            this.Tail2.setPos(0.0F, 0.0F, 1.2F);
            this.Tail2.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.1F, 0.1F, 0.0F);
            this.setRotateAngle(Tail2, 0.2738421523142173F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 14, 13);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.02F, 1.1F, 0.4F);
            this.ArmRight.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.47123889803846897F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 19, 11);
            this.Mouth.setPos(0.0F, 0.5F, -0.5F);
            this.Mouth.addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.19547687289441354F, 0.0F, 0.0F);
            this.EarLeft_1 = new ModelRenderer(this, 22, 0);
            this.EarLeft_1.mirror = true;
            this.EarLeft_1.setPos(-1.5F, -1.0F, 0.0F);
            this.EarLeft_1.addBox(-0.5F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, -0.2F, 0.2F, 0.0F);
            this.setRotateAngle(EarLeft_1, 0.11676252795710604F, 0.3186971254089062F, -0.2275909337942703F);
            this.Tail1 = new ModelRenderer(this, 1, 12);
            this.Tail1.setPos(0.0F, 0.0F, 2.7F);
            this.Tail1.addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.3F);
            this.setRotateAngle(Tail1, -0.9773843811168246F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 12, 0);
            this.Head.setPos(0.0F, 0.9F, -1.1F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.6646214111173737F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 14, 11);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-0.8F, 0.9F, -0.4F);
            this.ArmBaseRight.addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.3F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.21781708265940905F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 24, 10);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-0.7F, 1.3F, 1.7F);
            this.ThighRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.03909537541112055F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -1.1F, 1.7F);
            this.Body.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 3.0F, -0.1F, -0.1F, 0.0F);
            this.setRotateAngle(Body, -0.11728612207217244F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 10, 14);
            this.HandLeft.setPos(0.0F, 1.7F, -0.5F);
            this.HandLeft.addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, 0.01F, -0.1F, 0.0F);
            this.setRotateAngle(HandLeft, 0.3186971254089062F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 5, 12);
            this.CheekLeft.setPos(1.1F, 1.5F, -0.7F);
            this.CheekLeft.addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, -0.11728612207217244F, 0.0781907508222411F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 22, 0);
            this.EarLeft.setPos(1.5F, -1.0F, 0.0F);
            this.EarLeft.addBox(-1.5F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, -0.2F, 0.2F, 0.0F);
            this.setRotateAngle(EarLeft, 0.11676252795710604F, -0.3186971254089062F, 0.2275909337942703F);
            this.Snout = new ModelRenderer(this, 12, 9);
            this.Snout.setPos(0.0F, 0.6F, -1.0F);
            this.Snout.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0781907508222411F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 6);
            this.Chest.setPos(0.0F, 20.4F, 0.0F);
            this.Chest.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 3.0F, -0.3F, -0.1F, 0.0F);
            this.setRotateAngle(Chest, 0.03909537541112055F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 14, 11);
            this.ArmBaseLeft.setPos(0.8F, 0.9F, -0.4F);
            this.ArmBaseLeft.addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.3F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.21781708265940905F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 14, 13);
            this.ArmLeft.setPos(-0.02F, 1.1F, 0.4F);
            this.ArmLeft.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.47123889803846897F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 28, 14);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 1.5F, -0.9F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.9897762028270176F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 10, 5);
            this.Nose.setPos(0.0F, 0.0F, 0.0F);
            this.Nose.addBox(-0.5F, -1.2F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.23457224414434488F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 10, 14);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 1.7F, -0.5F);
            this.HandRight.addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, 0.01F, -0.1F, 0.0F);
            this.setRotateAngle(HandRight, 0.3186971254089062F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 20, 4);
            this.Neck.setPos(0.0F, -1.0F, -0.5F);
            this.Neck.addBox(-1.0F, -0.6F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(Neck, -0.5864306020384839F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 28, 14);
            this.UpperLegLeft.setPos(0.0F, 1.5F, -0.9F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.9897762028270176F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 24, 14);
            this.FootLeft.setPos(-0.01F, 1.8F, -0.5F);
            this.FootLeft.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.02F, -0.1F, 0.1F);
            this.setRotateAngle(FootLeft, 0.19547687289441354F, 0.0F, 0.0F);
            this.CheekRIght = new ModelRenderer(this, 5, 12);
            this.CheekRIght.mirror = true;
            this.CheekRIght.setPos(-1.1F, 1.5F, -0.7F);
            this.CheekRIght.addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRIght, -0.11728612207217244F, -0.0781907508222411F, 0.0F);
            this.FootRight = new ModelRenderer(this, 24, 14);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.01F, 1.8F, -0.5F);
            this.FootRight.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.02F, -0.1F, 0.1F);
            this.setRotateAngle(FootRight, 0.19547687289441354F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 20, 13);
            this.LegLeft.setPos(0.01F, 0.9F, 1.0F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(LegLeft, -1.0224139077762113F, 0.0F, 0.0F);
            this.Body.addChild(this.ThighLeft);
            this.UpperLegRight.addChild(this.LegRight);
            this.Tail1.addChild(this.Tail2);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Snout.addChild(this.Mouth);
            this.Head.addChild(this.EarLeft_1);
            this.Body.addChild(this.Tail1);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.ArmBaseRight);
            this.Body.addChild(this.ThighRight);
            this.Chest.addChild(this.Body);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.CheekLeft);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Snout.addChild(this.Nose);
            this.ArmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Neck);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.LegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.CheekRIght);
            this.LegRight.addChild(this.FootRight);
            this.UpperLegLeft.addChild(this.LegLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(FennecFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.664F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.586F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.664F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.977F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.273F;
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
            } else {
                float speed = 0.9f;
                float degree = 0.8f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.586F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.664F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 20.4F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.039F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.117F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F + 0.218F;
                this.ArmLeft.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.471F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.318F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.218F;
                this.ArmRight.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.471F;
                this.HandRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.318F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.039F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.989F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 1.022F;
                this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.195F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.039F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.989F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 1.022F;
                this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.195F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.977F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.273F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

            }
        }
    }
}


 