package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.OryxEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class OryxModel extends ZawaBaseModel<OryxEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends OryxModel {

        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart Tail2;
        public ModelPart TailTuft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart LowerNeck;
        public ModelPart Head;
        public ModelPart LowerNeck2;
        public ModelPart Mane1;
        public ModelPart Forehead;
        public ModelPart EarLeft;
        public ModelPart Horn1Left;
        public ModelPart Horn1Right;
        public ModelPart Snout;
        public ModelPart EarLeft_1;
        public ModelPart Horn1Left2;
        public ModelPart Horn1Right2;
        public ModelPart EarFurLeft;
        public ModelPart Horn2Left;
        public ModelPart Horn2Right;
        public ModelPart TopSnout;
        public ModelPart Jaw;
        public ModelPart EarFurRight;
        public ModelPart Horn2Left2;
        public ModelPart Horn2Right2;
        public ModelPart Mane2;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;


        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Horn2Left = this.Horn1Left.getChild("Horn2Left");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.Hips = this.Body.getChild("Hips");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.Horn2Right = this.Horn1Right.getChild("Horn2Right");
            this.Horn2Right2 = this.Horn1Right2.getChild("Horn2Right2");
            this.Mane2 = this.Mane1.getChild("Mane2");
            this.Head = this.Neck.getChild("Head");
            this.Body = this.Chest.getChild("Body");
            this.EarFurRight = this.EarLeft_1.getChild("EarFurRight");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.LowerNeck = this.Neck.getChild("LowerNeck");
            this.Horn1Right = this.Head.getChild("Horn1Right");
            this.Snout = this.Head.getChild("Snout");
            this.Horn2Left2 = this.Horn1Left2.getChild("Horn2Left2");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Forehead = this.Head.getChild("Forehead");
            this.Neck = this.Chest.getChild("Neck");
            this.Jaw = this.Snout.getChild("Jaw");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.Horn1Left = this.Head.getChild("Horn1Left");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.Horn1Right2 = this.Head.getChild("Horn1Right2");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.Horn1Left2 = this.Head.getChild("Horn1Left2");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LowerNeck2 = this.Neck.getChild("LowerNeck2");
            this.EarFurLeft = this.EarLeft.getChild("EarFurLeft");
            this.TailTuft = this.Tail2.getChild("TailTuft");
            this.Mane1 = this.Neck.getChild("Mane1");
            this.EarLeft_1 = this.Head.getChild("EarLeft_1");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(74, 20).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 8.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 3.5F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(81, 65).addBox(-0.5F, -15.5F, -0.5F, 1.0F, 17.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -15.0F, 0.0F, -0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(59, 19).mirror(true).addBox(-2.0F, 0.0F, -1.5F, 4.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 7.0F, 0.5F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 24).addBox(-4.5F, 0.0F, 0.0F, 9.0F, 13.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -15.0F, 17.0F, -0.3790855015489435F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(45, 49).mirror(true).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(-3.8F, 2.9F, -1.6F, 0.3141592653589793F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(83, 44).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 8.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.6F, -3.5F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(66, 49).mirror(true).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 8.0F, 2.0F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -8.0F, -4.5F, 11.0F, 16.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, -0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(81, 65).mirror(true).addBox(-0.5F, -15.5F, -0.5F, 1.0F, 17.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -15.0F, 0.0F, -0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Right2", CubeListBuilder.create().texOffs(74, 65).mirror(true).addBox(-0.5F, -15.5F, -0.5F, 1.0F, 17.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -15.0F, 0.0F, -0.3933972293784885F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mane2", CubeListBuilder.create().texOffs(70, 0).addBox(-1.49F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 12.0F, 2.0F, -0.7888888352172424F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 88).addBox(-3.5F, -5.0F, -3.0F, 7.0F, 8.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -11.1F, -2.4F, -1.2859585981957442F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 47).addBox(-6.0F, -15.0F, 0.0F, 12.0F, 15.0F, 17.0F), PartPose.offsetAndRotation(0.0F, 8.0F, 3.5F, 0.2617993877991494F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarFurRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F), PartPose.offsetAndRotation(-0.5F, -5.0F, 0.5F, 0.0F, 0.0F, -0.5082398928281348F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(59, 19).addBox(-2.0F, 0.0F, -1.5F, 4.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 6.9F, -2.5F));
            partDefinition.addOrReplaceChild("LowerNeck", CubeListBuilder.create().texOffs(60, 80).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 14.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -11.0F, -4.1F, -0.3748967153388987F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn1Right", CubeListBuilder.create().texOffs(87, 70).mirror(true).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, -4.6F, -0.9F, -0.8035496035971559F, -0.13962634015954636F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 113).addBox(-2.5F, 0.0F, -6.5F, 5.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -1.8F, -2.8F, 0.4321435267885376F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Left2", CubeListBuilder.create().texOffs(74, 65).addBox(-0.5F, -15.5F, -0.5F, 1.0F, 17.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -15.0F, 0.0F, -0.3933972293784885F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(40, 3).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.8F, -1.0F, -0.13665927909957545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(72, 33).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 14.0F, -2.5F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(15, 103).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -5.0F, -2.5F, 0.4363323129985824F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(33, 82).addBox(-3.0F, -11.0F, -4.0F, 6.0F, 13.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -4.0F, -5.0F, 1.697158127355031F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(51, 112).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 2.4F, -1.0F, -0.19495327877934715F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(59, 19).mirror(true).addBox(-2.0F, 0.0F, -1.5F, 4.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 6.9F, -2.5F));
            partDefinition.addOrReplaceChild("Horn1Left", CubeListBuilder.create().texOffs(87, 70).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F), PartPose.offsetAndRotation(1.3F, -4.6F, -0.9F, -0.8035496035971559F, 0.13962634015954636F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(50, 1).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 7.0F, 0.5235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(20, 115).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -6.4F, 0.3513347637790725F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn1Right2", CubeListBuilder.create().texOffs(87, 87).mirror(true).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, -4.6F, -0.9F, -1.0400417039265821F, -0.13962634015954636F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(74, 20).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 8.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 3.5F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(59, 19).addBox(-2.0F, 0.0F, -1.5F, 4.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 7.0F, 0.5F));
            partDefinition.addOrReplaceChild("Horn1Left2", CubeListBuilder.create().texOffs(87, 87).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F), PartPose.offsetAndRotation(1.3F, -4.6F, -0.9F, -1.0400417039265821F, 0.13962634015954636F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(44, 27).addBox(-3.0F, 0.0F, -4.5F, 6.0F, 14.0F, 8.0F), PartPose.offsetAndRotation(3.5F, 2.0F, 4.0F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerNeck2", CubeListBuilder.create().texOffs(73, 105).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 14.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -11.0F, -5.0F, -0.45378560551852565F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarFurLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F), PartPose.offsetAndRotation(0.5F, -5.0F, 0.5F, 0.0F, 0.0F, 0.5082398928281348F));
            partDefinition.addOrReplaceChild("TailTuft", CubeListBuilder.create().texOffs(36, 21).addBox(-2.0F, 0.0F, -1.5F, 4.0F, 9.0F, 3.0F), PartPose.offset(0.0F, 4.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mane1", CubeListBuilder.create().texOffs(84, 0).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 14.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -7.5F, 2.3F, 0.11833332694706204F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft_1", CubeListBuilder.create().texOffs(2, 106).mirror(true).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-3.3F, -4.6F, 1.1F, 0.08412487294218292F, 0.20141099501435536F, -1.2372638960861357F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(72, 33).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 14.0F, -2.5F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(66, 49).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 8.0F, 2.0F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(83, 44).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 8.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.6F, -3.5F, -0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(2, 106).addBox(-1.5F, -4.0F, 0.0F, 3.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(3.3F, -4.6F, 1.1F, 0.08412487294218292F, -0.20141099501435536F, 1.2372638960861357F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(44, 27).mirror(true).addBox(-3.0F, 0.0F, -4.5F, 6.0F, 14.0F, 8.0F), PartPose.offsetAndRotation(-3.5F, 2.1F, 4.0F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(45, 49).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(3.9F, 2.9F, -1.6F, 0.3141592653589793F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 128, 128);
        }

        @Override
        public void setupAnim(OryxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 1.285F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.697F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 1.285F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.523F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.136F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
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
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 1.697F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 1.285F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.523F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.136F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.0F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.22F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.261F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.379F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.314F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.045F;
                this.ForearmLeft.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.045F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.314F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.045F;
                this.ForearmRight.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.045F;
                this.HandRight.xRot = Mth.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.174F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 1.285F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.523F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.174F;
                this.UpperLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.349F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.174F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.697F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 1.285F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.523F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.136F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 0.0F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.22F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.261F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.379F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.314F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.045F;
                this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.045F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.314F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.045F;
                this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.045F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.174F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.349F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.174F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.174F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.349F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.174F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends OryxModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart Tail;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart Head;
        public ModelPart EarLeft;
        public ModelPart Snout;
        public ModelPart Forehead;
        public ModelPart EarRight;
        public ModelPart HornLeft;
        public ModelPart HornRight;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.Mouth = this.Snout.getChild("Mouth");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.Forehead = this.Head.getChild("Forehead");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.Hips = this.Body.getChild("Hips");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.HornLeft = this.Head.getChild("HornLeft");
            this.Snout = this.Head.getChild("Snout");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Tail = this.Hips.getChild("Tail");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.Head = this.Neck.getChild("Head");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.Body = this.Chest.getChild("Body");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.HornRight = this.Head.getChild("HornRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Neck = this.Chest.getChild("Neck");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 16).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(1.6F, 0.7F, 1.5F, 0.26040312572913454F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(28, 17).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(-0.05F, 3.0F, -2.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(20, 19).mirror(true).addBox(-1.0F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 4.5F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 0.1F, -0.2410299770241099F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(26, 28).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -1.0F, 1.0F, -0.46914448828868976F, -0.4488986716287166F, 1.2041026136666326F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(46, 0).addBox(-2.5F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 12.8F, -2.5F, -0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(6, 10).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.1F, -1.5F, 0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(24, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.2534218153790599F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 5.5F, -0.3127630032889644F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(20, 19).mirror(true).addBox(-1.0F, 0.0F, -0.7F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 3.5F, 0.3F));
            partDefinition.addOrReplaceChild("HornLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.1F, -1.5F, 0.0F, -0.6255260065779288F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.8F, 0.4132939721985794F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(28, 17).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F), PartPose.offset(0.05F, 3.0F, -2.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(36, 17).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 2.8F, 1.1F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(35, 12).mirror(true).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.6F, 0.5F, -0.5F, 0.23177972000431504F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(17, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.5726425515477893F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 16).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-1.6F, 0.7F, 1.5F, 0.26040312572913454F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(10, 25).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(19, 9).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.0F, -0.4354596616883907F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(10, 25).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 3.0F, 1.7F, -0.767944870877505F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(36, 17).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.8F, 1.1F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 19).addBox(-1.0F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 4.5F, -0.7F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(26, 28).mirror(true).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -1.0F, 1.0F, -0.46914448828868976F, 0.4488986716287166F, -1.2041026136666326F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(40, 20).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, 0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 25).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 5.0F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 5.0F, -1.2F, 0.6632251157578453F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(35, 12).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.6F, 0.5F, -0.5F, 0.23177972000431504F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HornRight", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, -1.5F, 0.0F, -0.6255260065779288F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(20, 19).addBox(-1.0F, 0.0F, -0.7F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 3.5F, 0.3F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(33, 0).addBox(-1.5F, -3.5F, -2.5F, 3.0F, 7.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.0F, 0.7150614158473655F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(OryxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.435F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.715F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.435F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.251F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.715F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.435F;
                this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.251F;
                this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 12.8F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.156F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.156F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.312F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.231F;
                this.UpperArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.231F;
                this.UpperArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.26F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.767F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.26F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.767F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}

