package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class SaigaAntelopeModel extends ZawaBaseModel<SaigaAntelopeEntity> {
    protected ZawaModelRenderer MAIN;
    protected ZawaModelRenderer shape57_r1;
    protected ZawaModelRenderer shape59_r1;
    protected ZawaModelRenderer shape58_r1;
    protected ZawaModelRenderer Chest_r1;
    protected ZawaModelRenderer Neck_r1;
    protected ZawaModelRenderer NeckLower_r1;
    protected ZawaModelRenderer Body_r1;
    protected ZawaModelRenderer Hips_r1;
    protected ZawaModelRenderer ArmBaseRight_r1;
    protected ZawaModelRenderer UpperArmRight_r1;
    protected ZawaModelRenderer ArmRight_r1;
    protected ZawaModelRenderer Tail_r1;
    protected ZawaModelRenderer HandRight_r1;
    protected ZawaModelRenderer ThighRight_r1;
    protected ZawaModelRenderer UpperLegLeft_r1;
    protected ZawaModelRenderer LowerLegLeft_r1;
    protected ZawaModelRenderer FootRight_r1;
    protected ZawaModelRenderer head;
    protected ZawaModelRenderer Head_r1;
    protected ZawaModelRenderer UpperLegLeft_r2;
    protected ZawaModelRenderer LowerLegLeft_r2;
    protected ZawaModelRenderer EarLeft_r1;

    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(MAIN);
        }

        return this.parts;
    }

    public static class Adult extends SaigaAntelopeModel {

        protected ZawaModelRenderer Horn1Right_r1;
        protected ZawaModelRenderer Horn3Right_r1;
        protected ZawaModelRenderer Horn2Right_r1;
        protected ZawaModelRenderer Horn1Left_r1;
        protected ZawaModelRenderer Horn3Left_r1;
        protected ZawaModelRenderer Horn2Left_r1;
        protected ZawaModelRenderer EarRight_r1;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer LEFTFRONT;
        protected ZawaModelRenderer RIGHTFRONT;
        protected ZawaModelRenderer ArmBaseLeft_r1;
        protected ZawaModelRenderer UpperArmLeft_r1;
        protected ZawaModelRenderer ArmLeft_r1;
        protected ZawaModelRenderer HandLeft_r1;
        protected ZawaModelRenderer LEFTBACK;
        protected ZawaModelRenderer RIGHTBACK;
        protected ZawaModelRenderer ThighLeft_r1;
        protected ZawaModelRenderer FootLeft_r1;

        public Adult() {
            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 25.0114F, -3.1231F);


            head = new ZawaModelRenderer(this, 0, 0);
            head.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(head);


            Head_r1 = new ZawaModelRenderer(this, 20, 0);
            Head_r1.setPos(0.0F, -2.1804F, 4.6648F);
            head.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.2285F, 0.0F, 0.0F);
            Head_r1.addBox(-2.0F, -21.0F, -11.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

            Horn1Right_r1 = new ZawaModelRenderer(this, 28, 8);
            Horn1Right_r1.setPos(6.0007F, 2.2987F, -10.4305F);
            head.addChild(Horn1Right_r1);
            setRotateAngle(Horn1Right_r1, -0.4775F, 0.0246F, -0.2629F);
            Horn1Right_r1.addBox(-1.672F, -23.2949F, -10.2162F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            Horn3Right_r1 = new ZawaModelRenderer(this, 42, 5);
            Horn3Right_r1.setPos(2.8102F, 3.1599F, -7.3941F);
            head.addChild(Horn3Right_r1);
            setRotateAngle(Horn3Right_r1, -0.3794F, 0.1417F, -0.133F);
            Horn3Right_r1.addBox(-1.7078F, -26.5605F, -10.3029F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            Horn2Right_r1 = new ZawaModelRenderer(this, 34, 36);
            Horn2Right_r1.setPos(5.5166F, 1.1021F, -16.7897F);
            head.addChild(Horn2Right_r1);
            setRotateAngle(Horn2Right_r1, -0.7393F, 0.0246F, -0.2629F);
            Horn2Right_r1.addBox(-1.672F, -25.1961F, -10.3335F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            Horn1Left_r1 = new ZawaModelRenderer(this, 0, 15);
            Horn1Left_r1.setPos(-6.0007F, 2.2987F, -10.4305F);
            head.addChild(Horn1Left_r1);
            setRotateAngle(Horn1Left_r1, -0.4775F, -0.0246F, 0.2629F);
            Horn1Left_r1.addBox(0.672F, -23.2949F, -10.2162F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            Horn3Left_r1 = new ZawaModelRenderer(this, 0, 27);
            Horn3Left_r1.setPos(-2.8102F, 3.1599F, -7.3941F);
            head.addChild(Horn3Left_r1);
            setRotateAngle(Horn3Left_r1, -0.3794F, -0.1417F, 0.133F);
            Horn3Left_r1.addBox(0.7078F, -26.5605F, -10.3029F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            Horn2Left_r1 = new ZawaModelRenderer(this, 20, 0);
            Horn2Left_r1.setPos(-5.5166F, 1.1021F, -16.7897F);
            head.addChild(Horn2Left_r1);
            setRotateAngle(Horn2Left_r1, -0.7393F, -0.0246F, 0.2629F);
            Horn2Left_r1.addBox(0.672F, -25.1961F, -10.3335F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            shape57_r1 = new ZawaModelRenderer(this, 15, 15);
            shape57_r1.setPos(0.0F, -8.8558F, 10.016F);
            head.addChild(shape57_r1);
            setRotateAngle(shape57_r1, 0.5927F, 0.0F, 0.0F);
            shape57_r1.addBox(-1.5F, -20.9F, -13.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            shape59_r1 = new ZawaModelRenderer(this, 38, 26);
            shape59_r1.setPos(0.0F, 3.973F, -3.4241F);
            head.addChild(shape59_r1);
            setRotateAngle(shape59_r1, -0.1813F, 0.0F, 0.0F);
            shape59_r1.addBox(-1.0F, -20.9F, -13.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            shape58_r1 = new ZawaModelRenderer(this, 28, 13);
            shape58_r1.setPos(0.0F, -0.2714F, 3.4974F);
            head.addChild(shape58_r1);
            setRotateAngle(shape58_r1, 0.0918F, 0.0F, 0.0F);
            shape58_r1.addBox(-1.0F, -18.2F, -12.9F, 2.0F, 1.0F, 1.0F, 0.0F, false);

            EarRight_r1 = new ZawaModelRenderer(this, 29, 45);
            EarRight_r1.setPos(21.5431F, -10.877F, -9.8513F);
            head.addChild(EarRight_r1);
            setRotateAngle(EarRight_r1, -0.481F, 0.0057F, -1.2297F);
            EarRight_r1.addBox(-0.8027F, -25.6278F, -9.9847F, 2.0F, 3.0F, 1.0F, 0.0F, false);

            EarLeft_r1 = new ZawaModelRenderer(this, 29, 45);
            EarLeft_r1.setPos(-21.5431F, -10.877F, -9.8513F);
            head.addChild(EarLeft_r1);
            setRotateAngle(EarLeft_r1, -0.481F, -0.0057F, 1.2297F);
            EarLeft_r1.addBox(-1.4473F, -25.8778F, -9.4847F, 2.0F, 3.0F, 1.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(BODY);

            Chest_r1 = new ZawaModelRenderer(this, 0, 15);
            Chest_r1.setPos(0.0F, 0.0F, 0.0F);
            BODY.addChild(Chest_r1);
            setRotateAngle(Chest_r1, -0.2269F, 0.0F, 0.0F);
            Chest_r1.addBox(-2.5F, -16.7F, -8.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

            Neck_r1 = new ZawaModelRenderer(this, 25, 36);
            Neck_r1.setPos(0.0F, -12.4933F, 11.9573F);
            BODY.addChild(Neck_r1);
            setRotateAngle(Neck_r1, 0.8659F, 0.0F, 0.0F);
            Neck_r1.addBox(-1.5F, -19.7F, -9.3F, 3.0F, 6.0F, 3.0F, 0.0F, false);

            NeckLower_r1 = new ZawaModelRenderer(this, 0, 37);
            NeckLower_r1.setPos(0.0F, -7.8738F, 10.2768F);
            BODY.addChild(NeckLower_r1);
            setRotateAngle(NeckLower_r1, 0.6383F, 0.0F, 0.0F);
            NeckLower_r1.addBox(-1.0F, -19.3F, -9.8F, 2.0F, 7.0F, 2.0F, 0.0F, false);

            Body_r1 = new ZawaModelRenderer(this, 0, 0);
            Body_r1.setPos(0.0F, -0.7967F, 2.6206F);
            BODY.addChild(Body_r1);
            setRotateAngle(Body_r1, 0.0349F, 0.0F, 0.0F);
            Body_r1.addBox(-3.0F, -16.7F, -4.0F, 6.0F, 7.0F, 8.0F, 0.0F, false);

            Hips_r1 = new ZawaModelRenderer(this, 20, 15);
            Hips_r1.setPos(0.0F, -1.8744F, -0.8038F);
            BODY.addChild(Hips_r1);
            setRotateAngle(Hips_r1, -0.1745F, 0.0F, 0.0F);
            Hips_r1.addBox(-2.5F, -16.7F, 4.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);

            Tail_r1 = new ZawaModelRenderer(this, 45, 12);
            Tail_r1.setPos(0.0F, 1.2512F, 4.9961F);
            BODY.addChild(Tail_r1);
            setRotateAngle(Tail_r1, 0.1745F, 0.0F, 0.0F);
            Tail_r1.addBox(-1.0F, -16.7F, 8.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);

            LEFTFRONT = new ZawaModelRenderer(this, 0, 0);
            LEFTFRONT.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(LEFTFRONT);


            ArmBaseRight_r1 = new ZawaModelRenderer(this, 28, 27);
            ArmBaseRight_r1.setPos(0.0F, -1.9013F, 4.8641F);
            LEFTFRONT.addChild(ArmBaseRight_r1);
            setRotateAngle(ArmBaseRight_r1, 0.1222F, 0.0F, 0.0F);
            ArmBaseRight_r1.addBox(0.3F, -13.7F, -8.2F, 3.0F, 5.0F, 4.0F, 0.0F, false);

            UpperArmRight_r1 = new ZawaModelRenderer(this, 42, 0);
            UpperArmRight_r1.setPos(0.0F, -1.3881F, 4.1257F);
            LEFTFRONT.addChild(UpperArmRight_r1);
            setRotateAngle(UpperArmRight_r1, 0.0349F, 0.0F, 0.0F);
            UpperArmRight_r1.addBox(0.8F, -8.9F, -7.2F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            ArmRight_r1 = new ZawaModelRenderer(this, 0, 0);
            ArmRight_r1.setPos(0.0F, -1.3881F, 4.1257F);
            LEFTFRONT.addChild(ArmRight_r1);
            setRotateAngle(ArmRight_r1, 0.0349F, 0.0F, 0.0F);
            ArmRight_r1.addBox(0.75F, -6.1F, -7.2F, 2.0F, 5.0F, 2.0F, 0.0F, false);

            HandRight_r1 = new ZawaModelRenderer(this, 10, 27);
            HandRight_r1.setPos(0.0F, -1.3881F, 4.1257F);
            LEFTFRONT.addChild(HandRight_r1);
            setRotateAngle(HandRight_r1, 0.0349F, 0.0F, 0.0F);
            HandRight_r1.addBox(0.65F, -1.8F, -7.6F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            RIGHTFRONT = new ZawaModelRenderer(this, 0, 0);
            RIGHTFRONT.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(RIGHTFRONT);


            ArmBaseLeft_r1 = new ZawaModelRenderer(this, 32, 4);
            ArmBaseLeft_r1.setPos(0.0F, -1.9013F, 4.8641F);
            RIGHTFRONT.addChild(ArmBaseLeft_r1);
            setRotateAngle(ArmBaseLeft_r1, 0.1222F, 0.0F, 0.0F);
            ArmBaseLeft_r1.addBox(-3.3F, -13.7F, -8.2F, 3.0F, 5.0F, 4.0F, 0.0F, false);

            UpperArmLeft_r1 = new ZawaModelRenderer(this, 42, 31);
            UpperArmLeft_r1.setPos(0.0F, -1.3881F, 4.1257F);
            RIGHTFRONT.addChild(UpperArmLeft_r1);
            setRotateAngle(UpperArmLeft_r1, 0.0349F, 0.0F, 0.0F);
            UpperArmLeft_r1.addBox(-2.8F, -8.9F, -7.2F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            ArmLeft_r1 = new ZawaModelRenderer(this, 40, 19);
            ArmLeft_r1.setPos(0.0F, -1.3881F, 4.1257F);
            RIGHTFRONT.addChild(ArmLeft_r1);
            setRotateAngle(ArmLeft_r1, 0.0349F, 0.0F, 0.0F);
            ArmLeft_r1.addBox(-2.75F, -6.1F, -7.2F, 2.0F, 5.0F, 2.0F, 0.0F, false);

            HandLeft_r1 = new ZawaModelRenderer(this, 24, 27);
            HandLeft_r1.setPos(0.0F, -1.3881F, 4.1257F);
            RIGHTFRONT.addChild(HandLeft_r1);
            setRotateAngle(HandLeft_r1, 0.0349F, 0.0F, 0.0F);
            HandLeft_r1.addBox(-2.65F, -1.8F, -7.6F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            LEFTBACK = new ZawaModelRenderer(this, 0, 0);
            LEFTBACK.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(LEFTBACK);

            ThighRight_r1 = new ZawaModelRenderer(this, 0, 27);
            ThighRight_r1.setPos(0.0F, -0.557F, 1.4183F);
            LEFTBACK.addChild(ThighRight_r1);
            setRotateAngle(ThighRight_r1, -0.0175F, 0.0F, 0.0F);
            ThighRight_r1.addBox(0.2F, -14.9F, 5.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            UpperLegLeft_r1 = new ZawaModelRenderer(this, 35, 13);
            UpperLegLeft_r1.setPos(0.0F, 0.8724F, 7.976F);
            LEFTBACK.addChild(UpperLegLeft_r1);
            setRotateAngle(UpperLegLeft_r1, 0.6458F, 0.0F, 0.0F);
            UpperLegLeft_r1.addBox(0.7F, -8.9F, 5.2F, 2.0F, 3.0F, 3.0F, 0.0F, false);

            LowerLegLeft_r1 = new ZawaModelRenderer(this, 8, 37);
            LowerLegLeft_r1.setPos(0.0F, -3.9177F, 2.1162F);
            LEFTBACK.addChild(LowerLegLeft_r1);
            setRotateAngle(LowerLegLeft_r1, -0.1222F, 0.0F, 0.0F);
            LowerLegLeft_r1.addBox(0.65F, -5.9F, 6.2F, 2.0F, 7.0F, 2.0F, 0.0F, false);

            FootRight_r1 = new ZawaModelRenderer(this, 32, 0);
            FootRight_r1.setPos(0.0F, -2.9703F, 2.0666F);
            LEFTBACK.addChild(FootRight_r1);
            setRotateAngle(FootRight_r1, 0.0175F, 0.0F, 0.0F);
            FootRight_r1.addBox(0.55F, 0.0F, 5.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            RIGHTBACK = new ZawaModelRenderer(this, 0, 0);
            RIGHTBACK.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(RIGHTBACK);


            ThighLeft_r1 = new ZawaModelRenderer(this, 14, 27);
            ThighLeft_r1.setPos(0.0F, -0.557F, 1.4183F);
            RIGHTBACK.addChild(ThighLeft_r1);
            setRotateAngle(ThighLeft_r1, -0.0175F, 0.0F, 0.0F);
            ThighLeft_r1.addBox(-3.2F, -14.9F, 5.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            UpperLegLeft_r2 = new ZawaModelRenderer(this, 37, 36);
            UpperLegLeft_r2.setPos(0.0F, 0.8724F, 7.976F);
            RIGHTBACK.addChild(UpperLegLeft_r2);
            setRotateAngle(UpperLegLeft_r2, 0.6458F, 0.0F, 0.0F);
            UpperLegLeft_r2.addBox(-2.7F, -8.9F, 5.2F, 2.0F, 3.0F, 3.0F, 0.0F, false);

            LowerLegLeft_r2 = new ZawaModelRenderer(this, 16, 37);
            LowerLegLeft_r2.setPos(0.0F, -3.9177F, 2.1162F);
            RIGHTBACK.addChild(LowerLegLeft_r2);
            setRotateAngle(LowerLegLeft_r2, -0.1222F, 0.0F, 0.0F);
            LowerLegLeft_r2.addBox(-2.65F, -5.9F, 6.2F, 2.0F, 7.0F, 2.0F, 0.0F, false);

            FootLeft_r1 = new ZawaModelRenderer(this, 37, 42);
            FootLeft_r1.setPos(0.0F, -2.9703F, 2.0666F);
            RIGHTBACK.addChild(FootLeft_r1);
            setRotateAngle(FootLeft_r1, 0.0175F, 0.0F, 0.0F);
            FootLeft_r1.addBox(-2.55F, 0.0F, 5.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            this.saveBase();
        }

        @Override
        public void setupAnim(SaigaAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }

    public static class Child extends SaigaAntelopeModel {
        protected ZawaModelRenderer Chest;
        protected ZawaModelRenderer Leg1;
        protected ZawaModelRenderer Leg2;
        protected ZawaModelRenderer ArmBaseRight_r2;
        protected ZawaModelRenderer UpperArmRight_r2;
        protected ZawaModelRenderer ArmRight_r2;
        protected ZawaModelRenderer HandRight_r2;
        protected ZawaModelRenderer Leg3;
        protected ZawaModelRenderer Leg4;
        protected ZawaModelRenderer ThighRight_r2;
        protected ZawaModelRenderer FootRight_r2;
        protected ZawaModelRenderer EarLeft_r2;

        public Child() {
            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 0.0F, -3.0F);


            Chest = new ZawaModelRenderer(this, 0, 0);
            Chest.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Chest);


            Tail_r1 = new ZawaModelRenderer(this, 45, 12);
            Tail_r1.setPos(0.0F, 26.2626F, 1.8729F);
            Chest.addChild(Tail_r1);
            setRotateAngle(Tail_r1, 0.1745F, 0.0F, 0.0F);
            Tail_r1.addBox(-1.0F, -11.7456F, 6.8041F, 2.0F, 3.0F, 1.0F, 0.0F, false);

            Chest_r1 = new ZawaModelRenderer(this, 3, 17);
            Chest_r1.setPos(0.0F, 25.0114F, -3.1231F);
            Chest.addChild(Chest_r1);
            setRotateAngle(Chest_r1, -0.2269F, 0.0F, 0.0F);
            Chest_r1.addBox(-2.0F, -12.5269F, -2.2001F, 4.0F, 5.0F, 3.0F, 0.0F, false);

            Neck_r1 = new ZawaModelRenderer(this, 26, 36);
            Neck_r1.setPos(0.0F, 12.1929F, 8.0276F);
            Chest.addChild(Neck_r1);
            setRotateAngle(Neck_r1, 0.8659F, 0.0F, 0.0F);
            Neck_r1.addBox(-1.0F, -10.4052F, -9.4997F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            NeckLower_r1 = new ZawaModelRenderer(this, 1,37);
            NeckLower_r1.setPos(0.0F, 17.1376F, 7.1537F);
            Chest.addChild(NeckLower_r1);
            setRotateAngle(NeckLower_r1, 0.6383F, 0.0F, 0.0F);
            NeckLower_r1.addBox(-0.5F, -10.0998F, -7.8973F, 1.0F, 3.0F, 2.0F, 0.0F, false);

            Body_r1 = new ZawaModelRenderer(this, 3, 2);
            Body_r1.setPos(0.0F, 24.2147F, -0.5025F);
            Chest.addChild(Body_r1);
            setRotateAngle(Body_r1, 0.0349F, 0.0F, 0.0F);
            Body_r1.addBox(-2.5F, -11.4018F, -0.3547F, 5.0F, 5.0F, 6.0F, 0.0F, false);

            Hips_r1 = new ZawaModelRenderer(this, 23, 17);
            Hips_r1.setPos(0.0F, 23.137F, -3.9269F);
            Chest.addChild(Hips_r1);
            setRotateAngle(Hips_r1, -0.1745F, 0.0F, 0.0F);
            Hips_r1.addBox(-2.0F, -11.7456F, 6.5209F, 4.0F, 5.0F, 3.0F, 0.0F, false);

            Leg1 = new ZawaModelRenderer(this, 0, 0);
            Leg1.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Leg1);


            ArmBaseRight_r1 = new ZawaModelRenderer(this, 34, 5);
            ArmBaseRight_r1.setPos(0.0F, 23.1101F, 1.741F);
            Leg1.addChild(ArmBaseRight_r1);
            setRotateAngle(ArmBaseRight_r1, 0.1222F, 0.0F, 0.0F);
            ArmBaseRight_r1.addBox(-2.825F, -8.2075F, -3.8721F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            UpperArmRight_r1 = new ZawaModelRenderer(this, 42, 31);
            UpperArmRight_r1.setPos(0.0F, 23.6233F, 1.0026F);
            Leg1.addChild(UpperArmRight_r1);
            setRotateAngle(UpperArmRight_r1, 0.0349F, 0.0F, 0.0F);
            UpperArmRight_r1.addBox(-2.8F, -5.7544F, -3.0823F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            ArmRight_r1 = new ZawaModelRenderer(this, 40, 19);
            ArmRight_r1.setPos(0.0F, 23.6233F, 1.0026F);
            Leg1.addChild(ArmRight_r1);
            setRotateAngle(ArmRight_r1, 0.0349F, 0.0F, 0.0F);
            ArmRight_r1.addBox(-2.75F, -2.956F, -3.0775F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            HandRight_r1 = new ZawaModelRenderer(this, 10, 28);
            HandRight_r1.setPos(0.0F, 23.6233F, 1.0026F);
            Leg1.addChild(HandRight_r1);
            setRotateAngle(HandRight_r1, 0.0349F, 0.0F, 0.0F);
            HandRight_r1.addBox(-2.65F, -0.656F, -3.4775F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            Leg2 = new ZawaModelRenderer(this, 0, 0);
            Leg2.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Leg2);

            ArmBaseRight_r2 = new ZawaModelRenderer(this, 34, 5);
            ArmBaseRight_r2.setPos(0.0F, 23.1101F, 1.741F);
            Leg2.addChild(ArmBaseRight_r2);
            setRotateAngle(ArmBaseRight_r2, 0.1222F, 0.0F, 0.0F);
            ArmBaseRight_r2.addBox(0.825F, -8.2075F, -3.8721F, 2.0F, 4.0F, 3.0F, 0.0F, true);

            UpperArmRight_r2 = new ZawaModelRenderer(this, 42, 31);
            UpperArmRight_r2.setPos(0.0F, 23.6233F, 1.0026F);
            Leg2.addChild(UpperArmRight_r2);
            setRotateAngle(UpperArmRight_r2, 0.0349F, 0.0F, 0.0F);
            UpperArmRight_r2.addBox(0.8F, -5.7544F, -3.0823F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            ArmRight_r2 = new ZawaModelRenderer(this, 40, 19);
            ArmRight_r2.setPos(0.0F, 23.6233F, 1.0026F);
            Leg2.addChild(ArmRight_r2);
            setRotateAngle(ArmRight_r2, 0.0349F, 0.0F, 0.0F);
            ArmRight_r2.addBox(0.75F, -2.956F, -3.0775F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            HandRight_r2 = new ZawaModelRenderer(this, 10, 28);
            HandRight_r2.setPos(0.0F, 23.6233F, 1.0026F);
            Leg2.addChild(HandRight_r2);
            setRotateAngle(HandRight_r2, 0.0349F, 0.0F, 0.0F);
            HandRight_r2.addBox(0.65F, -0.656F, -3.4775F, 2.0F, 1.0F, 2.0F, 0.0F, true);

            Leg3 = new ZawaModelRenderer(this, 0, 0);
            Leg3.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Leg3);

            ThighRight_r1 = new ZawaModelRenderer(this, 17, 28);
            ThighRight_r1.setPos(0.0F, 24.4544F, -1.7049F);
            Leg3.addChild(ThighRight_r1);
            setRotateAngle(ThighRight_r1, -0.0175F, 0.0F, 0.0F);
            ThighRight_r1.addBox(0.7F, -8.7505F, 6.012F, 2.0F, 4.0F, 3.0F, 0.0F, true);

            UpperLegLeft_r1 = new ZawaModelRenderer(this, 38, 37);
            UpperLegLeft_r1.setPos(0.0F, 25.8838F, 4.8529F);
            Leg3.addChild(UpperLegLeft_r1);
            setRotateAngle(UpperLegLeft_r1, 0.6458F, 0.0F, 0.0F);
            UpperLegLeft_r1.addBox(0.675F, -4.5648F, 4.0636F, 2.0F, 2.0F, 2.0F, 0.0F, true);

            LowerLegLeft_r1 = new ZawaModelRenderer(this, 16, 37);
            LowerLegLeft_r1.setPos(0.0F, 21.0937F, -1.0069F);
            Leg3.addChild(LowerLegLeft_r1);
            setRotateAngle(LowerLegLeft_r1, -0.1222F, 0.0F, 0.0F);
            LowerLegLeft_r1.addBox(0.625F, -1.9792F, 6.8452F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            FootRight_r1 = new ZawaModelRenderer(this, 37, 43);
            FootRight_r1.setPos(0.0F, 22.0411F, -1.0565F);
            Leg3.addChild(FootRight_r1);
            setRotateAngle(FootRight_r1, 0.0175F, 0.0F, 0.0F);
            FootRight_r1.addBox(0.525F, 1.0113F, 6.4499F, 2.0F, 1.0F, 2.0F, 0.0F, true);

            Leg4 = new ZawaModelRenderer(this, 0, 0);
            Leg4.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Leg4);

            ThighRight_r2 = new ZawaModelRenderer(this, 17, 28);
            ThighRight_r2.setPos(0.0F, 24.4544F, -1.7049F);
            Leg4.addChild(ThighRight_r2);
            setRotateAngle(ThighRight_r2, -0.0175F, 0.0F, 0.0F);
            ThighRight_r2.addBox(-2.7F, -8.7505F, 6.012F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            UpperLegLeft_r2 = new ZawaModelRenderer(this, 38, 37);
            UpperLegLeft_r2.setPos(0.0F, 25.8838F, 4.8529F);
            Leg4.addChild(UpperLegLeft_r2);
            setRotateAngle(UpperLegLeft_r2, 0.6458F, 0.0F, 0.0F);
            UpperLegLeft_r2.addBox(-2.675F, -4.5648F, 4.0636F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            LowerLegLeft_r2 = new ZawaModelRenderer(this, 16, 37);
            LowerLegLeft_r2.setPos(0.0F, 21.0937F, -1.0069F);
            Leg4.addChild(LowerLegLeft_r2);
            setRotateAngle(LowerLegLeft_r2, -0.1222F, 0.0F, 0.0F);
            LowerLegLeft_r2.addBox(-2.625F, -1.9792F, 6.8452F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            FootRight_r2 = new ZawaModelRenderer(this, 37, 43);
            FootRight_r2.setPos(0.0F, 22.0411F, -1.0565F);
            Leg4.addChild(FootRight_r2);
            setRotateAngle(FootRight_r2, 0.0175F, 0.0F, 0.0F);
            FootRight_r2.addBox(-2.525F, 1.0113F, 6.4499F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            head = new ZawaModelRenderer(this, 0, 0);
            head.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(head);


            Head_r1 = new ZawaModelRenderer(this, 21, 1);
            Head_r1.setPos(0.0F, 22.8309F, 1.5417F);
            head.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.2285F, 0.0F, 0.0F);
            Head_r1.addBox(-1.5F, -13.4114F, -5.6291F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            shape57_r1 = new ZawaModelRenderer(this, 15, 15);
            shape57_r1.setPos(0.0F, 16.1556F, 6.8928F);
            head.addChild(shape57_r1);
            setRotateAngle(shape57_r1, 0.5927F, 0.0F, 0.0F);
            shape57_r1.addBox(-1.0F, -11.7702F, -10.2483F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            shape59_r1 = new ZawaModelRenderer(this, 39, 27);
            shape59_r1.setPos(-0.5F, 6.9223F, -14.7275F);
            head.addChild(shape59_r1);
            setRotateAngle(shape59_r1, -0.0112F, 0.0F, 0.0F);
            shape59_r1.addBox(0.0F, 5.0945F, 6.6935F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            shape58_r1 = new ZawaModelRenderer(this, 19, 33);
            shape58_r1.setPos(0.0F, 24.7399F, 0.3742F);
            head.addChild(shape58_r1);
            setRotateAngle(shape58_r1, 0.0918F, 0.0F, 0.0F);
            shape58_r1.addBox(-0.5F, -12.3932F, -6.3213F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            EarLeft_r1 = new ZawaModelRenderer(this, 29, 45);
            EarLeft_r1.setPos(-21.5431F, 20.3344F, -6.7244F);
            head.addChild(EarLeft_r1);
            setRotateAngle(EarLeft_r1, -0.481F, -0.0057F, 1.2297F);
            EarLeft_r1.addBox(-1.4473F, -24.1278F, -9.4847F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            EarLeft_r2 = new ZawaModelRenderer(this, 29, 45);
            EarLeft_r2.setPos(21.5431F, 20.3344F, -6.7244F);
            head.addChild(EarLeft_r2);
            setRotateAngle(EarLeft_r2, -0.481F, 0.0057F, -1.2297F);
            EarLeft_r2.addBox(-0.5527F, -24.1278F, -9.4847F, 2.0F, 2.0F, 1.0F, 0.0F, true);
            this.saveBase();
        }

        @Override
        public void setupAnim(SaigaAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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