package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.GaboonViperEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GaboonViperModel extends ZawaBaseModel<GaboonViperEntity> {
    protected ModelPart Base;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Base);
        }

        return this.parts;
    }

    public static class Adult extends GaboonViperModel {
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart Chest;
        public ModelPart Body;
        public ModelPart TailBase;
        public ModelPart Tail1;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;
        public ModelPart Jaw;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart Tongue;
        public ModelPart EyeLeft;
        public ModelPart EyeRight;
        public ModelPart LeftNoseHorn;
        public ModelPart RightNoseHorn;

        public Adult(ModelPart root) {
            this.Base = root.getChild("Base");
            this.Head = this.Base.getChild("Head");
            this.Jaw = this.Head.getChild("Jaw");
            this.Mouth = this.Jaw.getChild("Mouth");
            this.Tongue = this.Mouth.getChild("Tongue");

            this.Snout = this.Head.getChild("Snout");
            this.LeftNoseHorn = this.Snout.getChild("LeftNoseHorn");

            this.EyeLeft = this.Snout.getChild("EyeLeft");

            this.EyeRight = this.Snout.getChild("EyeRight");

            this.RightNoseHorn = this.Snout.getChild("RightNoseHorn");

            this.Neck = this.Base.getChild("Neck");
            this.Chest = this.Neck.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.TailBase = this.Body.getChild("TailBase");
            this.Tail1 = this.TailBase.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Tail5 = this.Tail4.getChild("Tail5");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Base = partDefinition.addOrReplaceChild("Base", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 22.5F, -10.5F));
            PartDefinition Head = Base.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 26).addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.3F, -0.5F, 0.19530233597447247F, 0.0F, 0.0F));
            PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(18, 27).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Mouth = Jaw.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(38, 19).addBox(-1.5F, 0.0F, -1.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.4F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Tongue = Mouth.addOrReplaceChild("Tongue", CubeListBuilder.create().texOffs(29, 26).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 0.0F, 4.0F), PartPose.offset(0.0F, 0.75F, 2.5F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(36, 27).addBox(-1.5F, -1.0F, -1.8F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -3.4F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition LeftNoseHorn = Snout.addOrReplaceChild("LeftNoseHorn", CubeListBuilder.create().texOffs(7, 24).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, -1.0F, -1.0F, 0.0F, 0.0F, 0.7853981633974483F));

            PartDefinition EyeLeft = Snout.addOrReplaceChild("EyeLeft", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, -1.1F, -0.5F, 0.0F, 0.46914448828868976F, 0.0F));

            PartDefinition EyeRight = Snout.addOrReplaceChild("EyeRight", CubeListBuilder.create().texOffs(0, 24).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, -1.1F, -0.5F, 0.0F, -0.46914448828868976F, 0.0F));

            PartDefinition RightNoseHorn = Snout.addOrReplaceChild("RightNoseHorn", CubeListBuilder.create().texOffs(7, 24).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, -1.0F, -1.0F, 0.0F, 0.0F, 0.7853981633974483F));

            PartDefinition Neck = Base.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 4.0F), PartPose.offset(0.0F, -0.8F, -0.2F));
            PartDefinition Chest = Neck.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 4.0F), PartPose.offset(0.0F, -0.05F, 3.5F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 14).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 6.0F), PartPose.offset(0.0F, -0.05F, 4.0F));
            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(12, 0).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 3.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -0.05F, 5.0F, 0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition Tail1 = TailBase.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(15, 15).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 3.0F, 8.0F), PartPose.offsetAndRotation(0.05F, -0.05F, 7.0F, -0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(40, 0).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 3.0F, 6.0F), PartPose.offset(0.0F, 0.05F, 7.5F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(46, 9).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 5.0F), PartPose.offset(0.0F, 0.05F, 5.5F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(50, 17).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.3F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 4.5F, -0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(50, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, -0.03490658503988659F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(GaboonViperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.195F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.Neck.yRot = (float) Math.toRadians(40);
            this.Chest.yRot = (float) Math.toRadians(40);
            this.Body.yRot = (float) Math.toRadians(-80);
            this.TailBase.yRot = (float) Math.toRadians(-80);
            this.Tail1.yRot = (float) Math.toRadians(-60);
            this.Tail2.yRot = (float) Math.toRadians(60);
            this.Tail3.yRot = (float) Math.toRadians(80);
            this.Tail4.yRot = (float) Math.toRadians(60);
            this.Tail5.yRot = (float) Math.toRadians(20);
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 2.0F;
                float degree = 0.5F;
                this.Base.z = Mth.cos(1F + limbSwing * speed * 0.3F) * degree * 8.0F * limbSwingAmount - 10.5F;
                this.Base.yRot = Mth.cos(3F + limbSwing * speed * 0.3F) * degree * -2.0F * limbSwingAmount;
                this.Head.yRot = Mth.cos(3F + limbSwing * speed * 0.3F) * degree * 2.0F * limbSwingAmount;
                this.Neck.yRot = Mth.cos(4.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Chest.yRot = Mth.cos(3.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.TailBase.yRot = Mth.cos(2.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail2.yRot = Mth.cos(1.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail3.yRot = Mth.cos(1.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail4.yRot = Mth.cos(0.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail5.yRot = Mth.cos(0.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;

            } else {
                float speed = 2.0f;
                float degree = 0.5f;
                this.Base.z = Mth.cos(1F + limbSwing * speed * 0.3F) * degree * 8.0F * limbSwingAmount - 10.5F;
                this.Base.yRot = Mth.cos(3F + limbSwing * speed * 0.3F) * degree * -2.0F * limbSwingAmount;
                this.Head.yRot = Mth.cos(3F + limbSwing * speed * 0.3F) * degree * 2.0F * limbSwingAmount;
                this.Neck.yRot = Mth.cos(4.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Chest.yRot = Mth.cos(3.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.TailBase.yRot = Mth.cos(2.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail2.yRot = Mth.cos(1.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail3.yRot = Mth.cos(1.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail4.yRot = Mth.cos(0.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail5.yRot = Mth.cos(0.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
            }
        }
    }

    public static class Child extends GaboonViperModel {
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart Chest;
        public ModelPart Body;
        public ModelPart TailBase;
        public ModelPart Tail1;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;
        public ModelPart Jaw;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart Tongue;
        public ModelPart EyeLeft;
        public ModelPart EyeRight;
        public ModelPart LeftNoseHorn;
        public ModelPart RightNoseHorn;

        public Child(ModelPart root) {
            this.Base = root.getChild("Base");
            this.Head = this.Base.getChild("Head");
            this.Jaw = this.Head.getChild("Jaw");
            this.Mouth = this.Jaw.getChild("Mouth");
            this.Tongue = this.Mouth.getChild("Tongue");

            this.Snout = this.Head.getChild("Snout");
            this.LeftNoseHorn = this.Snout.getChild("LeftNoseHorn");

            this.EyeLeft = this.Snout.getChild("EyeLeft");

            this.EyeRight = this.Snout.getChild("EyeRight");

            this.RightNoseHorn = this.Snout.getChild("RightNoseHorn");

            this.Neck = this.Base.getChild("Neck");
            this.Chest = this.Neck.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.TailBase = this.Body.getChild("TailBase");
            this.Tail1 = this.TailBase.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Tail5 = this.Tail4.getChild("Tail5");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Base = partDefinition.addOrReplaceChild("Base", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 22.5F, -10.5F));
            PartDefinition Head = Base.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 26).addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.3F, -0.5F, 0.19530233597447247F, 0.0F, 0.0F));
            PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(18, 27).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Mouth = Jaw.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(38, 19).addBox(-1.5F, 0.0F, -1.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.4F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Tongue = Mouth.addOrReplaceChild("Tongue", CubeListBuilder.create().texOffs(29, 26).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 0.0F, 4.0F), PartPose.offset(0.0F, 0.75F, 2.5F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(36, 27).addBox(-1.5F, -1.0F, -1.8F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -3.4F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition LeftNoseHorn = Snout.addOrReplaceChild("LeftNoseHorn", CubeListBuilder.create().texOffs(7, 24).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, -1.0F, -1.0F, 0.0F, 0.0F, 0.7853981633974483F));

            PartDefinition EyeLeft = Snout.addOrReplaceChild("EyeLeft", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, -1.1F, -0.5F, 0.0F, 0.46914448828868976F, 0.0F));

            PartDefinition EyeRight = Snout.addOrReplaceChild("EyeRight", CubeListBuilder.create().texOffs(0, 24).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, -1.1F, -0.5F, 0.0F, -0.46914448828868976F, 0.0F));

            PartDefinition RightNoseHorn = Snout.addOrReplaceChild("RightNoseHorn", CubeListBuilder.create().texOffs(7, 24).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, -1.0F, -1.0F, 0.0F, 0.0F, 0.7853981633974483F));

            PartDefinition Neck = Base.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 4.0F), PartPose.offset(0.0F, -0.8F, -0.2F));
            PartDefinition Chest = Neck.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 4.0F), PartPose.offset(0.0F, -0.05F, 3.5F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 14).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 6.0F), PartPose.offset(0.0F, -0.05F, 4.0F));
            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(12, 0).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 3.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -0.05F, 5.0F, 0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition Tail1 = TailBase.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(15, 15).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 3.0F, 8.0F), PartPose.offsetAndRotation(0.05F, -0.05F, 7.0F, -0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(40, 0).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 3.0F, 6.0F), PartPose.offset(0.0F, 0.05F, 7.5F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(46, 9).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 5.0F), PartPose.offset(0.0F, 0.05F, 5.5F));
            PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(50, 17).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.3F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 4.5F, -0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(50, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, -0.03490658503988659F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(GaboonViperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.195F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.Neck.yRot = (float) Math.toRadians(40);
            this.Chest.yRot = (float) Math.toRadians(40);
            this.Body.yRot = (float) Math.toRadians(-80);
            this.TailBase.yRot = (float) Math.toRadians(-80);
            this.Tail1.yRot = (float) Math.toRadians(-60);
            this.Tail2.yRot = (float) Math.toRadians(60);
            this.Tail3.yRot = (float) Math.toRadians(80);
            this.Tail4.yRot = (float) Math.toRadians(60);
            this.Tail5.yRot = (float) Math.toRadians(20);
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 2.0F;
                float degree = 0.5F;
                this.Base.z = Mth.cos(1F + limbSwing * speed * 0.3F) * degree * 8.0F * limbSwingAmount - 10.5F;
                this.Base.yRot = Mth.cos(3F + limbSwing * speed * 0.3F) * degree * -2.0F * limbSwingAmount;
                this.Head.yRot = Mth.cos(3F + limbSwing * speed * 0.3F) * degree * 2.0F * limbSwingAmount;
                this.Neck.yRot = Mth.cos(4.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Chest.yRot = Mth.cos(3.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.TailBase.yRot = Mth.cos(2.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail2.yRot = Mth.cos(1.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail3.yRot = Mth.cos(1.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail4.yRot = Mth.cos(0.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail5.yRot = Mth.cos(0.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;

            } else {
                float speed = 2.0f;
                float degree = 0.5f;
                this.Base.z = Mth.cos(1F + limbSwing * speed * 0.3F) * degree * 8.0F * limbSwingAmount - 10.5F;
                this.Base.yRot = Mth.cos(3F + limbSwing * speed * 0.3F) * degree * -2.0F * limbSwingAmount;
                this.Head.yRot = Mth.cos(3F + limbSwing * speed * 0.3F) * degree * 2.0F * limbSwingAmount;
                this.Neck.yRot = Mth.cos(4.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Chest.yRot = Mth.cos(3.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.TailBase.yRot = Mth.cos(2.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail2.yRot = Mth.cos(1.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail3.yRot = Mth.cos(1.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail4.yRot = Mth.cos(0.5F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
                this.Tail5.yRot = Mth.cos(0.0F + limbSwing * speed * 0.3F) * degree * 1.0F * limbSwingAmount;
            }
        }
    }
}

