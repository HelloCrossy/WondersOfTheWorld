package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.HammerkopEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
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
            this.Tail = this.TailBase.getChild("Tail");
            this.TailCenter = this.Tail.getChild("TailCenter");
            this.TailFeather1R = this.TailCenter.getChild("TailFeather1R");
            this.TailFeather2R = this.TailFeather1R.getChild("TailFeather2R");
            this.TailFeather3R = this.TailFeather2R.getChild("TailFeather3R");
            this.TailFeather4R = this.TailFeather3R.getChild("TailFeather4R");

            this.TailFeather1L = this.TailCenter.getChild("TailFeather1L");
            this.TailFeather2L = this.TailFeather1L.getChild("TailFeather2L");
            this.TailFeather3L = this.TailFeather2L.getChild("TailFeather3L");
            this.TailFeather4L = this.TailFeather3L.getChild("TailFeather4L");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Leg1Left = this.ThighLeft.getChild("Leg1Left");
            this.Leg2Left = this.Leg1Left.getChild("Leg2Left");
            this.FootLeft = this.Leg2Left.getChild("FootLeft");
            this.Toe2L = this.FootLeft.getChild("Toe2L");

            this.Toe1L = this.FootLeft.getChild("Toe1L");

            this.Toe3L = this.FootLeft.getChild("Toe3L");

            this.Chest = this.Body.getChild("Chest");
            this.NeckBase = this.Chest.getChild("NeckBase");
            this.Neck = this.NeckBase.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Feather3 = this.Head.getChild("Feather3");

            this.Beak = this.Head.getChild("Beak");
            this.Mouth = this.Beak.getChild("Mouth");
            this.BeakTop = this.Mouth.getChild("BeakTop");

            this.Feather1 = this.Head.getChild("Feather1");

            this.Feather2 = this.Head.getChild("Feather2");

            this.WingRight1 = this.Body.getChild("WingRight1");
            this.WingRight2 = this.WingRight1.getChild("WingRight2");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.Leg1Right = this.ThighRight.getChild("Leg1Right");
            this.Leg2Right = this.Leg1Right.getChild("Leg2Right");
            this.FootRight = this.Leg2Right.getChild("FootRight");
            this.Toe3R = this.FootRight.getChild("Toe3R");

            this.Toe1R = this.FootRight.getChild("Toe1R");

            this.Toe2R = this.FootRight.getChild("Toe2R");

            this.WingLeft1 = this.Body.getChild("WingLeft1");
            this.WingLeft2 = this.WingLeft1.getChild("WingLeft2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 51).addBox(-2.5F, -2.5F, -3.0F, 5.0F, 5.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 14.6F, -1.0F, -0.474555032938322F, -0.0F, 0.0F));
            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.1F, 4.8F, 0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Tail = TailBase.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(14, 0).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.1F, 2.6F, -0.004712389167638204F, 0.0F, 0.0F));
            PartDefinition TailCenter = Tail.addOrReplaceChild("TailCenter", CubeListBuilder.create().texOffs(13, 6).addBox(-1.0F, 0.0F, -0.7F, 2.0F, 1.0F, 5.0F), PartPose.offset(0.0F, -1.9F, 2.0F));
            PartDefinition TailFeather1R = TailCenter.addOrReplaceChild("TailFeather1R", CubeListBuilder.create().texOffs(13, 12).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(-0.5F, 0.2F, -2.4F, 0.0F, -0.08726646259971647F, -0.3490658503988659F));
            PartDefinition TailFeather2R = TailFeather1R.addOrReplaceChild("TailFeather2R", CubeListBuilder.create().texOffs(27, 12).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.10471975511965977F, 0.0F));
            PartDefinition TailFeather3R = TailFeather2R.addOrReplaceChild("TailFeather3R", CubeListBuilder.create().texOffs(41, 13).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.12217304763960307F, 0.0F));
            PartDefinition TailFeather4R = TailFeather3R.addOrReplaceChild("TailFeather4R", CubeListBuilder.create().texOffs(52, 12).mirror(true).addBox(-1.0F, 0.0F, -0.4F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.12217304763960307F, 0.0F));

            PartDefinition TailFeather1L = TailCenter.addOrReplaceChild("TailFeather1L", CubeListBuilder.create().texOffs(13, 12).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.5F, 0.2F, -2.4F, 0.0F, 0.08726646259971647F, 0.3490658503988659F));
            PartDefinition TailFeather2L = TailFeather1L.addOrReplaceChild("TailFeather2L", CubeListBuilder.create().texOffs(27, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.10471975511965977F, 0.0F));
            PartDefinition TailFeather3L = TailFeather2L.addOrReplaceChild("TailFeather3L", CubeListBuilder.create().texOffs(41, 13).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.13962634015954636F, 0.0F));
            PartDefinition TailFeather4L = TailFeather3L.addOrReplaceChild("TailFeather4L", CubeListBuilder.create().texOffs(52, 12).addBox(0.0F, 0.0F, -0.4F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.13962634015954636F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 40).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.7F, 1.3F, 1.0F, 0.7445574562376199F, 0.0F, 0.0F));
            PartDefinition Leg1Left = ThighLeft.addOrReplaceChild("Leg1Left", CubeListBuilder.create().texOffs(18, 44).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-0.4F, 1.9F, -0.5F));
            PartDefinition Leg2Left = Leg1Left.addOrReplaceChild("Leg2Left", CubeListBuilder.create().texOffs(18, 47).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -0.44994589314836303F, 0.0F, 0.0F));
            PartDefinition FootLeft = Leg2Left.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(25, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 4.0F, -0.5F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition Toe2L = FootLeft.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(32, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, 0.6710791107076252F, 0.0F));

            PartDefinition Toe1L = FootLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(18, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, -0.6710791107076252F, 0.0F));

            PartDefinition Toe3L = FootLeft.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(20, 52).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -3.0F, 0.7721336903770634F, 0.0F, 0.0F));
            PartDefinition NeckBase = Chest.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.44907320854865773F, 0.0F, 0.0F));
            PartDefinition Neck = NeckBase.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.17261306901435164F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 0.3F, 0.38798668472885617F, -0.0F, 0.0F));
            PartDefinition Feather3 = Head.addOrReplaceChild("Feather3", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.6F, 0.11641346243960232F, 0.0F, 0.0F));

            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F, 0.1F, 0.1F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, 0.672300835857699F, 0.0F, 0.0F));
            PartDefinition Mouth = Beak.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -0.7F, -0.24382250116413973F, 0.0F, 0.0F));
            PartDefinition BeakTop = Mouth.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -0.1F, 0.15411257161951875F, 0.0F, 0.0F));

            PartDefinition Feather1 = Head.addOrReplaceChild("Feather1", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 1.5F, -0.30927233146917027F, 0.0F, 0.0F));

            PartDefinition Feather2 = Head.addOrReplaceChild("Feather2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.8F, -0.24033184598910243F, 0.0F, 0.0F));

            PartDefinition WingRight1 = Body.addOrReplaceChild("WingRight1", CubeListBuilder.create().texOffs(14, 21).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 5.0F), PartPose.offset(-2.0F, -2.6F, -1.4F));
            PartDefinition WingRight2 = WingRight1.addOrReplaceChild("WingRight2", CubeListBuilder.create().texOffs(15, 31).mirror(true).addBox(0.0F, -1.5F, 0.0F, 1.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(-1.0F, 1.8F, 5.0F, 0.0F, 0.2617993877991494F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 40).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.7F, 1.3F, 1.0F, 0.7445574562376199F, 0.0F, 0.0F));
            PartDefinition Leg1Right = ThighRight.addOrReplaceChild("Leg1Right", CubeListBuilder.create().texOffs(18, 44).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.4F, 1.9F, -0.5F));
            PartDefinition Leg2Right = Leg1Right.addOrReplaceChild("Leg2Right", CubeListBuilder.create().texOffs(18, 47).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -0.44994589314836303F, 0.0F, 0.0F));
            PartDefinition FootRight = Leg2Right.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(25, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 4.0F, -0.5F, 0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition Toe3R = FootRight.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(20, 52).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(32, 56).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, -0.6710791107076252F, 0.0F));

            PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(18, 56).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, 0.6710791107076252F, 0.0F));

            PartDefinition WingLeft1 = Body.addOrReplaceChild("WingLeft1", CubeListBuilder.create().texOffs(14, 21).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 5.0F), PartPose.offset(2.0F, -2.6F, -1.4F));
            PartDefinition WingLeft2 = WingLeft1.addOrReplaceChild("WingLeft2", CubeListBuilder.create().texOffs(15, 31).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(1.0F, 1.8F, 5.0F, 0.0F, -0.2617993877991494F, 0.0F));

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
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.Leg1Left = this.ThighLeft.getChild("Leg1Left");
            this.Leg2Left = this.Leg1Left.getChild("Leg2Left");
            this.FootLeft = this.Leg2Left.getChild("FootLeft");
            this.Toe3L = this.FootLeft.getChild("Toe3L");

            this.Toe1L = this.FootLeft.getChild("Toe1L");

            this.Toe2L = this.FootLeft.getChild("Toe2L");

            this.TailBase = this.Body.getChild("TailBase");
            this.Tail = this.TailBase.getChild("Tail");
            this.TailCenter = this.Tail.getChild("TailCenter");
            this.TailFeather1R = this.TailCenter.getChild("TailFeather1R");
            this.TailFeather2R = this.TailFeather1R.getChild("TailFeather2R");
            this.TailFeather3R = this.TailFeather2R.getChild("TailFeather3R");
            this.TailFeather4R = this.TailFeather3R.getChild("TailFeather4R");

            this.TailFeather1L = this.TailCenter.getChild("TailFeather1L");
            this.TailFeather2L = this.TailFeather1L.getChild("TailFeather2L");
            this.TailFeather3L = this.TailFeather2L.getChild("TailFeather3L");
            this.TailFeather4L = this.TailFeather3L.getChild("TailFeather4L");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");
            this.Wing3Left = this.Wing2Left.getChild("Wing3Left");
            this.WingTip1L = this.Wing3Left.getChild("WingTip1L");
            this.WingTip2L = this.WingTip1L.getChild("WingTip2L");
            this.WingTip3L = this.WingTip2L.getChild("WingTip3L");
            this.WingTip4L = this.WingTip3L.getChild("WingTip4L");
            this.WingTip5L = this.WingTip4L.getChild("WingTip5L");
            this.WingTip6L = this.WingTip5L.getChild("WingTip6L");
            this.WingTip7L = this.WingTip6L.getChild("WingTip7L");
            this.WingTip8L = this.WingTip7L.getChild("WingTip8L");

            this.Chest = this.Body.getChild("Chest");
            this.NeckBase = this.Chest.getChild("NeckBase");
            this.Neck = this.NeckBase.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Feather1 = this.Head.getChild("Feather1");

            this.Feather2 = this.Head.getChild("Feather2");

            this.Feather3 = this.Head.getChild("Feather3");

            this.Beak = this.Head.getChild("Beak");
            this.Mouth = this.Beak.getChild("Mouth");
            this.BeakTop = this.Mouth.getChild("BeakTop");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.Leg1Right = this.ThighRight.getChild("Leg1Right");
            this.Leg2Right = this.Leg1Right.getChild("Leg2Right");
            this.FootRight = this.Leg2Right.getChild("FootRight");
            this.Toe3R = this.FootRight.getChild("Toe3R");

            this.Toe1R = this.FootRight.getChild("Toe1R");

            this.Toe2R = this.FootRight.getChild("Toe2R");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
            this.Wing3Right = this.Wing2Right.getChild("Wing3Right");
            this.WingTip1R = this.Wing3Right.getChild("WingTip1R");
            this.WingTip2R = this.WingTip1R.getChild("WingTip2R");
            this.WingTip3R = this.WingTip2R.getChild("WingTip3R");
            this.WingTip4R = this.WingTip3R.getChild("WingTip4R");
            this.WingTip5R = this.WingTip4R.getChild("WingTip5R");
            this.WingTip6R = this.WingTip5R.getChild("WingTip6R");
            this.WingTip7R = this.WingTip6R.getChild("WingTip7R");
            this.WingTip8R = this.WingTip7R.getChild("WingTip8R");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 51).addBox(-2.5F, -2.5F, -3.0F, 5.0F, 5.0F, 8.0F), PartPose.offset(0.0F, 14.6F, -1.0F));
            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 40).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.7F, 1.3F, 1.0F, 1.289100196175656F, 0.0F, 0.0F));
            PartDefinition Leg1Left = ThighLeft.addOrReplaceChild("Leg1Left", CubeListBuilder.create().texOffs(18, 44).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-0.4F, 1.9F, -0.5F));
            PartDefinition Leg2Left = Leg1Left.addOrReplaceChild("Leg2Left", CubeListBuilder.create().texOffs(18, 47).addBox(0.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -0.11868239246456576F, 0.0F, 0.0F));
            PartDefinition FootLeft = Leg2Left.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(25, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 4.0F, -0.5F, 0.9564404167770872F, 0.0F, 0.0F));
            PartDefinition Toe3L = FootLeft.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(20, 52).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Toe1L = FootLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(18, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, -0.6710791107076252F, 0.0F));

            PartDefinition Toe2L = FootLeft.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(32, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, 0.6710791107076252F, 0.0F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.1F, 4.8F, -0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition Tail = TailBase.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(14, 0).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.1F, 2.6F, 0.15166910467461422F, 0.0F, 0.0F));
            PartDefinition TailCenter = Tail.addOrReplaceChild("TailCenter", CubeListBuilder.create().texOffs(13, 6).addBox(-1.0F, 0.0F, -0.7F, 2.0F, 1.0F, 5.0F), PartPose.offset(0.0F, -1.9F, 2.0F));
            PartDefinition TailFeather1R = TailCenter.addOrReplaceChild("TailFeather1R", CubeListBuilder.create().texOffs(13, 12).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(-0.5F, 0.2F, -2.4F, 0.0F, -0.12217304763960307F, -0.3490658503988659F));
            PartDefinition TailFeather2R = TailFeather1R.addOrReplaceChild("TailFeather2R", CubeListBuilder.create().texOffs(27, 12).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.12217304763960307F, 0.0F));
            PartDefinition TailFeather3R = TailFeather2R.addOrReplaceChild("TailFeather3R", CubeListBuilder.create().texOffs(41, 13).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.12217304763960307F, 0.0F));
            PartDefinition TailFeather4R = TailFeather3R.addOrReplaceChild("TailFeather4R", CubeListBuilder.create().texOffs(52, 12).mirror(true).addBox(-1.0F, 0.0F, -0.4F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, -0.12217304763960307F, 0.0F));

            PartDefinition TailFeather1L = TailCenter.addOrReplaceChild("TailFeather1L", CubeListBuilder.create().texOffs(13, 12).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.5F, 0.2F, -2.4F, 0.0F, 0.12217304763960307F, 0.3490658503988659F));
            PartDefinition TailFeather2L = TailFeather1L.addOrReplaceChild("TailFeather2L", CubeListBuilder.create().texOffs(27, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.12217304763960307F, 0.0F));
            PartDefinition TailFeather3L = TailFeather2L.addOrReplaceChild("TailFeather3L", CubeListBuilder.create().texOffs(41, 13).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.12217304763960307F, 0.0F));
            PartDefinition TailFeather4L = TailFeather3L.addOrReplaceChild("TailFeather4L", CubeListBuilder.create().texOffs(52, 12).addBox(0.0F, 0.0F, -0.4F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.12217304763960307F, 0.0F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(30, 27).addBox(-1.0F, 0.0F, 0.0F, 5.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(2.5F, -1.0F, -2.8F, 1.5707963267948966F, -0.0F, 0.0F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(30, 19).addBox(0.0F, -7.0F, 0.0F, 3.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(4.0F, 7.0F, -0.1F, 0.0F, 0.0F, -0.20001473294434044F));
            PartDefinition Wing3Left = Wing2Left.addOrReplaceChild("Wing3Left", CubeListBuilder.create().texOffs(38, 19).addBox(0.0F, 0.0F, 0.0F, 3.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(3.0F, -7.0F, -0.1F, 0.0F, 0.0F, 0.20001473294434044F));
            PartDefinition WingTip1L = Wing3Left.addOrReplaceChild("WingTip1L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition WingTip2L = WingTip1L.addOrReplaceChild("WingTip2L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            PartDefinition WingTip3L = WingTip2L.addOrReplaceChild("WingTip3L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            PartDefinition WingTip4L = WingTip3L.addOrReplaceChild("WingTip4L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            PartDefinition WingTip5L = WingTip4L.addOrReplaceChild("WingTip5L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            PartDefinition WingTip6L = WingTip5L.addOrReplaceChild("WingTip6L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            PartDefinition WingTip7L = WingTip6L.addOrReplaceChild("WingTip7L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));
            PartDefinition WingTip8L = WingTip7L.addOrReplaceChild("WingTip8L", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.18901915665940536F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -3.0F, 1.3194688878761023F, 0.0F, 0.0F));
            PartDefinition NeckBase = Chest.addOrReplaceChild("NeckBase", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.3319616317188048F, 0.0F, 0.0F));
            PartDefinition Neck = NeckBase.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.5635668314479355F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 0.9F, -0.3157300643489353F, -0.0F, 0.0F));
            PartDefinition Feather1 = Head.addOrReplaceChild("Feather1", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 1.5F, -0.30927233146917027F, 0.0F, 0.0F));

            PartDefinition Feather2 = Head.addOrReplaceChild("Feather2", CubeListBuilder.create().texOffs(0, 28).addBox(-0.4F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.7F, 0.8F, -0.24033184598910243F, 0.0F, 0.0F));

            PartDefinition Feather3 = Head.addOrReplaceChild("Feather3", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.6F, 0.11641346243960232F, 0.0F, 0.0F));

            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F, 0.1F, 0.1F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, 0.672300835857699F, 0.0F, 0.0F));
            PartDefinition Mouth = Beak.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -0.7F, -0.24382250116413973F, 0.0F, 0.0F));
            PartDefinition BeakTop = Mouth.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -0.1F, 0.15411257161951875F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 40).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.7F, 1.3F, 1.0F, 1.289100196175656F, 0.0F, 0.0F));
            PartDefinition Leg1Right = ThighRight.addOrReplaceChild("Leg1Right", CubeListBuilder.create().texOffs(18, 44).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.4F, 1.9F, -0.5F));
            PartDefinition Leg2Right = Leg1Right.addOrReplaceChild("Leg2Right", CubeListBuilder.create().texOffs(18, 47).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -0.11868239246456576F, 0.0F, 0.0F));
            PartDefinition FootRight = Leg2Right.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(25, 56).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 4.0F, -0.5F, 0.9564404167770872F, 0.0F, 0.0F));
            PartDefinition Toe3R = FootRight.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(20, 52).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(32, 56).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, -0.6710791107076252F, 0.0F));

            PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(18, 56).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 0.2F, 0.0F, 0.6710791107076252F, 0.0F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(30, 27).mirror(true).addBox(-4.0F, 0.0F, 0.0F, 5.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(-2.5F, -1.0F, -2.8F, 1.5707963267948966F, 0.0F, -0.0F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(30, 19).mirror(true).addBox(-3.0F, -7.0F, 0.0F, 3.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(-4.0F, 7.0F, -0.1F, 0.0F, 0.0F, 0.20001473294434044F));
            PartDefinition Wing3Right = Wing2Right.addOrReplaceChild("Wing3Right", CubeListBuilder.create().texOffs(38, 19).mirror(true).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, -7.0F, -0.1F, 0.0F, 0.0F, -0.20001473294434044F));
            PartDefinition WingTip1R = Wing3Right.addOrReplaceChild("WingTip1R", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18203784630933073F));
            PartDefinition WingTip2R = WingTip1R.addOrReplaceChild("WingTip2R", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            PartDefinition WingTip3R = WingTip2R.addOrReplaceChild("WingTip3R", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            PartDefinition WingTip4R = WingTip3R.addOrReplaceChild("WingTip4R", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            PartDefinition WingTip5R = WingTip4R.addOrReplaceChild("WingTip5R", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            PartDefinition WingTip6R = WingTip5R.addOrReplaceChild("WingTip6R", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            PartDefinition WingTip7R = WingTip6R.addOrReplaceChild("WingTip7R", CubeListBuilder.create().texOffs(32, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));
            PartDefinition WingTip8R = WingTip7R.addOrReplaceChild("WingTip8R", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.18901915665940536F));

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

            this.Wing1Left.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F;
            this.Wing1Left.zRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F;
            this.Wing2Left.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.Wing2Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.Wing1Right.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.091F;
            this.Wing1Right.zRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F;
            this.Wing2Right.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.Wing2Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
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

            this.Wing1Left.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F;
            this.Wing1Left.zRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F;
            this.Wing2Left.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.Wing2Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.Wing1Right.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.091F;
            this.Wing1Right.zRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F;
            this.Wing2Right.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.Wing2Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
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
            this.WingLeft = this.Body.getChild("WingLeft");

            this.Chest = this.Body.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Feather1 = this.Head.getChild("Feather1");

            this.Feather3 = this.Head.getChild("Feather3");

            this.Feather2 = this.Head.getChild("Feather2");

            this.Beak = this.Head.getChild("Beak");
            this.Mouth = this.Beak.getChild("Mouth");
            this.BeakTop = this.Mouth.getChild("BeakTop");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Toe2R = this.FootRight.getChild("Toe2R");

            this.Toe1R = this.FootRight.getChild("Toe1R");

            this.WingRight = this.Body.getChild("WingRight");

            this.Tail = this.Body.getChild("Tail");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Toe1L = this.FootLeft.getChild("Toe1L");

            this.Toe2L = this.FootLeft.getChild("Toe2L");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 20.2F, 0.0F, -0.4628613256183795F, 0.0F, 0.0F));
            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(12, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(2.0F, -1.0F, -2.0F, 0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(12, 22).addBox(-1.5F, -4.0F, -2.0F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.1F, -2.5F, -0.46914448828868976F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -2.0F, 0.8217010437968634F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.3F, -0.2F, 0.19181168079943517F, 0.0F, 0.0F));
            PartDefinition Feather1 = Head.addOrReplaceChild("Feather1", CubeListBuilder.create().texOffs(24, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.9F, 1.5F, -0.30927233146917027F, 0.0F, 0.0F));

            PartDefinition Feather3 = Head.addOrReplaceChild("Feather3", CubeListBuilder.create().texOffs(26, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.6F, 0.11641346243960232F, 0.0F, 0.0F));

            PartDefinition Feather2 = Head.addOrReplaceChild("Feather2", CubeListBuilder.create().texOffs(24, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.8F, -0.24033184598910243F, 0.0F, 0.0F));

            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(22, 12).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F, 0.1F, 0.1F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, 0.672300835857699F, 0.0F, 0.0F));
            PartDefinition Mouth = Beak.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(21, 7).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.8F, -0.7F, -0.24382250116413973F, 0.0F, 0.0F));
            PartDefinition BeakTop = Mouth.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(21, 12).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.1F, 0.15411257161951875F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(15, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, 0.2F, 0.0F, 1.0016444470669013F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(10, 10).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, -1.9123572560838649F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 1.3735740680563155F, 0.0F, 0.0F));
            PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, 0.27314403792396663F, 0.0F));

            PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(23, 0).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, -0.27314403792396663F, 0.0F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(12, 13).mirror(true).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, 0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 25).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 1.5F, 0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.2F, 0.2F, 0.0F, 1.0016444470669013F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(10, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, -1.9123572560838649F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 1.3735740680563155F, 0.0F, 0.0F));
            PartDefinition Toe1L = FootLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, -0.27314403792396663F, 0.0F));

            PartDefinition Toe2L = FootLeft.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0911061832922575F, 0.27314403792396663F, 0.0F));

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
