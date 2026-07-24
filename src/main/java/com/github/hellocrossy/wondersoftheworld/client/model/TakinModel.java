package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TakinEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class TakinModel extends ZawaBaseModel<TakinEntity> {

    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends TakinModel {
        public ModelPart Neck1;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Body;
        public ModelPart Neck2Right;
        public ModelPart Neck2Left;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Horn1Right;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Horn1Left;
        public ModelPart BeardMishmi;
        public ModelPart Mouth;
        public ModelPart TopSnout1;
        public ModelPart BeardBhutan;
        public ModelPart TopSnout2;
        public ModelPart Horn2Right;
        public ModelPart Horn3Right;
        public ModelPart Horn4Right;
        public ModelPart Horn2Left;
        public ModelPart Horn3Left;
        public ModelPart Horn4Left;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.Neck1 = this.Chest.getChild("Neck1");
            this.Neck2Left = this.Neck1.getChild("Neck2Left");
            this.NeckLower = this.Neck2Left.getChild("NeckLower");

            this.Head = this.Neck2Left.getChild("Head");
            this.EarRight = this.Head.getChild("EarRight");

            this.Horn1Left = this.Head.getChild("Horn1Left");
            this.Horn2Left = this.Horn1Left.getChild("Horn2Left");
            this.Horn3Left = this.Horn2Left.getChild("Horn3Left");

            this.Horn4Left = this.Horn2Left.getChild("Horn4Left");

            this.Horn1Right = this.Head.getChild("Horn1Right");
            this.Horn2Right = this.Horn1Right.getChild("Horn2Right");
            this.Horn4Right = this.Horn2Right.getChild("Horn4Right");
            this.Horn3Right = this.Horn2Right.getChild("Horn3Right");

            this.Snout = this.Head.getChild("Snout");
            this.TopSnout1 = this.Snout.getChild("TopSnout1");
            this.TopSnout2 = this.TopSnout1.getChild("TopSnout2");

            this.Mouth = this.Snout.getChild("Mouth");

            this.BeardMishmi = this.Snout.getChild("BeardMishmi");

            this.BeardBhutan = this.Snout.getChild("BeardBhutan");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Neck2Right = this.Neck1.getChild("Neck2Right");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.Tail = this.Hips.getChild("Tail");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -6.5F, -3.5F, 9.0F, 13.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 6.5F, -6.0F, -0.26100000670844853F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F), PartPose.offsetAndRotation(-3.1F, 0.6F, -0.4F, 0.3829252472086197F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(32, 14).mirror(true).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 8.0F, 1.5F, -0.10402162408465232F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(32, 23).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.0F, 4.0F, -2.5F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(27, 79).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.04F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.7F, 0.42F));

            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 62).addBox(-3.5F, 0.0F, -5.0F, 7.0F, 11.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -6.3F, -3.5F, 0.3797588152515427F, 0.0F, 0.0F));
            PartDefinition Neck2Left = Neck1.addOrReplaceChild("Neck2Left", CubeListBuilder.create().texOffs(0, 78).addBox(-0.1F, 0.0F, -7.0F, 2.0F, 6.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.21781708265940905F, 0.017453292519943295F, 0.0F));
            PartDefinition NeckLower = Neck2Left.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(0, 101).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 1.9F, -6.0F, -0.2871066752688726F, 0.0F, 0.0F));

            PartDefinition Head = Neck2Left.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 91).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -7.0F, -0.12200000042539677F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(21, 118).mirror(true).addBox(-0.3F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, -1.2F, 1.0F, 0.4300491170387584F, -0.8384561886370425F, 0.0F));

            PartDefinition Horn1Left = Head.addOrReplaceChild("Horn1Left", CubeListBuilder.create().texOffs(20, 109).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.37F, -3.2F, -0.3F, 0.5410520348287285F, 0.19198621771937624F, 0.3141592653589793F));
            PartDefinition Horn2Left = Horn1Left.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(21, 111).addBox(-0.3F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.00999999F, 0.00999999F, 0.00999999F)), PartPose.offsetAndRotation(1.0F, -0.3F, 0.0F, 0.0F, -0.4363323129985824F, 0.0F));
            PartDefinition Horn3Left = Horn2Left.addOrReplaceChild("Horn3Left", CubeListBuilder.create().texOffs(34, 108).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offset(0.7F, -0.5F, -0.5F));
            PartDefinition Horn4Left = Horn2Left.addOrReplaceChild("Horn4Left", CubeListBuilder.create().texOffs(44, 109).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offset(0.7F, -0.5F, -0.5F));

            PartDefinition Horn1Right = Head.addOrReplaceChild("Horn1Right", CubeListBuilder.create().texOffs(20, 109).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.37F, -3.2F, -0.3F, 0.5410520348287285F, -0.19198621771937624F, -0.3141592653589793F));
            PartDefinition Horn2Right = Horn1Right.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(21, 111).mirror(true).addBox(-1.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.00999999F, 0.00999999F, 0.00999999F)), PartPose.offsetAndRotation(-1.0F, -0.3F, 0.0F, 0.0F, 0.4363323129985824F, 0.0F));
            PartDefinition Horn4Right = Horn2Right.addOrReplaceChild("Horn4Right", CubeListBuilder.create().texOffs(44, 109).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offset(-0.7F, -0.5F, -0.5F));
            PartDefinition Horn3Right = Horn2Right.addOrReplaceChild("Horn3Right", CubeListBuilder.create().texOffs(34, 108).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offset(-0.7F, -0.5F, -0.5F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 113).addBox(-1.5F, 0.0F, -3.3F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.20000005F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -2.4F, 0.2792526803190927F, 0.0F, 0.0F));
            PartDefinition TopSnout1 = Snout.addOrReplaceChild("TopSnout1", CubeListBuilder.create().texOffs(0, 120).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.9F, 1.3F, 0.2792526803190927F, 0.0F, 0.0F));
            PartDefinition TopSnout2 = TopSnout1.addOrReplaceChild("TopSnout2", CubeListBuilder.create().texOffs(12, 120).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.00999999F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.6981317007977318F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(11, 113).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 0.0F, 0.05235987755982988F, 0.0F, 0.0F));

            PartDefinition BeardMishmi = Snout.addOrReplaceChild("BeardMishmi", CubeListBuilder.create().texOffs(30, 86).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.100000024F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 0.7F, 0.12217304763960307F, 0.0F, 0.0F));

            PartDefinition BeardBhutan = Snout.addOrReplaceChild("BeardBhutan", CubeListBuilder.create().texOffs(39, 97).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.100000024F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.7F, 0.12217304763960307F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(21, 118).addBox(-0.7F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.5F, -1.2F, 1.0F, 0.4300491170387584F, 0.8384561886370425F, 0.0F));

            PartDefinition Neck2Right = Neck1.addOrReplaceChild("Neck2Right", CubeListBuilder.create().texOffs(0, 78).mirror(true).addBox(-1.9F, 0.0F, -7.0F, 2.0F, 6.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.21781708265940905F, -0.017453292519943295F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F), PartPose.offsetAndRotation(3.1F, 0.6F, -0.4F, 0.3829252472086197F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(32, 14).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 8.0F, 1.5F, -0.10402162408465232F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(32, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.0F, 4.0F, -2.5F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(27, 79).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.04F, 0.0F, 0.0F)), PartPose.offset(0.0F, 2.7F, 0.42F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 20).addBox(-5.0F, -2.0F, 0.0F, 10.0F, 13.0F, 12.0F), PartPose.offsetAndRotation(0.0F, -4.8F, 1.3F, 0.17399999337579447F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 45).addBox(-4.5F, 0.0F, 0.0F, 9.0F, 11.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 12.0F, -0.43000001500616014F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(30, 45).mirror(true).addBox(-2.0F, -1.0F, -3.5F, 4.0F, 9.0F, 7.0F), PartPose.offsetAndRotation(-3.2F, 4.1F, 2.7F, 0.42498767951852195F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(27, 61).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 8.0F, -2.0F, 0.6549999427311355F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(27, 71).mirror(true).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 3.0F, -0.5580000258213429F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(27, 79).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.04F, 0.0F, 0.0F)), PartPose.offset(0.0F, 3.6F, -1.42F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(11, 78).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.3F, 6.0F, 0.47333330778824817F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(30, 45).addBox(-2.0F, -1.0F, -3.5F, 4.0F, 9.0F, 7.0F), PartPose.offsetAndRotation(3.2F, 4.1F, 2.7F, 0.42498767951852195F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(27, 61).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 8.0F, -2.0F, 0.6550220469681831F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(27, 71).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 3.0F, -0.5580000258213429F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(27, 79).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.04F, 0.0F, 0.0F)), PartPose.offset(0.0F, 3.6F, -1.42F));

            return LayerDefinition.create(meshDefinition, 128, 128);
        }

        @Override
        public void setupAnim(TakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.122F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.379F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.122F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.75f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.2F + 0.379F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.122F;

            this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 6.5F;
            this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.261F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.174F;
            this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.430F;

            this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.383F;
            this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.104F;
            this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.383F;
            this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.104F;
            this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

            this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.425F;
            this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.655F;
            this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.558F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.425F;
            this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.655F;
            this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.558F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
        }
    }

    public static class Child extends TakinModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart part10;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

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
            this.part10 = this.Hips.getChild("part10");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");

            this.EarLeft = this.Head.getChild("EarLeft");
            this.EarRight = this.Head.getChild("EarRight");
            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(46, 0).addBox(-2.5F, -3.5F, -1.5F, 5.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 13.1F, -6.0F, -0.27611108233918075F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(29, 25).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(1.6F, 0.5F, 0.1F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(24, 23).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.8F, 1.5F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(16, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offset(-0.01F, 3.0F, -2.5F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(21, 28).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.5F, 1.3F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(29, 25).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-1.6F, 0.5F, 0.1F, 0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(24, 23).mirror(true).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.8F, 1.5F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(16, 23).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offset(-0.01F, 3.0F, -2.5F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(21, 28).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 2.5F, 1.3F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(38, 11).addBox(-3.0F, 0.0F, -1.0F, 6.0F, 7.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -3.5F, 1.3F, 0.3148574130387436F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(26, 0).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 5.5F, -0.35482543559886665F, 0.0F, 0.0F));
            PartDefinition part10 = Hips.addOrReplaceChild("part10", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, -1.222428624075795F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 9).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-1.9F, 0.5F, 2.5F, 0.3406882779787764F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 19).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, 0.6632251157578453F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(10, 19).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 4.0F, 1.9F, -0.767944870877505F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(21, 28).addBox(-1.0F, -0.5F, -1.7F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.7F, -0.7F, 0.0607374583022978F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(1.9F, 0.5F, 2.5F, 0.3406882779787764F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, 0.6632251157578453F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(10, 19).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 4.0F, 1.9F, -0.767944870877505F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(21, 28).mirror(true).addBox(-1.0F, -0.5F, -1.7F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.7F, -0.7F, 0.0607374583022978F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(10, 0).addBox(-1.5F, -0.3F, -4.5F, 3.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -1.0F, -0.1185078555446247F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(14, 10).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.6F, -4.5F, 0.5916666430576886F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -1.0F, 1.2F, 0.0F, -0.5522221646783615F, -0.27593656206399647F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -1.0F, 1.2F, 0.0F, 0.5522221646783615F, 0.27593656206399647F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(50, 26).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.5F, 0.11815879002712096F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(30, 12).addBox(-1.5F, -1.4F, -2.6F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.0F, 0.5122541421182385F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.1F, -0.1972222088043106F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(TakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.591F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.118F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.591F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.118F;
                this.Chest.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.276F;
                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1F) * 0.5F + 13.1F;
                this.Hips.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.355F;
                this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.591F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.349F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.2F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.349F;
                this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.2F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.341F;
                this.UpperLegLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
                this.LowerLegLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.767F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.341F;
                this.UpperLegRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
                this.LowerLegRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.767F;
            }
        }
    }
}


