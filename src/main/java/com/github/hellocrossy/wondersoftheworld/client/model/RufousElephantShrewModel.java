package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.RufousElephantShrewEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class RufousElephantShrewModel extends ZawaBaseModel<RufousElephantShrewEntity> {
    protected ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends RufousElephantShrewModel {
        public ModelPart Rear;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Chest;
        public ModelPart TailBase;
        public ModelPart Tail1;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart FootLeft;
        public ModelPart FootLeft_1;
        public ModelPart FootRight;
        public ModelPart FootRight_1;
        public ModelPart Neck;
        public ModelPart ArmRight;
        public ModelPart ChestUnder;
        public ModelPart ArmLeft;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart TopSnout;
        public ModelPart Nose;
        public ModelPart Nose_1;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;


        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.FootRight = this.ThighRight.getChild("FootRight");
            this.FootRight_1 = this.FootRight.getChild("FootRight_1");

            this.Chest = this.Body.getChild("Chest");
            this.ChestUnder = this.Chest.getChild("ChestUnder");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Nose = this.Snout.getChild("Nose");

            this.Nose_1 = this.Snout.getChild("Nose_1");

            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.FootLeft = this.ThighLeft.getChild("FootLeft");
            this.FootLeft_1 = this.FootLeft.getChild("FootLeft_1");

            this.Rear = this.Body.getChild("Rear");
            this.TailBase = this.Rear.getChild("TailBase");
            this.Tail1 = this.TailBase.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();
            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.4F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 19.0F, -0.1F, -0.04991641477611458F, 0.0F, 0.0F));
            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(15, 19).mirror(true).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.7F, -0.3F, 1.2F, 0.149923785409474F, 0.0F, 0.0F));
            PartDefinition FootRight = ThighRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(25, 21).mirror(true).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.2F, 2.5F, 0.9F, -0.32253683777906883F, 0.0F, 0.0F));
            PartDefinition FootRight_1 = FootRight.addOrReplaceChild("FootRight_1", CubeListBuilder.create().texOffs(25, 25).mirror(true).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.01F, 2.4F, -0.5F, 0.38117991129872264F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 9).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -1.7F, 0.20001473294434044F, 0.0F, 0.0F));
            PartDefinition ChestUnder = Chest.addOrReplaceChild("ChestUnder", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -2.0F, -0.1429424584146426F, 0.0F, 0.0F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(14, 25).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.01F, 3.0F, -2.5F, 0.10000736647217022F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(18, 25).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.3000000035018414F, 0.0F, 0.0F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(17, 28).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.1F, 2.3F, -0.5F, 0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(14, 25).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.01F, 3.0F, -2.5F, 0.10000736647217022F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(18, 25).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.3000000035018414F, 0.0F, 0.0F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(17, 28).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.1F, 2.3F, -0.5F, 0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(14, 9).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -3.0F, -0.5064945569182376F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -1.5F, 0.6065019150680295F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.4F, 0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(8, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, 0.5335471470083444F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(13, 29).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, -0.14259340121951725F, 0.0F, 0.0F));

            PartDefinition Nose_1 = Snout.addOrReplaceChild("Nose_1", CubeListBuilder.create().texOffs(5, 28).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, -0.14259340121951725F, 0.0F, 0.0F));

            PartDefinition Rear = Body.addOrReplaceChild("Rear", CubeListBuilder.create().texOffs(18, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.2F, 2.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition TailBase = Rear.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.7F, -0.7127924691776453F, -0.0F, 0.0F));
            PartDefinition Tail1 = TailBase.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(26, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.5F, -0.4091051859885346F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(26, 9).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.5F, 0.3790855015489435F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(24, 12).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.5445427399380363F, 0.0F, 0.0F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(24, 16).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.4363323129985824F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(10, 22).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.8F, -1.1F, 0.5F, -0.500909508638178F, 0.3186971254089062F, 0.3642502295386026F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(10, 22).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.8F, -1.1F, 0.5F, -0.500909508638178F, -0.3186971254089062F, -0.3642502295386026F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(15, 19).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.7F, -0.3F, 1.2F, 0.149923785409474F, 0.0F, 0.0F));
            PartDefinition FootLeft = ThighLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(25, 21).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.2F, 2.5F, 0.9F, -0.32253683777906883F, 0.0F, 0.0F));
            PartDefinition FootLeft_1 = FootLeft.addOrReplaceChild("FootLeft_1", CubeListBuilder.create().texOffs(25, 25).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.01F, 2.4F, -0.5F, 0.38117991129872264F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(RufousElephantShrewEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.606F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = Mth.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.606F;
            this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.5F;
            this.EarRight.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.5F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.506F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 4.0f;
            float degree = 1.0f;
            this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.1F;
            this.ForearmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + -0.3F;
            this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.3F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.1F;
            this.ForearmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + -0.3F;
            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F + 0.15F;
            this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * 2.0F * limbSwingAmount * 0.5F + 0.15F;
            this.FootRight.xRot = Mth.cos(limbSwing * speed * 0.3F + (float)Math.PI) * degree * -2.0F * limbSwingAmount * 0.5F;
            this.TailBase.yRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + (float)Math.PI) * degree * 1.0F * limbSwingAmount * 0.5F;
            this.Tail1.yRot = Mth.cos(limbSwing * speed * 0.3F + (float)Math.PI) * degree * -0.7F * limbSwingAmount * 0.5F + 0.1F;
            this.Tail2.yRot = Mth.cos(limbSwing * speed * 0.3F + (float)Math.PI) * degree * -0.7F * limbSwingAmount * 0.5F;
            this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.3F + (float)Math.PI) * degree * -1.0F * limbSwingAmount * 0.5F;
            this.Body.y = Mth.cos(-2.0F + limbSwing * speed * 0.6F + (float)Math.PI) * degree * 0.02F * limbSwingAmount * 0.5F + 19.0F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.6F + (float)Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F + -0.5F;
            this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + (float)Math.PI) * degree * 0.15F * limbSwingAmount * 0.5F + 0.2F;
            this.Body.xRot = Mth.cos(limbSwing * speed * 0.0F + (float)Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F + -0.05F;
            this.TailBase.xRot = Mth.cos(limbSwing * speed * 0.0F + (float)Math.PI) * degree * 0.0F * limbSwingAmount * 0.5F + -0.71F;
        }
    }

    public static class Child extends RufousElephantShrewModel {
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
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart TopSnout;
        public ModelPart Nose;
        public ModelPart Nose_1;
        public ModelPart HandRight;
        public ModelPart Tail2;
        public ModelPart FootLeft;
        public ModelPart FootRight;


        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.FootRight = this.ThighRight.getChild("FootRight");

            this.Belly = this.Body.getChild("Belly");

            this.Chest = this.Body.getChild("Chest");
            this.ArmRight = this.Chest.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.Nose = this.Snout.getChild("Nose");
            this.Nose_1 = this.Snout.getChild("Nose_1");
            this.EarRight = this.Head.getChild("EarRight");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.FootLeft = this.ThighLeft.getChild("FootLeft");

            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();
            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 6).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 21.8F, 0.0F, -0.09093165469469484F, 0.0F, 0.0F));
            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(4, 16).mirror(true).addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-2.2F, -1.6F, 0.7F, 0.09093165469469484F, 0.0F, 0.0F));
            PartDefinition FootRight = ThighRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(2, 21).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(0.6F, 2.8F, 0.3F));

            PartDefinition Belly = Body.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -1.9F, -0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(12, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -1.3F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 16).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.8F, 1.7F, -1.2F, -0.135961148064568F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.1F, 1.6F, -0.2F, 0.09093165469469484F, 0.0F, 0.0F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.8F, 1.7F, -1.2F, -0.135961148064568F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.1F, 1.6F, -0.2F, 0.09093165469469484F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -0.7F, -0.42149700769872783F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.85F, 0.41102502552885917F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(12, 15).addBox(-0.5F, 0.0F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.9F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, 0.5335471470083444F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(18, 19).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.8F, -0.14259340121951725F, 0.0F, 0.0F));

            PartDefinition Nose_1 = Snout.addOrReplaceChild("Nose_1", CubeListBuilder.create().texOffs(12, 19).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, -0.14259340121951725F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(13, 6).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-0.8F, -1.15F, 0.3F, 0.2598795316140681F, 0.3186971254089062F, -0.3642502295386026F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(13, 6).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.8F, -1.15F, 0.3F, 0.24574235734922104F, -0.3186971254089062F, 0.3642502295386026F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(4, 16).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(2.2F, -1.6F, 0.7F, 0.09093165469469484F, 0.0F, 0.0F));
            PartDefinition FootLeft = ThighLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(2, 21).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offset(-0.6F, 2.8F, 0.3F));

            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, 1.3F, -0.6812019857480981F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(19, 9).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, 2.0F, 0.3440043795891158F, 0.0F, 0.0F));
            return LayerDefinition.create(meshDefinition, 32,32);
        }

        @Override
        public void setupAnim(RufousElephantShrewEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.411F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = Mth.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.411F;
            this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.245F;
            this.EarRight.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.245F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.421F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 8.0f, degree = 0.8f;
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
            this.Body.y = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 21.8F;
        }
    }
}


