package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.WarthogModel;
import com.github.hellocrossy.wondersoftheworld.entity.WarthogEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WarthogRenderer extends ZawaMobRenderer<WarthogEntity, WarthogModel> {
    public WarthogRenderer(EntityRendererManager manager) {
        super(manager, new WarthogModel.Adult(), new WarthogModel.Child(), 0.6F);
    }

    @Override
    protected void scale(WarthogEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(WarthogEntity entity) {
        return false;
    }
}
