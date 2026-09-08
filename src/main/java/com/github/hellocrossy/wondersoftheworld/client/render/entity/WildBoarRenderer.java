package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.WildBoarModel;
import com.github.hellocrossy.wondersoftheworld.entity.WildBoarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WildBoarRenderer extends ZawaMobRenderer<WildBoarEntity, WildBoarModel> {
    public WildBoarRenderer(EntityRendererManager manager) {
        super(manager, new WildBoarModel.Adult(), new WildBoarModel.Child(), 0.375F);
    }

    @Override
    protected void scale(WildBoarEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
