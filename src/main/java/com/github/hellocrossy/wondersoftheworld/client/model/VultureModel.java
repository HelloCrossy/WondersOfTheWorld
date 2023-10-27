package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.VultureEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class VultureModel extends ZawaBaseModel<VultureEntity> {
    protected ModelRenderer Body;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Body);
        }

        return this.parts;
    }

    public static class Adult extends VultureModel {
        public ModelRenderer Chest;
        public ModelRenderer WingFoldedLeft;
        public ModelRenderer WingFoldedRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer NeckBase;
        public ModelRenderer Hips;
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Beak1;
        public ModelRenderer Beak2;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Toe3Left;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1Right;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe3Right;

        public Adult() {
            texWidth = 32;
            texHeight = 32;
            this.Head = new ModelRenderer(this, 0, 8);
            this.Head.setPos(0.0F, -2.0F, -0.3F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.15707963267948966F, 0.0F, 0.0F);
            this.WingFoldedRight = new ModelRenderer(this, 8, 10);
            this.WingFoldedRight.setPos(-1.9F, -1.7F, -1.8F);
            this.WingFoldedRight.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedRight, 0.05235987755982988F, 0.0F, 0.0F);
            this.Beak1 = new ModelRenderer(this, 20, 5);
            this.Beak1.setPos(0.0F, 0.0F, -1.3F);
            this.Beak1.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak1, 0.20071286397934787F, 0.0F, 0.0F);
            this.Beak2 = new ModelRenderer(this, 0, 0);
            this.Beak2.setPos(0.0F, -1.0F, -1.0F);
            this.Beak2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak2, -0.28797932657906433F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 0, 20);
            this.Toe1Right.setPos(-0.2F, 0.1F, 0.3F);
            this.Toe1Right.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.5235987755982988F, -0.12217304763960307F);
            this.Hips = new ModelRenderer(this, 0, 15);
            this.Hips.setPos(-1.5F, 0.7F, 3.3F);
            this.Hips.addBox(0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -1.0515608743265834F, 0.0F, 0.0F);
            this.WingFoldedLeft = new ModelRenderer(this, 8, 10);
            this.WingFoldedLeft.mirror = true;
            this.WingFoldedLeft.setPos(1.9F, -1.7F, -1.8F);
            this.WingFoldedLeft.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedLeft, 0.05235987755982988F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 12, 0);
            this.ThighLeft.setPos(1.3F, 0.0F, 0.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.4363323129985824F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 12, 0);
            this.ThighRight.setPos(-1.3F, 0.0F, 0.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.4363323129985824F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 11, 18);
            this.Toe2Left.setPos(0.1F, 0.2F, 0.8F);
            this.Toe2Left.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, -0.4363323129985824F, 0.17453292519943295F, 0.08726646259971647F);
            this.Toe3Left = new ModelRenderer(this, 0, 20);
            this.Toe3Left.setPos(-0.2F, 0.2F, 0.9F);
            this.Toe3Left.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Left, -0.5235987755982988F, -0.3490658503988659F, 0.15707963267948966F);
            this.FootRight = new ModelRenderer(this, 0, 20);
            this.FootRight.setPos(0.0F, 2.3F, -0.5F);
            this.FootRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.02F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 1.3089969389957472F, 0.0F, 0.0F);
            this.Toe3Right = new ModelRenderer(this, 0, 20);
            this.Toe3Right.setPos(0.2F, 0.2F, 0.9F);
            this.Toe3Right.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Right, -0.5235987755982988F, 0.3490658503988659F, -0.15707963267948966F);
            this.Toe2Right = new ModelRenderer(this, 11, 18);
            this.Toe2Right.setPos(-0.1F, 0.2F, 0.8F);
            this.Toe2Right.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, -0.4363323129985824F, -0.17453292519943295F, -0.08726646259971647F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.3752457891787809F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 20);
            this.FootLeft.setPos(0.0F, 2.3F, -0.5F);
            this.FootLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.02F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 1.3089969389957472F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 0, 20);
            this.Toe1Left.setPos(0.2F, 0.1F, 0.3F);
            this.Toe1Left.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.5235987755982988F, 0.12217304763960307F);
            this.LegLeft = new ModelRenderer(this, 0, 0);
            this.LegLeft.setPos(0.0F, 0.9F, 1.4F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.296705972839036F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 8, 12);
            this.Chest.setPos(0.0F, -0.1F, -1.3F);
            this.Chest.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.7853981633974483F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 16, 15);
            this.NeckBase.setPos(0.0F, -1.0F, -0.2F);
            this.NeckBase.addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.2617993877991494F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 16, 15);
            this.Neck.setPos(0.0F, -0.5F, -0.6F);
            this.Neck.addBox(-0.5F, -1.0F, -0.8F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 0, 0);
            this.LegRight.setPos(0.0F, 0.9F, 1.4F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.296705972839036F, 0.0F, 0.0F);
            this.NeckBase.addChild(this.Head);
            this.Body.addChild(this.WingFoldedRight);
            this.Head.addChild(this.Beak1);
            this.Beak1.addChild(this.Beak2);
            this.FootRight.addChild(this.Toe1Right);
            this.Chest.addChild(this.Hips);
            this.Body.addChild(this.WingFoldedLeft);
            this.Body.addChild(this.ThighLeft);
            this.Body.addChild(this.ThighRight);
            this.FootLeft.addChild(this.Toe2Left);
            this.FootLeft.addChild(this.Toe3Left);
            this.LegRight.addChild(this.FootRight);
            this.FootRight.addChild(this.Toe3Right);
            this.FootRight.addChild(this.Toe2Right);
            this.LegLeft.addChild(this.FootLeft);
            this.FootLeft.addChild(this.Toe1Left);
            this.ThighLeft.addChild(this.LegLeft);
            this.Body.addChild(this.Chest);
            this.Chest.addChild(this.NeckBase);
            this.NeckBase.addChild(this.Neck);
            this.ThighRight.addChild(this.LegRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(VultureEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }

    public static class Flying extends VultureModel {

        public ModelRenderer Chest;
        public ModelRenderer WingFoldedLeft;
        public ModelRenderer WingFoldedRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer NeckBase;
        public ModelRenderer Hips;
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Beak1;
        public ModelRenderer Beak2;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Toe3Left;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1Right;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe3Right;

        public Flying() {
            texWidth = 32;
            texHeight = 32;
            this.Head = new ModelRenderer(this, 0, 8);
            this.Head.setPos(0.0F, -2.0F, -0.3F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.15707963267948966F, 0.0F, 0.0F);
            this.WingFoldedRight = new ModelRenderer(this, 8, 10);
            this.WingFoldedRight.setPos(-1.9F, -1.7F, -1.8F);
            this.WingFoldedRight.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedRight, 0.05235987755982988F, 0.0F, 0.0F);
            this.Beak1 = new ModelRenderer(this, 20, 5);
            this.Beak1.setPos(0.0F, 0.0F, -1.3F);
            this.Beak1.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak1, 0.20071286397934787F, 0.0F, 0.0F);
            this.Beak2 = new ModelRenderer(this, 0, 0);
            this.Beak2.setPos(0.0F, -1.0F, -1.0F);
            this.Beak2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak2, -0.28797932657906433F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 0, 20);
            this.Toe1Right.setPos(-0.2F, 0.1F, 0.3F);
            this.Toe1Right.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.5235987755982988F, -0.12217304763960307F);
            this.Hips = new ModelRenderer(this, 0, 15);
            this.Hips.setPos(-1.5F, 0.7F, 3.3F);
            this.Hips.addBox(0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -1.0515608743265834F, 0.0F, 0.0F);
            this.WingFoldedLeft = new ModelRenderer(this, 8, 10);
            this.WingFoldedLeft.mirror = true;
            this.WingFoldedLeft.setPos(1.9F, -1.7F, -1.8F);
            this.WingFoldedLeft.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedLeft, 0.05235987755982988F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 12, 0);
            this.ThighLeft.setPos(1.3F, 0.0F, 0.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.4363323129985824F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 12, 0);
            this.ThighRight.setPos(-1.3F, 0.0F, 0.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.4363323129985824F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 11, 18);
            this.Toe2Left.setPos(0.1F, 0.2F, 0.8F);
            this.Toe2Left.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, -0.4363323129985824F, 0.17453292519943295F, 0.08726646259971647F);
            this.Toe3Left = new ModelRenderer(this, 0, 20);
            this.Toe3Left.setPos(-0.2F, 0.2F, 0.9F);
            this.Toe3Left.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Left, -0.5235987755982988F, -0.3490658503988659F, 0.15707963267948966F);
            this.FootRight = new ModelRenderer(this, 0, 20);
            this.FootRight.setPos(0.0F, 2.3F, -0.5F);
            this.FootRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.02F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 1.3089969389957472F, 0.0F, 0.0F);
            this.Toe3Right = new ModelRenderer(this, 0, 20);
            this.Toe3Right.setPos(0.2F, 0.2F, 0.9F);
            this.Toe3Right.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Right, -0.5235987755982988F, 0.3490658503988659F, -0.15707963267948966F);
            this.Toe2Right = new ModelRenderer(this, 11, 18);
            this.Toe2Right.setPos(-0.1F, 0.2F, 0.8F);
            this.Toe2Right.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, -0.4363323129985824F, -0.17453292519943295F, -0.08726646259971647F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.3752457891787809F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 20);
            this.FootLeft.setPos(0.0F, 2.3F, -0.5F);
            this.FootLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.02F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 1.3089969389957472F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 0, 20);
            this.Toe1Left.setPos(0.2F, 0.1F, 0.3F);
            this.Toe1Left.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.5235987755982988F, 0.12217304763960307F);
            this.LegLeft = new ModelRenderer(this, 0, 0);
            this.LegLeft.setPos(0.0F, 0.9F, 1.4F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.296705972839036F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 8, 12);
            this.Chest.setPos(0.0F, -0.1F, -1.3F);
            this.Chest.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.7853981633974483F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 16, 15);
            this.NeckBase.setPos(0.0F, -1.0F, -0.2F);
            this.NeckBase.addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.2617993877991494F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 16, 15);
            this.Neck.setPos(0.0F, -0.5F, -0.6F);
            this.Neck.addBox(-0.5F, -1.0F, -0.8F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 0, 0);
            this.LegRight.setPos(0.0F, 0.9F, 1.4F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.296705972839036F, 0.0F, 0.0F);
            this.NeckBase.addChild(this.Head);
            this.Body.addChild(this.WingFoldedRight);
            this.Head.addChild(this.Beak1);
            this.Beak1.addChild(this.Beak2);
            this.FootRight.addChild(this.Toe1Right);
            this.Chest.addChild(this.Hips);
            this.Body.addChild(this.WingFoldedLeft);
            this.Body.addChild(this.ThighLeft);
            this.Body.addChild(this.ThighRight);
            this.FootLeft.addChild(this.Toe2Left);
            this.FootLeft.addChild(this.Toe3Left);
            this.LegRight.addChild(this.FootRight);
            this.FootRight.addChild(this.Toe3Right);
            this.FootRight.addChild(this.Toe2Right);
            this.LegLeft.addChild(this.FootLeft);
            this.FootLeft.addChild(this.Toe1Left);
            this.ThighLeft.addChild(this.LegLeft);
            this.Body.addChild(this.Chest);
            this.Chest.addChild(this.NeckBase);
            this.NeckBase.addChild(this.Neck);
            this.ThighRight.addChild(this.LegRight);
            this.saveBase();
        }
        @Override
        public void setupAnim(VultureEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }

    public static class Child extends VultureModel {
        public ModelRenderer Chest;
        public ModelRenderer WingFoldedLeft;
        public ModelRenderer WingFoldedRight;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer NeckBase;
        public ModelRenderer Hips;
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Beak1;
        public ModelRenderer Beak2;
        public ModelRenderer LegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Toe1Left;
        public ModelRenderer Toe2Left;
        public ModelRenderer Toe3Left;
        public ModelRenderer LegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Toe1Right;
        public ModelRenderer Toe2Right;
        public ModelRenderer Toe3Right;

        public Child() {
            texWidth = 32;
            texHeight = 32;
            this.Head = new ModelRenderer(this, 0, 8);
            this.Head.setPos(0.0F, -2.0F, -0.3F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.15707963267948966F, 0.0F, 0.0F);
            this.WingFoldedRight = new ModelRenderer(this, 8, 10);
            this.WingFoldedRight.setPos(-1.9F, -1.7F, -1.8F);
            this.WingFoldedRight.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedRight, 0.05235987755982988F, 0.0F, 0.0F);
            this.Beak1 = new ModelRenderer(this, 20, 5);
            this.Beak1.setPos(0.0F, 0.0F, -1.3F);
            this.Beak1.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak1, 0.20071286397934787F, 0.0F, 0.0F);
            this.Beak2 = new ModelRenderer(this, 0, 0);
            this.Beak2.setPos(0.0F, -1.0F, -1.0F);
            this.Beak2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Beak2, -0.28797932657906433F, 0.0F, 0.0F);
            this.Toe1Right = new ModelRenderer(this, 0, 20);
            this.Toe1Right.setPos(-0.2F, 0.1F, 0.3F);
            this.Toe1Right.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Right, 0.0F, 0.5235987755982988F, -0.12217304763960307F);
            this.Hips = new ModelRenderer(this, 0, 15);
            this.Hips.setPos(-1.5F, 0.7F, 3.3F);
            this.Hips.addBox(0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -1.0515608743265834F, 0.0F, 0.0F);
            this.WingFoldedLeft = new ModelRenderer(this, 8, 10);
            this.WingFoldedLeft.mirror = true;
            this.WingFoldedLeft.setPos(1.9F, -1.7F, -1.8F);
            this.WingFoldedLeft.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedLeft, 0.05235987755982988F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 12, 0);
            this.ThighLeft.setPos(1.3F, 0.0F, 0.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, -0.4363323129985824F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 12, 0);
            this.ThighRight.setPos(-1.3F, 0.0F, 0.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, -0.4363323129985824F, 0.0F, 0.0F);
            this.Toe2Left = new ModelRenderer(this, 11, 18);
            this.Toe2Left.setPos(0.1F, 0.2F, 0.8F);
            this.Toe2Left.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Left, -0.4363323129985824F, 0.17453292519943295F, 0.08726646259971647F);
            this.Toe3Left = new ModelRenderer(this, 0, 20);
            this.Toe3Left.setPos(-0.2F, 0.2F, 0.9F);
            this.Toe3Left.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Left, -0.5235987755982988F, -0.3490658503988659F, 0.15707963267948966F);
            this.FootRight = new ModelRenderer(this, 0, 20);
            this.FootRight.setPos(0.0F, 2.3F, -0.5F);
            this.FootRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.02F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 1.3089969389957472F, 0.0F, 0.0F);
            this.Toe3Right = new ModelRenderer(this, 0, 20);
            this.Toe3Right.setPos(0.2F, 0.2F, 0.9F);
            this.Toe3Right.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3Right, -0.5235987755982988F, 0.3490658503988659F, -0.15707963267948966F);
            this.Toe2Right = new ModelRenderer(this, 11, 18);
            this.Toe2Right.setPos(-0.1F, 0.2F, 0.8F);
            this.Toe2Right.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2Right, -0.4363323129985824F, -0.17453292519943295F, -0.08726646259971647F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.3752457891787809F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 0, 20);
            this.FootLeft.setPos(0.0F, 2.3F, -0.5F);
            this.FootLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.02F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 1.3089969389957472F, 0.0F, 0.0F);
            this.Toe1Left = new ModelRenderer(this, 0, 20);
            this.Toe1Left.setPos(0.2F, 0.1F, 0.3F);
            this.Toe1Left.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1Left, 0.0F, -0.5235987755982988F, 0.12217304763960307F);
            this.LegLeft = new ModelRenderer(this, 0, 0);
            this.LegLeft.setPos(0.0F, 0.9F, 1.4F);
            this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.296705972839036F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 8, 12);
            this.Chest.setPos(0.0F, -0.1F, -1.3F);
            this.Chest.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.7853981633974483F, 0.0F, 0.0F);
            this.NeckBase = new ModelRenderer(this, 16, 15);
            this.NeckBase.setPos(0.0F, -1.0F, -0.2F);
            this.NeckBase.addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckBase, -0.2617993877991494F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 16, 15);
            this.Neck.setPos(0.0F, -0.5F, -0.6F);
            this.Neck.addBox(-0.5F, -1.0F, -0.8F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 0, 0);
            this.LegRight.setPos(0.0F, 0.9F, 1.4F);
            this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.296705972839036F, 0.0F, 0.0F);
            this.NeckBase.addChild(this.Head);
            this.Body.addChild(this.WingFoldedRight);
            this.Head.addChild(this.Beak1);
            this.Beak1.addChild(this.Beak2);
            this.FootRight.addChild(this.Toe1Right);
            this.Chest.addChild(this.Hips);
            this.Body.addChild(this.WingFoldedLeft);
            this.Body.addChild(this.ThighLeft);
            this.Body.addChild(this.ThighRight);
            this.FootLeft.addChild(this.Toe2Left);
            this.FootLeft.addChild(this.Toe3Left);
            this.LegRight.addChild(this.FootRight);
            this.FootRight.addChild(this.Toe3Right);
            this.FootRight.addChild(this.Toe2Right);
            this.LegLeft.addChild(this.FootLeft);
            this.FootLeft.addChild(this.Toe1Left);
            this.ThighLeft.addChild(this.LegLeft);
            this.Body.addChild(this.Chest);
            this.Chest.addChild(this.NeckBase);
            this.NeckBase.addChild(this.Neck);
            this.ThighRight.addChild(this.LegRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(VultureEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
