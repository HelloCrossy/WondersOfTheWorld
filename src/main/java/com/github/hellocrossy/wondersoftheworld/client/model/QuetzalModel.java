package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.QuetzalEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class QuetzalModel extends ZawaBaseModel<QuetzalEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends QuetzalModel {
        public ModelPart ThighRight;
        public ModelPart WingFoldedLeft;
        public ModelPart TailBase;
        public ModelPart Chest;
        public ModelPart WingFoldedRight;
        public ModelPart ThighLeft;
        public ModelPart LegRight;
        public ModelPart Toe1R;
        public ModelPart Toe3R;
        public ModelPart Toe2R;
        public ModelPart WingTipLeft;
        public ModelPart Tail1L;
        public ModelPart Tail1R;
        public ModelPart TailCenter;
        public ModelPart Tail1L_1;
        public ModelPart Tail1R_1;
        public ModelPart Tail2L;
        public ModelPart Tail1L_1_1;
        public ModelPart Tail3L;
        public ModelPart Tail1L_1_2;
        public ModelPart Tail2R;
        public ModelPart Tail1R_1_1;
        public ModelPart Tail3L_1;
        public ModelPart Tail1R_1_2;
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart BeakTop;
        public ModelPart HeadTop;
        public ModelPart Hair1;
        public ModelPart Mouth;
        public ModelPart Hair4;
        public ModelPart Hair2;
        public ModelPart Hair3;
        public ModelPart WingTipRight;
        public ModelPart LegLeft;
        public ModelPart Toe1L;
        public ModelPart Toe3L;
        public ModelPart Toe2L;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.Toe1R = this.LegRight.getChild("Toe1R");
            this.Toe2R = this.Toe1R.getChild("Toe2R");

            this.Toe3R = this.Toe1R.getChild("Toe3R");

            this.WingFoldedRight = this.Body.getChild("WingFoldedRight");
            this.WingTipRight = this.WingFoldedRight.getChild("WingTipRight");

            this.Chest = this.Body.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Hair1 = this.Head.getChild("Hair1");
            this.Hair2 = this.Hair1.getChild("Hair2");
            this.Hair3 = this.Hair2.getChild("Hair3");

            this.Hair4 = this.Hair1.getChild("Hair4");

            this.BeakTop = this.Head.getChild("BeakTop");
            this.Mouth = this.BeakTop.getChild("Mouth");

            this.HeadTop = this.Head.getChild("HeadTop");

            this.WingFoldedLeft = this.Body.getChild("WingFoldedLeft");
            this.WingTipLeft = this.WingFoldedLeft.getChild("WingTipLeft");

            this.TailBase = this.Body.getChild("TailBase");
            this.Tail1L = this.TailBase.getChild("Tail1L");
            this.TailCenter = this.Tail1L.getChild("TailCenter");
            this.Tail1L_1 = this.TailCenter.getChild("Tail1L_1");
            this.Tail2L = this.Tail1L_1.getChild("Tail2L");
            this.Tail3L = this.Tail2L.getChild("Tail3L");

            this.Tail1L_1_1 = this.Tail1L_1.getChild("Tail1L_1_1");
            this.Tail1L_1_2 = this.Tail1L_1_1.getChild("Tail1L_1_2");

            this.Tail1R_1 = this.TailCenter.getChild("Tail1R_1");
            this.Tail1R_1_1 = this.Tail1R_1.getChild("Tail1R_1_1");
            this.Tail1R_1_2 = this.Tail1R_1_1.getChild("Tail1R_1_2");

            this.Tail2R = this.Tail1R_1.getChild("Tail2R");
            this.Tail3L_1 = this.Tail2R.getChild("Tail3L_1");

            this.Tail1R = this.Tail1L.getChild("Tail1R");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Toe1L = this.LegLeft.getChild("Toe1L");
            this.Toe2L = this.Toe1L.getChild("Toe2L");

            this.Toe3L = this.Toe1L.getChild("Toe3L");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 18.6F, -0.1F, -0.3604104838789263F, 0.0F, 0.0F));
            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(15, 22).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, 1.4F, 0.3F, 0.7246607134175289F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(12, 26).mirror(true).addBox(-0.48F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, 2.0F, 0.5F, -0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition Toe1R = LegRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(10, 10).mirror(true).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition Toe2R = Toe1R.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, -0.3642502295386026F, 0.0F));

            PartDefinition Toe3R = Toe1R.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, 0.3642502295386026F, 0.0F));

            PartDefinition WingFoldedRight = Body.addOrReplaceChild("WingFoldedRight", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-2.0F, -1.7F, -2.9F, 0.0F, 0.0F, 1.5707963267948966F));
            PartDefinition WingTipRight = WingFoldedRight.addOrReplaceChild("WingTipRight", CubeListBuilder.create().texOffs(50, 6).mirror(true).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(3.2F, 0.4F, 4.9F, 0.10821041029469708F, -0.2275909337942703F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.7F, -2.5F, 0.956091342937205F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.15F, -0.8091346518772156F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.3F, 0.5F, 0.33929201590876146F, 0.0F, 0.0F));
            PartDefinition Hair1 = Head.addOrReplaceChild("Hair1", CubeListBuilder.create().texOffs(17, 26).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.9F, -0.4F, -0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition Hair2 = Hair1.addOrReplaceChild("Hair2", CubeListBuilder.create().texOffs(6, 29).addBox(-0.4F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -0.5F, 0.5864306020384839F, 0.0F, 0.0F));
            PartDefinition Hair3 = Hair2.addOrReplaceChild("Hair3", CubeListBuilder.create().texOffs(6, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.5864306020384839F, 0.0F, 0.0F));

            PartDefinition Hair4 = Hair1.addOrReplaceChild("Hair4", CubeListBuilder.create().texOffs(6, 29).addBox(-0.4F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.5F, -0.5473352640780661F, 0.0F, 0.0F));

            PartDefinition BeakTop = Head.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F, 0.1F, 0.1F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.2F, 0.28012533162928444F, 0.0F, 0.0F));
            PartDefinition Mouth = BeakTop.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 0.5F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition HeadTop = Head.addOrReplaceChild("HeadTop", CubeListBuilder.create().texOffs(10, 29).addBox(-1.0F, -0.5F, -0.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.02F, 0.0F)), PartPose.offset(0.0F, -1.0F, -1.5F));

            PartDefinition WingFoldedLeft = Body.addOrReplaceChild("WingFoldedLeft", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(2.0F, -1.7F, -2.9F, 0.0F, 0.0F, 1.5707963267948966F));
            PartDefinition WingTipLeft = WingFoldedLeft.addOrReplaceChild("WingTipLeft", CubeListBuilder.create().texOffs(50, 6).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(3.2F, -0.4F, 4.9F, -0.10821041029469708F, -0.2275909337942703F, 0.0F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 2.0F, -0.4377285750685973F, 0.0F, 0.0F));
            PartDefinition Tail1L = TailBase.addOrReplaceChild("Tail1L", CubeListBuilder.create().texOffs(18, 6).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.3F, -0.3F, 1.5F, 0.54855698922814F, 0.0F, 0.0F));
            PartDefinition TailCenter = Tail1L.addOrReplaceChild("TailCenter", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-0.3F, -0.2F, 1.5F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Tail1L_1 = TailCenter.addOrReplaceChild("Tail1L_1", CubeListBuilder.create().texOffs(9, 14).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(1.2F, 0.2F, -0.4F, 0.0F, 0.03490658503988659F, 0.0F));
            PartDefinition Tail2L = Tail1L_1.addOrReplaceChild("Tail2L", CubeListBuilder.create().texOffs(18, 14).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.2F, 0.2F, -0.4F, 0.0F, 0.017453292519943295F, 0.0F));
            PartDefinition Tail3L = Tail2L.addOrReplaceChild("Tail3L", CubeListBuilder.create().texOffs(26, 13).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, 0.017453292519943295F, 0.0F));

            PartDefinition Tail1L_1_1 = Tail1L_1.addOrReplaceChild("Tail1L_1_1", CubeListBuilder.create().texOffs(21, 7).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-1.0F, 0.5F, 7.0F, 0.23457224414434488F, 0.19547687289441354F, 0.0F));
            PartDefinition Tail1L_1_2 = Tail1L_1_1.addOrReplaceChild("Tail1L_1_2", CubeListBuilder.create().texOffs(17, 26).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.23457224414434488F, 0.19547687289441354F, 0.0F));

            PartDefinition Tail1R_1 = TailCenter.addOrReplaceChild("Tail1R_1", CubeListBuilder.create().texOffs(9, 14).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(-1.2F, 0.2F, -0.4F, 0.0F, -0.03490658503988659F, 0.0F));
            PartDefinition Tail1R_1_1 = Tail1R_1.addOrReplaceChild("Tail1R_1_1", CubeListBuilder.create().texOffs(21, 7).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(1.0F, 0.5F, 7.0F, 0.23457224414434488F, -0.19547687289441354F, 0.0F));
            PartDefinition Tail1R_1_2 = Tail1R_1_1.addOrReplaceChild("Tail1R_1_2", CubeListBuilder.create().texOffs(17, 26).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.23457224414434488F, -0.19547687289441354F, 0.0F));

            PartDefinition Tail2R = Tail1R_1.addOrReplaceChild("Tail2R", CubeListBuilder.create().texOffs(18, 14).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(-0.2F, 0.2F, -0.4F, 0.0F, -0.017453292519943295F, 0.0F));
            PartDefinition Tail3L_1 = Tail2R.addOrReplaceChild("Tail3L_1", CubeListBuilder.create().texOffs(26, 13).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, -0.017453292519943295F, 0.0F));

            PartDefinition Tail1R = Tail1L.addOrReplaceChild("Tail1R", CubeListBuilder.create().texOffs(18, 6).mirror(true).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.7F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(15, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.2F, 1.4F, 0.3F, 0.7246607134175289F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(12, 26).addBox(-0.52F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 2.0F, 0.5F, -0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition Toe1L = LegLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(10, 10).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition Toe2L = Toe1L.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, -0.3642502295386026F, 0.0F));

            PartDefinition Toe3L = Toe1L.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, 0.3642502295386026F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(QuetzalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.339F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.809F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.339F;

            this.TailBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.437F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }
    }

    public static class Flying extends QuetzalModel {
        public ModelPart ThighRight;
        public ModelPart TailBase;
        public ModelPart Chest;
        public ModelPart ThighLeft;
        public ModelPart Wing1Left;
        public ModelPart Wing1Right;
        public ModelPart LegRight;
        public ModelPart Toe1R;
        public ModelPart Toe3R;
        public ModelPart Toe2R;
        public ModelPart Tail1L;
        public ModelPart Tail1R;
        public ModelPart TailCenter;
        public ModelPart Tail1L_1;
        public ModelPart Tail1R_1;
        public ModelPart Tail2L;
        public ModelPart Tail1L_1_1;
        public ModelPart Tail3L;
        public ModelPart Tail1L_1_2;
        public ModelPart Tail2R;
        public ModelPart Tail1R_1_1;
        public ModelPart Tail3L_1;
        public ModelPart Tail1R_1_2;
        public ModelPart Neck;
        public ModelPart Head;
        public ModelPart BeakTop;
        public ModelPart HeadTop;
        public ModelPart Hair1;
        public ModelPart Mouth;
        public ModelPart Hair4;
        public ModelPart Hair2;
        public ModelPart Hair3;
        public ModelPart LegLeft;
        public ModelPart Toe1L;
        public ModelPart Toe3L;
        public ModelPart Toe2L;
        public ModelPart Wing2Left;
        public ModelPart Wing3Left;
        public ModelPart WingTip1L;
        public ModelPart WingTip2L;
        public ModelPart WingTip3L;
        public ModelPart WingTip4L;
        public ModelPart WingTip5L;
        public ModelPart WingTip6L;
        public ModelPart Wing2Right;
        public ModelPart Wing3Right;
        public ModelPart WingTip1R;
        public ModelPart WingTip2R;
        public ModelPart WingTip3R;
        public ModelPart WingTip4L_1;
        public ModelPart WingTip5R;
        public ModelPart WingTip6R;

        public Flying(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Chest = this.Body.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.HeadTop = this.Head.getChild("HeadTop");

            this.BeakTop = this.Head.getChild("BeakTop");
            this.Mouth = this.BeakTop.getChild("Mouth");

            this.Hair1 = this.Head.getChild("Hair1");
            this.Hair4 = this.Hair1.getChild("Hair4");

            this.Hair2 = this.Hair1.getChild("Hair2");
            this.Hair3 = this.Hair2.getChild("Hair3");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.Toe1R = this.LegRight.getChild("Toe1R");
            this.Toe2R = this.Toe1R.getChild("Toe2R");

            this.Toe3R = this.Toe1R.getChild("Toe3R");

            this.TailBase = this.Body.getChild("TailBase");
            this.Tail1L = this.TailBase.getChild("Tail1L");
            this.Tail1R = this.Tail1L.getChild("Tail1R");

            this.TailCenter = this.Tail1L.getChild("TailCenter");
            this.Tail1L_1 = this.TailCenter.getChild("Tail1L_1");
            this.Tail2L = this.Tail1L_1.getChild("Tail2L");
            this.Tail3L = this.Tail2L.getChild("Tail3L");

            this.Tail1L_1_1 = this.Tail1L_1.getChild("Tail1L_1_1");
            this.Tail1L_1_2 = this.Tail1L_1_1.getChild("Tail1L_1_2");

            this.Tail1R_1 = this.TailCenter.getChild("Tail1R_1");
            this.Tail2R = this.Tail1R_1.getChild("Tail2R");
            this.Tail3L_1 = this.Tail2R.getChild("Tail3L_1");

            this.Tail1R_1_1 = this.Tail1R_1.getChild("Tail1R_1_1");
            this.Tail1R_1_2 = this.Tail1R_1_1.getChild("Tail1R_1_2");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");
            this.Wing3Left = this.Wing2Left.getChild("Wing3Left");
            this.WingTip1L = this.Wing3Left.getChild("WingTip1L");
            this.WingTip2L = this.WingTip1L.getChild("WingTip2L");
            this.WingTip3L = this.WingTip2L.getChild("WingTip3L");
            this.WingTip4L = this.WingTip3L.getChild("WingTip4L");
            this.WingTip5L = this.WingTip4L.getChild("WingTip5L");
            this.WingTip6L = this.WingTip5L.getChild("WingTip6L");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
            this.Wing3Right = this.Wing2Right.getChild("Wing3Right");
            this.WingTip1R = this.Wing3Right.getChild("WingTip1R");
            this.WingTip2R = this.WingTip1R.getChild("WingTip2R");
            this.WingTip3R = this.WingTip2R.getChild("WingTip3R");
            this.WingTip4L_1 = this.WingTip3R.getChild("WingTip4L_1");
            this.WingTip5R = this.WingTip4L_1.getChild("WingTip5R");
            this.WingTip6R = this.WingTip5R.getChild("WingTip6R");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Toe1L = this.LegLeft.getChild("Toe1L");
            this.Toe2L = this.Toe1L.getChild("Toe2L");

            this.Toe3L = this.Toe1L.getChild("Toe3L");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 16.6F, -0.1F, 0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.7F, -2.5F, 1.0342820854370676F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, 0.15F, -0.9655161368769409F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.3F, 0.5F, 0.10471975511965977F, 0.0F, 0.0F));
            PartDefinition HeadTop = Head.addOrReplaceChild("HeadTop", CubeListBuilder.create().texOffs(10, 29).addBox(-1.0F, -0.5F, -0.6F, 2.0F, 2.0F, 1.0F), PartPose.offset(0.0F, -1.0F, -1.5F));

            PartDefinition BeakTop = Head.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F, 0.1F, 0.1F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.2F, 0.28012533162928444F, 0.0F, 0.0F));
            PartDefinition Mouth = BeakTop.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.0F, -1.9F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.7F, 0.5F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition Hair1 = Head.addOrReplaceChild("Hair1", CubeListBuilder.create().texOffs(17, 26).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.9F, -0.4F, -0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition Hair4 = Hair1.addOrReplaceChild("Hair4", CubeListBuilder.create().texOffs(6, 29).addBox(-0.4F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.5F, -0.5473352640780661F, 0.0F, 0.0F));

            PartDefinition Hair2 = Hair1.addOrReplaceChild("Hair2", CubeListBuilder.create().texOffs(6, 29).addBox(-0.4F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -0.5F, 0.5864306020384839F, 0.0F, 0.0F));
            PartDefinition Hair3 = Hair2.addOrReplaceChild("Hair3", CubeListBuilder.create().texOffs(6, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.5864306020384839F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(15, 22).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, 1.4F, 0.3F, 1.0374236834169797F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(12, 26).mirror(true).addBox(-0.48F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, 2.0F, 0.5F, -0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition Toe1R = LegRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(10, 10).mirror(true).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition Toe2R = Toe1R.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, -0.3642502295386026F, 0.0F));

            PartDefinition Toe3R = Toe1R.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, 0.3642502295386026F, 0.0F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 2.0F, -0.4377285750685973F, 0.0F, 0.0F));
            PartDefinition Tail1L = TailBase.addOrReplaceChild("Tail1L", CubeListBuilder.create().texOffs(18, 6).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.3F, -0.3F, 1.5F, 0.31398472843903824F, 0.0F, 0.0F));
            PartDefinition Tail1R = Tail1L.addOrReplaceChild("Tail1R", CubeListBuilder.create().texOffs(18, 6).mirror(true).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F), PartPose.offset(-0.7F, 0.0F, 0.0F));

            PartDefinition TailCenter = Tail1L.addOrReplaceChild("TailCenter", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-0.3F, -0.2F, 1.5F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition Tail1L_1 = TailCenter.addOrReplaceChild("Tail1L_1", CubeListBuilder.create().texOffs(9, 14).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(1.2F, 0.2F, -0.4F, 0.0F, 0.03490658503988659F, 0.0F));
            PartDefinition Tail2L = Tail1L_1.addOrReplaceChild("Tail2L", CubeListBuilder.create().texOffs(18, 14).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.2F, 0.2F, -0.4F, 0.0F, 0.017453292519943295F, 0.0F));
            PartDefinition Tail3L = Tail2L.addOrReplaceChild("Tail3L", CubeListBuilder.create().texOffs(26, 13).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, 0.017453292519943295F, 0.0F));

            PartDefinition Tail1L_1_1 = Tail1L_1.addOrReplaceChild("Tail1L_1_1", CubeListBuilder.create().texOffs(21, 7).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-1.0F, 0.5F, 7.0F, 0.0781907508222411F, 0.19547687289441354F, 0.0F));
            PartDefinition Tail1L_1_2 = Tail1L_1_1.addOrReplaceChild("Tail1L_1_2", CubeListBuilder.create().texOffs(17, 26).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.23457224414434488F, 0.19547687289441354F, 0.0F));

            PartDefinition Tail1R_1 = TailCenter.addOrReplaceChild("Tail1R_1", CubeListBuilder.create().texOffs(9, 14).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(-1.2F, 0.2F, -0.4F, 0.0F, -0.03490658503988659F, 0.0F));
            PartDefinition Tail2R = Tail1R_1.addOrReplaceChild("Tail2R", CubeListBuilder.create().texOffs(18, 14).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(-0.2F, 0.2F, -0.4F, 0.0F, -0.017453292519943295F, 0.0F));
            PartDefinition Tail3L_1 = Tail2R.addOrReplaceChild("Tail3L_1", CubeListBuilder.create().texOffs(26, 13).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, -0.017453292519943295F, 0.0F));

            PartDefinition Tail1R_1_1 = Tail1R_1.addOrReplaceChild("Tail1R_1_1", CubeListBuilder.create().texOffs(21, 7).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(1.0F, 0.5F, 7.0F, 0.0781907508222411F, -0.19547687289441354F, 0.0F));
            PartDefinition Tail1R_1_2 = Tail1R_1_1.addOrReplaceChild("Tail1R_1_2", CubeListBuilder.create().texOffs(17, 26).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.23457224414434488F, -0.19547687289441354F, 0.0F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(48, 10).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(1.5F, -1.0F, -2.5F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(46, 16).addBox(0.0F, -0.5F, -5.0F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(2.0F, 0.02F, 5.0F, 0.0F, 0.18203784630933073F, 0.0F));
            PartDefinition Wing3Left = Wing2Left.addOrReplaceChild("Wing3Left", CubeListBuilder.create().texOffs(46, 22).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(2.0F, 0.02F, -5.0F, 0.0F, -0.27314402127920984F, 0.0F));
            PartDefinition WingTip1L = Wing3Left.addOrReplaceChild("WingTip1L", CubeListBuilder.create().texOffs(36, 25).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(2.0F, 0.02F, 0.0F, 0.0F, 0.18203784630933073F, 0.0F));
            PartDefinition WingTip2L = WingTip1L.addOrReplaceChild("WingTip2L", CubeListBuilder.create().texOffs(36, 25).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.18203784630933073F, 0.0F));
            PartDefinition WingTip3L = WingTip2L.addOrReplaceChild("WingTip3L", CubeListBuilder.create().texOffs(36, 25).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.18203784630933073F, 0.0F));
            PartDefinition WingTip4L = WingTip3L.addOrReplaceChild("WingTip4L", CubeListBuilder.create().texOffs(36, 25).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.18203784630933073F, 0.0F));
            PartDefinition WingTip5L = WingTip4L.addOrReplaceChild("WingTip5L", CubeListBuilder.create().texOffs(36, 25).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.18203784630933073F, 0.0F));
            PartDefinition WingTip6L = WingTip5L.addOrReplaceChild("WingTip6L", CubeListBuilder.create().texOffs(36, 25).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.18203784630933073F, 0.0F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(48, 10).mirror(true).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-1.5F, -1.0F, -2.5F, -0.18203784630933073F, -0.0911061832922575F, 0.0F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(46, 16).mirror(true).addBox(-2.0F, -0.5F, -5.0F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-2.0F, 0.02F, 5.0F, 0.0F, -0.18203784630933073F, 0.0F));
            PartDefinition Wing3Right = Wing2Right.addOrReplaceChild("Wing3Right", CubeListBuilder.create().texOffs(46, 22).mirror(true).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-2.0F, 0.02F, -5.0F, 0.0F, 0.27314402127920984F, 0.0F));
            PartDefinition WingTip1R = Wing3Right.addOrReplaceChild("WingTip1R", CubeListBuilder.create().texOffs(36, 25).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-2.0F, 0.02F, 0.0F, 0.0F, -0.18203784630933073F, 0.0F));
            PartDefinition WingTip2R = WingTip1R.addOrReplaceChild("WingTip2R", CubeListBuilder.create().texOffs(36, 25).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.18203784630933073F, 0.0F));
            PartDefinition WingTip3R = WingTip2R.addOrReplaceChild("WingTip3R", CubeListBuilder.create().texOffs(36, 25).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.18203784630933073F, 0.0F));
            PartDefinition WingTip4L_1 = WingTip3R.addOrReplaceChild("WingTip4L_1", CubeListBuilder.create().texOffs(36, 25).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.18203784630933073F, 0.0F));
            PartDefinition WingTip5R = WingTip4L_1.addOrReplaceChild("WingTip5R", CubeListBuilder.create().texOffs(36, 25).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.18203784630933073F, 0.0F));
            PartDefinition WingTip6R = WingTip5R.addOrReplaceChild("WingTip6R", CubeListBuilder.create().texOffs(36, 25).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.18203784630933073F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(15, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.2F, 1.4F, 0.3F, 1.0374236834169797F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(12, 26).addBox(-0.52F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 2.0F, 0.5F, -0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition Toe1L = LegLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(10, 10).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition Toe2L = Toe1L.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, -0.3642502295386026F, 0.0F));

            PartDefinition Toe3L = Toe1L.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, 0.3642502295386026F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(QuetzalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.104F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F - 0.965F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.104F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.039F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 16.6F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.437F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.819F;
            this.LegRight.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.819F;

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
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F - 0.965F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.104F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.039F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 16.6F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.437F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.819F;
            this.LegRight.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.819F;

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

    public static class Child extends QuetzalModel {
        public ModelPart TailBase;
        public ModelPart LegRight;
        public ModelPart LegLeft;
        public ModelPart WingLeft;
        public ModelPart WingRight;
        public ModelPart Neck1;
        public ModelPart FootRight;
        public ModelPart Toe2Right;
        public ModelPart Toe1Right;
        public ModelPart FootLeft;
        public ModelPart Toe1Left;
        public ModelPart Toe2Left;
        public ModelPart Head;
        public ModelPart UpperBill;
        public ModelPart LowerBill;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.TailBase = this.Body.getChild("TailBase");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Head = this.Neck1.getChild("Head");
            this.LowerBill = this.Head.getChild("LowerBill");

            this.UpperBill = this.Head.getChild("UpperBill");

            this.WingLeft = this.Body.getChild("WingLeft");

            this.LegLeft = this.Body.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Toe1Left = this.FootLeft.getChild("Toe1Left");

            this.Toe2Left = this.FootLeft.getChild("Toe2Left");

            this.WingRight = this.Body.getChild("WingRight");

            this.LegRight = this.Body.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Toe1Right = this.FootRight.getChild("Toe1Right");

            this.Toe2Right = this.FootRight.getChild("Toe2Right");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.9F, 0.0F, 1.411447814024714F, 0.0F, 0.0F));
            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(17, 28).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -1.5F, 0.7285004590772052F, 0.0F, 0.0F));
            PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition LowerBill = Head.addOrReplaceChild("LowerBill", CubeListBuilder.create().texOffs(5, 1).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.6F, 0.3F, -0.489739378788545F, 0.0F, 0.0F));

            PartDefinition UpperBill = Head.addOrReplaceChild("UpperBill", CubeListBuilder.create().texOffs(0, 1).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 2.0F, 0.5855579507282921F, 0.0F, 0.0F));

            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(29, 0).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.9F, -1.9F, 1.1F, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 0.9F, -1.4F, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(38, 0).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, -1.9F, 1.1F, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, 0.9F, -1.4F, -0.500909508638178F, 0.04555309164612875F, -0.4098033003787853F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));
            PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.004537855888737689F, 0.0F, -0.591841146688116F));

            PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(QuetzalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.637F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float degree = 1.0F;
            float speed = 1.0F;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.728F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}


