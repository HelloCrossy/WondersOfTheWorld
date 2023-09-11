package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.ServalEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class ServalModel extends ZawaBaseModel<ServalEntity> {
    protected ModelRenderer Chest;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(Chest);
        }

        return this.parts;
    }

    public static class Adult extends ServalModel {
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer SnoutLeft;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer SnoutRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Adult() {
            texWidth = 64;
            texHeight = 64;
            this.Hips = new ModelRenderer(this, 0, 13);
            this.Hips.setPos(0.0F, 0.5F, 7.0F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1563815016444822F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 28, 14);
            this.LowerLegLeft.setPos(-0.1F, 3.0F, 2.4F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6646214111173737F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 10, 13);
            this.FootLeft.setPos(-0.1F, 3.6F, -0.9F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 0, 4);
            this.TopSnout.setPos(0.0F, 0.0F, -2.2F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.47752209399829293F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 4);
            this.Mouth.setPos(0.0F, 0.4F, -0.4F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.1563815016444822F, 0.0F, 0.0F);
            this.SnoutRight = new ModelRenderer(this, 15, 3);
            this.SnoutRight.mirror = true;
            this.SnoutRight.setPos(0.0F, 0.0F, 0.0F);
            this.SnoutRight.addBox(-0.7F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 8, 29);
            this.ForearmLeft.setPos(-0.1F, 5.0F, 1.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.16964600795438073F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 22, 0);
            this.Chest.setPos(0.0F, 13.5F, -5.0F);
            this.Chest.addBox(-1.5F, -2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2792526803190927F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 15, 0);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 4.8F, -1.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.03490658503988659F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 10, 13);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.6F, -0.9F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 19, 27);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 5.0F, -1.7F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6646214111173737F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 14, 13);
            this.Neck.setPos(0.0F, -1.1F, -1.0F);
            this.Neck.addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.45099308137849586F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.setPos(-1.2F, -0.8F, 0.2F);
            this.EarRight.addBox(-1.0F, -2.9F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.20943951023931953F, 0.5864306020384839F, -0.2429498332091912F);
            this.LowerLegRight = new ModelRenderer(this, 28, 14);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.1F, 3.0F, 2.4F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6646214111173737F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 22);
            this.ArmLeft.setPos(1.4F, 0.0F, -0.1F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.4174827584086242F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 0, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.4F, 0.0F, -0.1F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.4174827584086242F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 29, 20);
            this.Tail2.setPos(0.0F, 1.0F, 2.0F);
            this.Tail2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.11728612207217244F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 22, 20);
            this.NeckLower.setPos(0.0F, -0.2F, -3.3F);
            this.NeckLower.addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.19547687289441354F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 15, 0);
            this.HandLeft.setPos(0.1F, 4.8F, -1.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.03490658503988659F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -2.8F, 0.0F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2738421523142173F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 10, 20);
            this.ThighLeft.setPos(1.4F, 1.9F, 2.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.15707963267948966F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 29, 20);
            this.Tail3.setPos(0.0F, 0.0F, 2.0F);
            this.Tail3.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.23457224414434488F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 19, 27);
            this.UpperLegLeft.setPos(-0.1F, 5.0F, -1.7F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6646214111173737F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 23, 8);
            this.Head.setPos(0.0F, 0.4F, -3.4F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.9299114041572901F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 0);
            this.EarLeft.setPos(1.2F, -0.8F, 0.2F);
            this.EarLeft.addBox(-1.0F, -2.9F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.20943951023931953F, -0.5864306020384839F, 0.2429498332091912F);
            this.ForearmRight = new ModelRenderer(this, 8, 29);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.1F, 5.0F, 1.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.16964600795438073F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 10, 20);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, 1.9F, 2.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.15707963267948966F, 0.0F, 0.0F);
            this.SnoutLeft = new ModelRenderer(this, 15, 3);
            this.SnoutLeft.setPos(0.0F, 0.0F, -0.6F);
            this.SnoutLeft.addBox(-0.3F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 29, 20);
            this.Tail1.setPos(0.0F, 0.5F, 4.0F);
            this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.7819074915776542F, 0.0F, 0.0F);
            this.Body.addChild(this.Hips);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.SnoutLeft.addChild(this.TopSnout);
            this.SnoutLeft.addChild(this.Mouth);
            this.SnoutLeft.addChild(this.SnoutRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.EarRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.ArmLeft);
            this.Chest.addChild(this.ArmRight);
            this.Tail1.addChild(this.Tail2);
            this.Neck.addChild(this.NeckLower);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.Body);
            this.Hips.addChild(this.ThighLeft);
            this.Tail2.addChild(this.Tail3);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.EarLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.SnoutLeft);
            this.Hips.addChild(this.Tail1);
            this.saveBase();
        }

        @Override
        public void setupAnim(ServalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

    public static class Child extends ServalModel {
        public ModelRenderer Body;
        public ModelRenderer Neck;
        public ModelRenderer ArmLeft;
        public ModelRenderer ArmRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Head;
        public ModelRenderer NeckLower;
        public ModelRenderer SnoutLeft;
        public ModelRenderer EarLeft;
        public ModelRenderer EarRight;
        public ModelRenderer SnoutRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;

        public Child() {
            texWidth = 64;
            texHeight = 64;
            this.Hips = new ModelRenderer(this, 0, 13);
            this.Hips.setPos(0.0F, 0.5F, 7.0F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1563815016444822F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 28, 14);
            this.LowerLegLeft.setPos(-0.1F, 3.0F, 2.4F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.6646214111173737F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 10, 13);
            this.FootLeft.setPos(-0.1F, 3.6F, -0.9F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 0, 4);
            this.TopSnout.setPos(0.0F, 0.0F, -2.2F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.47752209399829293F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 4);
            this.Mouth.setPos(0.0F, 0.4F, -0.4F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, 0.1563815016444822F, 0.0F, 0.0F);
            this.SnoutRight = new ModelRenderer(this, 15, 3);
            this.SnoutRight.mirror = true;
            this.SnoutRight.setPos(0.0F, 0.0F, 0.0F);
            this.SnoutRight.addBox(-0.7F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 8, 29);
            this.ForearmLeft.setPos(-0.1F, 5.0F, 1.0F);
            this.ForearmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.16964600795438073F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 22, 0);
            this.Chest.setPos(0.0F, 13.5F, -5.0F);
            this.Chest.addBox(-1.5F, -2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.2792526803190927F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 15, 0);
            this.HandRight.mirror = true;
            this.HandRight.setPos(-0.1F, 4.8F, -1.0F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.03490658503988659F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 10, 13);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 3.6F, -0.9F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 19, 27);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.1F, 5.0F, -1.7F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6646214111173737F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 14, 13);
            this.Neck.setPos(0.0F, -1.1F, -1.0F);
            this.Neck.addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.45099308137849586F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 0);
            this.EarRight.setPos(-1.2F, -0.8F, 0.2F);
            this.EarRight.addBox(-1.0F, -2.9F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.20943951023931953F, 0.5864306020384839F, -0.2429498332091912F);
            this.LowerLegRight = new ModelRenderer(this, 28, 14);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.1F, 3.0F, 2.4F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.6646214111173737F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 0, 22);
            this.ArmLeft.setPos(1.4F, 0.0F, -0.1F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, 0.4174827584086242F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 0, 22);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-1.4F, 0.0F, -0.1F);
            this.ArmRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, 0.4174827584086242F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 29, 20);
            this.Tail2.setPos(0.0F, 1.0F, 2.0F);
            this.Tail2.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.11728612207217244F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 22, 20);
            this.NeckLower.setPos(0.0F, -0.2F, -3.3F);
            this.NeckLower.addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(NeckLower, -0.19547687289441354F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 15, 0);
            this.HandLeft.setPos(0.1F, 4.8F, -1.0F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.03490658503988659F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -2.8F, 0.0F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 6.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2738421523142173F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 10, 20);
            this.ThighLeft.setPos(1.4F, 1.9F, 2.0F);
            this.ThighLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.15707963267948966F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 29, 20);
            this.Tail3.setPos(0.0F, 0.0F, 2.0F);
            this.Tail3.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.23457224414434488F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 19, 27);
            this.UpperLegLeft.setPos(-0.1F, 5.0F, -1.7F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6646214111173737F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 23, 8);
            this.Head.setPos(0.0F, 0.4F, -3.4F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.9299114041572901F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 0);
            this.EarLeft.setPos(1.2F, -0.8F, 0.2F);
            this.EarLeft.addBox(-1.0F, -2.9F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.20943951023931953F, -0.5864306020384839F, 0.2429498332091912F);
            this.ForearmRight = new ModelRenderer(this, 8, 29);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.1F, 5.0F, 1.0F);
            this.ForearmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.16964600795438073F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 10, 20);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.4F, 1.9F, 2.0F);
            this.ThighRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.15707963267948966F, 0.0F, 0.0F);
            this.SnoutLeft = new ModelRenderer(this, 15, 3);
            this.SnoutLeft.setPos(0.0F, 0.0F, -0.6F);
            this.SnoutLeft.addBox(-0.3F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 29, 20);
            this.Tail1.setPos(0.0F, 0.5F, 4.0F);
            this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.7819074915776542F, 0.0F, 0.0F);
            this.Body.addChild(this.Hips);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.SnoutLeft.addChild(this.TopSnout);
            this.SnoutLeft.addChild(this.Mouth);
            this.SnoutLeft.addChild(this.SnoutRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ForearmRight.addChild(this.HandRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.Neck);
            this.Head.addChild(this.EarRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Chest.addChild(this.ArmLeft);
            this.Chest.addChild(this.ArmRight);
            this.Tail1.addChild(this.Tail2);
            this.Neck.addChild(this.NeckLower);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Chest.addChild(this.Body);
            this.Hips.addChild(this.ThighLeft);
            this.Tail2.addChild(this.Tail3);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.EarLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Hips.addChild(this.ThighRight);
            this.Head.addChild(this.SnoutLeft);
            this.Hips.addChild(this.Tail1);
            this.saveBase();
        }

        @Override
        public void setupAnim(ServalEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
