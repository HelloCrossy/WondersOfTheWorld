package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SouthernCaracaraEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SouthernCaracaraModel extends ZawaBaseModel<SouthernCaracaraEntity> {
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

    public static class Adult extends SouthernCaracaraModel {
        public ModelRenderer Body;
        public ModelRenderer Neck1;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Wing1Right;
        public ModelRenderer Wing1Left;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailRight;
        public ModelRenderer TailLeft;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer Brow;
        public ModelRenderer TopBeak1;
        public ModelRenderer BottomBeak;
        public ModelRenderer CrestBase;
        public ModelRenderer BeakTip1;
        public ModelRenderer TopBeak2;
        public ModelRenderer BeakTip2;
        public ModelRenderer BeakTip3;
        public ModelRenderer CrestLeft;
        public ModelRenderer CrestRight;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer LeftFootLeftToe;
        public ModelRenderer LeftFootRightToe;
        public ModelRenderer LeftFootBackToe;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer RightFootLeftToe;
        public ModelRenderer RightFootRightToe;
        public ModelRenderer RightFootBackToe;
        public ModelRenderer Wing2Right;
        public ModelRenderer Wing2Left;

        public Adult() {
            texWidth = 64;
            texHeight = 32;
            this.BeakTip2 = new ModelRenderer(this, 8, 8);
            this.BeakTip2.setPos(0.0F, 1.0F, 0.0F);
            this.BeakTip2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BeakTip2, 0.9105382388075086F, 0.0F, 0.0F);
            this.LeftFootBackToe = new ModelRenderer(this, 49, 14);
            this.LeftFootBackToe.setPos(0.0F, 0.0F, 0.0F);
            this.LeftFootBackToe.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 54, 27);
            this.ThighRight.setPos(-1.4F, 1.1F, -1.9F);
            this.ThighRight.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.8196066007575706F, 0.0F, 0.0F);
            this.BottomBeak = new ModelRenderer(this, 13, 9);
            this.BottomBeak.setPos(0.0F, -0.9F, -3.0F);
            this.BottomBeak.addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BottomBeak, -0.12252211315710679F, 0.0F, 0.0F);
            this.RightFootBackToe = new ModelRenderer(this, 54, 14);
            this.RightFootBackToe.setPos(0.0F, 0.0F, 0.0F);
            this.RightFootBackToe.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.BeakTip1 = new ModelRenderer(this, 8, 8);
            this.BeakTip1.setPos(0.0F, 0.2F, -2.5F);
            this.BeakTip1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(BeakTip1, -0.9105382388075086F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 54, 22);
            this.LegRight.setPos(0.1F, 0.6F, -2.0F);
            this.LegRight.addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.500909508638178F, 0.0F, 0.0F);
            this.Wing1Left = new ModelRenderer(this, 39, 0);
            this.Wing1Left.setPos(2.5F, -1.9F, 1.8F);
            this.Wing1Left.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Left, 0.04555309164612875F, 0.04555309164612875F, 0.07853981633974483F);
            this.FootRight = new ModelRenderer(this, 54, 18);
            this.FootRight.setPos(0.0F, -0.5F, -2.5F);
            this.FootRight.addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.18203784630933073F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 22);
            this.Chest.setPos(0.0F, 16.8F, 0.0F);
            this.Chest.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 1.0424851542267297F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 1);
            this.Head.setPos(0.0F, 3.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -1.2341222981062239F, 0.0F, 0.0F);
            this.Wing2Left = new ModelRenderer(this, 30, 2);
            this.Wing2Left.setPos(0.0F, 4.8F, 1.0F);
            this.Wing2Left.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Left, -0.13665927909957545F, 0.0F, 0.13665927909957545F);
            this.CrestRight = new ModelRenderer(this, 22, 6);
            this.CrestRight.setPos(-1.1F, 0.8F, 0.1F);
            this.CrestRight.addBox(0.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestRight, 0.0F, 0.0F, 0.2275909337942703F);
            this.LegLeft = new ModelRenderer(this, 45, 22);
            this.LegLeft.setPos(0.1F, 0.6F, -2.0F);
            this.LegLeft.addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.500909508638178F, 0.0F, 0.0F);
            this.Wing2Right = new ModelRenderer(this, 39, 10);
            this.Wing2Right.setPos(0.0F, 4.8F, 1.0F);
            this.Wing2Right.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Right, -0.13665927909957545F, 0.0F, -0.13665927909957545F);
            this.FootLeft = new ModelRenderer(this, 49, 18);
            this.FootLeft.setPos(0.0F, -0.5F, -2.5F);
            this.FootLeft.addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.18203784630933073F, 0.0F, 0.0F);
            this.RightFootLeftToe = new ModelRenderer(this, 54, 14);
            this.RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootLeftToe.addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.45535640450848164F);
            this.BeakTip3 = new ModelRenderer(this, 8, 8);
            this.BeakTip3.setPos(0.0F, 1.0F, 0.0F);
            this.BeakTip3.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 25, 19);
            this.TailMiddle.setPos(0.0F, 3.0F, -0.01F);
            this.TailMiddle.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 43, 27);
            this.ThighLeft.setPos(1.4F, 1.1F, -1.9F);
            this.ThighLeft.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.8196066007575706F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 0, 8);
            this.Neck2.setPos(0.0F, 0.0F, 3.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.500909508638178F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 18, 19);
            this.TailLeft.setPos(1.7F, 0.2F, -0.3F);
            this.TailLeft.addBox(-2.0F, -0.6F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, -0.04555309164612875F, 0.0911061832922575F, 0.04712389063608474F);
            this.LeftFootLeftToe = new ModelRenderer(this, 49, 14);
            this.LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootLeftToe.addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.45535640450848164F);
            this.RightFootRightToe = new ModelRenderer(this, 54, 14);
            this.RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootRightToe.addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootRightToe, 0.0F, 0.0F, -0.45535640450848164F);
            this.Wing1Right = new ModelRenderer(this, 52, 0);
            this.Wing1Right.setPos(-2.5F, -1.9F, 1.8F);
            this.Wing1Right.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Right, 0.04555309164612875F, 0.04555309164612875F, -0.07853981633974483F);
            this.Neck1 = new ModelRenderer(this, 0, 15);
            this.Neck1.setPos(0.0F, -2.5F, -2.5F);
            this.Neck1.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.7740534966278743F, 0.005235987964042448F, 0.0F);
            this.TopBeak2 = new ModelRenderer(this, 13, 3);
            this.TopBeak2.setPos(0.0F, 0.0F, 0.0F);
            this.TopBeak2.addBox(-0.75F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LeftFootRightToe = new ModelRenderer(this, 49, 14);
            this.LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootRightToe.addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.45535640450848164F);
            this.Body = new ModelRenderer(this, 21, 26);
            this.Body.setPos(0.0F, 2.5F, 2.5F);
            this.Body.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Brow = new ModelRenderer(this, 13, 0);
            this.Brow.setPos(0.0F, -3.0F, -3.0F);
            this.Brow.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 32, 19);
            this.TailRight.setPos(-1.7F, 0.2F, -0.3F);
            this.TailRight.addBox(0.0F, -0.6F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, -0.04555309164612875F, -0.0911061832922575F, -0.04712389063608474F);
            this.CrestBase = new ModelRenderer(this, 22, 0);
            this.CrestBase.setPos(0.0F, -2.8F, -3.3F);
            this.CrestBase.addBox(-1.0F, 0.0F, -0.8F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestBase, 1.639038764463741F, 0.0F, 0.0F);
            this.TopBeak1 = new ModelRenderer(this, 13, 3);
            this.TopBeak1.setPos(0.0F, -2.7F, -2.1F);
            this.TopBeak1.addBox(-0.25F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopBeak1, 0.0911061832922575F, 0.0F, 0.0F);
            this.CrestLeft = new ModelRenderer(this, 22, 6);
            this.CrestLeft.setPos(1.1F, 0.9F, 0.1F);
            this.CrestLeft.addBox(-1.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CrestLeft, 0.0F, 0.0F, -0.2275909337942703F);
            this.BeakTip1.addChild(this.BeakTip2);
            this.FootLeft.addChild(this.LeftFootBackToe);
            this.Chest.addChild(this.ThighRight);
            this.Head.addChild(this.BottomBeak);
            this.FootRight.addChild(this.RightFootBackToe);
            this.TopBeak1.addChild(this.BeakTip1);
            this.ThighRight.addChild(this.LegRight);
            this.Chest.addChild(this.Wing1Left);
            this.LegRight.addChild(this.FootRight);
            this.Neck2.addChild(this.Head);
            this.Wing1Left.addChild(this.Wing2Left);
            this.CrestBase.addChild(this.CrestRight);
            this.ThighLeft.addChild(this.LegLeft);
            this.Wing1Right.addChild(this.Wing2Right);
            this.LegLeft.addChild(this.FootLeft);
            this.FootRight.addChild(this.RightFootLeftToe);
            this.BeakTip2.addChild(this.BeakTip3);
            this.Body.addChild(this.TailMiddle);
            this.Chest.addChild(this.ThighLeft);
            this.Neck1.addChild(this.Neck2);
            this.TailMiddle.addChild(this.TailLeft);
            this.FootLeft.addChild(this.LeftFootLeftToe);
            this.FootRight.addChild(this.RightFootRightToe);
            this.Chest.addChild(this.Wing1Right);
            this.Chest.addChild(this.Neck1);
            this.TopBeak1.addChild(this.TopBeak2);
            this.FootLeft.addChild(this.LeftFootRightToe);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.Brow);
            this.TailMiddle.addChild(this.TailRight);
            this.Head.addChild(this.CrestBase);
            this.Head.addChild(this.TopBeak1);
            this.CrestBase.addChild(this.CrestLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(SouthernCaracaraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 1.234F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.774F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 1.234F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.774F;
                this.Head.xRot = MathHelper.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 1.234F;
                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.042F;
                this.TailMiddle.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body.y = MathHelper.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 2.5F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.819F;
                this.ThighLeft.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.1F;
                this.LegLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.5F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.182F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.819F;
                this.ThighRight.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.1F;
                this.LegRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.5F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.182F;

            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.774F;
                this.Head.xRot = MathHelper.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 1.234F;
                this.Chest.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.042F;
                this.TailMiddle.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body.y = MathHelper.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 2.5F;

                this.ThighLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.819F;
                this.ThighLeft.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.1F;
                this.LegLeft.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.5F;
                this.FootLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.182F;
                this.ThighRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.819F;
                this.ThighRight.y = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.1F;
                this.LegRight.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.5F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.182F;
            }
        }
    }

    public static class Child extends SouthernCaracaraModel {
        public ModelRenderer TailBase;
        public ModelRenderer LegRight;
        public ModelRenderer LegLeft;
        public ModelRenderer WingLeft;
        public ModelRenderer WingRight;
        public ModelRenderer Neck1;
        public ModelRenderer FootRight;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe1Right;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer LowerBill;

        public Child() {
            texWidth = 64;
            texHeight = 32;
            this.TailBase = new ModelRenderer(this, 17, 28);
            this.TailBase.setPos(0.0F, 2.0F, -1.0F);
            this.TailBase.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.0911061832922575F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 24);
            this.Chest.setPos(0.0F, 20.9F, 0.0F);
            this.Chest.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 1.411447814024714F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 5, 1);
            this.LowerBill.setPos(0.0F, -0.6F, 0.3F);
            this.LowerBill.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.489739378788545F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -1.5F);
            this.Neck1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.7285004590772052F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 13, 4);
            this.FootLeft.setPos(0.0F, 0.0F, -0.9F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 29, 0);
            this.WingLeft.setPos(1.9F, -1.9F, 1.1F);
            this.WingLeft.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F);
            this.UpperBill = new ModelRenderer(this, 0, 1);
            this.UpperBill.setPos(0.0F, -0.5F, 2.0F);
            this.UpperBill.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.5855579507282921F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 13, 8);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.LegLeft = new ModelRenderer(this, 13, 0);
            this.LegLeft.setPos(1.3F, 0.9F, -1.4F);
            this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F);
            this.FootRight = new ModelRenderer(this, 20, 4);
            this.FootRight.setPos(0.0F, 0.0F, -0.9F);
            this.FootRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 38, 0);
            this.WingRight.setPos(-1.9F, -1.9F, 1.1F);
            this.WingRight.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F);
            this.Toe2Right = new ModelRenderer(this, 20, 8);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.Toe2Left = new ModelRenderer(this, 13, 8);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 0.0F, 2.0F);
            this.Head.addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.6373942508178124F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 20, 8);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.004537855888737689F, 0.0F, -0.591841146688116F);
            this.LegRight = new ModelRenderer(this, 20, 0);
            this.LegRight.setPos(-1.3F, 0.9F, -1.4F);
            this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.500909508638178F, 0.04555309164612875F, -0.4098033003787853F);
            this.Chest.addChild(this.TailBase);
            this.Head.addChild(this.LowerBill);
            this.Chest.addChild(this.Neck1);
            this.LegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.WingLeft);
            this.Head.addChild(this.UpperBill);
            this.FootLeft.addChild(this.Toe1Left);
            this.Chest.addChild(this.LegLeft);
            this.LegRight.addChild(this.FootRight);
            this.Chest.addChild(this.WingRight);
            this.FootRight.addChild(this.Toe2Right);
            this.FootLeft.addChild(this.Toe2Left);
            this.Neck1.addChild(this.Head);
            this.FootRight.addChild(this.Toe1Right);
            this.Chest.addChild(this.LegRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(SouthernCaracaraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.637F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float degree = 1.0F;
            float speed = 1.0F;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.728F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}


