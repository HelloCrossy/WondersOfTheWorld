package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.ManakinEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ManakinModel extends ZawaBaseModel<ManakinEntity> {
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

    public static class Adult extends ManakinModel {
        public ModelRenderer TailBase;
        public ModelRenderer RightLeg;
        public ModelRenderer LeftLeg;
        public ModelRenderer Neck1;
        public ModelRenderer LeftWing;
        public ModelRenderer RightWing;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer RightFoot;
        public ModelRenderer RightFootLeftToe;
        public ModelRenderer RightFootRightToe;
        public ModelRenderer LeftFoot;
        public ModelRenderer LeftFootLeftToe;
        public ModelRenderer LeftFootRightToe;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer LowerBill;
        public ModelRenderer Crest;

        public Adult() {
            texWidth = 64;
            texHeight = 32;
            this.LeftFootRightToe = new ModelRenderer(this, 13, 8);
            this.LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.RightFootRightToe = new ModelRenderer(this, 20, 8);
            this.RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootRightToe, 0.004537855888737689F, 0.0F, -0.591841146688116F);
            this.Crest = new ModelRenderer(this, 11, 12);
            this.Crest.setPos(0.0F, -0.8F, 1.9F);
            this.Crest.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.8651597048872669F, 0.0F, 0.0F);
            this.LeftFootLeftToe = new ModelRenderer(this, 13, 8);
            this.LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.LeftLeg = new ModelRenderer(this, 13, 0);
            this.LeftLeg.setPos(1.3F, 0.9F, -1.8F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, 0.13665927909957545F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 17, 27);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, -0.13665927909957545F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.0F, -1.2F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.45535640450848164F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 17, 22);
            this.TailMiddle.setPos(0.0F, 2.0F, 0.0F);
            this.TailMiddle.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperBill = new ModelRenderer(this, 0, 1);
            this.UpperBill.setPos(0.0F, -2.9F, 0.3F);
            this.UpperBill.addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.27314402127920984F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 20, 4);
            this.RightFoot.setPos(0.0F, 0.0F, -1.4F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.4098033003787853F, 0.0F, 0.0F);
            this.RightWing = new ModelRenderer(this, 38, 0);
            this.RightWing.setPos(-1.9F, -2.0F, 1.1F);
            this.RightWing.addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing, 0.0F, 0.0911061832922575F, -0.13665927909957545F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.6829473549475088F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 5, 1);
            this.LowerBill.setPos(0.0F, -3.0F, -0.2F);
            this.LowerBill.addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.0787143532596859F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 22, 17);
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.13665927909957545F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 19.7F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.0227629150370663F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 20, 0);
            this.RightLeg.setPos(-1.3F, 0.9F, -1.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.13665927909957545F, 0.0F, 0.0F);
            this.RightFootLeftToe = new ModelRenderer(this, 20, 8);
            this.RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.LeftFoot = new ModelRenderer(this, 13, 4);
            this.LeftFoot.setPos(0.0F, 0.0F, -1.4F);
            this.LeftFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.4098033003787853F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 17, 17);
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.13665927909957545F);
            this.LeftWing = new ModelRenderer(this, 29, 0);
            this.LeftWing.setPos(1.9F, -2.0F, 1.1F);
            this.LeftWing.addBox(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWing, 0.0F, -0.0911061832922575F, 0.13665927909957545F);
            this.LeftFoot.addChild(this.LeftFootRightToe);
            this.RightFoot.addChild(this.RightFootRightToe);
            this.Head.addChild(this.Crest);
            this.Body.addChild(this.Neck1);
            this.LeftFoot.addChild(this.LeftFootLeftToe);
            this.Body.addChild(this.LeftLeg);
            this.Body.addChild(this.TailBase);
            this.Neck2.addChild(this.Head);
            this.TailBase.addChild(this.TailMiddle);
            this.Head.addChild(this.UpperBill);
            this.RightLeg.addChild(this.RightFoot);
            this.Body.addChild(this.RightWing);
            this.Neck1.addChild(this.Neck2);
            this.Head.addChild(this.LowerBill);
            this.TailMiddle.addChild(this.TailRight);
            this.Body.addChild(this.RightLeg);
            this.RightFoot.addChild(this.RightFootLeftToe);
            this.LeftLeg.addChild(this.LeftFoot);
            this.TailMiddle.addChild(this.TailLeft);
            this.Body.addChild(this.LeftWing);
            this.saveBase();
        }

        @Override
        public void setupAnim(ManakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }
    }

    public static class Flying extends ManakinModel {
        public ModelRenderer TailBase;
        public ModelRenderer RightLeg;
        public ModelRenderer LeftLeg;
        public ModelRenderer Neck1;
        public ModelRenderer LeftWing;
        public ModelRenderer RightWing;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer RightFoot;
        public ModelRenderer RightFootLeftToe;
        public ModelRenderer RightFootRightToe;
        public ModelRenderer LeftFoot;
        public ModelRenderer LeftFootLeftToe;
        public ModelRenderer LeftFootRightToe;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer LowerBill;
        public ModelRenderer Crest;

        public Flying() {

            texWidth = 64;
            texHeight = 32;
            this.LeftFootRightToe = new ModelRenderer(this, 13, 8);
            this.LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.RightFootRightToe = new ModelRenderer(this, 20, 8);
            this.RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootRightToe, 0.004537855888737689F, 0.0F, -0.591841146688116F);
            this.Crest = new ModelRenderer(this, 11, 12);
            this.Crest.setPos(0.0F, -0.8F, 1.9F);
            this.Crest.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.8651597048872669F, 0.0F, 0.0F);
            this.LeftFootLeftToe = new ModelRenderer(this, 13, 8);
            this.LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.LeftLeg = new ModelRenderer(this, 13, 0);
            this.LeftLeg.setPos(1.3F, 0.9F, -1.8F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, 0.13665927909957545F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 17, 27);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, -0.13665927909957545F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.0F, -1.2F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.45535640450848164F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 17, 22);
            this.TailMiddle.setPos(0.0F, 2.0F, 0.0F);
            this.TailMiddle.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperBill = new ModelRenderer(this, 0, 1);
            this.UpperBill.setPos(0.0F, -2.9F, 0.3F);
            this.UpperBill.addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.27314402127920984F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 20, 4);
            this.RightFoot.setPos(0.0F, 0.0F, -1.4F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.4098033003787853F, 0.0F, 0.0F);
            this.RightWing = new ModelRenderer(this, 38, 0);
            this.RightWing.setPos(-1.9F, -2.0F, 1.1F);
            this.RightWing.addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing, 0.0F, 0.0911061832922575F, -0.13665927909957545F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.6829473549475088F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 5, 1);
            this.LowerBill.setPos(0.0F, -3.0F, -0.2F);
            this.LowerBill.addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.0787143532596859F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 22, 17);
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.13665927909957545F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 19.7F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.0227629150370663F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 20, 0);
            this.RightLeg.setPos(-1.3F, 0.9F, -1.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.13665927909957545F, 0.0F, 0.0F);
            this.RightFootLeftToe = new ModelRenderer(this, 20, 8);
            this.RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.LeftFoot = new ModelRenderer(this, 13, 4);
            this.LeftFoot.setPos(0.0F, 0.0F, -1.4F);
            this.LeftFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.4098033003787853F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 17, 17);
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.13665927909957545F);
            this.LeftWing = new ModelRenderer(this, 29, 0);
            this.LeftWing.setPos(1.9F, -2.0F, 1.1F);
            this.LeftWing.addBox(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWing, 0.0F, -0.0911061832922575F, 0.13665927909957545F);
            this.LeftFoot.addChild(this.LeftFootRightToe);
            this.RightFoot.addChild(this.RightFootRightToe);
            this.Head.addChild(this.Crest);
            this.Body.addChild(this.Neck1);
            this.LeftFoot.addChild(this.LeftFootLeftToe);
            this.Body.addChild(this.LeftLeg);
            this.Body.addChild(this.TailBase);
            this.Neck2.addChild(this.Head);
            this.TailBase.addChild(this.TailMiddle);
            this.Head.addChild(this.UpperBill);
            this.RightLeg.addChild(this.RightFoot);
            this.Body.addChild(this.RightWing);
            this.Neck1.addChild(this.Neck2);
            this.Head.addChild(this.LowerBill);
            this.TailMiddle.addChild(this.TailRight);
            this.Body.addChild(this.RightLeg);
            this.RightFoot.addChild(this.RightFootLeftToe);
            this.LeftLeg.addChild(this.LeftFoot);
            this.TailMiddle.addChild(this.TailLeft);
            this.Body.addChild(this.LeftWing);
            this.saveBase();
        }

        @Override
        public void setupAnim(ManakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
        }
    }

    public static class Child extends ManakinModel {
        public ModelRenderer TailBase;
        public ModelRenderer RightLeg;
        public ModelRenderer LeftLeg;
        public ModelRenderer Neck1;
        public ModelRenderer LeftWing;
        public ModelRenderer RightWing;
        public ModelRenderer TailMiddle;
        public ModelRenderer TailLeft;
        public ModelRenderer TailRight;
        public ModelRenderer RightFoot;
        public ModelRenderer RightFootLeftToe;
        public ModelRenderer RightFootRightToe;
        public ModelRenderer LeftFoot;
        public ModelRenderer LeftFootLeftToe;
        public ModelRenderer LeftFootRightToe;
        public ModelRenderer Neck2;
        public ModelRenderer Head;
        public ModelRenderer UpperBill;
        public ModelRenderer LowerBill;
        public ModelRenderer Crest;

        public Child() {
            texWidth = 64;
            texHeight = 32;
            this.LeftFootRightToe = new ModelRenderer(this, 13, 8);
            this.LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.RightFootRightToe = new ModelRenderer(this, 20, 8);
            this.RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootRightToe, 0.004537855888737689F, 0.0F, -0.591841146688116F);
            this.Crest = new ModelRenderer(this, 11, 12);
            this.Crest.setPos(0.0F, -0.8F, 1.9F);
            this.Crest.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.8651597048872669F, 0.0F, 0.0F);
            this.LeftFootLeftToe = new ModelRenderer(this, 13, 8);
            this.LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.LeftLeg = new ModelRenderer(this, 13, 0);
            this.LeftLeg.setPos(1.3F, 0.9F, -1.8F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, 0.13665927909957545F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 17, 27);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, -0.13665927909957545F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.0F, -1.2F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.45535640450848164F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 17, 22);
            this.TailMiddle.setPos(0.0F, 2.0F, 0.0F);
            this.TailMiddle.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperBill = new ModelRenderer(this, 0, 1);
            this.UpperBill.setPos(0.0F, -2.9F, 0.3F);
            this.UpperBill.addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.27314402127920984F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 20, 4);
            this.RightFoot.setPos(0.0F, 0.0F, -1.4F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.4098033003787853F, 0.0F, 0.0F);
            this.RightWing = new ModelRenderer(this, 38, 0);
            this.RightWing.setPos(-1.9F, -2.0F, 1.1F);
            this.RightWing.addBox(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing, 0.0F, 0.0911061832922575F, -0.13665927909957545F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.6829473549475088F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 5, 1);
            this.LowerBill.setPos(0.0F, -3.0F, -0.2F);
            this.LowerBill.addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.0787143532596859F, 0.0F, 0.0F);
            this.TailRight = new ModelRenderer(this, 22, 17);
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.13665927909957545F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 19.7F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.0227629150370663F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 20, 0);
            this.RightLeg.setPos(-1.3F, 0.9F, -1.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.13665927909957545F, 0.0F, 0.0F);
            this.RightFootLeftToe = new ModelRenderer(this, 20, 8);
            this.RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.LeftFoot = new ModelRenderer(this, 13, 4);
            this.LeftFoot.setPos(0.0F, 0.0F, -1.4F);
            this.LeftFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.4098033003787853F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 17, 17);
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.13665927909957545F);
            this.LeftWing = new ModelRenderer(this, 29, 0);
            this.LeftWing.setPos(1.9F, -2.0F, 1.1F);
            this.LeftWing.addBox(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWing, 0.0F, -0.0911061832922575F, 0.13665927909957545F);
            this.LeftFoot.addChild(this.LeftFootRightToe);
            this.RightFoot.addChild(this.RightFootRightToe);
            this.Head.addChild(this.Crest);
            this.Body.addChild(this.Neck1);
            this.LeftFoot.addChild(this.LeftFootLeftToe);
            this.Body.addChild(this.LeftLeg);
            this.Body.addChild(this.TailBase);
            this.Neck2.addChild(this.Head);
            this.TailBase.addChild(this.TailMiddle);
            this.Head.addChild(this.UpperBill);
            this.RightLeg.addChild(this.RightFoot);
            this.Body.addChild(this.RightWing);
            this.Neck1.addChild(this.Neck2);
            this.Head.addChild(this.LowerBill);
            this.TailMiddle.addChild(this.TailRight);
            this.Body.addChild(this.RightLeg);
            this.RightFoot.addChild(this.RightFootLeftToe);
            this.LeftLeg.addChild(this.LeftFoot);
            this.TailMiddle.addChild(this.TailLeft);
            this.Body.addChild(this.LeftWing);
            this.saveBase();
        }

        @Override
        public void setupAnim(ManakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float degree = 1.0F;
            float speed = 1.0F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}

