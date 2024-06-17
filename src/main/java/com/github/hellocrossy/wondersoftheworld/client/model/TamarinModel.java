package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TamarinEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class TamarinModel extends ZawaBaseModel<TamarinEntity> {
    protected ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends TamarinModel {
        
        public ModelRenderer Hips;
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
        public ModelRenderer shape6;
        public ModelRenderer shape6_1;
        public ModelRenderer shape3;
        public ModelRenderer shape9;
        public ModelRenderer shape10;
        public ModelRenderer shape11;
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
            texWidth = 85;
            texHeight = 32;
            this.HeadFur = new ModelRenderer(this, 20, 0);
            this.HeadFur.setPos(0.0F, 1.5F, -1.0F);
            this.HeadFur.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadFur, 0.6829473549475088F, 0.0F, 0.0F);
            this.shape11 = new ModelRenderer(this, 26, 15);
            this.shape11.setPos(0.0F, 1.0F, 0.0F);
            this.shape11.addBox(-1.0F, -0.2F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape11, -0.27314402127920984F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 52, 0);
            this.ThighRight.setPos(-2.5F, 1.5F, 2.0F);
            this.ThighRight.addBox(-1.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 27);
            this.Tail1.setPos(0.0F, 0.1F, 3.5F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5462880425584197F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 7);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(1.8F, 0.2F, -1.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.13665927909957545F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 30, 27);
            this.Tail4.setPos(0.0F, 0.0F, 2.5F);
            this.Tail4.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.0911061832922575F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 20, 27);
            this.Tail3.setPos(0.0F, 0.0F, 2.5F);
            this.Tail3.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.0911061832922575F, 0.0F, 0.0F);
            this.shape14 = new ModelRenderer(this, 56, 19);
            this.shape14.setPos(0.0F, 0.0F, 0.0F);
            this.shape14.addBox(-2.0F, -0.7F, -1.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.shape9 = new ModelRenderer(this, 21, 12);
            this.shape9.setPos(0.0F, 0.2F, -0.5F);
            this.shape9.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape9, 0.3642502295386026F, 0.0F, 0.0F);
            this.LeftMoustache2 = new ModelRenderer(this, 0, 0);
            this.LeftMoustache2.mirror = true;
            this.LeftMoustache2.setPos(1.5F, 0.0F, 0.01F);
            this.LeftMoustache2.addBox(0.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftMoustache2, 0.0F, 0.0F, 0.7740534966278743F);
            this.shape6_1 = new ModelRenderer(this, 48, 0);
            this.shape6_1.setPos(-1.0F, 0.0F, 0.0F);
            this.shape6_1.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape6_1, 0.0F, 0.3642502295386026F, -0.27314402127920984F);
            this.Tail2 = new ModelRenderer(this, 10, 27);
            this.Tail2.setPos(0.0F, 0.0F, 2.5F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.0911061832922575F, 0.0F, 0.0F);
            this.Hand2Right = new ModelRenderer(this, 46, 20);
            this.Hand2Right.setPos(0.5F, 0.51F, 0.0F);
            this.Hand2Right.addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hand2Right, 0.0F, -0.27314402127920984F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 54, 12);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.01F, 2.0F, 0.5F);
            this.FootLeft.addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.4098033003787853F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 30, 8);
            this.Head.setPos(0.0F, 0.0F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -0.9F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 23, 21);
            this.Neck.setPos(0.0F, -1.8F, -2.0F);
            this.Neck.addBox(-1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6373942508178124F, 0.0F, 0.0F);
            this.Tail6 = new ModelRenderer(this, 50, 26);
            this.Tail6.setPos(0.0F, 0.0F, 2.5F);
            this.Tail6.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.0911061832922575F, 0.0F, 0.0F);
            this.Hand2Left = new ModelRenderer(this, 46, 20);
            this.Hand2Left.mirror = true;
            this.Hand2Left.setPos(-0.5F, 0.51F, 0.0F);
            this.Hand2Left.addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hand2Left, 0.0F, 0.27314402127920984F, 0.0F);
            this.LegRight = new ModelRenderer(this, 56, 7);
            this.LegRight.setPos(0.5F, 3.5F, -0.8F);
            this.LegRight.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.591841146688116F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 2);
            this.Body.setPos(0.0F, 19.0F, 0.0F);
            this.Body.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.04555309164612875F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 46, 7);
            this.ArmRight.setPos(-1.8F, 0.2F, -1.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.13665927909957545F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 40, 27);
            this.Tail5.setPos(0.0F, 0.0F, 2.5F);
            this.Tail5.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.0911061832922575F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 56, 7);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(-0.5F, 3.5F, -0.8F);
            this.LegLeft.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.591841146688116F, 0.0F, 0.0F);
            this.RightMoustache2 = new ModelRenderer(this, 0, 0);
            this.RightMoustache2.setPos(-1.5F, 0.0F, 0.01F);
            this.RightMoustache2.addBox(-2.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightMoustache2, 0.0F, 0.0F, -0.7740534966278743F);
            this.ThighLeft = new ModelRenderer(this, 52, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.5F, 1.5F, 2.0F);
            this.ThighLeft.addBox(-2.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.shape3 = new ModelRenderer(this, 34, 16);
            this.shape3.setPos(0.0F, -1.3F, -1.8F);
            this.shape3.addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape3, 0.0911061832922575F, 0.0F, 0.0F);
            this.LeftMoustache1 = new ModelRenderer(this, 0, 0);
            this.LeftMoustache1.mirror = true;
            this.LeftMoustache1.setPos(0.5F, 0.5F, -0.4F);
            this.LeftMoustache1.addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftMoustache1, -0.18203784630933073F, 0.0911061832922575F, 0.9105382388075086F);
            this.shape6 = new ModelRenderer(this, 48, 0);
            this.shape6.mirror = true;
            this.shape6.setPos(1.0F, -0.7F, -0.8F);
            this.shape6.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape6, 0.0F, -0.3642502295386026F, 0.27314402127920984F);
            this.FootRight = new ModelRenderer(this, 54, 12);
            this.FootRight.setPos(0.01F, 2.0F, 0.5F);
            this.FootRight.addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.4098033003787853F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 46, 12);
            this.ForearmLeft.mirror = true;
            this.ForearmLeft.setPos(-0.01F, 2.6F, 0.0F);
            this.ForearmLeft.addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3642502295386026F, 0.0F, 0.0F);
            this.shape10 = new ModelRenderer(this, 26, 17);
            this.shape10.setPos(0.0F, 0.0F, 0.3F);
            this.shape10.addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape10, 0.6373942508178124F, 0.0F, 0.0F);
            this.RightMoustache1 = new ModelRenderer(this, 0, 0);
            this.RightMoustache1.setPos(-0.5F, 0.5F, -0.4F);
            this.RightMoustache1.addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightMoustache1, -0.18203784630933073F, -0.0911061832922575F, -0.9105382388075086F);
            this.HandRight = new ModelRenderer(this, 46, 16);
            this.HandRight.setPos(0.01F, 1.6F, -0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 46, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.01F, 1.6F, -0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 46, 12);
            this.ForearmRight.setPos(0.01F, 2.6F, 0.0F);
            this.ForearmRight.addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3642502295386026F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 13);
            this.Hips.setPos(0.0F, -2.0F, 2.5F);
            this.Hips.addBox(-3.0F, -0.6F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.0911061832922575F, 0.0F, 0.0F);
            this.Neck.addChild(this.HeadFur);
            this.shape9.addChild(this.shape11);
            this.Hips.addChild(this.ThighRight);
            this.Hips.addChild(this.Tail1);
            this.Body.addChild(this.ArmLeft);
            this.Tail3.addChild(this.Tail4);
            this.Tail2.addChild(this.Tail3);
            this.Neck.addChild(this.shape14);
            this.Head.addChild(this.shape9);
            this.LeftMoustache1.addChild(this.LeftMoustache2);
            this.HeadFur.addChild(this.shape6_1);
            this.Tail1.addChild(this.Tail2);
            this.HandRight.addChild(this.Hand2Right);
            this.LegLeft.addChild(this.FootLeft);
            this.HeadFur.addChild(this.Head);
            this.Body.addChild(this.Neck);
            this.Tail5.addChild(this.Tail6);
            this.HandLeft.addChild(this.Hand2Left);
            this.ThighRight.addChild(this.LegRight);
            this.Body.addChild(this.ArmRight);
            this.Tail4.addChild(this.Tail5);
            this.ThighLeft.addChild(this.LegLeft);
            this.RightMoustache1.addChild(this.RightMoustache2);
            this.Hips.addChild(this.ThighLeft);
            this.HeadFur.addChild(this.shape3);
            this.shape9.addChild(this.LeftMoustache1);
            this.HeadFur.addChild(this.shape6);
            this.LegRight.addChild(this.FootRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.shape9.addChild(this.shape10);
            this.shape9.addChild(this.RightMoustache1);
            this.ForearmRight.addChild(this.HandRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Body.addChild(this.Hips);
            this.saveBase();

        }

        @Override
        public void setupAnim(TamarinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 1.0f;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
            }
        }
    }

    public static class Child extends TamarinModel {
        public ModelRenderer Hips;
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
        public ModelRenderer shape6;
        public ModelRenderer shape6_1;
        public ModelRenderer shape3;
        public ModelRenderer shape9;
        public ModelRenderer shape10;
        public ModelRenderer shape11;
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
            texWidth = 85;
            texHeight = 32;
            this.HeadFur = new ModelRenderer(this, 20, 0);
            this.HeadFur.setPos(0.0F, 1.5F, -1.0F);
            this.HeadFur.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadFur, 0.6829473549475088F, 0.0F, 0.0F);
            this.shape11 = new ModelRenderer(this, 26, 15);
            this.shape11.setPos(0.0F, 1.0F, 0.0F);
            this.shape11.addBox(-1.0F, -0.2F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape11, -0.27314402127920984F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 52, 0);
            this.ThighRight.setPos(-2.5F, 1.5F, 2.0F);
            this.ThighRight.addBox(-1.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 27);
            this.Tail1.setPos(0.0F, 0.1F, 3.5F);
            this.Tail1.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.5462880425584197F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 7);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(1.8F, 0.2F, -1.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.13665927909957545F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 30, 27);
            this.Tail4.setPos(0.0F, 0.0F, 2.5F);
            this.Tail4.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.0911061832922575F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 20, 27);
            this.Tail3.setPos(0.0F, 0.0F, 2.5F);
            this.Tail3.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.0911061832922575F, 0.0F, 0.0F);
            this.shape14 = new ModelRenderer(this, 56, 19);
            this.shape14.setPos(0.0F, 0.0F, 0.0F);
            this.shape14.addBox(-2.0F, -0.7F, -1.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.shape9 = new ModelRenderer(this, 21, 12);
            this.shape9.setPos(0.0F, 0.2F, -0.5F);
            this.shape9.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape9, 0.3642502295386026F, 0.0F, 0.0F);
            this.LeftMoustache2 = new ModelRenderer(this, 0, 0);
            this.LeftMoustache2.mirror = true;
            this.LeftMoustache2.setPos(1.5F, 0.0F, 0.01F);
            this.LeftMoustache2.addBox(0.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftMoustache2, 0.0F, 0.0F, 0.7740534966278743F);
            this.shape6_1 = new ModelRenderer(this, 48, 0);
            this.shape6_1.setPos(-1.0F, 0.0F, 0.0F);
            this.shape6_1.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape6_1, 0.0F, 0.3642502295386026F, -0.27314402127920984F);
            this.Tail2 = new ModelRenderer(this, 10, 27);
            this.Tail2.setPos(0.0F, 0.0F, 2.5F);
            this.Tail2.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.0911061832922575F, 0.0F, 0.0F);
            this.Hand2Right = new ModelRenderer(this, 46, 20);
            this.Hand2Right.setPos(0.5F, 0.51F, 0.0F);
            this.Hand2Right.addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hand2Right, 0.0F, -0.27314402127920984F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 54, 12);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.01F, 2.0F, 0.5F);
            this.FootLeft.addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.4098033003787853F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 30, 8);
            this.Head.setPos(0.0F, 0.0F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -0.9F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 23, 21);
            this.Neck.setPos(0.0F, -1.8F, -2.0F);
            this.Neck.addBox(-1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6373942508178124F, 0.0F, 0.0F);
            this.Tail6 = new ModelRenderer(this, 50, 26);
            this.Tail6.setPos(0.0F, 0.0F, 2.5F);
            this.Tail6.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail6, 0.0911061832922575F, 0.0F, 0.0F);
            this.Hand2Left = new ModelRenderer(this, 46, 20);
            this.Hand2Left.mirror = true;
            this.Hand2Left.setPos(-0.5F, 0.51F, 0.0F);
            this.Hand2Left.addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hand2Left, 0.0F, 0.27314402127920984F, 0.0F);
            this.LegRight = new ModelRenderer(this, 56, 7);
            this.LegRight.setPos(0.5F, 3.5F, -0.8F);
            this.LegRight.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.591841146688116F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 2);
            this.Body.setPos(0.0F, 19.0F, 0.0F);
            this.Body.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.04555309164612875F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 46, 7);
            this.ArmRight.setPos(-1.8F, 0.2F, -1.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.13665927909957545F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 40, 27);
            this.Tail5.setPos(0.0F, 0.0F, 2.5F);
            this.Tail5.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, 0.0911061832922575F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 56, 7);
            this.LegLeft.mirror = true;
            this.LegLeft.setPos(-0.5F, 3.5F, -0.8F);
            this.LegLeft.addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.591841146688116F, 0.0F, 0.0F);
            this.RightMoustache2 = new ModelRenderer(this, 0, 0);
            this.RightMoustache2.setPos(-1.5F, 0.0F, 0.01F);
            this.RightMoustache2.addBox(-2.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightMoustache2, 0.0F, 0.0F, -0.7740534966278743F);
            this.ThighLeft = new ModelRenderer(this, 52, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.5F, 1.5F, 2.0F);
            this.ThighLeft.addBox(-2.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.shape3 = new ModelRenderer(this, 34, 16);
            this.shape3.setPos(0.0F, -1.3F, -1.8F);
            this.shape3.addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape3, 0.0911061832922575F, 0.0F, 0.0F);
            this.LeftMoustache1 = new ModelRenderer(this, 0, 0);
            this.LeftMoustache1.mirror = true;
            this.LeftMoustache1.setPos(0.5F, 0.5F, -0.4F);
            this.LeftMoustache1.addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftMoustache1, -0.18203784630933073F, 0.0911061832922575F, 0.9105382388075086F);
            this.shape6 = new ModelRenderer(this, 48, 0);
            this.shape6.mirror = true;
            this.shape6.setPos(1.0F, -0.7F, -0.8F);
            this.shape6.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape6, 0.0F, -0.3642502295386026F, 0.27314402127920984F);
            this.FootRight = new ModelRenderer(this, 54, 12);
            this.FootRight.setPos(0.01F, 2.0F, 0.5F);
            this.FootRight.addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.4098033003787853F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 46, 12);
            this.ForearmLeft.mirror = true;
            this.ForearmLeft.setPos(-0.01F, 2.6F, 0.0F);
            this.ForearmLeft.addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3642502295386026F, 0.0F, 0.0F);
            this.shape10 = new ModelRenderer(this, 26, 17);
            this.shape10.setPos(0.0F, 0.0F, 0.3F);
            this.shape10.addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape10, 0.6373942508178124F, 0.0F, 0.0F);
            this.RightMoustache1 = new ModelRenderer(this, 0, 0);
            this.RightMoustache1.setPos(-0.5F, 0.5F, -0.4F);
            this.RightMoustache1.addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightMoustache1, -0.18203784630933073F, -0.0911061832922575F, -0.9105382388075086F);
            this.HandRight = new ModelRenderer(this, 46, 16);
            this.HandRight.setPos(0.01F, 1.6F, -0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 46, 16);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.01F, 1.6F, -0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 46, 12);
            this.ForearmRight.setPos(0.01F, 2.6F, 0.0F);
            this.ForearmRight.addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3642502295386026F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 13);
            this.Hips.setPos(0.0F, -2.0F, 2.5F);
            this.Hips.addBox(-3.0F, -0.6F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.0911061832922575F, 0.0F, 0.0F);
            this.Neck.addChild(this.HeadFur);
            this.shape9.addChild(this.shape11);
            this.Hips.addChild(this.ThighRight);
            this.Hips.addChild(this.Tail1);
            this.Body.addChild(this.ArmLeft);
            this.Tail3.addChild(this.Tail4);
            this.Tail2.addChild(this.Tail3);
            this.Neck.addChild(this.shape14);
            this.Head.addChild(this.shape9);
            this.LeftMoustache1.addChild(this.LeftMoustache2);
            this.HeadFur.addChild(this.shape6_1);
            this.Tail1.addChild(this.Tail2);
            this.HandRight.addChild(this.Hand2Right);
            this.LegLeft.addChild(this.FootLeft);
            this.HeadFur.addChild(this.Head);
            this.Body.addChild(this.Neck);
            this.Tail5.addChild(this.Tail6);
            this.HandLeft.addChild(this.Hand2Left);
            this.ThighRight.addChild(this.LegRight);
            this.Body.addChild(this.ArmRight);
            this.Tail4.addChild(this.Tail5);
            this.ThighLeft.addChild(this.LegLeft);
            this.RightMoustache1.addChild(this.RightMoustache2);
            this.Hips.addChild(this.ThighLeft);
            this.HeadFur.addChild(this.shape3);
            this.shape9.addChild(this.LeftMoustache1);
            this.HeadFur.addChild(this.shape6);
            this.LegRight.addChild(this.FootRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.shape9.addChild(this.shape10);
            this.shape9.addChild(this.RightMoustache1);
            this.ForearmRight.addChild(this.HandRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Body.addChild(this.Hips);
            this.saveBase();

        }

        @Override
        public void setupAnim(TamarinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
            }
        }
    }
}