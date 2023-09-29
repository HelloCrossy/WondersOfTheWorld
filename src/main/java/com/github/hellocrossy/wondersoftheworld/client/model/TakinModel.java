package com.github.hellocrossy.wondersoftheworld.client.model;
import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.MouseDeerEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TakaheEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TakinEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

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

        public ModelRenderer Body;
        public ModelRenderer Neck1;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Neck2Left;
        public ModelRenderer Neck2Right;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer Horn1Left;
        public ModelRenderer Horn1Right;
        public ModelRenderer TopSnout1;
        public ModelRenderer Mouth;
        public ModelRenderer BeardGolden;
        public ModelRenderer BeardSichuan;
        public ModelRenderer BeardMishmi;
        public ModelRenderer BeardBhutan;
        public ModelRenderer TopSnout2;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn3Left;
        public ModelRenderer Horn4Left;
        public ModelRenderer Horn2Right;
        public ModelRenderer Horn3Right;
        public ModelRenderer Horn4Right;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Adult() {
            this.texWidth = 128;
            this.texHeight = 128;
            this.LowerLegLeft = new ModelRenderer(this, 26, 71);
            this.LowerLegLeft.setPos(0.0F, 6.0F, 3.0F);
            this.LowerLegLeft.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.5585053606381855F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 28, 23);
            this.ForearmLeft.setPos(0.0F, 4.0F, -2.5F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck2Left = new ModelRenderer(this, 0, 78);
            this.Neck2Left.mirror = true;
            this.Neck2Left.setPos(0.0F, 0.0F, -4.0F);
            this.Neck2Left.addBox(-0.1F, 0.0F, -7.0F, 2.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2Left, 0.21781708265940905F, 0.017453292519943295F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 20, 109);
            this.Horn1Right.mirror = true;
            this.Horn1Right.setPos(-1.37F, -3.2F, -0.3F);
            this.Horn1Right.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, 0.5410520681182421F, -0.19198621771937624F, -0.3141592653589793F);
            this.BeardGolden = new ModelRenderer(this, 39, 97);
            this.BeardGolden.setPos(0.0F, 1.6F, 0.0F);
            this.BeardGolden.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 5.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(BeardGolden, 0.3490658503988659F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 62);
            this.Neck1.setPos(0.0F, -6.3F, -3.5F);
            this.Neck1.addBox(-2.5F, 0.0F, -5.0F, 5.0F, 11.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.3867649595787823F, 0.0F, 0.0F);
            this.Horn4Right = new ModelRenderer(this, 45, 109);
            this.Horn4Right.mirror = true;
            this.Horn4Right.setPos(-0.7F, -0.5F, -0.5F);
            this.Horn4Right.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 0, 101);
            this.NeckLower.setPos(0.0F, 1.9F, -6.0F);
            this.NeckLower.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.2871066752688726F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 26, 79);
            this.FootLeft.setPos(-0.1F, 3.6F, -1.4F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 91);
            this.Head.setPos(0.0F, 3.0F, -7.0F);
            this.Head.addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.12217304763960307F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 11, 113);
            this.Mouth.setPos(0.0F, 1.8F, 0.0F);
            this.Mouth.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.05235987755982988F, 0.0F, 0.0F);
            this.TopSnout1 = new ModelRenderer(this, 0, 120);
            this.TopSnout1.setPos(0.0F, -2.9F, 1.3F);
            this.TopSnout1.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout1, 0.2792526803190927F, 0.0F, 0.0F);
            this.Neck2Right = new ModelRenderer(this, 0, 78);
            this.Neck2Right.setPos(0.0F, 0.0F, -4.0F);
            this.Neck2Right.addBox(-1.9F, 0.0F, -7.0F, 2.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2Right, 0.21781708265940905F, -0.017453292519943295F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 45);
            this.Hips.setPos(0.0F, -1.5F, 12.0F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7.0F, 11.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.4300491170387584F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 26, 45);
            this.ThighLeft.setPos(2.2F, 4.1F, 2.7F);
            this.ThighLeft.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.4253367533584041F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 28, 111);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(-1.0F, -0.3F, 0.0F);
            this.Horn2Right.addBox(-1.7F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, 0.0F, 0.4363323129985824F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 26, 45);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, 4.1F, 2.7F);
            this.ThighRight.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 9.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.4253367533584041F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 28, 0);
            this.ArmBaseLeft.setPos(2.1F, 0.6F, -0.4F);
            this.ArmBaseLeft.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3839724354387525F, 0.0F, 0.0F);
            this.TopSnout2 = new ModelRenderer(this, 12, 120);
            this.TopSnout2.setPos(0.0F, 0.0F, -3.0F);
            this.TopSnout2.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout2, 0.6981317007977318F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 113);
            this.Snout.setPos(0.0F, 0.3F, -2.4F);
            this.Snout.addBox(-1.5F, 0.0F, -3.3F, 3.0F, 2.0F, 5.0F, 0.2F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.2792526803190927F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 28, 111);
            this.Horn2Left.setPos(1.0F, -0.3F, 0.0F);
            this.Horn2Left.addBox(-0.3F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, 0.0F, -0.4363323129985824F, 0.0F);
            this.Tail = new ModelRenderer(this, 11, 78);
            this.Tail.setPos(0.0F, 1.3F, 6.0F);
            this.Tail.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.47333330778824817F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 28, 23);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 4.0F, -2.5F);
            this.ForearmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 27, 71);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 6.0F, 3.0F);
            this.LowerLegRight.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.5585053606381855F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 28, 14);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 8.0F, 1.5F);
            this.ArmRight.addBox(-1.5F, -2.0F, -3.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.10471975511965977F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 20, 109);
            this.Horn1Left.setPos(1.37F, -3.2F, -0.3F);
            this.Horn1Left.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left, 0.5410520681182421F, 0.19198621771937624F, 0.3141592653589793F);
            this.Horn4Left = new ModelRenderer(this, 45, 109);
            this.Horn4Left.setPos(0.7F, -0.5F, -0.5F);
            this.Horn4Left.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 27, 79);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.6F, -1.4F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Horn3Left = new ModelRenderer(this, 34, 108);
            this.Horn3Left.setPos(0.7F, -0.5F, -0.5F);
            this.Horn3Left.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 21, 118);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.5F, -1.2F, 1.0F);
            this.EarRight.addBox(-0.3F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.4300491170387584F, -0.8384561886370425F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 7.0F, -6.0F);
            this.Chest.addBox(-3.5F, -6.5F, -3.5F, 7.0F, 13.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2617993877991494F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 28, 14);
            this.ArmLeft.setPos(0.0F, 8.0F, 1.5F);
            this.ArmLeft.addBox(-1.5F, -2.0F, -3.0F, 3.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.10471975511965977F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 27, 61);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 8.0F, -2.0F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6558947648574022F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 36, 25);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.1F, 2.7F, 0.4F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 28, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.1F, 0.6F, -0.4F);
            this.ArmBaseRight.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3839724354387525F, 0.0F, 0.0F);
            this.Horn3Right = new ModelRenderer(this, 34, 108);
            this.Horn3Right.mirror = true;
            this.Horn3Right.setPos(-0.8F, -0.5F, -0.5F);
            this.Horn3Right.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 20, 118);
            this.EarLeft.setPos(1.5F, -1.2F, 1.0F);
            this.EarLeft.addBox(-0.7F, -1.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.4300491170387584F, 0.8384561886370425F, 0.0F);
            this.BeardMishmi = new ModelRenderer(this, 30, 86);
            this.BeardMishmi.setPos(0.0F, 0.8F, 0.7F);
            this.BeardMishmi.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 5.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(BeardMishmi, 0.12217304763960307F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 26, 61);
            this.UpperLegLeft.setPos(0.0F, 8.0F, -2.0F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6558947648574022F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 20);
            this.Body.setPos(0.0F, -4.8F, 1.3F);
            this.Body.addBox(-4.0F, -2.0F, 0.0F, 8.0F, 13.0F, 12.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.17453292519943295F, 0.0F, 0.0F);
            this.BeardSichuan = new ModelRenderer(this, 21, 97);
            this.BeardSichuan.setPos(0.0F, 1.1F, 0.7F);
            this.BeardSichuan.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 5.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(BeardSichuan, -0.03490658503988659F, 0.0F, 0.0F);
            this.BeardBhutan = new ModelRenderer(this, 39, 97);
            this.BeardBhutan.setPos(0.0F, 0.1F, 0.7F);
            this.BeardBhutan.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 5.0F, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(BeardBhutan, 0.12217304763960307F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 36, 25);
            this.HandLeft.setPos(-0.1F, 2.7F, 0.4F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Neck1.addChild(this.Neck2Left);
            this.Head.addChild(this.Horn1Right);
            this.Snout.addChild(this.BeardGolden);
            this.Chest.addChild(this.Neck1);
            this.Horn2Right.addChild(this.Horn4Right);
            this.Neck2Left.addChild(this.NeckLower);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Neck2Left.addChild(this.Head);
            this.Snout.addChild(this.Mouth);
            this.Snout.addChild(this.TopSnout1);
            this.Neck1.addChild(this.Neck2Right);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.TopSnout1.addChild(this.TopSnout2);
            this.Head.addChild(this.Snout);
            this.Horn1Left.addChild(this.Horn2Left);
            this.Hips.addChild(this.Tail);
            this.ArmRight.addChild(this.ForearmRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Head.addChild(this.Horn1Left);
            this.Horn2Left.addChild(this.Horn4Left);
            this.LowerLegRight.addChild(this.FootRight);
            this.Horn2Left.addChild(this.Horn3Left);
            this.Head.addChild(this.EarRight);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Horn2Right.addChild(this.Horn3Right);
            this.Head.addChild(this.EarLeft);
            this.Snout.addChild(this.BeardMishmi);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Chest.addChild(this.Body);
            this.Snout.addChild(this.BeardSichuan);
            this.Snout.addChild(this.BeardBhutan);
            this.ForearmLeft.addChild(this.HandLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(TakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) -0.122F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.386F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.122F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.2F + 0.386F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.122F;

            this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 6.5F;
            this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.261F;
            this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.174F;
            this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.430F;

            this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.383F;
            this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.104F;
            this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
            this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * - 1.8F) * 0.5F;
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
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer NeckRight;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer SnoutRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.ArmLeft = new ModelRenderer(this, 24, 19);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.1F, 3.0F, 1.0F);
            this.ArmLeft.addBox(-1.0F, -0.1F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.11728612207217244F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 0, 26);
            this.ForearmLeft.mirror = true;
            this.ForearmLeft.setPos(-0.01F, 3.0F, -2.0F);
            this.ForearmLeft.addBox(-1.0F, -0.4F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 12, 29);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-0.8F, -1.5F, -0.1F);
            this.EarRight.addBox(-0.7F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.03909537541112055F, 0.5082398928281348F);
            this.ArmRight = new ModelRenderer(this, 24, 19);
            this.ArmRight.setPos(0.0F, 3.0F, 1.0F);
            this.ArmRight.addBox(-1.0F, -0.1F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.11728612207217244F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 0, 26);
            this.ForearmRight.setPos(0.01F, 3.0F, -2.0F);
            this.ForearmRight.addBox(-1.0F, -0.4F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 24, 29);
            this.FootRight.mirror = true;
            this.FootRight.setPos(-0.15F, 3.0F, -1.0F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.NeckRight = new ModelRenderer(this, 0, 19);
            this.NeckRight.mirror = true;
            this.NeckRight.setPos(0.0F, 0.0F, 0.0F);
            this.NeckRight.addBox(-1.0F, 0.0F, -3.1F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckRight, 0.0F, -0.03490658503988659F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 9, 26);
            this.LowerLegRight.setPos(0.1F, 4.0F, 2.0F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.5473352640780661F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 12, 29);
            this.EarLeft.setPos(0.8F, -1.5F, -0.1F);
            this.EarLeft.addBox(-0.3F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, 0.03909537541112055F, -0.5082398928281348F);
            this.TopSnout = new ModelRenderer(this, 7, 11);
            this.TopSnout.setPos(0.0F, -1.3F, 0.4F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.7038913192872462F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 21, 7);
            this.ArmBaseRight.setPos(-1.0F, 0.5F, 0.1F);
            this.ArmBaseRight.addBox(-1.1F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.2792526803190927F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 24, 29);
            this.HandLeft.setPos(0.1F, 1.9F, 1.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 24, 13);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(-0.1F, 4.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.9382889765773795F, 0.0F, 0.0F);
            this.SnoutRight = new ModelRenderer(this, 8, 26);
            this.SnoutRight.mirror = true;
            this.SnoutRight.setPos(0.0F, 0.0F, 0.0F);
            this.SnoutRight.addBox(-0.7F, 0.0F, -1.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 24, 29);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 1.9F, 1.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 19);
            this.Neck.setPos(0.0F, -2.3F, -1.5F);
            this.Neck.addBox(0.0F, 0.0F, -3.1F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.03909537541112055F, 0.017453292519943295F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -2.5F, 1.0F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.08726646259971647F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 12, 11);
            this.Chest.setPos(0.0F, 14.8F, -3.0F);
            this.Chest.addBox(-1.5F, -2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.15707963267948966F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 8, 19);
            this.Mouth.setPos(0.0F, 0.5F, 0.0F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 3.4906584259663615E-4F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 24, 13);
            this.UpperLegRight.setPos(0.1F, 4.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.9382889765773795F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 9, 26);
            this.LowerLegLeft.setPos(-0.1F, 4.0F, 2.0F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.5473352640780661F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 0, 11);
            this.NeckLower.setPos(0.0F, 3.0F, -3.0F);
            this.NeckLower.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.35185837453889574F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 20, 0);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.1F, 1.1F, 1.3F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.12828169835710754F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 20, 0);
            this.ThighRight.setPos(-1.1F, 1.1F, 1.3F);
            this.ThighRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.12828169835710754F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 24, 29);
            this.FootLeft.setPos(0.15F, 3.0F, -1.0F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.4F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 14, 3);
            this.Snout.setPos(0.0F, 0.0F, -1.0F);
            this.Snout.addBox(-0.3F, 0.0F, -1.6F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 14, 0);
            this.Tail.setPos(0.0F, 0.7F, 3.0F);
            this.Tail.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.4363323129985824F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 24, 24);
            this.Head.setPos(0.0F, 1.5F, -3.1F);
            this.Head.addBox(-0.95F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.2792526803190927F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 21, 7);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(1.3F, 0.5F, 0.1F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.2792526803190927F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 12, 19);
            this.Hips.setPos(0.0F, 0.25F, 6.0F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.43912483713861217F, 0.0F, 0.0F);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.Head.addChild(this.EarRight);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.ArmRight.addChild(this.ForearmRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Neck.addChild(this.NeckRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Head.addChild(this.EarLeft);
            this.Snout.addChild(this.TopSnout);
            this.Chest.addChild(this.ArmBaseRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Snout.addChild(this.SnoutRight);
            this.ForearmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Neck);
            this.Chest.addChild(this.Body);
            this.Snout.addChild(this.Mouth);
            this.ThighRight.addChild(this.UpperLegRight);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Neck.addChild(this.NeckLower);
            this.Hips.addChild(this.ThighLeft);
            this.Hips.addChild(this.ThighRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.Tail);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Body.addChild(this.Hips);
            this.saveBase();

        }

        @Override
        public void setupAnim(TakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
            }
        }
    }
}


