package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.PygmyHippoModel;
import com.github.hellocrossy.wondersoftheworld.entity.PygmyHippoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PygmyHippoRenderer extends ZawaMobRenderer<PygmyHippoEntity, PygmyHippoModel> {
    public PygmyHippoRenderer(EntityRendererManager manager) {
        super(manager, new PygmyHippoModel.Adult(), new PygmyHippoModel.Child(), 0.6F);
    }

    @Override
    protected void scale(PygmyHippoEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(PygmyHippoEntity entity) {
        return false;
    }
}