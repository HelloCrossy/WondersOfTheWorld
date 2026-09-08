package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.CurassowModel;
import com.github.hellocrossy.wondersoftheworld.entity.CurassowEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CurassowRenderer extends ZawaMobRenderer<CurassowEntity, CurassowModel> {
    public CurassowRenderer(EntityRendererManager manager) {
        super(manager, new CurassowModel.Adult(), new CurassowModel.Child(), 0.375F);
    }

    @Override
    protected void scale(CurassowEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
