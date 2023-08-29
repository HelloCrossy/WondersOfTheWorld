package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.EmuEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class EmuModel extends ZawaBaseModel<EmuEntity> {
    protected ZawaModelRenderer Base;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Base);
        }

        return this.parts;
    }

    public static class Adult extends EmuModel {

        protected ZawaModelRenderer Body;
        protected ZawaModelRenderer Body_r1;
        protected ZawaModelRenderer Hips;
        protected ZawaModelRenderer Hips_r1;
        protected ZawaModelRenderer TailBase;
        protected ZawaModelRenderer TailBase_r1;
        protected ZawaModelRenderer Tail;
        protected ZawaModelRenderer Tail_r1;
        protected ZawaModelRenderer Chest;
        protected ZawaModelRenderer Chest_r1;
        protected ZawaModelRenderer Neck1;
        protected ZawaModelRenderer Neck1_r1;
        protected ZawaModelRenderer Neck2;
        protected ZawaModelRenderer Neck2_r1;
        protected ZawaModelRenderer Neck3;
        protected ZawaModelRenderer Neck3_r1;
        protected ZawaModelRenderer Neck4;
        protected ZawaModelRenderer Neck4_r1;
        protected ZawaModelRenderer Neck5;
        protected ZawaModelRenderer Neck5_r1;
        protected ZawaModelRenderer Head;
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer UpperBill1;
        protected ZawaModelRenderer Beak2_r1;
        protected ZawaModelRenderer UpperBill2;
        protected ZawaModelRenderer Beak3_r1;
        protected ZawaModelRenderer UpperBill3;
        protected ZawaModelRenderer Beak1_r1;
        protected ZawaModelRenderer LowerBill;
        protected ZawaModelRenderer Beak4_r1;
        protected ZawaModelRenderer Wings;
        protected ZawaModelRenderer Wings_r1;
        protected ZawaModelRenderer LeftThigh;
        protected ZawaModelRenderer ThighL_r1;
        protected ZawaModelRenderer LeftLeg;
        protected ZawaModelRenderer LegL_r1;
        protected ZawaModelRenderer LeftFoot;
        protected ZawaModelRenderer LeftFootLeftToe;
        protected ZawaModelRenderer Toe1L_r1;
        protected ZawaModelRenderer LeftFootRightToe;
        protected ZawaModelRenderer Toe2L_r1;
        protected ZawaModelRenderer RightThigh;
        protected ZawaModelRenderer ThighR_r1;
        protected ZawaModelRenderer RightLeg;
        protected ZawaModelRenderer LegR_r1;
        protected ZawaModelRenderer RightFoot;
        protected ZawaModelRenderer RightFootLeftToe;
        protected ZawaModelRenderer Toe2R_r1;
        protected ZawaModelRenderer RightFootRightToe;
        protected ZawaModelRenderer Toe1R_r1;
        
        public Adult() {
            texWidth = 64;
            texHeight = 64;

            Base = new ZawaModelRenderer(this, 0 ,0);
            Base.setPos(-0.8F, 7.975F, -8.325F);


            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.8F, -0.1246F, 9.5976F);
            Base.addChild(Body);


            Body_r1 = new ZawaModelRenderer(this, 0, 16);
            Body_r1.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(Body_r1);
            setRotateAngle(Body_r1, 0.0524F, 0.0F, 0.0F);
            Body_r1.addBox(-3.5F, -4.0F, -4.0F, 7.0F, 8.0F, 8.0F, 0.0F, false);

            Hips = new ZawaModelRenderer(this, 0, 0);
            Hips.setPos(-3.2F, -4.0754F, 3.8024F);
            Body.addChild(Hips);


            Hips_r1 = new ZawaModelRenderer(this, 26, 28);
            Hips_r1.setPos(2.4F, 4.0664F, 9.733F);
            Hips.addChild(Hips_r1);
            setRotateAngle(Hips_r1, -0.5978F, 0.0F, 0.0F);
            Hips_r1.addBox(-2.2F, 2.1316F, -10.4843F, 6.0F, 7.0F, 4.0F, 0.0F, false);

            TailBase = new ZawaModelRenderer(this, 0, 0);
            TailBase.setPos(2.4F, 2.325F, 3.1F);
            Hips.addChild(TailBase);


            TailBase_r1 = new ZawaModelRenderer(this, 32, 0);
            TailBase_r1.setPos(0.0F, 1.7414F, 6.633F);
            TailBase.addChild(TailBase_r1);
            setRotateAngle(TailBase_r1, -0.9905F, 0.0F, 0.0F);
            TailBase_r1.addBox(-1.7F, 4.5621F, -5.4159F, 5.0F, 6.0F, 4.0F, 0.0F, false);

            Tail = new ZawaModelRenderer(this, 0, 0);
            Tail.setPos(0.0F, 3.2F, 1.75F);
            TailBase.addChild(Tail);


            Tail_r1 = new ZawaModelRenderer(this, 16, 39);
            Tail_r1.setPos(0.8F, 2.0898F, -1.6691F);
            Tail.addChild(Tail_r1);
            setRotateAngle(Tail_r1, -1.4268F, 0.0F, 0.0F);
            Tail_r1.addBox(-2.0F, -1.9641F, -1.8526F, 4.0F, 5.0F, 4.0F, 0.0F, false);

            Chest = new ZawaModelRenderer(this, 0, 0);
            Chest.setPos(0.0F, -3.0606F, -4.1167F);
            Body.addChild(Chest);


            Chest_r1 = new ZawaModelRenderer(this, 0, 32);
            Chest_r1.setPos(-0.8F, 0.6697F, -4.1232F);
            Chest.addChild(Chest_r1);
            setRotateAngle(Chest_r1, 0.2051F, 0.0F, 0.0F);
            Chest_r1.addBox(-2.2F, 0.1698F, 0.5741F, 6.0F, 7.0F, 4.0F, 0.0F, false);

            Neck1 = new ZawaModelRenderer(this, 0, 0);
            Neck1.setPos(-0.8F, 4.3102F, -1.6059F);
            Chest.addChild(Neck1);


            Neck1_r1 = new ZawaModelRenderer(this, 26, 10);
            Neck1_r1.setPos(0.5F, -3.2171F, -2.5543F);
            Neck1.addChild(Neck1_r1);
            setRotateAngle(Neck1_r1, -0.0393F, 0.0F, 0.0F);
            Neck1_r1.addBox(-2.2F, 0.0748F, -0.9152F, 5.0F, 6.0F, 6.0F, 0.0F, false);

            Neck2 = new ZawaModelRenderer(this, 0, 0);
            Neck2.setPos(0.0F, -0.15F, -3.5F);
            Neck1.addChild(Neck2);


            Neck2_r1 = new ZawaModelRenderer(this, 32, 39);
            Neck2_r1.setPos(0.5F, -1.675F, -2.475F);
            Neck2.addChild(Neck2_r1);
            setRotateAngle(Neck2_r1, 0.925F, 0.0F, 0.0F);
            Neck2_r1.addBox(-1.7F, -0.675F, -1.925F, 4.0F, 5.0F, 4.0F, 0.0F, false);

            Neck3 = new ZawaModelRenderer(this, 0, 0);
            Neck3.setPos(0.0F, -1.85F, -2.375F);
            Neck2.addChild(Neck3);


            Neck3_r1 = new ZawaModelRenderer(this, 30, 22);
            Neck3_r1.setPos(0.25F, -2.325F, 1.4F);
            Neck3.addChild(Neck3_r1);
            setRotateAngle(Neck3_r1, 0.1876F, 0.0F, 0.0F);
            Neck3_r1.addBox(-0.95F, -0.0892F, -3.367F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            Neck4 = new ZawaModelRenderer(this, 0, 0);
            Neck4.setPos(0.0F, -1.5F, -0.3F);
            Neck3.addChild(Neck4);


            Neck4_r1 = new ZawaModelRenderer(this, 45, 45);
            Neck4_r1.setPos(0.3F, 3.3F, 0.55F);
            Neck4.addChild(Neck4_r1);
            setRotateAngle(Neck4_r1, -0.1353F, 0.0F, 0.0F);
            Neck4_r1.addBox(-0.025F, -7.25F, -2.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            Neck5 = new ZawaModelRenderer(this, 0, 0);
            Neck5.setPos(0.0F, 0.0F, 0.0F);
            Neck4.addChild(Neck5);


            Neck5_r1 = new ZawaModelRenderer(this, 47, 7);
            Neck5_r1.setPos(0.3F, 3.3F, 0.55F);
            Neck5.addChild(Neck5_r1);
            setRotateAngle(Neck5_r1, -0.1353F, 0.0F, 0.0F);
            Neck5_r1.addBox(-0.975F, -7.25F, -2.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            Head = new ZawaModelRenderer(this, 0, 0);
            Head.setPos(0.8F, -4.6025F, 0.4228F);
            Neck5.addChild(Head);


            Head_r1 = new ZawaModelRenderer(this, 42, 22);
            Head_r1.setPos(-0.5F, 7.9025F, 1.1272F);
            Head.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.0742F, 0.0F, 0.0F);
            Head_r1.addBox(-1.0F, -10.0F, -3.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

            UpperBill1 = new ZawaModelRenderer(this, 0, 0);
            UpperBill1.setPos(-0.8F, 6.1025F, 1.8772F);
            Head.addChild(UpperBill1);


            Beak2_r1 = new ZawaModelRenderer(this, 24, 0);
            Beak2_r1.setPos(0.3F, 1.8F, -0.75F);
            UpperBill1.addChild(Beak2_r1);
            setRotateAngle(Beak2_r1, 0.0742F, 0.0F, 0.0F);
            Beak2_r1.addBox(-0.5F, -8.2F, -4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            UpperBill2 = new ZawaModelRenderer(this, 0, 0);
            UpperBill2.setPos(0.0F, 0.0F, 0.0F);
            UpperBill1.addChild(UpperBill2);


            Beak3_r1 = new ZawaModelRenderer(this, 8, 46);
            Beak3_r1.setPos(-0.2F, -5.2F, -6.75F);
            UpperBill2.addChild(Beak3_r1);
            setRotateAngle(Beak3_r1, 0.0349F, 0.0F, 0.0F);
            Beak3_r1.texOffs(8, 46).addBox(0.5F, -0.7369F, -0.0896F, 1.0F, 1.0F, 4.0F, 0.0F, false);

            UpperBill3 = new ZawaModelRenderer(this, 0, 0);
            UpperBill3.setPos(0.0F, 0.0F, 0.0F);
            UpperBill2.addChild(UpperBill3);


            Beak1_r1 = new ZawaModelRenderer(this, 0, 20);
            Beak1_r1.setPos(-0.2F, -7.45F, -4.75F);
            UpperBill3.addChild(Beak1_r1);
            setRotateAngle(Beak1_r1, 0.5847F, 0.0F, 0.0F);
            Beak1_r1.addBox(0.5F, 0.3173F, -2.4098F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            LowerBill = new ZawaModelRenderer(this, 0, 0);
            LowerBill.setPos(-0.8F, 0.5025F, -0.7228F);
            Head.addChild(LowerBill);


            Beak4_r1 = new ZawaModelRenderer(this,1, 50);
            Beak4_r1.setPos(-0.2F, 0.4F, -4.15F);
            LowerBill.addChild(Beak4_r1);
            setRotateAngle(Beak4_r1, 0.0349F, 0.0F, 0.0F);
            Beak4_r1.addBox(0.5F, -0.4869F, 0.4104F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            Wings = new ZawaModelRenderer(this, 0, 0);
            Wings.setPos(0.0F, 1.0169F, -0.2972F);
            Body.addChild(Wings);


            Wings_r1 = new ZawaModelRenderer(this, 0,0);
            Wings_r1.setPos(-0.8F, -2.8101F, -7.9949F);
            Wings.addChild(Wings_r1);
            setRotateAngle(Wings_r1, 0.0524F, 0.0F, 0.0F);
            Wings_r1.addBox(-3.2F, -0.7753F, 3.8369F, 8.0F, 8.0F, 8.0F, 0.0F, false);

            LeftThigh = new ZawaModelRenderer(this, 0, 0);
            LeftThigh.setPos(2.0F, 3.8246F, -1.3976F);
            Body.addChild(LeftThigh);


            ThighL_r1 = new ZawaModelRenderer(this, 0, 43);
            ThighL_r1.setPos(-1.2F, -4.575F, -8.2F);
            LeftThigh.addChild(ThighL_r1);
            setRotateAngle(ThighL_r1, 0.1876F, 0.0F, 0.0F);
            ThighL_r1.addBox(-0.3F, 5.975F, 5.675F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            LeftLeg = new ZawaModelRenderer(this, 0, 0);
            LeftLeg.setPos(0.0F, 3.6F, 1.7F);
            LeftThigh.addChild(LeftLeg);

            LegL_r1 = new ZawaModelRenderer(this, 46, 29);
            LegL_r1.setPos(-1.2F, -7.175F, -9.9F);
            LeftLeg.addChild(LegL_r1);
            setRotateAngle(LegL_r1, 0.0262F, 0.0F, 0.0F);
            LegL_r1.addBox(0.2F, 6.975F, 7.675F, 2.0F, 9.0F, 2.0F, 0.0F, false);

            LeftFoot = new ZawaModelRenderer(this, 0, 4);
            LeftFoot.setPos(0.0F, 8.2F, -0.4F);
            LeftLeg.addChild(LeftFoot);
            LeftFoot.addBox(-0.5F, -0.5F, -3.325F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            LeftFootLeftToe = new ZawaModelRenderer(this, 0, 0);
            LeftFootLeftToe.setPos(-5.2F, -15.5F, -9.5F);
            LeftFoot.addChild(LeftFootLeftToe);

            Toe1L_r1 = new ZawaModelRenderer(this, 0, 0);
            Toe1L_r1.setPos(4.0F, 0.0F, 0.0F);
            LeftFootLeftToe.addChild(Toe1L_r1);
            setRotateAngle(Toe1L_r1, 0.0F, -0.2094F, 0.0F);
            Toe1L_r1.addBox(3.1F, 15.05F, 6.175F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            LeftFootRightToe = new ZawaModelRenderer(this, 0, 0);
            LeftFootRightToe.setPos(-5.2F, -15.5F, -9.5F);
            LeftFoot.addChild(LeftFootRightToe);

            Toe2L_r1 = new ZawaModelRenderer(this, 0, 16);
            Toe2L_r1.setPos(6.4F, 0.0F, 0.0F);
            LeftFootRightToe.addChild(Toe2L_r1);
            setRotateAngle(Toe2L_r1, 0.0F, 0.2094F, 0.0F);
            Toe2L_r1.addBox(-4.1F, 15.05F, 6.175F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            RightThigh = new ZawaModelRenderer(this, 0, 0);
            RightThigh.setPos(-2.0F, 3.8246F, -1.3976F);
            Body.addChild(RightThigh);

            ThighR_r1 = new ZawaModelRenderer(this, 0, 43);
            ThighR_r1.setPos(1.2F, -4.575F, -8.2F);
            RightThigh.addChild(ThighR_r1);
            setRotateAngle(ThighR_r1, 0.1876F, 0.0F, 0.0F);
            ThighR_r1.addBox(-2.7F, 5.975F, 5.675F, 3.0F, 4.0F, 3.0F, 0.0F, true);

            RightLeg = new ZawaModelRenderer(this, 0, 0);
            RightLeg.setPos(0.0F, 3.6F, 1.7F);
            RightThigh.addChild(RightLeg);


            LegR_r1 = new ZawaModelRenderer(this, 46, 29);
            LegR_r1.setPos(1.2F, -7.175F, -9.9F);
            RightLeg.addChild(LegR_r1);
            setRotateAngle(LegR_r1, 0.0262F, 0.0F, 0.0F);
            LegR_r1.addBox(-2.2F, 6.975F, 7.675F, 2.0F, 9.0F, 2.0F, 0.0F, true);

            RightFoot = new ZawaModelRenderer(this, 0, 4);
            RightFoot.setPos(0.0F, 8.2F, -0.4F);
            RightLeg.addChild(RightFoot);
            RightFoot.addBox(-0.5F, -0.5F, -3.325F, 1.0F, 1.0F, 3.0F, 0.0F, true);

            RightFootLeftToe = new ZawaModelRenderer(this, 0, 0);
            RightFootLeftToe.setPos(-1.2F, -15.5F, -9.5F);
            RightFoot.addChild(RightFootLeftToe);
            
            Toe2R_r1 = new ZawaModelRenderer(this, 0, 16);
            Toe2R_r1.setPos(0.0F, 0.0F, 0.0F);
            RightFootLeftToe.addChild(Toe2R_r1);
            setRotateAngle(Toe2R_r1, 0.0F, -0.2094F, 0.0F);
            Toe2R_r1.addBox(3.1F, 15.05F, 6.175F, 1.0F, 1.0F, 3.0F, 0.0F, true);

            RightFootRightToe = new ZawaModelRenderer(this, 0, 0);
            RightFootRightToe.setPos(-1.2F, -15.5F, -9.5F);
            RightFoot.addChild(RightFootRightToe);
            
            Toe1R_r1 = new ZawaModelRenderer(this, 0, 0);
            Toe1R_r1.setPos(2.4F, 0.0F, 0.0F);
            RightFootRightToe.addChild(Toe1R_r1);
            setRotateAngle(Toe1R_r1, 0.0F, 0.2094F, 0.0F);
            Toe1R_r1.addBox(-4.1F, 15.05F, 6.175F, 1.0F, 1.0F, 3.0F, 0.0F, true);

            this.saveBase();
        }

        @Override
        public void setupAnim(EmuEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1_r1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F + -0.0393F;
            this.Neck2_r1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.925F;
            this.Head_r1.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.0742F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

     public static class Child extends EmuModel {
        protected ZawaModelRenderer HEAD;
        protected ZawaModelRenderer f_r1;
        protected ZawaModelRenderer a_r1;
        protected ZawaModelRenderer p_r1;
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer NECK;
        protected ZawaModelRenderer h_r1;
        protected ZawaModelRenderer g_r1;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer Wings_r1;
        protected ZawaModelRenderer t_r1;
        protected ZawaModelRenderer r_r1;
        protected ZawaModelRenderer f_r2;
        protected ZawaModelRenderer LEFT;
        protected ZawaModelRenderer v_r1;
        protected ZawaModelRenderer d_r1;
        protected ZawaModelRenderer w_r1;
        protected ZawaModelRenderer r_r2;
        protected ZawaModelRenderer RIGHT;
        protected ZawaModelRenderer n_r1;
        protected ZawaModelRenderer m_r1;
        protected ZawaModelRenderer s_r1;
        protected ZawaModelRenderer g_r2;
        
        public Child() {
            texWidth = 32;
            texHeight = 32;

            Base = new ZawaModelRenderer(this, 0, 0);
            Base.setPos(-0.5F, 8.4F, -10.575F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, 0.0F, 0.0F);
            Base.addChild(HEAD);


            f_r1 = new ZawaModelRenderer(this, 0, 0);
            f_r1.setPos(0.5F, 1.8599F, 7.5409F);
            HEAD.addChild(f_r1);
            setRotateAngle(f_r1, 0.0785F, 0.0F, 0.0F);
            f_r1.texOffs(6, 21).addBox(-0.25F, -1.2038F, -2.5115F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            f_r1.texOffs(6, 21).addBox(-0.75F, -1.2038F, -2.5115F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            a_r1 = new ZawaModelRenderer(this, 13, 12);
            a_r1.setPos(0.5F, 1.3604F, 7.5191F);
            HEAD.addChild(a_r1);
            setRotateAngle(a_r1, -0.0087F, 0.0F, 0.0F);
            a_r1.addBox(-0.5F, -0.429F, -2.2702F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            p_r1 = new ZawaModelRenderer(this, 24, 22);
            p_r1.setPos(0.5F, 0.4125F, 6.538F);
            HEAD.addChild(p_r1);
            setRotateAngle(p_r1, 0.2793F, 0.0F, 0.0F);
            p_r1.addBox(-0.5F, 0.025F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            Head_r1 = new ZawaModelRenderer(this, 15, 19);
            Head_r1.setPos(0.5F, 2.0559F, 7.2612F);
            HEAD.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.0742F, 0.0F, 0.0F);
            Head_r1.addBox(-1.5F, -2.9164F, -0.7049F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            NECK = new ZawaModelRenderer(this, 0, 0);
            NECK.setPos(0.2F, -0.125F, -0.85F);
            Base.addChild(NECK);


            h_r1 = new ZawaModelRenderer(this, 18, 22);
            h_r1.setPos(0.3F, 6.9843F, 9.9289F);
            NECK.addChild(h_r1);
            setRotateAngle(h_r1, 0.4494F, 0.0F, 0.0F);
            h_r1.addBox(-1.5F, -2.5F, -2.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            g_r1 = new ZawaModelRenderer(this, 10, 25);
            g_r1.setPos(0.3F, 2.4309F, 7.6112F);
            NECK.addChild(g_r1);
            setRotateAngle(g_r1, -0.1789F, 0.0F, 0.0F);
            g_r1.addBox(-1.0F, -0.9708F, 0.2261F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(1.0F, 7.3373F, 11.0292F);
            Base.addChild(BODY);
            setRotateAngle(BODY, -0.3927F, 0.0F, 0.0F);


            Wings_r1 = new ZawaModelRenderer(this, 0, 0);
            Wings_r1.setPos(1.5F, 0.7728F, -0.7245F);
            BODY.addChild(Wings_r1);
            setRotateAngle(Wings_r1, 0.1396F, 0.0F, 0.0F);
            Wings_r1.texOffs(0, 21).addBox(-0.5F, -1.6137F, -1.4567F, 1.0F, 3.0F, 4.0F, 0.0F, false);
            Wings_r1.texOffs(0, 21).addBox(-4.5F, -1.6137F, -1.4567F, 1.0F, 3.0F, 4.0F, 0.0F, true);

            t_r1 = new ZawaModelRenderer(this, 0, 12);
            t_r1.setPos(-0.5F, -0.4041F, -0.5668F);
            BODY.addChild(t_r1);
            setRotateAngle(t_r1, 0.3098F, 0.0F, 0.0F);
            t_r1.addBox(-1.5F, -1.8285F, -2.0701F, 3.0F, 4.0F, 5.0F, 0.0F, false);

            r_r1 = new ZawaModelRenderer(this, 15, 0);
            r_r1.setPos(-0.5F, 0.6365F, 0.9087F);
            BODY.addChild(r_r1);
            setRotateAngle(r_r1, -0.3011F, 0.0F, 0.0F);
            r_r1.addBox(-1.5F, -3.7379F, -0.352F, 3.0F, 3.0F, 4.0F, 0.0F, false);

            f_r2 = new ZawaModelRenderer(this, 0, 0);
            f_r2.setPos(-0.5F, 2.0044F, 0.0345F);
            BODY.addChild(f_r2);
            setRotateAngle(f_r2, 0.1789F, 0.0F, 0.0F);
            f_r2.addBox(-2.0F, -3.7815F, -2.8658F, 4.0F, 5.0F, 7.0F, 0.0F, false);

            LEFT = new ZawaModelRenderer(this, 3, 4);
            LEFT.setPos(0.8F, -0.3F, -1.25F);
            Base.addChild(LEFT);
            LEFT.addBox(0.3F, 14.875F, 11.275F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            v_r1 = new ZawaModelRenderer(this, 3, 4);
            v_r1.setPos(0.4665F, 15.425F, 12.0276F);
            LEFT.addChild(v_r1);
            setRotateAngle(v_r1, 0.0F, 0.5585F, 0.0F);
            v_r1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            d_r1 = new ZawaModelRenderer(this, 3, 4);
            d_r1.setPos(1.1335F, 15.425F, 12.0276F);
            LEFT.addChild(d_r1);
            setRotateAngle(d_r1, 0.0F, -0.5585F, 0.0F);
            d_r1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            w_r1 = new ZawaModelRenderer(this, 0, 0);
            w_r1.setPos(0.1F, 5.0F, 4.25F);
            LEFT.addChild(w_r1);
            setRotateAngle(w_r1, 0.0262F, 0.0F, 0.0F);
            w_r1.addBox(0.2F, 6.975F, 7.675F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            r_r2 = new ZawaModelRenderer(this, 22, 7);
            r_r2.setPos(0.1F, 3.5F, 4.25F);
            LEFT.addChild(r_r2);
            setRotateAngle(r_r2, 0.1876F, 0.0F, 0.0F);
            r_r2.addBox(-0.3F, 6.975F, 5.675F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            RIGHT = new ZawaModelRenderer(this, 3, 4);
            RIGHT.setPos(0.2F, -0.3F, -1.25F);
            Base.addChild(RIGHT);
            RIGHT.addBox(-1.3F, 14.875F, 11.275F, 1.0F, 1.0F, 1.0F, 0.0F, true);

            n_r1 = new ZawaModelRenderer(this, 3, 4);
            n_r1.setPos(-0.4665F, 15.425F, 12.0276F);
            RIGHT.addChild(n_r1);
            setRotateAngle(n_r1, 0.0F, -0.5585F, 0.0F);
            n_r1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

            m_r1 = new ZawaModelRenderer(this, 3, 4);
            m_r1.setPos(-1.1335F, 15.425F, 12.0276F);
            RIGHT.addChild(m_r1);
            setRotateAngle(m_r1, 0.0F, 0.5585F, 0.0F);
            m_r1.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

            s_r1 = new ZawaModelRenderer(this, 0, 0);
            s_r1.setPos(-0.1F, 5.0F, 4.25F);
            RIGHT.addChild(s_r1);
            setRotateAngle(s_r1, 0.0262F, 0.0F, 0.0F);
            s_r1.addBox(-1.2F, 6.975F, 7.675F, 1.0F, 4.0F, 1.0F, 0.0F, true);

            g_r2 = new ZawaModelRenderer(this, 22, 7);
            g_r2.setPos(-0.1F, 3.5F, 4.25F);
            RIGHT.addChild(g_r2);
            setRotateAngle(g_r2, 0.1876F, 0.0F, 0.0F);
            g_r2.addBox(-1.7F, 6.975F, 5.675F, 2.0F, 3.0F, 2.0F, 0.0F, true);


            this.saveBase();
        }

        @Override
        public void setupAnim(EmuEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
