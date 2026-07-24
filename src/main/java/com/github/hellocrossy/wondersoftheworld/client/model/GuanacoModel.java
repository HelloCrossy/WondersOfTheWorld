package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.GuanacoEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GuanacoModel extends ZawaBaseModel<GuanacoEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends GuanacoModel {

        public ModelPart ArmBaseLeft;
        public ModelPart Neck1;
        public ModelPart ArmBaseRight;
        public ModelPart Body;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Neck2;
        public ModelPart Neck3;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart TopSnout;
        public ModelPart Jaw1;
        public ModelPart Teeth;
        public ModelPart Jaw2;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail2;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Neck1 = this.Chest.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Neck3 = this.Neck2.getChild("Neck3");
            this.Head = this.Neck3.getChild("Head");
            this.EarRight = this.Head.getChild("EarRight");
            this.Snout = this.Head.getChild("Snout");
            this.Jaw1 = this.Snout.getChild("Jaw1");
            this.Teeth = this.Jaw1.getChild("Teeth");
            this.Jaw2 = this.Jaw1.getChild("Jaw2");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();
            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, -3.5F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.5F, -8.5F, 0.4010766541188137F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 15).addBox(-5.0F, -10.0F, 0.0F, 10.0F, 10.0F, 14.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.43598323915870024F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 39).addBox(-4.5F, 0.0F, 0.0F, 9.0F, 9.0F, 6.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 14.0F, -0.2609267198442009F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 54).mirror(true).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 11.0F, 6.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.9F, 0.9F, 3.6F, 0.08691739708221274F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 71).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 10.9F, -1.6F, 0.43598323915870024F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(12, 73).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 2.5F, -0.3050835452591255F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 81).mirror(true).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 5.6F, -1.3F, 0.08587020052970155F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 54).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 11.0F, 6.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.9F, 0.9F, 3.6F, 0.08691739708221274F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 71).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 10.9F, -1.6F, 0.43598323915870024F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(12, 73).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 2.5F, -0.3050835452591255F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 81).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 5.6F, -1.3F, 0.08587020052970155F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 89).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.4F, -0.061261056578553394F, 0.0F, 0.024260076353049827F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(14, 88).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.5715953300281429F, -0.0F, -0.037524580582353764F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(22, 54).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.7F, -2.1F, 1.3F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(22, 69).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 9.5F, 1.5F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(22, 79).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -2.5F, -0.07801621390230003F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 81).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 4.5F, 0.7F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(22, 54).mirror(true).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.7F, -2.1F, 1.3F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(22, 69).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 9.5F, 1.5F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(22, 79).mirror(true).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -2.5F, -0.07801621390230003F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 81).mirror(true).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, 4.5F, 0.7F));

            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(30, 0).addBox(-3.0F, -5.0F, -5.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -3.5F, -1.1465068282456525F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(34, 14).addBox(-2.0F, -3.0F, -8.0F, 4.0F, 4.0F, 9.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.9F, -0.7740534966278743F, 0.0F, 0.0F));
            PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(48, 27).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -8.0F, 0.2539454094941263F, 0.0F, 0.0F));
            PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(30, 39).addBox(-2.5F, -2.5F, -3.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -1.3F, 1.4110986736058044F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(57, 38).mirror(true).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.9F, -1.7F, -0.3F, 0.13665927909957545F, 0.6185446629383405F, -0.20839230536442993F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(57, 38).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.9F, -1.7F, -0.3F, 0.13665927909957545F, -0.6185446629383405F, 0.20839230536442993F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(50, 43).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -4.7F, 0.16929693411449862F, 0.0F, 0.0F));
            PartDefinition Jaw1 = Snout.addOrReplaceChild("Jaw1", CubeListBuilder.create().texOffs(52, 49).mirror(true).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 1.2F, -0.2045525929942673F, 0.0F, 0.0F));
            PartDefinition Teeth = Jaw1.addOrReplaceChild("Teeth", CubeListBuilder.create().texOffs(48, 49).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.1F, 0.32183872338881814F, 0.0F, 0.0F));
            PartDefinition Jaw2 = Jaw1.addOrReplaceChild("Jaw2", CubeListBuilder.create().texOffs(52, 49).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, -0.1F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(45, 37).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.9F, 0.24696408249929488F, 0.0F, 0.0F));
            return LayerDefinition.create(meshDefinition, 64, 96);
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

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.061F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F + 0.571F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.134F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 1.411F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.061F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.571F;
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

    public static class Child extends GuanacoModel {

        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck1;
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
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart TopSnout;
        public ModelPart Jaw1;
        public ModelPart Teeth;
        public ModelPart Jaw2;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck1 = this.Chest.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.EarRight = this.Head.getChild("EarRight");
            this.Snout = this.Head.getChild("Snout");
            this.Jaw1 = this.Snout.getChild("Jaw1");
            this.Teeth = this.Jaw1.getChild("Teeth");
            this.Jaw2 = this.Jaw1.getChild("Jaw2");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
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

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();
            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(1, 1).addBox(-3.0F, -3.5F, -2.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 7.9F, -5.3F, 0.4363323129985824F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(30, 32).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.1F, 1.1F, 0.6F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(34, 43).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 5.3F, -1.5F, -0.04363323129985824F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(38, 52).mirror(true).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 5.2F, 0.6F, -0.07853981633974483F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(34, 59).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.01F, 2.7F, 1.1F, 0.04363323129985824F, 0.0F, 0.0F));

            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(22, 1).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.0F, -1.0F, -0.6F, 0.6108652381980153F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(26, 12).addBox(-1.5F, -4.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -3.3F, 0.2F, -0.9599310885968813F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(43, 1).addBox(-2.0F, -3.0F, -3.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, 0.6F, 0.07679448875222618F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(23, 38).mirror(true).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.3F, -1.6F, 0.0F, 0.13665927909957545F, 0.6185446629383405F, -0.20839230536442993F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(50, 17).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -3.9F, 0.16929693411449862F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(45, 11).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.9F, 0.24696408249929488F, 0.0F, 0.0F));
            PartDefinition Jaw1 = Snout.addOrReplaceChild("Jaw1", CubeListBuilder.create().texOffs(52, 23).mirror(true).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, 1.2F, -0.2045525929942673F, 0.0F, 0.0F));
            PartDefinition Teeth = Jaw1.addOrReplaceChild("Teeth", CubeListBuilder.create().texOffs(48, 23).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -2.1F, 0.32183872338881814F, 0.0F, 0.0F));
            PartDefinition Jaw2 = Jaw1.addOrReplaceChild("Jaw2", CubeListBuilder.create().texOffs(52, 23).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.0F, -0.1F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(23, 38).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.3F, -1.6F, 0.0F, 0.13665927909957545F, -0.6185446629383405F, 0.20839230536442993F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(1, 13).addBox(-3.5F, -5.0F, 0.0F, 7.0F, 8.0F, 10.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -0.6F, -0.4363323129985824F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(1, 32).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -4.8F, 9.7F, -0.2617993877991494F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(47, 28).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(3.1F, 1.1F, 2.2F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(51, 41).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.0F, 7.9F, -1.8F, 0.4363323129985824F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(55, 52).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 6.7F, 2.4F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(51, 59).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.01F, 3.1F, -0.7F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(47, 28).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.1F, 1.1F, 2.2F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(51, 41).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 7.9F, -1.8F, 0.4363323129985824F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(55, 52).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 6.7F, 2.4F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(51, 59).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-0.01F, 3.1F, -0.7F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 3.7F, 0.5235987755982988F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(5, 57).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -0.17453292519943295F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(30, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.1F, 1.1F, 0.6F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(34, 43).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 5.3F, -1.5F, -0.04363323129985824F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(38, 52).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 5.2F, 0.6F, -0.07853981633974483F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(34, 59).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.01F, 2.7F, 1.1F, 0.04363323129985824F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(GuanacoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.076F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.61F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.076F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.523F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.174F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.61F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.076F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.523F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.174F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 7.3F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.436F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.436F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.262F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.349F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F -0.078F;
                this.UpperArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.349F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F -0.078F;
                this.UpperArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.174F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.436F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.349F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.174F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.436F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.349F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
        }
    }
}



