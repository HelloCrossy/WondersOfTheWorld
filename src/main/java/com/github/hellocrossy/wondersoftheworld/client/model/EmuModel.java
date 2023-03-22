package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.EmuEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class EmuModel extends ZawaBaseModel<EmuEntity> {
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

    public static class Adult extends EmuModel {
        protected ZawaModelRenderer HEAD;
        protected ZawaModelRenderer a_r1;
        protected ZawaModelRenderer c_r1;
        protected ZawaModelRenderer d_r1;
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer NECK;
        protected ZawaModelRenderer c_r2;
        protected ZawaModelRenderer b_r1;
        protected ZawaModelRenderer right_r1;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer Wings_r1;
        protected ZawaModelRenderer f_r1;
        protected ZawaModelRenderer e_r1;
        protected ZawaModelRenderer d_r2;
        protected ZawaModelRenderer b_r2;
        protected ZawaModelRenderer a_r2;
        protected ZawaModelRenderer LEFT;
        protected ZawaModelRenderer e_r2;
        protected ZawaModelRenderer c_r3;
        protected ZawaModelRenderer b_r3;
        protected ZawaModelRenderer a_r3;
        protected ZawaModelRenderer RIGHT;
        protected ZawaModelRenderer e_r3;
        protected ZawaModelRenderer c_r4;
        protected ZawaModelRenderer b_r4;
        protected ZawaModelRenderer a_r4;
        
        public Adult() {
            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(-0.5F, 8.4F, -10.575F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(HEAD);


            a_r1 = new ZawaModelRenderer(this, 0, 0);
            a_r1.setPos(-0.5F, -6.5F, -4.5F);
            HEAD.addChild(a_r1);
            setRotateAngle(a_r1, 0.0349F, 0.0F, 0.0F);
            a_r1.texOffs(8, 46).addBox(0.5F, -0.7369F, -0.0896F, 1.0F, 1.0F, 4.0F, 0.0F, false);
            a_r1.texOffs(1, 50).addBox(0.5F, -0.4869F, 0.4104F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            c_r1 = new ZawaModelRenderer(this, 0, 20);
            c_r1.setPos(-0.5F, -8.75F, -2.5F);
            HEAD.addChild(c_r1);
            setRotateAngle(c_r1, 0.5847F, 0.0F, 0.0F);
            c_r1.addBox(0.5F, 0.3173F, -2.4098F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            d_r1 = new ZawaModelRenderer(this, 24, 0);
            d_r1.setPos(0.0F, 0.5F, 1.5F);
            HEAD.addChild(d_r1);
            setRotateAngle(d_r1, 0.0742F, 0.0F, 0.0F);
            d_r1.addBox(-0.5F, -8.2F, -4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            Head_r1 = new ZawaModelRenderer(this, 42, 22);
            Head_r1.setPos(0.0F, 0.5F, 1.5F);
            HEAD.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.0742F, 0.0F, 0.0F);
            Head_r1.addBox(-1.0F, -10.0F, -3.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

            NECK = new ZawaModelRenderer(this, 0, 0);
            NECK.setPos(0.2F, -0.125F, -0.85F);
            MAIN.addChild(NECK);


            c_r2 = new ZawaModelRenderer(this, 32, 39);
            c_r2.setPos(0.0F, -1.0F, 1.0F);
            NECK.addChild(c_r2);
            setRotateAngle(c_r2, 0.925F, 0.0F, 0.0F);
            c_r2.addBox(-1.7F, -0.675F, -1.925F, 4.0F, 5.0F, 4.0F, 0.0F, false);

            b_r1 = new ZawaModelRenderer(this, 30, 22);
            b_r1.setPos(-0.25F, -0.5F, 1.5F);
            NECK.addChild(b_r1);
            setRotateAngle(b_r1, 0.1876F, 0.0F, 0.0F);
            b_r1.addBox(-0.95F, -2.85F, -1.825F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            right_r1 = new ZawaModelRenderer(this, 0, 0);
            right_r1.setPos(-0.2F, 0.625F, 1.35F);
            NECK.addChild(right_r1);
            setRotateAngle(right_r1, -0.1353F, 0.0F, 0.0F);
            right_r1.texOffs(47, 7).addBox(-0.975F, -7.25F, -2.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);
            right_r1.texOffs(45, 45).addBox(-0.025F, -7.25F, -2.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(0.5F, 3.6809F, 15.2571F);
            MAIN.addChild(BODY);
            setRotateAngle(BODY, -0.0873F, 0.0F, 0.0F);


            Wings_r1 = new ZawaModelRenderer(this, 0, 0);
            Wings_r1.setPos(-0.8F, -4.9809F, -12.1821F);
            BODY.addChild(Wings_r1);
            setRotateAngle(Wings_r1, 0.1396F, 0.0F, 0.0F);
            Wings_r1.texOffs(0, 0).addBox(-3.2F, -0.7753F, 3.8369F, 8.0F, 8.0F, 8.0F, 0.0F, false);
            Wings_r1.texOffs(0, 16).addBox(-2.7F, -1.7753F, 4.1869F, 7.0F, 8.0F, 8.0F, 0.0F, false);

            f_r1 = new ZawaModelRenderer(this, 16, 39);
            f_r1.setPos(0.0F, -1.0F, 3.5F);
            BODY.addChild(f_r1);
            setRotateAngle(f_r1, -1.3395F, 0.0F, 0.0F);
            f_r1.addBox(-2.0F, -1.9641F, -1.8526F, 4.0F, 5.0F, 4.0F, 0.0F, false);

            e_r1 = new ZawaModelRenderer(this, 32, 0);
            e_r1.setPos(-0.8F, -5.1059F, 9.7179F);
            BODY.addChild(e_r1);
            setRotateAngle(e_r1, -0.9032F, 0.0F, 0.0F);
            e_r1.addBox(-1.7F, 4.5621F, -5.4159F, 5.0F, 6.0F, 4.0F, 0.0F, false);

            d_r2 = new ZawaModelRenderer(this, 26, 28);
            d_r2.setPos(-0.8F, -5.1059F, 9.7179F);
            BODY.addChild(d_r2);
            setRotateAngle(d_r2, -0.5105F, 0.0F, 0.0F);
            d_r2.addBox(-2.2F, 2.1316F, -10.4843F, 6.0F, 7.0F, 4.0F, 0.0F, false);

            b_r2 = new ZawaModelRenderer(this, 0, 32);
            b_r2.setPos(-0.8F, -5.5809F, -12.1821F);
            BODY.addChild(b_r2);
            setRotateAngle(b_r2, 0.2923F, 0.0F, 0.0F);
            b_r2.addBox(-2.2F, 0.1698F, 0.5741F, 6.0F, 7.0F, 4.0F, 0.0F, false);

            a_r2 = new ZawaModelRenderer(this, 26, 10);
            a_r2.setPos(-0.3F, -5.1559F, -12.1821F);
            BODY.addChild(a_r2);
            setRotateAngle(a_r2, 0.048F, 0.0F, 0.0F);
            a_r2.addBox(-2.2F, 0.0748F, -0.9152F, 5.0F, 6.0F, 6.0F, 0.0F, false);

            LEFT = new ZawaModelRenderer(this, 0, 4);
            LEFT.setPos(1.3F, -0.3F, -1.25F);
            MAIN.addChild(LEFT);
            LEFT.addBox(0.7F, 14.875F, 9.675F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            e_r2 = new ZawaModelRenderer(this, 0, 16);
            e_r2.setPos(2.4F, -0.125F, 3.5F);
            LEFT.addChild(e_r2);
            setRotateAngle(e_r2, 0.0F, 0.2094F, 0.0F);
            e_r2.addBox(-4.1F, 15.05F, 6.175F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            c_r3 = new ZawaModelRenderer(this, 0, 0);
            c_r3.setPos(0.0F, -0.125F, 3.5F);
            LEFT.addChild(c_r3);
            setRotateAngle(c_r3, 0.0F, -0.2094F, 0.0F);
            c_r3.addBox(3.1F, 15.05F, 6.175F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            b_r3 = new ZawaModelRenderer(this, 46, 29);
            b_r3.setPos(0.0F, 0.0F, 3.5F);
            LEFT.addChild(b_r3);
            setRotateAngle(b_r3, 0.0262F, 0.0F, 0.0F);
            b_r3.addBox(0.2F, 6.975F, 7.675F, 2.0F, 9.0F, 2.0F, 0.0F, false);

            a_r3 = new ZawaModelRenderer(this, 0, 43);
            a_r3.setPos(0.0F, -1.0F, 3.5F);
            LEFT.addChild(a_r3);
            setRotateAngle(a_r3, 0.1876F, 0.0F, 0.0F);
            a_r3.addBox(-0.3F, 5.975F, 5.675F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            RIGHT = new ZawaModelRenderer(this, 0, 4);
            RIGHT.setPos(-0.3F, -0.3F, -1.25F);
            MAIN.addChild(RIGHT);
            RIGHT.addBox(-1.7F, 14.875F, 9.675F, 1.0F, 1.0F, 3.0F, 0.0F, true);

            e_r3 = new ZawaModelRenderer(this, 0, 16);
            e_r3.setPos(-2.4F, -0.125F, 3.5F);
            RIGHT.addChild(e_r3);
            setRotateAngle(e_r3, 0.0F, -0.2094F, 0.0F);
            e_r3.addBox(3.1F, 15.05F, 6.175F, 1.0F, 1.0F, 3.0F, 0.0F, true);

            c_r4 = new ZawaModelRenderer(this, 0, 0);
            c_r4.setPos(0.0F, -0.125F, 3.5F);
            RIGHT.addChild(c_r4);
            setRotateAngle(c_r4, 0.0F, 0.2094F, 0.0F);
            c_r4.addBox(-4.1F, 15.05F, 6.175F, 1.0F, 1.0F, 3.0F, 0.0F, true);

            b_r4 = new ZawaModelRenderer(this, 46, 29);
            b_r4.setPos(0.0F, 0.0F, 3.5F);
            RIGHT.addChild(b_r4);
            setRotateAngle(b_r4, 0.0262F, 0.0F, 0.0F);
            b_r4.addBox(-2.2F, 6.975F, 7.675F, 2.0F, 9.0F, 2.0F, 0.0F, true);

            a_r4 = new ZawaModelRenderer(this, 0, 43);
            a_r4.setPos(0.0F, -1.0F, 3.5F);
            RIGHT.addChild(a_r4);
            setRotateAngle(a_r4, 0.1876F, 0.0F, 0.0F);
            a_r4.addBox(-2.7F, 5.975F, 5.675F, 3.0F, 4.0F, 3.0F, 0.0F, true);

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

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(-0.5F, 8.4F, -10.575F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(HEAD);


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
            MAIN.addChild(NECK);


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
            MAIN.addChild(BODY);
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
            MAIN.addChild(LEFT);
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
            MAIN.addChild(RIGHT);
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
