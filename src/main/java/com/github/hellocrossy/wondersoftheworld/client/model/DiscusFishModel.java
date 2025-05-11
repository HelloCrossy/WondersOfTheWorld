package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.DiscusFishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class DiscusFishModel extends ZawaBaseAmbientModel<DiscusFishEntity> {

    public ModelRenderer Body;
    public ModelRenderer Tail;
    public ModelRenderer DorsalFin;
    public ModelRenderer RightPelvicFin;
    public ModelRenderer Head;
    public ModelRenderer AnalFin;
    public ModelRenderer LeftPelvicFin;
    public ModelRenderer LeftPectoralFin;
    public ModelRenderer RightPectoralFin;
    public ModelRenderer TailFin;
    public ModelRenderer Face;
    public ModelRenderer Forehead;

    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public DiscusFishModel() {
        this.texWidth = 64;
        this.texHeight = 32;
        this.Forehead = new ModelRenderer(this, 11, 12);
        this.Forehead.setPos(0.0F, 0.0F, -2.5F);
        this.Forehead.addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Forehead, -1.0471975511965976F, 0.0F, 0.0F);
        this.AnalFin = new ModelRenderer(this, 13, 0);
        this.AnalFin.setPos(0.0F, 3.1F, -1.0F);
        this.AnalFin.addBox(0.0F, 0.0F, -2.5F, 0.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(AnalFin, 1.4486232791552935F, 0.0F, 0.0F);
        this.TailFin = new ModelRenderer(this, 21, 17);
        this.TailFin.setPos(0.0F, 0.0F, 2.0F);
        this.TailFin.addBox(0.0F, -0.4F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFin, 1.5707963267948966F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 8, 19);
        this.Body.setPos(0.0F, 15.8F, 0.0F);
        this.Body.addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.LeftPelvicFin = new ModelRenderer(this, 10, 3);
        this.LeftPelvicFin.setPos(0.6F, 3.0F, -2.5F);
        this.LeftPelvicFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPelvicFin, 0.27314402127920984F, 0.2275909337942703F, -0.13665927909957545F);
        this.LeftPectoralFin = new ModelRenderer(this, 13, 1);
        this.LeftPectoralFin.setPos(1.4F, 1.2F, -2.5F);
        this.LeftPectoralFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftPectoralFin, 0.3642502295386026F, 0.3642502295386026F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 9);
        this.Head.setPos(0.0F, -1.3F, -2.7F);
        this.Head.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.2275909337942703F, 0.0F, 0.0F);
        this.RightPelvicFin = new ModelRenderer(this, 10, 7);
        this.RightPelvicFin.setPos(-0.6F, 3.0F, -2.5F);
        this.RightPelvicFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPelvicFin, 0.27314402127920984F, -0.2275909337942703F, 0.13665927909957545F);
        this.RightPectoralFin = new ModelRenderer(this, 13, -1);
        this.RightPectoralFin.setPos(-1.4F, 1.2F, -2.5F);
        this.RightPectoralFin.addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightPectoralFin, 0.3642502295386026F, -0.3642502295386026F, 0.0F);
        this.Face = new ModelRenderer(this, 1, 1);
        this.Face.setPos(0.0F, 0.1F, -2.9F);
        this.Face.addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Face, 1.2983504199059372F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 2, 17);
        this.Tail.setPos(0.0F, 0.0F, 2.7F);
        this.Tail.addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.DorsalFin = new ModelRenderer(this, 21, 6);
        this.DorsalFin.setPos(0.0F, -3.1F, -3.0F);
        this.DorsalFin.addBox(0.0F, 0.0F, -2.5F, 0.0F, 8.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(DorsalFin, 1.6580627893946132F, 0.0F, 0.0F);
        this.Head.addChild(this.Forehead);
        this.Body.addChild(this.AnalFin);
        this.Tail.addChild(this.TailFin);
        this.Body.addChild(this.LeftPelvicFin);
        this.Body.addChild(this.LeftPectoralFin);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.RightPelvicFin);
        this.Body.addChild(this.RightPectoralFin);
        this.Head.addChild(this.Face);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.DorsalFin);

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