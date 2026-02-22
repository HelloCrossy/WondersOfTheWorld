package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SpectacledCaimanModel;
import com.github.hellocrossy.wondersoftheworld.entity.SpectacledCaimanEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SpectacledCaimanRenderer extends ZawaMobRenderer<SpectacledCaimanEntity, SpectacledCaimanModel> {
    public SpectacledCaimanRenderer(EntityRendererManager manager) {
        super(manager, new SpectacledCaimanModel.Adult(), new SpectacledCaimanModel.Child(), 0.6F);

    }

    @Override
    protected void scale(SpectacledCaimanEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.455F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(SpectacledCaimanEntity entity) {
        return false;
    }
}