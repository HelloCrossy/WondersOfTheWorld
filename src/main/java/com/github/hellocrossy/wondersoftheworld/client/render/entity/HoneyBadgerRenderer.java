package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.HoneyBadgerModel;
import com.github.hellocrossy.wondersoftheworld.entity.HoneyBadgerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HoneyBadgerRenderer extends ZawaMobRenderer<HoneyBadgerEntity, HoneyBadgerModel> {
    public HoneyBadgerRenderer(EntityRendererManager manager) {
        super(manager, new HoneyBadgerModel.Adult(), new HoneyBadgerModel.Child(), 0.375F);
    }

    @Override
    protected void scale(HoneyBadgerEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
