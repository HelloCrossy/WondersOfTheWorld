package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.OscarEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class OscarModel extends SegmentedModel<OscarEntity> {
    public ModelRenderer Body;
    public ModelRenderer Tail;
    public ModelRenderer DorsalFin;
    public ModelRenderer LeftPelvicFin;
    public ModelRenderer RightPelvicFin;
    public ModelRenderer LeftPectoralFin;
    public ModelRenderer RightPectoralFin;
    public ModelRenderer Head;
    public ModelRenderer AnalFin;
    public ModelRenderer TailFinTop;
    public ModelRenderer TailFinBottom;
    public ModelRenderer Face;
    public ModelRenderer Forehead;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public OscarModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.LeftPelvicFin = new ModelRenderer(this, 4, 0);
        this.LeftPelvicFin.setPos(0.7F, 1.4F, -0.8F);
        this.LeftPelvicFin.addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPelvicFin, 0.7285004590772052F, 0.0F, 0.0F);
        this.Forehead = new ModelRenderer(this, 15, 9);
        this.Forehead.setPos(0.0F, 0.0F, -2.5F);
        this.Forehead.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Forehead, -1.0471975511965976F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 6, 12);
        this.Tail.setPos(0.0F, 0.0F, 2.7F);
        this.Tail.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.AnalFin = new ModelRenderer(this, 6, 16);
        this.AnalFin.setPos(0.0F, 3.1F, -0.4F);
        this.AnalFin.addBox(0.0F, 0.0F, -1.0F, 0.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(AnalFin, 1.4570009181544104F, 0.0F, 0.0F);
        this.DorsalFin = new ModelRenderer(this, 0, 9);
        this.DorsalFin.setPos(0.0F, -3.1F, -2.5F);
        this.DorsalFin.addBox(0.0F, 0.0F, -2.0F, 0.0F, 9.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(DorsalFin, 1.6845917354353828F, 0.0F, 0.0F);
        this.Face = new ModelRenderer(this, 13, 16);
        this.Face.setPos(0.0F, 0.1F, -2.9F);
        this.Face.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Face, 1.2292353975059285F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 12, 0);
        this.Head.setPos(0.0F, -1.3F, -2.7F);
        this.Head.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.2275909337942703F, 0.0F, 0.0F);
        this.RightPectoralFin = new ModelRenderer(this, 0, 0);
        this.RightPectoralFin.setPos(-1.5F, 0.3F, -2.4F);
        this.RightPectoralFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPectoralFin, -0.3642502295386026F, -0.4098033003787853F, 0.0F);
        this.TailFinTop = new ModelRenderer(this, 0, 0);
        this.TailFinTop.setPos(0.0F, -0.5F, 2.4F);
        this.TailFinTop.addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, 1.6845917354353828F, 0.0F, 0.0F);
        this.TailFinBottom = new ModelRenderer(this, 18, 4);
        this.TailFinBottom.setPos(0.0F, 0.5F, 2.5F);
        this.TailFinBottom.addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, 1.3658947098950176F, 0.0F, 0.0F);
        this.LeftPectoralFin = new ModelRenderer(this, 0, 0);
        this.LeftPectoralFin.setPos(1.5F, 0.3F, -2.4F);
        this.LeftPectoralFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPectoralFin, -0.3642502295386026F, 0.4098033003787853F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setPos(0.0F, 18.6F, 0.0F);
        this.Body.addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.RightPelvicFin = new ModelRenderer(this, 4, 0);
        this.RightPelvicFin.setPos(-0.7F, 1.4F, -0.8F);
        this.RightPelvicFin.addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPelvicFin, 0.7285004590772052F, 0.0F, 0.0F);
        this.Body.addChild(this.LeftPelvicFin);
        this.Head.addChild(this.Forehead);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.AnalFin);
        this.Body.addChild(this.DorsalFin);
        this.Head.addChild(this.Face);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.RightPectoralFin);
        this.Tail.addChild(this.TailFinTop);
        this.Tail.addChild(this.TailFinBottom);
        this.Body.addChild(this.LeftPectoralFin);
        this.Body.addChild(this.RightPelvicFin);
    }

    @Override
    public void setupAnim(OscarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}