package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SouthernCaracaraEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SouthernCaracaraModel extends ZawaBaseModel<SouthernCaracaraEntity> {
    protected ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends SouthernCaracaraModel {
        public ModelPart Body2;
        public ModelPart Neck1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Wing1Right;
        public ModelPart Wing1Left;
        public ModelPart TailMiddle;
        public ModelPart TailRight;
        public ModelPart TailLeft;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart Brow;
        public ModelPart TopBeak1;
        public ModelPart BottomBeak;
        public ModelPart CrestBase;
        public ModelPart BeakTip1;
        public ModelPart TopBeak2;
        public ModelPart BeakTip2;
        public ModelPart BeakTip3;
        public ModelPart CrestLeft;
        public ModelPart CrestRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart FootLeftLeftToe;
        public ModelPart FootLeftRightToe;
        public ModelPart FootLeftBackToe;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart FootRightLeftToe;
        public ModelPart FootRightRightToe;
        public ModelPart FootRightBackToe;
        public ModelPart RightWing2;
        public ModelPart LeftWing2;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.Brow = this.Head.getChild("Brow");

            this.BottomBeak = this.Head.getChild("BottomBeak");

            this.TopBeak1 = this.Head.getChild("TopBeak1");
            this.TopBeak2 = this.TopBeak1.getChild("TopBeak2");
            this.BeakTip1 = this.TopBeak1.getChild("BeakTip1");
            this.BeakTip2 = this.BeakTip1.getChild("BeakTip2");
            this.BeakTip3 = this.BeakTip2.getChild("BeakTip3");

            this.CrestBase = this.Head.getChild("CrestBase");
            this.CrestRight = this.CrestBase.getChild("CrestRight");
            this.CrestLeft = this.CrestBase.getChild("CrestLeft");

            this.Body2 = this.Body.getChild("Body2");
            this.TailMiddle = this.Body2.getChild("TailMiddle");
            this.TailLeft = this.TailMiddle.getChild("TailLeft");
            this.TailRight = this.TailMiddle.getChild("TailRight");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.FootRightBackToe = this.FootRight.getChild("FootRightBackToe");
            this.FootRightRightToe = this.FootRight.getChild("FootRightRightToe");
            this.FootRightLeftToe = this.FootRight.getChild("FootRightLeftToe");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.FootLeftLeftToe = this.FootLeft.getChild("FootLeftLeftToe");
            this.FootLeftBackToe = this.FootLeft.getChild("FootLeftBackToe");
            this.FootLeftRightToe = this.FootLeft.getChild("FootLeftRightToe");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.LeftWing2 = this.Wing1Left.getChild("LeftWing2");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.RightWing2 = this.Wing1Right.getChild("RightWing2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 18).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 16.8F, 0.0F, 1.0424851542267297F, 0.0F, 0.0F));
            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -2.5F, 0.7740534966278743F, 0.005235987964042448F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 3.0F, -1.2341222981062239F, 0.0F, 0.0F));
            PartDefinition Brow = Head.addOrReplaceChild("Brow", CubeListBuilder.create().texOffs(9, 0).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, -3.0F, -3.0F));

            PartDefinition BottomBeak = Head.addOrReplaceChild("BottomBeak", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -3.0F, -0.12252211315710679F, 0.0F, 0.0F));

            PartDefinition TopBeak1 = Head.addOrReplaceChild("TopBeak1", CubeListBuilder.create().texOffs(12, 2).addBox(-0.25F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -2.1F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition TopBeak2 = TopBeak1.addOrReplaceChild("TopBeak2", CubeListBuilder.create().texOffs(12, 2).addBox(-0.75F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition BeakTip1 = TopBeak1.addOrReplaceChild("BeakTip1", CubeListBuilder.create().texOffs(7, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.5F, -0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition BeakTip2 = BeakTip1.addOrReplaceChild("BeakTip2", CubeListBuilder.create().texOffs(11, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition BeakTip3 = BeakTip2.addOrReplaceChild("BeakTip3", CubeListBuilder.create().texOffs(10, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offset(0.0F, 1.0F, 0.0F));

            PartDefinition CrestBase = Head.addOrReplaceChild("CrestBase", CubeListBuilder.create().texOffs(17, 0).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -3.3F, 1.639038764463741F, 0.0F, 0.0F));
            PartDefinition CrestLeft = CrestBase.addOrReplaceChild("CrestLeft", CubeListBuilder.create().texOffs(20, 5).addBox(-1.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.1F, 0.9F, 0.1F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition CrestRight = CrestBase.addOrReplaceChild("CrestRight", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.1F, 0.8F, 0.1F, 0.0F, 0.0F, 0.2275909337942703F));

            PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(20, 21).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.5F, 2.5F));
            PartDefinition TailMiddle = Body2.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(34, 9).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 3.0F, -0.01F));
            PartDefinition TailLeft = TailMiddle.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(34, 15).addBox(-2.0F, -0.6F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.7F, 0.2F, -0.3F, -0.04555309164612875F, 0.0911061832922575F, 0.04712389063608474F));
            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(34, 15).addBox(0.0F, -0.6F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.7F, 0.2F, -0.3F, -0.04555309164612875F, -0.0911061832922575F, -0.04712389063608474F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(17, 27).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.4F, 1.1F, -1.9F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.1F, 0.6F, -2.0F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition FootRightBackToe = FootRight.addOrReplaceChild("FootRightBackToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition FootRightRightToe = FootRight.addOrReplaceChild("FootRightRightToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.45535640450848164F));
            PartDefinition FootRightLeftToe = FootRight.addOrReplaceChild("FootRightLeftToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.45535640450848164F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(17, 27).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.4F, 1.1F, -1.9F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.1F, 0.6F, -2.0F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition FootLeftLeftToe = FootLeft.addOrReplaceChild("FootLeftLeftToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.45535640450848164F));
            PartDefinition FootLeftBackToe = FootLeft.addOrReplaceChild("FootLeftBackToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition FootLeftRightToe = FootLeft.addOrReplaceChild("FootLeftRightToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.45535640450848164F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.5F, -1.9F, 1.8F, 0.04555309164612875F, 0.04555309164612875F, 0.07853981633974483F));
            PartDefinition LeftWing2 = Wing1Left.addOrReplaceChild("LeftWing2", CubeListBuilder.create().texOffs(26, 9).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.8F, 1.0F, -0.13665927909957545F, 0.0F, 0.13665927909957545F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.5F, -1.9F, 1.8F, 0.04555309164612875F, 0.04555309164612875F, -0.07853981633974483F));
            PartDefinition RightWing2 = Wing1Right.addOrReplaceChild("RightWing2", CubeListBuilder.create().texOffs(26, 9).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.8F, 1.0F, -0.13665927909957545F, 0.0F, -0.13665927909957545F));

            return LayerDefinition.create(meshDefinition, 63, 32);
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
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.774F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 1.234F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.774F;
                this.Head.xRot = Mth.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 1.234F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.042F;
                this.TailMiddle.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body2.y = Mth.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 2.5F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.819F;
                this.ThighLeft.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.1F;
                this.LegLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.5F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.182F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.819F;
                this.ThighRight.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.1F;
                this.LegRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.5F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.182F;

            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.774F;
                this.Head.xRot = Mth.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 1.234F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.042F;
                this.TailMiddle.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body2.y = Mth.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 2.5F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.819F;
                this.ThighLeft.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.1F;
                this.LegLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.5F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.182F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.819F;
                this.ThighRight.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.1F;
                this.LegRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.5F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.182F;
            }
        }
    }

        public static class Flying extends SouthernCaracaraModel {
            public ModelPart Body2;
            public ModelPart Neck1;
            public ModelPart ThighLeft;
            public ModelPart ThighRight;
            public ModelPart Wing1Left;
            public ModelPart Wing1Right;
            public ModelPart Tail2;
            public ModelPart TailCenter;
            public ModelPart TailFeather1L;
            public ModelPart TailFeather1R;
            public ModelPart TailFeather2L;
            public ModelPart TailFeather3L;
            public ModelPart TailFeather2R;
            public ModelPart TailFeather3R;
            public ModelPart Neck2;
            public ModelPart Head;
            public ModelPart Brow;
            public ModelPart TopBeak1;
            public ModelPart BottomBeak;
            public ModelPart CrestBase;
            public ModelPart BeakTip1;
            public ModelPart TopBeak2;
            public ModelPart BeakTip2;
            public ModelPart BeakTip3;
            public ModelPart CrestLeft;
            public ModelPart CrestRight;
            public ModelPart LegLeft;
            public ModelPart FootLeft;
            public ModelPart FootLeftLeftToe;
            public ModelPart FootLeftRightToe;
            public ModelPart FootLeftBackToe;
            public ModelPart LegRight;
            public ModelPart FootRight;
            public ModelPart FootRightLeftToe;
            public ModelPart FootRightRightToe;
            public ModelPart FootRightBackToe;
            public ModelPart Wing2Left;
            public ModelPart Wing3Left;
            public ModelPart WingTip1L;
            public ModelPart WingTip2L;
            public ModelPart WingTip3L;
            public ModelPart WingTip4L;
            public ModelPart WingTip5L;
            public ModelPart WingTip6L;
            public ModelPart WingTip7L;
            public ModelPart Wing2Right;
            public ModelPart Wing3Right;
            public ModelPart WingTip1R;
            public ModelPart WingTip2R;
            public ModelPart WingTip3R;
            public ModelPart WingTip4R;
            public ModelPart WingTip5R;
            public ModelPart WingTip6R;
            public ModelPart WingTip7R;

            public Flying(ModelPart root) {
                this.Body = root.getChild("Body");
                this.Body2 = this.Body.getChild("Body2");
                this.Tail2 = this.Body2.getChild("Tail2");
                this.TailCenter = this.Tail2.getChild("TailCenter");
                this.TailFeather1R = this.TailCenter.getChild("TailFeather1R");
                this.TailFeather2R = this.TailFeather1R.getChild("TailFeather2R");
                this.TailFeather3R = this.TailFeather2R.getChild("TailFeather3R");
                this.TailFeather1L = this.TailCenter.getChild("TailFeather1L");
                this.TailFeather2L = this.TailFeather1L.getChild("TailFeather2L");
                this.TailFeather3L = this.TailFeather2L.getChild("TailFeather3L");

                this.Neck1 = this.Body.getChild("Neck1");
                this.Neck2 = this.Neck1.getChild("Neck2");
                this.Head = this.Neck2.getChild("Head");
                this.Brow = this.Head.getChild("Brow");
                this.BottomBeak = this.Head.getChild("BottomBeak");
                this.CrestBase = this.Head.getChild("CrestBase");
                this.CrestRight = this.CrestBase.getChild("CrestRight");
                this.CrestLeft = this.CrestBase.getChild("CrestLeft");
                this.TopBeak1 = this.Head.getChild("TopBeak1");
                this.BeakTip1 = this.TopBeak1.getChild("BeakTip1");
                this.BeakTip2 = this.BeakTip1.getChild("BeakTip2");
                this.BeakTip3 = this.BeakTip2.getChild("BeakTip3");
                this.TopBeak2 = this.TopBeak1.getChild("TopBeak2");

                this.Wing1Right = this.Body.getChild("Wing1Right");
                this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
                this.Wing3Right = this.Wing2Right.getChild("Wing3Right");
                this.WingTip1R = this.Wing3Right.getChild("WingTip1R");
                this.WingTip2R = this.WingTip1R.getChild("WingTip2R");
                this.WingTip3R = this.WingTip2R.getChild("WingTip3R");
                this.WingTip4R = this.WingTip3R.getChild("WingTip4R");
                this.WingTip5R = this.WingTip4R.getChild("WingTip5R");
                this.WingTip6R = this.WingTip5R.getChild("WingTip6R");
                this.WingTip7R = this.WingTip6R.getChild("WingTip7R");

                this.ThighLeft = this.Body.getChild("ThighLeft");
                this.LegLeft = this.ThighLeft.getChild("LegLeft");
                this.FootLeft = this.LegLeft.getChild("FootLeft");
                this.FootLeftLeftToe = this.FootLeft.getChild("FootLeftLeftToe");
                this.FootLeftRightToe = this.FootLeft.getChild("FootLeftRightToe");
                this.FootLeftBackToe = this.FootLeft.getChild("FootLeftBackToe");

                this.ThighRight = this.Body.getChild("ThighRight");
                this.LegRight = this.ThighRight.getChild("LegRight");
                this.FootRight = this.LegRight.getChild("FootRight");
                this.FootRightBackToe = this.FootRight.getChild("FootRightBackToe");
                this.FootRightLeftToe = this.FootRight.getChild("FootRightLeftToe");
                this.FootRightRightToe = this.FootRight.getChild("FootRightRightToe");

                this.Wing1Left = this.Body.getChild("Wing1Left");
                this.Wing2Left = this.Wing1Left.getChild("Wing2Left");
                this.Wing3Left = this.Wing2Left.getChild("Wing3Left");
                this.WingTip1L = this.Wing3Left.getChild("WingTip1L");
                this.WingTip2L = this.WingTip1L.getChild("WingTip2L");
                this.WingTip3L = this.WingTip2L.getChild("WingTip3L");
                this.WingTip4L = this.WingTip3L.getChild("WingTip4L");
                this.WingTip5L = this.WingTip4L.getChild("WingTip5L");
                this.WingTip6L = this.WingTip5L.getChild("WingTip6L");
                this.WingTip7L = this.WingTip6L.getChild("WingTip7L");
            }

            public static LayerDefinition createBodyLayer() {
                MeshDefinition meshDefinition = new MeshDefinition();
                PartDefinition partDefinition = meshDefinition.getRoot();

                PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 18).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 16.8F, 0.0F, 1.4725343378445155F, 0.0F, 0.0F));
                PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(20, 21).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.5F, 2.5F));
                PartDefinition Tail2 = Body2.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(27, 27).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-0.1F, 2.8F, -1.4F));
                PartDefinition TailCenter = Tail2.addOrReplaceChild("TailCenter", CubeListBuilder.create().texOffs(35, 25).addBox(-1.0F, 0.0F, -0.6F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.5F, 0.3F));
                PartDefinition TailFeather1R = TailCenter.addOrReplaceChild("TailFeather1R", CubeListBuilder.create().texOffs(41, 21).mirror(true).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.4F, -4.0F, -0.15F, 0.0F, 0.0F, -0.13962634015954636F));
                PartDefinition TailFeather2R = TailFeather1R.addOrReplaceChild("TailFeather2R", CubeListBuilder.create().texOffs(41, 21).mirror(true).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.0F, 0.0F, -0.13962634015954636F));
                PartDefinition TailFeather3R = TailFeather2R.addOrReplaceChild("TailFeather3R", CubeListBuilder.create().texOffs(41, 21).mirror(true).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.1F, 0.0F, 0.0F, -0.13962634015954636F));
                PartDefinition TailFeather1L = TailCenter.addOrReplaceChild("TailFeather1L", CubeListBuilder.create().texOffs(41, 21).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.4F, -4.0F, -0.15F, 0.0F, 0.0F, 0.13962634015954636F));
                PartDefinition TailFeather2L = TailFeather1L.addOrReplaceChild("TailFeather2L", CubeListBuilder.create().texOffs(41, 21).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.13962634015954636F));
                PartDefinition TailFeather3L = TailFeather2L.addOrReplaceChild("TailFeather3L", CubeListBuilder.create().texOffs(41, 21).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.1F, 0.0F, 0.0F, 0.13962634015954636F));

                PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -2.5F, 0.7740534966278743F, 0.005235987964042448F, 0.0F));
                PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.500909508638178F, 0.0F, 0.0F));
                PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 3.0F, -1.468694592184839F, 0.0F, 0.0F));
                PartDefinition Brow = Head.addOrReplaceChild("Brow", CubeListBuilder.create().texOffs(9, 0).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, -3.0F, -3.0F));
                PartDefinition BottomBeak = Head.addOrReplaceChild("BottomBeak", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -3.0F, -0.12252211315710679F, 0.0F, 0.0F));
                PartDefinition CrestBase = Head.addOrReplaceChild("CrestBase", CubeListBuilder.create().texOffs(17, 0).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -3.3F, 1.639038764463741F, 0.0F, 0.0F));
                PartDefinition CrestRight = CrestBase.addOrReplaceChild("CrestRight", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.1F, 0.8F, 0.1F, 0.0F, 0.0F, 0.2275909337942703F));
                PartDefinition CrestLeft = CrestBase.addOrReplaceChild("CrestLeft", CubeListBuilder.create().texOffs(20, 5).addBox(-1.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.1F, 0.9F, 0.1F, 0.0F, 0.0F, -0.2275909337942703F));

                PartDefinition TopBeak1 = Head.addOrReplaceChild("TopBeak1", CubeListBuilder.create().texOffs(12, 2).addBox(-0.25F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -2.1F, 0.0911061832922575F, 0.0F, 0.0F));
                PartDefinition BeakTip1 = TopBeak1.addOrReplaceChild("BeakTip1", CubeListBuilder.create().texOffs(7, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.5F, -0.9105382388075086F, 0.0F, 0.0F));
                PartDefinition BeakTip2 = BeakTip1.addOrReplaceChild("BeakTip2", CubeListBuilder.create().texOffs(11, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.9105382388075086F, 0.0F, 0.0F));
                PartDefinition BeakTip3 = BeakTip2.addOrReplaceChild("BeakTip3", CubeListBuilder.create().texOffs(10, 9).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F, 0.01F, 0.01F)), PartPose.offset(0.0F, 1.0F, 0.0F));
                PartDefinition TopBeak2 = TopBeak1.addOrReplaceChild("TopBeak2", CubeListBuilder.create().texOffs(12, 2).addBox(-0.75F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

                PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(56, 0).mirror(true).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-1.9F, -2.7F, 1.6F));
                PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(56, 8).mirror(true).addBox(-3.0F, -7.0F, -0.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-3.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.18203784630933073F));
                PartDefinition Wing3Right = Wing2Right.addOrReplaceChild("Wing3Right", CubeListBuilder.create().texOffs(56, 16).mirror(true).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-3.0F, -7.0F, 0.0F, 0.0F, 0.0F, -0.0911061832922575F));
                PartDefinition WingTip1R = Wing3Right.addOrReplaceChild("WingTip1R", CubeListBuilder.create().texOffs(60, 24).mirror(true).addBox(0.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1752310562344404F));
                PartDefinition WingTip2R = WingTip1R.addOrReplaceChild("WingTip2R", CubeListBuilder.create().texOffs(60, 24).mirror(true).addBox(0.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1926843487543837F));
                PartDefinition WingTip3R = WingTip2R.addOrReplaceChild("WingTip3R", CubeListBuilder.create().texOffs(60, 24).mirror(true).addBox(0.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1926843487543837F));
                PartDefinition WingTip4R = WingTip3R.addOrReplaceChild("WingTip4R", CubeListBuilder.create().texOffs(60, 24).mirror(true).addBox(0.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1926843487543837F));
                PartDefinition WingTip5R = WingTip4R.addOrReplaceChild("WingTip5R", CubeListBuilder.create().texOffs(60, 24).mirror(true).addBox(0.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1926843487543837F));
                PartDefinition WingTip6R = WingTip5R.addOrReplaceChild("WingTip6R", CubeListBuilder.create().texOffs(60, 24).mirror(true).addBox(0.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1926843487543837F));
                PartDefinition WingTip7R = WingTip6R.addOrReplaceChild("WingTip7R", CubeListBuilder.create().texOffs(60, 24).mirror(true).addBox(0.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1926843487543837F));

                PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(17, 27).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.7F, 0.9F, -1.7F, 1.3671164350450913F, 0.0F, 0.0F));
                PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.1F, 0.6F, -1.3F, -0.07086036663228437F, 0.0F, 0.0F));
                PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));
                PartDefinition FootLeftLeftToe = FootLeft.addOrReplaceChild("FootLeftLeftToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.45535640450848164F));
                PartDefinition FootLeftRightToe = FootLeft.addOrReplaceChild("FootLeftRightToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.45535640450848164F));
                PartDefinition FootLeftBackToe = FootLeft.addOrReplaceChild("FootLeftBackToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

                PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(17, 27).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.7F, 0.9F, -1.7F, 1.3671164350450913F, 0.0F, 0.0F));
                PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.1F, 0.6F, -1.3F, -0.07086036663228437F, 0.0F, 0.0F));
                PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));
                PartDefinition FootRightBackToe = FootRight.addOrReplaceChild("FootRightBackToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
                PartDefinition FootRightLeftToe = FootRight.addOrReplaceChild("FootRightLeftToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.45535640450848164F));
                PartDefinition FootRightRightToe = FootRight.addOrReplaceChild("FootRightRightToe", CubeListBuilder.create().texOffs(8, 29).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.45535640450848164F));

                PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(2.5F, -2.7F, 1.6F));
                PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(56, 8).addBox(0.0F, -7.0F, -0.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.0F, 7.0F, 0.0F, 0.0F, 0.0F, -0.18203784630933073F));
                PartDefinition Wing3Left = Wing2Left.addOrReplaceChild("Wing3Left", CubeListBuilder.create().texOffs(56, 16).addBox(0.0F, 0.0F, -0.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(3.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0911061832922575F));
                PartDefinition WingTip1L = Wing3Left.addOrReplaceChild("WingTip1L", CubeListBuilder.create().texOffs(60, 24).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1752310562344404F));
                PartDefinition WingTip2L = WingTip1L.addOrReplaceChild("WingTip2L", CubeListBuilder.create().texOffs(60, 24).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1926843487543837F));
                PartDefinition WingTip3L = WingTip2L.addOrReplaceChild("WingTip3L", CubeListBuilder.create().texOffs(60, 24).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1926843487543837F));
                PartDefinition WingTip4L = WingTip3L.addOrReplaceChild("WingTip4L", CubeListBuilder.create().texOffs(60, 24).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1926843487543837F));
                PartDefinition WingTip5L = WingTip4L.addOrReplaceChild("WingTip5L", CubeListBuilder.create().texOffs(60, 24).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1926843487543837F));
                PartDefinition WingTip6L = WingTip5L.addOrReplaceChild("WingTip6L", CubeListBuilder.create().texOffs(60, 24).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1926843487543837F));
                PartDefinition WingTip7L = WingTip6L.addOrReplaceChild("WingTip7L", CubeListBuilder.create().texOffs(60, 24).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1926843487543837F));

                return LayerDefinition.create(meshDefinition, 64, 32);
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
                float degree = 0.5f;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.774F;
                this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.5F;
                this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.234F;
                this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.47F;
                this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 16.8F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.07F;
                this.LegRight.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.07F;

                this.Wing1Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F;
                this.Wing1Left.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F;
                this.Wing2Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.182F;
                this.Wing2Left.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.Wing1Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F;
                this.Wing1Right.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F;
                this.Wing2Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
                this.Wing2Right.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
            }

            @Override
            public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.0f;
                float degree = 0.65f;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.774F;
                this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.5F;
                this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.234F;
                this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.47F;
                this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 16.8F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.07F;
                this.LegRight.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.07F;

                this.Wing1Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
                this.Wing1Left.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.500F;
                this.Wing2Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
                this.Wing2Left.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.Wing1Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
                this.Wing1Right.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.500F;
                this.Wing2Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
                this.Wing2Right.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
            }
        }


        public static class Child extends SouthernCaracaraModel {
            public ModelPart WingLeft;
            public ModelPart WingRight;
            public ModelPart ThighRight;
            public ModelPart Neck;
            public ModelPart Tail;
            public ModelPart ThighLeft;
            public ModelPart LegRight;
            public ModelPart FootRight;
            public ModelPart Toe2R;
            public ModelPart Toe1R;
            public ModelPart Head;
            public ModelPart TopBeak1;
            public ModelPart Brow;
            public ModelPart CrestBase;
            public ModelPart BeakTip1;
            public ModelPart TopBeak2;
            public ModelPart BeakTip2;
            public ModelPart BeakTip3;
            public ModelPart CrestLeft;
            public ModelPart CrestRight;
            public ModelPart LegLeft;
            public ModelPart FootLeft;
            public ModelPart Toe1L;
            public ModelPart Toe2L;

            public Child(ModelPart root) {
                this.Body = root.getChild("Body");
                this.Tail = this.Body.getChild("Tail");

                this.Neck = this.Body.getChild("Neck");
                this.Head = this.Neck.getChild("Head");
                this.Brow = this.Head.getChild("Brow");
                this.CrestBase = this.Head.getChild("CrestBase");
                this.CrestLeft = this.CrestBase.getChild("CrestLeft");
                this.CrestRight = this.CrestBase.getChild("CrestRight");
                this.TopBeak1 = this.Head.getChild("TopBeak1");
                this.BeakTip1 = this.TopBeak1.getChild("BeakTip1");
                this.BeakTip2 = this.BeakTip1.getChild("BeakTip2");
                this.BeakTip3 = this.BeakTip2.getChild("BeakTip3");
                this.TopBeak2 = this.TopBeak1.getChild("TopBeak2");

                this.WingLeft = this.Body.getChild("WingLeft");

                this.ThighRight = this.Body.getChild("ThighRight");
                this.LegRight = this.ThighRight.getChild("LegRight");
                this.FootRight = this.LegRight.getChild("FootRight");
                this.Toe1R = this.FootRight.getChild("Toe1R");
                this.Toe2R = this.FootRight.getChild("Toe2R");

                this.ThighLeft = this.Body.getChild("ThighLeft");
                this.LegLeft = this.ThighLeft.getChild("LegLeft");
                this.FootLeft = this.LegLeft.getChild("FootLeft");
                this.Toe1L = this.FootLeft.getChild("Toe1L");
                this.Toe2L = this.FootLeft.getChild("Toe2L");

                this.WingRight = this.Body.getChild("WingRight");
            }

            public static LayerDefinition createBodyLayer() {
                MeshDefinition meshDefinition = new MeshDefinition();
                PartDefinition partDefinition = meshDefinition.getRoot();
                PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 20.3F, 0.0F, -0.6373942508178124F, 0.0F, 0.0F));
                PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 25).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.5F, 0.3642502295386026F, 0.0F, 0.0F));

                PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -3.0F, -2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.65F, -1.6F, 0.4098033003787853F, 0.0F, 0.0F));
                PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -1.8F, 0.28658306450904947F, 0.0F, 0.0F));
                PartDefinition Brow = Head.addOrReplaceChild("Brow", CubeListBuilder.create().texOffs(22, 22).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, -2.0F, -1.2F));

                PartDefinition CrestBase = Head.addOrReplaceChild("CrestBase", CubeListBuilder.create().texOffs(23, 12).addBox(-1.5F, 0.0F, -0.8F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, -1.5F, 1.639038764463741F, 0.0F, 0.0F));
                PartDefinition CrestLeft = CrestBase.addOrReplaceChild("CrestLeft", CubeListBuilder.create().texOffs(22, 6).addBox(-1.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.5F, 0.9F, 0.1F, 0.0F, 0.0F, -0.2275909337942703F));
                PartDefinition CrestRight = CrestBase.addOrReplaceChild("CrestRight", CubeListBuilder.create().texOffs(22, 6).addBox(0.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.5F, 0.8F, 0.1F, 0.0F, 0.0F, 0.2275909337942703F));

                PartDefinition TopBeak1 = Head.addOrReplaceChild("TopBeak1", CubeListBuilder.create().texOffs(15, 25).addBox(-0.25F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -0.8F, 0.0911061832922575F, 0.0F, 0.0F));
                PartDefinition BeakTip1 = TopBeak1.addOrReplaceChild("BeakTip1", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.5F, -0.9105382388075086F, 0.0F, 0.0F));
                PartDefinition TopBeak2 = TopBeak1.addOrReplaceChild("TopBeak2", CubeListBuilder.create().texOffs(15, 25).addBox(-0.75F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
                PartDefinition BeakTip2 = BeakTip1.addOrReplaceChild("BeakTip2", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.9105382388075086F, 0.0F, 0.0F));
                PartDefinition BeakTip3 = BeakTip2.addOrReplaceChild("BeakTip3", CubeListBuilder.create().texOffs(13, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F, 0.0F, 0.02F)), PartPose.offset(0.0F, 1.0F, 0.0F));

                PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(12, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.5F, -1.0F, -2.0F, 0.04555309164612875F, 0.0F, 0.0F));

                PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(15, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.7F, 0.2F, 0.0F, 1.0016445136459287F, 0.0F, 0.0F));
                PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, -1.9123572560838649F, 0.0F, 0.0F));
                PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 1.5481069932557485F, 0.0F, 0.0F));
                PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, -0.27314403792396663F, 0.0F));
                PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, 0.27314403792396663F, 0.0F));

                PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.7F, 0.2F, 0.0F, 1.0016445136459287F, 0.0F, 0.0F));
                PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, -1.9123572560838649F, 0.0F, 0.0F));
                PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 1.5481069932557485F, 0.0F, 0.0F));
                PartDefinition Toe1L = FootLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, -0.27314403792396663F, 0.0F));
                PartDefinition Toe2L = FootLeft.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, 0.27314403792396663F, 0.0F));

                PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(12, 13).mirror(true).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.5F, -1.0F, -2.0F, 0.04555309164612875F, 0.0F, 0.0F));
                return LayerDefinition.create(meshDefinition, 32,32);
            }

            @Override
            public void setupAnim(SouthernCaracaraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
                this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
                this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
                this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.286F;
                this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
            }

            @Override
            public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float degree = 1.0F;
                float speed = 1.0F;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.4F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.286F;
            }

            @Override
            public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}


