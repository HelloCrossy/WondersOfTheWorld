package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TakinEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class TakinModel extends ZawaBaseModel<TakinEntity> {
    protected ZawaModelRenderer MAIN;
    protected ZawaModelRenderer Ear_R_r1;
    protected ZawaModelRenderer Ear_L_r1;
    protected ZawaModelRenderer Mouth_r1;
    protected ZawaModelRenderer Hips_r1;
    protected ZawaModelRenderer Body_r1;
    protected ZawaModelRenderer Chest_r1;
    protected ZawaModelRenderer Neck_Lower_r1;
    protected ZawaModelRenderer Neck_Upper_L_r1;
    protected ZawaModelRenderer ArmBase_r1;
    protected ZawaModelRenderer ArmBase_r2;
    protected ZawaModelRenderer UpperLeg_r1;
    protected ZawaModelRenderer Thigh_r1;
    protected ZawaModelRenderer UpperLeg_r2;
    protected ZawaModelRenderer Thigh_r2;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(MAIN);
        }

        return this.parts;
    }

    public static class Adult extends TakinModel {

        protected ZawaModelRenderer Head;
        protected ZawaModelRenderer TopSnout_2_r1;
        protected ZawaModelRenderer TopSnout_1_r1;
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer Snout;
        protected ZawaModelRenderer Snout_L_r1;
        protected ZawaModelRenderer Mouth;
        protected ZawaModelRenderer GOLDEN;
        protected ZawaModelRenderer Beard_R_r1;
        protected ZawaModelRenderer SICHUAN;
        protected ZawaModelRenderer Beard_R_r2;
        protected ZawaModelRenderer MISHMI;
        protected ZawaModelRenderer Beard_R_r3;
        protected ZawaModelRenderer BHUTAN;
        protected ZawaModelRenderer Beard_R_r4;
        protected ZawaModelRenderer Horn_R;
        protected ZawaModelRenderer Horn_R_4_r1;
        protected ZawaModelRenderer Horn_R_2_r1;
        protected ZawaModelRenderer Horn_R_1_r1;
        protected ZawaModelRenderer Horn_L;
        protected ZawaModelRenderer Horn_Left1_r1;
        protected ZawaModelRenderer Horn_Left4_r1;
        protected ZawaModelRenderer Horn_Left2_r1;
        protected ZawaModelRenderer Body;
        protected ZawaModelRenderer Tail_r1;
        protected ZawaModelRenderer Neck;
        protected ZawaModelRenderer Neck_1_r1;
        protected ZawaModelRenderer Limb_Front_L;
        protected ZawaModelRenderer Limb_Front_R;
        protected ZawaModelRenderer Limb_Back_L;
        protected ZawaModelRenderer Limb_Back_R;

        public Adult() {
            texWidth = 128;
            texHeight = 128;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 24.0F, -5.0F);


            Head = new ZawaModelRenderer(this, 0, 0);
            Head.setPos(0.0F, -15.3417F, -12.2793F);
            MAIN.addChild(Head);
            setRotateAngle(Head, 0.1963F, 0.0F, 0.0F);


            Ear_R_r1 = new ZawaModelRenderer(this, 97, 84);
            Ear_R_r1.setPos(0.0F, 0.0802F, 7.1373F);
            Head.addChild(Ear_R_r1);
            setRotateAngle(Ear_R_r1, 0.1915F, 0.3578F, 0.3292F);
            Ear_R_r1.addBox(-2.8542F, -6.4262F, -7.4914F, 3.0F, 2.0F, 1.0F, 0.0F, false);

            Ear_L_r1 = new ZawaModelRenderer(this, 119, 84);
            Ear_L_r1.setPos(0.0F, 0.0802F, 7.1373F);
            Head.addChild(Ear_L_r1);
            setRotateAngle(Ear_L_r1, 0.1915F, -0.3578F, -0.3292F);
            Ear_L_r1.addBox(-0.1458F, -6.4262F, -7.4914F, 3.0F, 2.0F, 1.0F, 0.0F, false);

            TopSnout_2_r1 = new ZawaModelRenderer(this, 106, 68);
            TopSnout_2_r1.setPos(0.0F, -1.3042F, -7.0881F);
            Head.addChild(TopSnout_2_r1);
            setRotateAngle(TopSnout_2_r1, 1.165F, 0.0F, 0.0F);
            TopSnout_2_r1.addBox(-1.5F, -0.0221F, 0.0111F, 3.0F, 2.0F, 3.0F, 0.0F, false);

            TopSnout_1_r1 = new ZawaModelRenderer(this, 106, 60);
            TopSnout_1_r1.setPos(-0.02F, -5.7294F, -3.4044F);
            Head.addChild(TopSnout_1_r1);
            setRotateAngle(TopSnout_1_r1, 0.6327F, 0.0F, 0.0F);
            TopSnout_1_r1.addBox(-1.48F, -0.1593F, -3.0163F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            Head_r1 = new ZawaModelRenderer(this, 104, 85);
            Head_r1.setPos(0.0F, -2.8361F, -1.7347F);
            Head.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.0654F, 0.0F, 0.0F);
            Head_r1.addBox(-2.0F, -3.1289F, -1.5949F, 4.0F, 6.0F, 4.0F, 0.0F, false);

            Snout = new ZawaModelRenderer(this, 0, 0);
            Snout.setPos(0.0F, -1.3528F, -7.2526F);
            Head.addChild(Snout);


            Snout_L_r1 = new ZawaModelRenderer(this, 0, 0);
            Snout_L_r1.setPos(0.0F, 0.0F, 0.0F);
            Snout.addChild(Snout_L_r1);
            setRotateAngle(Snout_L_r1, 0.3491F, 0.0F, 0.0F);
            Snout_L_r1.texOffs(104, 75).addBox(-1.475F, 0.0754F, 0.0122F, 3.0F, 2.0F, 5.0F, 0.0F, false);
            Snout_L_r1.texOffs(104, 75).addBox(-1.525F, 0.0754F, 0.0122F, 3.0F, 2.0F, 5.0F, 0.0F, true);

            Mouth = new ZawaModelRenderer(this, 0, 0);
            Mouth.setPos(-0.0047F, -0.3767F, -1.7532F);
            Head.addChild(Mouth);


            Mouth_r1 = new ZawaModelRenderer(this, 106, 97);
            Mouth_r1.setPos(0.0047F, -0.9761F, -5.4993F);
            Mouth.addChild(Mouth_r1);
            setRotateAngle(Mouth_r1, 0.3883F, 0.0F, 0.0F);
            Mouth_r1.addBox(-1.0F, 2.1025F, 0.5233F, 2.0F, 1.0F, 4.0F, 0.0F, false);

            GOLDEN = new ZawaModelRenderer(this, 0, 0);
            GOLDEN.setPos(0.0094F, 0.0F, 0.0F);
            Mouth.addChild(GOLDEN);


            Beard_R_r1 = new ZawaModelRenderer(this, 0, 0);
            Beard_R_r1.setPos(0.0F, 0.0F, 0.0F);
            GOLDEN.addChild(Beard_R_r1);
            setRotateAngle(Beard_R_r1, 0.6059F, 0.0F, 0.0F);
            Beard_R_r1.texOffs(51, 114).addBox(-1.0297F, -1.5F, -2.5F, 2.0F, 4.0F, 5.0F, 0.0F, true);
            Beard_R_r1.texOffs(51, 114).addBox(-0.9797F, -1.5F, -2.5F, 2.0F, 4.0F, 5.0F, 0.0F, false);

            SICHUAN = new ZawaModelRenderer(this, 0, 0);
            SICHUAN.setPos(0.0094F, 0.1F, 0.0F);
            Mouth.addChild(SICHUAN);
            setRotateAngle(SICHUAN, -0.2618F, 0.0F, 0.0F);


            Beard_R_r2 = new ZawaModelRenderer(this, 0, 0);
            Beard_R_r2.setPos(0.0F, 0.0F, 0.0F);
            SICHUAN.addChild(Beard_R_r2);
            setRotateAngle(Beard_R_r2, 0.6059F, 0.0F, 0.0F);
            Beard_R_r2.texOffs(110, 114).addBox(-1.0297F, -1.5F, -2.5F, 2.0F, 4.0F, 5.0F, 0.0F, true);
            Beard_R_r2.texOffs(110, 114).addBox(-0.9797F, -1.5F, -2.5F, 2.0F, 4.0F, 5.0F, 0.0F, false);

            MISHMI = new ZawaModelRenderer(this, 0, 0);
            MISHMI.setPos(0.0094F, 0.0F, 0.0F);
            Mouth.addChild(MISHMI);


            Beard_R_r3 = new ZawaModelRenderer(this, 0, 0);
            Beard_R_r3.setPos(0.0F, 0.0F, 0.0F);
            MISHMI.addChild(Beard_R_r3);
            setRotateAngle(Beard_R_r3, 0.5623F, 0.0F, 0.0F);
            Beard_R_r3.texOffs(93, 114).addBox(-1.0297F, -2.35F, -2.4F, 2.0F, 4.0F, 5.0F, 0.0F, true);
            Beard_R_r3.texOffs(93, 114).addBox(-0.9797F, -2.35F, -2.4F, 2.0F, 4.0F, 5.0F, 0.0F, false);

            BHUTAN = new ZawaModelRenderer(this, 0, 0);
            BHUTAN.setPos(0.0094F, 0.0F, 0.0F);
            Mouth.addChild(BHUTAN);


            Beard_R_r4 = new ZawaModelRenderer(this, 0, 0);
            Beard_R_r4.setPos(0.0F, 0.0F, 0.0F);
            BHUTAN.addChild(Beard_R_r4);
            setRotateAngle(Beard_R_r4, 0.3877F, 0.0F, 0.0F);
            Beard_R_r4.texOffs(36, 114).addBox(-1.0297F, -2.4F, -2.7F, 2.0F, 4.0F, 5.0F, 0.0F, true);
            Beard_R_r4.texOffs(36, 114).addBox(-0.9797F, -2.4F, -2.7F, 2.0F, 4.0F, 5.0F, 0.0F, false);

            Horn_R = new ZawaModelRenderer(this, 0, 0);
            Horn_R.setPos(-1.6426F, -5.9088F, -1.7612F);
            Head.addChild(Horn_R);
            setRotateAngle(Horn_R, 0.0F, -0.2618F, 0.0F);


            Horn_R_4_r1 = new ZawaModelRenderer(this, 0, 0);
            Horn_R_4_r1.setPos(0.0F, -0.2F, 0.1F);
            Horn_R.addChild(Horn_R_4_r1);
            setRotateAngle(Horn_R_4_r1, 0.5937F, 0.1214F, -0.281F);
            Horn_R_4_r1.texOffs(108, 39).addBox(-2.4125F, -0.732F, -0.0281F, 1.0F, 1.0F, 3.0F, 0.0F, true);
            Horn_R_4_r1.texOffs(107, 43).addBox(-2.4125F, -0.732F, -0.0281F, 1.0F, 1.0F, 4.0F, 0.0F, true);

            Horn_R_2_r1 = new ZawaModelRenderer(this, 109, 50);
            Horn_R_2_r1.setPos(0.0F, -0.2F, 0.1F);
            Horn_R.addChild(Horn_R_2_r1);
            setRotateAngle(Horn_R_2_r1, 0.6384F, 0.3714F, -0.0994F);
            Horn_R_2_r1.addBox(-2.2875F, -0.732F, -0.7531F, 2.0F, 1.0F, 1.0F, 0.0F, true);

            Horn_R_1_r1 = new ZawaModelRenderer(this, 108, 54);
            Horn_R_1_r1.setPos(0.0F, 0.0F, 0.0F);
            Horn_R.addChild(Horn_R_1_r1);
            setRotateAngle(Horn_R_1_r1, 0.5937F, 0.1214F, -0.281F);
            Horn_R_1_r1.addBox(-0.5875F, -0.982F, -0.7531F, 2.0F, 2.0F, 2.0F, 0.0F, true);

            Horn_L = new ZawaModelRenderer(this, 0, 0);
            Horn_L.setPos(1.6426F, -5.9088F, -1.7612F);
            Head.addChild(Horn_L);
            setRotateAngle(Horn_L, 0.0F, 0.2618F, 0.0F);


            Horn_Left1_r1 = new ZawaModelRenderer(this, 108, 54);
            Horn_Left1_r1.setPos(0.0F, 0.0F, 0.0F);
            Horn_L.addChild(Horn_Left1_r1);
            setRotateAngle(Horn_Left1_r1, 0.5937F, -0.1214F, 0.281F);
            Horn_Left1_r1.addBox(-1.4125F, -0.982F, -0.7531F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            Horn_Left4_r1 = new ZawaModelRenderer(this, 0, 0);
            Horn_Left4_r1.setPos(0.0F, -0.2F, 0.1F);
            Horn_L.addChild(Horn_Left4_r1);
            setRotateAngle(Horn_Left4_r1, 0.5937F, -0.1214F, 0.281F);
            Horn_Left4_r1.texOffs(108, 39).addBox(1.4125F, -0.732F, -0.0281F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            Horn_Left4_r1.texOffs(107, 43).addBox(1.4125F, -0.732F, -0.0281F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            Horn_Left2_r1 = new ZawaModelRenderer(this, 109, 50);
            Horn_Left2_r1.setPos(0.0F, -0.2F, 0.1F);
            Horn_L.addChild(Horn_Left2_r1);
            setRotateAngle(Horn_Left2_r1, 0.6384F, -0.3714F, 0.0994F);
            Horn_Left2_r1.addBox(0.2875F, -0.732F, -0.7531F, 2.0F, 1.0F, 1.0F, 0.0F, false);

            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, -8.475F, -6.625F);
            MAIN.addChild(Body);


            Tail_r1 = new ZawaModelRenderer(this, 69, 8);
            Tail_r1.setPos(0.0F, -8.9198F, 21.4338F);
            Body.addChild(Tail_r1);
            setRotateAngle(Tail_r1, 0.1658F, 0.0F, 0.0F);
            Tail_r1.addBox(-1.0F, -1.5F, -0.8F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            Hips_r1 = new ZawaModelRenderer(this, 60, 17);
            Hips_r1.setPos(0.0F, -7.8675F, 11.2133F);
            Body.addChild(Hips_r1);
            setRotateAngle(Hips_r1, -0.2749F, 0.0F, 0.0F);
            Hips_r1.addBox(-3.5F, -7.1821F, 3.79F, 7.0F, 11.0F, 6.0F, 0.0F, false);

            Body_r1 = new ZawaModelRenderer(this, 53, 36);
            Body_r1.setPos(0.0F, -8.4175F, 9.8383F);
            Body.addChild(Body_r1);
            setRotateAngle(Body_r1, -0.1178F, 0.0F, 0.0F);
            Body_r1.addBox(-4.0F, -6.4501F, -5.1744F, 8.0F, 13.0F, 12.0F, 0.0F, false);

            Chest_r1 = new ZawaModelRenderer(this, 59, 64);
            Chest_r1.setPos(0.0F, -8.6375F, 3.953F);
            Body.addChild(Chest_r1);
            setRotateAngle(Chest_r1, -0.2531F, 0.0F, 0.0F);
            Chest_r1.addBox(-3.5F, -6.725F, -3.475F, 7.0F, 13.0F, 7.0F, 0.0F, false);

            Neck = new ZawaModelRenderer(this, 0, 0);
            Neck.setPos(-0.5F, -9.4788F, -2.7299F);
            Body.addChild(Neck);


            Neck_Lower_r1 = new ZawaModelRenderer(this, 71, 111);
            Neck_Lower_r1.setPos(0.0F, 0.0F, 0.0F);
            Neck.addChild(Neck_Lower_r1);
            setRotateAngle(Neck_Lower_r1, 0.0044F, 0.0F, 0.0F);
            Neck_Lower_r1.addBox(-1.0F, -1.4F, -3.3F, 3.0F, 5.0F, 7.0F, 0.0F, false);

            Neck_Upper_L_r1 = new ZawaModelRenderer(this, 0, 0);
            Neck_Upper_L_r1.setPos(1.5F, -1.3487F, -4.7502F);
            Neck.addChild(Neck_Upper_L_r1);
            setRotateAngle(Neck_Upper_L_r1, 0.3883F, 0.0F, 0.0F);
            Neck_Upper_L_r1.texOffs(72, 92).addBox(-1.025F, -1.8254F, -0.1873F, 2.0F, 6.0F, 7.0F, 0.0F, true);
            Neck_Upper_L_r1.texOffs(72, 92).addBox(-2.975F, -1.8254F, -0.1873F, 2.0F, 6.0F, 7.0F, 0.0F, false);

            Neck_1_r1 = new ZawaModelRenderer(this, 49, 89);
            Neck_1_r1.setPos(-0.5F, -6.2237F, 3.8748F);
            Neck.addChild(Neck_1_r1);
            setRotateAngle(Neck_1_r1, 0.2138F, 0.0F, 0.0F);
            Neck_1_r1.addBox(-1.5F, -0.0517F, -3.8273F, 5.0F, 11.0F, 5.0F, 0.0F, false);

            Limb_Front_L = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_L.setPos(0.6F, -10.05F, -8.3F);
            MAIN.addChild(Limb_Front_L);
            Limb_Front_L.texOffs(24, 109).addBox(0.2F, -0.8F, 4.2071F, 3.0F, 6.0F, 3.0F, 0.0F, false);
            Limb_Front_L.texOffs(26, 118).addBox(0.775F, 5.0551F, 4.6826F, 2.0F, 4.0F, 2.0F, 0.0F, false);
            Limb_Front_L.texOffs(26, 124).addBox(0.875F, 8.05F, 4.3821F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            ArmBase_r1 = new ZawaModelRenderer(this, 20, 95);
            ArmBase_r1.setPos(0.0F, -0.05F, 1.2821F);
            Limb_Front_L.addChild(ArmBase_r1);
            setRotateAngle(ArmBase_r1, 0.0742F, 0.0F, 0.0F);
            ArmBase_r1.addBox(-0.5F, -6.25F, 1.425F, 4.0F, 8.0F, 6.0F, 0.0F, false);

            Limb_Front_R = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_R.setPos(-0.6F, -10.05F, -8.3F);
            MAIN.addChild(Limb_Front_R);
            Limb_Front_R.texOffs(0, 109).addBox(-3.2F, -0.8F, 4.2071F, 3.0F, 6.0F, 3.0F, 0.0F, false);
            Limb_Front_R.texOffs(0, 118).addBox(-2.775F, 5.0551F, 4.6826F, 2.0F, 4.0F, 2.0F, 0.0F, false);
            Limb_Front_R.texOffs(0, 124).addBox(-2.875F, 8.05F, 4.3821F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            ArmBase_r2 = new ZawaModelRenderer(this, 0, 95);
            ArmBase_r2.setPos(0.0F, -0.05F, 1.2821F);
            Limb_Front_R.addChild(ArmBase_r2);
            setRotateAngle(ArmBase_r2, 0.0742F, 0.0F, 0.0F);
            ArmBase_r2.addBox(-3.5F, -6.25F, 1.425F, 4.0F, 8.0F, 6.0F, 0.0F, false);

            Limb_Back_L = new ZawaModelRenderer(this, 0, 0);
            Limb_Back_L.setPos(1.0F, -9.825F, 3.9F);
            MAIN.addChild(Limb_Back_L);
            Limb_Back_L.texOffs(32, 78).addBox(0.75F, 2.8495F, 8.6436F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            Limb_Back_L.texOffs(32, 86).addBox(0.825F, 7.825F, 8.2321F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            UpperLeg_r1 = new ZawaModelRenderer(this, 29, 68);
            UpperLeg_r1.setPos(1.725F, 1.4941F, 7.1828F);
            Limb_Back_L.addChild(UpperLeg_r1);
            setRotateAngle(UpperLeg_r1, 0.5629F, 0.0F, 0.0F);
            UpperLeg_r1.addBox(-1.5F, -2.5F, -1.5F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            Thigh_r1 = new ZawaModelRenderer(this, 25, 52);
            Thigh_r1.setPos(-1.0F, -3.0483F, 7.8562F);
            Limb_Back_L.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, -0.1745F, 0.0F, 0.0F);
            Thigh_r1.addBox(0.5F, -5.0F, -4.0F, 4.0F, 9.0F, 7.0F, 0.0F, false);

            Limb_Back_R = new ZawaModelRenderer(this, 0, 0);
            Limb_Back_R.setPos(-1.0F, -9.825F, 3.9F);
            MAIN.addChild(Limb_Back_R);
            Limb_Back_R.texOffs(7, 78).addBox(-2.75F, 2.8495F, 8.6436F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            Limb_Back_R.texOffs(7, 86).addBox(-2.825F, 7.825F, 8.2321F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            UpperLeg_r2 = new ZawaModelRenderer(this, 4, 68);
            UpperLeg_r2.setPos(-1.725F, 1.4941F, 7.1828F);
            Limb_Back_R.addChild(UpperLeg_r2);
            setRotateAngle(UpperLeg_r2, 0.5629F, 0.0F, 0.0F);
            UpperLeg_r2.addBox(-1.5F, -2.5F, -1.5F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            Thigh_r2 = new ZawaModelRenderer(this, 0, 52);
            Thigh_r2.setPos(1.0F, -3.0483F, 7.8562F);
            Limb_Back_R.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, -0.1745F, 0.0F, 0.0F);
            Thigh_r2.addBox(-4.5F, -5.0F, -4.0F, 4.0F, 9.0F, 7.0F, 0.0F, false);
            this.saveBase();

        }

        @Override
        public void setupAnim(TakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }

    public static class Child extends TakinModel {
        protected ZawaModelRenderer HEAD2;
        protected ZawaModelRenderer TopSnout_r1;
        protected ZawaModelRenderer BODY2;
        protected ZawaModelRenderer Limb_Front_R2;
        protected ZawaModelRenderer Limb_Front_R3;
        protected ZawaModelRenderer Limb_Front_R4;
        protected ZawaModelRenderer Limb_Front_R5;

        public Child() {
            texWidth = 32;
            texHeight = 32;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 24.0F, 21.0F);


            HEAD2 = new ZawaModelRenderer(this, 0, 0);
            HEAD2.setPos(0.5F, -9.0487F, -30.3766F);
            MAIN.addChild(HEAD2);


            TopSnout_r1 = new ZawaModelRenderer(this, 7, 11);
            TopSnout_r1.setPos(0.0F, 0.0F, 0.0F);
            HEAD2.addChild(TopSnout_r1);
            setRotateAngle(TopSnout_r1, 0.7418F, 0.0F, 0.0F);
            TopSnout_r1.addBox(-1.0F, -0.975F, -0.925F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            Mouth_r1 = new ZawaModelRenderer(this, 0, 0);
            Mouth_r1.setPos(-0.5F, -0.8626F, 1.4057F);
            HEAD2.addChild(Mouth_r1);
            setRotateAngle(Mouth_r1, 0.3054F, 0.0F, 0.0F);
            Mouth_r1.texOffs(8, 19).addBox(-0.5F, 0.425F, -2.625F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            Mouth_r1.texOffs(14, 3).addBox(-0.25F, -0.1F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
            Mouth_r1.texOffs(14, 3).addBox(-0.75F, -0.1F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            Mouth_r1.texOffs(24, 24).addBox(-1.0F, -1.5F, -1.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            Ear_R_r1 = new ZawaModelRenderer(this, 11, 11);
            Ear_R_r1.setPos(-1.75F, -1.8667F, 1.5068F);
            HEAD2.addChild(Ear_R_r1);
            setRotateAngle(Ear_R_r1, 0.2783F, -0.1274F, 0.4185F);
            Ear_R_r1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

            Ear_L_r1 = new ZawaModelRenderer(this, 11, 11);
            Ear_L_r1.setPos(0.75F, -1.8667F, 1.5068F);
            HEAD2.addChild(Ear_L_r1);
            setRotateAngle(Ear_L_r1, 0.2783F, 0.1274F, -0.4185F);
            Ear_L_r1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            BODY2 = new ZawaModelRenderer(this, 14, 0);
            BODY2.setPos(1.0F, -7.7406F, -14.4856F);
            MAIN.addChild(BODY2);
            BODY2.addBox(-1.5F, -1.025F, -2.025F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            Hips_r1 = new ZawaModelRenderer(this, 12, 19);
            Hips_r1.setPos(-1.0F, -0.3707F, -2.9854F);
            BODY2.addChild(Hips_r1);
            setRotateAngle(Hips_r1, -0.3927F, 0.0F, 0.0F);
            Hips_r1.addBox(-1.5F, -1.85F, -1.65F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            Body_r1 = new ZawaModelRenderer(this, 0, 0);
            Body_r1.setPos(-1.0F, -0.6957F, -6.4854F);
            BODY2.addChild(Body_r1);
            setRotateAngle(Body_r1, -0.0873F, 0.0F, 0.0F);
            Body_r1.addBox(-2.0F, -2.25F, -3.0F, 4.0F, 5.0F, 6.0F, 0.0F, false);

            Chest_r1 = new ZawaModelRenderer(this, 12, 11);
            Chest_r1.setPos(-1.0F, -0.3957F, -9.9854F);
            BODY2.addChild(Chest_r1);
            setRotateAngle(Chest_r1, -0.1745F, 0.0F, 0.0F);
            Chest_r1.addBox(-1.5F, -2.95F, -1.925F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Neck_Lower_r1 = new ZawaModelRenderer(this, 0, 11);
            Neck_Lower_r1.setPos(-1.0F, -0.627F, -11.7746F);
            BODY2.addChild(Neck_Lower_r1);
            setRotateAngle(Neck_Lower_r1, -0.4363F, 0.0F, 0.0F);
            Neck_Lower_r1.addBox(-0.5F, -1.475F, -3.15F, 1.0F, 3.0F, 5.0F, 0.0F, false);

            Neck_Upper_L_r1 = new ZawaModelRenderer(this, 0, 0);
            Neck_Upper_L_r1.setPos(-1.0F, -3.4496F, -10.9635F);
            BODY2.addChild(Neck_Upper_L_r1);
            setRotateAngle(Neck_Upper_L_r1, -0.0873F, 0.0F, 0.0F);
            Neck_Upper_L_r1.texOffs(0, 19).addBox(-0.025F, 0.211F, -3.2017F, 1.0F, 3.0F, 4.0F, 0.0F, false);
            Neck_Upper_L_r1.texOffs(0, 19).addBox(-0.975F, 0.211F, -3.2017F, 1.0F, 3.0F, 4.0F, 0.0F, false);

            Limb_Front_R2 = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_R2.setPos(-1.1F, -5.4933F, -24.1273F);
            MAIN.addChild(Limb_Front_R2);
            Limb_Front_R2.texOffs(24, 19).addBox(-1.1F, -0.5F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            Limb_Front_R2.texOffs(0, 26).addBox(-1.1F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            Limb_Front_R2.texOffs(24, 29).addBox(-1.125F, 4.5F, -1.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            ArmBase_r1 = new ZawaModelRenderer(this, 21, 7);
            ArmBase_r1.setPos(3.5F, -2.643F, -0.3436F);
            Limb_Front_R2.addChild(ArmBase_r1);
            setRotateAngle(ArmBase_r1, 0.1309F, 0.0F, 0.0F);
            ArmBase_r1.addBox(-4.5F, -0.4F, -1.75F, 2.0F, 3.0F, 3.0F, 0.0F, false);

            Limb_Front_R3 = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_R3.setPos(1.1F, -5.4933F, -24.1273F);
            MAIN.addChild(Limb_Front_R3);
            Limb_Front_R3.texOffs(24, 19).addBox(-0.9F, -0.5F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, true);
            Limb_Front_R3.texOffs(0, 26).addBox(-0.9F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, true);
            Limb_Front_R3.texOffs(24, 29).addBox(-0.875F, 4.5F, -1.8F, 2.0F, 1.0F, 2.0F, 0.0F, true);

            ArmBase_r2 = new ZawaModelRenderer(this, 21, 7);
            ArmBase_r2.setPos(-3.5F, -2.643F, -0.3436F);
            Limb_Front_R3.addChild(ArmBase_r2);
            setRotateAngle(ArmBase_r2, 0.1309F, 0.0F, 0.0F);
            ArmBase_r2.addBox(2.5F, -0.4F, -1.75F, 2.0F, 3.0F, 3.0F, 0.0F, true);

            Limb_Front_R4 = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_R4.setPos(-1.1F, -5.4933F, -18.6273F);
            MAIN.addChild(Limb_Front_R4);
            Limb_Front_R4.texOffs(9, 26).addBox(-1.1F, 1.725F, 1.1F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            Limb_Front_R4.texOffs(24, 29).addBox(-1.125F, 4.475F, 0.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            UpperLeg_r1 = new ZawaModelRenderer(this, 24, 13);
            UpperLeg_r1.setPos(0.0F, 0.0F, 0.0F);
            Limb_Front_R4.addChild(UpperLeg_r1);
            setRotateAngle(UpperLeg_r1, 0.6545F, 0.0F, 0.0F);
            UpperLeg_r1.addBox(-1.1F, -0.725F, -0.575F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            Thigh_r1 = new ZawaModelRenderer(this, 20, 0);
            Thigh_r1.setPos(3.5F, -2.643F, 0.1564F);
            Limb_Front_R4.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, -0.2182F, 0.0F, 0.0F);
            Thigh_r1.addBox(-4.5F, -1.4F, -0.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            Limb_Front_R5 = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_R5.setPos(1.1F, -5.4933F, -18.6273F);
            MAIN.addChild(Limb_Front_R5);
            Limb_Front_R5.texOffs(9, 26).addBox(-0.9F, 1.725F, 1.1F, 2.0F, 3.0F, 2.0F, 0.0F, true);
            Limb_Front_R5.texOffs(24, 29).addBox(-0.875F, 4.475F, 0.75F, 2.0F, 1.0F, 2.0F, 0.0F, true);

            UpperLeg_r2 = new ZawaModelRenderer(this, 20, 0);
            UpperLeg_r2.setPos(0.0F, 0.0F, 0.0F);
            Limb_Front_R5.addChild(UpperLeg_r2);
            setRotateAngle(UpperLeg_r2, 0.6545F, 0.0F, 0.0F);
            UpperLeg_r2.addBox(-0.9F, -0.725F, -0.575F, 2.0F, 4.0F, 2.0F, 0.0F, true);

            Thigh_r2 = new ZawaModelRenderer(this, 20, 0);
            Thigh_r2.setPos(-3.5F, -2.643F, 0.1564F);
            Limb_Front_R5.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, -0.2182F, 0.0F, 0.0F);
            Thigh_r2.addBox(2.5F, -1.4F, -0.5F, 2.0F, 4.0F, 3.0F, 0.0F, true);
            this.saveBase();

        }

        @Override
        public void setupAnim(TakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

