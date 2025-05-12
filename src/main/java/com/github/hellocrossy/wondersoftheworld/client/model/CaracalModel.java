package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.CaracalEntity;
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

public abstract class CaracalModel extends ZawaBaseModel<CaracalEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends CaracalModel {
        public ModelPart ArmBaseRight;
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart UpperArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart EarTuftRight;
        public ModelPart EarTuftLeft;
        public ModelPart UpperArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.ForearmRight = this.UpperArmRight.getChild("ForearmRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.Neck = this.Chest.getChild("Neck");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.Mouth = this.Snout.getChild("Mouth");
            this.EarTuftLeft = this.EarLeft.getChild("EarTuftLeft");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.EarTuftRight = this.EarRight.getChild("EarTuftRight");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ForearmLeft = this.UpperArmLeft.getChild("ForearmLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Head = this.Neck.getChild("Head");
            this.Tail1 = this.Hips.getChild("Tail1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();
            
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 8.0F, 10.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 1.1F, 0.18256144042439712F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 31).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.26668630504420165F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(48, 9).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 0.3F, -2.7F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(48, 4).addBox(-1.0F, 0.0F, -2.3F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.9F, 0.0F, 0.27314402127920984F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(44, 29).mirror(true).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 7.0F, 6.0F), PartPose.offsetAndRotation(-2.4F, 2.2F, 1.4F, 0.1752310562344404F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(20, 47).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -5.3F, -2.4F, -0.3712315398886772F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(31, 46).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offset(0.0F, 3.8F, -3.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(52, 50).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 3.5F, -0.5084143964585622F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(52, 59).mirror(true).addBox(-1.5F, 0.0F, -1.3F, 3.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 4.8F, -2.5F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, -6.0F, -2.5F, 4.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -0.6F, 1.2035790361963232F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(44, 29).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 7.0F, 6.0F), PartPose.offsetAndRotation(2.4F, 2.2F, 1.4F, 0.1752310562344404F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.2593559208542449F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -4.0F, -2.5F, 7.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 10.4F, -6.0F, -0.11920598657963215F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(30, 52).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 2.0F, 0.8F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -2.7F, 0.0F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-2.8F, -2.0F, 0.0F, 0.2270673396792039F, 0.3968878679087689F, -0.18849556254433897F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(49, 13).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 1.6F, 0.2F));
            partDefinition.addOrReplaceChild("EarTuftLeft", CubeListBuilder.create().texOffs(37, 0).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 0.5F, -0.4300491170387584F, 0.4300491170387584F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(31, 39).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 1.5F, -0.21694443134921734F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(50, 42).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -2.0F, 0.5084143964585622F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(29, 29).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(2.8F, 0.3F, -0.3F, 0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(27, 0).mirror(true).addBox(-1.0F, -2.7F, 0.0F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(1.8F, -2.0F, 0.0F, 0.2270673396792039F, -0.3968878679087689F, 0.18849556254433897F));
            partDefinition.addOrReplaceChild("EarTuftRight", CubeListBuilder.create().texOffs(37, 0).mirror(true).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 0.5F, -0.4300491170387584F, -0.4300491170387584F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(29, 29).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-2.8F, 0.3F, -0.3F, 0.3186971254089062F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(31, 46).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offset(0.0F, 3.8F, -3.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(52, 50).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 3.5F, -0.5084143964585622F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(12, 58).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-0.5F, 2.0F, 4.0F, 0.18116517835438223F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(52, 59).addBox(-1.5F, 0.0F, -1.3F, 3.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 4.8F, -2.5F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(31, 39).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 1.5F, -0.21694443134921734F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(30, 52).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 2.0F, 0.8F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(50, 42).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -2.0F, 0.5084143964585622F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(26, 6).addBox(-3.0F, -2.0F, -3.0F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.5F, -6.1F, -0.7F, -1.0086257907064895F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(24, 58).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -1.242674374156741F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(CaracalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
            this.Neck.xRot = headPitch / (180F / (float) Math.PI) * 0.5F + 1.203F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
            this.Head.xRot = headPitch / (180F / (float) Math.PI) * 0.5F - 1.008F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F + 1.204F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 1.008F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 1.242F;
            this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.181F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 0.2F;
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                speed = 1.8F;
                degree = 0.1F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) - 0.12F;
                this.Body.xRot = Mth.cos(0.0F + limbSwing * speed * 0.6F) * degree * -1.8F * limbSwingAmount + 0.18F;
                this.Hips.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.8F) - 0.27F;
                this.Neck.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.0F) + 1.204F;
                this.Head.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) + 0.4F;
                this.Chest.y = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) + 10.4F;

                this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) - 0.2F;
                this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) + 0.18F;

                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6.0F) + 0.0F;
                this.UpperArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) - 0.2F;
                this.HandLeft.xRot = Mth.cos(-3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 5.0F) + 0.2F;
                this.ArmBaseRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6.0F) + 0.0F;
                this.UpperArmRight.xRot = Mth.cos(7.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.0F) - 0.2F;
                this.HandRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 5.0F) + 0.2F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -5.0F) + 0.1F;
                this.UpperLegLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.508F;
                this.LowerLegLeft.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) - 0.508F;
                this.FootLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F);
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -5.0F) + 0.1F;
                this.UpperLegRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F) + 0.508F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2.0F) - 0.508F;
                this.FootRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4.0F);

            } else {
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.2F) + 1.204F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.2F) - 1.008F;

                this.Chest.y = Mth.cos(limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.1F) + 10.4F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.02F) - 0.12F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.1F) + 0.18F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * 0.2F) - 0.27F;

                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1.8F) + 0.24F;
                this.UpperArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.0F) - 0.169F;
                this.HandLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -3.0F) + 0.017F;
                this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.8F) + 0.24F;
                this.UpperArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.0F) - 0.169F;
                this.HandRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 3.0F) + 0.017F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.5F) + 0.175F;
                this.UpperLegLeft.xRot = Mth.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.3F) + 0.508F;
                this.LowerLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.0F) - 0.508F;
                this.FootLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * degree * -1.5F * limbSwingAmount + 0.0F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2.5F) + 0.175F;
                this.UpperLegRight.xRot = Mth.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1.3F) + 0.508F;
                this.LowerLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -2.0F) - 0.508F;
                this.FootRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * degree * 1.5F * limbSwingAmount + 0.0F;

                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.2F) - 1.242F;
                this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.8F) * limbSwingAmount * (degree * -0.4F) + 0.181F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.8F);
                this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.8F);

            }
        }
    }

    public static class Child extends CaracalModel {
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
        public ModelPart EarRight_1;
        public ModelPart EarLeft_1;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.EarLeft_1 = this.EarLeft.getChild("EarLeft_1");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Snout1 = this.Head.getChild("Snout1");
            this.EarRight = this.Head.getChild("EarRight");
            this.Hips = this.BackPoint.getChild("Hips");
            this.Neck = this.Chest.getChild("Neck");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.BackPoint = this.Chest.getChild("BackPoint");
            this.EarRight_1 = this.EarRight.getChild("EarRight_1");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Mouth = this.Snout1.getChild("Mouth");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Head = this.Neck.getChild("Head");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.TopSnout = this.Snout1.getChild("TopSnout");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(1.4F, -2.5F, 2.3F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(29, 10).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.02F, 1.3F, -0.5F));
            partDefinition.addOrReplaceChild("EarLeft_1", CubeListBuilder.create().texOffs(25, 20).addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F), PartPose.offsetAndRotation(-0.5F, -3.0F, -0.5F, -0.27366763203903305F, 0.0F, 0.2792526803190927F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(30, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.4F, -0.36F, 1.55F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(20, 10).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 2.0F, 1.8F, -0.6981317007977318F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(11, 23).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.8F, 0.24434609527920614F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(25, 22).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, -0.5F, -0.2F, 0.273493095119092F, 0.47891835606830785F, -0.2792526803190927F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.8F, -0.04747295615358847F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 1.7F, -0.5450663174083458F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(29, 14).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 1.7F, 0.0F, -0.02007128598181587F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BackPoint", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 4.0F, -0.019999998568980413F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight_1", CubeListBuilder.create().texOffs(25, 20).mirror(true).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F), PartPose.offsetAndRotation(0.5F, -3.0F, -0.5F, -0.27366763203903305F, 0.0F, -0.2792526803190927F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(29, 14).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 1.7F, 0.0F, -0.02007128598181587F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(20, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(-1.4F, -2.5F, 2.3F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(20, 6).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.0F, -1.5F, 0.6981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(29, 10).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.02F, 1.3F, -0.5F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.4F, -0.36F, 1.55F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(20, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.0F, -1.5F, 0.6981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, 0.2668608419641427F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, -0.9F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(40, 5).addBox(-1.02F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, 0.23596852285911663F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(23, 26).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -2.2F, 0.528660246408049F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(20, 15).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.4F, -1.0F, 0.04747295615358847F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(25, 22).mirror(true).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.6F, -0.5F, -0.2F, 0.27366763203903305F, -0.47891835606830785F, 0.2792526803190927F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 17.7F, -4.0F, 0.02007128598181587F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.4F, -0.3F, -0.3351032296987167F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(12, 20).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.4F, -0.3F, 0.32253683777906883F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 15).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 2.4F, -1.0F, 0.04747295615358847F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(30, 6).addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 2.85F, 0.5F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(20, 10).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.02F, 2.0F, 1.8F, -0.6981317007977318F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(30, 6).mirror(true).addBox(-1.0F, -0.7F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.85F, 0.5F, -0.17453292519943295F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(CaracalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.528F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.545F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.528F;
            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.266F;
            this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.236F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
            this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.8F) * 0.5F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 0.75f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.545F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.528F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 17.7F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.02F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.047F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.17F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.17F;
                this.ForearmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.02F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.17F;
                this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.17F;
                this.ForearmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F;
                this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.02F;

                this.ThighLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.698F;
                this.LowerLegLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F - 0.698F;
                this.FootLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.047F;
                this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.698F;
                this.LowerLegRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.698F;
                this.FootRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.047F;

                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.266F;
                this.Tail2.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.236F;
                this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.8F) * 0.5F;
                this.Tail2.zRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F;
            }
        }
    }
}
