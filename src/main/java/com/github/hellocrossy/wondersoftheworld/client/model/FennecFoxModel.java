package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.FennecFoxEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class FennecFoxModel extends ZawaBaseModel<FennecFoxEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);

        }

        return this.parts;
    }

    public static class Adult extends FennecFoxModel {


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
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart CheekLeft;
        public ModelPart CheekRight;
        public ModelPart EarRight;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart UpperArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Head = this.Neck.getChild("Head");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.Nose = this.Snout.getChild("Nose");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.Body = this.Chest.getChild("Body");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Hips = this.Body.getChild("Hips");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.ForearmLeft = this.UpperArmLeft.getChild("ForearmLeft");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.ForearmRight = this.UpperArmRight.getChild("ForearmRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Neck = this.Chest.getChild("Neck");
            this.Mouth = this.Snout.getChild("Mouth");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.CheekLeft = this.Head.getChild("CheekLeft");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.Snout = this.Head.getChild("Snout");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.CheekRight = this.Head.getChild("CheekRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(19, 35).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.6F, 0.0F, 0.0F, 0.162315623764424F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(34, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.1F, -2.5F, 0.8991936386169619F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(27, 14).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-1.6F, 1.1F, 1.0F, 0.2275909337942703F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(53, 10).addBox(-0.5F, -1.2F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.23457224414434488F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(32, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, 0.6829473549475088F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 9).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -2.9F, 0.5F, 0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(40, 38).addBox(-1.0F, -0.5F, -1.4F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.8F, 0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(22, 23).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, 2.5F, -0.6829473549475088F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 22).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.23457224414434488F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(22, 23).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.6F, 2.5F, -0.6829473549475088F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(31, 33).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -2.0F, -0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.8600982340775168F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(27, 14).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(1.6F, 1.1F, 1.0F, 0.2275909337942703F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(32, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, 0.6829473549475088F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(31, 33).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.9F, -2.0F, -0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(22, 30).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 3.0F, -1.5F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(51, 0).addBox(-1.5F, -3.5F, 0.0F, 3.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-1.9F, -2.0F, 0.0F, 0.27314402127920984F, 0.3186971254089062F, -0.2275909337942703F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, 0.0F, 0.1F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.1F, 0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.27436576307404054F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(17, 0).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -1.0F, -0.6646214111173737F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(53, 14).addBox(-0.5F, -0.5F, -1.8F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -0.5F, -0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(31, 38).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 1.0F, -0.06475171591477989F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(40, 38).addBox(-1.0F, -0.5F, -1.4F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.8F, 0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(22, 30).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, 3.0F, -1.5F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(51, 0).addBox(-1.5F, -3.5F, 0.0F, 3.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(1.9F, -2.0F, 0.0F, 0.27314402127920984F, -0.3186971254089062F, 0.2275909337942703F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, -1.5F, 5.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 15.3F, -4.0F, -0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(40, 8).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(1.1F, 1.1F, -1.2F, -0.11728612207217244F, 0.0781907508222411F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(31, 38).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 1.0F, -0.06475171591477989F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(30, 9).addBox(-1.0F, -1.0F, -2.4F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.3F, 0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(19, 35).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.6F, 0.0F, 0.0F, 0.162315623764424F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(40, 8).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-1.1F, 1.1F, -1.2F, -0.11728612207217244F, -0.0781907508222411F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(FennecFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.899F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.665F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.899F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.860F;
            this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.274F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.5f;
                float degree = 0.5f;
                this.Neck.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.665F;
                this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.899F;
                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -3F) * 0.5F + 15.3F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.117F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.117F;
                this.Hips.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.7F) * 0.5F + -0.235F;

                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.860F;
                this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.1F) * 0.5F + 0.274F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.9F) * 0.5F;
                this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.2F) * 0.5F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.162F;
                this.ArmBaseLeft.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F;
                this.ForearmLeft.xRot = Mth.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 0.052F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = Mth.cos(4.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.162F;
                this.ArmBaseRight.y = Mth.cos(3.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F;
                this.ForearmRight.xRot = Mth.cos(3.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 0.052F;
                this.HandRight.xRot = Mth.cos(4.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.162F;

                this.ThighLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.228F;
                this.UpperLegLeft.xRot = Mth.cos(0.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.683F;
                this.LowerLegLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2.0F) * 0.5F - 0.683F;
                this.FootLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.228F;
                this.UpperLegRight.xRot = Mth.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.683F;
                this.LowerLegRight.xRot = Mth.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2.0F) * 0.5F - 0.683F;
                this.FootRight.xRot = Mth.cos(5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) * 0.5F;

            } else {
                float speed = 0.75f;
                float degree = 0.75f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.665F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.899F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.3F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.117F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.117F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.235F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F + 0.162F;
                this.ForearmLeft.xRot = Mth.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.052F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.162F;
                this.ForearmRight.xRot = Mth.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.052F;
                this.HandRight.xRot = Mth.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.078F;

                this.ThighLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.228F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.683F;
                this.LowerLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 0.683F;
                this.FootLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.228F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.683F;
                this.LowerLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.683F;
                this.FootRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F;

                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.860F;
                this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.274F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

            }
        }
    }

    public static class Child extends FennecFoxModel {


        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart UpperLegLeft;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart CheekLeft;
        public ModelPart Snout;
        public ModelPart CheekRIght;
        public ModelPart EarLeft_1;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegRight = this.UpperLegRight.getChild("LegRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.Mouth = this.Snout.getChild("Mouth");
            this.EarLeft_1 = this.Head.getChild("EarLeft_1");
            this.Tail1 = this.Body.getChild("Tail1");
            this.Head = this.Neck.getChild("Head");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.Body = this.Chest.getChild("Body");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.CheekLeft = this.Head.getChild("CheekLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Snout = this.Head.getChild("Snout");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Nose = this.Snout.getChild("Nose");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Neck = this.Chest.getChild("Neck");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.CheekRIght = this.Head.getChild("CheekRIght");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.LegLeft = this.UpperLegLeft.getChild("LegLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(24, 10).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.7F, 1.3F, 1.7F, 0.03909537541112055F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 13).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.1F, 0.0F)), PartPose.offsetAndRotation(-0.01F, 0.9F, 1.0F, -1.0224139077762113F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(26, 1).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F, 0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, 0.2738421523142173F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(14, 13).mirror(true).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.02F, 1.1F, 0.4F, -0.47123889803846897F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(19, 11).addBox(-0.5F, -0.6F, -0.9F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.5F, -0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft_1", CubeListBuilder.create().texOffs(22, 0).mirror(true).addBox(-0.5F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F, 0.2F, 0.0F)), PartPose.offsetAndRotation(-1.5F, -1.0F, 0.0F, 0.11676252795710604F, 0.3186971254089062F, -0.2275909337942703F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(1, 12).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.7F, -0.9773843811168246F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(12, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -1.1F, 0.6646214111173737F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(14, 11).mirror(true).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.3F, 0.0F)), PartPose.offsetAndRotation(-0.8F, 0.9F, -0.4F, 0.21781708265940905F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(24, 10).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.7F, 1.3F, 1.7F, 0.03909537541112055F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.7F, -0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(10, 14).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -0.5F, 0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(5, 12).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 1.5F, -0.7F, -0.11728612207217244F, 0.0781907508222411F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(22, 0).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F, 0.2F, 0.0F)), PartPose.offsetAndRotation(1.5F, -1.0F, 0.0F, 0.11676252795710604F, -0.3186971254089062F, 0.2275909337942703F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(12, 9).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.6F, -1.0F, 0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.3F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 20.4F, 0.0F, 0.03909537541112055F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(14, 11).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.3F, 0.0F)), PartPose.offsetAndRotation(0.8F, 0.9F, -0.4F, 0.21781708265940905F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(14, 13).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.02F, 1.1F, 0.4F, -0.47123889803846897F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(28, 14).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -0.9F, 0.9897762028270176F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(10, 5).addBox(-0.5F, -1.2F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.23457224414434488F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(10, 14).mirror(true).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F, -0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -0.5F, 0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(20, 4).addBox(-1.0F, -0.6F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, -0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, -0.5864306020384839F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(28, 14).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -0.9F, 0.9897762028270176F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(24, 14).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F, -0.1F, 0.1F)), PartPose.offsetAndRotation(-0.01F, 1.8F, -0.5F, 0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekRIght", CubeListBuilder.create().texOffs(5, 12).mirror(true).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 1.5F, -0.7F, -0.11728612207217244F, -0.0781907508222411F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(24, 14).mirror(true).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F, -0.1F, 0.1F)), PartPose.offsetAndRotation(-0.01F, 1.8F, -0.5F, 0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(20, 13).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.1F, 0.0F)), PartPose.offsetAndRotation(0.01F, 0.9F, 1.0F, -1.0224139077762113F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 16);
        }

        @Override
        public void setupAnim(FennecFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.664F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.586F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.664F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.977F;
            this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.273F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.75f;
                float degree = 0.5f;
            } else {
                float speed = 0.9f;
                float degree = 0.8f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.586F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.664F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 20.4F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.039F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.117F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F + 0.218F;
                this.ArmLeft.xRot = Mth.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.471F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.318F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.218F;
                this.ArmRight.xRot = Mth.cos(1.3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.471F;
                this.HandRight.xRot = Mth.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.318F;

                this.ThighLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.039F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.989F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.0F) * 0.5F - 1.022F;
                this.FootLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.195F;
                this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.039F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.989F;
                this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 1.022F;
                this.FootRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.195F;

                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.977F;
                this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.273F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

            }
        }
    }
}


 