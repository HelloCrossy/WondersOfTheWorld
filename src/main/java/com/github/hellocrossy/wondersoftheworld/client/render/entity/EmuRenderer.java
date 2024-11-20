package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.EmuModel;
import com.github.hellocrossy.wondersoftheworld.entity.EmuEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class EmuRenderer extends ZawaMobRenderer<EmuEntity, EmuModel> {
    public EmuRenderer(EntityRendererManager manager) {
        super(manager, new EmuModel.Adult(), new EmuModel.Child(), 0.35F);
    }

    @Override
    protected void scale(EmuEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(EmuEntity entity) {
        return false;
    }
}

