package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.GeladaModel;
import com.github.hellocrossy.wondersoftheworld.entity.GeladaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GeladaRenderer extends ZawaMobRenderer<GeladaEntity, GeladaModel> {
    public GeladaRenderer(EntityRendererManager manager) {
        super(manager, new GeladaModel.Adult(), new GeladaModel.Child(), 0.375F);
    }

    @Override
    protected void scale(GeladaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}

