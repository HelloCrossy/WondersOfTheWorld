package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TibetanAntelopeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
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
            this.Horn2Right = new ModelRenderer(this, 60, 38);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(0.0F, -4.0F, 0.0F);
            this.Horn2Right.addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, 0.0F, 0.0F, -0.13962634015954636F);
            this.Horn3Left = new ModelRenderer(this, 60, 34);
            this.Horn3Left.setPos(0.5F, -3.0F, 1.0F);
            this.Horn3Left.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.22689280275926282F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 48, 50);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.6F, -0.5F, 0.0F);
            this.EarRight.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 1.2482594224368004F, -0.5759586531581287F, -0.15707963267948966F);
            this.HandRight = new ModelRenderer(this, 56, 24);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 4.4F, 0.8F);
            this.HandRight.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 56, 50);
            this.EarLeft.setPos(1.6F, -0.5F, 0.0F);
            this.EarLeft.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 1.2482594224368004F, 0.5759586531581287F, 0.15707963267948966F);
            this.ArmRight = new ModelRenderer(this, 54, 9);
            this.ArmRight.setPos(-0.1F, 5.0F, 0.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.9773843811168246F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 47, 55);
            this.Head.setPos(0.0F, 0.7F, -4.9F);
            this.Head.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7435102347179734F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 13, 52);
            this.LowerLegRight.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6780603877681861F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -4.3F, 0.3F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 9.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.11344640137963141F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 0, 55);
            this.NeckLower.setPos(0.0F, 0.7F, -4.0F);
            this.NeckLower.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.18291049761952247F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 56, 42);
            this.Horn1Left.setPos(0.3F, -2.5F, -1.5F);
            this.Horn1Left.addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left, -0.24434609527920614F, -0.017453292519943295F, 0.19198621771937624F);
            this.ThighLeft = new ModelRenderer(this, 40, 35);
            this.ThighLeft.setPos(2.1F, 3.3F, 1.2F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.08726646259971647F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 22, 22);
            this.Chest.setPos(0.0F, 9.9F, -7.0F);
            this.Chest.addBox(-2.5F, -4.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.1308996938995747F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 46, 17);
            this.ForearmLeft.setPos(-0.1F, 5.0F, -2.5F);
            this.ForearmLeft.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 0, 1);
            this.Tail.setPos(0.0F, 1.0F, 4.0F);
            this.Tail.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.2792526803190927F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.4F, 12.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.24312437012913227F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 36, 0);
            this.ArmBaseLeft.setPos(2.1F, 1.5F, -1.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 1.0995574287564276F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 44, 9);
            this.ArmLeft.setPos(0.1F, 5.4F, 0.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.9773843811168246F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 36, 50);
            this.TopSnout.setPos(0.0F, -2.0F, -0.5F);
            this.TopSnout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.6255260065779288F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 21, 52);
            this.LowerLegLeft.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6780603877681861F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 60, 42);
            this.Horn1Right.mirror = true;
            this.Horn1Right.setPos(-0.3F, -2.5F, -1.5F);
            this.Horn1Right.addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, -0.24434609527920614F, 0.017453292519943295F, -0.19198621771937624F);
            this.HandLeft = new ModelRenderer(this, 46, 24);
            this.HandLeft.setPos(-0.1F, 4.4F, 0.8F);
            this.HandLeft.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 50, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.1F, 1.5F, -1.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 1.0995574287564276F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 24, 35);
            this.ThighRight.setPos(-1.9F, 3.3F, 1.2F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.08726646259971647F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 45);
            this.UpperLegRight.setPos(0.1F, 6.0F, -1.5F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.8391543363168068F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 20, 60);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 6.0F, -1.0F);
            this.FootRight.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 36, 46);
            this.Nose.setPos(0.0F, -0.2F, -3.8F);
            this.Nose.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.296705972839036F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 56, 34);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(-0.5F, -3.0F, 1.0F);
            this.Horn3Right.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.22689280275926282F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 36, 55);
            this.Snout.setPos(0.0F, 0.0F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.1F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 12, 45);
            this.UpperLegLeft.setPos(-0.1F, 6.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.8391543363168068F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 34);
            this.Neck.setPos(0.0F, -2.1F, -2.0F);
            this.Neck.addBox(-1.5F, -2.0F, -5.5F, 3.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.49148471469844207F, 0.0F, 0.0F);
            this.Horn4Right = new ModelRenderer(this, 60, 31);
            this.Horn4Right.mirror = true;
            this.Horn4Right.setPos(-0.5F, -3.0F, 0.0F);
            this.Horn4Right.addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Right, 0.19198621771937624F, 0.0F, 0.20943951023931953F);
            this.ForearmRight = new ModelRenderer(this, 56, 17);
            this.ForearmRight.setPos(0.1F, 5.0F, -2.5F);
            this.ForearmRight.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 56, 38);
            this.Horn2Left.setPos(0.0F, -4.0F, 0.0F);
            this.Horn2Left.addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, 0.0F, 0.0F, 0.13962634015954636F);
            this.Horn4Left = new ModelRenderer(this, 56, 31);
            this.Horn4Left.setPos(0.5F, -3.0F, 0.0F);
            this.Horn4Left.addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Left, 0.19198621771937624F, 0.0F, -0.20943951023931953F);
            this.FootLeft = new ModelRenderer(this, 28, 60);
            this.FootLeft.setPos(-0.1F, 6.0F, -1.0F);
            this.FootLeft.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Head.addChild(this.EarRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Neck.addChild(this.Head);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.Body);
            this.Neck.addChild(this.NeckLower);
            this.Head.addChild(this.Horn1Left);
            this.Hips.addChild(this.ThighLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Hips.addChild(this.Tail);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Snout.addChild(this.TopSnout);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.Horn1Right);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.ThighRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Snout.addChild(this.Nose);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Head.addChild(this.Snout);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Chest.addChild(this.Neck);
            this.Horn3Right.addChild(this.Horn4Right);
            this.ArmRight.addChild(this.ForearmRight);
            this.Horn1Left.addChild(this.Horn2Left);
            this.Horn3Left.addChild(this.Horn4Left);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(TibetanAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }

    public static class Child extends TibetanAntelopeModel {

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

        public Child() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Horn2Right = new ModelRenderer(this, 60, 38);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(0.0F, -4.0F, 0.0F);
            this.Horn2Right.addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, 0.0F, 0.0F, -0.13962634015954636F);
            this.Horn3Left = new ModelRenderer(this, 60, 34);
            this.Horn3Left.setPos(0.5F, -3.0F, 1.0F);
            this.Horn3Left.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.22689280275926282F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 48, 50);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.6F, -0.5F, 0.0F);
            this.EarRight.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 1.2482594224368004F, -0.5759586531581287F, -0.15707963267948966F);
            this.HandRight = new ModelRenderer(this, 56, 24);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 4.4F, 0.8F);
            this.HandRight.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 56, 50);
            this.EarLeft.setPos(1.6F, -0.5F, 0.0F);
            this.EarLeft.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 1.2482594224368004F, 0.5759586531581287F, 0.15707963267948966F);
            this.ArmRight = new ModelRenderer(this, 54, 9);
            this.ArmRight.setPos(-0.1F, 5.0F, 0.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.9773843811168246F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 47, 55);
            this.Head.setPos(0.0F, 0.7F, -4.9F);
            this.Head.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7435102347179734F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 13, 52);
            this.LowerLegRight.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6780603877681861F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -4.3F, 0.3F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 9.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.11344640137963141F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 0, 55);
            this.NeckLower.setPos(0.0F, 0.7F, -4.0F);
            this.NeckLower.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.18291049761952247F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 56, 42);
            this.Horn1Left.setPos(0.3F, -2.5F, -1.5F);
            this.Horn1Left.addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left, -0.24434609527920614F, -0.017453292519943295F, 0.19198621771937624F);
            this.ThighLeft = new ModelRenderer(this, 40, 35);
            this.ThighLeft.setPos(2.1F, 3.3F, 1.2F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.08726646259971647F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 22, 22);
            this.Chest.setPos(0.0F, 9.9F, -7.0F);
            this.Chest.addBox(-2.5F, -4.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.1308996938995747F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 46, 17);
            this.ForearmLeft.setPos(-0.1F, 5.0F, -2.5F);
            this.ForearmLeft.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 0, 1);
            this.Tail.setPos(0.0F, 1.0F, 4.0F);
            this.Tail.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.2792526803190927F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.4F, 12.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.24312437012913227F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 36, 0);
            this.ArmBaseLeft.setPos(2.1F, 1.5F, -1.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 1.0995574287564276F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 44, 9);
            this.ArmLeft.setPos(0.1F, 5.4F, 0.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.9773843811168246F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 36, 50);
            this.TopSnout.setPos(0.0F, -2.0F, -0.5F);
            this.TopSnout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.6255260065779288F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 21, 52);
            this.LowerLegLeft.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6780603877681861F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 60, 42);
            this.Horn1Right.mirror = true;
            this.Horn1Right.setPos(-0.3F, -2.5F, -1.5F);
            this.Horn1Right.addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, -0.24434609527920614F, 0.017453292519943295F, -0.19198621771937624F);
            this.HandLeft = new ModelRenderer(this, 46, 24);
            this.HandLeft.setPos(-0.1F, 4.4F, 0.8F);
            this.HandLeft.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 50, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.1F, 1.5F, -1.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 1.0995574287564276F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 24, 35);
            this.ThighRight.setPos(-1.9F, 3.3F, 1.2F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.08726646259971647F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 45);
            this.UpperLegRight.setPos(0.1F, 6.0F, -1.5F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.8391543363168068F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 20, 60);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 6.0F, -1.0F);
            this.FootRight.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 36, 46);
            this.Nose.setPos(0.0F, -0.2F, -3.8F);
            this.Nose.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.296705972839036F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 56, 34);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(-0.5F, -3.0F, 1.0F);
            this.Horn3Right.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.22689280275926282F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 36, 55);
            this.Snout.setPos(0.0F, 0.0F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.1F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 12, 45);
            this.UpperLegLeft.setPos(-0.1F, 6.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.8391543363168068F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 34);
            this.Neck.setPos(0.0F, -2.1F, -2.0F);
            this.Neck.addBox(-1.5F, -2.0F, -5.5F, 3.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.49148471469844207F, 0.0F, 0.0F);
            this.Horn4Right = new ModelRenderer(this, 60, 31);
            this.Horn4Right.mirror = true;
            this.Horn4Right.setPos(-0.5F, -3.0F, 0.0F);
            this.Horn4Right.addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Right, 0.19198621771937624F, 0.0F, 0.20943951023931953F);
            this.ForearmRight = new ModelRenderer(this, 56, 17);
            this.ForearmRight.setPos(0.1F, 5.0F, -2.5F);
            this.ForearmRight.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 56, 38);
            this.Horn2Left.setPos(0.0F, -4.0F, 0.0F);
            this.Horn2Left.addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, 0.0F, 0.0F, 0.13962634015954636F);
            this.Horn4Left = new ModelRenderer(this, 56, 31);
            this.Horn4Left.setPos(0.5F, -3.0F, 0.0F);
            this.Horn4Left.addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Left, 0.19198621771937624F, 0.0F, -0.20943951023931953F);
            this.FootLeft = new ModelRenderer(this, 28, 60);
            this.FootLeft.setPos(-0.1F, 6.0F, -1.0F);
            this.FootLeft.addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Head.addChild(this.EarRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Neck.addChild(this.Head);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.Body);
            this.Neck.addChild(this.NeckLower);
            this.Head.addChild(this.Horn1Left);
            this.Hips.addChild(this.ThighLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Hips.addChild(this.Tail);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Snout.addChild(this.TopSnout);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.Horn1Right);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.ThighRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Snout.addChild(this.Nose);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Head.addChild(this.Snout);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Chest.addChild(this.Neck);
            this.Horn3Right.addChild(this.Horn4Right);
            this.ArmRight.addChild(this.ForearmRight);
            this.Horn1Left.addChild(this.Horn2Left);
            this.Horn3Left.addChild(this.Horn4Left);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.saveBase();
    }

    @Override
    public void setupAnim(TibetanAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    @Override
    public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
    }
}
    }
