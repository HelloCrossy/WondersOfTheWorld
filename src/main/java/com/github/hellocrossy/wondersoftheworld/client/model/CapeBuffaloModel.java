package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.CapeBuffaloEntity;
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

public abstract class CapeBuffaloModel extends ZawaBaseModel<CapeBuffaloEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends CapeBuffaloModel {
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart ArmBaseLeft;
        public ModelPart Body;
        public ModelPart NeckLower;
        public ModelPart Head;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Horn1Right;
        public ModelPart Horn1Righ;
        public ModelPart Muzzle;
        public ModelPart Horn2Right;
        public ModelPart Horn3Right;
        public ModelPart Horn4Right;
        public ModelPart Horn2Left;
        public ModelPart Horn3Left;
        public ModelPart Horn4Left;
        public ModelPart Mouth;
        public ModelPart TopSnout;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail2;
        public ModelPart TailTuft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.NeckLower = this.Neck.getChild("NeckLower");

            this.Head = this.Neck.getChild("Head");
            this.Horn1Righ = this.Head.getChild("Horn1Righ");
            this.Horn2Left = this.Horn1Righ.getChild("Horn2Left");
            this.Horn3Left = this.Horn2Left.getChild("Horn3Left");
            this.Horn4Left = this.Horn3Left.getChild("Horn4Left");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Horn1Right = this.Head.getChild("Horn1Right");
            this.Horn2Right = this.Horn1Right.getChild("Horn2Right");
            this.Horn3Right = this.Horn2Right.getChild("Horn3Right");
            this.Horn4Right = this.Horn3Right.getChild("Horn4Right");

            this.EarRight = this.Head.getChild("EarRight");

            this.Muzzle = this.Head.getChild("Muzzle");
            this.TopSnout = this.Muzzle.getChild("TopSnout");

