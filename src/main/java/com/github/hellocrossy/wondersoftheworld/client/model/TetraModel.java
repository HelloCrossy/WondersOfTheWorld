package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TetraEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class TetraModel extends SegmentedModel<TetraEntity> {

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
    public ModelRenderer SoftDorsalFin;
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

    public TetraModel() {
        this.texWidth = 64;
        this.texHeight = 32;
        this.CaudalFin = new ModelRenderer(this, 58, 0);
        this.CaudalFin.setPos(0.0F, -0.4F, 3.8F);
        this.CaudalFin.addBox(0.0F, -1.5F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(CaudalFin, 1.9198621771937625F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 14, 6);
        this.Neck.setPos(0.0F, 2.8F, -0.6F);
        this.Neck.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.4098033003787853F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 21);
        this.Body.setPos(0.0F, 19.6F, 0.0F);
        this.Body.addBox(-1.5F, -2.0F, -3.0F, 3.0F, 4.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 0, 12);
        this.Tail.setPos(0.0F, -0.2F, 2.3F);
        this.Tail.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 5);
        this.Head.setPos(0.0F, -1.9F, -2.8F);
        this.Head.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.2275909337942703F, 0.0F, 0.0F);
        this.LeftPectoralFin = new ModelRenderer(this, 20, 0);
        this.LeftPectoralFin.setPos(1.5F, 0.8F, -2.7F);
        this.LeftPectoralFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPectoralFin, -0.3642502295386026F, 0.4098033003787853F, 0.0F);
        this.SoftDorsalFin = new ModelRenderer(this, 47, 0);
        this.SoftDorsalFin.setPos(0.0F, -1.5F, 2.0F);
        this.SoftDorsalFin.addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(SoftDorsalFin, 2.321985919674168F, 0.0F, 0.0F);
        this.Face = new ModelRenderer(this, 0, 0);
        this.Face.setPos(0.0F, 0.1F, -3.0F);
        this.Face.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Face, 0.8196066007575706F, 0.0F, 0.0F);
        this.AnalFin = new ModelRenderer(this, 34, 0);
        this.AnalFin.setPos(0.0F, 0.0F, 2.4F);
        this.AnalFin.addBox(0.0F, 0.0F, -2.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(AnalFin, 0.7740534966278743F, 0.0F, 0.0F);
        this.DorsalFin = new ModelRenderer(this, 43, 0);
        this.DorsalFin.setPos(0.0F, -2.0F, -0.3F);
        this.DorsalFin.addBox(0.0F, 0.0F, -3.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(DorsalFin, 2.321985919674168F, 0.0F, 0.0F);
        this.LeftPelvicFin = new ModelRenderer(this, 30, 0);
        this.LeftPelvicFin.setPos(0.7F, 2.0F, -0.8F);
        this.LeftPelvicFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPelvicFin, 0.9105382388075086F, 0.2275909337942703F, 0.0F);
        this.RightPectoralFin = new ModelRenderer(this, 15, 0);
        this.RightPectoralFin.setPos(-1.5F, 0.8F, -2.7F);
        this.RightPectoralFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPectoralFin, -0.3642502295386026F, -0.4098033003787853F, 0.0F);
        this.RightPelvicFin = new ModelRenderer(this, 30, 3);
        this.RightPelvicFin.setPos(-0.7F, 2.0F, -0.8F);
        this.RightPelvicFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPelvicFin, 0.9105382388075086F, -0.2275909337942703F, 0.0F);
        this.CaudalFinBottom = new ModelRenderer(this, 58, 6);
        this.CaudalFinBottom.setPos(0.0F, 0.4F, 3.8F);
        this.CaudalFinBottom.addBox(0.0F, -1.5F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(CaudalFinBottom, 1.2217304763960306F, 0.0F, 0.0F);
        this.Tail.addChild(this.CaudalFin);
        this.Head.addChild(this.Neck);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.LeftPectoralFin);
        this.Tail.addChild(this.SoftDorsalFin);
        this.Head.addChild(this.Face);
        this.Body.addChild(this.AnalFin);
        this.Body.addChild(this.DorsalFin);
        this.Body.addChild(this.LeftPelvicFin);
        this.Body.addChild(this.RightPectoralFin);
        this.Body.addChild(this.RightPelvicFin);
        this.Tail.addChild(this.CaudalFinBottom);

    }

    @Override
    public void setupAnim(TetraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}