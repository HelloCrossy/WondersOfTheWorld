package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.KiwiEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class KiwiModel extends ZawaBaseModel<KiwiEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends KiwiModel {

        public ModelPart Chest;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart Beak;
        public ModelPart Mouth;
        public ModelPart Tail2;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart Toe1L;
        public ModelPart Toe2L;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Toe1R;
        public ModelPart Toe2R;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Head = this.Neck.getChild("Head");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.Toe1R = this.FootRight.getChild("Toe1R");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Tail1 = this.Body.getChild("Tail1");
            this.Mouth = this.Beak.getChild("Mouth");
            this.Chest = this.Body.getChild("Chest");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.Toe2L = this.FootLeft.getChild("Toe2L");
            this.Beak = this.Head.getChild("Beak");
            this.Toe1L = this.FootLeft.getChild("Toe1L");
            this.Toe2R = this.FootRight.getChild("Toe2R");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(9, 16).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.5864306020384839F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offset(0.0F, -2.7F, 0.6F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(7, 24).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 0.0F, 0.33161255787892263F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 18.5F, 0.0F, -0.15707963267948966F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.2F, -0.6829473549475088F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(7, 27).mirror(true).addBox(0.0F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, 0.1F, -1.3F, 0.0F, -0.4886921905584123F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(7, 24).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 0.0F, 0.33161255787892263F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.5215043658485197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(10, 10).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.2F, 2.5F, -0.46914448828868976F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.12217304763960307F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.8F, -2.5F, 0.9173450788166695F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.5215043658485197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(12, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 1.0F, 0.0F, 0.35185837453889574F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(12, 21).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 1.0F, 0.0F, 0.35185837453889574F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(7, 27).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 0.1F, -1.3F, 0.0F, 0.4886921905584123F, 0.0F));
            partDefinition.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 5.0F), PartPose.offset(0.0F, -0.3F, -0.8F));
            partDefinition.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(7, 27).addBox(-0.7F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.1F, -1.0F, 0.0F, -0.4886921905584123F, 0.0F));
            partDefinition.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(7, 27).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 0.1F, -1.3F, 0.0F, 0.4886921905584123F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(KiwiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI));
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.682F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Body.y = Mth.cos(6F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 18.5F;
                this.Body.xRot = Mth.cos(9.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.157F;
                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.917F;
                this.Neck.xRot = Mth.cos(7.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F - 0.682F;
                this.Head.xRot = Mth.cos(1F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 5F) * 0.5F + 0.351F;
                this.LegLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.521F;
                this.FootLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.331F;
                this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.351F;
                this.LegRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.521F;
                this.FootRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.331F;


            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 18.5F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.157F;
                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.917F;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.682F;
                this.Head.xRot = Mth.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.27F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.351F;
                this.LegLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.521F;
                this.FootLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.331F;
                this.ThighRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.351F;
                this.LegRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.521F;
                this.FootRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.331F;
            }
        }
    }

    public static class Child extends KiwiModel {


        public ModelPart LegLeft;
        public ModelPart LegRight;
        public ModelPart Neck;
        public ModelPart Tail;
        public ModelPart FootLeft;
        public ModelPart Toe1Left;
        public ModelPart Toe2Left;
        public ModelPart FootRight;
        public ModelPart Toe1R;
        public ModelPart Toe2R;
        public ModelPart Head;
        public ModelPart Beak;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Head = this.Neck.getChild("Head");
            this.Toe1R = this.FootRight.getChild("Toe1R");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Toe2Left = this.FootLeft.getChild("Toe2Left");
            this.Beak = this.Head.getChild("Beak");
            this.Neck = this.Body.getChild("Neck");
            this.Toe1Left = this.FootLeft.getChild("Toe1Left");
            this.LegLeft = this.Body.getChild("LegLeft");
            this.Toe2R = this.FootRight.getChild("Toe2R");
            this.Tail = this.Body.getChild("Tail");
            this.LegRight = this.Body.getChild("LegRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(18, 9).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.1F, -0.1F, 0.2553416715641412F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.1F, 0.0F, -0.11013027480215679F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 13).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.8F, 0.6F, -0.39269908169872414F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(18, 9).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.2617993877991494F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(18, 9).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.1F, -0.1F, 0.2553416715641412F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(18, 9).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.2617993877991494F, 0.0F));
            partDefinition.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(16, 5).addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F), PartPose.offset(0.0F, -0.1F, -0.9F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -2.0F, -0.6F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -1.5F, 0.5846852994181004F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(18, 9).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.0F, -0.2617993877991494F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(16, 3).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.9F, 2.0F, 1.5F, -0.17540559315438148F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(18, 9).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.2617993877991494F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(8, 8).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.7F, 2.5F, -0.5846852994181004F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(16, 3).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.9F, 2.0F, 1.5F, -0.17540559315438148F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(KiwiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.392F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.584F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.392F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 20.1F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.11F;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.584F;
                this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.392F;
                this.LegLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.175F;
                this.FootLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.255F;
                this.LegRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.175F;
                this.FootRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.255F;

            }
        }
    }
}
