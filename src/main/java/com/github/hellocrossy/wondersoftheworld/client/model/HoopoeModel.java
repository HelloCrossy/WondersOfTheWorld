package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TuracoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.HoopoeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

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
            this.FootRight = new ModelRenderer(this, 13, 5);
            this.FootRight.setPos(0.0F, 0.2F, -1.7F);
            this.FootRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.4630358625383205F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 13, 9);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.0F, -0.591841146688116F);
            this.Crest5 = new ModelRenderer(this, 40, 0);
            this.Crest5.setPos(0.0F, 0.4F, -1.1F);
            this.Crest5.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest5, -0.6829473549475088F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 11, 1);
            this.LegRight.setPos(-1.3F, 0.7F, -1.1F);
            this.LegRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.18692476355438295F, 0.0F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 27, 20);
            this.WingLeft.setPos(1.9F, -1.7F, 1.1F);
            this.WingLeft.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, 0.18692476355438295F, -0.0911061832922575F, 0.13665927909957545F);
            this.Crest3 = new ModelRenderer(this, 28, 0);
            this.Crest3.setPos(0.0F, 0.5F, -0.5F);
            this.Crest3.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest3, -0.27314402127920984F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 13, 5);
            this.FootLeft.setPos(0.0F, 0.2F, -1.7F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.4630358625383205F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 13, 9);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.Toe2Left = new ModelRenderer(this, 13, 9);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
            this.Crest7 = new ModelRenderer(this, 28, 0);
            this.Crest7.setPos(0.0F, 0.5F, -0.5F);
            this.Crest7.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest7, -0.27314402127920984F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 56, 14);
            this.TailLeft.setPos(1.1F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, -0.13665927909957545F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.4098033003787853F, 0.0F, 0.0F);
            this.Crest1_1 = new ModelRenderer(this, 18, 0);
            this.Crest1_1.setPos(0.0F, -2.9F, 1.0F);
            this.Crest1_1.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1_1, 2.321985919674168F, 0.0F, 0.0F);
            this.Crest6 = new ModelRenderer(this, 40, 0);
            this.Crest6.setPos(0.0F, 0.4F, -1.1F);
            this.Crest6.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest6, -0.6829473549475088F, 0.0F, 0.0F);
            this.Crest2 = new ModelRenderer(this, 23, 0);
            this.Crest2.setPos(0.0F, 0.0F, 0.0F);
            this.Crest2.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest2, -0.5323254218582705F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.3F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.9217084019466553F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 13, 17);
            this.LowerBill.setPos(0.0F, -2.9F, 0.3F);
            this.LowerBill.addBox(-0.5F, -2.2F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, 0.009424778335276407F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 55, 20);
            this.TailMiddle.setPos(0.0F, 1.5F, -0.01F);
            this.TailMiddle.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperBill = new ModelRenderer(this, 13, 12);
            this.UpperBill.setPos(0.0F, -2.8F, 0.7F);
            this.UpperBill.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.15690509575954859F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 36, 20);
            this.WingRight.setPos(-1.9F, -1.7F, 1.1F);
            this.WingRight.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, 0.18692476355438295F, 0.0911061832922575F, -0.13665927909957545F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.45535640450848164F, 0.0F, 0.0F);
            this.Crest4 = new ModelRenderer(this, 33, 0);
            this.Crest4.setPos(0.0F, 0.4F, -0.2F);
            this.Crest4.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest4, -0.45535640450848164F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 52, 27);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.18203784630933073F, 0.0F, 0.0F);
            this.Toe2Right = new ModelRenderer(this, 13, 9);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.Crest1 = new ModelRenderer(this, 18, 0);
            this.Crest1.setPos(0.0F, -2.9F, 1.0F);
            this.Crest1.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1, 2.321985919674168F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.7285004590772052F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 56, 14);
            this.TailRight.setPos(-1.1F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, 0.13665927909957545F);
            this.LegLeft = new ModelRenderer(this, 11, 1);
            this.LegLeft.setPos(1.3F, 0.7F, -1.1F);
            this.LegLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.18692476355438295F, 0.0F, 0.0F);
            this.LegRight.addChild(this.FootRight);
            this.FootRight.addChild(this.Toe1Right);
            this.Crest4.addChild(this.Crest5);
            this.Body.addChild(this.LegRight);
            this.Body.addChild(this.WingLeft);
            this.Crest2.addChild(this.Crest3);
            this.LegLeft.addChild(this.FootLeft);
            this.FootLeft.addChild(this.Toe1Left);
            this.FootLeft.addChild(this.Toe2Left);
            this.Crest2.addChild(this.Crest7);
            this.TailMiddle.addChild(this.TailLeft);
            this.Neck2.addChild(this.Head);
            this.Head.addChild(this.Crest1_1);
            this.Crest4.addChild(this.Crest6);
            this.Crest1.addChild(this.Crest2);
            this.Head.addChild(this.LowerBill);
            this.TailBase.addChild(this.TailMiddle);
            this.Head.addChild(this.UpperBill);
            this.Body.addChild(this.WingRight);
            this.Neck1.addChild(this.Neck2);
            this.Crest3.addChild(this.Crest4);
            this.Body.addChild(this.TailBase);
            this.FootRight.addChild(this.Toe2Right);
            this.Head.addChild(this.Crest1);
            this.Body.addChild(this.Neck1);
            this.TailMiddle.addChild(this.TailRight);
            this.Body.addChild(this.LegLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(HoopoeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }

    public static class Flying extends HoopoeModel {
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

        public Flying() {

            texWidth = 64;
            texHeight = 32;
            this.FootRight = new ModelRenderer(this, 13, 5);
            this.FootRight.setPos(0.0F, 0.2F, -1.7F);
            this.FootRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.4630358625383205F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 13, 9);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.0F, -0.591841146688116F);
            this.Crest5 = new ModelRenderer(this, 40, 0);
            this.Crest5.setPos(0.0F, 0.4F, -1.1F);
            this.Crest5.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest5, -0.6829473549475088F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 11, 1);
            this.LegRight.setPos(-1.3F, 0.7F, -1.1F);
            this.LegRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.18692476355438295F, 0.0F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 27, 20);
            this.WingLeft.setPos(1.9F, -1.7F, 1.1F);
            this.WingLeft.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, 0.18692476355438295F, -0.0911061832922575F, 0.13665927909957545F);
            this.Crest3 = new ModelRenderer(this, 28, 0);
            this.Crest3.setPos(0.0F, 0.5F, -0.5F);
            this.Crest3.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest3, -0.27314402127920984F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 13, 5);
            this.FootLeft.setPos(0.0F, 0.2F, -1.7F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.4630358625383205F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 13, 9);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.Toe2Left = new ModelRenderer(this, 13, 9);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
            this.Crest7 = new ModelRenderer(this, 28, 0);
            this.Crest7.setPos(0.0F, 0.5F, -0.5F);
            this.Crest7.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest7, -0.27314402127920984F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 56, 14);
            this.TailLeft.setPos(1.1F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, -0.13665927909957545F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.4098033003787853F, 0.0F, 0.0F);
            this.Crest1_1 = new ModelRenderer(this, 18, 0);
            this.Crest1_1.setPos(0.0F, -2.9F, 1.0F);
            this.Crest1_1.addBox(-0.51F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1_1, 2.321985919674168F, 0.0F, 0.0F);
            this.Crest6 = new ModelRenderer(this, 40, 0);
            this.Crest6.setPos(0.0F, 0.4F, -1.1F);
            this.Crest6.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest6, -0.6829473549475088F, 0.0F, 0.0F);
            this.Crest2 = new ModelRenderer(this, 23, 0);
            this.Crest2.setPos(0.0F, 0.0F, 0.0F);
            this.Crest2.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest2, -0.5323254218582705F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.3F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.9217084019466553F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 13, 17);
            this.LowerBill.setPos(0.0F, -2.9F, 0.3F);
            this.LowerBill.addBox(-0.5F, -2.2F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, 0.009424778335276407F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 55, 20);
            this.TailMiddle.setPos(0.0F, 1.5F, -0.01F);
            this.TailMiddle.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperBill = new ModelRenderer(this, 13, 12);
            this.UpperBill.setPos(0.0F, -2.8F, 0.7F);
            this.UpperBill.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.15690509575954859F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 36, 20);
            this.WingRight.setPos(-1.9F, -1.7F, 1.1F);
            this.WingRight.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, 0.18692476355438295F, 0.0911061832922575F, -0.13665927909957545F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.45535640450848164F, 0.0F, 0.0F);
            this.Crest4 = new ModelRenderer(this, 33, 0);
            this.Crest4.setPos(0.0F, 0.4F, -0.2F);
            this.Crest4.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest4, -0.45535640450848164F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 52, 27);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.18203784630933073F, 0.0F, 0.0F);
            this.Toe2Right = new ModelRenderer(this, 13, 9);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.Crest1 = new ModelRenderer(this, 18, 0);
            this.Crest1.setPos(0.0F, -2.9F, 1.0F);
            this.Crest1.addBox(-0.49F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Crest1, 2.321985919674168F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.7285004590772052F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 56, 14);
            this.TailRight.setPos(-1.1F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, 0.13665927909957545F);
            this.LegLeft = new ModelRenderer(this, 11, 1);
            this.LegLeft.setPos(1.3F, 0.7F, -1.1F);
            this.LegLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.18692476355438295F, 0.0F, 0.0F);
            this.LegRight.addChild(this.FootRight);
            this.FootRight.addChild(this.Toe1Right);
            this.Crest4.addChild(this.Crest5);
            this.Body.addChild(this.LegRight);
            this.Body.addChild(this.WingLeft);
            this.Crest2.addChild(this.Crest3);
            this.LegLeft.addChild(this.FootLeft);
            this.FootLeft.addChild(this.Toe1Left);
            this.FootLeft.addChild(this.Toe2Left);
            this.Crest2.addChild(this.Crest7);
            this.TailMiddle.addChild(this.TailLeft);
            this.Neck2.addChild(this.Head);
            this.Head.addChild(this.Crest1_1);
            this.Crest4.addChild(this.Crest6);
            this.Crest1.addChild(this.Crest2);
            this.Head.addChild(this.LowerBill);
            this.TailBase.addChild(this.TailMiddle);
            this.Head.addChild(this.UpperBill);
            this.Body.addChild(this.WingRight);
            this.Neck1.addChild(this.Neck2);
            this.Crest3.addChild(this.Crest4);
            this.Body.addChild(this.TailBase);
            this.FootRight.addChild(this.Toe2Right);
            this.Head.addChild(this.Crest1);
            this.Body.addChild(this.Neck1);
            this.TailMiddle.addChild(this.TailRight);
            this.Body.addChild(this.LegLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(HoopoeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

        public Child() {
            texWidth = 64;
            texHeight = 32;

            this.TailBase = new ModelRenderer(this, 17, 28);
            this.TailBase.setPos(0.0F, 2.0F, -1.0F);
            this.TailBase.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.0911061832922575F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.9F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.411447814024714F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 5, 1);
            this.LowerBill.setPos(0.0F, -0.6F, 0.3F);
            this.LowerBill.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.489739378788545F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -1.5F);
            this.Neck1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.7285004590772052F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 13, 4);
            this.FootLeft.setPos(0.0F, 0.0F, -0.9F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.6829473549475088F, 0.0F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 29, 0);
            this.WingLeft.setPos(1.9F, -1.9F, 1.1F);
            this.WingLeft.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, -0.2275909337942703F, -0.0911061832922575F, 0.13665927909957545F);
            this.UpperBill = new ModelRenderer(this, 0, 1);
            this.UpperBill.setPos(0.0F, -0.5F, 2.0F);
            this.UpperBill.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.5855579507282921F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 13, 8);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.LegLeft = new ModelRenderer(this, 13, 0);
            this.LegLeft.setPos(1.3F, 0.9F, -1.4F);
            this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.500909508638178F, -0.04555309164612875F, 0.4098033003787853F);
            this.FootRight = new ModelRenderer(this, 20, 4);
            this.FootRight.setPos(0.0F, 0.0F, -0.9F);
            this.FootRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.6829473549475088F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 38, 0);
            this.WingRight.setPos(-1.9F, -1.9F, 1.1F);
            this.WingRight.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, -0.2275909337942703F, 0.0911061832922575F, -0.13665927909957545F);
            this.Toe2Right = new ModelRenderer(this, 20, 8);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.Toe2Left = new ModelRenderer(this, 13, 8);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 0.0F, 2.0F);
            this.Head.addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.6373942508178124F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 20, 8);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.004537855888737689F, 0.0F, -0.591841146688116F);
            this.LegRight = new ModelRenderer(this, 20, 0);
            this.LegRight.setPos(-1.3F, 0.9F, -1.4F);
            this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.500909508638178F, 0.04555309164612875F, -0.4098033003787853F);
            this.Body.addChild(this.TailBase);
            this.Head.addChild(this.LowerBill);
            this.Body.addChild(this.Neck1);
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.WingLeft);
            this.Head.addChild(this.UpperBill);
            this.FootLeft.addChild(this.Toe1Left);
            this.Body.addChild(this.LegLeft);
            this.LegRight.addChild(this.FootRight);
            this.Body.addChild(this.WingRight);
            this.FootRight.addChild(this.Toe2Right);
            this.FootLeft.addChild(this.Toe2Left);
            this.Neck1.addChild(this.Head);
            this.FootRight.addChild(this.Toe1Right);
            this.Body.addChild(this.LegRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(HoopoeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}

