package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.EmuEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class EmuModel extends ZawaBaseModel<EmuEntity> {
    protected ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends EmuModel {

        public ModelRenderer Hips;
        public ModelRenderer Chest;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer TailBase;
        public ModelRenderer Tail1;
        public ModelRenderer Tail;
        public ModelRenderer NeckBase;
        public ModelRenderer WingLeft;
        public ModelRenderer WingRight;
        public ModelRenderer NeckBase_1;
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Beak;
        public ModelRenderer UpperBeak;
        public ModelRenderer BeakTip;
        public ModelRenderer Mouth;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ToeRight;
        public ModelRenderer Toe1Right;
        public ModelRenderer Toe2Left;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe3Left;
        public ModelRenderer Toe2Left_1;
        public ModelRenderer Toe1Left;


        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.NeckBase_1 = new ModelRenderer(this, 24, 48);
            this.NeckBase_1.setPos(0.0F, 1.4F, -4.7F);
            this.NeckBase_1.addBox(-2.0F, -3.0F, -3.5F, 4.0F, 4.0F, 4.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase_1, -0.7037167490777915F, 0.0F, 0.0F);
            this.Toe2Left_1 = new ModelRenderer(this, 56, 46);
            this.Toe2Left_1.mirror = true;
            this.Toe2Left_1.setPos(-0.5F, 0.1F, -0.5F);
            this.Toe2Left_1.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left_1, 0.0F, 0.27314402127920984F, -0.03490658503988659F);
            this.Neck = new ModelRenderer(this, 37, 53);
            this.Neck.setPos(0.0F, 0.9F, -3.0F);
            this.Neck.addBox(-1.5F, -6.0F, 0.0F, 3.0F, 6.0F, 3.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.9773843811168246F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 54, 43);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 10.0F, 0.0F);
            this.FootRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.11728612207217244F, 0.0F, 0.0F);
            this.Toe3Left = new ModelRenderer(this, 56, 46);
            this.Toe3Left.mirror = true;
            this.Toe3Left.setPos(0.0F, 0.0F, 0.0F);
            this.Toe3Left.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Left, 0.10471975511965977F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 35);
            this.Hips.setPos(0.0F, -5.0F, 5.5F);
            this.Hips.addBox(-4.0F, 0.0F, 0.0F, 8.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3909537457888271F, 0.0F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 42, 15);
            this.WingLeft.setPos(3.0F, 6.2F, -4.0F);
            this.WingLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, -0.6646214111173737F, 0.5082398928281348F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 56, 46);
            this.Toe2Left.mirror = true;
            this.Toe2Left.setPos(0.5F, 0.1F, -0.5F);
            this.Toe2Left.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, -0.27314402127920984F, 0.03490658503988659F);
            this.ToeRight = new ModelRenderer(this, 56, 46);
            this.ToeRight.mirror = true;
            this.ToeRight.setPos(0.0F, 0.0F, 0.0F);
            this.ToeRight.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ToeRight, 0.10471975511965977F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 21);
            this.Chest.setPos(0.0F, -4.5F, -5.0F);
            this.Chest.addBox(-3.5F, 0.0F, -5.0F, 7.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.3127630032889644F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 42, 15);
            this.WingRight.mirror = true;
            this.WingRight.setPos(-3.0F, 6.2F, -4.0F);
            this.WingRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, -0.6646214111173737F, -0.5082398928281348F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 26, 30);
            this.Tail1.setPos(0.0F, 1.0F, 3.0F);
            this.Tail1.addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.11728612207217244F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 56, 12);
            this.Mouth.setPos(-0.5F, 0.8F, 0.5F);
            this.Mouth.addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.1757546503495068F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 56, 46);
            this.Toe1Left.mirror = true;
            this.Toe1Left.setPos(0.5F, 0.1F, -0.5F);
            this.Toe1Left.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.27314402127920984F, 0.03490658503988659F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 7.2F, 0.0F);
            this.Body.addBox(-4.5F, -5.0F, -5.5F, 9.0F, 10.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.11728612207217244F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 30, 1);
            this.Head.setPos(0.5F, -6.0F, 1.5F);
            this.Head.addBox(-2.0F, -2.0F, -2.5F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.11728612207217244F, 0.0F, 0.0F);
            this.UpperBeak = new ModelRenderer(this, 56, 1);
            this.UpperBeak.setPos(0.0F, 0.0F, -1.6F);
            this.UpperBeak.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBeak, 0.4363323129985824F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 54, 43);
            this.FootLeft.setPos(0.0F, 10.0F, 0.0F);
            this.FootLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.11728612207217244F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 48, 22);
            this.ThighLeft.setPos(2.3F, 4.0F, 1.0F);
            this.ThighLeft.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.1563815016444822F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 56, 30);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 2.0F, 0.0F);
            this.LegRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.35185837453889574F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 48, 22);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.3F, 4.0F, 1.0F);
            this.ThighRight.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.1563815016444822F, 0.0F, 0.0F);
            this.Beak = new ModelRenderer(this, 55, 5);
            this.Beak.setPos(-0.01F, -0.1F, -2.5F);
            this.Beak.addBox(-1.5F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak, 0.03490658503988659F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 0, 47);
            this.TailBase.setPos(0.0F, 1.0F, 4.0F);
            this.TailBase.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, -0.35185837453889574F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 56, 46);
            this.Toe1Right.mirror = true;
            this.Toe1Right.setPos(-0.5F, 0.1F, -0.5F);
            this.Toe1Right.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.27314402127920984F, -0.03490658503988659F);
            this.LegLeft = new ModelRenderer(this, 56, 30);
            this.LegLeft.setPos(0.0F, 2.0F, 0.0F);
            this.LegLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.35185837453889574F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 24, 37);
            this.NeckBase.setPos(0.0F, 4.5F, -4.0F);
            this.NeckBase.addBox(-2.5F, -2.5F, -5.0F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.7037167490777915F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 26, 21);
            this.Tail.setPos(0.0F, 3.0F, 4.4F);
            this.Tail.addBox(-3.0F, -2.5F, 0.0F, 6.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.1563815016444822F, 0.0F, 0.0F);
            this.BeakTip = new ModelRenderer(this, 58, 9);
            this.BeakTip.setPos(0.0F, 0.0F, -1.5F);
            this.BeakTip.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BeakTip, 0.11903145798206952F, 0.0F, 0.0F);
            this.NeckBase.addChild(this.NeckBase_1);
            this.Toe3Left.addChild(this.Toe2Left_1);
            this.NeckBase_1.addChild(this.Neck);
            this.LegRight.addChild(this.FootRight);
            this.FootLeft.addChild(this.Toe3Left);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.WingLeft);
            this.ToeRight.addChild(this.Toe2Left);
            this.FootRight.addChild(this.ToeRight);
            this.Body.addChild(this.Chest);
            this.Chest.addChild(this.WingRight);
            this.Hips.addChild(this.Tail1);
            this.Beak.addChild(this.Mouth);
            this.Toe3Left.addChild(this.Toe1Left);
            this.Neck.addChild(this.Head);
            this.Beak.addChild(this.UpperBeak);
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.ThighLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Body.addChild(this.ThighRight);
            this.Head.addChild(this.Beak);
            this.Hips.addChild(this.TailBase);
            this.ToeRight.addChild(this.Toe1Right);
            this.ThighLeft.addChild(this.LegLeft);
            this.Chest.addChild(this.NeckBase);
            this.TailBase.addChild(this.Tail);
            this.Beak.addChild(this.BeakTip);
            this.saveBase();
        }

        @Override
        public void setupAnim(EmuEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            //this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.117F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.NeckBase.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.703F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.117F;
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
                float speed = 1.0f;
                float degree = 1.0f;
                this.NeckBase.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.703F;
                this.Head.xRot = MathHelper.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.117F;
                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.312F;
                this.Tail.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F - 0.156F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F + 0.117F;
                this.Body.y = MathHelper.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1F) * 0.5F + 7.2F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.156F;
                this.ThighLeft.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 4.0F;
                this.LegLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.351F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.117F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.156F;
                this.ThighRight.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 4.0F;
                this.LegRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.351F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.117F;
            }
        }
    }

     public static class Child extends EmuModel {
         public ModelRenderer Hips;
         public ModelRenderer Chest;
         public ModelRenderer ThighRight;
         public ModelRenderer ThighLeft;
         public ModelRenderer TailBase;
         public ModelRenderer Tail1;
         public ModelRenderer Tail;
         public ModelRenderer NeckBase2;
         public ModelRenderer WingLeft;
         public ModelRenderer WingRight;
         public ModelRenderer NeckBase;
         public ModelRenderer Neck;
         public ModelRenderer Head;
         public ModelRenderer Beak;
         public ModelRenderer UpperBeak;
         public ModelRenderer BeakTip;
         public ModelRenderer Mouth;
         public ModelRenderer ThighRight_1;
         public ModelRenderer FootRight;
         public ModelRenderer ToeRight;
         public ModelRenderer Toe1Right;
         public ModelRenderer Toe2Left;
         public ModelRenderer LegLeft;
         public ModelRenderer FootLeft;
         public ModelRenderer Toe3Left;
         public ModelRenderer Toe2Left_1;
         public ModelRenderer Toe1Left;

         public Child() {
             this.texWidth = 64;
             this.texHeight = 64;
             this.Neck = new ModelRenderer(this, 37, 53);
             this.Neck.setPos(0.0F, 0.9F, -3.0F);
             this.Neck.addBox(-1.5F, -6.0F, 0.0F, 3.0F, 6.0F, 3.0F, -0.02F, 0.0F, 0.0F);
             this.setRotateAngle(Neck, 0.9773843811168246F, 0.0F, 0.0F);
             this.ThighRight = new ModelRenderer(this, 48, 22);
             this.ThighRight.mirror = true;
             this.ThighRight.setPos(-2.3F, 4.0F, 1.0F);
             this.ThighRight.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(ThighRight, 0.1563815016444822F, 0.0F, 0.0F);
             this.Chest = new ModelRenderer(this, 0, 21);
             this.Chest.setPos(0.0F, -4.5F, -5.0F);
             this.Chest.addBox(-3.5F, 0.0F, -5.0F, 7.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Chest, 0.3127630032889644F, 0.0F, 0.0F);
             this.Head = new ModelRenderer(this, 30, 1);
             this.Head.setPos(0.5F, -6.0F, 1.5F);
             this.Head.addBox(-2.0F, -2.0F, -2.5F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Head, 0.11728612207217244F, 0.0F, 0.0F);
             this.Beak = new ModelRenderer(this, 55, 5);
             this.Beak.setPos(-0.01F, -0.1F, -2.5F);
             this.Beak.addBox(-1.5F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Beak, 0.03490658503988659F, 0.0F, 0.0F);
             this.UpperBeak = new ModelRenderer(this, 56, 1);
             this.UpperBeak.setPos(0.0F, 0.0F, -1.6F);
             this.UpperBeak.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, -0.01F, 0.0F, 0.0F);
             this.setRotateAngle(UpperBeak, 0.4363323129985824F, 0.0F, 0.0F);
             this.ThighLeft = new ModelRenderer(this, 48, 22);
             this.ThighLeft.setPos(2.3F, 4.0F, 1.0F);
             this.ThighLeft.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(ThighLeft, 0.1563815016444822F, 0.0F, 0.0F);
             this.Mouth = new ModelRenderer(this, 56, 12);
             this.Mouth.setPos(-0.5F, 0.8F, 0.5F);
             this.Mouth.addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Mouth, -0.1757546503495068F, 0.0F, 0.0F);
             this.WingLeft = new ModelRenderer(this, 42, 15);
             this.WingLeft.setPos(3.0F, 6.2F, -4.0F);
             this.WingLeft.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(WingLeft, -0.6646214111173737F, 0.5082398928281348F, 0.0F);
             this.Toe2Left = new ModelRenderer(this, 56, 46);
             this.Toe2Left.mirror = true;
             this.Toe2Left.setPos(0.5F, 0.1F, -0.5F);
             this.Toe2Left.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Toe2Left, 0.0F, -0.27314402127920984F, 0.03490658503988659F);
             this.LegLeft = new ModelRenderer(this, 56, 30);
             this.LegLeft.setPos(0.0F, 2.0F, 0.0F);
             this.LegLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(LegLeft, -0.35185837453889574F, 0.0F, 0.0F);
             this.FootLeft = new ModelRenderer(this, 54, 43);
             this.FootLeft.setPos(0.0F, 10.0F, 0.0F);
             this.FootLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(FootLeft, 0.11728612207217244F, 0.0F, 0.0F);
             this.ToeRight = new ModelRenderer(this, 56, 46);
             this.ToeRight.mirror = true;
             this.ToeRight.setPos(0.0F, 0.0F, 0.0F);
             this.ToeRight.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(ToeRight, 0.10471975511965977F, 0.0F, 0.0F);
             this.Body = new ModelRenderer(this, 0, 0);
             this.Body.setPos(0.0F, 7.2F, 0.0F);
             this.Body.addBox(-4.5F, -5.0F, -5.5F, 9.0F, 10.0F, 11.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Body, 0.11728612207217244F, 0.0F, 0.0F);
             this.TailBase = new ModelRenderer(this, 0, 47);
             this.TailBase.setPos(0.0F, 1.0F, 4.0F);
             this.TailBase.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(TailBase, -0.35185837453889574F, 0.0F, 0.0F);
             this.Hips = new ModelRenderer(this, 0, 35);
             this.Hips.setPos(0.0F, -5.0F, 5.5F);
             this.Hips.addBox(-4.0F, 0.0F, 0.0F, 8.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Hips, -0.3909537457888271F, 0.0F, 0.0F);
             this.Tail = new ModelRenderer(this, 26, 21);
             this.Tail.setPos(0.0F, 3.0F, 4.4F);
             this.Tail.addBox(-3.0F, -2.5F, 0.0F, 6.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Tail, -0.1563815016444822F, 0.0F, 0.0F);
             this.WingRight = new ModelRenderer(this, 42, 15);
             this.WingRight.mirror = true;
             this.WingRight.setPos(-3.0F, 6.2F, -4.0F);
             this.WingRight.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(WingRight, -0.6646214111173737F, -0.5082398928281348F, 0.0F);
             this.Toe1Right = new ModelRenderer(this, 56, 46);
             this.Toe1Right.mirror = true;
             this.Toe1Right.setPos(-0.5F, 0.1F, -0.5F);
             this.Toe1Right.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Toe1Right, 0.0F, 0.27314402127920984F, -0.03490658503988659F);
             this.Tail1 = new ModelRenderer(this, 26, 30);
             this.Tail1.setPos(0.0F, 1.0F, 3.0F);
             this.Tail1.addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Tail1, -0.11728612207217244F, 0.0F, 0.0F);
             this.NeckBase2 = new ModelRenderer(this, 24, 37);
             this.NeckBase2.setPos(0.0F, 4.5F, -4.0F);
             this.NeckBase2.addBox(-2.5F, -2.5F, -5.0F, 5.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(NeckBase2, -0.7037167490777915F, 0.0F, 0.0F);
             this.BeakTip = new ModelRenderer(this, 58, 9);
             this.BeakTip.setPos(0.0F, 0.0F, -1.5F);
             this.BeakTip.addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(BeakTip, 0.11903145798206952F, 0.0F, 0.0F);
             this.NeckBase = new ModelRenderer(this, 24, 48);
             this.NeckBase.setPos(0.0F, 1.4F, -4.7F);
             this.NeckBase.addBox(-2.0F, -3.0F, -3.5F, 4.0F, 4.0F, 4.0F, -0.02F, 0.0F, 0.0F);
             this.setRotateAngle(NeckBase, -0.7037167490777915F, 0.0F, 0.0F);
             this.Toe1Left = new ModelRenderer(this, 56, 46);
             this.Toe1Left.mirror = true;
             this.Toe1Left.setPos(0.5F, 0.1F, -0.5F);
             this.Toe1Left.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Toe1Left, 0.0F, -0.27314402127920984F, 0.03490658503988659F);
             this.Toe3Left = new ModelRenderer(this, 56, 46);
             this.Toe3Left.mirror = true;
             this.Toe3Left.setPos(0.0F, 0.0F, 0.0F);
             this.Toe3Left.addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Toe3Left, 0.10471975511965977F, 0.0F, 0.0F);
             this.ThighRight_1 = new ModelRenderer(this, 56, 30);
             this.ThighRight_1.mirror = true;
             this.ThighRight_1.setPos(0.0F, 2.0F, 0.0F);
             this.ThighRight_1.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(ThighRight_1, -0.35185837453889574F, 0.0F, 0.0F);
             this.FootRight = new ModelRenderer(this, 54, 43);
             this.FootRight.mirror = true;
             this.FootRight.setPos(0.0F, 10.0F, 0.0F);
             this.FootRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(FootRight, 0.11728612207217244F, 0.0F, 0.0F);
             this.Toe2Left_1 = new ModelRenderer(this, 56, 46);
             this.Toe2Left_1.mirror = true;
             this.Toe2Left_1.setPos(-0.5F, 0.1F, -0.5F);
             this.Toe2Left_1.addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
             this.setRotateAngle(Toe2Left_1, 0.0F, 0.27314402127920984F, -0.03490658503988659F);
             this.NeckBase.addChild(this.Neck);
             this.Body.addChild(this.ThighRight);
             this.Body.addChild(this.Chest);
             this.Neck.addChild(this.Head);
             this.Head.addChild(this.Beak);
             this.Beak.addChild(this.UpperBeak);
             this.Body.addChild(this.ThighLeft);
             this.Beak.addChild(this.Mouth);
             this.Chest.addChild(this.WingLeft);
             this.ToeRight.addChild(this.Toe2Left);
             this.ThighLeft.addChild(this.LegLeft);
             this.LegLeft.addChild(this.FootLeft);
             this.FootRight.addChild(this.ToeRight);
             this.Hips.addChild(this.TailBase);
             this.Body.addChild(this.Hips);
             this.TailBase.addChild(this.Tail);
             this.Chest.addChild(this.WingRight);
             this.ToeRight.addChild(this.Toe1Right);
             this.Hips.addChild(this.Tail1);
             this.Chest.addChild(this.NeckBase2);
             this.Beak.addChild(this.BeakTip);
             this.NeckBase2.addChild(this.NeckBase);
             this.Toe3Left.addChild(this.Toe1Left);
             this.FootLeft.addChild(this.Toe3Left);
             this.ThighRight.addChild(this.ThighRight_1);
             this.ThighRight_1.addChild(this.FootRight);
             this.Toe3Left.addChild(this.Toe2Left_1);
             this.saveBase();
         }

         @Override
         public void setupAnim(EmuEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
