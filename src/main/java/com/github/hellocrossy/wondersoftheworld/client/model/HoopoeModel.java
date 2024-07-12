package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.HoopoeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class HoopoeModel extends ZawaBaseModel<HoopoeEntity> {
    public ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends HoopoeModel {
        public ModelRenderer TailBase;
        public ModelRenderer WingLeft;
        public ModelRenderer WingRight;
        public ModelRenderer Neck1;
        public ModelRenderer LegLeft;
        public ModelRenderer LegRight;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer LowerBill;
        public ModelRenderer Crest1;
        public ModelRenderer Crest1_1;
        public ModelRenderer Crest2;
        public ModelRenderer Crest3;
        public ModelRenderer Crest7;
        public ModelRenderer Crest4;
        public ModelRenderer Crest5;
        public ModelRenderer Crest6;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer FootRight;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe1Right;

        public Adult() {
            texWidth = 64;
            texHeight = 32;
            this.Toe1Left = new ModelRenderer(this, 13, 9);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.Crest1 = new ModelRenderer(this, 18, 0);
            this.Crest1.setPos(0.0F, -2.9F, 1.0F);
            this.Crest1.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1, 2.321985919674168F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.7285004590772052F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 13, 9);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.0F, -0.591841146688116F);
            this.LegLeft = new ModelRenderer(this, 11, 1);
            this.LegLeft.setPos(1.3F, 0.7F, -1.1F);
            this.LegLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.18692476355438295F, 0.0F, 0.0F);
            this.Crest2 = new ModelRenderer(this, 23, 0);
            this.Crest2.setPos(0.0F, 0.0F, 0.0F);
            this.Crest2.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest2, -0.5323254218582705F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 40, 27);
            this.TailRight.setPos(-1.1F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, 0.13665927909957545F);
            this.LegRight = new ModelRenderer(this, 11, 1);
            this.LegRight.setPos(-1.3F, 0.7F, -1.1F);
            this.LegRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.18692476355438295F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 45, 26);
            this.TailMiddle.setPos(0.0F, 1.5F, -0.01F);
            this.TailMiddle.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.4098033003787853F, 0.0F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 28, 12);
            this.WingLeft.setPos(1.9F, -1.7F, 1.1F);
            this.WingLeft.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, 0.18692476355438295F, -0.0911061832922575F, 0.13665927909957545F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.45535640450848164F, 0.0F, 0.0F);
            this.Crest6 = new ModelRenderer(this, 18, 0);
            this.Crest6.setPos(0.0F, 0.4F, -1.1F);
            this.Crest6.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest6, -0.6829473549475088F, 0.0F, 0.0F);
            this.Crest1_1 = new ModelRenderer(this, 18, 0);
            this.Crest1_1.setPos(0.0F, -2.9F, 1.0F);
            this.Crest1_1.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1_1, 2.321985919674168F, 0.0F, 0.0F);
            this.UpperBill = new ModelRenderer(this, 13, 12);
            this.UpperBill.setPos(0.0F, -2.8F, 0.7F);
            this.UpperBill.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.15690509575954859F, 0.0F, 0.0F);
            this.Crest5 = new ModelRenderer(this, 18, 0);
            this.Crest5.setPos(0.0F, 0.4F, -1.1F);
            this.Crest5.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest5, -0.6829473549475088F, 0.0F, 0.0F);
            this.Crest4 = new ModelRenderer(this, 22, 5);
            this.Crest4.setPos(0.0F, 0.4F, -0.2F);
            this.Crest4.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest4, -0.45535640450848164F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 13, 9);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.3F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.9217084019466553F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 19, 12);
            this.WingRight.setPos(-1.9F, -1.7F, 1.1F);
            this.WingRight.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, 0.18692476355438295F, 0.0911061832922575F, -0.13665927909957545F);
            this.FootRight = new ModelRenderer(this, 13, 5);
            this.FootRight.setPos(0.0F, 0.2F, -1.7F);
            this.FootRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.4630358625383205F, 0.0F, 0.0F);
            this.Crest7 = new ModelRenderer(this, 18, 0);
            this.Crest7.setPos(0.0F, 0.5F, -0.5F);
            this.Crest7.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest7, -0.27314402127920984F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 35, 27);
            this.TailLeft.setPos(1.1F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, -0.13665927909957545F);
            this.LowerBill = new ModelRenderer(this, 13, 17);
            this.LowerBill.setPos(0.0F, -2.9F, 0.3F);
            this.LowerBill.addBox(-0.5F, -2.2F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, 0.009424778335276407F, 0.0F, 0.0F);
            this.Toe2Right = new ModelRenderer(this, 13, 9);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.FootLeft = new ModelRenderer(this, 13, 5);
            this.FootLeft.setPos(0.0F, 0.2F, -1.7F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.4630358625383205F, 0.0F, 0.0F);
            this.Crest3 = new ModelRenderer(this, 28, 0);
            this.Crest3.setPos(0.0F, 0.5F, -0.5F);
            this.Crest3.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest3, -0.27314402127920984F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 52, 27);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.18203784630933073F, 0.0F, 0.0F);
            this.FootLeft.addChild(this.Toe1Left);
            this.Head.addChild(this.Crest1);
            this.Body.addChild(this.Neck1);
            this.FootRight.addChild(this.Toe1Right);
            this.Body.addChild(this.LegLeft);
            this.Crest1.addChild(this.Crest2);
            this.TailMiddle.addChild(this.TailRight);
            this.Body.addChild(this.LegRight);
            this.TailBase.addChild(this.TailMiddle);
            this.Neck2.addChild(this.Head);
            this.Body.addChild(this.WingLeft);
            this.Neck1.addChild(this.Neck2);
            this.Crest4.addChild(this.Crest6);
            this.Head.addChild(this.Crest1_1);
            this.Head.addChild(this.UpperBill);
            this.Crest4.addChild(this.Crest5);
            this.Crest3.addChild(this.Crest4);
            this.FootLeft.addChild(this.Toe2Left);
            this.Body.addChild(this.WingRight);
            this.LegRight.addChild(this.FootRight);
            this.Crest2.addChild(this.Crest7);
            this.TailMiddle.addChild(this.TailLeft);
            this.Head.addChild(this.LowerBill);
            this.FootRight.addChild(this.Toe2Right);
            this.LegLeft.addChild(this.FootLeft);
            this.Crest2.addChild(this.Crest3);
            this.Body.addChild(this.TailBase);
            this.saveBase();
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
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.728F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.455F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.409F;

            this.TailBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.182F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 1F) * 0.5F + 0.728F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.455F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.409F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.921F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 20.3F;
            this.TailBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.182F;

            this.LegLeft.y = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.7F;
            this.LegLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.186F;
            this.FootLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.463F;
            this.LegRight.y = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.7F;
            this.LegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.186F;
            this.FootRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.463F;
        }
    }

    public static class Flying extends HoopoeModel {
        public ModelRenderer TailBase;
        public ModelRenderer Neck1;
        public ModelRenderer LegLeft;
        public ModelRenderer LegRight;
        public ModelRenderer Wing1Right;
        public ModelRenderer Wing1Left;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer LowerBill;
        public ModelRenderer Crest1;
        public ModelRenderer Crest2;
        public ModelRenderer Crest12;
        public ModelRenderer Crest3;
        public ModelRenderer Crest4;
        public ModelRenderer Crest32;
        public ModelRenderer Crest5;
        public ModelRenderer Crest52;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer FootRight;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe1Right;
        public ModelRenderer Wing2Right;
        public ModelRenderer WingFeather1Right;
        public ModelRenderer WingFeather2Right;
        public ModelRenderer WingFeather3Right;
        public ModelRenderer WingFeather4Right;
        public ModelRenderer WingFeather5Right;
        public ModelRenderer WingFeather6Right;
        public ModelRenderer RightWingFeather7;
        public ModelRenderer WingFeather8Right;
        public ModelRenderer Wing2Left;
        public ModelRenderer WingFeather1Left;
        public ModelRenderer WingFeather2Left;
        public ModelRenderer WingFeather3Left;
        public ModelRenderer WingFeather4Left;
        public ModelRenderer WingFeather5Left;
        public ModelRenderer WingFeather6Left;
        public ModelRenderer WingFeather7Left;
        public ModelRenderer WingFeather8Left;

        public Flying() {

            texWidth = 64;
            texHeight = 32;
            this.Wing1Right = new ModelRenderer(this, 58, 0);
            this.Wing1Right.setPos(-1.9F, -1.9F, 1.0F);
            this.Wing1Right.addBox(-2.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Right, 0.0F, 0.500909508638178F, -0.18203784630933073F);
            this.WingFeather5Left = new ModelRenderer(this, 39, 12);
            this.WingFeather5Left.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather5Left.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather5Left, 0.0F, 0.0F, 0.2275909337942703F);
            this.Wing1Left = new ModelRenderer(this, 39, 0);
            this.Wing1Left.setPos(1.9F, -1.9F, 1.0F);
            this.Wing1Left.addBox(0.0F, 0.0F, -0.1F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Left, 0.0F, -0.500909508638178F, 0.18203784630933073F);
            this.WingFeather8Left = new ModelRenderer(this, 41, 18);
            this.WingFeather8Left.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather8Left.addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather8Left, 0.0F, 0.0F, 0.2275909337942703F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3186971254089062F, 0.0F, 0.0F);
            this.WingFeather4Right = new ModelRenderer(this, 52, 12);
            this.WingFeather4Right.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather4Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather4Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.UpperBill = new ModelRenderer(this, 13, 12);
            this.UpperBill.setPos(0.0F, -2.8F, 0.7F);
            this.UpperBill.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.15690509575954859F, 0.0F, 0.0F);
            this.WingFeather1Left = new ModelRenderer(this, 39, 12);
            this.WingFeather1Left.setPos(3.0F, -4.0F, -0.01F);
            this.WingFeather1Left.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather1Left, 0.0F, 0.0F, 0.27314402127920984F);
            this.Wing2Left = new ModelRenderer(this, 39, 6);
            this.Wing2Left.setPos(2.0F, 4.0F, -0.01F);
            this.Wing2Left.addBox(0.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.4098033003787853F);
            this.WingFeather4Left = new ModelRenderer(this, 39, 12);
            this.WingFeather4Left.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather4Left.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather4Left, 0.0F, 0.0F, 0.2275909337942703F);
            this.Crest3 = new ModelRenderer(this, 28, 0);
            this.Crest3.setPos(0.0F, 0.5F, -0.5F);
            this.Crest3.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest3, -0.27314402127920984F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 11, 1);
            this.LegLeft.setPos(1.3F, 0.7F, -1.1F);
            this.LegLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.18692476355438295F, 0.0F, 0.0F);
            this.Wing2Right = new ModelRenderer(this, 56, 6);
            this.Wing2Right.setPos(-2.0F, 4.0F, -0.01F);
            this.Wing2Right.addBox(-3.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.3642502295386026F);
            this.FootRight = new ModelRenderer(this, 13, 5);
            this.FootRight.setPos(0.0F, 0.2F, -1.7F);
            this.FootRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.4630358625383205F, 0.0F, 0.0F);
            this.WingFeather8Right = new ModelRenderer(this, 52, 18);
            this.WingFeather8Right.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather8Right.addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather8Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.TailRight = new ModelRenderer(this, 35, 27);
            this.TailRight.setPos(-1.1F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, 0.13665927909957545F);
            this.WingFeather6Right = new ModelRenderer(this, 52, 12);
            this.WingFeather6Right.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather6Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather6Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.Crest52 = new ModelRenderer(this, 29, 6);
            this.Crest52.setPos(0.0F, 0.4F, -1.1F);
            this.Crest52.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest52, -0.6829473549475088F, 0.0F, 0.0F);
            this.Crest12 = new ModelRenderer(this, 18, 0);
            this.Crest12.setPos(0.0F, 0.0F, 0.0F);
            this.Crest12.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.WingFeather2Left = new ModelRenderer(this, 39, 12);
            this.WingFeather2Left.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather2Left.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather2Left, 0.0F, 0.0F, 0.2275909337942703F);
            this.TailMiddle = new ModelRenderer(this, 45, 26);
            this.TailMiddle.setPos(0.0F, 1.5F, -0.01F);
            this.TailMiddle.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.WingFeather7Left = new ModelRenderer(this, 41, 15);
            this.WingFeather7Left.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather7Left.addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather7Left, 0.0F, 0.0F, 0.2275909337942703F);
            this.LegRight = new ModelRenderer(this, 11, 1);
            this.LegRight.setPos(-1.3F, 0.7F, -1.1F);
            this.LegRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.18692476355438295F, 0.0F, 0.0F);
            this.Crest1 = new ModelRenderer(this, 18, 0);
            this.Crest1.setPos(0.0F, -2.9F, 1.0F);
            this.Crest1.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1, 2.321985919674168F, 0.0F, 0.0F);
            this.WingFeather2Right = new ModelRenderer(this, 52, 12);
            this.WingFeather2Right.setPos(0.0F, 0.0F, -0.0F);
            this.WingFeather2Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather2Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.TailLeft = new ModelRenderer(this, 40, 27);
            this.TailLeft.setPos(1.1F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, -0.13665927909957545F);
            this.Toe2Left = new ModelRenderer(this, 13, 9);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
            this.WingFeather3Left = new ModelRenderer(this, 39, 12);
            this.WingFeather3Left.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather3Left.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather3Left, 0.0F, 0.0F, 0.2275909337942703F);
            this.WingFeather6Left = new ModelRenderer(this, 39, 12);
            this.WingFeather6Left.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather6Left.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather6Left, 0.0F, 0.0F, 0.2275909337942703F);
            this.Crest32 = new ModelRenderer(this, 28, 0);
            this.Crest32.setPos(0.0F, 0.0F, 0.0F);
            this.Crest32.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 19.1F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.3658947098950176F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 13, 17);
            this.LowerBill.setPos(0.0F, -2.9F, 0.3F);
            this.LowerBill.addBox(-0.5F, -2.2F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, 0.009424778335276407F, 0.0F, 0.0F);
            this.Crest4 = new ModelRenderer(this, 22, 5);
            this.Crest4.setPos(0.0F, 0.4F, -0.2F);
            this.Crest4.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest4, -0.45535640450848164F, 0.0F, 0.0F);
            this.Crest5 = new ModelRenderer(this, 29, 6);
            this.Crest5.setPos(0.0F, 0.4F, -1.1F);
            this.Crest5.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest5, -0.6829473549475088F, 0.0F, 0.0F);
            this.WingFeather5Right = new ModelRenderer(this, 52, 12);
            this.WingFeather5Right.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather5Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather5Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.WingFeather1Right = new ModelRenderer(this, 52, 12);
            this.WingFeather1Right.setPos(-3.0F, -4.0F, -0.01F);
            this.WingFeather1Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather1Right, 0.0F, 0.0F, -0.27314402127920984F);
            this.FootLeft = new ModelRenderer(this, 13, 5);
            this.FootLeft.setPos(0.0F, 0.2F, -1.7F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.4630358625383205F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 52, 27);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.18203784630933073F, 0.0F, 0.0F);
            this.Crest2 = new ModelRenderer(this, 23, 0);
            this.Crest2.setPos(0.0F, 0.0F, 0.0F);
            this.Crest2.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest2, -0.5323254218582705F, 0.0F, 0.0F);
            this.RightWingFeather7 = new ModelRenderer(this, 52, 15);
            this.RightWingFeather7.setPos(0.0F, 0.0F, 0.0F);
            this.RightWingFeather7.addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather7, 0.0F, 0.0F, -0.2275909337942703F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.6373942508178124F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 13, 9);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.Toe1Right = new ModelRenderer(this, 13, 9);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.0F, -0.591841146688116F);
            this.WingFeather3Right = new ModelRenderer(this, 52, 12);
            this.WingFeather3Right.setPos(0.0F, 0.0F, 0.0F);
            this.WingFeather3Right.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFeather3Right, 0.0F, 0.0F, -0.2275909337942703F);
            this.Toe2Right = new ModelRenderer(this, 13, 9);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.8196066007575706F, 0.0F, 0.0F);
            this.Body.addChild(this.Wing1Right);
            this.WingFeather4Left.addChild(this.WingFeather5Left);
            this.Body.addChild(this.Wing1Left);
            this.WingFeather7Left.addChild(this.WingFeather8Left);
            this.Neck2.addChild(this.Head);
            this.WingFeather3Right.addChild(this.WingFeather4Right);
            this.Head.addChild(this.UpperBill);
            this.Wing2Left.addChild(this.WingFeather1Left);
            this.Wing1Left.addChild(this.Wing2Left);
            this.WingFeather3Left.addChild(this.WingFeather4Left);
            this.Crest2.addChild(this.Crest3);
            this.Body.addChild(this.LegLeft);
            this.Wing1Right.addChild(this.Wing2Right);
            this.LegRight.addChild(this.FootRight);
            this.RightWingFeather7.addChild(this.WingFeather8Right);
            this.TailMiddle.addChild(this.TailRight);
            this.WingFeather5Right.addChild(this.WingFeather6Right);
            this.Crest4.addChild(this.Crest52);
            this.Crest1.addChild(this.Crest12);
            this.WingFeather1Left.addChild(this.WingFeather2Left);
            this.TailBase.addChild(this.TailMiddle);
            this.WingFeather6Left.addChild(this.WingFeather7Left);
            this.Body.addChild(this.LegRight);
            this.Head.addChild(this.Crest1);
            this.WingFeather1Right.addChild(this.WingFeather2Right);
            this.TailMiddle.addChild(this.TailLeft);
            this.FootLeft.addChild(this.Toe2Left);
            this.WingFeather2Left.addChild(this.WingFeather3Left);
            this.WingFeather5Left.addChild(this.WingFeather6Left);
            this.Crest3.addChild(this.Crest32);
            this.Head.addChild(this.LowerBill);
            this.Crest3.addChild(this.Crest4);
            this.Crest4.addChild(this.Crest5);
            this.WingFeather4Right.addChild(this.WingFeather5Right);
            this.Wing2Right.addChild(this.WingFeather1Right);
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.TailBase);
            this.Crest1.addChild(this.Crest2);
            this.WingFeather6Right.addChild(this.RightWingFeather7);
            this.Neck1.addChild(this.Neck2);
            this.FootLeft.addChild(this.Toe1Left);
            this.FootRight.addChild(this.Toe1Right);
            this.WingFeather2Right.addChild(this.WingFeather3Right);
            this.FootRight.addChild(this.Toe2Right);
            this.Body.addChild(this.Neck1);
            this.saveBase();
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
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.819F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.637F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.318F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.365F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 19.1F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.182F;
            this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.186F;
            this.LegRight.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.186F;

            this.Wing1Left.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.Wing1Left.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.500F;
            this.Wing2Left.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
            this.Wing2Left.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.Wing1Right.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.Wing1Right.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.500F;
            this.Wing2Right.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
            this.Wing2Right.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.819F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.637F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.318F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.365F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 19.1F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.182F;
            this.LegLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.186F;
            this.LegRight.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.186F;

            this.Wing1Left.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.Wing1Left.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.500F;
            this.Wing2Left.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
            this.Wing2Left.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.Wing1Right.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.Wing1Right.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.500F;
            this.Wing2Right.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
            this.Wing2Right.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }
    }

    public static class Child extends HoopoeModel {
        public ModelRenderer TailBase;
        public ModelRenderer LegRight;
        public ModelRenderer LegLeft;
        public ModelRenderer WingLeft;
        public ModelRenderer WingRight;
        public ModelRenderer Neck1;
        public ModelRenderer FootRight;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe1Right;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer LowerBill;
        public ModelRenderer Crest;

        public Child() {
            texWidth = 64;
            texHeight = 32;
            this.Crest = new ModelRenderer(this, 0, -4);
            this.Crest.setPos(0.0F, -0.7F, 2.5F);
            this.Crest.addBox(0.0F, -0.5F, -1.5F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest, 0.13665927909957545F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 20, 0);
            this.LegRight.setPos(-1.3F, 0.9F, -1.4F);
            this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.2275909337942703F, 0.0911061832922575F, -0.18203784630933073F);
            this.WingRight = new ModelRenderer(this, 38, 0);
            this.WingRight.setPos(-1.9F, -1.9F, 1.1F);
            this.WingRight.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F);
            this.FootLeft = new ModelRenderer(this, 13, 4);
            this.FootLeft.setPos(0.0F, 0.0F, -0.9F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 13, 8);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.UpperBill = new ModelRenderer(this, 13, 12);
            this.UpperBill.setPos(0.0F, -0.7F, 1.7F);
            this.UpperBill.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.15690509575954859F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 13, 0);
            this.LegLeft.setPos(1.3F, 0.9F, -1.4F);
            this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.2275909337942703F, -0.0911061832922575F, 0.18203784630933073F);
            this.TailBase = new ModelRenderer(this, 17, 28);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, -0.18203784630933073F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -1.8F);
            this.Neck1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.6373942508178124F, 0.0F, 0.0F);
            this.Toe2Right = new ModelRenderer(this, 20, 8);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.Toe1Right = new ModelRenderer(this, 20, 8);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.004537855888737689F, 0.0F, -0.591841146688116F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 0.0F, 2.0F);
            this.Head.addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.18203784630933073F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 13, 8);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.9F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.0471975511965976F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 20, 4);
            this.FootRight.setPos(0.0F, 0.0F, -0.9F);
            this.FootRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 13, 17);
            this.LowerBill.setPos(0.0F, -0.5F, 1.3F);
            this.LowerBill.addBox(-0.5F, -2.2F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, 0.009424778335276407F, 0.0F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 29, 0);
            this.WingLeft.setPos(1.9F, -1.9F, 1.1F);
            this.WingLeft.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F);
            this.Head.addChild(this.Crest);
            this.Body.addChild(this.LegRight);
            this.Body.addChild(this.WingRight);
            this.LegLeft.addChild(this.FootLeft);
            this.FootLeft.addChild(this.Toe1Left);
            this.Head.addChild(this.UpperBill);
            this.Body.addChild(this.LegLeft);
            this.Body.addChild(this.TailBase);
            this.Body.addChild(this.Neck1);
            this.FootRight.addChild(this.Toe2Right);
            this.FootRight.addChild(this.Toe1Right);
            this.Neck1.addChild(this.Head);
            this.FootLeft.addChild(this.Toe2Left);
            this.LegRight.addChild(this.FootRight);
            this.Head.addChild(this.LowerBill);
            this.Body.addChild(this.WingLeft);
            this.saveBase();
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
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.637F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.182F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}

