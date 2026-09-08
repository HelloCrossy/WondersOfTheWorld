package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.NorthSulawesiBabirusaEntity;
import com.github.hellocrossy.wondersoftheworld.entity.WarthogEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class NorthSulawesiBabirusaModel extends ZawaBaseModel<NorthSulawesiBabirusaEntity> {
    protected ModelRenderer Chest;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends NorthSulawesiBabirusaModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer LowerArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer LowerArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer NeckBottom;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;
        public ModelRenderer Tusk1Left;
        public ModelRenderer Tusk1Right;
        public ModelRenderer TeethLeft;
        public ModelRenderer TeethRight;


        public Adult() {
            texWidth = 64;
            texHeight = 64;
            this.EarRight = new ModelRenderer(this, 20, 0);
            this.EarRight.setPos(-2.3F, -0.9F, 0.1F);
            this.EarRight.addBox(-0.5F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.17453292519943295F, 0.4363323129985824F, -0.40142572795869574F);
            this.UpperLegRight = new ModelRenderer(this, 18, 57);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-0.1F, 7.6F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4363323129985824F, 0.0F, 0.0F);
            this.NeckBottom = new ModelRenderer(this, 30, 29);
            this.NeckBottom.setPos(0.0F, 2.7F, 0.5F);
            this.NeckBottom.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBottom, -0.40142572795869574F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 43, 49);
            this.HandLeft.setPos(-0.1F, 3.3F, -1.7F);
            this.HandLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 49, 20);
            this.Snout.setPos(0.0F, -0.7F, -1.9F);
            this.Snout.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2802998685492255F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 43, 49);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 3.3F, -1.7F);
            this.HandRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 52, 37);
            this.Tail2.setPos(0.0F, 3.0F, 0.0F);
            this.Tail2.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.20909043639943742F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 38, 54);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.2F, 0.4F, -0.2F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 29, 60);
            this.FootLeft.setPos(-0.1F, 4.2F, -1.7F);
            this.FootLeft.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13665927909957545F, 0.0F, 0.0F);
            this.Tusk1Right = new ModelRenderer(this, 30, 0);
            this.Tusk1Right.setPos(-1.4F, 0.9F, -2.0F);
            this.Tusk1Right.addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tusk1Right, -0.3127630032889644F, 0.0F, -0.7038913192872462F);
            this.EarLeft = new ModelRenderer(this, 20, 0);
            this.EarLeft.setPos(2.3F, -1.0F, 0.1F);
            this.EarLeft.addBox(-1.5F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.17453292519943295F, -0.4363323129985824F, 0.40142572795869574F);
            this.LowerArmLeft = new ModelRenderer(this, 52, 50);
            this.LowerArmLeft.setPos(0.0F, 2.3F, 0.0F);
            this.LowerArmLeft.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmLeft, -0.04363323129985824F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 51, 57);
            this.UpperArmLeft.setPos(0.0F, 3.9F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 18, 57);
            this.UpperLegLeft.setPos(-0.1F, 7.6F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4363323129985824F, 0.0F, 0.0F);
            this.TeethRight = new ModelRenderer(this, 30, 0);
            this.TeethRight.setPos(-0.5F, 0.1F, -3.3F);
            this.TeethRight.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TeethRight, -0.7853981633974483F, -0.2617993877991494F, -0.17453292519943295F);
            this.Mouth = new ModelRenderer(this, 36, 21);
            this.Mouth.setPos(0.0F, 2.2F, 0.1F);
            this.Mouth.addBox(-1.0F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.24556782042928F, 0.0F, 0.0F);
            this.TeethLeft = new ModelRenderer(this, 30, 0);
            this.TeethLeft.setPos(0.5F, 0.1F, -3.2F);
            this.TeethLeft.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TeethLeft, -0.7853981633974483F, 0.2617993877991494F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 57, 45);
            this.Tail3.setPos(0.0F, 3.5F, -0.6F);
            this.Tail3.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.06981317007977318F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 40, 1);
            this.TopSnout.setPos(0.0F, -0.6F, 1.1F);
            this.TopSnout.addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.1270599732070337F, 0.0F, 0.0F);
            this.LowerArmRight = new ModelRenderer(this, 52, 50);
            this.LowerArmRight.mirror = true;
            this.LowerArmRight.setPos(0.0F, 2.3F, 0.0F);
            this.LowerArmRight.addBox(-0.99F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmRight, -0.04363323129985824F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 40, 9);
            this.Head.setPos(0.0F, 2.5F, -3.9F);
            this.Head.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.07016223559727691F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 52, 44);
            this.Tail1.setPos(0.0F, 0.2F, 5.0F);
            this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.3731513794290017F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 14);
            this.Body.setPos(0.0F, 3.1F, 1.2F);
            this.Body.addBox(-4.0F, -7.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.03490658503988659F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 49);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.7F, 0.9F, 3.1F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 17, 50);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 1.7F, 2.7F);
            this.LowerLegRight.addBox(-0.99F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3490658503988659F, 0.0F, 0.0F);
            this.Tusk1Left = new ModelRenderer(this, 30, 0);
            this.Tusk1Left.setPos(1.4F, 0.9F, -2.0F);
            this.Tusk1Left.addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tusk1Left, -0.3127630032889644F, 0.0F, 0.7038913192872462F);
            this.Hips = new ModelRenderer(this, 0, 34);
            this.Hips.setPos(0.0F, -7.0F, 8.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2275909337942703F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 17, 50);
            this.LowerLegLeft.setPos(0.0F, 1.7F, 2.7F);
            this.LowerLegLeft.addBox(-1.01F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3490658503988659F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 29, 60);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 4.2F, -1.7F);
            this.FootRight.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13665927909957545F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 51, 57);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 3.9F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 38, 54);
            this.ArmBaseLeft.setPos(2.2F, 0.4F, -0.2F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 49);
            this.ThighLeft.setPos(2.7F, 0.9F, 3.1F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 13.8F, -5.0F);
            this.Chest.addBox(-3.5F, -3.5F, -2.0F, 7.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.03490658503988659F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 23, 39);
            this.Neck.setPos(0.0F, -3.3F, -1.9F);
            this.Neck.addBox(-2.5F, 0.0F, -2.5F, 5.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.24452063219914721F, 0.0F, 0.0F);
            this.Head.addChild(this.EarRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Neck.addChild(this.NeckBottom);
            this.LowerArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Snout);
            this.LowerArmRight.addChild(this.HandRight);
            this.Tail1.addChild(this.Tail2);
            this.Chest.addChild(this.ArmBaseRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Snout.addChild(this.Tusk1Right);
            this.Head.addChild(this.EarLeft);
            this.UpperArmLeft.addChild(this.LowerArmLeft);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Snout.addChild(this.TeethRight);
            this.Snout.addChild(this.Mouth);
            this.Snout.addChild(this.TeethLeft);
            this.Tail2.addChild(this.Tail3);
            this.Snout.addChild(this.TopSnout);
            this.UpperArmRight.addChild(this.LowerArmRight);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.Tail1);
            this.Chest.addChild(this.Body);
            this.Hips.addChild(this.ThighRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Snout.addChild(this.Tusk1Left);
            this.Body.addChild(this.Hips);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Chest.addChild(this.Neck);
            this.saveBase();

        }

        @Override
        public void setupAnim(NorthSulawesiBabirusaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.07F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.24F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.07F;;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.373F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.209F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 0.8f;
            float degree = 0.6f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.24F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.07F;;
            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.373F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.209F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 13.8F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.034F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.0349F;
            this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.227F;

            this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.091F;
            this.UpperArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.091F;
            this.LowerArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.043F;
            this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.091F;
            this.UpperArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.091F;
            this.LowerArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.043F;
            this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

            this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
            this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.436F;
            this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.349F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.137F;
            this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F;
            this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.436F;
            this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.349F;
            this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.137F;
        }
    }

    public static class Child extends NorthSulawesiBabirusaModel {
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Mouth;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            texWidth = 32;
            texHeight = 32;
            this.Neck = new ModelRenderer(this, 16, 0);
            this.Neck.setPos(0.0F, -0.6F, -1.0F);
            this.Neck.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.16580627893946132F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 0, 28);
            this.LowerLegLeft.setPos(-0.01F, 1.8F, 0.9F);
            this.LowerLegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6981317007977318F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 25);
            this.UpperLegLeft.setPos(0.3F, 3.0F, -0.3F);
            this.UpperLegLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6981317007977318F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 8, 28);
            this.ForearmLeft.setPos(-0.01F, 0.9F, -1.0F);
            this.ForearmLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, 0.017453292519943295F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 10, 16);
            this.Mouth.setPos(0.0F, 0.4F, -0.9F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 10, 12);
            this.Snout.setPos(0.0F, -1.2F, -1.5F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.4363323129985824F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 8, 28);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.01F, 0.9F, -1.0F);
            this.ForearmRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, 0.017453292519943295F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 4, 29);
            this.HandLeft.setPos(-0.01F, 1.5F, 0.3F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 25);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(-0.3F, 3.0F, -0.3F);
            this.UpperLegRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6981317007977318F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 0, 28);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.01F, 1.8F, 1.0F);
            this.LowerLegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6981317007977318F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -1.5F, 0.1F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.20943951023931953F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 14, 6);
            this.Head.setPos(0.0F, 0.7F, -2.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.40142572795869574F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 20, 12);
            this.EarLeft.setPos(1.1F, -1.2F, 0.7F);
            this.EarLeft.addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.5410520681182421F, -0.3490658503988659F, 0.7504915783575618F);
            this.Tail = new ModelRenderer(this, 14, 19);
            this.Tail.setPos(0.0F, 0.7F, 1.5F);
            this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.4300491170387584F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 14);
            this.Hips.setPos(0.0F, -0.3F, 4.0F);
            this.Hips.addBox(-1.5F, 0.3F, 0.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3490658503988659F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 4, 29);
            this.FootLeft.setPos(-0.01F, 1.3F, -0.7F);
            this.FootLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 20);
            this.ThighLeft.setPos(1.2F, 1.5F, 1.1F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.2617993877991494F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 4, 29);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.01F, 1.3F, -0.7F);
            this.FootRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 8, 25);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.01F, 2.0F, 0.3F);
            this.ArmRight.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.12217304763960307F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 4, 29);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.01F, 1.5F, 0.3F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 8, 25);
            this.ArmLeft.setPos(-0.01F, 2.0F, 0.3F);
            this.ArmLeft.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.12217304763960307F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 8);
            this.Chest.setPos(0.0F, 18.3F, -3.0F);
            this.Chest.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.12217304763960307F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 8, 21);
            this.ArmBaseLeft.setPos(1.4F, 0.4F, 0.0F);
            this.ArmBaseLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.22689280275926282F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 20, 12);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.2F, -1.2F, 0.7F);
            this.EarRight.addBox(-1.0F, -1.2F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.5410520681182421F, 0.3490658503988659F, -0.7504915783575618F);
            this.ArmBaseRight = new ModelRenderer(this, 8, 21);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.4F, 0.4F, 0.0F);
            this.ArmBaseRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.22689280275926282F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 20);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.2F, 1.5F, 1.1F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.2617993877991494F, 0.0F, 0.0F);
            this.Chest.addChild(this.Neck);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.Mouth);
            this.Head.addChild(this.Snout);
            this.ArmRight.addChild(this.ForearmRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.Body);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.EarLeft);
            this.Hips.addChild(this.Tail);
            this.Body.addChild(this.Hips);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ForearmRight.addChild(this.HandRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.ThighRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(NorthSulawesiBabirusaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.166F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.4F;

            this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.43F;
            this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 0.8f;
            float degree = 0.8f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.166F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.4F;
            this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.43F;
            this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;

            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 18.3F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.122F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.209F;
            this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.349F;

            this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.227F;
            this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.017F;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F -0.122F;
            this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.227F;
            this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.017F;
            this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F -0.122F;
            this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

            this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.262F;
            this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.698F;
            this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.698F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.262F;
            this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.698F;
            this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.698F;
            this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
        }
    }
}


