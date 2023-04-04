package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.KiwiEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class KiwiModel extends ZawaBaseModel<KiwiEntity> {
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

    public static class Adult extends KiwiModel {
        protected ZawaModelRenderer Head;
        protected ZawaModelRenderer cube_r1;
        protected ZawaModelRenderer cube_r2;
        protected ZawaModelRenderer Body;
        protected ZawaModelRenderer BodyEnd_r1;
        protected ZawaModelRenderer cube_r3;
        protected ZawaModelRenderer Neck_r1;
        protected ZawaModelRenderer MainBody_r1;
        protected ZawaModelRenderer LeftLeg;
        protected ZawaModelRenderer cube_r4;
        protected ZawaModelRenderer cube_r5;
        protected ZawaModelRenderer Toe3_r1;
        protected ZawaModelRenderer Toe1_r1;
        protected ZawaModelRenderer RightLeg;
        protected ZawaModelRenderer Toe3_r2;
        protected ZawaModelRenderer Toe1_r2;

        public Adult() {
            texWidth = 32;
            texHeight = 32;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 25.0F, 0.0F);


            Head = new ZawaModelRenderer(this, 0, 0);
            Head.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Head);


            cube_r1 = new ZawaModelRenderer(this, 0, 10);
            cube_r1.setPos(-2.0F, 0.0F, 0.0F);
            Head.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
            cube_r1.addBox(0.45F, -9.35F, -3.85F, 1.0F, 1.0F, 5.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 0, 0);
            cube_r2.setPos(-2.0F, 0.0F, 0.0F);
            Head.addChild(cube_r2);
            setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
            cube_r2.texOffs(7, 11).addBox(0.45F, -8.35F, -5.45F, 1.0F, 1.0F, 5.0F, 0.0F, false);
            cube_r2.texOffs(14, 10).addBox(-0.55F, -9.55F, -2.25F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            Body = new ZawaModelRenderer(this, 0, 0);
            Body.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(Body);


            BodyEnd_r1 = new ZawaModelRenderer(this, 16, 16);
            BodyEnd_r1.setPos(-1.0F, -6.25F, 5.0F);
            Body.addChild(BodyEnd_r1);
            setRotateAngle(BodyEnd_r1, -0.5236F, 0.0F, 0.0F);
            BodyEnd_r1.addBox(-1.5F, -1.6168F, -1.6608F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 13, 0);
            cube_r3.setPos(-1.0F, -6.0F, 6.0F);
            Body.addChild(cube_r3);
            setRotateAngle(cube_r3, -2.6616F, 0.0F, 0.0F);
            cube_r3.addBox(-1.025F, -1.5345F, -0.9682F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            Neck_r1 = new ZawaModelRenderer(this, 0, 16);
            Neck_r1.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(Neck_r1);
            setRotateAngle(Neck_r1, 0.6964F, 0.0F, 0.0F);
            Neck_r1.addBox(-2.1F, -6.95F, 2.8F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            MainBody_r1 = new ZawaModelRenderer(this, 0, 0);
            MainBody_r1.setPos(0.0F, 0.0F, 0.0F);
            Body.addChild(MainBody_r1);
            setRotateAngle(MainBody_r1, -0.0436F, 0.0F, 0.0F);
            MainBody_r1.addBox(-3.0F, -8.8F, -0.25F, 4.0F, 5.0F, 5.0F, 0.0F, false);

            LeftLeg = new ZawaModelRenderer(this, 6, 20);
            LeftLeg.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(LeftLeg);
            LeftLeg.addBox(-0.5F, -2.05F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 0, 0);
            cube_r4.setPos(0.0F, 0.0F, 0.0F);
            LeftLeg.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
            cube_r4.texOffs(0, 0).addBox(-2.5F, -4.25F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            cube_r4.texOffs(0, 10).addBox(-0.5F, -4.25F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 0, 0);
            cube_r5.setPos(0.0F, 0.0F, 0.0F);
            LeftLeg.addChild(cube_r5);
            setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
            cube_r5.texOffs(8, 17).addBox(-2.75F, -3.55F, 2.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r5.texOffs(18, 5).addBox(-1.25F, -3.55F, 2.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            Toe3_r1 = new ZawaModelRenderer(this, 7, 12);
            Toe3_r1.setPos(0.0F, 0.0F, 0.0F);
            LeftLeg.addChild(Toe3_r1);
            setRotateAngle(Toe3_r1, 0.0F, 0.2618F, 0.0F);
            Toe3_r1.addBox(-1.15F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Toe1_r1 = new ZawaModelRenderer(this, 0, 13);
            Toe1_r1.setPos(0.0F, 0.0F, 0.0F);
            LeftLeg.addChild(Toe1_r1);
            setRotateAngle(Toe1_r1, 0.0F, -0.2618F, 0.0F);
            Toe1_r1.addBox(0.15F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            RightLeg = new ZawaModelRenderer(this, 20, 0);
            RightLeg.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(RightLeg);
            RightLeg.addBox(-2.5F, -2.05F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            Toe3_r2 = new ZawaModelRenderer(this, 7, 10);
            Toe3_r2.setPos(-2.0F, 0.0F, 0.0F);
            RightLeg.addChild(Toe3_r2);
            setRotateAngle(Toe3_r2, 0.0F, 0.2618F, 0.0F);
            Toe3_r2.addBox(-1.15F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Toe1_r2 = new ZawaModelRenderer(this, 0, 3);
            Toe1_r2.setPos(-2.0F, 0.0F, 0.0F);
            RightLeg.addChild(Toe1_r2);
            setRotateAngle(Toe1_r2, 0.0F, -0.2618F, 0.0F);
            Toe1_r2.addBox(0.15F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            this.saveBase();
        }

        @Override
        public void setupAnim(KiwiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }
        public static class Child extends KiwiModel {
            protected ZawaModelRenderer Head;
            protected ZawaModelRenderer cube_r1;
            protected ZawaModelRenderer cube_r2;
            protected ZawaModelRenderer Body;
            protected ZawaModelRenderer BodyEnd_r1;
            protected ZawaModelRenderer cube_r3;
            protected ZawaModelRenderer Neck_r1;
            protected ZawaModelRenderer MainBody_r1;
            protected ZawaModelRenderer LeftLeg;
            protected ZawaModelRenderer cube_r4;
            protected ZawaModelRenderer cube_r5;
            protected ZawaModelRenderer Toe3_r1;
            protected ZawaModelRenderer Toe1_r1;
            protected ZawaModelRenderer RightLeg;
            protected ZawaModelRenderer Toe3_r2;
            protected ZawaModelRenderer Toe1_r2;

            public Child() {
                texWidth = 32;
                texHeight = 32;

                MAIN = new ZawaModelRenderer(this, 0, 0);
                MAIN.setPos(0.0F, 25.0F, 0.0F);


                Head = new ZawaModelRenderer(this, 0, 0);
                Head.setPos(0.0F, 0.0F, 0.0F);
                MAIN.addChild(Head);


                cube_r1 = new ZawaModelRenderer(this, 0, 10);
                cube_r1.setPos(-2.0F, 0.0F, 0.0F);
                Head.addChild(cube_r1);
                setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
                cube_r1.addBox(0.45F, -9.35F, -3.85F, 1.0F, 1.0F, 5.0F, 0.0F, false);

                cube_r2 = new ZawaModelRenderer(this, 0, 0);
                cube_r2.setPos(-2.0F, 0.0F, 0.0F);
                Head.addChild(cube_r2);
                setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
                cube_r2.texOffs(7, 11).addBox(0.45F, -8.35F, -5.45F, 1.0F, 1.0F, 5.0F, 0.0F, false);
                cube_r2.texOffs(14, 10).addBox(-0.55F, -9.55F, -2.25F, 3.0F, 3.0F, 3.0F, 0.0F, false);

                Body = new ZawaModelRenderer(this, 0, 0);
                Body.setPos(0.0F, 0.0F, 0.0F);
                MAIN.addChild(Body);


                BodyEnd_r1 = new ZawaModelRenderer(this, 16, 16);
                BodyEnd_r1.setPos(-1.0F, -6.25F, 5.0F);
                Body.addChild(BodyEnd_r1);
                setRotateAngle(BodyEnd_r1, -0.5236F, 0.0F, 0.0F);
                BodyEnd_r1.addBox(-1.5F, -1.6168F, -1.6608F, 3.0F, 3.0F, 3.0F, 0.0F, false);

                cube_r3 = new ZawaModelRenderer(this, 13, 0);
                cube_r3.setPos(-1.0F, -6.0F, 6.0F);
                Body.addChild(cube_r3);
                setRotateAngle(cube_r3, -2.6616F, 0.0F, 0.0F);
                cube_r3.addBox(-1.025F, -1.5345F, -0.9682F, 2.0F, 2.0F, 3.0F, 0.0F, false);

                Neck_r1 = new ZawaModelRenderer(this, 0, 16);
                Neck_r1.setPos(0.0F, 0.0F, 0.0F);
                Body.addChild(Neck_r1);
                setRotateAngle(Neck_r1, 0.6964F, 0.0F, 0.0F);
                Neck_r1.addBox(-2.1F, -6.95F, 2.8F, 2.0F, 4.0F, 2.0F, 0.0F, false);

                MainBody_r1 = new ZawaModelRenderer(this, 0, 0);
                MainBody_r1.setPos(0.0F, 0.0F, 0.0F);
                Body.addChild(MainBody_r1);
                setRotateAngle(MainBody_r1, -0.0436F, 0.0F, 0.0F);
                MainBody_r1.addBox(-3.0F, -8.8F, -0.25F, 4.0F, 5.0F, 5.0F, 0.0F, false);

                LeftLeg = new ZawaModelRenderer(this, 6, 20);
                LeftLeg.setPos(0.0F, 0.0F, 0.0F);
                MAIN.addChild(LeftLeg);
                LeftLeg.addBox(-0.5F, -2.05F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

                cube_r4 = new ZawaModelRenderer(this, 0, 0);
                cube_r4.setPos(0.0F, 0.0F, 0.0F);
                LeftLeg.addChild(cube_r4);
                setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
                cube_r4.texOffs(0, 0).addBox(-2.5F, -4.25F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
                cube_r4.texOffs(0, 10).addBox(-0.5F, -4.25F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

                cube_r5 = new ZawaModelRenderer(this, 0, 0);
                cube_r5.setPos(0.0F, 0.0F, 0.0F);
                LeftLeg.addChild(cube_r5);
                setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
                cube_r5.texOffs(8, 17).addBox(-2.75F, -3.55F, 2.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
                cube_r5.texOffs(18, 5).addBox(-1.25F, -3.55F, 2.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

                Toe3_r1 = new ZawaModelRenderer(this, 7, 12);
                Toe3_r1.setPos(0.0F, 0.0F, 0.0F);
                LeftLeg.addChild(Toe3_r1);
                setRotateAngle(Toe3_r1, 0.0F, 0.2618F, 0.0F);
                Toe3_r1.addBox(-1.15F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

                Toe1_r1 = new ZawaModelRenderer(this, 0, 13);
                Toe1_r1.setPos(0.0F, 0.0F, 0.0F);
                LeftLeg.addChild(Toe1_r1);
                setRotateAngle(Toe1_r1, 0.0F, -0.2618F, 0.0F);
                Toe1_r1.addBox(0.15F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

                RightLeg = new ZawaModelRenderer(this, 20, 0);
                RightLeg.setPos(0.0F, 0.0F, 0.0F);
                MAIN.addChild(RightLeg);
                RightLeg.addBox(-2.5F, -2.05F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

                Toe3_r2 = new ZawaModelRenderer(this, 7, 10);
                Toe3_r2.setPos(-2.0F, 0.0F, 0.0F);
                RightLeg.addChild(Toe3_r2);
                setRotateAngle(Toe3_r2, 0.0F, 0.2618F, 0.0F);
                Toe3_r2.addBox(-1.15F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

                Toe1_r2 = new ZawaModelRenderer(this, 0, 3);
                Toe1_r2.setPos(-2.0F, 0.0F, 0.0F);
                RightLeg.addChild(Toe1_r2);
                setRotateAngle(Toe1_r2, 0.0F, -0.2618F, 0.0F);
                Toe1_r2.addBox(0.15F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

                this.saveBase();
            }
            @Override
            public void setupAnim(KiwiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
