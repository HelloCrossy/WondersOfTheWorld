package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.DiscusFishEntity;
import com.github.hellocrossy.wondersoftheworld.entity.OscarEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class DiscusFishModel extends SegmentedModel<DiscusFishEntity> {

    protected ModelRenderer Discus;
    protected ModelRenderer Head_r1_r1;
    protected ModelRenderer CaudalFin1_r1_r1;
    protected ModelRenderer PectoralFin_r2_r1;
    protected ModelRenderer PectoralFin_r1_r1;
    protected ModelRenderer UnderFin_r2_r1;
    protected ModelRenderer UnderFin_r1_r1;
    protected ModelRenderer CaudalFinStart_r2_r1;
    protected ModelRenderer CaudalFinStart_r1_r1;
    protected ModelRenderer CaudalFin2_r1_r1;

    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Discus);
        }

        return this.parts;
    }
    public DiscusFishModel() {
        this.texWidth = 32;
        this.texHeight = 32;

        Discus = new ModelRenderer(this, 0, 0);
        Discus.setPos(0.0F, 24.0F, 0.0F);
        Discus.texOffs(12, 9).addBox(-1.5F, -12.0F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, false);
        Discus.texOffs(0, 3).addBox(0.0F, -14.5F, -3.0F, 0.0F, 3.0F, 9.0F, 0.0F, false);
        Discus.texOffs(0, 0).addBox(0.0F, -6.5F, -3.0F, 0.0F, 3.0F, 9.0F, 0.0F, false);
        Discus.texOffs(0, 15).addBox(-1.0F, -11.5016F, 3.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
        Discus.texOffs(10, 0).addBox(-1.0F, -10.0016F, 4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        Head_r1_r1 = new ModelRenderer(this, 0, 0);
        Head_r1_r1.setPos(0.0F, 0.0F, 0.0F);
        Discus.addChild(Head_r1_r1);
        setRotateAngle(Head_r1_r1, -0.4363F, 0.0F, 0.0F);
        Head_r1_r1.addBox(-1.0F, -9.5F, -7.775F, 2.0F, 5.0F, 3.0F, 0.0F, false);

        CaudalFin1_r1_r1 = new ModelRenderer(this, 18, 0);
        CaudalFin1_r1_r1.setPos(0.0F, 1.333F, 2.7085F);
        Discus.addChild(CaudalFin1_r1_r1);
        setRotateAngle(CaudalFin1_r1_r1, 0.2749F, 0.0F, 0.0F);
        CaudalFin1_r1_r1.addBox(0.0F, -10.7875F, 5.1088F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        PectoralFin_r2_r1 = new ModelRenderer(this, 6, 17);
        PectoralFin_r2_r1.setPos(-1.1358F, 0.0F, 1.3357F);
        Discus.addChild(PectoralFin_r2_r1);
        setRotateAngle(PectoralFin_r2_r1, 0.0F, -0.8727F, 0.0F);
        PectoralFin_r2_r1.addBox(-2.0F, -8.45F, -1.55F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        PectoralFin_r1_r1 = new ModelRenderer(this, 16, 4);
        PectoralFin_r1_r1.setPos(1.1358F, 0.0F, 1.3357F);
        Discus.addChild(PectoralFin_r1_r1);
        setRotateAngle(PectoralFin_r1_r1, 0.0F, 0.8727F, 0.0F);
        PectoralFin_r1_r1.addBox(2.0F, -8.45F, -1.55F, 0.0F, 2.0F, 2.0F, 0.0F, false);

        UnderFin_r2_r1 = new ModelRenderer(this, 0, 20);
        UnderFin_r2_r1.setPos(2.8918F, 0.0361F, 1.8003F);
        Discus.addChild(UnderFin_r2_r1);
        setRotateAngle(UnderFin_r2_r1, 0.3247F, 0.0418F, -0.5241F);
        UnderFin_r2_r1.addBox(2.042F, -7.825F, -2.2464F, 0.0F, 3.0F, 1.0F, 0.0F, false);

        UnderFin_r1_r1 = new ModelRenderer(this, 10, 18);
        UnderFin_r1_r1.setPos(-2.8918F, 0.0361F, 1.8003F);
        Discus.addChild(UnderFin_r1_r1);
        setRotateAngle(UnderFin_r1_r1, 0.3247F, -0.0418F, 0.5241F);
        UnderFin_r1_r1.addBox(-2.042F, -7.825F, -2.2464F, 0.0F, 3.0F, 1.0F, 0.0F, false);

        CaudalFinStart_r2_r1 = new ModelRenderer(this, 6, 15);
        CaudalFinStart_r2_r1.setPos(0.0F, -2.4178F, -3.2755F);
        Discus.addChild(CaudalFinStart_r2_r1);
        setRotateAngle(CaudalFinStart_r2_r1, -0.3927F, 0.0F, 0.0F);
        CaudalFinStart_r2_r1.addBox(-0.5F, -10.4424F, 3.4397F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        CaudalFinStart_r1_r1 = new ModelRenderer(this, 10, 4);
        CaudalFinStart_r1_r1.setPos(0.0F, 1.0745F, 3.6122F);
        Discus.addChild(CaudalFinStart_r1_r1);
        setRotateAngle(CaudalFinStart_r1_r1, 0.3927F, 0.0F, 0.0F);
        CaudalFinStart_r1_r1.addBox(-0.5F, -9.5426F, 3.5071F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        CaudalFin2_r1_r1 = new ModelRenderer(this, 14, 2);
        CaudalFin2_r1_r1.setPos(0.0F, -1.0451F, -1.316F);
        Discus.addChild(CaudalFin2_r1_r1);
        setRotateAngle(CaudalFin2_r1_r1, -0.1527F, 0.0F, 0.0F);
        CaudalFin2_r1_r1.addBox(0.0F, -9.2376F, 5.1526F, 0.0F, 2.0F, 2.0F, 0.0F, false);

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