package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.KiwiEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

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
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

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


            } else {
            }
        }
    }
        public static class Child extends KiwiModel {


            public ModelRenderer Tail1;
            public ModelRenderer Neck;
            public ModelRenderer ThighLeft;
            public ModelRenderer ThighRight;
            public ModelRenderer Tail2;
            public ModelRenderer Head;
            public ModelRenderer BeakLower;
            public ModelRenderer BeakUpper;
            public ModelRenderer LegLeft;
            public ModelRenderer FootLeft;
            public ModelRenderer Toe1Left;
            public ModelRenderer Toe2Left;
            public ModelRenderer LegRight;
            public ModelRenderer FootRight;
            public ModelRenderer Toe1Right;
            public ModelRenderer Toe2Right;

            public Child() {
                this.texWidth = 32;
                this.texHeight = 32;
                this.FootLeft = new ModelRenderer(this, 16, 6);
                this.FootLeft.setPos(-0.5F, 1.1F, -0.2F);
                this.FootLeft.addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(FootLeft, 0.2792526803190927F, 0.0F, 0.0F);
                this.LegLeft = new ModelRenderer(this, 16, 3);
                this.LegLeft.setPos(0.1F, 0.5F, 0.7F);
                this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(LegLeft, -0.30543261909900765F, 0.0F, 0.0F);
                this.Body = new ModelRenderer(this, 0, 0);
                this.Body.setPos(0.0F, 19.9F, 0.0F);
                this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Body, 0.03490658503988659F, 0.0F, 0.0F);
                this.FootRight = new ModelRenderer(this, 16, 6);
                this.FootRight.mirror = true;
                this.FootRight.setPos(0.5F, 1.1F, -0.2F);
                this.FootRight.addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(FootRight, 0.2792526803190927F, 0.0F, 0.0F);
                this.Toe2Left = new ModelRenderer(this, 18, 9);
                this.Toe2Left.setPos(-0.4F, 0.05F, -1.5F);
                this.Toe2Left.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Toe2Left, 0.0F, 0.47123889803846897F, 0.0F);
                this.LegRight = new ModelRenderer(this, 16, 3);
                this.LegRight.mirror = true;
                this.LegRight.setPos(-0.1F, 0.5F, 0.7F);
                this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(LegRight, -0.30543261909900765F, 0.0F, 0.0F);
                this.Head = new ModelRenderer(this, 0, 13);
                this.Head.setPos(1.0F, -2.8F, -0.9F);
                this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Head, 0.8576547837773691F, 0.0F, 0.0F);
                this.Tail1 = new ModelRenderer(this, 8, 8);
                this.Tail1.setPos(0.0F, -1.75F, 2.0F);
                this.Tail1.addBox(-1.5F, 0.0F, -0.1F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Tail1, -0.5235987755982988F, 0.0F, 0.0F);
                this.Toe1Left = new ModelRenderer(this, 18, 9);
                this.Toe1Left.setPos(0.5F, 0.05F, -2.0F);
                this.Toe1Left.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Toe1Left, 0.0F, -0.47123889803846897F, 0.0F);
                this.BeakLower = new ModelRenderer(this, 0, 19);
                this.BeakLower.setPos(-0.5F, -0.5F, 0.35F);
                this.BeakLower.addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.BeakUpper = new ModelRenderer(this, 0, 19);
                this.BeakUpper.setPos(0.0F, -0.4F, 0.7F);
                this.BeakUpper.addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(BeakUpper, 0.2617993877991494F, 0.0F, 0.0F);
                this.Tail2 = new ModelRenderer(this, 12, 13);
                this.Tail2.setPos(0.0F, 0.4F, 2.1F);
                this.Tail2.addBox(-1.0F, -0.3F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Tail2, 0.7330382858376184F, 0.0F, 0.0F);
                this.ThighLeft = new ModelRenderer(this, 12, 0);
                this.ThighLeft.setPos(0.9F, 1.6F, 0.0F);
                this.ThighLeft.addBox(-1.0F, 0.1F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.ThighRight = new ModelRenderer(this, 12, 0);
                this.ThighRight.mirror = true;
                this.ThighRight.setPos(-0.9F, 1.6F, 0.0F);
                this.ThighRight.addBox(-1.0F, 0.1F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.Toe1Right = new ModelRenderer(this, 18, 9);
                this.Toe1Right.mirror = true;
                this.Toe1Right.setPos(-0.5F, 0.05F, -2.0F);
                this.Toe1Right.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Toe1Right, 0.0F, 0.47123889803846897F, 0.0F);
                this.Toe2Right = new ModelRenderer(this, 18, 9);
                this.Toe2Right.mirror = true;
                this.Toe2Right.setPos(0.4F, 0.05F, -1.5F);
                this.Toe2Right.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Toe2Right, 0.0F, -0.47123889803846897F, 0.0F);
                this.Neck = new ModelRenderer(this, 0, 8);
                this.Neck.setPos(-1.0F, 0.7F, -0.2F);
                this.Neck.addBox(0.0F, -3.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Neck, 0.6981317007977318F, 0.0F, 0.0F);
                this.LegLeft.addChild(this.FootLeft);
                this.ThighLeft.addChild(this.LegLeft);
                this.LegRight.addChild(this.FootRight);
                this.FootLeft.addChild(this.Toe2Left);
                this.ThighRight.addChild(this.LegRight);
                this.Neck.addChild(this.Head);
                this.Body.addChild(this.Tail1);
                this.FootLeft.addChild(this.Toe1Left);
                this.Head.addChild(this.BeakLower);
                this.BeakLower.addChild(this.BeakUpper);
                this.Tail1.addChild(this.Tail2);
                this.Body.addChild(this.ThighLeft);
                this.Body.addChild(this.ThighRight);
                this.FootRight.addChild(this.Toe1Right);
                this.FootRight.addChild(this.Toe2Right);
                this.Body.addChild(this.Neck);
                this.saveBase();
            }

            @Override
            public void setupAnim(KiwiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
}}
