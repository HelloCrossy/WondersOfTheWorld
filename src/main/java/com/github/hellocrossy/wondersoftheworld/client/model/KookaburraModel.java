package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.HoopoeEntity;
import com.github.hellocrossy.wondersoftheworld.entity.KookaburraEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
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
        public ModelRenderer LeftWing;
        public ModelRenderer RightWing;
        public ModelRenderer Neck1;
        public ModelRenderer LeftLeg;
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
        public ModelRenderer LeftFoot;
        public ModelRenderer LeftFootLeftToe;
        public ModelRenderer LeftFootRightToe;
        public ModelRenderer RightFoot;
        public ModelRenderer RightFootLeftToe;
        public ModelRenderer RightFootRightToe;

        public Adult() {
            texWidth = 64;
            texHeight = 32;
            this.Eyebrow = new ModelRenderer(this, 2, 1);
            this.Eyebrow.setPos(0.0F, -2.8F, 2.0F);
            this.Eyebrow.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Eyebrow, -3.141592653589793F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 13, 15);
            this.LowerBill.setPos(0.0F, -3.2F, -0.1F);
            this.LowerBill.addBox(-0.5F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.0911061832922575F, 0.0F, 0.0F);
            this.RightFootLeftToe = new ModelRenderer(this, 13, 9);
            this.RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.RightLeg = new ModelRenderer(this, 11, 1);
            this.RightLeg.setPos(-1.3F, 0.7F, -0.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.13037609146212992F, 0.0F, 0.0F);
            this.RightWing = new ModelRenderer(this, 40, 22);
            this.RightWing.setPos(-1.9F, -1.4F, 1.1F);
            this.RightWing.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing, 0.09581857193974705F, 0.0911061832922575F, -0.0911061832922575F);
            this.UpperBill2 = new ModelRenderer(this, 18, 5);
            this.UpperBill2.setPos(0.0F, -1.7F, 0.0F);
            this.UpperBill2.addBox(-0.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill2, -0.2275909337942703F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 13, 5);
            this.LeftFoot.setPos(0.0F, 0.2F, -1.7F);
            this.LeftFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.5384340808981534F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 52, 28);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.UpperBill5 = new ModelRenderer(this, 18, 16);
            this.UpperBill5.setPos(0.0F, -3.0F, 1.0F);
            this.UpperBill5.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill5, 0.956091342937205F, 0.0F, 0.0F);
            this.RightFootRightToe = new ModelRenderer(this, 13, 9);
            this.RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.8854055215472402F, 0.0F, 0.0F);
            this.LeftFootRightToe = new ModelRenderer(this, 13, 9);
            this.LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.LeftWing = new ModelRenderer(this, 31, 22);
            this.LeftWing.setPos(1.9F, -1.4F, 1.1F);
            this.LeftWing.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWing, 0.09581857193974705F, -0.0911061832922575F, 0.0911061832922575F);
            this.UpperBill4 = new ModelRenderer(this, 18, 11);
            this.UpperBill4.setPos(0.0F, 0.6F, 0.5F);
            this.UpperBill4.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill4, 0.0911061832922575F, 0.0F, 0.0F);
            this.TailLeft = new ModelRenderer(this, 49, 22);
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.04555309164612875F);
            this.RightFoot = new ModelRenderer(this, 13, 5);
            this.RightFoot.setPos(0.0F, 0.2F, -1.7F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.5384340808981534F, 0.0F, 0.0F);
            this.UpperBill3 = new ModelRenderer(this, 18, 8);
            this.UpperBill3.setPos(0.0F, 0.0F, 0.0F);
            this.UpperBill3.addBox(-0.25F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.7394959854278698F, 0.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this, 11, 1);
            this.LeftLeg.setPos(1.3F, 0.7F, -0.8F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, 0.13037609146212992F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 4);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.2F, -1.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.583987151738336F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.858876508927443F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 55, 21);
            this.TailMiddle.setPos(0.0F, 1.0F, -0.01F);
            this.TailMiddle.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.UpperBill1 = new ModelRenderer(this, 18, 1);
            this.UpperBill1.setPos(0.0F, -3.0F, -0.2F);
            this.UpperBill1.addBox(-1.0F, -1.7F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill1, 0.11623892551966127F, 0.0F, 0.0F);
            this.LeftFootLeftToe = new ModelRenderer(this, 13, 9);
            this.LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.TailRight = new ModelRenderer(this, 49, 22);
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.04555309164612875F);
            this.Head.addChild(this.Eyebrow);
            this.Head.addChild(this.LowerBill);
            this.RightFoot.addChild(this.RightFootLeftToe);
            this.Body.addChild(this.RightLeg);
            this.Body.addChild(this.RightWing);
            this.UpperBill1.addChild(this.UpperBill2);
            this.LeftLeg.addChild(this.LeftFoot);
            this.Body.addChild(this.TailBase);
            this.UpperBill4.addChild(this.UpperBill5);
            this.RightFoot.addChild(this.RightFootRightToe);
            this.LeftFoot.addChild(this.LeftFootRightToe);
            this.Body.addChild(this.LeftWing);
            this.UpperBill1.addChild(this.UpperBill4);
            this.TailMiddle.addChild(this.TailLeft);
            this.RightLeg.addChild(this.RightFoot);
            this.UpperBill2.addChild(this.UpperBill3);
            this.Neck1.addChild(this.Neck2);
            this.Body.addChild(this.LeftLeg);
            this.Neck2.addChild(this.Head);
            this.Body.addChild(this.Neck1);
            this.TailBase.addChild(this.TailMiddle);
            this.Head.addChild(this.UpperBill1);
            this.LeftFoot.addChild(this.LeftFootLeftToe);
            this.TailMiddle.addChild(this.TailRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(KookaburraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.584F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.859F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.15F) * 0.5F - 0.739F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.584F;

            this.TailBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.15F) * 0.5F + 0.182F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 1F) * 0.5F + 0.859F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.739F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.584F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.885F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F + 20.3F;
            this.TailBase.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.182F;

            this.LeftLeg.y = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.7F;
            this.LeftLeg.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.130F;
            this.LeftFoot.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.538F;
            this.RightLeg.y = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 4F) * 0.5F + 0.7F;
            this.RightLeg.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.130F;
            this.RightFoot.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.538F;
        }
    }

    public static class Flying extends KookaburraModel {
        public ModelRenderer TailBase;
        public ModelRenderer Neck1;
        public ModelRenderer LeftLeg;
        public ModelRenderer RightLeg;
        public ModelRenderer LeftWing1;
        public ModelRenderer RightWing1;
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
        public ModelRenderer LeftFoot;
        public ModelRenderer LeftFootLeftToe;
        public ModelRenderer LeftFootRightToe;
        public ModelRenderer RightFoot;
        public ModelRenderer RightFootLeftToe;
        public ModelRenderer RightFootRightToe;
        public ModelRenderer LeftWing2;
        public ModelRenderer LeftWingFeather1;
        public ModelRenderer LeftWingFeather2;
        public ModelRenderer LeftWingFeather3;
        public ModelRenderer LeftWingFeather4;
        public ModelRenderer LeftWingFeather5;
        public ModelRenderer LeftWingFeather6;
        public ModelRenderer LeftWingFeather7;
        public ModelRenderer LeftWingFeather8;
        public ModelRenderer RightWing2;
        public ModelRenderer RightWingFeather1;
        public ModelRenderer RightWingFeather2;
        public ModelRenderer RightWingFeather3;
        public ModelRenderer RightWingFeather4;
        public ModelRenderer RightWingFeather5;
        public ModelRenderer RightWingFeather6;
        public ModelRenderer RightWingFeather7;
        public ModelRenderer RightWingFeather8;

        public Flying() {

            texWidth = 64;
            texHeight = 32;
            this.Eyebrow = new ModelRenderer(this, 2, 1);
            this.Eyebrow.setPos(0.0F, -2.8F, 2.0F);
            this.Eyebrow.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Eyebrow, -3.141592653589793F, 0.0F, 0.0F);
            this.RightFootRightToe = new ModelRenderer(this, 13, 9);
            this.RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.TailLeft = new ModelRenderer(this, 49, 22);
            this.TailLeft.setPos(1.4F, 0.0F, -0.1F);
            this.TailLeft.addBox(-1.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailLeft, 0.0F, 0.0F, 0.04555309164612875F);
            this.Head = new ModelRenderer(this, 0, 4);
            this.Head.setPos(0.0F, 2.0F, 3.0F);
            this.Head.addBox(-1.5F, -3.2F, -1.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3642502295386026F, 0.0F, 0.0F);
            this.RightWingFeather2 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather2.setPos(0.0F, 0.0F, -0.01F);
            this.RightWingFeather2.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather2, 0.0F, 0.0F, -0.2275909337942703F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.3658947098950176F, 0.0F, 0.0F);
            this.UpperBill2 = new ModelRenderer(this, 18, 5);
            this.UpperBill2.setPos(0.0F, -1.7F, 0.0F);
            this.UpperBill2.addBox(-0.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill2, -0.2275909337942703F, 0.0F, 0.0F);
            this.TailMiddle = new ModelRenderer(this, 55, 21);
            this.TailMiddle.setPos(0.0F, 1.0F, -0.01F);
            this.TailMiddle.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 11, 1);
            this.RightLeg.setPos(-1.3F, 0.7F, -0.8F);
            this.RightLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, 0.6373942508178124F, 0.0F, 0.0F);
            this.LeftFootRightToe = new ModelRenderer(this, 13, 9);
            this.LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -2.0F);
            this.Neck1.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.8651597048872669F, 0.0F, 0.0F);
            this.LeftWing1 = new ModelRenderer(this, 39, 0);
            this.LeftWing1.setPos(1.9F, -1.9F, 1.0F);
            this.LeftWing1.addBox(0.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWing1, 0.0F, -0.5462880425584197F, 0.18203784630933073F);
            this.LeftLeg = new ModelRenderer(this, 11, 1);
            this.LeftLeg.setPos(1.3F, 0.7F, -0.8F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, 0.6373942508178124F, 0.0F, 0.0F);
            this.UpperBill3 = new ModelRenderer(this, 18, 8);
            this.UpperBill3.setPos(0.0F, 0.0F, 0.0F);
            this.UpperBill3.addBox(-0.25F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LeftWingFeather5 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather5.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather5.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather5, 0.0F, 0.0F, 0.2275909337942703F);
            this.LeftFoot = new ModelRenderer(this, 13, 5);
            this.LeftFoot.setPos(0.0F, 0.2F, -1.7F);
            this.LeftFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.5384340808981534F, 0.0F, 0.0F);
            this.LeftWingFeather8 = new ModelRenderer(this, 41, 18);
            this.LeftWingFeather8.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather8.addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather8, 0.0F, 0.0F, 0.2275909337942703F);
            this.RightWing2 = new ModelRenderer(this, 56, 6);
            this.RightWing2.setPos(-2.0F, 4.0F, -0.01F);
            this.RightWing2.addBox(-3.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing2, 0.0F, 0.0F, 0.3642502295386026F);
            this.RightFoot = new ModelRenderer(this, 13, 5);
            this.RightFoot.setPos(0.0F, 0.2F, -1.7F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.5384340808981534F, 0.0F, 0.0F);
            this.RightWing1 = new ModelRenderer(this, 58, 0);
            this.RightWing1.setPos(-1.9F, -1.9F, 1.0F);
            this.RightWing1.addBox(-2.0F, 0.0F, -0.1F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing1, 0.0F, 0.5462880425584197F, -0.18203784630933073F);
            this.UpperBill5 = new ModelRenderer(this, 18, 16);
            this.UpperBill5.setPos(0.0F, -3.0F, 1.0F);
            this.UpperBill5.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill5, 0.956091342937205F, 0.0F, 0.0F);
            this.LeftWing2 = new ModelRenderer(this, 39, 6);
            this.LeftWing2.setPos(2.0F, 4.0F, -0.01F);
            this.LeftWing2.addBox(0.0F, -4.0F, -0.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWing2, 0.0F, 0.0F, -0.4098033003787853F);
            this.LeftWingFeather1 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather1.setPos(3.0F, -4.0F, -0.01F);
            this.LeftWingFeather1.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather1, 0.0F, 0.0F, 0.27314402127920984F);
            this.LeftWingFeather2 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather2.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather2.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather2, 0.0F, 0.0F, 0.2275909337942703F);
            this.LeftFootLeftToe = new ModelRenderer(this, 13, 9);
            this.LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.RightWingFeather1 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather1.setPos(-3.0F, -4.0F, -0.01F);
            this.RightWingFeather1.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather1, 0.0F, 0.0F, -0.27314402127920984F);
            this.RightWingFeather3 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather3.setPos(0.0F, 0.0F, -0.01F);
            this.RightWingFeather3.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather3, 0.0F, 0.0F, -0.2275909337942703F);
            this.LeftWingFeather6 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather6.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather6.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather6, 0.0F, 0.0F, 0.2275909337942703F);
            this.RightWingFeather5 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather5.setPos(0.0F, 0.0F, -0.01F);
            this.RightWingFeather5.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather5, 0.0F, 0.0F, -0.2275909337942703F);
            this.TailBase = new ModelRenderer(this, 52, 28);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.UpperBill4 = new ModelRenderer(this, 18, 11);
            this.UpperBill4.setPos(0.0F, 0.6F, 0.5F);
            this.UpperBill4.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill4, 0.0911061832922575F, 0.0F, 0.0F);
            this.RightWingFeather7 = new ModelRenderer(this, 52, 15);
            this.RightWingFeather7.setPos(0.0F, 0.0F, 0.01F);
            this.RightWingFeather7.addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather7, 0.0F, 0.0F, -0.2275909337942703F);
            this.RightWingFeather4 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather4.setPos(0.0F, 0.0F, -0.01F);
            this.RightWingFeather4.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather4, 0.0F, 0.0F, -0.2275909337942703F);
            this.TailRight = new ModelRenderer(this, 47, 27);
            this.TailRight.setPos(-1.4F, 0.0F, -0.1F);
            this.TailRight.addBox(0.0F, -0.4F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailRight, 0.0F, 0.0F, -0.04555309164612875F);
            this.UpperBill1 = new ModelRenderer(this, 18, 1);
            this.UpperBill1.setPos(0.0F, -3.0F, -0.2F);
            this.UpperBill1.addBox(-1.0F, -1.7F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill1, 0.11623892551966127F, 0.0F, 0.0F);
            this.LeftWingFeather7 = new ModelRenderer(this, 41, 15);
            this.LeftWingFeather7.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather7.addBox(0.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather7, 0.0F, 0.0F, 0.2275909337942703F);
            this.LowerBill = new ModelRenderer(this, 13, 15);
            this.LowerBill.setPos(0.0F, -3.2F, -0.1F);
            this.LowerBill.addBox(-0.5F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.0911061832922575F, 0.0F, 0.0F);
            this.RightWingFeather8 = new ModelRenderer(this, 52, 18);
            this.RightWingFeather8.setPos(0.0F, 0.0F, 0.01F);
            this.RightWingFeather8.addBox(-4.8F, 0.0F, -0.1F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather8, 0.0F, 0.0F, -0.2275909337942703F);
            this.LeftWingFeather4 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather4.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather4.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather4, 0.0F, 0.0F, 0.2275909337942703F);
            this.RightFootLeftToe = new ModelRenderer(this, 13, 9);
            this.RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.LeftWingFeather3 = new ModelRenderer(this, 39, 12);
            this.LeftWingFeather3.setPos(0.0F, 0.0F, -0.01F);
            this.LeftWingFeather3.addBox(0.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWingFeather3, 0.0F, 0.0F, 0.2275909337942703F);
            this.Neck2 = new ModelRenderer(this, 0, 12);
            this.Neck2.setPos(0.0F, 0.0F, 2.0F);
            this.Neck2.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck2, -0.7285004590772052F, 0.0F, 0.0F);
            this.RightWingFeather6 = new ModelRenderer(this, 52, 12);
            this.RightWingFeather6.setPos(0.0F, 0.0F, -0.01F);
            this.RightWingFeather6.addBox(-5.0F, 0.0F, -0.1F, 5.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWingFeather6, 0.0F, 0.0F, -0.2275909337942703F);
            this.Head.addChild(this.Eyebrow);
            this.RightFoot.addChild(this.RightFootRightToe);
            this.TailMiddle.addChild(this.TailLeft);
            this.Neck2.addChild(this.Head);
            this.RightWingFeather1.addChild(this.RightWingFeather2);
            this.UpperBill1.addChild(this.UpperBill2);
            this.TailBase.addChild(this.TailMiddle);
            this.Body.addChild(this.RightLeg);
            this.LeftFoot.addChild(this.LeftFootRightToe);
            this.Body.addChild(this.Neck1);
            this.Body.addChild(this.LeftWing1);
            this.Body.addChild(this.LeftLeg);
            this.UpperBill2.addChild(this.UpperBill3);
            this.LeftWingFeather4.addChild(this.LeftWingFeather5);
            this.LeftLeg.addChild(this.LeftFoot);
            this.LeftWingFeather7.addChild(this.LeftWingFeather8);
            this.RightWing1.addChild(this.RightWing2);
            this.RightLeg.addChild(this.RightFoot);
            this.Body.addChild(this.RightWing1);
            this.UpperBill4.addChild(this.UpperBill5);
            this.LeftWing1.addChild(this.LeftWing2);
            this.LeftWing2.addChild(this.LeftWingFeather1);
            this.LeftWingFeather1.addChild(this.LeftWingFeather2);
            this.LeftFoot.addChild(this.LeftFootLeftToe);
            this.RightWing2.addChild(this.RightWingFeather1);
            this.RightWingFeather2.addChild(this.RightWingFeather3);
            this.LeftWingFeather5.addChild(this.LeftWingFeather6);
            this.RightWingFeather4.addChild(this.RightWingFeather5);
            this.Body.addChild(this.TailBase);
            this.UpperBill1.addChild(this.UpperBill4);
            this.RightWingFeather6.addChild(this.RightWingFeather7);
            this.RightWingFeather3.addChild(this.RightWingFeather4);
            this.TailMiddle.addChild(this.TailRight);
            this.Head.addChild(this.UpperBill1);
            this.LeftWingFeather6.addChild(this.LeftWingFeather7);
            this.Head.addChild(this.LowerBill);
            this.RightWingFeather7.addChild(this.RightWingFeather8);
            this.LeftWingFeather3.addChild(this.LeftWingFeather4);
            this.RightFoot.addChild(this.RightFootLeftToe);
            this.LeftWingFeather2.addChild(this.LeftWingFeather3);
            this.Neck1.addChild(this.Neck2);
            this.RightWingFeather5.addChild(this.RightWingFeather6);
            this.saveBase();
        }

        @Override
        public void setupAnim(KookaburraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, entity.tickCount, 0.3F, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.364F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.865F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.729F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.364F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.366F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 19.1F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.182F;
            this.LeftLeg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;
            this.RightLeg.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;

            this.LeftWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.LeftWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.546F;
            this.LeftWing2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
            this.LeftWing2.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.RightWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.RightWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.564F;
            this.RightWing2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
            this.RightWing2.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.8F) * 0.5F + 0.865F;
            this.Neck2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F - 0.729F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.364F;
            this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.366F;
            this.Body.y = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 5F) * 0.5F + 19.1F;
            this.TailBase.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.7F) * 0.5F + 0.182F;
            this.LeftLeg.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;
            this.RightLeg.xRot = MathHelper.cos(6F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.637F;

            this.LeftWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.182F;
            this.LeftWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -7F) * 0.5F - 0.546F;
            this.LeftWing2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F - 0.409F;
            this.LeftWing2.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.RightWing1.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.182F;
            this.RightWing1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 7F) * 0.5F + 0.564F;
            this.RightWing2.zRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.409F;
            this.RightWing2.yRot = MathHelper.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }
    }

    public static class Child extends KookaburraModel {
        public ModelRenderer TailBase;
        public ModelRenderer RightLeg;
        public ModelRenderer LeftLeg;
        public ModelRenderer LeftWing;
        public ModelRenderer RightWing;
        public ModelRenderer Neck1;
        public ModelRenderer RightFoot;
        public ModelRenderer RightFootLeftToe;
        public ModelRenderer RightFootRightToe;
        public ModelRenderer LeftFoot;
        public ModelRenderer LeftFootLeftToe;
        public ModelRenderer LeftFootRightToe;
        public ModelRenderer Head;
        public ModelRenderer UpperBill1;
        public ModelRenderer LowerBill;
        public ModelRenderer Eyebrow;
        public ModelRenderer UpperBill2;
        public ModelRenderer UpperBill4;
        public ModelRenderer UpperBill3;
        public ModelRenderer UpperBill5;

        public Child() {
            texWidth = 64;
            texHeight = 32;
            this.LeftFootLeftToe = new ModelRenderer(this, 26, 20);
            this.LeftFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.RightWing = new ModelRenderer(this, 36, 0);
            this.RightWing.setPos(-1.9F, -1.9F, 0.7F);
            this.RightWing.addBox(-0.8F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightWing, -0.5462880425584197F, 0.0911061832922575F, -0.13665927909957545F);
            this.Head = new ModelRenderer(this, 0, 5);
            this.Head.setPos(0.0F, 0.0F, 2.0F);
            this.Head.addBox(-1.5F, -0.7F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.27314402127920984F, 0.0F, 0.0F);
            this.RightFootLeftToe = new ModelRenderer(this, 31, 20);
            this.RightFootLeftToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootLeftToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootLeftToe, 0.0F, 0.0F, 0.591841146688116F);
            this.LeftFoot = new ModelRenderer(this, 26, 16);
            this.LeftFoot.setPos(0.0F, 0.0F, -0.9F);
            this.LeftFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFoot, 0.6829473549475088F, 0.0F, 0.0F);
            this.UpperBill3 = new ModelRenderer(this, 18, 8);
            this.UpperBill3.setPos(0.0F, 0.0F, 0.0F);
            this.UpperBill3.addBox(-0.25F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.LeftWing = new ModelRenderer(this, 29, 0);
            this.LeftWing.setPos(1.9F, -1.9F, 0.7F);
            this.LeftWing.addBox(-0.2F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftWing, -0.5462880425584197F, -0.0911061832922575F, 0.13665927909957545F);
            this.Eyebrow = new ModelRenderer(this, 2, 1);
            this.Eyebrow.setPos(0.0F, -0.7F, 3.0F);
            this.Eyebrow.addBox(-1.5F, -0.3F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Eyebrow, -3.141592653589793F, 0.0F, 0.0F);
            this.UpperBill1 = new ModelRenderer(this, 18, 1);
            this.UpperBill1.setPos(0.0F, 0.0F, 0.9F);
            this.UpperBill1.addBox(-1.0F, -1.7F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill1, 0.11623892551966127F, 0.0F, 0.0F);
            this.UpperBill2 = new ModelRenderer(this, 18, 5);
            this.UpperBill2.setPos(0.0F, -1.7F, 0.0F);
            this.UpperBill2.addBox(-0.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill2, -0.2275909337942703F, 0.0F, 0.0F);
            this.Neck1 = new ModelRenderer(this, 0, 18);
            this.Neck1.setPos(0.0F, -2.0F, -1.8F);
            this.Neck1.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck1, 0.6373942508178124F, 0.0F, 0.0F);
            this.LeftFootRightToe = new ModelRenderer(this, 26, 20);
            this.LeftFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.LeftFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftFootRightToe, 0.0F, 0.0F, -0.591841146688116F);
            this.Body = new ModelRenderer(this, 0, 24);
            this.Body.setPos(0.0F, 20.9F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.092750655326294F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 31, 16);
            this.RightFoot.setPos(0.0F, 0.0F, -0.9F);
            this.RightFoot.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFoot, 0.6829473549475088F, 0.0F, 0.0F);
            this.LowerBill = new ModelRenderer(this, 13, 15);
            this.LowerBill.setPos(0.0F, -0.7F, 1.5F);
            this.LowerBill.addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerBill, -0.0911061832922575F, 0.0F, 0.0F);
            this.TailBase = new ModelRenderer(this, 17, 28);
            this.TailBase.setPos(0.0F, 2.0F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, -0.18203784630933073F, 0.0F, 0.0F);
            this.UpperBill5 = new ModelRenderer(this, 18, 16);
            this.UpperBill5.setPos(0.0F, -3.0F, 1.0F);
            this.UpperBill5.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill5, 0.956091342937205F, 0.0F, 0.0F);
            this.UpperBill4 = new ModelRenderer(this, 18, 11);
            this.UpperBill4.setPos(0.0F, 0.6F, 0.5F);
            this.UpperBill4.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperBill4, 0.0911061832922575F, 0.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this, 26, 13);
            this.LeftLeg.setPos(1.3F, 0.9F, -1.4F);
            this.LeftLeg.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LeftLeg, -0.2275909337942703F, -0.0911061832922575F, 0.18203784630933073F);
            this.RightFootRightToe = new ModelRenderer(this, 31, 20);
            this.RightFootRightToe.setPos(0.0F, 0.2F, -0.01F);
            this.RightFootRightToe.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightFootRightToe, 0.004537855888737689F, 0.0F, -0.591841146688116F);
            this.RightLeg = new ModelRenderer(this, 31, 13);
            this.RightLeg.setPos(-1.3F, 0.9F, -1.4F);
            this.RightLeg.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(RightLeg, -0.2275909337942703F, 0.0911061832922575F, -0.18203784630933073F);
            this.LeftFoot.addChild(this.LeftFootLeftToe);
            this.Body.addChild(this.RightWing);
            this.Neck1.addChild(this.Head);
            this.RightFoot.addChild(this.RightFootLeftToe);
            this.LeftLeg.addChild(this.LeftFoot);
            this.UpperBill2.addChild(this.UpperBill3);
            this.Body.addChild(this.LeftWing);
            this.Head.addChild(this.Eyebrow);
            this.Head.addChild(this.UpperBill1);
            this.UpperBill1.addChild(this.UpperBill2);
            this.Body.addChild(this.Neck1);
            this.LeftFoot.addChild(this.LeftFootRightToe);
            this.RightLeg.addChild(this.RightFoot);
            this.Head.addChild(this.LowerBill);
            this.Body.addChild(this.TailBase);
            this.UpperBill4.addChild(this.UpperBill5);
            this.UpperBill1.addChild(this.UpperBill4);
            this.Body.addChild(this.LeftLeg);
            this.RightFoot.addChild(this.RightFootRightToe);
            this.Body.addChild(this.RightLeg);
            this.saveBase();
        }

        @Override
        public void setupAnim(KookaburraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck1.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.273F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float degree = 1.0F;
            float speed = 1.0F;
            this.Neck1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.637F;
            this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.273F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}





