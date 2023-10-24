package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.VultureEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class VultureModel extends ZawaBaseModel<VultureEntity> {
    protected ZawaModelRenderer Body;
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
    protected ZawaModelRenderer cube_r13;
    protected ZawaModelRenderer cube_r14;
    protected ZawaModelRenderer cube_r15;
    protected ZawaModelRenderer cube_r16;
    protected ZawaModelRenderer cube_r17;
    protected ZawaModelRenderer cube_r18;
    protected ZawaModelRenderer cube_r19;
    protected ZawaModelRenderer cube_r20;
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
        protected ZawaModelRenderer cube_r21;
        protected ZawaModelRenderer cube_r22;
        protected ZawaModelRenderer cube_r23;
        protected ZawaModelRenderer cube_r24;
        protected ZawaModelRenderer cube_r25;
        protected ZawaModelRenderer cube_r26;
        protected ZawaModelRenderer cube_r27;
        protected ZawaModelRenderer cube_r28;
        protected ZawaModelRenderer cube_r29;
        protected ZawaModelRenderer cube_r30;
        protected ZawaModelRenderer cube_r31;
        protected ZawaModelRenderer cube_r32;
        protected ZawaModelRenderer cube_r33;
        protected ZawaModelRenderer cube_r34;
        protected ZawaModelRenderer cube_r35;
        protected ZawaModelRenderer cube_r36;
        protected ZawaModelRenderer cube_r37;
        protected ZawaModelRenderer cube_r38;

        public Adult() {
            texWidth = 64;
            texHeight = 64;

            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, 24.0F, 0.0F);


            cube_r1 = new ZawaModelRenderer(this, 33, 49);
            cube_r1.setPos(0.0F, -15.1701F, -3.6296F);
            Body.addChild(cube_r1);
            setRotateAngle(cube_r1, 2.0639F, 0.0F, 0.0F);
            cube_r1.addBox(-1.0F, -1.975F, 1.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 27, 49);
            cube_r2.setPos(0.5F, -14.0166F, -6.0008F);
            Body.addChild(cube_r2);
            setRotateAngle(cube_r2, 1.8631F, 0.0F, 0.0F);
            cube_r2.addBox(-1.5F, 1.35F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 54, 60);
            cube_r3.setPos(0.0F, -6.2651F, -5.3493F);
            Body.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.5454F, 0.0F, 0.0F);
            cube_r3.addBox(-1.0F, -0.025F, -1.25F, 2.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 0, 0);
            cube_r4.setPos(2.1F, 0.0F, -1.575F);
            Body.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
            cube_r4.texOffs(58, 26).addBox(-0.5F, -3.675F, 0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            cube_r4.texOffs(58, 34).addBox(-4.7F, -3.675F, 0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            cube_r4.texOffs(56, 21).addBox(-5.2F, -3.675F, 0.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            cube_r4.texOffs(56, 13).addBox(-1.0F, -3.675F, 0.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 16, 51);
            cube_r5.setPos(0.0F, -7.801F, 2.5759F);
            Body.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.144F, 0.0F, 0.0F);
            cube_r5.addBox(-2.0F, -4.8656F, -10.1768F, 4.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 0, 51);
            cube_r6.setPos(0.0F, -15.0166F, -10.2008F);
            Body.addChild(cube_r6);
            setRotateAngle(cube_r6, 2.5639F, 1.0108F, 0.7664F);
            cube_r6.addBox(-1.175F, -1.2528F, -0.7237F, 1.0F, 2.0F, 1.0F, 0.0F, true);

            cube_r7 = new ZawaModelRenderer(this, 0, 0);
            cube_r7.setPos(0.0F, -15.0166F, -10.2008F);
            Body.addChild(cube_r7);
            setRotateAngle(cube_r7, 1.9809F, 0.0F, 0.0F);
            cube_r7.texOffs(5, 4).addBox(-0.25F, -0.2278F, -0.8737F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            cube_r7.texOffs(5, 16).addBox(-0.75F, -0.2278F, -0.8737F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 0, 3);
            cube_r8.setPos(0.0F, -14.3416F, -10.2758F);
            Body.addChild(cube_r8);
            setRotateAngle(cube_r8, 0.1951F, -0.0474F, 0.2353F);
            cube_r8.addBox(-0.85F, 0.6725F, 0.0947F, 0.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 0, 15);
            cube_r9.setPos(0.0F, -14.3416F, -10.2758F);
            Body.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.1951F, 0.0474F, -0.2353F);
            cube_r9.addBox(0.85F, 0.6725F, 0.0947F, 0.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 23, 20);
            cube_r10.setPos(0.0F, -15.0166F, -10.2008F);
            Body.addChild(cube_r10);
            setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
            cube_r10.addBox(-0.5F, 0.9472F, 0.0513F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 5, 20);
            cube_r11.setPos(0.0F, -15.0166F, -10.2008F);
            Body.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.2923F, 0.0F, 0.0F);
            cube_r11.addBox(-0.5F, 0.0722F, -0.2987F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 0, 0);
            cube_r12.setPos(0.0F, -14.7666F, -6.1508F);
            Body.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.2007F, 0.0F, 0.0F);
            cube_r12.addBox(-1.0F, -1.125F, -4.225F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 0, 32);
            cube_r13.setPos(0.5F, -14.0166F, -6.0008F);
            Body.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.7374F, 0.0F, 0.0F);
            cube_r13.addBox(-1.5F, 0.7F, 0.725F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 28, 32);
            cube_r14.setPos(0.5F, -14.0166F, -6.0008F);
            Body.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.5367F, 0.0F, 0.0F);
            cube_r14.addBox(-1.5F, -0.225F, 1.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 32, 9);
            cube_r15.setPos(0.0F, -7.801F, 2.5759F);
            Body.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.2269F, 0.0F, 0.0F);
            cube_r15.addBox(-1.0F, -4.3156F, -10.5518F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 10, 32);
            cube_r16.setPos(0.0F, -14.7666F, -6.0008F);
            Body.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.1004F, 0.0F, 0.0F);
            cube_r16.addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 5.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 37, 0);
            cube_r17.setPos(0.25F, -7.051F, 2.5759F);
            Body.addChild(cube_r17);
            setRotateAngle(cube_r17, 0.3185F, 0.0F, 0.0F);
            cube_r17.addBox(-2.75F, -6.4656F, -8.6768F, 5.0F, 4.0F, 4.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 13, 16);
            cube_r18.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.5948F, -0.1304F, 0.0878F);
            cube_r18.addBox(-0.5848F, -2.3284F, 3.7617F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 0, 32);
            cube_r19.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.5997F, -0.1773F, 0.12F);
            cube_r19.addBox(-0.7245F, -2.2284F, 3.6472F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 18, 32);
            cube_r20.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.6057F, -0.2205F, 0.1503F);
            cube_r20.addBox(-0.9076F, -2.1284F, 3.5253F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 28, 33);
            cube_r21.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.6057F, 0.2205F, -0.1503F);
            cube_r21.addBox(-0.0924F, -2.1284F, 3.5253F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 35, 9);
            cube_r22.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r22);
            setRotateAngle(cube_r22, -0.5997F, 0.1773F, -0.12F);
            cube_r22.addBox(-0.2755F, -2.2284F, 3.6472F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 36, 24);
            cube_r23.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r23);
            setRotateAngle(cube_r23, -0.5948F, 0.1304F, -0.0878F);
            cube_r23.addBox(-0.4152F, -2.3284F, 3.7617F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r24 = new ZawaModelRenderer(this, 23, 0);
            cube_r24.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r24);
            setRotateAngle(cube_r24, -0.589F, 0.0F, 0.0F);
            cube_r24.addBox(-1.5F, -2.4284F, 3.8081F, 3.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r25 = new ZawaModelRenderer(this, 0, 41);
            cube_r25.setPos(0.0F, -6.901F, 2.5759F);
            Body.addChild(cube_r25);
            setRotateAngle(cube_r25, -0.1469F, -0.1986F, 0.0292F);
            cube_r25.addBox(3.2598F, -1.9698F, -0.117F, 1.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r26 = new ZawaModelRenderer(this, 35, 18);
            cube_r26.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r26);
            setRotateAngle(cube_r26, -0.5541F, 0.0F, 0.0F);
            cube_r26.addBox(-2.0F, -2.466F, 1.9394F, 4.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r27 = new ZawaModelRenderer(this, 38, 33);
            cube_r27.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r27);
            setRotateAngle(cube_r27, -0.4756F, 0.0F, 0.0F);
            cube_r27.addBox(-2.5F, -2.5527F, 0.1771F, 5.0F, 5.0F, 2.0F, 0.0F, false);

            cube_r28 = new ZawaModelRenderer(this, 12, 41);
            cube_r28.setPos(0.0F, -6.901F, 2.5759F);
            Body.addChild(cube_r28);
            setRotateAngle(cube_r28, -0.1469F, 0.1986F, -0.0292F);
            cube_r28.addBox(-4.2598F, -1.9698F, -0.117F, 1.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r29 = new ZawaModelRenderer(this, 0, 0);
            cube_r29.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r29);
            setRotateAngle(cube_r29, -0.3098F, 0.0F, 0.0F);
            cube_r29.texOffs(0, 16).addBox(-4.5F, -3.0828F, -7.5284F, 2.0F, 7.0F, 9.0F, 0.0F, false);
            cube_r29.texOffs(22, 16).addBox(2.5F, -3.0828F, -7.5284F, 2.0F, 7.0F, 9.0F, 0.0F, false);

            cube_r30 = new ZawaModelRenderer(this, 0, 0);
            cube_r30.setPos(-0.25F, -5.0693F, -0.9874F);
            Body.addChild(cube_r30);
            setRotateAngle(cube_r30, 0.6109F, 0.0F, 0.0F);
            cube_r30.texOffs(24, 42).addBox(0.875F, -1.85F, -1.825F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            cube_r30.texOffs(36, 42).addBox(-3.375F, -1.85F, -1.825F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r31 = new ZawaModelRenderer(this, 0, 0);
            cube_r31.setPos(-2.1F, -0.7F, -1.7466F);
            Body.addChild(cube_r31);
            setRotateAngle(cube_r31, 0.1134F, 0.0F, 0.0F);
            cube_r31.texOffs(0, 4).addBox(-0.5F, -0.55F, -1.6034F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            cube_r31.texOffs(23, 16).addBox(3.7F, -0.55F, -1.6034F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r32 = new ZawaModelRenderer(this, 0, 16);
            cube_r32.setPos(-2.1F, -0.7F, -1.6216F);
            Body.addChild(cube_r32);
            setRotateAngle(cube_r32, 0.1191F, 0.3077F, 0.0362F);
            cube_r32.addBox(-0.8785F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r33 = new ZawaModelRenderer(this, 0, 0);
            cube_r33.setPos(-1.85F, -0.75F, -0.2F);
            Body.addChild(cube_r33);
            setRotateAngle(cube_r33, -0.2051F, 0.0F, 0.0F);
            cube_r33.texOffs(0, 35).addBox(-0.75F, -0.625F, -0.225F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r33.texOffs(28, 35).addBox(3.45F, -0.625F, -0.225F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r34 = new ZawaModelRenderer(this, 0, 0);
            cube_r34.setPos(-2.1F, 0.0F, -1.575F);
            Body.addChild(cube_r34);
            setRotateAngle(cube_r34, 0.1178F, 0.0F, 0.0F);
            cube_r34.texOffs(45, 8).addBox(-1.5F, -3.55F, 0.1F, 3.0F, 2.0F, 3.0F, 0.0F, false);
            cube_r34.texOffs(45, 40).addBox(2.7F, -3.55F, 0.1F, 3.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r35 = new ZawaModelRenderer(this, 0, 20);
            cube_r35.setPos(-2.1F, -0.7F, -1.6216F);
            Body.addChild(cube_r35);
            setRotateAngle(cube_r35, 0.1191F, -0.3077F, -0.0362F);
            cube_r35.addBox(-0.1215F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r36 = new ZawaModelRenderer(this, 13, 20);
            cube_r36.setPos(2.1F, -0.7F, -1.6216F);
            Body.addChild(cube_r36);
            setRotateAngle(cube_r36, 0.1191F, 0.3077F, 0.0362F);
            cube_r36.addBox(-0.8785F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r37 = new ZawaModelRenderer(this, 0, 0);
            cube_r37.setPos(0.0F, -7.051F, 2.5759F);
            Body.addChild(cube_r37);
            setRotateAngle(cube_r37, -0.3883F, 0.0F, 0.0F);
            cube_r37.addBox(-3.5F, -2.8857F, -8.4878F, 7.0F, 7.0F, 9.0F, 0.0F, false);

            cube_r38 = new ZawaModelRenderer(this, 23, 4);
            cube_r38.setPos(2.1F, -0.7F, -1.6216F);
            Body.addChild(cube_r38);
            setRotateAngle(cube_r38, 0.1191F, -0.3077F, -0.0362F);
            cube_r38.addBox(-0.1215F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);
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
        protected ZawaModelRenderer Head;
        protected ZawaModelRenderer Body;
        protected ZawaModelRenderer cube_r21;
        protected ZawaModelRenderer cube_r22;
        protected ZawaModelRenderer cube_r23;
        protected ZawaModelRenderer cube_r24;
        protected ZawaModelRenderer cube_r25;
        protected ZawaModelRenderer cube_r26;
        protected ZawaModelRenderer Leg1;
        protected ZawaModelRenderer cube_r27;
        protected ZawaModelRenderer cube_r28;
        protected ZawaModelRenderer cube_r29;
        protected ZawaModelRenderer cube_r30;
        protected ZawaModelRenderer cube_r31;
        protected ZawaModelRenderer cube_r32;
        protected ZawaModelRenderer cube_r33;
        protected ZawaModelRenderer Leg2;
        protected ZawaModelRenderer cube_r34;
        protected ZawaModelRenderer cube_r35;
        protected ZawaModelRenderer cube_r36;
        protected ZawaModelRenderer cube_r37;
        protected ZawaModelRenderer cube_r38;
        protected ZawaModelRenderer cube_r39;
        protected ZawaModelRenderer cube_r40;
        protected ZawaModelRenderer Wing1;
        protected ZawaModelRenderer cube_r41;
        protected ZawaModelRenderer cube_r42;
        protected ZawaModelRenderer cube_r43;
        protected ZawaModelRenderer cube_r44;
        protected ZawaModelRenderer cube_r45;
        protected ZawaModelRenderer cube_r46;
        protected ZawaModelRenderer cube_r47;
        protected ZawaModelRenderer cube_r48;
        protected ZawaModelRenderer cube_r49;
        protected ZawaModelRenderer cube_r50;
        protected ZawaModelRenderer Wing2;
        protected ZawaModelRenderer cube_r51;
        protected ZawaModelRenderer cube_r52;
        protected ZawaModelRenderer cube_r53;
        protected ZawaModelRenderer cube_r54;
        protected ZawaModelRenderer cube_r55;
        protected ZawaModelRenderer cube_r56;
        protected ZawaModelRenderer cube_r57;
        protected ZawaModelRenderer cube_r58;
        protected ZawaModelRenderer cube_r59;
        protected ZawaModelRenderer cube_r60;

        public Flying() {
            texWidth = 64;
            texHeight = 64;

            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, 24.0F, 0.0F);


            Head = new ZawaModelRenderer(this, 0, 0);
            Head.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(Head);


            cube_r1 = new ZawaModelRenderer(this, 10, 32);
            cube_r1.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.1789F, 0.0F, 0.0F);
            cube_r1.addBox(-1.5F, -1.5925F, -1.7004F, 3.0F, 3.0F, 5.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 0, 0);
            cube_r2.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r2);
            setRotateAngle(cube_r2, 0.2793F, 0.0F, 0.0F);
            cube_r2.addBox(-1.0F, -1.1668F, -3.5672F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 0, 15);
            cube_r3.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r3);
            setRotateAngle(cube_r3, 0.2716F, 0.0656F, -0.231F);
            cube_r3.addBox(0.9564F, 0.2376F, -3.3744F, 0.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 0, 3);
            cube_r4.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r4);
            setRotateAngle(cube_r4, 0.2716F, -0.0656F, 0.231F);
            cube_r4.addBox(-0.9564F, 0.2376F, -3.3744F, 0.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 5, 20);
            cube_r5.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.2138F, 0.0F, 0.0F);
            cube_r5.addBox(-0.5F, 0.6518F, -3.6892F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 23, 20);
            cube_r6.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.1222F, 0.0F, 0.0F);
            cube_r6.addBox(-0.5F, 0.3766F, -3.3407F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 0, 0);
            cube_r7.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r7);
            setRotateAngle(cube_r7, 2.0595F, 0.0F, 0.0F);
            cube_r7.texOffs(5, 16).addBox(-0.75F, -3.19F, 0.8746F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            cube_r7.texOffs(5, 4).addBox(-0.25F, -3.19F, 0.8746F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 0, 51);
            cube_r8.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r8);
            setRotateAngle(cube_r8, 2.6617F, 0.954F, 0.8478F);
            cube_r8.addBox(1.5618F, -2.1238F, 1.1692F, 1.0F, 2.0F, 1.0F, 0.0F, true);

            cube_r9 = new ZawaModelRenderer(this, 28, 32);
            cube_r9.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.6152F, 0.0F, 0.0F);
            cube_r9.addBox(-1.0F, 0.6736F, 2.2303F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 27, 49);
            cube_r10.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r10);
            setRotateAngle(cube_r10, 1.9417F, 0.0F, 0.0F);
            cube_r10.addBox(-1.0F, 1.9364F, 0.22F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 33, 49);
            cube_r11.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r11);
            setRotateAngle(cube_r11, 2.1424F, 0.0F, 0.0F);
            cube_r11.addBox(-1.0F, 1.0788F, 0.2625F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 0, 32);
            cube_r12.setPos(0.0F, -11.5888F, -8.9518F);
            Head.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.8159F, 0.0F, 0.0F);
            cube_r12.addBox(-1.0F, 1.6564F, 0.9185F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(Body);


            cube_r13 = new ZawaModelRenderer(this, 0, 0);
            cube_r13.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.0044F, 0.0F, 0.0F);
            cube_r13.addBox(-3.5F, -2.5955F, -5.49F, 7.0F, 7.0F, 9.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 37, 0);
            cube_r14.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.7112F, 0.0F, 0.0F);
            cube_r14.addBox(-2.5F, -4.298F, -6.5857F, 5.0F, 4.0F, 4.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 32, 9);
            cube_r15.setPos(0.0F, -11.0297F, 1.4612F);
            Body.addChild(cube_r15);
            setRotateAngle(cube_r15, 0.4189F, 0.0F, 0.0F);
            cube_r15.addBox(-1.0F, -4.2781F, -9.5583F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 16, 51);
            cube_r16.setPos(0.0F, -10.2547F, -0.0888F);
            Body.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.5018F, 0.0F, 0.0F);
            cube_r16.addBox(-2.0F, -4.601F, -7.4458F, 4.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 38, 33);
            cube_r17.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r17);
            setRotateAngle(cube_r17, -0.0829F, 0.0F, 0.0F);
            cube_r17.addBox(-2.5F, -2.5248F, 3.1888F, 5.0F, 5.0F, 2.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 35, 18);
            cube_r18.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.1614F, 0.0F, 0.0F);
            cube_r18.addBox(-2.0F, -2.6745F, 4.944F, 4.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 23, 0);
            cube_r19.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.1963F, 0.0F, 0.0F);
            cube_r19.addBox(-1.5F, -2.7417F, 6.8037F, 3.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 36, 24);
            cube_r20.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.1987F, 0.154F, -0.0309F);
            cube_r20.addBox(-0.8838F, -2.6417F, 6.7203F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 35, 9);
            cube_r21.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.2008F, 0.2096F, -0.0423F);
            cube_r21.addBox(-0.9111F, -2.5417F, 6.5746F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 28, 33);
            cube_r22.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r22);
            setRotateAngle(cube_r22, -0.2033F, 0.2609F, -0.0531F);
            cube_r22.addBox(-0.8803F, -2.4417F, 6.4153F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 13, 16);
            cube_r23.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r23);
            setRotateAngle(cube_r23, -0.1987F, -0.154F, 0.0309F);
            cube_r23.addBox(-0.1162F, -2.6417F, 6.7203F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r24 = new ZawaModelRenderer(this, 0, 32);
            cube_r24.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r24);
            setRotateAngle(cube_r24, -0.2008F, -0.2096F, 0.0423F);
            cube_r24.addBox(-0.0889F, -2.5417F, 6.5746F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r25 = new ZawaModelRenderer(this, 18, 32);
            cube_r25.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r25);
            setRotateAngle(cube_r25, -0.2033F, -0.2609F, 0.0531F);
            cube_r25.addBox(-0.1197F, -2.4417F, 6.4153F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r26 = new ZawaModelRenderer(this, 54, 60);
            cube_r26.setPos(0.0F, -8.7047F, -0.0888F);
            Body.addChild(cube_r26);
            setRotateAngle(cube_r26, -0.1527F, 0.0F, 0.0F);
            cube_r26.addBox(-1.0F, 4.576F, -4.6114F, 2.0F, 1.0F, 3.0F, 0.0F, false);

            Leg1 = new ZawaModelRenderer(this, 0, 0);
            Leg1.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(Leg1);

            cube_r27 = new ZawaModelRenderer(this, 23, 16);
            cube_r27.setPos(0.0F, -6.014F, -0.0383F);
            Leg1.addChild(cube_r27);
            setRotateAngle(cube_r27, 1.2217F, 0.0F, 0.0F);
            cube_r27.addBox(1.6F, 5.9356F, -1.4706F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r28 = new ZawaModelRenderer(this, 28, 35);
            cube_r28.setPos(0.0F, -6.014F, -0.0383F);
            Leg1.addChild(cube_r28);
            setRotateAngle(cube_r28, 0.9032F, 0.0F, 0.0F);
            cube_r28.addBox(1.6F, 5.1289F, 3.4362F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r29 = new ZawaModelRenderer(this,23, 4);
            cube_r29.setPos(0.0F, -6.014F, -0.0383F);
            Leg1.addChild(cube_r29);
            setRotateAngle(cube_r29, 1.2371F, -0.1045F, -0.2922F);
            cube_r29.addBox(1.9569F, 6.0498F, -1.9331F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r30 = new ZawaModelRenderer(this, 13, 20);
            cube_r30.setPos(0.0F, -6.014F, -0.0383F);
            Leg1.addChild(cube_r30);
            setRotateAngle(cube_r30, 1.2371F, 0.1045F, 0.2922F);
            cube_r30.addBox(1.0432F, 6.0498F, -0.6527F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r31 = new ZawaModelRenderer(this, 0, 0);
            cube_r31.setPos(0.0F, -6.014F, -0.0383F);
            Leg1.addChild(cube_r31);
            setRotateAngle(cube_r31, 1.0036F, 0.0F, 0.0F);
            cube_r31.texOffs(56, 13).addBox(1.1F, 3.3064F, 2.0272F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            cube_r31.texOffs(58, 26).addBox(1.6F, 3.3064F, 2.5272F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r32 = new ZawaModelRenderer(this, 45, 40);
            cube_r32.setPos(0.0F, -6.014F, -0.0383F);
            Leg1.addChild(cube_r32);
            setRotateAngle(cube_r32, 1.2261F, 0.0F, 0.0F);
            cube_r32.addBox(0.6F, 3.6515F, 0.2926F, 3.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r33 = new ZawaModelRenderer(this, 24, 42);
            cube_r33.setPos(0.0F, -6.014F, -0.0383F);
            Leg1.addChild(cube_r33);
            setRotateAngle(cube_r33, 1.7191F, 0.0F, 0.0F);
            cube_r33.addBox(0.625F, 0.7694F, -1.6749F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            Leg2 = new ZawaModelRenderer(this, 0, 0);
            Leg2.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(Leg2);


            cube_r34 = new ZawaModelRenderer(this, 0, 4);
            cube_r34.setPos(0.0F, -6.014F, -0.0383F);
            Leg2.addChild(cube_r34);
            setRotateAngle(cube_r34, 1.2217F, 0.0F, 0.0F);
            cube_r34.addBox(-2.6F, 5.9356F, -1.4706F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r35 = new ZawaModelRenderer(this, 0, 16);
            cube_r35.setPos(0.0F, -6.014F, -0.0383F);
            Leg2.addChild(cube_r35);
            setRotateAngle(cube_r35, 1.2371F, 0.1045F, 0.2922F);
            cube_r35.addBox(-2.9569F, 6.0498F, -1.9331F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r36 = new ZawaModelRenderer(this, 0, 35);
            cube_r36.setPos(0.0F, -6.014F, -0.0383F);
            Leg2.addChild(cube_r36);
            setRotateAngle(cube_r36, 0.9032F, 0.0F, 0.0F);
            cube_r36.addBox(-2.6F, 5.1289F, 3.4362F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r37 = new ZawaModelRenderer(this, 0,0);
            cube_r37.setPos(0.0F, -6.014F, -0.0383F);
            Leg2.addChild(cube_r37);
            setRotateAngle(cube_r37, 1.0036F, 0.0F, 0.0F);
            cube_r37.texOffs(56, 21).addBox(-3.1F, 3.3064F, 2.0272F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            cube_r37.texOffs(58, 34).addBox(-2.6F, 3.3064F, 2.5272F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r38 = new ZawaModelRenderer(this, 45, 8);
            cube_r38.setPos(0.0F, -6.014F, -0.0383F);
            Leg2.addChild(cube_r38);
            setRotateAngle(cube_r38, 1.2261F, 0.0F, 0.0F);
            cube_r38.addBox(-3.6F, 3.6515F, 0.2926F, 3.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r39 = new ZawaModelRenderer(this, 36, 42);
            cube_r39.setPos(0.0F, -6.014F, -0.0383F);
            Leg2.addChild(cube_r39);
            setRotateAngle(cube_r39, 1.7191F, 0.0F, 0.0F);
            cube_r39.addBox(-3.625F, 0.7694F, -1.6749F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r40 = new ZawaModelRenderer(this, 0, 20);
            cube_r40.setPos(0.0F, -6.014F, -0.0383F);
            Leg2.addChild(cube_r40);
            setRotateAngle(cube_r40, 1.2371F, -0.1045F, -0.2922F);
            cube_r40.addBox(-2.0432F, 6.0498F, -0.6527F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            Wing1 = new ZawaModelRenderer(this, 0, 0);
            Wing1.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(Wing1);

            cube_r41 = new ZawaModelRenderer(this, 25, 19);
            cube_r41.setPos(13.6305F, -8.6426F, -0.7223F);
            Wing1.addChild(cube_r41);
            setRotateAngle(cube_r41, -1.4879F, 0.0F, -1.5708F);
            cube_r41.addBox(-0.8995F, -3.9738F, -10.5881F, 2.0F, 7.0F, 6.0F, 0.0F, false);

            cube_r42 = new ZawaModelRenderer(this, 26, 20);
            cube_r42.setPos(13.4805F, -8.6426F, -0.8473F);
            Wing1.addChild(cube_r42);
            setRotateAngle(cube_r42, -1.6581F, 0.0F, -1.5708F);
            cube_r42.addBox(-0.8495F, -3.2764F, -5.0754F, 2.0F, 7.0F, 5.0F, 0.0F, false);

            cube_r43 = new ZawaModelRenderer(this, 25, 19);
            cube_r43.setPos(13.4805F, -8.6426F, -0.8473F);
            Wing1.addChild(cube_r43);
            setRotateAngle(cube_r43, -1.453F, 0.0F, -1.5708F);
            cube_r43.addBox(-0.8245F, -3.3464F, -0.852F, 2.0F, 7.0F, 6.0F, 0.0F, false);

            cube_r44 = new ZawaModelRenderer(this, -1, 40);
            cube_r44.setPos(18.4854F, -8.8921F, -2.6326F);
            Wing1.addChild(cube_r44);
            setRotateAngle(cube_r44, -1.316F, 0.0F, -1.5708F);
            cube_r44.addBox(-0.575F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, false);

            cube_r45 = new ZawaModelRenderer(this, -1, 40);
            cube_r45.setPos(18.4854F, -8.8921F, -2.6326F);
            Wing1.addChild(cube_r45);
            setRotateAngle(cube_r45, -1.0847F, 0.0F, -1.5708F);
            cube_r45.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, false);

            cube_r46 = new ZawaModelRenderer(this, -1, 40);
            cube_r46.setPos(18.4854F, -9.0171F, -2.6326F);
            Wing1.addChild(cube_r46);
            setRotateAngle(cube_r46, -0.8447F, 0.0F, -1.5708F);
            cube_r46.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, false);

            cube_r47 = new ZawaModelRenderer(this, -1, 40);
            cube_r47.setPos(18.4854F, -9.0671F, -2.6326F);
            Wing1.addChild(cube_r47);
            setRotateAngle(cube_r47, -0.644F, 0.0F, -1.5708F);
            cube_r47.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, false);

            cube_r48 = new ZawaModelRenderer(this, -1, 40);
            cube_r48.setPos(18.4854F, -9.1421F, -2.6326F);
            Wing1.addChild(cube_r48);
            setRotateAngle(cube_r48, -0.4171F, 0.0F, -1.5708F);
            cube_r48.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, false);

            cube_r49 = new ZawaModelRenderer(this, -1, 40);
            cube_r49.setPos(18.4854F, -9.1671F, -2.6326F);
            Wing1.addChild(cube_r49);
            setRotateAngle(cube_r49, -0.2033F, 0.0F, -1.5708F);
            cube_r49.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, false);

            cube_r50 = new ZawaModelRenderer(this, -1, 40);
            cube_r50.setPos(18.4854F, -9.2171F, -2.6326F);
            Wing1.addChild(cube_r50);
            setRotateAngle(cube_r50, 0.0279F, 0.0F, -1.5708F);
            cube_r50.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, false);

            Wing2 = new ZawaModelRenderer(this, 0, 0);
            Wing2.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(Wing2);

            cube_r51 = new ZawaModelRenderer(this, 25, 19);
            cube_r51.setPos(-13.6305F, -8.6426F, -0.7223F);
            Wing2.addChild(cube_r51);
            setRotateAngle(cube_r51, -1.4879F, 0.0F, 1.5708F);
            cube_r51.addBox(-1.1005F, -3.9738F, -10.5881F, 2.0F, 7.0F, 6.0F, 0.0F, true);

            cube_r52 = new ZawaModelRenderer(this, -1, 40);
            cube_r52.setPos(-18.4854F, -8.8921F, -2.6326F);
            Wing2.addChild(cube_r52);
            setRotateAngle(cube_r52, -1.316F, 0.0F, 1.5708F);
            cube_r52.addBox(-0.425F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, true);

            cube_r53 = new ZawaModelRenderer(this, 26, 20);
            cube_r53.setPos(-13.4805F, -8.6426F, -0.8473F);
            Wing2.addChild(cube_r53);
            setRotateAngle(cube_r53, -1.6581F, 0.0F, 1.5708F);
            cube_r53.addBox(-1.1505F, -3.2764F, -5.0754F, 2.0F, 7.0F, 5.0F, 0.0F, true);

            cube_r54 = new ZawaModelRenderer(this, 25, 19);
            cube_r54.setPos(-13.4805F, -8.6426F, -0.8473F);
            Wing2.addChild(cube_r54);
            setRotateAngle(cube_r54, -1.453F, 0.0F, 1.5708F);
            cube_r54.addBox(-1.1755F, -3.3464F, -0.852F, 2.0F, 7.0F, 6.0F, 0.0F, true);

            cube_r55 = new ZawaModelRenderer(this, -1, 40);
            cube_r55.setPos(-18.4854F, -8.8921F, -2.6326F);
            Wing2.addChild(cube_r55);
            setRotateAngle(cube_r55, -1.0847F, 0.0F, 1.5708F);
            cube_r55.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, true);

            cube_r56 = new ZawaModelRenderer(this, -1, 40);
            cube_r56.setPos(-18.4854F, -9.0171F, -2.6326F);
            Wing2.addChild(cube_r56);
            setRotateAngle(cube_r56, -0.8447F, 0.0F, 1.5708F);
            cube_r56.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, true);

            cube_r57 = new ZawaModelRenderer(this, -1, 40);
            cube_r57.setPos(-18.4854F, -9.0671F, -2.6326F);
            Wing2.addChild(cube_r57);
            setRotateAngle(cube_r57, -0.644F, 0.0F, 1.5708F);
            cube_r57.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, true);

            cube_r58 = new ZawaModelRenderer(this, -1, 40);
            cube_r58.setPos(-18.4854F, -9.1421F, -2.6326F);
            Wing2.addChild(cube_r58);
            setRotateAngle(cube_r58, -0.4171F, 0.0F, 1.5708F);
            cube_r58.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, true);

            cube_r59 = new ZawaModelRenderer(this, -1, 40);
            cube_r59.setPos(-18.4854F, -9.1671F, -2.6326F);
            Wing2.addChild(cube_r59);
            setRotateAngle(cube_r59, -0.2033F, 0.0F, 1.5708F);
            cube_r59.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, true);

            cube_r60 = new ZawaModelRenderer(this, -1, 40);
            cube_r60.setPos(-18.4854F, -9.2171F, -2.6326F);
            Wing2.addChild(cube_r60);
            setRotateAngle(cube_r60, 0.0279F, 0.0F, 1.5708F);
            cube_r60.addBox(-0.5F, 0.1302F, -0.0807F, 1.0F, 1.0F, 6.0F, 0.0F, true);
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
        protected ModelRenderer Body;
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
