package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.WhiteTailedDeerModel;
import com.github.hellocrossy.wondersoftheworld.entity.WhiteTailedDeerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WhiteTailedDeerRenderer extends ZawaMobRenderer<WhiteTailedDeerEntity, WhiteTailedDeerModel> {
    public WhiteTailedDeerRenderer(EntityRendererManager manager) {
        super(manager, new WhiteTailedDeerModel.Adult(), new WhiteTailedDeerModel.Child(), 0.375F);
    }

    @Override
    protected void scale(WhiteTailedDeerEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
