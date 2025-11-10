package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.DikDikEntity;
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

public abstract class DikDikModel extends ZawaBaseModel<DikDikEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends DikDikModel {
        public ModelPart Neck;
        public ModelPart LeftArmBase;
        public ModelPart Body;
        public ModelPart RightArmBase;
        public ModelPart Head;
        public ModelPart LeftEar;
        public ModelPart Muzzle;
        public ModelPart Tuft;
        public ModelPart RightEar;
        public ModelPart RightHorn;
        public ModelPart LeftHorn;
        public ModelPart Mouth;
        public ModelPart TopSnout;
        public ModelPart LeftArm;
        public ModelPart LeftForearm;
        public ModelPart LeftHand;
        public ModelPart Hips;
        public ModelPart RightThigh;
        public ModelPart Tail;
        public ModelPart LeftThigh;
        public ModelPart RightUpperLeg;
        public ModelPart RightLeg;
        public ModelPart RightFoot;
        public ModelPart LeftUpperLeg;
        public ModelPart LeftLeg;
        public ModelPart LeftFoot;
        public ModelPart RightArm;
        public ModelPart RightForeArm;
        public ModelPart RightHand;


        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.LeftThigh = this.Hips.getChild("LeftThigh");
            this.Body = this.Chest.getChild("Body");
            this.LeftForearm = this.LeftArm.getChild("LeftForearm");
            this.LeftLeg = this.LeftUpperLeg.getChild("LeftLeg");
            this.LeftUpperLeg = this.LeftThigh.getChild("LeftUpperLeg");
            this.LeftHorn = this.Head.getChild("LeftHorn");
            this.RightEar = this.Head.getChild("RightEar");
            this.RightHand = this.RightForeArm.getChild("RightHand");
            this.RightUpperLeg = this.RightThigh.getChild("RightUpperLeg");
            this.RightLeg = this.RightUpperLeg.getChild("RightLeg");
            this.Neck = this.Chest.getChild("Neck");
            this.Hips = this.Body.getChild("Hips");
            this.RightThigh = this.Hips.getChild("RightThigh");
            this.TopSnout = this.Muzzle.getChild("TopSnout");
            this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
            this.Tuft = this.Head.getChild("Tuft");
            this.RightArmBase = this.Chest.getChild("RightArmBase");
            this.RightHorn = this.Head.getChild("RightHorn");
            this.RightArm = this.RightArmBase.getChild("RightArm");
            this.Head = this.Neck.getChild("Head");
            this.Mouth = this.Muzzle.getChild("Mouth");
            this.LeftArmBase = this.Chest.getChild("LeftArmBase");
            this.RightFoot = this.RightLeg.getChild("RightFoot");
            this.Muzzle = this.Head.getChild("Muzzle");
            this.RightForeArm = this.RightArm.getChild("RightForeArm");
            this.LeftArm = this.LeftArmBase.getChild("LeftArm");
            this.LeftEar = this.Head.getChild("LeftEar");
            this.LeftHand = this.LeftForearm.getChild("LeftHand");
            this.Tail = this.Hips.getChild("Tail");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(18, 16).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.1F, 1.4F, 1.1F, 0.16999506514950605F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.9F, 0.0F, 0.35726888589901434F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(36, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-0.02F, 2.0F, -1.0F));
            partDefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(36, 16).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.02F, 1.5F, 1.8F, -0.38816122164879724F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftUpperLeg", CubeListBuilder.create().texOffs(28, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.3F, 3.0F, -1.2F, 0.5455899281681691F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftHorn", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, -1.0F, 0.0F, -0.8210028961170991F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 7).mirror(true).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.8F, -0.9F, 0.4F, -0.735132662297884F, -0.5585053606381855F, -0.10471975511965977F));
            partDefinition.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(31, 0).mirror(true).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.1F, 1.8F, 0.7F));
            partDefinition.addOrReplaceChild("RightUpperLeg", CubeListBuilder.create().texOffs(28, 16).mirror(true).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.3F, 3.0F, -1.2F, 0.5455899281681691F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(36, 16).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.02F, 1.5F, 1.8F, -0.38816122164879724F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(16, 4).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.6F, -0.1F, -0.934623801127158F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 5.0F, -0.47472956985826303F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(18, 16).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.1F, 1.4F, 1.1F, 0.16999506514950605F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(10, 0).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.8F, -0.2F, 0.29600782515927176F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(31, 0).addBox(-0.7F, -0.2F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.1F, 3.8F, -0.1F));
            partDefinition.addOrReplaceChild("Tuft", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -0.3F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.4F, -1.9F, 0.1787217114094777F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightArmBase", CubeListBuilder.create().texOffs(20, 11).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, -0.5F, 0.3F, 0.279950827998857F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightHorn", CubeListBuilder.create().texOffs(0, 25).mirror(true).addBox(0.0F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.3F, -1.0F, 0.0F, -0.8210028961170991F, 0.0F, -0.0F));
            partDefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(28, 12).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.28F, 3.0F, 0.5F, -0.06998770699971425F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -3.8F, 1.2372638960861357F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(14, 4).addBox(-0.5F, -0.2F, -1.6F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.3F, -0.2F, -0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArmBase", CubeListBuilder.create().texOffs(20, 11).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, -0.5F, 0.3F, 0.279950827998857F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(31, 0).mirror(true).addBox(-0.3F, -0.2F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.1F, 3.8F, -0.1F));
            partDefinition.addOrReplaceChild("Muzzle", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -1.3F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightForeArm", CubeListBuilder.create().texOffs(36, 12).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.02F, 2.0F, -1.0F));
            partDefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.28F, 3.0F, 0.5F, -0.06998770699971425F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.8F, -0.9F, 0.4F, -0.735132662297884F, 0.5585053606381855F, 0.10821041029469708F));
            partDefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.1F, 1.8F, 0.7F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(12, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 2.5F, 0.4199262087087719F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(28, 4).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 17.0F, -3.0F, -0.20996310435438595F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(DikDikEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.934F;
            this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.237F;

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
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.6F) * 0.5F + 1.237F;
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F - 0.934F;
                this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.357F;
                this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F - 1.9F;

                this.LeftArmBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.279F;
                this.LeftArm.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.069F;
                this.LeftForearm.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.RightArmBase.xRot = Mth.cos(5.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.279F;
                this.RightArm.xRot = Mth.cos(3.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.069F;
                this.RightForeArm.xRot = Mth.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;

                this.LeftThigh.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.169F;
                this.LeftThigh.z = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 1.1F;
                this.LeftUpperLeg.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.545F;
                this.LeftLeg.xRot = Mth.cos(7.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 0.388F;
                this.RightThigh.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.169F;
                this.RightThigh.z = Mth.cos(5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 1.1F;
                this.RightUpperLeg.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.545F;
                this.RightLeg.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 0.388F;


            } else {
                float speed = 0.55f;
                float degree = 0.45f;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.237F;
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.934F;
                this.Body.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.357F;
                this.Body.y = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F - 1.9F;

                this.LeftArmBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.279F;
                this.LeftArm.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.069F;
                this.LeftForearm.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
                this.RightArmBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.279F;
                this.RightArm.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.069F;
                this.RightForeArm.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F;

                this.LeftThigh.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.169F;
                this.LeftThigh.z = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 1.1F;
                this.LeftUpperLeg.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.545F;
                this.LeftLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.388F;
                this.RightThigh.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.169F;
                this.RightThigh.z = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.1F;
                this.RightUpperLeg.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.545F;
                this.RightLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.388F;
            }
        }
    }

    public static class Child extends DikDikModel {
        public ModelPart Neck;
        public ModelPart LeftArmBase;
        public ModelPart Body;
        public ModelPart RightArmBase;
        public ModelPart Head;
        public ModelPart LeftEar;
        public ModelPart Muzzle;
        public ModelPart Tuft;
        public ModelPart RightEar;
        public ModelPart RightHorn;
        public ModelPart LeftHorn;
        public ModelPart Mouth;
        public ModelPart TopSnout;
        public ModelPart LeftArm;
        public ModelPart LeftForearm;
        public ModelPart LeftHand;
        public ModelPart Hips;
        public ModelPart RightThigh;
        public ModelPart Tail;
        public ModelPart LeftThigh;
        public ModelPart RightUpperLeg;
        public ModelPart RightLeg;
        public ModelPart RightFoot;
        public ModelPart LeftUpperLeg;
        public ModelPart LeftLeg;
        public ModelPart LeftFoot;
        public ModelPart RightArm;
        public ModelPart RightForeArm;
        public ModelPart RightHand;


        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.LeftThigh = this.Hips.getChild("LeftThigh");
            this.Body = this.Chest.getChild("Body");
            this.LeftForearm = this.LeftArm.getChild("LeftForearm");
            this.LeftLeg = this.LeftUpperLeg.getChild("LeftLeg");
            this.LeftUpperLeg = this.LeftThigh.getChild("LeftUpperLeg");
            this.LeftHorn = this.Head.getChild("LeftHorn");
            this.RightEar = this.Head.getChild("RightEar");
            this.RightHand = this.RightForeArm.getChild("RightHand");
            this.RightUpperLeg = this.RightThigh.getChild("RightUpperLeg");
            this.RightLeg = this.RightUpperLeg.getChild("RightLeg");
            this.Neck = this.Chest.getChild("Neck");
            this.Hips = this.Body.getChild("Hips");
            this.RightThigh = this.Hips.getChild("RightThigh");
            this.TopSnout = this.Muzzle.getChild("TopSnout");
            this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
            this.Tuft = this.Head.getChild("Tuft");
            this.RightArmBase = this.Chest.getChild("RightArmBase");
            this.RightHorn = this.Head.getChild("RightHorn");
            this.RightArm = this.RightArmBase.getChild("RightArm");
            this.Head = this.Neck.getChild("Head");
            this.Mouth = this.Muzzle.getChild("Mouth");
            this.LeftArmBase = this.Chest.getChild("LeftArmBase");
            this.RightFoot = this.RightLeg.getChild("RightFoot");
            this.Muzzle = this.Head.getChild("Muzzle");
            this.RightForeArm = this.RightArm.getChild("RightForeArm");
            this.LeftArm = this.LeftArmBase.getChild("LeftArm");
            this.LeftEar = this.Head.getChild("LeftEar");
            this.LeftHand = this.LeftForearm.getChild("LeftHand");
            this.Tail = this.Hips.getChild("Tail");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(18, 16).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.1F, 1.4F, 1.1F, 0.16999506514950605F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -1.9F, 0.0F, 0.35726888589901434F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(36, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-0.02F, 2.0F, -1.0F));
            partDefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(36, 16).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.02F, 1.5F, 1.8F, -0.38816122164879724F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftUpperLeg", CubeListBuilder.create().texOffs(28, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.3F, 3.0F, -1.2F, 0.5455899281681691F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftHorn", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, -1.0F, 0.0F, -0.8210028961170991F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 7).mirror(true).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.8F, -0.9F, 0.4F, -0.735132662297884F, -0.5585053606381855F, -0.10471975511965977F));
            partDefinition.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(31, 0).mirror(true).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.1F, 1.8F, 0.7F));
            partDefinition.addOrReplaceChild("RightUpperLeg", CubeListBuilder.create().texOffs(28, 16).mirror(true).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.3F, 3.0F, -1.2F, 0.5455899281681691F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(36, 16).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.02F, 1.5F, 1.8F, -0.38816122164879724F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(16, 4).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.6F, -0.1F, -0.934623801127158F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 5.0F, -0.47472956985826303F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(18, 16).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.1F, 1.4F, 1.1F, 0.16999506514950605F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(10, 0).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.8F, -0.2F, 0.29600782515927176F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(31, 0).addBox(-0.7F, -0.2F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.1F, 3.8F, -0.1F));
            partDefinition.addOrReplaceChild("Tuft", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -0.3F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.4F, -1.9F, 0.1787217114094777F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightArmBase", CubeListBuilder.create().texOffs(20, 11).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, -0.5F, 0.3F, 0.279950827998857F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightHorn", CubeListBuilder.create().texOffs(0, 25).mirror(true).addBox(0.0F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.3F, -1.0F, 0.0F, -0.8210028961170991F, 0.0F, -0.0F));
            partDefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(28, 12).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.28F, 3.0F, 0.5F, -0.06998770699971425F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -3.8F, 1.2372638960861357F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(14, 4).addBox(-0.5F, -0.2F, -1.6F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.3F, -0.2F, -0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArmBase", CubeListBuilder.create().texOffs(20, 11).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, -0.5F, 0.3F, 0.279950827998857F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(31, 0).mirror(true).addBox(-0.3F, -0.2F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.1F, 3.8F, -0.1F));
            partDefinition.addOrReplaceChild("Muzzle", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -1.3F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightForeArm", CubeListBuilder.create().texOffs(36, 12).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.02F, 2.0F, -1.0F));
            partDefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(28, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.28F, 3.0F, 0.5F, -0.06998770699971425F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.8F, -0.9F, 0.4F, -0.735132662297884F, 0.5585053606381855F, 0.10821041029469708F));
            partDefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.1F, 1.8F, 0.7F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(12, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 2.5F, 0.4199262087087719F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(28, 4).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 17.0F, -3.0F, -0.20996310435438595F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(DikDikEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.934F;
            this.Head.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 1.237F;

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
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.6F) * 0.5F + 1.237F;
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F - 0.934F;
                this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.357F;
                this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F - 1.9F;

                this.LeftArmBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.279F;
                this.LeftArm.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.069F;
                this.LeftForearm.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.RightArmBase.xRot = Mth.cos(5.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.279F;
                this.RightArm.xRot = Mth.cos(3.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.069F;
                this.RightForeArm.xRot = Mth.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;

                this.LeftThigh.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.169F;
                this.LeftThigh.z = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 1.1F;
                this.LeftUpperLeg.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.545F;
                this.LeftLeg.xRot = Mth.cos(7.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 0.388F;
                this.RightThigh.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.169F;
                this.RightThigh.z = Mth.cos(5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 1.1F;
                this.RightUpperLeg.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.545F;
                this.RightLeg.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F - 0.388F;


            } else {
                float speed = 0.45f;
                float degree = 0.45f;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.237F;
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.934F;
                this.Body.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.357F;
                this.Body.y = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F - 1.9F;

                this.LeftArmBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.279F;
                this.LeftArm.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.069F;
                this.LeftForearm.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
                this.RightArmBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.279F;
                this.RightArm.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.069F;
                this.RightForeArm.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F;

                this.LeftThigh.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.169F;
                this.LeftThigh.z = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 1.1F;
                this.LeftUpperLeg.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.545F;
                this.LeftLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.388F;
                this.RightThigh.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.169F;
                this.RightThigh.z = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 1.1F;
                this.RightUpperLeg.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.545F;
                this.RightLeg.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.388F;
            }
        }
    }
}

