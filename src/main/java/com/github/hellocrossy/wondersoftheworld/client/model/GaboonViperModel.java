package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.GaboonViperEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GaboonViperModel extends ZawaBaseModel<GaboonViperEntity> {
    protected ModelRenderer Base;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Base);
        }

        return this.parts;
    }

    public static class Adult extends GaboonViperModel {
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Chest;
        public ModelRenderer Body;
        public ModelRenderer TailBase;
        public ModelRenderer Tail1;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Jaw;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer Tongue;
        public ModelRenderer EyeLeft;
        public ModelRenderer EyeRight;
        public ModelRenderer LeftNoseHorn;
        public ModelRenderer RightNoseHorn;


        public Adult() {
            texWidth = 64;
            texHeight = 32;
            this.Tongue = new ModelRenderer(this, 29, 26);
            this.Tongue.setPos(0.0F, 0.75F, 2.5F);
            this.Tongue.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Base = new ModelRenderer(this, 0, 0);
            this.Base.setPos(0.0F, 22.5F, -10.5F);
            this.Base.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 50, 17);
            this.Tail4.setPos(0.0F, 0.1F, 4.5F);
            this.Tail4.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.3F, 0.0F);
            this.setRotateAngle(Tail4, -0.03490658503988659F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 26);
            this.Head.setPos(0.0F, -0.3F, -0.5F);
            this.Head.addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.19530233597447247F, 0.0F, 0.0F);
            this.LeftNoseHorn = new ModelRenderer(this, 7, 24);
            this.LeftNoseHorn.setPos(0.5F, -1.0F, -1.0F);
            this.LeftNoseHorn.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftNoseHorn, 0.0F, 0.0F, 0.7853981633974483F);
            this.Body = new ModelRenderer(this, 0, 14);
            this.Body.setPos(0.0F, -0.05F, 4.0F);
            this.Body.addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 18, 27);
            this.Jaw.setPos(0.0F, 1.0F, 1.0F);
            this.Jaw.addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 4.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.0781907508222411F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 36, 27);
            this.Snout.setPos(0.0F, 0.0F, -3.4F);
            this.Snout.addBox(-1.5F, -1.0F, -1.8F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.11728612207217244F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 38, 19);
            this.Mouth.setPos(0.0F, -0.2F, -4.4F);
            this.Mouth.addBox(-1.5F, 0.0F, -1.8F, 3.0F, 1.0F, 3.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.1563815016444822F, 0.0F, 0.0F);
            this.EyeLeft = new ModelRenderer(this, 0, 24);
            this.EyeLeft.setPos(1.3F, -1.1F, -0.5F);
            this.EyeLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EyeLeft, 0.0F, 0.46914448828868976F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 46, 9);
            this.Tail3.setPos(0.0F, 0.05F, 5.5F);
            this.Tail3.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 7);
            this.Chest.setPos(0.0F, -0.05F, 3.5F);
            this.Chest.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 0);
            this.Neck.setPos(0.0F, -0.8F, -0.2F);
            this.Neck.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 15, 15);
            this.Tail1.setPos(0.05F, -0.05F, 7.0F);
            this.Tail1.addBox(-3.5F, -0.5F, 0.0F, 7.0F, 3.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.017453292519943295F, 0.0F, 0.0F);
            this.EyeRight = new ModelRenderer(this, 0, 24);
            this.EyeRight.mirror = true;
            this.EyeRight.setPos(-1.3F, -1.1F, -0.5F);
            this.EyeRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EyeRight, 0.0F, -0.46914448828868976F, 0.0F);
            this.TailBase = new ModelRenderer(this, 12, 0);
            this.TailBase.setPos(0.0F, -0.05F, 5.0F);
            this.TailBase.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 3.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.017453292519943295F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 40, 0);
            this.Tail2.setPos(0.0F, 0.05F, 7.5F);
            this.Tail2.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 50, 23);
            this.Tail5.setPos(0.0F, 0.0F, 3.5F);
            this.Tail5.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, -0.03490658503988659F, 0.0F, 0.0F);
            this.RightNoseHorn = new ModelRenderer(this, 7, 24);
            this.RightNoseHorn.mirror = true;
            this.RightNoseHorn.setPos(-0.5F, -1.0F, -1.0F);
            this.RightNoseHorn.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightNoseHorn, 0.0F, 0.0F, 0.7853981633974483F);
            this.Mouth.addChild(this.Tongue);
            this.Tail3.addChild(this.Tail4);
            this.Base.addChild(this.Head);
            this.Snout.addChild(this.LeftNoseHorn);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.Jaw);
            this.Head.addChild(this.Snout);
            this.Jaw.addChild(this.Mouth);
            this.Snout.addChild(this.EyeLeft);
            this.Tail2.addChild(this.Tail3);
            this.Neck.addChild(this.Chest);
            this.Base.addChild(this.Neck);
            this.TailBase.addChild(this.Tail1);
            this.Snout.addChild(this.EyeRight);
            this.Body.addChild(this.TailBase);
            this.Tail1.addChild(this.Tail2);
            this.Tail4.addChild(this.Tail5);
            this.Snout.addChild(this.RightNoseHorn);
            this.saveBase();
        }

        @Override
        public void setupAnim(GaboonViperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.195F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
         }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.Neck.yRot = (float) Math.toRadians(40);
            this.Chest.yRot = (float) Math.toRadians(40);
            this.Body.yRot = (float) Math.toRadians(-80);
            this.TailBase.yRot = (float) Math.toRadians(-80);
            this.Tail1.yRot = (float) Math.toRadians(-60);
            this.Tail2.yRot = (float) Math.toRadians(60);
            this.Tail3.yRot = (float) Math.toRadians(80);
            this.Tail4.yRot = (float) Math.toRadians(60);
            this.Tail5.yRot = (float) Math.toRadians(20);
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isSprinting()) {
                float speed = 2.0F;
                float degree = 0.5F;
                this.Base.z = MathHelper.cos(1F + limbSwing * speed * 0.3F) * degree * 8.0F * limbSwingAmount - 10.5F;
                this.Base.yRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * degree * -2.0F * limbSwingAmount;
                this.Head.yRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * degree * 2.0F * limbSwingAmount;
                this.Neck.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Chest.yRot = MathHelper.cos(3.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Body.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.TailBase.yRot = MathHelper.cos(2.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail1.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail2.yRot = MathHelper.cos(1.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail3.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail4.yRot = MathHelper.cos(0.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail5.yRot = MathHelper.cos(0.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;

            } else {
                float speed = 2.0f;
                float degree = 0.5f;
                this.Base.z = MathHelper.cos(1F + limbSwing * speed * 0.3F) * degree * 8.0F * limbSwingAmount - 10.5F;
                this.Base.yRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * degree * -2.0F * limbSwingAmount;
                this.Head.yRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * degree * 2.0F * limbSwingAmount;
                this.Neck.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Chest.yRot = MathHelper.cos(3.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Body.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.TailBase.yRot = MathHelper.cos(2.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail1.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail2.yRot = MathHelper.cos(1.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail3.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail4.yRot = MathHelper.cos(0.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail5.yRot = MathHelper.cos(0.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
            }
        }
    }

    public static class Child extends GaboonViperModel {
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Chest;
        public ModelRenderer Body;
        public ModelRenderer TailBase;
        public ModelRenderer Tail1;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Jaw;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer Tongue;
        public ModelRenderer EyeLeft;
        public ModelRenderer EyeRight;
        public ModelRenderer LeftNoseHorn;
        public ModelRenderer RightNoseHorn;


        public Child() {
            texWidth = 64;
            texHeight = 32;
            this.Tongue = new ModelRenderer(this, 29, 26);
            this.Tongue.setPos(0.0F, 0.75F, 2.5F);
            this.Tongue.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Base = new ModelRenderer(this, 0, 0);
            this.Base.setPos(0.0F, 22.5F, -10.5F);
            this.Base.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 50, 17);
            this.Tail4.setPos(0.0F, 0.1F, 4.5F);
            this.Tail4.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.3F, 0.0F);
            this.setRotateAngle(Tail4, -0.03490658503988659F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 26);
            this.Head.setPos(0.0F, -0.3F, -0.5F);
            this.Head.addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.19530233597447247F, 0.0F, 0.0F);
            this.LeftNoseHorn = new ModelRenderer(this, 7, 24);
            this.LeftNoseHorn.setPos(0.5F, -1.0F, -1.0F);
            this.LeftNoseHorn.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftNoseHorn, 0.0F, 0.0F, 0.7853981633974483F);
            this.Body = new ModelRenderer(this, 0, 14);
            this.Body.setPos(0.0F, -0.05F, 4.0F);
            this.Body.addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 18, 27);
            this.Jaw.setPos(0.0F, 1.0F, 1.0F);
            this.Jaw.addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 4.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.0781907508222411F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 36, 27);
            this.Snout.setPos(0.0F, 0.0F, -3.4F);
            this.Snout.addBox(-1.5F, -1.0F, -1.8F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.11728612207217244F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 38, 19);
            this.Mouth.setPos(0.0F, -0.2F, -4.4F);
            this.Mouth.addBox(-1.5F, 0.0F, -1.8F, 3.0F, 1.0F, 3.0F, -0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.1563815016444822F, 0.0F, 0.0F);
            this.EyeLeft = new ModelRenderer(this, 0, 24);
            this.EyeLeft.setPos(1.3F, -1.1F, -0.5F);
            this.EyeLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EyeLeft, 0.0F, 0.46914448828868976F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 46, 9);
            this.Tail3.setPos(0.0F, 0.05F, 5.5F);
            this.Tail3.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 7);
            this.Chest.setPos(0.0F, -0.05F, 3.5F);
            this.Chest.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 0);
            this.Neck.setPos(0.0F, -0.8F, -0.2F);
            this.Neck.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 15, 15);
            this.Tail1.setPos(0.05F, -0.05F, 7.0F);
            this.Tail1.addBox(-3.5F, -0.5F, 0.0F, 7.0F, 3.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.017453292519943295F, 0.0F, 0.0F);
            this.EyeRight = new ModelRenderer(this, 0, 24);
            this.EyeRight.mirror = true;
            this.EyeRight.setPos(-1.3F, -1.1F, -0.5F);
            this.EyeRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EyeRight, 0.0F, -0.46914448828868976F, 0.0F);
            this.TailBase = new ModelRenderer(this, 12, 0);
            this.TailBase.setPos(0.0F, -0.05F, 5.0F);
            this.TailBase.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 3.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.017453292519943295F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 40, 0);
            this.Tail2.setPos(0.0F, 0.05F, 7.5F);
            this.Tail2.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.Tail5 = new ModelRenderer(this, 50, 23);
            this.Tail5.setPos(0.0F, 0.0F, 3.5F);
            this.Tail5.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail5, -0.03490658503988659F, 0.0F, 0.0F);
            this.RightNoseHorn = new ModelRenderer(this, 7, 24);
            this.RightNoseHorn.mirror = true;
            this.RightNoseHorn.setPos(-0.5F, -1.0F, -1.0F);
            this.RightNoseHorn.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightNoseHorn, 0.0F, 0.0F, 0.7853981633974483F);
            this.Mouth.addChild(this.Tongue);
            this.Tail3.addChild(this.Tail4);
            this.Base.addChild(this.Head);
            this.Snout.addChild(this.LeftNoseHorn);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.Jaw);
            this.Head.addChild(this.Snout);
            this.Jaw.addChild(this.Mouth);
            this.Snout.addChild(this.EyeLeft);
            this.Tail2.addChild(this.Tail3);
            this.Neck.addChild(this.Chest);
            this.Base.addChild(this.Neck);
            this.TailBase.addChild(this.Tail1);
            this.Snout.addChild(this.EyeRight);
            this.Body.addChild(this.TailBase);
            this.Tail1.addChild(this.Tail2);
            this.Tail4.addChild(this.Tail5);
            this.Snout.addChild(this.RightNoseHorn);
            this.saveBase();
        }

        @Override
        public void setupAnim(GaboonViperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.195F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.Neck.yRot = (float) Math.toRadians(40);
            this.Chest.yRot = (float) Math.toRadians(40);
            this.Body.yRot = (float) Math.toRadians(-80);
            this.TailBase.yRot = (float) Math.toRadians(-80);
            this.Tail1.yRot = (float) Math.toRadians(-60);
            this.Tail2.yRot = (float) Math.toRadians(60);
            this.Tail3.yRot = (float) Math.toRadians(80);
            this.Tail4.yRot = (float) Math.toRadians(60);
            this.Tail5.yRot = (float) Math.toRadians(20);
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            if (entity.isSprinting()) {
                float speed = 2.0F;
                float degree = 0.5F;
                this.Base.z = MathHelper.cos(1F + limbSwing * speed * 0.3F) * degree * 8.0F * limbSwingAmount - 10.5F;
                this.Base.yRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * degree * -2.0F * limbSwingAmount;
                this.Head.yRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * degree * 2.0F * limbSwingAmount;
                this.Neck.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Chest.yRot = MathHelper.cos(3.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Body.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.TailBase.yRot = MathHelper.cos(2.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail1.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail2.yRot = MathHelper.cos(1.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail3.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail4.yRot = MathHelper.cos(0.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail5.yRot = MathHelper.cos(0.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;

            } else {
                float speed = 2.0f;
                float degree = 0.5f;
                this.Base.z = MathHelper.cos(1F + limbSwing * speed * 0.3F) * degree * 8.0F * limbSwingAmount - 10.5F;
                this.Base.yRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * degree * -2.0F * limbSwingAmount;
                this.Head.yRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * degree * 2.0F * limbSwingAmount;
                this.Neck.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Chest.yRot = MathHelper.cos(3.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Body.yRot = MathHelper.cos(3.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.TailBase.yRot = MathHelper.cos(2.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail1.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail2.yRot = MathHelper.cos(1.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail3.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail4.yRot = MathHelper.cos(0.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail5.yRot = MathHelper.cos(0.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
            }
        }
    }
}

