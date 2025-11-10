package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SouthernCaracaraEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SouthernCaracaraModel extends ZawaBaseModel<SouthernCaracaraEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends SouthernCaracaraModel {
        public ModelPart Body;
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
        public ModelPart LeftFootLeftToe;
        public ModelPart LeftFootRightToe;
        public ModelPart LeftFootBackToe;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart RightFootLeftToe;
        public ModelPart RightFootRightToe;
        public ModelPart RightFootBackToe;
        public ModelPart Wing2Right;
        public ModelPart Wing2Left;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.BeakTip2 = this.BeakTip1.getChild("BeakTip2");
            this.LeftFootBackToe = this.FootLeft.getChild("LeftFootBackToe");
            this.ThighRight = this.Chest.getChild("ThighRight");
            this.BottomBeak = this.Head.getChild("BottomBeak");
            this.RightFootBackToe = this.FootRight.getChild("RightFootBackToe");
            this.BeakTip1 = this.TopBeak1.getChild("BeakTip1");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.Wing1Left = this.Chest.getChild("Wing1Left");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Head = this.Neck2.getChild("Head");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");
            this.CrestRight = this.CrestBase.getChild("CrestRight");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.RightFootLeftToe = this.FootRight.getChild("RightFootLeftToe");
            this.BeakTip3 = this.BeakTip2.getChild("BeakTip3");
            this.TailMiddle = this.Body.getChild("TailMiddle");
            this.ThighLeft = this.Chest.getChild("ThighLeft");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.TailLeft = this.TailMiddle.getChild("TailLeft");
            this.LeftFootLeftToe = this.FootLeft.getChild("LeftFootLeftToe");
            this.RightFootRightToe = this.FootRight.getChild("RightFootRightToe");
            this.Wing1Right = this.Chest.getChild("Wing1Right");
            this.Neck1 = this.Chest.getChild("Neck1");
            this.TopBeak2 = this.TopBeak1.getChild("TopBeak2");
            this.LeftFootRightToe = this.FootLeft.getChild("LeftFootRightToe");
            this.Body = this.Chest.getChild("Body");
            this.Brow = this.Head.getChild("Brow");
            this.TailRight = this.TailMiddle.getChild("TailRight");
            this.CrestBase = this.Head.getChild("CrestBase");
            this.TopBeak1 = this.Head.getChild("TopBeak1");
            this.CrestLeft = this.CrestBase.getChild("CrestLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("BeakTip2", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.9105382388075086F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftFootBackToe", CubeListBuilder.create().texOffs(49, 14).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(54, 27).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.4F, 1.1F, -1.9F, 0.8196066007575706F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BottomBeak", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.9F, -3.0F, -0.12252211315710679F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightFootBackToe", CubeListBuilder.create().texOffs(54, 14).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BeakTip1", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -2.5F, -0.9105382388075086F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(54, 22).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.1F, 0.6F, -2.0F, -0.500909508638178F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(39, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(2.5F, -1.9F, 1.8F, 0.04555309164612875F, 0.04555309164612875F, 0.07853981633974483F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 18).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 22).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 16.8F, 0.0F, 1.0424851542267297F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 1).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 3.0F, -1.2341222981062239F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(30, 2).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.8F, 1.0F, -0.13665927909957545F, 0.0F, 0.13665927909957545F));
            partDefinition.addOrReplaceChild("CrestRight", CubeListBuilder.create().texOffs(22, 6).addBox(0.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, 0.8F, 0.1F, 0.0F, 0.0F, 0.2275909337942703F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(45, 22).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.1F, 0.6F, -2.0F, -0.500909508638178F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(39, 10).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.8F, 1.0F, -0.13665927909957545F, 0.0F, -0.13665927909957545F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(49, 18).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightFootLeftToe", CubeListBuilder.create().texOffs(54, 14).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.45535640450848164F));
            partDefinition.addOrReplaceChild("BeakTip3", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 1.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(25, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offset(0.0F, 3.0F, -0.01F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(43, 27).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.4F, 1.1F, -1.9F, 0.8196066007575706F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.500909508638178F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(18, 19).addBox(-2.0F, -0.6F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(1.7F, 0.2F, -0.3F, -0.04555309164612875F, 0.0911061832922575F, 0.04712389063608474F));
            partDefinition.addOrReplaceChild("LeftFootLeftToe", CubeListBuilder.create().texOffs(49, 14).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.45535640450848164F));
            partDefinition.addOrReplaceChild("RightFootRightToe", CubeListBuilder.create().texOffs(54, 14).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.45535640450848164F));
            partDefinition.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-2.5F, -1.9F, 1.8F, 0.04555309164612875F, 0.04555309164612875F, -0.07853981633974483F));
            partDefinition.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.5F, 0.7740534966278743F, 0.005235987964042448F, 0.0F));
            partDefinition.addOrReplaceChild("TopBeak2", CubeListBuilder.create().texOffs(13, 3).addBox(-0.75F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftFootRightToe", CubeListBuilder.create().texOffs(49, 14).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.45535640450848164F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(21, 26).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F), PartPose.offset(0.0F, 2.5F, 2.5F));
            partDefinition.addOrReplaceChild("Brow", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F), PartPose.offset(0.0F, -3.0F, -3.0F));
            partDefinition.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(32, 19).addBox(0.0F, -0.6F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-1.7F, 0.2F, -0.3F, -0.04555309164612875F, -0.0911061832922575F, -0.04712389063608474F));
            partDefinition.addOrReplaceChild("CrestBase", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.8F, -3.3F, 1.639038764463741F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopBeak1", CubeListBuilder.create().texOffs(13, 3).addBox(-0.25F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.7F, -2.1F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CrestLeft", CubeListBuilder.create().texOffs(22, 6).addBox(-1.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.1F, 0.9F, 0.1F, 0.0F, 0.0F, -0.2275909337942703F));

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
                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.042F;
                this.TailMiddle.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body.y = Mth.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 2.5F;

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
                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.042F;
                this.TailMiddle.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F;
                this.Body.y = Mth.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 2.5F;

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

    public static class Child extends SouthernCaracaraModel {
        public ModelPart TailBase;
        public ModelPart LegRight;
        public ModelPart LegLeft;
        public ModelPart WingLeft;
        public ModelPart WingRight;
        public ModelPart Neck1;
        public ModelPart FootRight;
        public ModelPart Toe2Right;
        public ModelPart Toe1Right;
        public ModelPart FootLeft;
        public ModelPart Toe1Left;
        public ModelPart Toe2Left;
        public ModelPart Head;
        public ModelPart UpperBill;
        public ModelPart LowerBill;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.TailBase = this.Chest.getChild("TailBase");
            this.LowerBill = this.Head.getChild("LowerBill");
            this.Neck1 = this.Chest.getChild("Neck1");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.WingLeft = this.Chest.getChild("WingLeft");
            this.UpperBill = this.Head.getChild("UpperBill");
            this.Toe1Left = this.FootLeft.getChild("Toe1Left");
            this.LegLeft = this.Chest.getChild("LegLeft");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.WingRight = this.Chest.getChild("WingRight");
            this.Toe2Right = this.FootRight.getChild("Toe2Right");
            this.Toe2Left = this.FootLeft.getChild("Toe2Left");
            this.Head = this.Neck1.getChild("Head");
            this.Toe1Right = this.FootRight.getChild("Toe1Right");
            this.LegRight = this.Chest.getChild("LegRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(17, 28).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.9F, 0.0F, 1.411447814024714F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerBill", CubeListBuilder.create().texOffs(5, 1).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.6F, 0.3F, -0.489739378788545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -1.5F, 0.7285004590772052F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(29, 0).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.9F, -1.9F, 1.1F, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F));
            partDefinition.addOrReplaceChild("UpperBill", CubeListBuilder.create().texOffs(0, 1).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, 0.5855579507282921F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 0.9F, -1.4F, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(38, 0).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, -1.9F, 1.1F, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F));
            partDefinition.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
            partDefinition.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.6373942508178124F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.004537855888737689F, 0.0F, -0.591841146688116F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, 0.9F, -1.4F, -0.500909508638178F, 0.04555309164612875F, -0.4098033003787853F));

            return LayerDefinition.create(meshDefinition, 64, 32);
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
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.728F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}


