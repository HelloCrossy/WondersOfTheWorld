package com.github.hellocrossy.wondersoftheworld.client.model;
import com.github.hellocrossy.wondersoftheworld.entity.FennecFoxEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class FennecFoxModel extends ZawaBaseModel<FennecFoxEntity> {
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

    public static class Adult extends FennecFoxModel {


        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer SnoutLeft;
        public ModelRenderer EarLeft;
        public ModelRenderer EarLeft_1;
        public ModelRenderer SnoutRight;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Adult() {

            this.texWidth = 64;
            this.texHeight = 64;
            this.LowerLegLeft = new ModelRenderer(this, 17, 24);
            this.LowerLegLeft.setPos(-0.1F, 2.0F, 2.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.7431612274571185F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 12, 27);
            this.Mouth.setPos(0.0F, 0.5F, -0.9F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 25, 4);
            this.ForearmLeft.setPos(-0.1F, 3.0F, 1.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.12217304763960307F, 0.0F, 0.0F);
            this.EarLeft_1 = new ModelRenderer(this, 6, 25);
            this.EarLeft_1.mirror = true;
            this.EarLeft_1.setPos(-0.7F, -1.0F, 1.0F);
            this.EarLeft_1.addBox(-1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft_1, 0.10471975511965977F, -0.7330382858376184F, -0.33161255787892263F);
            this.ArmRight = new ModelRenderer(this, 21, 10);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.2F, 0.0F, 0.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.3741986009486481F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 9, 18);
            this.ThighLeft.setPos(1.3F, 1.1F, -0.7F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.32602750959886295F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 25, 24);
            this.Tail3.setPos(0.0F, 0.9F, 4.0F);
            this.Tail3.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.02F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.27366763203903305F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 26);
            this.Tail1.setPos(0.0F, 0.0F, 2.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.5475098009980072F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 24, 15);
            this.FootLeft.setPos(0.1F, 2.4F, -0.9F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.017453292519943295F, 0.0F, 0.0F);
            this.SnoutLeft = new ModelRenderer(this, 9, 12);
            this.SnoutLeft.setPos(0.0F, -0.2F, -0.8F);
            this.SnoutLeft.addBox(-0.3F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(SnoutLeft, 0.19198621771937624F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 23, 0);
            this.UpperLegLeft.setPos(-0.1F, 4.0F, -0.9F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.7131415430175274F, 0.0F, 0.0F);
            this.SnoutRight = new ModelRenderer(this, 9, 12);
            this.SnoutRight.mirror = true;
            this.SnoutRight.setPos(0.0F, 0.0F, 0.0F);
            this.SnoutRight.addBox(-0.7F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 12);
            this.Chest.setPos(0.0F, 17.3F, -4.0F);
            this.Chest.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.24434609527920614F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 15, 0);
            this.Tail2.setPos(0.0F, 2.0F, -1.0F);
            this.Tail2.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -1.4470525467443647F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 23, 0);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 4.0F, -0.9F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.7131415430175274F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 19, 18);
            this.Hips.setPos(0.0F, 0.0F, 7.0F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3127630032889644F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 23, 28);
            this.TopSnout.setPos(0.0F, 0.0F, -2.1F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2640683178241129F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 27, 9);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 2.9F, -1.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.017453292519943295F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 27, 9);
            this.HandLeft.setPos(0.1F, 2.9F, -1.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.017453292519943295F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 24, 15);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.1F, 2.4F, -0.9F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 0, 0);
            this.NeckLower.setPos(0.0F, -3.0F, -1.4F);
            this.NeckLower.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.19547687289441354F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 9, 18);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.3F, 1.1F, -0.7F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.3F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.32602750959886295F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 19);
            this.Neck.setPos(0.0F, -0.3F, -0.5F);
            this.Neck.addBox(-1.0F, -3.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.9334020759770842F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 12, 12);
            this.Head.setPos(0.0F, -3.6F, -0.5F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.6339035789980183F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 17, 24);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.1F, 2.0F, 2.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.7431612274571185F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 6, 25);
            this.EarLeft.setPos(0.7F, -1.0F, 1.0F);
            this.EarLeft.addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.10471975511965977F, 0.7330382858376184F, 0.33161255787892263F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -1.7F, -0.1F);
            this.Body.addBox(-2.0F, -0.5F, 0.0F, 4.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.24783675045424342F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 25, 4);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.1F, 3.0F, 1.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.12217304763960307F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 21, 10);
            this.ArmLeft.setPos(1.2F, 0.0F, 0.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.3741986009486481F, 0.0F, 0.0F);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.SnoutLeft.addChild(this.Mouth);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.EarLeft_1);
            this.Chest.addChild(this.ArmRight);
            this.Hips.addChild(this.ThighLeft);
            this.Tail2.addChild(this.Tail3);
            this.Hips.addChild(this.Tail1);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.SnoutLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.SnoutLeft.addChild(this.SnoutRight);
            this.Tail1.addChild(this.Tail2);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Body.addChild(this.Hips);
            this.SnoutLeft.addChild(this.TopSnout);
            this.ForearmRight.addChild(this.HandRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Neck.addChild(this.NeckLower);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.Neck);
            this.Neck.addChild(this.Head);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.Body);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(FennecFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            //this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.633F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.933F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.633F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.547F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 1.447F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.8F) * 0.5F;
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
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.933F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.633F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 17.3F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.244F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.247F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.312F;

                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.374F;
                this.ForearmLeft.xRot = MathHelper.cos(0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.122F;
                this.HandLeft.xRot = MathHelper.cos(5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.017F;
                this.ArmRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1F) * 0.5F + 0.374F;
                this.ForearmRight.xRot = MathHelper.cos(0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.122F;
                this.HandRight.xRot = MathHelper.cos(5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.017F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.326F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.713F;
                this.LowerLegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.743F;
                this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.017F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.326F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.713F;
                this.LowerLegRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.743F;
                this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.017F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.547F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 1.447F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.8F) * 0.5F;
            }
        }
    }

        public static class Child extends FennecFoxModel {


            public ModelRenderer ArmBaseLeft;
            public ModelRenderer BackPoint;
            public ModelRenderer ArmBaseRight;
            public ModelRenderer Neck;
            public ModelRenderer ArmLeft;
            public ModelRenderer ForearmLeft;
            public ModelRenderer HandLeft;
            public ModelRenderer Hips;
            public ModelRenderer Tail1;
            public ModelRenderer ThighRight;
            public ModelRenderer ThighLeft;
            public ModelRenderer Tail2;
            public ModelRenderer Tail3;
            public ModelRenderer UpperLegRight;
            public ModelRenderer LowerLegRight;
            public ModelRenderer FootRight;
            public ModelRenderer UpperLegLeft;
            public ModelRenderer LowerLegLeft;
            public ModelRenderer FootLeft;
            public ModelRenderer ArmRight;
            public ModelRenderer ForearmRight;
            public ModelRenderer HandRight;
            public ModelRenderer NeckLower;
            public ModelRenderer Head;
            public ModelRenderer Snout2;
            public ModelRenderer EarRight;
            public ModelRenderer EarLeft;
            public ModelRenderer TopSnout;
            public ModelRenderer Mouth;
            public ModelRenderer Snout1;

            public Child() {

                this.texWidth = 48;
                this.texHeight = 32;
                this.HandRight = new ModelRenderer(this, 29, 13);
                this.HandRight.mirror = true;
                this.HandRight.setPos(-0.1F, 0.7F, 0.0F);
                this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(HandRight, -0.02007128598181587F, 0.0F, 0.0F);
                this.Tail2 = new ModelRenderer(this, 40, 5);
                this.Tail2.setPos(0.0F, 3.0F, -1.8F);
                this.Tail2.addBox(-1.02F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Tail2, 0.27506389410904797F, 0.0F, 0.0F);
                this.ArmLeft = new ModelRenderer(this, 29, 6);
                this.ArmLeft.setPos(-0.1F, 2.85F, 0.5F);
                this.ArmLeft.addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.Hips = new ModelRenderer(this, 0, 8);
                this.Hips.setPos(0.0F, 4.0F, -0.2F);
                this.Hips.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Hips, -0.04747295615358847F, 0.0F, 0.0F);
                this.Mouth = new ModelRenderer(this, 12, 26);
                this.Mouth.setPos(0.0F, 0.0F, -0.9F);
                this.Mouth.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.ForearmLeft = new ModelRenderer(this, 29, 10);
                this.ForearmLeft.setPos(-0.02F, 1.3F, -0.5F);
                this.ForearmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.Snout2 = new ModelRenderer(this, 11, 23);
                this.Snout2.setPos(0.0F, 0.5F, -2.1F);
                this.Snout2.addBox(-0.2F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Snout2, 0.2834414665291375F, 0.0F, 0.0F);
                this.Neck = new ModelRenderer(this, 0, 16);
                this.Neck.setPos(0.0F, -0.6F, 1.2F);
                this.Neck.addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Neck, -0.7796385449079339F, 0.0F, 0.0F);
                this.TopSnout = new ModelRenderer(this, 12, 20);
                this.TopSnout.setPos(0.0F, -1.2F, -0.2F);
                this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(TopSnout, 0.2834414665291375F, 0.0F, 0.0F);
                this.ArmBaseRight = new ModelRenderer(this, 28, 0);
                this.ArmBaseRight.mirror = true;
                this.ArmBaseRight.setPos(-1.4F, -0.5F, 1.65F);
                this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.LowerLegRight = new ModelRenderer(this, 16, 10);
                this.LowerLegRight.mirror = true;
                this.LowerLegRight.setPos(0.02F, 2.0F, 1.8F);
                this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(LowerLegRight, -0.6981317007977318F, -0.0F, 0.0F);
                this.Snout1 = new ModelRenderer(this, 11, 23);
                this.Snout1.setPos(0.0F, 0.0F, 0.0F);
                this.Snout1.addBox(-0.8F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Snout1, 0.017453292519943295F, 0.0F, 0.0F);
                this.FootRight = new ModelRenderer(this, 16, 14);
                this.FootRight.mirror = true;
                this.FootRight.setPos(-0.1F, 1.4F, -1.0F);
                this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(FootRight, 0.04747295615358847F, 0.0F, 0.0F);
                this.Head = new ModelRenderer(this, 16, 26);
                this.Head.setPos(0.0F, -0.6F, -2.0F);
                this.Head.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Head, 0.8414232164074996F, 0.0F, 0.0F);
                this.NeckLower = new ModelRenderer(this, 0, 21);
                this.NeckLower.setPos(0.0F, 1.3F, 0.5F);
                this.NeckLower.addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(NeckLower, -0.2569124705540972F, 0.0F, 0.0F);
                this.ArmRight = new ModelRenderer(this, 29, 6);
                this.ArmRight.mirror = true;
                this.ArmRight.setPos(0.1F, 2.85F, 0.5F);
                this.ArmRight.addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.EarRight = new ModelRenderer(this, 25, 24);
                this.EarRight.mirror = true;
                this.EarRight.setPos(-0.8F, -1.0F, -0.2F);
                this.EarRight.addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(EarRight, 0.273493095119092F, 0.6352998743575469F, -0.2792526803190927F);
                this.ArmBaseLeft = new ModelRenderer(this, 28, 0);
                this.ArmBaseLeft.setPos(1.4F, -0.5F, 1.65F);
                this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.Chest = new ModelRenderer(this, 0, 0);
                this.Chest.setPos(0.0F, 18.7F, -4.0F);
                this.Chest.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Chest, 0.02007128598181587F, 0.0F, 0.0F);
                this.ForearmRight = new ModelRenderer(this, 29, 10);
                this.ForearmRight.mirror = true;
                this.ForearmRight.setPos(0.02F, 1.3F, -0.5F);
                this.ForearmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.ThighRight = new ModelRenderer(this, 16, 0);
                this.ThighRight.mirror = true;
                this.ThighRight.setPos(-1.4F, -2.5F, 2.3F);
                this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.HandLeft = new ModelRenderer(this, 29, 13);
                this.HandLeft.setPos(0.1F, 0.7F, 0.0F);
                this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(HandLeft, -0.02007128598181587F, 0.0F, 0.0F);
                this.EarLeft = new ModelRenderer(this, 25, 24);
                this.EarLeft.setPos(0.8F, -1.0F, -0.2F);
                this.EarLeft.addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(EarLeft, 0.27366763203903305F, -0.6352998743575469F, 0.2792526803190927F);
                this.LowerLegLeft = new ModelRenderer(this, 16, 10);
                this.LowerLegLeft.setPos(-0.02F, 2.0F, 1.8F);
                this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(LowerLegLeft, -0.6981317007977318F, -0.0F, 0.0F);
                this.Tail3 = new ModelRenderer(this, 40, 10);
                this.Tail3.setPos(0.0F, 3.0F, 0.0F);
                this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Tail3, 0.23736478492913152F, 0.0F, 0.0F);
                this.ThighLeft = new ModelRenderer(this, 16, 0);
                this.ThighLeft.setPos(1.4F, -2.5F, 2.3F);
                this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
                this.UpperLegLeft = new ModelRenderer(this, 16, 6);
                this.UpperLegLeft.setPos(-0.1F, 3.0F, -1.5F);
                this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(UpperLegLeft, 0.6981317007977318F, 0.0F, 0.0F);
                this.UpperLegRight = new ModelRenderer(this, 16, 6);
                this.UpperLegRight.mirror = true;
                this.UpperLegRight.setPos(0.1F, 3.0F, -1.5F);
                this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(UpperLegRight, 0.6981317007977318F, 0.0F, 0.0F);
                this.FootLeft = new ModelRenderer(this, 16, 14);
                this.FootLeft.setPos(0.1F, 1.4F, -1.0F);
                this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(FootLeft, 0.04747295615358847F, 0.0F, 0.0F);
                this.BackPoint = new ModelRenderer(this, 0, 0);
                this.BackPoint.setPos(0.0F, -2.0F, 4.0F);
                this.BackPoint.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(BackPoint, -0.019999998568980413F, 0.0F, 0.0F);
                this.Tail1 = new ModelRenderer(this, 40, 0);
                this.Tail1.setPos(0.0F, -4.0F, 4.0F);
                this.Tail1.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
                this.setRotateAngle(Tail1, 0.3450516011087622F, 0.0F, 0.0F);
                this.ForearmRight.addChild(this.HandRight);
                this.Tail1.addChild(this.Tail2);
                this.ArmBaseLeft.addChild(this.ArmLeft);
                this.BackPoint.addChild(this.Hips);
                this.Snout2.addChild(this.Mouth);
                this.ArmLeft.addChild(this.ForearmLeft);
                this.Head.addChild(this.Snout2);
                this.Chest.addChild(this.Neck);
                this.Snout2.addChild(this.TopSnout);
                this.Chest.addChild(this.ArmBaseRight);
                this.UpperLegRight.addChild(this.LowerLegRight);
                this.Snout2.addChild(this.Snout1);
                this.LowerLegRight.addChild(this.FootRight);
                this.Neck.addChild(this.Head);
                this.Neck.addChild(this.NeckLower);
                this.ArmBaseRight.addChild(this.ArmRight);
                this.Head.addChild(this.EarRight);
                this.Chest.addChild(this.ArmBaseLeft);
                this.ArmRight.addChild(this.ForearmRight);
                this.Hips.addChild(this.ThighRight);
                this.ForearmLeft.addChild(this.HandLeft);
                this.Head.addChild(this.EarLeft);
                this.UpperLegLeft.addChild(this.LowerLegLeft);
                this.Tail2.addChild(this.Tail3);
                this.Hips.addChild(this.ThighLeft);
                this.ThighLeft.addChild(this.UpperLegLeft);
                this.ThighRight.addChild(this.UpperLegRight);
                this.LowerLegLeft.addChild(this.FootLeft);
                this.Chest.addChild(this.BackPoint);
                this.Hips.addChild(this.Tail1);
                this.saveBase();

            }

            @Override
            public void setupAnim(FennecFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            }

            @Override
            public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

            }

            @Override
            public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

                if (entity.isSprinting()) {
                    float speed = 1.0f;
                    float degree = 1.0f;


                } else {
                    float speed = 1.0f;
                    float degree = 1.0f;

                }
            }
        }
    }

 