package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.HamsterModel;
import com.github.hellocrossy.wondersoftheworld.entity.HamsterEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HamsterRenderer extends ZawaMobRenderer<HamsterEntity, HamsterModel> {
    public HamsterRenderer(EntityRendererProvider.Context context) {
        super(context, new HamsterModel.Adult(), new HamsterModel.Child(), 0.175F);

    }

    @Override
    protected void scale(HamsterEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(HamsterEntity entity) {
        return false;
    }
}

