package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TamarinEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class TamarinModel extends ZawaBaseModel<TamarinEntity> {
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

    public static class Adult extends TamarinModel {
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Tail6;
        public ModelRenderer HeadFur;
        public ModelRenderer shape14;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Hair;
        public ModelRenderer LionLeft;
        public ModelRenderer LionRight;
        public ModelRenderer Hair2;
        public ModelRenderer Snout;
        public ModelRenderer CottonTopLeft;
        public ModelRenderer CottonTopRight;
        public ModelRenderer CottonTopMiddle;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer LeftMoustache1;
        public ModelRenderer RightMoustache1;
        public ModelRenderer LeftMoustache2;
        public ModelRenderer RightMoustache2;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Hand2Left;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Hand2Right;


        public Adult() {
            texWidth = 80;
            texHeight = 32;
            this.ArmLeft = new ModelRenderer(this, 46, 7);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(1.8F, 0.2F, -1.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.13665927909957545F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 56, 7);
            this.LegRight.setPos(0.5F, 3.5F, -0.8F);
            this.LegRight.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.591841146688116F, 0.0F, 0.0F);
            this.LionRight = new ModelRenderer(this, 64, 0);
            this.LionRight.setPos(-1.3F, 0.0F, -0.1F);
            this.LionRight.addBox(-1.5F, -2.5F, -2.0F, 3.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LionRight, 0.0F, 0.0F, 0.0781907508222411F);
            this.ThighLeft = new ModelRenderer(this, 52, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.5F, 1.5F, 2.0F);
            this.ThighLeft.addBox(-2.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.Hand2Right = new ModelRenderer(this, 46, 20);
            this.Hand2Right.setPos(0.5F, 0.51F, 0.0F);
            this.Hand2Right.addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hand2Right, 0.0F, -0.27314402127920984F, 0.0F);
            this.CottonTopLeft = new ModelRenderer(this, 66, 10);
            this.CottonTopLeft.mirror = true;
            this.CottonTopLeft.setPos(1.6F, -1.5F, 2.0F);
            this.CottonTopLeft.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CottonTopLeft, 0.0F, -0.3909537457888271F, 0.23457224414434488F);
            this.ArmRight = new ModelRenderer(this, 46, 7);
            this.ArmRight.setPos(-1.8F, 0.2F, -1.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.13665927909957545F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 2);
            this.Chest.setPos(0.0F, 19.0F, 0.0F);
            this.Chest.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.04555309164612875F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 27);
            this.Tail1.setPos(0.0F, 0.1F, 3.5F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5462880425584197F, 0.0F, 0.0F);
            this.LeftMoustache2 = new ModelRenderer(this, 0, 0);
            this.LeftMoustache2.mirror = true;
            this.LeftMoustache2.setPos(1.5F, 0.0F, 0.01F);
            this.LeftMoustache2.addBox(0.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftMoustache2, 0.0F, 0.0F, 0.7740534966278743F);
            this.Hand2Left = new ModelRenderer(this, 46, 20);
            this.Hand2Left.mirror = true;
            this.Hand2Left.setPos(-0.5F, 0.51F, 0.0F);
            this.Hand2Left.addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hand2Left, 0.0F, 0.27314402127920984F, 0.0F);
            this.Snout = new ModelRenderer(this, 21, 12);
            this.Snout.setPos(0.0F, 0.1F, -0.6F);
            this.Snout.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.3642502295386026F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 52, 0);
            this.ThighRight.setPos(-2.5F, 1.5F, 2.0F);
            this.ThighRight.addBox(-1.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 56, 7);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(-0.5F, 3.5F, -0.8F);
            this.LegLeft.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.591841146688116F, 0.0F, 0.0F);
            this.RightMoustache1 = new ModelRenderer(this, 0, 0);
            this.RightMoustache1.setPos(-0.5F, 0.5F, -0.3F);
            this.RightMoustache1.addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightMoustache1, -0.18203784630933073F, -0.0911061832922575F, -0.9105382388075086F);
            this.LeftMoustache1 = new ModelRenderer(this, 0, 0);
            this.LeftMoustache1.mirror = true;
            this.LeftMoustache1.setPos(0.5F, 0.5F, -0.3F);
            this.LeftMoustache1.addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftMoustache1, -0.18203784630933073F, 0.0911061832922575F, 0.9105382388075086F);
            this.HandRight = new ModelRenderer(this, 46, 16);
            this.HandRight.setPos(0.01F, 1.6F, -0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.RightMoustache2 = new ModelRenderer(this, 0, 0);
            this.RightMoustache2.setPos(-1.5F, 0.0F, 0.01F);
            this.RightMoustache2.addBox(-2.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightMoustache2, 0.0F, 0.0F, -0.7740534966278743F);
            this.CottonTopRight = new ModelRenderer(this, 66, 10);
            this.CottonTopRight.setPos(-1.7F, -1.5F, 2.0F);
            this.CottonTopRight.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CottonTopRight, 0.0F, 0.3909537457888271F, -0.23457224414434488F);
            this.Tail4 = new ModelRenderer(this, 30, 27);
            this.Tail4.setPos(0.0F, 0.0F, 2.8F);
            this.Tail4.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.0911061832922575F, 0.0F, 0.0F);
            this.Hair = new ModelRenderer(this, 34, 16);
            this.Hair.setPos(0.0F, -1.2F, -1.8F);
            this.Hair.addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair, 0.0911061832922575F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 46, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.01F, 1.6F, -0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.Tail6 = new ModelRenderer(this, 50, 26);
            this.Tail6.setPos(0.0F, 0.0F, 2.8F);
            this.Tail6.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.0911061832922575F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 23, 21);
            this.Neck.setPos(0.0F, -1.8F, -2.0F);
            this.Neck.addBox(-1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6373942508178124F, 0.0F, 0.0F);
            this.LionLeft = new ModelRenderer(this, 64, 0);
            this.LionLeft.mirror = true;
            this.LionLeft.setPos(1.3F, 0.0F, -0.1F);
            this.LionLeft.addBox(-1.5F, -2.5F, -2.0F, 3.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LionLeft, 0.0F, 0.0F, -0.0781907508222411F);
            this.FootRight = new ModelRenderer(this, 54, 12);
            this.FootRight.setPos(0.01F, 2.0F, 0.5F);
            this.FootRight.addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.4098033003787853F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 40, 27);
            this.Tail5.setPos(0.0F, 0.0F, 2.8F);
            this.Tail5.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.0911061832922575F, 0.0F, 0.0F);
            this.shape14 = new ModelRenderer(this, 56, 19);
            this.shape14.setPos(0.0F, 0.0F, 0.0F);
            this.shape14.addBox(-2.0F, -0.7F, -1.0F, 4.0F, 3.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.HeadFur = new ModelRenderer(this, 20, 0);
            this.HeadFur.setPos(0.0F, 1.5F, -1.0F);
            this.HeadFur.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadFur, 0.6829473549475088F, 0.0F, 0.0F);
            this.Hair2 = new ModelRenderer(this, 34, 20);
            this.Hair2.setPos(0.0F, -1.1F, -1.0F);
            this.Hair2.addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair2, 0.0911061832922575F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 20, 27);
            this.Tail3.setPos(0.0F, 0.0F, 2.8F);
            this.Tail3.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.0911061832922575F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 13);
            this.Body.setPos(0.0F, -2.0F, 2.5F);
            this.Body.addBox(-3.0F, -0.6F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.0911061832922575F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 46, 12);
            this.ForearmRight.setPos(0.01F, 2.6F, 0.0F);
            this.ForearmRight.addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3642502295386026F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 26, 17);
            this.Nose.setPos(0.0F, 0.0F, 0.3F);
            this.Nose.addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.6373942508178124F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 26, 15);
            this.Mouth.setPos(0.0F, 0.9F, 0.1F);
            this.Mouth.addBox(-1.0F, -0.2F, -1.0F, 2.0F, 1.0F, 1.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.27314402127920984F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 10, 27);
            this.Tail2.setPos(0.0F, 0.0F, 2.8F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.0911061832922575F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 48, 0);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -0.7F, -0.8F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.3642502295386026F, 0.27314402127920984F);
            this.Head = new ModelRenderer(this, 30, 8);
            this.Head.setPos(0.0F, 0.0F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -0.9F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 54, 12);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.01F, 2.0F, 0.5F);
            this.FootLeft.addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.4098033003787853F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 48, 0);
            this.EarRight.setPos(-1.0F, -0.7F, -0.8F);
            this.EarRight.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.3642502295386026F, -0.27314402127920984F);
            this.CottonTopMiddle = new ModelRenderer(this, 68, 16);
            this.CottonTopMiddle.setPos(0.0F, -0.02F, 0.0F);
            this.CottonTopMiddle.addBox(-1.0F, -2.6F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CottonTopMiddle, 0.2738421523142173F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 46, 12);
            this.ForearmLeft.mirror = true;
            this.ForearmLeft.setPos(-0.01F, 2.6F, 0.0F);
            this.ForearmLeft.addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3642502295386026F, 0.0F, 0.0F);
            this.Chest.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.LegRight);
            this.HeadFur.addChild(this.LionRight);
            this.Body.addChild(this.ThighLeft);
            this.HandRight.addChild(this.Hand2Right);
            this.Head.addChild(this.CottonTopLeft);
            this.Chest.addChild(this.ArmRight);
            this.Body.addChild(this.Tail1);
            this.LeftMoustache1.addChild(this.LeftMoustache2);
            this.HandLeft.addChild(this.Hand2Left);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.ThighRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Snout.addChild(this.RightMoustache1);
            this.Snout.addChild(this.LeftMoustache1);
            this.ForearmRight.addChild(this.HandRight);
            this.RightMoustache1.addChild(this.RightMoustache2);
            this.Head.addChild(this.CottonTopRight);
            this.Tail3.addChild(this.Tail4);
            this.HeadFur.addChild(this.Hair);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Tail5.addChild(this.Tail6);
            this.Chest.addChild(this.Neck);
            this.HeadFur.addChild(this.LionLeft);
            this.LegRight.addChild(this.FootRight);
            this.Tail4.addChild(this.Tail5);
            this.Neck.addChild(this.shape14);
            this.Neck.addChild(this.HeadFur);
            this.HeadFur.addChild(this.Hair2);
            this.Tail2.addChild(this.Tail3);
            this.Chest.addChild(this.Body);
            this.ArmRight.addChild(this.ForearmRight);
            this.Snout.addChild(this.Nose);
            this.Snout.addChild(this.Mouth);
            this.Tail1.addChild(this.Tail2);
            this.HeadFur.addChild(this.EarLeft);
            this.HeadFur.addChild(this.Head);
            this.LegLeft.addChild(this.FootLeft);
            this.HeadFur.addChild(this.EarRight);
            this.Head.addChild(this.CottonTopMiddle);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(TamarinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            if (this.isHeld) {
                this.Tail3.xRot = 0.0F;
            }
            this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -0.546F);
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isHeld ? 0.0F : 0.091F);
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.7f;
                float degree = 0.7f;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.091F;
                this.LegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.091F;
                this.LegRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F + 0.045F;
                this.Body.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F - 0.091F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + -0.15F + 19.0F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.63F;
                this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F;

                this.Tail1.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.546F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.136F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.182F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.136F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.182F;

            } else {
                float speed = 1.25f;
                float degree = 0.6f;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.136F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.182F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.136F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.182F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.409F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.409F;

                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.045F);
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.091F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.63F;

                this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.546F);
                this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.091F);
            }
        }
    }

    public static class Child extends TamarinModel {
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Tail6;
        public ModelRenderer HeadFur;
        public ModelRenderer shape14;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Hair;
        public ModelRenderer LionLeft;
        public ModelRenderer LionRight;
        public ModelRenderer Hair2;
        public ModelRenderer Snout;
        public ModelRenderer CottonTopLeft;
        public ModelRenderer CottonTopRight;
        public ModelRenderer CottonTopMiddle;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer LeftMoustache1;
        public ModelRenderer RightMoustache1;
        public ModelRenderer LeftMoustache2;
        public ModelRenderer RightMoustache2;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Hand2Left;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Hand2Right;

        public Child() {
            texWidth = 80;
            texHeight = 32;
            this.ArmLeft = new ModelRenderer(this, 46, 7);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(1.8F, 0.2F, -1.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.13665927909957545F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 56, 7);
            this.LegRight.setPos(0.5F, 3.5F, -0.8F);
            this.LegRight.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.591841146688116F, 0.0F, 0.0F);
            this.LionRight = new ModelRenderer(this, 64, 0);
            this.LionRight.setPos(-1.3F, 0.0F, -0.1F);
            this.LionRight.addBox(-1.5F, -2.5F, -2.0F, 3.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LionRight, 0.0F, 0.0F, 0.0781907508222411F);
            this.ThighLeft = new ModelRenderer(this, 52, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.5F, 1.5F, 2.0F);
            this.ThighLeft.addBox(-2.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.Hand2Right = new ModelRenderer(this, 46, 20);
            this.Hand2Right.setPos(0.5F, 0.51F, 0.0F);
            this.Hand2Right.addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hand2Right, 0.0F, -0.27314402127920984F, 0.0F);
            this.CottonTopLeft = new ModelRenderer(this, 66, 10);
            this.CottonTopLeft.mirror = true;
            this.CottonTopLeft.setPos(1.6F, -1.5F, 2.0F);
            this.CottonTopLeft.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CottonTopLeft, 0.0F, -0.3909537457888271F, 0.23457224414434488F);
            this.ArmRight = new ModelRenderer(this, 46, 7);
            this.ArmRight.setPos(-1.8F, 0.2F, -1.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.13665927909957545F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 2);
            this.Chest.setPos(0.0F, 19.0F, 0.0F);
            this.Chest.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.04555309164612875F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 27);
            this.Tail1.setPos(0.0F, 0.1F, 3.5F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5462880425584197F, 0.0F, 0.0F);
            this.LeftMoustache2 = new ModelRenderer(this, 0, 0);
            this.LeftMoustache2.mirror = true;
            this.LeftMoustache2.setPos(1.5F, 0.0F, 0.01F);
            this.LeftMoustache2.addBox(0.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftMoustache2, 0.0F, 0.0F, 0.7740534966278743F);
            this.Hand2Left = new ModelRenderer(this, 46, 20);
            this.Hand2Left.mirror = true;
            this.Hand2Left.setPos(-0.5F, 0.51F, 0.0F);
            this.Hand2Left.addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hand2Left, 0.0F, 0.27314402127920984F, 0.0F);
            this.Snout = new ModelRenderer(this, 21, 12);
            this.Snout.setPos(0.0F, 0.1F, -0.6F);
            this.Snout.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.3642502295386026F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 52, 0);
            this.ThighRight.setPos(-2.5F, 1.5F, 2.0F);
            this.ThighRight.addBox(-1.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 56, 7);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(-0.5F, 3.5F, -0.8F);
            this.LegLeft.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.591841146688116F, 0.0F, 0.0F);
            this.RightMoustache1 = new ModelRenderer(this, 0, 0);
            this.RightMoustache1.setPos(-0.5F, 0.5F, -0.3F);
            this.RightMoustache1.addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightMoustache1, -0.18203784630933073F, -0.0911061832922575F, -0.9105382388075086F);
            this.LeftMoustache1 = new ModelRenderer(this, 0, 0);
            this.LeftMoustache1.mirror = true;
            this.LeftMoustache1.setPos(0.5F, 0.5F, -0.3F);
            this.LeftMoustache1.addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftMoustache1, -0.18203784630933073F, 0.0911061832922575F, 0.9105382388075086F);
            this.HandRight = new ModelRenderer(this, 46, 16);
            this.HandRight.setPos(0.01F, 1.6F, -0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.RightMoustache2 = new ModelRenderer(this, 0, 0);
            this.RightMoustache2.setPos(-1.5F, 0.0F, 0.01F);
            this.RightMoustache2.addBox(-2.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightMoustache2, 0.0F, 0.0F, -0.7740534966278743F);
            this.CottonTopRight = new ModelRenderer(this, 66, 10);
            this.CottonTopRight.setPos(-1.7F, -1.5F, 2.0F);
            this.CottonTopRight.addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CottonTopRight, 0.0F, 0.3909537457888271F, -0.23457224414434488F);
            this.Tail4 = new ModelRenderer(this, 30, 27);
            this.Tail4.setPos(0.0F, 0.0F, 2.8F);
            this.Tail4.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.0911061832922575F, 0.0F, 0.0F);
            this.Hair = new ModelRenderer(this, 34, 16);
            this.Hair.setPos(0.0F, -1.2F, -1.8F);
            this.Hair.addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair, 0.0911061832922575F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 46, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.01F, 1.6F, -0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.Tail6 = new ModelRenderer(this, 50, 26);
            this.Tail6.setPos(0.0F, 0.0F, 2.8F);
            this.Tail6.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.0911061832922575F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 23, 21);
            this.Neck.setPos(0.0F, -1.8F, -2.0F);
            this.Neck.addBox(-1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6373942508178124F, 0.0F, 0.0F);
            this.LionLeft = new ModelRenderer(this, 64, 0);
            this.LionLeft.mirror = true;
            this.LionLeft.setPos(1.3F, 0.0F, -0.1F);
            this.LionLeft.addBox(-1.5F, -2.5F, -2.0F, 3.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LionLeft, 0.0F, 0.0F, -0.0781907508222411F);
            this.FootRight = new ModelRenderer(this, 54, 12);
            this.FootRight.setPos(0.01F, 2.0F, 0.5F);
            this.FootRight.addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.4098033003787853F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 40, 27);
            this.Tail5.setPos(0.0F, 0.0F, 2.8F);
            this.Tail5.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.0911061832922575F, 0.0F, 0.0F);
            this.shape14 = new ModelRenderer(this, 56, 19);
            this.shape14.setPos(0.0F, 0.0F, 0.0F);
            this.shape14.addBox(-2.0F, -0.7F, -1.0F, 4.0F, 3.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.HeadFur = new ModelRenderer(this, 20, 0);
            this.HeadFur.setPos(0.0F, 1.5F, -1.0F);
            this.HeadFur.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadFur, 0.6829473549475088F, 0.0F, 0.0F);
            this.Hair2 = new ModelRenderer(this, 34, 20);
            this.Hair2.setPos(0.0F, -1.1F, -1.0F);
            this.Hair2.addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hair2, 0.0911061832922575F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 20, 27);
            this.Tail3.setPos(0.0F, 0.0F, 2.8F);
            this.Tail3.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.0911061832922575F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 13);
            this.Body.setPos(0.0F, -2.0F, 2.5F);
            this.Body.addBox(-3.0F, -0.6F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.0911061832922575F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 46, 12);
            this.ForearmRight.setPos(0.01F, 2.6F, 0.0F);
            this.ForearmRight.addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3642502295386026F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 26, 17);
            this.Nose.setPos(0.0F, 0.0F, 0.3F);
            this.Nose.addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.6373942508178124F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 26, 15);
            this.Mouth.setPos(0.0F, 0.9F, 0.1F);
            this.Mouth.addBox(-1.0F, -0.2F, -1.0F, 2.0F, 1.0F, 1.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.27314402127920984F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 10, 27);
            this.Tail2.setPos(0.0F, 0.0F, 2.8F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.0911061832922575F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 48, 0);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.0F, -0.7F, -0.8F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.3642502295386026F, 0.27314402127920984F);
            this.Head = new ModelRenderer(this, 30, 8);
            this.Head.setPos(0.0F, 0.0F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -0.9F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 54, 12);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.01F, 2.0F, 0.5F);
            this.FootLeft.addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.4098033003787853F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 48, 0);
            this.EarRight.setPos(-1.0F, -0.7F, -0.8F);
            this.EarRight.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.3642502295386026F, -0.27314402127920984F);
            this.CottonTopMiddle = new ModelRenderer(this, 68, 16);
            this.CottonTopMiddle.setPos(0.0F, -0.02F, 0.0F);
            this.CottonTopMiddle.addBox(-1.0F, -2.6F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CottonTopMiddle, 0.2738421523142173F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 46, 12);
            this.ForearmLeft.mirror = true;
            this.ForearmLeft.setPos(-0.01F, 2.6F, 0.0F);
            this.ForearmLeft.addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3642502295386026F, 0.0F, 0.0F);
            this.Chest.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.LegRight);
            this.HeadFur.addChild(this.LionRight);
            this.Body.addChild(this.ThighLeft);
            this.HandRight.addChild(this.Hand2Right);
            this.Head.addChild(this.CottonTopLeft);
            this.Chest.addChild(this.ArmRight);
            this.Body.addChild(this.Tail1);
            this.LeftMoustache1.addChild(this.LeftMoustache2);
            this.HandLeft.addChild(this.Hand2Left);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.ThighRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Snout.addChild(this.RightMoustache1);
            this.Snout.addChild(this.LeftMoustache1);
            this.ForearmRight.addChild(this.HandRight);
            this.RightMoustache1.addChild(this.RightMoustache2);
            this.Head.addChild(this.CottonTopRight);
            this.Tail3.addChild(this.Tail4);
            this.HeadFur.addChild(this.Hair);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Tail5.addChild(this.Tail6);
            this.Chest.addChild(this.Neck);
            this.HeadFur.addChild(this.LionLeft);
            this.LegRight.addChild(this.FootRight);
            this.Tail4.addChild(this.Tail5);
            this.Neck.addChild(this.shape14);
            this.Neck.addChild(this.HeadFur);
            this.HeadFur.addChild(this.Hair2);
            this.Tail2.addChild(this.Tail3);
            this.Chest.addChild(this.Body);
            this.ArmRight.addChild(this.ForearmRight);
            this.Snout.addChild(this.Nose);
            this.Snout.addChild(this.Mouth);
            this.Tail1.addChild(this.Tail2);
            this.HeadFur.addChild(this.EarLeft);
            this.HeadFur.addChild(this.Head);
            this.LegLeft.addChild(this.FootLeft);
            this.HeadFur.addChild(this.EarRight);
            this.Head.addChild(this.CottonTopMiddle);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(TamarinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            if (this.isHeld) {
                this.Tail3.xRot = 0.0F;
            }
            this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -0.546F);
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isHeld ? 0.0F : 0.091F);
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.7f;
                float degree = 0.4f;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.091F;
                this.LegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.091F;
                this.LegRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F + 0.045F;
                this.Body.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F - 0.091F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + -0.15F + 19.0F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F;
                this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F;

                this.Tail1.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.546F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.136F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.182F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.136F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.182F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.ArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.136F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.182F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.136F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.182F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.409F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.LegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.409F;

                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.045F);
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.091F;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F;

                this.Tail1.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.546F);
                this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.091F);
            }
        }
    }
}