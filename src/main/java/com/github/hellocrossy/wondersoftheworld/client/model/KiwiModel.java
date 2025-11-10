package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.KiwiEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class KiwiModel extends ZawaBaseModel<KiwiEntity> {
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

    public static class Adult extends KiwiModel {

        public ModelRenderer Chest;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Beak;
        public ModelRenderer Mouth;
        public ModelRenderer Tail2;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1L;
        public ModelRenderer Toe2L;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1R;
        public ModelRenderer Toe2R;

        public Adult() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.Tail2 = new ModelRenderer(this, 9, 16);
            this.Tail2.setPos(0.0F, 0.0F, 2.0F);
            this.Tail2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.5864306020384839F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 18);
            this.Head.setPos(0.0F, -2.7F, 0.6F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 7, 24);
            this.FootLeft.setPos(0.0F, 1.8F, 0.0F);
            this.FootLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.33161255787892263F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 18.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.15707963267948966F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 14);
            this.Neck.setPos(0.0F, -2.0F, 0.2F);
            this.Neck.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.6829473549475088F, 0.0F, 0.0F);
            this.Toe1R = new ModelRenderer(this, 7, 27);
            this.Toe1R.mirror = true;
            this.Toe1R.setPos(-0.2F, 0.1F, -1.3F);
            this.Toe1R.addBox(0.0F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1R, 0.0F, -0.4886921905584123F, 0.0F);
            this.FootRight = new ModelRenderer(this, 7, 24);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 1.8F, 0.0F);
            this.FootRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.33161255787892263F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 0, 0);
            this.LegLeft.setPos(0.0F, 2.0F, 0.5F);
            this.LegLeft.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.5215043658485197F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 10, 10);
            this.Tail1.setPos(0.0F, -2.2F, 2.5F);
            this.Tail1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.46914448828868976F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 24);
            this.Mouth.setPos(0.0F, 0.0F, -4.0F);
            this.Mouth.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.12217304763960307F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 10);
            this.Chest.setPos(0.0F, 1.8F, -2.5F);
            this.Chest.addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.9173450788166695F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 0, 0);
            this.LegRight.setPos(0.0F, 2.0F, 0.5F);
            this.LegRight.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.5215043658485197F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 12, 21);
            this.ThighLeft.setPos(1.1F, 1.0F, 0.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.35185837453889574F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 12, 21);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.1F, 1.0F, 0.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.35185837453889574F, 0.0F, 0.0F);
            this.Toe2L = new ModelRenderer(this, 7, 27);
            this.Toe2L.setPos(0.2F, 0.1F, -1.3F);
            this.Toe2L.addBox(-1.0F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2L, 0.0F, 0.4886921905584123F, 0.0F);
            this.Beak = new ModelRenderer(this, 0, 24);
            this.Beak.setPos(0.0F, -0.3F, -0.8F);
            this.Beak.addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.Toe1L = new ModelRenderer(this, 7, 27);
            this.Toe1L.setPos(0.5F, 0.1F, -1.0F);
            this.Toe1L.addBox(-0.7F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1L, 0.0F, -0.4886921905584123F, 0.0F);
            this.Toe2R = new ModelRenderer(this, 7, 27);
            this.Toe2R.setPos(0.2F, 0.1F, -1.3F);
            this.Toe2R.addBox(-1.0F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2R, 0.0F, 0.4886921905584123F, 0.0F);
            this.Tail1.addChild(this.Tail2);
            this.Neck.addChild(this.Head);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Neck);
            this.FootRight.addChild(this.Toe1R);
            this.LegRight.addChild(this.FootRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Body.addChild(this.Tail1);
            this.Beak.addChild(this.Mouth);
            this.Body.addChild(this.Chest);
            this.ThighRight.addChild(this.LegRight);
            this.Body.addChild(this.ThighLeft);
            this.Body.addChild(this.ThighRight);
            this.FootLeft.addChild(this.Toe2L);
            this.Head.addChild(this.Beak);
            this.FootLeft.addChild(this.Toe1L);
            this.FootRight.addChild(this.Toe2R);
            this.saveBase();
        }

        @Override
        public void setupAnim(KiwiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI));
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.682F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Body.y = MathHelper.cos(6F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 18.5F;
                this.Body.xRot = MathHelper.cos(9.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.157F;
                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.917F;
                this.Neck.xRot = MathHelper.cos(7.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.682F;
                this.Head.xRot = MathHelper.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 5F) * 0.5F + 0.351F;
                this.LegLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.521F;
                this.FootLeft.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.331F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.351F;
                this.LegRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.521F;
                this.FootRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.331F;


            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Body.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 18.5F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.157F;
                this.Chest.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.917F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.682F;
                this.Head.xRot = MathHelper.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.27F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.351F;
                this.LegLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.521F;
                this.FootLeft.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.331F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.351F;
                this.LegRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.521F;
                this.FootRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.331F;
            }
        }
    }

    public static class Child extends KiwiModel {


        public ModelRenderer LegLeft;
        public ModelRenderer LegRight;
        public ModelRenderer Neck;
        public ModelRenderer Tail;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1R;
        public ModelRenderer Toe2R;
        public ModelRenderer Head;
        public ModelRenderer Beak;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.FootRight = new ModelRenderer(this, 18, 9);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 2.1F, -0.1F);
            this.FootRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.2553416715641412F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 20.1F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.11013027480215679F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 13);
            this.Head.setPos(0.0F, -1.8F, 0.6F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.39269908169872414F, 0.0F, 0.0F);
            this.Toe1R = new ModelRenderer(this, 18, 9);
            this.Toe1R.mirror = true;
            this.Toe1R.setPos(0.0F, 0.1F, 0.0F);
            this.Toe1R.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe1R, 0.0F, -0.2617993877991494F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 18, 9);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.0F, 2.1F, -0.1F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.2553416715641412F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 18, 9);
            this.Toe2Left.mirror = true;
            this.Toe2Left.setPos(0.0F, 0.1F, 0.0F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.2617993877991494F, 0.0F);
            this.Beak = new ModelRenderer(this, 16, 5);
            this.Beak.setPos(0.0F, -0.1F, -0.9F);
            this.Beak.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 8);
            this.Neck.setPos(0.0F, 0.3F, -1.5F);
            this.Neck.addBox(-1.0F, -2.0F, -0.6F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.5846852994181004F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 18, 9);
            this.Toe1Left.mirror = true;
            this.Toe1Left.setPos(0.0F, 0.1F, 0.0F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe1Left, -0.0F, -0.2617993877991494F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 16, 3);
            this.LegLeft.setPos(0.9F, 2.0F, 1.5F);
            this.LegLeft.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.17540559315438148F, 0.0F, 0.0F);
            this.Toe2R = new ModelRenderer(this, 18, 9);
            this.Toe2R.mirror = true;
            this.Toe2R.setPos(0.0F, 0.1F, 0.0F);
            this.Toe2R.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, -0.1F);
            this.setRotateAngle(Toe2R, 0.0F, 0.2617993877991494F, 0.0F);
            this.Tail = new ModelRenderer(this, 8, 8);
            this.Tail.setPos(0.0F, -1.7F, 2.5F);
            this.Tail.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.5846852994181004F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 16, 3);
            this.LegRight.setPos(-0.9F, 2.0F, 1.5F);
            this.LegRight.addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.17540559315438148F, 0.0F, 0.0F);
            this.LegRight.addChild(this.FootRight);
            this.Neck.addChild(this.Head);
            this.FootRight.addChild(this.Toe1R);
            this.LegLeft.addChild(this.FootLeft);
            this.FootLeft.addChild(this.Toe2Left);
            this.Head.addChild(this.Beak);
            this.Body.addChild(this.Neck);
            this.FootLeft.addChild(this.Toe1Left);
            this.Body.addChild(this.LegLeft);
            this.FootRight.addChild(this.Toe2R);
            this.Body.addChild(this.Tail);
            this.Body.addChild(this.LegRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(KiwiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.392F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.584F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.392F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Body.y = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 20.1F;
                this.Body.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.11F;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.584F;
                this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.392F;
                this.LegLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.175F;
                this.FootLeft.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.255F;
                this.LegRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.175F;
                this.FootRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.255F;

            }
        }
    }
}
