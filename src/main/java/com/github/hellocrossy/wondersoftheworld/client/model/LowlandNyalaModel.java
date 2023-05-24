package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.LowlandNyalaEntity;
import com.github.hellocrossy.wondersoftheworld.entity.OryxEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class LowlandNyalaModel extends ZawaBaseModel<LowlandNyalaEntity> {
    protected ZawaModelRenderer NyalaMale;
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
    protected ZawaModelRenderer Face;
    protected ZawaModelRenderer Chest;
    protected ZawaModelRenderer Leg1;
    protected ZawaModelRenderer Leg2;
    protected ZawaModelRenderer Leg3;
    protected ZawaModelRenderer Leg4;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(NyalaMale);
        }

        return this.parts;
    }

    public static class Male extends LowlandNyalaModel {

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

        public Male() {
            texWidth = 128;
            texHeight = 128;

            NyalaMale = new ZawaModelRenderer(this, 0, 0);
            NyalaMale.setPos(0.0F, -1.6219F, -15.3004F);


            Face = new ZawaModelRenderer(this, 0, 0);
            Face.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Face);


            cube_r1 = new ZawaModelRenderer(this, 108, 48);
            cube_r1.setPos(0.0F, 0.0F, 0.0F);
            Face.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.0305F, 0.0F, 0.0F);
            cube_r1.addBox(-2.5F, -0.0031F, -2.2246F, 5.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 120, 38);
            cube_r2.setPos(1.2095F, 0.8242F, -1.2458F);
            Face.addChild(cube_r2);
            setRotateAngle(cube_r2, -0.5937F, 0.2518F, 0.5396F);
            cube_r2.addBox(-1.2482F, -3.7919F, -0.5652F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 116, 69);
            cube_r3.setPos(0.0F, 0.1251F, -2.1219F);
            Face.addChild(cube_r3);
            setRotateAngle(cube_r3, 0.8988F, 0.0F, 0.0F);
            cube_r3.addBox(-1.0F, -0.026F, -4.1433F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 0, 0);
            cube_r4.setPos(0.0F, 3.1101F, -2.6633F);
            Face.addChild(cube_r4);
            setRotateAngle(cube_r4, 0.3098F, 0.0F, 0.0F);
            cube_r4.texOffs(118, 79).addBox(-0.75F, -0.3835F, -1.6227F, 2.0F, 2.0F, 3.0F, 0.0F, false);
            cube_r4.texOffs(118, 79).addBox(-1.25F, -0.3835F, -1.6227F, 2.0F, 2.0F, 3.0F, 0.0F, true);

            cube_r5 = new ZawaModelRenderer(this, 113, 84);
            cube_r5.setPos(0.0F, 3.1851F, -2.6633F);
            Face.addChild(cube_r5);
            setRotateAngle(cube_r5, 0.1353F, 0.0F, 0.0F);
            cube_r5.addBox(-1.0F, -0.0835F, -1.7977F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 122, 28);
            cube_r6.setPos(2.7945F, -2.9096F, 3.3629F);
            Face.addChild(cube_r6);
            setRotateAngle(cube_r6, -0.5772F, 0.2204F, 0.2832F);
            cube_r6.addBox(-0.9435F, -3.801F, 0.3422F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 122, 28);
            cube_r7.setPos(-2.7945F, -2.9096F, 3.3629F);
            Face.addChild(cube_r7);
            setRotateAngle(cube_r7, -0.5772F, -0.2204F, -0.2832F);
            cube_r7.addBox(-0.0565F, -3.801F, 0.3422F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            cube_r8 = new ZawaModelRenderer(this, 122, 33);
            cube_r8.setPos(2.7945F, -2.9096F, 3.3629F);
            Face.addChild(cube_r8);
            setRotateAngle(cube_r8, -1.2256F, -0.1841F, 0.1058F);
            cube_r8.addBox(-0.77F, -0.6121F, 0.2153F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 122, 33);
            cube_r9.setPos(-2.7945F, -2.9096F, 3.3629F);
            Face.addChild(cube_r9);
            setRotateAngle(cube_r9, -1.2256F, 0.1841F, -0.1058F);
            cube_r9.addBox(-0.23F, -0.6121F, 0.2153F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            cube_r10 = new ZawaModelRenderer(this, 120, 38);
            cube_r10.setPos(-1.2095F, 0.8242F, -1.2458F);
            Face.addChild(cube_r10);
            setRotateAngle(cube_r10, -0.5937F, -0.2518F, -0.5396F);
            cube_r10.addBox(-0.7518F, -3.7919F, -0.5652F, 2.0F, 4.0F, 2.0F, 0.0F, true);

            cube_r11 = new ZawaModelRenderer(this, 118, 45);
            cube_r11.setPos(2.1973F, 0.5158F, 1.7054F);
            Face.addChild(cube_r11);
            setRotateAngle(cube_r11, 0.5681F, -0.5207F, -0.6628F);
            cube_r11.addBox(-1.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 118, 45);
            cube_r12.setPos(-2.1973F, 0.5158F, 1.7054F);
            Face.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.5681F, 0.5207F, 0.6628F);
            cube_r12.addBox(-2.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, true);

            cube_r13 = new ZawaModelRenderer(this, 117, 75);
            cube_r13.setPos(0.0F, 3.1101F, -2.6633F);
            Face.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.5192F, 0.0F, 0.0F);
            cube_r13.addBox(-1.5F, -0.8085F, -2.5977F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            Chest = new ZawaModelRenderer(this, 0, 0);
            Chest.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Chest);


            cube_r14 = new ZawaModelRenderer(this, 55, 86);
            cube_r14.setPos(0.0F, 8.3945F, 7.803F);
            Chest.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.096F, 0.0F, 0.0F);
            cube_r14.addBox(-3.0F, -5.05F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 0, 0);
            cube_r15.setPos(0.0836F, 8.3532F, 15.3529F);
            Chest.addChild(cube_r15);
            setRotateAngle(cube_r15, 0.0F, 0.0075F, -0.0045F);
            cube_r15.addBox(-3.5F, -5.5F, -5.5F, 7.0F, 11.0F, 12.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 0, 95);
            cube_r16.setPos(0.0F, 8.0966F, 27.6848F);
            Chest.addChild(cube_r16);
            setRotateAngle(cube_r16, -1.405F, 0.0F, 0.0F);
            cube_r16.addBox(-1.0F, -0.6488F, -3.6975F, 2.0F, 2.0F, 5.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 0, 0);
            cube_r17.setPos(0.0F, 9.0716F, 27.3848F);
            Chest.addChild(cube_r17);
            setRotateAngle(cube_r17, -1.5752F, 0.0F, 0.0F);
            cube_r17.texOffs(0, 106).addBox(-1.5F, -1.6238F, 1.7025F, 3.0F, 3.0F, 5.0F, 0.0F, false);
            cube_r17.texOffs(0, 114).addBox(-1.0F, -0.9988F, 4.5025F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 0, 102);
            cube_r18.setPos(0.0F, 9.0716F, 27.9848F);
            Chest.addChild(cube_r18);
            setRotateAngle(cube_r18, -1.597F, 0.0F, 0.0F);
            cube_r18.addBox(-1.0F, -0.5488F, 0.1525F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 53, 102);
            cube_r19.setPos(0.0F, 4.6852F, 2.3741F);
            Chest.addChild(cube_r19);
            setRotateAngle(cube_r19, -0.6109F, 0.0F, 0.0F);
            cube_r19.addBox(-2.0F, -3.8F, -2.375F, 4.0F, 5.0F, 8.0F, 0.0F, false);

            cube_r20 = new ZawaModelRenderer(this, 26, 97);
            cube_r20.setPos(-2.0F, 4.6852F, 2.3741F);
            Chest.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.1091F, 0.0F, 0.0F);
            cube_r20.addBox(2.0F, 0.375F, -3.125F, 0.0F, 10.0F, 13.0F, 0.0F, false);

            cube_r21 = new ZawaModelRenderer(this, 26, 109);
            cube_r21.setPos(-2.0F, 4.6852F, 2.3741F);
            Chest.addChild(cube_r21);
            setRotateAngle(cube_r21, 0.0F, 0.0F, 0.0F);
            cube_r21.addBox(2.0F, 8.875F, 8.875F, 0.0F, 6.0F, 13.0F, 0.0F, false);

            cube_r22 = new ZawaModelRenderer(this, 52, 115);
            cube_r22.setPos(-0.5F, 6.1268F, 2.7309F);
            Chest.addChild(cube_r22);
            setRotateAngle(cube_r22, -0.8901F, 0.0F, 0.0F);
            cube_r22.addBox(-1.0F, -2.925F, -2.775F, 3.0F, 4.0F, 9.0F, 0.0F, false);

            cube_r23 = new ZawaModelRenderer(this, 26, 11);
            cube_r23.setPos(-2.4767F, 8.3532F, 15.3529F);
            Chest.addChild(cube_r23);
            setRotateAngle(cube_r23, 0.0F, 0.0075F, -0.0045F);
            cube_r23.addBox(2.5F, -7.0F, -5.0F, 0.0F, 2.0F, 12.0F, 0.0F, false);

            cube_r24 = new ZawaModelRenderer(this, 33, 18);
            cube_r24.setPos(-0.0862F, 1.3422F, 10.3096F);
            Chest.addChild(cube_r24);
            setRotateAngle(cube_r24, 0.1571F, 0.0075F, -0.0045F);
            cube_r24.addBox(0.0404F, -0.6249F, -4.9998F, 0.0F, 3.0F, 5.0F, 0.0F, false);

            cube_r25 = new ZawaModelRenderer(this, 33, 18);
            cube_r25.setPos(0.0677F, 3.0821F, 21.8142F);
            Chest.addChild(cube_r25);
            setRotateAngle(cube_r25, -0.5891F, 0.0075F, -0.0045F);
            cube_r25.addBox(-0.0197F, -1.6809F, -0.5734F, 0.0F, 2.0F, 5.0F, 0.0F, false);

            cube_r26 = new ZawaModelRenderer(this, 55, 70);
            cube_r26.setPos(0.0F, 8.4618F, 21.6714F);
            Chest.addChild(cube_r26);
            setRotateAngle(cube_r26, -0.2225F, 0.0F, 0.0F);
            cube_r26.addBox(-3.0F, -5.4F, -1.025F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            Leg1 = new ZawaModelRenderer(this, 0, 0);
            Leg1.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Leg1);
            Leg1.texOffs(99, 75).addBox(1.05F, 14.7969F, 6.9254F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            Leg1.texOffs(100, 90).addBox(1.325F, 23.6219F, 6.8004F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            Leg1.texOffs(100, 82).addBox(1.375F, 18.502F, 7.4009F, 2.0F, 6.0F, 2.0F, 0.0F, false);

            cube_r27 = new ZawaModelRenderer(this, 97, 63);
            cube_r27.setPos(0.85F, 15.6719F, 4.1504F);
            Leg1.addChild(cube_r27);
            setRotateAngle(cube_r27, 0.0742F, 0.0F, 0.0F);
            cube_r27.addBox(0.25F, -6.75F, 1.675F, 3.0F, 7.0F, 5.0F, 0.0F, false);

            Leg2 = new ZawaModelRenderer(this, 0, 0);
            Leg2.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Leg2);
            Leg2.texOffs(100, 90).addBox(-3.325F, 23.6219F, 6.8004F, 2.0F, 2.0F, 2.0F, 0.0F, true);
            Leg2.texOffs(100, 82).addBox(-3.375F, 18.502F, 7.4009F, 2.0F, 6.0F, 2.0F, 0.0F, true);
            Leg2.texOffs(99, 75).addBox(-4.05F, 14.7969F, 6.9254F, 3.0F, 4.0F, 3.0F, 0.0F, true);

            cube_r28 = new ZawaModelRenderer(this, 97, 63);
            cube_r28.setPos(-0.85F, 15.6719F, 4.1504F);
            Leg2.addChild(cube_r28);
            setRotateAngle(cube_r28, 0.0742F, 0.0F, 0.0F);
            cube_r28.addBox(-3.25F, -6.75F, 1.675F, 3.0F, 7.0F, 5.0F, 0.0F, true);

            Leg3 = new ZawaModelRenderer(this, 0, 0);
            Leg3.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Leg3);
            Leg3.texOffs(115, 115).addBox(1.5F, 17.6464F, 23.587F, 2.0F, 7.0F, 2.0F, 0.0F, false);
            Leg3.texOffs(115, 124).addBox(1.575F, 23.6219F, 22.8754F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r29 = new ZawaModelRenderer(this, 110, 94);
            cube_r29.setPos(3.0F, 11.1887F, 23.4695F);
            Leg3.addChild(cube_r29);
            setRotateAngle(cube_r29, -0.0872F, -0.0027F, -0.0304F);
            cube_r29.addBox(-2.5F, -4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);

            cube_r30 = new ZawaModelRenderer(this, 113, 107);
            cube_r30.setPos(2.475F, 16.216F, 23.0761F);
            Leg3.addChild(cube_r30);
            setRotateAngle(cube_r30, 0.4014F, 0.0F, 0.0F);
            cube_r30.addBox(-1.5F, -2.5F, -1.225F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            Leg4 = new ZawaModelRenderer(this, 0, 0);
            Leg4.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Leg4);
            Leg4.texOffs(115, 124).addBox(-3.575F, 23.6219F, 22.8754F, 2.0F, 2.0F, 2.0F, 0.0F, true);
            Leg4.texOffs(115, 115).addBox(-3.5F, 17.6464F, 23.587F, 2.0F, 7.0F, 2.0F, 0.0F, true);

            cube_r31 = new ZawaModelRenderer(this, 113, 107);
            cube_r31.setPos(-2.475F, 16.216F, 23.0761F);
            Leg4.addChild(cube_r31);
            setRotateAngle(cube_r31, 0.4014F, 0.0F, 0.0F);
            cube_r31.addBox(-1.5F, -2.5F, -1.225F, 3.0F, 5.0F, 3.0F, 0.0F, true);

            cube_r32 = new ZawaModelRenderer(this, 110, 94);
            cube_r32.setPos(-3.0F, 11.1887F, 23.4695F);
            Leg4.addChild(cube_r32);
            setRotateAngle(cube_r32, -0.0872F, 0.0027F, 0.0304F);
            cube_r32.addBox(-1.5F, -4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, true);
            this.saveBase();
        }

        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }

    public static class Female extends LowlandNyalaModel {

        protected ZawaModelRenderer Head;
        protected ZawaModelRenderer Body;
        protected ZawaModelRenderer FirstLeg;
        protected ZawaModelRenderer cube_r16;
        protected ZawaModelRenderer SecondLeg;
        protected ZawaModelRenderer ThirdLeg;
        protected ZawaModelRenderer FourthLeg;

        public Female() {
            texWidth = 64;
            texHeight = 64;

            NyalaMale = new ZawaModelRenderer(this, 0, 0);
            NyalaMale.setPos(2.475F, 14.5941F, 7.7757F);


            Head = new ZawaModelRenderer(this, 0, 0);
            Head.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Head);


            cube_r1 = new ZawaModelRenderer(this, 38, 13);
            cube_r1.setPos(-2.475F, -16.216F, -23.0761F);
            Head.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.0305F, 0.0F, 0.0F);
            cube_r1.addBox(-2.5F, -0.0031F, -2.2246F, 5.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 18, 23);
            cube_r2.setPos(-2.475F, -16.0909F, -25.198F);
            Head.addChild(cube_r2);
            setRotateAngle(cube_r2, 0.8988F, 0.0F, 0.0F);
            cube_r2.addBox(-1.0F, -0.026F, -4.1433F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 0, 0);
            cube_r3.setPos(-2.475F, -13.1059F, -25.7395F);
            Head.addChild(cube_r3);
            setRotateAngle(cube_r3, 0.3098F, 0.0F, 0.0F);
            cube_r3.texOffs(37, 0).addBox(-0.75F, -0.3835F, -1.6227F, 2.0F, 2.0F, 3.0F, 0.0F, false);
            cube_r3.texOffs(37, 0).addBox(-1.25F, -0.3835F, -1.6227F, 2.0F, 2.0F, 3.0F, 0.0F, true);

            cube_r4 = new ZawaModelRenderer(this, 16, 39);
            cube_r4.setPos(-2.475F, -13.0309F, -25.7395F);
            Head.addChild(cube_r4);
            setRotateAngle(cube_r4, 0.1353F, 0.0F, 0.0F);
            cube_r4.addBox(-1.0F, -0.0835F, -1.7977F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 26, 8);
            cube_r5.setPos(-0.2777F, -15.2252F, -21.3708F);
            Head.addChild(cube_r5);
            setRotateAngle(cube_r5, 0.5681F, -0.5207F, -0.6628F);
            cube_r5.addBox(-1.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 26, 8);
            cube_r6.setPos(-4.6723F, -15.2252F, -21.3708F);
            Head.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.5681F, 0.5207F, 0.6628F);
            cube_r6.addBox(-2.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, true);

            cube_r7 = new ZawaModelRenderer(this, 0, 8);
            cube_r7.setPos(-2.475F, -13.1059F, -25.7395F);
            Head.addChild(cube_r7);
            setRotateAngle(cube_r7, 0.5192F, 0.0F, 0.0F);
            cube_r7.addBox(-1.5F, -0.8085F, -2.5977F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Body);


            cube_r8 = new ZawaModelRenderer(this, 24, 23);
            cube_r8.setPos(-2.475F, -7.8215F, -15.2731F);
            Body.addChild(cube_r8);
            setRotateAngle(cube_r8, 0.096F, 0.0F, 0.0F);
            cube_r8.addBox(-3.0F, -5.05F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 0, 0);
            cube_r9.setPos(-2.3914F, -7.8629F, -7.7233F);
            Body.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.0F, 0.0075F, -0.0045F);
            cube_r9.addBox(-3.5F, -5.5F, -5.5F, 7.0F, 11.0F, 12.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 48, 23);
            cube_r10.setPos(-2.475F, -8.1194F, 4.6087F);
            Body.addChild(cube_r10);
            setRotateAngle(cube_r10, -1.405F, 0.0F, 0.0F);
            cube_r10.addBox(-1.0F, -0.6488F, -3.6975F, 2.0F, 2.0F, 5.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 0, 0);
            cube_r11.setPos(-2.475F, -7.1444F, 4.3087F);
            Body.addChild(cube_r11);
            setRotateAngle(cube_r11, -1.5752F, 0.0F, 0.0F);
            cube_r11.texOffs(26, 0).addBox(-1.5F, -1.6238F, 1.7025F, 3.0F, 3.0F, 5.0F, 0.0F, false);
            cube_r11.texOffs(37, 39).addBox(-1.0F, -0.9988F, 4.5025F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 42, 23);
            cube_r12.setPos(-2.475F, -7.1444F, 4.9087F);
            Body.addChild(cube_r12);
            setRotateAngle(cube_r12, -1.597F, 0.0F, 0.0F);
            cube_r12.addBox(-1.0F, -0.5488F, 0.1525F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 0, 39);
            cube_r13.setPos(-2.475F, -11.5308F, -20.702F);
            Body.addChild(cube_r13);
            setRotateAngle(cube_r13, -0.6109F, 0.0F, 0.0F);
            cube_r13.addBox(-2.0F, -3.8F, -2.375F, 4.0F, 5.0F, 8.0F, 0.0F, false);

            cube_r14 = new ZawaModelRenderer(this, 38, 0);
            cube_r14.setPos(-2.975F, -10.0892F, -20.3452F);
            Body.addChild(cube_r14);
            setRotateAngle(cube_r14, -0.8247F, 0.0F, 0.0F);
            cube_r14.addBox(-1.0F, -3.15F, -2.775F, 3.0F, 4.0F, 9.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 0, 23);
            cube_r15.setPos(-2.475F, -7.7542F, -1.4047F);
            Body.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.2225F, 0.0F, 0.0F);
            cube_r15.addBox(-3.0F, -5.4F, -1.025F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            FirstLeg = new ZawaModelRenderer(this, 0, 0);
            FirstLeg.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(FirstLeg);
            FirstLeg.texOffs(0, 52).addBox(-5.8F, 7.4059F, -16.2757F, 2.0F, 2.0F, 2.0F, 0.0F, true);
            FirstLeg.texOffs(0, 39).addBox(-5.85F, 2.286F, -15.6752F, 2.0F, 6.0F, 2.0F, 0.0F, true);
            FirstLeg.texOffs(48, 30).addBox(-6.525F, -1.4191F, -16.1507F, 3.0F, 4.0F, 3.0F, 0.0F, true);

            cube_r16 = new ZawaModelRenderer(this, 42, 39);
            cube_r16.setPos(-3.325F, -0.5441F, -18.9257F);
            FirstLeg.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.0742F, 0.0F, 0.0F);
            cube_r16.addBox(-3.25F, -6.75F, 1.675F, 3.0F, 7.0F, 5.0F, 0.0F, true);

            SecondLeg = new ZawaModelRenderer(this, 0, 0);
            SecondLeg.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(SecondLeg);
            SecondLeg.texOffs(48, 30).addBox(-1.425F, -1.4191F, -16.1507F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            SecondLeg.texOffs(0, 52).addBox(-1.15F, 7.4059F, -16.2757F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            SecondLeg.texOffs(0, 39).addBox(-1.1F, 2.286F, -15.6752F, 2.0F, 6.0F, 2.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 42, 39);
            cube_r17.setPos(-1.625F, -0.5441F, -18.9257F);
            SecondLeg.addChild(cube_r17);
            setRotateAngle(cube_r17, 0.0742F, 0.0F, 0.0F);
            cube_r17.addBox(0.25F, -6.75F, 1.675F, 3.0F, 7.0F, 5.0F, 0.0F, false);

            ThirdLeg = new ZawaModelRenderer(this, 0, 0);
            ThirdLeg.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(ThirdLeg);
            ThirdLeg.texOffs(40, 51).addBox(-0.975F, 1.4304F, 0.5108F, 2.0F, 7.0F, 2.0F, 0.0F, false);
            ThirdLeg.texOffs(48, 51).addBox(-0.9F, 7.4059F, -0.2007F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 24, 39);
            cube_r18.setPos(0.525F, -5.0273F, 0.3933F);
            ThirdLeg.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.0872F, -0.0027F, -0.0304F);
            cube_r18.addBox(-2.5F, -4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 0, 0);
            cube_r19.setPos(0.0F, 0.0F, 0.0F);
            ThirdLeg.addChild(cube_r19);
            setRotateAngle(cube_r19, 0.4014F, 0.0F, 0.0F);
            cube_r19.addBox(-1.5F, -2.5F, -1.225F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            FourthLeg = new ZawaModelRenderer(this, 0, 0);
            FourthLeg.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(FourthLeg);
            FourthLeg.texOffs(48, 51).addBox(-6.05F, 7.4059F, -0.2007F, 2.0F, 2.0F, 2.0F, 0.0F, true);
            FourthLeg.texOffs(40, 51).addBox(-5.975F, 1.4304F, 0.5108F, 2.0F, 7.0F, 2.0F, 0.0F, true);

            cube_r20 = new ZawaModelRenderer(this, 24, 39);
            cube_r20.setPos(-5.475F, -5.0273F, 0.3933F);
            FourthLeg.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.0872F, 0.0027F, 0.0304F);
            cube_r20.addBox(-1.5F, -4.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, true);

            cube_r21 = new ZawaModelRenderer(this, 0, 0);
            cube_r21.setPos(-4.95F, 0.0F, 0.0F);
            FourthLeg.addChild(cube_r21);
            setRotateAngle(cube_r21, 0.4014F, 0.0F, 0.0F);
            cube_r21.addBox(-1.5F, -2.5F, -1.225F, 3.0F, 5.0F, 3.0F, 0.0F, true);
            this.saveBase();
        }

        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }
    public static class Child extends LowlandNyalaModel {


        public Child() {
            texWidth = 64;
            texHeight = 64;

            NyalaMale = new ZawaModelRenderer(this, 0, 0);
            NyalaMale.setPos(-1.9473F, 5.8939F, -8.845F);


            Face = new ZawaModelRenderer(this, 32, 9);
            Face.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Face);
            Face.addBox(-0.0527F, -0.1939F, -3.28F, 4.0F, 4.0F, 4.0F, 0.0F, false);

            cube_r1 = new ZawaModelRenderer(this, 0, 5);
            cube_r1.setPos(1.9473F, -1.0157F, -2.5273F);
            Face.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.8988F, 0.0F, 0.0F);
            cube_r1.addBox(-1.0F, -0.026F, -4.1433F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 38, 25);
            cube_r2.setPos(1.9473F, 1.9694F, -3.0687F);
            Face.addChild(cube_r2);
            setRotateAngle(cube_r2, 0.5192F, 0.0F, 0.0F);
            cube_r2.addBox(-1.5F, -0.8085F, -2.5977F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 0, 0);
            cube_r3.setPos(1.9473F, 1.9694F, -3.0687F);
            Face.addChild(cube_r3);
            setRotateAngle(cube_r3, 0.3098F, 0.0F, 0.0F);
            cube_r3.texOffs(22, 44).addBox(-0.75F, -0.3835F, -1.6227F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r3.texOffs(24, 28).addBox(-1.25F, -0.3835F, -1.6227F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 0, 0);
            cube_r4.setPos(1.9473F, 2.0444F, -3.0687F);
            Face.addChild(cube_r4);
            setRotateAngle(cube_r4, 0.1353F, 0.0F, 0.0F);
            cube_r4.addBox(-1.0F, -0.0835F, -1.7977F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 33, 0);
            cube_r5.setPos(3.8947F, 0.0F, 0.0F);
            Face.addChild(cube_r5);
            setRotateAngle(cube_r5, 0.5681F, -0.5207F, -0.6628F);
            cube_r5.addBox(-1.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 33, 0);
            cube_r6.setPos(0.0F, 0.0F, 0.0F);
            Face.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.5681F, 0.5207F, 0.6628F);
            cube_r6.addBox(-2.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, true);

            Chest = new ZawaModelRenderer(this, 0, 0);
            Chest.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Chest);


            cube_r7 = new ZawaModelRenderer(this, 0, 0);
            cube_r7.setPos(1.9473F, 5.5851F, 9.3938F);
            Chest.addChild(cube_r7);
            setRotateAngle(cube_r7, -0.0218F, 0.0F, 0.0F);
            cube_r7.addBox(-3.0F, -4.025F, -5.5F, 6.0F, 8.0F, 10.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 0, 18);
            cube_r8.setPos(1.9059F, 5.5738F, 14.7726F);
            Chest.addChild(cube_r8);
            setRotateAngle(cube_r8, -0.4931F, 0.0F, 0.0F);
            cube_r8.addBox(-2.5F, -2.825F, -2.575F, 5.0F, 7.0F, 4.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 16, 45);
            cube_r9.setPos(1.4473F, 6.0558F, 20.0294F);
            Chest.addChild(cube_r9);
            setRotateAngle(cube_r9, -1.4661F, 0.0F, 0.0F);
            cube_r9.addBox(0.0F, 2.4762F, -2.4975F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 0, 0);
            cube_r10.setPos(1.9473F, 8.3585F, 17.2788F);
            Chest.addChild(cube_r10);
            setRotateAngle(cube_r10, -1.597F, 0.0F, 0.0F);
            cube_r10.texOffs(8, 45).addBox(-0.5F, -0.3F, -1.575F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            cube_r10.texOffs(0, 18).addBox(-0.5F, -0.3F, 3.775F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            cube_r10.texOffs(24, 38).addBox(-1.0F, -0.8F, -0.125F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 22, 0);
            cube_r11.setPos(2.4473F, 3.7694F, 0.6437F);
            Chest.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.6109F, 0.0F, 0.0F);
            cube_r11.addBox(-2.0F, -2.8F, -2.375F, 3.0F, 4.0F, 5.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 0, 29);
            cube_r12.setPos(1.9473F, 5.2111F, 1.0006F);
            Chest.addChild(cube_r12);
            setRotateAngle(cube_r12, -0.8247F, 0.0F, 0.0F);
            cube_r12.addBox(-1.0F, -1.15F, -2.775F, 2.0F, 2.0F, 5.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 18, 18);
            cube_r13.setPos(1.4473F, 2.6287F, 1.3476F);
            Chest.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.096F, 0.0F, 0.0F);
            cube_r13.addBox(-2.0F, -0.55F, 0.0F, 5.0F, 7.0F, 3.0F, 0.0F, false);

            Leg1 = new ZawaModelRenderer(this, 0, 0);
            Leg1.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Leg1);
            Leg1.texOffs(46, 15).addBox(-0.8777F, 16.1061F, 2.045F, 2.0F, 2.0F, 2.0F, 0.0F, true);
            Leg1.texOffs(0, 44).addBox(-0.9527F, 11.0561F, 2.745F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            cube_r14 = new ZawaModelRenderer(this, 34, 17);
            cube_r14.setPos(1.8473F, 8.0561F, 4.12F);
            Leg1.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.0742F, 0.0F, 0.0F);
            cube_r14.addBox(-3.25F, -1.8026F, -1.9807F, 3.0F, 5.0F, 3.0F, 0.0F, true);

            cube_r15 = new ZawaModelRenderer(this, 44, 7);
            cube_r15.setPos(1.9473F, 14.9863F, 3.6455F);
            Leg1.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
            cube_r15.addBox(-2.875F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            Leg2 = new ZawaModelRenderer(this, 0, 0);
            Leg2.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Leg2);
            Leg2.texOffs(46, 15).addBox(2.7723F, 16.1061F, 2.045F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            Leg2.texOffs(0, 44).addBox(2.8473F, 11.0561F, 2.745F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 34, 17);
            cube_r16.setPos(2.0473F, 8.0561F, 4.12F);
            Leg2.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.0742F, 0.0F, 0.0F);
            cube_r16.addBox(0.25F, -1.8026F, -1.9807F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 44, 7);
            cube_r17.setPos(1.9473F, 14.9863F, 3.6455F);
            Leg2.addChild(cube_r17);
            setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
            cube_r17.addBox(0.875F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            Leg3 = new ZawaModelRenderer(this, 0, 0);
            Leg3.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Leg3);
            Leg3.texOffs(46, 23).addBox(2.6723F, 16.1061F, 12.545F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            Leg3.texOffs(42, 29).addBox(2.6973F, 13.0306F, 13.0066F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 28, 28);
            cube_r18.setPos(4.1973F, 7.0729F, 12.3891F);
            Leg3.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.0872F, -0.0027F, -0.0304F);
            cube_r18.addBox(-1.75F, -2.0F, -1.25F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 12, 38);
            cube_r19.setPos(3.6723F, 12.5502F, 12.0458F);
            Leg3.addChild(cube_r19);
            setRotateAngle(cube_r19, 0.4014F, 0.0F, 0.0F);
            cube_r19.addBox(-1.5F, -2.5F, -0.225F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            Leg4 = new ZawaModelRenderer(this, 0, 0);
            Leg4.setPos(0.0F, 0.0F, 0.0F);
            NyalaMale.addChild(Leg4);
            Leg4.texOffs(42, 29).addBox(-0.8027F, 13.0306F, 13.0066F, 2.0F, 4.0F, 2.0F, 0.0F, true);
            Leg4.texOffs(46, 23).addBox(-0.7777F, 16.1061F, 12.545F, 2.0F, 2.0F, 2.0F, 0.0F, true);

            cube_r20 = new ZawaModelRenderer(this, 28, 28);
            cube_r20.setPos(-0.3027F, 7.0729F, 12.3891F);
            Leg4.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.0872F, 0.0027F, 0.0304F);
            cube_r20.addBox(-1.25F, -2.0F, -1.25F, 3.0F, 6.0F, 4.0F, 0.0F, true);

            cube_r21 = new ZawaModelRenderer(this, 12, 38);
            cube_r21.setPos(0.2223F, 12.5502F, 12.0458F);
            Leg4.addChild(cube_r21);
            setRotateAngle(cube_r21, 0.4014F, 0.0F, 0.0F);
            cube_r21.addBox(-1.5F, -2.5F, -0.225F, 3.0F, 4.0F, 3.0F, 0.0F, true);
            this.saveBase();
        }

        @Override
        public void setupAnim(LowlandNyalaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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