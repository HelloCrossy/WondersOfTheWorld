package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.ServalEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class ServalModel extends ZawaBaseModel<ServalEntity> {
    protected ZawaModelRenderer MAIN;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(MAIN);
        }

        return this.parts;
    }

    public static class Adult extends ServalModel {
        protected ZawaModelRenderer HEAD;
        protected ZawaModelRenderer Head_r1_r1;
        protected ZawaModelRenderer Top_Snout_r1_r1;
        protected ZawaModelRenderer Snout_r3_r1;
        protected ZawaModelRenderer Snout_r2_r1;
        protected ZawaModelRenderer Snout_r1_r1;
        protected ZawaModelRenderer Mouth_r1_r1;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer Neck_Lower_r7_r1;
        protected ZawaModelRenderer Neck_Lower_r6_r1;
        protected ZawaModelRenderer Neck_Lower_r5_r1;
        protected ZawaModelRenderer Neck_Lower_r4_r1;
        protected ZawaModelRenderer Neck_Lower_r3_r1;
        protected ZawaModelRenderer Neck_Lower_r2_r1;
        protected ZawaModelRenderer Neck_Lower_r1_r1;
        protected ZawaModelRenderer Neck_Upper_r1_r1;
        protected ZawaModelRenderer LEFTBACK;
        protected ZawaModelRenderer cube_r2_r1;
        protected ZawaModelRenderer cube_r1_r1;
        protected ZawaModelRenderer RIGHTBACK;
        protected ZawaModelRenderer cube_r3_r1_r1;
        protected ZawaModelRenderer cube_r4_r1_r1;
        protected ZawaModelRenderer LEFTFRONT;
        protected ZawaModelRenderer LeftFrontUpperLeg_r1;
        protected ZawaModelRenderer LeftFrontLowerLeg_r1;
        protected ZawaModelRenderer RIGHTFRONT;
        protected ZawaModelRenderer RightFrontUpperLeg_r1;
        protected ZawaModelRenderer RightFrontLowerLeg_r1;

        public Adult() {
            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 24.0F, 0.0F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(-0.55F, -0.525F, -2.125F);
            MAIN.addChild(HEAD);


            Head_r1_r1 = new ZawaModelRenderer(this, 50, 29);
            Head_r1_r1.setPos(0.55F, 0.7019F, 1.8985F);
            HEAD.addChild(Head_r1_r1);
            setRotateAngle(Head_r1_r1, 0.1047F, 0.0F, 0.0F);
            Head_r1_r1.addBox(-1.5F, -15.975F, -8.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            Top_Snout_r1_r1 = new ZawaModelRenderer(this, 48, 13);
            Top_Snout_r1_r1.setPos(0.55F, -9.4539F, 8.0457F);
            HEAD.addChild(Top_Snout_r1_r1);
            setRotateAngle(Top_Snout_r1_r1, 0.7418F, 0.0F, 0.0F);
            Top_Snout_r1_r1.addBox(-0.5F, -13.9907F, -10.8289F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            Snout_r3_r1 = new ZawaModelRenderer(this, 47, 16);
            Snout_r3_r1.setPos(0.55F, -2.9111F, 5.378F);
            HEAD.addChild(Snout_r3_r1);
            setRotateAngle(Snout_r3_r1, 0.2967F, 0.0F, 0.0F);
            Snout_r3_r1.addBox(-1.0F, -13.2481F, -11.096F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            Snout_r2_r1 = new ZawaModelRenderer(this, 56, 25);
            Snout_r2_r1.setPos(-8.4762F, -2.793F, 1.5778F);
            HEAD.addChild(Snout_r2_r1);
            setRotateAngle(Snout_r2_r1, 0.102F, -0.5721F, 0.2985F);
            Snout_r2_r1.addBox(0.25F, -16.8711F, -8.9439F, 2.0F, 3.0F, 1.0F, 0.0F, false);

            Snout_r1_r1 = new ZawaModelRenderer(this, 50, 25);
            Snout_r1_r1.setPos(9.5762F, -2.793F, 1.5778F);
            HEAD.addChild(Snout_r1_r1);
            setRotateAngle(Snout_r1_r1, 0.102F, 0.5721F, -0.2985F);
            Snout_r1_r1.addBox(-2.25F, -16.8711F, -8.9439F, 2.0F, 3.0F, 1.0F, 0.0F, false);

            Mouth_r1_r1 = new ZawaModelRenderer(this, 48, 19);
            Mouth_r1_r1.setPos(0.55F, -5.1312F, 6.6472F);
            HEAD.addChild(Mouth_r1_r1);
            setRotateAngle(Mouth_r1_r1, 0.4581F, 0.0F, 0.0F);
            Mouth_r1_r1.addBox(-0.5F, -12.9548F, -10.9436F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(-0.55F, -1.6F, 1.55F);
            MAIN.addChild(BODY);


            Neck_Lower_r7_r1 = new ZawaModelRenderer(this, 49, 35);
            Neck_Lower_r7_r1.setPos(0.55F, 4.8561F, 0.0469F);
            BODY.addChild(Neck_Lower_r7_r1);
            setRotateAngle(Neck_Lower_r7_r1, -1.0385F, 0.0F, 0.0F);
            Neck_Lower_r7_r1.addBox(-0.5F, -0.575F, -19.875F, 1.0F, 2.0F, 6.0F, 0.0F, false);

            Neck_Lower_r6_r1 = new ZawaModelRenderer(this, 50, 51);
            Neck_Lower_r6_r1.setPos(0.55F, 2.6797F, -3.9795F);
            BODY.addChild(Neck_Lower_r6_r1);
            setRotateAngle(Neck_Lower_r6_r1, -0.288F, 0.0F, 0.0F);
            Neck_Lower_r6_r1.addBox(-1.5F, -12.0874F, -7.1127F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Neck_Lower_r5_r1 = new ZawaModelRenderer(this, 22, 49);
            Neck_Lower_r5_r1.setPos(0.55F, 1.3772F, -1.2076F);
            BODY.addChild(Neck_Lower_r5_r1);
            setRotateAngle(Neck_Lower_r5_r1, 0.0436F, 0.0F, 0.0F);
            Neck_Lower_r5_r1.addBox(-2.0F, -12.4624F, -5.1127F, 4.0F, 6.0F, 9.0F, 0.0F, false);

            Neck_Lower_r4_r1 = new ZawaModelRenderer(this, 6, 55);
            Neck_Lower_r4_r1.setPos(0.55F, 2.074F, -4.1052F);
            BODY.addChild(Neck_Lower_r4_r1);
            setRotateAngle(Neck_Lower_r4_r1, -0.2836F, 0.0F, 0.0F);
            Neck_Lower_r4_r1.addBox(-1.5F, -14.3124F, 2.1373F, 3.0F, 5.0F, 4.0F, 0.0F, false);

            Neck_Lower_r3_r1 = new ZawaModelRenderer(this, 44, 0);
            Neck_Lower_r3_r1.setPos(0.55F, -11.5406F, -5.6746F);
            BODY.addChild(Neck_Lower_r3_r1);
            setRotateAngle(Neck_Lower_r3_r1, -1.2174F, 0.0F, 0.0F);
            Neck_Lower_r3_r1.addBox(-0.5F, -10.1654F, 5.4729F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            Neck_Lower_r2_r1 = new ZawaModelRenderer(this, 44, 3);
            Neck_Lower_r2_r1.setPos(0.55F, -14.8279F, -4.0572F);
            BODY.addChild(Neck_Lower_r2_r1);
            setRotateAngle(Neck_Lower_r2_r1, -1.5228F, 0.0F, 0.0F);
            Neck_Lower_r2_r1.addBox(-0.5F, -10.1674F, 7.2556F, 1.0F, 1.0F, 2.0F, -0.0001F, false);

            Neck_Lower_r1_r1 = new ZawaModelRenderer(this, 44, 6);
            Neck_Lower_r1_r1.setPos(0.55F, -11.7226F, -1.5266F);
            BODY.addChild(Neck_Lower_r1_r1);
            setRotateAngle(Neck_Lower_r1_r1, -1.4355F, 0.0F, 0.0F);
            Neck_Lower_r1_r1.addBox(-0.5F, -7.2479F, 6.5912F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            Neck_Upper_r1_r1 = new ZawaModelRenderer(this, 48, 43);
            Neck_Upper_r1_r1.setPos(0.55F, 2.0277F, -13.5806F);
            BODY.addChild(Neck_Upper_r1_r1);
            setRotateAngle(Neck_Upper_r1_r1, -0.9207F, 0.0F, 0.0F);
            Neck_Upper_r1_r1.addBox(-1.0F, -12.7416F, -9.4466F, 2.0F, 2.0F, 6.0F, 0.0F, false);

            LEFTBACK = new ZawaModelRenderer(this, 0, 0);
            LEFTBACK.setPos(-0.5F, 0.0F, 7.65F);
            MAIN.addChild(LEFTBACK);
            LEFTBACK.texOffs(33, 14).addBox(1.1F, -10.525F, -5.25F, 2.0F, 4.0F, 4.0F, 0.0F, false);
            LEFTBACK.texOffs(35, 35).addBox(1.0F, -1.0F, -3.95F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r2_r1 = new ZawaModelRenderer(this, 34, 22);
            cube_r2_r1.setPos(0.5F, 2.8219F, -7.4368F);
            LEFTBACK.addChild(cube_r2_r1);
            setRotateAngle(cube_r2_r1, 0.3927F, 0.0F, 0.0F);
            cube_r2_r1.addBox(0.5F, -7.975F, 6.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r1_r1 = new ZawaModelRenderer(this, 35, 29);
            cube_r1_r1.setPos(0.5F, -0.7889F, -7.9502F);
            LEFTBACK.addChild(cube_r1_r1);
            setRotateAngle(cube_r1_r1, -0.144F, 0.0F, 0.0F);
            cube_r1_r1.addBox(0.4F, -4.4753F, 4.319F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            RIGHTBACK = new ZawaModelRenderer(this, 0, 0);
            RIGHTBACK.setPos(0.5F, 0.0F, 7.65F);
            MAIN.addChild(RIGHTBACK);
            RIGHTBACK.texOffs(18, 14).addBox(-3.1F, -10.85F, -5.25F, 2.0F, 4.0F, 4.0F, 0.0F, false);
            RIGHTBACK.texOffs(20, 35).addBox(-3.0F, -1.0F, -3.95F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r3_r1_r1 = new ZawaModelRenderer(this, 20, 29);
            cube_r3_r1_r1.setPos(-0.5F, 0.0349F, -7.7663F);
            RIGHTBACK.addChild(cube_r3_r1_r1);
            setRotateAngle(cube_r3_r1_r1, -0.144F, 0.0F, 0.0F);
            cube_r3_r1_r1.addBox(-2.4F, -5.2642F, 4.0188F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r4_r1_r1 = new ZawaModelRenderer(this, 19, 22);
            cube_r4_r1_r1.setPos(-0.5F, 0.2964F, -8.7137F);
            RIGHTBACK.addChild(cube_r4_r1_r1);
            setRotateAngle(cube_r4_r1_r1, 0.3927F, 0.0F, 0.0F);
            cube_r4_r1_r1.addBox(-2.5F, -5.1531F, 6.2132F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            LEFTFRONT = new ZawaModelRenderer(this, 17, 51);
            LEFTFRONT.setPos(-0.5F, 0.0F, -2.675F);
            MAIN.addChild(LEFTFRONT);
            LEFTFRONT.addBox(1.05F, -1.0F, -3.7F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            LeftFrontUpperLeg_r1 = new ZawaModelRenderer(this, 17, 38);
            LeftFrontUpperLeg_r1.setPos(0.5F, -0.0003F, 2.6822F);
            LEFTFRONT.addChild(LeftFrontUpperLeg_r1);
            setRotateAngle(LeftFrontUpperLeg_r1, 0.048F, 0.0F, 0.0F);
            LeftFrontUpperLeg_r1.addBox(0.6F, -9.8261F, -5.4786F, 2.0F, 5.0F, 2.0F, 0.0F, false);

            LeftFrontLowerLeg_r1 = new ZawaModelRenderer(this, 17, 45);
            LeftFrontLowerLeg_r1.setPos(0.5F, 0.0008F, 2.6864F);
            LEFTFRONT.addChild(LeftFrontLowerLeg_r1);
            setRotateAngle(LeftFrontLowerLeg_r1, -0.0654F, 0.0014F, 0.0F);
            LeftFrontLowerLeg_r1.addBox(0.5787F, -4.4252F, -6.0314F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            RIGHTFRONT = new ZawaModelRenderer(this, 4, 51);
            RIGHTFRONT.setPos(0.5F, 0.0F, -2.675F);
            MAIN.addChild(RIGHTFRONT);
            RIGHTFRONT.addBox(-3.05F, -1.0F, -3.7F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            RightFrontUpperLeg_r1 = new ZawaModelRenderer(this, 4, 38);
            RightFrontUpperLeg_r1.setPos(-0.5F, -0.0003F, 2.6822F);
            RIGHTFRONT.addChild(RightFrontUpperLeg_r1);
            setRotateAngle(RightFrontUpperLeg_r1, 0.048F, 0.0F, 0.0F);
            RightFrontUpperLeg_r1.addBox(-2.6F, -9.8261F, -5.4786F, 2.0F, 5.0F, 2.0F, 0.0F, false);

            RightFrontLowerLeg_r1 = new ZawaModelRenderer(this, 4, 45);
            RightFrontLowerLeg_r1.setPos(-0.5F, 0.0008F, 2.6864F);
            RIGHTFRONT.addChild(RightFrontLowerLeg_r1);
            setRotateAngle(RightFrontLowerLeg_r1, -0.0654F, -0.0014F, 0.0F);
            RightFrontLowerLeg_r1.addBox(-2.5787F, -4.4252F, -6.0314F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            this.saveBase();
        }

        @Override
        public void setupAnim(ServalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

    public static class Child extends ServalModel {
        protected ZawaModelRenderer HEAD;
        protected ZawaModelRenderer Snout_r1;
        protected ZawaModelRenderer Snout_r2;
        protected ZawaModelRenderer Top_Snout_r1;
        protected ZawaModelRenderer Snout_r3;
        protected ZawaModelRenderer Mouth_r1;
        protected ZawaModelRenderer MainHead_r1;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer Neck_Lower_r1;
        protected ZawaModelRenderer Neck_Lower_r2;
        protected ZawaModelRenderer Neck_Lower_r3;
        protected ZawaModelRenderer Neck_Lower_r4;
        protected ZawaModelRenderer Neck_Lower_r5;
        protected ZawaModelRenderer Neck_Lower_r6;
        protected ZawaModelRenderer Neck_Upper_r1;
        protected ZawaModelRenderer Neck_Lower_r7;
        protected ZawaModelRenderer LEFTFRONT;
        protected ZawaModelRenderer LeftFrontUpperLeg_r1;
        protected ZawaModelRenderer LeftFrontMidLeg_r1;
        protected ZawaModelRenderer RIGHTFRONT;
        protected ZawaModelRenderer cube_r1;
        protected ZawaModelRenderer cube_r2;
        protected ZawaModelRenderer LEFTBACK;
        protected ZawaModelRenderer cube_r3;
        protected ZawaModelRenderer cube_r4;
        protected ZawaModelRenderer RIGHTBACK;
        protected ZawaModelRenderer cube_r5;
        protected ZawaModelRenderer cube_r6;

        public Child() {
            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 24.0F, -3.0F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(HEAD);


            Snout_r1 = new ZawaModelRenderer(this, 55, 25);
            Snout_r1.setPos(1.25F, -12.7211F, -1.5689F);
            HEAD.addChild(Snout_r1);
            setRotateAngle(Snout_r1, 0.102F, -0.5721F, 0.2985F);
            Snout_r1.addBox(-1.0F, -0.75F, -1.3F, 2.0F, 3.0F, 1.0F, 0.0F, false);

            Snout_r2 = new ZawaModelRenderer(this, 50, 25);
            Snout_r2.setPos(-1.25F, -12.7211F, -1.5689F);
            HEAD.addChild(Snout_r2);
            setRotateAngle(Snout_r2, 0.102F, 0.5721F, -0.2985F);
            Snout_r2.addBox(-1.0F, -0.75F, -1.3F, 2.0F, 3.0F, 1.0F, 0.0F, false);

            Top_Snout_r1 = new ZawaModelRenderer(this, 48, 13);
            Top_Snout_r1.setPos(0.0F, -9.2015F, -3.7943F);
            HEAD.addChild(Top_Snout_r1);
            setRotateAngle(Top_Snout_r1, 0.7418F, 0.0F, 0.0F);
            Top_Snout_r1.addBox(-0.5F, -1.3892F, -0.9596F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            Snout_r3 = new ZawaModelRenderer(this, 47, 16);
            Snout_r3.setPos(0.0F, -9.2015F, -3.7943F);
            HEAD.addChild(Snout_r3);
            setRotateAngle(Snout_r3, 0.2967F, 0.0F, 0.0F);
            Snout_r3.addBox(-1.0F, -0.6466F, -1.2267F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            Mouth_r1 = new ZawaModelRenderer(this, 48, 19);
            Mouth_r1.setPos(0.0F, -9.1265F, -3.7943F);
            HEAD.addChild(Mouth_r1);
            setRotateAngle(Mouth_r1, 0.4581F, 0.0F, 0.0F);
            Mouth_r1.addBox(-0.5F, -0.4283F, -1.0743F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            MainHead_r1 = new ZawaModelRenderer(this, 50, 29);
            MainHead_r1.setPos(-0.55F, 5.65F, 7.65F);
            HEAD.addChild(MainHead_r1);
            setRotateAngle(MainHead_r1, 0.1047F, 0.0F, 0.0F);
            MainHead_r1.addBox(-0.95F, -18.225F, -10.075F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(BODY);


            Neck_Lower_r1 = new ZawaModelRenderer(this, 44, 6);
            Neck_Lower_r1.setPos(0.0F, -4.6479F, 10.1662F);
            BODY.addChild(Neck_Lower_r1);
            setRotateAngle(Neck_Lower_r1, -1.4355F, 0.0F, 0.0F);
            Neck_Lower_r1.addBox(-0.5F, -0.6F, -1.05F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            Neck_Lower_r2 = new ZawaModelRenderer(this, 44, 3);
            Neck_Lower_r2.setPos(0.0F, -7.5292F, 9.8894F);
            BODY.addChild(Neck_Lower_r2);
            setRotateAngle(Neck_Lower_r2, -1.5228F, 0.0F, 0.0F);
            Neck_Lower_r2.addBox(-0.5F, -0.6382F, -0.1088F, 1.0F, 1.0F, 2.0F, -0.0001F, false);

            Neck_Lower_r3 = new ZawaModelRenderer(this, 44, 0);
            Neck_Lower_r3.setPos(0.0F, -7.5292F, 9.8894F);
            BODY.addChild(Neck_Lower_r3);
            setRotateAngle(Neck_Lower_r3, -1.2174F, 0.0F, 0.0F);
            Neck_Lower_r3.addBox(-0.5F, -0.6362F, -1.8915F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            Neck_Lower_r4 = new ZawaModelRenderer(this, 51, 52);
            Neck_Lower_r4.setPos(0.5F, -7.8374F, -1.9377F);
            BODY.addChild(Neck_Lower_r4);
            setRotateAngle(Neck_Lower_r4, -0.288F, 0.0F, 0.0F);
            Neck_Lower_r4.addBox(-2.0F, -2.375F, 0.65F, 3.0F, 4.0F, 2.0F, 0.0F, false);

            Neck_Lower_r5 = new ZawaModelRenderer(this, 8, 57);
            Neck_Lower_r5.setPos(0.5F, -6.1124F, 2.3123F);
            BODY.addChild(Neck_Lower_r5);
            setRotateAngle(Neck_Lower_r5, -0.2836F, 0.0F, 0.0F);
            Neck_Lower_r5.addBox(-2.0F, -5.475F, 4.25F, 3.0F, 5.0F, 2.0F, 0.0F, false);

            Neck_Lower_r6 = new ZawaModelRenderer(this, 23, 50);
            Neck_Lower_r6.setPos(0.5F, -5.3624F, 0.3123F);
            BODY.addChild(Neck_Lower_r6);
            setRotateAngle(Neck_Lower_r6, 0.0436F, 0.0F, 0.0F);
            Neck_Lower_r6.addBox(-2.5F, -4.5F, -0.175F, 4.0F, 5.0F, 8.0F, 0.0F, false);

            Neck_Upper_r1 = new ZawaModelRenderer(this, 50, 45);
            Neck_Upper_r1.setPos(0.0F, -8.5166F, -0.3716F);
            BODY.addChild(Neck_Upper_r1);
            setRotateAngle(Neck_Upper_r1, -0.9207F, 0.0F, 0.0F);
            Neck_Upper_r1.addBox(-1.0F, -0.825F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            Neck_Lower_r7 = new ZawaModelRenderer(this, 51, 37);
            Neck_Lower_r7.setPos(0.45F, 6.425F, 4.025F);
            BODY.addChild(Neck_Lower_r7);
            setRotateAngle(Neck_Lower_r7, -1.0385F, 0.0F, 0.0F);
            Neck_Lower_r7.addBox(-0.95F, -3.6F, -17.825F, 1.0F, 2.0F, 4.0F, 0.0F, false);

            LEFTFRONT = new ZawaModelRenderer(this, 17, 51);
            LEFTFRONT.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(LEFTFRONT);
            LEFTFRONT.addBox(0.175F, -1.0F, -1.275F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            LeftFrontUpperLeg_r1 = new ZawaModelRenderer(this, 17, 38);
            LeftFrontUpperLeg_r1.setPos(-0.75F, -3.5F, 3.225F);
            LEFTFRONT.addChild(LeftFrontUpperLeg_r1);
            setRotateAngle(LeftFrontUpperLeg_r1, -0.0262F, 0.0F, 0.0F);
            LeftFrontUpperLeg_r1.addBox(1.05F, -4.2F, -3.775F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            LeftFrontMidLeg_r1 = new ZawaModelRenderer(this, 17, 45);
            LeftFrontMidLeg_r1.setPos(-0.75F, -3.5F, 3.225F);
            LEFTFRONT.addChild(LeftFrontMidLeg_r1);
            setRotateAngle(LeftFrontMidLeg_r1, -0.0873F, 0.0F, 0.0F);
            LeftFrontMidLeg_r1.addBox(1.0F, -1.0F, -3.75F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            RIGHTFRONT = new ZawaModelRenderer(this, 20, 35);
            RIGHTFRONT.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(RIGHTFRONT);
            RIGHTFRONT.addBox(-2.175F, -1.0F, -1.275F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r1 = new ZawaModelRenderer(this, 4, 38);
            cube_r1.setPos(0.75F, -3.5F, 3.225F);
            RIGHTFRONT.addChild(cube_r1);
            setRotateAngle(cube_r1, -0.0262F, 0.0F, 0.0F);
            cube_r1.addBox(-3.05F, -4.2F, -3.775F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 4, 45);
            cube_r2.setPos(0.75F, -3.5F, 3.225F);
            RIGHTFRONT.addChild(cube_r2);
            setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
            cube_r2.addBox(-3.0F, -1.0F, -3.75F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            LEFTBACK = new ZawaModelRenderer(this, 0, 0);
            LEFTBACK.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(LEFTBACK);
            LEFTBACK.texOffs(34, 15).addBox(0.6F, -7.45F, 6.05F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            LEFTBACK.texOffs(35, 35).addBox(0.5F, -1.0F, 6.325F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 35, 29);
            cube_r3.setPos(0.0F, -2.4753F, 7.944F);
            LEFTBACK.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.144F, 0.0F, 0.0F);
            cube_r3.addBox(0.4F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 35, 23);
            cube_r4.setPos(-0.5F, 1.45F, 10.175F);
            LEFTBACK.addChild(cube_r4);
            setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
            cube_r4.addBox(1.0F, -6.85F, -1.2F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            RIGHTBACK = new ZawaModelRenderer(this, 0, 0);
            RIGHTBACK.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(RIGHTBACK);
            RIGHTBACK.texOffs(19, 15).addBox(-2.6F, -7.45F, 6.05F, 2.0F, 3.0F, 3.0F, 0.0F, false);
            RIGHTBACK.texOffs(20, 35).addBox(-2.5F, -1.0F, 6.325F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 20, 29);
            cube_r5.setPos(0.0F, -2.4753F, 7.944F);
            RIGHTBACK.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.144F, 0.0F, 0.0F);
            cube_r5.addBox(-2.4F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 20, 23);
            cube_r6.setPos(0.5F, 1.45F, 10.175F);
            RIGHTBACK.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
            cube_r6.addBox(-3.0F, -6.85F, -1.2F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            this.saveBase();
        }

        @Override
        public void setupAnim(ServalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
