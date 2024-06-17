package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.HamsterModel;
import com.github.hellocrossy.wondersoftheworld.entity.HamsterEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HamsterRenderer extends ZawaMobRenderer<HamsterEntity, HamsterModel> {
    public HamsterRenderer(EntityRendererManager manager) {
        super(manager, new HamsterModel.Adult(), new HamsterModel.Child(), 0.175F);

    }

    @Override
    protected void scale(HamsterEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(HamsterEntity entity) {
        return false;
    }
}

