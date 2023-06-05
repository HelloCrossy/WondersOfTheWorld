package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.FennecFoxModel;
import com.github.hellocrossy.wondersoftheworld.client.model.TakaheModel;
import com.github.hellocrossy.wondersoftheworld.entity.FennecFoxEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TakaheEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class FennecFoxRenderer extends ZawaMobRenderer<FennecFoxEntity, FennecFoxModel> {
    private final FennecFoxModel adultModel;
    private final FennecFoxModel babyModel;

    public FennecFoxRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new FennecFoxModel.Adult(), 0.3F);
        adultModel = model;
        babyModel = new FennecFoxModel.Child();
    }
    @Override
    protected void scale(FennecFoxEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    public void render(FennecFoxEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(FennecFoxEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/fennec_fox/fennec_fox_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(FennecFoxEntity entity) {
        babyTexture = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/fennec_fox/fennec_fox_baby.png");
    }
}
