package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.OryxModel;
import com.github.hellocrossy.wondersoftheworld.entity.OryxEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class OryxRenderer extends ZawaMobRenderer<OryxEntity, OryxModel> {
    public OryxRenderer(EntityRendererManager manager) {
        super(manager, new OryxModel.Adult(), new OryxModel.Child(), 0.7F);
    }

    @Override
    protected void scale(OryxEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
