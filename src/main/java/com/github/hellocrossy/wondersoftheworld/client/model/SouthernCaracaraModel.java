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
            this.ThighRight = this.Chest.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.RightFootBackToe = this.FootRight.getChild("RightFootBackToe");

            this.RightFootLeftToe = this.FootRight.getChild("RightFootLeftToe");

            this.RightFootRightToe = this.FootRight.getChild("RightFootRightToe");

            this.Wing1Left = this.Chest.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");

            this.ThighLeft = this.Chest.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.LeftFootBackToe = this.FootLeft.getChild("LeftFootBackToe");

            this.LeftFootLeftToe = this.FootLeft.getChild("LeftFootLeftToe");

            this.LeftFootRightToe = this.FootLeft.getChild("LeftFootRightToe");

            this.Wing1Right = this.Chest.getChild("Wing1Right");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");

            this.Neck1 = this.Chest.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.BottomBeak = this.Head.getChild("BottomBeak");

            this.Brow = this.Head.getChild("Brow");

            this.CrestBase = this.Head.getChild("CrestBase");
            this.CrestRight = this.CrestBase.getChild("CrestRight");

            this.CrestLeft = this.CrestBase.getChild("CrestLeft");

            this.TopBeak1 = this.Head.getChild("TopBeak1");
            this.BeakTip1 = this.TopBeak1.getChild("BeakTip1");
            this.BeakTip2 = this.BeakTip1.getChild("BeakTip2");
            this.BeakTip3 = this.BeakTip2.getChild("BeakTip3");

            this.TopBeak2 = this.TopBeak1.getChild("TopBeak2");

            this.Body = this.Chest.getChild("Body");
            this.TailMiddle = this.Body.getChild("TailMiddle");
            this.TailLeft = this.TailMiddle.getChild("TailLeft");

            this.TailRight = this.TailMiddle.getChild("TailRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 22).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 16.8F, 0.0F, 1.0424851542267297F, 0.0F, 0.0F));
            PartDefinition ThighRight = Chest.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(54, 27).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.4F, 1.1F, -1.9F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(54, 22).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.1F, 0.6F, -2.0F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 18).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition RightFootBackToe = FootRight.addOrReplaceChild("RightFootBackToe", CubeListBuilder.create().texOffs(54, 14).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition RightFootLeftToe = FootRight.addOrReplaceChild("RightFootLeftToe", CubeListBuilder.create().texOffs(54, 14).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.45535640450848164F));

            PartDefinition RightFootRightToe = FootRight.addOrReplaceChild("RightFootRightToe", CubeListBuilder.create().texOffs(54, 14).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.45535640450848164F));

            PartDefinition Wing1Left = Chest.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(39, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(2.5F, -1.9F, 1.8F, 0.04555309164612875F, 0.04555309164612875F, 0.07853981633974483F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(30, 2).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.8F, 1.0F, -0.13665927909957545F, 0.0F, 0.13665927909957545F));

            PartDefinition ThighLeft = Chest.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(43, 27).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.4F, 1.1F, -1.9F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(45, 22).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.1F, 0.6F, -2.0F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(49, 18).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition LeftFootBackToe = FootLeft.addOrReplaceChild("LeftFootBackToe", CubeListBuilder.create().texOffs(49, 14).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition LeftFootLeftToe = FootLeft.addOrReplaceChild("LeftFootLeftToe", CubeListBuilder.create().texOffs(49, 14).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.45535640450848164F));

            PartDefinition LeftFootRightToe = FootLeft.addOrReplaceChild("LeftFootRightToe", CubeListBuilder.create().texOffs(49, 14).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.45535640450848164F));

            PartDefinition Wing1Right = Chest.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-2.5F, -1.9F, 1.8F, 0.04555309164612875F, 0.04555309164612875F, -0.07853981633974483F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(39, 10).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.8F, 1.0F, -0.13665927909957545F, 0.0F, -0.13665927909957545F));

            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.5F, 0.7740534966278743F, 0.005235987964042448F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 1).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 3.0F, -1.2341222981062239F, 0.0F, 0.0F));
            PartDefinition BottomBeak = Head.addOrReplaceChild("BottomBeak", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -0.4F, -1.1F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.9F, -3.0F, -0.12252211315710679F, 0.0F, 0.0F));

            PartDefinition Brow = Head.addOrReplaceChild("Brow", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F), PartPose.offset(0.0F, -3.0F, -3.0F));

            PartDefinition CrestBase = Head.addOrReplaceChild("CrestBase", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.8F, -3.3F, 1.639038764463741F, 0.0F, 0.0F));
            PartDefinition CrestRight = CrestBase.addOrReplaceChild("CrestRight", CubeListBuilder.create().texOffs(22, 6).addBox(0.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, 0.8F, 0.1F, 0.0F, 0.0F, 0.2275909337942703F));

            PartDefinition CrestLeft = CrestBase.addOrReplaceChild("CrestLeft", CubeListBuilder.create().texOffs(22, 6).addBox(-1.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.1F, 0.9F, 0.1F, 0.0F, 0.0F, -0.2275909337942703F));

            PartDefinition TopBeak1 = Head.addOrReplaceChild("TopBeak1", CubeListBuilder.create().texOffs(13, 3).addBox(-0.25F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.7F, -2.1F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition BeakTip1 = TopBeak1.addOrReplaceChild("BeakTip1", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -2.5F, -0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition BeakTip2 = BeakTip1.addOrReplaceChild("BeakTip2", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition BeakTip3 = BeakTip2.addOrReplaceChild("BeakTip3", CubeListBuilder.create().texOffs(8, 8).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 1.0F, 0.0F));

            PartDefinition TopBeak2 = TopBeak1.addOrReplaceChild("TopBeak2", CubeListBuilder.create().texOffs(13, 3).addBox(-0.75F, 0.0F, -2.5F, 1.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(21, 26).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F), PartPose.offset(0.0F, 2.5F, 2.5F));
            PartDefinition TailMiddle = Body.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(25, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offset(0.0F, 3.0F, -0.01F));
            PartDefinition TailLeft = TailMiddle.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(18, 19).addBox(-2.0F, -0.6F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(1.7F, 0.2F, -0.3F, -0.04555309164612875F, 0.0911061832922575F, 0.04712389063608474F));

            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(32, 19).addBox(0.0F, -0.6F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-1.7F, 0.2F, -0.3F, -0.04555309164612875F, -0.0911061832922575F, -0.04712389063608474F));

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

            this.Neck1 = this.Chest.getChild("Neck1");
            this.Head = this.Neck1.getChild("Head");
            this.LowerBill = this.Head.getChild("LowerBill");

            this.UpperBill = this.Head.getChild("UpperBill");

            this.WingLeft = this.Chest.getChild("WingLeft");

            this.LegLeft = this.Chest.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Toe1Left = this.FootLeft.getChild("Toe1Left");

            this.Toe2Left = this.FootLeft.getChild("Toe2Left");

            this.WingRight = this.Chest.getChild("WingRight");

            this.LegRight = this.Chest.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Toe2Right = this.FootRight.getChild("Toe2Right");

            this.Toe1Right = this.FootRight.getChild("Toe1Right");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.9F, 0.0F, 1.411447814024714F, 0.0F, 0.0F));
            PartDefinition TailBase = Chest.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(17, 28).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -1.5F, 0.7285004590772052F, 0.0F, 0.0F));
            PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition LowerBill = Head.addOrReplaceChild("LowerBill", CubeListBuilder.create().texOffs(5, 1).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.6F, 0.3F, -0.489739378788545F, 0.0F, 0.0F));

            PartDefinition UpperBill = Head.addOrReplaceChild("UpperBill", CubeListBuilder.create().texOffs(0, 1).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, 0.5855579507282921F, 0.0F, 0.0F));

            PartDefinition WingLeft = Chest.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(29, 0).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.9F, -1.9F, 1.1F, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F));

            PartDefinition LegLeft = Chest.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 0.9F, -1.4F, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            PartDefinition WingRight = Chest.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(38, 0).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, -1.9F, 1.1F, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F));

            PartDefinition LegRight = Chest.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, 0.9F, -1.4F, -0.500909508638178F, 0.04555309164612875F, -0.4098033003787853F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.004537855888737689F, 0.0F, -0.591841146688116F));

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


