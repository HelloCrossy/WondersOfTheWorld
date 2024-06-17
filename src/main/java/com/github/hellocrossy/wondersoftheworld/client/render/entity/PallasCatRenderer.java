package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.PallasCatModel;
import com.github.hellocrossy.wondersoftheworld.entity.PallasCatEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PallasCatRenderer extends ZawaMobRenderer<PallasCatEntity, PallasCatModel> {
    public PallasCatRenderer(EntityRendererManager manager) {
        super(manager, new PallasCatModel.Adult(), new PallasCatModel.Child(), 0.35F);
    }

    @Override
    protected void scale(PallasCatEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
