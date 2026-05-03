package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.RufousElephantShrewEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class RufousElephantShrewModel extends ZawaBaseModel<RufousElephantShrewEntity> {
    public ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends RufousElephantShrewModel {
        public ModelRenderer Rear;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Chest;
        public ModelRenderer TailBase;
        public ModelRenderer Tail1;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer FootLeft;
        public ModelRenderer FootLeft_1;
        public ModelRenderer FootRight;
        public ModelRenderer FootRight_1;
        public ModelRenderer Neck;
        public ModelRenderer ArmRight;
        public ModelRenderer ChestUnder;
        public ModelRenderer ArmLeft;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer TopSnout;
        public ModelRenderer Nose;
        public ModelRenderer Nose_1;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;


        public Adult() {
            texWidth = 32;
            texHeight = 32;
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 19.0F, -0.1F);
            this.Body.addBox(-2.5F, -2.4F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.04991641477611458F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 24, 12);
            this.Tail3.setPos(0.0F, 0.0F, 2.0F);
            this.Tail3.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.5445427399380363F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 25, 21);
            this.FootLeft.setPos(0.2F, 2.5F, 0.9F);
            this.FootLeft.addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.32253683777906883F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 8, 28);
            this.TopSnout.setPos(0.0F, 0.0F, -1.8F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.5335471470083444F, 0.0F, 0.0F);
            this.ChestUnder = new ModelRenderer(this, 0, 16);
            this.ChestUnder.setPos(0.0F, 4.0F, -2.0F);
            this.ChestUnder.addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ChestUnder, -0.1429424584146426F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 13, 29);
            this.Nose.setPos(0.0F, 0.0F, -1.8F);
            this.Nose.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, -0.14259340121951725F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 15, 19);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.7F, -0.3F, 1.2F);
            this.ThighRight.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.149923785409474F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 9);
            this.Chest.setPos(0.0F, -2.3F, -1.7F);
            this.Chest.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.20001473294434044F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 18, 25);
            this.ForearmRight.setPos(0.0F, 2.0F, 0.5F);
            this.ForearmRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3000000035018414F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 28);
            this.Snout.setPos(0.0F, 0.1F, -1.4F);
            this.Snout.addBox(-0.5F, 0.0F, -2.3F, 1.0F, 1.0F, 3.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0781907508222411F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 26, 9);
            this.Tail2.setPos(0.0F, 0.5F, 1.5F);
            this.Tail2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.3790855015489435F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 26, 6);
            this.Tail1.setPos(0.0F, 0.0F, 1.5F);
            this.Tail1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.4091051859885346F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 15, 19);
            this.ThighLeft.setPos(1.7F, -0.3F, 1.2F);
            this.ThighLeft.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.149923785409474F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 14, 25);
            this.ArmLeft.setPos(1.01F, 3.0F, -2.5F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.10000736647217022F, 0.0F, 0.0F);
            this.FootLeft_1 = new ModelRenderer(this, 25, 25);
            this.FootLeft_1.setPos(0.01F, 2.4F, -0.5F);
            this.FootLeft_1.addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft_1, 0.38117991129872264F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 10, 22);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.8F, -1.1F, 0.5F);
            this.EarRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.500909508638178F, -0.3186971254089062F, -0.3642502295386026F);
            this.ForearmLeft = new ModelRenderer(this, 18, 25);
            this.ForearmLeft.setPos(0.0F, 2.0F, 0.5F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3000000035018414F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 17, 28);
            this.HandLeft.setPos(-0.1F, 2.3F, -0.5F);
            this.HandLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 18, 5);
            this.TailBase.setPos(0.0F, 1.5F, 0.7F);
            this.TailBase.addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, -0.7127924691776453F, -0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 17, 28);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 2.3F, -0.5F);
            this.HandRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 25, 21);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.2F, 2.5F, 0.9F);
            this.FootRight.addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.32253683777906883F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 10, 22);
            this.EarLeft.setPos(0.8F, -1.1F, 0.5F);
            this.EarLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.500909508638178F, 0.3186971254089062F, 0.3642502295386026F);
            this.Head = new ModelRenderer(this, 0, 22);
            this.Head.setPos(0.0F, -0.1F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.6065019150680295F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 14, 25);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.01F, 3.0F, -2.5F);
            this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.10000736647217022F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 24, 16);
            this.Tail4.setPos(0.0F, 0.0F, 3.0F);
            this.Tail4.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail4, 0.4363323129985824F, 0.0F, 0.0F);
            this.FootRight_1 = new ModelRenderer(this, 25, 25);
            this.FootRight_1.mirror = true;
            this.FootRight_1.setPos(-0.01F, 2.4F, -0.5F);
            this.FootRight_1.addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight_1, 0.38117991129872264F, 0.0F, 0.0F);
            this.Rear = new ModelRenderer(this, 18, 0);
            this.Rear.setPos(0.0F, -2.2F, 2.0F);
            this.Rear.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Rear, -0.11728612207217244F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 14, 9);
            this.Neck.setPos(0.0F, 1.8F, -3.0F);
            this.Neck.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.5064945569182376F, 0.0F, 0.0F);
            this.Nose_1 = new ModelRenderer(this, 5, 28);
            this.Nose_1.setPos(0.0F, 0.4F, 0.0F);
            this.Nose_1.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose_1, -0.14259340121951725F, 0.0F, 0.0F);
            this.Tail2.addChild(this.Tail3);
            this.ThighLeft.addChild(this.FootLeft);
            this.Snout.addChild(this.TopSnout);
            this.Chest.addChild(this.ChestUnder);
            this.Snout.addChild(this.Nose);
            this.Body.addChild(this.ThighRight);
            this.Body.addChild(this.Chest);
            this.ArmRight.addChild(this.ForearmRight);
            this.Head.addChild(this.Snout);
            this.Tail1.addChild(this.Tail2);
            this.TailBase.addChild(this.Tail1);
            this.Body.addChild(this.ThighLeft);
            this.Chest.addChild(this.ArmLeft);
            this.FootLeft.addChild(this.FootLeft_1);
            this.Head.addChild(this.EarRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Rear.addChild(this.TailBase);
            this.ForearmRight.addChild(this.HandRight);
            this.ThighRight.addChild(this.FootRight);
            this.Head.addChild(this.EarLeft);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.ArmRight);
            this.Tail3.addChild(this.Tail4);
            this.FootRight.addChild(this.FootRight_1);
            this.Body.addChild(this.Rear);
            this.Chest.addChild(this.Neck);
            this.Snout.addChild(this.Nose_1);
            this.saveBase();

        }

        @Override
        public void setupAnim(RufousElephantShrewEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.606F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.606F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.5F;
            this.EarRight.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.5F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.506F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 2.0f;
            float degree = 0.6f;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.100F;
            this.HandLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.182F;
            this.ThighLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.149F;
            this.FootLeft.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.322F;

            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.100F;
            this.HandRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.182F;
            this.ThighRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.149F;
            this.FootRight.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.322F;

            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.506F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.606F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.5F;
            this.EarRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.5F;
            this.Body.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 19.0F;
        }
    }

    public static class Child extends RufousElephantShrewModel {
        public ModelRenderer Belly;
        public ModelRenderer Chest;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmRight;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer TopSnout;
        public ModelRenderer Nose;
        public ModelRenderer Nose_1;
        public ModelRenderer HandRight;
        public ModelRenderer Tail2;
        public ModelRenderer FootLeft;
        public ModelRenderer FootRight;


        public Child() {
            texWidth = 32;
            texHeight = 32;
            this.ThighRight = new ModelRenderer(this, 4, 16);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, -1.6F, 0.7F);
            this.ThighRight.addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.09093165469469484F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 0, 16);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-0.8F, 1.7F, -1.2F);
            this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.135961148064568F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 16);
            this.ArmLeft.setPos(0.8F, 1.7F, -1.2F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.135961148064568F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 12, 12);
            this.TopSnout.setPos(0.0F, 0.0F, -1.8F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.5335471470083444F, 0.0F, 0.0F);
            this.Belly = new ModelRenderer(this, 0, 12);
            this.Belly.setPos(0.0F, 1.4F, -1.9F);
            this.Belly.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Belly, -0.0911061832922575F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 12, 0);
            this.Chest.setPos(0.0F, -1.9F, -1.3F);
            this.Chest.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 2.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.18203784630933073F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 2, 21);
            this.FootLeft.setPos(-0.6F, 2.8F, 0.3F);
            this.FootLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 22, 0);
            this.Neck.setPos(0.0F, 1.8F, -0.7F);
            this.Neck.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.42149700769872783F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 0, 19);
            this.HandRight.setPos(0.1F, 1.6F, -0.2F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.09093165469469484F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 12, 15);
            this.Snout.setPos(0.0F, -0.2F, -0.9F);
            this.Snout.addBox(-0.5F, 0.0F, -2.3F, 1.0F, 1.0F, 3.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.19547687289441354F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 4, 16);
            this.ThighLeft.setPos(2.2F, -1.6F, 0.7F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.09093165469469484F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 13, 6);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.8F, -1.15F, 0.3F);
            this.EarRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2598795316140681F, 0.3186971254089062F, -0.3642502295386026F);
            this.Tail2 = new ModelRenderer(this, 19, 9);
            this.Tail2.setPos(0.0F, 1.4F, 2.0F);
            this.Tail2.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.3440043795891158F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 13, 6);
            this.EarLeft.setPos(0.8F, -1.15F, 0.3F);
            this.EarLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.24574235734922104F, -0.3186971254089062F, 0.3642502295386026F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, 0.0F, -1.85F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.41102502552885917F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 18, 19);
            this.Nose.setPos(0.0F, 0.0F, -1.8F);
            this.Nose.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, -0.14259340121951725F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 6);
            this.Body.setPos(0.0F, 21.8F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.09093165469469484F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 18, 5);
            this.Tail1.setPos(0.0F, -1.8F, 1.3F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.6812019857480981F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 0, 19);
            this.HandLeft.setPos(-0.1F, 1.6F, -0.2F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.09093165469469484F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 2, 21);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.6F, 2.8F, 0.3F);
            this.FootRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Nose_1 = new ModelRenderer(this, 12, 19);
            this.Nose_1.setPos(0.0F, 0.4F, 0.0F);
            this.Nose_1.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose_1, -0.14259340121951725F, 0.0F, 0.0F);
            this.Body.addChild(this.ThighRight);
            this.Chest.addChild(this.ArmRight);
            this.Chest.addChild(this.ArmLeft);
            this.Snout.addChild(this.TopSnout);
            this.Body.addChild(this.Belly);
            this.Body.addChild(this.Chest);
            this.ThighLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Neck);
            this.ArmRight.addChild(this.HandRight);
            this.Head.addChild(this.Snout);
            this.Body.addChild(this.ThighLeft);
            this.Head.addChild(this.EarRight);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.EarLeft);
            this.Neck.addChild(this.Head);
            this.Snout.addChild(this.Nose);
            this.Body.addChild(this.Tail1);
            this.ArmLeft.addChild(this.HandLeft);
            this.ThighRight.addChild(this.FootRight);
            this.Snout.addChild(this.Nose_1);
            this.saveBase();

        }

        @Override
        public void setupAnim(RufousElephantShrewEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.411F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.411F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.245F;
            this.EarRight.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.245F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.421F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 8.0f, degree = 0.8f;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.135F;
            this.HandLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.090F;
            this.ThighLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.090F;
            this.FootLeft.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;

            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.135F;
            this.HandRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.090F;
            this.ThighRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.090F;
            this.FootRight.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;

            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.421F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.411F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.245F;
            this.EarRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.245F;
            this.Body.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 21.8F;
        }
    }
}


