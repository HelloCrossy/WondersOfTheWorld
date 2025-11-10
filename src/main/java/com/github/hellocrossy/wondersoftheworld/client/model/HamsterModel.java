package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.HamsterEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class HamsterModel extends ZawaBaseModel<HamsterEntity> {
    public ModelPart Hips;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Hips);
        }

        return this.parts;
    }

    public static class Adult extends HamsterModel {
        public ModelPart Rear;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Chest;
        public ModelPart TailBase;
        public ModelPart Tail1;
        public ModelPart FootLeft;
        public ModelPart FootRight;
        public ModelPart Neck;
        public ModelPart ArmRight;
        public ModelPart ArmLeft;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart LeftCheek;
        public ModelPart RightCheek;
        public ModelPart TopSnout;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;

        public Adult(ModelPart root) {
            this.Hips = root.getChild("Hips");
            this.Chest = this.Hips.getChild("Chest");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.RightCheek = this.Head.getChild("RightCheek");

            this.LeftCheek = this.Head.getChild("LeftCheek");

            this.EarRight = this.Head.getChild("EarRight");

            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.FootRight = this.ThighRight.getChild("FootRight");

            this.Rear = this.Hips.getChild("Rear");
            this.TailBase = this.Rear.getChild("TailBase");
            this.Tail1 = this.TailBase.getChild("Tail1");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.FootLeft = this.ThighLeft.getChild("FootLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Hips = partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.8F, 0.0F, -0.04991641477611458F, 0.0F, 0.0F));
            PartDefinition Chest = Hips.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(1, 10).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.3F, -2.0F, 0.20001473294434044F, 0.0F, 0.0F));
            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(26, 22).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.8F, 2.7F, -1.5F, 0.10000736647217022F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(28, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.8F, -0.3000221077388891F, 0.0F, 0.0F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(28, 28).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 1.2F, -0.5F, 0.06981317007977318F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(9, 16).addBox(-1.0F, -1.5F, -2.3F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -1.1F, -0.8583529314571334F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -2.45F, 0.8018042343977452F, 0.0F, 0.0F));
            PartDefinition RightCheek = Head.addOrReplaceChild("RightCheek", CubeListBuilder.create().texOffs(10, 27).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.84F, 0.7F, 0.75F, 0.0F, 0.0F, -0.06702064177855414F));

            PartDefinition LeftCheek = Head.addOrReplaceChild("LeftCheek", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.84F, 0.7F, 0.75F, 0.0F, 0.0F, 0.06702064177855414F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 30).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.8F, -1.15F, 0.3F, 0.2617993877991494F, 0.3186971254089062F, -0.3642502295386026F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.61F, -1.2F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(6, 29).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.66F, 0.4F, 0.3380702907586876F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.8F, -1.15F, 0.3F, 0.2617993877991494F, -0.3186971254089062F, 0.3642502295386026F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(26, 22).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.8F, 2.7F, -1.5F, 0.10000736647217022F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(28, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.8F, -0.3000221077388891F, 0.0F, 0.0F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(28, 28).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 1.2F, -0.5F, 0.06981317007977318F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 23).mirror(true).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-2.0F, 0.3F, 0.7F, 0.149923785409474F, 0.0F, 0.0F));
            PartDefinition FootRight = ThighRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(18, 29).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 2.0F, 0.0F, -0.08377580742467917F, 0.0F, 0.0F));

            PartDefinition Rear = Hips.addOrReplaceChild("Rear", CubeListBuilder.create().texOffs(18, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.1F, 2.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition TailBase = Rear.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 0.8F, -0.5955063221383375F, -0.0F, 0.0F));
            PartDefinition Tail1 = TailBase.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(19, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 1.5F, 0.18901915665940536F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 23).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(2.0F, 0.3F, 0.7F, 0.149923785409474F, 0.0F, 0.0F));
            PartDefinition FootLeft = ThighLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(18, 29).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 2.0F, 0.0F, -0.08377580742467917F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(HamsterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.802F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = Mth.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.802F;
            this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.262F;
            this.EarRight.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.262F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.858F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 2.0f;
            float degree = 0.6f;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.100F;
            this.HandLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.070F;
            this.ThighLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.150F;
            this.FootLeft.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.084F;

            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.100F;
            this.HandRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.070F;
            this.ThighRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.150F;
            this.FootRight.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.084F;

            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.858F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.802F;
            this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.262F;
            this.EarRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.262F;
            this.Hips.y = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 20.8F;
        }
    }

    public static class Child extends HamsterModel {
        public ModelPart Belly;
        public ModelPart Chest;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart ArmLeft;
        public ModelPart Neck;
        public ModelPart ArmRight;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart RightCheek;
        public ModelPart LeftCheek;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart TopSnout;
        public ModelPart TopSnout_1;
        public ModelPart HandRight;
        public ModelPart Tail2;
        public ModelPart FootLeft;
        public ModelPart FootRight;

        public Child(ModelPart root) {
            this.Hips = root.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.Chest = this.Hips.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.RightCheek = this.Head.getChild("RightCheek");

            this.LeftCheek = this.Head.getChild("LeftCheek");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.TopSnout_1 = this.TopSnout.getChild("TopSnout_1");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Belly = this.Hips.getChild("Belly");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.FootLeft = this.ThighLeft.getChild("FootLeft");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.FootRight = this.ThighRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Hips = partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(2, 1).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 21.8F, 0.0F, -0.09093165469469484F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.8F, 1.3F, -0.6812019857480981F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(19, 9).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.4F, 2.0F, 0.3440043795891158F, 0.0F, 0.0F));

            PartDefinition Chest = Hips.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(2, 10).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -1.3F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(10, 17).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.8F, -0.7F, -0.42149700769872783F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.85F, 0.41102502552885917F, 0.0F, 0.0F));
            PartDefinition RightCheek = Head.addOrReplaceChild("RightCheek", CubeListBuilder.create().texOffs(10, 27).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.84F, 0.7F, 0.75F, 0.0F, 0.0F, -0.06702064177855414F));

            PartDefinition LeftCheek = Head.addOrReplaceChild("LeftCheek", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.84F, 0.7F, 0.75F, 0.0F, 0.0F, 0.06702064177855414F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.8F, -1.15F, 0.3F, 0.24579244142247136F, -0.3186971254089062F, 0.3642502295386026F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 30).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.8F, -1.15F, 0.3F, 0.25987911549514775F, 0.3186971254089062F, -0.3642502295386026F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.11F, -0.9F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(6, 29).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.66F, 0.4F, 0.3380702907586876F, 0.0F, 0.0F));
            PartDefinition TopSnout_1 = TopSnout.addOrReplaceChild("TopSnout_1", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.7F, -0.1F, -0.6002187191082056F, 0.0F, 0.0F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(27, 23).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.8F, 1.7F, -1.2F, -0.135961148064568F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(28, 28).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 1.6F, -0.2F, 0.09093165469469484F, 0.0F, 0.0F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(27, 23).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.8F, 1.7F, -1.2F, -0.135961148064568F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(28, 28).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 1.6F, -0.2F, 0.09093165469469484F, 0.0F, 0.0F));

            PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.4F, -1.9F, -0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(17, 24).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(2.2F, -1.6F, 0.7F, 0.09093165469469484F, 0.0F, 0.0F));
            PartDefinition FootLeft = ThighLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(19, 29).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(-0.6F, 2.8F, 0.3F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(17, 24).mirror(true).addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-2.2F, -1.6F, 0.7F, 0.09093165469469484F, 0.0F, 0.0F));
            PartDefinition FootRight = ThighRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(19, 29).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.6F, 2.8F, 0.3F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(HamsterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.411F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = Mth.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.411F;
            this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.245F;
            this.EarRight.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.245F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.421F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 8.0f, degree = 0.8f;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.135F;
            this.HandLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.090F;
            this.ThighLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.090F;
            this.FootLeft.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;

            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.135F;
            this.HandRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.090F;
            this.ThighRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.090F;
            this.FootRight.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;

            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.421F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.411F;
            this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.245F;
            this.EarRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.245F;
            this.Hips.y = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 21.8F;
        }
    }
}

