package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.BlackFootedCatModel;
import com.github.hellocrossy.wondersoftheworld.entity.BlackFootedCatEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BlackFootedCatRenderer extends ZawaMobRenderer<BlackFootedCatEntity, BlackFootedCatModel> {
    public BlackFootedCatRenderer(EntityRendererManager manager) {
        super(manager, new BlackFootedCatModel.Adult(), new BlackFootedCatModel.Child(), 0.3F);
    }

    @Override
    protected void scale(BlackFootedCatEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
