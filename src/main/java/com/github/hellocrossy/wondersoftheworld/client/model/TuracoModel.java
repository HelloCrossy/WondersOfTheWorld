package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TuracoEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class TuracoModel extends ZawaBaseModel<TuracoEntity> {
    protected ZawaModelRenderer MAIN;
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
    protected ZawaModelRenderer Leg1;
    protected ZawaModelRenderer cube_r9;
    protected ZawaModelRenderer cube_r10;
    protected ZawaModelRenderer cube_r11;
    protected ZawaModelRenderer cube_r12;
    protected ZawaModelRenderer cube_r13;
    protected ZawaModelRenderer cube_r14;
    protected ZawaModelRenderer Leg2;
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
            this.parts = ImmutableList.of(MAIN);
        }

        return this.parts;
    }

    public static class Adult extends TuracoModel {
        
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
        protected ZawaModelRenderer cube_r39;
        protected ZawaModelRenderer cube_r40;
        protected ZawaModelRenderer cube_r41;
        protected ZawaModelRenderer cube_r42;
        protected ZawaModelRenderer cube_r43;
        protected ZawaModelRenderer cube_r44;
        protected ZawaModelRenderer cube_r45;
        protected ZawaModelRenderer cube_r46;
        protected ZawaModelRenderer cube_r47;

        public Adult() {
            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 24.0F, 0.0F);


            Head = new ZawaModelRenderer(this, 6, 50);
            Head.setPos(0.0F, -8.794F, -9.2594F);
            MAIN.addChild(Head);
            Head.addBox(-0.5F, -4.8863F, 2.0214F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r1 = new ZawaModelRenderer(this, 9, 22);
            cube_r1.setPos(0.0F, 0.0F, 0.0F);
            Head.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.7199F, 0.0F, 0.0F);
            cube_r1.addBox(-0.5F, -0.0188F, -0.0125F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 0, 20);
            cube_r2.setPos(0.0F, 2.7F, 9.075F);
            Head.addChild(cube_r2);
            setRotateAngle(cube_r2, 0.2574F, 0.0F, 0.0F);
            cube_r2.addBox(-0.5F, -4.9403F, -8.101F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 22, 0);
            cube_r3.setPos(0.0F, -3.0691F, 3.8087F);
            Head.addChild(cube_r3);
            setRotateAngle(cube_r3, -1.3526F, 0.0F, 0.0F);
            cube_r3.addBox(-0.475F, -0.0078F, -0.024F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 6,40);
            cube_r4.setPos(0.0F, -2.1691F, 2.9837F);
            Head.addChild(cube_r4);
            setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
            cube_r4.addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 16, 41);
            cube_r5.setPos(0.0F, -3.4441F, 1.4837F);
            Head.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.1789F, 0.0F, 0.0F);
            cube_r5.addBox(-0.525F, 0.0815F, -0.1012F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 12, 41);
            cube_r6.setPos(0.0F, -3.4441F, 3.4087F);
            Head.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.2836F, 0.0F, 0.0F);
            cube_r6.addBox(-0.525F, -0.0072F, -0.9993F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 12, 37);
            cube_r7.setPos(0.0F, -1.5191F, 2.7837F);
            Head.addChild(cube_r7);
            setRotateAngle(cube_r7, -0.733F, 0.0F, 0.0F);
            cube_r7.addBox(-0.525F, -1.2541F, -0.546F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 6, 36);
            cube_r8.setPos(0.0F, -1.5191F, 2.7837F);
            Head.addChild(cube_r8);
            setRotateAngle(cube_r8, 0.0524F, 0.0F, 0.0F);
            cube_r8.addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 27, 23);
            cube_r9.setPos(0.0F, -2.6191F, 2.5337F);
            Head.addChild(cube_r9);
            setRotateAngle(cube_r9, -0.8683F, 0.0F, 0.0F);
            cube_r9.addBox(-0.525F, -1.2541F, -0.546F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 0, 0);
            cube_r10.setPos(0.0F, -2.6191F, 2.5337F);
            Head.addChild(cube_r10);
            setRotateAngle(cube_r10, -0.0829F, 0.0F, 0.0F);
            cube_r10.texOffs(0, 10).addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r10.texOffs(18, 29).addBox(0.0F, -2.0154F, -1.9988F, 0.0F, 3.0F, 4.0F, 0.0F, false);
            cube_r10.texOffs(0, 10).addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 18, 29);
            cube_r11.setPos(0.0F, -3.7941F, 3.1087F);
            Head.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.1353F, 0.0F, 0.0F);
            cube_r11.addBox(-0.5F, 0.6032F, -1.2245F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 0, 0);
            cube_r12.setPos(0.0F, -1.5F, 0.5104F);
            Head.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.4887F, 0.0F, 0.0F);
            cube_r12.texOffs(0, 46).addBox(-0.75F, -1.0973F, -0.3659F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r12.texOffs(0, 43).addBox(-0.25F, -1.0973F, -0.3659F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 6, 50);
            cube_r13.setPos(0.0F, -2.8863F, 2.5214F);
            Head.addChild(cube_r13);
            setRotateAngle(cube_r13, -1.0428F, 0.0F, 0.0F);
            cube_r13.addBox(-0.475F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 6, 50);
            cube_r14.setPos(0.0F, -2.8863F, 2.5214F);
            Head.addChild(cube_r14);
            setRotateAngle(cube_r14, 1.021F, 0.0F, 0.0F);
            cube_r14.addBox(-0.525F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 6, 50);
            cube_r15.setPos(0.0F, -2.8863F, 2.5214F);
            Head.addChild(cube_r15);
            setRotateAngle(cube_r15, 0.5411F, 0.0F, 0.0F);
            cube_r15.addBox(-0.475F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 6, 50);
            cube_r16.setPos(0.0F, -2.8863F, 2.5214F);
            Head.addChild(cube_r16);
            setRotateAngle(cube_r16, -0.528F, 0.0F, 0.0F);
            cube_r16.addBox(-0.525F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 0, 49);
            cube_r17.setPos(0.0F, -1.5F, 0.5104F);
            Head.addChild(cube_r17);
            setRotateAngle(cube_r17, -0.1222F, 0.0F, 0.0F);
            cube_r17.addBox(-0.5F, -0.5362F, -0.839F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 6, 44);
            cube_r18.setPos(0.0F, -1.9309F, 2.0748F);
            Head.addChild(cube_r18);
            setRotateAngle(cube_r18, 0.0087F, 0.0F, 0.0F);
            cube_r18.addBox(-1.5F, -0.975F, -1.075F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 0, 39);
            cube_r19.setPos(0.0F, -0.75F, 0.5104F);
            Head.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.1222F, 0.0F, 0.0F);
            cube_r19.addBox(-0.5F, -0.5362F, -0.839F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 0, 0);
            cube_r20.setPos(0.0F, -0.75F, 0.5104F);
            Head.addChild(cube_r20);
            setRotateAngle(cube_r20, 0.4887F, 0.0F, 0.0F);
            cube_r20.texOffs(0, 33).addBox(-0.25F, -1.0973F, -0.3659F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r20.texOffs(0, 36).addBox(-0.75F, -1.0973F, -0.3659F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 0, 0);
            cube_r21.setPos(0.0F, 2.6F, 8.975F);
            Head.addChild(cube_r21);
            setRotateAngle(cube_r21, 0.2574F, 0.0F, 0.0F);
            cube_r21.addBox(-0.5F, -5.6903F, -6.351F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 10, 30);
            cube_r22.setPos(0.0F, 2.6F, 8.975F);
            Head.addChild(cube_r22);
            setRotateAngle(cube_r22, 0.2793F, 0.0F, 0.0F);
            cube_r22.addBox(-1.0F, -5.6961F, -5.5842F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 18, 23);
            cube_r23.setPos(0.0F, -1.1809F, 2.0748F);
            Head.addChild(cube_r23);
            setRotateAngle(cube_r23, 0.0087F, 0.0F, 0.0F);
            cube_r23.addBox(-1.5F, -0.975F, -1.075F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, -5.869F, 0.1906F);
            MAIN.addChild(Body);
            setRotateAngle(Body, -0.0873F, 0.0F, 0.0F);


            cube_r24 = new ZawaModelRenderer(this, 20, 15);
            cube_r24.setPos(-1.2305F, 2.2764F, 6.9497F);
            Body.addChild(cube_r24);
            setRotateAngle(cube_r24, -0.0707F, -0.1567F, 0.011F);
            cube_r24.addBox(0.0426F, -0.6F, -3.3387F, 1.0F, 1.0F, 7.0F, 0.0F, true);

            cube_r25 = new ZawaModelRenderer(this, 23, 7);
            cube_r25.setPos(-1.2305F, 2.2764F, 6.6747F);
            Body.addChild(cube_r25);
            setRotateAngle(cube_r25, -0.0714F, -0.2133F, 0.0151F);
            cube_r25.addBox(-0.5006F, -0.5F, -3.4773F, 1.0F, 1.0F, 7.0F, 0.0F, true);

            cube_r26 = new ZawaModelRenderer(this, 23, 7);
            cube_r26.setPos(1.2305F, 2.2764F, 6.6747F);
            Body.addChild(cube_r26);
            setRotateAngle(cube_r26, -0.0714F, 0.2133F, -0.0151F);
            cube_r26.addBox(-0.4994F, -0.5F, -3.4773F, 1.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r27 = new ZawaModelRenderer(this, 20, 15);
            cube_r27.setPos(1.2305F, 2.2764F, 6.9497F);
            Body.addChild(cube_r27);
            setRotateAngle(cube_r27, -0.0707F, 0.1567F, -0.011F);
            cube_r27.addBox(-1.0426F, -0.6F, -3.3387F, 1.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r28 = new ZawaModelRenderer(this, 9, 14);
            cube_r28.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r28);
            setRotateAngle(cube_r28, -0.0698F, 0.0F, 0.0F);
            cube_r28.addBox(-1.0F, 1.0722F, 4.1844F, 2.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r29 = new ZawaModelRenderer(this, 24, 0);
            cube_r29.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r29);
            setRotateAngle(cube_r29, -0.2007F, 0.0F, 0.0F);
            cube_r29.addBox(-1.5F, 0.0278F, 1.7399F, 3.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r30 = new ZawaModelRenderer(this, 29, 15);
            cube_r30.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r30);
            setRotateAngle(cube_r30, -0.057F, 0.0958F, -0.0055F);
            cube_r30.addBox(-2.6939F, -0.2051F, 0.4172F, 1.0F, 3.0F, 3.0F, 0.0F, true);

            cube_r31 = new ZawaModelRenderer(this, 29, 15);
            cube_r31.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r31);
            setRotateAngle(cube_r31, -0.057F, -0.0958F, 0.0055F);
            cube_r31.addBox(1.6939F, -0.2051F, 0.4172F, 1.0F, 3.0F, 3.0F, 0.0F, false);

            cube_r32 = new ZawaModelRenderer(this, 28, 27);
            cube_r32.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r32);
            setRotateAngle(cube_r32, -0.2531F, 0.0F, 0.0F);
            cube_r32.addBox(-1.5F, -0.3342F, -0.1108F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r33 = new ZawaModelRenderer(this, 0, 0);
            cube_r33.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r33);
            setRotateAngle(cube_r33, -0.2225F, 0.0F, 0.0F);
            cube_r33.texOffs(0, 10).addBox(1.75F, -0.9008F, -4.7867F, 1.0F, 4.0F, 6.0F, 0.0F, true);
            cube_r33.texOffs(0, 10).addBox(-2.75F, -0.9008F, -4.7867F, 1.0F, 4.0F, 6.0F, 0.0F, false);

            cube_r34 = new ZawaModelRenderer(this, 0, 0);
            cube_r34.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r34);
            setRotateAngle(cube_r34, -0.2225F, 0.0F, 0.0F);
            cube_r34.addBox(-2.0F, -0.6471F, -5.5034F, 4.0F, 4.0F, 6.0F, 0.0F, false);

            cube_r35 = new ZawaModelRenderer(this, 0, 28);
            cube_r35.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r35);
            setRotateAngle(cube_r35, -0.9294F, 0.0F, 0.0F);
            cube_r35.addBox(-1.5F, 3.0408F, -4.1352F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            Leg1 = new ZawaModelRenderer(this, 0, 0);
            Leg1.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Leg1);


            cube_r36 = new ZawaModelRenderer(this, 30, 32);
            cube_r36.setPos(1.35F, -2.5F, -1.475F);
            Leg1.addChild(cube_r36);
            setRotateAngle(cube_r36, 0.5934F, 0.0F, 0.0F);
            cube_r36.addBox(-1.0F, -2.9927F, -1.1625F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r37 = new ZawaModelRenderer(this, 10, 10);
            cube_r37.setPos(1.35F, -0.7F, -2.8466F);
            Leg1.addChild(cube_r37);
            setRotateAngle(cube_r37, -0.2017F, 0.2162F, 0.0287F);
            cube_r37.addBox(-0.5677F, -0.6632F, 0.6065F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r38 = new ZawaModelRenderer(this, 14, 3);
            cube_r38.setPos(1.35F, -0.7F, -1.7216F);
            Leg1.addChild(cube_r38);
            setRotateAngle(cube_r38, 0.1645F, -0.2297F, -0.0266F);
            cube_r38.addBox(-0.5335F, -0.6764F, -2.0928F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r39 = new ZawaModelRenderer(this, 20, 15);
            cube_r39.setPos(1.35F, -0.7F, -2.8466F);
            Leg1.addChild(cube_r39);
            setRotateAngle(cube_r39, 0.2478F, 0.2162F, 0.0287F);
            cube_r39.addBox(-0.5677F, -0.6632F, -1.5185F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r40 = new ZawaModelRenderer(this, 10, 12);
            cube_r40.setPos(1.85F, -0.75F, -2.3F);
            Leg1.addChild(cube_r40);
            setRotateAngle(cube_r40, -0.207F, -0.212F, 0.0311F);
            cube_r40.addBox(-1.075F, -0.575F, -0.175F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r41 = new ZawaModelRenderer(this, 0, 23);
            cube_r41.setPos(1.35F, -0.475F, -2.325F);
            Leg1.addChild(cube_r41);
            setRotateAngle(cube_r41, -0.2923F, 0.0F, 0.0F);
            cube_r41.addBox(-0.5F, -3.0615F, -0.543F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            Leg2 = new ZawaModelRenderer(this, 0, 0);
            Leg2.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Leg2);


            cube_r42 = new ZawaModelRenderer(this, 30, 32);
            cube_r42.setPos(-1.35F, -2.5F, -1.475F);
            Leg2.addChild(cube_r42);
            setRotateAngle(cube_r42, 0.5934F, 0.0F, 0.0F);
            cube_r42.addBox(-1.0F, -2.9927F, -1.1625F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            cube_r43 = new ZawaModelRenderer(this, 14, 0);
            cube_r43.setPos(-1.85F, -0.75F, -2.3F);
            Leg2.addChild(cube_r43);
            setRotateAngle(cube_r43, -0.207F, 0.212F, -0.0311F);
            cube_r43.addBox(0.075F, -0.575F, -0.175F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r44 = new ZawaModelRenderer(this, 18, 1);
            cube_r44.setPos(-1.35F, -0.7F, -1.7216F);
            Leg2.addChild(cube_r44);
            setRotateAngle(cube_r44, 0.1645F, 0.2297F, 0.0266F);
            cube_r44.addBox(-0.4665F, -0.6764F, -2.0928F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r45 = new ZawaModelRenderer(this, 20, 18);
            cube_r45.setPos(-1.35F, -0.7F, -2.8466F);
            Leg2.addChild(cube_r45);
            setRotateAngle(cube_r45, 0.2478F, -0.2162F, -0.0287F);
            cube_r45.addBox(-0.4323F, -0.6632F, -1.5185F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r46 = new ZawaModelRenderer(this, 0, 14);
            cube_r46.setPos(-1.35F, -0.7F, -2.8466F);
            Leg2.addChild(cube_r46);
            setRotateAngle(cube_r46, -0.2017F, -0.2162F, -0.0287F);
            cube_r46.addBox(-0.4323F, -0.6632F, 0.6065F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r47 = new ZawaModelRenderer(this, 24, 5);
            cube_r47.setPos(2.85F, -0.475F, -2.325F);
            Leg2.addChild(cube_r47);
            setRotateAngle(cube_r47, -0.2923F, 0.0F, 0.0F);
            cube_r47.addBox(-4.7F, -3.0615F, -0.543F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            this.saveBase();
        }

        @Override
        public void setupAnim(TuracoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

    public static class Flying extends TuracoModel {
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
        protected ZawaModelRenderer cube_r39;
        protected ZawaModelRenderer cube_r40;
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

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 24.0F, 0.0F);


            Head = new ZawaModelRenderer(this, 6, 50);
            Head.setPos(-0.0042F, -9.2787F, -7.4642F);
            MAIN.addChild(Head);
            setRotateAngle(Head, 0.2531F, 0.0F, 0.0F);
            Head.addBox(-0.4958F, -3.5516F, -0.7738F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r1 = new ZawaModelRenderer(this, 18, 29);
            cube_r1.setPos(0.0042F, -2.1345F, 0.7385F);
            Head.addChild(cube_r1);
            setRotateAngle(cube_r1, -0.0829F, 0.0F, 0.0F);
            cube_r1.addBox(0.0F, -1.0154F, -1.9988F, 0.0F, 3.0F, 4.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 6, 50);
            cube_r2.setPos(0.0042F, -1.5516F, -0.2738F);
            Head.addChild(cube_r2);
            setRotateAngle(cube_r2, 1.021F, 0.0F, 0.0F);
            cube_r2.addBox(-0.525F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 6, 50);
            cube_r3.setPos(0.0042F, -1.5516F, -0.2738F);
            Head.addChild(cube_r3);
            setRotateAngle(cube_r3, 0.5411F, 0.0F, 0.0F);
            cube_r3.addBox(-0.475F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 6, 50);
            cube_r4.setPos(0.0042F, -1.5516F, -0.2738F);
            Head.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.528F, 0.0F, 0.0F);
            cube_r4.addBox(-0.525F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 6, 50);
            cube_r5.setPos(0.0042F, -1.5516F, -0.2738F);
            Head.addChild(cube_r5);
            setRotateAngle(cube_r5, -1.0428F, 0.0F, 0.0F);
            cube_r5.addBox(-0.475F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 9, 22);
            cube_r6.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.4451F, 0.0F, 0.0F);
            cube_r6.addBox(-0.5F, -0.2337F, -2.2562F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 0, 20);
            cube_r7.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r7);
            setRotateAngle(cube_r7, -0.0175F, 0.0F, 0.0F);
            cube_r7.addBox(-0.5F, 0.79F, -2.1163F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 22, 0);
            cube_r8.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r8);
            setRotateAngle(cube_r8, -1.6275F, 0.0F, 0.0F);
            cube_r8.addBox(-0.475F, -2.32F, -1.3053F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 0, 0);
            cube_r9.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r9);
            setRotateAngle(cube_r9, -0.2225F, 0.0F, 0.0F);
            cube_r9.texOffs(6, 40).addBox(-0.5F, -2.0551F, -0.3007F, 1.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r9.texOffs(6, 36).addBox(-0.5F, -1.4165F, -0.5345F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 16, 41);
            cube_r10.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r10);
            setRotateAngle(cube_r10, -0.4538F, 0.0F, 0.0F);
            cube_r10.addBox(-0.525F, -1.9496F, -0.819F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 12, 41);
            cube_r11.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r11);
            setRotateAngle(cube_r11, 0.0087F, 0.0F, 0.0F);
            cube_r11.addBox(-0.525F, -1.6064F, 1.1127F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 12, 37);
            cube_r12.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r12);
            setRotateAngle(cube_r12, -1.0079F, 0.0F, 0.0F);
            cube_r12.addBox(-0.525F, -2.0428F, 0.029F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 27, 23);
            cube_r13.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r13);
            setRotateAngle(cube_r13, -1.1432F, 0.0F, 0.0F);
            cube_r13.addBox(-0.525F, -2.6331F, -1.0837F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 0, 0);
            cube_r14.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r14);
            setRotateAngle(cube_r14, -0.3578F, 0.0F, 0.0F);
            cube_r14.texOffs(0, 10).addBox(-0.5F, -2.6207F, -0.9039F, 1.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r14.texOffs(0, 10).addBox(-0.5F, -2.6207F, -0.9039F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 18, 29);
            cube_r15.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.4102F, 0.0F, 0.0F);
            cube_r15.addBox(-0.5F, -2.0232F, -0.2901F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 0, 49);
            cube_r16.setPos(0.0042F, -0.7914F, -0.9888F);
            Head.addChild(cube_r16);
            setRotateAngle(cube_r16, -0.3971F, 0.0F, 0.0F);
            cube_r16.addBox(-0.5F, -0.2201F, -1.8462F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 0, 0);
            cube_r17.setPos(0.0042F, -0.7914F, -0.9888F);
            Head.addChild(cube_r17);
            setRotateAngle(cube_r17, 0.2138F, 0.0F, 0.0F);
            cube_r17.texOffs(0, 46).addBox(-0.75F, -1.416F, -1.3723F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r17.texOffs(0, 43).addBox(-0.25F, -1.416F, -1.3723F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 6, 44);
            cube_r18.setPos(0.0042F, -0.7914F, -0.9888F);
            Head.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.2662F, 0.0F, 0.0F);
            cube_r18.addBox(-1.5F, -1.2102F, -0.5467F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 0, 39);
            cube_r19.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.3971F, 0.0F, 0.0F);
            cube_r19.addBox(-0.5F, 0.1879F, -2.0782F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 0, 0);
            cube_r20.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r20);
            setRotateAngle(cube_r20, 0.2138F, 0.0F, 0.0F);
            cube_r20.texOffs(0, 33).addBox(-0.25F, -1.2148F, -1.7964F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r20.texOffs(0, 36).addBox(-0.75F, -1.2148F, -1.7964F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 0, 0);
            cube_r21.setPos(0.2194F, 3.0025F, 7.2586F);
            Head.addChild(cube_r21);
            setRotateAngle(cube_r21, 0.5149F, 0.0F, 0.0F);
            cube_r21.addBox(-0.7153F, -5.6385F, -6.0841F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 10, 30);
            cube_r22.setPos(0.2194F, 3.0025F, 7.2586F);
            Head.addChild(cube_r22);
            setRotateAngle(cube_r22, 0.5367F, 0.0F, 0.0F);
            cube_r22.addBox(-1.2153F, -5.6385F, -5.3186F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 18, 23);
            cube_r23.setPos(0.0042F, 0.097F, -0.4421F);
            Head.addChild(cube_r23);
            setRotateAngle(cube_r23, -0.2662F, 0.0F, 0.0F);
            cube_r23.addBox(-1.5F, -0.836F, -0.83F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, -5.869F, 0.1906F);
            MAIN.addChild(Body);
            setRotateAngle(Body, -0.0873F, 0.0F, 0.0F);


            cube_r24 = new ZawaModelRenderer(this, 20, 15);
            cube_r24.setPos(0.2153F, -0.2409F, -0.7702F);
            Body.addChild(cube_r24);
            setRotateAngle(cube_r24, 0.1899F, -0.1543F, -0.0295F);
            cube_r24.addBox(-0.1327F, 0.0793F, 4.7958F, 1.0F, 1.0F, 7.0F, 0.0F, true);

            cube_r25 = new ZawaModelRenderer(this, 23, 7);
            cube_r25.setPos(0.2153F, -0.2409F, -0.7702F);
            Body.addChild(cube_r25);
            setRotateAngle(cube_r25, 0.1919F, -0.21F, -0.0405F);
            cube_r25.addBox(-0.2727F, 0.1984F, 4.386F, 1.0F, 1.0F, 7.0F, 0.0F, true);

            cube_r26 = new ZawaModelRenderer(this, 23, 7);
            cube_r26.setPos(0.2153F, -0.2409F, -0.7702F);
            Body.addChild(cube_r26);
            setRotateAngle(cube_r26, 0.1919F, 0.21F, 0.0405F);
            cube_r26.addBox(-1.148F, 0.1984F, 4.2946F, 1.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r27 = new ZawaModelRenderer(this, 20, 15);
            cube_r27.setPos(0.2153F, -0.2409F, -0.7702F);
            Body.addChild(cube_r27);
            setRotateAngle(cube_r27, 0.1899F, 0.1543F, 0.0295F);
            cube_r27.addBox(-1.2925F, 0.0793F, 4.7284F, 1.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r28 = new ZawaModelRenderer(this, 9, 14);
            cube_r28.setPos(0.2153F, -0.2409F, -0.7702F);
            Body.addChild(cube_r28);
            setRotateAngle(cube_r28, 0.1876F, 0.0F, 0.0F);
            cube_r28.addBox(-1.2153F, -0.0347F, 5.0997F, 2.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r29 = new ZawaModelRenderer(this, 24, 0);
            cube_r29.setPos(0.2153F, -0.2409F, -0.7702F);
            Body.addChild(cube_r29);
            setRotateAngle(cube_r29, 0.0567F, 0.0F, 0.0F);
            cube_r29.addBox(-1.7153F, -1.1891F, 2.5029F, 3.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r30 = new ZawaModelRenderer(this, 28, 27);
            cube_r30.setPos(0.2153F, -0.2409F, -0.7702F);
            Body.addChild(cube_r30);
            setRotateAngle(cube_r30, 0.0044F, 0.0F, 0.0F);
            cube_r30.addBox(-1.6903F, -1.5893F, 0.5875F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r31 = new ZawaModelRenderer(this, 31, 17);
            cube_r31.setPos(8.3855F, -1.1257F, -3.8129F);
            Body.addChild(cube_r31);
            setRotateAngle(cube_r31, 0.3665F, 0.0F, -1.5708F);
            cube_r31.addBox(-0.525F, -1.3307F, -1.2263F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            cube_r32 = new ZawaModelRenderer(this, 31, 17);
            cube_r32.setPos(8.3855F, -1.1257F, -3.8129F);
            Body.addChild(cube_r32);
            setRotateAngle(cube_r32, 0.6196F, 0.0F, -1.5708F);
            cube_r32.addBox(-0.5F, -1.5954F, -0.854F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            cube_r33 = new ZawaModelRenderer(this, 31, 17);
            cube_r33.setPos(8.3855F, -1.1507F, -3.8129F);
            Body.addChild(cube_r33);
            setRotateAngle(cube_r33, 0.8683F, 0.0F, -1.5708F);
            cube_r33.addBox(-0.5F, -1.7565F, -0.4351F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            cube_r34 = new ZawaModelRenderer(this, 31, 17);
            cube_r34.setPos(8.3855F, -1.1757F, -3.8129F);
            Body.addChild(cube_r34);
            setRotateAngle(cube_r34, 1.1257F, 0.0F, -1.5708F);
            cube_r34.addBox(-0.5F, -1.8094F, 0.0265F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            cube_r35 = new ZawaModelRenderer(this, 31, 17);
            cube_r35.setPos(8.3855F, -1.2007F, -3.8129F);
            Body.addChild(cube_r35);
            setRotateAngle(cube_r35, 1.3657F, 0.0F, -1.5708F);
            cube_r35.addBox(-0.5F, -1.7512F, 0.4558F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            cube_r36 = new ZawaModelRenderer(this, 1, 53);
            cube_r36.setPos(0.6469F, -1.2507F, -5.033F);
            Body.addChild(cube_r36);
            setRotateAngle(cube_r36, -1.837F, 0.0F, -1.5708F);
            cube_r36.addBox(-0.5F, -4.8753F, 3.0763F, 1.0F, 4.0F, 2.0F, 0.0F, true);

            cube_r37 = new ZawaModelRenderer(this, 30, 16);
            cube_r37.setPos(0.6469F, -1.2507F, -5.033F);
            Body.addChild(cube_r37);
            setRotateAngle(cube_r37, -1.4879F, 0.0F, -1.5708F);
            cube_r37.addBox(-0.525F, -3.0522F, 5.0659F, 1.0F, 4.0F, 2.0F, 0.0F, true);

            cube_r38 = new ZawaModelRenderer(this, 30, 16);
            cube_r38.setPos(-0.6469F, -1.2507F, -5.033F);
            Body.addChild(cube_r38);
            setRotateAngle(cube_r38, -1.4879F, 0.0F, 1.5708F);
            cube_r38.addBox(-0.475F, -3.0522F, 5.0659F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r39 = new ZawaModelRenderer(this, 3, 13);
            cube_r39.setPos(-1.6469F, -1.2507F, -5.208F);
            Body.addChild(cube_r39);
            setRotateAngle(cube_r39, -1.5621F, 0.0F, 1.5708F);
            cube_r39.addBox(-0.525F, -4.1199F, 0.3419F, 1.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r40 = new ZawaModelRenderer(this, 1, 53);
            cube_r40.setPos(-0.6469F, -1.2507F, -5.033F);
            Body.addChild(cube_r40);
            setRotateAngle(cube_r40, -1.837F, 0.0F, 1.5708F);
            cube_r40.addBox(-0.5F, -4.8753F, 3.0763F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r41 = new ZawaModelRenderer(this, 3, 13);
            cube_r41.setPos(1.6469F, -1.2507F, -5.208F);
            Body.addChild(cube_r41);
            setRotateAngle(cube_r41, -1.5621F, 0.0F, -1.5708F);
            cube_r41.addBox(-0.475F, -4.1199F, 0.3419F, 1.0F, 4.0F, 3.0F, 0.0F, true);

            cube_r42 = new ZawaModelRenderer(this, 31, 17);
            cube_r42.setPos(-8.3855F, -1.2007F, -3.8129F);
            Body.addChild(cube_r42);
            setRotateAngle(cube_r42, 1.3657F, 0.0F, 1.5708F);
            cube_r42.addBox(-0.5F, -1.7512F, 0.4558F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r43 = new ZawaModelRenderer(this, 31, 17);
            cube_r43.setPos(-8.3855F, -1.1757F, -3.8129F);
            Body.addChild(cube_r43);
            setRotateAngle(cube_r43, 1.1257F, 0.0F, 1.5708F);
            cube_r43.addBox(-0.5F, -1.8094F, 0.0265F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r44 = new ZawaModelRenderer(this, 31, 17);
            cube_r44.setPos(-8.3855F, -1.1507F, -3.8129F);
            Body.addChild(cube_r44);
            setRotateAngle(cube_r44, 0.8683F, 0.0F, 1.5708F);
            cube_r44.addBox(-0.5F, -1.7565F, -0.4351F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r45 = new ZawaModelRenderer(this, 31, 17);
            cube_r45.setPos(-8.3855F, -1.1257F, -3.8129F);
            Body.addChild(cube_r45);
            setRotateAngle(cube_r45, 0.6196F, 0.0F, 1.5708F);
            cube_r45.addBox(-0.5F, -1.5954F, -0.854F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r46 = new ZawaModelRenderer(this, 31, 17);
            cube_r46.setPos(-8.3855F, -1.1257F, -3.8129F);
            Body.addChild(cube_r46);
            setRotateAngle(cube_r46, 0.3665F, 0.0F, 1.5708F);
            cube_r46.addBox(-0.475F, -1.3307F, -1.2263F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r47 = new ZawaModelRenderer(this, 0, 0);
            cube_r47.setPos(0.2153F, -0.2409F, -0.7702F);
            Body.addChild(cube_r47);
            setRotateAngle(cube_r47, 0.0349F, 0.0F, 0.0F);
            cube_r47.addBox(-2.2153F, -1.8803F, -4.7671F, 4.0F, 4.0F, 6.0F, 0.0F, false);

            cube_r48 = new ZawaModelRenderer(this, 0, 28);
            cube_r48.setPos(0.2153F, -0.2409F, -0.7702F);
            Body.addChild(cube_r48);
            setRotateAngle(cube_r48, -0.672F, 0.0F, 0.0F);
            cube_r48.addBox(-1.7153F, 1.6249F, -4.3762F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            Leg1 = new ZawaModelRenderer(this, 0, 0);
            Leg1.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Leg1);


            cube_r49 = new ZawaModelRenderer(this, 30, 32);
            cube_r49.setPos(0.0F, -3.1103F, 0.6441F);
            Leg1.addChild(cube_r49);
            setRotateAngle(cube_r49, 1.0647F, 0.0F, 0.0F);
            cube_r49.addBox(0.35F, -3.4131F, -0.4979F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r50 = new ZawaModelRenderer(this, 10, 10);
            cube_r50.setPos(0.0F, -3.1103F, 0.6441F);
            Leg1.addChild(cube_r50);
            setRotateAngle(cube_r50, 0.6008F, 0.1307F, 0.175F);
            cube_r50.addBox(0.9351F, 0.5483F, 0.4541F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r51 = new ZawaModelRenderer(this, 14, 3);
            cube_r51.setPos(0.0F, -3.1103F, 0.6441F);
            Leg1.addChild(cube_r51);
            setRotateAngle(cube_r51, 0.9686F, -0.1416F, -0.1835F);
            cube_r51.addBox(0.8452F, 0.556F, -2.1872F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r52 = new ZawaModelRenderer(this, 20, 15);
            cube_r52.setPos(0.0F, -3.1103F, 0.6441F);
            Leg1.addChild(cube_r52);
            setRotateAngle(cube_r52, 1.0503F, 0.1307F, 0.175F);
            cube_r52.addBox(0.9351F, 0.3618F, -2.1821F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r53 = new ZawaModelRenderer(this, 10, 12);
            cube_r53.setPos(0.0F, -3.1103F, 0.6441F);
            Leg1.addChild(cube_r53);
            setRotateAngle(cube_r53, 0.6016F, -0.1699F, -0.131F);
            cube_r53.addBox(0.7342F, 0.6027F, -0.4912F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r54 = new ZawaModelRenderer(this, 0, 23);
            cube_r54.setPos(0.0F, -3.1103F, 0.6441F);
            Leg1.addChild(cube_r54);
            setRotateAngle(cube_r54, 0.5018F, 0.0F, 0.0F);
            cube_r54.addBox(0.85F, -1.6482F, -0.3093F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            Leg2 = new ZawaModelRenderer(this, 0, 0);
            Leg2.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Leg2);


            cube_r55 = new ZawaModelRenderer(this, 30, 32);
            cube_r55.setPos(0.0F, -3.1103F, 0.6441F);
            Leg2.addChild(cube_r55);
            setRotateAngle(cube_r55, 1.0647F, 0.0F, 0.0F);
            cube_r55.addBox(-2.35F, -3.4131F, -0.4979F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            cube_r56 = new ZawaModelRenderer(this, 14, 0);
            cube_r56.setPos(0.0F, -3.1103F, 0.6441F);
            Leg2.addChild(cube_r56);
            setRotateAngle(cube_r56, 0.6016F, 0.1699F, 0.131F);
            cube_r56.addBox(-1.7342F, 0.6027F, -0.4912F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r57 = new ZawaModelRenderer(this, 18, 1);
            cube_r57.setPos(0.0F, -3.1103F, 0.6441F);
            Leg2.addChild(cube_r57);
            setRotateAngle(cube_r57, 0.9686F, 0.1416F, 0.1835F);
            cube_r57.addBox(-1.8452F, 0.556F, -2.1872F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r58 = new ZawaModelRenderer(this, 20, 18);
            cube_r58.setPos(0.0F, -3.1103F, 0.6441F);
            Leg2.addChild(cube_r58);
            setRotateAngle(cube_r58, 1.0503F, -0.1307F, -0.175F);
            cube_r58.addBox(-1.9351F, 0.3618F, -2.1821F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r59 = new ZawaModelRenderer(this, 0, 14);
            cube_r59.setPos(0.0F, -3.1103F, 0.6441F);
            Leg2.addChild(cube_r59);
            setRotateAngle(cube_r59, 0.6008F, -0.1307F, -0.175F);
            cube_r59.addBox(-1.9351F, 0.5483F, 0.4541F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r60 = new ZawaModelRenderer(this, 24, 5);
            cube_r60.setPos(0.0F, -3.1103F, 0.6441F);
            Leg2.addChild(cube_r60);
            setRotateAngle(cube_r60, 0.5018F, 0.0F, 0.0F);
            cube_r60.addBox(-1.85F, -1.6482F, -0.3093F, 1.0F, 3.0F, 1.0F, 0.0F, false);
            this.saveBase();
        }

        @Override
        public void setupAnim(TuracoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

        public static class Child extends TuracoModel {

        

            public Child() {
                texWidth = 32;
                texHeight = 32;

                MAIN = new ZawaModelRenderer(this, 0, 0);
                MAIN.setPos(0.0F, 24.0F, 0.0F);


                Head = new ZawaModelRenderer(this, 0, 0);
                Head.setPos(0.0F, 0.0F, 0.0F);
                MAIN.addChild(Head);


                cube_r1 = new ZawaModelRenderer(this, 9, 11);
                cube_r1.setPos(0.0F, -6.6016F, -2.6846F);
                Head.addChild(cube_r1);
                setRotateAngle(cube_r1, 0.0131F, 0.0F, 0.0F);
                cube_r1.addBox(-1.5F, -2.1004F, -1.2548F, 3.0F, 3.0F, 3.0F, 0.0F, false);

                cube_r2 = new ZawaModelRenderer(this, 6, 20);
                cube_r2.setPos(0.0F, -6.8769F, -3.8053F);
                Head.addChild(cube_r2);
                setRotateAngle(cube_r2, 0.1484F, 0.0F, 0.0F);
                cube_r2.addBox(-0.5F, -0.2544F, -1.0555F, 1.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r3 = new ZawaModelRenderer(this, 16, 20);
                cube_r3.setPos(0.0F, -6.8769F, -3.8053F);
                Head.addChild(cube_r3);
                setRotateAngle(cube_r3, 0.6109F, 0.0F, 0.0F);
                cube_r3.addBox(-0.5F, -0.695F, -0.8408F, 1.0F, 1.0F, 2.0F, 0.0F, false);

                Body = new ZawaModelRenderer(this, 0, 0);
                Body.setPos(0.0F, 0.0F, 0.0F);
                MAIN.addChild(Body);


                cube_r4 = new ZawaModelRenderer(this, 0, 0);
                cube_r4.setPos(0.0F, -4.4679F, 3.3485F);
                Body.addChild(cube_r4);
                setRotateAngle(cube_r4, -0.3752F, 0.0F, 0.0F);
                cube_r4.texOffs(0, 0).addBox(-2.0F, -0.2769F, -4.992F, 4.0F, 4.0F, 4.0F, 0.0F, false);
                cube_r4.texOffs(12, 4).addBox(1.5F, -0.4019F, -4.617F, 1.0F, 3.0F, 4.0F, 0.0F, false);
                cube_r4.texOffs(12, 4).addBox(-2.5F, -0.4019F, -4.617F, 1.0F, 3.0F, 4.0F, 0.0F, true);

                cube_r5 = new ZawaModelRenderer(this, 0, 8);
                cube_r5.setPos(0.0F, -4.6679F, 3.2735F);
                Body.addChild(cube_r5);
                setRotateAngle(cube_r5, -0.9294F, 0.0F, 0.0F);
                cube_r5.addBox(-1.5F, 0.3873F, -0.8231F, 3.0F, 3.0F, 3.0F, 0.0F, false);

                cube_r6 = new ZawaModelRenderer(this, 10, 17);
                cube_r6.setPos(0.0F, -6.9266F, -3.1096F);
                Body.addChild(cube_r6);
                setRotateAngle(cube_r6, 0.2836F, 0.0F, 0.0F);
                cube_r6.addBox(-1.0F, 0.2828F, -0.041F, 2.0F, 3.0F, 2.0F, 0.0F, false);

                cube_r7 = new ZawaModelRenderer(this, 18, 2);
                cube_r7.setPos(0.0F, -6.9266F, -3.1096F);
                Body.addChild(cube_r7);
                setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
                cube_r7.addBox(-0.5F, -0.4122F, -0.538F, 1.0F, 3.0F, 2.0F, 0.0F, false);

                cube_r8 = new ZawaModelRenderer(this, 0, 23);
                cube_r8.setPos(0.0F, -4.329F, -1.6263F);
                Body.addChild(cube_r8);
                setRotateAngle(cube_r8, 0.3796F, 0.0F, 0.0F);
                cube_r8.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

                Leg1 = new ZawaModelRenderer(this, 0, 0);
                Leg1.setPos(0.0F, 0.0F, 0.0F);
                MAIN.addChild(Leg1);


                cube_r9 = new ZawaModelRenderer(this, 12, 0);
                cube_r9.setPos(0.0F, -4.6929F, 3.1485F);
                Leg1.addChild(cube_r9);
                setRotateAngle(cube_r9, 0.4407F, 0.0F, 0.0F);
                cube_r9.addBox(0.35F, 0.195F, -4.7464F, 2.0F, 2.0F, 2.0F, 0.0F, false);

                cube_r10 = new ZawaModelRenderer(this, 0, 0);
                cube_r10.setPos(1.35F, -0.475F, -0.625F);
                Leg1.addChild(cube_r10);
                setRotateAngle(cube_r10, -1.1039F, 0.0F, 0.0F);
                cube_r10.addBox(-0.5F, -2.0615F, -0.993F, 1.0F, 2.0F, 1.0F, 0.0F, false);

                cube_r11 = new ZawaModelRenderer(this, 18, 11);
                cube_r11.setPos(1.85F, -0.75F, -0.6F);
                Leg1.addChild(cube_r11);
                setRotateAngle(cube_r11, -0.207F, -0.212F, 0.0311F);
                cube_r11.addBox(-1.075F, -0.575F, -0.175F, 1.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r12 = new ZawaModelRenderer(this, 0, 20);
                cube_r12.setPos(1.35F, -0.7F, -1.1466F);
                Leg1.addChild(cube_r12);
                setRotateAngle(cube_r12, 0.2478F, 0.2162F, 0.0287F);
                cube_r12.addBox(-0.5677F, -0.6632F, -1.5185F, 1.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r13 = new ZawaModelRenderer(this, 18, 17);
                cube_r13.setPos(1.35F, -0.7F, -0.0216F);
                Leg1.addChild(cube_r13);
                setRotateAngle(cube_r13, 0.1645F, -0.2297F, -0.0266F);
                cube_r13.addBox(-0.5335F, -0.6764F, -2.0928F, 1.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r14 = new ZawaModelRenderer(this, 16, 17);
                cube_r14.setPos(1.35F, -0.7F, -1.1466F);
                Leg1.addChild(cube_r14);
                setRotateAngle(cube_r14, -0.2017F, 0.2162F, 0.0287F);
                cube_r14.addBox(-0.5677F, -0.6632F, 0.6065F, 1.0F, 1.0F, 1.0F, 0.0F, false);

                Leg2 = new ZawaModelRenderer(this, 0, 0);
                Leg2.setPos(0.0F, 0.0F, 0.0F);
                MAIN.addChild(Leg2);


                cube_r15 = new ZawaModelRenderer(this, 12, 0);
                cube_r15.setPos(0.0F, -4.6929F, 3.1485F);
                Leg2.addChild(cube_r15);
                setRotateAngle(cube_r15, 0.4407F, 0.0F, 0.0F);
                cube_r15.addBox(-2.35F, 0.195F, -4.7464F, 2.0F, 2.0F, 2.0F, 0.0F, true);

                cube_r16 = new ZawaModelRenderer(this, 0, 0);
                cube_r16.setPos(-1.35F, -0.475F, -0.625F);
                Leg2.addChild(cube_r16);
                setRotateAngle(cube_r16, -1.1039F, 0.0F, 0.0F);
                cube_r16.addBox(-0.5F, -2.0615F, -0.993F, 1.0F, 2.0F, 1.0F, 0.0F, true);

                cube_r17 = new ZawaModelRenderer(this, 0, 20);
                cube_r17.setPos(-1.35F, -0.7F, -1.1466F);
                Leg2.addChild(cube_r17);
                setRotateAngle(cube_r17, 0.2478F, -0.2162F, -0.0287F);
                cube_r17.addBox(-0.4323F, -0.6632F, -1.5185F, 1.0F, 1.0F, 2.0F, 0.0F, true);

                cube_r18 = new ZawaModelRenderer(this,16, 17);
                cube_r18.setPos(-1.35F, -0.7F, -1.1466F);
                Leg2.addChild(cube_r18);
                setRotateAngle(cube_r18, -0.2017F, -0.2162F, -0.0287F);
                cube_r18.addBox(-0.4323F, -0.6632F, 0.6065F, 1.0F, 1.0F, 1.0F, 0.0F, true);

                cube_r19 = new ZawaModelRenderer(this, 18, 17);
                cube_r19.setPos(-1.35F, -0.7F, -0.0216F);
                Leg2.addChild(cube_r19);
                setRotateAngle(cube_r19, 0.1645F, 0.2297F, 0.0266F);
                cube_r19.addBox(-0.4665F, -0.6764F, -2.0928F, 1.0F, 1.0F, 2.0F, 0.0F, true);

                cube_r20 = new ZawaModelRenderer(this, 18, 11);
                cube_r20.setPos(-1.85F, -0.75F, -0.6F);
                Leg2.addChild(cube_r20);
                setRotateAngle(cube_r20, -0.207F, 0.212F, -0.0311F);
                cube_r20.addBox(0.075F, -0.575F, -0.175F, 1.0F, 1.0F, 2.0F, 0.0F, true);
                this.saveBase();
            }

            @Override
            public void setupAnim(TuracoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

