package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.PallasCatEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PallasCatModel extends ZawaBaseModel<PallasCatEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends PallasCatModel {

        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
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
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart CheekRight;
        public ModelPart CheekLeft;
        public ModelPart TopSnout;
        public ModelPart Mouth;


        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            texWidth = 128;
            texHeight = 64;
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(52, 1).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.3F, 0.2F, 0.0F, 0.24015730906916136F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(55, 10).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.02F, 3.7F, -1.0F, -0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(23, 47).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.8F, -0.7F, -1.2F, 0.2499311435592658F, -0.3513347637790725F, 0.28605945374922626F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(54, 15).mirror(true).addBox(-0.98F, 0.0F, -2.6F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.4F, 1.5F, 0.017453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.5F, -2.0F, 6.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 16.5F, -4.7F, -0.09686577681463665F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(33, 11).addBox(-1.52F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 5.0F, -1.7F, 0.619591884457987F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(54, 15).addBox(-1.02F, 0.0F, -2.6F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.4F, 1.5F, 0.017453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(55, 10).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.02F, 3.7F, -1.0F, -0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 52).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -4.1F, 0.2F, -0.8672540813475326F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(38, 55).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, -0.1F, -2.1F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(34, 21).addBox(-1.02F, 0.0F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.4F, -0.7F, 0.017453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(33, 11).mirror(true).addBox(-1.48F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 5.0F, -1.7F, 0.619591884457987F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 30).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.3513347637790725F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(32, 2).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.3F, 2.0F, 2.0F, 0.11222466790717915F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(32, 2).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.3F, 2.0F, 2.0F, 0.11222466790717915F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(36, 16).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.4F, 1.6F, 2.9F, -0.40142572795869574F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(52, 1).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.3F, 0.2F, 0.0F, 0.24015730906916136F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(40, 30).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 1.040390777766464F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(8, 45).mirror(true).addBox(-1.4F, -2.0F, -2.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.3F, 0.6F, -0.5F, 0.0781907508222411F, 0.0F, 0.1738347941644255F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(39, 59).addBox(-1.0F, 0.0F, -1.6F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 1.3F, -0.2F));
            partDefinition.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(8, 45).addBox(-1.6F, -2.0F, -2.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.3F, 0.6F, -0.5F, 0.0781907508222411F, 0.0F, -0.1738347941644255F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(63, 26).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.6642723372774916F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(38, 39).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -4.9F, -1.9F, -1.8732619181234471F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(63, 33).addBox(-1.52F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -3.0F, 0.5082398928281348F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -3.5F, 0.9F, 0.09686577681463665F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(36, 16).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.4F, 1.6F, 2.9F, -0.40142572795869574F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(23, 47).mirror(true).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.8F, -0.7F, -1.2F, 0.2499311435592658F, 0.3513347637790725F, -0.28605945374922626F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(65, 41).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.5864306020384839F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(38, 51).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -0.14F, -2.23F, 0.35779249665883756F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(34, 21).mirror(true).addBox(-0.98F, 0.0F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.4F, -0.7F, 0.017453292519943295F, 0.0F, 0.0F));
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.CheekRight = this.Head.getChild("CheekRight");
            this.Mouth = this.Snout.getChild("Mouth");
            this.CheekLeft = this.Head.getChild("CheekLeft");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Body = this.Chest.getChild("Body");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(PallasCatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.867F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.08F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 1.04F;
            this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.08F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.867F;
            this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.664F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.508F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.6f;
                this.Chest.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.096F;
                this.Chest.y = Mth.cos(1.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 16.5F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.097F;
                this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.351F;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 1.04F;
                this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.867F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.664F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F;
                this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.457F;
                this.Tail3.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.586F;
                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.240F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.5F) * 0.5F - 0.156F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.017F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.240F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.5F) * 0.5F - 0.156F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.017F;
                this.ThighLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.112F;
                this.UpperLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.4F) * 0.5F + 0.620F;
                this.LowerLegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.401F;
                this.FootLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.017F;
                this.ThighRight.xRot = Mth.cos(3F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.112F;
                this.UpperLegRight.xRot = Mth.cos(3F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.4F) * 0.5F + 0.620F;
                this.LowerLegRight.xRot = Mth.cos(0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.401F;
                this.FootRight.xRot = Mth.cos(1F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.017F;


            } else {
                float speed = 0.9f;
                float degree = 1.0f;
                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.096F;
                this.Chest.y = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 1.1F) * 0.5F + 16.5F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.097F;
                this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.351F;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F + 1.04F;
                this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.867F;
                this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.664F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
                this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.457F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.240F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F - 0.156F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.017F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.240F;
                this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F - 0.156F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.017F;

                this.ThighLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.112F;
                this.UpperLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.620F;
                this.LowerLegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.401F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.017F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.112F;
                this.UpperLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.620F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.401F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.017F;
            }
        }
    }

    public static class Child extends PallasCatModel {
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
        public ModelPart RightCheek;
        public ModelPart LeftCheek;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            texWidth = 64;
            texHeight = 64;
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(28, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.2F, -0.1F, 1.55F, 0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftCheek", CubeListBuilder.create().texOffs(20, 18).addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.3F, -1.2F, -1.3F, 0.23457224414434488F, 0.1563815016444822F, 0.1563815016444822F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 17.7F, -4.0F, -0.194604204939465F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(16, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 3.0F, -1.5F, 0.6979571971673044F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(25, 23).mirror(true).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.8F, -0.8F, -0.8F, 0.273493095119092F, 0.6352998743575469F, -0.2792526803190927F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(18, 10).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.02F, 2.0F, 1.8F, -0.6979571971673044F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(16, 6).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 3.0F, -1.5F, 0.6979571971673044F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(29, 13).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 0.5F, 0.0F, -0.02007128598181587F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.2F, 1.0F, 1.1F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(29, 10).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.02F, 1.8F, -0.5F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(42, 10).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.5501277882180959F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(29, 6).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.1F, 2.85F, 0.5F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 8).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.2F, 0.18657568971450084F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(25, 23).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.8F, -0.8F, -0.8F, 0.27366763203903305F, -0.6352998743575469F, 0.2792526803190927F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(29, 6).mirror(true).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.1F, 2.85F, 0.5F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 27).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightCheek", CubeListBuilder.create().texOffs(20, 18).mirror(true).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.3F, -1.2F, -1.3F, 0.23457224414434488F, -0.1563815016444822F, -0.1563815016444822F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.33876840514893825F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(16, 15).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 2.2F, -1.0F, 0.04694935787733287F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(18, 10).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.02F, 2.0F, 1.8F, -0.6979571971673044F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 26).addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -0.9F, 0.2546435405291338F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.2F, 1.0F, 1.1F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(29, 10).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.02F, 1.8F, -0.5F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 0.2F, -0.021642082891177254F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(1, 22).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 0.5F, -0.5305800859483735F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(12, 20).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -0.2F, 0.2834414665291375F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(13, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 0.0F, -0.9F));
            partDefinition.addOrReplaceChild("BackPoint", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 4.0F, -0.019999998568980413F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.2F, -0.1F, 1.55F, 0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(16, 15).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 2.2F, -1.0F, 0.04694935787733287F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(29, 13).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 0.5F, 0.0F, -0.02007128598181587F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(42, 5).addBox(-1.02F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, 0.3017674436487861F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout2", CubeListBuilder.create().texOffs(11, 23).addBox(-1.2F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.9F, 0.2834414665291375F, 0.0F, 0.0F));
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.LeftCheek = this.Head.getChild("LeftCheek");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.Body = this.BackPoint.getChild("Body");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.Hips = this.Body.getChild("Hips");
            this.RightCheek = this.Head.getChild("RightCheek");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Head = this.Neck.getChild("Head");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.TopSnout = this.Snout2.getChild("TopSnout");
            this.Mouth = this.Snout2.getChild("Mouth");
            this.BackPoint = this.Chest.getChild("BackPoint");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Snout2 = this.Head.getChild("Snout2");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(PallasCatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.254F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.021F;
            this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.254F;
            this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.34F) * 0.5F + 0.338F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.05F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.301F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 0.8f;
                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.194F;
                this.Chest.y = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 17.7F;
                this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.139F;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.021F;
                this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F + 0.254F;
                this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.338F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
                this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.301F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F - 0.020F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F - 0.020F;

                this.ThighLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.UpperLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.697F;
                this.LowerLegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.697F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.046F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.UpperLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.697F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.697F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.046F;
            }
        }
    }
}

