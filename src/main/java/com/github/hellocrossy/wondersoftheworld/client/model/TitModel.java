package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TitEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TuracoEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class TitModel extends ZawaBaseModel<TitEntity> {
    protected ZawaModelRenderer root;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(root);
        }

        return this.parts;
    }

    public static class Adult extends TitModel {
        
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer UpperBill_r1;
        protected ZawaModelRenderer Body_r1;
        protected ZawaModelRenderer Neck_r1;
        protected ZawaModelRenderer LowerBill_r1;
        protected ZawaModelRenderer RightWing_r1;
        protected ZawaModelRenderer LeftWing_r1;
        protected ZawaModelRenderer LeftLeg_r1;
        protected ZawaModelRenderer LeftFoot_r1;
        protected ZawaModelRenderer LeftFootRightToe_r1;
        protected ZawaModelRenderer LeftFootLeftToe_r1;
        protected ZawaModelRenderer RightFootRightToe_r1;
        protected ZawaModelRenderer RightFootLeftToe_r1;

        protected ZawaModelRenderer cube_r1;
        protected ZawaModelRenderer TailMiddle_r1;
        protected ZawaModelRenderer TailRight_r1;
        protected ZawaModelRenderer TailLeft_r1;

        public Adult() {
            texWidth = 32;
            texHeight = 32;

            root = new ZawaModelRenderer(this,0 , 0);
            root.setPos(0.0F, 24.0F, 0.0F);


            Head_r1 = new ZawaModelRenderer(this, 0, 26);
            Head_r1.setPos(0.0F, -4.4722F, 3.3727F);
            root.addChild(Head_r1);
            setRotateAngle(Head_r1, 1.6408F, 0.0F, 0.0F);
            Head_r1.addBox(-1.5F, -6.8769F, 0.7027F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            UpperBill_r1 = new ZawaModelRenderer(this,11, 0);
            UpperBill_r1.setPos(0.0F, -8.7584F, 4.092F);
            root.addChild(UpperBill_r1);
            setRotateAngle(UpperBill_r1, 2.2263F, 0.0F, 0.0F);
            UpperBill_r1.addBox(-0.5F, -8.2925F, 2.2634F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            Body_r1 = new ZawaModelRenderer(this, 16, 24);
            Body_r1.setPos(0.0F, -1.9259F, 3.3057F);
            root.addChild(Body_r1);
            setRotateAngle(Body_r1, 1.0551F, 0.0F, 0.0F);
            Body_r1.addBox(-2.0F, -5.652F, -2.261F, 4.0F, 4.0F, 4.0F, 0.0F, false);

            Neck_r1 = new ZawaModelRenderer(this, 10, 21);
            Neck_r1.setPos(0.0F, -6.9411F, 2.0142F);
            root.addChild(Neck_r1);
            setRotateAngle(Neck_r1, 1.9265F, 0.0F, 0.0F);
            Neck_r1.addBox(-1.0F, -5.6045F, -2.2812F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            LowerBill_r1 = new ZawaModelRenderer(this, 11, 1);
            LowerBill_r1.setPos(0.0F, -1.4981F, 1.8132F);
            root.addChild(LowerBill_r1);
            setRotateAngle(LowerBill_r1, 1.151F, 0.0F, 0.0F);
            LowerBill_r1.addBox(-0.5F, -6.8272F, 1.3498F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            RightWing_r1 = new ZawaModelRenderer(this, 24, 17);
            RightWing_r1.setPos(0.6009F, 2.2229F, 3.6299F);
            root.addChild(RightWing_r1);
            setRotateAngle(RightWing_r1, 1.089F, 0.0732F, -0.147F);
            RightWing_r1.addBox(2.5003F, -7.14F, 2.3891F, 1.0F, 4.0F, 3.0F, 0.0F, true);

            LeftWing_r1 = new ZawaModelRenderer(this, 24, 17);
            LeftWing_r1.setPos(-0.6009F, 2.2229F, 3.6299F);
            root.addChild(LeftWing_r1);
            setRotateAngle(LeftWing_r1, 1.089F, -0.0732F, 0.147F);
            LeftWing_r1.addBox(-3.5003F, -7.14F, 2.3891F, 1.0F, 4.0F, 3.0F, 0.0F, false);

            LeftLeg_r1 = new ZawaModelRenderer(this, 0, 0);
            LeftLeg_r1.setPos(0.0F, -1.3259F, 3.2086F);
            root.addChild(LeftLeg_r1);
            setRotateAngle(LeftLeg_r1, 0.866F, 0.0F, 0.0F);
            LeftLeg_r1.texOffs(16, 0).addBox(-1.8F, -2.9F, -3.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            LeftLeg_r1.texOffs(16, 0).addBox(0.8F, -2.9F, -3.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            LeftFoot_r1 = new ZawaModelRenderer(this, 0, 0);
            LeftFoot_r1.setPos(0.0F, -3.8316F, 2.0833F);
            root.addChild(LeftFoot_r1);
            setRotateAngle(LeftFoot_r1, 1.549F, 0.0F, 0.0F);
            LeftFoot_r1.texOffs(28, 0).addBox(-1.8F, -3.9F, -3.9F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            LeftFoot_r1.texOffs(28, 0).addBox(0.8F, -3.9022F, -3.8F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            LeftFootRightToe_r1 = new ZawaModelRenderer(this, 23, 1);
            LeftFootRightToe_r1.setPos(1.2852F, -3.8575F, 0.8991F);
            root.addChild(LeftFootRightToe_r1);
            setRotateAngle(LeftFootRightToe_r1, 1.5445F, 0.5917F, -0.0147F);
            LeftFootRightToe_r1.addBox(-1.8F, -3.7F, -3.91F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            LeftFootLeftToe_r1 = new ZawaModelRenderer(this, 23, 1);
            LeftFootLeftToe_r1.setPos(-1.7274F, -3.8258F, 2.3492F);
            root.addChild(LeftFootLeftToe_r1);
            setRotateAngle(LeftFootLeftToe_r1, 1.5445F, -0.5917F, 0.0147F);
            LeftFootLeftToe_r1.addBox(-1.8F, -3.7F, -3.91F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            RightFootRightToe_r1 = new ZawaModelRenderer(this, 23, 1);
            RightFootRightToe_r1.setPos(1.72F, -3.8383F, 2.3385F);
            root.addChild(RightFootRightToe_r1);
            setRotateAngle(RightFootRightToe_r1, 1.549F, 0.5917F, -0.0147F);
            RightFootRightToe_r1.addBox(0.8F, -3.7F, -3.91F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            RightFootLeftToe_r1 = new ZawaModelRenderer(this, 23, 1);
            RightFootLeftToe_r1.setPos(-1.2852F, -3.8575F, 0.8991F);
            root.addChild(RightFootLeftToe_r1);
            setRotateAngle(RightFootLeftToe_r1, 1.5445F, -0.5917F, 0.0147F);
            RightFootLeftToe_r1.addBox(0.8F, -3.7F, -3.91F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r1 = new ZawaModelRenderer(this, 7, 15);
            cube_r1.setPos(0.0F, 0.0F, 0.0F);
            root.addChild(cube_r1);
            setRotateAngle(cube_r1, 1.0582F, 0.0F, 0.0F);
            cube_r1.addBox(-1.5F, 0.3109F, 2.2129F, 3.0F, 1.0F, 3.0F, 0.0F, false);

            TailMiddle_r1 = new ZawaModelRenderer(this, 0, 11);
            TailMiddle_r1.setPos(0.0F, -1.9324F, 3.3058F);
            root.addChild(TailMiddle_r1);
            setRotateAngle(TailMiddle_r1, 1.0582F, 0.0F, 0.0F);
            TailMiddle_r1.addBox(-1.0F, -1.5529F, 0.7286F, 2.0F, 4.0F, 1.0F, 0.0F, false);

            TailRight_r1 = new ZawaModelRenderer(this, 0, 21);
            TailRight_r1.setPos(-0.1267F, -2.0365F, 3.1207F);
            root.addChild(TailRight_r1);
            setRotateAngle(TailRight_r1, 1.051F, -0.1584F, 0.09F);
            TailRight_r1.addBox(0.4178F, -0.9035F, 0.7157F, 1.0F, 3.0F, 1.0F, 0.0F, true);

            TailLeft_r1 = new ZawaModelRenderer(this, 0, 21);
            TailLeft_r1.setPos(0.1267F, -2.0365F, 3.1207F);
            root.addChild(TailLeft_r1);
            setRotateAngle(TailLeft_r1, 1.051F, 0.1584F, -0.09F);
            TailLeft_r1.texOffs(0, 21).addBox(-1.4178F, -0.9035F, 0.7157F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            this.saveBase();
        }

        @Override
        public void setupAnim(TitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

    public static class Flying extends TitModel {

        protected ZawaModelRenderer Wing2R_r1_r1;
        protected ZawaModelRenderer Wing1R_r1_r1;
        protected ZawaModelRenderer Wing5L_r1_r1;
        protected ZawaModelRenderer Wing8L_r1_r1;
        protected ZawaModelRenderer Wing7L_r1_r1;
        protected ZawaModelRenderer Wing2L_r1_r1;
        protected ZawaModelRenderer Wing6L_r1_r1;
        protected ZawaModelRenderer Wing3R_r1_r1;
        protected ZawaModelRenderer Wing3R_r2_r1;
        protected ZawaModelRenderer Wing4L_r1_r1;
        protected ZawaModelRenderer Tail2_r1_r1;
        protected ZawaModelRenderer Wing4R_r1_r1;
        protected ZawaModelRenderer Wing7R_r1_r1;
        protected ZawaModelRenderer Wing6R_r1_r1;
        protected ZawaModelRenderer Wing5R_r1_r1;
        protected ZawaModelRenderer Wing8R_r1_r1;
        protected ZawaModelRenderer Beak2_r1_r1;
        protected ZawaModelRenderer Body_r1_r1;
        protected ZawaModelRenderer Beak1_r1_r1;
        protected ZawaModelRenderer Head_r1_r1;
        protected ZawaModelRenderer LegR_r1_r1;
        protected ZawaModelRenderer Neck1_r1_r1;
        protected ZawaModelRenderer FootR_r1_r1;
        protected ZawaModelRenderer Toe2R_r1_r1;
        protected ZawaModelRenderer Toe1R_r1_r1;
        protected ZawaModelRenderer Toe2L_r1_r1;
        protected ZawaModelRenderer TailBase_r1_r1;
        protected ZawaModelRenderer Toe1L_r1_r1;
        protected ZawaModelRenderer Tail3_r1_r1;

        public Flying() {
            texWidth = 32;
            texHeight = 32;

            root = new ZawaModelRenderer(this, 0, 0);
            root.setPos(0.8371F, 21.8388F, 6.4962F);


            Wing2R_r1_r1 = new ZawaModelRenderer(this, 0, 0);
            Wing2R_r1_r1.setPos(-0.8371F, 2.1612F, -6.4962F);
            root.addChild(Wing2R_r1_r1);
            setRotateAngle(Wing2R_r1_r1, -1.8719F, 0.0873F, 1.5708F);
            Wing2R_r1_r1.addBox(-6.3469F, -1.1488F, 2.6621F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            Wing1R_r1_r1 = new ZawaModelRenderer(this, 0, 0);
            Wing1R_r1_r1.setPos(-5.8261F, -2.9024F, -16.0449F);
            root.addChild(Wing1R_r1_r1);
            setRotateAngle(Wing1R_r1_r1, -1.5621F, 0.0873F, 1.5708F);
            Wing1R_r1_r1.texOffs(25, 5).addBox(-2.1719F, -10.2887F, -8.0466F, 1.0F, 4.0F, 2.0F, 0.0F, false);
            Wing1R_r1_r1.texOffs(25, 5).addBox(-2.1719F, -10.2887F, -4.0466F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            Wing5L_r1_r1 = new ZawaModelRenderer(this, 21, 14);
            Wing5L_r1_r1.setPos(6.3668F, 3.2869F, -2.9268F);
            root.addChild(Wing5L_r1_r1);
            setRotateAngle(Wing5L_r1_r1, 1.1257F, -0.0873F, -1.5708F);
            Wing5L_r1_r1.addBox(6.0851F, -7.6898F, -1.9826F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            Wing8L_r1_r1 = new ZawaModelRenderer(this, 21, 14);
            Wing8L_r1_r1.setPos(10.3642F, 3.1447F, -5.1237F);
            root.addChild(Wing8L_r1_r1);
            setRotateAngle(Wing8L_r1_r1, 0.3665F, -0.0873F, -1.5708F);
            Wing8L_r1_r1.addBox(6.0601F, -7.1565F, -3.244F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            Wing7L_r1_r1 = new ZawaModelRenderer(this, 21, 14);
            Wing7L_r1_r1.setPos(9.2217F, 3.2367F, -4.0731F);
            root.addChild(Wing7L_r1_r1);
            setRotateAngle(Wing7L_r1_r1, 0.6196F, -0.0873F, -1.5708F);
            Wing7L_r1_r1.addBox(6.0851F, -7.4232F, -2.8707F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            Wing2L_r1_r1 = new ZawaModelRenderer(this, 0, 0);
            Wing2L_r1_r1.setPos(-0.8371F, 2.1612F, -6.4962F);
            root.addChild(Wing2L_r1_r1);
            setRotateAngle(Wing2L_r1_r1, 1.8719F, 0.0873F, 1.5708F);
            Wing2L_r1_r1.addBox(-6.3469F, -2.8488F, 2.8621F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            Wing6L_r1_r1 = new ZawaModelRenderer(this, 21, 14);
            Wing6L_r1_r1.setPos(7.8945F, 3.2766F, -3.3309F);
            root.addChild(Wing6L_r1_r1);
            setRotateAngle(Wing6L_r1_r1, 0.8683F, -0.0873F, -1.5708F);
            Wing6L_r1_r1.addBox(6.0851F, -7.6108F, -2.4481F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            Wing3R_r1_r1 = new ZawaModelRenderer(this, 13, 4);
            Wing3R_r1_r1.setPos(1.2099F, -2.8905F, -3.2921F);
            root.addChild(Wing3R_r1_r1);
            setRotateAngle(Wing3R_r1_r1, 1.4879F, 0.0873F, 1.5708F);
            Wing3R_r1_r1.addBox(-1.0219F, -7.05F, 1.1517F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            Wing3R_r2_r1 = new ZawaModelRenderer(this, 13, 4);
            Wing3R_r2_r1.setPos(-4.9971F, -3.9598F, -15.5103F);
            root.addChild(Wing3R_r2_r1);
            setRotateAngle(Wing3R_r2_r1, -1.4879F, 0.0873F, 1.5708F);
            Wing3R_r2_r1.addBox(-1.0219F, -9.45F, -0.1483F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            Wing4L_r1_r1 = new ZawaModelRenderer(this, 21, 14);
            Wing4L_r1_r1.setPos(4.8883F, 3.2635F, -2.9066F);
            root.addChild(Wing4L_r1_r1);
            setRotateAngle(Wing4L_r1_r1, 1.3657F, -0.0873F, -1.5708F);
            Wing4L_r1_r1.addBox(6.0851F, -7.6571F, -1.5491F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            Tail2_r1_r1 = new ZawaModelRenderer(this, 0, 21);
            Tail2_r1_r1.setPos(-1.6743F, 0.0F, 0.0F);
            root.addChild(Tail2_r1_r1);
            setRotateAngle(Tail2_r1_r1, 1.4932F, -0.1815F, 0.014F);
            Tail2_r1_r1.addBox(0.2911F, -5.5167F, 2.8262F, 1.0F, 3.0F, 1.0F, 0.0F, true);

            Wing4R_r1_r1 = new ZawaModelRenderer(this, 21, 14);
            Wing4R_r1_r1.setPos(-6.186F, 2.9671F, -2.6124F);
            root.addChild(Wing4R_r1_r1);
            setRotateAngle(Wing4R_r1_r1, 1.4533F, 0.0869F, 1.5784F);
            Wing4R_r1_r1.addBox(-6.7855F, -7.7486F, -1.2473F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Wing7R_r1_r1 = new ZawaModelRenderer(this, 21, 14);
            Wing7R_r1_r1.setPos(-10.5652F, 2.921F, -3.6231F);
            root.addChild(Wing7R_r1_r1);
            setRotateAngle(Wing7R_r1_r1, 0.7072F, 0.0869F, 1.5784F);
            Wing7R_r1_r1.addBox(-6.7855F, -7.5181F, -2.5636F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Wing6R_r1_r1 = new ZawaModelRenderer(this, 21, 14);
            Wing6R_r1_r1.setPos(-9.2104F, 2.9668F, -2.928F);
            root.addChild(Wing6R_r1_r1);
            setRotateAngle(Wing6R_r1_r1, 0.9559F, 0.0869F, 1.5784F);
            Wing6R_r1_r1.addBox(-6.7855F, -7.7041F, -2.1425F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Wing5R_r1_r1 = new ZawaModelRenderer(this, 21, 14);
            Wing5R_r1_r1.setPos(-7.6668F, 2.9839F, -2.5788F);
            root.addChild(Wing5R_r1_r1);
            setRotateAngle(Wing5R_r1_r1, 1.2133F, 0.0869F, 1.5784F);
            Wing5R_r1_r1.addBox(-6.7855F, -7.7819F, -1.6788F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Wing8R_r1_r1 = new ZawaModelRenderer(this, 21, 14);
            Wing8R_r1_r1.setPos(-11.7454F, 2.8241F, -4.6326F);
            root.addChild(Wing8R_r1_r1);
            setRotateAngle(Wing8R_r1_r1, 0.4541F, 0.0869F, 1.5784F);
            Wing8R_r1_r1.addBox(-6.7605F, -7.2534F, -2.9359F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Beak2_r1_r1 = new ZawaModelRenderer(this, 11, 1);
            Beak2_r1_r1.setPos(-0.8371F, 0.6587F, -4.554F);
            root.addChild(Beak2_r1_r1);
            setRotateAngle(Beak2_r1_r1, 1.151F, 0.0F, 0.0F);
            Beak2_r1_r1.addBox(-0.5F, -9.0753F, 1.163F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Body_r1_r1 = new ZawaModelRenderer(this, 16, 24);
            Body_r1_r1.setPos(-0.8371F, -0.4848F, 1.0184F);
            root.addChild(Body_r1_r1);
            setRotateAngle(Body_r1_r1, 1.4914F, 0.0F, 0.0F);
            Body_r1_r1.addBox(-2.0F, -11.0431F, 0.0639F, 4.0F, 4.0F, 4.0F, 0.0F, false);

            Beak1_r1_r1 = new ZawaModelRenderer(this, 11, 0);
            Beak1_r1_r1.setPos(-0.8371F, -11.4848F, 4.4087F);
            root.addChild(Beak1_r1_r1);
            setRotateAngle(Beak1_r1_r1, 2.2263F, 0.0F, 0.0F);
            Beak1_r1_r1.addBox(-0.5F, -17.8009F, 4.3554F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            Head_r1_r1 = new ZawaModelRenderer(this, 0, 26);
            Head_r1_r1.setPos(-0.8371F, -4.1231F, 2.5167F);
            root.addChild(Head_r1_r1);
            setRotateAngle(Head_r1_r1, 1.5535F, 0.0F, 0.0F);
            Head_r1_r1.addBox(-1.5F, -14.6041F, -0.9878F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            LegR_r1_r1 = new ZawaModelRenderer(this, 0, 0);
            LegR_r1_r1.setPos(-0.8371F, 1.0307F, -0.032F);
            root.addChild(LegR_r1_r1);
            setRotateAngle(LegR_r1_r1, 1.3024F, 0.0F, 0.0F);
            LegR_r1_r1.texOffs(16, 0).addBox(0.8F, -7.7063F, -0.9096F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            LegR_r1_r1.texOffs(16, 0).addBox(-1.8F, -7.7063F, -0.9096F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            Neck1_r1_r1 = new ZawaModelRenderer(this, 10, 21);
            Neck1_r1_r1.setPos(-0.8371F, -14.2724F, -1.1753F);
            root.addChild(Neck1_r1_r1);
            setRotateAngle(Neck1_r1_r1, 2.3105F, 0.0F, 0.0F);
            Neck1_r1_r1.addBox(-1.0F, -14.6952F, -3.2463F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            FootR_r1_r1 = new ZawaModelRenderer(this, 0, 0);
            FootR_r1_r1.setPos(-0.8371F, -6.7225F, 0.1238F);
            root.addChild(FootR_r1_r1);
            setRotateAngle(FootR_r1_r1, 1.9853F, 0.0F, 0.0F);
            FootR_r1_r1.texOffs(28, 0).addBox(0.8F, -10.5039F, -3.3884F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            FootR_r1_r1.texOffs(28, 0).addBox(-1.8F, -10.5017F, -3.4884F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            Toe2R_r1_r1 = new ZawaModelRenderer(this, 23, 1);
            Toe2R_r1_r1.setPos(-4.8735F, -6.5786F, 0.4011F);
            root.addChild(Toe2R_r1_r1);
            setRotateAngle(Toe2R_r1_r1, 2.0583F, -0.5359F, -0.2644F);
            Toe2R_r1_r1.addBox(-3.5274F, -10.4088F, -3.2549F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Toe1R_r1_r1 = new ZawaModelRenderer(this, 23, 1);
            Toe1R_r1_r1.setPos(2.7981F, -6.915F, -2.1309F);
            root.addChild(Toe1R_r1_r1);
            setRotateAngle(Toe1R_r1_r1, 2.0583F, 0.5359F, 0.2644F);
            Toe1R_r1_r1.addBox(-0.5148F, -9.8246F, -4.5826F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Toe2L_r1_r1 = new ZawaModelRenderer(this, 23, 1);
            Toe2L_r1_r1.setPos(3.2033F, -6.6283F, 0.3714F);
            root.addChild(Toe2L_r1_r1);
            setRotateAngle(Toe2L_r1_r1, 2.0628F, 0.5359F, 0.2644F);
            Toe2L_r1_r1.addBox(2.52F, -10.4156F, -3.2699F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            TailBase_r1_r1 = new ZawaModelRenderer(this, 0, 0);
            TailBase_r1_r1.setPos(-0.8371F, 0.23F, 0.2326F);
            root.addChild(TailBase_r1_r1);
            setRotateAngle(TailBase_r1_r1, 1.4945F, 0.0F, 0.0F);
            TailBase_r1_r1.texOffs(7, 15).addBox(-1.5F, -6.2499F, 1.5608F, 3.0F, 1.0F, 3.0F, 0.0F, false);
            TailBase_r1_r1.texOffs(0, 11).addBox(-1.0F, -6.1499F, 3.0508F, 2.0F, 4.0F, 1.0F, 0.0F, false);

            Toe1L_r1_r1 = new ZawaModelRenderer(this, 23, 1);
            Toe1L_r1_r1.setPos(-4.4724F, -6.915F, -2.1309F);
            root.addChild(Toe1L_r1_r1);
            setRotateAngle(Toe1L_r1_r1, 2.0583F, -0.5359F, -0.2644F);
            Toe1L_r1_r1.addBox(-0.4852F, -9.8246F, -4.5826F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Tail3_r1_r1 = new ZawaModelRenderer(this, 0, 21);
            Tail3_r1_r1.setPos(0.0F, 0.0F, 0.0F);
            root.addChild(Tail3_r1_r1);
            setRotateAngle(Tail3_r1_r1, 1.4932F, 0.1815F, -0.014F);
            Tail3_r1_r1.addBox(-1.2911F, -5.5167F, 2.8262F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            this.saveBase();
        }

        @Override
        public void setupAnim(TitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }
    public static class Child extends TitModel {

        protected ZawaModelRenderer Body;
        protected ZawaModelRenderer TailBase;
        protected ZawaModelRenderer RightLeg;
        protected ZawaModelRenderer RightFoot;
        protected ZawaModelRenderer RightFootLeftToe;
        protected ZawaModelRenderer RightFootRightToe;
        protected ZawaModelRenderer LeftLeg;
        protected ZawaModelRenderer LeftFoot;
        protected ZawaModelRenderer LeftFootLeftToe;
        protected ZawaModelRenderer LeftFootRightToe;
        protected ZawaModelRenderer LeftWing;
        protected ZawaModelRenderer RightWing;
        protected ZawaModelRenderer Neck1;
        protected ZawaModelRenderer Head;
        protected ZawaModelRenderer UpperBill;
        protected ZawaModelRenderer LowerBill;

        public Child() {
            texWidth = 64;
            texHeight = 32;

            root = new ZawaModelRenderer(this, 0, 0);
            root.setPos(0.0F, 0.0F, 0.0F);


            Body = new ZawaModelRenderer(this, 0, 24);
            Body.setPos(0.0F, 20.9F, 0.0F);
            root.addChild(Body);
            setRotateAngle(Body, 1.4114F, 0.0F, 0.0F);
            Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

            TailBase = new ZawaModelRenderer(this, 17, 28);
            TailBase.setPos(0.0F, 2.0F, -1.0F);
            Body.addChild(TailBase);
            setRotateAngle(TailBase, 0.0911F, 0.0F, 0.0F);
            TailBase.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

            RightLeg = new ZawaModelRenderer(this, 20, 0);
            RightLeg.setPos(1.3F, 0.9F, -1.4F);
            Body.addChild(RightLeg);
            setRotateAngle(RightLeg, -0.5009F, -0.0456F, -0.4098F);
            RightLeg.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            RightFoot = new ZawaModelRenderer(this, 20, 4);
            RightFoot.setPos(0.0F, 0.0F, -0.9F);
            RightLeg.addChild(RightFoot);
            setRotateAngle(RightFoot, 0.6829F, 0.0F, 0.0F);
            RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            RightFootLeftToe = new ZawaModelRenderer(this, 20, 8);
            RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            RightFoot.addChild(RightFootLeftToe);
            setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.5918F);
            RightFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            RightFootRightToe = new ZawaModelRenderer(this, 20, 8);
            RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            RightFoot.addChild(RightFootRightToe);
            setRotateAngle(RightFootRightToe, 0.0045F, 0.0F, -0.5918F);
            RightFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            LeftLeg = new ZawaModelRenderer(this, 13, 0);
            LeftLeg.setPos(-1.3F, 0.9F, -1.4F);
            Body.addChild(LeftLeg);
            setRotateAngle(LeftLeg, -0.5009F, 0.0456F, 0.4098F);
            LeftLeg.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            LeftFoot = new ZawaModelRenderer(this, 13, 4);
            LeftFoot.setPos(0.0F, 0.0F, -0.9F);
            LeftLeg.addChild(LeftFoot);
            setRotateAngle(LeftFoot, 0.6829F, 0.0F, 0.0F);
            LeftFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            LeftFootLeftToe = new ZawaModelRenderer(this, 13, 8);
            LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            LeftFoot.addChild(LeftFootLeftToe);
            setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.5918F);
            LeftFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            LeftFootRightToe = new ZawaModelRenderer(this, 13, 8);
            LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            LeftFoot.addChild(LeftFootRightToe);
            setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.5918F);
            LeftFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            LeftWing = new ZawaModelRenderer(this, 29, 0);
            LeftWing.setPos(-1.9F, -1.9F, 1.1F);
            Body.addChild(LeftWing);
            setRotateAngle(LeftWing, -0.2276F, 0.0911F, 0.1367F);
            LeftWing.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

            RightWing = new ZawaModelRenderer(this, 38, 0);
            RightWing.setPos(1.9F, -1.9F, 1.1F);
            Body.addChild(RightWing);
            setRotateAngle(RightWing, -0.2276F, -0.0911F, -0.1367F);
            RightWing.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

            Neck1 = new ZawaModelRenderer(this, 0, 18);
            Neck1.setPos(0.0F, -2.0F, -1.5F);
            Body.addChild(Neck1);
            setRotateAngle(Neck1, 0.7285F, 0.0F, 0.0F);
            Neck1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            Head = new ZawaModelRenderer(this, 0, 5);
            Head.setPos(0.0F, 0.0F, 2.0F);
            Neck1.addChild(Head);
            setRotateAngle(Head, -0.6374F, 0.0F, 0.0F);
            Head.addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            UpperBill = new ZawaModelRenderer(this, 0, 1);
            UpperBill.setPos(0.0F, -0.5F, 2.0F);
            Head.addChild(UpperBill);
            setRotateAngle(UpperBill, 0.5856F, 0.0F, 0.0F);
            UpperBill.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            LowerBill = new ZawaModelRenderer(this, 5, 1);
            LowerBill.setPos(0.0F, -0.6F, 0.3F);
            Head.addChild(LowerBill);
            setRotateAngle(LowerBill, -0.4897F, 0.0F, 0.0F);
            LowerBill.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            this.saveBase();
        }

        @Override
        public void setupAnim(TitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
