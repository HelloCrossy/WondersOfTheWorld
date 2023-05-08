package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.KiwiEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TuracoEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class TuracoModel extends ZawaBaseModel<TuracoEntity> {
    protected ZawaModelRenderer TURACO;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(TURACO);
        }

        return this.parts;
    }

    public static class Adult extends TuracoModel {
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
        protected ZawaModelRenderer Head;
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
        protected ZawaModelRenderer LeftLeg;
        protected ZawaModelRenderer cube_r29;
        protected ZawaModelRenderer cube_r30;
        protected ZawaModelRenderer cube_r31;
        protected ZawaModelRenderer cube_r32;
        protected ZawaModelRenderer cube_r33;
        protected ZawaModelRenderer cube_r34;
        protected ZawaModelRenderer RightLeg;
        protected ZawaModelRenderer cube_r35;
        protected ZawaModelRenderer cube_r36;
        protected ZawaModelRenderer cube_r37;
        protected ZawaModelRenderer cube_r38;
        protected ZawaModelRenderer cube_r39;
        protected ZawaModelRenderer cube_r40;

        public Adult() {
            texWidth = 64;
            texHeight = 64;

            TURACO = new ZawaModelRenderer(this, 0, 0);
            TURACO.setPos(0.0F, 15.206F, -9.2594F);


            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, 2.925F, 9.45F);
            TURACO.addChild(Body);
            setRotateAngle(Body, -0.0873F, 0.0F, 0.0F);


            cube_r1 = new ZawaModelRenderer(this, 20, 15);
            cube_r1.setPos(-1.2305F, 2.2764F, 6.9497F);
            Body.addChild(cube_r1);
            setRotateAngle(cube_r1, -0.0707F, -0.1567F, 0.011F);
            cube_r1.addBox(0.0426F, -0.6F, -3.3387F, 1.0F, 1.0F, 7.0F, 0.0F, true);

            cube_r2 = new ZawaModelRenderer(this, 23, 7);
            cube_r2.setPos(-1.2305F, 2.2764F, 6.6747F);
            Body.addChild(cube_r2);
            setRotateAngle(cube_r2, -0.0714F, -0.2133F, 0.0151F);
            cube_r2.addBox(-0.5006F, -0.5F, -3.4773F, 1.0F, 1.0F, 7.0F, 0.0F, true);

            cube_r3 = new ZawaModelRenderer(this, 23, 7);
            cube_r3.setPos(1.2305F, 2.2764F, 6.6747F);
            Body.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.0714F, 0.2133F, -0.0151F);
            cube_r3.addBox(-0.4994F, -0.5F, -3.4773F, 1.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 20, 15);
            cube_r4.setPos(1.2305F, 2.2764F, 6.9497F);
            Body.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.0707F, 0.1567F, -0.011F);
            cube_r4.addBox(-1.0426F, -0.6F, -3.3387F, 1.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 9, 14);
            cube_r5.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
            cube_r5.addBox(-1.0F, 1.0722F, 4.1844F, 2.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 24, 0);
            cube_r6.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r6);
            setRotateAngle(cube_r6, -0.2007F, 0.0F, 0.0F);
            cube_r6.addBox(-1.5F, 0.0278F, 1.7399F, 3.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 29, 15);
            cube_r7.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r7);
            setRotateAngle(cube_r7, -0.057F, 0.0958F, -0.0055F);
            cube_r7.addBox(-2.6939F, -0.2051F, 0.4172F, 1.0F, 3.0F, 3.0F, 0.0F, true);

            cube_r8 = new ZawaModelRenderer(this, 29, 15);
            cube_r8.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r8);
            setRotateAngle(cube_r8, -0.057F, -0.0958F, 0.0055F);
            cube_r8.addBox(1.6939F, -0.2051F, 0.4172F, 1.0F, 3.0F, 3.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 28, 27);
            cube_r9.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r9);
            setRotateAngle(cube_r9, -0.2531F, 0.0F, 0.0F);
            cube_r9.addBox(-1.5F, -0.3342F, -0.1108F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 0, 0);
            cube_r10.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r10);
            setRotateAngle(cube_r10, -0.2225F, 0.0F, 0.0F);
            cube_r10.texOffs(0, 10).addBox(0.75F, -0.9008F, -4.7867F, 2.0F, 4.0F, 6.0F, 0.0F, true);
            cube_r10.texOffs(0, 0).addBox(-2.0F, -0.6471F, -5.5034F, 4.0F, 4.0F, 6.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 0, 10);
            cube_r11.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.2225F, 0.0F, 0.0F);
            cube_r11.addBox(-2.75F, -0.9008F, -4.7867F, 2.0F, 4.0F, 6.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 0, 28);
            cube_r12.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r12);
            setRotateAngle(cube_r12, -0.9294F, 0.0F, 0.0F);
            cube_r12.addBox(-1.5F, 3.0408F, -4.1352F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            Head = new ZawaModelRenderer(this, 0, 0);
            Head.setPos(0.0F, 0.0F, 0.0F);
            TURACO.addChild(Head);


            cube_r13 = new ZawaModelRenderer(this, 9, 22);
            cube_r13.setPos(0.0F, 0.0F, 0.0F);
            Head.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.7199F, 0.0F, 0.0F);
            cube_r13.addBox(-0.5F, -0.0188F, -0.0125F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 0, 20);
            cube_r14.setPos(0.0F, 2.7F, 9.075F);
            Head.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.2574F, 0.0F, 0.0F);
            cube_r14.addBox(-0.5F, -4.9403F, -8.101F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 22, 0);
            cube_r15.setPos(0.0F, -3.0691F, 3.8087F);
            Head.addChild(cube_r15);
            setRotateAngle(cube_r15, -1.3526F, 0.0F, 0.0F);
            cube_r15.addBox(-0.475F, -0.0078F, -0.024F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 6, 40);
            cube_r16.setPos(0.0F, -2.1691F, 2.9837F);
            Head.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.0524F, 0.0F, 0.0F);
            cube_r16.addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 16, 41);
            cube_r17.setPos(0.0F, -3.4441F, 1.4837F);
            Head.addChild(cube_r17);
            setRotateAngle(cube_r17, -0.1789F, 0.0F, 0.0F);
            cube_r17.addBox(-0.525F, 0.0815F, -0.1012F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 12, 41);
            cube_r18.setPos(0.0F, -3.4441F, 3.4087F);
            Head.addChild(cube_r18);
            setRotateAngle(cube_r18, 0.2836F, 0.0F, 0.0F);
            cube_r18.addBox(-0.525F, -0.0072F, -0.9993F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 12, 37);
            cube_r19.setPos(0.0F, -1.5191F, 2.7837F);
            Head.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.733F, 0.0F, 0.0F);
            cube_r19.addBox(-0.525F, -1.2541F, -0.546F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 6, 36);
            cube_r20.setPos(0.0F, -1.5191F, 2.7837F);
            Head.addChild(cube_r20);
            setRotateAngle(cube_r20, 0.0524F, 0.0F, 0.0F);
            cube_r20.addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 27, 23);
            cube_r21.setPos(0.0F, -2.6191F, 2.5337F);
            Head.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.8683F, 0.0F, 0.0F);
            cube_r21.addBox(-0.525F, -1.2541F, -0.546F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 0, 0);
            cube_r22.setPos(0.0F, -2.6191F, 2.5337F);
            Head.addChild(cube_r22);
            setRotateAngle(cube_r22, -0.0829F, 0.0F, 0.0F);
            cube_r22.texOffs(0, 10).addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r22.texOffs(0, 10).addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 18, 29);
            cube_r23.setPos(0.0F, -3.7941F, 3.1087F);
            Head.addChild(cube_r23);
            setRotateAngle(cube_r23, -0.1353F, 0.0F, 0.0F);
            cube_r23.addBox(-0.5F, 0.6032F, -1.2245F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r24 = new ZawaModelRenderer(this, 0, 39);
            cube_r24.setPos(0.0F, -0.75F, 0.5104F);
            Head.addChild(cube_r24);
            setRotateAngle(cube_r24, -0.1222F, 0.0F, 0.0F);
            cube_r24.addBox(-0.5F, -0.5362F, -0.839F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r25 = new ZawaModelRenderer(this, 0, 0);
            cube_r25.setPos(0.0F, -0.75F, 0.5104F);
            Head.addChild(cube_r25);
            setRotateAngle(cube_r25, 0.4887F, 0.0F, 0.0F);
            cube_r25.texOffs(0, 33).addBox(-0.25F, -1.0973F, -0.3659F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r25.texOffs(0, 36).addBox(-0.75F, -1.0973F, -0.3659F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r26 = new ZawaModelRenderer(this, 0, 0);
            cube_r26.setPos(0.0F, 2.6F, 8.975F);
            Head.addChild(cube_r26);
            setRotateAngle(cube_r26, 0.2574F, 0.0F, 0.0F);
            cube_r26.addBox(-0.5F, -5.6903F, -6.351F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r27 = new ZawaModelRenderer(this, 10, 30);
            cube_r27.setPos(0.0F, 2.6F, 8.975F);
            Head.addChild(cube_r27);
            setRotateAngle(cube_r27, 0.2793F, 0.0F, 0.0F);
            cube_r27.addBox(-1.0F, -5.6961F, -5.5842F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r28 = new ZawaModelRenderer(this, 18, 23);
            cube_r28.setPos(0.0F, -1.1809F, 2.0748F);
            Head.addChild(cube_r28);
            setRotateAngle(cube_r28, 0.0087F, 0.0F, 0.0F);
            cube_r28.addBox(-1.5F, -0.975F, -1.075F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            LeftLeg = new ZawaModelRenderer(this, 0, 0);
            LeftLeg.setPos(0.0F, 0.0F, 0.0F);
            TURACO.addChild(LeftLeg);


            cube_r29 = new ZawaModelRenderer(this, 10, 12);
            cube_r29.setPos(1.85F, 8.044F, 6.9594F);
            LeftLeg.addChild(cube_r29);
            setRotateAngle(cube_r29, -0.207F, -0.212F, 0.0311F);
            cube_r29.addBox(-1.075F, -0.575F, -0.175F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r30 = new ZawaModelRenderer(this, 0, 23);
            cube_r30.setPos(1.35F, 8.319F, 6.9344F);
            LeftLeg.addChild(cube_r30);
            setRotateAngle(cube_r30, -0.2923F, 0.0F, 0.0F);
            cube_r30.addBox(-0.5F, -3.0615F, -0.543F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r31 = new ZawaModelRenderer(this, 20, 15);
            cube_r31.setPos(1.35F, 8.094F, 6.4127F);
            LeftLeg.addChild(cube_r31);
            setRotateAngle(cube_r31, 0.2478F, 0.2162F, 0.0287F);
            cube_r31.addBox(-0.5677F, -0.6632F, -1.5185F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r32 = new ZawaModelRenderer(this, 14, 3);
            cube_r32.setPos(1.35F, 8.094F, 7.5377F);
            LeftLeg.addChild(cube_r32);
            setRotateAngle(cube_r32, 0.1645F, -0.2297F, -0.0266F);
            cube_r32.addBox(-0.5335F, -0.6764F, -2.0928F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r33 = new ZawaModelRenderer(this, 10, 10);
            cube_r33.setPos(1.35F, 8.094F, 6.4127F);
            LeftLeg.addChild(cube_r33);
            setRotateAngle(cube_r33, -0.2017F, 0.2162F, 0.0287F);
            cube_r33.addBox(-0.5677F, -0.6632F, 0.6065F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r34 = new ZawaModelRenderer(this, 30, 32);
            cube_r34.setPos(1.35F, 6.294F, 7.7844F);
            LeftLeg.addChild(cube_r34);
            setRotateAngle(cube_r34, 0.5934F, 0.0F, 0.0F);
            cube_r34.addBox(-1.0F, -2.9927F, -1.1625F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            RightLeg = new ZawaModelRenderer(this, 0, 0);
            RightLeg.setPos(0.0F, 0.0F, 0.0F);
            TURACO.addChild(RightLeg);


            cube_r35 = new ZawaModelRenderer(this, 24, 5);
            cube_r35.setPos(2.85F, 8.319F, 6.9344F);
            RightLeg.addChild(cube_r35);
            setRotateAngle(cube_r35, -0.2923F, 0.0F, 0.0F);
            cube_r35.addBox(-4.7F, -3.0615F, -0.543F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r36 = new ZawaModelRenderer(this, 0, 14);
            cube_r36.setPos(-1.35F, 8.094F, 6.4127F);
            RightLeg.addChild(cube_r36);
            setRotateAngle(cube_r36, -0.2017F, -0.2162F, -0.0287F);
            cube_r36.addBox(-0.4323F, -0.6632F, 0.6065F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r37 = new ZawaModelRenderer(this, 20, 18);
            cube_r37.setPos(-1.35F, 8.094F, 6.4127F);
            RightLeg.addChild(cube_r37);
            setRotateAngle(cube_r37, 0.2478F, -0.2162F, -0.0287F);
            cube_r37.addBox(-0.4323F, -0.6632F, -1.5185F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r38 = new ZawaModelRenderer(this, 18, 1);
            cube_r38.setPos(-1.35F, 8.094F, 7.5377F);
            RightLeg.addChild(cube_r38);
            setRotateAngle(cube_r38, 0.1645F, 0.2297F, 0.0266F);
            cube_r38.addBox(-0.4665F, -0.6764F, -2.0928F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r39 = new ZawaModelRenderer(this, 14, 0);
            cube_r39.setPos(-1.85F, 8.044F, 6.9594F);
            RightLeg.addChild(cube_r39);
            setRotateAngle(cube_r39, -0.207F, 0.212F, -0.0311F);
            cube_r39.addBox(0.075F, -0.575F, -0.175F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r40 = new ZawaModelRenderer(this, 30, 32);
            cube_r40.setPos(-1.35F, 6.294F, 7.7844F);
            RightLeg.addChild(cube_r40);
            setRotateAngle(cube_r40, 0.5934F, 0.0F, 0.0F);
            cube_r40.addBox(-1.0F, -2.9927F, -1.1625F, 2.0F, 3.0F, 2.0F, 0.0F, true);
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
        protected ZawaModelRenderer Head;
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
        protected ZawaModelRenderer LeftLeg;
        protected ZawaModelRenderer cube_r29;
        protected ZawaModelRenderer cube_r30;
        protected ZawaModelRenderer cube_r31;
        protected ZawaModelRenderer cube_r32;
        protected ZawaModelRenderer cube_r33;
        protected ZawaModelRenderer cube_r34;
        protected ZawaModelRenderer RightLeg;
        protected ZawaModelRenderer cube_r35;
        protected ZawaModelRenderer cube_r36;
        protected ZawaModelRenderer cube_r37;
        protected ZawaModelRenderer cube_r38;
        protected ZawaModelRenderer cube_r39;
        protected ZawaModelRenderer cube_r40;

        public Child() {
            texWidth = 64;
            texHeight = 64;

            TURACO = new ZawaModelRenderer(this, 0, 0);
            TURACO.setPos(0.0F, 15.206F, -9.2594F);


            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, 2.925F, 9.45F);
            TURACO.addChild(Body);
            setRotateAngle(Body, -0.0873F, 0.0F, 0.0F);


            cube_r1 = new ZawaModelRenderer(this, 20, 15);
            cube_r1.setPos(-1.2305F, 2.2764F, 6.9497F);
            Body.addChild(cube_r1);
            setRotateAngle(cube_r1, -0.0707F, -0.1567F, 0.011F);
            cube_r1.addBox(0.0426F, -0.6F, -3.3387F, 1.0F, 1.0F, 7.0F, 0.0F, true);

            cube_r2 = new ZawaModelRenderer(this, 23, 7);
            cube_r2.setPos(-1.2305F, 2.2764F, 6.6747F);
            Body.addChild(cube_r2);
            setRotateAngle(cube_r2, -0.0714F, -0.2133F, 0.0151F);
            cube_r2.addBox(-0.5006F, -0.5F, -3.4773F, 1.0F, 1.0F, 7.0F, 0.0F, true);

            cube_r3 = new ZawaModelRenderer(this, 23, 7);
            cube_r3.setPos(1.2305F, 2.2764F, 6.6747F);
            Body.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.0714F, 0.2133F, -0.0151F);
            cube_r3.addBox(-0.4994F, -0.5F, -3.4773F, 1.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 20, 15);
            cube_r4.setPos(1.2305F, 2.2764F, 6.9497F);
            Body.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.0707F, 0.1567F, -0.011F);
            cube_r4.addBox(-1.0426F, -0.6F, -3.3387F, 1.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 9, 14);
            cube_r5.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
            cube_r5.addBox(-1.0F, 1.0722F, 4.1844F, 2.0F, 1.0F, 7.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 24, 0);
            cube_r6.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r6);
            setRotateAngle(cube_r6, -0.2007F, 0.0F, 0.0F);
            cube_r6.addBox(-1.5F, 0.0278F, 1.7399F, 3.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 29, 15);
            cube_r7.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r7);
            setRotateAngle(cube_r7, -0.057F, 0.0958F, -0.0055F);
            cube_r7.addBox(-2.6939F, -0.2051F, 0.4172F, 1.0F, 3.0F, 3.0F, 0.0F, true);

            cube_r8 = new ZawaModelRenderer(this, 29, 15);
            cube_r8.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r8);
            setRotateAngle(cube_r8, -0.057F, -0.0958F, 0.0055F);
            cube_r8.addBox(1.6939F, -0.2051F, 0.4172F, 1.0F, 3.0F, 3.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 28, 27);
            cube_r9.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r9);
            setRotateAngle(cube_r9, -0.2531F, 0.0F, 0.0F);
            cube_r9.addBox(-1.5F, -0.3342F, -0.1108F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 0, 0);
            cube_r10.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r10);
            setRotateAngle(cube_r10, -0.2225F, 0.0F, 0.0F);
            cube_r10.texOffs(0, 10).addBox(0.75F, -0.9008F, -4.7867F, 2.0F, 4.0F, 6.0F, 0.0F, true);
            cube_r10.texOffs(0, 0).addBox(-2.0F, -0.6471F, -5.5034F, 4.0F, 4.0F, 6.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 0, 10);
            cube_r11.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.2225F, 0.0F, 0.0F);
            cube_r11.addBox(-2.75F, -0.9008F, -4.7867F, 2.0F, 4.0F, 6.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 0, 28);
            cube_r12.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(cube_r12);
            setRotateAngle(cube_r12, -0.9294F, 0.0F, 0.0F);
            cube_r12.addBox(-1.5F, 3.0408F, -4.1352F, 3.0F, 3.0F, 2.0F, 0.0F, false);

            Head = new ZawaModelRenderer(this, 0, 0);
            Head.setPos(0.0F, 0.0F, 0.0F);
            TURACO.addChild(Head);


            cube_r13 = new ZawaModelRenderer(this, 9, 22);
            cube_r13.setPos(0.0F, 0.0F, 0.0F);
            Head.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.7199F, 0.0F, 0.0F);
            cube_r13.addBox(-0.5F, -0.0188F, -0.0125F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 0, 20);
            cube_r14.setPos(0.0F, 2.7F, 9.075F);
            Head.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.2574F, 0.0F, 0.0F);
            cube_r14.addBox(-0.5F, -4.9403F, -8.101F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 22, 0);
            cube_r15.setPos(0.0F, -3.0691F, 3.8087F);
            Head.addChild(cube_r15);
            setRotateAngle(cube_r15, -1.3526F, 0.0F, 0.0F);
            cube_r15.addBox(-0.475F, -0.0078F, -0.024F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 6, 40);
            cube_r16.setPos(0.0F, -2.1691F, 2.9837F);
            Head.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.0524F, 0.0F, 0.0F);
            cube_r16.addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 16, 41);
            cube_r17.setPos(0.0F, -3.4441F, 1.4837F);
            Head.addChild(cube_r17);
            setRotateAngle(cube_r17, -0.1789F, 0.0F, 0.0F);
            cube_r17.addBox(-0.525F, 0.0815F, -0.1012F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 12, 41);
            cube_r18.setPos(0.0F, -3.4441F, 3.4087F);
            Head.addChild(cube_r18);
            setRotateAngle(cube_r18, 0.2836F, 0.0F, 0.0F);
            cube_r18.addBox(-0.525F, -0.0072F, -0.9993F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 12, 37);
            cube_r19.setPos(0.0F, -1.5191F, 2.7837F);
            Head.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.733F, 0.0F, 0.0F);
            cube_r19.addBox(-0.525F, -1.2541F, -0.546F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 6, 36);
            cube_r20.setPos(0.0F, -1.5191F, 2.7837F);
            Head.addChild(cube_r20);
            setRotateAngle(cube_r20, 0.0524F, 0.0F, 0.0F);
            cube_r20.addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 27, 23);
            cube_r21.setPos(0.0F, -2.6191F, 2.5337F);
            Head.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.8683F, 0.0F, 0.0F);
            cube_r21.addBox(-0.525F, -1.2541F, -0.546F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 0, 0);
            cube_r22.setPos(0.0F, -2.6191F, 2.5337F);
            Head.addChild(cube_r22);
            setRotateAngle(cube_r22, -0.0829F, 0.0F, 0.0F);
            cube_r22.texOffs(0, 10).addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r22.texOffs(0, 10).addBox(-0.5F, -1.2654F, -1.4988F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 18, 29);
            cube_r23.setPos(0.0F, -3.7941F, 3.1087F);
            Head.addChild(cube_r23);
            setRotateAngle(cube_r23, -0.1353F, 0.0F, 0.0F);
            cube_r23.addBox(-0.5F, 0.6032F, -1.2245F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r24 = new ZawaModelRenderer(this, 0, 39);
            cube_r24.setPos(0.0F, -0.75F, 0.5104F);
            Head.addChild(cube_r24);
            setRotateAngle(cube_r24, -0.1222F, 0.0F, 0.0F);
            cube_r24.addBox(-0.5F, -0.5362F, -0.839F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r25 = new ZawaModelRenderer(this, 0, 0);
            cube_r25.setPos(0.0F, -0.75F, 0.5104F);
            Head.addChild(cube_r25);
            setRotateAngle(cube_r25, 0.4887F, 0.0F, 0.0F);
            cube_r25.texOffs(0, 33).addBox(-0.25F, -1.0973F, -0.3659F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r25.texOffs(0, 36).addBox(-0.75F, -1.0973F, -0.3659F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r26 = new ZawaModelRenderer(this, 0, 0);
            cube_r26.setPos(0.0F, 2.6F, 8.975F);
            Head.addChild(cube_r26);
            setRotateAngle(cube_r26, 0.2574F, 0.0F, 0.0F);
            cube_r26.addBox(-0.5F, -5.6903F, -6.351F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r27 = new ZawaModelRenderer(this, 10, 30);
            cube_r27.setPos(0.0F, 2.6F, 8.975F);
            Head.addChild(cube_r27);
            setRotateAngle(cube_r27, 0.2793F, 0.0F, 0.0F);
            cube_r27.addBox(-1.0F, -5.6961F, -5.5842F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r28 = new ZawaModelRenderer(this, 18, 23);
            cube_r28.setPos(0.0F, -1.1809F, 2.0748F);
            Head.addChild(cube_r28);
            setRotateAngle(cube_r28, 0.0087F, 0.0F, 0.0F);
            cube_r28.addBox(-1.5F, -0.975F, -1.075F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            LeftLeg = new ZawaModelRenderer(this, 0, 0);
            LeftLeg.setPos(0.0F, 0.0F, 0.0F);
            TURACO.addChild(LeftLeg);


            cube_r29 = new ZawaModelRenderer(this, 10, 12);
            cube_r29.setPos(1.85F, 8.044F, 6.9594F);
            LeftLeg.addChild(cube_r29);
            setRotateAngle(cube_r29, -0.207F, -0.212F, 0.0311F);
            cube_r29.addBox(-1.075F, -0.575F, -0.175F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r30 = new ZawaModelRenderer(this, 0, 23);
            cube_r30.setPos(1.35F, 8.319F, 6.9344F);
            LeftLeg.addChild(cube_r30);
            setRotateAngle(cube_r30, -0.2923F, 0.0F, 0.0F);
            cube_r30.addBox(-0.5F, -3.0615F, -0.543F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r31 = new ZawaModelRenderer(this, 20, 15);
            cube_r31.setPos(1.35F, 8.094F, 6.4127F);
            LeftLeg.addChild(cube_r31);
            setRotateAngle(cube_r31, 0.2478F, 0.2162F, 0.0287F);
            cube_r31.addBox(-0.5677F, -0.6632F, -1.5185F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r32 = new ZawaModelRenderer(this, 14, 3);
            cube_r32.setPos(1.35F, 8.094F, 7.5377F);
            LeftLeg.addChild(cube_r32);
            setRotateAngle(cube_r32, 0.1645F, -0.2297F, -0.0266F);
            cube_r32.addBox(-0.5335F, -0.6764F, -2.0928F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r33 = new ZawaModelRenderer(this, 10, 10);
            cube_r33.setPos(1.35F, 8.094F, 6.4127F);
            LeftLeg.addChild(cube_r33);
            setRotateAngle(cube_r33, -0.2017F, 0.2162F, 0.0287F);
            cube_r33.addBox(-0.5677F, -0.6632F, 0.6065F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r34 = new ZawaModelRenderer(this, 30, 32);
            cube_r34.setPos(1.35F, 6.294F, 7.7844F);
            LeftLeg.addChild(cube_r34);
            setRotateAngle(cube_r34, 0.5934F, 0.0F, 0.0F);
            cube_r34.addBox(-1.0F, -2.9927F, -1.1625F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            RightLeg = new ZawaModelRenderer(this, 0, 0);
            RightLeg.setPos(0.0F, 0.0F, 0.0F);
            TURACO.addChild(RightLeg);


            cube_r35 = new ZawaModelRenderer(this, 24, 5);
            cube_r35.setPos(2.85F, 8.319F, 6.9344F);
            RightLeg.addChild(cube_r35);
            setRotateAngle(cube_r35, -0.2923F, 0.0F, 0.0F);
            cube_r35.addBox(-4.7F, -3.0615F, -0.543F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r36 = new ZawaModelRenderer(this, 0, 14);
            cube_r36.setPos(-1.35F, 8.094F, 6.4127F);
            RightLeg.addChild(cube_r36);
            setRotateAngle(cube_r36, -0.2017F, -0.2162F, -0.0287F);
            cube_r36.addBox(-0.4323F, -0.6632F, 0.6065F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r37 = new ZawaModelRenderer(this, 20, 18);
            cube_r37.setPos(-1.35F, 8.094F, 6.4127F);
            RightLeg.addChild(cube_r37);
            setRotateAngle(cube_r37, 0.2478F, -0.2162F, -0.0287F);
            cube_r37.addBox(-0.4323F, -0.6632F, -1.5185F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r38 = new ZawaModelRenderer(this, 18, 1);
            cube_r38.setPos(-1.35F, 8.094F, 7.5377F);
            RightLeg.addChild(cube_r38);
            setRotateAngle(cube_r38, 0.1645F, 0.2297F, 0.0266F);
            cube_r38.addBox(-0.4665F, -0.6764F, -2.0928F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r39 = new ZawaModelRenderer(this, 14, 0);
            cube_r39.setPos(-1.85F, 8.044F, 6.9594F);
            RightLeg.addChild(cube_r39);
            setRotateAngle(cube_r39, -0.207F, 0.212F, -0.0311F);
            cube_r39.addBox(0.075F, -0.575F, -0.175F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r40 = new ZawaModelRenderer(this, 30, 32);
            cube_r40.setPos(-1.35F, 6.294F, 7.7844F);
            RightLeg.addChild(cube_r40);
            setRotateAngle(cube_r40, 0.5934F, 0.0F, 0.0F);
            cube_r40.addBox(-1.0F, -2.9927F, -1.1625F, 2.0F, 3.0F, 2.0F, 0.0F, true);
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
