package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.CaimanEntity;
import com.github.hellocrossy.wondersoftheworld.entity.MargayEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class CaimanModel extends ZawaBaseModel<CaimanEntity> {
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

    public static class Adult extends CaimanModel {


        public ModelRenderer Spine1;
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Spine2R;
        public ModelRenderer Spine2L;
        public ModelRenderer Spine2C;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer Spine3L;
        public ModelRenderer Spine2R_1;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail2;
        public ModelRenderer Spine4R;
        public ModelRenderer Spine4L;
        public ModelRenderer Tail3;
        public ModelRenderer Tail2_1;
        public ModelRenderer Tail3_1;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LowerNeck;
        public ModelRenderer Head;
        public ModelRenderer LowerNeck2;
        public ModelRenderer UpperJaw1;
        public ModelRenderer RightEye;
        public ModelRenderer LeftEye;
        public ModelRenderer LowerJaw1;
        public ModelRenderer HeadTop2;
        public ModelRenderer HeadTop1;
        public ModelRenderer NoseBridge;
        public ModelRenderer UpperJaw2;
        public ModelRenderer TeethTop1;
        public ModelRenderer Nose;
        public ModelRenderer TeethTop2;
        public ModelRenderer LowerJaw2;
        public ModelRenderer TeethLower1;
        public ModelRenderer TeethLower2;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 48;
            this.TeethTop1 = new ModelRenderer(this, 0, 37);
            this.TeethTop1.setPos(0.0F, 1.0F, 0.0F);
            this.TeethTop1.addBox(-2.0F, -0.4F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 31, 34);
            this.Tail2.setPos(0.0F, 0.2F, 4.2F);
            this.Tail2.addBox(-1.5F, -1.5F, -0.2F, 3.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.2694788291842315F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 48, 25);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.9F, 3.3F, 2.6F);
            this.ThighRight.addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.0F, -0.8726646259971648F, -0.06981317007977318F);
            this.ArmRight = new ModelRenderer(this, 20, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-3.0F, -0.5F, 0.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.6283185307179586F, -0.2530727415391778F, 0.08168140599727838F);
            this.RightEye = new ModelRenderer(this, 54, 9);
            this.RightEye.mirror = true;
            this.RightEye.setPos(-1.5F, -0.13F, -1.92F);
            this.RightEye.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEye, 0.27366763203903305F, -0.10471975511965977F, -0.12217304763960307F);
            this.Hips = new ModelRenderer(this, 0, 0);
            this.Hips.setPos(0.0F, 0.0F, 7.5F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.08726646259971647F, 0.0F, 0.0F);
            this.UpperJaw2 = new ModelRenderer(this, 52, 6);
            this.UpperJaw2.setPos(0.0F, 0.0F, -2.9F);
            this.UpperJaw2.addBox(-1.5F, -0.4F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperJaw2, -0.1563815016444822F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 57, 1);
            this.Nose.setPos(0.0F, 0.5F, -2.1F);
            this.Nose.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.2087413792043121F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 48, 25);
            this.ThighLeft.setPos(1.9F, 3.3F, 2.6F);
            this.ThighLeft.addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.0F, 0.8726646259971648F, 0.06981317007977318F);
            this.TeethLower1 = new ModelRenderer(this, 11, 36);
            this.TeethLower1.setPos(0.0F, -1.0F, 0.0F);
            this.TeethLower1.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2_1 = new ModelRenderer(this, 31, 38);
            this.Tail2_1.setPos(0.0F, -1.5F, -0.2F);
            this.Tail2_1.addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Spine2R_1 = new ModelRenderer(this, 0, 32);
            this.Spine2R_1.setPos(-2.0F, -0.1F, -0.1F);
            this.Spine2R_1.addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Spine1 = new ModelRenderer(this, 0, 32);
            this.Spine1.setPos(0.0F, -1.8F, 0.4F);
            this.Spine1.addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.LowerNeck = new ModelRenderer(this, 48, 1);
            this.LowerNeck.setPos(0.0F, -0.3F, 0.7F);
            this.LowerNeck.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerNeck, -0.03909537541112055F, 0.0F, 0.0F);
            this.Spine2L = new ModelRenderer(this, 19, 32);
            this.Spine2L.setPos(2.5F, -0.3F, 3.5F);
            this.Spine2L.addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 42, 9);
            this.Neck.setPos(0.0F, 0.1F, -1.3F);
            this.Neck.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.17453292519943295F, 0.0F, 0.0F);
            this.Spine4R = new ModelRenderer(this, 8, 38);
            this.Spine4R.setPos(-1.5F, -2.0F, 0.0F);
            this.Spine4R.addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 27);
            this.FootLeft.setPos(0.0F, 0.5F, 3.0F);
            this.FootLeft.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.6876597519173767F, -0.27366763203903305F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 48, 21);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-2.0F, 0.7F, -0.4F);
            this.UpperArmRight.addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.1748819990393151F, 0.8203047484373349F, -0.41887902047863906F);
            this.LegLeft = new ModelRenderer(this, 27, 26);
            this.LegLeft.setPos(2.5F, -0.1F, -0.1F);
            this.LegLeft.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.5654867042777737F, -0.8168140766175408F, -0.3141592653589793F);
            this.LowerNeck2 = new ModelRenderer(this, 14, 0);
            this.LowerNeck2.setPos(0.0F, 2.0F, -3.0F);
            this.LowerNeck2.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerNeck2, -0.23457224414434488F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 46, 39);
            this.Tail1.setPos(0.0F, 2.21F, 3.8F);
            this.Tail1.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3001966446588301F, 0.0F, 0.0F);
            this.NoseBridge = new ModelRenderer(this, 30, 0);
            this.NoseBridge.setPos(0.0F, -1.3F, -0.3F);
            this.NoseBridge.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NoseBridge, 0.5295328977182406F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 30, 22);
            this.HandRight.setPos(-0.2F, 1.5F, -2.7F);
            this.HandRight.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.8028514559173915F, -0.017453292519943295F, 0.6646214111173737F);
            this.Spine2R = new ModelRenderer(this, 19, 32);
            this.Spine2R.setPos(-2.5F, -0.3F, 3.5F);
            this.Spine2R.addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.Spine2C = new ModelRenderer(this, 19, 36);
            this.Spine2C.setPos(0.0F, -0.3F, 3.2F);
            this.Spine2C.addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.LowerJaw1 = new ModelRenderer(this, 11, 20);
            this.LowerJaw1.setPos(0.0F, 1.1F, -2.0F);
            this.LowerJaw1.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerJaw1, -0.02792526844802819F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 0, 27);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 0.5F, 3.0F);
            this.FootRight.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.6876597519173767F, 0.27366763203903305F, 0.0F);
            this.Tail3_1 = new ModelRenderer(this, 0, 15);
            this.Tail3_1.setPos(0.0F, -1.2F, 0.0F);
            this.Tail3_1.addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.HeadTop1 = new ModelRenderer(this, 20, 0);
            this.HeadTop1.setPos(0.1F, -0.5F, -1.6F);
            this.HeadTop1.addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadTop1, 0.11728612207217244F, 0.1956514098143546F, 0.0F);
            this.Spine3L = new ModelRenderer(this, 0, 32);
            this.Spine3L.setPos(2.0F, 0.1F, -0.1F);
            this.Spine3L.addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 0, 8);
            this.Tail3.setPos(0.0F, 0.5F, 6.5F);
            this.Tail3.addBox(-1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.13473941459211575F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 50, 29);
            this.Head.setPos(0.0F, -1.04F, -2.95F);
            this.Head.addBox(-1.5F, -0.9F, -2.7F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.4886921905584123F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 22, 9);
            this.Body.setPos(0.0F, -2.1F, 0.8F);
            this.Body.addBox(-3.0F, -0.5F, -0.3F, 6.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.15707963267948966F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 20, 22);
            this.ArmLeft.setPos(3.0F, -0.5F, 0.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.6283185307179586F, 0.2530727415391778F, -0.08168140599727838F);
            this.LegRight = new ModelRenderer(this, 27, 26);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-2.5F, -0.1F, -0.1F);
            this.LegRight.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.5654867042777737F, 0.8168140766175408F, 0.3141592653589793F);
            this.TeethTop2 = new ModelRenderer(this, 0, 41);
            this.TeethTop2.setPos(0.0F, 1.0F, -0.2F);
            this.TeethTop2.addBox(-1.5F, -0.4F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.TeethLower2 = new ModelRenderer(this, 0, 44);
            this.TeethLower2.setPos(0.0F, -1.0F, -0.2F);
            this.TeethLower2.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LowerJaw2 = new ModelRenderer(this, 0, 12);
            this.LowerJaw2.setPos(0.0F, 1.0F, -3.0F);
            this.LowerJaw2.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerJaw2, -0.11728612207217244F, 0.0F, 0.0F);
            this.LeftEye = new ModelRenderer(this, 54, 9);
            this.LeftEye.setPos(1.5F, -0.13F, -1.92F);
            this.LeftEye.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEye, 0.27366763203903305F, 0.10471975511965977F, 0.12217304763960307F);
            this.Spine4L = new ModelRenderer(this, 8, 38);
            this.Spine4L.setPos(1.5F, -2.0F, 0.0F);
            this.Spine4L.addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 30, 22);
            this.HandLeft.setPos(0.2F, 1.5F, -2.7F);
            this.HandLeft.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.8028514559173915F, 0.017453292519943295F, -0.6646214111173737F);
            this.UpperJaw1 = new ModelRenderer(this, 0, 19);
            this.UpperJaw1.setPos(0.0F, 0.5F, -2.1F);
            this.UpperJaw1.addBox(-2.0F, -0.4F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperJaw1, 0.03490658503988659F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 13, 8);
            this.Chest.setPos(0.0F, 19.4F, -3.9F);
            this.Chest.addBox(-2.5F, -2.0F, -1.5F, 5.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.17453292519943295F, 0.0F, 0.0F);
            this.HeadTop2 = new ModelRenderer(this, 20, 0);
            this.HeadTop2.setPos(-0.1F, -0.5F, -1.6F);
            this.HeadTop2.addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadTop2, 0.11728612207217244F, -0.1956514098143546F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 48, 21);
            this.UpperArmLeft.setPos(2.0F, 0.7F, -0.4F);
            this.UpperArmLeft.addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.1748819990393151F, -0.8203047484373349F, 0.41887902047863906F);
            this.UpperJaw1.addChild(this.TeethTop1);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.ThighRight);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Head.addChild(this.RightEye);
            this.Body.addChild(this.Hips);
            this.UpperJaw1.addChild(this.UpperJaw2);
            this.UpperJaw2.addChild(this.Nose);
            this.Hips.addChild(this.ThighLeft);
            this.LowerJaw1.addChild(this.TeethLower1);
            this.Tail2.addChild(this.Tail2_1);
            this.Hips.addChild(this.Spine2R_1);
            this.Chest.addChild(this.Spine1);
            this.Neck.addChild(this.LowerNeck);
            this.Body.addChild(this.Spine2L);
            this.Chest.addChild(this.Neck);
            this.Tail1.addChild(this.Spine4R);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.UpperArmRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.LowerNeck.addChild(this.LowerNeck2);
            this.Hips.addChild(this.Tail1);
            this.UpperJaw1.addChild(this.NoseBridge);
            this.ArmRight.addChild(this.HandRight);
            this.Body.addChild(this.Spine2R);
            this.Body.addChild(this.Spine2C);
            this.Head.addChild(this.LowerJaw1);
            this.LegRight.addChild(this.FootRight);
            this.Tail3.addChild(this.Tail3_1);
            this.Head.addChild(this.HeadTop1);
            this.Hips.addChild(this.Spine3L);
            this.Tail2.addChild(this.Tail3);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Body);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.LegRight);
            this.UpperJaw2.addChild(this.TeethTop2);
            this.LowerJaw2.addChild(this.TeethLower2);
            this.LowerJaw1.addChild(this.LowerJaw2);
            this.Head.addChild(this.LeftEye);
            this.Tail1.addChild(this.Spine4L);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.UpperJaw1);
            this.Head.addChild(this.HeadTop2);
            this.Chest.addChild(this.UpperArmLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(CaimanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.174F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.488F;
            this.Tail1.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = MathHelper.cos(0.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail3.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.3F * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.2F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 0.7F;
                this.Neck.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.174F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.488F;

                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.157F;
                this.Body.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F;
                this.Chest.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount * 0.5F;
                this.Hips.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;

                this.UpperArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F + 0.174F;
                this.UpperArmLeft.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F - 0.82F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.628F;
                this.ArmLeft.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.253F;
                this.HandLeft.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F -0.664F;
                this.UpperArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F + 0.174F;
                this.UpperArmRight.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F + 0.82F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.628F;
                this.ArmRight.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.253F;
                this.HandRight.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.664F;

                this.ThighLeft.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighLeft.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount * 0.5F + 0.069F;
                this.ThighLeft.y = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 3.3F;
                this.LegLeft.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.314F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.687F;
                this.ThighRight.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount * 0.5F - 0.069F;
                this.ThighRight.y = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 3.3F;
                this.LegRight.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.314F;
                this.FootRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.687F;

                this.Tail1.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * -1.9F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = MathHelper.cos(0.0F + limbSwing * speed * 0.1F) * degree * -2.1F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 1.9F * limbSwingAmount * 0.5F;

            } else {
                this.Neck.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.9F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.174F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.9F) * degree * -0.05F * limbSwingAmount * 0.5F + 0.488F;

                this.Body.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;
                this.Chest.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -0.9F * limbSwingAmount * 0.5F;
                this.Hips.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;

                this.ThighLeft.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F + 0.872F;
                this.ThighLeft.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.069F;
                this.ThighLeft.z = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * -15.0F * limbSwingAmount * 0.5F + 2.6F;
                this.LegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.565F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.687F;
                this.FootLeft.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.0F;
                this.ThighRight.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.069F;
                this.ThighRight.z = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * 15.0F * limbSwingAmount * 0.5F + 2.6F;
                this.LegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F -0.565F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F -0.687F;
                this.FootRight.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.0F;

                this.UpperArmLeft.z = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmLeft.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.82F;
                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F -0.664F;
                this.UpperArmRight.z = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmRight.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.82F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.802F;

                this.Tail1.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.45F) * degree * -1.1F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -1.5F * limbSwingAmount * 0.5F;
            }
        }
    }

    public static class Child extends CaimanModel {

        public ModelRenderer Spine1;
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer Spine2R;
        public ModelRenderer Spine2L;
        public ModelRenderer Spine2C;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer Spine3L;
        public ModelRenderer Spine2R_1;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail2;
        public ModelRenderer Spine4R;
        public ModelRenderer Spine4L;
        public ModelRenderer Tail3;
        public ModelRenderer Tail2_1;
        public ModelRenderer Tail3_1;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LowerNeck;
        public ModelRenderer Head;
        public ModelRenderer LowerNeck2;
        public ModelRenderer UpperJaw1;
        public ModelRenderer RightEye;
        public ModelRenderer LeftEye;
        public ModelRenderer LowerJaw1;
        public ModelRenderer HeadTop2;
        public ModelRenderer HeadTop1;
        public ModelRenderer NoseBridge;
        public ModelRenderer UpperJaw2;
        public ModelRenderer TeethTop1;
        public ModelRenderer Nose;
        public ModelRenderer TeethTop2;
        public ModelRenderer LowerJaw2;
        public ModelRenderer TeethLower1;
        public ModelRenderer TeethLower2;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 48;
            this.TeethTop1 = new ModelRenderer(this, 0, 37);
            this.TeethTop1.setPos(0.0F, 1.0F, 0.0F);
            this.TeethTop1.addBox(-2.0F, -0.4F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 31, 34);
            this.Tail2.setPos(0.0F, 0.2F, 4.2F);
            this.Tail2.addBox(-1.5F, -1.5F, -0.2F, 3.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.2694788291842315F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 48, 25);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.9F, 3.3F, 2.6F);
            this.ThighRight.addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.0F, -0.8726646259971648F, -0.06981317007977318F);
            this.ArmRight = new ModelRenderer(this, 20, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-3.0F, -0.5F, 0.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.6283185307179586F, -0.2530727415391778F, 0.08168140599727838F);
            this.RightEye = new ModelRenderer(this, 54, 9);
            this.RightEye.mirror = true;
            this.RightEye.setPos(-1.5F, -0.13F, -1.92F);
            this.RightEye.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEye, 0.27366763203903305F, -0.10471975511965977F, -0.12217304763960307F);
            this.Hips = new ModelRenderer(this, 0, 0);
            this.Hips.setPos(0.0F, 0.0F, 7.5F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.08726646259971647F, 0.0F, 0.0F);
            this.UpperJaw2 = new ModelRenderer(this, 52, 6);
            this.UpperJaw2.setPos(0.0F, 0.0F, -2.9F);
            this.UpperJaw2.addBox(-1.5F, -0.4F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperJaw2, -0.1563815016444822F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 57, 1);
            this.Nose.setPos(0.0F, 0.5F, -2.1F);
            this.Nose.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.2087413792043121F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 48, 25);
            this.ThighLeft.setPos(1.9F, 3.3F, 2.6F);
            this.ThighLeft.addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.0F, 0.8726646259971648F, 0.06981317007977318F);
            this.TeethLower1 = new ModelRenderer(this, 11, 36);
            this.TeethLower1.setPos(0.0F, -1.0F, 0.0F);
            this.TeethLower1.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2_1 = new ModelRenderer(this, 31, 38);
            this.Tail2_1.setPos(0.0F, -1.5F, -0.2F);
            this.Tail2_1.addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Spine2R_1 = new ModelRenderer(this, 0, 32);
            this.Spine2R_1.setPos(-2.0F, -0.1F, -0.1F);
            this.Spine2R_1.addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Spine1 = new ModelRenderer(this, 0, 32);
            this.Spine1.setPos(0.0F, -1.8F, 0.4F);
            this.Spine1.addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.LowerNeck = new ModelRenderer(this, 48, 1);
            this.LowerNeck.setPos(0.0F, -0.3F, 0.7F);
            this.LowerNeck.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerNeck, -0.03909537541112055F, 0.0F, 0.0F);
            this.Spine2L = new ModelRenderer(this, 19, 32);
            this.Spine2L.setPos(2.5F, -0.3F, 3.5F);
            this.Spine2L.addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 42, 9);
            this.Neck.setPos(0.0F, 0.1F, -1.3F);
            this.Neck.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.17453292519943295F, 0.0F, 0.0F);
            this.Spine4R = new ModelRenderer(this, 8, 38);
            this.Spine4R.setPos(-1.5F, -2.0F, 0.0F);
            this.Spine4R.addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 27);
            this.FootLeft.setPos(0.0F, 0.5F, 3.0F);
            this.FootLeft.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.6876597519173767F, -0.27366763203903305F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 48, 21);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(-2.0F, 0.7F, -0.4F);
            this.UpperArmRight.addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, 0.1748819990393151F, 0.8203047484373349F, -0.41887902047863906F);
            this.LegLeft = new ModelRenderer(this, 27, 26);
            this.LegLeft.setPos(2.5F, -0.1F, -0.1F);
            this.LegLeft.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.5654867042777737F, -0.8168140766175408F, -0.3141592653589793F);
            this.LowerNeck2 = new ModelRenderer(this, 14, 0);
            this.LowerNeck2.setPos(0.0F, 2.0F, -3.0F);
            this.LowerNeck2.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerNeck2, -0.23457224414434488F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 46, 39);
            this.Tail1.setPos(0.0F, 2.21F, 3.8F);
            this.Tail1.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.3001966446588301F, 0.0F, 0.0F);
            this.NoseBridge = new ModelRenderer(this, 30, 0);
            this.NoseBridge.setPos(0.0F, -1.3F, -0.3F);
            this.NoseBridge.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NoseBridge, 0.5295328977182406F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 30, 22);
            this.HandRight.setPos(-0.2F, 1.5F, -2.7F);
            this.HandRight.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.8028514559173915F, -0.017453292519943295F, 0.6646214111173737F);
            this.Spine2R = new ModelRenderer(this, 19, 32);
            this.Spine2R.setPos(-2.5F, -0.3F, 3.5F);
            this.Spine2R.addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.Spine2C = new ModelRenderer(this, 19, 36);
            this.Spine2C.setPos(0.0F, -0.3F, 3.2F);
            this.Spine2C.addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.LowerJaw1 = new ModelRenderer(this, 11, 20);
            this.LowerJaw1.setPos(0.0F, 1.1F, -2.0F);
            this.LowerJaw1.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerJaw1, -0.02792526844802819F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 0, 27);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 0.5F, 3.0F);
            this.FootRight.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.6876597519173767F, 0.27366763203903305F, 0.0F);
            this.Tail3_1 = new ModelRenderer(this, 0, 15);
            this.Tail3_1.setPos(0.0F, -1.2F, 0.0F);
            this.Tail3_1.addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.HeadTop1 = new ModelRenderer(this, 20, 0);
            this.HeadTop1.setPos(0.1F, -0.5F, -1.6F);
            this.HeadTop1.addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadTop1, 0.11728612207217244F, 0.1956514098143546F, 0.0F);
            this.Spine3L = new ModelRenderer(this, 0, 32);
            this.Spine3L.setPos(2.0F, 0.1F, -0.1F);
            this.Spine3L.addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 0, 8);
            this.Tail3.setPos(0.0F, 0.5F, 6.5F);
            this.Tail3.addBox(-1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.13473941459211575F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 50, 29);
            this.Head.setPos(0.0F, -1.04F, -2.95F);
            this.Head.addBox(-1.5F, -0.9F, -2.7F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.4886921905584123F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 22, 9);
            this.Body.setPos(0.0F, -2.1F, 0.8F);
            this.Body.addBox(-3.0F, -0.5F, -0.3F, 6.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.15707963267948966F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 20, 22);
            this.ArmLeft.setPos(3.0F, -0.5F, 0.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.6283185307179586F, 0.2530727415391778F, -0.08168140599727838F);
            this.LegRight = new ModelRenderer(this, 27, 26);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-2.5F, -0.1F, -0.1F);
            this.LegRight.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.5654867042777737F, 0.8168140766175408F, 0.3141592653589793F);
            this.TeethTop2 = new ModelRenderer(this, 0, 41);
            this.TeethTop2.setPos(0.0F, 1.0F, -0.2F);
            this.TeethTop2.addBox(-1.5F, -0.4F, -2.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.TeethLower2 = new ModelRenderer(this, 0, 44);
            this.TeethLower2.setPos(0.0F, -1.0F, -0.2F);
            this.TeethLower2.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LowerJaw2 = new ModelRenderer(this, 0, 12);
            this.LowerJaw2.setPos(0.0F, 1.0F, -3.0F);
            this.LowerJaw2.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerJaw2, -0.11728612207217244F, 0.0F, 0.0F);
            this.LeftEye = new ModelRenderer(this, 54, 9);
            this.LeftEye.setPos(1.5F, -0.13F, -1.92F);
            this.LeftEye.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEye, 0.27366763203903305F, 0.10471975511965977F, 0.12217304763960307F);
            this.Spine4L = new ModelRenderer(this, 8, 38);
            this.Spine4L.setPos(1.5F, -2.0F, 0.0F);
            this.Spine4L.addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 30, 22);
            this.HandLeft.setPos(0.2F, 1.5F, -2.7F);
            this.HandLeft.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.8028514559173915F, 0.017453292519943295F, -0.6646214111173737F);
            this.UpperJaw1 = new ModelRenderer(this, 0, 19);
            this.UpperJaw1.setPos(0.0F, 0.5F, -2.1F);
            this.UpperJaw1.addBox(-2.0F, -0.4F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperJaw1, 0.03490658503988659F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 13, 8);
            this.Chest.setPos(0.0F, 19.4F, -3.9F);
            this.Chest.addBox(-2.5F, -2.0F, -1.5F, 5.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.17453292519943295F, 0.0F, 0.0F);
            this.HeadTop2 = new ModelRenderer(this, 20, 0);
            this.HeadTop2.setPos(-0.1F, -0.5F, -1.6F);
            this.HeadTop2.addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HeadTop2, 0.11728612207217244F, -0.1956514098143546F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 48, 21);
            this.UpperArmLeft.setPos(2.0F, 0.7F, -0.4F);
            this.UpperArmLeft.addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, 0.1748819990393151F, -0.8203047484373349F, 0.41887902047863906F);
            this.UpperJaw1.addChild(this.TeethTop1);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.ThighRight);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Head.addChild(this.RightEye);
            this.Body.addChild(this.Hips);
            this.UpperJaw1.addChild(this.UpperJaw2);
            this.UpperJaw2.addChild(this.Nose);
            this.Hips.addChild(this.ThighLeft);
            this.LowerJaw1.addChild(this.TeethLower1);
            this.Tail2.addChild(this.Tail2_1);
            this.Hips.addChild(this.Spine2R_1);
            this.Chest.addChild(this.Spine1);
            this.Neck.addChild(this.LowerNeck);
            this.Body.addChild(this.Spine2L);
            this.Chest.addChild(this.Neck);
            this.Tail1.addChild(this.Spine4R);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.UpperArmRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.LowerNeck.addChild(this.LowerNeck2);
            this.Hips.addChild(this.Tail1);
            this.UpperJaw1.addChild(this.NoseBridge);
            this.ArmRight.addChild(this.HandRight);
            this.Body.addChild(this.Spine2R);
            this.Body.addChild(this.Spine2C);
            this.Head.addChild(this.LowerJaw1);
            this.LegRight.addChild(this.FootRight);
            this.Tail3.addChild(this.Tail3_1);
            this.Head.addChild(this.HeadTop1);
            this.Hips.addChild(this.Spine3L);
            this.Tail2.addChild(this.Tail3);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Body);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.LegRight);
            this.UpperJaw2.addChild(this.TeethTop2);
            this.LowerJaw2.addChild(this.TeethLower2);
            this.LowerJaw1.addChild(this.LowerJaw2);
            this.Head.addChild(this.LeftEye);
            this.Tail1.addChild(this.Spine4L);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.UpperJaw1);
            this.Head.addChild(this.HeadTop2);
            this.Chest.addChild(this.UpperArmLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(CaimanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians((double) netHeadYaw) * 0.5F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.174F;
            this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.488F;
            this.Tail1.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = MathHelper.cos(0.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail3.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.3F * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            limbSwing *= 2.0F;
            limbSwingAmount = 0.15F;
            float speed = 1.2F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 0.7F;
                this.Neck.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.174F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.488F;

                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.157F;
                this.Body.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F;
                this.Chest.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount * 0.5F;
                this.Hips.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;

                this.UpperArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F + 0.174F;
                this.UpperArmLeft.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F - 0.82F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.628F;
                this.ArmLeft.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.253F;
                this.HandLeft.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F -0.664F;
                this.UpperArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F + 0.174F;
                this.UpperArmRight.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F + 0.82F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.628F;
                this.ArmRight.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.253F;
                this.HandRight.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.664F;

                this.ThighLeft.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighLeft.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount * 0.5F + 0.069F;
                this.ThighLeft.y = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 3.3F;
                this.LegLeft.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.314F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.687F;
                this.ThighRight.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount * 0.5F - 0.069F;
                this.ThighRight.y = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 3.3F;
                this.LegRight.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.314F;
                this.FootRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.687F;

                this.Tail1.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * -1.9F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = MathHelper.cos(0.0F + limbSwing * speed * 0.1F) * degree * -2.1F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * degree * 1.9F * limbSwingAmount * 0.5F;

            } else {
                this.Neck.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.9F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.174F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.9F) * degree * -0.05F * limbSwingAmount * 0.5F + 0.488F;

                this.Body.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;
                this.Chest.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -0.9F * limbSwingAmount * 0.5F;
                this.Hips.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;

                this.ThighLeft.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F + 0.872F;
                this.ThighLeft.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.069F;
                this.ThighLeft.z = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * -15.0F * limbSwingAmount * 0.5F + 2.6F;
                this.LegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.565F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.687F;
                this.FootLeft.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.0F;
                this.ThighRight.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.069F;
                this.ThighRight.z = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * 15.0F * limbSwingAmount * 0.5F + 2.6F;
                this.LegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F -0.565F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F -0.687F;
                this.FootRight.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.0F;

                this.UpperArmLeft.z = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmLeft.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.82F;
                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F -0.664F;
                this.UpperArmRight.z = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmRight.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.82F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.802F;

                this.Tail1.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.45F) * degree * -1.1F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.45F) * degree * -1.5F * limbSwingAmount * 0.5F;
            }
        }
    }}