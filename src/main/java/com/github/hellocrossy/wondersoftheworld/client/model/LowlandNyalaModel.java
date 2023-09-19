package com.github.hellocrossy.wondersoftheworld.client.model;
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
        public ModelRenderer LeftArmBase;
        public ModelRenderer RightArmBase;
        public ModelRenderer BackFur1;
        public ModelRenderer Hips;
        public ModelRenderer BackFur2;
        public ModelRenderer LeftThigh;
        public ModelRenderer BackFur3;
        public ModelRenderer RightThigh;
        public ModelRenderer Tail1;
        public ModelRenderer LeftUpperLeg;
        public ModelRenderer LeftLowerLeg;
        public ModelRenderer LeftFoot;
        public ModelRenderer RightUpperLeg;
        public ModelRenderer RightLowerLeg;
        public ModelRenderer RightFoot;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer NeckBase;
        public ModelRenderer Head;
        public ModelRenderer Beard;
        public ModelRenderer UpperSnout;
        public ModelRenderer LeftHorn1;
        public ModelRenderer RightHorn1;
        public ModelRenderer LeftEar;
        public ModelRenderer RightEar;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer LeftHorn2;
        public ModelRenderer LeftHorn3;
        public ModelRenderer RightHorn2;
        public ModelRenderer RightHorn3;
        public ModelRenderer LeftArm;
        public ModelRenderer LeftForearm;
        public ModelRenderer LeftHand;
        public ModelRenderer RightArm;
        public ModelRenderer RightForearm;
        public ModelRenderer RightHand;

        public Adult() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.RightThigh = new ModelRenderer(this, 43, 0);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-3.0F, 3.5F, 2.9F);
            this.RightThigh.addBox(-1.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightThigh, 0.03490658503988659F, 0.0F, 0.0F);
            this.RightHorn1 = new ModelRenderer(this, 0, 106);
            this.RightHorn1.mirror = true;
            this.RightHorn1.setPos(-1.7F, -2.5F, -0.5F);
            this.RightHorn1.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightHorn1, -0.5235987755982988F, -0.13962634015954636F, -0.4363323129985824F);
            this.LeftFoot = new ModelRenderer(this, 42, 30);
            this.LeftFoot.setPos(-0.1F, 7.2F, -1.5F);
            this.LeftFoot.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LeftHorn1 = new ModelRenderer(this, 0, 106);
            this.LeftHorn1.setPos(1.7F, -2.5F, -0.5F);
            this.LeftHorn1.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftHorn1, -0.5235987755982988F, 0.13962634015954636F, 0.4363323129985824F);
            this.LeftArmBase = new ModelRenderer(this, 26, 0);
            this.LeftArmBase.setPos(3.0F, 0.0F, 0.0F);
            this.LeftArmBase.addBox(-2.0F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArmBase, -0.061086523819801536F, 0.0F, 0.0F);
            this.BackFur2 = new ModelRenderer(this, 61, 10);
            this.BackFur2.setPos(0.0F, -0.4F, 0.1F);
            this.BackFur2.addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 12.5F, 0.0F, 0.0F, 0.0F);
            this.BackFur3 = new ModelRenderer(this, 61, 18);
            this.BackFur3.setPos(0.0F, 0.0F, 0.0F);
            this.BackFur3.addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFur3, -0.14137167606944342F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 97);
            this.Snout.setPos(0.0F, 2.3F, -1.7F);
            this.Snout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.6981317007977318F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 1, 18);
            this.LeftEar.setPos(2.0F, -1.7F, 1.0F);
            this.LeftEar.addBox(-0.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, 0.0F, -0.4363323129985824F, -0.4363323129985824F);
            this.RightEar = new ModelRenderer(this, 1, 18);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-2.0F, -1.7F, 1.0F);
            this.RightEar.addBox(-3.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, 0.0F, 0.4363323129985824F, 0.4363323129985824F);
            this.LeftLowerLeg = new ModelRenderer(this, 42, 21);
            this.LeftLowerLeg.setPos(0.1F, 4.8F, 3.0F);
            this.LeftLowerLeg.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLowerLeg, -0.47123889803846897F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 34, 23);
            this.RightHand.mirror = true;
            this.RightHand.setPos(0.1F, 5.5F, 0.5F);
            this.RightHand.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 16);
            this.Body.setPos(0.0F, -5.0F, 3.0F);
            this.Body.addBox(-3.5F, -0.3F, 0.0F, 7.0F, 11.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.09599310885968812F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 42, 30);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(0.1F, 7.2F, -1.5F);
            this.RightFoot.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.RightArmBase = new ModelRenderer(this, 26, 0);
            this.RightArmBase.mirror = true;
            this.RightArmBase.setPos(-3.0F, 0.0F, 0.0F);
            this.RightArmBase.addBox(-1.1F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArmBase, -0.061086523819801536F, 0.0F, 0.0F);
            this.BackFur1 = new ModelRenderer(this, 61, 14);
            this.BackFur1.setPos(0.0F, -5.0F, -1.5F);
            this.BackFur1.addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackFur1, 0.02617993877991494F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 55);
            this.Neck.setPos(0.0F, -5.0F, -1.0F);
            this.Neck.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6981317007977318F, 0.0F, 0.0F);
            this.RightHorn2 = new ModelRenderer(this, -1, 112);
            this.RightHorn2.mirror = true;
            this.RightHorn2.setPos(0.3F, -2.8F, 0.5F);
            this.RightHorn2.addBox(-0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.2F, 0.0F, 0.2F);
            this.setRotateAngle(RightHorn2, -0.5235987755982988F, 0.0F, 0.6108652381980153F);
            this.RightForearm = new ModelRenderer(this, 26, 19);
            this.RightForearm.mirror = true;
            this.RightForearm.setPos(0.0F, 4.0F, -2.5F);
            this.RightForearm.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 27, 47);
            this.Tail2.setPos(0.0F, 0.0F, 5.0F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.19198621771937624F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 27, 51);
            this.Tail3.setPos(0.0F, 0.0F, 1.5F);
            this.Tail3.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, -0.13962634015954636F, 0.0F, 0.0F);
            this.RightLowerLeg = new ModelRenderer(this, 42, 21);
            this.RightLowerLeg.mirror = true;
            this.RightLowerLeg.setPos(0.1F, 4.8F, 3.0F);
            this.RightLowerLeg.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLowerLeg, -0.47123889803846897F, 0.0F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 26, 12);
            this.LeftArm.setPos(-0.59F, 7.0F, 1.6F);
            this.LeftArm.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArm, -0.04363323129985824F, 0.0F, 0.0F);
            this.LeftUpperLeg = new ModelRenderer(this, 42, 13);
            this.LeftUpperLeg.setPos(-0.5F, 8.0F, -1.3F);
            this.LeftUpperLeg.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftUpperLeg, 0.5235987755982988F, 0.0F, 0.0F);
            this.RightArm = new ModelRenderer(this, 26, 12);
            this.RightArm.mirror = true;
            this.RightArm.setPos(0.49F, 7.0F, 1.6F);
            this.RightArm.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArm, -0.04363323129985824F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 27, 40);
            this.Tail1.setPos(0.0F, 0.2F, 6.0F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.1344640137963142F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 39);
            this.Hips.setPos(0.0F, 0.0F, 12.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.09599310885968812F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 102);
            this.Mouth.setPos(0.0F, 0.0F, -3.0F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.17453292519943295F, 0.0F, 0.0F);
            this.Fluff = new ModelRenderer(this, 62, -1);
            this.Fluff.setPos(0.0F, 4.5F, 0.0F);
            this.Fluff.addBox(0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Fluff, 0.017453292519943295F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 26, 19);
            this.LeftForearm.setPos(0.0F, 4.0F, -2.5F);
            this.LeftForearm.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 0, 68);
            this.NeckBase.setPos(0.0F, 2.0F, -0.5F);
            this.NeckBase.addBox(-1.5F, 0.0F, -4.3F, 3.0F, 4.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.1563815016444822F, 0.0F, 0.0F);
            this.LeftHorn2 = new ModelRenderer(this, -1, 112);
            this.LeftHorn2.setPos(-0.2F, -2.8F, 0.5F);
            this.LeftHorn2.addBox(-0.5F, -3.5F, 0.0F, 1.1F, 4.0F, 1.0F, 0.2F, 0.0F, 0.2F);
            this.setRotateAngle(LeftHorn2, -0.5235987755982988F, 0.0F, -0.6108652381980153F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 6.5F, -6.5F);
            this.Chest.addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.09599310885968812F, 0.0F, 0.0F);
            this.Beard = new ModelRenderer(this, 61, -9);
            this.Beard.setPos(0.0F, 3.8F, -3.5F);
            this.Beard.addBox(0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beard, 0.5745623577986002F, 0.0F, 0.0F);
            this.LeftHorn3 = new ModelRenderer(this, 0, 117);
            this.LeftHorn3.setPos(0.0F, -3.1F, 0.1F);
            this.LeftHorn3.addBox(-0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftHorn3, 0.3490658503988659F, 0.0F, 0.4363323129985824F);
            this.RightHorn3 = new ModelRenderer(this, 0, 117);
            this.RightHorn3.mirror = true;
            this.RightHorn3.setPos(0.0F, -3.1F, 0.1F);
            this.RightHorn3.addBox(-0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightHorn3, 0.3490658503988659F, 0.0F, -0.4363323129985824F);
            this.RightUpperLeg = new ModelRenderer(this, 42, 13);
            this.RightUpperLeg.mirror = true;
            this.RightUpperLeg.setPos(0.5F, 8.0F, -1.3F);
            this.RightUpperLeg.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightUpperLeg, 0.5235987755982988F, 0.0F, 0.0F);
            this.LeftHand = new ModelRenderer(this, 34, 23);
            this.LeftHand.setPos(-0.1F, 5.5F, 0.5F);
            this.LeftHand.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LeftThigh = new ModelRenderer(this, 43, 0);
            this.LeftThigh.setPos(3.0F, 3.5F, 2.9F);
            this.LeftThigh.addBox(-2.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftThigh, 0.03490658503988659F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 81);
            this.Head.setPos(0.0F, 2.5F, -4.8F);
            this.Head.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.6108652381980153F, 0.0F, 0.0F);
            this.UpperSnout = new ModelRenderer(this, 0, 91);
            this.UpperSnout.setPos(0.0F, -2.5F, -2.5F);
            this.UpperSnout.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperSnout, 0.8726646259971648F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 28, 60);
            this.Tail4.setPos(0.0F, 0.0F, 5.0F);
            this.Tail4.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Hips.addChild(this.RightThigh);
            this.Head.addChild(this.RightHorn1);
            this.LeftLowerLeg.addChild(this.LeftFoot);
            this.Head.addChild(this.LeftHorn1);
            this.Chest.addChild(this.LeftArmBase);
            this.Body.addChild(this.BackFur2);
            this.Hips.addChild(this.BackFur3);
            this.UpperSnout.addChild(this.Snout);
            this.Head.addChild(this.LeftEar);
            this.Head.addChild(this.RightEar);
            this.LeftUpperLeg.addChild(this.LeftLowerLeg);
            this.RightForearm.addChild(this.RightHand);
            this.Chest.addChild(this.Body);
            this.RightLowerLeg.addChild(this.RightFoot);
            this.Chest.addChild(this.RightArmBase);
            this.Chest.addChild(this.BackFur1);
            this.Chest.addChild(this.Neck);
            this.RightHorn1.addChild(this.RightHorn2);
            this.RightArm.addChild(this.RightForearm);
            this.Tail1.addChild(this.Tail2);
            this.Tail2.addChild(this.Tail3);
            this.RightUpperLeg.addChild(this.RightLowerLeg);
            this.LeftArmBase.addChild(this.LeftArm);
            this.LeftThigh.addChild(this.LeftUpperLeg);
            this.RightArmBase.addChild(this.RightArm);
            this.Hips.addChild(this.Tail1);
            this.Body.addChild(this.Hips);
            this.UpperSnout.addChild(this.Mouth);
            this.Chest.addChild(this.Fluff);
            this.LeftArm.addChild(this.LeftForearm);
            this.Neck.addChild(this.NeckBase);
            this.LeftHorn1.addChild(this.LeftHorn2);
            this.NeckBase.addChild(this.Beard);
            this.LeftHorn2.addChild(this.LeftHorn3);
            this.RightHorn2.addChild(this.RightHorn3);
            this.RightThigh.addChild(this.RightUpperLeg);
            this.LeftForearm.addChild(this.LeftHand);
            this.Hips.addChild(this.LeftThigh);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.UpperSnout);
            this.Tail3.addChild(this.Tail4);
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
            float speed = 1.0f;
            float degree = 1.0f;

            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.624F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.638F;
            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 1.251F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.088F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 6.2F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.095F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F -0.095F;
            this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F -0.226F;
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
            this.FootRight = new ModelRenderer(this, 52, 19);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.0F, -1.3F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 10);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.6F, -0.7F, 0.0F);
            this.EarRight.addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.5864306020384839F, -0.8600982340775168F, 0.0F);
            this.HandRight = new ModelRenderer(this, 32, 18);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 2.0F, 0.5F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 44, 17);
            this.LowerLegLeft.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3909537457888271F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 11.0F, -5.0F);
            this.Chest.addBox(-2.5F, -3.5F, -1.5F, 5.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.09599310885968812F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 39);
            this.Neck.setPos(0.0F, -2.0F, -1.1F);
            this.Neck.addBox(-1.5F, -2.0F, -3.2F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.7562511968470761F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 28);
            this.Hips.setPos(0.0F, -0.5F, 10.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.43039819087864056F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 16, 41);
            this.NeckLower.setPos(0.0F, 1.8F, -3.0F);
            this.NeckLower.addBox(-1.0F, -2.0F, 0.4F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.1563815016444822F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 48);
            this.Head.setPos(0.0F, 0.0F, -3.0F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.7428121536172364F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 0, 56);
            this.Nose.setPos(0.0F, -1.0F, -2.8F);
            this.Nose.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.27366763203903305F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 32, 18);
            this.HandLeft.setPos(-0.1F, 2.0F, 0.5F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 44, 0);
            this.ThighLeft.setPos(2.0F, 2.5F, 1.6F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.3295181481291434F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 60);
            this.Snout.setPos(0.0F, 1.0F, -1.6F);
            this.Snout.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.1563815016444822F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 10);
            this.Body.setPos(0.0F, -3.0F, 1.0F);
            this.Body.addBox(-3.0F, -1.0F, 0.0F, 6.0F, 8.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.09599310885968812F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 10, 56);
            this.TopSnout.setPos(0.0F, -2.8F, 0.0F);
            this.TopSnout.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.6646214111173737F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 17, 4);
            this.Tail2.setPos(0.0F, 0.0F, 3.0F);
            this.Tail2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.10471975511965977F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 52, 19);
            this.FootLeft.setPos(-0.1F, 3.0F, -1.3F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.017453292519943295F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 32, 8);
            this.ArmLeft.setPos(0.0F, 5.0F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.06981317007977318F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 23, 0);
            this.Tail4.setPos(0.0F, 0.0F, 4.0F);
            this.Tail4.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 44, 10);
            this.UpperLegLeft.setPos(-0.1F, 6.0F, -1.7F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.46914448828868976F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 10);
            this.EarLeft.setPos(1.6F, -0.7F, 0.0F);
            this.EarLeft.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.5864306020384839F, 0.8600982340775168F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 44, 17);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 4.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3909537457888271F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 19, 29);
            this.Tail3.setPos(0.0F, 0.5F, 1.5F);
            this.Tail3.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 32, 8);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 5.0F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.06981317007977318F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 32, 13);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(-0.1F, 3.0F, -2.0F);
            this.ForearmRight.addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 44, 10);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 6.0F, -1.7F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.46914448828868976F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 32, 13);
            this.ForearmLeft.setPos(-0.1F, 3.0F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 32, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.6F, 1.0F, 0.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.03490658503988659F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 17, 0);
            this.Tail1.setPos(0.0F, 0.3F, 4.0F);
            this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.029569755046227F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 2.5F, 1.6F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.3295181481291434F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 32, 0);
            this.ArmBaseLeft.setPos(1.6F, 1.0F, 0.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.03490658503988659F, 0.0F, 0.0F);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarRight);
            this.ForearmRight.addChild(this.HandRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.Neck);
            this.Body.addChild(this.Hips);
            this.Neck.addChild(this.NeckLower);
            this.Neck.addChild(this.Head);
            this.Snout.addChild(this.Nose);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.Body);
            this.Snout.addChild(this.TopSnout);
            this.Tail1.addChild(this.Tail2);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Tail3.addChild(this.Tail4);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Head.addChild(this.EarLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Tail2.addChild(this.Tail3);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.Tail1);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}