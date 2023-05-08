package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class BongoModel extends ZawaBaseModel<BongoEntity> {
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

    public static class Adult extends BongoModel {

        protected ZawaModelRenderer HEAD;
        protected ZawaModelRenderer Ear_R_r1;
        protected ZawaModelRenderer Ear_L_r1;
        protected ZawaModelRenderer Mouth_r1;
        protected ZawaModelRenderer Muzzle_r1;
        protected ZawaModelRenderer TopSnout_r1;
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer Snout;
        protected ZawaModelRenderer Snout_L_r1;
        protected ZawaModelRenderer Horns_L;
        protected ZawaModelRenderer Horn_3_r1;
        protected ZawaModelRenderer Horn_2_r1;
        protected ZawaModelRenderer Horn_1_r1;
        protected ZawaModelRenderer Horn_R;
        protected ZawaModelRenderer Horn_3_r2;
        protected ZawaModelRenderer Horn_2_r2;
        protected ZawaModelRenderer Horn_1_r2;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer Mane_3_r1;
        protected ZawaModelRenderer Hips_r1;
        protected ZawaModelRenderer Mane_2_r1;
        protected ZawaModelRenderer Mane_1_r1;
        protected ZawaModelRenderer Chest_r1;
        protected ZawaModelRenderer Neck;
        protected ZawaModelRenderer Lower_r1;
        protected ZawaModelRenderer Upper_r1;
        protected ZawaModelRenderer Tail;
        protected ZawaModelRenderer Tail_4_r1;
        protected ZawaModelRenderer Tail_2_r1;
        protected ZawaModelRenderer Tail_1_r1;
        protected ZawaModelRenderer Limb_Front_R;
        protected ZawaModelRenderer ArmBase_r1;
        protected ZawaModelRenderer Limb_Front_L;
        protected ZawaModelRenderer ArmBase_r2;
        protected ZawaModelRenderer Limb_Back_L;
        protected ZawaModelRenderer UpperLeg_r1;
        protected ZawaModelRenderer Thigh_r1;
        protected ZawaModelRenderer Limb_Back_R;
        protected ZawaModelRenderer UpperLeg_r2;
        protected ZawaModelRenderer Thigh_r2;

        public Adult() {
            texWidth = 128;
            texHeight = 128;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 24.0F, 0.0F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, -22.5117F, -18.3637F);
            MAIN.addChild(HEAD);


            Ear_R_r1 = new ZawaModelRenderer(this, 92, 33);
            Ear_R_r1.setPos(-2.1973F, -2.5944F, 4.7687F);
            HEAD.addChild(Ear_R_r1);
            setRotateAngle(Ear_R_r1, 0.5681F, 0.5207F, 0.6628F);
            Ear_R_r1.addBox(-2.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            Ear_L_r1 = new ZawaModelRenderer(this, 112, 33);
            Ear_L_r1.setPos(2.1973F, -2.5944F, 4.7687F);
            HEAD.addChild(Ear_L_r1);
            setRotateAngle(Ear_L_r1, 0.5681F, -0.5207F, -0.6628F);
            Ear_L_r1.addBox(-1.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            Mouth_r1 = new ZawaModelRenderer(this, 102, 53);
            Mouth_r1.setPos(0.0F, 0.075F, 0.0F);
            HEAD.addChild(Mouth_r1);
            setRotateAngle(Mouth_r1, 0.1353F, 0.0F, 0.0F);
            Mouth_r1.addBox(-1.0F, -0.0835F, -1.7977F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            Muzzle_r1 = new ZawaModelRenderer(this, 102, 49);
            Muzzle_r1.setPos(0.0F, 0.9591F, -1.2921F);
            HEAD.addChild(Muzzle_r1);
            setRotateAngle(Muzzle_r1, 0.6938F, 0.0F, 0.0F);
            Muzzle_r1.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            TopSnout_r1 = new ZawaModelRenderer(this, 101, 41);
            TopSnout_r1.setPos(0.0F, -2.9851F, 0.5414F);
            HEAD.addChild(TopSnout_r1);
            setRotateAngle(TopSnout_r1, 0.7679F, 0.0F, 0.0F);
            TopSnout_r1.addBox(-1.0F, 0.574F, -4.1433F, 2.0F, 2.0F, 4.0F, 0.0F, true);

            Head_r1 = new ZawaModelRenderer(this, 97, 31);
            Head_r1.setPos(0.0F, -3.1101F, 3.0633F);
            HEAD.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.0305F, 0.0F, 0.0F);
            Head_r1.addBox(-2.5F, -0.0031F, -2.2246F, 5.0F, 5.0F, 5.0F, 0.0F, false);

            Snout = new ZawaModelRenderer(this, 0, 0);
            Snout.setPos(0.0F, 0.0F, 0.0F);
            HEAD.addChild(Snout);


            Snout_L_r1 = new ZawaModelRenderer(this, 0, 0);
            Snout_L_r1.setPos(0.0F, 0.0F, 0.0F);
            Snout.addChild(Snout_L_r1);
            setRotateAngle(Snout_L_r1, 0.3098F, 0.0F, 0.0F);
            Snout_L_r1.texOffs(91, 42).addBox(-0.75F, -0.3835F, -1.6227F, 2.0F, 2.0F, 3.0F, 0.0F, false);
            Snout_L_r1.texOffs(91, 42).addBox(-1.25F, -0.3835F, -1.6227F, 2.0F, 2.0F, 3.0F, 0.0F, true);

            Horns_L = new ZawaModelRenderer(this, 0, 0);
            Horns_L.setPos(0.0F, -6.1081F, 4.8571F);
            HEAD.addChild(Horns_L);


            Horn_3_r1 = new ZawaModelRenderer(this, 114, 16);
            Horn_3_r1.setPos(0.0F, 0.0F, 0.0F);
            Horns_L.addChild(Horn_3_r1);
            setRotateAngle(Horn_3_r1, -0.5682F, 0.0815F, 0.348F);
            Horn_3_r1.addBox(0.3689F, -5.2086F, -0.5573F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            Horn_2_r1 = new ZawaModelRenderer(this, 113, 20);
            Horn_2_r1.setPos(0.0F, 0.0F, 0.0F);
            Horns_L.addChild(Horn_2_r1);
            setRotateAngle(Horn_2_r1, -0.7769F, -0.2114F, 0.0162F);
            Horn_2_r1.addBox(1.2108F, -1.826F, -1.0121F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Horn_1_r1 = new ZawaModelRenderer(this, 111, 25);
            Horn_1_r1.setPos(0.0F, 0.0F, 0.0F);
            Horns_L.addChild(Horn_1_r1);
            setRotateAngle(Horn_1_r1, -0.5361F, 0.0798F, 0.2312F);
            Horn_1_r1.addBox(1.1716F, 0.7518F, -1.4385F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            Horn_R = new ZawaModelRenderer(this, 0, 0);
            Horn_R.setPos(0.0F, -6.1081F, 4.8571F);
            HEAD.addChild(Horn_R);


            Horn_3_r2 = new ZawaModelRenderer(this, 98, 16);
            Horn_3_r2.setPos(0.0F, 0.0F, 0.0F);
            Horn_R.addChild(Horn_3_r2);
            setRotateAngle(Horn_3_r2, -0.5682F, -0.0815F, -0.348F);
            Horn_3_r2.addBox(-1.3689F, -5.2086F, -0.5573F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            Horn_2_r2 = new ZawaModelRenderer(this, 99, 20);
            Horn_2_r2.setPos(0.0F, 0.0F, 0.0F);
            Horn_R.addChild(Horn_2_r2);
            setRotateAngle(Horn_2_r2, -0.7769F, 0.2114F, -0.0162F);
            Horn_2_r2.addBox(-2.2108F, -1.826F, -1.0121F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Horn_1_r2 = new ZawaModelRenderer(this, 98, 25);
            Horn_1_r2.setPos(0.0F, 0.0F, 0.0F);
            Horn_R.addChild(Horn_1_r2);
            setRotateAngle(Horn_1_r2, -0.5361F, -0.0798F, -0.2312F);
            Horn_1_r2.addBox(-3.1716F, 0.7518F, -1.4385F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(0.0F, -16.5503F, 12.0844F);
            MAIN.addChild(BODY);


            Mane_3_r1 = new ZawaModelRenderer(this, 110,7);
            Mane_3_r1.setPos(0.0F, -6.7007F, -5.0479F);
            BODY.addChild(Mane_3_r1);
            setRotateAngle(Mane_3_r1, -0.3665F, 0.0F, 0.0F);
            Mane_3_r1.addBox(-1.0F, -0.0069F, -0.0198F, 2.0F, 1.0F, 5.0F, 0.0F, false);

            Hips_r1 = new ZawaModelRenderer(this, 58, 112);
            Hips_r1.setPos(0.0F, -0.6097F, -5.7134F);
            BODY.addChild(Hips_r1);
            setRotateAngle(Hips_r1, -0.2225F, 0.0F, 0.0F);
            Hips_r1.addBox(-3.0F, -5.4F, -1.025F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            Mane_2_r1 = new ZawaModelRenderer(this, 0, 0);
            Mane_2_r1.setPos(-2.4767F, -0.7184F, -12.0319F);
            BODY.addChild(Mane_2_r1);
            setRotateAngle(Mane_2_r1, 0.0F, 0.0F, 0.0F);
            Mane_2_r1.texOffs(79, 0).addBox(1.475F, -6.025F, -5.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);
            Mane_2_r1.texOffs(82, 105).addBox(-1.0233F, -5.5F, -5.5F, 7.0F, 11.0F, 12.0F, 0.0F, false);

            Mane_1_r1 = new ZawaModelRenderer(this, 63, 5);
            Mane_1_r1.setPos(-2.0F, -0.6771F, -19.5818F);
            BODY.addChild(Mane_1_r1);
            setRotateAngle(Mane_1_r1, 0.2094F, 0.0F, 0.0F);
            Mane_1_r1.addBox(1.0F, -5.4F, -2.25F, 2.0F, 1.0F, 6.0F, 0.0F, false);

            Chest_r1 = new ZawaModelRenderer(this, 89, 89);
            Chest_r1.setPos(0.0F, -0.6771F, -19.5818F);
            BODY.addChild(Chest_r1);
            setRotateAngle(Chest_r1, 0.096F, 0.0F, 0.0F);
            Chest_r1.addBox(-3.0F, -5.05F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            Neck = new ZawaModelRenderer(this, 0, 0);
            Neck.setPos(-0.5F, -2.9447F, -24.6539F);
            BODY.addChild(Neck);


            Lower_r1 = new ZawaModelRenderer(this, 89, 76);
            Lower_r1.setPos(0.0F, 0.0F, 0.0F);
            Neck.addChild(Lower_r1);
            setRotateAngle(Lower_r1, -0.8247F, 0.0F, 0.0F);
            Lower_r1.addBox(-1.0F, -3.15F, -2.775F, 3.0F, 4.0F, 9.0F, 0.0F, false);

            Upper_r1 = new ZawaModelRenderer(this, 89, 63);
            Upper_r1.setPos(0.5F, -1.4416F, -0.3568F);
            Neck.addChild(Upper_r1);
            setRotateAngle(Upper_r1, -0.6109F, 0.0F, 0.0F);
            Upper_r1.addBox(-2.0F, -3.8F, -2.375F, 4.0F, 5.0F, 8.0F, 0.0F, false);

            Tail = new ZawaModelRenderer(this, 0, 0);
            Tail.setPos(0.0F, 0.0F, 0.0F);
            BODY.addChild(Tail);


            Tail_4_r1 = new ZawaModelRenderer(this, 0, 0);
            Tail_4_r1.setPos(0.0F, 0.0F, 0.0F);
            Tail.addChild(Tail_4_r1);
            setRotateAngle(Tail_4_r1, -1.5752F, 0.0F, 0.0F);
            Tail_4_r1.texOffs(15, 118).addBox(-1.0F, -0.9988F, 4.5025F, 2.0F, 2.0F, 3.0F, 0.0F, false);
            Tail_4_r1.texOffs(12, 110).addBox(-1.5F, -1.6238F, 1.7025F, 3.0F, 3.0F, 5.0F, 0.0F, false);

            Tail_2_r1 = new ZawaModelRenderer(this, 16, 106);
            Tail_2_r1.setPos(0.0F, 0.0F, 0.6F);
            Tail.addChild(Tail_2_r1);
            setRotateAngle(Tail_2_r1, -1.597F, 0.0F, 0.0F);
            Tail_2_r1.addBox(-1.0F, -0.5488F, 0.1525F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            Tail_1_r1 = new ZawaModelRenderer(this, 13, 99);
            Tail_1_r1.setPos(0.0F, -0.975F, 0.3F);
            Tail.addChild(Tail_1_r1);
            setRotateAngle(Tail_1_r1, -1.405F, 0.0F, 0.0F);
            Tail_1_r1.addBox(-1.0F, -0.6488F, -3.6975F, 2.0F, 2.0F, 5.0F, 0.0F, false);

            Limb_Front_R = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_R.setPos(-0.125F, -10.55F, -7.05F);
            MAIN.addChild(Limb_Front_R);
            Limb_Front_R.texOffs(34, 52).addBox(-3.925F, -0.275F, -1.325F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            Limb_Front_R.texOffs(36, 59).addBox(-3.25F, 3.4301F, -0.8495F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            Limb_Front_R.texOffs(36, 67).addBox(-3.2F, 8.55F, -1.45F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            ArmBase_r1 = new ZawaModelRenderer(this, 32, 40);
            ArmBase_r1.setPos(-0.725F, 0.6F, -4.1F);
            Limb_Front_R.addChild(ArmBase_r1);
            setRotateAngle(ArmBase_r1, 0.0742F, 0.0F, 0.0F);
            ArmBase_r1.addBox(-3.25F, -6.75F, 1.675F, 3.0F, 7.0F, 5.0F, 0.0F, false);

            Limb_Front_L = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_L.setPos(0.125F, -10.55F, -7.05F);
            MAIN.addChild(Limb_Front_L);
            Limb_Front_L.texOffs(34, 87).addBox(0.925F, -0.275F, -1.325F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            Limb_Front_L.texOffs(36, 94).addBox(1.25F, 3.4301F, -0.8495F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            Limb_Front_L.texOffs(36, 103).addBox(1.2F, 8.55F, -1.45F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            ArmBase_r2 = new ZawaModelRenderer(this, 32, 75);
            ArmBase_r2.setPos(0.725F, 0.6F, -4.1F);
            Limb_Front_L.addChild(ArmBase_r2);
            setRotateAngle(ArmBase_r2, 0.0742F, 0.0F, 0.0F);
            ArmBase_r2.addBox(0.25F, -6.75F, 1.675F, 3.0F, 7.0F, 5.0F, 0.0F, false);

            Limb_Back_L = new ZawaModelRenderer(this, 0, 0);
            Limb_Back_L.setPos(0.35F, -10.55F, 0.75F);
            MAIN.addChild(Limb_Back_L);
            Limb_Back_L.texOffs(62, 97).addBox(1.15F, 2.5745F, 7.5366F, 2.0F, 7.0F, 2.0F, 0.0F, false);
            Limb_Back_L.texOffs(62, 106).addBox(1.225F, 8.55F, 6.825F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            UpperLeg_r1 = new ZawaModelRenderer(this, 60, 89);
            UpperLeg_r1.setPos(2.125F, 1.1441F, 7.0257F);
            Limb_Back_L.addChild(UpperLeg_r1);
            setRotateAngle(UpperLeg_r1, 0.4014F, 0.0F, 0.0F);
            UpperLeg_r1.addBox(-1.5F, -2.5F, -1.225F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Thigh_r1 = new ZawaModelRenderer(this, 57, 76);
            Thigh_r1.setPos(2.65F, -3.8832F, 7.4191F);
            Limb_Back_L.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, -0.0872F, 0.0F, 0.0F);
            Thigh_r1.addBox(-2.5F, -4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);

            Limb_Back_R = new ZawaModelRenderer(this, 0, 0);
            Limb_Back_R.setPos(-0.35F, -10.55F, 0.75F);
            MAIN.addChild(Limb_Back_R);
            Limb_Back_R.texOffs(61, 58).addBox(-3.15F, 2.5745F, 7.5366F, 2.0F, 7.0F, 2.0F, 0.0F, false);
            Limb_Back_R.texOffs(61, 67).addBox(-3.225F, 8.55F, 6.825F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            UpperLeg_r2 = new ZawaModelRenderer(this, 59, 50);
            UpperLeg_r2.setPos(-2.125F, 1.1441F, 7.0257F);
            Limb_Back_R.addChild(UpperLeg_r2);
            setRotateAngle(UpperLeg_r2, 0.4014F, 0.0F, 0.0F);
            UpperLeg_r2.addBox(-1.5F, -2.5F, -1.225F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Thigh_r2 = new ZawaModelRenderer(this, 55, 37);
            Thigh_r2.setPos(-2.65F, -3.8832F, 7.4191F);
            Limb_Back_R.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, -0.0872F, 0.0F, 0.0F);
            Thigh_r2.addBox(-1.5F, -4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);

            this.saveBase();

        }

        @Override
        public void setupAnim(BongoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }

    public static class Child extends BongoModel {

        protected ZawaModelRenderer Back;
        protected ZawaModelRenderer cube_r1;
        protected ZawaModelRenderer cube_r2;
        protected ZawaModelRenderer cube_r3;
        protected ZawaModelRenderer cube_r4;
        protected ZawaModelRenderer cube_r5;
        protected ZawaModelRenderer cube_r6;
        protected ZawaModelRenderer cube_r7;
        protected ZawaModelRenderer Face;
        protected ZawaModelRenderer cube_r8;
        protected ZawaModelRenderer cube_r9;
        protected ZawaModelRenderer cube_r10;
        protected ZawaModelRenderer cube_r11;
        protected ZawaModelRenderer cube_r12;
        protected ZawaModelRenderer cube_r13;
        protected ZawaModelRenderer LeftFrontFoot;
        protected ZawaModelRenderer cube_r14;
        protected ZawaModelRenderer cube_r15;
        protected ZawaModelRenderer LeftBackFoot;
        protected ZawaModelRenderer cube_r16;
        protected ZawaModelRenderer cube_r17;
        protected ZawaModelRenderer RightFrontFoot;
        protected ZawaModelRenderer cube_r18;
        protected ZawaModelRenderer cube_r19;
        protected ZawaModelRenderer RightBackFoot;
        protected ZawaModelRenderer cube_r20;
        protected ZawaModelRenderer cube_r21;

        public Child() {
            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(-1.0F, 19.25F, -8.15F);


            Back = new ZawaModelRenderer(this, 0, 0);
            Back.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Back);


            cube_r1 = new ZawaModelRenderer(this, 0, 0);
            cube_r1.setPos(1.0F, -7.771F, 8.6987F);
            Back.addChild(cube_r1);
            setRotateAngle(cube_r1, -0.0218F, 0.0F, 0.0F);
            cube_r1.addBox(-3.0F, -4.025F, -5.5F, 6.0F, 8.0F, 10.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 0, 18);
            cube_r2.setPos(0.9586F, -7.7823F, 14.0776F);
            Back.addChild(cube_r2);
            setRotateAngle(cube_r2, -0.4931F, 0.0F, 0.0F);
            cube_r2.addBox(-2.5F, -2.825F, -2.575F, 5.0F, 7.0F, 4.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 16, 45);
            cube_r3.setPos(0.5F, -7.3003F, 19.3344F);
            Back.addChild(cube_r3);
            setRotateAngle(cube_r3, -1.4661F, 0.0F, 0.0F);
            cube_r3.addBox(0.0F, 2.4762F, -2.4975F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 0, 0);
            cube_r4.setPos(1.0F, -4.9976F, 16.5838F);
            Back.addChild(cube_r4);
            setRotateAngle(cube_r4, -1.597F, 0.0F, 0.0F);
            cube_r4.texOffs(8, 45).addBox(-0.5F, -0.3F, -1.575F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            cube_r4.texOffs(0, 18).addBox(-0.5F, -0.3F, 3.775F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            cube_r4.texOffs(24, 38).addBox(-1.0F, -0.8F, -0.125F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 22, 0);
            cube_r5.setPos(1.5F, -9.5867F, -0.0513F);
            Back.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.6109F, 0.0F, 0.0F);
            cube_r5.addBox(-2.0F, -2.8F, -2.375F, 3.0F, 4.0F, 5.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 0, 29);
            cube_r6.setPos(1.0F, -8.145F, 0.3055F);
            Back.addChild(cube_r6);
            setRotateAngle(cube_r6, -0.8247F, 0.0F, 0.0F);
            cube_r6.addBox(-1.0F, -1.15F, -2.775F, 2.0F, 2.0F, 5.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 18, 18);
            cube_r7.setPos(0.5F, -10.7274F, 0.6526F);
            Back.addChild(cube_r7);
            setRotateAngle(cube_r7, 0.096F, 0.0F, 0.0F);
            cube_r7.addBox(-2.0F, -0.55F, 0.0F, 5.0F, 7.0F, 3.0F, 0.0F, false);

            Face = new ZawaModelRenderer(this, 32, 9);
            Face.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Face);
            Face.addBox(-1.0F, -13.55F, -3.975F, 4.0F, 4.0F, 4.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 0, 5);
            cube_r8.setPos(1.0F, -14.3718F, -3.2223F);
            Face.addChild(cube_r8);
            setRotateAngle(cube_r8, 0.8988F, 0.0F, 0.0F);
            cube_r8.addBox(-1.0F, -0.026F, -4.1433F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 38, 25);
            cube_r9.setPos(1.0F, -11.3867F, -3.7637F);
            Face.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.5192F, 0.0F, 0.0F);
            cube_r9.addBox(-1.5F, -0.8085F, -2.5977F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 0, 0);
            cube_r10.setPos(1.0F, -11.3867F, -3.7637F);
            Face.addChild(cube_r10);
            setRotateAngle(cube_r10, 0.3098F, 0.0F, 0.0F);
            cube_r10.texOffs(22, 44).addBox(-0.75F, -0.3835F, -1.6227F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r10.texOffs(24, 28).addBox(-1.25F, -0.3835F, -1.6227F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 0, 0);
            cube_r11.setPos(1.0F, -11.3117F, -3.7637F);
            Face.addChild(cube_r11);
            setRotateAngle(cube_r11, 0.1353F, 0.0F, 0.0F);
            cube_r11.addBox(-1.0F, -0.0835F, -1.7977F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 33, 0);
            cube_r12.setPos(2.9473F, -13.3561F, -0.695F);
            Face.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.5681F, -0.5207F, -0.6628F);
            cube_r12.addBox(-1.5F, -0.8F, -0.9F, 3.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 9, 29);
            cube_r13.setPos(-0.9473F, -13.3561F, -0.695F);
            Face.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.5681F, 0.5207F, 0.6628F);
            cube_r13.addBox(-1.5F, -0.8F, -0.9F, 3.0F, 2.0F, 1.0F, 0.0F, false);

            LeftFrontFoot = new ZawaModelRenderer(this, 0, 0);
            LeftFrontFoot.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(LeftFrontFoot);
            LeftFrontFoot.texOffs(46, 15).addBox(1.825F, 2.75F, 1.35F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            LeftFrontFoot.texOffs(0, 44).addBox(1.9F, -2.3F, 2.05F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 34, 17);
            cube_r14.setPos(1.1F, -5.3F, 3.425F);
            LeftFrontFoot.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.0742F, 0.0F, 0.0F);
            cube_r14.addBox(0.25F, -1.8026F, -1.9807F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 44, 7);
            cube_r15.setPos(1.0F, 1.6301F, 2.9505F);
            LeftFrontFoot.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
            cube_r15.addBox(0.875F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            LeftBackFoot = new ZawaModelRenderer(this, 0, 0);
            LeftBackFoot.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(LeftBackFoot);
            LeftBackFoot.texOffs(42, 29).addBox(1.75F, -0.3255F, 12.3116F, 2.0F, 4.0F, 2.0F, 0.0F, false);
            LeftBackFoot.texOffs(46, 23).addBox(1.725F, 2.75F, 11.85F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 28, 28);
            cube_r16.setPos(3.25F, -6.2832F, 11.6941F);
            LeftBackFoot.addChild(cube_r16);
            setRotateAngle(cube_r16, -0.0872F, -0.0027F, -0.0304F);
            cube_r16.addBox(-1.75F, -2.0F, -1.25F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 12, 38);
            cube_r17.setPos(2.725F, -0.8059F, 11.3507F);
            LeftBackFoot.addChild(cube_r17);
            setRotateAngle(cube_r17, 0.4014F, 0.0F, 0.0F);
            cube_r17.addBox(-1.5F, -2.5F, -0.225F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            RightFrontFoot = new ZawaModelRenderer(this, 0, 0);
            RightFrontFoot.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(RightFrontFoot);
            RightFrontFoot.texOffs(30, 44).addBox(-1.825F, 2.75F, 1.35F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            RightFrontFoot.texOffs(42, 35).addBox(-1.9F, -2.3F, 2.05F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 0, 36);
            cube_r18.setPos(0.9F, -3.05F, -0.575F);
            RightFrontFoot.addChild(cube_r18);
            setRotateAngle(cube_r18, 0.0742F, 0.0F, 0.0F);
            cube_r18.addBox(-3.25F, -3.75F, 2.175F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 42, 42);
            cube_r19.setPos(1.0F, 1.6301F, 2.9505F);
            RightFrontFoot.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
            cube_r19.addBox(-2.875F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            RightBackFoot = new ZawaModelRenderer(this, 0, 0);
            RightBackFoot.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(RightBackFoot);
            RightBackFoot.texOffs(36, 38).addBox(-2.0F, -0.3255F, 12.3116F, 2.0F, 4.0F, 2.0F, 0.0F, false);
            RightBackFoot.texOffs(46, 19).addBox(-1.975F, 2.75F, 11.85F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 14, 28);
            cube_r20.setPos(-1.25F, -6.2832F, 11.6941F);
            RightBackFoot.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.0872F, 0.0027F, 0.0304F);
            cube_r20.addBox(-1.25F, -2.0F, -1.25F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 38, 0);
            cube_r21.setPos(-0.975F, -0.8059F, 11.3507F);
            RightBackFoot.addChild(cube_r21);
            setRotateAngle(cube_r21, 0.4014F, 0.0F, 0.0F);
            cube_r21.addBox(-1.5F, -2.5F, -0.225F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            this.saveBase();

        }

        @Override
        public void setupAnim(BongoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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