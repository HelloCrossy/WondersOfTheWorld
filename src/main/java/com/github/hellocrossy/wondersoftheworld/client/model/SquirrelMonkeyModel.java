package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SquirrelMonkeyEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SquirrelMonkeyModel extends ZawaBaseModel<SquirrelMonkeyEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends SquirrelMonkeyModel {

        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart Body;
        public ModelPart Belly;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart FingerLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart FingerRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart TopHead;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart Mouth1;
        public ModelPart Mouth2;
        public ModelPart EarLeft_1;
        public ModelPart EarRight_1;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;
        public ModelPart Tail6;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;


        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.FingerRight = this.HandRight.getChild("FingerRight");
            this.Head = this.Neck.getChild("Head");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Neck = this.Chest.getChild("Neck");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.Body = this.Chest.getChild("Body");
            this.Belly = this.Chest.getChild("Belly");
            this.Mouth2 = this.Mouth1.getChild("Mouth2");
            this.EarLeft_1 = this.EarLeft.getChild("EarLeft_1");
            this.Mouth1 = this.Snout.getChild("Mouth1");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.FingerLeft = this.HandLeft.getChild("FingerLeft");
            this.Snout = this.Head.getChild("Snout");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Tail5 = this.Tail4.getChild("Tail5");
            this.Tail6 = this.Tail5.getChild("Tail6");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.EarRight_1 = this.EarRight.getChild("EarRight_1");
            this.Tail1 = this.Body.getChild("Tail1");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.TopHead = this.Head.getChild("TopHead");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("FingerRight", CubeListBuilder.create().texOffs(55, 24).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.1F, -1.0F, 0.0F, -0.5864306020384839F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 52).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.42F, -1.9F, 0.5661847853785107F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(34, 18).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.3466224000987182F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(48, 24).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.3F, -0.4F, 0.090999998066169F, 0.04555309164612875F, 0.0911061832922575F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(3, 35).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.2F, -1.2F, -0.6173229377882667F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(48, 49).addBox(-1.5F, -0.5F, -4.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.3F, 2.0F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(34, 12).addBox(-1.02F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.38571777134864954F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(49, 33).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(1.6F, 3.1F, 3.9F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(50, 10).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, -1.2F, -1.4F, 0.1399754139994285F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(2, 15).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 3.6F, -0.17802358037447025F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(3, 41).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 2.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 3.1F, -0.06457718315602803F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth2", CubeListBuilder.create().texOffs(16, 56).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, -0.7F));
            partDefinition.addOrReplaceChild("EarLeft_1", CubeListBuilder.create().texOffs(26, 58).addBox(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.35185837453889574F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth1", CubeListBuilder.create().texOffs(16, 56).addBox(-0.8F, 0.0F, -0.7F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.6F, -0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(49, 33).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(-1.6F, 3.1F, 3.9F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(51, 42).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(26, 57).mirror(true).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, 0.2F, -1.1F, 0.46896998465826234F, -0.5473352640780661F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(52, 17).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.9F, 1.0F, -0.40997783729872633F, 0.0F, 0.0911061832922575F));
            partDefinition.addOrReplaceChild("FingerLeft", CubeListBuilder.create().texOffs(55, 24).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.1F, -1.0F, 0.0F, 0.5864306020384839F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(16, 53).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -2.2F, 0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(50, 10).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(1.9F, -1.2F, -1.4F, 0.1399754139994285F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(2, 2).addBox(-2.0F, -4.0F, -2.4F, 4.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 17.3F, -4.1F, 0.17802358037447025F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(35, 24).addBox(-1.02F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.4635594400086301F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(35, 29).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.42446406875869874F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(51, 42).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(52, 17).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.9F, 1.0F, -0.40997783729872633F, 0.0F, -0.0911061832922575F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(34, 6).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 4.0F, 0.22095868063932103F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight_1", CubeListBuilder.create().texOffs(26, 58).mirror(true).addBox(-0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -0.35185837453889574F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(34, 0).addBox(-1.02F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.9456193940568499F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(26, 57).addBox(-0.6F, -1.0F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.5F, 0.2F, -1.1F, 0.46914448828868976F, 0.5473352640780661F, 0.0F));
            partDefinition.addOrReplaceChild("TopHead", CubeListBuilder.create().texOffs(26, 54).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.0F, -0.7F, -1.2F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(17, 50).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.44191736127864206F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(48, 49).mirror(true).addBox(-1.5F, -0.5F, -4.0F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.3F, 2.0F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(48, 24).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.3F, -0.4F, 0.090999998066169F, -0.04555309164612875F, -0.0911061832922575F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(SquirrelMonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isHeld ? -1.2F : -0.945F);
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isHeld ? 0.0F : 0.22F);
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.617F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

            if (entity.isSprinting()) {
                float speed = 1.5f;
                float degree = 0.4f;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.174F;
                this.LegLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.349F;
                this.FootLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.174F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.5F * limbSwingAmount * 0.5F - 0.174F;
                this.LegRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.349F;
                this.FootRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.0F * limbSwingAmount * 0.5F - 0.174F;

                this.Chest.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.7F * limbSwingAmount * 0.5F + 0.178F;
                this.Body.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -0.8F * limbSwingAmount * 0.5F - 0.178F;
                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F + 17.3F;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.617F;
                this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 0.4F * limbSwingAmount * 0.5F + 0.566F;

                this.Tail1.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F - 0.945F;

                this.ArmBaseLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -4.0F * limbSwingAmount * 0.5F + 0.139F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.409F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -5.0F * limbSwingAmount * 0.5F + 0.091F;
                this.ArmBaseRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 4.0F * limbSwingAmount * 0.5F + 0.139F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.409F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 5.0F * limbSwingAmount * 0.5F + 0.091F;

            } else {
                float speed = 0.9f;
                float degree = 0.6f;
                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.139F;
                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.409F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.091F;
                this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.139F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.409F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.091F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.174F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.349F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.174F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.174F;
                this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.349F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.174F;

                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : 0.178F);
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.178F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.617F;

                this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -0.945F);
                this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.221F);
                this.Tail3.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.385F);
                this.Tail4.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.346F);
            }
        }
    }

    public static class Child extends SquirrelMonkeyModel {
        public ModelPart Neck;
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Head;
        public ModelPart ManeTop;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout1;
        public ModelPart Mouth;
        public ModelPart TopSnout;
        public ModelPart Snout2;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart Tail5;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Mouth = this.Snout1.getChild("Mouth");
            this.Tail1 = this.Body.getChild("Tail1");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Head = this.Neck.getChild("Head");
            this.TopSnout = this.Snout1.getChild("TopSnout");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.Body = this.Chest.getChild("Body");
            this.Snout2 = this.Snout1.getChild("Snout2");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ManeTop = this.Head.getChild("ManeTop");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.Snout1 = this.Head.getChild("Snout1");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.Tail5 = this.Tail4.getChild("Tail5");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(36, 4).addBox(-0.52F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 3.0F, 0.3642502295386026F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(36, 7).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.37245326503875104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(52, 26).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 0.4F, 0.1F, 1.6006414410250331F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -1.0152579939271684F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(21, 9).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.8F, -1.3F, 0.4559999906754129F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(8, 10).addBox(-1.02F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.4F, -1.2F, 0.13799999761610543F, 0.0F, -0.12217304763960307F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(8, 10).mirror(true).addBox(-0.98F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.4F, -1.2F, 0.13799999761610543F, 0.0F, 0.12217304763960307F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(34, 20).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -2.6F, 0.42202061845855104F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(52, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 0.0F, -1.0F, 0.4115486362886824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(43, 21).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -0.5F, -0.6F, 0.299847570818948F, 0.43319071501867035F, 0.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(21, 9).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.8F, -1.3F, 0.4559999906754129F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(18, 2).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.7F, 1.8F, 2.5F, -0.11397000381707621F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(18, 2).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.7F, 1.8F, 2.5F, -0.11397000381707621F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(20, 14).addBox(-0.92F, 0.0F, -1.8F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 2.3F, 0.7F, -0.3910000182127672F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(2, 17).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.5F, -0.5473352640780661F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 24).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.0F, -0.16699999096381887F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout2", CubeListBuilder.create().texOffs(52, 23).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.6F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(8, 5).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.12F, 2.9F, 1.0F, -0.2910000170454868F, 0.0F, -0.12217304763960307F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(8, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, -0.1F, -0.8F, -0.05794493000107876F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(36, 10).addBox(-0.52F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.5288347500384765F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 14).mirror(true).addBox(-1.08F, 0.0F, -1.8F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.1F, 2.3F, 0.7F, -0.3910000182127672F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ManeTop", CubeListBuilder.create().texOffs(35, 17).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.0F, -1.8F, 0.8F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 18.1F, -1.6F, 0.20804324816930464F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(8, 5).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.12F, 2.9F, 1.0F, -0.2910000170454868F, 0.0F, 0.12217304763960307F));
            partDefinition.addOrReplaceChild("Snout1", CubeListBuilder.create().texOffs(52, 23).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, 0.2F, -1.6F, 0.2361430431343009F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(8, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.5F, -0.1F, -0.8F, -0.05794493000107876F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(43, 21).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -0.5F, -0.6F, 0.299847570818948F, -0.43319071501867035F, 0.0F));
            partDefinition.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(37, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.4115486362886824F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(SquirrelMonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F - 1.015F;
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.364F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + 3.1415927F) * degree * 0.2F * limbSwingAmount * 0.5F - 0.547F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.058F;
                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.291F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F + 0.138F;
                this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.058F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.291F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.138F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.114F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.456F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 1.5F * limbSwingAmount * 0.5F - 0.391F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.114F;
                this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.456F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.3F + 3.1415927F) * degree * -1.5F * limbSwingAmount * 0.5F - 0.391F;

                this.Chest.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.15F * limbSwingAmount * 0.5F + (this.isSwimming ? -0.2F : +0.208F);
                this.Body.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * -0.17F * limbSwingAmount * 0.5F - 0.167F;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.0F + 3.1415927F) * degree * 0.0F * limbSwingAmount * 0.5F - 0.547F;


                this.Tail1.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.3F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : -1.015F);
                this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F + 3.1415927F) * degree * 0.1F * limbSwingAmount * 0.5F + (this.isSwimming ? 0.2F : 0.364F);
            }
        }
    }
}
