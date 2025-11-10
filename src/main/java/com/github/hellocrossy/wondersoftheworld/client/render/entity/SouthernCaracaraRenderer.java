package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SouthernCaracaraModel;
import com.github.hellocrossy.wondersoftheworld.entity.SouthernCaracaraEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SouthernCaracaraRenderer extends ZawaMobRenderer<SouthernCaracaraEntity, SouthernCaracaraModel> {
    public SouthernCaracaraRenderer(EntityRendererManager manager) {
        super(manager, new SouthernCaracaraModel.Adult(), new SouthernCaracaraModel.Child(), 0.25F);
    }
    @Override
    protected void scale(SouthernCaracaraEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
