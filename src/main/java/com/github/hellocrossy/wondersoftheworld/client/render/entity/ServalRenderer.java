package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.ServalModel;
import com.github.hellocrossy.wondersoftheworld.entity.ServalEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ServalRenderer extends ZawaMobRenderer<ServalEntity, ServalModel> {
    public ServalRenderer(EntityRendererManager manager) {
        super(manager, new ServalModel.Adult(), new ServalModel.Child(), 0.6F);
    }

    @Override
    protected void scale(ServalEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(ServalEntity entity) {
        return false;
    }
}