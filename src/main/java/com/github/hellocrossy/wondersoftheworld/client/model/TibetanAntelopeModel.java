package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TibetanAntelopeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class TibetanAntelopeModel extends ZawaBaseModel<TibetanAntelopeEntity> {
    protected ZawaModelRenderer bb_main;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(bb_main);
        }

        return this.parts;
    }

    public static class Adult extends TibetanAntelopeModel {
        
        protected ZawaModelRenderer cube_r1;
        protected ZawaModelRenderer cube_r2;
        protected ZawaModelRenderer cube_r3;
        protected ZawaModelRenderer cube_r4;
        protected ZawaModelRenderer cube_r5;
        protected ZawaModelRenderer cube_r6;
        protected ZawaModelRenderer cube_r7;
        protected ZawaModelRenderer cube_r8;
        protected ZawaModelRenderer cube_r9;
        protected ZawaModelRenderer cube_r10;
        protected ZawaModelRenderer cube_r11;
        protected ZawaModelRenderer cube_r12;
        protected ZawaModelRenderer Thigh_r1;
        protected ZawaModelRenderer UpperLeg_r1;
        protected ZawaModelRenderer Forearm_r1;
        protected ZawaModelRenderer cube_r13;
        protected ZawaModelRenderer cube_r14;
        protected ZawaModelRenderer cube_r15;
        protected ZawaModelRenderer cube_r16;
        protected ZawaModelRenderer cube_r17;
        protected ZawaModelRenderer cube_r18;
        protected ZawaModelRenderer cube_r19;
        protected ZawaModelRenderer UpperLeg_r2;
        protected ZawaModelRenderer Thigh_r2;
        protected ZawaModelRenderer cube_r20;
        protected ZawaModelRenderer cube_r21;
        protected ZawaModelRenderer cube_r22;

        public Adult() {
            texWidth = 128;
            texHeight = 128;

            bb_main = new ZawaModelRenderer(this, 0, 0);
            bb_main.setPos(0.0F, 24.0F, 0.0F);
            bb_main.texOffs(46, 17).addBox(1.2F, -6.1199F, -6.4495F, 2.0F, 5.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(46, 24).addBox(1.15F, -2.0F, -7.05F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(21, 52).addBox(0.9F, -7.2505F, 6.7616F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(44, 9).addBox(1.375F, -10.6199F, -6.9495F, 2.0F, 5.0F, 3.0F, 0.0F, false);
            bb_main.texOffs(54, 9).addBox(-3.375F, -10.6199F, -6.9495F, 2.0F, 5.0F, 3.0F, 0.0F, false);
            bb_main.texOffs(56, 24).addBox(-3.15F, -2.0F, -7.05F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(56, 17).addBox(-3.2F, -6.1199F, -6.4495F, 2.0F, 5.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(20, 60).addBox(-2.8F, -2.0F, 6.05F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(13, 52).addBox(-2.9F, -7.2505F, 6.7616F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(28, 60).addBox(0.8F, -2.0F, 6.05F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r1 = new ZawaModelRenderer(this, 56, 52);
            cube_r1.setPos(-0.5F, -20.4519F, -11.7216F);
            bb_main.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.876F, -0.306F, -1.1696F);
            cube_r1.addBox(-0.4261F, 0.0334F, -2.1877F, 3.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 0, 0);
            cube_r2.setPos(-0.5437F, -13.96F, 8.871F);
            bb_main.addChild(cube_r2);
            setRotateAngle(cube_r2, -0.0131F, 0.0F, 0.0F);
            cube_r2.addBox(-1.0F, -3.025F, 0.125F, 3.0F, 5.0F, 2.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 24, 1);
            cube_r3.setPos(0.0F, -16.1696F, -5.2404F);
            bb_main.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.3447F, 0.0F, 0.0F);
            cube_r3.addBox(-2.0F, -2.7607F, -0.9426F, 4.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 24, 4);
            cube_r4.setPos(0.0F, -16.1696F, -5.2404F);
            bb_main.addChild(cube_r4);
            setRotateAngle(cube_r4, 0.2093F, 0.0F, 0.0F);
            cube_r4.addBox(-2.0F, -2.8367F, -1.3396F, 4.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 56, 42);
            cube_r5.setPos(0.5F, -26.9112F, -12.9747F);
            bb_main.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.1382F, 0.202F, -0.2492F);
            cube_r5.addBox(-3.1111F, 1.5717F, -0.4528F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 56, 38);
            cube_r6.setPos(0.5F, -24.3992F, -12.582F);
            bb_main.addChild(cube_r6);
            setRotateAngle(cube_r6, -0.1531F, 0.1874F, -0.3653F);
            cube_r6.addBox(-2.3232F, -3.846F, -1.0093F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 56, 34);
            cube_r7.setPos(-3.4114F, -29.7567F, -12.354F);
            bb_main.addChild(cube_r7);
            setRotateAngle(cube_r7, 0.0239F, 0.2109F, -0.3915F);
            cube_r7.addBox(-0.6272F, -0.4123F, -0.3906F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 56, 31);
            cube_r8.setPos(-3.4114F, -29.7567F, -12.354F);
            bb_main.addChild(cube_r8);
            setRotateAngle(cube_r8, 0.3034F, 0.1396F, -0.1163F);
            cube_r8.addBox(-0.6783F, -2.0766F, -0.3574F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 60, 31);
            cube_r9.setPos(3.4114F, -29.7567F, -12.354F);
            bb_main.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.3034F, -0.1396F, 0.1163F);
            cube_r9.addBox(-0.3217F, -2.0766F, -0.3574F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 60, 34);
            cube_r10.setPos(3.4114F, -29.7567F, -12.354F);
            bb_main.addChild(cube_r10);
            setRotateAngle(cube_r10, 0.0239F, -0.2109F, 0.3915F);
            cube_r10.addBox(-0.3728F, -0.4123F, -0.3906F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 60, 38);
            cube_r11.setPos(-0.5F, -24.3992F, -12.582F);
            bb_main.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.1531F, -0.1874F, 0.3653F);
            cube_r11.addBox(1.3232F, -3.846F, -1.0093F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 60, 42);
            cube_r12.setPos(-0.5F, -26.9112F, -12.9747F);
            bb_main.addChild(cube_r12);
            setRotateAngle(cube_r12, -0.1382F, -0.202F, 0.2492F);
            cube_r12.addBox(2.1111F, 1.5717F, -0.4528F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Thigh_r1 = new ZawaModelRenderer(this, 24, 35 );
            Thigh_r1.setPos(-2.05F, -12.6832F, 7.2441F);
            bb_main.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, -0.1745F, 0.0027F, 0.0304F);
            Thigh_r1.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            UpperLeg_r1 = new ZawaModelRenderer(this, 0, 45);
            UpperLeg_r1.setPos(-1.875F, -8.5809F, 5.9257F);
            bb_main.addChild(UpperLeg_r1);
            setRotateAngle(UpperLeg_r1, 0.5461F, 0.0014F, 0.0047F);
            UpperLeg_r1.addBox(-1.5F, -1.1F, -0.625F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            Forearm_r1 = new ZawaModelRenderer(this, 0, 0);
            Forearm_r1.setPos(-0.5F, -5.1599F, -4.7372F);
            bb_main.addChild(Forearm_r1);
            setRotateAngle(Forearm_r1, 1.0079F, 0.0F, 0.0F);
            Forearm_r1.texOffs(36, 0).addBox(1.125F, -6.9849F, 3.3378F, 3.0F, 5.0F, 4.0F, 0.0F, false);
            Forearm_r1.texOffs(50, 0).addBox(-3.125F, -6.9849F, 3.3378F, 3.0F, 5.0F, 4.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 48, 52);
            cube_r13.setPos(0.5F, -20.4519F, -11.7216F);
            bb_main.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.876F, 0.306F, 1.1696F);
            cube_r13.addBox(-2.5739F, 0.0334F, -2.1877F, 3.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 0, 22);
            cube_r14.setPos(-0.5437F, -13.96F, 8.871F);
            bb_main.addChild(cube_r14);
            setRotateAngle(cube_r14, -0.2225F, 0.0F, 0.0F);
            cube_r14.addBox(-2.0F, -3.775F, -2.775F, 5.0F, 8.0F, 4.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 36, 55);
            cube_r15.setPos(0.0F, -18.0617F, -14.6887F);
            bb_main.addChild(cube_r15);
            setRotateAngle(cube_r15, 0.144F, 0.0F, 0.0F);
            cube_r15.addBox(-1.0F, -0.1085F, -2.0477F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 36, 46);
            cube_r16.setPos(-0.5F, -18.1367F, -14.6887F);
            bb_main.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.3098F, 0.0F, 0.0F);
            cube_r16.addBox(-1.0F, -0.9085F, -2.4727F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 36, 50);
            cube_r17.setPos(-0.5F, -19.0236F, -15.4491F);
            bb_main.addChild(cube_r17);
            setRotateAngle(cube_r17, 0.7636F, 0.0F, 0.0F);
            cube_r17.addBox(-0.5F, -0.3F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 0, 55);
            cube_r18.setPos(-0.5F, -15.12F, -10.3445F);
            bb_main.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.8247F, 0.0F, 0.0F);
            cube_r18.addBox(-0.5F, -1.4F, -2.775F, 2.0F, 2.0F, 7.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 0, 34);
            cube_r19.setPos(0.0F, -16.5617F, -10.7013F);
            bb_main.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.6109F, 0.0F, 0.0F);
            cube_r19.addBox(-1.5F, -3.8F, -2.375F, 3.0F, 4.0F, 7.0F, 0.0F, false);

            UpperLeg_r2 = new ZawaModelRenderer(this, 12, 45);
            UpperLeg_r2.setPos(1.875F, -8.5809F, 5.9257F);
            bb_main.addChild(UpperLeg_r2);
            setRotateAngle(UpperLeg_r2, 0.5461F, -0.0014F, -0.0047F);
            UpperLeg_r2.addBox(-1.5F, -1.1F, -0.625F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            Thigh_r2 = new ZawaModelRenderer(this, 40, 35);
            Thigh_r2.setPos(2.05F, -12.6832F, 7.2441F);
            bb_main.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, -0.1745F, -0.0027F, -0.0304F);
            Thigh_r2.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 0, 0);
            cube_r20.setPos(-0.4601F, -14.0687F, 1.5525F);
            bb_main.addChild(cube_r20);
            setRotateAngle(cube_r20, 0.0F, 0.0075F, -0.0045F);
            cube_r20.addBox(-2.5F, -4.45F, -6.5F, 6.0F, 9.0F, 12.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 22, 22);
            cube_r21.setPos(-0.0437F, -16.2946F, -5.8654F);
            bb_main.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.1309F, 0.0F, 0.0F);
            cube_r21.addBox(-2.5F, -2.2809F, -2.4292F, 5.0F, 8.0F, 5.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 47, 55);
            cube_r22.setPos(0.5F, -21.2469F, -13.0754F);
            bb_main.addChild(cube_r22);
            setRotateAngle(cube_r22, 0.0305F, 0.0F, 0.0F);
            cube_r22.addBox(-2.5F, -0.0031F, -1.2246F, 4.0F, 5.0F, 4.0F, 0.0F, false);

            this.saveBase();

        }

        @Override
        public void setupAnim(TibetanAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }

    public static class Child extends TibetanAntelopeModel {

        protected ZawaModelRenderer cube_r1;
        protected ZawaModelRenderer cube_r2;
        protected ZawaModelRenderer cube_r3;
        protected ZawaModelRenderer cube_r4;
        protected ZawaModelRenderer cube_r5;
        protected ZawaModelRenderer cube_r6;
        protected ZawaModelRenderer cube_r7;
        protected ZawaModelRenderer cube_r8;
        protected ZawaModelRenderer cube_r9;
        protected ZawaModelRenderer cube_r10;
        protected ZawaModelRenderer cube_r11;
        protected ZawaModelRenderer cube_r12;
        protected ZawaModelRenderer Thigh_r1;
        protected ZawaModelRenderer UpperLeg_r1;
        protected ZawaModelRenderer Forearm_r1;
        protected ZawaModelRenderer cube_r13;
        protected ZawaModelRenderer cube_r14;
        protected ZawaModelRenderer cube_r15;
        protected ZawaModelRenderer cube_r16;
        protected ZawaModelRenderer cube_r17;
        protected ZawaModelRenderer cube_r18;
        protected ZawaModelRenderer cube_r19;
        protected ZawaModelRenderer UpperLeg_r2;
        protected ZawaModelRenderer Thigh_r2;
        protected ZawaModelRenderer cube_r20;
        protected ZawaModelRenderer cube_r21;
        protected ZawaModelRenderer cube_r22;

        public Child() {
            texWidth = 128;
            texHeight = 128;

            bb_main = new ZawaModelRenderer(this, 0, 0);
            bb_main.setPos(0.0F, 24.0F, 0.0F);
            bb_main.texOffs(46, 17).addBox(1.2F, -6.1199F, -6.4495F, 2.0F, 5.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(46, 24).addBox(1.15F, -2.0F, -7.05F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(21, 52).addBox(0.9F, -7.2505F, 6.7616F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(44, 9).addBox(1.375F, -10.6199F, -6.9495F, 2.0F, 5.0F, 3.0F, 0.0F, false);
            bb_main.texOffs(54, 9).addBox(-3.375F, -10.6199F, -6.9495F, 2.0F, 5.0F, 3.0F, 0.0F, false);
            bb_main.texOffs(56, 24).addBox(-3.15F, -2.0F, -7.05F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(56, 17).addBox(-3.2F, -6.1199F, -6.4495F, 2.0F, 5.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(20, 60).addBox(-2.8F, -2.0F, 6.05F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(13, 52).addBox(-2.9F, -7.2505F, 6.7616F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(28, 60).addBox(0.8F, -2.0F, 6.05F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r1 = new ZawaModelRenderer(this, 56, 52);
            cube_r1.setPos(-0.5F, -20.4519F, -11.7216F);
            bb_main.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.876F, -0.306F, -1.1696F);
            cube_r1.addBox(-0.4261F, 0.0334F, -2.1877F, 3.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 0, 0);
            cube_r2.setPos(-0.5437F, -13.96F, 8.871F);
            bb_main.addChild(cube_r2);
            setRotateAngle(cube_r2, -0.0131F, 0.0F, 0.0F);
            cube_r2.addBox(-1.0F, -3.025F, 0.125F, 3.0F, 5.0F, 2.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 24, 1);
            cube_r3.setPos(0.0F, -16.1696F, -5.2404F);
            bb_main.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.3447F, 0.0F, 0.0F);
            cube_r3.addBox(-2.0F, -2.7607F, -0.9426F, 4.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 24, 4);
            cube_r4.setPos(0.0F, -16.1696F, -5.2404F);
            bb_main.addChild(cube_r4);
            setRotateAngle(cube_r4, 0.2093F, 0.0F, 0.0F);
            cube_r4.addBox(-2.0F, -2.8367F, -1.3396F, 4.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 56, 42);
            cube_r5.setPos(0.5F, -26.9112F, -12.9747F);
            bb_main.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.1382F, 0.202F, -0.2492F);
            cube_r5.addBox(-3.1111F, 1.5717F, -0.4528F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 56, 38);
            cube_r6.setPos(0.5F, -24.3992F, -12.582F);
            bb_main.addChild(cube_r6);
            setRotateAngle(cube_r6, -0.1531F, 0.1874F, -0.3653F);
            cube_r6.addBox(-2.3232F, -3.846F, -1.0093F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 56, 34);
            cube_r7.setPos(-3.4114F, -29.7567F, -12.354F);
            bb_main.addChild(cube_r7);
            setRotateAngle(cube_r7, 0.0239F, 0.2109F, -0.3915F);
            cube_r7.addBox(-0.6272F, -0.4123F, -0.3906F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 56, 31);
            cube_r8.setPos(-3.4114F, -29.7567F, -12.354F);
            bb_main.addChild(cube_r8);
            setRotateAngle(cube_r8, 0.3034F, 0.1396F, -0.1163F);
            cube_r8.addBox(-0.6783F, -2.0766F, -0.3574F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 60, 31);
            cube_r9.setPos(3.4114F, -29.7567F, -12.354F);
            bb_main.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.3034F, -0.1396F, 0.1163F);
            cube_r9.addBox(-0.3217F, -2.0766F, -0.3574F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 60, 34);
            cube_r10.setPos(3.4114F, -29.7567F, -12.354F);
            bb_main.addChild(cube_r10);
            setRotateAngle(cube_r10, 0.0239F, -0.2109F, 0.3915F);
            cube_r10.addBox(-0.3728F, -0.4123F, -0.3906F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 60, 38);
            cube_r11.setPos(-0.5F, -24.3992F, -12.582F);
            bb_main.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.1531F, -0.1874F, 0.3653F);
            cube_r11.addBox(1.3232F, -3.846F, -1.0093F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 60, 42);
            cube_r12.setPos(-0.5F, -26.9112F, -12.9747F);
            bb_main.addChild(cube_r12);
            setRotateAngle(cube_r12, -0.1382F, -0.202F, 0.2492F);
            cube_r12.addBox(2.1111F, 1.5717F, -0.4528F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Thigh_r1 = new ZawaModelRenderer(this, 24, 35 );
            Thigh_r1.setPos(-2.05F, -12.6832F, 7.2441F);
            bb_main.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, -0.1745F, 0.0027F, 0.0304F);
            Thigh_r1.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            UpperLeg_r1 = new ZawaModelRenderer(this, 0, 45);
            UpperLeg_r1.setPos(-1.875F, -8.5809F, 5.9257F);
            bb_main.addChild(UpperLeg_r1);
            setRotateAngle(UpperLeg_r1, 0.5461F, 0.0014F, 0.0047F);
            UpperLeg_r1.addBox(-1.5F, -1.1F, -0.625F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            Forearm_r1 = new ZawaModelRenderer(this, 0, 0);
            Forearm_r1.setPos(-0.5F, -5.1599F, -4.7372F);
            bb_main.addChild(Forearm_r1);
            setRotateAngle(Forearm_r1, 1.0079F, 0.0F, 0.0F);
            Forearm_r1.texOffs(36, 0).addBox(1.125F, -6.9849F, 3.3378F, 3.0F, 5.0F, 4.0F, 0.0F, false);
            Forearm_r1.texOffs(50, 0).addBox(-3.125F, -6.9849F, 3.3378F, 3.0F, 5.0F, 4.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 48, 52);
            cube_r13.setPos(0.5F, -20.4519F, -11.7216F);
            bb_main.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.876F, 0.306F, 1.1696F);
            cube_r13.addBox(-2.5739F, 0.0334F, -2.1877F, 3.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 0, 22);
            cube_r14.setPos(-0.5437F, -13.96F, 8.871F);
            bb_main.addChild(cube_r14);
            setRotateAngle(cube_r14, -0.2225F, 0.0F, 0.0F);
            cube_r14.addBox(-2.0F, -3.775F, -2.775F, 5.0F, 8.0F, 4.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 36, 55);
            cube_r15.setPos(0.0F, -18.0617F, -14.6887F);
            bb_main.addChild(cube_r15);
            setRotateAngle(cube_r15, 0.144F, 0.0F, 0.0F);
            cube_r15.addBox(-1.0F, -0.1085F, -2.0477F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 36, 46);
            cube_r16.setPos(-0.5F, -18.1367F, -14.6887F);
            bb_main.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.3098F, 0.0F, 0.0F);
            cube_r16.addBox(-1.0F, -0.9085F, -2.4727F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 36, 50);
            cube_r17.setPos(-0.5F, -19.0236F, -15.4491F);
            bb_main.addChild(cube_r17);
            setRotateAngle(cube_r17, 0.7636F, 0.0F, 0.0F);
            cube_r17.addBox(-0.5F, -0.3F, -1.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 0, 55);
            cube_r18.setPos(-0.5F, -15.12F, -10.3445F);
            bb_main.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.8247F, 0.0F, 0.0F);
            cube_r18.addBox(-0.5F, -1.4F, -2.775F, 2.0F, 2.0F, 7.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 0, 34);
            cube_r19.setPos(0.0F, -16.5617F, -10.7013F);
            bb_main.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.6109F, 0.0F, 0.0F);
            cube_r19.addBox(-1.5F, -3.8F, -2.375F, 3.0F, 4.0F, 7.0F, 0.0F, false);

            UpperLeg_r2 = new ZawaModelRenderer(this, 12, 45);
            UpperLeg_r2.setPos(1.875F, -8.5809F, 5.9257F);
            bb_main.addChild(UpperLeg_r2);
            setRotateAngle(UpperLeg_r2, 0.5461F, -0.0014F, -0.0047F);
            UpperLeg_r2.addBox(-1.5F, -1.1F, -0.625F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            Thigh_r2 = new ZawaModelRenderer(this, 40, 35);
            Thigh_r2.setPos(2.05F, -12.6832F, 7.2441F);
            bb_main.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, -0.1745F, -0.0027F, -0.0304F);
            Thigh_r2.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 0, 0);
            cube_r20.setPos(-0.4601F, -14.0687F, 1.5525F);
            bb_main.addChild(cube_r20);
            setRotateAngle(cube_r20, 0.0F, 0.0075F, -0.0045F);
            cube_r20.addBox(-2.5F, -4.45F, -6.5F, 6.0F, 9.0F, 12.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 22, 22);
            cube_r21.setPos(-0.0437F, -16.2946F, -5.8654F);
            bb_main.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.1309F, 0.0F, 0.0F);
            cube_r21.addBox(-2.5F, -2.2809F, -2.4292F, 5.0F, 8.0F, 5.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 47, 55);
            cube_r22.setPos(0.5F, -21.2469F, -13.0754F);
            bb_main.addChild(cube_r22);
            setRotateAngle(cube_r22, 0.0305F, 0.0F, 0.0F);
            cube_r22.addBox(-2.5F, -0.0031F, -1.2246F, 4.0F, 5.0F, 4.0F, 0.0F, false);

            this.saveBase();
    }

    @Override
    public void setupAnim(TibetanAntelopeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    @Override
    public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
    }
}
    }
