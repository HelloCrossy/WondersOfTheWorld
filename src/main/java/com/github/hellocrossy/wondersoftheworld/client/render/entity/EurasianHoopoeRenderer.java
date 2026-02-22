package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.EurasianHoopoeModel;
import com.github.hellocrossy.wondersoftheworld.entity.EurasianHoopoeEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class EurasianHoopoeRenderer extends ZawaMobRenderer<EurasianHoopoeEntity, EurasianHoopoeModel> {
    public EurasianHoopoeRenderer(EntityRendererManager manager) {
        super(manager, new EurasianHoopoeModel.Adult(), new EurasianHoopoeModel.Flying(), new EurasianHoopoeModel.Child(), 0.25F);
    }

    @Override
    protected void scale(EurasianHoopoeEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(EurasianHoopoeEntity entity) {
        return false;
    }
}
