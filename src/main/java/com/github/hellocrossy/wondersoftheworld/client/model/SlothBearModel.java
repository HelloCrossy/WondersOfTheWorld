package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SlothBearEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SlothBearModel extends ZawaBaseModel<SlothBearEntity> {
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

    public static class Adult extends SlothBearModel {

        public ModelRenderer Body;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Head;
        public ModelRenderer NeckBase;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer CheekLeft;
        public ModelRenderer CheekRight;
        public ModelRenderer EarRight;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;


        public Adult() {
            texWidth = 64;
            texHeight = 70;
            this.Tail1 = new ModelRenderer(this, 50, 0);
            this.Tail1.setPos(0.0F, 0.0F, 2.0F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.591841146688116F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 30);
            this.ThighRight.setPos(-2.6F, 4.5F, -0.1F);
            this.ThighRight.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.04555309164612875F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 49, 26);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 4.0F, 0.5F);
            this.FootLeft.addBox(-1.5F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.18203784630933073F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 36, 0);
            this.ArmRight.setPos(-2.6F, 1.5F, 0.0F);
            this.ArmRight.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 15.0F, -5.5F);
            this.Chest.addBox(-3.5F, -3.8F, -1.5F, 7.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.27314402127920984F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 36, 56);
            this.CheekRight.setPos(-2.0F, 0.2F, 0.5F);
            this.CheekRight.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, 0.04555309164612875F, 0.2275909337942703F, -0.27314402127920984F);
            this.Neck = new ModelRenderer(this, 0, 21);
            this.Neck.setPos(0.0F, -2.8F, 0.1F);
            this.Neck.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.34540067494864435F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 49, 26);
            this.FootRight.setPos(0.1F, 4.0F, 0.5F);
            this.FootRight.addBox(-1.5F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.18203784630933073F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 40, 46);
            this.NeckBase.setPos(0.0F, 4.2F, 2.0F);
            this.NeckBase.addBox(-1.5F, -0.5F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.2925171866289913F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 1, 43);
            this.HandRight.setPos(0.1F, 4.5F, -1.0F);
            this.HandRight.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 7, 0);
            this.Body.setPos(0.0F, -3.5F, 1.0F);
            this.Body.addBox(-4.0F, -0.5F, -0.5F, 8.0F, 8.0F, 13.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.2275909337942703F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 38, 36);
            this.ForearmRight.setPos(0.0F, 3.0F, 2.5F);
            this.ForearmRight.addBox(-1.5F, -0.5F, -3.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.27314402127920984F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 16, 21);
            this.Hips.setPos(0.0F, 0.2F, 12.5F);
            this.Hips.addBox(-3.5F, -0.5F, -0.5F, 7.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.27314402127920984F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 36, 0);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(2.6F, 1.5F, 0.0F);
            this.ArmLeft.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 30);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.6F, 4.5F, -0.1F);
            this.ThighLeft.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.04555309164612875F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 53, 43);
            this.Mouth.setPos(0.0F, 2.0F, -1.4F);
            this.Mouth.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.0911061832922575F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 22, 32);
            this.LegRight.setPos(0.0F, 5.0F, -2.0F);
            this.LegRight.addBox(-1.5F, -1.0F, -0.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.3642502295386026F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 9, 50);
            this.Snout.setPos(0.0F, 2.0F, -2.0F);
            this.Snout.addBox(-1.5F, -2.0F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.11676252795710604F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 22, 32);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 5.0F, -2.0F);
            this.LegLeft.addBox(-1.5F, -1.0F, -0.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.3642502295386026F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 51, 16);
            this.EarRight.setPos(-1.0F, -1.8F, 0.4F);
            this.EarRight.addBox(-2.5F, -2.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3642502295386026F, 0.2275909337942703F, -0.5462880425584197F);
            this.Head = new ModelRenderer(this, 22, 46);
            this.Head.setPos(0.0F, 1.8F, -3.0F);
            this.Head.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.11780972450961724F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 50, 54);
            this.TopSnout.setPos(0.0F, -2.0F, -0.28F);
            this.TopSnout.addBox(-1.0F, -0.6F, -2.3F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.20141099501435536F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 38, 36);
            this.ForearmLeft.mirror = true;
            this.ForearmLeft.setPos(0.0F, 3.0F, 2.5F);
            this.ForearmLeft.addBox(-1.5F, -0.5F, -3.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.27314402127920984F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 1, 43);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 4.5F, -1.0F);
            this.HandLeft.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 51, 16);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -1.8F, 0.4F);
            this.EarLeft.addBox(-0.5F, -2.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3642502295386026F, -0.2275909337942703F, 0.5462880425584197F);
            this.CheekLeft = new ModelRenderer(this, 36, 56);
            this.CheekLeft.mirror = true;
            this.CheekLeft.setPos(2.0F, 0.2F, 0.5F);
            this.CheekLeft.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, 0.04555309164612875F, -0.2275909337942703F, 0.27314402127920984F);
            this.Hips.addChild(this.Tail1);
            this.Hips.addChild(this.ThighRight);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.ArmRight);
            this.Head.addChild(this.CheekRight);
            this.Chest.addChild(this.Neck);
            this.LegRight.addChild(this.FootRight);
            this.Neck.addChild(this.NeckBase);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Body);
            this.ArmRight.addChild(this.ForearmRight);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.Mouth);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.Snout);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.EarRight);
            this.Neck.addChild(this.Head);
            this.Snout.addChild(this.TopSnout);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.CheekLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(SlothBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * 0.1F) * 0.2F * limbSwingAmount - 0.345F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * 0.1F) * -0.4F * limbSwingAmount + 0.118F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.7f;

                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount - 0.228F;
                this.Chest.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount + 0.273F;
                this.Hips.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.273F;
                this.Head.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.046F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.364F;
                this.FootLeft.xRot = MathHelper.cos(-4.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.182F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.046F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.364F;
                this.FootRight.xRot = MathHelper.cos(-4.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.182F;

                this.ForearmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.273F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.091F;
                this.HandLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.0911F;
                this.ForearmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.273F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.091F;
                this.HandRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.0911F;

            }
        }
    }

    public static class Child extends SlothBearModel {
        public ModelRenderer Body;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Head;
        public ModelRenderer NeckBase;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer CheekLeft;
        public ModelRenderer CheekRight;
        public ModelRenderer EarRight;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;

        public Child() {
            texWidth = 64;
            texHeight = 70;
            this.Tail1 = new ModelRenderer(this, 50, 0);
            this.Tail1.setPos(0.0F, 0.0F, 2.0F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.591841146688116F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 30);
            this.ThighRight.setPos(-2.6F, 4.5F, -0.1F);
            this.ThighRight.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.04555309164612875F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 49, 26);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 4.0F, 0.5F);
            this.FootLeft.addBox(-1.5F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.18203784630933073F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 36, 0);
            this.ArmRight.setPos(-2.6F, 1.5F, 0.0F);
            this.ArmRight.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 15.0F, -5.5F);
            this.Chest.addBox(-3.5F, -3.8F, -1.5F, 7.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.27314402127920984F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 36, 56);
            this.CheekRight.setPos(-2.0F, 0.2F, 0.5F);
            this.CheekRight.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, 0.04555309164612875F, 0.2275909337942703F, -0.27314402127920984F);
            this.Neck = new ModelRenderer(this, 0, 21);
            this.Neck.setPos(0.0F, -2.8F, 0.1F);
            this.Neck.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.34540067494864435F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 49, 26);
            this.FootRight.setPos(0.1F, 4.0F, 0.5F);
            this.FootRight.addBox(-1.5F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.18203784630933073F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 40, 46);
            this.NeckBase.setPos(0.0F, 4.2F, 2.0F);
            this.NeckBase.addBox(-1.5F, -0.5F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.2925171866289913F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 1, 43);
            this.HandRight.setPos(0.1F, 4.5F, -1.0F);
            this.HandRight.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 7, 0);
            this.Body.setPos(0.0F, -3.5F, 1.0F);
            this.Body.addBox(-4.0F, -0.5F, -0.5F, 8.0F, 8.0F, 13.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.2275909337942703F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 38, 36);
            this.ForearmRight.setPos(0.0F, 3.0F, 2.5F);
            this.ForearmRight.addBox(-1.5F, -0.5F, -3.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.27314402127920984F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 16, 21);
            this.Hips.setPos(0.0F, 0.2F, 12.5F);
            this.Hips.addBox(-3.5F, -0.5F, -0.5F, 7.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.27314402127920984F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 36, 0);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(2.6F, 1.5F, 0.0F);
            this.ArmLeft.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 30);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.6F, 4.5F, -0.1F);
            this.ThighLeft.addBox(-2.0F, -0.5F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.04555309164612875F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 53, 43);
            this.Mouth.setPos(0.0F, 2.0F, -1.4F);
            this.Mouth.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.0911061832922575F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 22, 32);
            this.LegRight.setPos(0.0F, 5.0F, -2.0F);
            this.LegRight.addBox(-1.5F, -1.0F, -0.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.3642502295386026F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 9, 50);
            this.Snout.setPos(0.0F, 2.0F, -2.0F);
            this.Snout.addBox(-1.5F, -2.0F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.11676252795710604F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 22, 32);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(0.0F, 5.0F, -2.0F);
            this.LegLeft.addBox(-1.5F, -1.0F, -0.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.3642502295386026F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 51, 16);
            this.EarRight.setPos(-1.0F, -1.8F, 0.4F);
            this.EarRight.addBox(-2.5F, -2.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.3642502295386026F, 0.2275909337942703F, -0.5462880425584197F);
            this.Head = new ModelRenderer(this, 22, 46);
            this.Head.setPos(0.0F, 1.8F, -3.0F);
            this.Head.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.11780972450961724F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 50, 54);
            this.TopSnout.setPos(0.0F, -2.0F, -0.28F);
            this.TopSnout.addBox(-1.0F, -0.6F, -2.3F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.20141099501435536F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 38, 36);
            this.ForearmLeft.mirror = true;
            this.ForearmLeft.setPos(0.0F, 3.0F, 2.5F);
            this.ForearmLeft.addBox(-1.5F, -0.5F, -3.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.27314402127920984F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 1, 43);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 4.5F, -1.0F);
            this.HandLeft.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 51, 16);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -1.8F, 0.4F);
            this.EarLeft.addBox(-0.5F, -2.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.3642502295386026F, -0.2275909337942703F, 0.5462880425584197F);
            this.CheekLeft = new ModelRenderer(this, 36, 56);
            this.CheekLeft.mirror = true;
            this.CheekLeft.setPos(2.0F, 0.2F, 0.5F);
            this.CheekLeft.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, 0.04555309164612875F, -0.2275909337942703F, 0.27314402127920984F);
            this.Hips.addChild(this.Tail1);
            this.Hips.addChild(this.ThighRight);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.ArmRight);
            this.Head.addChild(this.CheekRight);
            this.Chest.addChild(this.Neck);
            this.LegRight.addChild(this.FootRight);
            this.Neck.addChild(this.NeckBase);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Body);
            this.ArmRight.addChild(this.ForearmRight);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.Mouth);
            this.ThighRight.addChild(this.LegRight);
            this.Head.addChild(this.Snout);
            this.ThighLeft.addChild(this.LegLeft);
            this.Head.addChild(this.EarRight);
            this.Neck.addChild(this.Head);
            this.Snout.addChild(this.TopSnout);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.CheekLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(SlothBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * 0.1F) * 0.2F * limbSwingAmount - 0.345F;
            this.Head.xRot = MathHelper.cos(1.0F + limbSwing * 0.1F) * -0.4F * limbSwingAmount + 0.118F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.7f;

                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount - 0.228F;
                this.Chest.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount + 0.273F;
                this.Hips.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.273F;
                this.Head.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.046F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.364F;
                this.FootLeft.xRot = MathHelper.cos(-4.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.182F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.046F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.364F;
                this.FootRight.xRot = MathHelper.cos(-4.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.182F;

                this.ForearmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.273F;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.091F;
                this.HandLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.0911F;
                this.ForearmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.273F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.091F;
                this.HandRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.0911F;

            }
        }
    }
}
