package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.TamarinModel;
import com.github.hellocrossy.wondersoftheworld.entity.TamarinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TamarinRenderer extends ZawaMobRenderer<TamarinEntity, TamarinModel> {
    public TamarinRenderer(EntityRendererManager manager) {
        super(manager, new TamarinModel.Adult(), new TamarinModel.Child(), 0.7F);

    }

    @Override
    protected void scale(TamarinEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.3F : 0.6F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
