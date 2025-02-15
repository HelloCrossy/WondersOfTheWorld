package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.HammerkopModel;
import com.github.hellocrossy.wondersoftheworld.entity.HammerkopEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HammerkopRenderer extends ZawaMobRenderer<HammerkopEntity, HammerkopModel> {
    public HammerkopRenderer(EntityRendererManager manager) {
        super(manager, new HammerkopModel.Adult(), new HammerkopModel.Flying(), new HammerkopModel.Child(), 0.25F);
    }

    @Override
    protected void scale(HammerkopEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(HammerkopEntity entity) {
        return false;
    }
}