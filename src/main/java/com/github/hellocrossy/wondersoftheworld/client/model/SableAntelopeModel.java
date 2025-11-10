package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SableAntelopeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SableAntelopeModel extends ZawaBaseModel<SableAntelopeEntity> {
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

    public static class Adult extends SableAntelopeModel {

        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Hips;
        public ModelRenderer BellyFront2;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer BellyFront1;
        public ModelRenderer BellyRear;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Neck_1;
        public ModelRenderer Snout;
        public ModelRenderer HornLeft;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer HornRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Jaw;
        public ModelRenderer Mouth;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer Horn3Left_1;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer Horn3Right_1;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;


        public Adult() {
            texWidth = 128;
            texHeight = 128;
            this.BellyFront1 = new ModelRenderer(this, 53, 81);
            this.BellyFront1.setPos(0.0F, 0.1F, 6.0F);
            this.BellyFront1.addBox(-3.5F, -4.0F, 0.0F, 7.0F, 4.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BellyFront1, 0.7819074915776542F, 0.0F, 0.0F);
            this.HornRight = new ModelRenderer(this, 0, 90);
            this.HornRight.mirror = true;
            this.HornRight.setPos(-1.4F, -2.1F, -2.5F);
            this.HornRight.addBox(-1.0F, -6.25F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight, -0.02181661564992912F, 0.0F, -0.23457224414434488F);
            this.UpperLegRight = new ModelRenderer(this, 82, 37);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-1.5F, 8.0F, -1.0F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.31991885055898F, 0.0F, 0.0F);
            this.Horn4Left = new ModelRenderer(this, 0, 75);
            this.Horn4Left.setPos(0.0F, -5.0F, 0.0F);
            this.Horn4Left.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Left, -0.5654867042777737F, 0.0F, 0.0F);
            this.BellyFront2 = new ModelRenderer(this, 58, 102);
            this.BellyFront2.setPos(0.0F, 7.8F, -3.8F);
            this.BellyFront2.addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BellyFront2, -0.7740534966278743F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 20, 115);
            this.TopSnout.setPos(0.0F, 0.0F, -5.0F);
            this.TopSnout.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3839724354387525F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 53, 23);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.5F, 1.4F, -0.4F);
            this.ArmBaseRight.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.19146262360430985F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 57, 39);
            this.UpperArmLeft.setPos(0.0F, 7.0F, 1.5F);
            this.UpperArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06475171591477989F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 59, 68);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 5.7F, 1.0F);
            this.HandRight.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.2F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 1, 19);
            this.Body.setPos(0.0F, -5.3F, 2.8F);
            this.Body.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 11.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.06981317007977318F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 59, 68);
            this.HandLeft.setPos(-0.4F, 5.7F, 1.0F);
            this.HandLeft.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.2F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 0, 75);
            this.Horn3Left.setPos(0.0F, -4.5F, -0.5F);
            this.Horn3Left.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, -0.5654867042777737F, 0.0F, 0.0F);
            this.Horn3Right_1 = new ModelRenderer(this, 4, 75);
            this.Horn3Right_1.mirror = true;
            this.Horn3Right_1.setPos(0.0F, 0.0F, 0.0F);
            this.Horn3Right_1.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 59, 54);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 5.0F, -2.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.039968039204879874F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 103);
            this.Head.setPos(0.0F, -7.0F, -0.5F);
            this.Head.addBox(-2.5F, -2.5F, -4.5F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.8967501883168142F, 0.0F, 0.0F);
            this.HornLeft = new ModelRenderer(this, 0, 90);
            this.HornLeft.setPos(1.4F, -2.1F, -2.5F);
            this.HornLeft.addBox(-1.0F, -6.25F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft, -0.17819811729441132F, 0.0F, 0.23457224414434488F);
            this.Horn2Right = new ModelRenderer(this, 0, 84);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(0.0F, -5.5F, 0.0F);
            this.Horn2Right.addBox(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, -0.33091441019915835F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 53, 23);
            this.ArmBaseLeft.setPos(2.5F, 1.4F, -0.4F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.19146262360430985F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 114);
            this.Snout.setPos(0.0F, 0.2F, -3.3F);
            this.Snout.addBox(-2.0F, 0.0F, -5.5F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2539454094941263F, 0.0F, 0.0F);
            this.Horn3Left_1 = new ModelRenderer(this, 4, 75);
            this.Horn3Left_1.setPos(0.0F, 0.0F, 0.0F);
            this.Horn3Left_1.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Horn4Right = new ModelRenderer(this, 0, 75);
            this.Horn4Right.mirror = true;
            this.Horn4Right.setPos(0.0F, -5.0F, 0.0F);
            this.Horn4Right.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Right, -0.5654867042777737F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 85, 65);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 7.9F, -1.0F);
            this.FootRight.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.2F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 34, 1);
            this.NeckLower.setPos(0.0F, -6.0F, -2.4F);
            this.NeckLower.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 9.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3127630032889644F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 32, 92);
            this.Tail3.setPos(0.0F, 5.0F, 0.0F);
            this.Tail3.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 82, 37);
            this.UpperLegLeft.setPos(1.5F, 8.0F, -1.0F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.31991885055898F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 86, 50);
            this.LowerLegLeft.setPos(0.0F, 5.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.2300344007391748F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 3.9F, -8.1F);
            this.Chest.addBox(-4.0F, -5.0F, -3.5F, 8.0F, 10.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.08656833156470901F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 78, 17);
            this.ThighLeft.setPos(1.2F, 2.9F, 3.4F);
            this.ThighLeft.addBox(-0.5F, -1.0F, -2.5F, 4.0F, 9.0F, 6.0F, 0.0F, 0.0F, 0.1F);
            this.setRotateAngle(ThighLeft, 0.3436553390387473F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 8, 122);
            this.Mouth.setPos(0.0F, 1.2F, -3.1F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.03211405881926215F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 85, 65);
            this.FootLeft.setPos(0.0F, 7.9F, -1.0F);
            this.FootLeft.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.2F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 78, 17);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 2.9F, 3.4F);
            this.ThighRight.addBox(-3.5F, -1.0F, -2.5F, 4.0F, 9.0F, 6.0F, 0.0F, 0.0F, 0.1F);
            this.setRotateAngle(ThighRight, 0.3436553390387473F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 32, 99);
            this.Tail2.setPos(0.0F, 5.8F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.09581857193974705F, 0.0F, -0.0031415927784254694F);
            this.EarLeft = new ModelRenderer(this, 0, 23);
            this.EarLeft.setPos(1.8F, -0.6F, -0.8F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.7972664076373319F, 1.0471975511965976F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 86, 50);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 5.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.2300344007391748F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 23);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.8F, -0.6F, -0.8F);
            this.EarRight.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.7972664076373319F, -1.0471975511965976F, 0.0F);
            this.Neck = new ModelRenderer(this, 48, 0);
            this.Neck.setPos(0.0F, -1.9F, -0.7F);
            this.Neck.addBox(-2.0F, -8.5F, -3.5F, 4.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.1175342987466803F, 0.0F, 0.0F);
            this.Neck_1 = new ModelRenderer(this, 66, 0);
            this.Neck_1.setPos(0.0F, 0.0F, 2.0F);
            this.Neck_1.addBox(0.0F, -8.0F, -1.5F, 0.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck_1, 0.10070549750717768F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 20, 104);
            this.Jaw.setPos(0.0F, 0.9F, 0.0F);
            this.Jaw.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.038571777134864954F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 67);
            this.Tail1.setPos(0.0F, 0.0F, 8.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.4954989639885458F, 0.015009831816822585F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 59, 54);
            this.ArmLeft.setPos(0.5F, 5.0F, -2.5F);
            this.ArmLeft.addBox(-1.5F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.039968039204879874F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 43);
            this.Hips.setPos(0.0F, 0.0F, 12.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.41050144805854955F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 57, 39);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 7.0F, 1.5F);
            this.UpperArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06475171591477989F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 0, 84);
            this.Horn2Left.setPos(0.0F, -5.5F, 0.0F);
            this.Horn2Left.addBox(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, -0.33091441019915835F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 0, 75);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(0.0F, -4.5F, -0.5F);
            this.Horn3Right.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, -0.5654867042777737F, 0.0F, 0.0F);
            this.BellyRear = new ModelRenderer(this, 56, 94);
            this.BellyRear.setPos(0.0F, 0.0F, 9.0F);
            this.BellyRear.addBox(-2.5F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BellyRear, 0.5988224903277043F, 0.0F, 0.0F);
            this.BellyFront2.addChild(this.BellyFront1);
            this.Head.addChild(this.HornRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Horn3Left.addChild(this.Horn4Left);
            this.Body.addChild(this.BellyFront2);
            this.Snout.addChild(this.TopSnout);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Body);
            this.ArmLeft.addChild(this.HandLeft);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Horn3Right.addChild(this.Horn3Right_1);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.HornLeft);
            this.HornRight.addChild(this.Horn2Right);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.Snout);
            this.Horn3Left.addChild(this.Horn3Left_1);
            this.Horn3Right.addChild(this.Horn4Right);
            this.LowerLegRight.addChild(this.FootRight);
            this.Neck.addChild(this.NeckLower);
            this.Tail2.addChild(this.Tail3);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Jaw.addChild(this.Mouth);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighRight);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.EarLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.Neck);
            this.Neck.addChild(this.Neck_1);
            this.Snout.addChild(this.Jaw);
            this.Hips.addChild(this.Tail1);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Body.addChild(this.Hips);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.HornLeft.addChild(this.Horn2Left);
            this.Horn2Right.addChild(this.Horn3Right);
            this.BellyFront1.addChild(this.BellyRear);
            this.saveBase();

        }

        @Override
        public void setupAnim(SableAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.896F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.117F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.896F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.495F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.095F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.8f;
                float degree = 0.5f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 1.117F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.896F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.495F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.095F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 3.9F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.086F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.069F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.41F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.191F;
                this.UpperArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.064F;
                this.ArmLeft.xRot = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.039F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.191F;
                this.UpperArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.064F;
                this.ArmRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.039F;
                this.HandRight.xRot = MathHelper.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.343F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.319F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.23F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.343F;
                this.UpperLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.319F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.23F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.117F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.896F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.495F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.095F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 3.9F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.086F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.069F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.41F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.191F;
                this.UpperArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.064F;
                this.ArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.039F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.191F;
                this.UpperArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.064F;
                this.ArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.039F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.343F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.319F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.23F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.343F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.319F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.23F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends SableAntelopeModel {
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Body;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Head;
        public ModelRenderer Neck2;
        public ModelRenderer Mane;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;

        public Child() {
            texWidth = 64;
            texHeight = 64;
            this.Head = new ModelRenderer(this, 0, 48);
            this.Head.setPos(0.0F, 0.5F, -4.0F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8203047484373349F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 44, 10);
            this.UpperLegLeft.setPos(-0.1F, 5.0F, -1.7F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.46896998465826234F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 44, 0);
            this.ThighLeft.setPos(2.0F, 1.5F, 6.6F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.06091199106104967F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 11);
            this.EarLeft.setPos(1.8F, -0.7F, 0.3F);
            this.EarLeft.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.8600982340775168F, 0.6255260065779288F, 0.2738421523142173F);
            this.ForearmLeft = new ModelRenderer(this, 32, 13);
            this.ForearmLeft.setPos(-0.1F, 3.0F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.05200000127277612F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 12.0F, -5.0F);
            this.Chest.addBox(-2.5F, -3.5F, -1.5F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.17453292519943295F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 44, 10);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 5.0F, -1.7F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.46896998465826234F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 17, 0);
            this.Tail1.setPos(0.0F, 0.3F, 9.0F);
            this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.3521065928252958F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 32, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.6F, 0.0F, 0.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.2609267198442009F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 53, 19);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 4.0F, -1.3F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 20, 0);
            this.Tail2.setPos(0.0F, 0.0F, 2.0F);
            this.Tail2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.07853981633974483F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 53, 19);
            this.FootLeft.setPos(-0.1F, 4.0F, -1.3F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 32, 18);
            this.HandLeft.setPos(-0.1F, 2.0F, 0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 32, 8);
            this.ArmLeft.setPos(0.0F, 5.0F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.06999999915262065F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 1.5F, 6.6F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.06091199106104967F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 44, 17);
            this.LowerLegLeft.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3909537457888271F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 11);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.8F, -0.7F, 0.4F);
            this.EarRight.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.8600982340775168F, -0.6255260065779288F, -0.27366763203903305F);
            this.TopSnout = new ModelRenderer(this, 12, 57);
            this.TopSnout.setPos(0.0F, -1.4F, -0.5F);
            this.TopSnout.addBox(-1.0F, 0.0F, -2.9F, 2.0F, 1.0F, 3.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3909537457888271F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 11);
            this.Body.setPos(0.0F, -3.4F, 2.3F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.17453292519943295F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 12, 39);
            this.Neck2.setPos(0.0F, 3.2F, 1.4F);
            this.Neck2.addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.2602285888091934F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 56);
            this.Snout.setPos(0.0F, 0.2F, -0.6F);
            this.Snout.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.1563815016444822F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 32, 18);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 2.0F, 0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 32, 8);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 5.0F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.06999999915262065F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 44, 17);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3910000182127672F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 33);
            this.Neck.setPos(0.0F, -1.7F, -0.5F);
            this.Neck.addBox(-1.5F, -2.0F, -4.2F, 3.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.5729916253876715F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 32, 13);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(-0.1F, 3.0F, -2.0F);
            this.ForearmRight.addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.05200000127277612F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 60);
            this.Mouth.setPos(0.0F, 1.8F, -0.4F);
            this.Mouth.addBox(-1.0F, -1.0F, -2.4F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 32, 0);
            this.ArmBaseLeft.setPos(1.6F, 0.0F, 0.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.2609267198442009F, 0.0F, 0.0F);
            this.Mane = new ModelRenderer(this, 0, 26);
            this.Mane.setPos(0.0F, -1.8F, 1.8F);
            this.Mane.addBox(-0.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.Neck.addChild(this.Head);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Body.addChild(this.ThighLeft);
            this.Head.addChild(this.EarLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Body.addChild(this.Tail1);
            this.Chest.addChild(this.ArmBaseRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Tail1.addChild(this.Tail2);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Body.addChild(this.ThighRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.TopSnout);
            this.Chest.addChild(this.Body);
            this.Neck.addChild(this.Neck2);
            this.Head.addChild(this.Snout);
            this.ForearmRight.addChild(this.HandRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.Neck);
            this.ArmRight.addChild(this.ForearmRight);
            this.Snout.addChild(this.Mouth);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck.addChild(this.Mane);
            this.saveBase();

        }

        @Override
        public void setupAnim(SableAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.82F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.572F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.82F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.35F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.078F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.8f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.572F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.82F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.35F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.078F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 12.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.174F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.174F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.26F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.069F;
                this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.052F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.26F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.069F;
                this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.052F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.061F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.468F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.39F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.061F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.468F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.39F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}
