package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TamarinEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class TamarinModel extends ZawaBaseModel<TamarinEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends TamarinModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;
        public ModelPart Tail6;
        public ModelPart HeadFur;
        public ModelPart shape14;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Hair;
        public ModelPart LionLeft;
        public ModelPart LionRight;
        public ModelPart Hair2;
        public ModelPart Snout;
        public ModelPart CottonTopLeft;
        public ModelPart CottonTopRight;
        public ModelPart CottonTopMiddle;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart LeftMoustache1;
        public ModelPart RightMoustache1;
        public ModelPart LeftMoustache2;
        public ModelPart RightMoustache2;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart Hand2Left;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart Hand2Right;


        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.LionRight = this.HeadFur.getChild("LionRight");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Hand2Right = this.HandRight.getChild("Hand2Right");
            this.CottonTopLeft = this.Head.getChild("CottonTopLeft");
            this.ArmRight = this.Chest.getChild("ArmRight");
            this.Tail1 = this.Body.getChild("Tail1");
            this.LeftMoustache2 = this.LeftMoustache1.getChild("LeftMoustache2");
            this.Hand2Left = this.HandLeft.getChild("Hand2Left");
            this.Snout = this.Head.getChild("Snout");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.RightMoustache1 = this.Snout.getChild("RightMoustache1");
            this.LeftMoustache1 = this.Snout.getChild("LeftMoustache1");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.RightMoustache2 = this.RightMoustache1.getChild("RightMoustache2");
            this.CottonTopRight = this.Head.getChild("CottonTopRight");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Hair = this.HeadFur.getChild("Hair");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.Tail6 = this.Tail5.getChild("Tail6");
            this.Neck = this.Chest.getChild("Neck");
            this.LionLeft = this.HeadFur.getChild("LionLeft");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Tail5 = this.Tail4.getChild("Tail5");
            this.shape14 = this.Neck.getChild("shape14");
            this.HeadFur = this.Neck.getChild("HeadFur");
            this.Hair2 = this.HeadFur.getChild("Hair2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Body = this.Chest.getChild("Body");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.Nose = this.Snout.getChild("Nose");
            this.Mouth = this.Snout.getChild("Mouth");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.EarLeft = this.HeadFur.getChild("EarLeft");
            this.Head = this.HeadFur.getChild("Head");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.EarRight = this.HeadFur.getChild("EarRight");
            this.CottonTopMiddle = this.Head.getChild("CottonTopMiddle");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 7).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.8F, 0.2F, -1.5F, 0.13665927909957545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(56, 7).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 3.5F, -0.8F, 0.591841146688116F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LionRight", CubeListBuilder.create().texOffs(64, 0).addBox(-1.5F, -2.5F, -2.0F, 3.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(-1.3F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0781907508222411F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(52, 0).mirror(true).addBox(-2.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.5F, 1.5F, 2.0F, -0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hand2Right", CubeListBuilder.create().texOffs(46, 20).addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 0.51F, 0.0F, 0.0F, -0.27314402127920984F, 0.0F));
            partDefinition.addOrReplaceChild("CottonTopLeft", CubeListBuilder.create().texOffs(66, 10).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.6F, -1.5F, 2.0F, 0.0F, -0.3909537457888271F, 0.23457224414434488F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 7).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.8F, 0.2F, -1.5F, 0.13665927909957545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 2).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 19.0F, 0.0F, 0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, -0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftMoustache2", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(0.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.5F, 0.0F, 0.01F, 0.0F, 0.0F, 0.7740534966278743F));
            partDefinition.addOrReplaceChild("Hand2Left", CubeListBuilder.create().texOffs(46, 20).mirror(true).addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 0.51F, 0.0F, 0.0F, 0.27314402127920984F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(21, 12).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -0.6F, 0.3642502295386026F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.5F, 1.5F, 2.0F, -0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(56, 7).mirror(true).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 3.5F, -0.8F, 0.591841146688116F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightMoustache1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.5F, -0.3F, -0.18203784630933073F, -0.0911061832922575F, -0.9105382388075086F));
            partDefinition.addOrReplaceChild("LeftMoustache1", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.5F, -0.3F, -0.18203784630933073F, 0.0911061832922575F, 0.9105382388075086F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(46, 16).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 1.6F, -0.5F, 0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightMoustache2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.01F, 0.0F, 0.0F, -0.7740534966278743F));
            partDefinition.addOrReplaceChild("CottonTopRight", CubeListBuilder.create().texOffs(66, 10).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, -1.5F, 2.0F, 0.0F, 0.3909537457888271F, -0.23457224414434488F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(30, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(34, 16).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -1.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(46, 16).mirror(true).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 1.6F, -0.5F, 0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(50, 26).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(23, 21).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.8F, -2.0F, -0.6373942508178124F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LionLeft", CubeListBuilder.create().texOffs(64, 0).mirror(true).addBox(-1.5F, -2.5F, -2.0F, 3.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(1.3F, 0.0F, -0.1F, 0.0F, 0.0F, -0.0781907508222411F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 12).addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.5F, -0.4098033003787853F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(40, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("shape14", CubeListBuilder.create().texOffs(56, 19).addBox(-2.0F, -0.7F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HeadFur", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.0F, 0.6829473549475088F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hair2", CubeListBuilder.create().texOffs(34, 20).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(20, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -0.6F, 0.0F, 6.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.5F, -0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(46, 12).addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.6373942508178124F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(26, 15).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 0.1F, -0.27314402127920984F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(48, 0).mirror(true).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.7F, -0.8F, 0.0F, -0.3642502295386026F, 0.27314402127920984F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(30, 8).addBox(-1.5F, -1.5F, -0.9F, 3.0F, 3.0F, 4.0F), PartPose.offset(0.0F, 0.0F, -1.5F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(54, 12).mirror(true).addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 2.0F, 0.5F, -0.4098033003787853F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -0.7F, -0.8F, 0.0F, 0.3642502295386026F, -0.27314402127920984F));
            partDefinition.addOrReplaceChild("CottonTopMiddle", CubeListBuilder.create().texOffs(68, 16).addBox(-1.0F, -2.6F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.02F, 0.0F, 0.2738421523142173F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(46, 12).mirror(true).addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 2.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 80, 32);
        }

        @Override
        public void setupAnim(TamarinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            if (this.isHeld) {
                this.Tail3.xRot = 0.0F;
            }
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -0.546F);
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isHeld ? 0.0F : 0.091F);
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.7f;
                float degree = 0.7f;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.091F;
                this.LegLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.091F;
                this.LegRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F + 0.045F;
                this.Body.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F - 0.091F;
                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + -0.15F + 19.0F;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.63F;
                this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F;

                this.Tail1.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.546F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.136F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.182F;
                this.ArmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.136F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.182F;

            } else {
                float speed = 1.25f;
                float degree = 0.6f;
                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.136F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.182F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.136F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.182F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.409F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.409F;

                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.045F);
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.091F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.63F;

                this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.546F);
                this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.091F);
            }
        }
    }

    public static class Child extends TamarinModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmLeft;
        public ModelPart ArmRight;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;
        public ModelPart Tail6;
        public ModelPart HeadFur;
        public ModelPart shape14;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Hair;
        public ModelPart LionLeft;
        public ModelPart LionRight;
        public ModelPart Hair2;
        public ModelPart Snout;
        public ModelPart CottonTopLeft;
        public ModelPart CottonTopRight;
        public ModelPart CottonTopMiddle;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart LeftMoustache1;
        public ModelPart RightMoustache1;
        public ModelPart LeftMoustache2;
        public ModelPart RightMoustache2;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart Hand2Left;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart Hand2Right;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.LionRight = this.HeadFur.getChild("LionRight");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Hand2Right = this.HandRight.getChild("Hand2Right");
            this.CottonTopLeft = this.Head.getChild("CottonTopLeft");
            this.ArmRight = this.Chest.getChild("ArmRight");
            this.Tail1 = this.Body.getChild("Tail1");
            this.LeftMoustache2 = this.LeftMoustache1.getChild("LeftMoustache2");
            this.Hand2Left = this.HandLeft.getChild("Hand2Left");
            this.Snout = this.Head.getChild("Snout");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.RightMoustache1 = this.Snout.getChild("RightMoustache1");
            this.LeftMoustache1 = this.Snout.getChild("LeftMoustache1");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.RightMoustache2 = this.RightMoustache1.getChild("RightMoustache2");
            this.CottonTopRight = this.Head.getChild("CottonTopRight");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Hair = this.HeadFur.getChild("Hair");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.Tail6 = this.Tail5.getChild("Tail6");
            this.Neck = this.Chest.getChild("Neck");
            this.LionLeft = this.HeadFur.getChild("LionLeft");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Tail5 = this.Tail4.getChild("Tail5");
            this.shape14 = this.Neck.getChild("shape14");
            this.HeadFur = this.Neck.getChild("HeadFur");
            this.Hair2 = this.HeadFur.getChild("Hair2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Body = this.Chest.getChild("Body");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.Nose = this.Snout.getChild("Nose");
            this.Mouth = this.Snout.getChild("Mouth");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.EarLeft = this.HeadFur.getChild("EarLeft");
            this.Head = this.HeadFur.getChild("Head");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.EarRight = this.HeadFur.getChild("EarRight");
            this.CottonTopMiddle = this.Head.getChild("CottonTopMiddle");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 7).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.8F, 0.2F, -1.5F, 0.13665927909957545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(56, 7).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 3.5F, -0.8F, 0.591841146688116F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LionRight", CubeListBuilder.create().texOffs(64, 0).addBox(-1.5F, -2.5F, -2.0F, 3.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(-1.3F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0781907508222411F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(52, 0).mirror(true).addBox(-2.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(2.5F, 1.5F, 2.0F, -0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hand2Right", CubeListBuilder.create().texOffs(46, 20).addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 0.51F, 0.0F, 0.0F, -0.27314402127920984F, 0.0F));
            partDefinition.addOrReplaceChild("CottonTopLeft", CubeListBuilder.create().texOffs(66, 10).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.6F, -1.5F, 2.0F, 0.0F, -0.3909537457888271F, 0.23457224414434488F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 7).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.8F, 0.2F, -1.5F, 0.13665927909957545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 2).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 19.0F, 0.0F, 0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 3.5F, -0.5462880425584197F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftMoustache2", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(0.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.5F, 0.0F, 0.01F, 0.0F, 0.0F, 0.7740534966278743F));
            partDefinition.addOrReplaceChild("Hand2Left", CubeListBuilder.create().texOffs(46, 20).mirror(true).addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 0.51F, 0.0F, 0.0F, 0.27314402127920984F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(21, 12).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -0.6F, 0.3642502295386026F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -0.5F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-2.5F, 1.5F, 2.0F, -0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(56, 7).mirror(true).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 3.5F, -0.8F, 0.591841146688116F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightMoustache1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.5F, -0.3F, -0.18203784630933073F, -0.0911061832922575F, -0.9105382388075086F));
            partDefinition.addOrReplaceChild("LeftMoustache1", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.5F, -0.3F, -0.18203784630933073F, 0.0911061832922575F, 0.9105382388075086F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(46, 16).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 1.6F, -0.5F, 0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightMoustache2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.7F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.01F, 0.0F, 0.0F, -0.7740534966278743F));
            partDefinition.addOrReplaceChild("CottonTopRight", CubeListBuilder.create().texOffs(66, 10).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, -1.5F, 2.0F, 0.0F, 0.3909537457888271F, -0.23457224414434488F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(30, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(34, 16).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -1.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(46, 16).mirror(true).addBox(-1.0F, 0.0F, -2.2F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 1.6F, -0.5F, 0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(50, 26).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(23, 21).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.8F, -2.0F, -0.6373942508178124F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LionLeft", CubeListBuilder.create().texOffs(64, 0).mirror(true).addBox(-1.5F, -2.5F, -2.0F, 3.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(1.3F, 0.0F, -0.1F, 0.0F, 0.0F, -0.0781907508222411F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 12).addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.5F, -0.4098033003787853F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(40, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("shape14", CubeListBuilder.create().texOffs(56, 19).addBox(-2.0F, -0.7F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HeadFur", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.0F, 0.6829473549475088F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hair2", CubeListBuilder.create().texOffs(34, 20).addBox(-1.0F, -0.5F, -0.7F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(20, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -0.6F, 0.0F, 6.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.5F, -0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(46, 12).addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 2.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.6373942508178124F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(26, 15).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 0.1F, -0.27314402127920984F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(10, 27).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(48, 0).mirror(true).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.7F, -0.8F, 0.0F, -0.3642502295386026F, 0.27314402127920984F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(30, 8).addBox(-1.5F, -1.5F, -0.9F, 3.0F, 3.0F, 4.0F), PartPose.offset(0.0F, 0.0F, -1.5F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(54, 12).mirror(true).addBox(-1.0F, -0.2F, -2.4F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 2.0F, 0.5F, -0.4098033003787853F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -0.7F, -0.8F, 0.0F, 0.3642502295386026F, -0.27314402127920984F));
            partDefinition.addOrReplaceChild("CottonTopMiddle", CubeListBuilder.create().texOffs(68, 16).addBox(-1.0F, -2.6F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.02F, 0.0F, 0.2738421523142173F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(46, 12).mirror(true).addBox(-1.0F, 0.2F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.01F, 2.6F, 0.0F, -0.3642502295386026F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 80, 32);
        }

        @Override
        public void setupAnim(TamarinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            if (this.isHeld) {
                this.Tail3.xRot = 0.0F;
            }
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -0.546F);
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isHeld ? 0.0F : 0.091F);
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.7f;
                float degree = 0.4f;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.091F;
                this.LegLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.091F;
                this.LegRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F;

                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F + 0.045F;
                this.Body.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F - 0.091F;
                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + -0.15F + 19.0F;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F;
                this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F;

                this.Tail1.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.546F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.136F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.182F;
                this.ArmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.136F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.182F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 0.136F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.182F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F + 0.136F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.182F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.409F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F;
                this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.591F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.409F;

                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.045F);
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.091F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F;

                this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.546F);
                this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.091F);
            }
        }
    }
}