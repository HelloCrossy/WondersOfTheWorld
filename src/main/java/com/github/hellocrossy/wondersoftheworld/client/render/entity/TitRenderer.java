package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.TitModel;
import com.github.hellocrossy.wondersoftheworld.entity.TitEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TitRenderer extends ZawaMobRenderer<TitEntity, TitModel> {
    private final TitModel adultModel;
    private final TitModel babyModel;
    private final TitModel flyingModel;

    public TitRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new TitModel.Adult(), 0.5F);
        adultModel = model;
        flyingModel = new TitModel.Flying();
        babyModel = new TitModel.Child();
    }
    @Override
    protected void scale(TitEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    public void render(TitEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) model = babyModel;
        else model = entity.isFlying() ? flyingModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(TitEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/tit/tit_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(TitEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/tit/tit_baby.png");
    }
}