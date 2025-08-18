package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.DikDikModel;
import com.github.hellocrossy.wondersoftheworld.entity.CapeBuffaloEntity;
import com.github.hellocrossy.wondersoftheworld.entity.DikDikEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class DikDikRenderer extends ZawaMobRenderer<DikDikEntity, DikDikModel> {
    public DikDikRenderer(EntityRendererManager manager) {
        super(manager, new DikDikModel.Adult(), new DikDikModel.Child(), 0.25F);

    }

    @Override
    protected void scale(DikDikEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
