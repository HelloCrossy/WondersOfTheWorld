package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.WarthogEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class WarthogModel extends ZawaBaseModel<WarthogEntity> {
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

    public static class Adult extends WarthogModel {
        public ModelRenderer part2;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer part3;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer shape30;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer shape31;
        public ModelRenderer part15;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer LowerArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer part4;
        public ModelRenderer part11;
        public ModelRenderer part5;
        public ModelRenderer Nose;
        public ModelRenderer part8;
        public ModelRenderer part5_1;
        public ModelRenderer part14;
        public ModelRenderer part14_1;
        public ModelRenderer part6;
        public ModelRenderer part9;
        public ModelRenderer part9_1;
        public ModelRenderer part10;
        public ModelRenderer part10_1;
        public ModelRenderer part12;
        public ModelRenderer part13;


        public Adult() {
            texWidth = 64;
            texHeight = 64;
            this.Nose = new ModelRenderer(this, 36, 13);
            this.Nose.setPos(0.0F, -2.7F, -1.0F);
            this.Nose.addBox(-1.5F, 0.1F, -4.5F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.5019566968683108F, 0.0F, 0.0F);
            this.part9_1 = new ModelRenderer(this, 30, 0);
            this.part9_1.setPos(-2.0F, 1.7F, 1.0F);
            this.part9_1.addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part9_1, -0.3127630032889644F, 0.0F, -0.7038913192872462F);
            this.part8 = new ModelRenderer(this, 50, 23);
            this.part8.setPos(0.0F, 2.3F, -1.5F);
            this.part8.addBox(-1.5F, -1.3F, -4.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part8, -0.0781907508222411F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 19, 50);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(0.0F, 2.7F, 2.7F);
            this.LowerLegLeft.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3490658503988659F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 43, 49);
            this.HandLeft.setPos(-0.1F, 3.3F, -1.3F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.part10 = new ModelRenderer(this, 30, 0);
            this.part10.setPos(-0.1F, -1.8F, 0.0F);
            this.part10.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part10, 0.0F, 0.0F, -0.3127630032889644F);
            this.part5 = new ModelRenderer(this, 50, 42);
            this.part5.setPos(3.0F, 1.2F, 0.0F);
            this.part5.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part5, 0.27366763203903305F, 0.15655603856442327F, 0.19547687289441354F);
            this.part6 = new ModelRenderer(this, 50, 16);
            this.part6.setPos(0.0F, 0.0F, -4.5F);
            this.part6.addBox(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part6, -0.5473352640780661F, 0.0F, 0.0F);
            this.part9 = new ModelRenderer(this, 30, 0);
            this.part9.setPos(2.0F, 1.7F, 1.0F);
            this.part9.addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part9, -0.3127630032889644F, 0.0F, 0.7038913192872462F);
            this.Hips = new ModelRenderer(this, 0, 29);
            this.Hips.setPos(0.0F, 0.0F, 6.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2275909337942703F, 0.0F, 0.0F);
            this.part13 = new ModelRenderer(this, 40, 5);
            this.part13.setPos(0.0F, -2.5F, 1.0F);
            this.part13.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part13, -0.46914448828868976F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 29, 60);
            this.FootLeft.setPos(-0.1F, 3.2F, -1.2F);
            this.FootLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13665927909957545F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 52, 50);
            this.LowerArmRight.mirror = true;
            this.LowerArmRight.setPos(0.0F, 2.3F, 0.0F);
            this.LowerArmRight.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.04363323129985824F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 19, 50);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 2.7F, 2.7F);
            this.LowerLegRight.addBox(-0.99F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3490658503988659F, 0.0F, 0.0F);
            this.part14_1 = new ModelRenderer(this, 20, 0);
            this.part14_1.setPos(-3.0F, -2.0F, 1.0F);
            this.part14_1.addBox(-0.5F, -1.5F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part14_1, 0.19547687289441354F, 0.35185837453889574F, -0.3909537457888271F);
            this.ThighLeft = new ModelRenderer(this, 0, 49);
            this.ThighLeft.setPos(2.7F, 3.1F, 3.7F);
            this.ThighLeft.addBox(-2.5F, 0.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.03909537541112055F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 29, 60);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.2F, -1.2F);
            this.FootRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13665927909957545F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 43, 49);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 3.3F, -1.3F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.part11 = new ModelRenderer(this, 31, 1);
            this.part11.setPos(0.0F, -0.8F, -0.5F);
            this.part11.addBox(-1.0F, -2.5F, -3.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part11, 0.4300491170387584F, 0.0F, 0.0F);
            this.part10_1 = new ModelRenderer(this, 30, 0);
            this.part10_1.setPos(0.1F, -1.8F, 0.0F);
            this.part10_1.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part10_1, 0.0F, 0.0F, 0.3127630032889644F);
            this.UpperLegRight = new ModelRenderer(this, 18, 57);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-0.1F, 6.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4363323129985824F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 18, 57);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(-0.1F, 6.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4363323129985824F, 0.0F, 0.0F);
            this.part12 = new ModelRenderer(this, 40, 0);
            this.part12.setPos(0.0F, -2.15F, -2.65F);
            this.part12.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part12, 0.7428121536172364F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 51, 57);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 3.9F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.LowerArmLeft = new ModelRenderer(this, 52, 50);
            this.LowerArmLeft.setPos(0.0F, 2.3F, 0.0F);
            this.LowerArmLeft.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.04363323129985824F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 38, 54);
            this.ArmBaseLeft.setPos(2.2F, 1.0F, -0.2F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.2474876932591181F, 0.0F, 0.0F);
            this.part3 = new ModelRenderer(this, 44, 30);
            this.part3.setPos(0.0F, -3.2F, -1.7F);
            this.part3.addBox(-2.0F, -0.6F, -3.2F, 4.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part3, -0.46914448828868976F, 0.0F, 0.0F);
            this.part5_1 = new ModelRenderer(this, 50, 42);
            this.part5_1.setPos(-3.0F, 1.2F, 0.0F);
            this.part5_1.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part5_1, 0.27366763203903305F, -0.15655603856442327F, -0.19547687289441354F);
            this.shape30 = new ModelRenderer(this, 50, 0);
            this.shape30.setPos(0.0F, 0.5F, 5.5F);
            this.shape30.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape30, 0.27314402127920984F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 51, 57);
            this.UpperArmLeft.setPos(0.0F, 3.9F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 13.3F, -5.0F);
            this.Chest.addBox(-3.5F, -3.5F, -2.0F, 7.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.1171115934746098F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 49);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.7F, 3.1F, 3.7F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.03909537541112055F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 38, 54);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.2F, 1.0F, -0.2F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.2474876932591181F, 0.0F, 0.0F);
            this.part15 = new ModelRenderer(this, 54, 5);
            this.part15.setPos(0.0F, 2.9F, 0.0F);
            this.part15.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part15, 0.11728612207217244F, 0.0F, 0.0F);
            this.part4 = new ModelRenderer(this, 30, 20);
            this.part4.setPos(0.0F, 2.85F, -3.0F);
            this.part4.addBox(-2.5F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part4, 0.7428121536172364F, 0.0F, 0.0F);
            this.shape31 = new ModelRenderer(this, 54, 0);
            this.shape31.setPos(0.0F, 4.7F, 0.0F);
            this.shape31.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape31, -0.1494001912944076F, 0.0F, 0.0F);
            this.part2 = new ModelRenderer(this, 0, 13);
            this.part2.setPos(0.0F, -4.0F, 2.0F);
            this.part2.addBox(-4.0F, 0.0F, -1.0F, 8.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part2, 0.1563815016444822F, 0.0F, 0.0F);
            this.part14 = new ModelRenderer(this, 20, 0);
            this.part14.setPos(3.0F, -2.0F, 1.0F);
            this.part14.addBox(-1.5F, -1.5F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part14, 0.19547687289441354F, -0.35185837453889574F, 0.3909537457888271F);
            this.part4.addChild(this.Nose);
            this.part6.addChild(this.part9_1);
            this.part4.addChild(this.part8);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.part9.addChild(this.part10);
            this.part4.addChild(this.part5);
            this.Nose.addChild(this.part6);
            this.part6.addChild(this.part9);
            this.part2.addChild(this.Hips);
            this.part11.addChild(this.part13);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.part4.addChild(this.part14_1);
            this.Hips.addChild(this.ThighLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.LowerArmRight.addChild(this.HandRight);
            this.part3.addChild(this.part11);
            this.part9_1.addChild(this.part10_1);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.part11.addChild(this.part12);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.part3);
            this.part4.addChild(this.part5_1);
            this.Hips.addChild(this.shape30);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.shape31.addChild(this.part15);
            this.part3.addChild(this.part4);
            this.shape30.addChild(this.shape31);
            this.Chest.addChild(this.part2);
            this.part4.addChild(this.part14);
            this.saveBase();
        }

        @Override
        public void setupAnim(WarthogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 0.2F;
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                speed = 1.8F;
                degree = 0.1F;
            } else {
            }
        }
    }

    public static class Child extends WarthogModel {
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer CheekTuftRight;
        public ModelRenderer CheetTuftLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            texWidth = 32;
            texHeight = 32;
            this.Neck = new ModelRenderer(this, 16, 0);
            this.Neck.setPos(0.0F, -0.6F, -1.0F);
            this.Neck.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.16580627893946132F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 20, 12);
            this.EarLeft.setPos(1.1F, -1.2F, 0.7F);
            this.EarLeft.addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.5410520681182421F, -0.3490658503988659F, 0.7504915783575618F);
            this.ForearmLeft = new ModelRenderer(this, 8, 28);
            this.ForearmLeft.setPos(-0.01F, 0.9F, -1.0F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, 0.017453292519943295F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 8);
            this.Chest.setPos(0.0F, 18.3F, -3.0F);
            this.Chest.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.12217304763960307F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 4, 29);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.01F, 1.3F, -0.7F);
            this.FootRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 20);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 1.5F, 1.1F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.2617993877991494F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 14);
            this.Hips.setPos(0.0F, -0.3F, 4.0F);
            this.Hips.addBox(-1.5F, 0.3F, 0.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3490658503988659F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 20, 12);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.2F, -1.2F, 0.7F);
            this.EarRight.addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.5410520681182421F, 0.3490658503988659F, -0.7504915783575618F);
            this.ArmLeft = new ModelRenderer(this, 8, 25);
            this.ArmLeft.setPos(-0.01F, 2.0F, 0.3F);
            this.ArmLeft.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.12217304763960307F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 0, 28);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.01F, 1.8F, 1.0F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6981317007977318F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -1.5F, 0.1F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.20943951023931953F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 8, 21);
            this.ArmBaseLeft.setPos(1.4F, 0.4F, 0.0F);
            this.ArmBaseLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.22689280275926282F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 8, 25);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.01F, 2.0F, 0.3F);
            this.ArmRight.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.12217304763960307F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 8, 21);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.4F, 0.4F, 0.0F);
            this.ArmBaseRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.22689280275926282F, 0.0F, 0.0F);
            this.CheetTuftLeft = new ModelRenderer(this, -1, 0);
            this.CheetTuftLeft.setPos(1.4F, 0.4F, 1.3F);
            this.CheetTuftLeft.addBox(-1.5F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheetTuftLeft, 0.07853981633974483F, -0.938114472946952F, -0.47123889803846897F);
            this.ThighLeft = new ModelRenderer(this, 0, 20);
            this.ThighLeft.setPos(1.2F, 1.5F, 1.1F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.2617993877991494F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 4, 29);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.01F, 1.5F, 0.3F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 8, 28);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.01F, 0.9F, -1.0F);
            this.ForearmRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.CheekTuftRight = new ModelRenderer(this, -1, 0);
            this.CheekTuftRight.setPos(-1.0F, 0.7F, 0.6F);
            this.CheekTuftRight.addBox(-1.5F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CheekTuftRight, 0.07853981633974483F, 0.938114472946952F, 0.47123889803846897F);
            this.HandLeft = new ModelRenderer(this, 4, 29);
            this.HandLeft.setPos(-0.01F, 1.5F, 0.3F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 10, 16);
            this.Mouth.setPos(0.0F, 0.4F, -0.9F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 14, 19);
            this.Tail.setPos(0.0F, 0.7F, 1.5F);
            this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.4300491170387584F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 25);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-0.3F, 3.0F, -0.3F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6981317007977318F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 10, 12);
            this.Snout.setPos(0.0F, -1.2F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.4363323129985824F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 0, 28);
            this.LowerLegLeft.setPos(-0.01F, 1.8F, 0.9F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6981317007977318F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 14, 6);
            this.Head.setPos(0.0F, 0.7F, -2.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.40142572795869574F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 4, 29);
            this.FootLeft.setPos(-0.01F, 1.3F, -0.7F);
            this.FootLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 25);
            this.UpperLegLeft.setPos(0.3F, 3.0F, -0.3F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6981317007977318F, 0.0F, 0.0F);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.EarLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Hips.addChild(this.ThighRight);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.EarRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.Body);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Mouth.addChild(this.CheetTuftLeft);
            this.Hips.addChild(this.ThighLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Mouth.addChild(this.CheekTuftRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Mouth);
            this.Hips.addChild(this.Tail);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.Snout);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Neck.addChild(this.Head);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(WarthogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
                float degree = 0.75f;
            }
        }
    }
}

