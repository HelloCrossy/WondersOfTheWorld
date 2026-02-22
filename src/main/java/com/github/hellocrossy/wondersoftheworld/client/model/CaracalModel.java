package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.CaracalEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class CaracalModel extends ZawaBaseModel<CaracalEntity> {
    protected ModelRenderer Chest;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends CaracalModel {
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
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
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer EarTuftRight;
        public ModelRenderer EarTuftLeft;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;

        public Adult() {
            texWidth = 64;
            texHeight = 64;
            this.Body = new ModelRenderer(this, 0, 13);
            this.Body.setPos(0.0F, -4.0F, 1.1F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 8.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.18256144042439712F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 31);
            this.Hips.setPos(0.0F, 0.0F, 10.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.26668630504420165F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 48, 9);
            this.Snout.setPos(-0.5F, 0.3F, -2.7F);
            this.Snout.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.0911061832922575F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 48, 4);
            this.TopSnout.setPos(0.0F, -0.9F, 0.0F);
            this.TopSnout.addBox(-1.0F, 0.0F, -2.3F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.27314402127920984F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 29);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.4F, 2.2F, 1.4F);
            this.ThighRight.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.1752310562344404F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 20, 47);
            this.NeckLower.setPos(0.0F, -5.3F, -2.4F);
            this.NeckLower.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3712315398886772F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 31, 46);
            this.ForearmRight.setPos(0.0F, 3.8F, -3.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 52, 50);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 4.0F, 3.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.5084143964585622F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 52, 59);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 4.8F, -2.5F);
            this.FootRight.addBox(-1.5F, 0.0F, -1.3F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 47);
            this.Neck.setPos(0.0F, -1.9F, -0.6F);
            this.Neck.addBox(-2.0F, -6.0F, -2.5F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.2035790361963232F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 44, 29);
            this.ThighLeft.setPos(2.4F, 2.2F, 1.4F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.1752310562344404F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 0, 58);
            this.Tail3.setPos(0.0F, 0.0F, 4.0F);
            this.Tail3.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.2593559208542449F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 10.4F, -6.0F);
            this.Chest.addBox(-3.5F, -4.0F, -2.5F, 7.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.11920598657963215F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 30, 52);
            this.HandLeft.setPos(0.0F, 2.0F, 0.8F);
            this.HandLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 27, 0);
            this.EarRight.setPos(-2.8F, -2.0F, 0.0F);
            this.EarRight.addBox(-1.0F, -2.7F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.2270673396792039F, 0.3968878679087689F, -0.18849556254433897F);
            this.Mouth = new ModelRenderer(this, 49, 13);
            this.Mouth.setPos(0.0F, 1.6F, 0.2F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarTuftLeft = new ModelRenderer(this, 37, 0);
            this.EarTuftLeft.setPos(0.0F, -2.7F, 0.5F);
            this.EarTuftLeft.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarTuftLeft, -0.4300491170387584F, 0.4300491170387584F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 31, 39);
            this.UpperArmRight.setPos(0.0F, 6.0F, 1.5F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.21694443134921734F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 50, 42);
            this.UpperLegLeft.setPos(0.0F, 7.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.5084143964585622F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 29, 29);
            this.ArmBaseLeft.setPos(2.8F, 0.3F, -0.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3186971254089062F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 27, 0);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.8F, -2.0F, 0.0F);
            this.EarLeft.addBox(-1.0F, -2.7F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.2270673396792039F, -0.3968878679087689F, 0.18849556254433897F);
            this.EarTuftRight = new ModelRenderer(this, 37, 0);
            this.EarTuftRight.mirror = true;
            this.EarTuftRight.setPos(0.0F, -2.7F, 0.5F);
            this.EarTuftRight.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarTuftRight, -0.4300491170387584F, -0.4300491170387584F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 29, 29);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.8F, 0.3F, -0.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3186971254089062F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 31, 46);
            this.ForearmLeft.setPos(0.0F, 3.8F, -3.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 52, 50);
            this.LowerLegLeft.setPos(0.0F, 4.0F, 3.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.5084143964585622F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 12, 58);
            this.Tail2.setPos(-0.5F, 2.0F, 4.0F);
            this.Tail2.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.18116517835438223F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 52, 59);
            this.FootLeft.setPos(0.0F, 4.8F, -2.5F);
            this.FootLeft.addBox(-1.5F, 0.0F, -1.3F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 31, 39);
            this.UpperArmLeft.setPos(0.0F, 6.0F, 1.5F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.21694443134921734F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 30, 52);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.0F, 0.8F);
            this.HandRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 50, 42);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 7.0F, -2.0F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.5084143964585622F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 26, 6);
            this.Head.setPos(0.5F, -6.1F, -0.7F);
            this.Head.addBox(-3.0F, -2.0F, -3.0F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -1.0086257907064895F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 24, 58);
            this.Tail1.setPos(0.0F, 0.0F, 5.0F);
            this.Tail1.addBox(-1.5F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.242674374156741F, 0.0F, 0.0F);
            this.Chest.addChild(this.Body);
            this.Body.addChild(this.Hips);
            this.Head.addChild(this.Snout);
            this.Snout.addChild(this.TopSnout);
            this.Hips.addChild(this.ThighRight);
            this.Neck.addChild(this.NeckLower);
            this.UpperArmRight.addChild(this.ForearmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Chest.addChild(this.Neck);
            this.Hips.addChild(this.ThighLeft);
            this.Tail2.addChild(this.Tail3);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.EarRight);
            this.Snout.addChild(this.Mouth);
            this.EarLeft.addChild(this.EarTuftLeft);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.EarLeft);
            this.EarRight.addChild(this.EarTuftRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperArmLeft.addChild(this.ForearmLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Tail1.addChild(this.Tail2);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.Tail1);
            this.saveBase();
        }

        @Override
        public void setupAnim(CaracalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
            this.Neck.xRot = headPitch / (180F / (float) Math.PI) * 0.5F + 1.203F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
            this.Head.xRot = headPitch / (180F / (float) Math.PI) * 0.5F - 1.008F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F + 1.204F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 1.008F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 1.242F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.181F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 0.2F;
            if (entity.isSprinting()) {
                speed = 1.8F;
                degree = 0.1F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) - 0.12F;
                this.Body.xRot = MathHelper.cos(0.0F + limbSwing * speed * 0.6F) * degree * -1.8F * limbSwingAmount + 0.18F;
                this.Hips.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.8F) - 0.27F;
                this.Neck.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) + 1.204F;
                this.Head.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) + 0.4F;
                this.Chest.y = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) + 10.4F;

                this.Tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) - 0.2F;
                this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) + 0.18F;

                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6.0F) + 0.0F;
                this.UpperArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) - 0.2F;
                this.HandLeft.xRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 5.0F) + 0.2F;
                this.ArmBaseRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6.0F) + 0.0F;
                this.UpperArmRight.xRot = MathHelper.cos(7.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) - 0.2F;
                this.HandRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 5.0F) + 0.2F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -5.0F) + 0.1F;
                this.UpperLegLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.508F;
                this.LowerLegLeft.xRot = MathHelper.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) - 0.508F;
                this.FootLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F);
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -5.0F) + 0.1F;
                this.UpperLegRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.508F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) - 0.508F;
                this.FootRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F);

            } else {
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.2F) + 1.204F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.2F) - 1.008F;

                this.Chest.y = MathHelper.cos(limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.1F) + 10.4F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.02F) - 0.12F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.1F) + 0.18F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.2F) - 0.27F;

                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1.8F) + 0.24F;
                this.UpperArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.0F) - 0.169F;
                this.HandLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -3.0F) + 0.017F;
                this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.8F) + 0.24F;
                this.UpperArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.0F) - 0.169F;
                this.HandRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 3.0F) + 0.017F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.5F) + 0.175F;
                this.UpperLegLeft.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.3F) + 0.508F;
                this.LowerLegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.0F) - 0.508F;
                this.FootLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * degree * -1.5F * limbSwingAmount + 0.0F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.5F) + 0.175F;
                this.UpperLegRight.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1.3F) + 0.508F;
                this.LowerLegRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.0F) - 0.508F;
                this.FootRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * degree * 1.5F * limbSwingAmount + 0.0F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.2F) - 1.242F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.4F) + 0.181F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.8F);
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.8F);

            }
        }
    }

    public static class Child extends CaracalModel {
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
        public ModelRenderer Snout1;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer EarRight_1;
        public ModelRenderer EarLeft_1;

        public Child() {
            texWidth = 48;
            texHeight = 32;
            this.ThighLeft = new ModelRenderer(this, 20, 0);
            this.ThighLeft.setPos(1.4F, -2.5F, 2.3F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 29, 10);
            this.ForearmLeft.setPos(-0.02F, 1.3F, -0.5F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft_1 = new ModelRenderer(this, 25, 20);
            this.EarLeft_1.setPos(-0.5F, -3.0F, -0.5F);
            this.EarLeft_1.addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft_1, -0.27366763203903305F, 0.0F, 0.2792526803190927F);
            this.ArmBaseRight = new ModelRenderer(this, 30, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.4F, -0.36F, 1.55F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 20, 10);
            this.LowerLegLeft.setPos(-0.02F, 2.0F, 1.8F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6981317007977318F, -0.0F, 0.0F);
            this.Snout1 = new ModelRenderer(this, 11, 23);
            this.Snout1.setPos(0.0F, 0.5F, -1.8F);
            this.Snout1.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout1, 0.24434609527920614F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 25, 22);
            this.EarRight.setPos(-0.6F, -0.5F, -0.2F);
            this.EarRight.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.273493095119092F, 0.47891835606830785F, -0.2792526803190927F);
            this.Hips = new ModelRenderer(this, 0, 10);
            this.Hips.setPos(0.0F, 4.0F, 0.8F);
            this.Hips.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.04747295615358847F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 19);
            this.Neck.setPos(0.0F, -0.4F, 1.7F);
            this.Neck.addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.5450663174083458F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 29, 14);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 1.7F, 0.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, -0.02007128598181587F, 0.0F, 0.0F);
            this.BackPoint = new ModelRenderer(this, 0, 0);
            this.BackPoint.setPos(0.0F, -2.0F, 4.0F);
            this.BackPoint.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BackPoint, -0.019999998568980413F, 0.0F, 0.0F);
            this.EarRight_1 = new ModelRenderer(this, 25, 20);
            this.EarRight_1.mirror = true;
            this.EarRight_1.setPos(0.5F, -3.0F, -0.5F);
            this.EarRight_1.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight_1, -0.27366763203903305F, 0.0F, -0.2792526803190927F);
            this.HandLeft = new ModelRenderer(this, 29, 14);
            this.HandLeft.setPos(0.1F, 1.7F, 0.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, -0.02007128598181587F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 20, 0);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, -2.5F, 2.3F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 20, 6);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 3.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6981317007977318F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 29, 10);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.02F, 1.3F, -0.5F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 30, 0);
            this.ArmBaseLeft.setPos(1.4F, -0.36F, 1.55F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 20, 6);
            this.UpperLegLeft.setPos(-0.1F, 3.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6981317007977318F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 40, 0);
            this.Tail1.setPos(0.0F, -4.0F, 4.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.2668608419641427F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 12, 26);
            this.Mouth.setPos(0.0F, 0.0F, -0.9F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 40, 5);
            this.Tail2.setPos(0.0F, 3.0F, -2.0F);
            this.Tail2.addBox(-1.02F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.23596852285911663F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 23, 26);
            this.Head.setPos(0.0F, -0.4F, -2.2F);
            this.Head.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.528660246408049F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 20, 15);
            this.FootLeft.setPos(0.1F, 2.4F, -1.0F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.04747295615358847F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 25, 22);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(0.6F, -0.5F, -0.2F);
            this.EarLeft.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.27366763203903305F, -0.47891835606830785F, 0.2792526803190927F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 17.7F, -4.0F);
            this.Chest.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.02007128598181587F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 0, 24);
            this.NeckLower.setPos(0.0F, 1.4F, -0.3F);
            this.NeckLower.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.3351032296987167F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 12, 20);
            this.TopSnout.setPos(0.0F, -1.4F, -0.3F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.32253683777906883F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 20, 15);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.1F, 2.4F, -1.0F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.04747295615358847F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 30, 6);
            this.ArmLeft.setPos(-0.1F, 2.85F, 0.5F);
            this.ArmLeft.addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.17453292519943295F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 20, 10);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.02F, 2.0F, 1.8F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6981317007977318F, -0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 30, 6);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.1F, 2.85F, 0.5F);
            this.ArmRight.addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.17453292519943295F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.EarLeft.addChild(this.EarLeft_1);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.Snout1);
            this.Head.addChild(this.EarRight);
            this.BackPoint.addChild(this.Hips);
            this.Chest.addChild(this.Neck);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.BackPoint);
            this.EarRight.addChild(this.EarRight_1);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Hips.addChild(this.ThighRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Hips.addChild(this.Tail1);
            this.Snout1.addChild(this.Mouth);
            this.Tail1.addChild(this.Tail2);
            this.Neck.addChild(this.Head);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.EarLeft);
            this.Neck.addChild(this.NeckLower);
            this.Snout1.addChild(this.TopSnout);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(CaracalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.528F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.545F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.528F;
            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.266F;
            this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.236F;
            this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.0f;
                float degree = 0.75f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.545F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.528F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 17.7F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.02F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.047F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.17F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.17F;
                this.ForearmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.02F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.17F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.17F;
                this.ForearmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.02F;

                this.ThighLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.698F;
                this.LowerLegLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.698F;
                this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.047F;
                this.ThighRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.698F;
                this.LowerLegRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.698F;
                this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.047F;

                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.266F;
                this.Tail2.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.236F;
                this.Tail1.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
        }
    }
}
