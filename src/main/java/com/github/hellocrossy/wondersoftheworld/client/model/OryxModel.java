package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.MouseDeerEntity;
import com.github.hellocrossy.wondersoftheworld.entity.OryxEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class OryxModel extends ZawaBaseModel<OryxEntity> {

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

    public static class Adult extends OryxModel {


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
        public ModelRenderer Horn2Left_1;
        public ModelRenderer Horn3Left_1;
        public ModelRenderer EarRight_1;
        public ModelRenderer EarLeft_1;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn2Right_1;
        public ModelRenderer Horn3Right_1;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Adult() {

            texWidth = 128;
            texHeight = 128;
            this.FootLeft = new ModelRenderer(this, 85, 65);
            this.FootLeft.setPos(0.0F, 6.9F, -1.0F);
            this.FootLeft.addBox(-1.1F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 103);
            this.Head.setPos(0.0F, -6.7F, 0.9F);
            this.Head.addBox(-2.5F, -2.5F, -4.5F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.9360200964866866F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 114);
            this.Snout.setPos(0.0F, 0.0F, -3.9F);
            this.Snout.addBox(-2.0F, 0.0F, -5.5F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.4494222823885398F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 59, 68);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 4.7F, 1.0F);
            this.HandRight.addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 8, 122);
            this.Mouth.setPos(0.0F, 1.4F, -3.1F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.34487706418882114F, 0.0F, 0.0F);
            this.EarRight_1 = new ModelRenderer(this, 0, 17);
            this.EarRight_1.mirror = true;
            this.EarRight_1.setPos(0.5F, -1.0F, 3.5F);
            this.EarRight_1.addBox(-1.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight_1, -0.5082398928281348F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 0, 122);
            this.Jaw.setPos(0.0F, 1.3F, 0.0F);
            this.Jaw.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.27314402127920984F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 0, 75);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(0.0F, -4.5F, -0.5F);
            this.Horn3Right.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, -0.17453292519943295F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 85, 49);
            this.LowerLegLeft.setPos(0.0F, 4.0F, 3.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.2300344007391748F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 85, 49);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 4.0F, 3.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.2300344007391748F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 43);
            this.Hips.setPos(0.0F, -9.0F, 14.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.23596852285911663F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 57, 39);
            this.UpperArmLeft.setPos(-1.0F, 7.0F, 1.0F);
            this.UpperArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.06475171591477989F, 0.0F, 0.0F);
            this.HornLeft = new ModelRenderer(this, 0, 90);
            this.HornLeft.setPos(1.4F, -2.1F, -2.5F);
            this.HornLeft.addBox(-1.0F, -5.25F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft, -0.7646287692671655F, 0.0F, 0.23457224414434488F);
            this.ArmBaseLeft = new ModelRenderer(this, 53, 23);
            this.ArmBaseLeft.setPos(4.0F, 2.2F, -1.4F);
            this.ArmBaseLeft.addBox(-3.0F, 0.0F, -3.0F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.5405284573584189F, 0.0F, 0.0F);
            this.Horn2Right_1 = new ModelRenderer(this, 8, 84);
            this.Horn2Right_1.mirror = true;
            this.Horn2Right_1.setPos(0.0F, 0.0F, 0.0F);
            this.Horn2Right_1.addBox(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right_1, -0.3490658503988659F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 78, 17);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 3.6F, 5.4F);
            this.ThighRight.addBox(-3.5F, 0.0F, -3.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.16912239719455752F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 4.9F, -8.1F);
            this.Chest.addBox(-4.0F, -5.0F, -4.5F, 8.0F, 11.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.4356341653188181F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 59, 54);
            this.ArmLeft.setPos(0.5F, 5.0F, -2.5F);
            this.ArmLeft.addBox(-1.5F, -1.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.039968039204879874F, 0.0F, 0.0F);
            this.Horn2Left_1 = new ModelRenderer(this, 8, 84);
            this.Horn2Left_1.setPos(0.0F, 0.0F, 0.0F);
            this.Horn2Left_1.addBox(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left_1, -0.3490658503988659F, 0.0F, 0.0F);
            this.BellyFront2 = new ModelRenderer(this, 58, 102);
            this.BellyFront2.setPos(0.0F, -1.2F, -3.8F);
            this.BellyFront2.addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BellyFront2, -0.7740534966278743F, 0.0F, 0.0F);
            this.BellyRear = new ModelRenderer(this, 56, 94);
            this.BellyRear.setPos(0.0F, 0.0F, 9.0F);
            this.BellyRear.addBox(-2.5F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BellyRear, 0.5988224903277043F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 59, 68);
            this.HandLeft.setPos(-0.4F, 4.7F, 1.0F);
            this.HandLeft.addBox(-1.2F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 32, 92);
            this.Tail3.setPos(0.0F, 5.0F, 0.0F);
            this.Tail3.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft_1 = new ModelRenderer(this, 0, 17);
            this.EarLeft_1.setPos(0.5F, -1.0F, 3.5F);
            this.EarLeft_1.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft_1, -0.5082398928281348F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 0, 84);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(0.0F, -5.5F, 0.0F);
            this.Horn2Right.addBox(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, -0.17453292519943295F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 0, 84);
            this.Horn2Left.setPos(0.0F, -5.5F, 0.0F);
            this.Horn2Left.addBox(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, -0.17453292519943295F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 57, 39);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-1.0F, 7.0F, 1.0F);
            this.UpperArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.06475171591477989F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 32, 99);
            this.Tail2.setPos(0.0F, 5.8F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.09581857193974705F, 0.0F, -0.0031415927784254694F);
            this.HornRight = new ModelRenderer(this, 0, 90);
            this.HornRight.mirror = true;
            this.HornRight.setPos(-1.4F, -2.1F, -2.5F);
            this.HornRight.addBox(-1.0F, -5.25F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight, -0.7646287692671655F, 0.0F, -0.23457224414434488F);
            this.TopSnout = new ModelRenderer(this, 20, 115);
            this.TopSnout.setPos(0.0F, 0.0F, -5.0F);
            this.TopSnout.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.34487706418882114F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 82, 36);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-1.5F, 7.0F, -3.0F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.31991885055898F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 23);
            this.EarLeft.setPos(1.8F, -0.6F, -0.8F);
            this.EarLeft.addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.5235987755982988F, 1.0471975511965976F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 59, 54);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 5.0F, -2.5F);
            this.ArmRight.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.039968039204879874F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 33, 0);
            this.NeckLower.setPos(0.0F, 1.8F, -5.4F);
            this.NeckLower.addBox(-1.5F, -10.0F, -1.0F, 3.0F, 11.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3909537457888271F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 78, 17);
            this.ThighLeft.setPos(1.2F, 3.6F, 5.4F);
            this.ThighLeft.addBox(-0.5F, 0.0F, -3.5F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.16912239719455752F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 48, 0);
            this.Neck.setPos(0.0F, -1.7F, -4.1F);
            this.Neck.addBox(-2.0F, -8.0F, -3.0F, 4.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.656492056983684F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 85, 65);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 6.9F, -1.0F);
            this.FootRight.addBox(-0.9F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 18);
            this.Body.setPos(0.0F, 4.2F, 1.8F);
            this.Body.addBox(-4.5F, -9.0F, 0.0F, 9.0F, 11.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.3790855015489435F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 67);
            this.Tail1.setPos(0.0F, 0.0F, 7.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.32096603878911284F, 0.015009831816822585F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 0, 75);
            this.Horn3Left.setPos(0.0F, -4.5F, -0.5F);
            this.Horn3Left.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, -0.17453292519943295F, 0.0F, 0.0F);
            this.Horn3Right_1 = new ModelRenderer(this, 8, 75);
            this.Horn3Right_1.mirror = true;
            this.Horn3Right_1.setPos(0.0F, -4.5F, -0.5F);
            this.Horn3Right_1.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right_1, -0.3490658503988659F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 53, 23);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.0F, 2.2F, -1.4F);
            this.ArmBaseRight.addBox(-3.0F, 0.0F, -3.0F, 4.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.5405284573584189F, 0.0F, 0.0F);
            this.BellyFront1 = new ModelRenderer(this, 53, 81);
            this.BellyFront1.setPos(0.0F, 0.1F, 6.0F);
            this.BellyFront1.addBox(-3.5F, -4.0F, 0.0F, 7.0F, 4.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BellyFront1, 0.7819074915776542F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 23);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.8F, -0.6F, -0.8F);
            this.EarRight.addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.5235987755982988F, -1.0471975511965976F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 82, 36);
            this.UpperLegLeft.setPos(1.5F, 7.0F, -3.0F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.31991885055898F, 0.0F, 0.0F);
            this.Horn3Left_1 = new ModelRenderer(this, 8, 75);
            this.Horn3Left_1.setPos(0.0F, -4.5F, -0.5F);
            this.Horn3Left_1.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left_1, -0.3490658503988659F, 0.0F, 0.0F);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.Snout);
            this.ArmRight.addChild(this.HandRight);
            this.Jaw.addChild(this.Mouth);
            this.EarRight.addChild(this.EarRight_1);
            this.Snout.addChild(this.Jaw);
            this.Horn2Right.addChild(this.Horn3Right);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Body.addChild(this.Hips);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Head.addChild(this.HornLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Horn2Right.addChild(this.Horn2Right_1);
            this.Hips.addChild(this.ThighRight);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Horn2Left.addChild(this.Horn2Left_1);
            this.Body.addChild(this.BellyFront2);
            this.BellyFront1.addChild(this.BellyRear);
            this.ArmLeft.addChild(this.HandLeft);
            this.Tail2.addChild(this.Tail3);
            this.EarLeft.addChild(this.EarLeft_1);
            this.HornRight.addChild(this.Horn2Right);
            this.HornLeft.addChild(this.Horn2Left);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.HornRight);
            this.Snout.addChild(this.TopSnout);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.EarLeft);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Neck.addChild(this.NeckLower);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.Neck);
            this.LowerLegRight.addChild(this.FootRight);
            this.Chest.addChild(this.Body);
            this.Hips.addChild(this.Tail1);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Horn2Right_1.addChild(this.Horn3Right_1);
            this.Chest.addChild(this.ArmBaseRight);
            this.BellyFront2.addChild(this.BellyFront1);
            this.Head.addChild(this.EarRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Horn2Left_1.addChild(this.Horn3Left_1);
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

        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Body;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer HornLeft;
        public ModelRenderer HornRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Jaw;
        public ModelRenderer Mouth;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Hips;
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

        public Child() {

            texWidth = 64;
            texHeight = 64;
            this.Body = new ModelRenderer(this, 0, 14);
            this.Body.setPos(0.0F, -4.3F, 1.4F);
            this.Body.addBox(-3.5F, -0.2F, -1.0F, 7.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2624975188341569F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 27, 35);
            this.Head.setPos(0.0F, 1.1F, -6.8F);
            this.Head.addBox(-2.0F, -3.5F, -2.5F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5112069538881057F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 30, 31);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.9F, 1.4F);
            this.HandRight.addBox(-0.98F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.03490658503988659F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 40, 17);
            this.UpperLegLeft.setPos(0.0F, 6.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.3885102954886794F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 40, 7);
            this.ThighLeft.setPos(2.5F, 3.9F, 2.6F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.04555309164612875F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 26, 11);
            this.ArmBaseLeft.setPos(3.0F, 2.1F, -0.3F);
            this.ArmBaseLeft.addBox(-2.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3642502295386026F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 30, 31);
            this.HandLeft.setPos(0.0F, 2.9F, 1.4F);
            this.HandLeft.addBox(-1.02F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.03490658503988659F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 28, 20);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-0.5F, 5.0F, 1.5F);
            this.ArmRight.addBox(-0.98F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 30, 0);
            this.Tail3.setPos(0.0F, 3.0F, 0.0F);
            this.Tail3.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 30, 26);
            this.ForearmLeft.setPos(-0.5F, 2.5F, -2.5F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 45);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.5F, -2.5F, 0.5F);
            this.EarRight.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.3520329114588368F, 0.0F, -1.1686724511564366F);
            this.TopSnout = new ModelRenderer(this, 29, 49);
            this.TopSnout.setPos(0.0F, 0.0F, -3.0F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3186971254089062F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 40, 7);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.5F, 3.9F, 2.6F);
            this.ThighRight.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.04555309164612875F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 45);
            this.EarLeft.setPos(1.5F, -2.5F, 0.5F);
            this.EarLeft.addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.3520329114588368F, 0.0F, 1.1686724511564366F);
            this.Tail2 = new ModelRenderer(this, 22, 0);
            this.Tail2.setPos(0.0F, 2.8F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.09581857193974705F, 0.0F, -0.0031415927784254694F);
            this.Jaw = new ModelRenderer(this, 32, 3);
            this.Jaw.setPos(0.0F, 1.2F, 2.1F);
            this.Jaw.addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.27314402127920984F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 28, 20);
            this.ArmLeft.setPos(-0.5F, 5.0F, 1.5F);
            this.ArmLeft.addBox(-2.02F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.HornLeft = new ModelRenderer(this, 0, 0);
            this.HornLeft.setPos(1.9F, -3.5F, -1.4F);
            this.HornLeft.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft, -0.3490658503988659F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 9.8F, -6.3F);
            this.Chest.addBox(-3.0F, -4.5F, -2.5F, 6.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2624975188341569F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 16, 45);
            this.Snout.setPos(0.0F, -1.1F, -2.8F);
            this.Snout.addBox(-1.5F, 0.0F, -3.5F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.3712315398886772F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 40, 24);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 4.0F, 3.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3536037104487928F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 40, 24);
            this.LowerLegLeft.setPos(0.0F, 4.0F, 2.7F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3536037104487928F, 0.0F, 0.0F);
            this.HornRight = new ModelRenderer(this, 0, 0);
            this.HornRight.mirror = true;
            this.HornRight.setPos(-1.9F, -3.5F, -1.4F);
            this.HornRight.addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight, -0.3490658503988659F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 31);
            this.Hips.setPos(0.0F, -0.2F, 6.0F);
            this.Hips.addBox(-4.0F, 0.0F, 0.0F, 8.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.04555309164612875F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 26, 11);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.0F, 2.1F, -0.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3642502295386026F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 21, 52);
            this.Mouth.setPos(0.0F, 1.4F, -3.1F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.2539454094941263F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 39, 30);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 3.5F, -1.5F);
            this.FootRight.addBox(-0.98F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 30, 26);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.5F, 2.5F, -2.5F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 42, 47);
            this.NeckLower.setPos(0.0F, 2.6F, -6.5F);
            this.NeckLower.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3513347637790725F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 39, 30);
            this.FootLeft.setPos(0.0F, 3.5F, -1.5F);
            this.FootLeft.addBox(-1.02F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 40, 17);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 6.0F, -2.0F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.3885102954886794F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 18, 0);
            this.Tail1.setPos(0.0F, 0.0F, 5.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.32096603878911284F, 0.015009831816822585F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 45);
            this.Neck.setPos(0.0F, -1.8F, -0.5F);
            this.Neck.addBox(-1.5F, -2.5F, -7.0F, 3.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.12007865453458068F, 0.0F, 0.0F);
            this.Chest.addChild(this.Body);
            this.Neck.addChild(this.Head);
            this.ForearmRight.addChild(this.HandRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Tail2.addChild(this.Tail3);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.TopSnout);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.EarLeft);
            this.Tail1.addChild(this.Tail2);
            this.Snout.addChild(this.Jaw);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.HornLeft);
            this.Head.addChild(this.Snout);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.HornRight);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmBaseRight);
            this.Jaw.addChild(this.Mouth);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Neck.addChild(this.NeckLower);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Hips.addChild(this.Tail1);
            this.Chest.addChild(this.Neck);
            this.saveBase();

        }

        @Override
        public void setupAnim(OryxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
            }
        }
    }
}


