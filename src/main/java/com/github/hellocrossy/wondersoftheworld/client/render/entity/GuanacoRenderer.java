package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.GuanacoModel;
import com.github.hellocrossy.wondersoftheworld.entity.GuanacoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GuanacoRenderer extends ZawaMobRenderer<GuanacoEntity, GuanacoModel> {
    public GuanacoRenderer(EntityRendererManager manager) {
        super(manager, new GuanacoModel.Adult(), new GuanacoModel.Child(), 0.8F);
    }

    @Override
    protected void scale(GuanacoEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.1F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(GuanacoEntity entity) {
        return false;
    }
}
