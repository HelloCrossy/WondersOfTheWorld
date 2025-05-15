package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SaigaAntelopeModel extends ZawaBaseModel<SaigaAntelopeEntity> {
    protected ModelPart Chest;

    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends SaigaAntelopeModel {
        public ModelPart ArmBaseRight;
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Hips;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart NeckLower;
        public ModelPart Horn1Right;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Horn1Left;
        public ModelPart Snout;
        public ModelPart Horn2Right;
        public ModelPart Horn3Right;
        public ModelPart Horn2Left;
        public ModelPart Horn3Left;
        public ModelPart Snout1;
        public ModelPart Mouth;
        public ModelPart Snout2;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Tail = this.Hips.getChild("Tail");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarRight = this.Head.getChild("EarRight");

            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.Snout1 = this.Snout.getChild("Snout1");
            this.Snout2 = this.Snout1.getChild("Snout2");

            this.Horn1Left = this.Head.getChild("Horn1Left");
            this.Horn2Left = this.Horn1Left.getChild("Horn2Left");
            this.Horn3Left = this.Horn2Left.getChild("Horn3Left");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Horn1Right = this.Head.getChild("Horn1Right");

            this.Horn2Right = this.Horn1Right.getChild("Horn2Right");
            this.Horn3Right = this.Horn2Right.getChild("Horn3Right");

            this.NeckLower = this.Neck.getChild("NeckLower");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(14, 52).addBox(-3.0F, -3.5F, -2.5F, 6.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 10.8F, -6.0F, -0.22599999464857057F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(34, 30).addBox(-3.5F, -7.0F, 0.0F, 7.0F, 7.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 2.0F, 0.2609267198442009F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(17, 40).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -7.0F, 8.0F, -0.20891591612425317F, -0.001745329278001762F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(50, 1).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(2.2F, 1.8F, 3.0F, 0.15707963267948966F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(52, 13).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 6.0F, -1.8F, 0.6630000120667062F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(53, 21).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 3.0F, 3.0F, -0.7670000479017721F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 6.0F, -1.4F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(11, 44).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.3490658503988659F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(50, 1).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-2.2F, 1.8F, 3.0F, 0.15707963267948966F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(52, 13).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 6.0F, -1.8F, 0.6630000120667062F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(53, 21).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 3.0F, 3.0F, -0.7670000479017721F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 41).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 6.0F, -1.4F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(35, 2).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(2.2F, -0.5F, -0.2F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(38, 14).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.8F, 1.0F, -0.08699999668789724F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(38, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.00999999F)), PartPose.offset(-0.05F, 2.8F, -2.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 4.3F, 0.6F, -0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(35, 2).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-2.2F, -0.5F, -0.2F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(38, 14).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.8F, 1.0F, -0.08699999668789724F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(38, 22).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.00999999F)), PartPose.offset(0.05F, 2.8F, -2.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 41).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 4.3F, 0.6F, -0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(1, 9).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -1.8F, 1.075068330952604F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(1, 0).addBox(-2.0F, -2.5F, -3.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.8F, -0.2F, -0.6370451769779303F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 47).mirror(true).addBox(-1.0F, -2.5F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.7F, -1.5F, -0.5F, -0.5585053606381855F, 0.20943951023931953F, -1.2217304763960306F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(14, 19).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -2.6F, 0.24696408249929488F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(6, 22).addBox(-1.0F, 0.0F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.08F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.7F, -0.7F, -0.30543261909900765F, 0.0F, 0.0F));

            PartDefinition Snout1 = Snout.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(14, 24).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -1.0477211286669073F, 0.0F, 0.0F));
            PartDefinition Snout2 = Snout1.addOrReplaceChild("Snout2", CubeListBuilder.create().texOffs(15, 28).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.7037167490777915F, 0.0F, 0.0F));

            PartDefinition Horn1Left = Head.addOrReplaceChild("Horn1Left", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.00999999F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.0F, -2.3F, -1.9F, -0.3853686975087674F, -0.03490658503988659F, 0.2617993877991494F));
            PartDefinition Horn2Left = Horn1Left.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.2617993877991494F, 0.0F, 0.0F));
            PartDefinition Horn3Left = Horn2Left.addOrReplaceChild("Horn3Left", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.3490658503988659F, 0.0F, -0.17453292519943295F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -2.5F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.7F, -1.5F, -0.5F, -0.5585053606381855F, -0.20943951023931953F, 1.2217304763960306F));

            PartDefinition Horn1Right = Head.addOrReplaceChild("Horn1Right", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.00999999F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.0F, -2.3F, -1.9F, -0.3853686975087674F, 0.03490658503988659F, -0.2617993877991494F));
            PartDefinition Horn2Right = Horn1Right.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.2617993877991494F, 0.0F, 0.0F));
            PartDefinition Horn3Right = Horn2Right.addOrReplaceChild("Horn3Right", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.3490658503988659F, 0.0F, 0.17453292519943295F));

            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(16, 9).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -4.6F, -2.0F, -0.2275909337942703F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(SaigaAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.637F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.075F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.637F;
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
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.075F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.637F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 10.8F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.226F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.261F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.209F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.349F;
                this.UpperArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.349F;
                this.UpperArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.157F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.767F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.157F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.767F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends SaigaAntelopeModel {
        public ModelPart ArmBaseRight;
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Hips;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart TopSnout;
        public ModelPart Mouth;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.Tail = this.Hips.getChild("Tail");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Snout = this.Head.getChild("Snout");
            this.EarRight = this.Head.getChild("EarRight");
            this.Mouth = this.Snout.getChild("Mouth");
            this.TopSnout = this.Snout.getChild("TopSnout");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(14, 52).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 14.6F, -5.3F, -0.2260201348043143F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(35, 2).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.7F, -0.5F, -0.2F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(38, 14).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.8F, 1.0F, -0.08691739708221274F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(38, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.01F)), PartPose.offset(-0.05F, 2.8F, -2.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(37, 27).addBox(-1.0F, -0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 1.4F, 0.6F, -0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(35, 2).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, -0.5F, -0.2F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(38, 14).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.8F, 1.0F, -0.08691739708221274F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(38, 22).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.01F)), PartPose.offset(0.05F, 2.8F, -2.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(37, 27).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 1.4F, 0.6F, -0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(36, 49).addBox(-2.5F, -5.0F, 0.0F, 5.0F, 5.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 1.0F, 0.2609267198442009F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(27, 36).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 7.0F, -0.20891591612425317F, -0.001745329278001762F, 0.0F));
            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(11, 44).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 4.0F, 0.3490658503988659F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(50, 1).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.7F, 1.4F, 1.6F, 0.15707963267948966F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(52, 13).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 4.0F, -1.3F, 0.6630506121274178F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(53, 21).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 2.0F, 3.0F, -0.7670722195673133F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(53, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 4.8F, -1.4F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(50, 1).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, 1.4F, 1.6F, 0.15707963267948966F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(52, 13).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.1F, 4.0F, -1.3F, 0.6630506121274178F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(53, 21).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 2.0F, 3.0F, -0.7670722195673133F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(53, 30).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 4.8F, -1.4F, 0.11728612207217244F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(1, 9).addBox(-1.0F, -3.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -1.8F, 1.1185814536872996F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.8F, -0.6370451769779303F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(12, 12).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.2F, -0.7F, -1.1F, -0.5585053606381855F, -0.20943951023931953F, 1.2217304763960306F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(19, 1).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -2.7F, 0.40334560078853393F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(12, 12).mirror(true).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.2F, -0.7F, -1.1F, -0.5585053606381855F, 0.20943951023931953F, -1.2217304763960306F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(20, 10).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01999998F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -0.4F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(20, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F, -0.2F, -0.2F)), PartPose.offsetAndRotation(0.0F, -0.1F, -2.0F, -0.7740534966278743F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(SaigaAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.637F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.119F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.637F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.349F;
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
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.119F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.637F;
                this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.349F;
                this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 14.6F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.226F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.261F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.201F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.349F;
                this.UpperArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F -0.039F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.349F;
                this.UpperArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.087F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F -0.039F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.157F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.767F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.117F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.157F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.767F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.117F;
            }
        }
    }
}