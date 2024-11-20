package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.KiwiModel;
import com.github.hellocrossy.wondersoftheworld.entity.KiwiEntity;
import com.github.hellocrossy.wondersoftheworld.entity.WesternLowlandBongoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KiwiRenderer extends ZawaMobRenderer<KiwiEntity, KiwiModel> {
    public KiwiRenderer(EntityRendererManager manager) {
        super(manager, new KiwiModel.Adult(), new KiwiModel.Child(), 0.25F);
    }
    @Override
    protected void scale(KiwiEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(KiwiEntity entity) {
        return false;
    }
}

