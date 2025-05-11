package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TibetanAntelopeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;


public abstract class TibetanAntelopeModel extends ZawaBaseModel<TibetanAntelopeEntity> {
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

    public static class Adult extends TibetanAntelopeModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Hips;
        public ModelRenderer Tail;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Head;
        public ModelRenderer Nose;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Horn1Left;
        public ModelRenderer Horn1Right;
        public ModelRenderer Snout;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.LowerLegLeft = new ModelRenderer(this, 32, 53);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.05F, 3.5F, 1.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6515314417274163F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 0, 43);
            this.Nose.setPos(0.0F, 0.7F, -1.2F);
            this.Nose.addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Nose, 0.1558579075294158F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 19, 54);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.0F, 4.9F, -0.5F);
            this.UpperLegLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.7143632681676012F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 29);
            this.EarLeft.mirror = true;
            this.EarLeft.setPos(1.5F, -0.5F, 1.0F);
            this.EarLeft.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.13665927909957545F, -0.6373942508178124F, 0.324631247528848F);
            this.ArmBaseLeft = new ModelRenderer(this, 22, 34);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(2.0F, 1.3F, -1.0F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.400378539728563F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 26, 44);
            this.Snout.setPos(0.0F, -1.7F, 0.2F);
            this.Snout.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.5859070245681742F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 37, 35);
            this.UpperArmRight.setPos(0.0F, 3.8F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.29007373632884353F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 46, 48);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(0.0F, -4.0F, 0.0F);
            this.Horn2Right.addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.00999999F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, -0.19547687289441354F, 0.0F, -0.13962634015954636F);
            this.Horn2Left = new ModelRenderer(this, 46, 48);
            this.Horn2Left.setPos(0.0F, -4.0F, 0.0F);
            this.Horn2Left.addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.00999999F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, -0.19547687289441354F, 0.0F, 0.13962634015954636F);
            this.Neck = new ModelRenderer(this, 31, 17);
            this.Neck.setPos(0.0F, -2.7F, -1.7F);
            this.Neck.addBox(-1.5F, -1.0F, -4.4F, 3.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.8705702495368991F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 15, 45);
            this.Mouth.setPos(0.0F, 1.9F, -1.1F);
            this.Mouth.addBox(-1.0F, -0.5F, -3.3F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.0781907508222411F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 35);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.01F, 3.8F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 49);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(2.1F, 2.5F, 2.0F);
            this.ThighLeft.addBox(-1.5F, -0.5F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.08726646259971647F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 46, 35);
            this.ArmRight.setPos(0.01F, 3.8F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 41, 2);
            this.Tail.setPos(0.0F, -0.2F, 5.0F);
            this.Tail.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.268780698149224F, 0.0F, 0.0F);
            this.Horn4Right = new ModelRenderer(this, 46, 41);
            this.Horn4Right.mirror = true;
            this.Horn4Right.setPos(-0.5F, -3.0F, 0.0F);
            this.Horn4Right.addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Right, 0.11379546689713516F, 0.0F, 0.20943951023931953F);
            this.LowerLegRight = new ModelRenderer(this, 32, 53);
            this.LowerLegRight.setPos(0.05F, 3.5F, 1.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6511823678875341F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 46, 52);
            this.Horn1Left.setPos(0.4F, -2.5F, -1.7F);
            this.Horn1Left.addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.01999998F, 0.0F, 0.01999998F);
            this.setRotateAngle(Horn1Left, -0.20525072402927477F, -0.017453292519943295F, 0.19198621771937624F);
            this.UpperLegRight = new ModelRenderer(this, 19, 54);
            this.UpperLegRight.setPos(0.0F, 4.9F, -0.5F);
            this.UpperLegRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.7143632681676012F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 37, 35);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.0F, 3.8F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.29007373632884353F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 41, 58);
            this.FootRight.setPos(0.1F, 5.3F, -1.4F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 55, 37);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 2.9F, 0.8F);
            this.HandLeft.addBox(-1.0F, -0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 29);
            this.EarRight.setPos(-1.5F, -0.5F, 1.0F);
            this.EarRight.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.13665927909957545F, 0.6373942508178124F, -0.324631247528848F);
            this.Horn3Right = new ModelRenderer(this, 46, 44);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(-0.5F, -3.0F, 1.0F);
            this.Horn3Right.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.3050835452591255F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 34);
            this.Head.setPos(0.0F, 1.8F, -3.5F);
            this.Head.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.0389944824069357F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 22, 34);
            this.ArmBaseRight.setPos(-2.0F, 1.3F, -1.0F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.400378539728563F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 41, 58);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 5.3F, -1.4F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 20, 0);
            this.Body.setPos(0.0F, -3.5F, 2.0F);
            this.Body.addBox(-3.0F, -0.5F, -1.0F, 6.0F, 8.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.12967796042712246F, 0.0F, 0.0F);
            this.Horn4Left = new ModelRenderer(this, 46, 41);
            this.Horn4Left.setPos(0.5F, -3.0F, 0.0F);
            this.Horn4Left.addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Left, 0.11379546689713516F, 0.0F, -0.20943951023931953F);
            this.HandRight = new ModelRenderer(this, 55, 37);
            this.HandRight.setPos(0.1F, 2.9F, 0.8F);
            this.HandRight.addBox(-1.0F, -0.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 46, 52);
            this.Horn1Right.mirror = true;
            this.Horn1Right.setPos(-0.4F, -2.5F, -1.7F);
            this.Horn1Right.addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.01999998F, 0.0F, 0.01999998F);
            this.setRotateAngle(Horn1Right, -0.20525072402927477F, 0.017453292519943295F, -0.19198621771937624F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 10.8F, -6.1F);
            this.Chest.addBox(-2.5F, -4.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.08656833156470901F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 13);
            this.Hips.setPos(0.0F, 0.1F, 7.5F);
            this.Hips.addBox(-2.5F, -0.5F, 0.0F, 5.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.17819811729441132F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 49);
            this.ThighRight.setPos(-2.1F, 2.5F, 2.0F);
            this.ThighRight.addBox(-1.5F, -0.5F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.08726646259971647F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 46, 44);
            this.Horn3Left.setPos(0.5F, -3.0F, 1.0F);
            this.Horn3Left.addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.3050835452591255F, 0.0F, 0.0F);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.Nose);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Head.addChild(this.EarLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Nose.addChild(this.Snout);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Horn1Left.addChild(this.Horn2Left);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Mouth);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Hips.addChild(this.ThighLeft);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Hips.addChild(this.Tail);
            this.Horn3Right.addChild(this.Horn4Right);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.Horn1Left);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.EarRight);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.ArmBaseRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Body);
            this.Horn3Left.addChild(this.Horn4Left);
            this.ArmRight.addChild(this.HandRight);
            this.Head.addChild(this.Horn1Right);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighRight);
            this.Horn2Left.addChild(this.Horn3Left);
            this.saveBase();

        }

        @Override
        public void setupAnim(TibetanAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.039F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.87F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.039F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;


            } else {
                float speed = 0.85f;
                float degree = 0.5f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.87F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 1.039F;
                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 10.8F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.086F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.129F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.178F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 0.4F;
                this.UpperArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F -0.29F;
                this.ArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.6F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.4F;
                this.UpperArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F -0.29F;
                this.ArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.6F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.087F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.714F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.651F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.087F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.714F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.651F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }


    public static class Child extends TibetanAntelopeModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.Snout = new ModelRenderer(this, 24, 5);
            this.Snout.setPos(0.0F, 0.0F, -1.0F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.13962634015954636F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 15, 22);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.1F, 0.2F, -1.0F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 9, 0);
            this.Tail.setPos(0.0F, 0.0F, 5.5F);
            this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.45535640450848164F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 21);
            this.LowerLegLeft.setPos(-0.05F, 3.0F, 1.7F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.767944870877505F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 15, 22);
            this.ArmBaseLeft.setPos(1.1F, 0.2F, -1.0F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 21);
            this.ThighLeft.setPos(1.4F, 1.3F, 4.5F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.05235987755982988F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 27);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 2.5F, -1.2F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6632251157578453F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 21, 29);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 2.5F, 0.3F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 6, 30);
            this.FootLeft.setPos(-0.1F, 3.7F, -0.7F);
            this.FootLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 0);
            this.Neck.setPos(0.0F, -1.0F, -2.0F);
            this.Neck.addBox(-1.0F, -3.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(Neck, 0.9105382388075086F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 26, 28);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.0F, -0.5F, 0.6F);
            this.EarRight.addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.4098033003787853F, -0.7740534966278743F);
            this.FootRight = new ModelRenderer(this, 6, 30);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.7F, -0.7F);
            this.FootRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 21, 29);
            this.HandLeft.setPos(-0.1F, 2.5F, 0.3F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 16, 27);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.05F, 2.0F, -1.0F);
            this.ArmRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 13, 0);
            this.Chest.setPos(0.0F, 15.9F, -2.5F);
            this.Chest.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2275909337942703F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 24, 23);
            this.UpperArmLeft.setPos(0.0F, 2.8F, 0.5F);
            this.UpperArmLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 19, 9);
            this.Head.setPos(0.0F, -2.6F, -1.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.591841146688116F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 24, 23);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 2.8F, 0.5F);
            this.UpperArmRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 21);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, 1.3F, 4.5F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.05235987755982988F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 24, 1);
            this.TopSnout.setPos(0.0F, -0.7F, -0.1F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.4098033003787853F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 27);
            this.UpperLegLeft.setPos(0.0F, 2.5F, -1.2F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6632251157578453F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 13);
            this.Mouth.setPos(0.0F, 0.4F, 0.1F);
            this.Mouth.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.04555309164612875F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 26, 28);
            this.EarLeft.setPos(1.0F, -0.5F, 0.6F);
            this.EarLeft.addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.4098033003787853F, 0.7740534966278743F);
            this.ArmLeft = new ModelRenderer(this, 16, 27);
            this.ArmLeft.setPos(-0.05F, 2.0F, -1.0F);
            this.ArmLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -1.5F, 0.0F);
            this.Body.addBox(-2.0F, -0.5F, -1.0F, 4.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2275909337942703F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 10, 21);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.05F, 3.0F, 1.7F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.767944870877505F, 0.0F, 0.0F);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.ArmBaseRight);
            this.Body.addChild(this.Tail);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Body.addChild(this.ThighLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmRight.addChild(this.HandRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.EarRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.UpperArmRight.addChild(this.ArmRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Neck.addChild(this.Head);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Body.addChild(this.ThighRight);
            this.Snout.addChild(this.TopSnout);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Snout.addChild(this.Mouth);
            this.Head.addChild(this.EarLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.Body);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(TibetanAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.59F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.91F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.59F;

            this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.46F;
            this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 0.8f;
            this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F + 0.91F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.59F;
            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.9F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.23F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.23F;
            this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.35F;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.0F;
            this.UpperArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
            this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.0F;
            this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.35F;
            this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.0F;
            this.UpperArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
            this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.0F;
            this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.05F;
            this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.66F;
            this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.77F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.05F;
            this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.66F;
            this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.77F;
            this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}

