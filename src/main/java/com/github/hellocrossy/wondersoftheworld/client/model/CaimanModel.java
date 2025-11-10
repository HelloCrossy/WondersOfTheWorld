package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.CaimanEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class CaimanModel extends ZawaBaseModel<CaimanEntity> {
    public ModelPart Chest;
    protected Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends CaimanModel {
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart part26;
        public ModelPart part26_1;
        public ModelPart part26_2;
        public ModelPart part26_3;
        public ModelPart UpperArmRight;
        public ModelPart UpperArmLeft;
        public ModelPart Hips;
        public ModelPart part26_4;
        public ModelPart part26_5;
        public ModelPart part26_6;
        public ModelPart part26_7;
        public ModelPart part26_8;
        public ModelPart Tail1;
        public ModelPart part26_9;
        public ModelPart part26_10;
        public ModelPart part26_11;
        public ModelPart part26_12;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart part26_13;
        public ModelPart part26_14;
        public ModelPart part26_15;
        public ModelPart part26_16;
        public ModelPart part26_17;
        public ModelPart Tail3;
        public ModelPart TailTop2;
        public ModelPart Tail4;
        public ModelPart TailTop3;
        public ModelPart TailTop4;
        public ModelPart part26_18;
        public ModelPart part26_19;
        public ModelPart part26_20;
        public ModelPart part26_21;
        public ModelPart part26_22;
        public ModelPart part26_23;
        public ModelPart part26_24;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart Throat2;
        public ModelPart part26_25;
        public ModelPart part26_26;
        public ModelPart part26_27;
        public ModelPart part26_28;
        public ModelPart ForeHead;
        public ModelPart Snout;
        public ModelPart Jaw;
        public ModelPart EyeLeft;
        public ModelPart EyeRight;
        public ModelPart Nose;
        public ModelPart TopTeethLeft;
        public ModelPart TopTeethRight;
        public ModelPart Mouth;
        public ModelPart Throat;
        public ModelPart LowerTeethLeft;
        public ModelPart LowerTeethRight;
        public ModelPart Throat3;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.part26_4 = this.Body.getChild("part26_4");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Throat3 = this.Throat2.getChild("Throat3");
            this.TailTop4 = this.Tail4.getChild("TailTop4");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Throat2 = this.Neck.getChild("Throat2");
            this.part26_21 = this.TailTop3.getChild("part26_21");
            this.part26_3 = this.Chest.getChild("part26_3");
            this.Neck = this.Chest.getChild("Neck");
            this.part26_25 = this.Neck.getChild("part26_25");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.part26_15 = this.Tail1.getChild("part26_15");
            this.part26_18 = this.TailTop4.getChild("part26_18");
            this.part26_28 = this.Neck.getChild("part26_28");
            this.Mouth = this.Jaw.getChild("Mouth");
            this.part26_9 = this.Hips.getChild("part26_9");
            this.part26_1 = this.Chest.getChild("part26_1");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.EyeLeft = this.ForeHead.getChild("EyeLeft");
            this.LowerTeethRight = this.Mouth.getChild("LowerTeethRight");
            this.part26_10 = this.Hips.getChild("part26_10");
            this.part26_2 = this.Chest.getChild("part26_2");
            this.Body = this.Chest.getChild("Body");
            this.Throat = this.Mouth.getChild("Throat");
            this.TailTop2 = this.Tail2.getChild("TailTop2");
            this.Hips = this.Body.getChild("Hips");
            this.Nose = this.Snout.getChild("Nose");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.part26_23 = this.TailTop2.getChild("part26_23");
            this.part26_26 = this.Neck.getChild("part26_26");
            this.Jaw = this.Head.getChild("Jaw");
            this.part26_14 = this.Tail1.getChild("part26_14");
            this.part26_16 = this.Tail1.getChild("part26_16");
            this.TopTeethLeft = this.Snout.getChild("TopTeethLeft");
            this.part26_24 = this.TailTop2.getChild("part26_24");
            this.LowerTeethLeft = this.Mouth.getChild("LowerTeethLeft");
            this.part26_27 = this.Neck.getChild("part26_27");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.part26_17 = this.Tail1.getChild("part26_17");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.part26_8 = this.Body.getChild("part26_8");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.part26_7 = this.Body.getChild("part26_7");
            this.part26_19 = this.TailTop3.getChild("part26_19");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.ForeHead = this.Head.getChild("ForeHead");
            this.part26_5 = this.Body.getChild("part26_5");
            this.TopTeethRight = this.Snout.getChild("TopTeethRight");
            this.part26_6 = this.Body.getChild("part26_6");
            this.Snout = this.Head.getChild("Snout");
            this.part26_12 = this.Hips.getChild("part26_12");
            this.part26_20 = this.TailTop3.getChild("part26_20");
            this.TailTop3 = this.Tail3.getChild("TailTop3");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.part26 = this.Chest.getChild("part26");
            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.part26_13 = this.Tail1.getChild("part26_13");
            this.part26_22 = this.TailTop2.getChild("part26_22");
            this.Head = this.Neck.getChild("Head");
            this.part26_11 = this.Hips.getChild("part26_11");
            this.EyeRight = this.ForeHead.getChild("EyeRight");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("part26_4", CubeListBuilder.create().texOffs(16, 1).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 9.0F), PartPose.offset(-3.4F, -0.1F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(22, 16).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 6.6F, 0.2343977238691606F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Throat3", CubeListBuilder.create().texOffs(29, 37).addBox(-1.0F, -1.6F, -3.8F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.0F, -0.27366763203903305F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailTop4", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, -3.1F, 0.7F, -0.5473352640780661F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(35, 14).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 6.0F, 3.4906584259663615E-4F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Throat2", CubeListBuilder.create().texOffs(17, 40).addBox(-1.5F, 0.0F, -1.2F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.039269908169872414F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_21", CubeListBuilder.create().texOffs(16, 9).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.6F, -0.038920842652368684F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_3", CubeListBuilder.create().texOffs(21, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(-2.9F, -2.6F, -2.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 43).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -2.0F, -0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 18.8F, -5.5F, 0.11746065899211351F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_25", CubeListBuilder.create().texOffs(20, 5).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(2.0F, -0.1F, -4.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(52, 6).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.3F, -0.2F, -3.2F, -1.275486649315389F, 0.004188790111159634F, 0.8196066007575706F));
            partDefinition.addOrReplaceChild("part26_15", CubeListBuilder.create().texOffs(19, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_18", CubeListBuilder.create().texOffs(17, 12).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -0.7F, -0.038920842652368684F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_28", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(-2.0F, -0.1F, -4.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(17, 25).addBox(-1.5F, 0.1F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.21F, 0.0F, 0.1F)), PartPose.offset(0.0F, 0.0F, -4.0F));
            partDefinition.addOrReplaceChild("part26_9", CubeListBuilder.create().texOffs(20, 5).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(2.9F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_1", CubeListBuilder.create().texOffs(21, 6).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(1.0F, -2.6F, -2.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(31, 0).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-3.6F, 2.8F, 1.9F, 0.0F, -0.41887902047863906F, -0.8726646259971648F));
            partDefinition.addOrReplaceChild("EyeLeft", CubeListBuilder.create().texOffs(12, 20).addBox(0.0F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.8F, -0.9F, -0.5F, -0.19547687289441354F, 0.23457224414434488F, 0.0F));
            partDefinition.addOrReplaceChild("LowerTeethRight", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, -0.4F, -5.0F, 0.0F, 1.0F, 7.0F), PartPose.offset(-1.2F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_10", CubeListBuilder.create().texOffs(20, 5).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(0.9F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_2", CubeListBuilder.create().texOffs(21, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(-1.0F, -2.6F, -2.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(21, 49).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 6.0F, 9.0F), PartPose.offsetAndRotation(0.0F, -2.6F, 1.9F, -0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Throat", CubeListBuilder.create().texOffs(31, 24).addBox(-1.0F, -0.6F, 0.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.2F, 0.0F, 0.1F)), PartPose.offsetAndRotation(0.0F, 0.7F, -5.0F, -0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailTop2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.7F, 0.0F, 3.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, 0.03909537541112055F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(42, 39).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 8.9F, -0.27366763203903305F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(4, 25).addBox(-1.0F, -1.2F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -4.1F, 0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(41, 6).mirror(true).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, 0.2F, 0.6F, 0.6283185307179586F, 0.767944870877505F, 0.08726646259971647F));
            partDefinition.addOrReplaceChild("part26_23", CubeListBuilder.create().texOffs(16, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -2.3F, 1.0F, 0.23474678106428595F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_26", CubeListBuilder.create().texOffs(20, 5).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(0.6F, -0.1F, -4.0F));
            partDefinition.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(17, 32).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.15F, 0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 0.0F, -0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_14", CubeListBuilder.create().texOffs(19, 4).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(1.4F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_16", CubeListBuilder.create().texOffs(19, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(-1.4F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopTeethLeft", CubeListBuilder.create().texOffs(21, 0).mirror(true).addBox(0.0F, 0.2F, -5.0F, 0.0F, 1.0F, 8.0F), PartPose.offset(1.3F, 0.4F, -0.3F));
            partDefinition.addOrReplaceChild("part26_24", CubeListBuilder.create().texOffs(19, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(-1.4F, -2.3F, 1.0F));
            partDefinition.addOrReplaceChild("LowerTeethLeft", CubeListBuilder.create().texOffs(22, 0).mirror(true).addBox(0.0F, -0.4F, -5.0F, 0.0F, 1.0F, 7.0F), PartPose.offset(1.2F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_27", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(-0.6F, -0.1F, -4.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(1.5F, -0.1F, -0.1F, -0.44121924688839137F, 0.29461156308925684F, -0.3141592653589793F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(41, 6).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.5F, 0.2F, 0.6F, 0.6283185307179586F, -0.767944870877505F, -0.08726646259971647F));
            partDefinition.addOrReplaceChild("part26_17", CubeListBuilder.create().texOffs(19, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(-2.4F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(42, 16).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 2.7F, 5.4F, 0.15655603856442327F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 0).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 4.0F, -0.4363323129985824F, 0.22689280275926282F, 0.8726646259971648F));
            partDefinition.addOrReplaceChild("part26_8", CubeListBuilder.create().texOffs(16, 1).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 9.0F), PartPose.offset(3.4F, -0.1F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(3.6F, 2.8F, 1.9F, 0.0F, 0.41887902047863906F, 0.8726646259971648F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(45, 0).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-1.5F, -0.1F, -0.1F, -0.4363323129985824F, -0.2792526803190927F, 0.3141592653589793F));
            partDefinition.addOrReplaceChild("part26_7", CubeListBuilder.create().texOffs(16, 1).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 9.0F), PartPose.offset(2.0F, -0.1F, 0.0F));
            partDefinition.addOrReplaceChild("part26_19", CubeListBuilder.create().texOffs(20, 5).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(0.9F, 0.0F, 1.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(42, 27).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 4.5F, -0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForeHead", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -0.4F, -2.1F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F, 0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.9F, 0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_5", CubeListBuilder.create().texOffs(16, 1).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 9.0F), PartPose.offset(-2.0F, -0.1F, 0.0F));
            partDefinition.addOrReplaceChild("TopTeethRight", CubeListBuilder.create().texOffs(21, 0).addBox(0.0F, 0.0F, -5.0F, 0.0F, 1.0F, 8.0F), PartPose.offset(-1.3F, 0.4F, -0.3F));
            partDefinition.addOrReplaceChild("part26_6", CubeListBuilder.create().texOffs(16, 1).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 9.0F), PartPose.offset(0.0F, -0.1F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, -0.2F, -5.2F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F, 0.2F, 0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, -0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_12", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(-2.9F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_20", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(-0.9F, 0.0F, 1.0F));
            partDefinition.addOrReplaceChild("TailTop3", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 0.2F, -0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 4.0F, -0.42795474057849286F, -0.24364796424419868F, -0.8761552978169589F));
            partDefinition.addOrReplaceChild("part26", CubeListBuilder.create().texOffs(21, 6).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(2.9F, -2.6F, -2.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(32, 9).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-3.0F, 0.6F, -0.4F, 0.17453292519943295F, 0.12217304763960307F, -0.767944870877505F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(52, 6).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.3F, -0.2F, -3.2F, -1.2845623028362156F, 0.004188790111159634F, -0.8196066007575706F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(32, 9).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(3.0F, 0.6F, -0.4F, 0.17453292519943295F, -0.12217304763960307F, 0.767944870877505F));
            partDefinition.addOrReplaceChild("part26_13", CubeListBuilder.create().texOffs(19, 4).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(2.4F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_22", CubeListBuilder.create().texOffs(19, 4).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(1.4F, -2.3F, 1.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -3.3F, 0.39112828270876815F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_11", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(-0.9F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EyeRight", CubeListBuilder.create().texOffs(12, 20).mirror(true).addBox(-1.0F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.8F, -0.9F, -0.5F, -0.19547687289441354F, -0.23457224414434488F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(CaimanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.195F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.391F;
            this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.3F * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2F;
            float degree = 1.0F;

            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 1.4F;
                degree = 0.8F;

                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.195F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.391F;

                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.117F;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount;

                this.UpperArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.174F;
                this.UpperArmLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount - 0.122F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount - 3.9F;
                this.ArmLeft.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 5.3F;
                this.HandLeft.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 1.0F;
                this.UpperArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.174F;
                this.UpperArmRight.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.122F;
                this.ArmRight.xRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount - 3.9F;
                this.ArmRight.yRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 5.3F;
                this.HandRight.zRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 1.0F;

                this.ThighLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
                this.ThighLeft.zRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount + 1.6F;
                this.ThighLeft.y = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 2.8F;
                this.LegLeft.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 1.8F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.1F;
                this.ThighRight.yRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.5F;
                this.ThighRight.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount - 1.6F;
                this.ThighRight.y = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 2.8F;
                this.LegRight.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.8F;
                this.FootRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.1F;

                this.Tail1.xRot = 0F;
                this.Tail2.xRot = 0F;
                this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -1.9F * limbSwingAmount;
                this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -2.1F * limbSwingAmount;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 1.9F * limbSwingAmount;

            } else {
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.9F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.195F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.9F) * degree * -0.05F * limbSwingAmount * 0.5F + 0.391F;

                this.Body.xRot = -0.117F;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -0.9F * limbSwingAmount * 0.5F;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;

                this.LegLeft.zRot = -0.314F;
                this.LegRight.zRot = 0.314F;
                this.ThighLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F + 0.418F;
                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F;
                this.ThighLeft.zRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.872F;
                this.ThighLeft.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -15.0F * limbSwingAmount * 0.5F + 1.9F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.441F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.427F;
                this.FootLeft.zRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.876F;
                this.ThighRight.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.418F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -1.2F * limbSwingAmount * 0.5F;
                this.ThighRight.zRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 15.0F * limbSwingAmount * 0.5F + 1.9F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.441F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.436F;
                this.FootRight.zRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.872F;

                this.UpperArmLeft.xRot = 0.174F;
                this.UpperArmLeft.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmLeft.yRot = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.122F;
                this.ArmLeft.yRot = -0.767F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandLeft.zRot = -0.819F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 1.284F;
                this.UpperArmRight.xRot = 0.174F;
                this.UpperArmRight.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmRight.yRot = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.122F;
                this.ArmRight.yRot = 0.767F;
                this.ArmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandRight.zRot = 0.819F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 1.275F;

                this.Tail1.xRot = -0.078F;
                this.Tail2.xRot = 0.156F;
                this.Tail1.yRot = Mth.cos(5.0F + limbSwing * speed * 0.45F) * degree * -1.1F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -1.5F * limbSwingAmount * 0.5F;
            }
        }
    }

    public static class Child extends CaimanModel {

        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart part26;
        public ModelPart part26_1;
        public ModelPart part26_2;
        public ModelPart part26_3;
        public ModelPart UpperArmRight;
        public ModelPart UpperArmLeft;
        public ModelPart Hips;
        public ModelPart part26_4;
        public ModelPart part26_5;
        public ModelPart part26_6;
        public ModelPart part26_7;
        public ModelPart part26_8;
        public ModelPart Tail1;
        public ModelPart part26_9;
        public ModelPart part26_10;
        public ModelPart part26_11;
        public ModelPart part26_12;
        public ModelPart ThighLeft;
        public ModelPart ThighRight;
        public ModelPart Tail2;
        public ModelPart part26_13;
        public ModelPart part26_14;
        public ModelPart part26_15;
        public ModelPart part26_16;
        public ModelPart part26_17;
        public ModelPart Tail3;
        public ModelPart TailTop2;
        public ModelPart Tail4;
        public ModelPart TailTop3;
        public ModelPart TailTop4;
        public ModelPart part26_18;
        public ModelPart part26_19;
        public ModelPart part26_20;
        public ModelPart part26_21;
        public ModelPart part26_22;
        public ModelPart part26_23;
        public ModelPart part26_24;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart Head;
        public ModelPart Throat2;
        public ModelPart part26_25;
        public ModelPart part26_26;
        public ModelPart part26_27;
        public ModelPart part26_28;
        public ModelPart ForeHead;
        public ModelPart Snout;
        public ModelPart Jaw;
        public ModelPart EyeLeft;
        public ModelPart EyeRight;
        public ModelPart Nose;
        public ModelPart TopTeethLeft;
        public ModelPart TopTeethRight;
        public ModelPart Mouth;
        public ModelPart Throat;
        public ModelPart LowerTeethLeft;
        public ModelPart LowerTeethRight;
        public ModelPart Throat3;
        public ModelPart ArmRight;
        public ModelPart HandRight;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.part26_4 = this.Body.getChild("part26_4");
            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Throat3 = this.Throat2.getChild("Throat3");
            this.TailTop4 = this.Tail4.getChild("TailTop4");
            this.Tail4 = this.Tail3.getChild("Tail4");
            this.Throat2 = this.Neck.getChild("Throat2");
            this.part26_21 = this.TailTop3.getChild("part26_21");
            this.part26_3 = this.Chest.getChild("part26_3");
            this.Neck = this.Chest.getChild("Neck");
            this.part26_25 = this.Neck.getChild("part26_25");
            this.HandRight = this.ArmRight.getChild("HandRight");
            this.part26_15 = this.Tail1.getChild("part26_15");
            this.part26_18 = this.TailTop4.getChild("part26_18");
            this.part26_28 = this.Neck.getChild("part26_28");
            this.Mouth = this.Jaw.getChild("Mouth");
            this.part26_9 = this.Hips.getChild("part26_9");
            this.part26_1 = this.Chest.getChild("part26_1");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.EyeLeft = this.ForeHead.getChild("EyeLeft");
            this.LowerTeethRight = this.Mouth.getChild("LowerTeethRight");
            this.part26_10 = this.Hips.getChild("part26_10");
            this.part26_2 = this.Chest.getChild("part26_2");
            this.Body = this.Chest.getChild("Body");
            this.Throat = this.Mouth.getChild("Throat");
            this.TailTop2 = this.Tail2.getChild("TailTop2");
            this.Hips = this.Body.getChild("Hips");
            this.Nose = this.Snout.getChild("Nose");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.part26_23 = this.TailTop2.getChild("part26_23");
            this.part26_26 = this.Neck.getChild("part26_26");
            this.Jaw = this.Head.getChild("Jaw");
            this.part26_14 = this.Tail1.getChild("part26_14");
            this.part26_16 = this.Tail1.getChild("part26_16");
            this.TopTeethLeft = this.Snout.getChild("TopTeethLeft");
            this.part26_24 = this.TailTop2.getChild("part26_24");
            this.LowerTeethLeft = this.Mouth.getChild("LowerTeethLeft");
            this.part26_27 = this.Neck.getChild("part26_27");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.part26_17 = this.Tail1.getChild("part26_17");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.part26_8 = this.Body.getChild("part26_8");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.part26_7 = this.Body.getChild("part26_7");
            this.part26_19 = this.TailTop3.getChild("part26_19");
            this.Tail1 = this.Hips.getChild("Tail1");
            this.ForeHead = this.Head.getChild("ForeHead");
            this.part26_5 = this.Body.getChild("part26_5");
            this.TopTeethRight = this.Snout.getChild("TopTeethRight");
            this.part26_6 = this.Body.getChild("part26_6");
            this.Snout = this.Head.getChild("Snout");
            this.part26_12 = this.Hips.getChild("part26_12");
            this.part26_20 = this.TailTop3.getChild("part26_20");
            this.TailTop3 = this.Tail3.getChild("TailTop3");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.part26 = this.Chest.getChild("part26");
            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.part26_13 = this.Tail1.getChild("part26_13");
            this.part26_22 = this.TailTop2.getChild("part26_22");
            this.Head = this.Neck.getChild("Head");
            this.part26_11 = this.Hips.getChild("part26_11");
            this.EyeRight = this.ForeHead.getChild("EyeRight");

        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("part26_4", CubeListBuilder.create().texOffs(16, 1).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 9.0F), PartPose.offset(-3.4F, -0.1F, 0.0F));
            partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(22, 16).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 6.6F, 0.2343977238691606F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Throat3", CubeListBuilder.create().texOffs(29, 37).addBox(-1.0F, -1.6F, -3.8F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.0F, -0.27366763203903305F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailTop4", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F, 0.0F, 0.2F)), PartPose.offsetAndRotation(0.0F, -3.1F, 0.7F, -0.5473352640780661F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(35, 14).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 6.0F, 3.4906584259663615E-4F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Throat2", CubeListBuilder.create().texOffs(17, 40).addBox(-1.5F, 0.0F, -1.2F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.039269908169872414F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_21", CubeListBuilder.create().texOffs(16, 9).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 0.6F, -0.038920842652368684F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_3", CubeListBuilder.create().texOffs(21, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(-2.9F, -2.6F, -2.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 43).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -2.0F, -0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 18.8F, -5.5F, 0.11746065899211351F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_25", CubeListBuilder.create().texOffs(20, 5).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(2.0F, -0.1F, -4.0F));
            partDefinition.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(52, 6).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.3F, -0.2F, -3.2F, -1.275486649315389F, 0.004188790111159634F, 0.8196066007575706F));
            partDefinition.addOrReplaceChild("part26_15", CubeListBuilder.create().texOffs(19, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_18", CubeListBuilder.create().texOffs(17, 12).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -0.7F, -0.038920842652368684F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_28", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(-2.0F, -0.1F, -4.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(17, 25).addBox(-1.5F, 0.1F, -5.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.21F, 0.0F, 0.1F)), PartPose.offset(0.0F, 0.0F, -4.0F));
            partDefinition.addOrReplaceChild("part26_9", CubeListBuilder.create().texOffs(20, 5).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(2.9F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_1", CubeListBuilder.create().texOffs(21, 6).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(1.0F, -2.6F, -2.0F));
            partDefinition.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(31, 0).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-3.6F, 2.8F, 1.9F, 0.0F, -0.41887902047863906F, -0.8726646259971648F));
            partDefinition.addOrReplaceChild("EyeLeft", CubeListBuilder.create().texOffs(12, 20).addBox(0.0F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.8F, -0.9F, -0.5F, -0.19547687289441354F, 0.23457224414434488F, 0.0F));
            partDefinition.addOrReplaceChild("LowerTeethRight", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, -0.4F, -5.0F, 0.0F, 1.0F, 7.0F), PartPose.offset(-1.2F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_10", CubeListBuilder.create().texOffs(20, 5).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(0.9F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_2", CubeListBuilder.create().texOffs(21, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(-1.0F, -2.6F, -2.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(21, 49).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 6.0F, 9.0F), PartPose.offsetAndRotation(0.0F, -2.6F, 1.9F, -0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Throat", CubeListBuilder.create().texOffs(31, 24).addBox(-1.0F, -0.6F, 0.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.2F, 0.0F, 0.1F)), PartPose.offsetAndRotation(0.0F, 0.7F, -5.0F, -0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TailTop2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.7F, 0.0F, 3.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, 0.03909537541112055F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(42, 39).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 8.9F, -0.27366763203903305F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(4, 25).addBox(-1.0F, -1.2F, -1.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -4.1F, 0.11728612207217244F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(41, 6).mirror(true).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, 0.2F, 0.6F, 0.6283185307179586F, 0.767944870877505F, 0.08726646259971647F));
            partDefinition.addOrReplaceChild("part26_23", CubeListBuilder.create().texOffs(16, 6).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -2.3F, 1.0F, 0.23474678106428595F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_26", CubeListBuilder.create().texOffs(20, 5).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(0.6F, -0.1F, -4.0F));
            partDefinition.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(17, 32).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.15F, 0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 0.0F, -0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_14", CubeListBuilder.create().texOffs(19, 4).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(1.4F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_16", CubeListBuilder.create().texOffs(19, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(-1.4F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopTeethLeft", CubeListBuilder.create().texOffs(21, 0).mirror(true).addBox(0.0F, 0.2F, -5.0F, 0.0F, 1.0F, 8.0F), PartPose.offset(1.3F, 0.4F, -0.3F));
            partDefinition.addOrReplaceChild("part26_24", CubeListBuilder.create().texOffs(19, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(-1.4F, -2.3F, 1.0F));
            partDefinition.addOrReplaceChild("LowerTeethLeft", CubeListBuilder.create().texOffs(22, 0).mirror(true).addBox(0.0F, -0.4F, -5.0F, 0.0F, 1.0F, 7.0F), PartPose.offset(1.2F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_27", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(-0.6F, -0.1F, -4.0F));
            partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(1.5F, -0.1F, -0.1F, -0.44121924688839137F, 0.29461156308925684F, -0.3141592653589793F));
            partDefinition.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(41, 6).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.5F, 0.2F, 0.6F, 0.6283185307179586F, -0.767944870877505F, -0.08726646259971647F));
            partDefinition.addOrReplaceChild("part26_17", CubeListBuilder.create().texOffs(19, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(-2.4F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(42, 16).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 2.7F, 5.4F, 0.15655603856442327F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(54, 0).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 4.0F, -0.4363323129985824F, 0.22689280275926282F, 0.8726646259971648F));
            partDefinition.addOrReplaceChild("part26_8", CubeListBuilder.create().texOffs(16, 1).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 9.0F), PartPose.offset(3.4F, -0.1F, 0.0F));
            partDefinition.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(3.6F, 2.8F, 1.9F, 0.0F, 0.41887902047863906F, 0.8726646259971648F));
            partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(45, 0).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(-1.5F, -0.1F, -0.1F, -0.4363323129985824F, -0.2792526803190927F, 0.3141592653589793F));
            partDefinition.addOrReplaceChild("part26_7", CubeListBuilder.create().texOffs(16, 1).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 9.0F), PartPose.offset(2.0F, -0.1F, 0.0F));
            partDefinition.addOrReplaceChild("part26_19", CubeListBuilder.create().texOffs(20, 5).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(0.9F, 0.0F, 1.0F));
            partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(42, 27).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 4.5F, -0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("ForeHead", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -0.4F, -2.1F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F, 0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.9F, 0.1563815016444822F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_5", CubeListBuilder.create().texOffs(16, 1).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 9.0F), PartPose.offset(-2.0F, -0.1F, 0.0F));
            partDefinition.addOrReplaceChild("TopTeethRight", CubeListBuilder.create().texOffs(21, 0).addBox(0.0F, 0.0F, -5.0F, 0.0F, 1.0F, 8.0F), PartPose.offset(-1.3F, 0.4F, -0.3F));
            partDefinition.addOrReplaceChild("part26_6", CubeListBuilder.create().texOffs(16, 1).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 9.0F), PartPose.offset(0.0F, -0.1F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, -0.2F, -5.2F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F, 0.2F, 0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, -0.19547687289441354F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_12", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(-2.9F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_20", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(-0.9F, 0.0F, 1.0F));
            partDefinition.addOrReplaceChild("TailTop3", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 0.2F, -0.0781907508222411F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, 4.0F, -0.42795474057849286F, -0.24364796424419868F, -0.8761552978169589F));
            partDefinition.addOrReplaceChild("part26", CubeListBuilder.create().texOffs(21, 6).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(2.9F, -2.6F, -2.0F));
            partDefinition.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(32, 9).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-3.0F, 0.6F, -0.4F, 0.17453292519943295F, 0.12217304763960307F, -0.767944870877505F));
            partDefinition.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(52, 6).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.3F, -0.2F, -3.2F, -1.2845623028362156F, 0.004188790111159634F, -0.8196066007575706F));
            partDefinition.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(32, 9).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(3.0F, 0.6F, -0.4F, 0.17453292519943295F, -0.12217304763960307F, 0.767944870877505F));
            partDefinition.addOrReplaceChild("part26_13", CubeListBuilder.create().texOffs(19, 4).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(2.4F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_22", CubeListBuilder.create().texOffs(19, 4).mirror(true).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 6.0F), PartPose.offset(1.4F, -2.3F, 1.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -3.3F, 0.39112828270876815F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("part26_11", CubeListBuilder.create().texOffs(20, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 5.0F), PartPose.offset(-0.9F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("EyeRight", CubeListBuilder.create().texOffs(12, 20).mirror(true).addBox(-1.0F, -0.2F, 0.0F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.8F, -0.9F, -0.5F, -0.19547687289441354F, -0.23457224414434488F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(CaimanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;

        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.195F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.391F;
            this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.3F * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.2F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 1.4F;
                degree = 0.8F;
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.195F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.391F;

                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.117F;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount;

                this.UpperArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.174F;
                this.UpperArmLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount - 0.122F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount - 3.9F;
                this.ArmLeft.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 5.3F;
                this.HandLeft.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 1.0F;
                this.UpperArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.174F;
                this.UpperArmRight.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.122F;
                this.ArmRight.xRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount - 3.9F;
                this.ArmRight.yRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 5.3F;
                this.HandRight.zRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 1.0F;

                this.ThighLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
                this.ThighLeft.zRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount + 1.6F;
                this.ThighLeft.y = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 2.8F;
                this.LegLeft.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 1.8F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.1F;
                this.ThighRight.yRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.5F;
                this.ThighRight.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount - 1.6F;
                this.ThighRight.y = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 2.8F;
                this.LegRight.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.8F;
                this.FootRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.1F;

                this.Tail1.xRot = 0F;
                this.Tail2.xRot = 0F;
                this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -1.9F * limbSwingAmount;
                this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -2.1F * limbSwingAmount;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 1.9F * limbSwingAmount;

            } else {
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.9F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.195F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.9F) * degree * -0.05F * limbSwingAmount * 0.5F + 0.391F;

                this.Body.xRot = -0.117F;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -0.9F * limbSwingAmount * 0.5F;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;

                this.LegLeft.zRot = -0.314F;
                this.LegRight.zRot = 0.314F;
                this.ThighLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F + 0.418F;
                this.ThighLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F;
                this.ThighLeft.zRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.872F;
                this.ThighLeft.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -15.0F * limbSwingAmount * 0.5F + 1.9F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.441F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.427F;
                this.FootLeft.zRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.876F;
                this.ThighRight.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.418F;
                this.ThighRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -1.2F * limbSwingAmount * 0.5F;
                this.ThighRight.zRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 15.0F * limbSwingAmount * 0.5F + 1.9F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.441F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.436F;
                this.FootRight.zRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F + 0.872F;

                this.UpperArmLeft.xRot = 0.174F;
                this.UpperArmLeft.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmLeft.yRot = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.122F;
                this.ArmLeft.yRot = -0.767F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandLeft.zRot = -0.819F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 1.284F;
                this.UpperArmRight.xRot = 0.174F;
                this.UpperArmRight.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmRight.yRot = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.122F;
                this.ArmRight.yRot = 0.767F;
                this.ArmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandRight.zRot = 0.819F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 1.275F;

                this.Tail1.xRot = -0.078F;
                this.Tail2.xRot = 0.156F;
                this.Tail1.yRot = Mth.cos(5.0F + limbSwing * speed * 0.45F) * degree * -1.1F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -1.5F * limbSwingAmount * 0.5F;
            }
        }
    }
}