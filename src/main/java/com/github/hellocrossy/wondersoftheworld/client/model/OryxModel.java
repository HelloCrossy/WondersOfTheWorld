package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.OryxEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class OryxModel extends ZawaBaseModel<OryxEntity> {
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

    public static class Adult extends OryxModel {

        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer ThighLeft;
        public ModelRenderer Tail1;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer Tail2;
        public ModelRenderer TailTuft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer ArmLeft;
        public ModelRenderer ForearmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer LowerNeck;
        public ModelRenderer Head;
        public ModelRenderer LowerNeck2;
        public ModelRenderer Mane1;
        public ModelRenderer Forehead;
        public ModelRenderer EarLeft;
        public ModelRenderer Horn1Left;
        public ModelRenderer Horn1Right;
        public ModelRenderer Snout;
        public ModelRenderer EarLeft_1;
        public ModelRenderer Horn1Left2;
        public ModelRenderer Horn1Right2;
        public ModelRenderer EarFurLeft;
        public ModelRenderer Horn2Left;
        public ModelRenderer Horn2Right;
        public ModelRenderer TopSnout;
        public ModelRenderer Jaw;
        public ModelRenderer EarFurRight;
        public ModelRenderer Horn2Left2;
        public ModelRenderer Horn2Right2;
        public ModelRenderer Mane2;
        public ModelRenderer ArmRight;
        public ModelRenderer ForearmRight;
        public ModelRenderer HandRight;


        public Adult() {
            texWidth = 128;
            texHeight = 128;
            this.LowerLegLeft = new ModelRenderer(this, 74, 20);
            this.LowerLegLeft.setPos(0.0F, 6.0F, 3.5F);
            this.LowerLegLeft.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.17453292519943295F, 0.0F, 0.0F);
            this.Horn2Left = new ModelRenderer(this, 81, 65);
            this.Horn2Left.setPos(0.0F, -15.0F, 0.0F);
            this.Horn2Left.addBox(-0.5F, -15.5F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left, -0.11728612207217244F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 59, 19);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 7.0F, 0.5F);
            this.HandRight.addBox(-2.0F, 0.0F, -1.5F, 4.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 24);
            this.Hips.setPos(0.0F, -15.0F, 17.0F);
            this.Hips.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 13.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3790855015489435F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 45, 49);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-3.8F, 2.9F, -1.6F);
            this.ArmBaseRight.addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.3141592653589793F, 0.0F, 0.0F);
            this.ForearmLeft = new ModelRenderer(this, 83, 44);
            this.ForearmLeft.setPos(0.0F, 4.6F, -3.5F);
            this.ForearmLeft.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 66, 49);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 8.0F, 2.0F);
            this.ArmRight.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 0.0F, -8.0F);
            this.Chest.addBox(-5.5F, -8.0F, -4.5F, 11.0F, 16.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.22689280275926282F, 0.0F, 0.0F);
            this.Horn2Right = new ModelRenderer(this, 81, 65);
            this.Horn2Right.mirror = true;
            this.Horn2Right.setPos(0.0F, -15.0F, 0.0F);
            this.Horn2Right.addBox(-0.5F, -15.5F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right, -0.11728612207217244F, 0.0F, 0.0F);
            this.Horn2Right2 = new ModelRenderer(this, 74, 65);
            this.Horn2Right2.mirror = true;
            this.Horn2Right2.setPos(0.0F, -15.0F, 0.0F);
            this.Horn2Right2.addBox(-0.5F, -15.5F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Right2, -0.3933972293784885F, 0.0F, 0.0F);
            this.Mane2 = new ModelRenderer(this, 70, 0);
            this.Mane2.setPos(0.0F, 12.0F, 2.0F);
            this.Mane2.addBox(-1.49F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mane2, -0.7888888352172424F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 88);
            this.Head.setPos(0.0F, -11.1F, -2.4F);
            this.Head.addBox(-3.5F, -5.0F, -3.0F, 7.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -1.2859585981957442F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 47);
            this.Body.setPos(0.0F, 8.0F, 3.5F);
            this.Body.addBox(-6.0F, -15.0F, 0.0F, 12.0F, 15.0F, 17.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.2617993877991494F, 0.0F, 0.0F);
            this.EarFurRight = new ModelRenderer(this, 0, 0);
            this.EarFurRight.mirror = true;
            this.EarFurRight.setPos(-0.5F, -5.0F, 0.5F);
            this.EarFurRight.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarFurRight, 0.0F, 0.0F, -0.5082398928281348F);
            this.FootLeft = new ModelRenderer(this, 59, 19);
            this.FootLeft.setPos(0.0F, 6.9F, -2.5F);
            this.FootLeft.addBox(-2.0F, 0.0F, -1.5F, 4.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.LowerNeck = new ModelRenderer(this, 60, 80);
            this.LowerNeck.setPos(0.0F, -11.0F, -4.1F);
            this.LowerNeck.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 14.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerNeck, -0.3748967153388987F, 0.0F, 0.0F);
            this.Horn1Right = new ModelRenderer(this, 87, 70);
            this.Horn1Right.mirror = true;
            this.Horn1Right.setPos(-1.3F, -4.6F, -0.9F);
            this.Horn1Right.addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right, -0.8035496035971559F, -0.13962634015954636F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 113);
            this.Snout.setPos(0.0F, -1.8F, -2.8F);
            this.Snout.addBox(-2.5F, 0.0F, -6.5F, 5.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.4321435267885376F, 0.0F, 0.0F);
            this.Horn2Left2 = new ModelRenderer(this, 74, 65);
            this.Horn2Left2.setPos(0.0F, -15.0F, 0.0F);
            this.Horn2Left2.addBox(-0.5F, -15.5F, -0.5F, 1.0F, 17.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn2Left2, -0.3933972293784885F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 40, 3);
            this.Tail2.setPos(0.0F, 4.8F, -1.0F);
            this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.13665927909957545F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 72, 33);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 14.0F, -2.5F);
            this.UpperLegRight.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.3490658503988659F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 15, 103);
            this.Forehead.setPos(0.0F, -5.0F, -2.5F);
            this.Forehead.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.4363323129985824F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 33, 82);
            this.Neck.setPos(0.0F, -4.0F, -5.0F);
            this.Neck.addBox(-3.0F, -11.0F, -4.0F, 6.0F, 13.0F, 7.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 1.697158127355031F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 51, 112);
            this.Jaw.setPos(0.0F, 2.4F, -1.0F);
            this.Jaw.addBox(-1.5F, 0.0F, -5.0F, 3.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.19495327877934715F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 59, 19);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 6.9F, -2.5F);
            this.FootRight.addBox(-2.0F, 0.0F, -1.5F, 4.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Horn1Left = new ModelRenderer(this, 87, 70);
            this.Horn1Left.setPos(1.3F, -4.6F, -0.9F);
            this.Horn1Left.addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left, -0.8035496035971559F, 0.13962634015954636F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 50, 1);
            this.Tail1.setPos(0.0F, 0.3F, 7.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, 0.5235987755982988F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 20, 115);
            this.TopSnout.setPos(0.0F, 0.2F, -6.4F);
            this.TopSnout.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.3513347637790725F, 0.0F, 0.0F);
            this.Horn1Right2 = new ModelRenderer(this, 87, 87);
            this.Horn1Right2.mirror = true;
            this.Horn1Right2.setPos(-1.3F, -4.6F, -0.9F);
            this.Horn1Right2.addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Right2, -1.0400417039265821F, -0.13962634015954636F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 74, 20);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 6.0F, 3.5F);
            this.LowerLegRight.addBox(-1.5F, 0.0F, -3.0F, 3.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.17453292519943295F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 59, 19);
            this.HandLeft.setPos(0.0F, 7.0F, 0.5F);
            this.HandLeft.addBox(-2.0F, 0.0F, -1.5F, 4.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Horn1Left2 = new ModelRenderer(this, 87, 87);
            this.Horn1Left2.setPos(1.3F, -4.6F, -0.9F);
            this.Horn1Left2.addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Horn1Left2, -1.0400417039265821F, 0.13962634015954636F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 44, 27);
            this.ThighLeft.setPos(3.5F, 2.0F, 4.0F);
            this.ThighLeft.addBox(-3.0F, 0.0F, -4.5F, 6.0F, 14.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.17453292519943295F, 0.0F, 0.0F);
            this.LowerNeck2 = new ModelRenderer(this, 73, 105);
            this.LowerNeck2.setPos(0.0F, -11.0F, -5.0F);
            this.LowerNeck2.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 14.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerNeck2, -0.45378560551852565F, 0.0F, 0.0F);
            this.EarFurLeft = new ModelRenderer(this, 0, 0);
            this.EarFurLeft.setPos(0.5F, -5.0F, 0.5F);
            this.EarFurLeft.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarFurLeft, 0.0F, 0.0F, 0.5082398928281348F);
            this.TailTuft = new ModelRenderer(this, 36, 21);
            this.TailTuft.setPos(0.0F, 4.0F, 0.0F);
            this.TailTuft.addBox(-2.0F, 0.0F, -1.5F, 4.0F, 9.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Mane1 = new ModelRenderer(this, 84, 0);
            this.Mane1.setPos(0.0F, -7.5F, 2.3F);
            this.Mane1.addBox(-1.5F, -2.0F, -1.0F, 3.0F, 14.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mane1, 0.11833332694706204F, 0.0F, 0.0F);
            this.EarLeft_1 = new ModelRenderer(this, 2, 106);
            this.EarLeft_1.mirror = true;
            this.EarLeft_1.setPos(-3.3F, -4.6F, 1.1F);
            this.EarLeft_1.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft_1, 0.08412487294218292F, 0.20141099501435536F, -1.2372638960861357F);
            this.UpperLegLeft = new ModelRenderer(this, 72, 33);
            this.UpperLegLeft.setPos(0.0F, 14.0F, -2.5F);
            this.UpperLegLeft.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.3490658503988659F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 66, 49);
            this.ArmLeft.setPos(0.0F, 8.0F, 2.0F);
            this.ArmLeft.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.04555309164612875F, 0.0F, 0.0F);
            this.ForearmRight = new ModelRenderer(this, 83, 44);
            this.ForearmRight.mirror = true;
            this.ForearmRight.setPos(0.0F, 4.6F, -3.5F);
            this.ForearmRight.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ForearmRight, -0.04555309164612875F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 2, 106);
            this.EarLeft.setPos(3.3F, -4.6F, 1.1F);
            this.EarLeft.addBox(-1.5F, -4.0F, 0.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.08412487294218292F, -0.20141099501435536F, 1.2372638960861357F);
            this.ThighRight = new ModelRenderer(this, 44, 27);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-3.5F, 2.1F, 4.0F);
            this.ThighRight.addBox(-3.0F, 0.0F, -4.5F, 6.0F, 14.0F, 8.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.17453292519943295F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 45, 49);
            this.ArmBaseLeft.setPos(3.9F, 2.9F, -1.6F);
            this.ArmBaseLeft.addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.3141592653589793F, 0.0F, 0.0F);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.Horn1Left.addChild(this.Horn2Left);
            this.ForearmRight.addChild(this.HandRight);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmLeft.addChild(this.ForearmLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Horn1Right.addChild(this.Horn2Right);
            this.Horn1Right2.addChild(this.Horn2Right2);
            this.Mane1.addChild(this.Mane2);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.Body);
            this.EarLeft_1.addChild(this.EarFurRight);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Neck.addChild(this.LowerNeck);
            this.Head.addChild(this.Horn1Right);
            this.Head.addChild(this.Snout);
            this.Horn1Left2.addChild(this.Horn2Left2);
            this.Tail1.addChild(this.Tail2);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Head.addChild(this.Forehead);
            this.Chest.addChild(this.Neck);
            this.Snout.addChild(this.Jaw);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.Horn1Left);
            this.Hips.addChild(this.Tail1);
            this.Snout.addChild(this.TopSnout);
            this.Head.addChild(this.Horn1Right2);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.ForearmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.Horn1Left2);
            this.Hips.addChild(this.ThighLeft);
            this.Neck.addChild(this.LowerNeck2);
            this.EarLeft.addChild(this.EarFurLeft);
            this.Tail2.addChild(this.TailTuft);
            this.Neck.addChild(this.Mane1);
            this.Head.addChild(this.EarLeft_1);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.ArmRight.addChild(this.ForearmRight);
            this.Head.addChild(this.EarLeft);
            this.Hips.addChild(this.ThighRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.saveBase();

        }

        @Override
        public void setupAnim(OryxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) -1.285F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.697F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 1.285F;

            this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.523F;
            this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F - 0.136F;
            this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 0.8f;
                float degree = 0.5f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 1.697F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 1.285F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.523F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree) * 0.5F - 0.136F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.22F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.261F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.379F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.314F;
                this.ArmLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.045F;
                this.ForearmLeft.xRot = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.045F;
                this.HandLeft.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4.5F) * 0.5F + 0.314F;
                this.ArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.045F;
                this.ForearmRight.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F - 0.045F;
                this.HandRight.xRot = MathHelper.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.174F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 1.285F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.523F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3.3F) * 0.5F + 0.174F;
                this.UpperLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.349F;
                this.LowerLegRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.174F;
                this.FootRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F;

            } else {
                float speed = 1.7f;
                float degree = 0.6f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.697F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 1.285F;
                this.Tail1.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 0.523F;
                this.Tail2.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * 0.5F - 0.136F;
                this.Tail1.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
                this.Tail2.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.6F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 0.0F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.22F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.261F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.379F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.314F;
                this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.045F;
                this.ForearmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F- 0.045F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.314F;
                this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.045F;
                this.ForearmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.045F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.174F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.349F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.174F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.174F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.349F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.174F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }

    public static class Child extends OryxModel {
        public ModelRenderer Body;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer Neck;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Hips;
        public ModelRenderer Tail;
        public ModelRenderer ThighLeft;
        public ModelRenderer ThighRight;
        public ModelRenderer UpperLegLeft;
        public ModelRenderer LowerLegLeft;
        public ModelRenderer FootLeft;
        public ModelRenderer UpperLegRight;
        public ModelRenderer LowerLegRight;
        public ModelRenderer FootRight;
        public ModelRenderer UpperArmLeft;
        public ModelRenderer ArmLeft;
        public ModelRenderer HandLeft;
        public ModelRenderer Head;
        public ModelRenderer EarLeft;
        public ModelRenderer Snout;
        public ModelRenderer Forehead;
        public ModelRenderer EarRight;
        public ModelRenderer HornLeft;
        public ModelRenderer HornRight;
        public ModelRenderer TopSnout;
        public ModelRenderer Mouth;
        public ModelRenderer UpperArmRight;
        public ModelRenderer ArmRight;
        public ModelRenderer HandRight;

        public Child() {
            texWidth = 64;
            texHeight = 32;
            this.ThighLeft = new ModelRenderer(this, 0, 16);
            this.ThighLeft.mirror = true;
            this.ThighLeft.setPos(1.6F, 0.7F, 1.5F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.26040312572913454F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 28, 17);
            this.ArmLeft.mirror = true;
            this.ArmLeft.setPos(-0.05F, 3.0F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 20, 19);
            this.FootLeft.mirror = true;
            this.FootLeft.setPos(-0.1F, 4.5F, -0.7F);
            this.FootLeft.addBox(-1.0F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13962634015954636F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 13);
            this.Mouth.setPos(0.0F, 1.0F, 0.1F);
            this.Mouth.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.2410299770241099F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 26, 28);
            this.EarLeft.setPos(2.0F, -1.0F, 1.0F);
            this.EarLeft.addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.46914448828868976F, -0.4488986716287166F, 1.2041026136666326F);
            this.Chest = new ModelRenderer(this, 46, 0);
            this.Chest.setPos(0.0F, 12.8F, -2.5F);
            this.Chest.addBox(-2.5F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, -0.1563815016444822F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 6, 10);
            this.Forehead.setPos(0.0F, -2.1F, -1.5F);
            this.Forehead.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Forehead, 0.19547687289441354F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 24, 1);
            this.TopSnout.setPos(0.0F, -0.5F, 0.0F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.2534218153790599F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 0);
            this.Hips.setPos(0.0F, 0.5F, 5.5F);
            this.Hips.addBox(-2.5F, -0.5F, 0.0F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.3127630032889644F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 20, 19);
            this.HandLeft.mirror = true;
            this.HandLeft.setPos(-0.1F, 3.5F, 0.3F);
            this.HandLeft.addBox(-1.0F, 0.0F, -0.7F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.HornLeft = new ModelRenderer(this, 0, 0);
            this.HornLeft.setPos(1.1F, -1.5F, 0.0F);
            this.HornLeft.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornLeft, -0.6255260065779288F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 24, 5);
            this.Snout.setPos(0.0F, 0.2F, -1.8F);
            this.Snout.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.4132939721985794F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 28, 17);
            this.ArmRight.setPos(0.05F, 3.0F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 36, 17);
            this.UpperArmRight.setPos(-0.1F, 2.8F, 1.1F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.08726646259971647F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 35, 12);
            this.ArmBaseLeft.mirror = true;
            this.ArmBaseLeft.setPos(1.6F, 0.5F, -0.5F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.23177972000431504F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 17, 0);
            this.Tail.setPos(0.0F, 0.0F, 3.5F);
            this.Tail.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.5726425515477893F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 0, 16);
            this.ThighRight.setPos(-1.6F, 0.7F, 1.5F);
            this.ThighRight.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.26040312572913454F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 10, 25);
            this.LowerLegRight.setPos(0.05F, 3.0F, 1.7F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.767944870877505F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 19, 9);
            this.Head.setPos(0.0F, -2.5F, -2.0F);
            this.Head.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.4354596616883907F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 10, 25);
            this.LowerLegLeft.mirror = true;
            this.LowerLegLeft.setPos(-0.05F, 3.0F, 1.7F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.767944870877505F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 36, 17);
            this.UpperArmLeft.mirror = true;
            this.UpperArmLeft.setPos(0.1F, 2.8F, 1.1F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.08726646259971647F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 20, 19);
            this.FootRight.setPos(0.1F, 4.5F, -0.7F);
            this.FootRight.addBox(-1.0F, 0.0F, -1.7F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13962634015954636F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 26, 28);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.0F, -1.0F, 1.0F);
            this.EarRight.addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.46914448828868976F, 0.4488986716287166F, -1.2041026136666326F);
            this.Body = new ModelRenderer(this, 40, 20);
            this.Body.setPos(0.0F, -3.0F, 1.0F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.1563815016444822F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 0, 25);
            this.UpperLegLeft.mirror = true;
            this.UpperLegLeft.setPos(-0.05F, 5.0F, -1.2F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.6632251157578453F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 0, 25);
            this.UpperLegRight.setPos(0.05F, 5.0F, -1.2F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.6632251157578453F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 35, 12);
            this.ArmBaseRight.setPos(-1.6F, 0.5F, -0.5F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.23177972000431504F, 0.0F, 0.0F);
            this.HornRight = new ModelRenderer(this, 0, 0);
            this.HornRight.setPos(-1.1F, -1.5F, 0.0F);
            this.HornRight.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HornRight, -0.6255260065779288F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 20, 19);
            this.HandRight.setPos(0.1F, 3.5F, 0.3F);
            this.HandRight.addBox(-1.0F, 0.0F, -0.7F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 33, 0);
            this.Neck.setPos(0.0F, -2.5F, -2.0F);
            this.Neck.addBox(-1.5F, -3.5F, -2.5F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, 0.7150614158473655F, 0.0F, 0.0F);
            this.Hips.addChild(this.ThighLeft);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Snout.addChild(this.Mouth);
            this.Head.addChild(this.EarLeft);
            this.Head.addChild(this.Forehead);
            this.Snout.addChild(this.TopSnout);
            this.Body.addChild(this.Hips);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.HornLeft);
            this.Head.addChild(this.Snout);
            this.UpperArmRight.addChild(this.ArmRight);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Hips.addChild(this.Tail);
            this.Hips.addChild(this.ThighRight);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Neck.addChild(this.Head);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.Body);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.Head.addChild(this.HornRight);
            this.ArmRight.addChild(this.HandRight);
            this.Chest.addChild(this.Neck);
            this.saveBase();

        }

        @Override
        public void setupAnim(OryxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.435F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.715F;
            this.Head.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.15F) * 0.5F - 0.435F;

            this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.251F;
            this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
                float speed = 1.0f;
                float degree = 1.0f;
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.715F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.435F;
                this.Tail.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 1.251F;
                this.Tail.zRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F;

                this.Chest.y = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.7F) * 0.5F + 12.8F;
                this.Chest.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.02F) * 0.5F - 0.156F;
                this.Body.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.156F;
                this.Hips.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.312F;

                this.ArmBaseLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.231F;
                this.UpperArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.3F) * 0.5F - 0.087F;
                this.ArmLeft.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;
                this.HandLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.ArmBaseRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.231F;
                this.UpperArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.3F) * 0.5F - 0.087F;
                this.ArmRight.xRot = MathHelper.cos(5.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * 0.5F;
                this.HandRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.5F;

                this.ThighLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.26F;
                this.UpperLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F + 0.663F;
                this.LowerLegLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.767F;
                this.FootLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.26F;
                this.UpperLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.663F;
                this.LowerLegRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.767F;
                this.FootRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.5F) * 0.5F;
            }
        }
    }
}

