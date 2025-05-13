package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.HammerkopEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class HammerkopModel extends ZawaBaseModel<HammerkopEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends HammerkopModel {
        public ModelPart WingLeft1;
        public ModelPart WingRight1;
        public ModelPart Chest;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart TailBase;
        public ModelPart WingLeft2;
        public ModelPart WingRight2;
        public ModelPart NeckBase;
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart Beak;
        public ModelPart Feather2;
        public ModelPart Feather3;
        public ModelPart Feather1;
        public ModelPart Mouth;
        public ModelPart BeakTop;
        public ModelPart Leg1Left;
        public ModelPart Leg2Left;
        public ModelPart FootLeft;
        public ModelPart Toe1L;
        public ModelPart Toe2L;
        public ModelPart Toe3L;
        public ModelPart Leg1Right;
        public ModelPart Leg2Right;
        public ModelPart FootRight;
        public ModelPart Toe2R;
        public ModelPart Toe1R;
        public ModelPart Toe3R;
        public ModelPart Tail;
        public ModelPart TailCenter;
        public ModelPart TailFeather1R;
        public ModelPart TailFeather1L;
        public ModelPart TailFeather2R;
        public ModelPart TailFeather3R;
        public ModelPart TailFeather4R;
        public ModelPart TailFeather2L;
        public ModelPart TailFeather3L;
        public ModelPart TailFeather4L;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.TailBase = this.Body.getChild("TailBase");
            this.WingLeft2 = this.WingLeft1.getChild("WingLeft2");
            this.Toe2L = this.FootLeft.getChild("Toe2L");
            this.TailFeather4L = this.TailFeather3L.getChild("TailFeather4L");
            this.Leg2Left = this.Leg1Left.getChild("Leg2Left");
            this.TailFeather2L = this.TailFeather1L.getChild("TailFeather2L");
            this.Head = this.Neck.getChild("Head");
            this.Leg1Left = this.ThighLeft.getChild("Leg1Left");
            this.Mouth = this.Beak.getChild("Mouth");
            this.Toe3R = this.FootRight.getChild("Toe3R");
            this.Neck = this.NeckBase.getChild("Neck");
            this.Feather3 = this.Head.getChild("Feather3");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Leg1Right = this.ThighRight.getChild("Leg1Right");
            this.TailCenter = this.Tail.getChild("TailCenter");
            this.Toe1R = this.FootRight.getChild("Toe1R");
            this.Toe2R = this.FootRight.getChild("Toe2R");
            this.Leg2Right = this.Leg1Right.getChild("Leg2Right");
            this.TailFeather1R = this.TailCenter.getChild("TailFeather1R");
            this.Chest = this.Body.getChild("Chest");
            this.BeakTop = this.Mouth.getChild("BeakTop");
            this.TailFeather3L = this.TailFeather2L.getChild("TailFeather3L");
            this.TailFeather3R = this.TailFeather2R.getChild("TailFeather3R");
            this.WingRight2 = this.WingRight1.getChild("WingRight2");
            this.Toe1L = this.FootLeft.getChild("Toe1L");
            this.Beak = this.Head.getChild("Beak");
            this.Feather1 = this.Head.getChild("Feather1");
            this.TailFeather2R = this.TailFeather1R.getChild("TailFeather2R");
            this.WingRight1 = this.Body.getChild("WingRight1");
            this.FootLeft = this.Leg2Left.getChild("FootLeft");
            this.Tail = this.TailBase.getChild("Tail");
            this.Feather2 = this.Head.getChild("Feather2");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.FootRight = this.Leg2Right.getChild("FootRight");
            this.NeckBase = this.Chest.getChild("NeckBase");
            this.Toe3L = this.FootLeft.getChild("Toe3L");
            this.TailFeather1L = this.TailCenter.getChild("TailFeather1L");
            this.WingLeft1 = this.Body.getChild("WingLeft1");
            this.TailFeather4R = this.TailFeather3R.getChild("TailFeather4R");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.1F, 4.8F, 0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingLeft2", CubeListBuilder.create().texOffs(15, 31).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(1.0F, 1.8F, 5.0F, 0.0F, -0.2617993877991494F, 0.0F));
            partDefinition.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(32, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, 0.6710791107076252F, 0.0F));
            partDefinition.addOrReplaceChild("TailFeather4L", CubeListBuilder.create().texOffs(52, 12).addBox(0.0F, 0.0F, -0.4F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.13962634015954636F, 0.0F));
            partDefinition.addOrReplaceChild("Leg2Left", CubeListBuilder.create().texOffs(18, 47).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -0.44994589314836303F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailFeather2L", CubeListBuilder.create().texOffs(27, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.10471975511965977F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 0.3F, 0.38798668472885617F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Leg1Left", CubeListBuilder.create().texOffs(18, 44).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-0.4F, 1.9F, -0.5F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -0.7F, -0.24382250116413973F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(20, 52).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 51).addBox(-2.5F, -2.5F, -3.0F, 5.0F, 5.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 14.6F, -1.0F, -0.474555032938322F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.17261306901435164F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Feather3", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.6F, 0.11641346243960232F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 40).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.7F, 1.3F, 1.0F, 0.7445574562376199F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Leg1Right", CubeListBuilder.create().texOffs(18, 44).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.4F, 1.9F, -0.5F));
            partDefinition.addOrReplaceChild("TailCenter", CubeListBuilder.create().texOffs(13, 6).addBox(-1.0F, 0.0F, -0.7F, 2.0F, 1.0F, 5.0F), PartPose.offset(0.0F, -1.9F, 2.0F));
            partDefinition.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(32, 56).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, -0.6710791107076252F, 0.0F));
            partDefinition.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(18, 56).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, 0.6710791107076252F, 0.0F));
            partDefinition.addOrReplaceChild("Leg2Right", CubeListBuilder.create().texOffs(18, 47).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -0.44994589314836303F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailFeather1R", CubeListBuilder.create().texOffs(13, 12).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(-0.5F, 0.2F, -2.4F, 0.0F, -0.08726646259971647F, -0.3490658503988659F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -3.0F, 0.7721336903770634F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -0.1F, 0.15411257161951875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailFeather3L", CubeListBuilder.create().texOffs(41, 13).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.13962634015954636F, 0.0F));
            partDefinition.addOrReplaceChild("TailFeather3R", CubeListBuilder.create().texOffs(41, 13).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.12217304763960307F, 0.0F));
            partDefinition.addOrReplaceChild("WingRight2", CubeListBuilder.create().texOffs(15, 31).mirror(true).addBox(0.0F, -1.5F, 0.0F, 1.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-1.0F, 1.8F, 5.0F, 0.0F, 0.2617993877991494F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(18, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, -0.6710791107076252F, 0.0F));
            partDefinition.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F, 0.1F, 0.1F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, 0.672300835857699F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Feather1", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 1.5F, -0.30927233146917027F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailFeather2R", CubeListBuilder.create().texOffs(27, 12).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.10471975511965977F, 0.0F));
            partDefinition.addOrReplaceChild("WingRight1", CubeListBuilder.create().texOffs(14, 21).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 5.0F), PartPose.offset(-2.0F, -2.6F, -1.4F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(25, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 4.0F, -0.5F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(14, 0).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.1F, 2.6F, -0.004712389167638204F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Feather2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.8F, -0.24033184598910243F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 40).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.7F, 1.3F, 1.0F, 0.7445574562376199F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(25, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 4.0F, -0.5F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.44907320854865773F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(20, 52).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailFeather1L", CubeListBuilder.create().texOffs(13, 12).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.5F, 0.2F, -2.4F, 0.0F, 0.08726646259971647F, 0.3490658503988659F));
            partDefinition.addOrReplaceChild("WingLeft1", CubeListBuilder.create().texOffs(14, 21).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 5.0F), PartPose.offset(2.0F, -2.6F, -1.4F));
            partDefinition.addOrReplaceChild("TailFeather4R", CubeListBuilder.create().texOffs(52, 12).mirror(true).addBox(-1.0F, 0.0F, -0.4F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.12217304763960307F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(HammerkopEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
            this.NeckBase.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.387F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.NeckBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.449F;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.17F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.387F;

            this.TailBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.078F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }
    }

    public static class Flying extends HammerkopModel {
        public ModelPart Chest;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart TailBase;
        public ModelPart Wing1Left;
        public ModelPart Wing1Right;
        public ModelPart NeckBase;
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart Beak;
        public ModelPart Feather2;
        public ModelPart Feather3;
        public ModelPart Feather1;
        public ModelPart Mouth;
        public ModelPart BeakTop;
        public ModelPart Leg1Left;
        public ModelPart Leg2Left;
        public ModelPart FootLeft;
        public ModelPart Toe1L;
        public ModelPart Toe2L;
        public ModelPart Toe3L;
        public ModelPart Leg1Right;
        public ModelPart Leg2Right;
        public ModelPart FootRight;
        public ModelPart Toe2R;
        public ModelPart Toe1R;
        public ModelPart Toe3R;
        public ModelPart Tail;
        public ModelPart TailCenter;
        public ModelPart TailFeather1R;
        public ModelPart TailFeather1L;
        public ModelPart TailFeather2R;
        public ModelPart TailFeather3R;
        public ModelPart TailFeather4R;
        public ModelPart TailFeather2L;
        public ModelPart TailFeather3L;
        public ModelPart TailFeather4L;
        public ModelPart Wing2Left;
        public ModelPart Wing3Left;
        public ModelPart WingTip1L;
        public ModelPart WingTip2L;
        public ModelPart WingTip3L;
        public ModelPart WingTip4L;
        public ModelPart WingTip5L;
        public ModelPart WingTip6L;
        public ModelPart WingTip7L;
        public ModelPart WingTip8L;
        public ModelPart Wing2Right;
        public ModelPart Wing3Right;
        public ModelPart WingTip1R;
        public ModelPart WingTip2R;
        public ModelPart WingTip3R;
        public ModelPart WingTip4R;
        public ModelPart WingTip5R;
        public ModelPart WingTip6R;
        public ModelPart WingTip7R;
        public ModelPart WingTip8R;

        public Flying(ModelPart root) {
            this.Body = root.getChild("Body");
            this.WingTip8L = this.WingTip7L.getChild("WingTip8L");
            this.Tail = this.TailBase.getChild("Tail");
            this.Feather1 = this.Head.getChild("Feather1");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.TailFeather3R = this.TailFeather2R.getChild("TailFeather3R");
            this.TailBase = this.Body.getChild("TailBase");
            this.WingTip4R = this.WingTip3R.getChild("WingTip4R");
            this.WingTip6L = this.WingTip5L.getChild("WingTip6L");
            this.TailFeather3L = this.TailFeather2L.getChild("TailFeather3L");
            this.WingTip2L = this.WingTip1L.getChild("WingTip2L");
            this.WingTip7L = this.WingTip6L.getChild("WingTip7L");
            this.WingTip5R = this.WingTip4R.getChild("WingTip5R");
            this.WingTip4L = this.WingTip3L.getChild("WingTip4L");
            this.Toe3L = this.FootLeft.getChild("Toe3L");
            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.WingTip5L = this.WingTip4L.getChild("WingTip5L");
            this.TailFeather4L = this.TailFeather3L.getChild("TailFeather4L");
            this.WingTip2R = this.WingTip1R.getChild("WingTip2R");
            this.TailFeather4R = this.TailFeather3R.getChild("TailFeather4R");
            this.Chest = this.Body.getChild("Chest");
            this.Feather2 = this.Head.getChild("Feather2");
            this.WingTip8R = this.WingTip7R.getChild("WingTip8R");
            this.WingTip6R = this.WingTip5R.getChild("WingTip6R");
            this.Neck = this.NeckBase.getChild("Neck");
            this.Wing3Right = this.Wing2Right.getChild("Wing3Right");
            this.Toe1L = this.FootLeft.getChild("Toe1L");
            this.Toe3R = this.FootRight.getChild("Toe3R");
            this.Toe1R = this.FootRight.getChild("Toe1R");
            this.Wing3Left = this.Wing2Left.getChild("Wing3Left");
            this.Feather3 = this.Head.getChild("Feather3");
            this.FootRight = this.Leg2Right.getChild("FootRight");
            this.TailFeather1R = this.TailCenter.getChild("TailFeather1R");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");
            this.TailFeather1L = this.TailCenter.getChild("TailFeather1L");
            this.WingTip1R = this.Wing3Right.getChild("WingTip1R");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
            this.Mouth = this.Beak.getChild("Mouth");
            this.WingTip1L = this.Wing3Left.getChild("WingTip1L");
            this.Toe2R = this.FootRight.getChild("Toe2R");
            this.NeckBase = this.Chest.getChild("NeckBase");
            this.TailCenter = this.Tail.getChild("TailCenter");
            this.WingTip7R = this.WingTip6R.getChild("WingTip7R");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.TailFeather2R = this.TailFeather1R.getChild("TailFeather2R");
            this.BeakTop = this.Mouth.getChild("BeakTop");
            this.Leg2Left = this.Leg1Left.getChild("Leg2Left");
            this.Beak = this.Head.getChild("Beak");
            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.WingTip3L = this.WingTip2L.getChild("WingTip3L");
            this.Leg1Right = this.ThighRight.getChild("Leg1Right");
            this.TailFeather2L = this.TailFeather1L.getChild("TailFeather2L");
            this.FootLeft = this.Leg2Left.getChild("FootLeft");
            this.Head = this.Neck.getChild("Head");
            this.Leg1Left = this.ThighLeft.getChild("Leg1Left");
            this.WingTip3R = this.WingTip2R.getChild("WingTip3R");
            this.Toe2L = this.FootLeft.getChild("Toe2L");
            this.Leg2Right = this.Leg1Right.getChild("Leg2Right");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("WingTip8L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(14, 0).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.1F, 2.6F, 0.15166910467461422F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Feather1", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 1.5F, -0.30927233146917027F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 40).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.7F, 1.3F, 1.0F, 1.289100196175656F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailFeather3R", CubeListBuilder.create().texOffs(41, 13).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.12217304763960307F, 0.0F));
            partDefinition.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.1F, 4.8F, -0.23474678106428595F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingTip4R", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            partDefinition.addOrReplaceChild("WingTip6L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            partDefinition.addOrReplaceChild("TailFeather3L", CubeListBuilder.create().texOffs(41, 13).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.12217304763960307F, 0.0F));
            partDefinition.addOrReplaceChild("WingTip2L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            partDefinition.addOrReplaceChild("WingTip7L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            partDefinition.addOrReplaceChild("WingTip5R", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            partDefinition.addOrReplaceChild("WingTip4L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            partDefinition.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(20, 52).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(30, 27).addBox(-1.0F, 0.0F, 0.0F, 5.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(2.5F, -1.0F, -2.8F, 1.5707963267948966F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingTip5L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            partDefinition.addOrReplaceChild("TailFeather4L", CubeListBuilder.create().texOffs(52, 12).addBox(0.0F, 0.0F, -0.4F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.12217304763960307F, 0.0F));
            partDefinition.addOrReplaceChild("WingTip2R", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            partDefinition.addOrReplaceChild("TailFeather4R", CubeListBuilder.create().texOffs(52, 12).mirror(true).addBox(-1.0F, 0.0F, -0.4F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.12217304763960307F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -3.0F, 1.3194688878761023F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Feather2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.4F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.7F, 0.8F, -0.24033184598910243F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingTip8R", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            partDefinition.addOrReplaceChild("WingTip6R", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.5635668314479355F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Wing3Right", CubeListBuilder.create().texOffs(38, 19).mirror(true).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, -7.0F, -0.1F, 0.0F, 0.0F, -0.20001473294434044F));
            partDefinition.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(18, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, -0.6710791107076252F, 0.0F));
            partDefinition.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(20, 52).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(32, 56).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, -0.6710791107076252F, 0.0F));
            partDefinition.addOrReplaceChild("Wing3Left", CubeListBuilder.create().texOffs(38, 19).addBox(0.0F, 0.0F, 0.0F, 3.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(3.0F, -7.0F, -0.1F, 0.0F, 0.0F, 0.20001473294434044F));
            partDefinition.addOrReplaceChild("Feather3", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.6F, 0.11641346243960232F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(25, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 4.0F, -0.5F, 0.9564404167770872F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailFeather1R", CubeListBuilder.create().texOffs(13, 12).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(-0.5F, 0.2F, -2.4F, 0.0F, -0.12217304763960307F, -0.3490658503988659F));
            partDefinition.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(30, 19).addBox(0.0F, -7.0F, 0.0F, 3.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(4.0F, 7.0F, -0.1F, 0.0F, 0.0F, -0.20001473294434044F));
            partDefinition.addOrReplaceChild("TailFeather1L", CubeListBuilder.create().texOffs(13, 12).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.5F, 0.2F, -2.4F, 0.0F, 0.12217304763960307F, 0.3490658503988659F));
            partDefinition.addOrReplaceChild("WingTip1R", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18203784630933073F));
            partDefinition.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(30, 19).mirror(true).addBox(-3.0F, -7.0F, 0.0F, 3.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(-4.0F, 7.0F, -0.1F, 0.0F, 0.0F, 0.20001473294434044F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -0.7F, -0.24382250116413973F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingTip1L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.13665927909957545F));
            partDefinition.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(18, 56).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, 0.6710791107076252F, 0.0F));
            partDefinition.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.3319616317188048F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailCenter", CubeListBuilder.create().texOffs(13, 6).addBox(-1.0F, 0.0F, -0.7F, 2.0F, 1.0F, 5.0F), PartPose.offset(0.0F, -1.9F, 2.0F));
            partDefinition.addOrReplaceChild("WingTip7R", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 51).addBox(-2.5F, -2.5F, -3.0F, 5.0F, 5.0F, 8.0F), PartPose.offset(0.0F, 14.6F, -1.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 40).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.7F, 1.3F, 1.0F, 1.289100196175656F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailFeather2R", CubeListBuilder.create().texOffs(27, 12).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.12217304763960307F, 0.0F));
            partDefinition.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -0.1F, 0.15411257161951875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Leg2Left", CubeListBuilder.create().texOffs(18, 47).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -0.11868239246456576F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F, 0.1F, 0.1F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, 0.672300835857699F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(30, 27).mirror(true).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(-2.5F, -1.0F, -2.8F, 1.5707963267948966F, 0.0F, -0.0F));
            partDefinition.addOrReplaceChild("WingTip3L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            partDefinition.addOrReplaceChild("Leg1Right", CubeListBuilder.create().texOffs(18, 44).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.4F, 1.9F, -0.5F));
            partDefinition.addOrReplaceChild("TailFeather2L", CubeListBuilder.create().texOffs(27, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.12217304763960307F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(25, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 4.0F, -0.5F, 0.9564404167770872F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 0.9F, -0.3157300643489353F, -0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Leg1Left", CubeListBuilder.create().texOffs(18, 44).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-0.4F, 1.9F, -0.5F));
            partDefinition.addOrReplaceChild("WingTip3R", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            partDefinition.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(32, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, 0.6710791107076252F, 0.0F));
            partDefinition.addOrReplaceChild("Leg2Right", CubeListBuilder.create().texOffs(18, 47).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -0.11868239246456576F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(HammerkopEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.315F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.NeckBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F - 0.331F;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.563F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.315F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 14.6F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.234F;
            this.Leg1Left.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F;
            this.Leg1Right.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 2.0f;
            float degree = 1.0f;
            this.NeckBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F - 0.331F;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.563F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.315F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 14.6F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.234F;
            this.Leg1Left.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F;
            this.Leg1Right.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F;
 }
    }

    public static class Child extends HammerkopModel {
        public ModelPart WingLeft;
        public ModelPart WingRight;
        public ModelPart ThighRight;
        public ModelPart Tail;
        public ModelPart ThighLeft;
        public ModelPart Chest;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Toe2R;
        public ModelPart Toe1R;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart Toe1L;
        public ModelPart Toe2L;
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart Feather1;
        public ModelPart Feather2;
        public ModelPart Feather3;
        public ModelPart Beak;
        public ModelPart Mouth;
        public ModelPart BeakTop;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Feather1 = this.Head.getChild("Feather1");
            this.WingLeft = this.Body.getChild("WingLeft");
            this.Feather3 = this.Head.getChild("Feather3");
            this.BeakTop = this.Mouth.getChild("BeakTop");
            this.Chest = this.Body.getChild("Chest");
            this.Toe2L = this.FootLeft.getChild("Toe2L");
            this.Feather2 = this.Head.getChild("Feather2");
            this.Beak = this.Head.getChild("Beak");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.Mouth = this.Beak.getChild("Mouth");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Toe2R = this.FootRight.getChild("Toe2R");
            this.Neck = this.Chest.getChild("Neck");
            this.WingRight = this.Body.getChild("WingRight");
            this.Tail = this.Body.getChild("Tail");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.Toe1L = this.FootLeft.getChild("Toe1L");
            this.Head = this.Neck.getChild("Head");
            this.Toe1R = this.FootRight.getChild("Toe1R");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(10, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, -1.9123572560838649F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Feather1", CubeListBuilder.create().texOffs(24, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.9F, 1.5F, -0.30927233146917027F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(12, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(2.0F, -1.0F, -2.0F, 0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Feather3", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, 0.11641346243960232F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(21, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.1F, 0.15411257161951875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(12, 22).addBox(-1.5F, -4.0F, -2.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.1F, -2.5F, -0.46914448828868976F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, 0.27314403792396663F, 0.0F));
            partDefinition.addOrReplaceChild("Feather2", CubeListBuilder.create().texOffs(24, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.8F, -0.24033184598910243F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(22, 12).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F, 0.1F, 0.1F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, 0.672300835857699F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(15, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, 0.2F, 0.0F, 1.0016444470669013F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(21, 7).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.8F, -0.7F, -0.24382250116413973F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 1.3735740680563155F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 1.3735740680563155F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, 0.27314403792396663F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -2.0F, 0.8217010437968634F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(12, 13).mirror(true).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, 0.04555309164612875F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 25).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 1.5F, 0.3642502295386026F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.2F, 0.2F, 0.0F, 1.0016444470669013F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(10, 10).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, -1.9123572560838649F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, -0.27314403792396663F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.3F, -0.2F, 0.19181168079943517F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, -0.27314403792396663F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 20.2F, 0.0F, -0.4628613256183795F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(HammerkopEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.182F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float degree = 1.0F;
            float speed = 1.0F;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.637F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.182F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}
