package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TuracoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.KookaburraEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class KookaburraModel extends ZawaBaseModel<KookaburraEntity> {
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

    public static class Adult extends KookaburraModel {
        public ModelRenderer TailBase;
        public ModelRenderer WingLeft;
        public ModelRenderer WingRight;
        public ModelRenderer Neck1;
        public ModelRenderer LegLeft;
        public ModelRenderer RightLeg;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer UpperBill1;
        public ModelRenderer LowerBill;
        public ModelRenderer Eyebrow;
        public ModelRenderer UpperBill2;
        public ModelRenderer UpperBill4;
        public ModelRenderer UpperBill3;
        public ModelRenderer UpperBill5;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer RightFoot;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe1Right;

        public Adult() {
            texWidth = 64;
            texHeight = 32;
            this.TailRight = new ModelRenderer(this, 56, 16);
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.04555309164612875F);
            this.FootLeft = new ModelRenderer(this, 13, 5);
            this.FootLeft.setPos(0.0F, 0.2F, -1.7F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.5384340808981534F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 52, 27);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 13, 9);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.0F, -0.591841146688116F);
            this.Head = new ModelRenderer(this, 0, 4);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.2F, -1.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.583987151738336F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 13, 15);
            this.LowerBill.setPos(0.0F, -3.2F, -0.7F);
            this.LowerBill.addBox(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 1.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.14765485538451056F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 11, 1);
            this.RightLeg.setPos(-1.3F, 0.7F, -0.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.13037609146212992F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.7394959854278698F, 0.0F, 0.0F);
            this.Eyebrow = new ModelRenderer(this, 2, 1);
            this.Eyebrow.setPos(0.0F, -2.8F, 2.0F);
            this.Eyebrow.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Eyebrow, -3.141592653589793F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 13, 5);
            this.RightFoot.setPos(0.0F, 0.2F, -1.7F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.5384340808981534F, 0.0F, 0.0F);
            this.UpperBill1 = new ModelRenderer(this, 18, 1);
            this.UpperBill1.setPos(0.0F, -3.0F, -0.2F);
            this.UpperBill1.addBox(-1.0F, -1.7F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill1, 0.11623892551966127F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.858876508927443F, 0.0F, 0.0F);
            this.WingLeft = new ModelRenderer(this, 27, 20);
            this.WingLeft.setPos(1.9F, -1.4F, 1.1F);
            this.WingLeft.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, 0.09581857193974705F, -0.0911061832922575F, 0.0911061832922575F);
            this.Toe2Right = new ModelRenderer(this, 13, 9);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.Toe2Left = new ModelRenderer(this, 13, 9);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
            this.TailMiddle = new ModelRenderer(this, 55, 21);
            this.TailMiddle.setPos(0.0F, 1.0F, -0.01F);
            this.TailMiddle.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperBill2 = new ModelRenderer(this, 18, 5);
            this.UpperBill2.setPos(0.0F, -1.7F, 0.0F);
            this.UpperBill2.addBox(-0.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill2, -0.2275909337942703F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 11, 1);
            this.LegLeft.setPos(1.3F, 0.7F, -0.8F);
            this.LegLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.13037609146212992F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 56, 16);
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.04555309164612875F);
            this.Toe1Left = new ModelRenderer(this, 13, 9);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.8854055215472402F, 0.0F, 0.0F);
            this.WingRight = new ModelRenderer(this, 36, 20);
            this.WingRight.setPos(-1.9F, -1.4F, 1.1F);
            this.WingRight.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, 0.09581857193974705F, 0.0911061832922575F, -0.0911061832922575F);
            this.UpperBill4 = new ModelRenderer(this, 18, 11);
            this.UpperBill4.setPos(0.0F, 0.6F, 0.5F);
            this.UpperBill4.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill4, 0.0911061832922575F, 0.0F, 0.0F);
            this.UpperBill5 = new ModelRenderer(this, 18, 16);
            this.UpperBill5.setPos(0.0F, -3.0F, 1.0F);
            this.UpperBill5.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill5, 0.956091342937205F, 0.0F, 0.0F);
            this.UpperBill3 = new ModelRenderer(this, 18, 8);
            this.UpperBill3.setPos(0.0F, 0.0F, 0.0F);
            this.UpperBill3.addBox(-0.25F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.TailMiddle.addChild(this.TailRight);
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.TailBase);
            this.RightFoot.addChild(this.Toe1Right);
            this.Neck2.addChild(this.Head);
            this.Head.addChild(this.LowerBill);
            this.Body.addChild(this.RightLeg);
            this.Neck1.addChild(this.Neck2);
            this.Head.addChild(this.Eyebrow);
            this.RightLeg.addChild(this.RightFoot);
            this.Head.addChild(this.UpperBill1);
            this.Body.addChild(this.Neck1);
            this.Body.addChild(this.WingLeft);
            this.RightFoot.addChild(this.Toe2Right);
            this.FootLeft.addChild(this.Toe2Left);
            this.TailBase.addChild(this.TailMiddle);
            this.UpperBill1.addChild(this.UpperBill2);
            this.Body.addChild(this.LegLeft);
            this.TailMiddle.addChild(this.TailLeft);
            this.FootLeft.addChild(this.Toe1Left);
            this.Body.addChild(this.WingRight);
            this.UpperBill1.addChild(this.UpperBill4);
            this.UpperBill4.addChild(this.UpperBill5);
            this.UpperBill2.addChild(this.UpperBill3);
            this.saveBase();
        }

        @Override
        public void setupAnim(KookaburraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }

    public static class Flying extends KookaburraModel {
        public ModelRenderer TailBase;
        public ModelRenderer WingLeft;
        public ModelRenderer WingRight;
        public ModelRenderer Neck1;
        public ModelRenderer LegLeft;
        public ModelRenderer RightLeg;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer UpperBill1;
        public ModelRenderer LowerBill;
        public ModelRenderer Eyebrow;
        public ModelRenderer UpperBill2;
        public ModelRenderer UpperBill4;
        public ModelRenderer UpperBill3;
        public ModelRenderer UpperBill5;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer RightFoot;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe1Right;

        public Flying() {

            texWidth = 64;
            texHeight = 32;
            this.WingRight = new ModelRenderer(this, 36, 20);
            this.WingRight.setPos(-1.9F, -1.4F, 1.1F);
            this.WingRight.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingRight, 0.09581857193974705F, 0.0911061832922575F, -0.0911061832922575F);
            this.LowerBill = new ModelRenderer(this, 13, 15);
            this.LowerBill.setPos(0.0F, -3.2F, -0.7F);
            this.LowerBill.addBox(-0.5F, -1.9F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.14765485538451056F, 0.0F, 0.0F);
            this.UpperBill4 = new ModelRenderer(this, 18, 11);
            this.UpperBill4.setPos(0.0F, 0.6F, 0.5F);
            this.UpperBill4.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill4, 0.0911061832922575F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 11, 1);
            this.RightLeg.setPos(-1.3F, 0.7F, -0.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.13037609146212992F, 0.0F, 0.0F);
            this.UpperBill1 = new ModelRenderer(this, 18, 1);
            this.UpperBill1.setPos(0.0F, -3.0F, -0.2F);
            this.UpperBill1.addBox(-1.0F, -1.7F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill1, 0.11623892551966127F, 0.0F, 0.0F);
            this.UpperBill3 = new ModelRenderer(this, 18, 8);
            this.UpperBill3.setPos(0.0F, 0.0F, 0.0F);
            this.UpperBill3.addBox(-0.25F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 55, 21);
            this.TailMiddle.setPos(0.0F, 1.0F, -0.01F);
            this.TailMiddle.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 56, 16);
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.04555309164612875F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.8854055215472402F, 0.0F, 0.0F);
            this.UpperBill2 = new ModelRenderer(this, 18, 5);
            this.UpperBill2.setPos(0.0F, -1.7F, 0.0F);
            this.UpperBill2.addBox(-0.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill2, -0.2275909337942703F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 13, 9);
            this.Toe1Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, 0.0F, 0.591841146688116F);
            this.Eyebrow = new ModelRenderer(this, 2, 1);
            this.Eyebrow.setPos(0.0F, -2.8F, 2.0F);
            this.Eyebrow.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Eyebrow, -3.141592653589793F, 0.0F, 0.0F);
            this.Toe2Right = new ModelRenderer(this, 13, 9);
            this.Toe2Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, 0.0F, 0.0F, 0.591841146688116F);
            this.UpperBill5 = new ModelRenderer(this, 18, 16);
            this.UpperBill5.setPos(0.0F, -3.0F, 1.0F);
            this.UpperBill5.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill5, 0.956091342937205F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 56, 16);
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.04555309164612875F);
            this.Toe1Right = new ModelRenderer(this, 13, 9);
            this.Toe1Right.setPos(0.0F, 0.2F, -0.01F);
            this.Toe1Right.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.0F, -0.591841146688116F);
            this.WingLeft = new ModelRenderer(this, 27, 20);
            this.WingLeft.setPos(1.9F, -1.4F, 1.1F);
            this.WingLeft.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingLeft, 0.09581857193974705F, -0.0911061832922575F, 0.0911061832922575F);
            this.FootLeft = new ModelRenderer(this, 13, 5);
            this.FootLeft.setPos(0.0F, 0.2F, -1.7F);
            this.FootLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.5384340808981534F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.7394959854278698F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 4);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.2F, -1.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.583987151738336F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 11, 1);
            this.LegLeft.setPos(1.3F, 0.7F, -0.8F);
            this.LegLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.13037609146212992F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.858876508927443F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 13, 5);
            this.RightFoot.setPos(0.0F, 0.2F, -1.7F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.5384340808981534F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 52, 27);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 13, 9);
            this.Toe2Left.setPos(0.0F, 0.2F, -0.01F);
            this.Toe2Left.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, 0.0F, 0.0F, -0.591841146688116F);
            this.Body.addChild(this.WingRight);
            this.Head.addChild(this.LowerBill);
            this.UpperBill1.addChild(this.UpperBill4);
            this.Body.addChild(this.RightLeg);
            this.Head.addChild(this.UpperBill1);
            this.UpperBill2.addChild(this.UpperBill3);
            this.TailBase.addChild(this.TailMiddle);
            this.TailMiddle.addChild(this.TailLeft);
            this.UpperBill1.addChild(this.UpperBill2);
            this.FootLeft.addChild(this.Toe1Left);
            this.Head.addChild(this.Eyebrow);
            this.RightFoot.addChild(this.Toe2Right);
            this.UpperBill4.addChild(this.UpperBill5);
            this.TailMiddle.addChild(this.TailRight);
            this.RightFoot.addChild(this.Toe1Right);
            this.Body.addChild(this.WingLeft);
            this.LegLeft.addChild(this.FootLeft);
            this.Neck1.addChild(this.Neck2);
            this.Neck2.addChild(this.Head);
            this.Body.addChild(this.LegLeft);
            this.Body.addChild(this.Neck1);
            this.RightLeg.addChild(this.RightFoot);
            this.Body.addChild(this.TailBase);
            this.FootLeft.addChild(this.Toe2Left);
            this.saveBase();
        }

        @Override
        public void setupAnim(KookaburraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }

    public static class Child extends KookaburraModel {
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
        public void setupAnim(KookaburraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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


