package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TakaheEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TakaheEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class TakaheModel extends ZawaBaseModel<TakaheEntity> {
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

    public static class Adult extends TakaheModel {
        protected ZawaModelRenderer HEAD;
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer Beak_r1;
        protected ZawaModelRenderer shape83_r1;
        protected ZawaModelRenderer Mouth_r1;
        protected ZawaModelRenderer BeakTip_r1;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer shape84_r1;
        protected ZawaModelRenderer shape85_r1;
        protected ZawaModelRenderer shape88_r1;
        protected ZawaModelRenderer Body_r1;
        protected ZawaModelRenderer shape88_r2;
        protected ZawaModelRenderer Neck1_r1;
        protected ZawaModelRenderer Neck2_r1;
        protected ZawaModelRenderer TAIL;
        protected ZawaModelRenderer Tail1Left_r1;
        protected ZawaModelRenderer Tail1_r1;
        protected ZawaModelRenderer Tail2_r1;
        protected ZawaModelRenderer TailCenter_r1;
        protected ZawaModelRenderer Tail1Right_r1;
        protected ZawaModelRenderer Tail2Right_r1;
        protected ZawaModelRenderer Tail2Left_r1;
        protected ZawaModelRenderer FEET;
        protected ZawaModelRenderer Thigh_r1;
        protected ZawaModelRenderer Leg_r1;
        protected ZawaModelRenderer Foot_r1;
        protected ZawaModelRenderer ToeLeft_r1;
        protected ZawaModelRenderer ToeFront_r1;
        protected ZawaModelRenderer ToeLeft_r2;
        protected ZawaModelRenderer Thigh_r2;
        protected ZawaModelRenderer Leg_r2;
        protected ZawaModelRenderer Foot_r2;
        protected ZawaModelRenderer ToeLeft_r3;
        protected ZawaModelRenderer ToeFront_r2;
        protected ZawaModelRenderer ToeLeft_r4;

        public Adult() {
            
            texWidth = 64;
            texHeight = 64;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(0.0F, 24.0F, 0.0F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, -24.5F, 0.0F);
            MAIN.addChild(HEAD);


            Head_r1 = new ZawaModelRenderer(this, 9, 15);
            Head_r1.setPos(0.0F, 22.1805F, -4.4866F);
            HEAD.addChild(Head_r1);
            setRotateAngle(Head_r1, 0.0436F, 0.0F, 0.0F);
            Head_r1.addBox(-1.5F, -11.1595F, -2.4383F, 3.0F, 3.0F, 4.0F, 0.0F, false);

            Beak_r1 = new ZawaModelRenderer(this, 40, 20);
            Beak_r1.setPos(0.0F, 21.3774F, -2.366F);
            HEAD.addChild(Beak_r1);
            setRotateAngle(Beak_r1, 0.2531F, 0.0F, 0.0F);
            Beak_r1.addBox(-1.0F, -10.8996F, -3.861F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            shape83_r1 = new ZawaModelRenderer(this, 0, 0);
            shape83_r1.setPos(0.0F, 18.1713F, 0.5442F);
            HEAD.addChild(shape83_r1);
            setRotateAngle(shape83_r1, 0.637F, 0.0F, 0.0F);
            shape83_r1.texOffs(0, 18).addBox(-0.2F, -10.6134F, -3.7807F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            shape83_r1.texOffs(28, 8).addBox(-0.8F, -10.6134F, -3.7807F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            Mouth_r1 = new ZawaModelRenderer(this, 29, 29);
            Mouth_r1.setPos(0.0F, 22.2877F, -4.2793F);
            HEAD.addChild(Mouth_r1);
            setRotateAngle(Mouth_r1, 0.0255F, 0.0F, 0.0F);
            Mouth_r1.addBox(-0.5F, -9.291F, -3.9399F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            BeakTip_r1 = new ZawaModelRenderer(this, 20, 0);
            BeakTip_r1.setPos(0.0F, 12.9903F, -8.6184F);
            HEAD.addChild(BeakTip_r1);
            setRotateAngle(BeakTip_r1, -0.2932F, 0.0F, 0.0F);
            BeakTip_r1.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this,0, 0);
            BODY.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(BODY);


            shape84_r1 = new ZawaModelRenderer(this, 29, 24);
            shape84_r1.setPos(0.0F, -1.1648F, 1.6436F);
            BODY.addChild(shape84_r1);
            setRotateAngle(shape84_r1, 0.1384F, 0.0F, 0.0F);
            shape84_r1.addBox(-2.5F, -11.0F, -3.1F, 5.0F, 2.0F, 3.0F, 0.0F, false);

            shape85_r1 = new ZawaModelRenderer(this, 0, 27);
            shape85_r1.setPos(0.0F, -1.2313F, -1.987F);
            BODY.addChild(shape85_r1);
            setRotateAngle(shape85_r1, -0.1932F, 0.0F, 0.0F);
            shape85_r1.addBox(-2.5F, -11.0F, -0.1F, 5.0F, 2.0F, 4.0F, 0.0F, false);

            shape88_r1 = new ZawaModelRenderer(this, 16, 15);
            shape88_r1.setPos(1.2382F, -0.8504F, -0.2246F);
            BODY.addChild(shape88_r1);
            setRotateAngle(shape88_r1, -0.0433F, -0.0515F, -0.1346F);
            shape88_r1.addBox(-3.75F, -10.4F, -3.5F, 1.0F, 5.0F, 7.0F, 0.0F, false);

            Body_r1 = new ZawaModelRenderer(this, 0, 0);
            Body_r1.setPos(0.0F, -0.5071F, -0.3271F);
            BODY.addChild(Body_r1);
            setRotateAngle(Body_r1, -0.0436F, 0.0F, 0.0F);
            Body_r1.addBox(-3.0F, -11.0F, -4.0F, 6.0F, 7.0F, 8.0F, 0.0F, false);

            shape88_r2 = new ZawaModelRenderer(this, 0, 15);
            shape88_r2.setPos(-1.2382F, -0.8504F, -0.2246F);
            BODY.addChild(shape88_r2);
            setRotateAngle(shape88_r2, -0.0433F, 0.0515F, 0.1346F);
            shape88_r2.addBox(2.75F, -10.4F, -3.5F, 1.0F, 5.0F, 7.0F, 0.0F, false);

            Neck1_r1 = new ZawaModelRenderer(this, 25, 11);
            Neck1_r1.setPos(0.0F, -4.2793F, 2.0232F);
            BODY.addChild(Neck1_r1);
            setRotateAngle(Neck1_r1, 0.8215F, 0.0F, 0.0F);
            Neck1_r1.addBox(-2.0F, -9.0437F, -2.8616F, 4.0F, 5.0F, 4.0F, 0.0F, false);

            Neck2_r1 = new ZawaModelRenderer(this, 32, 32);
            Neck2_r1.setPos(0.0F, -2.3806F, -5.263F);
            BODY.addChild(Neck2_r1);
            setRotateAngle(Neck2_r1, -0.0436F, 0.0F, 0.0F);
            Neck2_r1.addBox(-1.0F, -8.9153F, -1.4503F, 2.0F, 3.0F, 3.0F, 0.0F, false);

            TAIL = new ZawaModelRenderer(this, 0, 0);
            TAIL.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(TAIL);


            Tail1Left_r1 = new ZawaModelRenderer(this, 0, 33);
            Tail1Left_r1.setPos(0.4391F, 0.2271F, 4.9424F);
            TAIL.addChild(Tail1Left_r1);
            setRotateAngle(Tail1Left_r1, 0.5021F, 0.0252F, -0.0459F);
            Tail1Left_r1.addBox(-1.4F, -7.825F, 2.6F, 1.0F, 5.0F, 3.0F, 0.0F, false);

            Tail1_r1 = new ZawaModelRenderer(this, 20, 0);
            Tail1_r1.setPos(0.0F, -0.6531F, 8.6159F);
            TAIL.addChild(Tail1_r1);
            setRotateAngle(Tail1_r1, 1.0036F, 0.0F, 0.0F);
            Tail1_r1.addBox(-2.5F, -9.5F, 1.5F, 5.0F, 3.0F, 5.0F, 0.0F, false);

            Tail2_r1 = new ZawaModelRenderer(this, 18, 27);
            Tail2_r1.setPos(0.0F, 0.3045F, 5.255F);
            TAIL.addChild(Tail2_r1);
            setRotateAngle(Tail2_r1, 0.5482F, 0.0F, 0.0F);
            Tail2_r1.addBox(-1.5F, -7.8F, 1.2F, 3.0F, 3.0F, 5.0F, 0.0F, false);

            TailCenter_r1 = new ZawaModelRenderer(this, 35, 0);
            TailCenter_r1.setPos(0.0F, 0.2556F, 4.958F);
            TAIL.addChild(TailCenter_r1);
            setRotateAngle(TailCenter_r1, 0.5027F, 0.0F, 0.0F);
            TailCenter_r1.addBox(-1.0F, -5.1F, 2.7F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            Tail1Right_r1 = new ZawaModelRenderer(this, 0, 0);
            Tail1Right_r1.setPos(-0.4391F, 0.2271F, 4.9424F);
            TAIL.addChild(Tail1Right_r1);
            setRotateAngle(Tail1Right_r1, 0.5021F, -0.0252F, 0.0459F);
            Tail1Right_r1.addBox(0.4F, -7.825F, 2.6F, 1.0F, 5.0F, 3.0F, 0.0F, false);

            Tail2Right_r1 = new ZawaModelRenderer(this, 25, 38);
            Tail2Right_r1.setPos(-1.1626F, 0.1123F, 4.8793F);
            TAIL.addChild(Tail2Right_r1);
            setRotateAngle(Tail2Right_r1, 0.4985F, -0.0671F, 0.1225F);
            Tail2Right_r1.addBox(1.2F, -8.4F, 2.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);

            Tail2Left_r1 = new ZawaModelRenderer(this, 33, 38);
            Tail2Left_r1.setPos(1.1626F, 0.1123F, 4.8793F);
            TAIL.addChild(Tail2Left_r1);
            setRotateAngle(Tail2Left_r1, 0.4985F, 0.0671F, -0.1225F);
            Tail2Left_r1.addBox(-2.2F, -8.4F, 2.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);

            FEET = new ZawaModelRenderer(this, 0, 0);
            FEET.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(FEET);


            Thigh_r1 = new ZawaModelRenderer(this, 8, 33);
            Thigh_r1.setPos(0.1188F, -0.3616F, 1.7481F);
            FEET.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, 0.3054F, 0.0167F, -0.0182F);
            Thigh_r1.addBox(0.7F, -6.3F, -1.9F, 2.0F, 3.0F, 3.0F, 0.0F, false);

            Leg_r1 = new ZawaModelRenderer(this, 9, 15);
            Leg_r1.setPos(0.0441F, -0.2833F, 0.4171F);
            FEET.addChild(Leg_r1);
            setRotateAngle(Leg_r1, -0.087F, 0.0114F, -0.0016F);
            Leg_r1.addBox(1.2F, -3.4F, -0.9F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            Foot_r1 = new ZawaModelRenderer(this, 14, 27);
            Foot_r1.setPos(0.0446F, -0.1772F, 0.4474F);
            FEET.addChild(Foot_r1);
            setRotateAngle(Foot_r1, 0.0002F, 0.0114F, -0.0016F);
            Foot_r1.addBox(1.2F, -0.9F, -1.8F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            ToeLeft_r1 = new ZawaModelRenderer(this, 32, 20);
            ToeLeft_r1.setPos(-0.6072F, -0.1759F, -0.6758F);
            FEET.addChild(ToeLeft_r1);
            setRotateAngle(ToeLeft_r1, 0.0002F, -0.3528F, -0.0016F);
            ToeLeft_r1.addBox(2.25F, -0.9F, -2.3F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            ToeFront_r1 = new ZawaModelRenderer(this, 0, 15);
            ToeFront_r1.setPos(0.0446F, -0.1772F, 0.4474F);
            FEET.addChild(ToeFront_r1);
            setRotateAngle(ToeFront_r1, 0.0002F, 0.0114F, -0.0016F);
            ToeFront_r1.addBox(1.2F, -1.0F, -2.7F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            ToeLeft_r2 = new ZawaModelRenderer(this, 39, 11);
            ToeLeft_r2.setPos(0.9075F, -0.1785F, 0.5182F);
            FEET.addChild(ToeLeft_r2);
            setRotateAngle(ToeLeft_r2, 0.0003F, 0.3757F, -0.0015F);
            ToeLeft_r2.addBox(0.15F, -0.9F, -2.3F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            Thigh_r2 = new ZawaModelRenderer(this, 18, 35);
            Thigh_r2.setPos(-0.1188F, -0.3616F, 1.7481F);
            FEET.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, 0.3054F, -0.0167F, 0.0182F);
            Thigh_r2.addBox(-2.7F, -6.3F, -1.9F, 2.0F, 3.0F, 3.0F, 0.0F, false);

            Leg_r2 = new ZawaModelRenderer(this, 19, 15);
            Leg_r2.setPos(-0.0441F, -0.2833F, 0.4171F);
            FEET.addChild(Leg_r2);
            setRotateAngle(Leg_r2, -0.087F, -0.0114F, 0.0016F);
            Leg_r2.addBox(-2.2F, -3.4F, -0.9F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            Foot_r2 = new ZawaModelRenderer(this, 13, 39);
            Foot_r2.setPos(-0.0446F, -0.1772F, 0.4474F);
            FEET.addChild(Foot_r2);
            setRotateAngle(Foot_r2, 0.0002F, -0.0114F, 0.0016F);
            Foot_r2.addBox(-2.2F, -0.9F, -1.8F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            ToeLeft_r3 = new ZawaModelRenderer(this, 41, 38);
            ToeLeft_r3.setPos(-0.9075F, -0.1785F, 0.5182F);
            FEET.addChild(ToeLeft_r3);
            setRotateAngle(ToeLeft_r3, 0.0003F, -0.3757F, 0.0015F);
            ToeLeft_r3.addBox(-1.15F, -0.9F, -2.3F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            ToeFront_r2 = new ZawaModelRenderer(this, 5, 33);
            ToeFront_r2.setPos(-0.0446F, -0.1772F, 0.4474F);
            FEET.addChild(ToeFront_r2);
            setRotateAngle(ToeFront_r2, 0.0002F, -0.0114F, 0.0016F);
            ToeFront_r2.addBox(-2.2F, -1.0F, -2.7F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            ToeLeft_r4 = new ZawaModelRenderer(this, 0, 42);
            ToeLeft_r4.setPos(0.6072F, -0.1759F, -0.6758F);
            FEET.addChild(ToeLeft_r4);
            setRotateAngle(ToeLeft_r4, 0.0002F, 0.3528F, 0.0016F);
            ToeLeft_r4.addBox(-3.25F, -0.9F, -2.3F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            this.saveBase();
        }

        @Override
        public void setupAnim(TakaheEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }
    public static class Child extends TakaheModel {

        protected ZawaModelRenderer HEAD;
        protected ZawaModelRenderer beak_r1;
        protected ZawaModelRenderer beak_r2;
        protected ZawaModelRenderer cube_r1;
        protected ZawaModelRenderer beak_r3;
        protected ZawaModelRenderer beak_r4;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer cube_r2;
        protected ZawaModelRenderer cube_r3;
        protected ZawaModelRenderer cube_r4;
        protected ZawaModelRenderer cube_r5;
        protected ZawaModelRenderer FEET;
        protected ZawaModelRenderer cube_r6;
        protected ZawaModelRenderer cube_r7;
        protected ZawaModelRenderer cube_r8;
        protected ZawaModelRenderer cube_r9;
        protected ZawaModelRenderer cube_r10;
        protected ZawaModelRenderer cube_r11;
        protected ZawaModelRenderer cube_r12;
        protected ZawaModelRenderer TAIL;
        protected ZawaModelRenderer cube_r13;
        protected ZawaModelRenderer cube_r14;
        protected ZawaModelRenderer cube_r15;
        protected ZawaModelRenderer cube_r16;

        public Child() {
            texWidth = 32;
            texHeight = 32;

            MAIN = new ZawaModelRenderer(this, 0, 0);
            MAIN.setPos(-1.3F, 11.45F, -8.125F);


            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(HEAD);


            beak_r1 = new ZawaModelRenderer(this, 9, 27);
            beak_r1.setPos(1.3F, 4.7149F, 2.841F);
            HEAD.addChild(beak_r1);
            setRotateAngle(beak_r1, 0.576F, 0.0F, 0.0F);
            beak_r1.addBox(-0.501F, -0.8244F, -0.1944F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            beak_r2 = new ZawaModelRenderer(this, 18, 29);
            beak_r2.setPos(1.3F, 4.7149F, 2.841F);
            HEAD.addChild(beak_r2);
            setRotateAngle(beak_r2, -0.0131F, 0.0F, 0.0F);
            beak_r2.addBox(-0.5F, 0.0882F, -0.8994F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r1 = new ZawaModelRenderer(this, 0, 26);
            cube_r1.setPos(-0.2F, 1.1F, 2.6F);
            HEAD.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.0742F, 0.0F, 0.0F);
            cube_r1.addBox(0.0F, 1.925F, 0.25F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            beak_r3 = new ZawaModelRenderer(this, 14, 28);
            beak_r3.setPos(1.3F, 4.7149F, 2.841F);
            HEAD.addChild(beak_r3);
            setRotateAngle(beak_r3, 0.3665F, 0.0F, 0.0F);
            beak_r3.addBox(-0.4999F, -0.3487F, -1.2398F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            beak_r4 = new ZawaModelRenderer(this, 12, 28);
            beak_r4.setPos(1.3F, 4.7149F, 2.841F);
            HEAD.addChild(beak_r4);
            setRotateAngle(beak_r4, 0.8334F, 0.0F, 0.0F);
            beak_r4.addBox(-0.489F, -0.8507F, -0.9517F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(BODY);


            cube_r2 = new ZawaModelRenderer(this, 0, 21);
            cube_r2.setPos(1.3F, 5.0568F, 4.9836F);
            BODY.addChild(cube_r2);
            setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
            cube_r2.addBox(-1.0F, -1.0F, -0.95F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 12, 21);
            cube_r3.setPos(1.3F, 7.5331F, 6.5754F);
            BODY.addChild(cube_r3);
            setRotateAngle(cube_r3, 0.9468F, 0.0F, 0.0F);
            cube_r3.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 0, 0);
            cube_r4.setPos(0.0F, 0.0F, -0.3F);
            BODY.addChild(cube_r4);
            setRotateAngle(cube_r4, 0.1396F, 0.0F, 0.0F);
            cube_r4.addBox(-0.7F, 5.975F, 5.2F, 4.0F, 5.0F, 5.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 0, 10);
            cube_r5.setPos(0.0F, 0.0F, 0.0F);
            BODY.addChild(cube_r5);
            setRotateAngle(cube_r5, 0.1396F, 0.0F, 0.0F);
            cube_r5.addBox(-1.2F, 6.725F, 5.35F, 5.0F, 3.0F, 4.0F, 0.0F, false);

            FEET = new ZawaModelRenderer(this, 0, 0);
            FEET.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(FEET);
            FEET.texOffs(0, 18).addBox(-0.45F, 11.475F, 7.375F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            FEET.texOffs(14, 1).addBox(2.05F, 11.475F, 7.375F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 0, 0);
            cube_r6.setPos(1.8F, 10.7981F, 8.7225F);
            FEET.addChild(cube_r6);
            setRotateAngle(cube_r6, -0.3142F, 0.0F, 0.0F);
            cube_r6.addBox(-2.25F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r7 = new ZawaModelRenderer(this, 14, 11);
            cube_r7.setPos(2.55F, 12.05F, 6.875F);
            FEET.addChild(cube_r7);
            setRotateAngle(cube_r7, 0.0F, -0.3927F, 0.0F);
            cube_r7.addBox(0.25F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 19, 0);
            cube_r8.setPos(0.05F, 12.05F, 6.875F);
            FEET.addChild(cube_r8);
            setRotateAngle(cube_r8, 0.0F, 0.3927F, 0.0F);
            cube_r8.addBox(-1.25F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 18, 5);
            cube_r9.setPos(0.05F, 12.05F, 6.875F);
            FEET.addChild(cube_r9);
            setRotateAngle(cube_r9, 0.0F, -0.3927F, 0.0F);
            cube_r9.addBox(0.25F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 0, 10);
            cube_r10.setPos(0.8F, 10.7981F, 8.7225F);
            FEET.addChild(cube_r10);
            setRotateAngle(cube_r10, -0.3142F, 0.0F, 0.0F);
            cube_r10.addBox(1.25F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 0, 0);
            cube_r11.setPos(1.35F, -1.075F, -0.75F);
            FEET.addChild(cube_r11);
            setRotateAngle(cube_r11, 0.1876F, 0.0F, 0.0F);
            cube_r11.texOffs(21, 0).addBox(0.2F, 9.975F, 6.675F, 2.0F, 3.0F, 2.0F, 0.0F, false);
            cube_r11.texOffs(6, 18).addBox(-2.3F, 9.975F, 6.675F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 22, 5);
            cube_r12.setPos(2.55F, 12.05F, 6.875F);
            FEET.addChild(cube_r12);
            setRotateAngle(cube_r12, 0.0F, 0.3927F, 0.0F);
            cube_r12.addBox(-1.25F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            TAIL = new ZawaModelRenderer(this, 0, 0);
            TAIL.setPos(0.0F, 0.0F, 0.0F);
            MAIN.addChild(TAIL);


            cube_r13 = new ZawaModelRenderer(this, 15, 14);
            cube_r13.setPos(0.8F, 7.0808F, 10.7726F);
            TAIL.addChild(cube_r13);
            setRotateAngle(cube_r13, -1.0451F, 0.0882F, -0.1508F);
            cube_r13.addBox(-0.85F, -1.9887F, -0.5968F, 1.0F, 2.0F, 3.0F, 0.0F, true);

            cube_r14 = new ZawaModelRenderer(this, 15, 14);
            cube_r14.setPos(1.8F, 7.0808F, 10.7726F);
            TAIL.addChild(cube_r14);
            setRotateAngle(cube_r14, -1.0451F, -0.0882F, 0.1508F);
            cube_r14.addBox(-0.15F, -1.9887F, -0.5968F, 1.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r15 = new ZawaModelRenderer(this, 15, 14);
            cube_r15.setPos(1.3F, 7.1558F, 11.0226F);
            TAIL.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.8858F, 0.0F, 0.0F);
            cube_r15.addBox(-1.0F, -2.1137F, -0.4218F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 16, 15);
            cube_r16.setPos(1.3F, 7.1558F, 11.0226F);
            TAIL.addChild(cube_r16);
            setRotateAngle(cube_r16, -0.4931F, 0.0F, 0.0F);
            cube_r16.addBox(-1.5F, -2.1163F, -1.5777F, 3.0F, 4.0F, 2.0F, 0.0F, false);

            this.saveBase();
        }

        @Override
        public void setupAnim(TakaheEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
