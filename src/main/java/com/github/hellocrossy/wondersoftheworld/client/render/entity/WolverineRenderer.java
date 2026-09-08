package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.WolverineModel;
import com.github.hellocrossy.wondersoftheworld.entity.WolverineEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WolverineRenderer extends ZawaMobRenderer<WolverineEntity, WolverineModel> {
    public WolverineRenderer(EntityRendererManager manager) {
        super(manager, new WolverineModel.Adult(), new WolverineModel.Child(), 0.375F);
    }

    @Override
    protected void scale(WolverineEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
