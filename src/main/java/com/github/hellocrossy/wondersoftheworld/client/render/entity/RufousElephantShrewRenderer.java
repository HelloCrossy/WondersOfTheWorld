package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.RufousElephantShrewModel;
import com.github.hellocrossy.wondersoftheworld.entity.RufousElephantShrewEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RufousElephantShrewRenderer extends ZawaMobRenderer<RufousElephantShrewEntity, RufousElephantShrewModel> {
    public RufousElephantShrewRenderer(EntityRendererManager manager) {
        super(manager, new RufousElephantShrewModel.Adult(), new RufousElephantShrewModel.Child(), 0.175F);

    }

    @Override
    protected void scale(RufousElephantShrewEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.55F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(RufousElephantShrewEntity entity) {
        return false;
    }
}

