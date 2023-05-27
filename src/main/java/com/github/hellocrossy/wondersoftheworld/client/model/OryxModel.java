package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.OryxEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class OryxModel extends ZawaBaseModel<OryxEntity> {

    protected ZawaModelRenderer MAIN;
    protected ZawaModelRenderer BODY;
    protected ZawaModelRenderer HEAD;
    protected ZawaModelRenderer Tail;
    protected ZawaModelRenderer Head_r1;
    protected ZawaModelRenderer Body_r1;
    protected ZawaModelRenderer Mouth_r1;
    protected ZawaModelRenderer TopSnout_r1;
    protected ZawaModelRenderer Ear_R_r1;
    protected ZawaModelRenderer Ear_L_r1;
    protected ZawaModelRenderer Hips_r1;
    protected ZawaModelRenderer Chest_r1;
    protected ZawaModelRenderer Mane_3_r1;
    protected ZawaModelRenderer Mane_2_r1;
    protected ZawaModelRenderer Neck_1_r1;
    protected ZawaModelRenderer Limb_Front_R;
    protected ZawaModelRenderer ArmBase_r1;
    protected ZawaModelRenderer Limb_Front_L;
    protected ZawaModelRenderer ArmBase_r2;
    protected ZawaModelRenderer Limb_Back_R;
    protected ZawaModelRenderer Limb_Back_L;
    protected ZawaModelRenderer Mane_1_r1;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(MAIN);
        }

        return this.parts;
    }

    public static class oryxOne extends OryxModel {

        protected ZawaModelRenderer Snout;
        protected ZawaModelRenderer Snout_L_r1;
        protected ZawaModelRenderer Ear_R;
        protected ZawaModelRenderer Fringe_R_r1;
        protected ZawaModelRenderer Ear_L;
        protected ZawaModelRenderer Fringe_L_r1;
        protected ZawaModelRenderer Variant_1;
        protected ZawaModelRenderer Horn_R1;
        protected ZawaModelRenderer Horn_3_r1;
        protected ZawaModelRenderer Horn_2_r1;
        protected ZawaModelRenderer Horn_1_r1;
        protected ZawaModelRenderer Horn_L1;
        protected ZawaModelRenderer Horn_3_r2;
        protected ZawaModelRenderer Horn_2_r2;
        protected ZawaModelRenderer Horn_1_r2;
        protected ZawaModelRenderer Variant_2;
        protected ZawaModelRenderer Horn_R2;
        protected ZawaModelRenderer Horn_3_r3;
        protected ZawaModelRenderer Horn_2_r3;
        protected ZawaModelRenderer Horn_1_r3;
        protected ZawaModelRenderer Horn_L2;
        protected ZawaModelRenderer Horn_3_r4;
        protected ZawaModelRenderer Horn_2_r4;
        protected ZawaModelRenderer Horn_1_r4;
        protected ZawaModelRenderer Variant_3;
        protected ZawaModelRenderer Horn_R3;
        protected ZawaModelRenderer Horn_3_r5;
        protected ZawaModelRenderer Horn_2_r5;
        protected ZawaModelRenderer Horn_1_r5;
        protected ZawaModelRenderer Horn_L3;
        protected ZawaModelRenderer Horn_3_r6;
        protected ZawaModelRenderer Horn_2_r6;
        protected ZawaModelRenderer Horn_1_r6;
        protected ZawaModelRenderer Neck;
        protected ZawaModelRenderer Neck_Lower_3_r1;
        protected ZawaModelRenderer Neck_Skin_1_r1;
        protected ZawaModelRenderer Neck_Lower_r1;
        protected ZawaModelRenderer UpperLeg_r1;
        protected ZawaModelRenderer Thigh_r1;
        protected ZawaModelRenderer UpperLeg_r2;
        protected ZawaModelRenderer Thigh_r2;

        public oryxOne() {

            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(1.0F, 14.25F, -12.9F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(-1.0F, -11.7417F, -4.5043F);
            MAIN.addChild(HEAD);
            setRotateAngle(HEAD, 0.1963F, 0.0F, 0.0F);


            Mouth_r1 = new ZawaModelRenderer(this, 19, 22);
            Mouth_r1.setPos(0.0F, 1.8763F, 1.9521F);
            HEAD.addChild(Mouth_r1);
            setRotateAngle(Mouth_r1, 0.1702F, 0.0F, 0.0F);
            Mouth_r1.addBox(-1.0F, -0.8865F, -5.6817F, 2.0F, 1.0F, 6.0F, 0.0F, false);

            TopSnout_r1 = new ZawaModelRenderer(this, 44, 49);
            TopSnout_r1.setPos(0.0F, -1.9355F, -0.0585F);
            HEAD.addChild(TopSnout_r1);
            setRotateAngle(TopSnout_r1, 0.637F, 0.0F, 0.0F);
            TopSnout_r1.addBox(-1.0F, -0.0208F, -3.9689F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            Head_r1 = new ZawaModelRenderer(this, 47, 33);
            Head_r1.setPos(0.0F, -0.027F, 0.6558F);
            HEAD.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.1047F, 0.0F, 0.0F);
            Head_r1.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 3.0F, 0.0F, false);

            Snout = new ZawaModelRenderer(this, 0, 0);
            Snout.setPos(0.0F, 2.5952F, -3.4928F);
            HEAD.addChild(Snout);


            Snout_L_r1 = new ZawaModelRenderer(this, 0, 0);
            Snout_L_r1.setPos(0.0F, 0.0F, 3.8F);
            Snout.addChild(Snout_L_r1);
            setRotateAngle(Snout_L_r1, 0.2269F, 0.0F, 0.0F);
            Snout_L_r1.texOffs(22, 55).addBox(-0.75F, -2.9784F, -4.3793F, 2.0F, 2.0F, 6.0F, 0.0F, true);
            Snout_L_r1.texOffs(22, 55).addBox(-1.25F, -2.9784F, -4.3793F, 2.0F, 2.0F, 6.0F, 0.0F, false);

            Ear_R = new ZawaModelRenderer(this, 0, 0);
            Ear_R.setPos(-3.558F, -0.4408F, 0.9585F);
            HEAD.addChild(Ear_R);


            Fringe_R_r1 = new ZawaModelRenderer(this, 36, 0);
            Fringe_R_r1.setPos(0.0F, 0.0F, 0.0F);
            Ear_R.addChild(Fringe_R_r1);
            setRotateAngle(Fringe_R_r1, 0.1162F, -0.1341F, -0.327F);
            Fringe_R_r1.addBox(-1.8834F, -2.6084F, 1.6828F, 3.0F, 2.0F, 0.0F, 0.0F, true);

            Ear_R_r1 = new ZawaModelRenderer(this, 0, 9);
            Ear_R_r1.setPos(2.2227F, -1.3271F, 1.0231F);
            Ear_R.addChild(Ear_R_r1);
            setRotateAngle(Ear_R_r1, -0.0366F, -0.1734F, 0.6003F);
            Ear_R_r1.addBox(-2.6106F, -0.1085F, -0.0548F, 4.0F, 2.0F, 1.0F, 0.0F, true);

            Ear_L = new ZawaModelRenderer(this, 0, 0);
            Ear_L.setPos(3.558F, -0.4408F, 0.9585F);
            HEAD.addChild(Ear_L);


            Fringe_L_r1 = new ZawaModelRenderer(this, 36, 0);
            Fringe_L_r1.setPos(0.0F, 0.0F, 0.0F);
            Ear_L.addChild(Fringe_L_r1);
            setRotateAngle(Fringe_L_r1, 0.1162F, 0.1341F, 0.327F);
            Fringe_L_r1.addBox(-1.1166F, -2.6084F, 1.6828F, 3.0F, 2.0F, 0.0F, 0.0F, false);

            Ear_L_r1 = new ZawaModelRenderer(this, 0, 9);
            Ear_L_r1.setPos(-2.2227F, -1.3271F, 1.0231F);
            Ear_L.addChild(Ear_L_r1);
            setRotateAngle(Ear_L_r1, -0.0366F, 0.1734F, -0.6003F);
            Ear_L_r1.addBox(-1.3894F, -0.1085F, -0.0548F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            Variant_1 = new ZawaModelRenderer(this, 0, 0);
            Variant_1.setPos(0.0F, -0.027F, 0.6558F);
            HEAD.addChild(Variant_1);


            Horn_R1 = new ZawaModelRenderer(this, 0, 0);
            Horn_R1.setPos(-0.6265F, -1.9636F, -0.5869F);
            Variant_1.addChild(Horn_R1);


            Horn_3_r1 = new ZawaModelRenderer(this, 29, 50);
            Horn_3_r1.setPos(0.0F, -6.975F, 10.725F);
            Horn_R1.addChild(Horn_3_r1);
            setRotateAngle(Horn_3_r1, -1.0908F, -0.2182F, 0.0F);
            Horn_3_r1.addBox(-3.0523F, -4.5906F, 0.3866F, 1.0F, 5.0F, 1.0F, 0.0F, true);

            Horn_2_r1 = new ZawaModelRenderer(this, 23, 50);
            Horn_2_r1.setPos(0.0F, -3.0F, 4.825F);
            Horn_R1.addChild(Horn_2_r1);
            setRotateAngle(Horn_2_r1, -1.0036F, -0.2182F, 0.0F);
            Horn_2_r1.addBox(-1.7722F, -6.5488F, 0.0913F, 1.0F, 6.0F, 1.0F, 0.0F, true);

            Horn_1_r1 = new ZawaModelRenderer(this, 42, 36);
            Horn_1_r1.setPos(0.0F, 0.0F, 0.075F);
            Horn_R1.addChild(Horn_1_r1);
            setRotateAngle(Horn_1_r1, -1.0036F, -0.2182F, 0.0F);
            Horn_1_r1.addBox(-0.7441F, -6.0719F, 0.0528F, 1.0F, 6.0F, 1.0F, 0.0F, true);

            Horn_L1 = new ZawaModelRenderer(this, 0, 0);
            Horn_L1.setPos(0.6265F, -1.9636F, -0.5869F);
            Variant_1.addChild(Horn_L1);


            Horn_3_r2 = new ZawaModelRenderer(this, 29, 50);
            Horn_3_r2.setPos(0.0F, -6.975F, 10.725F);
            Horn_L1.addChild(Horn_3_r2);
            setRotateAngle(Horn_3_r2, -1.0908F, 0.2182F, 0.0F);
            Horn_3_r2.addBox(2.0523F, -4.5906F, 0.3866F, 1.0F, 5.0F, 1.0F, 0.0F, false);

            Horn_2_r2 = new ZawaModelRenderer(this, 23, 50);
            Horn_2_r2.setPos(0.0F, -3.0F, 4.825F);
            Horn_L1.addChild(Horn_2_r2);
            setRotateAngle(Horn_2_r2, -1.0036F, 0.2182F, 0.0F);
            Horn_2_r2.addBox(0.7722F, -6.5488F, 0.0913F, 1.0F, 6.0F, 1.0F, 0.0F, false);

            Horn_1_r2 = new ZawaModelRenderer(this, 42, 36);
            Horn_1_r2.setPos(0.0F, 0.0F, 0.075F);
            Horn_L1.addChild(Horn_1_r2);
            setRotateAngle(Horn_1_r2, -1.0036F, 0.2182F, 0.0F);
            Horn_1_r2.addBox(-0.2559F, -6.0719F, 0.0528F, 1.0F, 6.0F, 1.0F, 0.0F, false);

            Variant_2 = new ZawaModelRenderer(this, 0, 0);
            Variant_2.setPos(-0.6265F, -1.9906F, 0.0689F);
            HEAD.addChild(Variant_2);


            Horn_R2 = new ZawaModelRenderer(this, 0, 0);
            Horn_R2.setPos(0.0F, 0.0F, 0.0F);
            Variant_2.addChild(Horn_R2);
            setRotateAngle(Horn_R2, 0.1309F, 0.1309F, 0.0F);


            Horn_3_r3 = new ZawaModelRenderer(this, 51, 56);
            Horn_3_r3.setPos(0.0F, -6.975F, 10.725F);
            Horn_R2.addChild(Horn_3_r3);
            setRotateAngle(Horn_3_r3, -1.0908F, -0.2182F, 0.0F);
            Horn_3_r3.addBox(-3.0523F, -2.5906F, 0.4866F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            Horn_2_r3 = new ZawaModelRenderer(this, 47, 56);
            Horn_2_r3.setPos(0.0F, -3.0F, 4.825F);
            Horn_R2.addChild(Horn_2_r3);
            setRotateAngle(Horn_2_r3, -1.0036F, -0.2182F, 0.0F);
            Horn_2_r3.addBox(-1.7722F, -5.5488F, 0.0913F, 1.0F, 5.0F, 1.0F, 0.0F, true);

            Horn_1_r3 = new ZawaModelRenderer(this, 43, 56);
            Horn_1_r3.setPos(0.0F, 0.0F, 0.075F);
            Horn_R2.addChild(Horn_1_r3);
            setRotateAngle(Horn_1_r3, -1.0036F, -0.2182F, 0.0F);
            Horn_1_r3.addBox(-0.7441F, -6.0719F, 0.0528F, 1.0F, 6.0F, 1.0F, 0.0F, true);

            Horn_L2 = new ZawaModelRenderer(this, 0, 0);
            Horn_L2.setPos(1.253F, 0.0F, 0.0F);
            Variant_2.addChild(Horn_L2);
            setRotateAngle(Horn_L2, 0.1309F, -0.1309F, 0.0F);


            Horn_3_r4 = new ZawaModelRenderer(this, 51, 56);
            Horn_3_r4.setPos(0.0F, -6.975F, 10.725F);
            Horn_L2.addChild(Horn_3_r4);
            setRotateAngle(Horn_3_r4, -1.0908F, 0.2182F, 0.0F);
            Horn_3_r4.addBox(2.0523F, -2.5906F, 0.4866F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Horn_2_r4 = new ZawaModelRenderer(this, 47, 56);
            Horn_2_r4.setPos(0.0F, -3.0F, 4.825F);
            Horn_L2.addChild(Horn_2_r4);
            setRotateAngle(Horn_2_r4, -1.0036F, 0.2182F, 0.0F);
            Horn_2_r4.addBox(0.7722F, -5.5488F, 0.0913F, 1.0F, 5.0F, 1.0F, 0.0F, false);

            Horn_1_r4 = new ZawaModelRenderer(this, 43, 56);
            Horn_1_r4.setPos(0.0F, 0.0F, 0.075F);
            Horn_L2.addChild(Horn_1_r4);
            setRotateAngle(Horn_1_r4, -1.0036F, 0.2182F, 0.0F);
            Horn_1_r4.addBox(-0.2559F, -6.0719F, 0.0528F, 1.0F, 6.0F, 1.0F, 0.0F, false);

            Variant_3 = new ZawaModelRenderer(this, 0, 0);
            Variant_3.setPos(0.6265F, -1.9656F, -0.0561F);
            HEAD.addChild(Variant_3);


            Horn_R3 = new ZawaModelRenderer(this, 0, 0);
            Horn_R3.setPos(-1.253F, 0.0F, 0.0F);
            Variant_3.addChild(Horn_R3);
            setRotateAngle(Horn_R3, 0.1747F, 0.043F, 0.0076F);


            Horn_3_r5 = new ZawaModelRenderer(this, 0, 22);
            Horn_3_r5.setPos(0.0F, -7.0F, 10.85F);
            Horn_R3.addChild(Horn_3_r5);
            setRotateAngle(Horn_3_r5, -1.2217F, -0.2182F, 0.0F);
            Horn_3_r5.addBox(-3.0523F, -0.7406F, 1.2116F, 1.0F, 3.0F, 1.0F, 0.0F, true);

            Horn_2_r5 = new ZawaModelRenderer(this, 8, 54);
            Horn_2_r5.setPos(-1.825F, -3.225F, 5.075F);
            Horn_R3.addChild(Horn_2_r5);
            setRotateAngle(Horn_2_r5, -1.0908F, -0.2182F, 0.0F);
            Horn_2_r5.addBox(-0.0175F, -4.0053F, -0.0178F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            Horn_1_r5 = new ZawaModelRenderer(this, 32, 36);
            Horn_1_r5.setPos(0.0F, -0.025F, 0.2F);
            Horn_R3.addChild(Horn_1_r5);
            setRotateAngle(Horn_1_r5, -1.0036F, -0.2182F, 0.0F);
            Horn_1_r5.addBox(-0.7441F, -6.0719F, 0.0528F, 1.0F, 6.0F, 1.0F, 0.0F, true);

            Horn_L3 = new ZawaModelRenderer(this, 0, 0);
            Horn_L3.setPos(0.0F, 0.0F, 0.0F);
            Variant_3.addChild(Horn_L3);
            setRotateAngle(Horn_L3, 0.1747F, -0.043F, -0.0076F);


            Horn_3_r6 = new ZawaModelRenderer(this, 0, 22);
            Horn_3_r6.setPos(0.0F, -7.0F, 10.85F);
            Horn_L3.addChild(Horn_3_r6);
            setRotateAngle(Horn_3_r6, -1.2217F, 0.2182F, 0.0F);
            Horn_3_r6.addBox(2.0523F, -0.7406F, 1.2116F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            Horn_2_r6 = new ZawaModelRenderer(this, 8, 54);
            Horn_2_r6.setPos(1.825F, -3.225F, 5.075F);
            Horn_L3.addChild(Horn_2_r6);
            setRotateAngle(Horn_2_r6, -1.0908F, 0.2182F, 0.0F);
            Horn_2_r6.addBox(-0.9825F, -4.0053F, -0.0178F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Horn_1_r6 = new ZawaModelRenderer(this, 32, 36);
            Horn_1_r6.setPos(0.0F, -0.025F, 0.2F);
            Horn_L3.addChild(Horn_1_r6);
            setRotateAngle(Horn_1_r6, -1.0036F, 0.2182F, 0.0F);
            Horn_1_r6.addBox(-0.2559F, -6.0719F, 0.0528F, 1.0F, 6.0F, 1.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(-1.0F, -1.125F, 1.6F);
            MAIN.addChild(BODY);


            Hips_r1 = new ZawaModelRenderer(this, 38, 0);
            Hips_r1.setPos(0.0F, -4.0953F, 18.2048F);
            BODY.addChild(Hips_r1);
            setRotateAngle(Hips_r1, -0.5454F, 0.0F, 0.0F);
            Hips_r1.addBox(-3.0F, -5.425F, -3.525F, 6.0F, 9.0F, 5.0F, 0.0F, false);

            Body_r1 = new ZawaModelRenderer(this, 0, 0);
            Body_r1.setPos(0.0F, -5.9374F, 10.383F);
            BODY.addChild(Body_r1);
            setRotateAngle(Body_r1, 0.0873F, 0.0F, 0.0F);
            Body_r1.addBox(-3.5F, -3.95F, -4.0F, 7.0F, 10.0F, 12.0F, 0.0F, false);

            Mane_1_r1 = new ZawaModelRenderer(this, 32, 36);
            Mane_1_r1.setPos(0.0F, -11.8011F, 3.4528F);
            BODY.addChild(Mane_1_r1);
            setRotateAngle(Mane_1_r1, -0.288F, 0.0F, 0.0F);
            Mane_1_r1.addBox(-0.5F, -0.309F, -0.0062F, 1.0F, 1.0F, 7.0F, 0.0F, false);

            Chest_r1 = new ZawaModelRenderer(this, 0, 22);
            Chest_r1.setPos(0.0F, -9.7294F, 10.0173F);
            BODY.addChild(Chest_r1);
            setRotateAngle(Chest_r1, -0.288F, 0.0F, 0.0F);
            Chest_r1.addBox(-3.0F, -0.1269F, -6.8982F, 6.0F, 11.0F, 7.0F, 0.0F, false);

            Tail = new ZawaModelRenderer(this, 0, 0);
            Tail.setPos(0.75F, 1.075F, 2.275F);
            BODY.addChild(Tail);
            Tail.texOffs(31, 22).addBox(-1.25F, -9.025F, 19.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            Tail.texOffs(0, 53).addBox(-1.75F, -6.025F, 18.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            Tail.texOffs(19, 22).addBox(-1.25F, -0.275F, 19.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            Neck = new ZawaModelRenderer(this, 0, 0);
            Neck.setPos(0.0F, -1.7682F, 0.6965F);
            BODY.addChild(Neck);
            setRotateAngle(Neck, -0.2618F, 0.0F, 0.0F);


            Neck_Lower_3_r1 = new ZawaModelRenderer(this, 0, 0);
            Neck_Lower_3_r1.setPos(0.0F, 0.3818F, -0.2242F);
            Neck.addChild(Neck_Lower_3_r1);
            setRotateAngle(Neck_Lower_3_r1, -0.3578F, 0.0F, 0.0F);
            Neck_Lower_3_r1.texOffs(14, 40).addBox(-0.45F, -3.35F, -6.5201F, 1.0F, 2.0F, 3.0F, 0.0F, true);
            Neck_Lower_3_r1.texOffs(14, 40).addBox(-0.55F, -3.35F, -6.5201F, 1.0F, 2.0F, 3.0F, 0.0F, false);

            Neck_Skin_1_r1 = new ZawaModelRenderer(this, 40, 27);
            Neck_Skin_1_r1.setPos(0.0F, 0.3818F, -0.2242F);
            Neck.addChild(Neck_Skin_1_r1);
            setRotateAngle(Neck_Skin_1_r1, -1.1694F, 0.0F, 0.0F);
            Neck_Skin_1_r1.addBox(-0.5F, 1.8077F, -8.4678F, 1.0F, 2.0F, 3.0F, 0.0F, false);

            Neck_Lower_r1 = new ZawaModelRenderer(this, 26, 22);
            Neck_Lower_r1.setPos(0.0F, 0.3818F, -0.2242F);
            Neck.addChild(Neck_Lower_r1);
            setRotateAngle(Neck_Lower_r1, -0.733F, 0.0F, 0.0F);
            Neck_Lower_r1.addBox(-1.0F, -3.9879F, -9.9582F, 2.0F, 4.0F, 10.0F, 0.0F, false);

            Mane_3_r1 = new ZawaModelRenderer(this, 0, 0);
            Mane_3_r1.setPos(0.0F, -9.5579F, -2.4937F);
            Neck.addChild(Mane_3_r1);
            setRotateAngle(Mane_3_r1, -0.1222F, 0.0F, 0.0F);
            Mane_3_r1.texOffs(36, 44).addBox(-0.5F, -0.6583F, -4.7338F, 1.0F, 1.0F, 5.0F, 0.0F, false);
            Mane_3_r1.texOffs(17, 36).addBox(-1.5F, 0.0167F, -4.7838F, 3.0F, 4.0F, 9.0F, 0.0F, false);

            Mane_2_r1 = new ZawaModelRenderer(this, 26, 8);
            Mane_2_r1.setPos(0.0F, -12.2328F, -0.0373F);
            Neck.addChild(Mane_2_r1);
            setRotateAngle(Mane_2_r1, 0.2356F, 0.0F, 0.0F);
            Mane_2_r1.addBox(-0.5F, 1.5F, -3.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            Neck_1_r1 = new ZawaModelRenderer(this, 0, 40);
            Neck_1_r1.setPos(0.0F, -8.6785F, -1.2052F);
            Neck.addChild(Neck_1_r1);
            setRotateAngle(Neck_1_r1, 0.2356F, 0.0F, 0.0F);
            Neck_1_r1.addBox(-2.0F, -1.1692F, -1.1047F, 4.0F, 10.0F, 3.0F, 0.0F, false);

            Limb_Front_R = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_R.setPos(-1.85F, -2.3F, -0.075F);
            MAIN.addChild(Limb_Front_R);
            Limb_Front_R.texOffs(26, 0).addBox(-2.35F, -0.25F, 4.275F, 3.0F, 5.0F, 3.0F, 0.0F, true);
            Limb_Front_R.texOffs(34, 50).addBox(-1.875F, 4.0301F, 4.7505F, 2.0F, 7.0F, 2.0F, 0.0F, false);
            Limb_Front_R.texOffs(53, 14).addBox(-1.9F, 10.05F, 3.75F, 2.0F, 2.0F, 2.0F, 0.0F, true);

            ArmBase_r1 = new ZawaModelRenderer(this, 44, 40);
            ArmBase_r1.setPos(0.0F, 0.5F, 1.1F);
            Limb_Front_R.addChild(ArmBase_r1);
            setRotateAngle(ArmBase_r1, 0.0742F, 0.0F, 0.0F);
            ArmBase_r1.addBox(-2.5F, -4.25F, 2.425F, 3.0F, 5.0F, 4.0F, 0.0F, true);

            Limb_Front_L = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_L.setPos(-0.15F, -2.3F, -0.075F);
            MAIN.addChild(Limb_Front_L);
            Limb_Front_L.texOffs(26, 0).addBox(-0.65F, -0.25F, 4.275F, 3.0F, 5.0F, 3.0F, 0.0F, false);
            Limb_Front_L.texOffs(34, 50).addBox(-0.125F, 4.0301F, 4.7505F, 2.0F, 7.0F, 2.0F, 0.0F, true);
            Limb_Front_L.texOffs(53, 14).addBox(-0.1F, 10.05F, 3.75F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            ArmBase_r2 = new ZawaModelRenderer(this, 44, 40);
            ArmBase_r2.setPos(0.0F, 0.5F, 1.1F);
            Limb_Front_L.addChild(ArmBase_r2);
            setRotateAngle(ArmBase_r2, 0.0742F, 0.0F, 0.0F);
            ArmBase_r2.addBox(-0.5F, -4.25F, 2.425F, 3.0F, 5.0F, 4.0F, 0.0F, false);

            Limb_Back_R = new ZawaModelRenderer(this, 0, 0);
            Limb_Back_R.setPos(-1.25F, -2.075F, 13.125F);
            MAIN.addChild(Limb_Back_R);
            Limb_Back_R.texOffs(14, 49).addBox(-2.5F, 2.8245F, 7.8116F, 2.0F, 8.0F, 2.0F, 0.0F, true);
            Limb_Back_R.texOffs(52, 49).addBox(-2.525F, 9.825F, 6.8F, 2.0F, 2.0F, 2.0F, 0.0F, true);

            UpperLeg_r1 = new ZawaModelRenderer(this, 0, 0);
            UpperLeg_r1.setPos(-1.475F, 1.4941F, 6.3507F);
            Limb_Back_R.addChild(UpperLeg_r1);
            setRotateAngle(UpperLeg_r1, 0.5629F, 0.0F, 0.0F);
            UpperLeg_r1.addBox(-1.5F, -2.5F, -0.75F, 3.0F, 6.0F, 3.0F, 0.0F, true);

            Thigh_r1 = new ZawaModelRenderer(this, 40, 14);
            Thigh_r1.setPos(0.0F, 0.45F, 1.225F);
            Limb_Back_R.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, -0.0873F, 0.0F, 0.0F);
            Thigh_r1.addBox(-3.5F, -7.925F, 2.725F, 4.0F, 8.0F, 5.0F, 0.0F, true);

            Limb_Back_L = new ZawaModelRenderer(this, 0, 0);
            Limb_Back_L.setPos(-0.75F, -2.075F, 13.125F);
            MAIN.addChild(Limb_Back_L);
            Limb_Back_L.texOffs(14, 49).addBox(0.5F, 2.8245F, 7.8116F, 2.0F, 8.0F, 2.0F, 0.0F, false);
            Limb_Back_L.texOffs(52, 49).addBox(0.525F, 9.825F, 6.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            UpperLeg_r2 = new ZawaModelRenderer(this, 0, 0);
            UpperLeg_r2.setPos(1.475F, 1.4941F, 6.3507F);
            Limb_Back_L.addChild(UpperLeg_r2);
            setRotateAngle(UpperLeg_r2, 0.5629F, 0.0F, 0.0F);
            UpperLeg_r2.addBox(-1.5F, -2.5F, -0.75F, 3.0F, 6.0F, 3.0F, 0.0F, false);

            Thigh_r2 = new ZawaModelRenderer(this, 40, 14);
            Thigh_r2.setPos(0.0F, 0.45F, 1.225F);
            Limb_Back_L.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, -0.0873F, 0.0F, 0.0F);
            Thigh_r2.addBox(-0.5F, -7.925F, 2.725F, 4.0F, 8.0F, 5.0F, 0.0F, false);

            this.saveBase();
        }

        @Override
        public void setupAnim(OryxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }

       public static class oryxTwo extends OryxModel {


            protected ZawaModelRenderer Snout;
            protected ZawaModelRenderer Snout_L_r1;
            protected ZawaModelRenderer Snout_R_r1;
            protected ZawaModelRenderer Variant_4;
            protected ZawaModelRenderer Horn_R4;
            protected ZawaModelRenderer Horn_R_3_r1;
            protected ZawaModelRenderer Horn_R_2_r1;
            protected ZawaModelRenderer Horn_R_1_r1;
            protected ZawaModelRenderer Horn_L4;
            protected ZawaModelRenderer Horn_L_3_r1;
            protected ZawaModelRenderer Horn_L_2_r1;
            protected ZawaModelRenderer Horn_L_1_r1;
            protected ZawaModelRenderer Variant_5;
            protected ZawaModelRenderer Horn_R5;
            protected ZawaModelRenderer Horn_R_4_r1;
            protected ZawaModelRenderer Horn_R_3_r2;
            protected ZawaModelRenderer Horn_R_2_r2;
            protected ZawaModelRenderer Horn_R_1_r2;
            protected ZawaModelRenderer Horn_R2;
            protected ZawaModelRenderer Horn_R_5_r1;
            protected ZawaModelRenderer Horn_R_4_r2;
            protected ZawaModelRenderer Horn_R_3_r3;
            protected ZawaModelRenderer Horn_R_2_r3;
            protected ZawaModelRenderer Neck;
            protected ZawaModelRenderer Neck_Lower_r1;
            protected ZawaModelRenderer UpperLeg_r1;
            protected ZawaModelRenderer Thigh_r1;
            protected ZawaModelRenderer UpperLeg_r2;
            protected ZawaModelRenderer Thigh_r2;
            
            public oryxTwo () {
            
                texWidth = 64;
                texHeight = 64;

                MAIN = new ZawaModelRenderer(this, 0, 0);
                MAIN.setPos(1.0F, 14.25F, -12.9F);


                HEAD = new ZawaModelRenderer(this, 0, 0);
                HEAD.setPos(-1.0F, -10.1417F, -4.8043F);
                MAIN.addChild(HEAD);
                setRotateAngle(HEAD, 0.1963F, 0.0F, 0.0F);


                Ear_R_r1 = new ZawaModelRenderer(this, 0, 9);
                Ear_R_r1.setPos(-1.3353F, -1.7679F, 1.9816F);
                HEAD.addChild(Ear_R_r1);
                setRotateAngle(Ear_R_r1, -0.0366F, -0.1734F, 0.6003F);
                Ear_R_r1.addBox(-2.6106F, -0.1085F, -0.0548F, 4.0F, 2.0F, 1.0F, 0.0F, true);

                Ear_L_r1 = new ZawaModelRenderer(this, 0, 9);
                Ear_L_r1.setPos(1.3353F, -1.7679F, 1.9816F);
                HEAD.addChild(Ear_L_r1);
                setRotateAngle(Ear_L_r1, -0.0366F, 0.1734F, -0.6003F);
                Ear_L_r1.addBox(-1.3894F, -0.1085F, -0.0548F, 4.0F, 2.0F, 1.0F, 0.0F, false);

                Mouth_r1 = new ZawaModelRenderer(this, 20, 23);
                Mouth_r1.setPos(0.0F, 1.8763F, 1.9521F);
                HEAD.addChild(Mouth_r1);
                setRotateAngle(Mouth_r1, 0.1702F, 0.0F, 0.0F);
                Mouth_r1.addBox(-1.0F, -0.8724F, -5.3658F, 2.0F, 1.0F, 5.0F, 0.0F, false);

                TopSnout_r1 = new ZawaModelRenderer(this, 44, 49);
                TopSnout_r1.setPos(0.0F, -1.9355F, -0.0585F);
                HEAD.addChild(TopSnout_r1);
                setRotateAngle(TopSnout_r1, 0.637F, 0.0F, 0.0F);
                TopSnout_r1.addBox(-1.0F, -0.0208F, -3.9689F, 2.0F, 2.0F, 4.0F, 0.0F, false);

                Head_r1 = new ZawaModelRenderer(this, 47, 33);
                Head_r1.setPos(0.0F, -0.027F, 0.6558F);
                HEAD.addChild(Head_r1);
                setRotateAngle(Head_r1, 0.1047F, 0.0F, 0.0F);
                Head_r1.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 3.0F, 0.0F, false);

                Snout = new ZawaModelRenderer(this, 0, 0);
                Snout.setPos(0.0F, 2.5952F, -3.4928F);
                HEAD.addChild(Snout);


                Snout_L_r1 = new ZawaModelRenderer(this, 22, 55);
                Snout_L_r1.setPos(0.0F, 0.0F, 0.0F);
                Snout.addChild(Snout_L_r1);
                setRotateAngle(Snout_L_r1, 0.2269F, 0.0F, 0.0F);
                Snout_L_r1.addBox(-0.75F, -2.0915F, -0.3622F, 2.0F, 2.0F, 6.0F, 0.0F, true);

                Snout_R_r1 = new ZawaModelRenderer(this, 22, 55);
                Snout_R_r1.setPos(0.0F, 0.0F, 3.8F);
                Snout.addChild(Snout_R_r1);
                setRotateAngle(Snout_R_r1, 0.2269F, 0.0F, 0.0F);
                Snout_R_r1.addBox(-1.25F, -2.9463F, -4.0648F, 2.0F, 2.0F, 6.0F, 0.0F, false);

                Variant_4 = new ZawaModelRenderer(this, 0, 0);
                Variant_4.setPos(-0.6265F, -1.9906F, 0.0689F);
                HEAD.addChild(Variant_4);


                Horn_R4 = new ZawaModelRenderer(this, 0, 0);
                Horn_R4.setPos(0.0F, 0.0F, 0.0F);
                Variant_4.addChild(Horn_R4);
                setRotateAngle(Horn_R4, 0.3031F, 0.0476F, -0.0262F);


                Horn_R_3_r1 = new ZawaModelRenderer(this, 0, 22);
                Horn_R_3_r1.setPos(-2.7244F, -4.9692F, 11.5797F);
                Horn_R4.addChild(Horn_R_3_r1);
                setRotateAngle(Horn_R_3_r1, -1.3967F, -0.2118F, 0.0209F);
                Horn_R_3_r1.addBox(-0.475F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, true);

                Horn_R_2_r1 = new ZawaModelRenderer(this, 8, 54);
                Horn_R_2_r1.setPos(-1.8599F, -3.6935F, 7.4976F);
                Horn_R4.addChild(Horn_R_2_r1);
                setRotateAngle(Horn_R_2_r1, -1.1779F, -0.2065F, 0.0178F);
                Horn_R_2_r1.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

                Horn_R_1_r1 = new ZawaModelRenderer(this, 32, 36);
                Horn_R_1_r1.setPos(0.0F, 0.0F, 0.075F);
                Horn_R4.addChild(Horn_R_1_r1);
                setRotateAngle(Horn_R_1_r1, -1.0036F, -0.2182F, 0.0F);
                Horn_R_1_r1.addBox(-0.7441F, -6.0719F, 0.0528F, 1.0F, 6.0F, 1.0F, 0.0F, true);

                Horn_L4 = new ZawaModelRenderer(this, 0, 0);
                Horn_L4.setPos(1.253F, 0.0F, 0.0F);
                Variant_4.addChild(Horn_L4);
                setRotateAngle(Horn_L4, 0.3031F, -0.0476F, 0.0262F);


                Horn_L_3_r1 = new ZawaModelRenderer(this, 0, 22);
                Horn_L_3_r1.setPos(2.7244F, -4.9692F, 11.5797F);
                Horn_L4.addChild(Horn_L_3_r1);
                setRotateAngle(Horn_L_3_r1, -1.3967F, 0.2118F, -0.0209F);
                Horn_L_3_r1.addBox(-0.525F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

                Horn_L_2_r1 = new ZawaModelRenderer(this, 8, 54);
                Horn_L_2_r1.setPos(1.8599F, -3.6935F, 7.4976F);
                Horn_L4.addChild(Horn_L_2_r1);
                setRotateAngle(Horn_L_2_r1, -1.1779F, 0.2065F, -0.0178F);
                Horn_L_2_r1.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

                Horn_L_1_r1 = new ZawaModelRenderer(this, 32, 36);
                Horn_L_1_r1.setPos(0.0F, 0.0F, 0.075F);
                Horn_L4.addChild(Horn_L_1_r1);
                setRotateAngle(Horn_L_1_r1, -1.0036F, 0.2182F, 0.0F);
                Horn_L_1_r1.addBox(-0.2559F, -6.0719F, 0.0528F, 1.0F, 6.0F, 1.0F, 0.0F, false);

                Variant_5 = new ZawaModelRenderer(this, 0, 0);
                Variant_5.setPos(-0.6265F, -1.9906F, 0.0689F);
                HEAD.addChild(Variant_5);


                Horn_R5 = new ZawaModelRenderer(this, 0, 0);
                Horn_R5.setPos(0.0F, 0.0F, 0.0F);
                Variant_5.addChild(Horn_R5);
                setRotateAngle(Horn_R5, 0.3054F, 0.1309F, 0.0F);


                Horn_R_4_r1 = new ZawaModelRenderer(this, 60, 19);
                Horn_R_4_r1.setPos(-2.5494F, -2.9692F, 15.1047F);
                Horn_R5.addChild(Horn_R_4_r1);
                setRotateAngle(Horn_R_4_r1, -2.0948F, -0.2118F, 0.0209F);
                Horn_R_4_r1.addBox(-1.0569F, -5.7912F, 0.0984F, 1.0F, 6.0F, 1.0F, 0.0F, true);

                Horn_R_3_r2 = new ZawaModelRenderer(this, 60, 19);
                Horn_R_3_r2.setPos(-2.5494F, -3.9692F, 9.1047F);
                Horn_R5.addChild(Horn_R_3_r2);
                setRotateAngle(Horn_R_3_r2, -1.7458F, -0.2118F, 0.0209F);
                Horn_R_3_r2.addBox(0.2249F, -5.7373F, -0.0123F, 1.0F, 6.0F, 1.0F, 0.0F, true);

                Horn_R_2_r2 = new ZawaModelRenderer(this, 23, 50);
                Horn_R_2_r2.setPos(-1.8349F, -2.5685F, 4.2726F);
                Horn_R5.addChild(Horn_R_2_r2);
                setRotateAngle(Horn_R_2_r2, -1.3106F, -0.1728F, 0.027F);
                Horn_R_2_r2.addBox(0.3378F, -4.8727F, -0.1906F, 1.0F, 5.0F, 1.0F, 0.0F, true);

                Horn_R_1_r2 = new ZawaModelRenderer(this, 42, 36);
                Horn_R_1_r2.setPos(0.0F, 0.0F, 0.075F);
                Horn_R5.addChild(Horn_R_1_r2);
                setRotateAngle(Horn_R_1_r2, -1.0083F, -0.1813F, 0.0238F);
                Horn_R_1_r2.addBox(-0.7441F, -5.0719F, 0.0528F, 1.0F, 5.0F, 1.0F, 0.0F, true);

                Horn_R2 = new ZawaModelRenderer(this, 0, 0);
                Horn_R2.setPos(1.253F, 0.0F, 0.0F);
                Variant_5.addChild(Horn_R2);
                setRotateAngle(Horn_R2, 0.3054F, -0.1309F, 0.0F);


                Horn_R_5_r1 = new ZawaModelRenderer(this, 60, 19);
                Horn_R_5_r1.setPos(2.5494F, -2.9692F, 15.1047F);
                Horn_R2.addChild(Horn_R_5_r1);
                setRotateAngle(Horn_R_5_r1, -2.0948F, 0.2118F, -0.0209F);
                Horn_R_5_r1.addBox(0.0569F, -5.7912F, 0.0984F, 1.0F, 6.0F, 1.0F, 0.0F, false);

                Horn_R_4_r2 = new ZawaModelRenderer(this, 60, 19);
                Horn_R_4_r2.setPos(2.5494F, -3.9692F, 9.1047F);
                Horn_R2.addChild(Horn_R_4_r2);
                setRotateAngle(Horn_R_4_r2, -1.7458F, 0.2118F, -0.0209F);
                Horn_R_4_r2.addBox(-1.2249F, -5.7373F, -0.0123F, 1.0F, 6.0F, 1.0F, 0.0F, false);

                Horn_R_3_r3 = new ZawaModelRenderer(this, 23, 50);
                Horn_R_3_r3.setPos(1.8349F, -2.5685F, 4.2726F);
                Horn_R2.addChild(Horn_R_3_r3);
                setRotateAngle(Horn_R_3_r3, -1.3106F, 0.1728F, -0.027F);
                Horn_R_3_r3.addBox(-1.3378F, -4.8727F, -0.1906F, 1.0F, 5.0F, 1.0F, 0.0F, false);

                Horn_R_2_r3 = new ZawaModelRenderer(this, 42, 36);
                Horn_R_2_r3.setPos(0.0F, 0.0F, 0.075F);
                Horn_R2.addChild(Horn_R_2_r3);
                setRotateAngle(Horn_R_2_r3, -1.0083F, 0.1813F, -0.0238F);
                Horn_R_2_r3.addBox(-0.2559F, -5.0719F, 0.0528F, 1.0F, 5.0F, 1.0F, 0.0F, false);

                BODY = new ZawaModelRenderer(this, 0, 0);
                BODY.setPos(-1.0F, -1.125F, 1.6F);
                MAIN.addChild(BODY);


                Hips_r1 = new ZawaModelRenderer(this, 38, 0);
                Hips_r1.setPos(0.0F, -4.0953F, 18.2048F);
                BODY.addChild(Hips_r1);
                setRotateAngle(Hips_r1, -0.5454F, 0.0F, 0.0F);
                Hips_r1.addBox(-3.0F, -5.425F, -3.525F, 6.0F, 9.0F, 5.0F, 0.0F, false);

                Body_r1 = new ZawaModelRenderer(this, 0, 0);
                Body_r1.setPos(0.0F, -5.9374F, 10.383F);
                BODY.addChild(Body_r1);
                setRotateAngle(Body_r1, 0.0873F, 0.0F, 0.0F);
                Body_r1.addBox(-3.5F, -3.95F, -4.0F, 7.0F, 10.0F, 12.0F, 0.0F, false);

                Mane_1_r1 = new ZawaModelRenderer(this, 33, 37);
                Mane_1_r1.setPos(0.0F, -11.8011F, 3.4528F);
                BODY.addChild(Mane_1_r1);
                setRotateAngle(Mane_1_r1, -0.288F, 0.0F, 0.0F);
                Mane_1_r1.addBox(-0.5F, -0.309F, 0.9938F, 1.0F, 1.0F, 6.0F, 0.0F, false);

                Chest_r1 = new ZawaModelRenderer(this, 1, 23);
                Chest_r1.setPos(0.0F, -9.7294F, 10.0173F);
                BODY.addChild(Chest_r1);
                setRotateAngle(Chest_r1, -0.288F, 0.0F, 0.0F);
                Chest_r1.addBox(-3.0F, -0.1269F, -5.8982F, 6.0F, 11.0F, 6.0F, 0.0F, false);

                Tail = new ZawaModelRenderer(this, 0, 0);
                Tail.setPos(0.75F, 1.075F, 2.275F);
                BODY.addChild(Tail);
                Tail.texOffs(31, 22).addBox(-1.25F, -9.025F, 19.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
                Tail.texOffs(0, 53).addBox(-1.75F, -6.025F, 18.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
                Tail.texOffs(19, 22).addBox(-1.25F, -0.275F, 19.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

                Neck = new ZawaModelRenderer(this, 0, 0);
                Neck.setPos(0.0F, -1.7682F, 0.6965F);
                BODY.addChild(Neck);
                setRotateAngle(Neck, -0.2618F, 0.0F, 0.0F);


                Neck_Lower_r1 = new ZawaModelRenderer(this, 26, 22);
                Neck_Lower_r1.setPos(0.0F, -0.7029F, 0.6133F);
                Neck.addChild(Neck_Lower_r1);
                setRotateAngle(Neck_Lower_r1, -0.4102F, 0.0F, 0.0F);
                Neck_Lower_r1.addBox(-1.0F, -4.0721F, -9.5884F, 2.0F, 4.0F, 10.0F, 0.0F, false);

                Mane_3_r1 = new ZawaModelRenderer(this, 0, 0);
                Mane_3_r1.setPos(0.0F, -8.0151F, -6.8951F);
                Neck.addChild(Mane_3_r1);
                setRotateAngle(Mane_3_r1, -0.0175F, 0.0F, 0.0F);
                Mane_3_r1.texOffs(36, 44).addBox(-0.5F, -0.5614F, -0.3695F, 1.0F, 1.0F, 6.0F, 0.0F, false);
                Mane_3_r1.texOffs(17, 36).addBox(-1.5F, -0.2864F, -0.2195F, 3.0F, 3.0F, 9.0F, 0.0F, false);

                Mane_2_r1 = new ZawaModelRenderer(this, 40, 27);
                Mane_2_r1.setPos(0.0F, -9.8796F, -1.272F);
                Neck.addChild(Mane_2_r1);
                setRotateAngle(Mane_2_r1, 0.5323F, 0.0F, 0.0F);
                Mane_2_r1.addBox(-0.5F, 0.5F, -1.575F, 1.0F, 1.0F, 4.0F, 0.0F, false);

                Neck_1_r1 = new ZawaModelRenderer(this, 0, 40);
                Neck_1_r1.setPos(0.0F, -10.3738F, 1.0414F);
                Neck.addChild(Neck_1_r1);
                setRotateAngle(Neck_1_r1, 0.5323F, 0.0F, 0.0F);
                Neck_1_r1.addBox(-2.0F, 0.0107F, -3.9841F, 4.0F, 8.0F, 4.0F, 0.0F, false);

                Limb_Front_R = new ZawaModelRenderer(this, 0, 0);
                Limb_Front_R.setPos(-1.85F, -2.3F, -0.075F);
                MAIN.addChild(Limb_Front_R);
                Limb_Front_R.texOffs(26, 0).addBox(-2.35F, -0.25F, 4.275F, 3.0F, 5.0F, 3.0F, 0.0F, true);
                Limb_Front_R.texOffs(34, 50).addBox(-1.875F, 4.0301F, 4.7505F, 2.0F, 7.0F, 2.0F, 0.0F, false);
                Limb_Front_R.texOffs(53, 14).addBox(-1.9F, 10.05F, 3.75F, 2.0F, 2.0F, 2.0F, 0.0F, true);

                ArmBase_r1 = new ZawaModelRenderer(this, 44, 40);
                ArmBase_r1.setPos(0.0F, 0.5F, 1.1F);
                Limb_Front_R.addChild(ArmBase_r1);
                setRotateAngle(ArmBase_r1, 0.0742F, 0.0F, 0.0F);
                ArmBase_r1.addBox(-2.5F, -4.25F, 2.425F, 3.0F, 5.0F, 4.0F, 0.0F, true);

                Limb_Front_L = new ZawaModelRenderer(this, 0, 0);
                Limb_Front_L.setPos(-0.15F, -2.3F, -0.075F);
                MAIN.addChild(Limb_Front_L);
                Limb_Front_L.texOffs(26, 0).addBox(-0.65F, -0.25F, 4.275F, 3.0F, 5.0F, 3.0F, 0.0F, false);
                Limb_Front_L.texOffs(34, 50).addBox(-0.125F, 4.0301F, 4.7505F, 2.0F, 7.0F, 2.0F, 0.0F, true);
                Limb_Front_L.texOffs(53, 14).addBox(-0.1F, 10.05F, 3.75F, 2.0F, 2.0F, 2.0F, 0.0F, false);

                ArmBase_r2 = new ZawaModelRenderer(this, 44, 40);
                ArmBase_r2.setPos(0.0F, 0.5F, 1.1F);
                Limb_Front_L.addChild(ArmBase_r2);
                setRotateAngle(ArmBase_r2, 0.0742F, 0.0F, 0.0F);
                ArmBase_r2.addBox(-0.5F, -4.25F, 2.425F, 3.0F, 5.0F, 4.0F, 0.0F, false);

                Limb_Back_R = new ZawaModelRenderer(this, 0, 0);
                Limb_Back_R.setPos(-1.25F, -2.075F, 13.125F);
                MAIN.addChild(Limb_Back_R);
                Limb_Back_R.texOffs(14, 49).addBox(-2.5F, 2.8245F, 7.8116F, 2.0F, 8.0F, 2.0F, 0.0F, true);
                Limb_Back_R.texOffs(52, 49).addBox(-2.525F, 9.825F, 6.8F, 2.0F, 2.0F, 2.0F, 0.0F, true);

                UpperLeg_r1 = new ZawaModelRenderer(this, 0, 0);
                UpperLeg_r1.setPos(-1.475F, 1.4941F, 6.3507F);
                Limb_Back_R.addChild(UpperLeg_r1);
                setRotateAngle(UpperLeg_r1, 0.5629F, 0.0F, 0.0F);
                UpperLeg_r1.addBox(-1.5F, -2.5F, -0.75F, 3.0F, 6.0F, 3.0F, 0.0F, true);

                Thigh_r1 = new ZawaModelRenderer(this, 40, 14);
                Thigh_r1.setPos(0.0F, 0.45F, 1.225F);
                Limb_Back_R.addChild(Thigh_r1);
                setRotateAngle(Thigh_r1, -0.0873F, 0.0F, 0.0F);
                Thigh_r1.addBox(-3.5F, -7.925F, 2.725F, 4.0F, 8.0F, 5.0F, 0.0F, true);

                Limb_Back_L = new ZawaModelRenderer(this, 0, 0);
                Limb_Back_L.setPos(-0.75F, -2.075F, 13.125F);
                MAIN.addChild(Limb_Back_L);
                Limb_Back_L.texOffs(14, 49).addBox(0.5F, 2.8245F, 7.8116F, 2.0F, 8.0F, 2.0F, 0.0F, false);
                Limb_Back_L.texOffs(52, 49).addBox(0.525F, 9.825F, 6.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);

                UpperLeg_r2 = new ZawaModelRenderer(this, 0, 0);
                UpperLeg_r2.setPos(1.475F, 1.4941F, 6.3507F);
                Limb_Back_L.addChild(UpperLeg_r2);
                setRotateAngle(UpperLeg_r2, 0.5629F, 0.0F, 0.0F);
                UpperLeg_r2.addBox(-1.5F, -2.5F, -0.75F, 3.0F, 6.0F, 3.0F, 0.0F, false);

                Thigh_r2 = new ZawaModelRenderer(this, 40, 14);
                Thigh_r2.setPos(0.0F, 0.45F, 1.225F);
                Limb_Back_L.addChild(Thigh_r2);
                setRotateAngle(Thigh_r2, -0.0873F, 0.0F, 0.0F);
                Thigh_r2.addBox(-0.5F, -7.925F, 2.725F, 4.0F, 8.0F, 5.0F, 0.0F, false);
                
                this.saveBase();
            }
           @Override
           public void setupAnim(OryxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
               super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
           }

           @Override
           public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

           }

           @Override
           public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
           }
       }
    public static class Child extends OryxModel {

        protected ZawaModelRenderer CALF;
        protected ZawaModelRenderer Tail_1_r1;
        protected ZawaModelRenderer NECK;
        protected ZawaModelRenderer Skin_2_r1;
        protected ZawaModelRenderer Skin_1_r1;
        protected ZawaModelRenderer Neck_Lower_2_r1;
        protected ZawaModelRenderer Neck_Upper_R_r1;
        protected ZawaModelRenderer Neck_1_r1;
        protected ZawaModelRenderer Muzzle;
        protected ZawaModelRenderer Muzzle_L_r1;
        protected ZawaModelRenderer Arm_r1;
        protected ZawaModelRenderer Arm_r2;
        protected ZawaModelRenderer Arm_r3;
        protected ZawaModelRenderer ArmBase_r3;;
        protected ZawaModelRenderer Arm_r4;
        protected ZawaModelRenderer ArmBase_r4;
        public Child () {

            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 17.25F, -3.0F);


            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(0.0F, -3.0F, 0.0F);
            MAIN.addChild(BODY);


            Hips_r1 = new ZawaModelRenderer(this, 13, 7);
            Hips_r1.setPos(0.0F, -0.3805F, 3.4914F);
            BODY.addChild(Hips_r1);
            setRotateAngle(Hips_r1, -0.3927F, 0.0F, 0.0F);
            Hips_r1.addBox(-1.5F, -3.2F, 1.375F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Body_r1 = new ZawaModelRenderer(this, 0, 0);
            Body_r1.setPos(0.0F, -0.25F, 2.5F);
            BODY.addChild(Body_r1);
            setRotateAngle(Body_r1, 0.1309F, 0.0F, 0.0F);
            Body_r1.texOffs(0, 0).addBox(-0.25F, -2.1F, -1.2F, 2.0F, 5.0F, 5.0F, 0.0F, true);
            Body_r1.texOffs(0, 0).addBox(-1.75F, -2.1F, -1.2F, 2.0F, 5.0F, 5.0F, 0.0F, false);

            Chest_r1 = new ZawaModelRenderer(this, 11,15);
            Chest_r1.setPos(0.0F, -2.15F, 1.05F);
            BODY.addChild(Chest_r1);
            setRotateAngle(Chest_r1, -0.1134F, 0.0F, 0.0F);
            Chest_r1.addBox(-1.5F, -0.0122F, -1.5757F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Tail = new ZawaModelRenderer(this, 21, 26);
            Tail.setPos(-0.5F, 0.0F, 9.7F);
            BODY.addChild(Tail);
            Tail.addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Tail_1_r1 = new ZawaModelRenderer(this, 7, 18);
            Tail_1_r1.setPos(0.0F, 0.0F, 0.0F);
            Tail.addChild(Tail_1_r1);
            setRotateAngle(Tail_1_r1, 0.6545F, 0.0F, 0.0F);
            Tail_1_r1.addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            NECK = new ZawaModelRenderer(this, 0, 0);
            NECK.setPos(0.0F, -2.4958F, -2.8659F);
            MAIN.addChild(NECK);


            Skin_2_r1 = new ZawaModelRenderer(this, 22, 8);
            Skin_2_r1.setPos(0.0F, 0.1F, 0.075F);
            NECK.addChild(Skin_2_r1);
            setRotateAngle(Skin_2_r1, 0.1745F, 0.0F, 0.0F);
            Skin_2_r1.addBox(-0.5F, -1.4962F, -0.8607F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Skin_1_r1 = new ZawaModelRenderer(this, 22, 8);
            Skin_1_r1.setPos(0.0F, 0.1F, 0.075F);
            NECK.addChild(Skin_1_r1);
            setRotateAngle(Skin_1_r1, -0.3491F, 0.0F, 0.0F);
            Skin_1_r1.addBox(-0.5F, -0.9917F, -0.9935F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Neck_Lower_2_r1 = new ZawaModelRenderer(this, 0, 0);
            Neck_Lower_2_r1.setPos(0.0F, -0.1995F, 0.803F);
            NECK.addChild(Neck_Lower_2_r1);
            setRotateAngle(Neck_Lower_2_r1, -0.8727F, 0.0F, 0.0F);
            Neck_Lower_2_r1.texOffs(0, 10).addBox(-0.475F, -1.25F, -3.25F, 1.0F, 2.0F, 6.0F, 0.0F, true);
            Neck_Lower_2_r1.texOffs(0, 10).addBox(-0.525F, -1.25F, -3.25F, 1.0F, 2.0F, 6.0F, 0.0F, false);

            Mane_3_r1 = new ZawaModelRenderer(this, 14, 23);
            Mane_3_r1.setPos(0.0F, -3.7335F, 2.5788F);
            NECK.addChild(Mane_3_r1);
            setRotateAngle(Mane_3_r1, 0.0829F, 0.0F, 0.0F);
            Mane_3_r1.addBox(-0.5F, 0.3101F, -1.1071F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Mane_2_r1 = new ZawaModelRenderer(this, 22, 12);
            Mane_2_r1.setPos(0.0F, -3.7335F, 2.5788F);
            NECK.addChild(Mane_2_r1);
            setRotateAngle(Mane_2_r1, -0.1134F, 0.0F, 0.0F);
            Mane_2_r1.addBox(-0.5F, 0.3351F, -0.0571F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            Mane_1_r1 = new ZawaModelRenderer(this, 23, 16);
            Mane_1_r1.setPos(0.0F, -4.6042F, -0.2091F);
            NECK.addChild(Mane_1_r1);
            setRotateAngle(Mane_1_r1, -0.5672F, 0.0F, 0.0F);
            Mane_1_r1.addBox(-0.5F, -0.1685F, -0.0111F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            Neck_Upper_R_r1 = new ZawaModelRenderer(this, 0, 0);
            Neck_Upper_R_r1.setPos(0.0F, -4.1042F, -0.0841F);
            NECK.addChild(Neck_Upper_R_r1);
            setRotateAngle(Neck_Upper_R_r1, -0.6981F, 0.0F, 0.0F);
            Neck_Upper_R_r1.texOffs(16, 0).addBox(-0.8F, -0.0231F, -0.0852F, 1.0F, 2.0F, 5.0F, 0.0F, false);
            Neck_Upper_R_r1.texOffs(16, 0).addBox(-0.2F, -0.0231F, -0.0852F, 1.0F, 2.0F, 5.0F, 0.0F, true);

            Neck_1_r1 = new ZawaModelRenderer(this, 0, 10);
            Neck_1_r1.setPos(0.0F, -3.1292F, 2.3909F);
            NECK.addChild(Neck_1_r1);
            setRotateAngle(Neck_1_r1, 0.0829F, 0.0F, 0.0F);
            Neck_1_r1.addBox(-1.0F, 0.3002F, -0.9878F, 2.0F, 4.0F, 1.0F, 0.0F, false);

            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, -6.5937F, -2.9104F);
            MAIN.addChild(HEAD);
            setRotateAngle(HEAD, -0.0873F, 0.0F, 0.0F);


            Ear_L_r1 = new ZawaModelRenderer(this, 20, 16);
            Ear_L_r1.setPos(1.0F, 1.0413F, 0.0325F);
            HEAD.addChild(Ear_L_r1);
            setRotateAngle(Ear_L_r1, 0.0953F, 0.313F, -0.4966F);
            Ear_L_r1.addBox(-0.1557F, -1.0295F, -0.8689F, 2.0F, 1.0F, 1.0F, 0.0F, true);

            Ear_R_r1 = new ZawaModelRenderer(this, 20, 16);
            Ear_R_r1.setPos(-1.0F, 1.0413F, 0.0325F);
            HEAD.addChild(Ear_R_r1);
            setRotateAngle(Ear_R_r1, 0.0953F, -0.313F, 0.4966F);
            Ear_R_r1.addBox(-1.8443F, -1.0295F, -0.8689F, 2.0F, 1.0F, 1.0F, 0.0F, false);

            Mouth_r1 = new ZawaModelRenderer(this, 0, 0);
            Mouth_r1.setPos(0.0F, -2.7079F, -1.2803F);
            HEAD.addChild(Mouth_r1);
            setRotateAngle(Mouth_r1, 0.3578F, 0.0F, 0.0F);
            Mouth_r1.texOffs(0, 25).addBox(-0.5F, 4.4F, -4.05F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            Mouth_r1.texOffs(16, 24).addBox(-0.75F, 4.025F, -3.55F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            Mouth_r1.texOffs(16, 24).addBox(-0.25F, 4.025F, -3.55F, 1.0F, 1.0F, 2.0F, 0.0F, true);

            TopSnout_r1 = new ZawaModelRenderer(this, 25, 5);
            TopSnout_r1.setPos(0.0F, 2.2407F, -3.0558F);
            HEAD.addChild(TopSnout_r1);
            setRotateAngle(TopSnout_r1, 1.0996F, 0.0F, 0.0F);
            TopSnout_r1.addBox(-0.5F, -0.0252F, -0.4484F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            Head_r1 = new ZawaModelRenderer(this, 8, 23);
            Head_r1.setPos(0.0F, 1.2373F, -0.9412F);
            HEAD.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.2356F, 0.0F, 0.0F);
            Head_r1.addBox(-1.0F, -1.5F, -0.9F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            Muzzle = new ZawaModelRenderer(this, 0, 0);
            Muzzle.setPos(0.0F, -2.3577F, -2.217F);
            HEAD.addChild(Muzzle);


            Muzzle_L_r1 = new ZawaModelRenderer(this, 0, 0);
            Muzzle_L_r1.setPos(0.0F, 0.0F, 0.0F);
            Muzzle.addChild(Muzzle_L_r1);
            setRotateAngle(Muzzle_L_r1, 0.6196F, 0.0F, 0.0F);
            Muzzle_L_r1.texOffs(25, 9).addBox(-0.15F, 3.225F, -4.35F, 1.0F, 1.0F, 1.0F, 0.0F, true);
            Muzzle_L_r1.texOffs(25, 9).addBox(-0.85F, 3.225F, -4.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Limb_Front_L = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_L.setPos(-1.15F, -5.3F, -14.975F);
            MAIN.addChild(Limb_Front_L);
            Limb_Front_L.texOffs(0, 0).addBox(1.65F, 7.3801F, 15.1005F, 1.0F, 4.0F, 1.0F, 0.0F, true);
            Limb_Front_L.texOffs(17, 0).addBox(1.675F, 11.05F, 14.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Arm_r1 = new ZawaModelRenderer(this, 23, 0);
            Arm_r1.setPos(1.9F, 5.939F, 15.4849F);
            Limb_Front_L.addChild(Arm_r1);
            setRotateAngle(Arm_r1, 0.0436F, 0.0F, 0.0F);
            Arm_r1.addBox(-0.725F, -1.5F, -0.95F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            ArmBase_r1 = new ZawaModelRenderer(this, 20, 20);
            ArmBase_r1.setPos(1.15F, 3.6878F, 15.551F);
            Limb_Front_L.addChild(ArmBase_r1);
            setRotateAngle(ArmBase_r1, 0.0742F, 0.0F, 0.0F);
            ArmBase_r1.addBox(-0.15F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);

            Limb_Front_R = new ZawaModelRenderer(this, 0, 0);
            Limb_Front_R.setPos(1.15F, -5.3F, -14.975F);
            MAIN.addChild(Limb_Front_R);
            Limb_Front_R.texOffs(0, 0).addBox(-2.65F, 7.3801F, 15.1005F, 1.0F, 4.0F, 1.0F, 0.0F, false);
            Limb_Front_R.texOffs(17, 0).addBox(-2.675F, 11.05F, 14.6F, 1.0F, 1.0F, 1.0F, 0.0F, true);

            Arm_r2 = new ZawaModelRenderer(this, 23, 0);
            Arm_r2.setPos(-1.9F, 5.939F, 15.4849F);
            Limb_Front_R.addChild(Arm_r2);
            setRotateAngle(Arm_r2, 0.0436F, 0.0F, 0.0F);
            Arm_r2.addBox(-1.275F, -1.5F, -0.95F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            ArmBase_r2 = new ZawaModelRenderer(this, 20, 20);
            ArmBase_r2.setPos(-1.15F, 3.6878F, 15.551F);
            Limb_Front_R.addChild(ArmBase_r2);
            setRotateAngle(ArmBase_r2, 0.0742F, 0.0F, 0.0F);
            ArmBase_r2.addBox(-1.85F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, true);

            Limb_Back_L = new ZawaModelRenderer(this, 0, 0);
            Limb_Back_L.setPos(-0.9F, -5.3F, -8.725F);
            MAIN.addChild(Limb_Back_L);
            Limb_Back_L.texOffs(8, 10).addBox(1.65F, 6.3801F, 15.8505F, 1.0F, 5.0F, 1.0F, 0.0F, true);
            Limb_Back_L.texOffs(17, 0).addBox(1.675F, 11.05F, 15.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Arm_r3 = new ZawaModelRenderer(this, 11, 0);
            Arm_r3.setPos(1.9F, 6.364F, 17.2099F);
            Limb_Back_L.addChild(Arm_r3);
            setRotateAngle(Arm_r3, 0.4407F, 0.0F, 0.0F);
            Arm_r3.addBox(-0.75F, -2.9704F, -1.9891F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            ArmBase_r3 = new ZawaModelRenderer(this, 0, 18);
            ArmBase_r3.setPos(2.0F, 2.7091F, 15.2276F);
            Limb_Back_L.addChild(ArmBase_r3);
            setRotateAngle(ArmBase_r3, -0.1876F, 0.0F, 0.0F);
            ArmBase_r3.addBox(-1.0F, -1.925F, -1.125F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            Limb_Back_R = new ZawaModelRenderer(this, 0, 0);
            Limb_Back_R.setPos(0.9F, -5.3F, -8.725F);
            MAIN.addChild(Limb_Back_R);
            Limb_Back_R.texOffs(8, 10).addBox(-2.65F, 6.3801F, 15.8505F, 1.0F, 5.0F, 1.0F, 0.0F, false);
            Limb_Back_R.texOffs(17, 0).addBox(-2.675F, 11.05F, 15.35F, 1.0F, 1.0F, 1.0F, 0.0F, true);

            Arm_r4 = new ZawaModelRenderer(this, 11, 0);
            Arm_r4.setPos(-1.9F, 6.364F, 17.2099F);
            Limb_Back_R.addChild(Arm_r4);
            setRotateAngle(Arm_r4, 0.4407F, 0.0F, 0.0F);
            Arm_r4.addBox(-1.25F, -2.9704F, -1.9891F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            ArmBase_r4 = new ZawaModelRenderer(this, 0, 18);
            ArmBase_r4.setPos(-2.0F, 2.7091F, 15.2276F);
            Limb_Back_R.addChild(ArmBase_r4);
            setRotateAngle(ArmBase_r4, -0.1876F, 0.0F, 0.0F);
            ArmBase_r4.addBox(-1.0F, -1.925F, -1.125F, 2.0F, 4.0F, 3.0F, 0.0F, true);
            this.saveBase();

        }

        @Override
        public void setupAnim(OryxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
