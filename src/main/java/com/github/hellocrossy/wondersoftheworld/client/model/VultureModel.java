package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.VultureEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class VultureModel extends ZawaBaseModel<VultureEntity> {
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

    public static class Adult extends VultureModel {
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

            bb_main = new ZawaModelRenderer(this, 0, 0);
            bb_main.setPos(0.0F, 24.0F, 0.0F);


            cube_r1 = new ZawaModelRenderer(this, 33, 49);
            cube_r1.setPos(0.0F, -15.1701F, -3.6296F);
            bb_main.addChild(cube_r1);
            setRotateAngle(cube_r1, 2.0639F, 0.0F, 0.0F);
            cube_r1.addBox(-1.0F, -1.975F, 1.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 27, 49);
            cube_r2.setPos(0.5F, -14.0166F, -6.0008F);
            bb_main.addChild(cube_r2);
            setRotateAngle(cube_r2, 1.8631F, 0.0F, 0.0F);
            cube_r2.addBox(-1.5F, 1.35F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 54, 60);
            cube_r3.setPos(0.0F, -6.2651F, -5.3493F);
            bb_main.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.5454F, 0.0F, 0.0F);
            cube_r3.addBox(-1.0F, -0.025F, -1.25F, 2.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 0, 0);
            cube_r4.setPos(2.1F, 0.0F, -1.575F);
            bb_main.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
            cube_r4.texOffs(58, 26).addBox(-0.5F, -3.675F, 0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            cube_r4.texOffs(58, 34).addBox(-4.7F, -3.675F, 0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            cube_r4.texOffs(56, 21).addBox(-5.2F, -3.675F, 0.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            cube_r4.texOffs(56, 13).addBox(-1.0F, -3.675F, 0.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 16, 51);
            cube_r5.setPos(0.0F, -7.801F, 2.5759F);
            bb_main.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.144F, 0.0F, 0.0F);
            cube_r5.addBox(-2.0F, -4.8656F, -10.1768F, 4.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 0, 51);
            cube_r6.setPos(0.0F, -15.0166F, -10.2008F);
            bb_main.addChild(cube_r6);
            setRotateAngle(cube_r6, 2.5639F, 1.0108F, 0.7664F);
            cube_r6.addBox(-1.175F, -1.2528F, -0.7237F, 1.0F, 2.0F, 1.0F, 0.0F, true);

            cube_r7 = new ZawaModelRenderer(this, 0, 0);
            cube_r7.setPos(0.0F, -15.0166F, -10.2008F);
            bb_main.addChild(cube_r7);
            setRotateAngle(cube_r7, 1.9809F, 0.0F, 0.0F);
            cube_r7.texOffs(5, 4).addBox(-0.25F, -0.2278F, -0.8737F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            cube_r7.texOffs(5, 16).addBox(-0.75F, -0.2278F, -0.8737F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 0, 3);
            cube_r8.setPos(0.0F, -14.3416F, -10.2758F);
            bb_main.addChild(cube_r8);
            setRotateAngle(cube_r8, 0.1951F, -0.0474F, 0.2353F);
            cube_r8.addBox(-0.85F, 0.6725F, 0.0947F, 0.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 0, 15);
            cube_r9.setPos(0.0F, -14.3416F, -10.2758F);
            bb_main.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.1951F, 0.0474F, -0.2353F);
            cube_r9.addBox(0.85F, 0.6725F, 0.0947F, 0.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 23, 20);
            cube_r10.setPos(0.0F, -15.0166F, -10.2008F);
            bb_main.addChild(cube_r10);
            setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
            cube_r10.addBox(-0.5F, 0.9472F, 0.0513F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 5, 20);
            cube_r11.setPos(0.0F, -15.0166F, -10.2008F);
            bb_main.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.2923F, 0.0F, 0.0F);
            cube_r11.addBox(-0.5F, 0.0722F, -0.2987F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 0, 0);
            cube_r12.setPos(0.0F, -14.7666F, -6.1508F);
            bb_main.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.2007F, 0.0F, 0.0F);
            cube_r12.addBox(-1.0F, -1.125F, -4.225F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 0, 32);
            cube_r13.setPos(0.5F, -14.0166F, -6.0008F);
            bb_main.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.7374F, 0.0F, 0.0F);
            cube_r13.addBox(-1.5F, 0.7F, 0.725F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 28, 32);
            cube_r14.setPos(0.5F, -14.0166F, -6.0008F);
            bb_main.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.5367F, 0.0F, 0.0F);
            cube_r14.addBox(-1.5F, -0.225F, 1.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 32, 9);
            cube_r15.setPos(0.0F, -7.801F, 2.5759F);
            bb_main.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.2269F, 0.0F, 0.0F);
            cube_r15.addBox(-1.0F, -4.3156F, -10.5518F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 10, 32);
            cube_r16.setPos(0.0F, -14.7666F, -6.0008F);
            bb_main.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.1004F, 0.0F, 0.0F);
            cube_r16.addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 5.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 37, 0);
            cube_r17.setPos(0.25F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r17);
            setRotateAngle(cube_r17, 0.3185F, 0.0F, 0.0F);
            cube_r17.addBox(-2.75F, -6.4656F, -8.6768F, 5.0F, 4.0F, 4.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 13, 16);
            cube_r18.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.5948F, -0.1304F, 0.0878F);
            cube_r18.addBox(-0.5848F, -2.3284F, 3.7617F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 0, 32);
            cube_r19.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.5997F, -0.1773F, 0.12F);
            cube_r19.addBox(-0.7245F, -2.2284F, 3.6472F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 18, 32);
            cube_r20.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.6057F, -0.2205F, 0.1503F);
            cube_r20.addBox(-0.9076F, -2.1284F, 3.5253F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 28, 33);
            cube_r21.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.6057F, 0.2205F, -0.1503F);
            cube_r21.addBox(-0.0924F, -2.1284F, 3.5253F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 35, 9);
            cube_r22.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r22);
            setRotateAngle(cube_r22, -0.5997F, 0.1773F, -0.12F);
            cube_r22.addBox(-0.2755F, -2.2284F, 3.6472F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 36, 24);
            cube_r23.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r23);
            setRotateAngle(cube_r23, -0.5948F, 0.1304F, -0.0878F);
            cube_r23.addBox(-0.4152F, -2.3284F, 3.7617F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r24 = new ZawaModelRenderer(this, 23, 0);
            cube_r24.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r24);
            setRotateAngle(cube_r24, -0.589F, 0.0F, 0.0F);
            cube_r24.addBox(-1.5F, -2.4284F, 3.8081F, 3.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r25 = new ZawaModelRenderer(this, 0, 41);
            cube_r25.setPos(0.0F, -6.901F, 2.5759F);
            bb_main.addChild(cube_r25);
            setRotateAngle(cube_r25, -0.1469F, -0.1986F, 0.0292F);
            cube_r25.addBox(3.2598F, -1.9698F, -0.117F, 1.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r26 = new ZawaModelRenderer(this, 35, 18);
            cube_r26.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r26);
            setRotateAngle(cube_r26, -0.5541F, 0.0F, 0.0F);
            cube_r26.addBox(-2.0F, -2.466F, 1.9394F, 4.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r27 = new ZawaModelRenderer(this, 38, 33);
            cube_r27.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r27);
            setRotateAngle(cube_r27, -0.4756F, 0.0F, 0.0F);
            cube_r27.addBox(-2.5F, -2.5527F, 0.1771F, 5.0F, 5.0F, 2.0F, 0.0F, false);

            cube_r28 = new ZawaModelRenderer(this, 12, 41);
            cube_r28.setPos(0.0F, -6.901F, 2.5759F);
            bb_main.addChild(cube_r28);
            setRotateAngle(cube_r28, -0.1469F, 0.1986F, -0.0292F);
            cube_r28.addBox(-4.2598F, -1.9698F, -0.117F, 1.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r29 = new ZawaModelRenderer(this, 0, 0);
            cube_r29.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r29);
            setRotateAngle(cube_r29, -0.3098F, 0.0F, 0.0F);
            cube_r29.texOffs(0, 16).addBox(-4.5F, -3.0828F, -7.5284F, 2.0F, 7.0F, 9.0F, 0.0F, false);
            cube_r29.texOffs(22, 16).addBox(2.5F, -3.0828F, -7.5284F, 2.0F, 7.0F, 9.0F, 0.0F, false);

            cube_r30 = new ZawaModelRenderer(this, 0, 0);
            cube_r30.setPos(-0.25F, -5.0693F, -0.9874F);
            bb_main.addChild(cube_r30);
            setRotateAngle(cube_r30, 0.6109F, 0.0F, 0.0F);
            cube_r30.texOffs(24, 42).addBox(0.875F, -1.85F, -1.825F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            cube_r30.texOffs(36, 42).addBox(-3.375F, -1.85F, -1.825F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r31 = new ZawaModelRenderer(this, 0, 0);
            cube_r31.setPos(-2.1F, -0.7F, -1.7466F);
            bb_main.addChild(cube_r31);
            setRotateAngle(cube_r31, 0.1134F, 0.0F, 0.0F);
            cube_r31.texOffs(0, 4).addBox(-0.5F, -0.55F, -1.6034F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            cube_r31.texOffs(23, 16).addBox(3.7F, -0.55F, -1.6034F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r32 = new ZawaModelRenderer(this, 0, 16);
            cube_r32.setPos(-2.1F, -0.7F, -1.6216F);
            bb_main.addChild(cube_r32);
            setRotateAngle(cube_r32, 0.1191F, 0.3077F, 0.0362F);
            cube_r32.addBox(-0.8785F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r33 = new ZawaModelRenderer(this, 0, 0);
            cube_r33.setPos(-1.85F, -0.75F, -0.2F);
            bb_main.addChild(cube_r33);
            setRotateAngle(cube_r33, -0.2051F, 0.0F, 0.0F);
            cube_r33.texOffs(0, 35).addBox(-0.75F, -0.625F, -0.225F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r33.texOffs(28, 35).addBox(3.45F, -0.625F, -0.225F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r34 = new ZawaModelRenderer(this, 0, 0);
            cube_r34.setPos(-2.1F, 0.0F, -1.575F);
            bb_main.addChild(cube_r34);
            setRotateAngle(cube_r34, 0.1178F, 0.0F, 0.0F);
            cube_r34.texOffs(45, 8).addBox(-1.5F, -3.55F, 0.1F, 3.0F, 2.0F, 3.0F, 0.0F, false);
            cube_r34.texOffs(45, 40).addBox(2.7F, -3.55F, 0.1F, 3.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r35 = new ZawaModelRenderer(this, 0, 20);
            cube_r35.setPos(-2.1F, -0.7F, -1.6216F);
            bb_main.addChild(cube_r35);
            setRotateAngle(cube_r35, 0.1191F, -0.3077F, -0.0362F);
            cube_r35.addBox(-0.1215F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r36 = new ZawaModelRenderer(this, 13, 20);
            cube_r36.setPos(2.1F, -0.7F, -1.6216F);
            bb_main.addChild(cube_r36);
            setRotateAngle(cube_r36, 0.1191F, 0.3077F, 0.0362F);
            cube_r36.addBox(-0.8785F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r37 = new ZawaModelRenderer(this, 0, 0);
            cube_r37.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r37);
            setRotateAngle(cube_r37, -0.3883F, 0.0F, 0.0F);
            cube_r37.addBox(-3.5F, -2.8857F, -8.4878F, 7.0F, 7.0F, 9.0F, 0.0F, false);

            cube_r38 = new ZawaModelRenderer(this, 23, 4);
            cube_r38.setPos(2.1F, -0.7F, -1.6216F);
            bb_main.addChild(cube_r38);
            setRotateAngle(cube_r38, 0.1191F, -0.3077F, -0.0362F);
            cube_r38.addBox(-0.1215F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            this.saveBase();
        }

        @Override
        public void setupAnim(VultureEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

    public static class Flying extends VultureModel {
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

        public Flying() {
            texWidth = 64;
            texHeight = 64;

            bb_main = new ZawaModelRenderer(this, 0, 0);
            bb_main.setPos(0.0F, 24.0F, 0.0F);


            cube_r1 = new ZawaModelRenderer(this, 33, 49);
            cube_r1.setPos(0.0F, -15.1701F, -3.6296F);
            bb_main.addChild(cube_r1);
            setRotateAngle(cube_r1, 2.0639F, 0.0F, 0.0F);
            cube_r1.addBox(-1.0F, -1.975F, 1.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 27, 49);
            cube_r2.setPos(0.5F, -14.0166F, -6.0008F);
            bb_main.addChild(cube_r2);
            setRotateAngle(cube_r2, 1.8631F, 0.0F, 0.0F);
            cube_r2.addBox(-1.5F, 1.35F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 54, 60);
            cube_r3.setPos(0.0F, -6.2651F, -5.3493F);
            bb_main.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.5454F, 0.0F, 0.0F);
            cube_r3.addBox(-1.0F, -0.025F, -1.25F, 2.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 0, 0);
            cube_r4.setPos(2.1F, 0.0F, -1.575F);
            bb_main.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
            cube_r4.texOffs(58, 26).addBox(-0.5F, -3.675F, 0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            cube_r4.texOffs(58, 34).addBox(-4.7F, -3.675F, 0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            cube_r4.texOffs(56, 21).addBox(-5.2F, -3.675F, 0.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            cube_r4.texOffs(56, 13).addBox(-1.0F, -3.675F, 0.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 16, 51);
            cube_r5.setPos(0.0F, -7.801F, 2.5759F);
            bb_main.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.144F, 0.0F, 0.0F);
            cube_r5.addBox(-2.0F, -4.8656F, -10.1768F, 4.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 0, 51);
            cube_r6.setPos(0.0F, -15.0166F, -10.2008F);
            bb_main.addChild(cube_r6);
            setRotateAngle(cube_r6, 2.5639F, 1.0108F, 0.7664F);
            cube_r6.addBox(-1.175F, -1.2528F, -0.7237F, 1.0F, 2.0F, 1.0F, 0.0F, true);

            cube_r7 = new ZawaModelRenderer(this, 0, 0);
            cube_r7.setPos(0.0F, -15.0166F, -10.2008F);
            bb_main.addChild(cube_r7);
            setRotateAngle(cube_r7, 1.9809F, 0.0F, 0.0F);
            cube_r7.texOffs(5, 4).addBox(-0.25F, -0.2278F, -0.8737F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            cube_r7.texOffs(5, 16).addBox(-0.75F, -0.2278F, -0.8737F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 0, 3);
            cube_r8.setPos(0.0F, -14.3416F, -10.2758F);
            bb_main.addChild(cube_r8);
            setRotateAngle(cube_r8, 0.1951F, -0.0474F, 0.2353F);
            cube_r8.addBox(-0.85F, 0.6725F, 0.0947F, 0.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 0, 15);
            cube_r9.setPos(0.0F, -14.3416F, -10.2758F);
            bb_main.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.1951F, 0.0474F, -0.2353F);
            cube_r9.addBox(0.85F, 0.6725F, 0.0947F, 0.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 23, 20);
            cube_r10.setPos(0.0F, -15.0166F, -10.2008F);
            bb_main.addChild(cube_r10);
            setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
            cube_r10.addBox(-0.5F, 0.9472F, 0.0513F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 5, 20);
            cube_r11.setPos(0.0F, -15.0166F, -10.2008F);
            bb_main.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.2923F, 0.0F, 0.0F);
            cube_r11.addBox(-0.5F, 0.0722F, -0.2987F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 0, 0);
            cube_r12.setPos(0.0F, -14.7666F, -6.1508F);
            bb_main.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.2007F, 0.0F, 0.0F);
            cube_r12.addBox(-1.0F, -1.125F, -4.225F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 0, 32);
            cube_r13.setPos(0.5F, -14.0166F, -6.0008F);
            bb_main.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.7374F, 0.0F, 0.0F);
            cube_r13.addBox(-1.5F, 0.7F, 0.725F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 28, 32);
            cube_r14.setPos(0.5F, -14.0166F, -6.0008F);
            bb_main.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.5367F, 0.0F, 0.0F);
            cube_r14.addBox(-1.5F, -0.225F, 1.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 32, 9);
            cube_r15.setPos(0.0F, -7.801F, 2.5759F);
            bb_main.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.2269F, 0.0F, 0.0F);
            cube_r15.addBox(-1.0F, -4.3156F, -10.5518F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 10, 32);
            cube_r16.setPos(0.0F, -14.7666F, -6.0008F);
            bb_main.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.1004F, 0.0F, 0.0F);
            cube_r16.addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 5.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 37, 0);
            cube_r17.setPos(0.25F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r17);
            setRotateAngle(cube_r17, 0.3185F, 0.0F, 0.0F);
            cube_r17.addBox(-2.75F, -6.4656F, -8.6768F, 5.0F, 4.0F, 4.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 13, 16);
            cube_r18.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.5948F, -0.1304F, 0.0878F);
            cube_r18.addBox(-0.5848F, -2.3284F, 3.7617F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 0, 32);
            cube_r19.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.5997F, -0.1773F, 0.12F);
            cube_r19.addBox(-0.7245F, -2.2284F, 3.6472F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 18, 32);
            cube_r20.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.6057F, -0.2205F, 0.1503F);
            cube_r20.addBox(-0.9076F, -2.1284F, 3.5253F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 28, 33);
            cube_r21.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.6057F, 0.2205F, -0.1503F);
            cube_r21.addBox(-0.0924F, -2.1284F, 3.5253F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 35, 9);
            cube_r22.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r22);
            setRotateAngle(cube_r22, -0.5997F, 0.1773F, -0.12F);
            cube_r22.addBox(-0.2755F, -2.2284F, 3.6472F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 36, 24);
            cube_r23.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r23);
            setRotateAngle(cube_r23, -0.5948F, 0.1304F, -0.0878F);
            cube_r23.addBox(-0.4152F, -2.3284F, 3.7617F, 1.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r24 = new ZawaModelRenderer(this, 23, 0);
            cube_r24.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r24);
            setRotateAngle(cube_r24, -0.589F, 0.0F, 0.0F);
            cube_r24.addBox(-1.5F, -2.4284F, 3.8081F, 3.0F, 1.0F, 8.0F, 0.0F, false);

            cube_r25 = new ZawaModelRenderer(this, 0, 41);
            cube_r25.setPos(0.0F, -6.901F, 2.5759F);
            bb_main.addChild(cube_r25);
            setRotateAngle(cube_r25, -0.1469F, -0.1986F, 0.0292F);
            cube_r25.addBox(3.2598F, -1.9698F, -0.117F, 1.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r26 = new ZawaModelRenderer(this, 35, 18);
            cube_r26.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r26);
            setRotateAngle(cube_r26, -0.5541F, 0.0F, 0.0F);
            cube_r26.addBox(-2.0F, -2.466F, 1.9394F, 4.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r27 = new ZawaModelRenderer(this, 38, 33);
            cube_r27.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r27);
            setRotateAngle(cube_r27, -0.4756F, 0.0F, 0.0F);
            cube_r27.addBox(-2.5F, -2.5527F, 0.1771F, 5.0F, 5.0F, 2.0F, 0.0F, false);

            cube_r28 = new ZawaModelRenderer(this, 12, 41);
            cube_r28.setPos(0.0F, -6.901F, 2.5759F);
            bb_main.addChild(cube_r28);
            setRotateAngle(cube_r28, -0.1469F, 0.1986F, -0.0292F);
            cube_r28.addBox(-4.2598F, -1.9698F, -0.117F, 1.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r29 = new ZawaModelRenderer(this, 0, 0);
            cube_r29.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r29);
            setRotateAngle(cube_r29, -0.3098F, 0.0F, 0.0F);
            cube_r29.texOffs(0, 16).addBox(-4.5F, -3.0828F, -7.5284F, 2.0F, 7.0F, 9.0F, 0.0F, false);
            cube_r29.texOffs(22, 16).addBox(2.5F, -3.0828F, -7.5284F, 2.0F, 7.0F, 9.0F, 0.0F, false);

            cube_r30 = new ZawaModelRenderer(this, 0, 0);
            cube_r30.setPos(-0.25F, -5.0693F, -0.9874F);
            bb_main.addChild(cube_r30);
            setRotateAngle(cube_r30, 0.6109F, 0.0F, 0.0F);
            cube_r30.texOffs(24, 42).addBox(0.875F, -1.85F, -1.825F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            cube_r30.texOffs(36, 42).addBox(-3.375F, -1.85F, -1.825F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r31 = new ZawaModelRenderer(this, 0, 0);
            cube_r31.setPos(-2.1F, -0.7F, -1.7466F);
            bb_main.addChild(cube_r31);
            setRotateAngle(cube_r31, 0.1134F, 0.0F, 0.0F);
            cube_r31.texOffs(0, 4).addBox(-0.5F, -0.55F, -1.6034F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            cube_r31.texOffs(23, 16).addBox(3.7F, -0.55F, -1.6034F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r32 = new ZawaModelRenderer(this, 0, 16);
            cube_r32.setPos(-2.1F, -0.7F, -1.6216F);
            bb_main.addChild(cube_r32);
            setRotateAngle(cube_r32, 0.1191F, 0.3077F, 0.0362F);
            cube_r32.addBox(-0.8785F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r33 = new ZawaModelRenderer(this, 0, 0);
            cube_r33.setPos(-1.85F, -0.75F, -0.2F);
            bb_main.addChild(cube_r33);
            setRotateAngle(cube_r33, -0.2051F, 0.0F, 0.0F);
            cube_r33.texOffs(0, 35).addBox(-0.75F, -0.625F, -0.225F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r33.texOffs(28, 35).addBox(3.45F, -0.625F, -0.225F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r34 = new ZawaModelRenderer(this, 0, 0);
            cube_r34.setPos(-2.1F, 0.0F, -1.575F);
            bb_main.addChild(cube_r34);
            setRotateAngle(cube_r34, 0.1178F, 0.0F, 0.0F);
            cube_r34.texOffs(45, 8).addBox(-1.5F, -3.55F, 0.1F, 3.0F, 2.0F, 3.0F, 0.0F, false);
            cube_r34.texOffs(45, 40).addBox(2.7F, -3.55F, 0.1F, 3.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r35 = new ZawaModelRenderer(this, 0, 20);
            cube_r35.setPos(-2.1F, -0.7F, -1.6216F);
            bb_main.addChild(cube_r35);
            setRotateAngle(cube_r35, 0.1191F, -0.3077F, -0.0362F);
            cube_r35.addBox(-0.1215F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r36 = new ZawaModelRenderer(this, 13, 20);
            cube_r36.setPos(2.1F, -0.7F, -1.6216F);
            bb_main.addChild(cube_r36);
            setRotateAngle(cube_r36, 0.1191F, 0.3077F, 0.0362F);
            cube_r36.addBox(-0.8785F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r37 = new ZawaModelRenderer(this, 0, 0);
            cube_r37.setPos(0.0F, -7.051F, 2.5759F);
            bb_main.addChild(cube_r37);
            setRotateAngle(cube_r37, -0.3883F, 0.0F, 0.0F);
            cube_r37.addBox(-3.5F, -2.8857F, -8.4878F, 7.0F, 7.0F, 9.0F, 0.0F, false);

            cube_r38 = new ZawaModelRenderer(this, 23, 4);
            cube_r38.setPos(2.1F, -0.7F, -1.6216F);
            bb_main.addChild(cube_r38);
            setRotateAngle(cube_r38, 0.1191F, -0.3077F, -0.0362F);
            cube_r38.addBox(-0.1215F, -0.45F, -1.5376F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            this.saveBase();
        }

        @Override
        public void setupAnim(VultureEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

    public static class Child extends VultureModel {
        protected ZawaModelRenderer Head;
        protected ZawaModelRenderer cube_r1;
        protected ZawaModelRenderer cube_r2;
        protected ZawaModelRenderer cube_r3;
        protected ZawaModelRenderer Body;
        protected ZawaModelRenderer cube_r4;
        protected ZawaModelRenderer cube_r5;
        protected ZawaModelRenderer cube_r6;
        protected ZawaModelRenderer cube_r7;
        protected ZawaModelRenderer cube_r8;
        protected ZawaModelRenderer LeftLeg;
        protected ZawaModelRenderer cube_r9;
        protected ZawaModelRenderer cube_r10;
        protected ZawaModelRenderer cube_r11;
        protected ZawaModelRenderer cube_r12;
        protected ZawaModelRenderer cube_r13;
        protected ZawaModelRenderer cube_r14;
        protected ZawaModelRenderer RightLeg;
        protected ZawaModelRenderer cube_r15;
        protected ZawaModelRenderer cube_r16;
        protected ZawaModelRenderer cube_r17;
        protected ZawaModelRenderer cube_r18;
        protected ZawaModelRenderer cube_r19;
        protected ZawaModelRenderer cube_r20;

        public Child() {
            texWidth = 64;
            texHeight = 64;

            bb_main = new ZawaModelRenderer(this, 0, 0);
            bb_main.setPos(0.0F, 25.0F, 0.0F);


            Head = new ZawaModelRenderer(this, 0, 0);
            Head.setPos(0.0F, 0.0F, 0.0F);
            bb_main.addChild(Head);


            cube_r1 = new ZawaModelRenderer(this, 6, 20);
            cube_r1.setPos(0.0F, -8.9166F, -2.8758F);
            Head.addChild(cube_r1);
            setRotateAngle(cube_r1, -0.2923F, 0.0F, 0.0F);
            cube_r1.addBox(-0.5F, 0.0722F, -0.2987F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 20, 5);
            cube_r2.setPos(0.0F, -8.6666F, 1.1742F);
            Head.addChild(cube_r2);
            setRotateAngle(cube_r2, 0.2007F, 0.0F, 0.0F);
            cube_r2.addBox(-1.0F, -1.125F, -4.225F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 0, 8);
            cube_r3.setPos(-1.0F, -0.375F, 0.3F);
            Head.addChild(cube_r3);
            setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
            cube_r3.addBox(-0.55F, -9.55F, -2.25F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, 0.0F, 0.0F);
            bb_main.addChild(Body);


            cube_r4 = new ZawaModelRenderer(this, 0, 15);
            cube_r4.setPos(-0.0125F, -4.156F, 3.1221F);
            Body.addChild(cube_r4);
            setRotateAngle(cube_r4, -1.0516F, 0.0F, 0.0F);
            cube_r4.addBox(-1.4875F, -1.7845F, -1.1584F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 16, 15);
            cube_r5.setPos(1.5F, -5.251F, 8.3259F);
            Body.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.2269F, 0.0F, 0.0F);
            cube_r5.addBox(-2.0F, -0.3156F, -9.8268F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 12, 0);
            cube_r6.setPos(1.75F, -4.501F, 8.3259F);
            Body.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.3185F, 0.0F, 0.0F);
            cube_r6.addBox(-2.75F, -4.3906F, -9.0518F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 0, 0);
            cube_r7.setPos(-1.5F, -4.501F, 8.3259F);
            Body.addChild(cube_r7);
            setRotateAngle(cube_r7, -0.3883F, 0.0F, 0.0F);
            cube_r7.texOffs(8, 10).addBox(-0.75F, -0.0107F, -7.9878F, 1.0F, 3.0F, 4.0F, 0.0F, true);
            cube_r7.texOffs(8, 10).addBox(2.75F, -0.0107F, -7.9878F, 1.0F, 3.0F, 4.0F, 0.0F, false);
            cube_r7.texOffs(0, 0).addBox(-0.5F, 0.1143F, -8.4878F, 4.0F, 4.0F, 4.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 13, 5);
            cube_r8.setPos(-0.0125F, -4.156F, 3.1221F);
            Body.addChild(cube_r8);
            setRotateAngle(cube_r8, 3.0936F, 0.0F, 0.0F);
            cube_r8.addBox(-1.0125F, -1.7082F, -1.6138F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            LeftLeg = new ZawaModelRenderer(this, 0, 0);
            LeftLeg.setPos(0.0F, 0.0F, 0.0F);
            bb_main.addChild(LeftLeg);

            cube_r9 = new ZawaModelRenderer(this, 14, 19);
            cube_r9.setPos(1.325F, -1.7F, -0.6216F);
            LeftLeg.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.1191F, 0.3077F, 0.0362F);
            cube_r9.addBox(-0.8785F, -0.45F, -0.5376F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 0, 20);
            cube_r10.setPos(1.325F, -1.7F, -0.7466F);
            LeftLeg.addChild(cube_r10);
            setRotateAngle(cube_r10, 0.1134F, 0.0F, 0.0F);
            cube_r10.addBox(-0.5F, -0.55F, -0.6034F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 10, 17);
            cube_r11.setPos(0.775F, -1.75F, 0.8F);
            LeftLeg.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.2051F, 0.0F, 0.0F);
            cube_r11.addBox(-0.25F, -0.625F, -0.225F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 18, 2);
            cube_r12.setPos(1.325F, -1.7F, -0.6216F);
            LeftLeg.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.1191F, -0.3077F, -0.0362F);
            cube_r12.addBox(-0.1215F, -0.45F, -0.5376F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 0, 0);
            cube_r13.setPos(-0.7F, 0.0F, -1.75F);
            LeftLeg.addChild(cube_r13);
            setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
            cube_r13.addBox(1.5F, -4.25F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 14, 10);
            cube_r14.setPos(-0.7F, 0.0F, -1.75F);
            LeftLeg.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
            cube_r14.addBox(0.75F, -4.175F, 2.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            RightLeg = new ZawaModelRenderer(this, 0, 0);
            RightLeg.setPos(0.0F, 0.0F, 0.0F);
            bb_main.addChild(RightLeg);


            cube_r15 = new ZawaModelRenderer(this, 14, 19);
            cube_r15.setPos(-1.325F, -1.7F, -0.6216F);
            RightLeg.addChild(cube_r15);
            setRotateAngle(cube_r15, 0.1191F, -0.3077F, -0.0362F);
            cube_r15.addBox(-0.1215F, -0.45F, -0.5376F, 1.0F, 1.0F, 2.0F, 0.0F, true);

            cube_r16 = new ZawaModelRenderer(this, 0, 20);
            cube_r16.setPos(-1.325F, -1.7F, -0.7466F);
            RightLeg.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.1134F, 0.0F, 0.0F);
            cube_r16.addBox(-0.5F, -0.55F, -0.6034F, 1.0F, 1.0F, 2.0F, 0.0F, true);

            cube_r17 = new ZawaModelRenderer(this, 18, 2);
            cube_r17.setPos(-1.325F, -1.7F, -0.6216F);
            RightLeg.addChild(cube_r17);
            setRotateAngle(cube_r17, 0.1191F, 0.3077F, 0.0362F);
            cube_r17.addBox(-0.8785F, -0.45F, -0.5376F, 1.0F, 1.0F, 2.0F, 0.0F, true);

            cube_r18 = new ZawaModelRenderer(this, 10, 17);
            cube_r18.setPos(-0.775F, -1.75F, 0.8F);
            RightLeg.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.2051F, 0.0F, 0.0F);
            cube_r18.addBox(-0.75F, -0.625F, -0.225F, 1.0F, 1.0F, 2.0F, 0.0F, true);

            cube_r19 = new ZawaModelRenderer(this, 0, 0);
            cube_r19.setPos(0.7F, 0.0F, -1.75F);
            RightLeg.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.3054F, 0.0F, 0.0F);
            cube_r19.addBox(-2.5F, -4.25F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

            cube_r20 = new ZawaModelRenderer(this, 14, 10);
            cube_r20.setPos(0.7F, 0.0F, -1.75F);
            RightLeg.addChild(cube_r20);
            setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
            cube_r20.addBox(-2.75F, -4.175F, 2.5F, 2.0F, 2.0F, 2.0F, 0.0F, true);
            this.saveBase();
        }

        @Override
        public void setupAnim(VultureEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
