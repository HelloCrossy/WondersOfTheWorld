package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.KirksDikDikEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class KirksDikDikModel extends ZawaBaseModel<KirksDikDikEntity> {
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

    public static class Adult extends KirksDikDikModel {
        public ModelRenderer Neck;
        public ModelRenderer LeftArmBase;
        public ModelRenderer Body;
        public ModelRenderer RightArmBase;
        public ModelRenderer Head;
        public ModelRenderer LeftEar;
        public ModelRenderer Muzzle;
        public ModelRenderer Tuft;
        public ModelRenderer RightEar;
        public ModelRenderer RightHorn;
        public ModelRenderer LeftHorn;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;
        public ModelRenderer LeftArm;
        public ModelRenderer LeftForearm;
        public ModelRenderer LeftHand;
        public ModelRenderer Hips;
        public ModelRenderer RightThigh;
        public ModelRenderer Tail;
        public ModelRenderer LeftThigh;
        public ModelRenderer RightUpperLeg;
        public ModelRenderer RightLeg;
        public ModelRenderer RightFoot;
        public ModelRenderer LeftUpperLeg;
        public ModelRenderer LeftLeg;
        public ModelRenderer LeftFoot;
        public ModelRenderer RightArm;
        public ModelRenderer RightForeArm;
        public ModelRenderer RightHand;


        public Adult() {
            texWidth = 48;
            texHeight = 32;
            this.LeftThigh = new ModelRenderer(this, 18, 16);
            this.LeftThigh.setPos(1.1F, 1.4F, 1.1F);
            this.LeftThigh.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftThigh, 0.16999506514950605F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 7);
            this.Body.setPos(0.0F, -1.9F, 0.0F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.35726888589901434F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 36, 12);
            this.LeftForearm.setPos(-0.02F, 2.0F, -1.0F);
            this.LeftForearm.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this, 36, 16);
            this.LeftLeg.setPos(-0.02F, 1.5F, 1.8F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, -0.38816122164879724F, 0.0F, 0.0F);
            this.LeftUpperLeg = new ModelRenderer(this, 28, 16);
            this.LeftUpperLeg.setPos(0.3F, 3.0F, -1.2F);
            this.LeftUpperLeg.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftUpperLeg, 0.5455899281681691F, 0.0F, 0.0F);
            this.LeftHorn = new ModelRenderer(this, 0, 25);
            this.LeftHorn.setPos(-0.3F, -1.0F, 0.0F);
            this.LeftHorn.addBox(-1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftHorn, -0.8210028961170991F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 0, 7);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-1.8F, -0.9F, 0.4F);
            this.RightEar.addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, -0.735132662297884F, -0.5585053606381855F, -0.10471975511965977F);
            this.RightHand = new ModelRenderer(this, 31, 0);
            this.RightHand.mirror = true;
            this.RightHand.setPos(0.1F, 1.8F, 0.7F);
            this.RightHand.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.RightUpperLeg = new ModelRenderer(this, 28, 16);
            this.RightUpperLeg.mirror = true;
            this.RightUpperLeg.setPos(-0.3F, 3.0F, -1.2F);
            this.RightUpperLeg.addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightUpperLeg, 0.5455899281681691F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 36, 16);
            this.RightLeg.mirror = true;
            this.RightLeg.setPos(0.02F, 1.5F, 1.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, -0.38816122164879724F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 16, 4);
            this.Neck.setPos(0.0F, 0.6F, -0.1F);
            this.Neck.addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.934623801127158F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 18);
            this.Hips.setPos(0.0F, 0.1F, 5.0F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.47472956985826303F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 18, 16);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-1.1F, 1.4F, 1.1F);
            this.RightThigh.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightThigh, 0.16999506514950605F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 10, 0);
            this.TopSnout.setPos(0.0F, -1.8F, -0.2F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.29600782515927176F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 31, 0);
            this.LeftFoot.setPos(0.1F, 3.8F, -0.1F);
            this.LeftFoot.addBox(-0.7F, -0.2F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Tuft = new ModelRenderer(this, 24, 0);
            this.Tuft.setPos(0.0F, -1.4F, -1.9F);
            this.Tuft.addBox(-1.0F, -0.3F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tuft, 0.1787217114094777F, 0.0F, 0.0F);
            this.RightArmBase = new ModelRenderer(this, 20, 11);
            this.RightArmBase.mirror = true;
            this.RightArmBase.setPos(-1.1F, -0.5F, 0.3F);
            this.RightArmBase.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArmBase, 0.279950827998857F, 0.0F, 0.0F);
            this.RightHorn = new ModelRenderer(this, 0, 25);
            this.RightHorn.mirror = true;
            this.RightHorn.setPos(0.3F, -1.0F, 0.0F);
            this.RightHorn.addBox(0.0F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightHorn, -0.8210028961170991F, 0.0F, -0.0F);
            this.RightArm = new ModelRenderer(this, 28, 12);
            this.RightArm.mirror = true;
            this.RightArm.setPos(-0.28F, 3.0F, 0.5F);
            this.RightArm.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArm, -0.06998770699971425F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 0.1F, -3.8F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.2372638960861357F, -0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 14, 4);
            this.Mouth.setPos(0.0F, -0.3F, -0.2F);
            this.Mouth.addBox(-0.5F, -0.2F, -1.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.06981317007977318F, 0.0F, 0.0F);
            this.LeftArmBase = new ModelRenderer(this, 20, 11);
            this.LeftArmBase.setPos(1.1F, -0.5F, 0.3F);
            this.LeftArmBase.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArmBase, 0.279950827998857F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 31, 0);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(-0.1F, 3.8F, -0.1F);
            this.RightFoot.addBox(-0.3F, -0.2F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Muzzle = new ModelRenderer(this, 16, 0);
            this.Muzzle.setPos(0.0F, 0.9F, -1.3F);
            this.Muzzle.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Muzzle, 0.13962634015954636F, 0.0F, 0.0F);
            this.RightForeArm = new ModelRenderer(this, 36, 12);
            this.RightForeArm.mirror = true;
            this.RightForeArm.setPos(0.02F, 2.0F, -1.0F);
            this.RightForeArm.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 28, 12);
            this.LeftArm.setPos(0.28F, 3.0F, 0.5F);
            this.LeftArm.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArm, -0.06998770699971425F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 0, 7);
            this.LeftEar.setPos(1.8F, -0.9F, 0.4F);
            this.LeftEar.addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, -0.735132662297884F, 0.5585053606381855F, 0.10821041029469708F);
            this.LeftHand = new ModelRenderer(this, 31, 0);
            this.LeftHand.setPos(-0.1F, 1.8F, 0.7F);
            this.LeftHand.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 12, 18);
            this.Tail.setPos(0.0F, 0.4F, 2.5F);
            this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.4199262087087719F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 28, 4);
            this.Chest.setPos(0.0F, 17.0F, -3.0F);
            this.Chest.addBox(-1.5F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.20996310435438595F, 0.0F, 0.0F);
            this.Hips.addChild(this.LeftThigh);
            this.Chest.addChild(this.Body);
            this.LeftArm.addChild(this.LeftForearm);
            this.LeftUpperLeg.addChild(this.LeftLeg);
            this.LeftThigh.addChild(this.LeftUpperLeg);
            this.Head.addChild(this.LeftHorn);
            this.Head.addChild(this.RightEar);
            this.RightForeArm.addChild(this.RightHand);
            this.RightThigh.addChild(this.RightUpperLeg);
            this.RightUpperLeg.addChild(this.RightLeg);
            this.Chest.addChild(this.Neck);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.RightThigh);
            this.Muzzle.addChild(this.TopSnout);
            this.LeftLeg.addChild(this.LeftFoot);
            this.Head.addChild(this.Tuft);
            this.Chest.addChild(this.RightArmBase);
            this.Head.addChild(this.RightHorn);
            this.RightArmBase.addChild(this.RightArm);
            this.Neck.addChild(this.Head);
            this.Muzzle.addChild(this.Mouth);
            this.Chest.addChild(this.LeftArmBase);
            this.RightLeg.addChild(this.RightFoot);
            this.Head.addChild(this.Muzzle);
            this.RightArm.addChild(this.RightForeArm);
            this.LeftArmBase.addChild(this.LeftArm);
            this.Head.addChild(this.LeftEar);
            this.LeftForearm.addChild(this.LeftHand);
            this.Hips.addChild(this.Tail);
            this.saveBase();

        }

        @Override
        public void setupAnim(KirksDikDikEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            //    this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * - 1.451F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            //    this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.055F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.934F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.237F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 0.55f;
                float degree = 0.45f;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.237F;
                this.Neck.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.934F;
                this.Body.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.357F;
                this.Body.y = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F - 1.9F;

                this.LeftArmBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.279F;
                this.LeftArm.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.069F;
                this.LeftForearm.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
                this.RightArmBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.279F;
                this.RightArm.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.069F;
                this.RightForeArm.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F;

                this.LeftThigh.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.169F;
                this.LeftThigh.z = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 1.1F;
                this.LeftUpperLeg.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.545F;
                this.LeftLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.388F;
                this.RightThigh.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.169F;
                this.RightThigh.z = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.1F;
                this.RightUpperLeg.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.545F;
                this.RightLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.388F;
        }
    }

    public static class Child extends KirksDikDikModel {
        public ModelRenderer Neck;
        public ModelRenderer LeftArmBase;
        public ModelRenderer Body;
        public ModelRenderer RightArmBase;
        public ModelRenderer Head;
        public ModelRenderer LeftEar;
        public ModelRenderer Muzzle;
        public ModelRenderer Tuft;
        public ModelRenderer RightEar;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;
        public ModelRenderer LeftArm;
        public ModelRenderer LeftForearm;
        public ModelRenderer LeftHand;
        public ModelRenderer LeftThigh;
        public ModelRenderer RightThigh;
        public ModelRenderer Tail;
        public ModelRenderer LeftUpperLeg;
        public ModelRenderer LeftLeg;
        public ModelRenderer LeftFoot;
        public ModelRenderer RightUpperLeg;
        public ModelRenderer RightLeg;
        public ModelRenderer RightFoot;
        public ModelRenderer RightArm;
        public ModelRenderer RightForeArm;
        public ModelRenderer RightHand;


        public Child() {
            texWidth = 48;
            texHeight = 32;
            this.LeftHand = new ModelRenderer(this, 31, 0);
            this.LeftHand.setPos(-0.1F, 1.8F, 0.7F);
            this.LeftHand.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 31, 0);
            this.LeftFoot.setPos(0.1F, 2.8F, -0.1F);
            this.LeftFoot.addBox(-0.7F, -0.2F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.0642281176385243F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 14, 4);
            this.Mouth.setPos(0.0F, -0.4F, -0.2F);
            this.Mouth.addBox(-0.5F, -0.2F, -1.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.06981317007977318F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 10, 0);
            this.TopSnout.setPos(0.0F, -1.8F, -0.2F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.29600782515927176F, 0.0F, 0.0F);
            this.RightArmBase = new ModelRenderer(this, 20, 11);
            this.RightArmBase.mirror = true;
            this.RightArmBase.setPos(-0.8F, 0.3F, 0.3F);
            this.RightArmBase.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArmBase, 0.279950827998857F, 0.0F, 0.0F);
            this.LeftUpperLeg = new ModelRenderer(this, 28, 16);
            this.LeftUpperLeg.setPos(0.3F, 1.9F, -1.2F);
            this.LeftUpperLeg.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftUpperLeg, 0.5455899281681691F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 12, 18);
            this.Tail.setPos(0.0F, 0.1F, 5.0F);
            this.Tail.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.5780530296183942F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 28, 4);
            this.Chest.setPos(0.0F, 17.7F, -3.0F);
            this.Chest.addBox(-1.5F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.20996310435438595F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 0, 7);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-1.5F, -0.3F, 0.1F);
            this.RightEar.addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightEar, -0.735132662297884F, -0.5585053606381855F, -0.10471975511965977F);
            this.Muzzle = new ModelRenderer(this, 16, 0);
            this.Muzzle.setPos(0.0F, 1.1F, -1.1F);
            this.Muzzle.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Muzzle, 0.13962634015954636F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 36, 16);
            this.RightLeg.mirror = true;
            this.RightLeg.setPos(0.02F, 1.5F, 1.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, -0.38816122164879724F, 0.0F, 0.0F);
            this.RightForeArm = new ModelRenderer(this, 36, 12);
            this.RightForeArm.mirror = true;
            this.RightForeArm.setPos(0.02F, 2.0F, -1.0F);
            this.RightForeArm.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 28, 12);
            this.LeftArm.setPos(0.28F, 1.4F, 0.5F);
            this.LeftArm.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArm, -0.06998770699971425F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 31, 0);
            this.RightHand.mirror = true;
            this.RightHand.setPos(0.1F, 1.8F, 0.7F);
            this.RightHand.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 7);
            this.Body.setPos(0.0F, -1.9F, 0.0F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2609267198442009F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 18, 16);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-1.1F, 2.4F, 4.0F);
            this.RightThigh.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightThigh, -0.27960175415897487F, 0.0F, 0.0F);
            this.Tuft = new ModelRenderer(this, 24, 0);
            this.Tuft.setPos(0.0F, -1.4F, -1.9F);
            this.Tuft.addBox(-1.0F, -0.3F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tuft, 0.1787217114094777F, 0.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this, 36, 16);
            this.LeftLeg.setPos(-0.02F, 1.5F, 1.8F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, -0.38816122164879724F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 16, 4);
            this.Neck.setPos(0.0F, 0.9F, 0.2F);
            this.Neck.addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.934623801127158F, 0.0F, 0.0F);
            this.LeftThigh = new ModelRenderer(this, 18, 16);
            this.LeftThigh.setPos(1.1F, 2.4F, 4.0F);
            this.LeftThigh.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftThigh, -0.27960175415897487F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 36, 12);
            this.LeftForearm.setPos(-0.02F, 2.0F, -1.0F);
            this.LeftForearm.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 31, 0);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(-0.1F, 2.8F, -0.1F);
            this.RightFoot.addBox(-0.3F, -0.2F, -1.3F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.0642281176385243F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 0.1F, -3.8F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.2372638960861357F, -0.0F, 0.0F);
            this.LeftArmBase = new ModelRenderer(this, 20, 11);
            this.LeftArmBase.setPos(0.8F, 0.3F, 0.3F);
            this.LeftArmBase.addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftArmBase, 0.279950827998857F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 0, 7);
            this.LeftEar.setPos(1.5F, -0.2F, 0.1F);
            this.LeftEar.addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftEar, -0.735132662297884F, 0.5585053606381855F, 0.10821041029469708F);
            this.RightUpperLeg = new ModelRenderer(this, 28, 16);
            this.RightUpperLeg.mirror = true;
            this.RightUpperLeg.setPos(-0.3F, 1.9F, -1.2F);
            this.RightUpperLeg.addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightUpperLeg, 0.5455899281681691F, 0.0F, 0.0F);
            this.RightArm = new ModelRenderer(this, 28, 12);
            this.RightArm.mirror = true;
            this.RightArm.setPos(-0.28F, 1.4F, 0.5F);
            this.RightArm.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightArm, -0.06998770699971425F, 0.0F, 0.0F);
            this.LeftForearm.addChild(this.LeftHand);
            this.LeftLeg.addChild(this.LeftFoot);
            this.Muzzle.addChild(this.Mouth);
            this.Muzzle.addChild(this.TopSnout);
            this.Chest.addChild(this.RightArmBase);
            this.LeftThigh.addChild(this.LeftUpperLeg);
            this.Body.addChild(this.Tail);
            this.Head.addChild(this.RightEar);
            this.Head.addChild(this.Muzzle);
            this.RightUpperLeg.addChild(this.RightLeg);
            this.RightArm.addChild(this.RightForeArm);
            this.LeftArmBase.addChild(this.LeftArm);
            this.RightForeArm.addChild(this.RightHand);
            this.Chest.addChild(this.Body);
            this.Body.addChild(this.RightThigh);
            this.Head.addChild(this.Tuft);
            this.LeftUpperLeg.addChild(this.LeftLeg);
            this.Chest.addChild(this.Neck);
            this.Body.addChild(this.LeftThigh);
            this.LeftArm.addChild(this.LeftForearm);
            this.RightLeg.addChild(this.RightFoot);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.LeftArmBase);
            this.Head.addChild(this.LeftEar);
            this.RightThigh.addChild(this.RightUpperLeg);
            this.RightArmBase.addChild(this.RightArm);
            this.saveBase();

        }

        @Override
        public void setupAnim(KirksDikDikEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            //    this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * - 1.451F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            //    this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.055F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.934F;
            this.Head.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.237F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 0.45f;
                float degree = 0.45f;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.237F;
                this.Neck.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.934F;
                this.Body.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.357F;
                this.Body.y = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F - 1.9F;

                this.LeftArmBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.279F;
                this.LeftArm.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.069F;
                this.LeftForearm.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
                this.RightArmBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.279F;
                this.RightArm.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.069F;
                this.RightForeArm.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F;

                this.LeftThigh.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.279F;
                this.LeftThigh.z = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 4.0F;
                this.LeftUpperLeg.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.545F;
                this.LeftLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.388F;
                this.RightThigh.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.279F;
                this.RightThigh.z = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 4.0F;
                this.RightUpperLeg.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.545F;
                this.RightLeg.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.388F;
        }
    }
}

