package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.TakaheModel;
import com.github.hellocrossy.wondersoftheworld.entity.TakaheEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TakaheRenderer extends ZawaMobRenderer<TakaheEntity, TakaheModel> {
    private final TakaheModel adultModel;
    private final TakaheModel babyModel;

    public TakaheRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new TakaheModel.Adult(), 1.0F);
        adultModel = model;
        babyModel = new TakaheModel.Child();
    }

    @Override
    public void render(TakaheEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(TakaheEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/takahe/takahe_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(TakaheEntity entity) {
        babyTexture = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/takahe/takahe_baby.png");
    }
}