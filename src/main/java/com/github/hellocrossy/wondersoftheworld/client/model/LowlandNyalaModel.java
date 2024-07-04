package com.github.hellocrossy.wondersoftheworld.client.model;
import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.KiwiEntity;
import com.github.hellocrossy.wondersoftheworld.entity.LowlandNyalaEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class LowlandNyalaModel extends ZawaBaseModel<LowlandNyalaEntity> {

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

    public static class Adult extends LowlandNyalaModel {


        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer Fluff;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer BackFur1;
        public ModelRenderer Hips;
        public ModelRenderer BackFur2;
        public ModelRenderer ThighLeft;
        public ModelRenderer BackFur3;
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
        public ModelRenderer Tail4;
        public ModelRenderer NeckBase;
        public ModelRenderer Head;
        public ModelRenderer Beard;
        public ModelRenderer UpperSnout;
        public ModelRenderer Horn1Left;
        public ModelRenderer Horn1Right;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.Tail2 = new ModelRenderer(this, 27, 47);
            this.Tail2.setPos(0.0F, 0.0F, 5.0F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.19198621771937624F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 0, 117);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(0.0F, -3.1F, 0.1F);
            this.Horn3Right.addBox(-0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.3490658503988659F, 0.0F, -0.4363323129985824F);
            this.Neck = new ModelRenderer(this, 0, 55);
            this.Neck.setPos(0.0F, -5.0F, -1.0F);
            this.Neck.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6981317007977318F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 42, 21);
            this.LowerLegLeft.setPos(0.1F, 4.8F, 3.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.47123889803846897F, 0.0F, 0.0F);
            this.BackFur1 = new ModelRenderer(this, 61, 14);
            this.BackFur1.setPos(0.0F, -5.0F, -1.5F);
            this.BackFur1.addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFur1, 0.02617993877991494F, 0.0F, 0.0F);
            this.BackFur2 = new ModelRenderer(this, 61, 10);
            this.BackFur2.setPos(0.0F, -0.4F, 0.1F);
            this.BackFur2.addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 12.5F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 42, 13);
            this.UpperLegLeft.setPos(-0.5F, 8.0F, -1.3F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.5235987755982988F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 34, 23);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 7.2F, -1.5F);
            this.FootRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Beard = new ModelRenderer(this, 61, -9);
            this.Beard.setPos(0.0F, 3.8F, -3.5F);
            this.Beard.addBox(0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beard, 0.5745623577986002F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 26, 12);
            this.ArmLeft.setPos(-0.59F, 7.0F, 1.6F);
            this.ArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.04363323129985824F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 26, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.0F, 0.0F, 0.0F);
            this.ArmBaseRight.addBox(-1.1F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.061086523819801536F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 0, 117);
            this.Horn3Left.setPos(0.0F, -3.1F, 0.1F);
            this.Horn3Left.addBox(-0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.3490658503988659F, 0.0F, 0.4363323129985824F);
            this.Body = new ModelRenderer(this, 0, 16);
            this.Body.setPos(0.0F, -5.0F, 3.0F);
            this.Body.addBox(-3.5F, -0.3F, 0.0F, 7.0F, 11.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.09599310885968812F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 34, 23);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 5.5F, 0.5F);
            this.HandRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 6.5F, -6.5F);
            this.Chest.addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.09599310885968812F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 28, 60);
            this.Tail4.setPos(0.0F, 0.0F, 5.0F);
            this.Tail4.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 81);
            this.Head.setPos(0.0F, 2.5F, -4.8F);
            this.Head.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.6108652381980153F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, -1, 112);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(0.3F, -2.8F, 0.5F);
            this.Horn2Right.addBox(-0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.2F, 0.0F, 0.2F);
            this.setRotateAngle(Horn2Right, -0.5235987755982988F, 0.0F, 0.6108652381980153F);
            this.ArmRight = new ModelRenderer(this, 26, 12);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.49F, 7.0F, 1.6F);
            this.ArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.04363323129985824F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 34, 23);
            this.FootLeft.setPos(-0.1F, 7.2F, -1.5F);
            this.FootLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Fluff = new ModelRenderer(this, 62, -1);
            this.Fluff.setPos(0.0F, 4.5F, 0.0F);
            this.Fluff.addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff, 0.017453292519943295F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 42, 21);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.1F, 4.8F, 3.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.47123889803846897F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 39);
            this.Hips.setPos(0.0F, 0.0F, 12.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.09599310885968812F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 26, 19);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 4.0F, -2.5F);
            this.ForearmRight.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 0, 106);
            this.Horn1Left.setPos(1.7F, -2.5F, -0.5F);
            this.Horn1Left.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left, -0.5235987755982988F, 0.13962634015954636F, 0.4363323129985824F);
            this.EarRight = new ModelRenderer(this, 1, 18);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.0F, -1.7F, 1.0F);
            this.EarRight.addBox(-3.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.4363323129985824F, 0.4363323129985824F);
            this.Mouth = new ModelRenderer(this, 0, 102);
            this.Mouth.setPos(0.0F, 0.0F, -3.0F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.17453292519943295F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 26, 0);
            this.ArmBaseLeft.setPos(3.0F, 0.0F, 0.0F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.061086523819801536F, 0.0F, 0.0F);
            this.BackFur3 = new ModelRenderer(this, 61, 18);
            this.BackFur3.setPos(0.0F, 0.0F, 0.0F);
            this.BackFur3.addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFur3, -0.14137167606944342F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 27, 40);
            this.Tail1.setPos(0.0F, 0.2F, 6.0F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.1344640137963142F, 0.0F, 0.0F);
            this.UpperSnout = new ModelRenderer(this, 0, 91);
            this.UpperSnout.setPos(0.0F, -2.5F, -2.5F);
            this.UpperSnout.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperSnout, 0.8726646259971648F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 43, 0);
            this.ThighLeft.setPos(3.0F, 3.5F, 2.9F);
            this.ThighLeft.addBox(-2.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.03490658503988659F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 27, 51);
            this.Tail3.setPos(0.0F, 0.0F, 1.5F);
            this.Tail3.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, -0.13962634015954636F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, -1, 112);
            this.Horn2Left.setPos(-0.2F, -2.8F, 0.5F);
            this.Horn2Left.addBox(-0.5F, -3.5F, 0.0F, 1.1F, 4.0F, 1.0F, 0.2F, 0.0F, 0.2F);
            this.setRotateAngle(Horn2Left, -0.5235987755982988F, 0.0F, -0.6108652381980153F);
            this.ForearmLeft = new ModelRenderer(this, 26, 19);
            this.ForearmLeft.setPos(0.0F, 4.0F, -2.5F);
            this.ForearmLeft.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 0, 68);
            this.NeckBase.setPos(0.0F, 2.0F, -0.5F);
            this.NeckBase.addBox(-1.5F, 0.0F, -4.3F, 3.0F, 4.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.1563815016444822F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 43, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.0F, 3.5F, 2.9F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.03490658503988659F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 0, 106);
            this.Horn1Right.mirror = true;
            this.Horn1Right.setPos(-1.7F, -2.5F, -0.5F);
            this.Horn1Right.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, -0.5235987755982988F, -0.13962634015954636F, -0.4363323129985824F);
            this.HandLeft = new ModelRenderer(this, 34, 23);
            this.HandLeft.setPos(-0.1F, 5.5F, 0.5F);
            this.HandLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 42, 13);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.5F, 8.0F, -1.3F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.5235987755982988F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 97);
            this.Snout.setPos(0.0F, 2.3F, -1.7F);
            this.Snout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.6981317007977318F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 1, 18);
            this.EarLeft.setPos(2.0F, -1.7F, 1.0F);
            this.EarLeft.addBox(-0.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.4363323129985824F, -0.4363323129985824F);
            this.Tail1.addChild(this.Tail2);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Chest.addChild(this.Neck);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.BackFur1);
            this.Body.addChild(this.BackFur2);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.NeckBase.addChild(this.Beard);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Chest.addChild(this.Body);
            this.ForearmRight.addChild(this.HandRight);
            this.Tail3.addChild(this.Tail4);
            this.Neck.addChild(this.Head);
            this.Horn1Right.addChild(this.Horn2Right);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Fluff);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Body.addChild(this.Hips);
            this.ArmRight.addChild(this.ForearmRight);
            this.Head.addChild(this.Horn1Left);
            this.Head.addChild(this.EarRight);
            this.UpperSnout.addChild(this.Mouth);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Hips.addChild(this.BackFur3);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.UpperSnout);
            this.Hips.addChild(this.ThighLeft);
            this.Tail2.addChild(this.Tail3);
            this.Horn1Left.addChild(this.Horn2Left);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Neck.addChild(this.NeckBase);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.Horn1Right);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.UpperSnout.addChild(this.Snout);
            this.Head.addChild(this.EarLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            //    this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.610F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.698F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.610F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.134F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.191F;
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
                float degree = 0.4f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.698F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.610F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F - 1.134F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1F) * 0.5F - 0.191F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 6.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.095F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.095F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.226F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.017F;
                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.3F;
                this.ForearmLeft.xRot = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.6F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.017F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.3F;
                this.ForearmRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.6F;
                this.HandRight.xRot = MathHelper.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.157F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.351F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.291F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.157F;
                this.UpperLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.351F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.291F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;


            } else {
                float speed = 2.5f;
                float degree = 1.0f;

                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.624F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.638F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 1.13F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.191F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 6.2F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.095F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.095F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.095F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.061F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.043F;
                this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.061F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.043F;
                this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.034F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.523F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.471F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.034F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.523F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.471F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends LowlandNyalaModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
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
        public ModelRenderer Tail4;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Nose;
        public ModelRenderer TopSnout;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            texWidth = 64;
            texHeight = 64;
            this.Tail1 = new ModelRenderer(this, 17, 0);
            this.Tail1.setPos(0.0F, 0.3F, 4.0F);
            this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.029569755046227F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 23, 0);
            this.Tail4.setPos(0.0F, 0.0F, 4.0F);
            this.Tail4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 44, 10);
            this.UpperLegLeft.setPos(-0.1F, 6.0F, -1.7F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.46914448828868976F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 10, 56);
            this.TopSnout.setPos(0.0F, -2.8F, 0.0F);
            this.TopSnout.addBox(-1.1F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.6646214111173737F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 11.0F, -5.0F);
            this.Chest.addBox(-2.5F, -3.5F, -1.5F, 5.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.09599310885968812F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 16, 41);
            this.NeckLower.setPos(0.0F, 1.8F, -3.0F);
            this.NeckLower.addBox(-1.0F, -2.0F, 0.4F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.1563815016444822F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 0, 56);
            this.Nose.setPos(0.0F, -1.0F, -2.8F);
            this.Nose.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27366763203903305F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 17, 4);
            this.Tail2.setPos(0.0F, 0.0F, 3.0F);
            this.Tail2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.10471975511965977F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 44, 17);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3909537457888271F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 32, 18);
            this.HandLeft.setPos(-0.1F, 2.0F, 0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 44, 17);
            this.LowerLegLeft.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3909537457888271F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 32, 0);
            this.ArmBaseLeft.setPos(1.6F, 1.0F, 0.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.03490658503988659F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 48);
            this.Head.setPos(0.0F, 0.0F, -3.0F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7428121536172364F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 19, 29);
            this.Tail3.setPos(0.0F, 0.5F, 1.5F);
            this.Tail3.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 32, 13);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(-0.1F, 3.0F, -2.0F);
            this.ForearmRight.addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 10);
            this.Body.setPos(0.0F, -3.0F, 1.0F);
            this.Body.addBox(-3.0F, -1.0F, 0.0F, 6.0F, 8.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.09599310885968812F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 32, 13);
            this.ForearmLeft.setPos(-0.1F, 3.0F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 44, 0);
            this.ThighLeft.setPos(2.0F, 2.5F, 1.6F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.3295181481291434F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 10);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.6F, -0.7F, 0.0F);
            this.EarRight.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.5864306020384839F, -0.8600982340775168F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 2.5F, 1.6F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.3295181481291434F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 53, 19);
            this.FootLeft.setPos(-0.1F, 3.0F, -1.3F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.017453292519943295F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 32, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.6F, 1.0F, 0.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.03490658503988659F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 32, 8);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 5.0F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.06981317007977318F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 39);
            this.Neck.setPos(0.0F, -2.0F, -1.1F);
            this.Neck.addBox(-1.5F, -2.0F, -3.2F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7562511968470761F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 60);
            this.Snout.setPos(0.0F, 1.0F, -1.6F);
            this.Snout.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.1563815016444822F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 32, 8);
            this.ArmLeft.setPos(0.0F, 5.0F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.06981317007977318F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 53, 19);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.0F, -1.3F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 32, 18);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 2.0F, 0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 44, 10);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 6.0F, -1.7F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.46914448828868976F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 10);
            this.EarLeft.setPos(1.6F, -0.7F, 0.0F);
            this.EarLeft.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.5864306020384839F, 0.8600982340775168F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 28);
            this.Hips.setPos(0.0F, -0.5F, 10.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.43039819087864056F, 0.0F, 0.0F);
            this.Hips.addChild(this.Tail1);
            this.Tail3.addChild(this.Tail4);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Snout.addChild(this.TopSnout);
            this.Neck.addChild(this.NeckLower);
            this.Snout.addChild(this.Nose);
            this.Tail1.addChild(this.Tail2);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck.addChild(this.Head);
            this.Tail2.addChild(this.Tail3);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.Body);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.EarRight);
            this.Hips.addChild(this.ThighRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Snout);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.ForearmRight.addChild(this.HandRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.EarLeft);
            this.Body.addChild(this.Hips);
            this.saveBase();
        }

        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.742F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.624F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.638F;

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
                float speed = 0.75f;
                float degree = 1.0f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.756F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.742F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 1.029F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.104F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 11.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.095F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.095F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.226F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.017F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.017F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.157F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.351F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.291F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.157F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.351F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.291F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}