package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.EurasianHamsterModel;
import com.github.hellocrossy.wondersoftheworld.entity.EurasianHamsterEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class EurasianHamsterRenderer extends ZawaMobRenderer<EurasianHamsterEntity, EurasianHamsterModel> {
    public EurasianHamsterRenderer(EntityRendererManager manager) {
        super(manager, new EurasianHamsterModel.Adult(), new EurasianHamsterModel.Child(), 0.175F);

    }

    @Override
    protected void scale(EurasianHamsterEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(EurasianHamsterEntity entity) {
        return false;
    }
}

