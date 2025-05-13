package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.EmuEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class EmuModel extends ZawaBaseModel<EmuEntity> {
    protected ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends EmuModel {

        public ModelPart Hips;
        public ModelPart Chest;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart TailBase;
        public ModelPart Tail1;
        public ModelPart Tail;
        public ModelPart NeckBase;
        public ModelPart WingLeft;
        public ModelPart WingRight;
        public ModelPart NeckBase_1;
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart Beak;
        public ModelPart UpperBeak;
        public ModelPart BeakTip;
        public ModelPart Mouth;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart ToeRight;
        public ModelPart Toe1Right;
        public ModelPart Toe2Left;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart Toe3Left;
        public ModelPart Toe2Left_1;
        public ModelPart Toe1Left;


        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.NeckBase_1 = this.NeckBase.getChild("NeckBase_1");
            this.Toe2Left_1 = this.Toe3Left.getChild("Toe2Left_1");
            this.Neck = this.NeckBase_1.getChild("Neck");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Toe3Left = this.FootLeft.getChild("Toe3Left");
            this.Hips = this.Body.getChild("Hips");
            this.WingLeft = this.Chest.getChild("WingLeft");
            this.Toe2Left = this.ToeRight.getChild("Toe2Left");
            this.ToeRight = this.FootRight.getChild("ToeRight");
            this.Chest = this.Body.getChild("Chest");
            this.WingRight = this.Chest.getChild("WingRight");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Mouth = this.Beak.getChild("Mouth");
            this.Toe1Left = this.Toe3Left.getChild("Toe1Left");
            this.Head = this.Neck.getChild("Head");
            this.UpperBeak = this.Beak.getChild("UpperBeak");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.Beak = this.Head.getChild("Beak");
            this.TailBase = this.Hips.getChild("TailBase");
            this.Toe1Right = this.ToeRight.getChild("Toe1Right");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.NeckBase = this.Chest.getChild("NeckBase");
            this.Tail = this.TailBase.getChild("Tail");
            this.BeakTip = this.Beak.getChild("BeakTip");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("NeckBase_1", CubeListBuilder.create().texOffs(24, 48).addBox(-2.0F, -3.0F, -3.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -4.7F, -0.7037167490777915F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe2Left_1", CubeListBuilder.create().texOffs(56, 46).mirror(true).addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, 0.1F, -0.5F, 0.0F, 0.27314402127920984F, -0.03490658503988659F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(37, 53).addBox(-1.5F, -6.0F, 0.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -3.0F, 0.9773843811168246F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 43).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, 0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe3Left", CubeListBuilder.create().texOffs(56, 46).mirror(true).addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.10471975511965977F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 35).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 5.5F, -0.3909537457888271F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(42, 15).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(3.0F, 6.2F, -4.0F, -0.6646214111173737F, 0.5082398928281348F, 0.0F));
            partDefinition.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(56, 46).mirror(true).addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.5F, 0.1F, -0.5F, 0.0F, -0.27314402127920984F, 0.03490658503988659F));
            partDefinition.addOrReplaceChild("ToeRight", CubeListBuilder.create().texOffs(56, 46).mirror(true).addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.10471975511965977F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 21).addBox(-3.5F, 0.0F, -5.0F, 7.0F, 8.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -4.5F, -5.0F, 0.3127630032889644F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(42, 15).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-3.0F, 6.2F, -4.0F, -0.6646214111173737F, -0.5082398928281348F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(26, 30).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 3.0F, -0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(56, 12).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, 0.8F, 0.5F, -0.1757546503495068F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(56, 46).mirror(true).addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.5F, 0.1F, -0.5F, 0.0F, -0.27314402127920984F, 0.03490658503988659F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -5.0F, -5.5F, 9.0F, 10.0F, 11.0F), PartPose.offsetAndRotation(0.0F, 7.2F, 0.0F, 0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(30, 1).addBox(-2.0F, -2.0F, -2.5F, 3.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.5F, -6.0F, 1.5F, 0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperBeak", CubeListBuilder.create().texOffs(56, 1).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.6F, 0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(54, 43).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, 0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(48, 22).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(2.3F, 4.0F, 1.0F, 0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(56, 30).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.35185837453889574F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(48, 22).mirror(true).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-2.3F, 4.0F, 1.0F, 0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(55, 5).addBox(-1.5F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, -0.1F, -2.5F, 0.03490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(0, 47).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 4.0F, -0.35185837453889574F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(56, 46).mirror(true).addBox(-0.5F, 0.0F, -2.4F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, 0.1F, -0.5F, 0.0F, 0.27314402127920984F, -0.03490658503988659F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(56, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.35185837453889574F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(24, 37).addBox(-2.5F, -2.5F, -5.0F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 4.5F, -4.0F, -0.7037167490777915F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(26, 21).addBox(-3.0F, -2.5F, 0.0F, 6.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 4.4F, -0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(58, 9).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.11903145798206952F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(EmuEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.117F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.NeckBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.703F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.117F;
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
                this.NeckBase.xRot = Mth.cos(6.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.703F;
                this.Head.xRot = Mth.cos(5F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.117F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.6F) * 0.5F + 0.312F;
                this.Tail.xRot = Mth.cos(2.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.156F;
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.117F;
                this.Body.y = Mth.cos(2F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -8F) * 0.5F + 7.2F;
                this.Body.zRot = Mth.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;
                this.Body.yRot = Mth.cos(2F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -0.3F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.156F;
                this.ThighLeft.y = Mth.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 7F) * 0.5F + 4.0F;
                this.ThighLeft.z = Mth.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -8F) * 0.5F + 1.0F;
                this.LegLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F - 0.351F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.117F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.156F;
                this.ThighRight.y = Mth.cos(7.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -7F) * 0.5F + 4.0F;
                this.ThighRight.z = Mth.cos(3.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 8F) * 0.5F + 1.0F;
                this.LegRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.351F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.117F;


            } else {
                float speed = 1.5f;
                float degree = 1.0f;
                this.NeckBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.703F;
                this.Head.xRot = Mth.cos(2.2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.117F;
                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.312F;
                this.Tail.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F - 0.156F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.05F) * 0.5F + 0.117F;
                this.Body.y = Mth.cos(4.5F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree) * 0.5F + 7.2F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.156F;
                this.ThighLeft.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 4.0F;
                this.LegLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.351F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.117F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.156F;
                this.ThighRight.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 4.0F;
                this.LegRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.351F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.117F;
            }
        }
    }

    public static class Child extends EmuModel {
        public ModelPart Tail;
        public ModelPart NeckBase;
        public ModelPart WingLeft;
        public ModelPart Back1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart WingRight;
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart SnoutTop;
        public ModelPart Back2;
        public ModelPart LegTopLeft;
        public ModelPart LegBottomLeft;
        public ModelPart FootLeft;
        public ModelPart ToeLeft1;
        public ModelPart ToeLeft2;
        public ModelPart LegTopRight;
        public ModelPart LegBottomRight;
        public ModelPart FootRight;
        public ModelPart ToeRight1;
        public ModelPart ToeRight2;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Neck = this.NeckBase.getChild("Neck");
            this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Back1 = this.Body.getChild("Back1");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.Tail = this.Body.getChild("Tail");
            this.WingRight = this.Body.getChild("WingRight");
            this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");
            this.Head = this.Neck.getChild("Head");
            this.NeckBase = this.Body.getChild("NeckBase");
            this.FootRight = this.LegBottomRight.getChild("FootRight");
            this.ToeRight2 = this.FootRight.getChild("ToeRight2");
            this.ToeRight1 = this.FootRight.getChild("ToeRight1");
            this.LegTopLeft = this.ThighLeft.getChild("LegTopLeft");
            this.LegBottomLeft = this.LegTopLeft.getChild("LegBottomLeft");
            this.FootLeft = this.LegBottomLeft.getChild("FootLeft");
            this.Mouth = this.Head.getChild("Mouth");
            this.LegTopRight = this.ThighRight.getChild("LegTopRight");
            this.LegBottomRight = this.LegTopRight.getChild("LegBottomRight");
            this.Snout = this.Head.getChild("Snout");
            this.SnoutTop = this.Snout.getChild("SnoutTop");
            this.WingLeft = this.Body.getChild("WingLeft");
            this.Back2 = this.Back1.getChild("Back2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(17, 13).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -1.5F, 0.4742059590984399F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(14, 5).mirror(true).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.45535640450848164F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 14).mirror(true).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.6F, 0.8F, 0.5F, 0.27314402127920984F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Back1", CubeListBuilder.create().texOffs(21, 10).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, -2.1F, 0.3F, 0.27960175415897487F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.6F, 0.8F, 0.5F, 0.27314402127920984F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(20, 25).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 3.0F, -0.6181955890984584F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -0.5F, -1.5F, 1.0F, 3.0F, 4.0F), PartPose.offset(-1.5F, -1.5F, 0.0F));
            partDefinition.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(14, 5).mirror(true).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.45535640450848164F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(20, 3).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -4.8F, 0.8F, -0.11082840583716425F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(15, 19).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.18099064143444116F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.3F, -0.5F, 0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ToeRight2", CubeListBuilder.create().texOffs(14, 5).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.45535640450848164F, 0.0F));
            partDefinition.addOrReplaceChild("ToeRight1", CubeListBuilder.create().texOffs(14, 5).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.45535640450848164F, 0.0F));
            partDefinition.addOrReplaceChild("LegTopLeft", CubeListBuilder.create().texOffs(13, 11).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-0.5F, 1.5F, 1.0F));
            partDefinition.addOrReplaceChild("LegBottomLeft", CubeListBuilder.create().texOffs(13, 14).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.0F, -0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 8).mirror(true).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.3F, -0.5F, 0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(5, 3).addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -1.0F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegTopRight", CubeListBuilder.create().texOffs(13, 11).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.5F, 1.5F, 1.0F));
            partDefinition.addOrReplaceChild("LegBottomRight", CubeListBuilder.create().texOffs(13, 14).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.0F, -0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(2, 0).addBox(-0.5F, -0.5F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.0F, 0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("SnoutTop", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.27314402127920984F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 16.8F, 0.0F, -0.13665927909957545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(0, 7).mirror(true).addBox(0.0F, -0.5F, -1.5F, 1.0F, 3.0F, 4.0F), PartPose.offset(1.5F, -1.5F, 0.0F));
            partDefinition.addOrReplaceChild("Back2", CubeListBuilder.create().texOffs(20, 9).addBox(-1.5F, -0.9F, -0.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 0.0F, -0.500909508638178F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(EmuEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.110F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.NeckBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.180F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.110F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;

            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.NeckBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.180F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.110F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.136F;
                this.Body.y = Mth.cos(4.5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree) * 0.5F + 16.8F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.273F;
                this.ThighLeft.y = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.8F;
                this.LegTopLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.045F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.273F;
                this.ThighRight.y = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.8F;
                this.LegTopRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.045F;
            }
        }
    }
}
