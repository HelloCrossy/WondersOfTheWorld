package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class BongoModel extends ZawaBaseModel<BongoEntity> {
    protected ZawaModelRenderer MAIN;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(MAIN);
        }

        return this.parts;
    }

    public static class Adult extends BongoModel {

        protected ZawaModelRenderer BONGO;
        protected ZawaModelRenderer HEAD;
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
        protected ZawaModelRenderer BODY;
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
        protected ZawaModelRenderer LEFTFRONT;
        protected ZawaModelRenderer ArmBase_r1;
        protected ZawaModelRenderer RIGHTFRONT;
        protected ZawaModelRenderer ArmBase_r2;
        protected ZawaModelRenderer LEFTBACK;
        protected ZawaModelRenderer UpperLeg_r1;
        protected ZawaModelRenderer Thigh_r1;
        protected ZawaModelRenderer RIGHTBACk;
        protected ZawaModelRenderer UpperLeg_r2;
        protected ZawaModelRenderer Thigh_r2;

        public Adult() {
            texWidth = 64;
            texHeight = 64;

            BONGO = new ZawaModelRenderer(this, 0, 0);
            BONGO.setPos(0.0F, -1.6219F, -15.3004F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(HEAD);


            cube_r1 = new ZawaModelRenderer(this, 97, 31);
            cube_r1.setPos(0.0F, 0.0F, 0.0F);
            HEAD.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.0305F, 0.0F, 0.0F);
            cube_r1.addBox(-2.5F, -0.0031F, -2.2246F, 5.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 101, 41);
            cube_r2.setPos(0.0F, 0.1251F, -2.1219F);
            HEAD.addChild(cube_r2);
            setRotateAngle(cube_r2, 0.8988F, 0.0F, 0.0F);
            cube_r2.addBox(-1.0F, -0.026F, -4.1433F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 111, 25);
            cube_r3.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.5361F, 0.0798F, 0.2312F);
            cube_r3.addBox(1.1716F, 0.7518F, -1.4385F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 114, 16);
            cube_r4.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.5682F, 0.0815F, 0.348F);
            cube_r4.addBox(0.3689F, -5.2086F, -0.5573F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 98, 16);
            cube_r5.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.5682F, -0.0815F, -0.348F);
            cube_r5.addBox(-1.3689F, -5.2086F, -0.5573F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 113, 28);
            cube_r6.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r6);
            setRotateAngle(cube_r6, -0.7769F, -0.2114F, 0.0162F);
            cube_r6.addBox(1.2108F, -1.826F, -1.0121F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 98, 25);
            cube_r7.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r7);
            setRotateAngle(cube_r7, -0.5361F, -0.0798F, -0.2312F);
            cube_r7.addBox(-3.1716F, 0.7518F, -1.4385F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 99, 20);
            cube_r8.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r8);
            setRotateAngle(cube_r8, -0.7769F, 0.2114F, -0.0162F);
            cube_r8.addBox(-2.2108F, -1.826F, -1.0121F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 0, 0);
            cube_r9.setPos(0.0F, 3.1101F, -2.6633F);
            HEAD.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.3098F, 0.0F, 0.0F);
            cube_r9.texOffs(91, 42).addBox(-0.75F, -0.3835F, -1.6227F, 2.0F, 2.0F, 3.0F, 0.0F, false);
            cube_r9.texOffs(91, 42).addBox(-1.25F, -0.3835F, -1.6227F, 2.0F, 2.0F, 3.0F, 0.0F, true);

            cube_r10 = new ZawaModelRenderer(this, 102, 49);
            cube_r10.setPos(0.0F, 3.1101F, -2.6633F);
            HEAD.addChild(cube_r10);
            setRotateAngle(cube_r10, 0.5192F, 0.0F, 0.0F);
            cube_r10.addBox(-1.5F, -0.8085F, -2.5977F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 92, 33);
            cube_r11.setPos(-2.1973F, 0.5158F, 1.7054F);
            HEAD.addChild(cube_r11);
            setRotateAngle(cube_r11, 0.5681F, 0.5207F, 0.6628F);
            cube_r11.addBox(-2.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 112, 33);
            cube_r12.setPos(2.1973F, 0.5158F, 1.7054F);
            HEAD.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.5681F, -0.5207F, -0.6628F);
            cube_r12.addBox(-1.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 102, 53);
            cube_r13.setPos(0.0F, 3.1851F, -2.6633F);
            HEAD.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.1353F, 0.0F, 0.0F);
            cube_r13.addBox(-1.0F, -0.0835F, -1.7977F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(BODY);


            cube_r14 = new ZawaModelRenderer(this, 89, 63);
            cube_r14.setPos(0.0F, 4.6852F, 2.3741F);
            BODY.addChild(cube_r14);
            setRotateAngle(cube_r14, -0.6109F, 0.0F, 0.0F);
            cube_r14.addBox(-2.0F, -3.8F, -2.375F, 4.0F, 5.0F, 8.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 82, 105);
            cube_r15.setPos(0.0836F, 8.3532F, 15.3529F);
            BODY.addChild(cube_r15);
            setRotateAngle(cube_r15, 0.0F, 0.0075F, -0.0045F);
            cube_r15.addBox(-3.5F, -5.5F, -5.5F, 7.0F, 11.0F, 12.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this,79, 0);
            cube_r16.setPos(-2.4767F, 8.3532F, 15.3529F);
            BODY.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.0F, 0.0075F, -0.0045F);
            cube_r16.addBox(1.5F, -6.0F, -5.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 89, 76);
            cube_r17.setPos(-0.5F, 6.1268F, 2.7309F);
            BODY.addChild(cube_r17);
            setRotateAngle(cube_r17, -0.8247F, 0.0F, 0.0F);
            cube_r17.addBox(-1.0F, -3.15F, -2.775F, 3.0F, 4.0F, 9.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 89, 89);
            cube_r18.setPos(0.0F, 8.3945F, 7.803F);
            BODY.addChild(cube_r18);
            setRotateAngle(cube_r18, 0.096F, 0.0F, 0.0F);
            cube_r18.addBox(-3.0F, -5.05F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 63, 5);
            cube_r19.setPos(-2.0F, 8.3945F, 7.803F);
            BODY.addChild(cube_r19);
            setRotateAngle(cube_r19, 0.2094F, 0.0F, 0.0F);
            cube_r19.addBox(1.0F, -5.4F, -2.25F, 2.0F, 1.0F, 6.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 110, 7);
            cube_r20.setPos(0.0F, 2.3709F, 22.3368F);
            BODY.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.3665F, 0.0F, 0.0F);
            cube_r20.addBox(-1.0F, -0.0069F, -0.0198F, 2.0F, 1.0F, 5.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 58, 112);
            cube_r21.setPos(0.0F, 8.4618F, 21.6714F);
            BODY.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.2225F, 0.0F, 0.0F);
            cube_r21.addBox(-3.0F, -5.4F, -1.025F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 13, 99);
            cube_r22.setPos(0.0F, 8.0966F, 27.6848F);
            BODY.addChild(cube_r22);
            setRotateAngle(cube_r22, -1.405F, 0.0F, 0.0F);
            cube_r22.addBox(-1.0F, -0.6488F, -3.6975F, 2.0F, 2.0F, 5.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 16, 106);
            cube_r23.setPos(0.0F, 9.0716F, 27.9848F);
            BODY.addChild(cube_r23);
            setRotateAngle(cube_r23, -1.597F, 0.0F, 0.0F);
            cube_r23.addBox(-1.0F, -0.5488F, 0.1525F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r24 = new ZawaModelRenderer(this, 0, 0);
            cube_r24.setPos(0.0F, 9.0716F, 27.3848F);
            BODY.addChild(cube_r24);
            setRotateAngle(cube_r24, -1.5752F, 0.0F, 0.0F);
            cube_r24.texOffs(15, 118).addBox(-1.0F, -0.9988F, 4.5025F, 2.0F, 2.0F, 3.0F, 0.0F, false);
            cube_r24.texOffs(12, 110).addBox(-1.5F, -1.6238F, 1.7025F, 3.0F, 3.0F, 5.0F, 0.0F, false);

            LEFTFRONT = new ZawaModelRenderer(this, 0, 0);
            LEFTFRONT.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(LEFTFRONT);
            LEFTFRONT.texOffs(34, 87).addBox(1.05F, 14.7969F, 6.9254F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            LEFTFRONT.texOffs(36, 94).addBox(1.375F, 18.502F, 7.4009F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            LEFTFRONT.texOffs(36, 103).addBox(1.325F, 23.6219F, 6.8004F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            ArmBase_r1 = new ZawaModelRenderer(this, 32, 75);
            ArmBase_r1.setPos(0.85F, 15.6719F, 4.1504F);
            LEFTFRONT.addChild(ArmBase_r1);
            setRotateAngle(ArmBase_r1, 0.0742F, 0.0F, 0.0F);
            ArmBase_r1.addBox(0.25F, -6.75F, 1.675F, 3.0F, 7.0F, 5.0F, 0.0F, false);

            RIGHTFRONT = new ZawaModelRenderer(this, 0, 0);
            RIGHTFRONT.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(RIGHTFRONT);
            RIGHTFRONT.texOffs(36, 59).addBox(-3.375F, 18.502F, 7.4009F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            RIGHTFRONT.texOffs(36, 67).addBox(-3.325F, 23.6219F, 6.8004F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            RIGHTFRONT.texOffs(34, 52).addBox(-4.05F, 14.7969F, 6.9254F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            ArmBase_r2 = new ZawaModelRenderer(this, 32, 40);
            ArmBase_r2.setPos(-0.85F, 15.6719F, 4.1504F);
            RIGHTFRONT.addChild(ArmBase_r2);
            setRotateAngle(ArmBase_r2, 0.0742F, 0.0F, 0.0F);
            ArmBase_r2.addBox(-3.25F, -6.75F, 1.675F, 3.0F, 7.0F, 5.0F, 0.0F, false);

            LEFTBACK = new ZawaModelRenderer(this, 0, 0);
            LEFTBACK.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(LEFTBACK);
            LEFTBACK.texOffs(62, 97).addBox(1.5F, 17.6464F, 23.587F, 2.0F, 7.0F, 2.0F, 0.0F, false);
            LEFTBACK.texOffs(62, 106).addBox(1.575F, 23.6219F, 22.8754F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            UpperLeg_r1 = new ZawaModelRenderer(this, 60, 89);
            UpperLeg_r1.setPos(2.475F, 16.216F, 23.0761F);
            LEFTBACK.addChild(UpperLeg_r1);
            setRotateAngle(UpperLeg_r1, 0.4014F, 0.0F, 0.0F);
            UpperLeg_r1.addBox(-1.5F, -2.5F, -1.225F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Thigh_r1 = new ZawaModelRenderer(this, 57, 76);
            Thigh_r1.setPos(3.0F, 11.1887F, 23.4695F);
            LEFTBACK.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, -0.0872F, -0.0027F, -0.0304F);
            Thigh_r1.addBox(-2.5F, -4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);

            RIGHTBACk = new ZawaModelRenderer(this, 0, 0);
            RIGHTBACk.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(RIGHTBACk);
            RIGHTBACk.texOffs(61, 58).addBox(-3.5F, 17.6464F, 23.587F, 2.0F, 7.0F, 2.0F, 0.0F, false);
            RIGHTBACk.texOffs(61, 67).addBox(-3.575F, 23.6219F, 22.8754F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            UpperLeg_r2 = new ZawaModelRenderer(this, 59, 50);
            UpperLeg_r2.setPos(-2.475F, 16.216F, 23.0761F);
            RIGHTBACk.addChild(UpperLeg_r2);
            setRotateAngle(UpperLeg_r2, 0.4014F, 0.0F, 0.0F);
            UpperLeg_r2.addBox(-1.5F, -2.5F, -1.225F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Thigh_r2 = new ZawaModelRenderer(this, 55, 37);
            Thigh_r2.setPos(-3.0F, 11.1887F, 23.4695F);
            RIGHTBACk.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, -0.0872F, 0.0027F, 0.0304F);
            Thigh_r2.addBox(-1.5F, -4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);

            this.saveBase();

        }

        @Override
        public void setupAnim(BongoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }

    public static class Child extends BongoModel {

        protected ZawaModelRenderer BONGO;
        protected ZawaModelRenderer HEAD;
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
        protected ZawaModelRenderer BODY;
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
        protected ZawaModelRenderer LEFTFRONT;
        protected ZawaModelRenderer ArmBase_r1;
        protected ZawaModelRenderer RIGHTFRONT;
        protected ZawaModelRenderer ArmBase_r2;
        protected ZawaModelRenderer LEFTBACK;
        protected ZawaModelRenderer UpperLeg_r1;
        protected ZawaModelRenderer Thigh_r1;
        protected ZawaModelRenderer RIGHTBACk;
        protected ZawaModelRenderer UpperLeg_r2;
        protected ZawaModelRenderer Thigh_r2;

        public Child() {
            texWidth = 64;
            texHeight = 64;

            BONGO = new ZawaModelRenderer(this, 0, 0);
            BONGO.setPos(0.0F, -1.6219F, -15.3004F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(HEAD);


            cube_r1 = new ZawaModelRenderer(this, 97, 31);
            cube_r1.setPos(0.0F, 0.0F, 0.0F);
            HEAD.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.0305F, 0.0F, 0.0F);
            cube_r1.addBox(-2.5F, -0.0031F, -2.2246F, 5.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 101, 41);
            cube_r2.setPos(0.0F, 0.1251F, -2.1219F);
            HEAD.addChild(cube_r2);
            setRotateAngle(cube_r2, 0.8988F, 0.0F, 0.0F);
            cube_r2.addBox(-1.0F, -0.026F, -4.1433F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 111, 25);
            cube_r3.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.5361F, 0.0798F, 0.2312F);
            cube_r3.addBox(1.1716F, 0.7518F, -1.4385F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 114, 16);
            cube_r4.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.5682F, 0.0815F, 0.348F);
            cube_r4.addBox(0.3689F, -5.2086F, -0.5573F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 98, 16);
            cube_r5.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.5682F, -0.0815F, -0.348F);
            cube_r5.addBox(-1.3689F, -5.2086F, -0.5573F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 113, 28);
            cube_r6.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r6);
            setRotateAngle(cube_r6, -0.7769F, -0.2114F, 0.0162F);
            cube_r6.addBox(1.2108F, -1.826F, -1.0121F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 98, 25);
            cube_r7.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r7);
            setRotateAngle(cube_r7, -0.5361F, -0.0798F, -0.2312F);
            cube_r7.addBox(-3.1716F, 0.7518F, -1.4385F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 99, 20);
            cube_r8.setPos(0.0F, -2.998F, 1.7938F);
            HEAD.addChild(cube_r8);
            setRotateAngle(cube_r8, -0.7769F, 0.2114F, -0.0162F);
            cube_r8.addBox(-2.2108F, -1.826F, -1.0121F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 0, 0);
            cube_r9.setPos(0.0F, 3.1101F, -2.6633F);
            HEAD.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.3098F, 0.0F, 0.0F);
            cube_r9.texOffs(91, 42).addBox(-0.75F, -0.3835F, -1.6227F, 2.0F, 2.0F, 3.0F, 0.0F, false);
            cube_r9.texOffs(91, 42).addBox(-1.25F, -0.3835F, -1.6227F, 2.0F, 2.0F, 3.0F, 0.0F, true);

            cube_r10 = new ZawaModelRenderer(this, 102, 49);
            cube_r10.setPos(0.0F, 3.1101F, -2.6633F);
            HEAD.addChild(cube_r10);
            setRotateAngle(cube_r10, 0.5192F, 0.0F, 0.0F);
            cube_r10.addBox(-1.5F, -0.8085F, -2.5977F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 92, 33);
            cube_r11.setPos(-2.1973F, 0.5158F, 1.7054F);
            HEAD.addChild(cube_r11);
            setRotateAngle(cube_r11, 0.5681F, 0.5207F, 0.6628F);
            cube_r11.addBox(-2.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 112, 33);
            cube_r12.setPos(2.1973F, 0.5158F, 1.7054F);
            HEAD.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.5681F, -0.5207F, -0.6628F);
            cube_r12.addBox(-1.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 102, 53);
            cube_r13.setPos(0.0F, 3.1851F, -2.6633F);
            HEAD.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.1353F, 0.0F, 0.0F);
            cube_r13.addBox(-1.0F, -0.0835F, -1.7977F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(BODY);


            cube_r14 = new ZawaModelRenderer(this, 89, 63);
            cube_r14.setPos(0.0F, 4.6852F, 2.3741F);
            BODY.addChild(cube_r14);
            setRotateAngle(cube_r14, -0.6109F, 0.0F, 0.0F);
            cube_r14.addBox(-2.0F, -3.8F, -2.375F, 4.0F, 5.0F, 8.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 82, 105);
            cube_r15.setPos(0.0836F, 8.3532F, 15.3529F);
            BODY.addChild(cube_r15);
            setRotateAngle(cube_r15, 0.0F, 0.0075F, -0.0045F);
            cube_r15.addBox(-3.5F, -5.5F, -5.5F, 7.0F, 11.0F, 12.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this,79, 0);
            cube_r16.setPos(-2.4767F, 8.3532F, 15.3529F);
            BODY.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.0F, 0.0075F, -0.0045F);
            cube_r16.addBox(1.5F, -6.0F, -5.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 89, 76);
            cube_r17.setPos(-0.5F, 6.1268F, 2.7309F);
            BODY.addChild(cube_r17);
            setRotateAngle(cube_r17, -0.8247F, 0.0F, 0.0F);
            cube_r17.addBox(-1.0F, -3.15F, -2.775F, 3.0F, 4.0F, 9.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 89, 89);
            cube_r18.setPos(0.0F, 8.3945F, 7.803F);
            BODY.addChild(cube_r18);
            setRotateAngle(cube_r18, 0.096F, 0.0F, 0.0F);
            cube_r18.addBox(-3.0F, -5.05F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 63, 5);
            cube_r19.setPos(-2.0F, 8.3945F, 7.803F);
            BODY.addChild(cube_r19);
            setRotateAngle(cube_r19, 0.2094F, 0.0F, 0.0F);
            cube_r19.addBox(1.0F, -5.4F, -2.25F, 2.0F, 1.0F, 6.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 110, 7);
            cube_r20.setPos(0.0F, 2.3709F, 22.3368F);
            BODY.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.3665F, 0.0F, 0.0F);
            cube_r20.addBox(-1.0F, -0.0069F, -0.0198F, 2.0F, 1.0F, 5.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 58, 112);
            cube_r21.setPos(0.0F, 8.4618F, 21.6714F);
            BODY.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.2225F, 0.0F, 0.0F);
            cube_r21.addBox(-3.0F, -5.4F, -1.025F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 13, 99);
            cube_r22.setPos(0.0F, 8.0966F, 27.6848F);
            BODY.addChild(cube_r22);
            setRotateAngle(cube_r22, -1.405F, 0.0F, 0.0F);
            cube_r22.addBox(-1.0F, -0.6488F, -3.6975F, 2.0F, 2.0F, 5.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 16, 106);
            cube_r23.setPos(0.0F, 9.0716F, 27.9848F);
            BODY.addChild(cube_r23);
            setRotateAngle(cube_r23, -1.597F, 0.0F, 0.0F);
            cube_r23.addBox(-1.0F, -0.5488F, 0.1525F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r24 = new ZawaModelRenderer(this, 0, 0);
            cube_r24.setPos(0.0F, 9.0716F, 27.3848F);
            BODY.addChild(cube_r24);
            setRotateAngle(cube_r24, -1.5752F, 0.0F, 0.0F);
            cube_r24.texOffs(15, 118).addBox(-1.0F, -0.9988F, 4.5025F, 2.0F, 2.0F, 3.0F, 0.0F, false);
            cube_r24.texOffs(12, 110).addBox(-1.5F, -1.6238F, 1.7025F, 3.0F, 3.0F, 5.0F, 0.0F, false);

            LEFTFRONT = new ZawaModelRenderer(this, 0, 0);
            LEFTFRONT.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(LEFTFRONT);
            LEFTFRONT.texOffs(34, 87).addBox(1.05F, 14.7969F, 6.9254F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            LEFTFRONT.texOffs(36, 94).addBox(1.375F, 18.502F, 7.4009F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            LEFTFRONT.texOffs(36, 103).addBox(1.325F, 23.6219F, 6.8004F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            ArmBase_r1 = new ZawaModelRenderer(this, 32, 75);
            ArmBase_r1.setPos(0.85F, 15.6719F, 4.1504F);
            LEFTFRONT.addChild(ArmBase_r1);
            setRotateAngle(ArmBase_r1, 0.0742F, 0.0F, 0.0F);
            ArmBase_r1.addBox(0.25F, -6.75F, 1.675F, 3.0F, 7.0F, 5.0F, 0.0F, false);

            RIGHTFRONT = new ZawaModelRenderer(this, 0, 0);
            RIGHTFRONT.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(RIGHTFRONT);
            RIGHTFRONT.texOffs(36, 59).addBox(-3.375F, 18.502F, 7.4009F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            RIGHTFRONT.texOffs(36, 67).addBox(-3.325F, 23.6219F, 6.8004F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            RIGHTFRONT.texOffs(34, 52).addBox(-4.05F, 14.7969F, 6.9254F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            ArmBase_r2 = new ZawaModelRenderer(this, 32, 40);
            ArmBase_r2.setPos(-0.85F, 15.6719F, 4.1504F);
            RIGHTFRONT.addChild(ArmBase_r2);
            setRotateAngle(ArmBase_r2, 0.0742F, 0.0F, 0.0F);
            ArmBase_r2.addBox(-3.25F, -6.75F, 1.675F, 3.0F, 7.0F, 5.0F, 0.0F, false);

            LEFTBACK = new ZawaModelRenderer(this, 0, 0);
            LEFTBACK.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(LEFTBACK);
            LEFTBACK.texOffs(62, 97).addBox(1.5F, 17.6464F, 23.587F, 2.0F, 7.0F, 2.0F, 0.0F, false);
            LEFTBACK.texOffs(62, 106).addBox(1.575F, 23.6219F, 22.8754F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            UpperLeg_r1 = new ZawaModelRenderer(this, 60, 89);
            UpperLeg_r1.setPos(2.475F, 16.216F, 23.0761F);
            LEFTBACK.addChild(UpperLeg_r1);
            setRotateAngle(UpperLeg_r1, 0.4014F, 0.0F, 0.0F);
            UpperLeg_r1.addBox(-1.5F, -2.5F, -1.225F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Thigh_r1 = new ZawaModelRenderer(this, 57, 76);
            Thigh_r1.setPos(3.0F, 11.1887F, 23.4695F);
            LEFTBACK.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, -0.0872F, -0.0027F, -0.0304F);
            Thigh_r1.addBox(-2.5F, -4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);

            RIGHTBACk = new ZawaModelRenderer(this, 0, 0);
            RIGHTBACk.setPos(0.0F, 0.0F, 0.0F);
            BONGO.addChild(RIGHTBACk);
            RIGHTBACk.texOffs(61, 58).addBox(-3.5F, 17.6464F, 23.587F, 2.0F, 7.0F, 2.0F, 0.0F, false);
            RIGHTBACk.texOffs(61, 67).addBox(-3.575F, 23.6219F, 22.8754F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            UpperLeg_r2 = new ZawaModelRenderer(this, 59, 50);
            UpperLeg_r2.setPos(-2.475F, 16.216F, 23.0761F);
            RIGHTBACk.addChild(UpperLeg_r2);
            setRotateAngle(UpperLeg_r2, 0.4014F, 0.0F, 0.0F);
            UpperLeg_r2.addBox(-1.5F, -2.5F, -1.225F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Thigh_r2 = new ZawaModelRenderer(this, 55, 37);
            Thigh_r2.setPos(-3.0F, 11.1887F, 23.4695F);
            RIGHTBACk.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, -0.0872F, 0.0027F, 0.0304F);
            Thigh_r2.addBox(-1.5F, -4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);

            this.saveBase();

        }

        @Override
        public void setupAnim(BongoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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