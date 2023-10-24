package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.DiscusFishEntity;
import com.github.hellocrossy.wondersoftheworld.entity.OscarEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class DiscusFishModel extends SegmentedModel<DiscusFishEntity> {

    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer TailBase;
    public ModelRenderer BackFin;
    public ModelRenderer AnalFin;
    public ModelRenderer PectoralFinLeft;
    public ModelRenderer PectoralFinRight;
    public ModelRenderer UnderFinLeft;
    public ModelRenderer UnderFinRight;
    public ModelRenderer Tail;
    public ModelRenderer TailJoinUpper;
    public ModelRenderer TailJoinLower;
    public ModelRenderer TailFinTop;
    public ModelRenderer TailFinBottom;

    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }
    public DiscusFishModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.TailBase = new ModelRenderer(this, 0, 15);
        this.TailBase.setPos(0.0F, 0.0F, 3.0F);
        this.TailBase.addBox(-1.0F, -2.5F, 0.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.PectoralFinLeft = new ModelRenderer(this, 14, 2);
        this.PectoralFinLeft.mirror = true;
        this.PectoralFinLeft.setPos(1.4F, 1.5F, -1.0F);
        this.PectoralFinLeft.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinLeft, 0.0F, 0.8726646259971648F, 0.0F);
        this.BackFin = new ModelRenderer(this, 0, 3);
        this.BackFin.mirror = true;
        this.BackFin.setPos(0.0F, -1.5F, -2.9F);
        this.BackFin.addBox(0.0F, -4.0F, 0.0F, 0.0F, 3.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.TailFinBottom = new ModelRenderer(this, 18, 0);
        this.TailFinBottom.mirror = true;
        this.TailFinBottom.setPos(0.0F, 0.7F, 1.1F);
        this.TailFinBottom.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinBottom, -0.15271630954950383F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 10, 0);
        this.Tail.setPos(0.0F, 0.0F, 1.0F);
        this.Tail.addBox(-1.0F, -0.9F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.TailJoinLower = new ModelRenderer(this, 10, 5);
        this.TailJoinLower.setPos(0.0F, 0.9F, -0.4F);
        this.TailJoinLower.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailJoinLower, 0.39269908169872414F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 12, 9);
        this.Body.setPos(0.0F, 17.2F, -1.4F);
        this.Body.addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.PectoralFinRight = new ModelRenderer(this, 14, 2);
        this.PectoralFinRight.setPos(-1.4F, 1.5F, -1.0F);
        this.PectoralFinRight.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralFinRight, 0.0F, -0.8726646259971648F, 0.0F);
        this.TailJoinUpper = new ModelRenderer(this, 6, 15);
        this.TailJoinUpper.setPos(0.0F, -0.7F, -0.4F);
        this.TailJoinUpper.addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailJoinUpper, -0.39269908169872414F, 0.0F, 0.0F);
        this.UnderFinRight = new ModelRenderer(this, 10, 18);
        this.UnderFinRight.setPos(-1.2F, 2.1F, -2.2F);
        this.UnderFinRight.addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UnderFinRight, 0.33161255787892263F, 0.0F, 0.5235987755982988F);
        this.AnalFin = new ModelRenderer(this, 0, 0);
        this.AnalFin.mirror = true;
        this.AnalFin.setPos(0.0F, 1.0F, -2.9F);
        this.AnalFin.addBox(0.0F, 1.0F, 0.0F, 0.0F, 3.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.UnderFinLeft = new ModelRenderer(this, 10, 18);
        this.UnderFinLeft.mirror = true;
        this.UnderFinLeft.setPos(1.2F, 2.1F, -2.2F);
        this.UnderFinLeft.addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UnderFinLeft, 0.33161255787892263F, 0.0F, -0.5235987755982988F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setPos(0.0F, -1.1F, -1.6F);
        this.Head.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.4363323129985824F, 0.0F, 0.0F);
        this.TailFinTop = new ModelRenderer(this, 18, 2);
        this.TailFinTop.mirror = true;
        this.TailFinTop.setPos(0.0F, -0.3F, 1.1F);
        this.TailFinTop.addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinTop, 0.2748893571891069F, 0.0F, 0.0F);
        this.Body.addChild(this.TailBase);
        this.Body.addChild(this.PectoralFinLeft);
        this.Body.addChild(this.BackFin);
        this.Tail.addChild(this.TailFinBottom);
        this.TailBase.addChild(this.Tail);
        this.Tail.addChild(this.TailJoinLower);
        this.Body.addChild(this.PectoralFinRight);
        this.Tail.addChild(this.TailJoinUpper);
        this.Body.addChild(this.UnderFinRight);
        this.Body.addChild(this.AnalFin);
        this.Body.addChild(this.UnderFinLeft);
        this.Body.addChild(this.Head);
        this.Tail.addChild(this.TailFinTop);

    }
    @Override
    public void setupAnim(DiscusFishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}