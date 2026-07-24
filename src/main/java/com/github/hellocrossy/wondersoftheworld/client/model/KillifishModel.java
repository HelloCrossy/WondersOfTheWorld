package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.KillifishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class KillifishModel extends SegmentedModel<KillifishEntity> {

    public ModelRenderer Body;
    public ModelRenderer Tail;
    public ModelRenderer DorsalFin;
    public ModelRenderer AnalFin;
    public ModelRenderer LeftPelvicFin;
    public ModelRenderer LeftPectoralFin;
    public ModelRenderer RightPectoralFin;
    public ModelRenderer Head;
    public ModelRenderer RightPelvicFin;
    public ModelRenderer CaudalFinBottom;
    public ModelRenderer CaudalFin;
    public ModelRenderer Face;
    public ModelRenderer Neck;

    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public KillifishModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.Neck = new ModelRenderer(this, 6, 19);
        this.Neck.setPos(0.0F, 2.8F, -0.6F);
        this.Neck.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.4098033003787853F, 0.0F, 0.0F);
        this.RightPelvicFin = new ModelRenderer(this, 0, 0);
        this.RightPelvicFin.setPos(-0.7F, 2.0F, -2.7F);
        this.RightPelvicFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPelvicFin, 0.40229837926888745F, -0.2275909337942703F, 0.0F);
        this.CaudalFinBottom = new ModelRenderer(this, 0, 16);
        this.CaudalFinBottom.setPos(0.0F, 0.4F, 3.8F);
        this.CaudalFinBottom.addBox(0.0F, -1.5F, -2.1F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(CaudalFinBottom, 1.4172072993561737F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 13, 0);
        this.Head.setPos(0.0F, -1.9F, -3.3F);
        this.Head.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.2275909337942703F, 0.0F, 0.0F);
        this.Face = new ModelRenderer(this, 18, 18);
        this.Face.setPos(0.0F, 0.1F, -3.0F);
        this.Face.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Face, 0.8196066007575706F, 0.0F, 0.0F);
        this.LeftPectoralFin = new ModelRenderer(this, 20, 4);
        this.LeftPectoralFin.setPos(1.4F, 0.8F, -2.7F);
        this.LeftPectoralFin.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPectoralFin, -0.12967796042712246F, 0.4098033003787853F, 0.0F);
        this.Tail = new ModelRenderer(this, 12, 11);
        this.Tail.setPos(0.0F, -0.2F, 3.3F);
        this.Tail.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.AnalFin = new ModelRenderer(this, 0, 9);
        this.AnalFin.setPos(0.0F, 1.0F, 1.7F);
        this.AnalFin.addBox(0.0F, 0.0F, -2.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(AnalFin, 0.18762289458939044F, 0.0F, 0.0F);
        this.RightPectoralFin = new ModelRenderer(this, 20, 4);
        this.RightPectoralFin.setPos(-1.4F, 0.8F, -2.7F);
        this.RightPectoralFin.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPectoralFin, -0.12967796042712246F, -0.4098033003787853F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setPos(0.0F, 19.6F, 0.0F);
        this.Body.addBox(-1.5F, -2.0F, -3.5F, 3.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.CaudalFin = new ModelRenderer(this, 12, 15);
        this.CaudalFin.setPos(0.0F, -0.4F, 3.8F);
        this.CaudalFin.addBox(0.0F, -1.5F, -1.0F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(CaudalFin, 1.7243853542336192F, 0.0F, 0.0F);
        this.LeftPelvicFin = new ModelRenderer(this, 0, 0);
        this.LeftPelvicFin.setPos(0.7F, 2.0F, -2.7F);
        this.LeftPelvicFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPelvicFin, 0.40229837926888745F, 0.2275909337942703F, 0.0F);
        this.DorsalFin = new ModelRenderer(this, 0, 4);
        this.DorsalFin.setPos(0.0F, -1.4F, -1.1F);
        this.DorsalFin.addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(DorsalFin, -0.0781907508222411F, 0.0F, 0.0F);
        this.Head.addChild(this.Neck);
        this.Body.addChild(this.RightPelvicFin);
        this.Tail.addChild(this.CaudalFinBottom);
        this.Body.addChild(this.Head);
        this.Head.addChild(this.Face);
        this.Body.addChild(this.LeftPectoralFin);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.AnalFin);
        this.Body.addChild(this.RightPectoralFin);
        this.Tail.addChild(this.CaudalFin);
        this.Body.addChild(this.LeftPelvicFin);
        this.Body.addChild(this.DorsalFin);
    }

    @Override
    public void setupAnim(KillifishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
