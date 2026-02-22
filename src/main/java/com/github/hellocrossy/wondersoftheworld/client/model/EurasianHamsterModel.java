package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.EurasianHamsterEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class EurasianHamsterModel extends ZawaBaseModel<EurasianHamsterEntity> {
    public ModelRenderer Hips;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Hips);
        }

        return this.parts;
    }

    public static class Adult extends EurasianHamsterModel {
        public ModelRenderer Rear;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Chest;
        public ModelRenderer TailBase;
        public ModelRenderer Tail1;
        public ModelRenderer FootLeft;
        public ModelRenderer FootRight;
        public ModelRenderer Neck;
        public ModelRenderer ArmRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer LeftCheek;
        public ModelRenderer RightCheek;
        public ModelRenderer TopSnout;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;


        public Adult() {
            texWidth = 32;
            texHeight = 32;
            this.RightCheek = new ModelRenderer(this, 10, 27);
            this.RightCheek.mirror = true;
            this.RightCheek.setPos(-0.84F, 0.7F, 0.75F);
            this.RightCheek.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightCheek, 0.0F, 0.0F, -0.06702064177855414F);
            this.Chest = new ModelRenderer(this, 1, 10);
            this.Chest.setPos(0.0F, -2.3F, -2.0F);
            this.Chest.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.20001473294434044F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 20);
            this.Head.setPos(0.0F, 0.4F, -2.45F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.8018042343977452F, 0.0F, 0.0F);
            this.LeftCheek = new ModelRenderer(this, 10, 27);
            this.LeftCheek.setPos(0.84F, 0.7F, 0.75F);
            this.LeftCheek.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftCheek, 0.0F, 0.0F, 0.06702064177855414F);
            this.ThighRight = new ModelRenderer(this, 16, 23);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.0F, 0.3F, 0.7F);
            this.ThighRight.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.149923785409474F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 18, 29);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.2F, 2.0F, 0.0F);
            this.FootRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.08377580742467917F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 30);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.8F, -1.15F, 0.3F);
            this.EarRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2617993877991494F, 0.3186971254089062F, -0.3642502295386026F);
            this.Snout = new ModelRenderer(this, 0, 26);
            this.Snout.setPos(0.0F, -0.61F, -1.2F);
            this.Snout.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.23457224414434488F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 28, 28);
            this.HandLeft.setPos(-0.1F, 1.2F, -0.5F);
            this.HandLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.06981317007977318F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 26, 22);
            this.ArmLeft.setPos(1.8F, 2.7F, -1.5F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.10000736647217022F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 28, 26);
            this.ForearmLeft.setPos(0.0F, 2.0F, 0.8F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.3000221077388891F, 0.0F, 0.0F);
            this.Rear = new ModelRenderer(this, 18, 0);
            this.Rear.setPos(0.0F, -2.1F, 2.0F);
            this.Rear.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Rear, -0.23457224414434488F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 19, 9);
            this.Tail1.setPos(0.0F, 0.0F, 1.5F);
            this.Tail1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.18901915665940536F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 28, 26);
            this.ForearmRight.setPos(0.0F, 2.0F, 0.8F);
            this.ForearmRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.3000221077388891F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 28, 28);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 1.2F, -0.5F);
            this.HandRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.06981317007977318F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 0);
            this.Hips.setPos(0.0F, 20.8F, 0.0F);
            this.Hips.addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.04991641477611458F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 9, 16);
            this.Neck.setPos(0.0F, 2.5F, -1.1F);
            this.Neck.addBox(-1.0F, -1.5F, -2.3F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.8583529314571334F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 16, 23);
            this.ThighLeft.setPos(2.0F, 0.3F, 0.7F);
            this.ThighLeft.addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.149923785409474F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 6, 29);
            this.TopSnout.setPos(0.0F, -0.66F, 0.4F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3380702907586876F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 18, 29);
            this.FootLeft.setPos(-0.2F, 2.0F, 0.0F);
            this.FootLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.08377580742467917F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 30);
            this.EarLeft.setPos(0.8F, -1.15F, 0.3F);
            this.EarLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2617993877991494F, -0.3186971254089062F, 0.3642502295386026F);
            this.TailBase = new ModelRenderer(this, 18, 5);
            this.TailBase.setPos(0.0F, 1.8F, 0.8F);
            this.TailBase.addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, -0.5955063221383375F, -0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 26, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.8F, 2.7F, -1.5F);
            this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.10000736647217022F, 0.0F, 0.0F);
            this.Head.addChild(this.RightCheek);
            this.Hips.addChild(this.Chest);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.LeftCheek);
            this.Hips.addChild(this.ThighRight);
            this.ThighRight.addChild(this.FootRight);
            this.Head.addChild(this.EarRight);
            this.Head.addChild(this.Snout);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Hips.addChild(this.Rear);
            this.TailBase.addChild(this.Tail1);
            this.ArmRight.addChild(this.ForearmRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Neck);
            this.Hips.addChild(this.ThighLeft);
            this.Snout.addChild(this.TopSnout);
            this.ThighLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarLeft);
            this.Rear.addChild(this.TailBase);
            this.Chest.addChild(this.ArmRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(EurasianHamsterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.802F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.802F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.262F;
            this.EarRight.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.262F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.858F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 2.0f;
            float degree = 0.6f;
            this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.100F;
            this.HandLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.070F;
            this.ThighLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.150F;
            this.FootLeft.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.084F;

            this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.100F;
            this.HandRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.070F;
            this.ThighRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.150F;
            this.FootRight.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.084F;

            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.858F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.802F;
            this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.262F;
            this.EarRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.262F;
            this.Hips.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 20.8F;
        }
    }

    public static class Child extends EurasianHamsterModel {
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
        public ModelRenderer RightCheek;
        public ModelRenderer LeftCheek;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer TopSnout;
        public ModelRenderer TopSnout_1;
        public ModelRenderer HandRight;
        public ModelRenderer Tail2;
        public ModelRenderer FootLeft;
        public ModelRenderer FootRight;


        public Child() {
            texWidth = 32;
            texHeight = 32;
            this.Hips = new ModelRenderer(this, 2, 1);
            this.Hips.setPos(0.0F, 21.8F, 0.0F);
            this.Hips.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.09093165469469484F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 18, 5);
            this.Tail1.setPos(0.0F, -1.8F, 1.3F);
            this.Tail1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.6812019857480981F, 0.0F, 0.0F);
            this.RightCheek = new ModelRenderer(this, 10, 27);
            this.RightCheek.mirror = true;
            this.RightCheek.setPos(-0.84F, 0.7F, 0.75F);
            this.RightCheek.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightCheek, 0.0F, 0.0F, -0.06702064177855414F);
            this.Chest = new ModelRenderer(this, 2, 10);
            this.Chest.setPos(0.0F, -1.9F, -1.3F);
            this.Chest.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 2.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.18203784630933073F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 10, 17);
            this.Neck.setPos(0.0F, 1.8F, -0.7F);
            this.Neck.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.42149700769872783F, 0.0F, 0.0F);
            this.LeftCheek = new ModelRenderer(this, 10, 27);
            this.LeftCheek.setPos(0.84F, 0.7F, 0.75F);
            this.LeftCheek.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftCheek, 0.0F, 0.0F, 0.06702064177855414F);
            this.TopSnout = new ModelRenderer(this, 6, 29);
            this.TopSnout.setPos(0.0F, -0.66F, 0.4F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3380702907586876F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 27, 23);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-0.8F, 1.7F, -1.2F);
            this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.135961148064568F, 0.0F, 0.0F);
            this.TopSnout_1 = new ModelRenderer(this, 0, 27);
            this.TopSnout_1.setPos(0.0F, 1.7F, -0.1F);
            this.TopSnout_1.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout_1, -0.6002187191082056F, 0.0F, 0.0F);
            this.Belly = new ModelRenderer(this, 0, 5);
            this.Belly.setPos(0.0F, 1.4F, -1.9F);
            this.Belly.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Belly, -0.0911061832922575F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 17, 24);
            this.ThighLeft.setPos(2.2F, -1.6F, 0.7F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.09093165469469484F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 28, 28);
            this.HandRight.setPos(0.1F, 1.6F, -0.2F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.09093165469469484F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 19, 29);
            this.FootLeft.setPos(-0.6F, 2.8F, 0.3F);
            this.FootLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 19, 29);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.6F, 2.8F, 0.3F);
            this.FootRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 20);
            this.Head.setPos(0.0F, 0.0F, -1.85F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.41102502552885917F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 30);
            this.EarLeft.setPos(0.8F, -1.15F, 0.3F);
            this.EarLeft.addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.24579244142247136F, -0.3186971254089062F, 0.3642502295386026F);
            this.HandLeft = new ModelRenderer(this, 28, 28);
            this.HandLeft.setPos(-0.1F, 1.6F, -0.2F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.09093165469469484F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 27, 23);
            this.ArmLeft.setPos(0.8F, 1.7F, -1.2F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.135961148064568F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 19, 9);
            this.Tail2.setPos(0.0F, 1.4F, 2.0F);
            this.Tail2.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.3440043795891158F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 30);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.8F, -1.15F, 0.3F);
            this.EarRight.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.25987911549514775F, 0.3186971254089062F, -0.3642502295386026F);
            this.Snout = new ModelRenderer(this, 0, 26);
            this.Snout.setPos(0.0F, -0.11F, -0.9F);
            this.Snout.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.23457224414434488F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 17, 24);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, -1.6F, 0.7F);
            this.ThighRight.addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.09093165469469484F, 0.0F, 0.0F);
            this.Hips.addChild(this.Tail1);
            this.Head.addChild(this.RightCheek);
            this.Hips.addChild(this.Chest);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.LeftCheek);
            this.Snout.addChild(this.TopSnout);
            this.Chest.addChild(this.ArmRight);
            this.TopSnout.addChild(this.TopSnout_1);
            this.Hips.addChild(this.Belly);
            this.Hips.addChild(this.ThighLeft);
            this.ArmRight.addChild(this.HandRight);
            this.ThighLeft.addChild(this.FootLeft);
            this.ThighRight.addChild(this.FootRight);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.EarLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.ArmLeft);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.EarRight);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.ThighRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(EurasianHamsterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Hips.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 21.8F;
        }
    }
}

