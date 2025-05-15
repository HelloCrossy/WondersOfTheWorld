package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.HoopoeEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class HoopoeModel extends ZawaBaseModel<HoopoeEntity> {
    public ModelPart Body;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends HoopoeModel {
        public ModelPart TailBase;
        public ModelPart WingLeft;
        public ModelPart WingRight;
        public ModelPart Neck1;
        public ModelPart LegLeft;
        public ModelPart LegRight;
        public ModelPart TailMiddle;
        public ModelPart TailLeft;
        public ModelPart TailRight;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart UpperBill;
        public ModelPart LowerBill;
        public ModelPart Crest1;
        public ModelPart Crest1_1;
        public ModelPart Crest2;
        public ModelPart Crest3;
        public ModelPart Crest7;
        public ModelPart Crest4;
        public ModelPart Crest5;
        public ModelPart Crest6;
        public ModelPart FootLeft;
        public ModelPart Toe1Left;
        public ModelPart Toe2Left;
        public ModelPart FootRight;
        public ModelPart Toe2Right;
        public ModelPart Toe1Right;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.Crest1 = this.Head.getChild("Crest1");
            this.Crest2 = this.Crest1.getChild("Crest2");
            this.Crest7 = this.Crest2.getChild("Crest7");

            this.Crest3 = this.Crest2.getChild("Crest3");
            this.Crest4 = this.Crest3.getChild("Crest4");
            this.Crest6 = this.Crest4.getChild("Crest6");

            this.Crest5 = this.Crest4.getChild("Crest5");

            this.Crest1_1 = this.Head.getChild("Crest1_1");

            this.UpperBill = this.Head.getChild("UpperBill");

            this.LowerBill = this.Head.getChild("LowerBill");

            this.LegLeft = this.Body.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.LegRight = this.Body.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.WingLeft = this.Body.getChild("WingLeft");

            this.WingRight = this.Body.getChild("WingRight");

            this.TailBase = this.Body.getChild("TailBase");
            this.TailMiddle = this.TailBase.getChild("TailMiddle");
            this.TailRight = this.TailMiddle.getChild("TailRight");

            this.TailLeft = this.TailMiddle.getChild("TailLeft");

            this.Toe1Left = this.FootLeft.getChild("Toe1Left");
            this.Toe1Right = this.FootRight.getChild("Toe1Right");
            this.Toe2Left = this.FootLeft.getChild("Toe2Left");
            this.Toe2Right = this.FootRight.getChild("Toe2Right");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.3F, 0.0F, 0.9217084019466553F, 0.0F, 0.0F));
            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.7285004590772052F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, 0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition Crest1 = Head.addOrReplaceChild("Crest1", CubeListBuilder.create().texOffs(18, 0).addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.9F, 1.0F, 2.321985919674168F, 0.0F, 0.0F));
            PartDefinition Crest2 = Crest1.addOrReplaceChild("Crest2", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5323254218582705F, 0.0F, 0.0F));
            PartDefinition Crest7 = Crest2.addOrReplaceChild("Crest7", CubeListBuilder.create().texOffs(18, 0).addBox(-0.49F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.5F, -0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition Crest3 = Crest2.addOrReplaceChild("Crest3", CubeListBuilder.create().texOffs(28, 0).addBox(-0.51F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.5F, -0.27314402127920984F, 0.0F, 0.0F));
            PartDefinition Crest4 = Crest3.addOrReplaceChild("Crest4", CubeListBuilder.create().texOffs(22, 5).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition Crest6 = Crest4.addOrReplaceChild("Crest6", CubeListBuilder.create().texOffs(18, 0).addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -1.1F, -0.6829473549475088F, 0.0F, 0.0F));

            PartDefinition Crest5 = Crest4.addOrReplaceChild("Crest5", CubeListBuilder.create().texOffs(18, 0).addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -1.1F, -0.6829473549475088F, 0.0F, 0.0F));

            PartDefinition Crest1_1 = Head.addOrReplaceChild("Crest1_1", CubeListBuilder.create().texOffs(18, 0).addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.9F, 1.0F, 2.321985919674168F, 0.0F, 0.0F));

            PartDefinition UpperBill = Head.addOrReplaceChild("UpperBill", CubeListBuilder.create().texOffs(13, 12).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.8F, 0.7F, 0.15690509575954859F, 0.0F, 0.0F));

            PartDefinition LowerBill = Head.addOrReplaceChild("LowerBill", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -2.2F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.9F, 0.3F, 0.009424778335276407F, 0.0F, 0.0F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(11, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 0.7F, -1.1F, 0.18692476355438295F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 5).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.7F, 0.4630358625383205F, 0.0F, 0.0F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(11, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 0.7F, -1.1F, 0.18692476355438295F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(13, 5).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.7F, 0.4630358625383205F, 0.0F, 0.0F));

            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(28, 12).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(1.9F, -1.7F, 1.1F, 0.18692476355438295F, -0.0911061832922575F, 0.13665927909957545F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(19, 12).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(-1.9F, -1.7F, 1.1F, 0.18692476355438295F, 0.0911061832922575F, -0.13665927909957545F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(52, 27).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 2.0F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition TailMiddle = TailBase.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(45, 26).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offset(0.0F, 1.5F, -0.01F));
            PartDefinition TailLeft = TailMiddle.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(35, 27).addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(1.1F, 0.0F, -0.1F, 0.0F, 0.0F, -0.13665927909957545F));

            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(40, 27).addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, 0.0F, -0.1F, 0.0F, 0.0F, 0.13665927909957545F));

            PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
            PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));
            PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));
            PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(HoopoeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.409F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.728F;
            this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.455F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.409F;

            this.TailBase.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.182F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }
    }

    public static class Flying extends HoopoeModel {
        public ModelPart TailBase;
        public ModelPart Neck1;
        public ModelPart LegLeft;
        public ModelPart LegRight;
        public ModelPart Wing1Right;
        public ModelPart Wing1Left;
        public ModelPart TailMiddle;
        public ModelPart TailLeft;
        public ModelPart TailRight;
        public ModelPart Neck2;
        public ModelPart Head;
        public ModelPart UpperBill;
        public ModelPart LowerBill;
        public ModelPart Crest1;
        public ModelPart Crest2;
        public ModelPart Crest12;
        public ModelPart Crest3;
        public ModelPart Crest4;
        public ModelPart Crest32;
        public ModelPart Crest5;
        public ModelPart Crest52;
        public ModelPart FootLeft;
        public ModelPart Toe1Left;
        public ModelPart Toe2Left;
        public ModelPart FootRight;
        public ModelPart Toe2Right;
        public ModelPart Toe1Right;
        public ModelPart Wing2Right;
        public ModelPart WingFeather1Right;
        public ModelPart WingFeather2Right;
        public ModelPart WingFeather3Right;
        public ModelPart WingFeather4Right;
        public ModelPart WingFeather5Right;
        public ModelPart WingFeather6Right;
        public ModelPart RightWingFeather7;
        public ModelPart WingFeather8Right;
        public ModelPart Wing2Left;
        public ModelPart WingFeather1Left;
        public ModelPart WingFeather2Left;
        public ModelPart WingFeather3Left;
        public ModelPart WingFeather4Left;
        public ModelPart WingFeather5Left;
        public ModelPart WingFeather6Left;
        public ModelPart WingFeather7Left;
        public ModelPart WingFeather8Left;

        public Flying(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
            this.WingFeather1Right = this.Wing2Right.getChild("WingFeather1Right");
            this.WingFeather2Right = this.WingFeather1Right.getChild("WingFeather2Right");
            this.WingFeather3Right = this.WingFeather2Right.getChild("WingFeather3Right");
            this.WingFeather4Right = this.WingFeather3Right.getChild("WingFeather4Right");
            this.WingFeather5Right = this.WingFeather4Right.getChild("WingFeather5Right");
            this.WingFeather6Right = this.WingFeather5Right.getChild("WingFeather6Right");
            this.RightWingFeather7 = this.WingFeather6Right.getChild("RightWingFeather7");
            this.WingFeather8Right = this.RightWingFeather7.getChild("WingFeather8Right");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");
            this.WingFeather1Left = this.Wing2Left.getChild("WingFeather1Left");
            this.WingFeather2Left = this.WingFeather1Left.getChild("WingFeather2Left");
            this.WingFeather3Left = this.WingFeather2Left.getChild("WingFeather3Left");
            this.WingFeather4Left = this.WingFeather3Left.getChild("WingFeather4Left");
            this.WingFeather5Left = this.WingFeather4Left.getChild("WingFeather5Left");
            this.WingFeather6Left = this.WingFeather5Left.getChild("WingFeather6Left");
            this.WingFeather7Left = this.WingFeather6Left.getChild("WingFeather7Left");
            this.WingFeather8Left = this.WingFeather7Left.getChild("WingFeather8Left");

            this.LegLeft = this.Body.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.LegRight = this.Body.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.TailBase = this.Body.getChild("TailBase");
            this.TailMiddle = this.TailBase.getChild("TailMiddle");
            this.TailRight = this.TailMiddle.getChild("TailRight");

            this.TailLeft = this.TailMiddle.getChild("TailLeft");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.UpperBill = this.Head.getChild("UpperBill");

            this.Crest1 = this.Head.getChild("Crest1");
            this.Crest12 = this.Crest1.getChild("Crest12");

            this.Crest2 = this.Crest1.getChild("Crest2");
            this.Crest3 = this.Crest2.getChild("Crest3");
            this.Crest32 = this.Crest3.getChild("Crest32");

            this.Crest4 = this.Crest3.getChild("Crest4");
            this.Crest52 = this.Crest4.getChild("Crest52");

            this.Crest5 = this.Crest4.getChild("Crest5");

            this.LowerBill = this.Head.getChild("LowerBill");

            this.Toe2Left = this.FootLeft.getChild("Toe2Left");
            this.Toe1Left = this.FootLeft.getChild("Toe1Left");
            this.Toe1Right = this.FootRight.getChild("Toe1Right");
            this.Toe2Right = this.FootRight.getChild("Toe2Right");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 19.1F, 0.0F, 1.3658947098950176F, 0.0F, 0.0F));
            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(58, 0).addBox(-2.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.9F, -1.9F, 1.0F, 0.0F, 0.500909508638178F, -0.18203784630933073F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(56, 6).addBox(-3.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 4.0F, -0.01F, 0.0F, 0.0F, 0.3642502295386026F));
            PartDefinition WingFeather1Right = Wing2Right.addOrReplaceChild("WingFeather1Right", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, -4.0F, -0.01F, 0.0F, 0.0F, -0.27314402127920984F));
            PartDefinition WingFeather2Right = WingFeather1Right.addOrReplaceChild("WingFeather2Right", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeather3Right = WingFeather2Right.addOrReplaceChild("WingFeather3Right", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeather4Right = WingFeather3Right.addOrReplaceChild("WingFeather4Right", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeather5Right = WingFeather4Right.addOrReplaceChild("WingFeather5Right", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeather6Right = WingFeather5Right.addOrReplaceChild("WingFeather6Right", CubeListBuilder.create().texOffs(52, 12).addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition RightWingFeather7 = WingFeather6Right.addOrReplaceChild("RightWingFeather7", CubeListBuilder.create().texOffs(52, 15).addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition WingFeather8Right = RightWingFeather7.addOrReplaceChild("WingFeather8Right", CubeListBuilder.create().texOffs(52, 18).addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2275909337942703F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(39, 0).addBox(0.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.9F, -1.9F, 1.0F, 0.0F, -0.500909508638178F, 0.18203784630933073F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(39, 6).addBox(0.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 4.0F, -0.01F, 0.0F, 0.0F, -0.4098033003787853F));
            PartDefinition WingFeather1Left = Wing2Left.addOrReplaceChild("WingFeather1Left", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(3.0F, -4.0F, -0.01F, 0.0F, 0.0F, 0.27314402127920984F));
            PartDefinition WingFeather2Left = WingFeather1Left.addOrReplaceChild("WingFeather2Left", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather3Left = WingFeather2Left.addOrReplaceChild("WingFeather3Left", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather4Left = WingFeather3Left.addOrReplaceChild("WingFeather4Left", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather5Left = WingFeather4Left.addOrReplaceChild("WingFeather5Left", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather6Left = WingFeather5Left.addOrReplaceChild("WingFeather6Left", CubeListBuilder.create().texOffs(39, 12).addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather7Left = WingFeather6Left.addOrReplaceChild("WingFeather7Left", CubeListBuilder.create().texOffs(41, 15).addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition WingFeather8Left = WingFeather7Left.addOrReplaceChild("WingFeather8Left", CubeListBuilder.create().texOffs(41, 18).addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2275909337942703F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(11, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.3F, 0.7F, -1.1F, 0.18692476355438295F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 5).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.7F, 0.4630358625383205F, 0.0F, 0.0F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(11, 1).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.3F, 0.7F, -1.1F, 0.18692476355438295F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(13, 5).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -1.7F, 0.4630358625383205F, 0.0F, 0.0F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(52, 27).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 2.0F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition TailMiddle = TailBase.addOrReplaceChild("TailMiddle", CubeListBuilder.create().texOffs(45, 26).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F), PartPose.offset(0.0F, 1.5F, -0.01F));
            PartDefinition TailLeft = TailMiddle.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(40, 27).addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(1.1F, 0.0F, -0.1F, 0.0F, 0.0F, -0.13665927909957545F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, 0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition UpperBill = Head.addOrReplaceChild("UpperBill", CubeListBuilder.create().texOffs(13, 12).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.8F, 0.7F, 0.15690509575954859F, 0.0F, 0.0F));

            PartDefinition Crest1 = Head.addOrReplaceChild("Crest1", CubeListBuilder.create().texOffs(18, 0).addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.9F, 1.0F, 2.321985919674168F, 0.0F, 0.0F));
            PartDefinition Crest12 = Crest1.addOrReplaceChild("Crest12", CubeListBuilder.create().texOffs(18, 0).addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Crest2 = Crest1.addOrReplaceChild("Crest2", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5323254218582705F, 0.0F, 0.0F));
            PartDefinition Crest3 = Crest2.addOrReplaceChild("Crest3", CubeListBuilder.create().texOffs(28, 0).addBox(-0.51F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.5F, -0.27314402127920984F, 0.0F, 0.0F));
            PartDefinition Crest32 = Crest3.addOrReplaceChild("Crest32", CubeListBuilder.create().texOffs(28, 0).addBox(-0.49F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Crest4 = Crest3.addOrReplaceChild("Crest4", CubeListBuilder.create().texOffs(22, 5).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition Crest52 = Crest4.addOrReplaceChild("Crest52", CubeListBuilder.create().texOffs(29, 6).addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -1.1F, -0.6829473549475088F, 0.0F, 0.0F));

            PartDefinition Crest5 = Crest4.addOrReplaceChild("Crest5", CubeListBuilder.create().texOffs(29, 6).addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.4F, -1.1F, -0.6829473549475088F, 0.0F, 0.0F));

            PartDefinition LowerBill = Head.addOrReplaceChild("LowerBill", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -2.2F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.9F, 0.3F, 0.009424778335276407F, 0.0F, 0.0F));

            PartDefinition TailRight = TailMiddle.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(35, 27).addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, 0.0F, -0.1F, 0.0F, 0.0F, 0.13665927909957545F));
            PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));
            PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
            PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));
            PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(13, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(HoopoeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.318F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.819F;
            this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.637F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.318F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.365F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 19.1F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.182F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.186F;
            this.LegRight.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.186F;

            this.Wing1Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.Wing1Left.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.500F;
            this.Wing2Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
            this.Wing2Left.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.Wing1Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.Wing1Right.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.500F;
            this.Wing2Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
            this.Wing2Right.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 2.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.819F;
            this.Neck2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.637F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.318F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.365F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 19.1F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.182F;
            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.186F;
            this.LegRight.xRot = Mth.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.186F;

            this.Wing1Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.Wing1Left.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.500F;
            this.Wing2Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
            this.Wing2Left.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.Wing1Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.Wing1Right.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.500F;
            this.Wing2Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
            this.Wing2Right.yRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }
    }

    public static class Child extends HoopoeModel {
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
        public ModelPart Crest;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.LegRight = this.Body.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.WingRight = this.Body.getChild("WingRight");

            this.LegLeft = this.Body.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.TailBase = this.Body.getChild("TailBase");

            this.Neck1 = this.Body.getChild("Neck1");
            this.Head = this.Neck1.getChild("Head");
            this.Crest = this.Head.getChild("Crest");

            this.UpperBill = this.Head.getChild("UpperBill");

            this.LowerBill = this.Head.getChild("LowerBill");

            this.WingLeft = this.Body.getChild("WingLeft");

            this.Toe1Left = this.FootLeft.getChild("Toe1Left");
            this.Toe2Right = this.FootRight.getChild("Toe2Right");
            this.Toe1Right = this.FootRight.getChild("Toe1Right");
            this.Toe2Left = this.FootLeft.getChild("Toe2Left");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.9F, 0.0F, 1.0471975511965976F, 0.0F, 0.0F));
            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, 0.9F, -1.4F, -0.2275909337942703F, 0.0911061832922575F, -0.18203784630933073F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(38, 0).addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, -1.9F, 1.1F, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 0.9F, -1.4F, -0.2275909337942703F, -0.0911061832922575F, 0.18203784630933073F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 4).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.9F, 0.6829473549475088F, 0.0F, 0.0F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(17, 28).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 2.0F, -0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -1.8F, 0.6373942508178124F, 0.0F, 0.0F));
            PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Crest = Head.addOrReplaceChild("Crest", CubeListBuilder.create().texOffs(0, -4).addBox(0.0F, -0.5F, -1.5F, 0.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.7F, 2.5F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition UpperBill = Head.addOrReplaceChild("UpperBill", CubeListBuilder.create().texOffs(13, 12).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.7F, 1.7F, 0.15690509575954859F, 0.0F, 0.0F));

            PartDefinition LowerBill = Head.addOrReplaceChild("LowerBill", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -2.2F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 1.3F, 0.009424778335276407F, 0.0F, 0.0F));

            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(29, 0).addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.9F, -1.9F, 1.1F, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F));

            PartDefinition Toe1Left = FootLeft.addOrReplaceChild("Toe1Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
            PartDefinition Toe2Right = FootRight.addOrReplaceChild("Toe2Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, 0.591841146688116F));
            PartDefinition Toe1Right = FootRight.addOrReplaceChild("Toe1Right", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.004537855888737689F, 0.0F, -0.591841146688116F));
            PartDefinition Toe2Left = FootLeft.addOrReplaceChild("Toe2Left", CubeListBuilder.create().texOffs(13, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -0.01F, 0.0F, 0.0F, -0.591841146688116F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(HoopoeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.182F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float degree = 1.0F;
            float speed = 1.0F;
            this.Neck1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.637F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.182F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}