            this.Mouth = this.Muzzle.getChild("Mouth");

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

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.TailTuft = this.Tail2.getChild("TailTuft");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -8.0F, -4.5F, 13.0F, 16.0F, 9.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -2.5F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(70, 53).mirror(true).addBox(-3.0F, 0.0F, -3.5F, 6.0F, 10.0F, 7.0F), PartPose.offsetAndRotation(-4.1F, 0.9F, -0.4F, 0.39915681457848917F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(76, 70).mirror(true).addBox(-2.5F, 0.0F, -5.0F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 9.0F, 2.5F, -0.1502728426045993F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(80, 81).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.5F, -4.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(36, 118).mirror(true).addBox(-2.0F, 0.0F, -1.6F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.7F, 0.5F, 0.024260076353049827F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(46, 22).addBox(-3.0F, -11.3F, -3.0F, 6.0F, 12.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -4.7F, -3.5F, 1.8861773173039496F, 0.0F, 0.0F));
            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(48, 63).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 13.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -11.3F, -4.7F, -0.5988224903277043F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 86).addBox(-4.0F, -4.5F, -3.5F, 8.0F, 9.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -9.1F, -0.8F, -1.5622442507443797F, 0.0F, 0.0F));
            PartDefinition Horn1Righ = Head.addOrReplaceChild("Horn1Righ", CubeListBuilder.create().texOffs(0, 102).mirror(true).addBox(-3.0F, -4.0F, -1.5F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-1.0F, -2.8F, -1.0F, -0.17453292519943295F, 0.05235987755982988F, -0.06981317007977318F));
            PartDefinition Horn2Left = Horn1Righ.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(10, 119).mirror(true).addBox(-6.0F, -2.0F, -1.0F, 6.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-2.4F, -1.5F, 0.0F, 0.0F, 0.0F, -0.27366763203903305F));
            PartDefinition Horn3Left = Horn2Left.addOrReplaceChild("Horn3Left", CubeListBuilder.create().texOffs(0, 115).mirror(true).addBox(0.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-6.0F, 1.0F, 0.5F, 0.0F, 0.0F, -0.23457224414434488F));
            PartDefinition Horn4Left = Horn3Left.addOrReplaceChild("Horn4Left", CubeListBuilder.create().texOffs(0, 122).mirror(true).addBox(0.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.27366763203903305F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -1.0F, 0.0F, 6.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(3.5F, -2.0F, 1.3F, 0.0F, -0.5462880425584197F, 0.5335471470083444F));

            PartDefinition Horn1Right = Head.addOrReplaceChild("Horn1Right", CubeListBuilder.create().texOffs(0, 102).addBox(-1.0F, -4.0F, -1.5F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(1.0F, -2.8F, -1.0F, -0.17453292519943295F, -0.05235987755982988F, 0.06981317007977318F));
            PartDefinition Horn2Right = Horn1Right.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(10, 119).addBox(0.0F, -2.0F, -1.0F, 6.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(2.4F, -1.5F, 0.0F, 0.0F, 0.0F, 0.27366763203903305F));
            PartDefinition Horn3Right = Horn2Right.addOrReplaceChild("Horn3Right", CubeListBuilder.create().texOffs(0, 115).addBox(-2.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(6.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.23457224414434488F));
            PartDefinition Horn4Right = Horn3Right.addOrReplaceChild("Horn4Right", CubeListBuilder.create().texOffs(0, 122).addBox(-4.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.27366763203903305F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 26).mirror(true).addBox(-5.0F, -1.0F, 0.0F, 6.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-3.5F, -2.0F, 1.3F, 0.0F, 0.5462880425584197F, -0.5335471470083444F));

            PartDefinition Muzzle = Head.addOrReplaceChild("Muzzle", CubeListBuilder.create().texOffs(47, 108).addBox(-3.0F, 0.0F, -6.0F, 6.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -3.5F, 0.33161255787892263F, 0.0F, 0.0F));
            PartDefinition TopSnout = Muzzle.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(22, 102).addBox(-2.5F, -1.5F, -6.0F, 5.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, 0.45535640450848164F, 0.0F, 0.0F));

            PartDefinition Mouth = Muzzle.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(20, 112).addBox(-2.0F, 0.0F, -5.5F, 4.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -0.4F, -0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(70, 53).addBox(-3.0F, 0.0F, -3.5F, 6.0F, 10.0F, 7.0F), PartPose.offsetAndRotation(4.1F, 0.9F, -0.4F, 0.39915681457848917F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(76, 70).addBox(-2.5F, 0.0F, -5.0F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 9.0F, 2.5F, -0.1502728426045993F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(80, 81).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.6F, -4.5F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(36, 118).addBox(-2.0F, 0.0F, -1.6F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 4.7F, 0.5F, 0.024260076353049827F, 0.0F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(2, 25).addBox(-7.0F, 0.0F, 0.0F, 14.0F, 18.0F, 15.0F), PartPose.offsetAndRotation(0.0F, -8.0F, 0.7F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 58).addBox(-6.5F, 0.0F, 0.0F, 13.0F, 17.0F, 11.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 15.0F, -0.12199851071966199F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(44, 0).addBox(-3.5F, 0.0F, -4.5F, 7.0F, 13.0F, 8.0F), PartPose.offsetAndRotation(-4.0F, 4.5F, 6.0F, 0.14416420020947326F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(74, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.3F, 13.0F, -3.0F, 0.7133160466479549F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(74, 11).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 4.5F, -0.6677629425182585F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(36, 118).mirror(true).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -2.5F, -0.03909537541112055F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(82, 23).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 11.0F, 0.19809487675925913F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(82, 32).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 6.9F, -1.0F, -0.03281218985426961F, 0.0F, 0.0F));
            PartDefinition TailTuft = Tail2.addOrReplaceChild("TailTuft", CubeListBuilder.create().texOffs(80, 45).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.02356194531804237F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(44, 0).mirror(true).addBox(-3.5F, 0.0F, -4.5F, 7.0F, 13.0F, 8.0F), PartPose.offsetAndRotation(4.0F, 4.5F, 6.0F, 0.14416420020947326F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(74, 0).mirror(true).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.3F, 13.0F, -3.0F, 0.7133160466479549F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(74, 11).mirror(true).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 4.5F, -0.6677629425182585F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(36, 118).mirror(true).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 7.0F, -2.5F, -0.03909537541112055F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 96, 128);
        }

        @Override
        public void setupAnim(CapeBuffaloEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 1.562F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.886F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 1.562F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
            } else {
                float speed = 0.6f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.886F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.562F;

                this.Chest.y = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 2.5F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.227F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.227F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.121F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.399F;
                this.ArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.15F;
                this.HandLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.024F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.399F;
                this.ArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.15F;
                this.HandRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.024F;

                this.ThighLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.144F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.713F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.667F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.039F;
                this.ThighRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.144F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.713F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.667F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.039F;
            }
        }
    }

    public static class Child extends CapeBuffaloModel {
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart UpperArmLeft;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart Head;
        public ModelPart NeckLower;
        public ModelPart EarRight;
        public ModelPart EarLeft;
        public ModelPart Muzzle;
        public ModelPart Mouth;
        public ModelPart TopSnout;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Muzzle = this.Head.getChild("Muzzle");
            this.TopSnout = this.Muzzle.getChild("TopSnout");

            this.Mouth = this.Muzzle.getChild("Mouth");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.NeckLower = this.Neck.getChild("NeckLower");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(46, 0).addBox(-3.0F, -4.0F, -1.5F, 6.0F, 9.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 11.8F, -6.0F, -0.10140362854218513F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(22, 4).addBox(-1.5F, -0.3F, -3.5F, 3.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.4F, -0.3F, -0.1429424584146426F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 48).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 2.6F, -4.9F, 0.3534291735288517F, 0.0F, 0.0F));
            PartDefinition Muzzle = Head.addOrReplaceChild("Muzzle", CubeListBuilder.create().texOffs(21, 55).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -2.2F, 0.2925171866289913F, 0.0F, 0.0F));
            PartDefinition TopSnout = Muzzle.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(22, 50).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 1.1F, 0.37716566200861895F, 0.0F, 0.0F));

            PartDefinition Mouth = Muzzle.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(23, 60).addBox(-1.5F, 0.0F, -3.5F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.1F, 0.8F, -0.10384708716471125F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(2.5F, -1.0F, 1.3F, 0.46914448828868976F, -0.46739918566830635F, -0.31991885055898F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 45).mirror(true).addBox(-3.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-2.5F, -1.0F, 1.3F, 0.46914448828868976F, 0.46739918566830635F, 0.31991885055898F));

            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(20, 13).addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(22, 24).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(1.9F, 0.5F, 0.1F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(26, 32).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.8F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(26, 37).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offset(-0.01F, 3.0F, -2.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(26, 42).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 2.5F, 1.3F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(34, 13).addBox(-3.5F, 0.0F, -1.0F, 7.0F, 9.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -3.9F, 1.3F, 0.14032447119455382F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 6.5F, -0.18046704731937477F, 0.0F, 0.0F));
            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(8, 22).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, -1.222428624075795F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(7, 26).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(9, 31).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 2.6F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(35, 31).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(-2.2F, 1.9F, 2.5F, 0.16650440997446878F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(37, 41).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, 0.6630506121274178F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(38, 48).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 4.0F, 1.9F, -0.6839945098881279F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(38, 55).addBox(-1.0F, -0.5F, -1.7F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 4.7F, -0.7F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(35, 31).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(2.2F, 1.9F, 2.5F, 0.16650440997446878F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(37, 41).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.5F, -2.0F, 0.6630506121274178F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(38, 48).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 4.0F, 1.9F, -0.6839945098881279F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(38, 55).mirror(true).addBox(-1.0F, -0.5F, -1.7F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.1F, 4.7F, -0.7F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(22, 24).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-1.9F, 0.5F, 0.1F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(26, 32).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.8F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(26, 37).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offset(-0.01F, 3.0F, -2.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(26, 42).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.1F, 2.5F, 1.3F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(CapeBuffaloEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.353F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.142F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.353F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.222F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.195F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.8f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.142F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.353F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.222F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.195F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 11.8F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.101F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.14F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.18F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.174F;
                this.UpperArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.174F;
                this.UpperArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.166F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.683F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.166F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.683F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}
