package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.GuanacoEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GuanacoModel extends ZawaBaseModel<GuanacoEntity> {

    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends GuanacoModel {

        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck1;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart Tail2;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Neck2;
        public ModelPart Neck3;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Jaw;
        public ModelPart TopSnout;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.EarRight = this.Head.getChild("EarRight");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Neck1 = this.Chest.getChild("Neck1");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.Neck3 = this.Neck2.getChild("Neck3");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.Hips = this.Body.getChild("Hips");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Snout = this.Head.getChild("Snout");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.Head = this.Neck3.getChild("Head");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Jaw = this.Snout.getChild("Jaw");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.Body = this.Chest.getChild("Body");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.Neck2 = this.Neck1.getChild("Neck2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -3.0F, 0.0F, 2, 3, 1), PartPose.offsetAndRotation(1.9F, -2.0F, -0.3F, 0.136659280431156F, -0.22759093446006054F, -0.091106186954104F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(71, 58).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 2, 6, 2), PartPose.offsetAndRotation(0.0F, 7.0F, 2.5F, -0.30543261909900765F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(69, 115).addBox(-1.5F, 0.0F, -3.0F, 3, 7, 3), PartPose.offsetAndRotation(0.0F, 9.5F, 1.5F, -0.04363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 107).addBox(-4.0F, -5.0F, -3.5F, 8, 8, 7), PartPose.offsetAndRotation(0.0F, 4.5F, -8.5F, 0.40142572795869574F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 1).addBox(-1.5F, 0.0F, 0.0F, 3, 3, 4), PartPose.offsetAndRotation(0.0F, 0.0F, 4.4F, -0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(24, 0).mirror(true).addBox(-1.0F, -3.0F, 0.0F, 2, 3, 1), PartPose.offsetAndRotation(-1.9F, -2.0F, -0.3F, 0.136659280431156F, 0.22759093446006054F, 0.091106186954104F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(36, 109).addBox(-2.5F, 0.0F, -2.5F, 5, 10, 5), PartPose.offsetAndRotation(2.7F, -2.1F, 1.3F, -0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(42, 1).addBox(-3.0F, -5.0F, -5.0F, 6, 6, 8), PartPose.offsetAndRotation(0.0F, -0.8F, -3.5F, -1.1344640137963142F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(85, 118).addBox(-1.0F, -0.5F, 0.0F, 2, 5, 2), PartPose.offsetAndRotation(0.0F, 7.0F, -2.5F, -0.07853981633974483F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(40, 45).mirror(true).addBox(-2.5F, 0.0F, -3.0F, 5, 11, 6), PartPose.offsetAndRotation(-2.9F, 0.9F, 3.6F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(42, 30).addBox(-2.0F, 0.0F, -3.0F, 4, 3, 3), PartPose.offsetAndRotation(0.0F, -3.0F, -8.0F, 0.136659280431156F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(85, 118).mirror(true).addBox(-1.0F, -0.5F, 0.0F, 2, 5, 2), PartPose.offsetAndRotation(0.0F, 7.0F, -2.5F, -0.07853981633974483F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(15, 1).addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.5462880558742251F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(72, 42).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3, 7, 3), PartPose.offsetAndRotation(0.0F, 10.9F, -1.6F, 0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(59, 65).mirror(true).addBox(-1.5F, -1.0F, -1.0F, 3, 2, 2), PartPose.offsetAndRotation(0.0F, 5.6F, -1.3F, 0.04363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(37, 17).addBox(-1.0F, 0.0F, 0.0F, 2, 2, 4), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, 0.36425021489121656F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 48).addBox(-4.5F, 0.0F, 0.0F, 9, 9, 6), PartPose.offsetAndRotation(0.0F, -10.0F, 14.0F, -0.2617993877991494F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(36, 109).mirror(true).addBox(-2.5F, 0.0F, -2.5F, 5, 10, 5), PartPose.offsetAndRotation(-2.7F, -2.1F, 1.3F, -0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(71, 58).addBox(-1.0F, -0.5F, -2.0F, 2, 6, 2), PartPose.offsetAndRotation(0.0F, 7.0F, 2.5F, -0.30543261909900765F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(21, 17).addBox(-1.5F, 0.0F, -2.0F, 3, 2, 4), PartPose.offsetAndRotation(0.0F, -0.5F, -4.9F, 0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(59, 65).addBox(-1.5F, -1.0F, -1.0F, 3, 2, 2), PartPose.offsetAndRotation(0.0F, 4.5F, 0.7F, 0.04363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 16).addBox(-2.5F, -2.5F, -3.5F, 5, 5, 5), PartPose.offsetAndRotation(0.0F, 1.8F, -1.3F, 1.4114477660878142F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(59, 65).addBox(-1.5F, -1.0F, -1.0F, 3, 2, 2), PartPose.offsetAndRotation(0.0F, 5.6F, -1.3F, 0.04363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(59, 65).mirror(true).addBox(-1.5F, -1.0F, -1.0F, 3, 2, 2), PartPose.offsetAndRotation(0.0F, 4.5F, 0.7F, 0.04363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(23, 25).addBox(-1.0F, 0.0F, -3.0F, 2, 1, 4), PartPose.offsetAndRotation(0.0F, 1.8F, 1.2F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(40, 45).addBox(-2.5F, 0.0F, -3.0F, 5, 11, 6), PartPose.offsetAndRotation(2.9F, 0.9F, 3.6F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(72, 42).addBox(-1.5F, 0.0F, 0.0F, 3, 7, 3), PartPose.offsetAndRotation(0.0F, 10.9F, -1.6F, 0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 70).addBox(-5.0F, -10.0F, 0.0F, 10, 10, 14), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(69, 115).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3, 7, 3), PartPose.offsetAndRotation(0.0F, 9.5F, 1.5F, -0.04363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(42, 16).addBox(-2.0F, -3.0F, -8.0F, 4, 4, 9), PartPose.offsetAndRotation(0.0F, -0.6F, -4.9F, -0.7740535232594852F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 128);
        }

        @Override
        public void setupAnim(GuanacoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.411F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.134F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.411F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.091F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F + 0.546F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.8f;
                float degree = 0.5f;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 1.134F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.411F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.091F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F + 0.546F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 4.5F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.401F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.436F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.261F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F - 0.349F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.078F;
                this.UpperArmLeft.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.043F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F - 0.349F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.078F;
                this.UpperArmRight.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.043F;
                this.HandRight.xRot = Mth.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.087F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.436F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.305F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.087F;
                this.UpperLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.436F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.305F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.134F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 1.411F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.091F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.546F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 4.5F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.401F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.436F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.261F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.349F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.078F;
                this.UpperArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.349F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.078F;
                this.UpperArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.087F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.436F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.305F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.087F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.436F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.305F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends GuanacoModel {

        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLeRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart NeckConnection;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmLeft_1;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Hips = this.Body.getChild("Hips");
            this.NeckConnection = this.Neck2.getChild("NeckConnection");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.UpperArmLeft_1 = this.ArmBaseRight.getChild("UpperArmLeft_1");
            this.Body = this.Chest.getChild("Body");
            this.Head = this.Neck2.getChild("Head");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.Neck2 = this.Neck.getChild("Neck2");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Snout = this.Head.getChild("Snout");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.UpperLeRight = this.ThighRight.getChild("UpperLeRight");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ArmRight = this.UpperArmLeft_1.getChild("ArmRight");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.Mouth = this.Head.getChild("Mouth");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.LowerLegRight = this.UpperLeRight.getChild("LowerLegRight");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(1, 30).addBox(-3.0F, -0.5F, 0.0F, 6, 6, 3), PartPose.offsetAndRotation(0.0F, 0.0F, 6.5F, -0.18203784098300857F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckConnection", CubeListBuilder.create().texOffs(30, 9).addBox(-1.5F, -2.0F, -0.5F, 3, 2, 1), PartPose.offsetAndRotation(0.0F, -7.6F, 2.1F, 0.7740535232594852F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(42, 57).mirror(true).addBox(-1.5F, -1.0F, -1.0F, 3, 1, 2), PartPose.offsetAndRotation(0.0F, 5.9F, -1.3F, 0.04363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft_1", CubeListBuilder.create().texOffs(49, 9).addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2), PartPose.offsetAndRotation(0.0F, 5.5F, 1.0F, -0.045553093477052F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 39).addBox(-3.5F, -0.5F, -1.0F, 7, 7, 8), PartPose.offsetAndRotation(0.0F, -3.0F, 1.5F, 0.18203784098300857F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(29, 0).addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4), PartPose.offsetAndRotation(0.0F, -7.3F, -0.5F, 0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(42, 57).addBox(-1.5F, -0.5F, -1.5F, 3, 1, 2), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, 0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(43, 28).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 2, 6, 2), PartPose.offsetAndRotation(-0.01F, 4.5F, 2.5F, -0.4553564018453205F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 23).addBox(-1.5F, -0.5F, -0.5F, 3, 3, 3), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.4553564018453205F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(42, 57).addBox(-1.5F, -1.0F, -1.0F, 3, 1, 2), PartPose.offsetAndRotation(0.0F, 5.9F, -1.3F, 0.04363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(42, 36).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 5, 3), PartPose.offsetAndRotation(0.0F, 6.5F, -2.0F, 0.4553564018453205F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(18, 7).addBox(-1.5F, -8.0F, -0.5F, 3, 8, 3), PartPose.offsetAndRotation(0.0F, -1.5F, -2.0F, -0.6829473363053812F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(6, 8).addBox(-1.0F, -0.4F, -3.0F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, -1.4F, 1.2F, 0.31869712141416456F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.0F, -2.5F, -0.5F, 2, 3, 1), PartPose.offsetAndRotation(1.2F, -1.5F, 1.3F, 0.136659280431156F, -0.18203784098300857F, 0.136659280431156F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(16, 19).addBox(-2.0F, -2.0F, -2.5F, 4, 4, 4), PartPose.offsetAndRotation(0.0F, -1.0F, -1.5F, 0.7740535232594852F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(49, 0).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3), PartPose.offsetAndRotation(1.9F, -1.6F, -0.5F, 0.18203784098300857F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 16).addBox(-1.5F, -0.5F, -2.5F, 3, 4, 3), PartPose.offsetAndRotation(-0.01F, 0.2F, 2.3F, 0.5009094953223726F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(14, 0).addBox(-1.5F, -1.0F, -2.0F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, 0.5F, -2.0F, 0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(49, 17).mirror(true).addBox(-1.0F, 0.2F, -0.5F, 2, 4, 2), PartPose.offsetAndRotation(-0.01F, 5.5F, -1.5F, -0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -3.5F, -2.0F, 6, 6, 4), PartPose.offsetAndRotation(0.0F, 10.4F, -5.0F, -0.136659280431156F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -0.5F, 2, 3, 1), PartPose.offsetAndRotation(-1.2F, -1.5F, 1.3F, 0.136659280431156F, 0.18203784098300857F, -0.136659280431156F));
            partDefinition.addOrReplaceChild("UpperLeRight", CubeListBuilder.create().texOffs(42, 36).addBox(-1.0F, 0.0F, 0.0F, 2, 5, 3), PartPose.offsetAndRotation(0.0F, 6.5F, -2.0F, 0.4553564018453205F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(40, 44).addBox(-1.5F, 0.0F, -2.0F, 3, 7, 4), PartPose.offsetAndRotation(-2.1F, 1.0F, 2.0F, 0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(49, 9).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2), PartPose.offsetAndRotation(0.0F, 5.5F, 1.0F, -0.045553093477052F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(40, 44).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3, 7, 4), PartPose.offsetAndRotation(2.1F, 1.0F, 2.0F, 0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(49, 17).addBox(-1.0F, 0.2F, -0.5F, 2, 4, 2), PartPose.offsetAndRotation(-0.01F, 5.5F, -1.5F, -0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(42, 57).mirror(true).addBox(-1.5F, -0.5F, -1.5F, 3, 1, 2), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, 0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(2, 5).addBox(-1.0F, -0.5F, -2.5F, 2, 1, 2), PartPose.offsetAndRotation(0.0F, 1.4F, -1.3F, 0.091106186954104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(49, 0).addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3), PartPose.offsetAndRotation(-1.9F, -1.6F, -0.5F, 0.18203784098300857F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(43, 28).addBox(-1.0F, -0.5F, -2.0F, 2, 6, 2), PartPose.offsetAndRotation(0.01F, 4.5F, 2.5F, -0.4553564018453205F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(GuanacoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.091F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.774F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.091F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.455F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F + 0.500F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.774F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.091F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.455F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.500F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 10.4F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.136F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.182F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.182F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.182F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.091F;
                this.UpperArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.182F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.091F;
                this.UpperArmLeft_1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.091F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.455F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.455F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.091F;
                this.UpperLeRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.455F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.455F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}



