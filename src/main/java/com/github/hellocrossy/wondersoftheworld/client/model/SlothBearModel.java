package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SlothBearEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SlothBearModel extends ZawaBaseModel<SlothBearEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends SlothBearModel {

        public ModelPart ArmRight;
        public ModelPart Neck;
        public ModelPart Body;
        public ModelPart ArmLeft;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart NeckBase;
        public ModelPart Head;
        public ModelPart CheekRight;
        public ModelPart Mouth;
        public ModelPart Snout;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart CheekLeft;
        public ModelPart TopSnout;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;


        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            texWidth = 64;
            texHeight = 64;
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(32, 28).addBox(-1.5F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 5.0F, 0.5F, -0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 26).mirror(true).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.6F, 4.5F, 1.9F, 0.046076694083573545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 26).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.6F, 4.5F, 1.9F, 0.046076694083573545F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(50, 28).mirror(true).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 2.5F, -0.27296950100402556F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(50, 38).mirror(true).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 5.5F, -1.0F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(50, 28).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 2.5F, -0.27296950100402556F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-0.5F, -2.5F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.8F, -0.9F, 0.8F, 0.3251548249991576F, -0.0712094321497881F, -0.27593656206399647F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(18, 26).mirror(true).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, 0.36407569261866146F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(32, 28).mirror(true).addBox(-1.5F, -1.3F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 5.0F, 0.5F, -0.18203784630933073F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(15, 45).addBox(-1.0F, -0.6F, -2.3F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -0.28F, 0.20141099501435536F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 18).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.6F, 1.5F, -1.0F, -0.09093165469469484F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(23, 56).mirror(true).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.0F, 1.2F, 0.5F, 0.04555309164612875F, -0.2275909337942703F, 0.27314402127920984F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -3.8F, -2.5F, 7.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 14.0F, -5.5F, 0.27296950100402556F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(23, 56).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.0F, 1.2F, 0.5F, 0.04555309164612875F, 0.2275909337942703F, -0.27314402127920984F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(18, 26).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, 0.36407569261866146F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(30, 47).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 4.2F, 2.0F, -0.2925171866289913F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.7873180362272864F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 8.0F, 10.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -3.5F, 3.0F, -0.22794000763415243F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, -0.5F, -0.5F, 7.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 9.5F, -0.27296950100402556F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 18).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.6F, 1.5F, -1.0F, -0.09093165469469484F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(15, 50).addBox(-1.5F, -2.0F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.2F, -2.0F, 0.11676252795710604F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(50, 38).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 5.5F, -1.0F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(16, 55).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.3F, -1.4F, 0.0911061832922575F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 49).addBox(-2.5F, -2.5F, -1.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.8F, -0.9F, 0.8F, 0.3251548249991576F, 0.07086036663228437F, 0.2747148202691658F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 55).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.8F, -3.0F, 0.1637118858344389F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(31, 38).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.8F, -0.9F, -0.2864085275891084F, 0.0F, 0.0F));
            this.FootRight = this.LegRight.getChild("FootRight");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.ArmRight = this.Chest.getChild("ArmRight");
            this.CheekLeft = this.Head.getChild("CheekLeft");
            this.CheekRight = this.Head.getChild("CheekRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.NeckBase = this.Neck.getChild("NeckBase");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.Snout = this.Head.getChild("Snout");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.Mouth = this.Head.getChild("Mouth");
            this.EarRight = this.Head.getChild("EarRight");
            this.Head = this.Neck.getChild("Head");
            this.Neck = this.Chest.getChild("Neck");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(SlothBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(limbSwing * 0.1F) * 0.2F * limbSwingAmount - 0.286F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * 0.1F) * -0.4F * limbSwingAmount + 0.164F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.7f;

                this.Body.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount - 0.227F;
                this.Chest.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount + 0.273F;
                this.Hips.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.273F;
                this.Head.zRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.164F;

                this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.046F;
                this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.364F;
                this.FootLeft.xRot = Mth.cos(-4.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.182F;
                this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.046F;
                this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.364F;
                this.FootRight.xRot = Mth.cos(-4.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.182F;

                this.ForearmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.273F;
                this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.091F;
                this.HandLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.091F;
                this.ForearmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.273F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.091F;
                this.HandRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.091F;

            }
        }
    }

    public static class Child extends SlothBearModel {
        public ModelPart Hips;
        public ModelPart Body;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart UpperLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart FootRight;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart EarLeft_1;
        public ModelPart EarLeft_2;
        public ModelPart Nose;
        public ModelPart Mouth;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            texWidth = 48;
            texHeight = 32;
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(32, 17).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.4F, -0.2F, -1.2F, 0.27000000980955996F, -0.03490658503988659F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.1F, -0.10471975511965977F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(9, 21).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.5F, -0.6F, 0.3F, -0.06999999915262065F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft_2", CubeListBuilder.create().texOffs(39, 15).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.6F, -1.0F, 0.0F, 0.0F, -0.19547687289441354F, -0.35185837453889574F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(30, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 7.0F, -0.17000000864227952F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(19, 22).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.02F, 3.5F, 1.0F, -0.20999998913548354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(20, 3).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.2F, 0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.6F, -0.3F, 0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.3F, -3.1F, -0.4F, 0.21083577230933448F, -0.2617993877991494F, 0.8726646259971648F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 8.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 17.5F, -3.5F, -0.02999999993406522F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(19, 22).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.02F, 3.5F, 1.0F, -0.20999998913548354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.02F, 4.0F, -1.3F, 0.49000000239072294F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.02F, 4.0F, -1.3F, 0.49000000239072294F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 2.0F, -1.2217304763960306F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(9, 21).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.5F, -0.6F, 0.3F, -0.06999999915262065F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft_1", CubeListBuilder.create().texOffs(39, 15).addBox(0.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.6F, -1.0F, 0.0F, 0.0F, 0.19547687289441354F, 0.35185837453889574F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(32, 17).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.4F, -0.2F, -1.2F, 0.27000000980955996F, 0.03490658503988659F, 0.0F));
            partDefinition.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(35, 26).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.8F, 0.0F, -0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-2.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.4F, -3.1F, -0.4F, 0.21083577230933448F, 0.2617993877991494F, -0.8726646259971648F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(8, 28).addBox(-1.0F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.02F, 2.8F, 0.7F, -0.20999998913548354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(8, 28).mirror(true).addBox(-1.0F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.02F, 2.8F, 0.7F, -0.20999998913548354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.1F, -2.5F, -0.01468673524083903F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(30, 7).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 1.2F, -0.1399999983052413F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(29, 25).mirror(true).addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.02F, 3.0F, -1.3F, 0.06999999915262065F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 14).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -2.3F, 0.20184310954597753F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(29, 25).addBox(-1.0F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.02F, 3.0F, -1.3F, 0.06999999915262065F, 0.0F, 0.0F));
            this.ArmBaseRight = this.Body.getChild("ArmBaseRight");
            this.Mouth = this.Snout.getChild("Mouth");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.EarLeft_2 = this.Head.getChild("EarLeft_2");
            this.Hips = this.Chest.getChild("Hips");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.Snout = this.Head.getChild("Snout");
            this.Nose = this.Snout.getChild("Nose");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.EarLeft_1 = this.Head.getChild("EarLeft_1");
            this.ArmBaseLeft = this.Body.getChild("ArmBaseLeft");
            this.Neck2 = this.Neck.getChild("Neck2");
            this.EarRight = this.Head.getChild("EarRight");
            this.FootLeft = this.UpperLegLeft.getChild("FootLeft");
            this.FootRight = this.UpperLegRight.getChild("FootRight");
            this.Neck = this.Body.getChild("Neck");
            this.Body = this.Chest.getChild("Body");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.Head = this.Neck.getChild("Head");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(SlothBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
        }

        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.Neck.xRot = Mth.cos(limbSwing * 0.1F) * 0.1F * limbSwingAmount -0.015F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * 0.1F) * -0.2F * limbSwingAmount + 0.202F;
        }

        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 0.8F;
            if (this.isSwimming) {
                limbSwing = (float)entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 2.0F;
            }

            this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.27F;
            this.ArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.21F;
            this.HandLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.07F;
            this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.27F;
            this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.21F;
            this.HandRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.07F;

            this.ThighLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.07F;
            this.UpperLegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * degree * -0.5F * limbSwingAmount + 0.49F;
            this.FootLeft.xRot = Mth.cos(-4.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.21F;
            this.ThighRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.07F;
            this.UpperLegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * degree * 0.5F * limbSwingAmount + 0.49F;
            this.FootRight.xRot = Mth.cos(-4.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.21F;

            this.Body.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount - 0.139F;
            this.Chest.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount + 0.03F;
            this.Hips.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.17F;
            this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.05F * limbSwingAmount + 0.2F;
            this.Head.zRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount + 0.202F;
            this.Neck.xRot = this.isSwimming ? -0.2F : -0.015F;

            }
        }
    }
