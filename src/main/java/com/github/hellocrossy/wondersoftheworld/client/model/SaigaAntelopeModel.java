package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class SaigaAntelopeModel extends ZawaBaseModel<SaigaAntelopeEntity> {
    protected ZawaModelRenderer CHEST;

    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(CHEST);
        }

        return this.parts;
    }

    public static class Adult extends SaigaAntelopeModel {


        protected ZawaModelRenderer Chest_r1;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer Body_r1;
        protected ZawaModelRenderer HIPS;
        protected ZawaModelRenderer Hips_r1;
        protected ZawaModelRenderer TAIL;
        protected ZawaModelRenderer Tail_r1;
        protected ZawaModelRenderer THIGH;
        protected ZawaModelRenderer Thigh_r1;
        protected ZawaModelRenderer UPPERLEG;
        protected ZawaModelRenderer UpperLeg_r1;
        protected ZawaModelRenderer LOWERLEG;
        protected ZawaModelRenderer LowerLeg_r1;
        protected ZawaModelRenderer FOOT;
        protected ZawaModelRenderer Foot_r1;
        protected ZawaModelRenderer THIGH2;
        protected ZawaModelRenderer Thigh_r2;
        protected ZawaModelRenderer UPPERLEG2;
        protected ZawaModelRenderer UpperLeg_r2;
        protected ZawaModelRenderer LOWERLEG2;
        protected ZawaModelRenderer LowerLeg_r2;
        protected ZawaModelRenderer FOOT2;
        protected ZawaModelRenderer NECK;
        protected ZawaModelRenderer NeckBase_r1;
        protected ZawaModelRenderer Neck_r1;
        protected ZawaModelRenderer HEAD;
        protected ZawaModelRenderer Ear1_r1;
        protected ZawaModelRenderer Ear2_r1;
        protected ZawaModelRenderer Snout_r1;
        protected ZawaModelRenderer Snout_r2;
        protected ZawaModelRenderer UpperSnout_r1;
        protected ZawaModelRenderer LeftHorn2_r1;
        protected ZawaModelRenderer LerftHorn3_r1;
        protected ZawaModelRenderer LeftHorn1_r1;
        protected ZawaModelRenderer RightHorn2_r1;
        protected ZawaModelRenderer RightHorn3_r1;
        protected ZawaModelRenderer RightHorn1_r1;
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer ARMBASE;
        protected ZawaModelRenderer ArmBase_r1;
        protected ZawaModelRenderer ARM;
        protected ZawaModelRenderer Arm_r1;
        protected ZawaModelRenderer FOREARM;
        protected ZawaModelRenderer ForeArm_r1;
        protected ZawaModelRenderer HAND;
        protected ZawaModelRenderer ARMBASE2;
        protected ZawaModelRenderer ArmBase_r2;
        protected ZawaModelRenderer ARM2;
        protected ZawaModelRenderer Arm_r2;
        protected ZawaModelRenderer FOREARM2;
        protected ZawaModelRenderer ForeArm_r2;
        protected ZawaModelRenderer HAND2;

        public Adult() {

            texWidth = 64;
            texHeight = 64;

            CHEST = new ZawaModelRenderer(this, 0, 0);
            CHEST.setPos(0.0F, 10.8F, -5.9999F);


            Chest_r1 = new ZawaModelRenderer(this, 0, 15);
            Chest_r1.setPos(0.0F, 0.0F, 0.0F);
            CHEST.addChild(Chest_r1);
            setRotateAngle(Chest_r1, -0.2269F, 0.0F, 0.0F);
            Chest_r1.addBox(-2.5F, -3.5F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(0.0F, -3.1674F, 1.7921F);
            CHEST.addChild(BODY);

            Body_r1 = new ZawaModelRenderer(this, 0, 0);
            Body_r1.setPos(0.0F, 16.35F, 4.2F);
            BODY.addChild(Body_r1);
            setRotateAngle(Body_r1, 0.0349F, 0.0F, 0.0F);
            Body_r1.addBox(-3.0F, -16.4853F, -4.5025F, 6.0F, 7.0F, 8.0F, 0.0F, false);

            HIPS = new ZawaModelRenderer(this, 0, 0);
            HIPS.setPos(0.0F, -0.2639F, 7.0983F);
            BODY.addChild(HIPS);

            Hips_r1 = new ZawaModelRenderer(this, 20, 15);
            Hips_r1.setPos(0.0F, 17.3F, -3.1F);
            HIPS.addChild(Hips_r1);
            setRotateAngle(Hips_r1, -0.1745F, 0.0F, 0.0F);
            Hips_r1.addBox(-2.5F, -17.563F, 0.0731F, 5.0F, 7.0F, 5.0F, 0.0F, false);

            TAIL = new ZawaModelRenderer(this, 0, 0);
            TAIL.setPos(0.0F, 1.3409F, 4.7451F);
            HIPS.addChild(TAIL);

            Tail_r1 = new ZawaModelRenderer(this, 45, 12);
            Tail_r1.setPos(0.0F, 15.65F, -8.0F);
            TAIL.addChild(Tail_r1);
            setRotateAngle(Tail_r1, 0.1745F, 0.0F, 0.0F);
            Tail_r1.addBox(-1.0F, -14.4374F, 9.873F, 2.0F, 5.0F, 1.0F, 0.0F, false);

            THIGH = new ZawaModelRenderer(this, 0, 0);
            THIGH.setPos(0.0F, 2.3375F, 2.8436F);
            HIPS.addChild(THIGH);

            Thigh_r1 = new ZawaModelRenderer(this, 0, 27);
            Thigh_r1.setPos(0.0F, 14.3237F, -5.7264F);
            THIGH.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, -0.0175F, 0.0F, 0.0F);
            Thigh_r1.addBox(0.2F, -14.4456F, 3.2952F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            UPPERLEG = new ZawaModelRenderer(this, 0, 0);
            UPPERLEG.setPos(0.0F, 5.95F, -2.075F);
            THIGH.addChild(UPPERLEG);

            UpperLeg_r1 = new ZawaModelRenderer(this, 35, 13);
            UpperLeg_r1.setPos(0.0F, 11.6438F, -3.8156F);
            UPPERLEG.addChild(UpperLeg_r1);
            setRotateAngle(UpperLeg_r1, 0.6458F, 0.0F, 0.0F);
            UpperLeg_r1.addBox(0.7F, -7.0162F, 10.0529F, 2.0F, 3.0F, 3.0F, 0.0F, false);

            LOWERLEG = new ZawaModelRenderer(this, 0, 0);
            LOWERLEG.setPos(0.0F, 0.6F, 4.175F);
            UPPERLEG.addChild(LOWERLEG);

            LowerLeg_r1 = new ZawaModelRenderer(this, 8, 37);
            LowerLeg_r1.setPos(0.0F, 7.8449F, -8.1959F);
            LOWERLEG.addChild(LowerLeg_r1);
            setRotateAngle(LowerLeg_r1, -0.1222F, 0.0F, 0.0F);
            LowerLeg_r1.addBox(0.65F, -8.8063F, 5.1931F, 2.0F, 7.0F, 2.0F, 0.0F, false);

            FOOT = new ZawaModelRenderer(this, 0, 0);
            FOOT.setPos(0.0F, 6.225F, -1.575F);
            LOWERLEG.addChild(FOOT);

            Foot_r1 = new ZawaModelRenderer(this, 32, 0);
            Foot_r1.setPos(1.55F, 0.4407F, -0.4992F);
            FOOT.addChild(Foot_r1);
            setRotateAngle(Foot_r1, 0.0F, 0.0F, 0.0F);
            Foot_r1.addBox(-1.0F, -0.925F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            THIGH2 = new ZawaModelRenderer(this, 0, 0);
            THIGH2.setPos(0.0F, 2.3375F, 2.8436F);
            HIPS.addChild(THIGH2);

            Thigh_r2 = new ZawaModelRenderer(this, 0, 27);
            Thigh_r2.setPos(0.0F, 14.3237F, -5.7264F);
            THIGH2.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, -0.0175F, 0.0F, 0.0F);
            Thigh_r2.addBox(-3.2F, -14.4456F, 3.2952F, 3.0F, 6.0F, 4.0F, 0.0F, true);

            UPPERLEG2 = new ZawaModelRenderer(this, 0, 0);
            UPPERLEG2.setPos(0.0F, 5.95F, -2.075F);
            THIGH2.addChild(UPPERLEG2);

            UpperLeg_r2 = new ZawaModelRenderer(this, 35, 13);
            UpperLeg_r2.setPos(0.0F, 11.6438F, -3.8156F);
            UPPERLEG2.addChild(UpperLeg_r2);
            setRotateAngle(UpperLeg_r2, 0.6458F, 0.0F, 0.0F);
            UpperLeg_r2.addBox(-2.7F, -7.0162F, 10.0529F, 2.0F, 3.0F, 3.0F, 0.0F, true);

            LOWERLEG2 = new ZawaModelRenderer(this, 0, 0);
            LOWERLEG2.setPos(0.0F, 0.6F, 4.175F);
            UPPERLEG2.addChild(LOWERLEG2);

            LowerLeg_r2 = new ZawaModelRenderer(this, 8, 37);
            LowerLeg_r2.setPos(0.0F, 7.8449F, -8.1959F);
            LOWERLEG2.addChild(LowerLeg_r2);
            setRotateAngle(LowerLeg_r2, -0.1222F, 0.0F, 0.0F);
            LowerLeg_r2.addBox(-2.65F, -8.8063F, 5.1931F, 2.0F, 7.0F, 2.0F, 0.0F, true);

            FOOT2 = new ZawaModelRenderer(this, 32, 0);
            FOOT2.setPos(0.0F, 6.225F, -1.575F);
            LOWERLEG2.addChild(FOOT2);
            FOOT2.addBox(-2.55F, -0.4843F, -1.4992F, 2.0F, 2.0F, 2.0F, 0.0F, true);

            NECK = new ZawaModelRenderer(this, 0, 0);
            NECK.setPos(0.0F, -0.8887F, -1.5028F);
            CHEST.addChild(NECK);

            NeckBase_r1 = new ZawaModelRenderer(this, 25, 36);
            NeckBase_r1.setPos(0.0F, 16.7754F, 19.3582F);
            NECK.addChild(NeckBase_r1);
            setRotateAngle(NeckBase_r1, 0.8659F, 0.0F, 0.0F);
            NeckBase_r1.addBox(-1.5F, -31.1819F, -0.4658F, 3.0F, 6.0F, 3.0F, 0.0F, false);

            Neck_r1 = new ZawaModelRenderer(this, 0, 37);
            Neck_r1.setPos(0.0F, 17.0F, 13.0F);
            NECK.addChild(Neck_r1);
            setRotateAngle(Neck_r1, 0.6383F, 0.0F, 0.0F);
            Neck_r1.addBox(-1.0F, -26.1624F, -2.6463F, 2.0F, 7.0F, 2.0F, 0.0F, false);

            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, -3.5478F, -3.0255F);
            NECK.addChild(HEAD);

            Ear1_r1 = new ZawaModelRenderer(this, 29, 45);
            Ear1_r1.setPos(-28.2491F, 32.9691F, 4.6142F);
            HEAD.addChild(Ear1_r1);
            setRotateAngle(Ear1_r1, -0.481F, -0.0057F, 1.2297F);
            Ear1_r1.addBox(-22.9904F, -35.7434F, -22.4591F, 2.0F, 3.0F, 1.0F, 0.0F, false);

            Ear2_r1 = new ZawaModelRenderer(this, 29, 45);
            Ear2_r1.setPos(28.2491F, 32.9691F, 4.6142F);
            HEAD.addChild(Ear2_r1);
            setRotateAngle(Ear2_r1, -0.481F, 0.0057F, -1.2297F);
            Ear2_r1.addBox(20.7404F, -35.4934F, -22.9591F, 2.0F, 3.0F, 1.0F, 0.0F, false);

            Snout_r1 = new ZawaModelRenderer(this, 28, 13);
            Snout_r1.setPos(0.0F, 17.6739F, 10.4619F);
            HEAD.addChild(Snout_r1);
            setRotateAngle(Snout_r1, 0.0918F, 0.0F, 0.0F);
            Snout_r1.addBox(-1.0F, -17.46F, -12.5257F, 2.0F, 1.0F, 1.0F, 0.0F, false);

            Snout_r2 = new ZawaModelRenderer(this, 38, 26);
            Snout_r2.setPos(0.0F, 18.8987F, 11.3196F);
            HEAD.addChild(Snout_r2);
            setRotateAngle(Snout_r2, -0.1813F, 0.0F, 0.0F);
            Snout_r2.addBox(-1.0F, -15.9156F, -19.5472F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            UpperSnout_r1 = new ZawaModelRenderer(this, 15, 15);
            UpperSnout_r1.setPos(0.0F, 20.1489F, 16.0858F);
            HEAD.addChild(UpperSnout_r1);
            setRotateAngle(UpperSnout_r1, 0.5927F, 0.0F, 0.0F);
            UpperSnout_r1.addBox(-1.5F, -28.7444F, -6.1071F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            LeftHorn2_r1 = new ZawaModelRenderer(this, 20, 0);
            LeftHorn2_r1.setPos(-3.6554F, 32.5277F, 6.8846F);
            HEAD.addChild(LeftHorn2_r1);
            setRotateAngle(LeftHorn2_r1, -0.7393F, -0.0246F, 0.2629F);
            LeftHorn2_r1.addBox(-4.8446F, -23.0826F, -30.2463F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            LerftHorn3_r1 = new ZawaModelRenderer(this, 0, 27);
            LerftHorn3_r1.setPos(-1.6392F, 21.9852F, 11.6087F);
            HEAD.addChild(LerftHorn3_r1);
            setRotateAngle(LerftHorn3_r1, -0.3794F, -0.1417F, 0.133F);
            LerftHorn3_r1.addBox(-2.1024F, -22.3892F, -20.8201F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            LeftHorn1_r1 = new ZawaModelRenderer(this, 0, 15);
            LeftHorn1_r1.setPos(-1.3847F, 25.5948F, 10.6769F);
            HEAD.addChild(LeftHorn1_r1);
            setRotateAngle(LeftHorn1_r1, -0.4775F, -0.0246F, 0.2629F);
            LeftHorn1_r1.addBox(-5.3287F, -19.9848F, -23.7698F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            RightHorn2_r1 = new ZawaModelRenderer(this, 34, 36);
            RightHorn2_r1.setPos(3.6554F, 32.5277F, 6.8846F);
            HEAD.addChild(RightHorn2_r1);
            setRotateAngle(RightHorn2_r1, -0.7393F, 0.0246F, -0.2629F);
            RightHorn2_r1.addBox(3.8446F, -23.0826F, -30.2463F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            RightHorn3_r1 = new ZawaModelRenderer(this, 42, 5);
            RightHorn3_r1.setPos(1.6392F, 21.9852F, 11.6087F);
            HEAD.addChild(RightHorn3_r1);
            setRotateAngle(RightHorn3_r1, -0.3794F, 0.1417F, -0.133F);
            RightHorn3_r1.addBox(1.1024F, -22.3892F, -20.8201F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            RightHorn1_r1 = new ZawaModelRenderer(this, 28, 8);
            RightHorn1_r1.setPos(1.3847F, 25.5948F, 10.6769F);
            HEAD.addChild(RightHorn1_r1);
            setRotateAngle(RightHorn1_r1, -0.4775F, 0.0246F, -0.2629F);
            RightHorn1_r1.addBox(4.3287F, -19.9848F, -23.7698F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            Head_r1 = new ZawaModelRenderer(this, 20, 0);
            Head_r1.setPos(0.0F, 0.0F, -1.0F);
            HEAD.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.2285F, 0.0F, 0.0F);
            Head_r1.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

            ARMBASE = new ZawaModelRenderer(this, 0, 0);
            ARMBASE.setPos(0.0F, -0.5402F, 0.0137F);
            CHEST.addChild(ARMBASE);

            ArmBase_r1 = new ZawaModelRenderer(this, 28, 27);
            ArmBase_r1.setPos(0.0F, 13.9458F, 6.1077F);
            ARMBASE.addChild(ArmBase_r1);
            setRotateAngle(ArmBase_r1, 0.1222F, 0.0F, 0.0F);
            ArmBase_r1.addBox(0.3F, -14.5899F, -6.459F, 3.0F, 5.0F, 4.0F, 0.0F, false);

            ARM = new ZawaModelRenderer(this, 0, 0);
            ARM.setPos(0.0F, 4.825F, 1.5F);
            ARMBASE.addChild(ARM);

            Arm_r1 = new ZawaModelRenderer(this, 42, 0);
            Arm_r1.setPos(0.0F, 8.95F, 4.5F);
            ARM.addChild(Arm_r1);
            setRotateAngle(Arm_r1, 0.0349F, 0.0F, 0.0F);
            Arm_r1.addBox(0.8F, -9.2767F, -6.1974F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            FOREARM = new ZawaModelRenderer(this, 0, 0);
            FOREARM.setPos(0.0F, 2.85F, -1.875F);
            ARM.addChild(FOREARM);

            ForeArm_r1 = new ZawaModelRenderer(this, 0, 0);
            ForeArm_r1.setPos(0.0F, 6.1F, 6.375F);
            FOREARM.addChild(ForeArm_r1);
            setRotateAngle(ForeArm_r1, 0.0349F, 0.0F, 0.0F);
            ForeArm_r1.addBox(0.75F, -6.4767F, -6.1974F, 2.0F, 5.0F, 2.0F, 0.0F, false);

            HAND = new ZawaModelRenderer(this, 10, 27);
            HAND.setPos(0.0F, 4.6F, 1.275F);
            FOREARM.addChild(HAND);
            HAND.addBox(0.65F, -0.5267F, -1.4974F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            ARMBASE2 = new ZawaModelRenderer(this, 0, 0);
            ARMBASE2.setPos(0.0F, -0.5402F, 0.0137F);
            CHEST.addChild(ARMBASE2);

            ArmBase_r2 = new ZawaModelRenderer(this, 28, 27);
            ArmBase_r2.setPos(0.0F, 13.9458F, 6.1077F);
            ARMBASE2.addChild(ArmBase_r2);
            setRotateAngle(ArmBase_r2, 0.1222F, 0.0F, 0.0F);
            ArmBase_r2.addBox(-3.3F, -14.5899F, -6.459F, 3.0F, 5.0F, 4.0F, 0.0F, true);

            ARM2 = new ZawaModelRenderer(this, 0, 0);
            ARM2.setPos(0.0F, 4.825F, 1.5F);
            ARMBASE2.addChild(ARM2);

            Arm_r2 = new ZawaModelRenderer(this, 42, 0);
            Arm_r2.setPos(0.0F, 8.95F, 4.5F);
            ARM2.addChild(Arm_r2);
            setRotateAngle(Arm_r2, 0.0349F, 0.0F, 0.0F);
            Arm_r2.addBox(-2.8F, -9.2767F, -6.1974F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            FOREARM2 = new ZawaModelRenderer(this, 0, 0);
            FOREARM2.setPos(0.0F, 2.85F, -1.875F);
            ARM2.addChild(FOREARM2);

            ForeArm_r2 = new ZawaModelRenderer(this, 0, 0);
            ForeArm_r2.setPos(0.0F, 6.1F, 6.375F);
            FOREARM2.addChild(ForeArm_r2);
            setRotateAngle(ForeArm_r2, 0.0349F, 0.0F, 0.0F);
            ForeArm_r2.addBox(-2.75F, -6.4767F, -6.1974F, 2.0F, 5.0F, 2.0F, 0.0F, true);

            HAND2 = new ZawaModelRenderer(this, 10, 27);
            HAND2.setPos(0.0F, 4.6F, 1.275F);
            FOREARM2.addChild(HAND2);
            HAND2.addBox(-2.65F, -0.5267F, -1.4974F, 2.0F, 2.0F, 2.0F, 0.0F, true);

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
        protected ZawaModelRenderer MAIN;
        protected ZawaModelRenderer Tail_r1;
        protected ZawaModelRenderer CHEST_r1;
        protected ZawaModelRenderer Neck_r1;
        protected ZawaModelRenderer NeckLower_r1;
        protected ZawaModelRenderer Body_r1;
        protected ZawaModelRenderer Hips_r1;
        protected ZawaModelRenderer ArmBaseRight_r1;
        protected ZawaModelRenderer UpperArmRight_r1;
        protected ZawaModelRenderer ArmRight_r1;
        protected ZawaModelRenderer HandRight_r1;
        protected ZawaModelRenderer ThighRight_r1;
        protected ZawaModelRenderer LowerLegLeft_r1;
        protected ZawaModelRenderer UpperLegLeft_r1;
        protected ZawaModelRenderer FootRight_r1;
        protected ZawaModelRenderer UpperLegLeft_r2;
        protected ZawaModelRenderer LowerLegLeft_r2;
        protected ZawaModelRenderer head;
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer shape57_r1;
        protected ZawaModelRenderer shape58_r1;
        protected ZawaModelRenderer shape59_r1;
        protected ZawaModelRenderer EarLeft_r1;






        public Child() {
            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 0.0F, -3.0F);


            CHEST = new ZawaModelRenderer(this, 0, 0);
            CHEST.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(CHEST);


            Tail_r1 = new ZawaModelRenderer(this, 45, 12);
            Tail_r1.setPos(0.0F, 26.2626F, 1.8729F);
            CHEST.addChild(Tail_r1);
            setRotateAngle(Tail_r1, 0.1745F, 0.0F, 0.0F);
            Tail_r1.addBox(-1.0F, -11.7456F, 6.8041F, 2.0F, 3.0F, 1.0F, 0.0F, false);

            CHEST_r1 = new ZawaModelRenderer(this, 3, 17);
            CHEST_r1.setPos(0.0F, 25.0114F, -3.1231F);
            CHEST.addChild(CHEST_r1);
            setRotateAngle(CHEST_r1, -0.2269F, 0.0F, 0.0F);
            CHEST_r1.addBox(-2.0F, -12.5269F, -2.2001F, 4.0F, 5.0F, 3.0F, 0.0F, false);

            Neck_r1 = new ZawaModelRenderer(this, 26, 36);
            Neck_r1.setPos(0.0F, 12.1929F, 8.0276F);
            CHEST.addChild(Neck_r1);
            setRotateAngle(Neck_r1, 0.8659F, 0.0F, 0.0F);
            Neck_r1.addBox(-1.0F, -10.4052F, -9.4997F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            NeckLower_r1 = new ZawaModelRenderer(this, 1,37);
            NeckLower_r1.setPos(0.0F, 17.1376F, 7.1537F);
            CHEST.addChild(NeckLower_r1);
            setRotateAngle(NeckLower_r1, 0.6383F, 0.0F, 0.0F);
            NeckLower_r1.addBox(-0.5F, -10.0998F, -7.8973F, 1.0F, 3.0F, 2.0F, 0.0F, false);

            Body_r1 = new ZawaModelRenderer(this, 3, 2);
            Body_r1.setPos(0.0F, 24.2147F, -0.5025F);
            CHEST.addChild(Body_r1);
            setRotateAngle(Body_r1, 0.0349F, 0.0F, 0.0F);
            Body_r1.addBox(-2.5F, -11.4018F, -0.3547F, 5.0F, 5.0F, 6.0F, 0.0F, false);

            Hips_r1 = new ZawaModelRenderer(this, 23, 17);
            Hips_r1.setPos(0.0F, 23.137F, -3.9269F);
            CHEST.addChild(Hips_r1);
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