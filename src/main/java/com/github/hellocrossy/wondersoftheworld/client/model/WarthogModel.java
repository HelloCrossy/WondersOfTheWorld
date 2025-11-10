package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.WarthogEntity;
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

public abstract class WarthogModel extends ZawaBaseModel<WarthogEntity> {
    protected ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends WarthogModel {
        public ModelPart Body;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Neck;
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
        public ModelPart UpperArmLeft;
        public ModelPart LowerArmLeft;
        public ModelPart HandLeft;
        public ModelPart UpperArmRight;
        public ModelPart LowerArmRight;
        public ModelPart HandRight;
        public ModelPart Head;
        public ModelPart Crest2;
        public ModelPart CheekLeft;
        public ModelPart TopSnout;
        public ModelPart Mouth;
        public ModelPart CheekRight;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart Snout;
        public ModelPart Tusk1Left;
        public ModelPart Tusk1Right;
        public ModelPart Tusk2Left;
        public ModelPart Tusk2Right;
        public ModelPart Crest1;
        public ModelPart Crest3;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Crest2 = this.Neck.getChild("Crest2");
            this.Crest1 = this.Crest2.getChild("Crest1");

            this.Crest3 = this.Crest2.getChild("Crest3");

            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.TopSnout = this.Head.getChild("TopSnout");
            this.Snout = this.TopSnout.getChild("Snout");
            this.Tusk1Left = this.Snout.getChild("Tusk1Left");
            this.Tusk2Left = this.Tusk1Left.getChild("Tusk2Left");

            this.Tusk1Right = this.Snout.getChild("Tusk1Right");
            this.Tusk2Right = this.Tusk1Right.getChild("Tusk2Right");

            this.CheekRight = this.Head.getChild("CheekRight");

            this.CheekLeft = this.Head.getChild("CheekLeft");

            this.Mouth = this.Head.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.LowerArmLeft = this.UpperArmLeft.getChild("LowerArmLeft");

            this.HandLeft = this.LowerArmLeft.getChild("HandLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.LowerArmRight = this.UpperArmRight.getChild("LowerArmRight");

            this.HandRight = this.LowerArmRight.getChild("HandRight");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");

            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");

            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");

            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");

            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -3.5F, -2.0F, 7.0F, 8.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 13.3F, -5.0F, -0.1171115934746098F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(44, 30).addBox(-2.0F, -0.6F, -3.2F, 4.0F, 6.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -3.2F, -1.7F, -0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition Crest2 = Neck.addOrReplaceChild("Crest2", CubeListBuilder.create().texOffs(31, 1).addBox(-1.0F, -2.5F, -3.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.8F, -0.5F, 0.4300491170387584F, 0.0F, 0.0F));
            PartDefinition Crest1 = Crest2.addOrReplaceChild("Crest1", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.15F, -2.65F, 0.7428121536172364F, 0.0F, 0.0F));

            PartDefinition Crest3 = Crest2.addOrReplaceChild("Crest3", CubeListBuilder.create().texOffs(40, 5).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 1.0F, -0.46914448828868976F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(30, 20).addBox(-2.5F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.85F, -3.0F, 0.7428121536172364F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -1.5F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(3.0F, -2.0F, 1.0F, 0.19547687289441354F, -0.35185837453889574F, 0.3909537457888271F));

            PartDefinition TopSnout = Head.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(36, 13).addBox(-1.5F, 0.1F, -4.5F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.7F, -1.0F, 0.5019566968683108F, 0.0F, 0.0F));
            PartDefinition Snout = TopSnout.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(50, 16).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -4.5F, -0.5473352640780661F, 0.0F, 0.0F));
            PartDefinition Tusk1Left = Snout.addOrReplaceChild("Tusk1Left", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 1.7F, 1.0F, -0.3127630032889644F, 0.0F, 0.7038913192872462F));
            PartDefinition Tusk2Left = Tusk1Left.addOrReplaceChild("Tusk2Left", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, -1.8F, 0.0F, 0.0F, 0.0F, -0.3127630032889644F));

            PartDefinition Tusk1Right = Snout.addOrReplaceChild("Tusk1Right", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 1.7F, 1.0F, -0.3127630032889644F, 0.0F, -0.7038913192872462F));
            PartDefinition Tusk2Right = Tusk1Right.addOrReplaceChild("Tusk2Right", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, -1.8F, 0.0F, 0.0F, 0.0F, 0.3127630032889644F));

            PartDefinition CheekRight = Head.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(50, 42).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-3.0F, 1.2F, 0.0F, 0.27366763203903305F, -0.15655603856442327F, -0.19547687289441354F));

            PartDefinition CheekLeft = Head.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(50, 42).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(3.0F, 1.2F, 0.0F, 0.27366763203903305F, 0.15655603856442327F, 0.19547687289441354F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(50, 23).addBox(-1.5F, -1.3F, -4.0F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.3F, -1.5F, -0.0781907508222411F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, -1.5F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, -2.0F, 1.0F, 0.19547687289441354F, 0.35185837453889574F, -0.3909537457888271F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(38, 54).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(2.2F, 1.0F, -0.2F, 0.2474876932591181F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(51, 57).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.9F, 1.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition LowerArmLeft = UpperArmLeft.addOrReplaceChild("LowerArmLeft", CubeListBuilder.create().texOffs(52, 50).mirror(true).addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.3F, 0.0F, -0.04363323129985824F, 0.0F, 0.0F));

            PartDefinition HandLeft = LowerArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(43, 49).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(-0.1F, 3.3F, -1.3F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(38, 54).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-2.2F, 1.0F, -0.2F, 0.2474876932591181F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(51, 57).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.9F, 1.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition LowerArmRight = UpperArmRight.addOrReplaceChild("LowerArmRight", CubeListBuilder.create().texOffs(52, 50).mirror(true).addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.3F, 0.0F, -0.04363323129985824F, 0.0F, 0.0F));

            PartDefinition HandRight = LowerArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(43, 49).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(-0.1F, 3.3F, -1.3F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 9.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -4.0F, 2.0F, 0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 29).mirror(true).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 7.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 4.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(-2.7F, 3.1F, 3.7F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(18, 57).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 6.0F, -1.5F, 0.4363323129985824F, 0.0F, 0.0F));

            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(19, 50).mirror(true).addBox(-0.99F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.7F, 2.7F, -0.3490658503988659F, 0.0F, 0.0F));

            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(29, 60).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 3.2F, -1.2F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-2.5F, 0.0F, -2.5F, 4.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(2.7F, 3.1F, 3.7F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(18, 57).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 6.0F, -1.5F, 0.4363323129985824F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(19, 50).mirror(true).addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.7F, 2.7F, -0.3490658503988659F, 0.0F, 0.0F));

            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(29, 60).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.2F, -1.2F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 5.5F, 0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.7F, 0.0F, -0.1494001912944076F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(54, 5).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.9F, 0.0F, 0.11728612207217244F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(WarthogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.743F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.47F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.743F;

            this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.273F;
            this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.149F;
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
                float speed = 1.0F;
                float degree = 0.1F;

            } else {
                float speed = 0.8f;
                float degree = 0.6f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.47F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.743F;
                this.Tail1.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.273F;
                this.Tail2.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.149F;
                this.Tail1.zRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 13.3F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.117F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.156F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.228F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.247F;
                this.UpperArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.091F;
                this.LowerArmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.043F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.247F;
                this.UpperArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.091F;
                this.LowerArmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.043F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.039F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.436F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.349F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.137F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.039F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.436F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.349F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.137F;
            }
        }
    }

    public static class Child extends WarthogModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Hips;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail;
        public ModelPart UpperLegLeft;
        public ModelPart LowerLegLeft;
        public ModelPart FootLeft;
        public ModelPart UpperLegRight;
        public ModelPart LowerLegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart Snout;
        public ModelPart Mouth;
        public ModelPart EarLeft;
        public ModelPart EarRight;
        public ModelPart CheekTuftRight;
        public ModelPart CheetTuftLeft;
        public ModelPart ArmLeft;
        public ModelPart ForearmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart ForearmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.Mouth = this.Head.getChild("Mouth");
            this.CheetTuftLeft = this.Mouth.getChild("CheetTuftLeft");

            this.CheekTuftRight = this.Mouth.getChild("CheekTuftRight");

            this.Snout = this.Head.getChild("Snout");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");

            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");

            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Tail = this.Hips.getChild("Tail");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");

            this.HandLeft = this.ForearmLeft.getChild("HandLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");

            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.ForearmRight = this.ArmRight.getChild("ForearmRight");
            this.HandRight = this.ForearmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 18.3F, -3.0F, -0.12217304763960307F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.16580627893946132F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(14, 6).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.7F, -2.0F, 0.40142572795869574F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(20, 12).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.1F, -1.2F, 0.7F, -0.5410520681182421F, -0.3490658503988659F, 0.7504915783575618F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(20, 12).mirror(true).addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.2F, -1.2F, 0.7F, -0.5410520681182421F, 0.3490658503988659F, -0.7504915783575618F));

            PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(10, 16).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.4F, -0.9F));
            PartDefinition CheetTuftLeft = Mouth.addOrReplaceChild("CheetTuftLeft", CubeListBuilder.create().texOffs(-1, 0).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F), PartPose.offsetAndRotation(1.4F, 0.4F, 1.3F, 0.07853981633974483F, -0.938114472946952F, -0.47123889803846897F));

            PartDefinition CheekTuftRight = Mouth.addOrReplaceChild("CheekTuftRight", CubeListBuilder.create().texOffs(-1, 0).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.7F, 0.6F, 0.07853981633974483F, 0.938114472946952F, 0.47123889803846897F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(10, 12).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -1.5F, 0.4363323129985824F, 0.0F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.1F, 0.20943951023931953F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 14).addBox(-1.5F, 0.3F, 0.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, -0.3490658503988659F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 20).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, 1.5F, 1.1F, 0.2617993877991494F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(0, 25).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, 3.0F, -0.3F, 0.6981317007977318F, 0.0F, 0.0F));

            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(0, 28).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 1.8F, 1.0F, -0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(4, 29).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.01F, 1.3F, -0.7F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.2F, 1.5F, 1.1F, 0.2617993877991494F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 3.0F, -0.3F, 0.6981317007977318F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 1.8F, 0.9F, -0.6981317007977318F, 0.0F, 0.0F));

            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(4, 29).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.01F, 1.3F, -0.7F));

            PartDefinition Tail = Hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(14, 19).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 1.5F, 0.4300491170387584F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(8, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.4F, 0.4F, 0.0F, 0.22689280275926282F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(8, 25).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 2.0F, 0.3F, -0.12217304763960307F, 0.0F, 0.0F));
            PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(8, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.9F, -1.0F, 0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(4, 29).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(-0.01F, 1.5F, 0.3F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(8, 21).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.4F, 0.4F, 0.0F, 0.22689280275926282F, 0.0F, 0.0F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(8, 25).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 2.0F, 0.3F, -0.12217304763960307F, 0.0F, 0.0F));
            PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(8, 28).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.9F, -1.0F, 0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(4, 29).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.01F, 1.5F, 0.3F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(WarthogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.4F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.166F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.4F;

            this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.43F;
            this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.8f;
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.166F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.4F;
                this.Tail.xRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.43F;
                this.Tail.zRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;

                this.Chest.y = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 18.3F;
                this.Chest.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.122F;
                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.209F;
                this.Hips.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.349F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.227F;
                this.ForearmLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.017F;
                this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.122F;
                this.HandLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.227F;
                this.ForearmRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.017F;
                this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.122F;
                this.HandRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.262F;
                this.UpperLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.698F;
                this.LowerLegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.698F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.262F;
                this.UpperLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.698F;
                this.LowerLegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.698F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}

