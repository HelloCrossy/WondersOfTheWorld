package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.ServalEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ServalModel extends ZawaBaseModel<ServalEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends ServalModel {
        public ModelPart BackPoint;
        public ModelPart ArmBaseRight;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart Body;
        public ModelPart Hips;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart Tail2;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart NeckLower;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Mouth;
        public ModelPart TopSnout;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            texWidth = 48;
            texHeight = 48;
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-0.99F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 4.0F, 0.41887902047863906F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.1F, -1.8F, 1.2F, 0.24434609527920614F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(18, 10).mirror(true).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.1F, -1.0F, -0.9F, 0.1563815016444822F, 0.3490658503988659F, -0.24434609527920614F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(40, 9).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.02F, 3.0F, -1.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(28, 42).mirror(true).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 4.3F, 0.3F, 0.017453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(8, 27).mirror(true).addBox(-1.02F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -4.5F, 0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -1.0F, -7.3F, 2.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.1F, -1.8F, 1.2F, 0.24434609527920614F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(38, 42).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.01F, 6.2F, -1.1F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(30, 9).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 5.3F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(26, 31).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -6.0F, 9.0F, -0.24434609527920614F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(20, 14).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.0F, -4.3F, 10.7F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 33).addBox(-2.5F, -6.0F, 0.0F, 5.0F, 6.0F, 9.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(30, 9).mirror(true).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 5.3F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(18, 10).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.1F, -1.0F, -0.9F, 0.1563815016444822F, -0.3490658503988659F, 0.24434609527920614F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(38, 42).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.01F, 6.2F, -1.3F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -3.5F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(38, 16).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.02F, 3.8F, 2.7F, -0.7330382858376184F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(28, 42).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 4.3F, 0.3F, 0.017453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(38, 16).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.02F, 3.8F, 2.7F, -0.7330382858376184F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(26, 4).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 0.5F, -0.4F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 17).addBox(-3.0F, -3.5F, -1.0F, 6.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 11.9F, -6.6F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5F, -1.5F, -6.0F, 3.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.7F, 1.0F, -0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(20, 23).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 5.0F, -1.5F, 0.7330382858376184F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(20, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 5.0F, -1.5F, 0.7330382858376184F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(40, 9).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.02F, 3.0F, -1.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(20, 14).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.0F, -4.3F, 10.7F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BackPoint", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, -3.5F, 3.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.9F, 0.7F, 0.296705972839036F, 0.0F, 0.0F));
            this.Tail1 = this.Hips.getChild("Tail1");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Head = this.Neck.getChild("Head");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.Body = this.BackPoint.getChild("Body");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.Snout = this.Head.getChild("Snout");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Mouth = this.Snout.getChild("Mouth");
            this.Neck = this.Chest.getChild("Neck");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.BackPoint = this.Chest.getChild("BackPoint");
            this.TopSnout = this.Snout.getChild("TopSnout");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(ServalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
            this.Head.xRot = headPitch / (180F / (float) Math.PI) * 0.5F + 0.21F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.07F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.21F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.419F;
            this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.140F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 0.2F;
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                speed = 1.8F;
                degree = 0.1F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) - 0.17F;
                this.Body.xRot = Mth.cos(0.0F + limbSwing * speed * 0.6F) * degree * -1.8F * limbSwingAmount + 0.174F;
                this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.8F) - 0.24F;
                this.Neck.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) - 0.07F;
                this.Head.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) + 0.4F;
                this.Chest.y = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) + 11.9F;

                this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) + 1.2F;
                this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) + 0.14F;

                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6.0F) + 0.0F;
                this.ArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) - 0.2F;
                this.HandLeft.xRot = Mth.cos(-3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 5.0F) + 0.2F;
                this.ArmBaseRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6.0F) + 0.0F;
                this.ArmRight.xRot = Mth.cos(7.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) - 0.2F;
                this.HandRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 5.0F) + 0.2F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -5.0F) - 0.1F;
                this.UpperLegLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.733F;
                this.LowerLegLeft.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) - 0.733F;
                this.FootLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.17F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -5.0F) - 0.1F;
                this.UpperLegRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.733F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) - 0.733F;
                this.FootRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.17F;

            } else {
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.2F) - 0.07F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.2F) + 0.21F;

                this.Chest.y = Mth.cos(limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.1F) + 11.9F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.02F) - 0.175F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.1F) + 0.175F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.2F) - 0.244F;

                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1.8F) + 0.24F;
                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.0F) - 0.169F;
                this.HandLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -3.0F) + 0.017F;
                this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.8F) + 0.24F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.0F) - 0.169F;
                this.HandRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 3.0F) + 0.017F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.5F) - 0.175F;
                this.UpperLegLeft.xRot = Mth.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.3F) + 0.733F;
                this.LowerLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.0F) - 0.733F;
                this.FootLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * degree * -1.5F * limbSwingAmount + 0.17F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.5F) - 0.175F;
                this.UpperLegRight.xRot = Mth.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1.3F) + 0.733F;
                this.LowerLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.0F) - 0.733F;
                this.FootRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * degree * 1.5F * limbSwingAmount + 0.17F;

                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.2F) + 0.419F;
                this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.4F) + 0.140F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.8F);
                this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.8F);
            }
        }
    }

    public static class Child extends ServalModel {
        public ModelPart BackPoint;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Body;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart NeckLower;
        public ModelPart Snout2;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Snout1;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            texWidth = 64;
            texHeight = 64;
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(16, 6).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 3.0F, -1.5F, 0.6979571971673044F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -0.7F, 1.2F, -0.5298819715581228F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BackPoint", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 4.0F, -0.019999998568980413F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.4F, 1.4F, 1.1F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(29, 6).addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.1F, 2.85F, 0.5F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(16, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 3.0F, -1.5F, 0.6979571971673044F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(16, 15).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 2.4F, -1.0F, 0.04694935787733287F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(42, 5).addBox(-0.52F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.18448129660947843F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(42, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.15917402578451204F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(16, 15).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 2.4F, -1.0F, 0.04694935787733287F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(25, 24).mirror(true).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.8F, -1.0F, -0.2F, 0.273493095119092F, 0.6352998743575469F, -0.2792526803190927F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(12, 20).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -0.2F, 0.2834414665291375F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.3F, 0.5F, -0.2569124705540972F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.02F, 2.0F, 1.8F, -0.6979571971673044F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(29, 14).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 1.7F, 0.0F, -0.02007128598181587F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(29, 10).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.02F, 1.3F, -0.5F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(25, 24).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.8F, -1.0F, -0.2F, 0.27366763203903305F, -0.6352998743575469F, 0.2792526803190927F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 17.1F, -4.0F, -0.194604204939465F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(41, 1).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.33876840514893825F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 26).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -2.0F, 0.7628834000677549F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.4F, 1.4F, 1.1F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(29, 14).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 1.7F, 0.0F, -0.02007128598181587F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.4F, -0.3F, 1.65F, 0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(11, 23).addBox(-0.8F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.017453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(29, 6).mirror(true).addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.1F, 2.85F, 0.5F));
            partDefinition.addOrReplaceChild("Snout2", CubeListBuilder.create().texOffs(11, 23).addBox(-0.2F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.9F, 0.2834414665291375F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.2F, 0.18657568971450084F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(28, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.4F, -0.3F, 1.65F, 0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 0.0F, -0.9F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(29, 10).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.02F, 1.3F, -0.5F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(16, 10).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.02F, 2.0F, 1.8F, -0.6979571971673044F, -0.0F, 0.0F));
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Neck = this.Chest.getChild("Neck");
            this.BackPoint = this.Chest.getChild("BackPoint");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.TopSnout = this.Snout2.getChild("TopSnout");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Head = this.Neck.getChild("Head");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Snout1 = this.Snout2.getChild("Snout1");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.Snout2 = this.Head.getChild("Snout2");
            this.Body = this.BackPoint.getChild("Body");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.Mouth = this.Snout2.getChild("Mouth");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(ServalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.763F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.530F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.763F;
            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.339F;
            this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.184F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 0.75f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.53F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.76F;
                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 17.1F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.2F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.14F;
                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.21F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
                this.ForearmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.02F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + +0.21F;
                this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
                this.ForearmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
                this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.02F;

                this.ThighLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.14F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.7F;
                this.LowerLegLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.7F;
                this.FootLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.05F;
                this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.14F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.7F;
                this.LowerLegRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.7F;
                this.FootRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.047F;

                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.339F;
                this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.184F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
            }
        }
    }
}
