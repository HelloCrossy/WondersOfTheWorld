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
            this.Crest = new ModelRenderer(this, 12, 12);
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
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.455F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.865F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.682F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.455F;

            this.TailBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.136F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 1F) * 0.5F + 0.865F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.682F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.455F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 1.022F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 20.3F;
            this.TailBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.136F;

            this.LeftLeg.y = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.7F;
            this.LeftLeg.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.136F;
            this.LeftFoot.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.538F;
            this.RightLeg.y = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.136F;
            this.RightLeg.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.130F;
            this.RightFoot.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.538F;
        }
    }
    public static class Flying extends ManakinModel {
        public ModelRenderer TailBase;
        public ModelRenderer RightLeg;
        public ModelRenderer LeftLeg;
        public ModelRenderer Neck1;
        public ModelRenderer LeftWing1;
        public ModelRenderer RightWing1;
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
        public ModelRenderer LeftWingFeather1;
        public ModelRenderer LeftWingFeather2;
        public ModelRenderer LeftWingFeather3;
        public ModelRenderer LeftWingFeather4;
        public ModelRenderer LeftWingFeather5;
        public ModelRenderer LeftWingFeather6;
        public ModelRenderer RightWingFeather1;
        public ModelRenderer RightWingFeather2;
        public ModelRenderer RightWingFeather3;
        public ModelRenderer RightWingFeather4;
        public ModelRenderer RightWingFeather5;
        public ModelRenderer RightWingFeather6;

        public Flying() {

            texWidth = 64;
            texHeight = 32;
            this.LeftFootRightToe = new ModelRenderer(this, 13, 8);
            this.LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.LeftWing1 = new ModelRenderer(this, 38, 9);
            this.LeftWing1.setPos(1.1F, 0.1F, 0.49F);
            this.LeftWing1.addBox(0.0F, -2.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.02F);
            this.setRotateAngle(LeftWing1, 0.0F, 0.0F, 0.05934119623228288F);
            this.LeftFoot = new ModelRenderer(this, 13, 4);
            this.LeftFoot.setPos(0.0F, 0.0F, -1.4F);
            this.LeftFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.4098033003787853F, 0.0F, 0.0F);
            this.LeftWingFeather5 = new ModelRenderer(this, 26, 12);
            this.LeftWingFeather5.setPos(0.0F, 0.0F, 0.0F);
            this.LeftWingFeather5.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.01F);
            this.setRotateAngle(LeftWingFeather5, 0.0F, 0.0F, 0.2275909337942703F);
            this.RightWingFeather1 = new ModelRenderer(this, 26, 12);
            this.RightWingFeather1.setPos(3.4F, -2.0F, 0.0F);
            this.RightWingFeather1.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.05F);
            this.setRotateAngle(RightWingFeather1, 0.0F, 0.0F, 0.27314402127920984F);
            this.TailMiddle = new ModelRenderer(this, 17, 22);
            this.TailMiddle.setPos(0.0F, 2.0F, 0.0F);
            this.TailMiddle.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 17, 27);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.01972222046431214F, 0.0F, 0.0F);
            this.UpperBill = new ModelRenderer(this, 0, 1);
            this.UpperBill.setPos(0.0F, -2.9F, 0.3F);
            this.UpperBill.addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill, 0.27314402127920984F, 0.0F, 0.0F);
            this.RightWingFeather3 = new ModelRenderer(this, 26, 12);
            this.RightWingFeather3.setPos(0.0F, 0.0F, 0.0F);
            this.RightWingFeather3.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.03F);
            this.setRotateAngle(RightWingFeather3, 0.0F, 0.0F, 0.2275909337942703F);
            this.RightWingFeather4 = new ModelRenderer(this, 26, 12);
            this.RightWingFeather4.setPos(0.0F, 0.0F, 0.0F);
            this.RightWingFeather4.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.02F);
            this.setRotateAngle(RightWingFeather4, 0.0F, 0.0F, 0.2275909337942703F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.0F, -1.2F, 3.0F, 3.0F, 3.0F, 0.02F, 0.0F, 0.04F);
            this.setRotateAngle(Head, 0.45535640450848164F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 18.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.4528120320758247F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 5, 1);
            this.LowerBill.setPos(0.0F, -3.0F, -0.2F);
            this.LowerBill.addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.0787143532596859F, 0.0F, 0.0F);
            this.RightWing1 = new ModelRenderer(this, 38, 9);
            this.RightWing1.setPos(-1.1F, 0.1F, 1.39F);
            this.RightWing1.addBox(0.0F, -2.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.02F);
            this.setRotateAngle(RightWing1, 0.0F, 3.141592653589793F, -0.05934119623228288F);
            this.Crest = new ModelRenderer(this, 12, 12);
            this.Crest.setPos(0.0F, -0.8F, 1.9F);
            this.Crest.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LeftWingFeather2 = new ModelRenderer(this, 26, 12);
            this.LeftWingFeather2.setPos(0.0F, 0.0F, 0.0F);
            this.LeftWingFeather2.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.04F);
            this.setRotateAngle(LeftWingFeather2, 0.0F, 0.0F, 0.2275909337942703F);
            this.RightWingFeather2 = new ModelRenderer(this, 26, 12);
            this.RightWingFeather2.setPos(0.0F, 0.0F, 0.0F);
            this.RightWingFeather2.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.04F);
            this.setRotateAngle(RightWingFeather2, 0.0F, 0.0F, 0.2275909337942703F);
            this.RightWingFeather5 = new ModelRenderer(this, 26, 12);
            this.RightWingFeather5.setPos(0.0F, 0.0F, 0.0F);
            this.RightWingFeather5.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.01F);
            this.setRotateAngle(RightWingFeather5, 0.0F, 0.0F, 0.2275909337942703F);
            this.LeftWingFeather1 = new ModelRenderer(this, 26, 12);
            this.LeftWingFeather1.setPos(3.4F, -2.0F, 0.0F);
            this.LeftWingFeather1.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.05F);
            this.setRotateAngle(LeftWingFeather1, 0.0F, 0.0F, 0.27314402127920984F);
            this.LeftFootLeftToe = new ModelRenderer(this, 13, 8);
            this.LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.RightWingFeather6 = new ModelRenderer(this, 26, 12);
            this.RightWingFeather6.setPos(0.0F, 0.0F, 0.0F);
            this.RightWingFeather6.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather6, 0.0F, 0.0F, 0.2275909337942703F);
            this.RightLeg = new ModelRenderer(this, 20, 0);
            this.RightLeg.setPos(-1.3F, 0.9F, -1.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 1.1922343694267492F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.9824458519265746F, 0.0F, 0.0F);
            this.RightFootLeftToe = new ModelRenderer(this, 20, 8);
            this.RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.TailRight = new ModelRenderer(this, 22, 17);
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.13665927909957545F);
            this.RightFoot = new ModelRenderer(this, 20, 4);
            this.RightFoot.setPos(0.0F, 0.0F, -1.4F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.4098033003787853F, 0.0F, 0.0F);
            this.RightFootRightToe = new ModelRenderer(this, 20, 8);
            this.RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootRightToe, 0.004537855888737689F, 0.0F, -0.591841146688116F);
            this.TailLeft = new ModelRenderer(this, 17, 17);
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.2F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.13665927909957545F);
            this.LeftWingFeather6 = new ModelRenderer(this, 26, 12);
            this.LeftWingFeather6.setPos(0.0F, 0.0F, 0.0F);
            this.LeftWingFeather6.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather6, 0.0F, 0.0F, 0.2275909337942703F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.9566149869865419F, 0.0F, 0.0F);
            this.LeftWingFeather3 = new ModelRenderer(this, 26, 12);
            this.LeftWingFeather3.setPos(0.0F, 0.0F, 0.0F);
            this.LeftWingFeather3.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.03F);
            this.setRotateAngle(LeftWingFeather3, 0.0F, 0.0F, 0.2275909337942703F);
            this.LeftWingFeather4 = new ModelRenderer(this, 26, 12);
            this.LeftWingFeather4.setPos(0.0F, 0.0F, 0.0F);
            this.LeftWingFeather4.addBox(0.0F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.02F);
            this.setRotateAngle(LeftWingFeather4, 0.0F, 0.0F, 0.2275909337942703F);
            this.LeftLeg = new ModelRenderer(this, 13, 0);
            this.LeftLeg.setPos(1.3F, 0.9F, -1.8F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, 1.1922343694267492F, 0.0F, 0.0F);
            this.LeftFoot.addChild(this.LeftFootRightToe);
            this.Body.addChild(this.LeftWing1);
            this.LeftLeg.addChild(this.LeftFoot);
            this.LeftWingFeather4.addChild(this.LeftWingFeather5);
            this.RightWing1.addChild(this.RightWingFeather1);
            this.TailBase.addChild(this.TailMiddle);
            this.Body.addChild(this.TailBase);
            this.Head.addChild(this.UpperBill);
            this.RightWingFeather2.addChild(this.RightWingFeather3);
            this.RightWingFeather3.addChild(this.RightWingFeather4);
            this.Neck2.addChild(this.Head);
            this.Head.addChild(this.LowerBill);
            this.Body.addChild(this.RightWing1);
            this.Head.addChild(this.Crest);
            this.LeftWingFeather1.addChild(this.LeftWingFeather2);
            this.RightWingFeather1.addChild(this.RightWingFeather2);
            this.RightWingFeather4.addChild(this.RightWingFeather5);
            this.LeftWing1.addChild(this.LeftWingFeather1);
            this.LeftFoot.addChild(this.LeftFootLeftToe);
            this.RightWingFeather5.addChild(this.RightWingFeather6);
            this.Body.addChild(this.RightLeg);
            this.Body.addChild(this.Neck1);
            this.RightFoot.addChild(this.RightFootLeftToe);
            this.TailMiddle.addChild(this.TailRight);
            this.RightLeg.addChild(this.RightFoot);
            this.RightFoot.addChild(this.RightFootRightToe);
            this.TailMiddle.addChild(this.TailLeft);
            this.LeftWingFeather5.addChild(this.LeftWingFeather6);
            this.Neck1.addChild(this.Neck2);
            this.LeftWingFeather2.addChild(this.LeftWingFeather3);
            this.LeftWingFeather3.addChild(this.LeftWingFeather4);
            this.Body.addChild(this.LeftLeg);
            this.saveBase();
        }

        @Override
        public void setupAnim(ManakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.455F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.982F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.956F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.455F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.452F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 18.5F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.182F;
            this.LeftLeg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 1.192F;
            this.RightLeg.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 1.192F;

            this.LeftWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.059F;
            this.LeftWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.0F;
            this.RightWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.059F;
            this.RightWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 3.141F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.982F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.956F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.455F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.452F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 18.5F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.182F;
            this.LeftLeg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 1.192F;
            this.RightLeg.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 1.192F;

            this.LeftWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.059F;
            this.LeftWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.0F;
            this.RightWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.059F;
            this.RightWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 3.141F;
        }
    }

    public static class Child extends ManakinModel {
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
        public void setupAnim(ManakinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.637F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float degree = 1.0F;
            float speed = 1.0F;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.728F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.637F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}

