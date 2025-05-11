package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TakinEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class TakinModel extends ZawaBaseModel<TakinEntity> {

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

    public static class Adult extends TakinModel {

        public ModelRenderer Neck1;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
        public ModelRenderer Neck2Right;
        public ModelRenderer Neck2Left;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer Horn1Right;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Horn1Left;
        public ModelRenderer BeardMishmi;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout1;
        public ModelRenderer BeardBhutan;
        public ModelRenderer TopSnout2;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;

        public Adult() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.NeckLower = new ModelRenderer(this, 0, 101);
            this.NeckLower.setPos(0.0F, 1.9F, -6.0F);
            this.NeckLower.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.2871066752688726F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 30, 45);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.2F, 4.1F, 2.7F);
            this.ThighRight.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.42498767951852195F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 11, 78);
            this.Tail.setPos(0.0F, 1.3F, 6.0F);
            this.Tail.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.47333330778824817F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 27, 61);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 8.0F, -2.0F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6549999427311355F, 0.0F, 0.0F);
            this.Horn4Right = new ModelRenderer(this, 44, 109);
            this.Horn4Right.mirror = true;
            this.Horn4Right.setPos(-0.7F, -0.5F, -0.5F);
            this.Horn4Right.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 91);
            this.Head.setPos(0.0F, 3.0F, -7.0F);
            this.Head.addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.12200000042539677F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 21, 118);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.5F, -1.2F, 1.0F);
            this.EarRight.addBox(-0.3F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.4300491170387584F, -0.8384561886370425F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 32, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.1F, 0.6F, -0.4F);
            this.ArmBaseRight.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3829252472086197F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 34, 108);
            this.Horn3Left.setPos(0.7F, -0.5F, -0.5F);
            this.Horn3Left.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 27, 61);
            this.UpperLegLeft.setPos(0.0F, 8.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6550220469681831F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 27, 79);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 3.6F, -1.42F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.04F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 6.5F, -6.0F);
            this.Chest.addBox(-4.5F, -6.5F, -3.5F, 9.0F, 13.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.26100000670844853F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 27, 79);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 2.7F, 0.42F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.04F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 30, 45);
            this.ThighLeft.setPos(3.2F, 4.1F, 2.7F);
            this.ThighLeft.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.42498767951852195F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 32, 14);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 8.0F, 1.5F);
            this.ArmRight.addBox(-1.5F, -2.0F, -3.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.10402162408465232F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 45);
            this.Hips.setPos(0.0F, -1.5F, 12.0F);
            this.Hips.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.43000001500616014F, 0.0F, 0.0F);
            this.Neck2Left = new ModelRenderer(this, 0, 78);
            this.Neck2Left.setPos(0.0F, 0.0F, -4.0F);
            this.Neck2Left.addBox(-0.1F, 0.0F, -7.0F, 2.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2Left, 0.21781708265940905F, 0.017453292519943295F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 32, 23);
            this.ForearmLeft.setPos(0.0F, 4.0F, -2.5F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 21, 111);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(-1.0F, -0.3F, 0.0F);
            this.Horn2Right.addBox(-1.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.00999999F, 0.00999999F, 0.00999999F);
            this.setRotateAngle(Horn2Right, 0.0F, 0.4363323129985824F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 27, 79);
            this.HandLeft.setPos(0.0F, 2.7F, 0.42F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.04F, 0.0F, 0.0F);
            this.TopSnout1 = new ModelRenderer(this, 0, 120);
            this.TopSnout1.setPos(0.0F, -2.9F, 1.3F);
            this.TopSnout1.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout1, 0.2792526803190927F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 32, 23);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 4.0F, -2.5F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 62);
            this.Neck1.setPos(0.0F, -6.3F, -3.5F);
            this.Neck1.addBox(-3.5F, 0.0F, -5.0F, 7.0F, 11.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.3797588152515427F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 20, 109);
            this.Horn1Left.setPos(1.37F, -3.2F, -0.3F);
            this.Horn1Left.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left, 0.5410520348287285F, 0.19198621771937624F, 0.3141592653589793F);
            this.LowerLegRight = new ModelRenderer(this, 27, 71);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 6.0F, 3.0F);
            this.LowerLegRight.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.5580000258213429F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 32, 0);
            this.ArmBaseLeft.setPos(3.1F, 0.6F, -0.4F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3829252472086197F, 0.0F, 0.0F);
            this.Neck2Right = new ModelRenderer(this, 0, 78);
            this.Neck2Right.mirror = true;
            this.Neck2Right.setPos(0.0F, 0.0F, -4.0F);
            this.Neck2Right.addBox(-1.9F, 0.0F, -7.0F, 2.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2Right, 0.21781708265940905F, -0.017453292519943295F, 0.0F);
            this.Mouth = new ModelRenderer(this, 11, 113);
            this.Mouth.setPos(0.0F, 1.8F, 0.0F);
            this.Mouth.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.05235987755982988F, 0.0F, 0.0F);
            this.Horn4Left = new ModelRenderer(this, 44, 109);
            this.Horn4Left.setPos(0.7F, -0.5F, -0.5F);
            this.Horn4Left.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 20);
            this.Body.setPos(0.0F, -4.8F, 1.3F);
            this.Body.addBox(-5.0F, -2.0F, 0.0F, 10.0F, 13.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.17399999337579447F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 27, 79);
            this.FootLeft.setPos(0.0F, 3.6F, -1.42F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.04F, 0.0F, 0.0F);
            this.TopSnout2 = new ModelRenderer(this, 12, 120);
            this.TopSnout2.setPos(0.0F, 0.0F, -3.0F);
            this.TopSnout2.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, -0.00999999F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout2, 0.6981317007977318F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 20, 109);
            this.Horn1Right.mirror = true;
            this.Horn1Right.setPos(-1.37F, -3.2F, -0.3F);
            this.Horn1Right.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, 0.5410520348287285F, -0.19198621771937624F, -0.3141592653589793F);
            this.BeardMishmi = new ModelRenderer(this, 30, 86);
            this.BeardMishmi.setPos(0.0F, 0.8F, 0.7F);
            this.BeardMishmi.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 5.0F, 0.100000024F, 0.0F, 0.0F);
            this.setRotateAngle(BeardMishmi, 0.12217304763960307F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 34, 108);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(-0.7F, -0.5F, -0.5F);
            this.Horn3Right.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 113);
            this.Snout.setPos(0.0F, 0.3F, -2.4F);
            this.Snout.addBox(-1.5F, 0.0F, -3.3F, 3.0F, 2.0F, 5.0F, 0.20000005F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2792526803190927F, 0.0F, 0.0F);
            this.BeardBhutan = new ModelRenderer(this, 39, 97);
            this.BeardBhutan.setPos(0.0F, 0.1F, 0.7F);
            this.BeardBhutan.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 5.0F, 0.100000024F, 0.0F, 0.0F);
            this.setRotateAngle(BeardBhutan, 0.12217304763960307F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 27, 71);
            this.LowerLegLeft.setPos(0.0F, 6.0F, 3.0F);
            this.LowerLegLeft.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.5580000258213429F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 21, 118);
            this.EarLeft.setPos(1.5F, -1.2F, 1.0F);
            this.EarLeft.addBox(-0.7F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.4300491170387584F, 0.8384561886370425F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 21, 111);
            this.Horn2Left.setPos(1.0F, -0.3F, 0.0F);
            this.Horn2Left.addBox(-0.3F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.00999999F, 0.00999999F, 0.00999999F);
            this.setRotateAngle(Horn2Left, 0.0F, -0.4363323129985824F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 32, 14);
            this.ArmLeft.setPos(0.0F, 8.0F, 1.5F);
            this.ArmLeft.addBox(-1.5F, -2.0F, -3.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.10402162408465232F, 0.0F, 0.0F);
            this.Neck2Left.addChild(this.NeckLower);
            this.Hips.addChild(this.ThighRight);
            this.Hips.addChild(this.Tail);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Horn2Right.addChild(this.Horn4Right);
            this.Neck2Left.addChild(this.Head);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Horn2Left.addChild(this.Horn3Left);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Hips.addChild(this.ThighLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Body.addChild(this.Hips);
            this.Neck1.addChild(this.Neck2Left);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Horn1Right.addChild(this.Horn2Right);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Snout.addChild(this.TopSnout1);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.Neck1);
            this.Head.addChild(this.Horn1Left);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Neck1.addChild(this.Neck2Right);
            this.Snout.addChild(this.Mouth);
            this.Horn2Left.addChild(this.Horn4Left);
            this.Chest.addChild(this.Body);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.TopSnout1.addChild(this.TopSnout2);
            this.Head.addChild(this.Horn1Right);
            this.Snout.addChild(this.BeardMishmi);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Head.addChild(this.Snout);
            this.Snout.addChild(this.BeardBhutan);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Head.addChild(this.EarLeft);
            this.Horn1Left.addChild(this.Horn2Left);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(TakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.122F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.379F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.122F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.75f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.2F + 0.379F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.122F;

            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 6.5F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.261F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.174F;
            this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.430F;

            this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.383F;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.104F;
            this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.383F;
            this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.104F;
            this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
            this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

            this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F + 0.425F;
            this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.655F;
            this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.558F;
            this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
            this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F + 0.425F;
            this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.655F;
            this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.558F;
            this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
        }
    }

    public static class Child extends TakinModel {

        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer part10;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Head;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.FootRight = new ModelRenderer(this, 21, 28);
            this.FootRight.setPos(0.1F, 3.7F, -0.7F);
            this.FootRight.addBox(-1.0F, -0.5F, -1.7F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.0607374583022978F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 0);
            this.EarLeft.setPos(2.0F, -1.0F, 1.2F);
            this.EarLeft.addBox(-1.0F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.5522221646783615F, -0.27593656206399647F);
            this.HandRight = new ModelRenderer(this, 21, 28);
            this.HandRight.setPos(0.1F, 2.5F, 1.3F);
            this.HandRight.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.part10 = new ModelRenderer(this, 0, 28);
            this.part10.setPos(0.0F, 0.0F, 4.5F);
            this.part10.addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(part10, -1.222428624075795F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 30, 12);
            this.TopSnout.setPos(0.0F, -0.9F, 0.0F);
            this.TopSnout.addBox(-1.5F, -1.4F, -2.6F, 3.0F, 2.0F, 4.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.5122541421182385F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 46, 0);
            this.Chest.setPos(0.0F, 13.1F, -6.0F);
            this.Chest.addBox(-2.5F, -3.5F, -1.5F, 5.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.27611108233918075F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 9);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.9F, 0.5F, 2.5F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.3406882779787764F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 19);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 5.5F, -2.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6632251157578453F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 16, 23);
            this.ArmLeft.setPos(-0.01F, 3.0F, -2.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 24, 23);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 3.8F, 1.5F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 29, 25);
            this.ArmBaseLeft.setPos(1.6F, 0.5F, 0.1F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 29, 25);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.6F, 0.5F, 0.1F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 26, 0);
            this.Hips.setPos(0.0F, 0.5F, 5.5F);
            this.Hips.addBox(-2.5F, -0.5F, 0.0F, 5.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.35482543559886665F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 21, 28);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 3.7F, -0.7F);
            this.FootLeft.addBox(-1.0F, -0.5F, -1.7F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.0607374583022978F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 21, 28);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 2.5F, 1.3F);
            this.HandLeft.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 38, 11);
            this.Body.setPos(0.0F, -3.5F, 1.3F);
            this.Body.addBox(-3.0F, 0.0F, -1.0F, 6.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.3148574130387436F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 5);
            this.Mouth.setPos(0.0F, 1.5F, 0.1F);
            this.Mouth.addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.1972222088043106F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 19);
            this.UpperLegLeft.setPos(0.0F, 5.5F, -2.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6632251157578453F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.setPos(-2.0F, -1.0F, 1.2F);
            this.EarRight.addBox(-2.0F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.5522221646783615F, 0.27593656206399647F);
            this.LowerLegRight = new ModelRenderer(this, 10, 19);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.05F, 4.0F, 1.9F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.767944870877505F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 14, 10);
            this.Head.setPos(0.0F, 2.6F, -4.5F);
            this.Head.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5916666430576886F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 10, 0);
            this.Neck.setPos(0.0F, -3.0F, -1.0F);
            this.Neck.addBox(-1.5F, -0.3F, -4.5F, 3.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.1185078555446247F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 50, 26);
            this.Snout.setPos(0.0F, 0.5F, -1.5F);
            this.Snout.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.11815879002712096F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 19);
            this.LowerLegLeft.setPos(-0.05F, 4.0F, 1.9F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.767944870877505F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 24, 23);
            this.UpperArmLeft.setPos(0.0F, 3.8F, 1.5F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 16, 23);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-0.01F, 3.0F, -2.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 0, 9);
            this.ThighLeft.setPos(1.9F, 0.5F, 2.5F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.3406882779787764F, 0.0F, 0.0F);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Hips.addChild(this.part10);
            this.Snout.addChild(this.TopSnout);
            this.Hips.addChild(this.ThighRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.ArmBaseRight);
            this.Body.addChild(this.Hips);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.Body);
            this.Snout.addChild(this.Mouth);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Head.addChild(this.EarRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.Snout);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Hips.addChild(this.ThighLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(TakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.591F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.118F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.591F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.118F;
                this.Chest.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F -0.276F;
                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1F) * 0.5F + 13.1F;
                this.Hips.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.355F;
                this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.591F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.349F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.2F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.349F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.2F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.341F;
                this.UpperLegLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
                this.LowerLegLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.767F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.341F;
                this.UpperLegRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
                this.LowerLegRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.767F;
            }
        }
    }
}


