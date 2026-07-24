package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.MouseDeerEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class MouseDeerModel extends ZawaBaseModel<MouseDeerEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends MouseDeerModel {
        public ModelPart Hips;
        public ModelPart Chest;
        public ModelPart Tail;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart LegRight;
        public ModelPart LowerLegRight;
        public ModelPart Neck1;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Head;
        public ModelPart Neck2;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Mouth;
        public ModelPart Nose;
        public ModelPart ToothLeft;
        public ModelPart ToothRight;
        public ModelPart ForearmLeft;
        public ModelPart LowerArmLeft;
        public ModelPart ForearmRight;
        public ModelPart LowerArmRight;


        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Chest = this.Body.getChild("Chest");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.LowerArmLeft = this.ForearmLeft.getChild("LowerArmLeft");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.LowerArmRight = this.ForearmRight.getChild("LowerArmRight");

            this.Neck1 = this.Chest.getChild("Neck1");
            this.Head = this.Neck1.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.ToothLeft = this.Snout.getChild("ToothLeft");

            this.Nose = this.Snout.getChild("Nose");

            this.ToothRight = this.Snout.getChild("ToothRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.Neck2 = this.Neck1.getChild("Neck2");

            this.Hips = this.Body.getChild("Hips");
            this.Tail = this.Hips.getChild("Tail");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");

            this.LowerLegRight = this.LegRight.getChild("LowerLegRight");
            this.LowerLegLeft = this.LegLeft.getChild("LowerLegLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 17.0F, -0.5F, 0.07853981633974483F, 0.0F, 0.0F));
            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -2.2F, -1.2F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -3.0F, 0.41887902047863906F, 0.0F, 0.0F));
            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.5F, -0.1F, 0.0F, 0.03071779466865263F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(35, 6).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.3F, 2.7F, 1.0F, -0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition LowerArmLeft = ForearmLeft.addOrReplaceChild("LowerArmLeft", CubeListBuilder.create().texOffs(36, 12).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.8F, -1.2F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(34, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, -0.1F, 0.0F, 0.03071779466865263F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(35, 6).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.3F, 2.7F, 1.0F, -0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition LowerArmRight = ForearmRight.addOrReplaceChild("LowerArmRight", CubeListBuilder.create().texOffs(36, 12).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.8F, -1.2F));

            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(13, 14).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, -1.4510667294554411F, 0.0F, 0.0F));
            PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(23, 19).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.1F, -4.4F, 1.0555751236166873F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(27, 26).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -1.4F, 0.07679448875222618F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(34, 28).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 0.1F, -0.012566371113701878F, 0.0F, 0.0F));

            PartDefinition ToothLeft = Snout.addOrReplaceChild("ToothLeft", CubeListBuilder.create().texOffs(37, 24).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, -0.1F, -1.4F, 0.1563815016444822F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(19, 27).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 0.4F, 0.5082398928281348F, 0.0F, 0.0F));

            PartDefinition ToothRight = Snout.addOrReplaceChild("ToothRight", CubeListBuilder.create().texOffs(37, 24).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.8F, -0.1F, -1.4F, 0.1563815016444822F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(37, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.8F, 0.9F, -1.0164797856562695F, -0.7031931716074818F, 1.5247196451948906F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(37, 18).mirror(true).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -0.8F, 0.9F, -1.0164797856562695F, 0.7031931716074818F, -1.5247196451948906F));

            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(16, 22).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.4F, 1.5313518484155695F, 0.0F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.4F, 2.9F, -0.47944193353861736F, 0.0F, 0.0F));
            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.8F, 2.1F, 0.5497787143782138F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(1.6F, 2.8F, 2.9F, 0.6429792990978721F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(28, 9).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 1.0F, -3.7F, 1.0946705281561322F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(21, 0).mirror(true).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-1.6F, 2.8F, 2.9F, 0.6352998743575469F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(28, 9).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 1.0F, -3.7F, 1.0946705281561322F, 0.0F, 0.0F));

            PartDefinition LowerLegRight = LegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(21, 8).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 2.5F, 0.3F, -1.3267992387765453F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = LegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(21, 8).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 2.5F, 0.3F, -1.3267992387765453F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(MouseDeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            //    this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * - 1.451F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            //    this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.055F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.451F;
            this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.055F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.6f;
                float degree = 0.6f;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.6F) * 0.5F + 1.055F;
                this.Neck1.xRot = Mth.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F - 1.451F;
                this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.078F;
                this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 17.0F;

                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.030F;
                this.ForearmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.469F;
                this.LowerArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.030F;
                this.ForearmRight.xRot = Mth.cos(3.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.469F;
                this.LowerArmRight.xRot = Mth.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.642F;
                this.ThighLeft.z = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.094F;
                this.LowerLegLeft.xRot = Mth.cos(7.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 1.326F;
                this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.642F;
                this.ThighRight.z = Mth.cos(5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.094F;
                this.LowerLegRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 1.326F;


            } else {
                float speed = 0.45f;
                float degree = 0.45f;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.055F;
                this.Neck1.xRot = Mth.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 1.451F;
                this.Body.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.078F;
                this.Body.y = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 17.0F;

                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.030F;
                this.ForearmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.469F;
                this.LowerArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.030F;
                this.ForearmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.469F;
                this.LowerArmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.642F;
                this.ThighLeft.z = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.094F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 1.326F;
                this.ThighRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.642F;
                this.ThighRight.z = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 2.9F;
                this.LegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.094F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 1.326F;
            }
        }
    }

    public static class Child extends MouseDeerModel {
        public ModelPart Hips;
        public ModelPart Chest;
        public ModelPart Tail;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart LegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart LegRight;
        public ModelPart LowerLegRight;
        public ModelPart Neck1;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart Head;
        public ModelPart Neck2;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Mouth;
        public ModelPart Nose;
        public ModelPart ToothLeft;
        public ModelPart ToothRight;
        public ModelPart ForearmLeft;
        public ModelPart LowerArmLeft;
        public ModelPart ForearmRight;
        public ModelPart LowerArmRight;


        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Chest = this.Body.getChild("Chest");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.LowerArmLeft = this.ForearmLeft.getChild("LowerArmLeft");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.LowerArmRight = this.ForearmRight.getChild("LowerArmRight");

            this.Neck1 = this.Chest.getChild("Neck1");
            this.Head = this.Neck1.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.ToothLeft = this.Snout.getChild("ToothLeft");

            this.Nose = this.Snout.getChild("Nose");

            this.ToothRight = this.Snout.getChild("ToothRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.Neck2 = this.Neck1.getChild("Neck2");

            this.Hips = this.Body.getChild("Hips");
            this.Tail = this.Hips.getChild("Tail");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");

            this.LowerLegRight = this.LegRight.getChild("LowerLegRight");
            this.LowerLegLeft = this.LegLeft.getChild("LowerLegLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 17.0F, -0.5F, 0.07853981633974483F, 0.0F, 0.0F));
            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -2.2F, -1.2F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -3.0F, 0.41887902047863906F, 0.0F, 0.0F));
            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.5F, -0.1F, 0.0F, 0.03071779466865263F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(35, 6).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.3F, 2.7F, 1.0F, -0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition LowerArmLeft = ForearmLeft.addOrReplaceChild("LowerArmLeft", CubeListBuilder.create().texOffs(36, 12).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.8F, -1.2F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(34, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, -0.1F, 0.0F, 0.03071779466865263F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(35, 6).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.3F, 2.7F, 1.0F, -0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition LowerArmRight = ForearmRight.addOrReplaceChild("LowerArmRight", CubeListBuilder.create().texOffs(36, 12).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.8F, -1.2F));

            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(13, 14).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.2F, -1.4510667294554411F, 0.0F, 0.0F));
            PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(23, 19).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.1F, -4.4F, 1.0555751236166873F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(27, 26).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -1.4F, 0.07679448875222618F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(34, 28).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 0.1F, -0.012566371113701878F, 0.0F, 0.0F));

            PartDefinition ToothLeft = Snout.addOrReplaceChild("ToothLeft", CubeListBuilder.create().texOffs(37, 24).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, -0.1F, -1.4F, 0.1563815016444822F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(19, 27).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 0.4F, 0.5082398928281348F, 0.0F, 0.0F));

            PartDefinition ToothRight = Snout.addOrReplaceChild("ToothRight", CubeListBuilder.create().texOffs(37, 24).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.8F, -0.1F, -1.4F, 0.1563815016444822F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(37, 18).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.8F, 0.9F, -1.0164797856562695F, -0.7031931716074818F, 1.5247196451948906F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(37, 18).mirror(true).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -0.8F, 0.9F, -1.0164797856562695F, 0.7031931716074818F, -1.5247196451948906F));

            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(16, 22).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.4F, 1.5313518484155695F, 0.0F, 0.0F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.4F, 2.9F, -0.47944193353861736F, 0.0F, 0.0F));
            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.8F, 2.1F, 0.5497787143782138F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(1.6F, 2.8F, 2.9F, 0.6429792990978721F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(28, 9).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 1.0F, -3.7F, 1.0946705281561322F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(21, 0).mirror(true).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-1.6F, 2.8F, 2.9F, 0.6352998743575469F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(28, 9).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 1.0F, -3.7F, 1.0946705281561322F, 0.0F, 0.0F));

            PartDefinition LowerLegRight = LegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(21, 8).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 2.5F, 0.3F, -1.3267992387765453F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = LegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(21, 8).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 2.5F, 0.3F, -1.3267992387765453F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(MouseDeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            //    this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * - 1.451F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            //    this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.055F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.451F;
            this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.055F;

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
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.6F) * 0.5F + 1.055F;
                this.Neck1.xRot = Mth.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F - 1.451F;
                this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.078F;
                this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 17.0F;

                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.030F;
                this.ForearmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.469F;
                this.LowerArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.030F;
                this.ForearmRight.xRot = Mth.cos(3.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.469F;
                this.LowerArmRight.xRot = Mth.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.642F;
                this.ThighLeft.z = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.094F;
                this.LowerLegLeft.xRot = Mth.cos(7.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 1.326F;
                this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.642F;
                this.ThighRight.z = Mth.cos(5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.094F;
                this.LowerLegRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 1.326F;


            } else {
                float speed = 0.9f;
                float degree = 0.6f;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.055F;
                this.Neck1.xRot = Mth.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 1.451F;
                this.Body.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.078F;
                this.Body.y = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 17.0F;

                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.030F;
                this.ForearmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.469F;
                this.LowerArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.030F;
                this.ForearmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.469F;
                this.LowerArmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.642F;
                this.ThighLeft.z = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.9F;
                this.LegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 1.094F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 1.326F;
                this.ThighRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.642F;
                this.ThighRight.z = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 2.9F;
                this.LegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.094F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 1.326F;
            }
        }
    }
}
