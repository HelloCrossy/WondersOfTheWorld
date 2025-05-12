package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.PygmyHippoEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class PygmyHippoModel extends ZawaBaseModel<PygmyHippoEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends PygmyHippoModel {
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart Body;
        public ModelPart ArmBaseRight;
        public ModelPart UpperArmLeft;
        public ModelPart LowerArmLeft;
        public ModelPart HandLeft;
        public ModelPart NeckBottom;
        public ModelPart Head;
        public ModelPart Mouth;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart EarLeft_1;
        public ModelPart Nose;
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
        public ModelPart UpperArmRight;
        public ModelPart LowerArmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            texWidth = 64;
            texHeight = 64;
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(36, 22).mirror(true).addBox(-1.8F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.2F, -1.6F, 0.5F, 0.3141592653589793F, 0.4886921905584123F, 0.3490658503988659F));
            partDefinition.addOrReplaceChild("LowerArmLeft", CubeListBuilder.create().texOffs(52, 50).addBox(-1.01F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.3F, 0.0F, -0.039968039204879874F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(36, 22).addBox(-0.2F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.2F, -1.6F, 0.5F, 0.3141592653589793F, -0.4886921905584123F, -0.3490658503988659F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(44, 0).addBox(-2.5F, -3.5F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.7F, -4.5F, 0.1672025410094762F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerArmRight", CubeListBuilder.create().texOffs(52, 50).addBox(-0.99F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.3F, 0.0F, -0.039968039204879874F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(42, 49).mirror(true).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 2.3F, -1.3F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 34).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 9.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -7.8F, 9.0F, -0.2300344007391748F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(3.2F, 1.4F, 3.1F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-3.2F, 1.4F, 3.1F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(17, 50).addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.7F, 2.7F, -0.3499385017090576F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 14).addBox(-4.5F, -7.8F, 0.0F, 9.0F, 9.0F, 9.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 1.2F, -0.03001966363364517F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -2.0F, 8.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 14.0F, -5.0F, 0.03001966363364517F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(24, 39).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -3.9F, -1.6F, 0.07941248429469336F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(37, 11).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.6F, -1.7F, 0.1249655717796329F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(52, 44).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 5.0F, 0.3534291735288517F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(45, 14).addBox(-1.3F, 0.0F, -3.8F, 3.0F, 2.0F, 4.0F, -0.1F, -0.1F, -0.1F), PartPose.offsetAndRotation(0.0F, 0.4F, -1.1F, -0.006283185556850939F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(42, 49).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 2.3F, -1.3F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(17, 50).mirror(true).addBox(-0.99F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.7F, 2.7F, -0.3499385017090576F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(29, 60).mirror(true).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.2F, -1.2F, 0.1399754139994285F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(18, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 7.6F, -1.5F, 0.4399974884488039F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(29, 60).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.2F, -1.2F, 0.1399754139994285F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(28, 1).addBox(-2.0F, 0.0F, -2.1F, 4.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -2.0F, 0.15009832232941506F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckBottom", CubeListBuilder.create().texOffs(32, 29).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.9F, 1.2F, -0.40142572795869574F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(18, 57).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 7.6F, -1.5F, 0.4399974884488039F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(51, 57).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.9F, 1.0F, -0.09005898673974631F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(52, 37).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.1672025410094762F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(51, 57).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.9F, 1.0F, -0.09005898673974631F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(38, 54).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.8F, 0.6F, -0.2F, 0.09005898673974631F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(38, 54).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.8F, 0.6F, -0.2F, 0.09005898673974631F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft_1", CubeListBuilder.create().texOffs(44, 21).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 0.6F, 1.2F));
            this.EarRight = this.Head.getChild("EarRight");
            this.LowerArmLeft = this.UpperArmLeft.getChild("LowerArmLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Head = this.Neck.getChild("Head");
            this.LowerArmRight = this.UpperArmRight.getChild("LowerArmRight");
            this.HandRight = this.LowerArmRight.getChild("HandRight");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Body = this.Chest.getChild("Body");
            this.Neck = this.Chest.getChild("Neck");
            this.Snout = this.Head.getChild("Snout");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Mouth = this.Head.getChild("Mouth");
            this.HandLeft = this.LowerArmLeft.getChild("HandLeft");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.Nose = this.Snout.getChild("Nose");
            this.NeckBottom = this.Neck.getChild("NeckBottom");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.EarLeft_1 = this.Head.getChild("EarLeft_1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(PygmyHippoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.167F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.079F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.167F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.353F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.167F;
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

            } else {
                float speed = 2.0f;
                float degree = 0.8f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.079F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.167F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.353F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.167F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 14.0F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.03F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.03F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.23F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.09F;
                this.UpperArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.09F;
                this.LowerArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.039F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.09F;
                this.UpperArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.09F;
                this.LowerArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.039F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.439F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.349F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.139F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.439F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.349F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.139F;
            }
        }
    }

    public static class Child extends PygmyHippoModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail;
        public ModelPart UpperLegLeft;
        public ModelPart LegLeft;
        public ModelPart HandLeft;
        public ModelPart UpperLegRight;
        public ModelPart LegRight;
        public ModelPart HandRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft_1;
        public ModelPart HandLeft_2;
        public ModelPart ArmRight;
        public ModelPart HandRight_1;
        public ModelPart HandRight_2;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart Cheek;
        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            texWidth = 64;
            texHeight = 64;
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(4, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, -0.2F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.5F, 2.3F, 3.0F, 0.21362829644936432F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(4, 0).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, -0.2F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.5F, 2.3F, 3.0F, 0.21362829644936432F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight_2", CubeListBuilder.create().texOffs(20, 15).mirror(true).addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, -0.2F, 0.0F, 0.2F), PartPose.offsetAndRotation(0.0F, 1.9F, 1.1F, 0.03909537541112055F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(20, 7).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 4.3F, 0.0F, -0.08726646259971647F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.1F, 1.0F, -0.2F, -0.021642082891177254F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(36, 11).addBox(-4.0F, -0.3F, -0.3F, 8.0F, 8.0F, 7.0F, 0.0F, -0.3F, 0.3F), PartPose.offsetAndRotation(0.0F, -3.6F, 1.5F, -0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(42, 0).addBox(-3.5F, -3.5F, -2.0F, 7.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 15.6F, -4.0F, 0.15655603856442327F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(4, 15).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.2F, 1.9F, 2.5F, -0.6108652381980153F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -0.2F, -3.0F, 4.0F, 4.0F, 4.0F, -0.2F, -0.1F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.2F, -2.2F, 0.15620696472454113F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 37).addBox(-1.5F, -0.4F, -2.6F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.1F), PartPose.offset(0.0F, 1.8F, -1.7F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(40, 45).mirror(true).addBox(-2.0F, -0.5F, -1.7F, 4.0F, 4.0F, 2.0F, 0.0F, 0.3F, 0.0F), PartPose.offset(0.0F, -2.5F, -2.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(4, 10).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, -0.2F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.3F, 5.0F, -2.0F, 0.6108652381980153F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft_1", CubeListBuilder.create().texOffs(20, 11).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 33).mirror(true).addBox(-1.3F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.0F, -1.7F, 0.7F, -0.5338962208482264F, 0.46914448828868976F, -1.2121311122468401F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(54, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 4.6F, 0.3700098147386033F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft_2", CubeListBuilder.create().texOffs(20, 15).addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, -0.2F, 0.0F, 0.2F), PartPose.offsetAndRotation(0.0F, 1.9F, 1.1F, 0.03909537541112055F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 54).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 4.0F, -0.2F, 0.0F, 0.1F), PartPose.offsetAndRotation(0.0F, 1.7F, -2.4F, 0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(4, 21).mirror(true).addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, -0.2F, 0.0F, 0.2F), PartPose.offsetAndRotation(0.0F, 2.9F, -0.9F, 0.10890854132970453F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(4, 21).addBox(-1.5F, 0.0F, -1.3F, 3.0F, 1.0F, 2.0F, -0.2F, 0.0F, 0.2F), PartPose.offsetAndRotation(0.0F, 2.9F, -0.9F, 0.10890854132970453F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(20, 7).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 4.3F, 0.0F, -0.08726646259971647F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight_1", CubeListBuilder.create().texOffs(20, 11).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Cheek", CubeListBuilder.create().texOffs(9, 40).addBox(-3.0F, -1.5F, -1.5F, 6.0F, 3.0F, 3.0F, -0.2F, -0.1F, 0.0F), PartPose.offset(0.0F, 1.2F, 0.5F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(4, 15).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.2F, 1.9F, 2.5F, -0.6108652381980153F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(4, 10).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, -0.2F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.3F, 5.0F, -2.0F, 0.6108652381980153F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 33).mirror(true).addBox(-0.7F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.0F, -1.7F, 0.7F, -0.5338962208482264F, -0.46914448828868976F, 1.2121311122468401F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.1F, 1.0F, -0.2F, -0.021642082891177254F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(40, 26).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 7.0F, -0.31293754020890546F, 0.0F, 0.0F));
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.HandRight_2 = this.HandRight_1.getChild("HandRight_2");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.Body = this.Chest.getChild("Body");
            this.LegRight = this.UpperLegRight.getChild("LegRight");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Head.getChild("Mouth");
            this.Neck = this.Chest.getChild("Neck");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.HandLeft_1 = this.ArmLeft.getChild("HandLeft_1");
            this.EarRight = this.Head.getChild("EarRight");
            this.Tail = this.Hips.getChild("Tail");
            this.HandLeft_2 = this.HandLeft_1.getChild("HandLeft_2");
            this.Head = this.Neck.getChild("Head");
            this.HandRight = this.LegRight.getChild("HandRight");
            this.HandLeft = this.LegLeft.getChild("HandLeft");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight_1 = this.ArmRight.getChild("HandRight_1");
            this.Cheek = this.Head.getChild("Cheek");
            this.LegLeft = this.UpperLegLeft.getChild("LegLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Hips = this.Body.getChild("Hips");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(PygmyHippoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.078F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.078F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.37F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.8f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.078F;
                this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.37F;
                this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 15.6F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.157F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.156F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.3133F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.022F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.109F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.022F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.109F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.214F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.611F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.611F;
                this.HandLeft_1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.087F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.214F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.611F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.611F;
                this.HandRight_1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.087F;
            }
        }
    }
}

