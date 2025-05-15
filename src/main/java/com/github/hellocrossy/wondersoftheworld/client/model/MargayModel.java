package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.MargayEntity;
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

public abstract class MargayModel extends ZawaBaseModel<MargayEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends MargayModel {
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
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart Mouth;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.NeckLower = this.Neck.getChild("NeckLower");

            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.TopSnout = this.Snout.getChild("TopSnout");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 17.9F, -3.2F, -0.17086773310445458F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(22, 11).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 2.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-1.2F, -1.9F, -2.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(36, 10).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.4F, 3.5F, 1.5F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 14).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.02F, 1.6F, -2.5F, -0.09005898673974631F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(54, 16).mirror(true).addBox(-0.98F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 1.2F, 0.0781907508222411F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(18, 30).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.8F, -3.2F, 1.040390777766464F, 0.0F, 0.0F));
            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(18, 39).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-0.1F, -3.1F, -1.6F, -1.7950711090445568F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 51).addBox(-1.5F, -1.5F, -2.6F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.3F, -0.3F, -0.8281587433871148F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(36, 53).addBox(-1.5F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 0.6F, -1.8F, 0.20193458912942175F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(39, 58).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.006457718315602803F, 0.0F, 0.0F));

            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(38, 48).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -2.2F, 0.3186971254089062F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(26, 47).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.2F, -0.7F, 0.0F, 0.3672172905985735F, -0.7813839141073446F, 0.3642502295386026F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(26, 47).mirror(true).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.2F, -0.7F, 0.0F, 0.3672172905985735F, 0.7813839141073446F, -0.3642502295386026F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 13).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -3.9F, -1.1F, 0.22584559788437325F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 30).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.3513347637790725F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(62, 35).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 2.6F, 0.7033676752379093F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(62, 43).addBox(-0.98F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -1.5F, 0.4572762773383198F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(62, 51).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.3546508986789256F, 0.0F, 0.0169296942436877F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(32, 22).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(1.6F, 1.2F, 0.4F, 0.4557054783483638F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(48, 25).addBox(-1.52F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.7F, 0.46321039945826153F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(46, 7).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.6F, 2.7F, -0.6586872889974319F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(54, 16).addBox(-1.02F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.05201081204232616F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(32, 22).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-1.6F, 1.2F, 0.4F, 0.4557054783483638F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(48, 25).mirror(true).addBox(-1.48F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.7F, 0.46321039945826153F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(46, 7).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.6F, 2.7F, -0.6586872889974319F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 16).mirror(true).addBox(-0.98F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.05201081204232616F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(22, 11).addBox(-1.5F, 0.0F, -2.0F, 2.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(2.2F, -1.9F, -2.0F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(36, 10).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.6F, 3.5F, 1.5F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 14).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 1.6F, -2.5F, -0.09005898673974631F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(54, 16).addBox(-1.02F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 1.2F, 0.0781907508222411F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 64);
        }

        @Override
        public void setupAnim(MargayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.828F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.08F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 1.04F;
            this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.08F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.828F;
            this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.703F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.457F;

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
                this.Chest.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.170F;
                this.Chest.y = Mth.cos(1.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 17.9F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.225F;
                this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.351F;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 1.04F;
                this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.828F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.703F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F;
                this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.457F;
                this.Tail3.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.354F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.349F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2.5F) * 0.5F - 0.182F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.5F) * 0.5F + 0.090F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.349F;
                this.UpperArmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2.5F) * 0.5F - 0.182F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.5F) * 0.5F + 0.090F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.078F;

                this.ThighLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.455F;
                this.ThighLeft.y = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 1.2F;
                this.ThighLeft.z = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.4F;
                this.UpperLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.4F) * 0.5F + 0.463F;
                this.LowerLegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.658F;
                this.FootLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.052F;
                this.ThighRight.xRot = Mth.cos(3F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.455F;
                this.ThighRight.y = Mth.cos(2F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 1.2F;
                this.ThighRight.z = Mth.cos(2F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.4F;
                this.UpperLegRight.xRot = Mth.cos(3F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.4F) * 0.5F + 0.463F;
                this.LowerLegRight.xRot = Mth.cos(0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.658F;
                this.FootRight.xRot = Mth.cos(1F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.052F;


            } else {
                float speed = 0.9f;
                float degree = 1.0f;
                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.170F;
                this.Chest.y = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 1.1F) * 0.5F + 17.9F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.225F;
                this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.351F;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F + 1.04F;
                this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.828F;
                this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.703F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
                this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.457F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.349F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F - 0.182F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.090F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.078F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.349F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F - 0.182F;
                this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.090F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.078F;

                this.ThighLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.455F;
                this.UpperLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.463F;
                this.LowerLegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.658F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.052F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.455F;
                this.UpperLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.463F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.658F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.052F;
            }
        }
    }

    public static class Child extends MargayModel {
        public ModelPart ArmBaseLeft;
        public ModelPart BackPoint;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart Snout1;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart TopSnout;
        public ModelPart Mouth;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout1 = this.Head.getChild("Snout1");
            this.TopSnout = this.Snout1.getChild("TopSnout");

            this.Mouth = this.Snout1.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.NeckLower = this.Neck.getChild("NeckLower");

            this.BackPoint = this.Chest.getChild("BackPoint");
            this.Hips = this.BackPoint.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 18.7F, -4.0F, 0.02007128598181587F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(28, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(-1.4F, -0.5F, 1.65F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(29, 6).mirror(true).addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 2.85F, 0.5F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(29, 10).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.02F, 1.3F, -0.5F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(29, 13).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 0.7F, 0.0F, -0.02007128598181587F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(1.4F, -0.5F, 1.65F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(29, 6).addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.85F, 0.5F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(29, 10).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(-0.02F, 1.3F, -0.5F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(29, 13).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 0.7F, 0.0F, -0.02007128598181587F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 1.2F, -0.7405432069475162F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 26).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -2.0F, 0.8414232164074996F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(25, 26).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.6F, -0.5F, -0.2F, 0.27366763203903305F, -0.47891835606830785F, 0.2792526803190927F));

            PartDefinition Snout1 = Head.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(11, 23).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.8F, 0.2834414665291375F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout1.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(12, 20).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -0.2F, 0.2834414665291375F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout1.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, -0.9F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(25, 26).mirror(true).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, -0.5F, -0.2F, 0.273493095119092F, 0.47891835606830785F, -0.2792526803190927F));

            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.3F, 0.5F, -0.2569124705540972F, 0.0F, 0.0F));

            PartDefinition BackPoint = Chest.addOrReplaceChild("BackPoint", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 4.0F, -0.019999998568980413F, 0.0F, 0.0F));
            PartDefinition Hips = BackPoint.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -0.2F, -0.04747295615358847F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(1.4F, -2.5F, 2.3F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(16, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.0F, -1.5F, 0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(16, 10).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 2.0F, 1.8F, -0.6981317007977318F, -0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(16, 14).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 1.4F, -1.0F, 0.04747295615358847F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(-1.4F, -2.5F, 2.3F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(16, 6).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.0F, -1.5F, 0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.02F, 2.0F, 1.8F, -0.6981317007977318F, -0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(16, 14).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 1.4F, -1.0F, 0.04747295615358847F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, 0.46233771485855624F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(40, 5).addBox(-1.02F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, 0.392350007858842F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(40, 10).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.5501277882180959F, 0.0F, 0.0F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(40, 15).addBox(-1.02F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.45012043006830416F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(MargayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.841F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.740F;
            this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.841F;
            this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.34F) * 0.5F + 0.462F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.05F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.392F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.6f;
                float degree = 1.0f;
                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.020F;
                this.Chest.y = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 18.7F;
                this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.047F;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.740F;
                this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F + 0.841F;
                this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.462F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
                this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.392F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.4F) * 0.5F - 0.020F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.4F) * 0.5F - 0.020F;

                this.ThighLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.UpperLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.698F;
                this.LowerLegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.698F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.047F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.UpperLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.698F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.698F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.047F;

            }
        }
    }
}
