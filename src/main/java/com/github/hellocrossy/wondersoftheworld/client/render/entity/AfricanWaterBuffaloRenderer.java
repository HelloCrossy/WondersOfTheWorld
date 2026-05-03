package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.AfricanWaterBuffaloModel;
import com.github.hellocrossy.wondersoftheworld.entity.AfricanWaterBuffaloEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AfricanWaterBuffaloRenderer extends ZawaMobRenderer<AfricanWaterBuffaloEntity, AfricanWaterBuffaloModel> {
    public AfricanWaterBuffaloRenderer(EntityRendererManager manager) {
        super(manager, new AfricanWaterBuffaloModel.Adult(), new AfricanWaterBuffaloModel.Child(), 1.2F);
    }

    @Override
    protected void scale(AfricanWaterBuffaloEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 1.05F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(AfricanWaterBuffaloEntity entity) {
        return false;
    }
}