package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SableAntelopeEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SableAntelopeModel extends ZawaBaseModel<SableAntelopeEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends SableAntelopeModel {

        public ModelPart ArmBaseLeft;
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Hips;
        public ModelPart BellyFront2;
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
        public ModelPart BellyFront1;
        public ModelPart BellyRear;
        public ModelPart Head;
        public ModelPart NeckLower;
        public ModelPart Neck_1;
        public ModelPart Snout;
        public ModelPart HornLeft;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart HornRight;
        public ModelPart TopSnout;
        public ModelPart Jaw;
        public ModelPart Mouth;
        public ModelPart Horn2Left;
        public ModelPart Horn3Left;
        public ModelPart Horn4Left;
        public ModelPart Horn3Left_1;
        public ModelPart Horn2Right;
        public ModelPart Horn3Right;
        public ModelPart Horn4Right;
        public ModelPart Horn3Right_1;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;


        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.BellyFront1 = this.BellyFront2.getChild("BellyFront1");
            this.HornRight = this.Head.getChild("HornRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Horn4Left = this.Horn3Left.getChild("Horn4Left");
            this.BellyFront2 = this.Body.getChild("BellyFront2");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Body = this.Chest.getChild("Body");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.Horn3Left = this.Horn2Left.getChild("Horn3Left");
            this.Horn3Right_1 = this.Horn3Right.getChild("Horn3Right_1");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.Head = this.Neck.getChild("Head");
            this.HornLeft = this.Head.getChild("HornLeft");
            this.Horn2Right = this.HornRight.getChild("Horn2Right");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Snout = this.Head.getChild("Snout");
            this.Horn3Left_1 = this.Horn3Left.getChild("Horn3Left_1");
            this.Horn4Right = this.Horn3Right.getChild("Horn4Right");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Mouth = this.Jaw.getChild("Mouth");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.Neck = this.Chest.getChild("Neck");
            this.Neck_1 = this.Neck.getChild("Neck_1");
            this.Jaw = this.Snout.getChild("Jaw");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.Hips = this.Body.getChild("Hips");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.Horn2Left = this.HornLeft.getChild("Horn2Left");
            this.Horn3Right = this.Horn2Right.getChild("Horn3Right");
            this.BellyRear = this.BellyFront1.getChild("BellyRear");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("BellyFront1", CubeListBuilder.create().texOffs(53, 81).addBox(-3.5F, -4.0F, 0.0F, 7.0F, 4.0F, 9.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 6.0F, 0.7819074915776542F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HornRight", CubeListBuilder.create().texOffs(0, 90).mirror(true).addBox(-1.0F, -6.25F, -1.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(-1.4F, -2.1F, -2.5F, -0.02181661564992912F, 0.0F, -0.23457224414434488F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(82, 37).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, 8.0F, -1.0F, 0.31991885055898F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn4Left", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, -0.5654867042777737F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BellyFront2", CubeListBuilder.create().texOffs(58, 102).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 7.8F, -3.8F, -0.7740534966278743F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(20, 115).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.3839724354387525F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(53, 23).mirror(true).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(-2.5F, 1.4F, -0.4F, 0.19146262360430985F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(57, 39).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 7.0F, 1.5F, -0.06475171591477989F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(59, 68).mirror(true).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offset(0.0F, 5.7F, 1.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(1, 19).addBox(-4.5F, 0.0F, 0.0F, 9.0F, 11.0F, 12.0F), PartPose.offsetAndRotation(0.0F, -5.3F, 2.8F, 0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(59, 68).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offset(-0.4F, 5.7F, 1.0F));
            partDefinition.addOrReplaceChild("Horn3Left", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -4.5F, -0.5F, -0.5654867042777737F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn3Right_1", CubeListBuilder.create().texOffs(4, 75).mirror(true).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(59, 54).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.5F, -0.039968039204879874F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 103).addBox(-2.5F, -2.5F, -4.5F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -7.0F, -0.5F, -0.8967501883168142F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HornLeft", CubeListBuilder.create().texOffs(0, 90).addBox(-1.0F, -6.25F, -1.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(1.4F, -2.1F, -2.5F, -0.17819811729441132F, 0.0F, 0.23457224414434488F));
            partDefinition.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(0, 84).mirror(true).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, -0.33091441019915835F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(53, 23).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(2.5F, 1.4F, -0.4F, 0.19146262360430985F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 114).addBox(-2.0F, 0.0F, -5.5F, 4.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -3.3F, 0.2539454094941263F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn3Left_1", CubeListBuilder.create().texOffs(4, 75).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn4Right", CubeListBuilder.create().texOffs(0, 75).mirror(true).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, -0.5654867042777737F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(85, 65).mirror(true).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offset(0.0F, 7.9F, -1.0F));
            partDefinition.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(34, 1).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 9.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -6.0F, -2.4F, -0.3127630032889644F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(32, 92).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 5.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(82, 37).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(1.5F, 8.0F, -1.0F, 0.31991885055898F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(86, 50).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 2.5F, -0.2300344007391748F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, -3.5F, 8.0F, 10.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 3.9F, -8.1F, -0.08656833156470901F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(78, 17).addBox(-0.5F, -1.0F, -2.5F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)), PartPose.offsetAndRotation(1.2F, 2.9F, 3.4F, 0.3436553390387473F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(8, 122).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.2F, -3.1F, 0.03211405881926215F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(85, 65).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offset(0.0F, 7.9F, -1.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(78, 17).mirror(true).addBox(-3.5F, -1.0F, -2.5F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F, 0.0F, 0.1F)), PartPose.offsetAndRotation(-1.2F, 2.9F, 3.4F, 0.3436553390387473F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(32, 99).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.8F, -0.5F, -0.09581857193974705F, 0.0F, -0.0031415927784254694F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(1.8F, -0.6F, -0.8F, 0.7972664076373319F, 1.0471975511965976F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(86, 50).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 2.5F, -0.2300344007391748F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 23).mirror(true).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-1.8F, -0.6F, -0.8F, 0.7972664076373319F, -1.0471975511965976F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -8.5F, -3.5F, 4.0F, 10.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -0.7F, 1.1175342987466803F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck_1", CubeListBuilder.create().texOffs(66, 0).addBox(0.0F, -8.0F, -1.5F, 0.0F, 10.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.10070549750717768F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(20, 104).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.9F, 0.0F, -0.038571777134864954F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.4954989639885458F, 0.015009831816822585F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(59, 54).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 5.0F, -2.5F, -0.039968039204879874F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 43).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 12.0F, -0.41050144805854955F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(57, 39).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 7.0F, 1.5F, -0.06475171591477989F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(0, 84).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, -0.33091441019915835F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn3Right", CubeListBuilder.create().texOffs(0, 75).mirror(true).addBox(-0.5F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -4.5F, -0.5F, -0.5654867042777737F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BellyRear", CubeListBuilder.create().texOffs(56, 94).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.5988224903277043F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 128);
        }

        @Override
        public void setupAnim(SableAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.896F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.117F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.896F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.495F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.095F;
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
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 1.117F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.896F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.495F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.095F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 3.9F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.086F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.069F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.41F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.191F;
                this.UpperArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.064F;
                this.ArmLeft.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.039F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.191F;
                this.UpperArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.064F;
                this.ArmRight.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.039F;
                this.HandRight.xRot = Mth.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.343F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.319F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.23F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.343F;
                this.UpperLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.319F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.23F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.117F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.896F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.495F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.095F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 3.9F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.086F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.069F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.41F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.191F;
                this.UpperArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.064F;
                this.ArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.039F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.191F;
                this.UpperArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.064F;
                this.ArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.039F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.343F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.319F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.23F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.343F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.319F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.23F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends SableAntelopeModel {
        public ModelPart ArmBaseLeft;
        public ModelPart Body;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
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
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart Head;
        public ModelPart Neck2;
        public ModelPart Mane;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart TopSnout;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Head = this.Neck.getChild("Head");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Tail1 = this.Body.getChild("Tail1");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.Body = this.Chest.getChild("Body");
            this.Neck2 = this.Neck.getChild("Neck2");
            this.Snout = this.Head.getChild("Snout");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.Neck = this.Chest.getChild("Neck");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.Mouth = this.Snout.getChild("Mouth");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Mane = this.Neck.getChild("Mane");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, 0.8203047484373349F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(44, 10).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 5.0F, -1.7F, 0.46896998465826234F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(44, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(2.0F, 1.5F, 6.6F, -0.06091199106104967F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.8F, -0.7F, 0.3F, 0.8600982340775168F, 0.6255260065779288F, 0.2738421523142173F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(32, 13).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.0F, -2.0F, -0.05200000127277612F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.5F, -1.5F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 12.0F, -5.0F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(44, 10).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.1F, 5.0F, -1.7F, 0.46896998465826234F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 9.0F, -1.3521065928252958F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-1.6F, 0.0F, 0.3F, 0.2609267198442009F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(53, 19).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 4.0F, -1.3F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.07853981633974483F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(53, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 4.0F, -1.3F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(32, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.0F, 0.5F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(32, 8).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 1.0F, -0.06999999915262065F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(44, 0).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-2.0F, 1.5F, 6.6F, -0.06091199106104967F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(44, 17).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 2.5F, -0.3909537457888271F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 11).mirror(true).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.8F, -0.7F, 0.4F, 0.8600982340775168F, -0.6255260065779288F, -0.27366763203903305F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(12, 57).addBox(-1.0F, 0.0F, -2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -0.5F, 0.3909537457888271F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 9.0F), PartPose.offsetAndRotation(0.0F, -3.4F, 2.3F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(12, 39).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 3.2F, 1.4F, -0.2602285888091934F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 56).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.6F, 0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(32, 18).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.0F, 0.5F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(32, 8).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 1.0F, -0.06999999915262065F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(44, 17).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 2.5F, -0.3910000182127672F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 33).addBox(-1.5F, -2.0F, -4.2F, 3.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.7F, -0.5F, -0.5729916253876715F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(32, 13).mirror(true).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.0F, -2.0F, -0.05200000127277612F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0F, -1.0F, -2.4F, 2.0F, 1.0F, 3.0F), PartPose.offset(0.0F, 1.8F, -0.4F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(1.6F, 0.0F, 0.3F, 0.2609267198442009F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mane", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F), PartPose.offset(0.0F, -1.8F, 1.8F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(SableAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.82F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.572F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.82F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.35F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.078F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.8f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.572F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.82F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.35F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.078F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 12.0F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.174F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.174F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.26F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.069F;
                this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.052F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.26F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.069F;
                this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.052F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.061F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.468F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.39F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.061F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.468F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.39F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}
