package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.OscarEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class OscarModel extends SegmentedModel<OscarEntity> {
    public ModelRenderer Body;
    public ModelRenderer PectoralFinRight;
    public ModelRenderer UnderFinLeft;
    public ModelRenderer Head;
    public ModelRenderer Tail;
    public ModelRenderer UnderFinRight;
    public ModelRenderer PectoralFinLeft;
    public ModelRenderer BackFin;
    public ModelRenderer AnalFin;
    public ModelRenderer Face;
    public ModelRenderer TailFinTop;
    public ModelRenderer TailFinBottom;
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
        this.Head = new ModelRenderer(this, 0, 12);
        this.Head.setPos(0.0F, -2.1F, -3.0F);
        this.Head.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.45378560551852565F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 12, 0);
        this.Tail.setPos(0.0F, -0.5F, 3.0F);
        this.Tail.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setPos(0.0F, 17.5F, -2.0F);
        this.Body.addBox(-1.5F, -3.5F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.PectoralFinRight = new ModelRenderer(this, 8, 21);
        this.PectoralFinRight.mirror = true;
        this.PectoralFinRight.setPos(-1.5F, 1.0F, -2.0F);
        this.PectoralFinRight.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinRight, 0.0F, -0.500909508638178F, 0.0F);
        this.TailFinBottom = new ModelRenderer(this, 18, 6);
        this.TailFinBottom.setPos(0.0F, 0.0F, 0.0F);
        this.TailFinBottom.addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, -0.9318312769871282F, 0.0F, 0.0F);
        this.UnderFinLeft = new ModelRenderer(this, 10, 14);
        this.UnderFinLeft.setPos(0.0F, 2.5F, -2.0F);
        this.UnderFinLeft.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UnderFinLeft, 0.500909508638178F, 0.27314402127920984F, 0.0F);
        this.PectoralFinLeft = new ModelRenderer(this, 8, 21);
        this.PectoralFinLeft.setPos(1.5F, 1.0F, -2.0F);
        this.PectoralFinLeft.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinLeft, 0.0F, 0.500909508638178F, 0.0F);
        this.UnderFinRight = new ModelRenderer(this, 10, 14);
        this.UnderFinRight.mirror = true;
        this.UnderFinRight.setPos(0.0F, 2.5F, -2.0F);
        this.UnderFinRight.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UnderFinRight, 0.500909508638178F, -0.27314402127920984F, 0.0F);
        this.AnalFin = new ModelRenderer(this, 16, 8);
        this.AnalFin.setPos(0.0F, 1.5F, 0.5F);
        this.AnalFin.addBox(0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.BackFin = new ModelRenderer(this, 0, 19);
        this.BackFin.setPos(0.0F, -1.0F, -2.5F);
        this.BackFin.addBox(0.0F, -4.0F, 0.0F, 0.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.TailFinTop = new ModelRenderer(this, 18, 3);
        this.TailFinTop.setPos(0.0F, 0.0F, 2.0F);
        this.TailFinTop.addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, 0.500909508638178F, 0.0F, 0.0F);
        this.Face = new ModelRenderer(this, 0, 20);
        this.Face.setPos(0.0F, 0.0F, -2.0F);
        this.Face.addBox(-0.5F, -0.7F, -2.3F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Face, 0.7853981633974483F, 0.0F, 0.0F);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.PectoralFinRight);
        this.TailFinTop.addChild(this.TailFinBottom);
        this.Body.addChild(this.UnderFinLeft);
        this.Body.addChild(this.PectoralFinLeft);
        this.Body.addChild(this.UnderFinRight);
        this.Body.addChild(this.AnalFin);
        this.Body.addChild(this.BackFin);
        this.Tail.addChild(this.TailFinTop);
        this.Head.addChild(this.Face);
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