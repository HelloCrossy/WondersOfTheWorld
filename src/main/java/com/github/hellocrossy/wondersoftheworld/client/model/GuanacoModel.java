package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.GuanacoEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GuanacoModel extends ZawaBaseModel<GuanacoEntity> {

    public ModelRenderer Chest;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends GuanacoModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck1;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Neck2;
        public ModelRenderer Neck3;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Jaw;
        public ModelRenderer TopSnout;

        public Adult() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.EarLeft = new ModelRenderer(this, 24, 0);
            this.EarLeft.setPos(1.9F, -2.0F, -0.3F);
            this.EarLeft.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F);
            this.setRotateAngle(EarLeft, 0.136659280431156F, -0.22759093446006054F, -0.091106186954104F);
            this.LowerLegRight = new ModelRenderer(this, 71, 58);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 7.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, -0.5F, -2.0F, 2, 6, 2, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.30543261909900765F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 69, 115);
            this.UpperArmLeft.setPos(0.0F, 9.5F, 1.5F);
            this.UpperArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3, 7, 3, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.04363323129985824F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 107);
            this.Chest.setPos(0.0F, 4.5F, -8.5F);
            this.Chest.addBox(-4.0F, -5.0F, -3.5F, 8, 8, 7, 0.0F);
            this.setRotateAngle(Chest, 0.40142572795869574F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 1);
            this.Tail1.setPos(0.0F, 0.0F, 4.4F);
            this.Tail1.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 4, 0.0F);
            this.setRotateAngle(Tail1, -0.091106186954104F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 24, 0);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.9F, -2.0F, -0.3F);
            this.EarRight.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F);
            this.setRotateAngle(EarRight, 0.136659280431156F, 0.22759093446006054F, 0.091106186954104F);
            this.ArmBaseLeft = new ModelRenderer(this, 36, 109);
            this.ArmBaseLeft.setPos(2.7F, -2.1F, 1.3F);
            this.ArmBaseLeft.addBox(-2.5F, 0.0F, -2.5F, 5, 10, 5, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.3490658503988659F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 42, 1);
            this.Neck1.setPos(0.0F, -0.8F, -3.5F);
            this.Neck1.addBox(-3.0F, -5.0F, -5.0F, 6, 6, 8, 0.0F);
            this.setRotateAngle(Neck1, -1.1344640137963142F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 85, 118);
            this.ArmLeft.setPos(0.0F, 7.0F, -2.5F);
            this.ArmLeft.addBox(-1.0F, -0.5F, 0.0F, 2, 5, 2, 0.0F);
            this.setRotateAngle(ArmLeft, -0.07853981633974483F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 40, 45);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.9F, 0.9F, 3.6F);
            this.ThighRight.addBox(-2.5F, 0.0F, -3.0F, 5, 11, 6, 0.0F);
            this.setRotateAngle(ThighRight, 0.08726646259971647F, 0.0F, 0.0F);
            this.Neck3 = new ModelRenderer(this, 42, 30);
            this.Neck3.setPos(0.0F, -3.0F, -8.0F);
            this.Neck3.addBox(-2.0F, 0.0F, -3.0F, 4, 3, 3, 0.0F);
            this.setRotateAngle(Neck3, 0.136659280431156F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 85, 118);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 7.0F, -2.5F);
            this.ArmRight.addBox(-1.0F, -0.5F, 0.0F, 2, 5, 2, 0.0F);
            this.setRotateAngle(ArmRight, -0.07853981633974483F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 15, 1);
            this.Tail2.setPos(0.0F, 0.0F, 4.0F);
            this.Tail2.addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Tail2, 0.5462880558742251F, -0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 72, 42);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 10.9F, -1.6F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4363323129985824F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 59, 65);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 5.6F, -1.3F);
            this.FootRight.addBox(-1.5F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
            this.setRotateAngle(FootRight, 0.04363323129985824F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 37, 17);
            this.TopSnout.setPos(0.0F, 0.0F, -1.8F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
            this.setRotateAngle(TopSnout, 0.36425021489121656F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 48);
            this.Hips.setPos(0.0F, -10.0F, 14.0F);
            this.Hips.addBox(-4.5F, 0.0F, 0.0F, 9, 9, 6, 0.0F);
            this.setRotateAngle(Hips, -0.2617993877991494F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 36, 109);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.7F, -2.1F, 1.3F);
            this.ArmBaseRight.addBox(-2.5F, 0.0F, -2.5F, 5, 10, 5, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.3490658503988659F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 71, 58);
            this.LowerLegLeft.setPos(0.0F, 7.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, -0.5F, -2.0F, 2, 6, 2, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.30543261909900765F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 21, 17);
            this.Snout.setPos(0.0F, -0.5F, -4.9F);
            this.Snout.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 4, 0.0F);
            this.setRotateAngle(Snout, 0.091106186954104F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 59, 65);
            this.HandLeft.setPos(0.0F, 4.5F, 0.7F);
            this.HandLeft.addBox(-1.5F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
            this.setRotateAngle(HandLeft, 0.04363323129985824F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 16);
            this.Head.setPos(0.0F, 1.8F, -1.3F);
            this.Head.addBox(-2.5F, -2.5F, -3.5F, 5, 5, 5, 0.0F);
            this.setRotateAngle(Head, 1.4114477660878142F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 59, 65);
            this.FootLeft.setPos(0.0F, 5.6F, -1.3F);
            this.FootLeft.addBox(-1.5F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
            this.setRotateAngle(FootLeft, 0.04363323129985824F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 59, 65);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 4.5F, 0.7F);
            this.HandRight.addBox(-1.5F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
            this.setRotateAngle(HandRight, 0.04363323129985824F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 23, 25);
            this.Jaw.setPos(0.0F, 1.8F, 1.2F);
            this.Jaw.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 4, 0.0F);
            this.setRotateAngle(Jaw, -0.08726646259971647F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 40, 45);
            this.ThighLeft.setPos(2.9F, 0.9F, 3.6F);
            this.ThighLeft.addBox(-2.5F, 0.0F, -3.0F, 5, 11, 6, 0.0F);
            this.setRotateAngle(ThighLeft, 0.08726646259971647F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 72, 42);
            this.UpperLegLeft.setPos(0.0F, 10.9F, -1.6F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4363323129985824F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 70);
            this.Body.setPos(0.0F, 4.0F, -1.0F);
            this.Body.addBox(-5.0F, -10.0F, 0.0F, 10, 10, 14, 0.0F);
            this.setRotateAngle(Body, -0.4363323129985824F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 69, 115);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 9.5F, 1.5F);
            this.UpperArmRight.addBox(-1.5F, 0.0F, -3.0F, 3, 7, 3, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.04363323129985824F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 42, 16);
            this.Neck2.setPos(0.0F, -0.6F, -4.9F);
            this.Neck2.addBox(-2.0F, -3.0F, -8.0F, 4, 4, 9, 0.0F);
            this.setRotateAngle(Neck2, -0.7740535232594852F, 0.0F, 0.0F);
            this.Head.addChild(this.EarLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.Neck1);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Hips.addChild(this.ThighRight);
            this.Neck2.addChild(this.Neck3);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Tail1.addChild(this.Tail2);
            this.ThighRight.addChild(this.UpperLegRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Snout.addChild(this.TopSnout);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.Snout);
            this.ArmLeft.addChild(this.HandLeft);
            this.Neck3.addChild(this.Head);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Snout.addChild(this.Jaw);
            this.Hips.addChild(this.ThighLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Chest.addChild(this.Body);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Neck1.addChild(this.Neck2);
            this.saveBase();

        }

        @Override
        public void setupAnim(GuanacoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.75f;
            float degree = 1.0f;
        
        }
    }

    public static class Child extends GuanacoModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLeRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer NeckConnection;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmLeft_1;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Hips = new ModelRenderer(this, 1, 30);
            this.Hips.setPos(0.0F, 0.0F, 6.5F);
            this.Hips.addBox(-3.0F, -0.5F, 0.0F, 6, 6, 3, 0.0F);
            this.setRotateAngle(Hips, -0.18203784098300857F, 0.0F, 0.0F);
            this.NeckConnection = new ModelRenderer(this, 30, 9);
            this.NeckConnection.setPos(0.0F, -7.6F, 2.1F);
            this.NeckConnection.addBox(-1.5F, -2.0F, -0.5F, 3, 2, 1, 0.0F);
            this.setRotateAngle(NeckConnection, 0.7740535232594852F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 42, 57);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.0F, 5.9F, -1.3F);
            this.FootLeft.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 2, 0.0F);
            this.setRotateAngle(FootLeft, 0.04363323129985824F, 0.0F, 0.0F);
            this.UpperArmLeft_1 = new ModelRenderer(this, 49, 9);
            this.UpperArmLeft_1.setPos(0.0F, 5.5F, 1.0F);
            this.UpperArmLeft_1.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
            this.setRotateAngle(UpperArmLeft_1, -0.045553093477052F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 39);
            this.Body.setPos(0.0F, -3.0F, 1.5F);
            this.Body.addBox(-3.5F, -0.5F, -1.0F, 7, 7, 8, 0.0F);
            this.setRotateAngle(Body, 0.18203784098300857F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 29, 0);
            this.Head.setPos(0.0F, -7.3F, -0.5F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F);
            this.setRotateAngle(Head, 0.091106186954104F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 42, 57);
            this.HandRight.setPos(0.0F, 4.0F, 0.5F);
            this.HandRight.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 2, 0.0F);
            this.setRotateAngle(HandRight, 0.091106186954104F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 43, 28);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.01F, 4.5F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, -0.5F, -2.0F, 2, 6, 2, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.4553564018453205F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 23);
            this.Tail1.setPos(0.0F, 0.0F, 3.0F);
            this.Tail1.addBox(-1.5F, -0.5F, -0.5F, 3, 3, 3, 0.0F);
            this.setRotateAngle(Tail1, 0.4553564018453205F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 42, 57);
            this.FootRight.setPos(0.0F, 5.9F, -1.3F);
            this.FootRight.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 2, 0.0F);
            this.setRotateAngle(FootRight, 0.04363323129985824F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 42, 36);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.0F, 6.5F, -2.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4553564018453205F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 18, 7);
            this.Neck2.setPos(0.0F, -1.5F, -2.0F);
            this.Neck2.addBox(-1.5F, -8.0F, -0.5F, 3, 8, 3, 0.0F);
            this.setRotateAngle(Neck2, -0.6829473363053812F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 6, 8);
            this.TopSnout.setPos(0.0F, -1.4F, 1.2F);
            this.TopSnout.addBox(-1.0F, -0.4F, -3.0F, 2, 1, 3, 0.0F);
            this.setRotateAngle(TopSnout, 0.31869712141416456F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 0);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.2F, -1.5F, 1.3F);
            this.EarLeft.addBox(-1.0F, -2.5F, -0.5F, 2, 3, 1, 0.0F);
            this.setRotateAngle(EarLeft, 0.136659280431156F, -0.18203784098300857F, 0.136659280431156F);
            this.Neck = new ModelRenderer(this, 16, 19);
            this.Neck.setPos(0.0F, -1.0F, -1.5F);
            this.Neck.addBox(-2.0F, -2.0F, -2.5F, 4, 4, 4, 0.0F);
            this.setRotateAngle(Neck, 0.7740535232594852F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 49, 0);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(1.9F, -1.6F, -0.5F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.18203784098300857F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 16);
            this.Tail2.setPos(-0.01F, 0.2F, 2.3F);
            this.Tail2.addBox(-1.5F, -0.5F, -2.5F, 3, 4, 3, 0.0F);
            this.setRotateAngle(Tail2, 0.5009094953223726F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 14, 0);
            this.Snout.setPos(0.0F, 0.5F, -2.0F);
            this.Snout.addBox(-1.5F, -1.0F, -2.0F, 3, 2, 3, 0.0F);
            this.setRotateAngle(Snout, 0.091106186954104F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 49, 17);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.01F, 5.5F, -1.5F);
            this.ArmLeft.addBox(-1.0F, 0.2F, -0.5F, 2, 4, 2, 0.0F);
            this.setRotateAngle(ArmLeft, -0.091106186954104F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 54);
            this.Chest.setPos(0.0F, 10.4F, -5.0F);
            this.Chest.addBox(-3.0F, -3.5F, -2.0F, 6, 6, 4, 0.0F);
            this.setRotateAngle(Chest, -0.136659280431156F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.setPos(-1.2F, -1.5F, 1.3F);
            this.EarRight.addBox(-1.0F, -2.5F, -0.5F, 2, 3, 1, 0.0F);
            this.setRotateAngle(EarRight, 0.136659280431156F, 0.18203784098300857F, -0.136659280431156F);
            this.UpperLeRight = new ModelRenderer(this, 42, 36);
            this.UpperLeRight.setPos(0.0F, 6.5F, -2.0F);
            this.UpperLeRight.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
            this.setRotateAngle(UpperLeRight, 0.4553564018453205F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 40, 44);
            this.ThighRight.setPos(-2.1F, 1.0F, 2.0F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3, 7, 4, 0.0F);
            this.setRotateAngle(ThighRight, 0.091106186954104F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 49, 9);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.0F, 5.5F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.045553093477052F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 40, 44);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.1F, 1.0F, 2.0F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 7, 4, 0.0F);
            this.setRotateAngle(ThighLeft, 0.091106186954104F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 49, 17);
            this.ArmRight.setPos(-0.01F, 5.5F, -1.5F);
            this.ArmRight.addBox(-1.0F, 0.2F, -0.5F, 2, 4, 2, 0.0F);
            this.setRotateAngle(ArmRight, -0.091106186954104F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 42, 57);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(0.0F, 4.0F, 0.5F);
            this.HandLeft.addBox(-1.5F, -0.5F, -1.5F, 3, 1, 2, 0.0F);
            this.setRotateAngle(HandLeft, 0.091106186954104F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 2, 5);
            this.Mouth.setPos(0.0F, 1.4F, -1.3F);
            this.Mouth.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Mouth, 0.091106186954104F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 49, 0);
            this.ArmBaseRight.setPos(-1.9F, -1.6F, -0.5F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.18203784098300857F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 43, 28);
            this.LowerLegRight.setPos(0.01F, 4.5F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, -0.5F, -2.0F, 2, 6, 2, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.4553564018453205F, 0.0F, 0.0F);
            this.Body.addChild(this.Hips);
            this.Neck2.addChild(this.NeckConnection);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmBaseRight.addChild(this.UpperArmLeft_1);
            this.Chest.addChild(this.Body);
            this.Neck2.addChild(this.Head);
            this.ArmRight.addChild(this.HandRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Hips.addChild(this.Tail1);
            this.LowerLegRight.addChild(this.FootRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck.addChild(this.Neck2);
            this.Snout.addChild(this.TopSnout);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.Neck);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.Snout);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.EarRight);
            this.ThighRight.addChild(this.UpperLeRight);
            this.Hips.addChild(this.ThighRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Hips.addChild(this.ThighLeft);
            this.UpperArmLeft_1.addChild(this.ArmRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Mouth);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperLeRight.addChild(this.LowerLegRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(GuanacoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

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



