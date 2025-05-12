package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.LowlandNyalaEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class LowlandNyalaModel extends ZawaBaseModel<LowlandNyalaEntity> {
    protected ModelPart Chest;
    private Iterable<ModelPart> parts;
    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class AdultMale extends LowlandNyalaModel {
        public ModelPart Neck;
        public ModelPart BackFur1;
        public ModelPart ArmBaseRight;
        public ModelPart Body;
        public ModelPart Fluff1;
        public ModelPart ArmBaseLeft;
        public ModelPart Head;
        public ModelPart NeckBase;
        public ModelPart Horn1Left;
        public ModelPart EarRight;
        public ModelPart UpperSnout;
        public ModelPart Horn1Right;
        public ModelPart EarLeft;
        public ModelPart Horn2Left;
        public ModelPart Horn3Left;
        public ModelPart Mouth;
        public ModelPart Snout;
        public ModelPart Horn2Right;
        public ModelPart Horn3Right;
        public ModelPart Beard;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart BackFur2;
        public ModelPart Hips;
        public ModelPart Fluff2;
        public ModelPart BackFur3;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart LegTuftLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart LegTuftRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;

        public AdultMale() {
            this.texWidth = 128;
            this.texHeight = 128;
            partDefinition.addOrReplaceChild("Fluff1", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 4.5F, 0.0F, 0.017453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(26, 19).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 4.0F, -2.5F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(26, 0).mirror(true).addBox(-1.1F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, -0.23561944901923448F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 6.2F, -6.5F, 0.2694788291842315F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(42, 13).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.5F, 8.0F, -1.3F, 0.5229999971167082F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Right", CubeListBuilder.create().texOffs(11, 112).mirror(true).addBox(-0.5F, -4.5F, 0.0F, 1.0F, 5.0F, 1.0F, 0.2F, 0.0F, 0.2F), PartPose.offsetAndRotation(0.3F, -2.8F, 0.5F, -0.5235987755982988F, 0.0F, 0.6108652381980153F));
            partDefinition.addOrReplaceChild("LegTuftRight", CubeListBuilder.create().texOffs(53, 18).mirror(true).addBox(-0.5F, -4.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 0.0F, 0.0F, -0.10245082509469633F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegTuftLeft", CubeListBuilder.create().texOffs(53, 18).addBox(-0.5F, -4.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, -0.10245082509469633F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, -0.3F, 0.0F, 7.0F, 10.0F, 12.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 3.0F, -0.2694788291842315F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 97).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.100000024F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.3F, -1.7F, -0.6981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BackFur1", CubeListBuilder.create().texOffs(61, 12).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -5.0F, -1.5F, 0.02617993877991494F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(1, 18).mirror(true).addBox(-3.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.0F, -1.7F, 1.0F, 0.0F, 0.4363323129985824F, 0.4363323129985824F));
            partDefinition.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(0, 68).addBox(-1.5F, 0.0F, -4.3F, 3.0F, 4.0F, 9.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -0.5F, -0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 102).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(26, 0).addBox(-2.0F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -0.23561944901923448F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn1Left", CubeListBuilder.create().texOffs(9, 118).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.7F, -2.5F, -0.5F, -0.40631266184850484F, 0.13962634015954636F, 0.4363323129985824F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(43, 0).addBox(-2.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(3.0F, 3.5F, 2.9F, 0.208566842284371F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 81).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.099999905F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -4.8F, 0.7419394357280175F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BackFur2", CubeListBuilder.create().texOffs(61, 9).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 12.5F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, -0.4F, 0.1F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 39).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 12.0F, -0.2694788291842315F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn2Left", CubeListBuilder.create().texOffs(11, 112).addBox(-0.5F, -4.5F, 0.0F, 1.1F, 5.0F, 1.0F, 0.2F, 0.0F, 0.2F), PartPose.offsetAndRotation(-0.2F, -2.8F, 0.5F, -0.5235987755982988F, 0.0F, -0.6108652381980153F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(42, 21).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 4.8F, 2.9F, -0.4710643611185279F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn3Left", CubeListBuilder.create().texOffs(11, 107).addBox(-0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -4.1F, 0.1F, 0.3490658503988659F, 0.0F, 0.4363323129985824F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(26, 12).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.49F, 7.0F, 1.6F, -0.04300000233285385F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Horn1Right", CubeListBuilder.create().texOffs(9, 118).mirror(true).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.7F, -2.5F, -0.5F, -0.40631266184850484F, -0.13962634015954636F, -0.4363323129985824F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(28, 62).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 5.8F, -0.5F, -0.09581857193974705F, 0.0F, -0.0031415927784254694F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(26, 12).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.59F, 7.0F, 1.6F, -0.04300000233285385F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(42, 21).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 4.8F, 2.9F, -0.4710643611185279F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(34, 23).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.1F, 7.2F, -1.5F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(26, 19).mirror(true).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 4.0F, -2.5F));
            partDefinition.addOrReplaceChild("Fluff2", CubeListBuilder.create().texOffs(62, 29).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.1738347941644255F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperSnout", CubeListBuilder.create().texOffs(0, 91).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.5F, 0.8726646259971648F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(34, 23).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.1F, 5.5F, 0.5F));
            partDefinition.addOrReplaceChild("BackFur3", CubeListBuilder.create().texOffs(61, 12).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.14137167606944342F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(1, 18).addBox(-0.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.0F, -2.0F, 1.0F, 0.0F, -0.4363323129985824F, -0.4363323129985824F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(42, 13).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.5F, 8.0F, -1.3F, 0.5229999971167082F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(30, 55).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.3000221077388891F, 0.015009831816822585F, 0.0F));
            partDefinition.addOrReplaceChild("Horn3Right", CubeListBuilder.create().texOffs(11, 107).mirror(true).addBox(-0.5F, -3.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 0.1F, 0.3490658503988659F, 0.0F, -0.4363323129985824F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(43, 0).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-3.0F, 3.5F, 2.9F, 0.208566842284371F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(34, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.1F, 7.2F, -1.5F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 55).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 5.0F, 8.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, -0.891339643667182F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Beard", CubeListBuilder.create().texOffs(101, 19).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 12.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.8F, -3.5F, 0.5745623577986002F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(30, 69).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 5.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(34, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.1F, 5.5F, 0.5F));
            this.Fluff1 = this.Chest.getChild("Fluff1");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.Horn2Right = this.Horn1Right.getChild("Horn2Right");
            this.LegTuftRight = this.UpperLegRight.getChild("LegTuftRight");
            this.LegTuftLeft = this.UpperLegLeft.getChild("LegTuftLeft");
            this.Body = this.Chest.getChild("Body");
            this.Snout = this.UpperSnout.getChild("Snout");
            this.BackFur1 = this.Chest.getChild("BackFur1");
            this.EarRight = this.Head.getChild("EarRight");
            this.NeckBase = this.Neck.getChild("NeckBase");
            this.Mouth = this.UpperSnout.getChild("Mouth");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.Horn1Left = this.Head.getChild("Horn1Left");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Head = this.Neck.getChild("Head");
            this.BackFur2 = this.Body.getChild("BackFur2");
            this.Hips = this.Body.getChild("Hips");
            this.Horn2Left = this.Horn1Left.getChild("Horn2Left");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.Horn3Left = this.Horn2Left.getChild("Horn3Left");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.Horn1Right = this.Head.getChild("Horn1Right");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.Fluff2 = this.Body.getChild("Fluff2");
            this.UpperSnout = this.Head.getChild("UpperSnout");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.BackFur3 = this.Hips.getChild("BackFur3");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Horn3Right = this.Horn2Right.getChild("Horn3Right");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.Neck = this.Chest.getChild("Neck");
            this.Beard = this.NeckBase.getChild("Beard");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.741F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.891F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.741F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.3F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.095F;
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
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.891F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.741F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.3F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.095F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 6.2F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.269F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.269F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.269F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F - 0.235F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.043F;
                this.ForearmLeft.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F - 0.235F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F  - 0.043F;
                this.ForearmRight.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.208F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.523F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.471F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.208F;
                this.UpperLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.523F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.471F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.891F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.741F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.3F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.095F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 6.2F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.269F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.269F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.269F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.235F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.043F;
                this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.235F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.043F;
                this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.208F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.523F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.471F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.208F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.523F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.471F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class AdultFemale extends LowlandNyalaModel {
        public ModelPart Neck;
        public ModelPart ArmBaseRight;
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart NeckBase;
        public ModelPart Head;
        public ModelPart EarRight;
        public ModelPart UpperSnout;
        public ModelPart EarLeft;
        public ModelPart Mouth;
        public ModelPart Snout;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail1;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;

        public AdultFemale() {
            this.texWidth = 128;
            this.texHeight = 128;
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(26, 19).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 4.0F, -2.5F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(26, 0).addBox(-2.0F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -0.23561944901923448F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(42, 13).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.5F, 8.0F, -1.3F, 0.5229999971167082F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(26, 12).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.59F, 7.0F, 1.6F, -0.04300000233285385F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 97).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.100000024F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 2.3F, -1.7F, -0.6981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(43, 0).addBox(-2.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(3.0F, 4.5F, 2.9F, 0.208566842284371F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(34, 23).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.1F, 6.2F, -1.5F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(28, 62).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 5.8F, -0.5F, -0.09581857193974705F, 0.0F, -0.0031415927784254694F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(42, 21).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 4.8F, 2.9F, -0.4710643611185279F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(34, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.1F, 4.5F, 0.5F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 7.4F, -6.5F, 0.2694788291842315F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(26, 0).mirror(true).addBox(-1.1F, 0.0F, -2.5F, 3.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, -0.23561944901923448F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 81).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.099999905F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -7.7F, 1.1719886193458031F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(34, 23).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.1F, 6.2F, -1.5F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(30, 55).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.3000221077388891F, 0.015009831816822585F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(30, 69).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 5.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(1, 18).addBox(-0.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.0F, -2.0F, 1.0F, 0.5082398928281348F, -0.4363323129985824F, -0.6709045404981704F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(34, 23).mirror(true).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.1F, 4.5F, 0.5F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(1, 18).mirror(true).addBox(-3.5F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.0F, -1.7F, 1.0F, 0.5864306020384839F, 0.4363323129985824F, 0.6709045404981704F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(42, 13).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.5F, 8.0F, -1.3F, 0.5229999971167082F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(26, 19).mirror(true).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 4.0F, -2.5F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, -0.1F, 0.0F, 7.0F, 10.0F, 11.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -5.0F, 3.0F, -0.182212366584515F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 55).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -5.0F, -1.0F, -0.8131489011673192F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(43, 0).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 4.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-3.0F, 4.5F, 2.9F, 0.208566842284371F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 39).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, -0.3567453084287048F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperSnout", CubeListBuilder.create().texOffs(0, 91).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.5F, 0.8726646259971648F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 102).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(42, 21).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 4.8F, 2.9F, -0.4710643611185279F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(26, 12).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.49F, 7.0F, 1.6F, -0.04300000233285385F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(0, 68).addBox(-2.0F, -2.0F, -7.0F, 4.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 1.5F, -0.5864306020384839F, 0.0F, 0.0F));
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.Snout = this.UpperSnout.getChild("Snout");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.Head = this.NeckBase.getChild("Head");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.Body = this.Chest.getChild("Body");
            this.Neck = this.Chest.getChild("Neck");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.Hips = this.Body.getChild("Hips");
            this.UpperSnout = this.Head.getChild("UpperSnout");
            this.Mouth = this.UpperSnout.getChild("Mouth");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.NeckBase = this.Neck.getChild("NeckBase");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.172F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.813F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.172F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.3F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.095F;
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
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.813F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 1.172F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.3F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.095F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 7.4F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.269F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.182F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.356F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F - 0.235F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.043F;
                this.ForearmLeft.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F - 0.235F;
                this.ArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F  - 0.043F;
                this.ForearmRight.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.208F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.523F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.471F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.208F;
                this.UpperLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.523F;
                this.LowerLegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.471F;
                this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.813F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 1.172F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.3F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.095F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 7.4F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.269F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.182F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.356F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.235F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.043F;
                this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.235F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.043F;
                this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.208F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.523F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.471F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.208F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.523F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.471F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends LowlandNyalaModel {
        public ModelPart ArmBaseLeft;
        public ModelPart Body;
        public ModelPart ArmBaseRight;
        public ModelPart Neck1;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart Tail3;
        public ModelPart Tail4;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart EarLeft;
        public ModelPart TopSnout;
        public ModelPart Nose;
        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            texWidth = 64;
            texHeight = 64;
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 28).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 10.0F, -0.42149700769872783F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(32, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.1F, 2.0F, 0.5F));
            partDefinition.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(44, 10).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.1F, 6.0F, -1.7F, 0.3510000044300496F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.6F, 0.5F, 0.3F, 0.0169296942436877F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(32, 8).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 1.0F, -0.08699999668789724F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.6F, -0.7F, 0.0F, 0.5864306020384839F, 0.8600982340775168F, 0.0F));
            partDefinition.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(32, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.6F, 0.5F, 0.3F, 0.0169296942436877F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(32, 13).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.1F, 3.0F, -1.98F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 0.0F, 4.0F));
            partDefinition.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(44, 17).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 2.5F, -0.2910000170454868F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(32, 8).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 5.0F, 1.0F, -0.08699999668789724F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(17, 4).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 3.15837576474231E-4F, 0.0F, -0.08987762546951192F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(44, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(2.0F, 2.4F, 1.6F, 0.26214846163903155F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(1, 40).addBox(-1.5F, -2.0F, -4.2F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -0.5F, -2.1395990661039823F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(44, 0).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-2.0F, 2.4F, 1.6F, 0.26214846163903155F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(19, 29).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 0.5F, 1.5F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.5F, -1.5F, 5.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 11.7F, -5.0F, 0.09494591230717694F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(44, 10).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.1F, 6.0F, -1.7F, 0.3510000044300496F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(32, 18).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.1F, 2.0F, 0.5F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -1.6F, 0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(32, 13).mirror(true).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.1F, 3.0F, -1.98F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(53, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(-0.1F, 3.0F, -1.3F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 56).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -2.8F, 0.27366763203903305F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -0.3F, -4.3F, 1.367640012515401F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(53, 19).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.1F, 3.0F, -1.3F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 8.0F, 10.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 1.0F, 0.022340213926184713F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(10, 56).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, -0.05F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -2.8F, 0.0F, 0.6646214111173737F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 4.0F, -1.2334960557758918F, 0.0F, -0.022307931420345907F));
            partDefinition.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(44, 17).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 2.5F, -0.2910000170454868F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 10).mirror(true).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.6F, -0.7F, 0.0F, 0.5864306020384839F, -0.8600982340775168F, 0.0F));
            partDefinition.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(20, 40).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.1F, 0.7819074915776542F, 0.0F, 0.0F));
            this.Hips = this.Body.getChild("Hips");
            this.HandLeft = this.ForearmLeft.getChild("HandLeft");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.EarLeft = this.Head.getChild("EarLeft");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.Neck = this.Neck1.getChild("Neck");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.HandRight = this.ForearmRight.getChild("HandRight");
            this.Snout = this.Head.getChild("Snout");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");
            this.Nose = this.Snout.getChild("Nose");
            this.Head = this.Neck.getChild("Head");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
            this.Body = this.Chest.getChild("Body");
            this.TopSnout = this.Snout.getChild("TopSnout");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.EarRight = this.Head.getChild("EarRight");
            this.Neck1 = this.Chest.getChild("Neck1"); 
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

            return LayerDefinition.create(meshDefinition, texWidth, texHeight);
        }

        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.367F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 2.139F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.367F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.251F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.088F;
            this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 2.139F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 1.367F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.251F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.088F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 11.7F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.094F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.022F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.421F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.017F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.017F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.262F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.351F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.291F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.262F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.351F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.291F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}