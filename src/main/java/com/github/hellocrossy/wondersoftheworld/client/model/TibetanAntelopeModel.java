package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TibetanAntelopeEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;


public abstract class TibetanAntelopeModel extends ZawaBaseModel<TibetanAntelopeEntity> {
    public ModelPart Chest;

    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends TibetanAntelopeModel {

        public ModelPart Body;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart Hips;
        public ModelPart Tail;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Head;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Horn1Left;
        public ModelPart Horn1Right;
        public ModelPart Snout;
        public ModelPart Horn2Left;
        public ModelPart Horn3Left;
        public ModelPart Horn4Left;
        public ModelPart Horn2Right;
        public ModelPart Horn3Right;
        public ModelPart Horn4Right;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Nose = this.Head.getChild("Nose");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Snout = this.Nose.getChild("Snout");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.Horn2Right = this.Horn1Right.getChild("Horn2Right");
            this.Horn2Left = this.Horn1Left.getChild("Horn2Left");
            this.Neck = this.Chest.getChild("Neck");
            this.Mouth = this.Head.getChild("Mouth");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.Tail = this.Hips.getChild("Tail");
            this.Horn4Right = this.Horn3Right.getChild("Horn4Right");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.Horn1Left = this.Head.getChild("Horn1Left");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.Horn3Right = this.Horn2Right.getChild("Horn3Right");
            this.Head = this.Neck.getChild("Head");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.Body = this.Chest.getChild("Body");
            this.Horn4Left = this.Horn3Left.getChild("Horn4Left");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Horn1Right = this.Head.getChild("Horn1Right");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.Horn3Left = this.Horn2Left.getChild("Horn3Left");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(32, 53).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 3.5F, 1.5F, -0.6515314417274163F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 43).addBox(-1.5F, -1.0F, -3.5F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.7F, -1.2F, 0.1558579075294158F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(19, 54).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.9F, -0.5F, 0.7143632681676012F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 29).mirror(true).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -0.5F, 1.0F, 0.13665927909957545F, -0.6373942508178124F, 0.324631247528848F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(22, 34).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.0F, 1.3F, -1.0F, 0.400378539728563F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(26, 44).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.7F, 0.2F, 0.5859070245681742F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(37, 35).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.8F, 1.0F, -0.29007373632884353F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(46, 48).mirror(true).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.00999999F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.19547687289441354F, 0.0F, -0.13962634015954636F));
            partDefinition.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(46, 48).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.00999999F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.19547687289441354F, 0.0F, 0.13962634015954636F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(31, 17).addBox(-1.5F, -1.0F, -4.4F, 3.0F, 4.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -2.7F, -1.7F, -0.8705702495368991F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(15, 45).addBox(-1.0F, -0.5F, -3.3F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.9F, -1.1F, 0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 35).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(-0.01F, 3.8F, -2.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(2.1F, 2.5F, 2.0F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 35).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.01F, 3.8F, -2.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(41, 2).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.2F, 5.0F, 0.268780698149224F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn4Right", CubeListBuilder.create().texOffs(46, 41).mirror(true).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, -3.0F, 0.0F, 0.11379546689713516F, 0.0F, 0.20943951023931953F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(32, 53).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 3.5F, 1.5F, -0.6511823678875341F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn1Left", CubeListBuilder.create().texOffs(46, 52).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01999998F, 0.0F, 0.01999998F)), PartPose.offsetAndRotation(0.4F, -2.5F, -1.7F, -0.20525072402927477F, -0.017453292519943295F, 0.19198621771937624F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(19, 54).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.9F, -0.5F, 0.7143632681676012F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(37, 35).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.8F, 1.0F, -0.29007373632884353F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(41, 58).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 5.3F, -1.4F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(55, 37).mirror(true).addBox(-1.0F, -0.0F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.9F, 0.8F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -0.5F, 1.0F, 0.13665927909957545F, 0.6373942508178124F, -0.324631247528848F));
            partDefinition.addOrReplaceChild("Horn3Right", CubeListBuilder.create().texOffs(46, 44).mirror(true).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, -3.0F, 1.0F, 0.3050835452591255F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 34).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.8F, -3.5F, 1.0389944824069357F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(22, 34).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.0F, 1.3F, -1.0F, 0.400378539728563F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(41, 58).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 5.3F, -1.4F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(20, 0).addBox(-3.0F, -0.5F, -1.0F, 6.0F, 8.0F, 9.0F), PartPose.offsetAndRotation(0.0F, -3.5F, 2.0F, 0.12967796042712246F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn4Left", CubeListBuilder.create().texOffs(46, 41).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.5F, -3.0F, 0.0F, 0.11379546689713516F, 0.0F, -0.20943951023931953F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(55, 37).addBox(-1.0F, -0.0F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 2.9F, 0.8F));
            partDefinition.addOrReplaceChild("Horn1Right", CubeListBuilder.create().texOffs(46, 52).mirror(true).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01999998F, 0.0F, 0.01999998F)), PartPose.offsetAndRotation(-0.4F, -2.5F, -1.7F, -0.20525072402927477F, 0.017453292519943295F, -0.19198621771937624F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.0F, -2.5F, 5.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 10.8F, -6.1F, -0.08656833156470901F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 13).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 7.5F, -0.17819811729441132F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-2.1F, 2.5F, 2.0F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn3Left", CubeListBuilder.create().texOffs(46, 44).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.5F, -3.0F, 1.0F, 0.3050835452591255F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(TibetanAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.039F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.87F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.039F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;


            } else {
                float speed = 0.85f;
                float degree = 0.5f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.87F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 1.039F;
                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 10.8F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.086F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.129F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.178F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 0.4F;
                this.UpperArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F -0.29F;
                this.ArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.6F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.4F;
                this.UpperArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F -0.29F;
                this.ArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.6F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.087F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.714F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.651F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.087F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.714F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.651F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }


    public static class Child extends TibetanAntelopeModel {

        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Snout = this.Head.getChild("Snout");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.Tail = this.Body.getChild("Tail");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.EarRight = this.Head.getChild("EarRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.Head = this.Neck.getChild("Head");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.Mouth = this.Snout.getChild("Mouth");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.Body = this.Chest.getChild("Body");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(15, 22).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 0.2F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.5F, 0.45535640450848164F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(10, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(15, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 0.2F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.4F, 1.3F, 4.5F, -0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(21, 29).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.1F, 2.5F, 0.3F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(6, 30).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 3.7F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, -0.2F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.9105382388075086F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(26, 28).mirror(true).addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 0.6F, 0.0F, 0.4098033003787853F, -0.7740534966278743F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(6, 30).mirror(true).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 3.7F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(21, 29).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.1F, 2.5F, 0.3F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(16, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offset(0.05F, 2.0F, -1.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 15.9F, -2.5F, -0.2275909337942703F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(24, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(19, 9).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.6F, -1.0F, -0.591841146688116F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(24, 23).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.8F, 0.5F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 21).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.4F, 1.3F, 4.5F, -0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(24, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -0.1F, 0.4098033003787853F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 0.1F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, 0.6F, 0.0F, -0.4098033003787853F, 0.7740534966278743F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(16, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offset(-0.05F, 2.0F, -1.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 9).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 4.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.0F, 0.2275909337942703F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(10, 21).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(TibetanAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.59F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.91F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.59F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.46F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 0.8f;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.15F) * 0.5F + 0.91F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.59F;
            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.9F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.23F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.23F;
            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.35F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.0F;
            this.UpperArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.0F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.35F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.0F;
            this.UpperArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.0F;
            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.05F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.66F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.77F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.05F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.66F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.77F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;

        }
    }
}

