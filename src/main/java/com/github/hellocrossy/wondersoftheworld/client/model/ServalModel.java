package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import com.github.hellocrossy.wondersoftheworld.entity.ServalEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class ServalModel extends ZawaBaseModel<ServalEntity> {
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

    public static class Adult extends ServalModel {
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
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
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer SnoutLeft;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer SnoutRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Adult() {
            texWidth = 64;
            texHeight = 64;
            this.Tail1 = new ModelRenderer(this, 29, 20);
            this.Tail1.setPos(0.0F, 0.5F, 4.0F);
            this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.7819074915776542F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 22);
            this.ArmLeft.setPos(1.4F, 0.0F, -0.1F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.4174827584086242F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 10, 13);
            this.FootLeft.setPos(-0.1F, 3.6F, -0.9F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 10, 20);
            this.ThighLeft.setPos(1.4F, 1.9F, 2.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.15707963267948966F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 28, 14);
            this.LowerLegLeft.setPos(-0.1F, 3.0F, 2.4F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6646214111173737F, 0.0F, 0.0F);
            this.SnoutRight = new ModelRenderer(this, 0, 4);
            this.SnoutRight.mirror = true;
            this.SnoutRight.setPos(0.0F, 0.0F, 0.0F);
            this.SnoutRight.addBox(-0.7F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 15, 3);
            this.Mouth.setPos(0.0F, 0.4F, -0.4F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.1563815016444822F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 13);
            this.Hips.setPos(0.0F, 0.5F, 7.0F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1563815016444822F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 0, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.4F, 0.0F, -0.1F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.4174827584086242F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.setPos(-1.2F, -0.8F, 0.2F);
            this.EarRight.addBox(-1.0F, -2.9F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.20943951023931953F, 0.5864306020384839F, -0.2429498332091912F);
            this.HandLeft = new ModelRenderer(this, 15, 0);
            this.HandLeft.setPos(0.1F, 4.8F, -1.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.03490658503988659F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 8, 29);
            this.ForearmLeft.setPos(-0.1F, 5.0F, 1.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.16964600795438073F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 29, 20);
            this.Tail3.setPos(0.0F, 0.0F, 2.0F);
            this.Tail3.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.23457224414434488F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 29, 20);
            this.Tail2.setPos(0.0F, 1.0F, 2.0F);
            this.Tail2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.11728612207217244F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 10, 13);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.6F, -0.9F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 22, 20);
            this.NeckLower.setPos(-0.5F, -0.2F, -3.3F);
            this.NeckLower.addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.19547687289441354F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 28, 14);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.1F, 3.0F, 2.4F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6646214111173737F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 14, 13);
            this.Neck.setPos(0.0F, -1.1F, -1.0F);
            this.Neck.addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.45099308137849586F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 10, 20);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, 1.9F, 2.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.15707963267948966F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 22, 0);
            this.Chest.setPos(0.0F, 13.5F, -5.0F);
            this.Chest.addBox(-1.5F, -2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2792526803190927F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -2.8F, 0.0F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2738421523142173F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 15, 0);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 4.8F, -1.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.03490658503988659F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 0);
            this.EarLeft.setPos(1.2F, -0.8F, 0.2F);
            this.EarLeft.addBox(-1.0F, -2.9F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.20943951023931953F, -0.5864306020384839F, 0.2429498332091912F);
            this.UpperLegLeft = new ModelRenderer(this, 19, 27);
            this.UpperLegLeft.setPos(-0.1F, 5.0F, -1.7F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6646214111173737F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 23, 8);
            this.Head.setPos(0.0F, 0.4F, -3.4F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.9299114041572901F, 0.0F, 0.0F);
            this.SnoutLeft = new ModelRenderer(this, 0, 4);
            this.SnoutLeft.setPos(0.0F, 0.0F, -0.6F);
            this.SnoutLeft.addBox(-0.3F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 8, 29);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.1F, 5.0F, 1.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.16964600795438073F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 19, 27);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 5.0F, -1.7F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6646214111173737F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 18, 20);
            this.TopSnout.setPos(0.0F, 0.0F, -2.2F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.47752209399829293F, 0.0F, 0.0F);
            this.Hips.addChild(this.Tail1);
            this.Chest.addChild(this.ArmLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.SnoutLeft.addChild(this.SnoutRight);
            this.SnoutLeft.addChild(this.Mouth);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmRight);
            this.Head.addChild(this.EarRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Tail2.addChild(this.Tail3);
            this.Tail1.addChild(this.Tail2);
            this.LowerLegRight.addChild(this.FootRight);
            this.Neck.addChild(this.NeckLower);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.Neck);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.Body);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.SnoutLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.SnoutLeft.addChild(this.TopSnout);
            this.saveBase();
        }

        @Override
        public void setupAnim(ServalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.929F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.450F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.929F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.781F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.117F;
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
                float speed = 0.9f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.450F;
                this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.929F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -3F) * 0.5F + 13.5F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.279F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.273F;
                this.Hips.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.7F) * 0.5F - 0.156F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.781F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.1F) * 0.5F + 0.117F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.9F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.2F) * 0.5F;

                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.417F;
                this.ArmLeft.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F;
                this.ForearmLeft.xRot = MathHelper.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.169F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.034F;
                this.ArmRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.417F;
                this.ArmRight.y = MathHelper.cos(3.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F;
                this.ForearmRight.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.169F;
                this.HandRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.034F;

                this.ThighLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.157F;
                this.UpperLegLeft.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.664F;
                this.LowerLegLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2.2F) * 0.5F - 0.664F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.157F;
                this.UpperLegRight.xRot = MathHelper.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.664F;
                this.LowerLegRight.xRot = MathHelper.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2.2F) * 0.5F - 0.664F;
                this.FootRight.xRot = MathHelper.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.2F) * 0.5F;

            } else {
                float speed = 0.9f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.450F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.929F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 13.5F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.279F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.273F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.156F;

                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1F) * 0.5F + 0.417F;
                this.ForearmLeft.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.169F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.034F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.417F;
                this.ForearmRight.xRot = MathHelper.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.169F;
                this.HandRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.034F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.157F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.664F;
                this.LowerLegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.664F;
                this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.157F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.664F;
                this.LowerLegRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.664F;
                this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.781F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.117F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

            }
        }
    }

    public static class Child extends ServalModel {
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
        public ModelRenderer Snout2;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer Snout1;

        public Child() {
            texWidth = 48;
            texHeight = 32;
            this.BackPoint = new ModelRenderer(this, 0, 0);
            this.BackPoint.setPos(0.0F, -2.0F, 4.0F);
            this.BackPoint.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackPoint, -0.019999998568980413F, 0.0F, 0.0F);
            this.Snout1 = new ModelRenderer(this, 11, 23);
            this.Snout1.setPos(0.0F, 0.0F, 0.0F);
            this.Snout1.addBox(-0.8F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout1, 0.017453292519943295F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 16, 0);
            this.ThighLeft.setPos(1.4F, -2.5F, 2.3F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Snout2 = new ModelRenderer(this, 11, 23);
            this.Snout2.setPos(0.0F, 0.5F, -1.9F);
            this.Snout2.addBox(-0.2F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout2, 0.2834414665291375F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 29, 14);
            this.HandLeft.setPos(0.1F, 1.7F, 0.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.02007128598181587F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 17.7F, -4.0F);
            this.Chest.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.02007128598181587F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 16, 6);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 3.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6981317007977318F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 25, 24);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.8F, -1.0F, -0.2F);
            this.EarRight.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.273493095119092F, 0.6352998743575469F, -0.2792526803190927F);
            this.ArmBaseLeft = new ModelRenderer(this, 28, 0);
            this.ArmBaseLeft.setPos(1.4F, -0.5F, 1.65F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 12, 20);
            this.TopSnout.setPos(0.0F, -1.2F, -0.2F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2834414665291375F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 42, 5);
            this.Tail2.setPos(0.0F, 2.0F, -1.0F);
            this.Tail2.addBox(-0.52F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.27506389410904797F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 16, 10);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.02F, 2.0F, 1.8F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6981317007977318F, -0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 29, 10);
            this.ForearmLeft.setPos(-0.02F, 1.3F, -0.5F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 16, 26);
            this.Head.setPos(0.0F, -0.6F, -2.0F);
            this.Head.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8414232164074996F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 16);
            this.Neck.setPos(0.0F, -0.8F, 1.2F);
            this.Neck.addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7796385449079339F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 16, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, -2.5F, 2.3F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 42, 10);
            this.Tail3.setPos(0.0F, 2.0F, 0.0F);
            this.Tail3.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.23736478492913152F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 0, 21);
            this.NeckLower.setPos(0.0F, 1.3F, 0.5F);
            this.NeckLower.addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.2569124705540972F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 16, 15);
            this.FootLeft.setPos(0.1F, 2.4F, -1.0F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.04747295615358847F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 8);
            this.Hips.setPos(0.0F, 4.0F, -0.2F);
            this.Hips.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.04747295615358847F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 29, 6);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.1F, 2.85F, 0.5F);
            this.ArmRight.addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 29, 14);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 1.7F, 0.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.02007128598181587F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 28, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.4F, -0.5F, 1.65F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 12, 26);
            this.Mouth.setPos(0.0F, 0.0F, -0.9F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 41, 1);
            this.Tail1.setPos(0.0F, -4.0F, 4.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3450516011087622F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 29, 10);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.02F, 1.3F, -0.5F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 25, 24);
            this.EarLeft.setPos(0.8F, -1.0F, -0.2F);
            this.EarLeft.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.27366763203903305F, -0.6352998743575469F, 0.2792526803190927F);
            this.LowerLegLeft = new ModelRenderer(this, 16, 10);
            this.LowerLegLeft.setPos(-0.02F, 2.0F, 1.8F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6981317007977318F, -0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 16, 6);
            this.UpperLegLeft.setPos(-0.1F, 3.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6981317007977318F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 29, 6);
            this.ArmLeft.setPos(-0.1F, 2.85F, 0.5F);
            this.ArmLeft.addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 16, 15);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.1F, 2.4F, -1.0F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.04747295615358847F, 0.0F, 0.0F);
            this.Chest.addChild(this.BackPoint);
            this.Snout2.addChild(this.Snout1);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.Snout2);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Snout2.addChild(this.TopSnout);
            this.Tail1.addChild(this.Tail2);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Neck);
            this.Hips.addChild(this.ThighRight);
            this.Tail2.addChild(this.Tail3);
            this.Neck.addChild(this.NeckLower);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.BackPoint.addChild(this.Hips);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Snout2.addChild(this.Mouth);
            this.Hips.addChild(this.Tail1);
            this.ArmRight.addChild(this.ForearmRight);
            this.Head.addChild(this.EarLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(ServalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F -0.779F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.841F;
            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.345F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.275F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 0.75f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.779F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.841F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 17.7F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.020F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.047F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
                this.ForearmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.020F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
                this.ForearmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.020F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.698F;
                this.LowerLegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.698F;
                this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.047F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.698F;
                this.LowerLegRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.698F;
                this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.047F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.345F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.275F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
            }
        }
    }
}
