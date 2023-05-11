package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.LowlandNyalaModel;
import com.github.hellocrossy.wondersoftheworld.client.model.TakinModel;
import com.github.hellocrossy.wondersoftheworld.entity.LowlandNyalaEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TakinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LowlandNyalaRenderer extends ZawaMobRenderer<LowlandNyalaEntity, LowlandNyalaModel> {
    private final LowlandNyalaModel adultModel;
    private final LowlandNyalaModel babyModel;

    public LowlandNyalaRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new LowlandNyalaModel.Adult(), 1.0F);
        adultModel = model;
        babyModel = new LowlandNyalaModel.Child();
    }

    @Override
    public void render(LowlandNyalaEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(LowlandNyalaEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/nyala/nyala_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(LowlandNyalaEntity entity) {
        babyTexture = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/nyala/nyala_baby.png");
    }
}
