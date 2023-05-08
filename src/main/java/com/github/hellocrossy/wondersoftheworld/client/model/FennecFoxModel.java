package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.FennecFoxEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TakaheEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class FennecFoxModel extends ZawaBaseModel<FennecFoxEntity> {
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

    public static class Adult extends FennecFoxModel {

        protected ZawaModelRenderer Neck_Lower_r1;
        protected ZawaModelRenderer Neck_Lower_r2;
        protected ZawaModelRenderer Neck_Lower_r3;
        protected ZawaModelRenderer cube_r1;
        protected ZawaModelRenderer cube_r2;
        protected ZawaModelRenderer cube_r3;
        protected ZawaModelRenderer cube_r4;
        protected ZawaModelRenderer cube_r5;
        protected ZawaModelRenderer cube_r6;
        protected ZawaModelRenderer Neck_Lower_r4;
        protected ZawaModelRenderer Neck_Lower_r5;
        protected ZawaModelRenderer Neck_Lower_r6;
        protected ZawaModelRenderer cube_r7;
        protected ZawaModelRenderer cube_r8;
        protected ZawaModelRenderer cube_r9;
        protected ZawaModelRenderer cube_r10;
        protected ZawaModelRenderer cube_r11;
        protected ZawaModelRenderer cube_r12;
        protected ZawaModelRenderer cube_r13;

        public Adult() {

            texWidth = 64;
            texHeight = 64;

            bb_main = new ZawaModelRenderer(this, 0, 0);
            bb_main.setPos(0.0F, 24.0F, 0.0F);
            bb_main.texOffs(20, 30).addBox(-2.3F, -1.0F, -4.2F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(30, 13).addBox(0.3F, -1.0F, -4.2F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(19, 18).addBox(0.35F, -7.075F, 0.85F, 2.0F, 4.0F, 3.0F, 0.0F, false);
            bb_main.texOffs(12, 30).addBox(0.25F, -1.0F, 2.2F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(30, 10).addBox(-2.25F, -1.0F, 2.2F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(9, 18).addBox(-2.35F, -7.075F, 0.85F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            Neck_Lower_r1 = new ZawaModelRenderer(this, 27, 0);
            Neck_Lower_r1.setPos(0.025F, -1.2283F, 5.4627F);
            bb_main.addChild(Neck_Lower_r1);
            setRotateAngle(Neck_Lower_r1, 0.2531F, 0.0F, 0.0F);
            Neck_Lower_r1.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.0001F, false);

            Neck_Lower_r2 = new ZawaModelRenderer(this, 14, 33);
            Neck_Lower_r2.setPos(0.0F, -5.8542F, 5.1644F);
            bb_main.addChild(Neck_Lower_r2);
            setRotateAngle(Neck_Lower_r2, -1.2174F, 0.0F, 0.0F);
            Neck_Lower_r2.addBox(-0.5F, -0.6362F, -1.8915F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            Neck_Lower_r3 = new ZawaModelRenderer(this, 12, 12);
            Neck_Lower_r3.setPos(0.0F, -5.8542F, 5.1644F);
            bb_main.addChild(Neck_Lower_r3);
            setRotateAngle(Neck_Lower_r3, -1.5228F, 0.0F, 0.0F);
            Neck_Lower_r3.addBox(-1.0F, -0.8882F, -0.1088F, 2.0F, 2.0F, 4.0F, -0.0001F, false);

            cube_r1 = new ZawaModelRenderer(this, 0, 0);
            cube_r1.setPos(0.75F, -2.05F, 4.975F);
            bb_main.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.7767F, 0.0F, 0.0F);
            cube_r1.texOffs(14, 25).addBox(-3.0F, -3.2155F, -1.8034F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            cube_r1.texOffs(28, 28).addBox(-0.5F, -3.2155F, -1.8034F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 0, 0);
            cube_r2.setPos(0.25F, -2.4753F, 3.944F);
            bb_main.addChild(cube_r2);
            setRotateAngle(cube_r2, -0.144F, 0.0F, 0.0F);
            cube_r2.texOffs(22, 25).addBox(-2.4F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r2.texOffs(26, 16).addBox(-0.1F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 0, 0);
            cube_r3.setPos(0.0F, -8.7655F, -4.8662F);
            bb_main.addChild(cube_r3);
            setRotateAngle(cube_r3, 0.5978F, 0.0F, 0.0F);
            cube_r3.addBox(-0.5F, -0.0775F, -1.4008F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 25, 4);
            cube_r4.setPos(-0.75F, 1.0F, -0.375F);
            bb_main.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.0654F, 0.0014F, 0.0F);
            cube_r4.addBox(1.075F, -4.6F, -3.35F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 6, 25);
            cube_r5.setPos(0.75F, 1.0F, -0.375F);
            bb_main.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.0654F, -0.0014F, 0.0F);
            cube_r5.addBox(-3.075F, -4.6F, -3.35F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 0, 0);
            cube_r6.setPos(0.0F, -3.4471F, -2.5196F);
            bb_main.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.1353F, 0.0F, 0.0F);
            cube_r6.texOffs(0, 29).addBox(-2.35F, -3.0731F, -0.9208F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            cube_r6.texOffs(29, 21).addBox(0.35F, -3.0731F, -0.9208F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            Neck_Lower_r4 = new ZawaModelRenderer(this, 20, 10);
            Neck_Lower_r4.setPos(0.5F, -8.0624F, -3.4627F);
            bb_main.addChild(Neck_Lower_r4);
            setRotateAngle(Neck_Lower_r4, -0.3272F, 0.0F, 0.0F);
            Neck_Lower_r4.addBox(-2.0F, -2.5814F, 6.1741F, 3.0F, 4.0F, 2.0F, 0.0F, false);

            Neck_Lower_r5 = new ZawaModelRenderer(this, 1, 1);
            Neck_Lower_r5.setPos(0.5F, -8.0624F, -2.4627F);
            bb_main.addChild(Neck_Lower_r5);
            setRotateAngle(Neck_Lower_r5, 0.0F, 0.0F, 0.0F);
            Neck_Lower_r5.addBox(-2.5F, -0.5403F, -0.2124F, 4.0F, 5.0F, 6.0F, 0.0F, false);

            Neck_Lower_r6 = new ZawaModelRenderer(this, 0, 12);
            Neck_Lower_r6.setPos(0.0F, -8.7655F, -5.0662F);
            bb_main.addChild(Neck_Lower_r6);
            setRotateAngle(Neck_Lower_r6, -0.2443F, 0.0F, 0.0F);
            Neck_Lower_r6.addBox(-1.5F, -0.3573F, 1.6537F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 0, 19);
            cube_r7.setPos(0.0F, -8.7655F, -4.8662F);
            bb_main.addChild(cube_r7);
            setRotateAngle(cube_r7, 0.6676F, 0.0F, 0.0F);
            cube_r7.addBox(-1.0F, -0.8059F, -0.8895F, 2.0F, 5.0F, 2.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 8, 31);
            cube_r8.setPos(0.0F, -9.757F, -6.2517F);
            bb_main.addChild(cube_r8);
            setRotateAngle(cube_r8, 0.0823F, -1.0224F, -0.4651F);
            cube_r8.addBox(0.0059F, -4.3058F, 0.6117F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 9, 12);
            cube_r9.setPos(0.0F, -8.4189F, -7.4517F);
            bb_main.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.2705F, 0.0F, 0.0F);
            cube_r9.addBox(-0.5F, -0.92F, -0.9763F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 39, 2);
            cube_r10.setPos(0.0F, -9.757F, -6.2517F);
            bb_main.addChild(cube_r10);
            setRotateAngle(cube_r10, 0.0823F, 1.0224F, 0.4651F);
            cube_r10.addBox(-1.0059F, -4.3058F, 0.6117F, 1.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 16, 18);
            cube_r11.setPos(0.0F, -8.4189F, -7.4517F);
            bb_main.addChild(cube_r11);
            setRotateAngle(cube_r11, 0.0785F, 0.0F, 0.0F);
            cube_r11.addBox(-0.5F, -0.0883F, -0.9039F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 33, 7);
            cube_r12.setPos(0.0F, -8.4189F, -7.4517F);
            bb_main.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.0393F, 0.0F, 0.0F);
            cube_r12.addBox(-1.0F, -0.4671F, -1.0378F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 15, 0);
            cube_r13.setPos(0.0F, -9.757F, -6.2517F);
            bb_main.addChild(cube_r13);
            setRotateAngle(cube_r13, -0.0131F, 0.0F, 0.0F);
            cube_r13.addBox(-1.5F, -0.7741F, -1.028F, 3.0F, 3.0F, 3.0F, 0.0F, false);
            this.saveBase();
        }

        @Override
        public void setupAnim(FennecFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

        public static class Child extends FennecFoxModel {

            protected ZawaModelRenderer Face;
            protected ZawaModelRenderer cube_r1;
            protected ZawaModelRenderer cube_r2;
            protected ZawaModelRenderer cube_r3;
            protected ZawaModelRenderer cube_r4;
            protected ZawaModelRenderer cube_r5;
            protected ZawaModelRenderer cube_r6;
            protected ZawaModelRenderer Back;
            protected ZawaModelRenderer cube_r7;
            protected ZawaModelRenderer Neck_Lower_r1;
            protected ZawaModelRenderer Neck_Lower_r2;
            protected ZawaModelRenderer Neck_Lower_r3;
            protected ZawaModelRenderer cube_r8;
            protected ZawaModelRenderer Neck_Lower_r4;
            protected ZawaModelRenderer Neck_Lower_r5;
            protected ZawaModelRenderer Neck_Lower_r6;
            protected ZawaModelRenderer LeftFrontPaws;
            protected ZawaModelRenderer cube_r9;
            protected ZawaModelRenderer cube_r10;
            protected ZawaModelRenderer LeftBackPaws;
            protected ZawaModelRenderer cube_r11;
            protected ZawaModelRenderer cube_r12;
            protected ZawaModelRenderer RightFrontPaws;
            protected ZawaModelRenderer cube_r13;
            protected ZawaModelRenderer cube_r14;
            protected ZawaModelRenderer RightBackPaws;
            protected ZawaModelRenderer cube_r15;
            protected ZawaModelRenderer cube_r16;

            public Child() {

                texWidth = 64;
                texHeight = 64;

                bb_main = new ZawaModelRenderer(this, 0, 0);
                bb_main.setPos(-0.75F, 24.25F, 4.525F);


                Face = new ZawaModelRenderer(this, 0, 0);
                Face.setPos(0.0F, 0.0F, 0.0F);
                bb_main.addChild(Face);


                cube_r1 = new ZawaModelRenderer(this, 15, 0);
                cube_r1.setPos(0.75F, -8.532F, -10.3767F);
                Face.addChild(cube_r1);
                setRotateAngle(cube_r1, -0.0131F, 0.0F, 0.0F);
                cube_r1.addBox(-1.5F, -0.7741F, -1.028F, 3.0F, 3.0F, 3.0F, 0.0F, false);

                cube_r2 = new ZawaModelRenderer(this, 6, 28);
                cube_r2.setPos(0.75F, -7.1939F, -11.5017F);
                Face.addChild(cube_r2);
                setRotateAngle(cube_r2, 0.0393F, 0.0F, 0.0F);
                cube_r2.addBox(-1.0F, -0.4671F, -1.0378F, 2.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r3 = new ZawaModelRenderer(this, 16, 18);
                cube_r3.setPos(0.75F, -7.1939F, -11.5017F);
                Face.addChild(cube_r3);
                setRotateAngle(cube_r3, 0.0785F, 0.0F, 0.0F);
                cube_r3.addBox(-0.5F, -0.0883F, -0.9039F, 1.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r4 = new ZawaModelRenderer(this, 32, 9);
                cube_r4.setPos(0.75F, -8.532F, -10.3767F);
                Face.addChild(cube_r4);
                setRotateAngle(cube_r4, 0.0823F, 1.0224F, 0.4651F);
                cube_r4.addBox(-1.0059F, -4.3058F, 0.6117F, 1.0F, 4.0F, 2.0F, 0.0F, false);

                cube_r5 = new ZawaModelRenderer(this, 9, 12);
                cube_r5.setPos(0.75F, -7.1939F, -11.5017F);
                Face.addChild(cube_r5);
                setRotateAngle(cube_r5, 0.2705F, 0.0F, 0.0F);
                cube_r5.addBox(-0.5F, -0.92F, -0.9763F, 1.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r6 = new ZawaModelRenderer(this, 8, 31);
                cube_r6.setPos(0.75F, -8.532F, -10.3767F);
                Face.addChild(cube_r6);
                setRotateAngle(cube_r6, 0.0823F, -1.0224F, -0.4651F);
                cube_r6.addBox(0.0059F, -4.3058F, 0.6117F, 1.0F, 4.0F, 2.0F, 0.0F, false);

                Back = new ZawaModelRenderer(this, 0, 0);
                Back.setPos(0.0F, 0.0F, 0.0F);
                bb_main.addChild(Back);


                cube_r7 = new ZawaModelRenderer(this, 0, 19);
                cube_r7.setPos(0.75F, -7.5405F, -8.9912F);
                Back.addChild(cube_r7);
                setRotateAngle(cube_r7, 0.6676F, 0.0F, 0.0F);
                cube_r7.addBox(-1.0F, -0.8059F, -0.8895F, 2.0F, 3.0F, 2.0F, 0.0F, false);

                Neck_Lower_r1 = new ZawaModelRenderer(this, 1, 13);
                Neck_Lower_r1.setPos(0.75F, -7.6655F, -9.7662F);
                Back.addChild(Neck_Lower_r1);
                setRotateAngle(Neck_Lower_r1, -0.3665F, 0.0F, 0.0F);
                Neck_Lower_r1.addBox(-1.5F, -0.9823F, 1.7787F, 3.0F, 4.0F, 2.0F, 0.0F, false);

                Neck_Lower_r2 = new ZawaModelRenderer(this, 2, 2);
                Neck_Lower_r2.setPos(1.25F, -6.9624F, -7.3877F);
                Back.addChild(Neck_Lower_r2);
                setRotateAngle(Neck_Lower_r2, 0.0F, 0.0F, 0.0F);
                Neck_Lower_r2.addBox(-2.5F, -0.5403F, -0.2124F, 4.0F, 4.0F, 5.0F, 0.0F, false);

                Neck_Lower_r3 = new ZawaModelRenderer(this, 20, 10);
                Neck_Lower_r3.setPos(1.25F, -6.9624F, -9.3877F);
                Back.addChild(Neck_Lower_r3);
                setRotateAngle(Neck_Lower_r3, -0.3272F, 0.0F, 0.0F);
                Neck_Lower_r3.addBox(-2.0F, -2.5814F, 6.1741F, 3.0F, 4.0F, 2.0F, 0.0F, false);

                cube_r8 = new ZawaModelRenderer(this, 0, 0);
                cube_r8.setPos(0.75F, -7.5405F, -8.9912F);
                Back.addChild(cube_r8);
                setRotateAngle(cube_r8, 0.5978F, 0.0F, 0.0F);
                cube_r8.addBox(-0.5F, 0.2975F, -1.5008F, 1.0F, 2.0F, 2.0F, 0.0F, false);

                Neck_Lower_r4 = new ZawaModelRenderer(this, 14, 14);
                Neck_Lower_r4.setPos(0.75F, -5.7792F, -0.7606F);
                Back.addChild(Neck_Lower_r4);
                setRotateAngle(Neck_Lower_r4, -1.5228F, 0.0F, 0.0F);
                Neck_Lower_r4.addBox(-1.0F, -0.8882F, 0.8912F, 2.0F, 2.0F, 2.0F, -0.0001F, false);

                Neck_Lower_r5 = new ZawaModelRenderer(this, 14, 33);
                Neck_Lower_r5.setPos(0.75F, -4.7792F, -0.7606F);
                Back.addChild(Neck_Lower_r5);
                setRotateAngle(Neck_Lower_r5, -1.2174F, 0.0F, 0.0F);
                Neck_Lower_r5.addBox(-0.5F, -0.6362F, -1.8915F, 1.0F, 2.0F, 2.0F, 0.0F, false);

                Neck_Lower_r6 = new ZawaModelRenderer(this, 27, 0);
                Neck_Lower_r6.setPos(0.775F, -1.1533F, -0.4623F);
                Back.addChild(Neck_Lower_r6);
                setRotateAngle(Neck_Lower_r6, 0.2531F, 0.0F, 0.0F);
                Neck_Lower_r6.addBox(-1.0F, -2.0F, -0.825F, 2.0F, 2.0F, 2.0F, -0.0001F, false);

                LeftFrontPaws = new ZawaModelRenderer(this, 30, 10);
                LeftFrontPaws.setPos(0.0F, 0.0F, 0.0F);
                bb_main.addChild(LeftFrontPaws);
                LeftFrontPaws.addBox(1.05F, -1.25F, -8.95F, 2.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r9 = new ZawaModelRenderer(this, 29, 21);
                cube_r9.setPos(0.75F, -2.6971F, -7.2696F);
                LeftFrontPaws.addChild(cube_r9);
                setRotateAngle(cube_r9, 0.1353F, 0.0F, 0.0F);
                cube_r9.addBox(0.35F, -3.0731F, -0.9208F, 2.0F, 3.0F, 2.0F, 0.0F, false);

                cube_r10 = new ZawaModelRenderer(this, 25, 4);
                cube_r10.setPos(0.0F, 1.75F, -5.125F);
                LeftFrontPaws.addChild(cube_r10);
                setRotateAngle(cube_r10, -0.0654F, 0.0014F, 0.0F);
                cube_r10.addBox(1.075F, -4.6F, -3.35F, 2.0F, 2.0F, 2.0F, 0.0F, false);

                LeftBackPaws = new ZawaModelRenderer(this, 0, 0);
                LeftBackPaws.setPos(0.0F, 0.0F, 0.0F);
                bb_main.addChild(LeftBackPaws);
                LeftBackPaws.texOffs(20, 30).addBox(1.0F, -1.0F, -4.075F, 2.0F, 1.0F, 2.0F, 0.0F, false);
                LeftBackPaws.texOffs(19, 18).addBox(1.1F, -5.325F, -4.675F, 2.0F, 3.0F, 3.0F, 0.0F, false);

                cube_r11 = new ZawaModelRenderer(this, 28, 28);
                cube_r11.setPos(0.0F, -1.3F, -0.55F);
                LeftBackPaws.addChild(cube_r11);
                setRotateAngle(cube_r11, 0.7767F, 0.0F, 0.0F);
                cube_r11.addBox(1.0F, -3.2155F, -1.8034F, 2.0F, 2.0F, 2.0F, 0.0F, false);

                cube_r12 = new ZawaModelRenderer(this, 26, 16);
                cube_r12.setPos(0.5F, -2.4753F, -2.331F);
                LeftBackPaws.addChild(cube_r12);
                setRotateAngle(cube_r12, -0.144F, 0.0F, 0.0F);
                cube_r12.addBox(0.4F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

                RightFrontPaws = new ZawaModelRenderer(this, 30, 13);
                RightFrontPaws.setPos(0.0F, 0.0F, 0.0F);
                bb_main.addChild(RightFrontPaws);
                RightFrontPaws.addBox(-1.55F, -1.25F, -8.95F, 2.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r13 = new ZawaModelRenderer(this, 0, 29);
                cube_r13.setPos(0.75F, -2.6971F, -7.2696F);
                RightFrontPaws.addChild(cube_r13);
                setRotateAngle(cube_r13, 0.1353F, 0.0F, 0.0F);
                cube_r13.addBox(-2.35F, -3.0731F, -0.9208F, 2.0F, 3.0F, 2.0F, 0.0F, false);

                cube_r14 = new ZawaModelRenderer(this, 6, 25);
                cube_r14.setPos(1.5F, 1.75F, -5.125F);
                RightFrontPaws.addChild(cube_r14);
                setRotateAngle(cube_r14, -0.0654F, -0.0014F, 0.0F);
                cube_r14.addBox(-3.075F, -4.6F, -3.35F, 2.0F, 2.0F, 2.0F, 0.0F, false);

                RightBackPaws = new ZawaModelRenderer(this, 0, 0);
                RightBackPaws.setPos(0.0F, 0.0F, 0.0F);
                bb_main.addChild(RightBackPaws);
                RightBackPaws.texOffs(9, 18).addBox(-1.6F, -5.325F, -4.675F, 2.0F, 3.0F, 3.0F, 0.0F, false);
                RightBackPaws.texOffs(12, 30).addBox(-1.5F, -1.0F, -4.075F, 2.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r15 = new ZawaModelRenderer(this, 22, 25);
                cube_r15.setPos(1.0F, -2.4753F, -2.331F);
                RightBackPaws.addChild(cube_r15);
                setRotateAngle(cube_r15, -0.144F, 0.0F, 0.0F);
                cube_r15.addBox(-2.4F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

                cube_r16 = new ZawaModelRenderer(this, 14, 25);
                cube_r16.setPos(1.5F, -1.3F, -0.55F);
                RightBackPaws.addChild(cube_r16);
                setRotateAngle(cube_r16, 0.7767F, 0.0F, 0.0F);
                cube_r16.addBox(-3.0F, -3.2155F, -1.8034F, 2.0F, 2.0F, 2.0F, 0.0F, false);
                this.saveBase();
            }

            @Override
            public void setupAnim(FennecFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
