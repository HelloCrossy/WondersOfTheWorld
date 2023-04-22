package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.OscarEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public class OscarModel extends SegmentedModel<OscarEntity> {
    protected ModelRenderer Body;
    protected ModelRenderer PectoralFinRight;
    protected ModelRenderer UnderFinLeft;
    protected ModelRenderer Head;
    protected ModelRenderer Face;
    protected ModelRenderer Tail;
    protected ModelRenderer TailFinTop;
    protected ModelRenderer TailFinBottom;
    protected ModelRenderer UnderFinRight;
    protected ModelRenderer PectoralFinLeft;
    protected ModelRenderer BackFin;
    protected ModelRenderer AnalFin;
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

        Body = new ModelRenderer(this, 0, 0);
        Body.setPos(0.0F, 17.5F, -2.0F);
        Body.addBox(-1.5F, -3.5F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, false);

        PectoralFinRight = new ModelRenderer(this, 8, 21);
        PectoralFinRight.setPos(1.5F, 1.0F, -2.0F);
        Body.addChild(PectoralFinRight);
        setRotateAngle(PectoralFinRight, 0.0F, 0.5009F, 0.0F);
        PectoralFinRight.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, true);

        UnderFinLeft = new ModelRenderer(this, 10, 14);
        UnderFinLeft.setPos(0.0F, 2.5F, -2.0F);
        Body.addChild(UnderFinLeft);
        setRotateAngle(UnderFinLeft, 0.5009F, -0.2731F, 0.0F);
        UnderFinLeft.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        Head = new ModelRenderer(this, 0, 12);
        Head.setPos(0.0F, -2.1F, -3.0F);
        Body.addChild(Head);
        setRotateAngle(Head, 0.4538F, 0.0F, 0.0F);
        Head.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, false);

        Face = new ModelRenderer(this, 0, 20);
        Face.setPos(0.0F, 0.0F, -2.0F);
        Head.addChild(Face);
        setRotateAngle(Face, 0.7854F, 0.0F, 0.0F);
        Face.addBox(-0.5F, -0.7F, -2.3F, 1.0F, 3.0F, 3.0F, 0.0F, false);

        Tail = new ModelRenderer(this, 12, 0);
        Tail.setPos(0.0F, -0.5F, 3.0F);
        Body.addChild(Tail);
        Tail.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

        TailFinTop = new ModelRenderer(this, 18, 3);
        TailFinTop.setPos(0.0F, 0.0F, 2.0F);
        Tail.addChild(TailFinTop);
        setRotateAngle(TailFinTop, 0.5009F, 0.0F, 0.0F);
        TailFinTop.addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

        TailFinBottom = new ModelRenderer(this, 18, 6);
        TailFinBottom.setPos(0.0F, 0.0F, 0.0F);
        TailFinTop.addChild(TailFinBottom);
        setRotateAngle(TailFinBottom, -0.9318F, 0.0F, 0.0F);
        TailFinBottom.addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

        UnderFinRight = new ModelRenderer(this, 10, 14);
        UnderFinRight.setPos(0.0F, 2.5F, -2.0F);
        Body.addChild(UnderFinRight);
        setRotateAngle(UnderFinRight, 0.5009F, 0.2731F, 0.0F);
        UnderFinRight.addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, true);

        PectoralFinLeft = new ModelRenderer(this, 8, 21);
        PectoralFinLeft.setPos(-1.5F, 1.0F, -2.0F);
        Body.addChild(PectoralFinLeft);
        setRotateAngle(PectoralFinLeft, 0.0F, -0.5009F, 0.0F);
        PectoralFinLeft.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        BackFin = new ModelRenderer(this, 0, 19);
        BackFin.setPos(0.0F, -1.0F, -2.5F);
        Body.addChild(BackFin);
        BackFin.addBox(0.0F, -4.0F, 0.0F, 0.0F, 3.0F, 7.0F, 0.0F, false);

        AnalFin = new ModelRenderer(this, 16, 8);
        AnalFin.setPos(0.0F, 1.5F, 0.5F);
        Body.addChild(AnalFin);
        AnalFin.addBox(0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
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