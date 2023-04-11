package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.SaigaAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.entity.TakaheEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SaigaAntelopeRenderer extends ZawaMobRenderer<SaigaAntelopeEntity, SaigaAntelopeModel> {
    private final SaigaAntelopeModel adultModel;
    private final SaigaAntelopeModel babyModel;

    public TakaheRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SaigaAntelopeModel.Adult(), 1.0F);
        adultModel = model;
        babyModel = new SaigaAntelopeModel.Child();
    }

    @Override
    public void render(SaigaAntelopeEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(SaigaAntelopeEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/saiga_antelope/saiga_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(SaigaAntelopeEntity entity) {
        babyTexture = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/saiga_antelope/saiga_baby.png");
    }
}
