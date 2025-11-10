package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.CapeBuffaloModel;
import com.github.hellocrossy.wondersoftheworld.entity.CapeBuffaloEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CapeBuffaloRenderer extends ZawaMobRenderer<CapeBuffaloEntity, CapeBuffaloModel> {
    public CapeBuffaloRenderer(EntityRendererManager manager) {
        super(manager, new CapeBuffaloModel.Adult(), new CapeBuffaloModel.Child(), 0.6F);
    }

    @Override
    protected void scale(CapeBuffaloEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(CapeBuffaloEntity entity) {
        return false;
    }
}