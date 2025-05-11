package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.LowlandNyalaEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class LowlandNyalaModel extends ZawaBaseModel<LowlandNyalaEntity> {
    protected ModelRenderer Chest;
    private Iterable<ModelRenderer> parts;
    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class AdultMale extends LowlandNyalaModel {
        public ModelRenderer Neck;
        public ModelRenderer BackFur1;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
        public ModelRenderer Fluff1;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckBase;
        public ModelRenderer Horn1Left;
        public ModelRenderer EarRight;
        public ModelRenderer UpperSnout;
        public ModelRenderer Horn1Right;
        public ModelRenderer EarLeft;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Mouth;
        public ModelRenderer Snout;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Beard;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer BackFur2;
        public ModelRenderer Hips;
        public ModelRenderer Fluff2;
        public ModelRenderer BackFur3;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer LegTuftLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer LegTuftRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;

        public AdultMale() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.Fluff1 = new ModelRenderer(this, 102, 0);
            this.Fluff1.setPos(0.0F, 4.5F, 0.0F);
            this.Fluff1.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff1, 0.017453292519943295F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 26, 19);
            this.ForearmLeft.setPos(0.0F, 4.0F, -2.5F);
            this.ForearmLeft.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 26, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.0F, 0.0F, 0.0F);
            this.ArmBaseRight.addBox(-1.1F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.23561944901923448F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 6.2F, -6.5F);
            this.Chest.addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.2694788291842315F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 42, 13);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.5F, 8.0F, -1.3F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.5229999971167082F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 11, 112);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(0.3F, -2.8F, 0.5F);
            this.Horn2Right.addBox(-0.5F, -4.5F, 0.0F, 1.0F, 5.0F, 1.0F, 0.2F, 0.0F, 0.2F);
            this.setRotateAngle(Horn2Right, -0.5235987755982988F, 0.0F, 0.6108652381980153F);
            this.LegTuftRight = new ModelRenderer(this, 53, 18);
            this.LegTuftRight.mirror = true;
            this.LegTuftRight.setPos(-0.1F, 0.0F, 0.0F);
            this.LegTuftRight.addBox(-0.5F, -4.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegTuftRight, -0.10245082509469633F, 0.0F, 0.0F);
            this.LegTuftLeft = new ModelRenderer(this, 53, 18);
            this.LegTuftLeft.setPos(0.1F, 0.0F, 0.0F);
            this.LegTuftLeft.addBox(-0.5F, -4.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegTuftLeft, -0.10245082509469633F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 16);
            this.Body.setPos(0.0F, -5.0F, 3.0F);
            this.Body.addBox(-3.5F, -0.3F, 0.0F, 7.0F, 10.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.2694788291842315F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 97);
            this.Snout.setPos(0.0F, 2.3F, -1.7F);
            this.Snout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.100000024F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.6981317007977318F, 0.0F, 0.0F);
            this.BackFur1 = new ModelRenderer(this, 61, 12);
            this.BackFur1.setPos(0.0F, -5.0F, -1.5F);
            this.BackFur1.addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFur1, 0.02617993877991494F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 1, 18);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.0F, -1.7F, 1.0F);
            this.EarRight.addBox(-3.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.4363323129985824F, 0.4363323129985824F);
            this.NeckBase = new ModelRenderer(this, 0, 68);
            this.NeckBase.setPos(0.0F, 2.0F, -0.5F);
            this.NeckBase.addBox(-1.5F, 0.0F, -4.3F, 3.0F, 4.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.1563815016444822F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 102);
            this.Mouth.setPos(0.0F, 0.0F, -3.0F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.17453292519943295F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 26, 0);
            this.ArmBaseLeft.setPos(3.0F, 0.0F, 0.0F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.23561944901923448F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 9, 118);
            this.Horn1Left.setPos(1.7F, -2.5F, -0.5F);
            this.Horn1Left.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left, -0.40631266184850484F, 0.13962634015954636F, 0.4363323129985824F);
            this.ThighLeft = new ModelRenderer(this, 43, 0);
            this.ThighLeft.setPos(3.0F, 3.5F, 2.9F);
            this.ThighLeft.addBox(-2.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.208566842284371F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 81);
            this.Head.setPos(0.0F, 2.5F, -4.8F);
            this.Head.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.099999905F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7419394357280175F, 0.0F, 0.0F);
            this.BackFur2 = new ModelRenderer(this, 61, 9);
            this.BackFur2.setPos(0.0F, -0.4F, 0.1F);
            this.BackFur2.addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 12.5F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 39);
            this.Hips.setPos(0.0F, 0.0F, 12.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2694788291842315F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 11, 112);
            this.Horn2Left.setPos(-0.2F, -2.8F, 0.5F);
            this.Horn2Left.addBox(-0.5F, -4.5F, 0.0F, 1.1F, 5.0F, 1.0F, 0.2F, 0.0F, 0.2F);
            this.setRotateAngle(Horn2Left, -0.5235987755982988F, 0.0F, -0.6108652381980153F);
            this.LowerLegLeft = new ModelRenderer(this, 42, 21);
            this.LowerLegLeft.setPos(0.1F, 4.8F, 2.9F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.4710643611185279F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 11, 107);
            this.Horn3Left.setPos(0.0F, -4.1F, 0.1F);
            this.Horn3Left.addBox(-0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.3490658503988659F, 0.0F, 0.4363323129985824F);
            this.ArmRight = new ModelRenderer(this, 26, 12);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.49F, 7.0F, 1.6F);
            this.ArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.04300000233285385F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 9, 118);
            this.Horn1Right.mirror = true;
            this.Horn1Right.setPos(-1.7F, -2.5F, -0.5F);
            this.Horn1Right.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, -0.40631266184850484F, -0.13962634015954636F, -0.4363323129985824F);
            this.Tail2 = new ModelRenderer(this, 28, 62);
            this.Tail2.setPos(0.0F, 5.8F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.09581857193974705F, 0.0F, -0.0031415927784254694F);
            this.ArmLeft = new ModelRenderer(this, 26, 12);
            this.ArmLeft.setPos(-0.59F, 7.0F, 1.6F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.04300000233285385F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 42, 21);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.1F, 4.8F, 2.9F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.4710643611185279F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 34, 23);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 7.2F, -1.5F);
            this.FootRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 26, 19);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 4.0F, -2.5F);
            this.ForearmRight.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Fluff2 = new ModelRenderer(this, 62, 29);
            this.Fluff2.setPos(0.0F, 9.0F, 0.0F);
            this.Fluff2.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff2, 0.1738347941644255F, 0.0F, 0.0F);
            this.UpperSnout = new ModelRenderer(this, 0, 91);
            this.UpperSnout.setPos(0.0F, -2.5F, -2.5F);
            this.UpperSnout.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperSnout, 0.8726646259971648F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 34, 23);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 5.5F, 0.5F);
            this.HandRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.BackFur3 = new ModelRenderer(this, 61, 12);
            this.BackFur3.setPos(0.0F, 0.0F, 0.0F);
            this.BackFur3.addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFur3, -0.14137167606944342F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 1, 18);
            this.EarLeft.setPos(2.0F, -2.0F, 1.0F);
            this.EarLeft.addBox(-0.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.4363323129985824F, -0.4363323129985824F);
            this.UpperLegLeft = new ModelRenderer(this, 42, 13);
            this.UpperLegLeft.setPos(-0.5F, 8.0F, -1.3F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.5229999971167082F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 30, 55);
            this.Tail1.setPos(0.0F, 0.0F, 6.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3000221077388891F, 0.015009831816822585F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 11, 107);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(0.0F, -4.0F, 0.1F);
            this.Horn3Right.addBox(-0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.3490658503988659F, 0.0F, -0.4363323129985824F);
            this.ThighRight = new ModelRenderer(this, 43, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.0F, 3.5F, 2.9F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.208566842284371F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 34, 23);
            this.FootLeft.setPos(-0.1F, 7.2F, -1.5F);
            this.FootLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 55);
            this.Neck.setPos(0.0F, -5.0F, 0.0F);
            this.Neck.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.891339643667182F, 0.0F, 0.0F);
            this.Beard = new ModelRenderer(this, 101, 19);
            this.Beard.setPos(0.0F, 3.8F, -3.5F);
            this.Beard.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beard, 0.5745623577986002F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 30, 69);
            this.Tail3.setPos(0.0F, 5.0F, 0.0F);
            this.Tail3.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 34, 23);
            this.HandLeft.setPos(-0.1F, 5.5F, 0.5F);
            this.HandLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest.addChild(this.Fluff1);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Horn1Right.addChild(this.Horn2Right);
            this.UpperLegRight.addChild(this.LegTuftRight);
            this.UpperLegLeft.addChild(this.LegTuftLeft);
            this.Chest.addChild(this.Body);
            this.UpperSnout.addChild(this.Snout);
            this.Chest.addChild(this.BackFur1);
            this.Head.addChild(this.EarRight);
            this.Neck.addChild(this.NeckBase);
            this.UpperSnout.addChild(this.Mouth);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.Horn1Left);
            this.Hips.addChild(this.ThighLeft);
            this.Neck.addChild(this.Head);
            this.Body.addChild(this.BackFur2);
            this.Body.addChild(this.Hips);
            this.Horn1Left.addChild(this.Horn2Left);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Horn2Left.addChild(this.Horn3Left);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Head.addChild(this.Horn1Right);
            this.Tail1.addChild(this.Tail2);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Body.addChild(this.Fluff2);
            this.Head.addChild(this.UpperSnout);
            this.ForearmRight.addChild(this.HandRight);
            this.Hips.addChild(this.BackFur3);
            this.Head.addChild(this.EarLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Hips.addChild(this.Tail1);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Hips.addChild(this.ThighRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Neck);
            this.NeckBase.addChild(this.Beard);
            this.Tail2.addChild(this.Tail3);
            this.ForearmLeft.addChild(this.HandLeft);
            this.saveBase();
        }
        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.741F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.891F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.741F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.3F;
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
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.891F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.741F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.3F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.095F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 6.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.269F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.269F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.269F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F - 0.235F;
                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.043F;
                this.ForearmLeft.xRot = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F - 0.235F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F  - 0.043F;
                this.ForearmRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.208F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.523F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.471F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.208F;
                this.UpperLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.523F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.471F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.891F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.741F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.3F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.095F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 6.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.269F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.269F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.269F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.235F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.043F;
                this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.235F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.043F;
                this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.208F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.523F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.471F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.208F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.523F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.471F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class AdultFemale extends LowlandNyalaModel {
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer NeckBase;
        public ModelRenderer Head;
        public ModelRenderer EarRight;
        public ModelRenderer UpperSnout;
        public ModelRenderer EarLeft;
        public ModelRenderer Mouth;
        public ModelRenderer Snout;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
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
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;

        public AdultFemale() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.ForearmLeft = new ModelRenderer(this, 26, 19);
            this.ForearmLeft.setPos(0.0F, 4.0F, -2.5F);
            this.ForearmLeft.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 26, 0);
            this.ArmBaseLeft.setPos(3.0F, 0.0F, 0.0F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.23561944901923448F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 42, 13);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.5F, 8.0F, -1.3F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.5229999971167082F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 26, 12);
            this.ArmLeft.setPos(-0.59F, 7.0F, 1.6F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.04300000233285385F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 97);
            this.Snout.setPos(0.0F, 2.3F, -1.7F);
            this.Snout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.100000024F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.6981317007977318F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 43, 0);
            this.ThighLeft.setPos(3.0F, 4.5F, 2.9F);
            this.ThighLeft.addBox(-2.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.208566842284371F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 34, 23);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 6.2F, -1.5F);
            this.FootRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 28, 62);
            this.Tail2.setPos(0.0F, 5.8F, -0.5F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.09581857193974705F, 0.0F, -0.0031415927784254694F);
            this.LowerLegLeft = new ModelRenderer(this, 42, 21);
            this.LowerLegLeft.setPos(0.1F, 4.8F, 2.9F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.4710643611185279F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 34, 23);
            this.HandLeft.setPos(-0.1F, 4.5F, 0.5F);
            this.HandLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 7.4F, -6.5F);
            this.Chest.addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.2694788291842315F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 26, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.0F, 0.0F, 0.0F);
            this.ArmBaseRight.addBox(-1.1F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.23561944901923448F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 81);
            this.Head.setPos(0.0F, 0.5F, -7.7F);
            this.Head.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.099999905F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.1719886193458031F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 34, 23);
            this.FootLeft.setPos(-0.1F, 6.2F, -1.5F);
            this.FootLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 30, 55);
            this.Tail1.setPos(0.0F, 0.0F, 6.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3000221077388891F, 0.015009831816822585F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 30, 69);
            this.Tail3.setPos(0.0F, 5.0F, 0.0F);
            this.Tail3.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 1, 18);
            this.EarLeft.setPos(2.0F, -2.0F, 1.0F);
            this.EarLeft.addBox(-0.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.5082398928281348F, -0.4363323129985824F, -0.6709045404981704F);
            this.HandRight = new ModelRenderer(this, 34, 23);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 4.5F, 0.5F);
            this.HandRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 1, 18);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.0F, -1.7F, 1.0F);
            this.EarRight.addBox(-3.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.5864306020384839F, 0.4363323129985824F, 0.6709045404981704F);
            this.UpperLegLeft = new ModelRenderer(this, 42, 13);
            this.UpperLegLeft.setPos(-0.5F, 8.0F, -1.3F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.5229999971167082F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 26, 19);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 4.0F, -2.5F);
            this.ForearmRight.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 16);
            this.Body.setPos(0.0F, -5.0F, 3.0F);
            this.Body.addBox(-3.5F, -0.1F, 0.0F, 7.0F, 10.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.182212366584515F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 55);
            this.Neck.setPos(0.0F, -5.0F, -1.0F);
            this.Neck.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.8131489011673192F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 43, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.0F, 4.5F, 2.9F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.208566842284371F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 39);
            this.Hips.setPos(0.0F, 0.0F, 11.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3567453084287048F, 0.0F, 0.0F);
            this.UpperSnout = new ModelRenderer(this, 0, 91);
            this.UpperSnout.setPos(0.0F, -2.5F, -2.5F);
            this.UpperSnout.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperSnout, 0.8726646259971648F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 102);
            this.Mouth.setPos(0.0F, 0.0F, -3.0F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.17453292519943295F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 42, 21);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.1F, 4.8F, 2.9F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.4710643611185279F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 26, 12);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.49F, 7.0F, 1.6F);
            this.ArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.04300000233285385F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 0, 68);
            this.NeckBase.setPos(0.0F, 5.0F, 1.5F);
            this.NeckBase.addBox(-2.0F, -2.0F, -7.0F, 4.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.5864306020384839F, 0.0F, 0.0F);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.UpperSnout.addChild(this.Snout);
            this.Hips.addChild(this.ThighLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Tail1.addChild(this.Tail2);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.NeckBase.addChild(this.Head);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.Tail1);
            this.Tail2.addChild(this.Tail3);
            this.Head.addChild(this.EarLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.Body);
            this.Chest.addChild(this.Neck);
            this.Hips.addChild(this.ThighRight);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.UpperSnout);
            this.UpperSnout.addChild(this.Mouth);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Neck.addChild(this.NeckBase);
            this.saveBase();
        }
        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.172F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.813F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.172F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.3F;
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
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.813F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.172F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.3F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.095F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 7.4F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.269F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.182F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.356F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F - 0.235F;
                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.043F;
                this.ForearmLeft.xRot = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F - 0.235F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F  - 0.043F;
                this.ForearmRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.208F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.523F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.471F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.208F;
                this.UpperLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.523F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.471F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.813F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 1.172F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.3F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.095F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 7.4F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.269F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.182F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.356F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.235F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.043F;
                this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.235F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.043F;
                this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.208F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.523F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.471F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.208F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.523F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.471F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends LowlandNyalaModel {
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Body;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck1;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer TopSnout;
        public ModelRenderer Nose;
        public Child() {
            texWidth = 64;
            texHeight = 64;
            this.Hips = new ModelRenderer(this, 0, 28);
            this.Hips.setPos(0.0F, -0.5F, 10.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.42149700769872783F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 32, 18);
            this.HandLeft.setPos(-0.1F, 2.0F, 0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 44, 10);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 6.0F, -1.7F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.3510000044300496F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 32, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.6F, 0.5F, 0.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.0169296942436877F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 32, 8);
            this.ArmLeft.setPos(0.0F, 5.0F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.08699999668789724F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 10);
            this.EarLeft.setPos(1.6F, -0.7F, 0.0F);
            this.EarLeft.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.5864306020384839F, 0.8600982340775168F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 32, 0);
            this.ArmBaseLeft.setPos(1.6F, 0.5F, 0.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.0169296942436877F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 32, 13);
            this.ForearmLeft.setPos(-0.1F, 3.0F, -1.98F);
            this.ForearmLeft.addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 23, 0);
            this.Tail4.setPos(0.0F, 0.0F, 4.0F);
            this.Tail4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 44, 17);
            this.LowerLegLeft.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.2910000170454868F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 32, 8);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 5.0F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.08699999668789724F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 17, 4);
            this.Tail2.setPos(0.0F, 0.0F, 3.0F);
            this.Tail2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 3.15837576474231E-4F, 0.0F, -0.08987762546951192F);
            this.ThighLeft = new ModelRenderer(this, 44, 0);
            this.ThighLeft.setPos(2.0F, 2.4F, 1.6F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.26214846163903155F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 1, 40);
            this.Neck.setPos(0.0F, -1.9F, -0.5F);
            this.Neck.addBox(-1.5F, -2.0F, -4.2F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -2.1395990661039823F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 2.4F, 1.6F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.26214846163903155F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 19, 29);
            this.Tail3.setPos(0.0F, 0.5F, 1.5F);
            this.Tail3.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 11.7F, -5.0F);
            this.Chest.addBox(-2.5F, -3.5F, -1.5F, 5.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.09494591230717694F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 44, 10);
            this.UpperLegLeft.setPos(-0.1F, 6.0F, -1.7F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.3510000044300496F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 32, 18);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 2.0F, 0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 60);
            this.Snout.setPos(0.0F, 1.0F, -1.6F);
            this.Snout.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.1563815016444822F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 32, 13);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.1F, 3.0F, -1.98F);
            this.ForearmRight.addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 53, 19);
            this.FootLeft.setPos(-0.1F, 3.0F, -1.3F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 0, 56);
            this.Nose.setPos(0.0F, -1.0F, -2.8F);
            this.Nose.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27366763203903305F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 48);
            this.Head.setPos(0.0F, -0.3F, -4.3F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.367640012515401F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 53, 19);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.0F, -1.3F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 10);
            this.Body.setPos(0.0F, -2.7F, 1.0F);
            this.Body.addBox(-3.0F, -1.0F, 0.0F, 6.0F, 8.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.022340213926184713F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 10, 56);
            this.TopSnout.setPos(0.0F, -2.8F, 0.0F);
            this.TopSnout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, -0.05F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.6646214111173737F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 17, 0);
            this.Tail1.setPos(0.0F, 0.3F, 4.0F);
            this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.2334960557758918F, 0.0F, -0.022307931420345907F);
            this.LowerLegRight = new ModelRenderer(this, 44, 17);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.2910000170454868F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 10);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.6F, -0.7F, 0.0F);
            this.EarRight.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.5864306020384839F, -0.8600982340775168F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 20, 40);
            this.Neck1.setPos(0.0F, 0.0F, -1.1F);
            this.Neck1.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.7819074915776542F, 0.0F, 0.0F);
            this.Body.addChild(this.Hips);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Tail3.addChild(this.Tail4);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Tail1.addChild(this.Tail2);
            this.Hips.addChild(this.ThighLeft);
            this.Neck1.addChild(this.Neck);
            this.Hips.addChild(this.ThighRight);
            this.Tail2.addChild(this.Tail3);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.Head.addChild(this.Snout);
            this.ArmRight.addChild(this.ForearmRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Snout.addChild(this.Nose);
            this.Neck.addChild(this.Head);
            this.LowerLegRight.addChild(this.FootRight);
            this.Chest.addChild(this.Body);
            this.Snout.addChild(this.TopSnout);
            this.Hips.addChild(this.Tail1);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.Neck1); 
            this.saveBase();
        }

        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.367F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 2.139F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.367F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.251F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.088F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 2.139F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 1.367F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.251F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.088F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 11.7F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.094F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.022F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.421F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.017F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.017F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.262F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.351F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.291F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.262F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.351F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.291F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}