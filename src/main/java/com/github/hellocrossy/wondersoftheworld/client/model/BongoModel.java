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

        public Child() {
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
    }