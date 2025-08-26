package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.CapeBuffaloEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class CapeBuffaloModel extends ZawaBaseModel<CapeBuffaloEntity> {
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

    public static class Adult extends CapeBuffaloModel {

        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Body;
        public ModelRenderer NeckLower;
        public ModelRenderer Head;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Horn1Right;
        public ModelRenderer Horn1Righ;
        public ModelRenderer Muzzle;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail2;
        public ModelRenderer TailTuft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;


        public Adult() {
            texWidth = 96;
            texHeight = 128;
            this.ForearmRight = new ModelRenderer(this, 80, 81);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 4.5F, -4.5F);
            this.ForearmRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 70, 53);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-4.1F, 0.9F, -0.4F);
            this.ArmBaseRight.addBox(-3.0F, 0.0F, -3.5F, 6.0F, 10.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.39915681457848917F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 76, 70);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 9.0F, 2.5F);
            this.ArmRight.addBox(-2.5F, 0.0F, -5.0F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.1502728426045993F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 36, 118);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 7.0F, -2.5F);
            this.FootRight.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.03909537541112055F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 22, 102);
            this.TopSnout.setPos(0.0F, -1.0F, 2.0F);
            this.TopSnout.addBox(-2.5F, -1.5F, -6.0F, 5.0F, 3.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.45535640450848164F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 10, 119);
            this.Horn2Left.mirror = true;
            this.Horn2Left.setPos(-2.4F, -1.5F, 0.0F);
            this.Horn2Left.addBox(-6.0F, -2.0F, -1.0F, 6.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, 0.0F, 0.0F, -0.27366763203903305F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 2.5F, -2.5F);
            this.Chest.addBox(-6.5F, -8.0F, -4.5F, 13.0F, 16.0F, 9.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2275909337942703F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 48, 63);
            this.NeckLower.setPos(0.0F, -11.3F, -4.7F);
            this.NeckLower.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 13.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.5988224903277043F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 0);
            this.ThighRight.setPos(-4.0F, 4.5F, 6.0F);
            this.ThighRight.addBox(-3.5F, 0.0F, -4.5F, 7.0F, 13.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.14416420020947326F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 0, 115);
            this.Horn3Right.setPos(6.0F, 1.0F, 0.5F);
            this.Horn3Right.addBox(-2.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Right, 0.0F, 0.0F, 0.23457224414434488F);
            this.ArmLeft = new ModelRenderer(this, 76, 70);
            this.ArmLeft.setPos(0.0F, 9.0F, 2.5F);
            this.ArmLeft.addBox(-2.5F, 0.0F, -5.0F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.1502728426045993F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 20, 112);
            this.Mouth.setPos(0.0F, 4.0F, -0.4F);
            this.Mouth.addBox(-2.0F, 0.0F, -5.5F, 4.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.18203784630933073F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 86);
            this.Head.setPos(0.0F, -9.1F, -0.8F);
            this.Head.addBox(-4.0F, -4.5F, -3.5F, 8.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -1.5622442507443797F, 0.0F, 0.0F);
            this.TailTuft = new ModelRenderer(this, 80, 45);
            this.TailTuft.setPos(0.0F, 4.0F, 0.0F);
            this.TailTuft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailTuft, 0.02356194531804237F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 0, 115);
            this.Horn3Left.mirror = true;
            this.Horn3Left.setPos(-6.0F, 1.0F, 0.5F);
            this.Horn3Left.addBox(0.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn3Left, 0.0F, 0.0F, -0.23457224414434488F);
            this.Neck = new ModelRenderer(this, 46, 22);
            this.Neck.setPos(0.0F, -4.7F, -3.5F);
            this.Neck.addBox(-3.0F, -11.3F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.8861773173039496F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 74, 0);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(0.3F, 13.0F, -3.0F);
            this.UpperLegLeft.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.7133160466479549F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 74, 0);
            this.UpperLegRight.setPos(0.3F, 13.0F, -3.0F);
            this.UpperLegRight.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.7133160466479549F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 36, 118);
            this.HandLeft.setPos(0.0F, 4.7F, 0.5F);
            this.HandLeft.addBox(-2.0F, 0.0F, -1.6F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.024260076353049827F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 36, 118);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(0.0F, 7.0F, -2.5F);
            this.FootLeft.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.03909537541112055F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 82, 23);
            this.Tail1.setPos(0.0F, 0.5F, 11.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.19809487675925913F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 58);
            this.Hips.setPos(0.0F, 0.0F, 15.0F);
            this.Hips.addBox(-6.5F, 0.0F, 0.0F, 13.0F, 17.0F, 11.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.12199851071966199F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 44, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(4.0F, 4.5F, 6.0F);
            this.ThighLeft.addBox(-3.5F, 0.0F, -4.5F, 7.0F, 13.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.14416420020947326F, 0.0F, 0.0F);
            this.Horn1Righ = new ModelRenderer(this, 0, 102);
            this.Horn1Righ.mirror = true;
            this.Horn1Righ.setPos(-1.0F, -2.8F, -1.0F);
            this.Horn1Righ.addBox(-3.0F, -4.0F, -1.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Righ, -0.17453292519943295F, 0.05235987755982988F, -0.06981317007977318F);
            this.HandRight = new ModelRenderer(this, 36, 118);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 4.7F, 0.5F);
            this.HandRight.addBox(-2.0F, 0.0F, -1.6F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.024260076353049827F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 80, 81);
            this.ForearmLeft.setPos(0.0F, 4.6F, -4.5F);
            this.ForearmLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 82, 32);
            this.Tail2.setPos(0.0F, 6.9F, -1.0F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.03281218985426961F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 26);
            this.EarLeft.setPos(3.5F, -2.0F, 1.3F);
            this.EarLeft.addBox(-1.0F, -1.0F, 0.0F, 6.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.5462880425584197F, 0.5335471470083444F);
            this.LowerLegLeft = new ModelRenderer(this, 74, 11);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(0.0F, 5.0F, 4.5F);
            this.LowerLegLeft.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6677629425182585F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 70, 53);
            this.ArmBaseLeft.setPos(4.1F, 0.9F, -0.4F);
            this.ArmBaseLeft.addBox(-3.0F, 0.0F, -3.5F, 6.0F, 10.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.39915681457848917F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 2, 25);
            this.Body.setPos(0.0F, -8.0F, 0.7F);
            this.Body.addBox(-7.0F, 0.0F, 0.0F, 14.0F, 18.0F, 15.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2275909337942703F, 0.0F, 0.0F);
            this.Horn4Left = new ModelRenderer(this, 0, 122);
            this.Horn4Left.mirror = true;
            this.Horn4Left.setPos(0.0F, -5.0F, 0.0F);
            this.Horn4Left.addBox(0.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Left, 0.0F, 0.0F, -0.27366763203903305F);
            this.Horn1Right = new ModelRenderer(this, 0, 102);
            this.Horn1Right.setPos(1.0F, -2.8F, -1.0F);
            this.Horn1Right.addBox(-1.0F, -4.0F, -1.5F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, -0.17453292519943295F, -0.05235987755982988F, 0.06981317007977318F);
            this.EarRight = new ModelRenderer(this, 0, 26);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-3.5F, -2.0F, 1.3F);
            this.EarRight.addBox(-5.0F, -1.0F, 0.0F, 6.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.5462880425584197F, -0.5335471470083444F);
            this.Muzzle = new ModelRenderer(this, 47, 108);
            this.Muzzle.setPos(0.0F, -1.5F, -3.5F);
            this.Muzzle.addBox(-3.0F, 0.0F, -6.0F, 6.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Muzzle, 0.33161255787892263F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 10, 119);
            this.Horn2Right.setPos(2.4F, -1.5F, 0.0F);
            this.Horn2Right.addBox(0.0F, -2.0F, -1.0F, 6.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, 0.0F, 0.0F, 0.27366763203903305F);
            this.Horn4Right = new ModelRenderer(this, 0, 122);
            this.Horn4Right.setPos(0.0F, -5.0F, 0.0F);
            this.Horn4Right.addBox(-4.0F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn4Right, 0.0F, 0.0F, 0.27366763203903305F);
            this.LowerLegRight = new ModelRenderer(this, 74, 11);
            this.LowerLegRight.setPos(0.0F, 5.0F, 4.5F);
            this.LowerLegRight.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6677629425182585F, 0.0F, 0.0F);
            this.ArmRight.addChild(this.ForearmRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Muzzle.addChild(this.TopSnout);
            this.Horn1Righ.addChild(this.Horn2Left);
            this.Neck.addChild(this.NeckLower);
            this.Hips.addChild(this.ThighRight);
            this.Horn2Right.addChild(this.Horn3Right);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Muzzle.addChild(this.Mouth);
            this.Neck.addChild(this.Head);
            this.Tail2.addChild(this.TailTuft);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Chest.addChild(this.Neck);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Hips.addChild(this.Tail1);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.Head.addChild(this.Horn1Righ);
            this.ForearmRight.addChild(this.HandRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.EarLeft);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Chest.addChild(this.Body);
            this.Horn3Left.addChild(this.Horn4Left);
            this.Head.addChild(this.Horn1Right);
            this.Head.addChild(this.EarRight);
            this.Head.addChild(this.Muzzle);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Horn3Right.addChild(this.Horn4Right);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.saveBase();

        }

        @Override
        public void setupAnim(CapeBuffaloEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 1.562F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.886F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 1.562F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 0.5f;
            } else {
                float speed = 0.6f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.886F;
                this.Head.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.562F;

                this.Chest.y = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F + 2.5F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.227F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.227F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.121F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.6F) * 0.5F + 0.399F;
                this.ArmLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree) * 0.5F - 0.15F;
                this.HandLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.024F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.6F) * 0.5F + 0.399F;
                this.ArmRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.15F;
                this.HandRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.024F;

                this.ThighLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.144F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.713F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.667F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.039F;
                this.ThighRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.144F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.713F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.667F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.039F;
            }
        }
    }

    public static class Child extends CapeBuffaloModel {
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer EarRight;
        public ModelRenderer EarLeft;
        public ModelRenderer Muzzle;
        public ModelRenderer Mouth;
        public ModelRenderer TopSnout;

        public Child() {
            texWidth = 64;
            texHeight = 64;
            this.FootRight = new ModelRenderer(this, 38, 55);
            this.FootRight.setPos(0.1F, 4.7F, -0.7F);
            this.FootRight.addBox(-1.0F, -0.5F, -1.7F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Muzzle = new ModelRenderer(this, 21, 55);
            this.Muzzle.setPos(0.0F, -0.5F, -2.2F);
            this.Muzzle.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Muzzle, 0.2925171866289913F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 37, 41);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 5.5F, -2.0F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6630506121274178F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 22, 50);
            this.TopSnout.setPos(0.0F, 0.3F, 1.1F);
            this.TopSnout.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.37716566200861895F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 8, 22);
            this.Tail1.setPos(0.0F, 0.0F, 4.5F);
            this.Tail1.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -1.222428624075795F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 26, 32);
            this.UpperArmLeft.setPos(0.0F, 4.8F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 7, 26);
            this.Tail2.setPos(0.0F, 0.0F, 2.8F);
            this.Tail2.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.19547687289441354F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 26, 32);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 4.8F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 35, 31);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, 1.9F, 2.5F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.16650440997446878F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 46, 0);
            this.Chest.setPos(0.0F, 11.8F, -6.0F);
            this.Chest.addBox(-3.0F, -4.0F, -1.5F, 6.0F, 9.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.10140362854218513F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 22, 4);
            this.Neck.setPos(0.0F, -3.4F, -0.3F);
            this.Neck.addBox(-1.5F, -0.3F, -3.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.1429424584146426F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 26, 37);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-0.01F, 3.0F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 35, 31);
            this.ThighLeft.setPos(2.2F, 1.9F, 2.5F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.16650440997446878F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 38, 48);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.05F, 4.0F, 1.9F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6839945098881279F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 45);
            this.EarLeft.setPos(2.5F, -1.0F, 1.3F);
            this.EarLeft.addBox(-1.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.46914448828868976F, -0.46739918566830635F, -0.31991885055898F);
            this.FootLeft = new ModelRenderer(this, 38, 55);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 4.7F, -0.7F);
            this.FootLeft.addBox(-1.0F, -0.5F, -1.7F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 22, 24);
            this.ArmBaseLeft.setPos(1.9F, 0.5F, 0.1F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 9, 31);
            this.Tail3.setPos(0.0F, 0.0F, 2.6F);
            this.Tail3.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 34, 13);
            this.Body.setPos(0.0F, -3.9F, 1.3F);
            this.Body.addBox(-3.5F, 0.0F, -1.0F, 7.0F, 9.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.14032447119455382F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 26, 37);
            this.ArmLeft.setPos(-0.01F, 3.0F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 45);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.5F, -1.0F, 1.3F);
            this.EarRight.addBox(-3.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.46914448828868976F, 0.46739918566830635F, 0.31991885055898F);
            this.ArmBaseRight = new ModelRenderer(this, 22, 24);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.9F, 0.5F, 0.1F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 26, 42);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 2.5F, 1.3F);
            this.HandLeft.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 26, 42);
            this.HandRight.setPos(0.1F, 2.5F, 1.3F);
            this.HandRight.addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 48);
            this.Head.setPos(0.0F, 2.6F, -4.9F);
            this.Head.addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3534291735288517F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 20, 13);
            this.NeckLower.setPos(0.0F, 6.0F, 0.0F);
            this.NeckLower.addBox(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.27366763203903305F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 38, 48);
            this.LowerLegLeft.setPos(-0.05F, 4.0F, 1.9F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6839945098881279F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 37, 41);
            this.UpperLegLeft.setPos(0.0F, 5.5F, -2.0F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6630506121274178F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 23, 60);
            this.Mouth.setPos(0.0F, 2.1F, 0.8F);
            this.Mouth.addBox(-1.5F, 0.0F, -3.5F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.10384708716471125F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 0);
            this.Hips.setPos(0.0F, 0.5F, 6.5F);
            this.Hips.addBox(-3.0F, -0.5F, 0.0F, 6.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.18046704731937477F, 0.0F, 0.0F);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.Muzzle);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Muzzle.addChild(this.TopSnout);
            this.Hips.addChild(this.Tail1);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Tail1.addChild(this.Tail2);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.Neck);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Hips.addChild(this.ThighLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.EarLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Tail2.addChild(this.Tail3);
            this.Chest.addChild(this.Body);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Neck.addChild(this.Head);
            this.Neck.addChild(this.NeckLower);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Muzzle.addChild(this.Mouth);
            this.Body.addChild(this.Hips);
            this.saveBase();

        }

        @Override
        public void setupAnim(CapeBuffaloEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.353F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.142F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.353F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.222F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.195F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 0.8f;
                float degree = 0.8f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.142F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.353F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.222F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.195F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 11.8F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.101F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.14F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.18F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.174F;
                this.UpperArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.174F;
                this.UpperArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.166F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.683F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.166F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.683F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}
