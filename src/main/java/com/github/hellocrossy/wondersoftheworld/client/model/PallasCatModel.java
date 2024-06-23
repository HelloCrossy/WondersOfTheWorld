package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.PallasCatEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PallasCatModel extends ZawaBaseModel<PallasCatEntity> {
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

    public static class Adult extends PallasCatModel {

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
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer CheekRight;
        public ModelRenderer CheekLeft;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;


        public Adult() {
            texWidth = 128;
            texHeight = 64;
            this.ArmBaseRight = new ModelRenderer(this, 52, 1);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.3F, 0.2F, 0.0F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.24015730906916136F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 55, 10);
            this.ArmLeft.setPos(-0.02F, 3.7F, -1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.1563815016444822F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 23, 47);
            this.EarLeft.setPos(1.8F, -0.7F, -1.2F);
            this.EarLeft.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2499311435592658F, -0.3513347637790725F, 0.28605945374922626F);
            this.HandRight = new ModelRenderer(this, 54, 15);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 1.4F, 1.5F);
            this.HandRight.addBox(-0.98F, 0.0F, -2.6F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 16.5F, -4.7F);
            this.Chest.addBox(-3.0F, -3.5F, -2.0F, 6.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.09686577681463665F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 33, 11);
            this.UpperLegLeft.setPos(-0.1F, 5.0F, -1.7F);
            this.UpperLegLeft.addBox(-1.52F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.619591884457987F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 54, 15);
            this.HandLeft.setPos(0.0F, 1.4F, 1.5F);
            this.HandLeft.addBox(-1.02F, 0.0F, -2.6F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.017453292519943295F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 55, 10);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.02F, 3.7F, -1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.1563815016444822F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 16, 52);
            this.Head.setPos(0.0F, -4.1F, 0.2F);
            this.Head.addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.8672540813475326F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 38, 55);
            this.Snout.setPos(0.0F, -0.1F, -2.1F);
            this.Snout.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 34, 21);
            this.FootLeft.setPos(0.0F, 1.4F, -0.7F);
            this.FootLeft.addBox(-1.02F, 0.0F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.017453292519943295F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 33, 11);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 5.0F, -1.7F);
            this.UpperLegRight.addBox(-1.48F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.619591884457987F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 30);
            this.Hips.setPos(0.0F, 0.0F, 8.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3513347637790725F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 32, 2);
            this.ThighLeft.setPos(2.3F, 2.0F, 2.0F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.11222466790717915F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 32, 2);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.3F, 2.0F, 2.0F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.11222466790717915F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 36, 16);
            this.LowerLegLeft.setPos(0.4F, 1.6F, 2.9F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.40142572795869574F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 52, 1);
            this.ArmBaseLeft.setPos(2.3F, 0.2F, 0.0F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.24015730906916136F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 40, 30);
            this.Neck.setPos(0.0F, 0.0F, 0.5F);
            this.Neck.addBox(-2.0F, -5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.040390777766464F, 0.0F, 0.0F);
            this.CheekRight = new ModelRenderer(this, 8, 45);
            this.CheekRight.mirror = true;
            this.CheekRight.setPos(-2.3F, 0.6F, -0.5F);
            this.CheekRight.addBox(-1.4F, -2.0F, -2.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekRight, 0.0781907508222411F, 0.0F, 0.1738347941644255F);
            this.Mouth = new ModelRenderer(this, 39, 59);
            this.Mouth.setPos(0.0F, 1.3F, -0.2F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.6F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.CheekLeft = new ModelRenderer(this, 8, 45);
            this.CheekLeft.setPos(2.3F, 0.6F, -0.5F);
            this.CheekLeft.addBox(-1.6F, -2.0F, -2.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekLeft, 0.0781907508222411F, 0.0F, -0.1738347941644255F);
            this.Tail1 = new ModelRenderer(this, 63, 26);
            this.Tail1.setPos(0.0F, 0.0F, 4.0F);
            this.Tail1.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.6642723372774916F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 38, 39);
            this.NeckLower.setPos(0.0F, -4.9F, -1.9F);
            this.NeckLower.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -1.8732619181234471F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 63, 33);
            this.Tail2.setPos(0.0F, 4.0F, -3.0F);
            this.Tail2.addBox(-1.52F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.5082398928281348F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 13);
            this.Body.setPos(0.0F, -3.5F, 0.9F);
            this.Body.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.09686577681463665F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 36, 16);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(-0.4F, 1.6F, 2.9F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.40142572795869574F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 23, 47);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.8F, -0.7F, -1.2F);
            this.EarRight.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2499311435592658F, 0.3513347637790725F, -0.28605945374922626F);
            this.Tail3 = new ModelRenderer(this, 65, 41);
            this.Tail3.setPos(0.0F, 5.0F, 0.0F);
            this.Tail3.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.5864306020384839F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 38, 51);
            this.TopSnout.setPos(0.0F, -0.14F, -2.23F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.35779249665883756F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 34, 21);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 1.4F, -0.7F);
            this.FootRight.addBox(-0.98F, 0.0F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.EarLeft);
            this.ArmRight.addChild(this.HandRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Snout);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.Hips.addChild(this.ThighRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.CheekRight);
            this.Snout.addChild(this.Mouth);
            this.Head.addChild(this.CheekLeft);
            this.Hips.addChild(this.Tail1);
            this.Neck.addChild(this.NeckLower);
            this.Tail1.addChild(this.Tail2);
            this.Chest.addChild(this.Body);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.EarRight);
            this.Tail2.addChild(this.Tail3);
            this.Snout.addChild(this.TopSnout);
            this.LowerLegRight.addChild(this.FootRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(PallasCatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.867F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.08F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 1.04F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.08F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.867F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.664F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.508F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.6f;
                this.Chest.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.096F;
                this.Chest.y = MathHelper.cos(1.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 17.9F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.097F;
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.351F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 1.04F;
                this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.867F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.664F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F;
                this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.457F;
                this.Tail3.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.586F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.240F;
                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.5F) * 0.5F - 0.156F;
                this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.017F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.240F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.5F) * 0.5F - 0.156F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.017F;

                this.ThighLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.112F;
                this.UpperLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.4F) * 0.5F + 0.620F;
                this.LowerLegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.401F;
                this.FootLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.017F;
                this.ThighRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.112F;
                this.UpperLegRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.4F) * 0.5F + 0.620F;
                this.LowerLegRight.xRot = MathHelper.cos(0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.401F;
                this.FootRight.xRot = MathHelper.cos(1F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.017F;


            } else {
                float speed = 0.9f;
                float degree = 1.0f;
                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.096F;
                this.Chest.y = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 1.1F) * 0.5F + 17.9F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.097F;
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.351F;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F + 1.04F;
                this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.867F;
                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.664F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
                this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.457F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.240F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F - 0.156F;
                this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.017F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.240F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F - 0.156F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.017F;

                this.ThighLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.112F;
                this.UpperLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.620F;
                this.LowerLegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.401F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.017F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.112F;
                this.UpperLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.620F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.401F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.017F;
            }
        }
    }

    public static class Child extends PallasCatModel {
        public ModelRenderer BackPoint;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
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
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Snout2;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer RightCheek;
        public ModelRenderer LeftCheek;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            texWidth = 64;
            texHeight = 64;
            this.ArmBaseRight = new ModelRenderer(this, 28, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.2F, -0.1F, 1.55F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.20943951023931953F, 0.0F, 0.0F);
            this.LeftCheek = new ModelRenderer(this, 20, 18);
            this.LeftCheek.setPos(1.3F, -1.2F, -1.3F);
            this.LeftCheek.addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftCheek, 0.23457224414434488F, 0.1563815016444822F, 0.1563815016444822F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 17.7F, -4.0F);
            this.Chest.addBox(-2.5F, -2.0F, 0.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.194604204939465F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 16, 6);
            this.UpperLegLeft.setPos(-0.1F, 3.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6979571971673044F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 25, 23);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.8F, -0.8F, -0.8F);
            this.EarRight.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.273493095119092F, 0.6352998743575469F, -0.2792526803190927F);
            this.LowerLegRight = new ModelRenderer(this, 18, 10);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.02F, 2.0F, 1.8F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6979571971673044F, -0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 16, 6);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 3.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6979571971673044F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 29, 13);
            this.HandLeft.setPos(0.1F, 0.5F, 0.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.02007128598181587F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 16, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, 1.0F, 1.1F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 29, 10);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.02F, 1.8F, -0.5F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 42, 10);
            this.Tail3.setPos(0.0F, 3.0F, 0.0F);
            this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.5501277882180959F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 29, 6);
            this.ArmLeft.setPos(-0.1F, 2.85F, 0.5F);
            this.ArmLeft.addBox(-1.0F, -0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 8);
            this.Body.setPos(0.0F, 4.0F, -1.2F);
            this.Body.addBox(-3.0F, -4.0F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.18657568971450084F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 25, 23);
            this.EarLeft.setPos(0.8F, -0.8F, -0.8F);
            this.EarLeft.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.27366763203903305F, -0.6352998743575469F, 0.2792526803190927F);
            this.ArmRight = new ModelRenderer(this, 29, 6);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.1F, 2.85F, 0.5F);
            this.ArmRight.addBox(-1.0F, -0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 27);
            this.Hips.setPos(0.0F, -4.0F, 4.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.13962634015954636F, 0.0F, 0.0F);
            this.RightCheek = new ModelRenderer(this, 20, 18);
            this.RightCheek.mirror = true;
            this.RightCheek.setPos(-1.3F, -1.2F, -1.3F);
            this.RightCheek.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightCheek, 0.23457224414434488F, -0.1563815016444822F, -0.1563815016444822F);
            this.Tail1 = new ModelRenderer(this, 42, 0);
            this.Tail1.setPos(0.0F, 0.0F, 3.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.33876840514893825F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 16, 15);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.1F, 2.2F, -1.0F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.04694935787733287F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 18, 10);
            this.LowerLegLeft.setPos(-0.02F, 2.0F, 1.8F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6979571971673044F, -0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 16, 26);
            this.Head.setPos(0.0F, -0.5F, -0.9F);
            this.Head.addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.2546435405291338F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 16, 0);
            this.ThighLeft.setPos(2.2F, 1.0F, 1.1F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 29, 10);
            this.ForearmLeft.setPos(-0.02F, 1.8F, -0.5F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 17);
            this.Neck.setPos(0.0F, -0.4F, 0.2F);
            this.Neck.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.021642082891177254F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 1, 22);
            this.NeckLower.setPos(0.0F, 1.6F, 0.5F);
            this.NeckLower.addBox(-0.5F, -1.5F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.5305800859483735F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 12, 20);
            this.TopSnout.setPos(0.0F, -1.2F, -0.2F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2834414665291375F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 13, 26);
            this.Mouth.setPos(0.0F, 0.0F, -0.9F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.BackPoint = new ModelRenderer(this, 0, 0);
            this.BackPoint.setPos(0.0F, -2.0F, 4.0F);
            this.BackPoint.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackPoint, -0.019999998568980413F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 28, 0);
            this.ArmBaseLeft.setPos(2.2F, -0.1F, 1.55F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.20943951023931953F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 16, 15);
            this.FootLeft.setPos(0.1F, 2.2F, -1.0F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.04694935787733287F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 29, 13);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 0.5F, 0.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.02007128598181587F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 42, 5);
            this.Tail2.setPos(0.0F, 3.0F, -2.0F);
            this.Tail2.addBox(-1.02F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.3017674436487861F, 0.0F, 0.0F);
            this.Snout2 = new ModelRenderer(this, 11, 23);
            this.Snout2.setPos(0.0F, 0.5F, -1.9F);
            this.Snout2.addBox(-1.2F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout2, 0.2834414665291375F, 0.0F, 0.0F);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.LeftCheek);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Head.addChild(this.EarRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Hips.addChild(this.ThighRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Tail2.addChild(this.Tail3);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.BackPoint.addChild(this.Body);
            this.Head.addChild(this.EarLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.RightCheek);
            this.Hips.addChild(this.Tail1);
            this.LowerLegRight.addChild(this.FootRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.ThighLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.Neck);
            this.Neck.addChild(this.NeckLower);
            this.Snout2.addChild(this.TopSnout);
            this.Snout2.addChild(this.Mouth);
            this.Chest.addChild(this.BackPoint);
            this.Chest.addChild(this.ArmBaseLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.Snout2);
            this.saveBase();

        }

        @Override
        public void setupAnim(PallasCatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.254F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F -0.021F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.254F;
            this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.34F) * 0.5F + 0.338F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.05F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.301F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 0.8f;
                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.194F;
             //   this.Chest.y = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 18.7F;
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F -0.139F;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F -0.021F;
                this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F +  0.254F;
                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.338F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
                this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.301F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F - 0.020F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F - 0.020F;

                this.ThighLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.697F;
                this.LowerLegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.697F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.046F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.UpperLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.697F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.697F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.046F;
            }
        }
    }
}

