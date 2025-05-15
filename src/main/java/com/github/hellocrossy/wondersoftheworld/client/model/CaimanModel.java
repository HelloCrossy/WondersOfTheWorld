package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.CaimanEntity;
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
        public ModelPart Spine1;
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart UpperArmLeft;
        public ModelPart UpperArmRight;
        public ModelPart Spine2R;
        public ModelPart Spine2L;
        public ModelPart Spine2C;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart Spine3L;
        public ModelPart Spine2R_1;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail2;
        public ModelPart Spine4R;
        public ModelPart Spine4L;
        public ModelPart Tail3;
        public ModelPart Tail2_1;
        public ModelPart Tail3_1;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LowerNeck;
        public ModelPart Head;
        public ModelPart LowerNeck2;
        public ModelPart UpperJaw1;
        public ModelPart RightEye;
        public ModelPart LeftEye;
        public ModelPart LowerJaw1;
        public ModelPart HeadTop2;
        public ModelPart HeadTop1;
        public ModelPart NoseBridge;
        public ModelPart UpperJaw2;
        public ModelPart TeethTop1;
        public ModelPart Nose;
        public ModelPart TeethTop2;
        public ModelPart LowerJaw2;
        public ModelPart TeethLower1;
        public ModelPart TeethLower2;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Spine1 = this.Chest.getChild("Spine1");

            this.Body = this.Chest.getChild("Body");
            this.Spine2L = this.Body.getChild("Spine2L");

            this.Spine2R = this.Body.getChild("Spine2R");

            this.Spine2C = this.Body.getChild("Spine2C");

            this.Hips = this.Body.getChild("Hips");
            this.Spine2R_1 = this.Hips.getChild("Spine2R_1");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Spine3L = this.Hips.getChild("Spine3L");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Spine4L = this.Tail1.getChild("Spine4L");

            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail2_1 = this.Tail2.getChild("Tail2_1");

            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail3_1 = this.Tail3.getChild("Tail3_1");

            this.Spine4R = this.Tail1.getChild("Spine4R");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.LowerJaw1 = this.Head.getChild("LowerJaw1");
            this.TeethLower1 = this.LowerJaw1.getChild("TeethLower1");

            this.LowerJaw2 = this.LowerJaw1.getChild("LowerJaw2");
            this.TeethLower2 = this.LowerJaw2.getChild("TeethLower2");

            this.LeftEye = this.Head.getChild("LeftEye");

            this.HeadTop1 = this.Head.getChild("HeadTop1");

            this.RightEye = this.Head.getChild("RightEye");

            this.HeadTop2 = this.Head.getChild("HeadTop2");

            this.UpperJaw1 = this.Head.getChild("UpperJaw1");
            this.UpperJaw2 = this.UpperJaw1.getChild("UpperJaw2");
            this.Nose = this.UpperJaw2.getChild("Nose");

            this.TeethTop2 = this.UpperJaw2.getChild("TeethTop2");

            this.NoseBridge = this.UpperJaw1.getChild("NoseBridge");

            this.TeethTop1 = this.UpperJaw1.getChild("TeethTop1");

            this.LowerNeck = this.Neck.getChild("LowerNeck");
            this.LowerNeck2 = this.LowerNeck.getChild("LowerNeck2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(13, 8).addBox(-2.5F, -2.0F, -1.5F, 5.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 19.9F, -3.9F, -0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(48, 21).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.8F, 0.8F, 0.6F, 0.17453292519943295F, -0.8203047484373349F, 0.41887902047863906F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(20, 22).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.5F, 0.2F, 0.6F, 0.6283185307179586F, 0.2530727415391778F, -0.08726646259971647F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(30, 22).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.5F, 0.3F, -2.5F, -0.8028514559173915F, 0.017453292519943295F, -0.6646214111173737F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(48, 21).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-2.8F, 0.8F, 0.6F, 0.17453292519943295F, 0.8203047484373349F, -0.41887902047863906F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(20, 22).mirror(true).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, 0.2F, 0.6F, 0.6283185307179586F, -0.2530727415391778F, 0.08726646259971647F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(30, 22).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.5F, 0.3F, -2.5F, -0.8028514559173915F, -0.017453292519943295F, 0.6646214111173737F));

            PartDefinition Spine1 = Chest.addOrReplaceChild("Spine1", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F), PartPose.offset(0.0F, -1.8F, 0.4F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(22, 9).addBox(-3.0F, -0.5F, -0.3F, 6.0F, 5.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -2.1F, 0.8F, 0.15707963267948966F, 0.0F, 0.0F));
            PartDefinition Spine2L = Body.addOrReplaceChild("Spine2L", CubeListBuilder.create().texOffs(19, 32).addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F), PartPose.offset(2.5F, -0.3F, 3.5F));

            PartDefinition Spine2R = Body.addOrReplaceChild("Spine2R", CubeListBuilder.create().texOffs(19, 32).addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F), PartPose.offset(-2.5F, -0.3F, 3.5F));

            PartDefinition Spine2C = Body.addOrReplaceChild("Spine2C", CubeListBuilder.create().texOffs(19, 36).addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F), PartPose.offset(0.0F, -0.3F, 3.2F));

            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 7.5F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition Spine2R_1 = Hips.addOrReplaceChild("Spine2R_1", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(-2.0F, -0.1F, -0.1F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(48, 25).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.6F, 2.8F, 1.9F, 0.0F, 0.8726646259971648F, 0.06981317007977318F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(27, 26).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.5F, -0.1F, -0.1F, -0.5654867042777737F, -0.8168140766175408F, -0.3141592653589793F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 3.0F, -0.6876597519173767F, -0.27366763203903305F, 0.0F));

            PartDefinition Spine3L = Hips.addOrReplaceChild("Spine3L", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(2.0F, 0.1F, -0.1F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(48, 25).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-2.6F, 2.8F, 1.9F, 0.0F, -0.8726646259971648F, -0.06981317007977318F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(27, 26).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.5F, -0.1F, -0.1F, -0.5654867042777737F, 0.8168140766175408F, 0.3141592653589793F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 3.0F, -0.6876597519173767F, 0.27366763203903305F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(46, 39).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 2.21F, 3.8F, -0.3001966446588301F, 0.0F, 0.0F));
            PartDefinition Spine4L = Tail1.addOrReplaceChild("Spine4L", CubeListBuilder.create().texOffs(8, 38).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(1.5F, -2.0F, 0.0F));

            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(31, 34).addBox(-1.5F, -1.5F, -0.2F, 3.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 4.2F, 0.2694788291842315F, 0.0F, 0.0F));
            PartDefinition Tail2_1 = Tail2.addOrReplaceChild("Tail2_1", CubeListBuilder.create().texOffs(31, 38).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 7.0F), PartPose.offset(0.0F, -1.5F, -0.2F));

            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 9.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 6.5F, 0.13473941459211575F, 0.0F, 0.0F));
            PartDefinition Tail3_1 = Tail3.addOrReplaceChild("Tail3_1", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 9.0F), PartPose.offset(0.0F, -1.2F, 0.0F));

            PartDefinition Spine4R = Tail1.addOrReplaceChild("Spine4R", CubeListBuilder.create().texOffs(8, 38).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(-1.5F, -2.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(42, 9).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -1.3F, -0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(50, 29).addBox(-1.5F, -0.9F, -2.7F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.04F, -2.95F, 0.4886921905584123F, 0.0F, 0.0F));
            PartDefinition LowerJaw1 = Head.addOrReplaceChild("LowerJaw1", CubeListBuilder.create().texOffs(11, 20).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -2.0F, -0.02792526844802819F, 0.0F, 0.0F));
            PartDefinition TeethLower1 = LowerJaw1.addOrReplaceChild("TeethLower1", CubeListBuilder.create().texOffs(11, 36).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F), PartPose.offset(0.0F, -1.0F, 0.0F));

            PartDefinition LowerJaw2 = LowerJaw1.addOrReplaceChild("LowerJaw2", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -3.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition TeethLower2 = LowerJaw2.addOrReplaceChild("TeethLower2", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.0F, -1.0F, -0.2F));

            PartDefinition LeftEye = Head.addOrReplaceChild("LeftEye", CubeListBuilder.create().texOffs(54, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.5F, -0.13F, -1.92F, 0.27366763203903305F, 0.10471975511965977F, 0.12217304763960307F));

            PartDefinition HeadTop1 = Head.addOrReplaceChild("HeadTop1", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, -0.5F, -1.6F, 0.11728612207217244F, 0.1956514098143546F, 0.0F));

            PartDefinition RightEye = Head.addOrReplaceChild("RightEye", CubeListBuilder.create().texOffs(54, 9).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, -0.13F, -1.92F, 0.27366763203903305F, -0.10471975511965977F, -0.12217304763960307F));

            PartDefinition HeadTop2 = Head.addOrReplaceChild("HeadTop2", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, -0.5F, -1.6F, 0.11728612207217244F, -0.1956514098143546F, 0.0F));

            PartDefinition UpperJaw1 = Head.addOrReplaceChild("UpperJaw1", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -0.4F, -3.0F, 4.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -2.1F, 0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition UpperJaw2 = UpperJaw1.addOrReplaceChild("UpperJaw2", CubeListBuilder.create().texOffs(52, 6).addBox(-1.5F, -0.4F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.9F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Nose = UpperJaw2.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(57, 1).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -2.1F, 0.2087413792043121F, 0.0F, 0.0F));

            PartDefinition TeethTop2 = UpperJaw2.addOrReplaceChild("TeethTop2", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.4F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 1.0F, -0.2F));

            PartDefinition NoseBridge = UpperJaw1.addOrReplaceChild("NoseBridge", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -0.3F, 0.5295328977182406F, 0.0F, 0.0F));

            PartDefinition TeethTop1 = UpperJaw1.addOrReplaceChild("TeethTop1", CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -0.4F, -3.0F, 4.0F, 1.0F, 3.0F), PartPose.offset(0.0F, 1.0F, 0.0F));

            PartDefinition LowerNeck = Neck.addOrReplaceChild("LowerNeck", CubeListBuilder.create().texOffs(48, 1).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.3F, 0.7F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition LowerNeck2 = LowerNeck.addOrReplaceChild("LowerNeck2", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -3.0F, -0.23457224414434488F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 48);
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
            this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.174F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.488F;
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
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.174F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.488F;

                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount + 0.157F;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount;

                this.UpperArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.174F;
                this.UpperArmLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount - 0.82F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount - 3.2F;
                this.ArmLeft.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 4.5F;
                this.HandLeft.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 1.0F;
                this.UpperArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.174F;
                this.UpperArmRight.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount + 0.82F;
                this.ArmRight.xRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount - 3.2F;
                this.ArmRight.yRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 4.5F;
                this.HandRight.zRot = Mth.cos(2.2F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 1.0F;

                this.ThighLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 1.1F;
                this.ThighLeft.zRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount + 1.1F;
                this.ThighLeft.y = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 0.2F;
                this.LegLeft.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 1.8F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.1F;
                this.ThighRight.yRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 1.1F;
                this.ThighRight.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount - 1.1F;
                this.ThighRight.y = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 0.2F;
                this.LegRight.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.8F;
                this.FootRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 1.1F;

                this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -1.9F * limbSwingAmount;
                this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -2.1F * limbSwingAmount;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 1.9F * limbSwingAmount;

            } else {
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.9F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.174F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.9F) * degree * -0.05F * limbSwingAmount * 0.5F + 0.488F;

                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -0.9F * limbSwingAmount * 0.5F;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;

                this.ThighLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F + 0.872F;
                this.ThighLeft.zRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.069F;
                this.ThighLeft.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -15.0F * limbSwingAmount * 0.5F + 2.6F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.565F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.687F;
                this.FootLeft.zRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.0F;
                this.ThighRight.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.zRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.069F;
                this.ThighRight.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 15.0F * limbSwingAmount * 0.5F + 2.6F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.565F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.687F;
                this.FootRight.zRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.0F;

                this.UpperArmLeft.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmLeft.yRot = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.82F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.664F;
                this.UpperArmRight.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmRight.yRot = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.82F;
                this.ArmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.802F;

                this.Tail1.yRot = Mth.cos(5.0F + limbSwing * speed * 0.45F) * degree * -1.1F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -1.5F * limbSwingAmount * 0.5F;
            }
        }
    }

    public static class Child extends CaimanModel {

        public ModelPart Spine1;
        public ModelPart Body;
        public ModelPart Neck;
        public ModelPart UpperArmLeft;
        public ModelPart UpperArmRight;
        public ModelPart Spine2R;
        public ModelPart Spine2L;
        public ModelPart Spine2C;
        public ModelPart Hips;
        public ModelPart Tail1;
        public ModelPart Spine3L;
        public ModelPart Spine2R_1;
        public ModelPart ThighRight;
        public ModelPart ThighLeft;
        public ModelPart Tail2;
        public ModelPart Spine4R;
        public ModelPart Spine4L;
        public ModelPart Tail3;
        public ModelPart Tail2_1;
        public ModelPart Tail3_1;
        public ModelPart LegRight;
        public ModelPart FootRight;
        public ModelPart LegLeft;
        public ModelPart FootLeft;
        public ModelPart LowerNeck;
        public ModelPart Head;
        public ModelPart LowerNeck2;
        public ModelPart UpperJaw1;
        public ModelPart RightEye;
        public ModelPart LeftEye;
        public ModelPart LowerJaw1;
        public ModelPart HeadTop2;
        public ModelPart HeadTop1;
        public ModelPart NoseBridge;
        public ModelPart UpperJaw2;
        public ModelPart TeethTop1;
        public ModelPart Nose;
        public ModelPart TeethTop2;
        public ModelPart LowerJaw2;
        public ModelPart TeethLower1;
        public ModelPart TeethLower2;
        public ModelPart ArmLeft;
        public ModelPart HandLeft;
        public ModelPart ArmRight;
        public ModelPart HandRight;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Spine1 = this.Chest.getChild("Spine1");

            this.Neck = this.Chest.getChild("Neck");
            this.LowerNeck = this.Neck.getChild("LowerNeck");
            this.LowerNeck2 = this.LowerNeck.getChild("LowerNeck2");

            this.Head = this.Neck.getChild("Head");
            this.RightEye = this.Head.getChild("RightEye");

            this.LowerJaw1 = this.Head.getChild("LowerJaw1");
            this.TeethLower1 = this.LowerJaw1.getChild("TeethLower1");

            this.LowerJaw2 = this.LowerJaw1.getChild("LowerJaw2");
            this.TeethLower2 = this.LowerJaw2.getChild("TeethLower2");

            this.HeadTop1 = this.Head.getChild("HeadTop1");

            this.LeftEye = this.Head.getChild("LeftEye");

            this.UpperJaw1 = this.Head.getChild("UpperJaw1");
            this.TeethTop1 = this.UpperJaw1.getChild("TeethTop1");

            this.UpperJaw2 = this.UpperJaw1.getChild("UpperJaw2");
            this.Nose = this.UpperJaw2.getChild("Nose");

            this.TeethTop2 = this.UpperJaw2.getChild("TeethTop2");

            this.NoseBridge = this.UpperJaw1.getChild("NoseBridge");

            this.HeadTop2 = this.Head.getChild("HeadTop2");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighRight = this.Hips.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Spine2R_1 = this.Hips.getChild("Spine2R_1");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail2_1 = this.Tail2.getChild("Tail2_1");

            this.Tail3 = this.Tail2.getChild("Tail3");
            this.Tail3_1 = this.Tail3.getChild("Tail3_1");

            this.Spine4R = this.Tail1.getChild("Spine4R");

            this.Spine4L = this.Tail1.getChild("Spine4L");

            this.Spine3L = this.Hips.getChild("Spine3L");

            this.Spine2L = this.Body.getChild("Spine2L");

            this.Spine2R = this.Body.getChild("Spine2R");

            this.Spine2C = this.Body.getChild("Spine2C");

            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(13, 8).addBox(-2.5F, -2.0F, -1.5F, 5.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 19.4F, -3.9F, -0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition Spine1 = Chest.addOrReplaceChild("Spine1", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F), PartPose.offset(0.0F, -1.8F, 0.4F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(42, 9).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -1.3F, -0.17453292519943295F, 0.0F, 0.0F));
            PartDefinition LowerNeck = Neck.addOrReplaceChild("LowerNeck", CubeListBuilder.create().texOffs(48, 1).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.3F, 0.7F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition LowerNeck2 = LowerNeck.addOrReplaceChild("LowerNeck2", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -3.0F, -0.23457224414434488F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(50, 29).addBox(-1.5F, -0.9F, -2.7F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.04F, -2.95F, 0.4886921905584123F, 0.0F, 0.0F));
            PartDefinition RightEye = Head.addOrReplaceChild("RightEye", CubeListBuilder.create().texOffs(54, 9).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, -0.13F, -1.92F, 0.27366763203903305F, -0.10471975511965977F, -0.12217304763960307F));

            PartDefinition LowerJaw1 = Head.addOrReplaceChild("LowerJaw1", CubeListBuilder.create().texOffs(11, 20).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.1F, -2.0F, -0.02792526844802819F, 0.0F, 0.0F));
            PartDefinition TeethLower1 = LowerJaw1.addOrReplaceChild("TeethLower1", CubeListBuilder.create().texOffs(11, 36).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F), PartPose.offset(0.0F, -1.0F, 0.0F));

            PartDefinition LowerJaw2 = LowerJaw1.addOrReplaceChild("LowerJaw2", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.0F, -3.0F, -0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition TeethLower2 = LowerJaw2.addOrReplaceChild("TeethLower2", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offset(0.0F, -1.0F, -0.2F));

            PartDefinition HeadTop1 = Head.addOrReplaceChild("HeadTop1", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, -0.5F, -1.6F, 0.11728612207217244F, 0.1956514098143546F, 0.0F));

            PartDefinition LeftEye = Head.addOrReplaceChild("LeftEye", CubeListBuilder.create().texOffs(54, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.5F, -0.13F, -1.92F, 0.27366763203903305F, 0.10471975511965977F, 0.12217304763960307F));

            PartDefinition UpperJaw1 = Head.addOrReplaceChild("UpperJaw1", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -0.4F, -3.0F, 4.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -2.1F, 0.03490658503988659F, 0.0F, 0.0F));
            PartDefinition TeethTop1 = UpperJaw1.addOrReplaceChild("TeethTop1", CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -0.4F, -3.0F, 4.0F, 1.0F, 3.0F), PartPose.offset(0.0F, 1.0F, 0.0F));

            PartDefinition UpperJaw2 = UpperJaw1.addOrReplaceChild("UpperJaw2", CubeListBuilder.create().texOffs(52, 6).addBox(-1.5F, -0.4F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.9F, -0.1563815016444822F, 0.0F, 0.0F));
            PartDefinition Nose = UpperJaw2.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(57, 1).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -2.1F, 0.2087413792043121F, 0.0F, 0.0F));

            PartDefinition TeethTop2 = UpperJaw2.addOrReplaceChild("TeethTop2", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.4F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 1.0F, -0.2F));

            PartDefinition NoseBridge = UpperJaw1.addOrReplaceChild("NoseBridge", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -0.3F, 0.5295328977182406F, 0.0F, 0.0F));

            PartDefinition HeadTop2 = Head.addOrReplaceChild("HeadTop2", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, -0.5F, -1.6F, 0.11728612207217244F, -0.1956514098143546F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(48, 21).mirror(true).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-2.0F, 0.7F, -0.4F, 0.1748819990393151F, 0.8203047484373349F, -0.41887902047863906F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(20, 22).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-3.0F, -0.5F, 0.0F, 0.6283185307179586F, -0.2530727415391778F, 0.08168140599727838F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(30, 22).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.2F, 1.5F, -2.7F, -0.8028514559173915F, -0.017453292519943295F, 0.6646214111173737F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(22, 9).addBox(-3.0F, -0.5F, -0.3F, 6.0F, 5.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -2.1F, 0.8F, 0.15707963267948966F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 7.5F, -0.08726646259971647F, 0.0F, 0.0F));
            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(48, 25).mirror(true).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, 3.3F, 2.6F, 0.0F, -0.8726646259971648F, -0.06981317007977318F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(27, 26).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-2.5F, -0.1F, -0.1F, -0.5654867042777737F, 0.8168140766175408F, 0.3141592653589793F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 3.0F, -0.6876597519173767F, 0.27366763203903305F, 0.0F));

            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(48, 25).addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.9F, 3.3F, 2.6F, 0.0F, 0.8726646259971648F, 0.06981317007977318F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(27, 26).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(2.5F, -0.1F, -0.1F, -0.5654867042777737F, -0.8168140766175408F, -0.3141592653589793F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 3.0F, -0.6876597519173767F, -0.27366763203903305F, 0.0F));

            PartDefinition Spine2R_1 = Hips.addOrReplaceChild("Spine2R_1", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(-2.0F, -0.1F, -0.1F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(46, 39).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 2.21F, 3.8F, -0.3001966446588301F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(31, 34).addBox(-1.5F, -1.5F, -0.2F, 3.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 4.2F, 0.2694788291842315F, 0.0F, 0.0F));
            PartDefinition Tail2_1 = Tail2.addOrReplaceChild("Tail2_1", CubeListBuilder.create().texOffs(31, 38).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 7.0F), PartPose.offset(0.0F, -1.5F, -0.2F));

            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 9.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 6.5F, 0.13473941459211575F, 0.0F, 0.0F));
            PartDefinition Tail3_1 = Tail3.addOrReplaceChild("Tail3_1", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 9.0F), PartPose.offset(0.0F, -1.2F, 0.0F));

            PartDefinition Spine4R = Tail1.addOrReplaceChild("Spine4R", CubeListBuilder.create().texOffs(8, 38).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(-1.5F, -2.0F, 0.0F));

            PartDefinition Spine4L = Tail1.addOrReplaceChild("Spine4L", CubeListBuilder.create().texOffs(8, 38).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(1.5F, -2.0F, 0.0F));

            PartDefinition Spine3L = Hips.addOrReplaceChild("Spine3L", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 4.0F), PartPose.offset(2.0F, 0.1F, -0.1F));

            PartDefinition Spine2L = Body.addOrReplaceChild("Spine2L", CubeListBuilder.create().texOffs(19, 32).addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F), PartPose.offset(2.5F, -0.3F, 3.5F));

            PartDefinition Spine2R = Body.addOrReplaceChild("Spine2R", CubeListBuilder.create().texOffs(19, 32).addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F), PartPose.offset(-2.5F, -0.3F, 3.5F));

            PartDefinition Spine2C = Body.addOrReplaceChild("Spine2C", CubeListBuilder.create().texOffs(19, 36).addBox(0.0F, -1.0F, -4.0F, 0.0F, 1.0F, 8.0F), PartPose.offset(0.0F, -0.3F, 3.2F));

            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(48, 21).addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.0F, 0.7F, -0.4F, 0.1748819990393151F, -0.8203047484373349F, 0.41887902047863906F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(20, 22).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(3.0F, -0.5F, 0.0F, 0.6283185307179586F, 0.2530727415391778F, -0.08168140599727838F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(30, 22).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.2F, 1.5F, -2.7F, -0.8028514559173915F, 0.017453292519943295F, -0.6646214111173737F));

            return LayerDefinition.create(meshDefinition, 64, 48);
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
            this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.174F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.488F;
            this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;
            this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.3F * limbSwingAmount * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            limbSwing *= 2.0F;
            limbSwingAmount = 0.15F;
            float speed = 1.2F;
            float degree = 1.0F;
            if (this.isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed = 0.7F;
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F - 0.174F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F + 0.488F;

                this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount * 0.5F + 0.157F;
                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount * 0.5F;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount * 0.5F;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount * 0.5F;

                this.UpperArmLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F + 0.174F;
                this.UpperArmLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F - 0.82F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.628F;
                this.ArmLeft.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.253F;
                this.HandLeft.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.664F;
                this.UpperArmRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F + 0.174F;
                this.UpperArmRight.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * -0.4F * limbSwingAmount * 0.5F + 0.82F;
                this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount * 0.5F + 0.628F;
                this.ArmRight.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.253F;
                this.HandRight.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.664F;

                this.ThighLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighLeft.zRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount * 0.5F + 0.069F;
                this.ThighLeft.y = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 3.3F;
                this.LegLeft.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.314F;
                this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.687F;
                this.ThighRight.yRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.zRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.9F * limbSwingAmount * 0.5F - 0.069F;
                this.ThighRight.y = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 3.3F;
                this.LegRight.zRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F + 0.314F;
                this.FootRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.687F;

                this.Tail1.yRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * -1.9F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(0.0F + limbSwing * speed * 0.1F) * degree * -2.1F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.1F) * degree * 1.9F * limbSwingAmount * 0.5F;

            } else {
                this.Neck.xRot = Mth.cos(0.0F + limbSwing * speed * 0.9F) * degree * 0.05F * limbSwingAmount * 0.5F - 0.174F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.9F) * degree * -0.05F * limbSwingAmount * 0.5F + 0.488F;

                this.Body.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;
                this.Chest.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -0.9F * limbSwingAmount * 0.5F;
                this.Hips.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 0.9F * limbSwingAmount * 0.5F;

                this.ThighLeft.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F + 0.872F;
                this.ThighLeft.zRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.069F;
                this.ThighLeft.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -15.0F * limbSwingAmount * 0.5F + 2.6F;
                this.LegLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.565F;
                this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * -2.0F * limbSwingAmount * 0.5F - 0.687F;
                this.FootLeft.zRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.0F;
                this.ThighRight.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F - 0.872F;
                this.ThighRight.zRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.069F;
                this.ThighRight.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 15.0F * limbSwingAmount * 0.5F + 2.6F;
                this.LegRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.565F;
                this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.687F;
                this.FootRight.zRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 2.0F * limbSwingAmount * 0.5F - 0.0F;

                this.UpperArmLeft.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmLeft.yRot = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.82F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.664F;
                this.UpperArmRight.z = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * 10.0F * limbSwingAmount * 0.5F - 0.4F;
                this.UpperArmRight.yRot = Mth.cos(2.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F + 0.82F;
                this.ArmRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * 3.0F * limbSwingAmount * 0.5F + 0.628F;
                this.HandRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -3.0F * limbSwingAmount * 0.5F - 0.802F;

                this.Tail1.yRot = Mth.cos(5.0F + limbSwing * speed * 0.45F) * degree * -1.1F * limbSwingAmount * 0.5F;
                this.Tail2.yRot = Mth.cos(1.0F + limbSwing * speed * 0.45F) * degree * 1.2F * limbSwingAmount * 0.5F;
                this.Tail3.yRot = Mth.cos(3.0F + limbSwing * speed * 0.45F) * degree * -1.5F * limbSwingAmount * 0.5F;
            }
        }
    }
}