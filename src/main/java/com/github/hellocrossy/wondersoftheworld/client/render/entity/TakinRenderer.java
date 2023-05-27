package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.TakinModel;
import com.github.hellocrossy.wondersoftheworld.client.model.TakinModel;
import com.github.hellocrossy.wondersoftheworld.entity.ServalEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TakinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TakinRenderer extends ZawaMobRenderer<TakinEntity, TakinModel> {
    private final TakinModel adultModel;
    private final TakinModel babyModel;

    public TakinRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new TakinModel.Adult(), 1.0F);
        adultModel = model;
        babyModel = new TakinModel.Child();
    }
    @Override
    protected void scale(TakinEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.1F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    public void render(TakinEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(TakinEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/takin/takin_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(TakinEntity entity) {
        babyTexture = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/takin/takin_baby.png");
    }
}
