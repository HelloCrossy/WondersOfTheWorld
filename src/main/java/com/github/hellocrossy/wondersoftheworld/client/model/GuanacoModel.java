package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.GuanacoEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class GuanacoModel extends ZawaBaseModel<GuanacoEntity> {

    public ModelRenderer Chest;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends GuanacoModel {

        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck1;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Neck2;
        public ModelRenderer Neck3;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer TopSnout;
        public ModelRenderer Jaw1;
        public ModelRenderer Teeth;
        public ModelRenderer Jaw2;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail2;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 96;
            this.Jaw1 = new ModelRenderer(this, 52, 49);
            this.Jaw1.mirror = true;
            this.Jaw1.setPos(0.0F, 1.6F, 1.2F);
            this.Jaw1.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw1, -0.2045525929942673F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 34, 14);
            this.Neck2.setPos(0.0F, -0.6F, -4.9F);
            this.Neck2.addBox(-2.0F, -3.0F, -8.0F, 4.0F, 4.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.7740534966278743F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 57, 38);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.9F, -1.7F, -0.3F);
            this.EarRight.addBox(-1.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.13665927909957545F, 0.6185446629383405F, -0.20839230536442993F);
            this.Body = new ModelRenderer(this, 0, 15);
            this.Body.setPos(0.0F, 4.0F, -1.0F);
            this.Body.addBox(-5.0F, -10.0F, 0.0F, 10.0F, 10.0F, 14.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.43598323915870024F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 71);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 10.9F, -1.6F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.43598323915870024F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 39);
            this.Hips.setPos(0.0F, -10.0F, 14.0F);
            this.Hips.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 9.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2609267198442009F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 54);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.9F, 0.9F, 3.6F);
            this.ThighRight.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.08691739708221274F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 81);
            this.FootLeft.setPos(0.0F, 5.6F, -1.3F);
            this.FootLeft.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.08587020052970155F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 54);
            this.ThighLeft.setPos(2.9F, 0.9F, 3.6F);
            this.ThighLeft.addBox(-2.5F, 0.0F, -3.0F, 5.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.08691739708221274F, 0.0F, 0.0F);
            this.Neck3 = new ModelRenderer(this, 48, 27);
            this.Neck3.setPos(0.0F, -3.0F, -8.0F);
            this.Neck3.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck3, 0.2539454094941263F, 0.0F, 0.0F);
            this.Teeth = new ModelRenderer(this, 48, 49);
            this.Teeth.setPos(0.0F, 0.2F, -2.1F);
            this.Teeth.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Teeth, 0.32183872338881814F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 22, 79);
            this.ArmLeft.setPos(0.0F, 7.0F, -2.5F);
            this.ArmLeft.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.07801621390230003F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 22, 69);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 9.5F, 1.5F);
            this.UpperArmRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 12, 73);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 7.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3050835452591255F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 50, 43);
            this.Snout.setPos(0.0F, -0.1F, -4.7F);
            this.Snout.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.16929693411449862F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 22, 54);
            this.ArmBaseLeft.setPos(2.7F, -2.1F, 1.3F);
            this.ArmBaseLeft.addBox(-2.5F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.3490658503988659F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 45, 37);
            this.TopSnout.setPos(0.0F, -0.3F, -1.9F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.24696408249929488F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 0, 81);
            this.HandLeft.setPos(0.0F, 4.5F, 0.7F);
            this.HandLeft.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 0, 81);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 4.5F, 0.7F);
            this.HandRight.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 30, 0);
            this.Neck1.setPos(0.0F, -0.8F, -3.5F);
            this.Neck1.addBox(-3.0F, -5.0F, -5.0F, 6.0F, 6.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, -1.1465068282456525F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 14, 88);
            this.Tail2.setPos(0.0F, 0.0F, 4.0F);
            this.Tail2.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.5715953300281429F, -0.0F, -0.037524580582353764F);
            this.UpperArmLeft = new ModelRenderer(this, 22, 69);
            this.UpperArmLeft.setPos(0.0F, 9.5F, 1.5F);
            this.UpperArmLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 0, 81);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 5.6F, -1.3F);
            this.FootRight.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.08587020052970155F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 4.5F, -8.5F);
            this.Chest.addBox(-4.0F, -5.0F, -3.5F, 8.0F, 8.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.4010766541188137F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 57, 38);
            this.EarLeft.setPos(1.9F, -1.7F, -0.3F);
            this.EarLeft.addBox(-1.0F, -3.5F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.13665927909957545F, -0.6185446629383405F, 0.20839230536442993F);
            this.LowerLegLeft = new ModelRenderer(this, 12, 73);
            this.LowerLegLeft.setPos(0.0F, 7.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3050835452591255F, 0.0F, 0.0F);
            this.Jaw2 = new ModelRenderer(this, 52, 49);
            this.Jaw2.setPos(0.0F, -0.1F, 0.0F);
            this.Jaw2.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 22, 79);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 7.0F, -2.5F);
            this.ArmRight.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.07801621390230003F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 22, 54);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.7F, -2.1F, 1.3F);
            this.ArmBaseRight.addBox(-2.5F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.3490658503988659F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 89);
            this.Tail1.setPos(0.0F, 0.0F, 4.4F);
            this.Tail1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.061261056578553394F, 0.0F, 0.024260076353049827F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 71);
            this.UpperLegLeft.setPos(0.0F, 10.9F, -1.6F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.43598323915870024F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 30, 39);
            this.Head.setPos(0.0F, 1.8F, -1.3F);
            this.Head.addBox(-2.5F, -2.5F, -3.5F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 1.4110986736058044F, 0.0F, 0.0F);
            this.Snout.addChild(this.Jaw1);
            this.Neck1.addChild(this.Neck2);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.Body);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.ThighLeft);
            this.Neck2.addChild(this.Neck3);
            this.Jaw1.addChild(this.Teeth);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.Snout);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Snout.addChild(this.TopSnout);
            this.ArmLeft.addChild(this.HandLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Neck1);
            this.Tail1.addChild(this.Tail2);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Jaw1.addChild(this.Jaw2);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Hips.addChild(this.Tail1);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck3.addChild(this.Head);
            this.saveBase();
        }

        @Override
        public void setupAnim(GuanacoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.411F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.134F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 1.411F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.061F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F + 0.571F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 1.134F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 1.411F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.061F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.571F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 4.5F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.401F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.436F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.261F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.349F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.078F;
                this.UpperArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.349F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.078F;
                this.UpperArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.087F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.436F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.305F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.087F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.436F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.305F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }

    public static class Child extends GuanacoModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Neck1;
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
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Snout;
        public ModelRenderer TopSnout;
        public ModelRenderer Jaw1;
        public ModelRenderer Teeth;
        public ModelRenderer Jaw2;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.UpperArmLeft = new ModelRenderer(this, 34, 43);
            this.UpperArmLeft.setPos(0.0F, 5.3F, -1.5F);
            this.UpperArmLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.04363323129985824F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 26, 12);
            this.Neck2.setPos(0.0F, -3.3F, 0.2F);
            this.Neck2.addBox(-1.5F, -4.5F, -2.0F, 3.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.9599310885968813F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 47, 28);
            this.ThighLeft.setPos(3.1F, 1.1F, 2.2F);
            this.ThighLeft.addBox(-3.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 23, 38);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.3F, -1.6F, 0.0F);
            this.EarRight.addBox(-1.0F, -3.5F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.13665927909957545F, 0.6185446629383405F, -0.20839230536442993F);
            this.ArmBaseRight = new ModelRenderer(this, 30, 32);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.1F, 1.1F, 0.6F);
            this.ArmBaseRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, -0.3490658503988659F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 55, 52);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 6.7F, 2.4F);
            this.LowerLegRight.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.3490658503988659F, 0.0F, 0.0F);
            this.Teeth = new ModelRenderer(this, 48, 23);
            this.Teeth.setPos(0.0F, 0.2F, -2.1F);
            this.Teeth.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Teeth, 0.32183872338881814F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 22, 1);
            this.Neck1.setPos(-0.0F, -1.0F, -0.6F);
            this.Neck1.addBox(-2.5F, -3.5F, -3.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.6108652381980153F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 43, 1);
            this.Head.setPos(0.0F, -4.5F, 0.6F);
            this.Head.addBox(-2.0F, -3.0F, -3.5F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.07679448875222618F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 5, 57);
            this.Tail2.setPos(0.0F, 2.0F, 1.0F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.17453292519943295F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 55, 52);
            this.LowerLegLeft.setPos(0.0F, 6.7F, 2.4F);
            this.LowerLegLeft.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.3490658503988659F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 47, 28);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.1F, 1.1F, 2.2F);
            this.ThighRight.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 1, 13);
            this.Body.setPos(0.0F, 0.8F, -0.6F);
            this.Body.addBox(-3.5F, -5.0F, 0.0F, 7.0F, 8.0F, 10.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.4363323129985824F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 51, 59);
            this.FootLeft.setPos(0.01F, 3.1F, -0.7F);
            this.FootLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 34, 59);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.01F, 2.7F, 1.1F);
            this.HandRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.04363323129985824F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 1, 32);
            this.Hips.setPos(0.0F, -4.8F, 9.7F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.2617993877991494F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 45, 11);
            this.TopSnout.setPos(0.0F, -0.3F, -1.9F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.24696408249929488F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 51, 41);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 7.9F, -1.8F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4363323129985824F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 34, 43);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 5.3F, -1.5F);
            this.UpperArmRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.04363323129985824F, 0.0F, 0.0F);
            this.Jaw2 = new ModelRenderer(this, 52, 23);
            this.Jaw2.setPos(0.0F, -0.1F, 0.0F);
            this.Jaw2.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 51, 59);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.01F, 3.1F, -0.7F);
            this.FootRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 50, 17);
            this.Snout.setPos(0.0F, -1.4F, -3.9F);
            this.Snout.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.16929693411449862F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 58);
            this.Tail1.setPos(0.0F, 1.5F, 3.7F);
            this.Tail1.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.5235987755982988F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 1, 1);
            this.Chest.setPos(0.0F, 7.9F, -5.3F);
            this.Chest.addBox(-3.0F, -3.5F, -2.0F, 6.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.4363323129985824F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 38, 52);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 5.2F, 0.6F);
            this.ArmRight.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.07853981633974483F, 0.0F, 0.0F);
            this.Jaw1 = new ModelRenderer(this, 52, 23);
            this.Jaw1.mirror = true;
            this.Jaw1.setPos(0.0F, 1.6F, 1.2F);
            this.Jaw1.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw1, -0.2045525929942673F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 30, 32);
            this.ArmBaseLeft.setPos(2.1F, 1.1F, 0.6F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, -0.3490658503988659F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 38, 52);
            this.ArmLeft.setPos(0.0F, 5.2F, 0.6F);
            this.ArmLeft.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.07853981633974483F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 23, 38);
            this.EarLeft.setPos(1.3F, -1.6F, 0.0F);
            this.EarLeft.addBox(-1.0F, -3.5F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.13665927909957545F, -0.6185446629383405F, 0.20839230536442993F);
            this.UpperLegLeft = new ModelRenderer(this, 51, 41);
            this.UpperLegLeft.setPos(-1.0F, 7.9F, -1.8F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4363323129985824F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 34, 59);
            this.HandLeft.setPos(0.01F, 2.7F, 1.1F);
            this.HandLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.04363323129985824F, 0.0F, 0.0F);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Neck1.addChild(this.Neck2);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Jaw1.addChild(this.Teeth);
            this.Chest.addChild(this.Neck1);
            this.Neck2.addChild(this.Head);
            this.Tail1.addChild(this.Tail2);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.Body);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Body.addChild(this.Hips);
            this.Snout.addChild(this.TopSnout);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Jaw1.addChild(this.Jaw2);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail1);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Snout.addChild(this.Jaw1);
            this.Chest.addChild(this.ArmBaseLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.EarLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(GuanacoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.076F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.61F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.076F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.523F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.174F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.61F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.076F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.523F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.174F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 7.3F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F + 0.436F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.436F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.262F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.349F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F -0.078F;
                this.UpperArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.349F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F -0.078F;
                this.UpperArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.174F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.436F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.349F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.174F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.436F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.349F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
        }
    }
}



