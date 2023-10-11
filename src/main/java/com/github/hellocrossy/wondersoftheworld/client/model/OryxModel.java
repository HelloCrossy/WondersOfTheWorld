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

    public static class oryxOne extends OryxModel {


        public ModelRenderer Body;
        public ModelRenderer Neck1;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Mane3;
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
        public ModelRenderer part26;
        public ModelRenderer NeckUpper;
        public ModelRenderer Mane2;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Mane1;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer LeftEar;
        public ModelRenderer RightEar;
        public ModelRenderer Horn1Left;
        public ModelRenderer Horn1Right;
        public ModelRenderer TopSnout;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public oryxOne() {

            texWidth = 64;
            texHeight = 64;
            this.FootRight = new ModelRenderer(this, 52, 49);
            this.FootRight.setPos(0.1F, 7.0F, -1.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 44, 40);
            this.ArmBaseLeft.setPos(2.0F, 2.0F, -1.8F);
            this.ArmBaseLeft.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.40142572795869574F, 0.0F, 0.0F);
            this.Mane2 = new ModelRenderer(this, 40, 27);
            this.Mane2.setPos(0.0F, 0.7F, -4.0F);
            this.Mane2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.1F, 0.0F, 0.0F);
            this.Mane1 = new ModelRenderer(this, 36, 44);
            this.Mane1.setPos(0.0F, -0.7F, -6.5F);
            this.Mane1.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 31, 22);
            this.Tail1.setPos(0.0F, 0.5F, 5.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.4363323129985824F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 47, 33);
            this.Head.setPos(0.0F, 0.8F, -6.5F);
            this.Head.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5235987755982988F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 23, 50);
            this.Horn2Left.setPos(0.0F, -4.9F, 0.0F);
            this.Horn2Left.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, -0.4363323129985824F, 0.05235987755982988F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 26, 0);
            this.ArmLeft.setPos(0.0F, 4.0F, 1.7F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.10471975511965977F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -5.8F, 3.6F);
            this.Body.addBox(-3.5F, 0.0F, -4.5F, 7.0F, 10.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.3490658503988659F, 0.0F, 0.0F);
            this.part26 = new ModelRenderer(this, 19, 22);
            this.part26.setPos(0.0F, 5.0F, 0.0F);
            this.part26.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 60, 19);
            this.Horn3Left.setPos(0.0F, -4.9F, 0.0F);
            this.Horn3Left.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.1F, 0.0F, -0.1F);
            this.setRotateAngle(Horn3Left, -0.4363323129985824F, 0.05235987755982988F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 34, 50);
            this.ForearmRight.setPos(0.0F, 4.7F, -2.7F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 40, 14);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.5F, 3.5F, 2.4F);
            this.ThighRight.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.296705972839036F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 53, 14);
            this.HandRight.setPos(0.1F, 6.0F, 0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 26, 22);
            this.NeckLower.setPos(0.0F, -1.2F, -5.0F);
            this.NeckLower.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3490658503988659F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 1, 23);
            this.Chest.setPos(0.0F, 6.3F, 0.0F);
            this.Chest.addBox(-3.0F, -5.5F, -3.0F, 6.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.28797932657906433F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 53, 14);
            this.HandLeft.setPos(-0.1F, 6.0F, 0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 40);
            this.Neck1.setPos(0.0F, -5.5F, -3.0F);
            this.Neck1.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.5235987755982988F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 34, 50);
            this.ForearmLeft.setPos(0.0F, 4.7F, -2.7F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 42, 36);
            this.Horn1Right.setPos(-1.2F, -1.9F, -0.5F);
            this.Horn1Right.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.1F, 0.0F, 0.1F);
            this.setRotateAngle(Horn1Right, -0.6108652381980153F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 0);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 6.9F, -1.8F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.7330382858376184F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 53);
            this.Tail2.setPos(0.0F, 3.0F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.05235987755982988F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 44, 49);
            this.TopSnout.setPos(0.0F, 0.9F, -3.4F);
            this.TopSnout.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.296705972839036F, 0.0F, 0.0F);
            this.Horn4Right = new ModelRenderer(this, 60, 19);
            this.Horn4Right.setPos(0.0F, -5.9F, 0.0F);
            this.Horn4Right.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.2F, 0.0F, -0.2F);
            this.setRotateAngle(Horn4Right, -0.4363323129985824F, -0.05235987755982988F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 23, 50);
            this.Horn2Right.setPos(0.0F, -4.9F, 0.0F);
            this.Horn2Right.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, -0.4363323129985824F, -0.05235987755982988F, 0.0F);
            this.Snout = new ModelRenderer(this, 22, 55);
            this.Snout.mirror = true;
            this.Snout.setPos(0.0F, -0.6F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -4.5F, 2.0F, 2.0F, 6.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.06981317007977318F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 0, 9);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-1.5F, -0.8F, 0.5F);
            this.RightEar.addBox(-3.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, 0.0F, -0.20943951023931953F, 0.41887902047863906F);
            this.Mane3 = new ModelRenderer(this, 32, 36);
            this.Mane3.setPos(0.0F, -4.8F, -3.2F);
            this.Mane3.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 20, 23);
            this.Mouth.setPos(0.0F, 1.2F, -1.5F);
            this.Mouth.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 1.0F, 5.0F, -0.1F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 14, 49);
            this.LowerLegLeft.setPos(0.0F, 6.0F, 2.8F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6457718232379019F, 0.0F, 0.0F);
            this.NeckUpper = new ModelRenderer(this, 17, 36);
            this.NeckUpper.setPos(0.0F, 1.7F, -3.8F);
            this.NeckUpper.addBox(-1.5F, -1.5F, -6.5F, 3.0F, 3.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckUpper, -0.6108652381980153F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 0, 9);
            this.LeftEar.setPos(1.5F, -0.8F, 0.5F);
            this.LeftEar.addBox(-1.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, 0.0F, 0.20943951023931953F, -0.41887902047863906F);
            this.ArmBaseRight = new ModelRenderer(this, 44, 40);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.0F, 2.0F, -1.8F);
            this.ArmBaseRight.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.40142572795869574F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 40, 14);
            this.ThighLeft.setPos(2.5F, 3.5F, 2.4F);
            this.ThighLeft.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.296705972839036F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 52, 49);
            this.FootLeft.setPos(-0.1F, 7.0F, -1.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn4Left = new ModelRenderer(this, 60, 19);
            this.Horn4Left.setPos(0.0F, -5.9F, 0.0F);
            this.Horn4Left.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.2F, 0.0F, -0.2F);
            this.setRotateAngle(Horn4Left, -0.4363323129985824F, 0.05235987755982988F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 0);
            this.UpperLegLeft.setPos(0.0F, 6.9F, -1.8F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.7330382858376184F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 14, 49);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 6.0F, 2.8F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6457718232379019F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 26, 0);
            this.ArmRight.setPos(0.0F, 4.0F, 1.7F);
            this.ArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.10471975511965977F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 38, 0);
            this.Hips.setPos(0.0F, 0.0F, 7.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.4363323129985824F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 60, 19);
            this.Horn3Right.setPos(0.0F, -4.9F, 0.0F);
            this.Horn3Right.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.1F, 0.0F, -0.1F);
            this.setRotateAngle(Horn3Right, -0.4363323129985824F, -0.05235987755982988F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 42, 36);
            this.Horn1Left.setPos(1.2F, -1.9F, -0.5F);
            this.Horn1Left.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.1F, 0.0F, 0.1F);
            this.setRotateAngle(Horn1Left, -0.6108652381980153F, 0.0F, 0.0F);
            this.LowerLegRight.addChild(this.FootRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck1.addChild(this.Mane2);
            this.NeckUpper.addChild(this.Mane1);
            this.Hips.addChild(this.Tail1);
            this.NeckUpper.addChild(this.Head);
            this.Horn1Left.addChild(this.Horn2Left);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.Body);
            this.Tail2.addChild(this.part26);
            this.Horn2Left.addChild(this.Horn3Left);
            this.ArmRight.addChild(this.ForearmRight);
            this.Hips.addChild(this.ThighRight);
            this.ForearmRight.addChild(this.HandRight);
            this.NeckUpper.addChild(this.NeckLower);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.Neck1);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.Horn1Right);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Tail1.addChild(this.Tail2);
            this.Snout.addChild(this.TopSnout);
            this.Horn3Right.addChild(this.Horn4Right);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Head.addChild(this.Snout);
            this.Head.addChild(this.RightEar);
            this.Chest.addChild(this.Mane3);
            this.Head.addChild(this.Mouth);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Neck1.addChild(this.NeckUpper);
            this.Head.addChild(this.LeftEar);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.ThighLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Horn3Left.addChild(this.Horn4Left);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Body.addChild(this.Hips);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Head.addChild(this.Horn1Left);
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


        public ModelRenderer Body;

        public ModelRenderer Neck1;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Mane3;
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
        public ModelRenderer part26;
        public ModelRenderer NeckUpper;
        public ModelRenderer Mane2;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Mane1;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer LeftEar;
        public ModelRenderer RightEar;
        public ModelRenderer Horn1Left;
        public ModelRenderer Horn1Right;
        public ModelRenderer TopSnout;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public oryxTwo() {

            texWidth = 64;
            texHeight = 64;
            this.FootRight = new ModelRenderer(this, 52, 49);
            this.FootRight.setPos(0.1F, 7.0F, -1.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 44, 40);
            this.ArmBaseLeft.setPos(2.0F, 2.0F, -1.8F);
            this.ArmBaseLeft.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.40142572795869574F, 0.0F, 0.0F);
            this.Mane2 = new ModelRenderer(this, 40, 27);
            this.Mane2.setPos(0.0F, 0.7F, -4.0F);
            this.Mane2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.1F, 0.0F, 0.0F);
            this.Mane1 = new ModelRenderer(this, 36, 44);
            this.Mane1.setPos(0.0F, -0.7F, -6.5F);
            this.Mane1.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 31, 22);
            this.Tail1.setPos(0.0F, 0.5F, 5.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.4363323129985824F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 47, 33);
            this.Head.setPos(0.0F, 0.8F, -6.5F);
            this.Head.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5235987755982988F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 23, 50);
            this.Horn2Left.setPos(0.0F, -4.9F, 0.0F);
            this.Horn2Left.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, -0.4363323129985824F, 0.05235987755982988F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 26, 0);
            this.ArmLeft.setPos(0.0F, 4.0F, 1.7F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.10471975511965977F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -5.8F, 3.6F);
            this.Body.addBox(-3.5F, 0.0F, -4.5F, 7.0F, 10.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.3490658503988659F, 0.0F, 0.0F);
            this.part26 = new ModelRenderer(this, 19, 22);
            this.part26.setPos(0.0F, 5.0F, 0.0F);
            this.part26.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 60, 19);
            this.Horn3Left.setPos(0.0F, -4.9F, 0.0F);
            this.Horn3Left.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.1F, 0.0F, -0.1F);
            this.setRotateAngle(Horn3Left, -0.4363323129985824F, 0.05235987755982988F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 34, 50);
            this.ForearmRight.setPos(0.0F, 4.7F, -2.7F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 40, 14);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.5F, 3.5F, 2.4F);
            this.ThighRight.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.296705972839036F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 53, 14);
            this.HandRight.setPos(0.1F, 6.0F, 0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 26, 22);
            this.NeckLower.setPos(0.0F, -1.2F, -5.0F);
            this.NeckLower.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3490658503988659F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 1, 23);
            this.Chest.setPos(0.0F, 6.3F, 0.0F);
            this.Chest.addBox(-3.0F, -5.5F, -3.0F, 6.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.28797932657906433F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 53, 14);
            this.HandLeft.setPos(-0.1F, 6.0F, 0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 40);
            this.Neck1.setPos(0.0F, -5.5F, -3.0F);
            this.Neck1.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.5235987755982988F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 34, 50);
            this.ForearmLeft.setPos(0.0F, 4.7F, -2.7F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 42, 36);
            this.Horn1Right.setPos(-1.2F, -1.9F, -0.5F);
            this.Horn1Right.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.1F, 0.0F, 0.1F);
            this.setRotateAngle(Horn1Right, -0.6108652381980153F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 0);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 6.9F, -1.8F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.7330382858376184F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 53);
            this.Tail2.setPos(0.0F, 3.0F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.05235987755982988F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 44, 49);
            this.TopSnout.setPos(0.0F, 0.9F, -3.4F);
            this.TopSnout.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.296705972839036F, 0.0F, 0.0F);
            this.Horn4Right = new ModelRenderer(this, 60, 19);
            this.Horn4Right.setPos(0.0F, -5.9F, 0.0F);
            this.Horn4Right.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.2F, 0.0F, -0.2F);
            this.setRotateAngle(Horn4Right, -0.4363323129985824F, -0.05235987755982988F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 23, 50);
            this.Horn2Right.setPos(0.0F, -4.9F, 0.0F);
            this.Horn2Right.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, -0.4363323129985824F, -0.05235987755982988F, 0.0F);
            this.Snout = new ModelRenderer(this, 22, 55);
            this.Snout.mirror = true;
            this.Snout.setPos(0.0F, -0.6F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -4.5F, 2.0F, 2.0F, 6.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.06981317007977318F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 0, 9);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-1.5F, -0.8F, 0.5F);
            this.RightEar.addBox(-3.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, 0.0F, -0.20943951023931953F, 0.41887902047863906F);
            this.Mane3 = new ModelRenderer(this, 32, 36);
            this.Mane3.setPos(0.0F, -4.8F, -3.2F);
            this.Mane3.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 20, 23);
            this.Mouth.setPos(0.0F, 1.2F, -1.5F);
            this.Mouth.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 1.0F, 5.0F, -0.1F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 14, 49);
            this.LowerLegLeft.setPos(0.0F, 6.0F, 2.8F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6457718232379019F, 0.0F, 0.0F);
            this.NeckUpper = new ModelRenderer(this, 17, 36);
            this.NeckUpper.setPos(0.0F, 1.7F, -3.8F);
            this.NeckUpper.addBox(-1.5F, -1.5F, -6.5F, 3.0F, 3.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckUpper, -0.6108652381980153F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 0, 9);
            this.LeftEar.setPos(1.5F, -0.8F, 0.5F);
            this.LeftEar.addBox(-1.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, 0.0F, 0.20943951023931953F, -0.41887902047863906F);
            this.ArmBaseRight = new ModelRenderer(this, 44, 40);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.0F, 2.0F, -1.8F);
            this.ArmBaseRight.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.40142572795869574F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 40, 14);
            this.ThighLeft.setPos(2.5F, 3.5F, 2.4F);
            this.ThighLeft.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.296705972839036F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 52, 49);
            this.FootLeft.setPos(-0.1F, 7.0F, -1.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn4Left = new ModelRenderer(this, 60, 19);
            this.Horn4Left.setPos(0.0F, -5.9F, 0.0F);
            this.Horn4Left.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.2F, 0.0F, -0.2F);
            this.setRotateAngle(Horn4Left, -0.4363323129985824F, 0.05235987755982988F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 0);
            this.UpperLegLeft.setPos(0.0F, 6.9F, -1.8F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.7330382858376184F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 14, 49);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 6.0F, 2.8F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6457718232379019F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 26, 0);
            this.ArmRight.setPos(0.0F, 4.0F, 1.7F);
            this.ArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.10471975511965977F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 38, 0);
            this.Hips.setPos(0.0F, 0.0F, 7.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.4363323129985824F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 60, 19);
            this.Horn3Right.setPos(0.0F, -4.9F, 0.0F);
            this.Horn3Right.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.1F, 0.0F, -0.1F);
            this.setRotateAngle(Horn3Right, -0.4363323129985824F, -0.05235987755982988F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 42, 36);
            this.Horn1Left.setPos(1.2F, -1.9F, -0.5F);
            this.Horn1Left.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.1F, 0.0F, 0.1F);
            this.setRotateAngle(Horn1Left, -0.6108652381980153F, 0.0F, 0.0F);
            this.LowerLegRight.addChild(this.FootRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck1.addChild(this.Mane2);
            this.NeckUpper.addChild(this.Mane1);
            this.Hips.addChild(this.Tail1);
            this.NeckUpper.addChild(this.Head);
            this.Horn1Left.addChild(this.Horn2Left);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.Body);
            this.Tail2.addChild(this.part26);
            this.Horn2Left.addChild(this.Horn3Left);
            this.ArmRight.addChild(this.ForearmRight);
            this.Hips.addChild(this.ThighRight);
            this.ForearmRight.addChild(this.HandRight);
            this.NeckUpper.addChild(this.NeckLower);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.Neck1);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.Horn1Right);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Tail1.addChild(this.Tail2);
            this.Snout.addChild(this.TopSnout);
            this.Horn3Right.addChild(this.Horn4Right);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Head.addChild(this.Snout);
            this.Head.addChild(this.RightEar);
            this.Chest.addChild(this.Mane3);
            this.Head.addChild(this.Mouth);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Neck1.addChild(this.NeckUpper);
            this.Head.addChild(this.LeftEar);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.ThighLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Horn3Left.addChild(this.Horn4Left);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Body.addChild(this.Hips);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Head.addChild(this.Horn1Left);
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

        public ModelRenderer Body;

        public ModelRenderer Neck1;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Mane3;
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
        public ModelRenderer part26;
        public ModelRenderer NeckUpper;
        public ModelRenderer Mane2;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Mane1;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer LeftEar;
        public ModelRenderer RightEar;
        public ModelRenderer Horn1Left;
        public ModelRenderer Horn1Right;
        public ModelRenderer TopSnout;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {

            texWidth = 64;
            texHeight = 64;
            this.FootRight = new ModelRenderer(this, 52, 49);
            this.FootRight.setPos(0.1F, 7.0F, -1.5F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 44, 40);
            this.ArmBaseLeft.setPos(2.0F, 2.0F, -1.8F);
            this.ArmBaseLeft.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.40142572795869574F, 0.0F, 0.0F);
            this.Mane2 = new ModelRenderer(this, 40, 27);
            this.Mane2.setPos(0.0F, 0.7F, -4.0F);
            this.Mane2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.1F, 0.0F, 0.0F);
            this.Mane1 = new ModelRenderer(this, 36, 44);
            this.Mane1.setPos(0.0F, -0.7F, -6.5F);
            this.Mane1.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 31, 22);
            this.Tail1.setPos(0.0F, 0.5F, 5.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.4363323129985824F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 47, 33);
            this.Head.setPos(0.0F, 0.8F, -6.5F);
            this.Head.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5235987755982988F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 23, 50);
            this.Horn2Left.setPos(0.0F, -4.9F, 0.0F);
            this.Horn2Left.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, -0.4363323129985824F, 0.05235987755982988F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 26, 0);
            this.ArmLeft.setPos(0.0F, 4.0F, 1.7F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.10471975511965977F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -5.8F, 3.6F);
            this.Body.addBox(-3.5F, 0.0F, -4.5F, 7.0F, 10.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.3490658503988659F, 0.0F, 0.0F);
            this.part26 = new ModelRenderer(this, 19, 22);
            this.part26.setPos(0.0F, 5.0F, 0.0F);
            this.part26.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 60, 19);
            this.Horn3Left.setPos(0.0F, -4.9F, 0.0F);
            this.Horn3Left.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.1F, 0.0F, -0.1F);
            this.setRotateAngle(Horn3Left, -0.4363323129985824F, 0.05235987755982988F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 34, 50);
            this.ForearmRight.setPos(0.0F, 4.7F, -2.7F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 40, 14);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.5F, 3.5F, 2.4F);
            this.ThighRight.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.296705972839036F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 53, 14);
            this.HandRight.setPos(0.1F, 6.0F, 0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 26, 22);
            this.NeckLower.setPos(0.0F, -1.2F, -5.0F);
            this.NeckLower.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3490658503988659F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 1, 23);
            this.Chest.setPos(0.0F, 6.3F, 0.0F);
            this.Chest.addBox(-3.0F, -5.5F, -3.0F, 6.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.28797932657906433F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 53, 14);
            this.HandLeft.setPos(-0.1F, 6.0F, 0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 40);
            this.Neck1.setPos(0.0F, -5.5F, -3.0F);
            this.Neck1.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.5235987755982988F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 34, 50);
            this.ForearmLeft.setPos(0.0F, 4.7F, -2.7F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 42, 36);
            this.Horn1Right.setPos(-1.2F, -1.9F, -0.5F);
            this.Horn1Right.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.1F, 0.0F, 0.1F);
            this.setRotateAngle(Horn1Right, -0.6108652381980153F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 0);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 6.9F, -1.8F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.7330382858376184F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 53);
            this.Tail2.setPos(0.0F, 3.0F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.05235987755982988F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 44, 49);
            this.TopSnout.setPos(0.0F, 0.9F, -3.4F);
            this.TopSnout.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.296705972839036F, 0.0F, 0.0F);
            this.Horn4Right = new ModelRenderer(this, 60, 19);
            this.Horn4Right.setPos(0.0F, -5.9F, 0.0F);
            this.Horn4Right.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.2F, 0.0F, -0.2F);
            this.setRotateAngle(Horn4Right, -0.4363323129985824F, -0.05235987755982988F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 23, 50);
            this.Horn2Right.setPos(0.0F, -4.9F, 0.0F);
            this.Horn2Right.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, -0.4363323129985824F, -0.05235987755982988F, 0.0F);
            this.Snout = new ModelRenderer(this, 22, 55);
            this.Snout.mirror = true;
            this.Snout.setPos(0.0F, -0.6F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -4.5F, 2.0F, 2.0F, 6.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.06981317007977318F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 0, 9);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-1.5F, -0.8F, 0.5F);
            this.RightEar.addBox(-3.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, 0.0F, -0.20943951023931953F, 0.41887902047863906F);
            this.Mane3 = new ModelRenderer(this, 32, 36);
            this.Mane3.setPos(0.0F, -4.8F, -3.2F);
            this.Mane3.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 20, 23);
            this.Mouth.setPos(0.0F, 1.2F, -1.5F);
            this.Mouth.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 1.0F, 5.0F, -0.1F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 14, 49);
            this.LowerLegLeft.setPos(0.0F, 6.0F, 2.8F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6457718232379019F, 0.0F, 0.0F);
            this.NeckUpper = new ModelRenderer(this, 17, 36);
            this.NeckUpper.setPos(0.0F, 1.7F, -3.8F);
            this.NeckUpper.addBox(-1.5F, -1.5F, -6.5F, 3.0F, 3.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckUpper, -0.6108652381980153F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 0, 9);
            this.LeftEar.setPos(1.5F, -0.8F, 0.5F);
            this.LeftEar.addBox(-1.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, 0.0F, 0.20943951023931953F, -0.41887902047863906F);
            this.ArmBaseRight = new ModelRenderer(this, 44, 40);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.0F, 2.0F, -1.8F);
            this.ArmBaseRight.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.40142572795869574F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 40, 14);
            this.ThighLeft.setPos(2.5F, 3.5F, 2.4F);
            this.ThighLeft.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.296705972839036F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 52, 49);
            this.FootLeft.setPos(-0.1F, 7.0F, -1.5F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn4Left = new ModelRenderer(this, 60, 19);
            this.Horn4Left.setPos(0.0F, -5.9F, 0.0F);
            this.Horn4Left.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.2F, 0.0F, -0.2F);
            this.setRotateAngle(Horn4Left, -0.4363323129985824F, 0.05235987755982988F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 0);
            this.UpperLegLeft.setPos(0.0F, 6.9F, -1.8F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.7330382858376184F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 14, 49);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 6.0F, 2.8F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6457718232379019F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 26, 0);
            this.ArmRight.setPos(0.0F, 4.0F, 1.7F);
            this.ArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.10471975511965977F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 38, 0);
            this.Hips.setPos(0.0F, 0.0F, 7.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.4363323129985824F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 60, 19);
            this.Horn3Right.setPos(0.0F, -4.9F, 0.0F);
            this.Horn3Right.addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, -0.1F, 0.0F, -0.1F);
            this.setRotateAngle(Horn3Right, -0.4363323129985824F, -0.05235987755982988F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 42, 36);
            this.Horn1Left.setPos(1.2F, -1.9F, -0.5F);
            this.Horn1Left.addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.1F, 0.0F, 0.1F);
            this.setRotateAngle(Horn1Left, -0.6108652381980153F, 0.0F, 0.0F);
            this.LowerLegRight.addChild(this.FootRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck1.addChild(this.Mane2);
            this.NeckUpper.addChild(this.Mane1);
            this.Hips.addChild(this.Tail1);
            this.NeckUpper.addChild(this.Head);
            this.Horn1Left.addChild(this.Horn2Left);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.Body);
            this.Tail2.addChild(this.part26);
            this.Horn2Left.addChild(this.Horn3Left);
            this.ArmRight.addChild(this.ForearmRight);
            this.Hips.addChild(this.ThighRight);
            this.ForearmRight.addChild(this.HandRight);
            this.NeckUpper.addChild(this.NeckLower);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.Neck1);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.Horn1Right);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Tail1.addChild(this.Tail2);
            this.Snout.addChild(this.TopSnout);
            this.Horn3Right.addChild(this.Horn4Right);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Head.addChild(this.Snout);
            this.Head.addChild(this.RightEar);
            this.Chest.addChild(this.Mane3);
            this.Head.addChild(this.Mouth);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Neck1.addChild(this.NeckUpper);
            this.Head.addChild(this.LeftEar);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.ThighLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Horn3Left.addChild(this.Horn4Left);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Body.addChild(this.Hips);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Head.addChild(this.Horn1Left);
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


