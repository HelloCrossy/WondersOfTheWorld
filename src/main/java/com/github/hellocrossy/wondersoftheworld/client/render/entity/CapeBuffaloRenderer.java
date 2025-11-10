package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.CapeBuffaloModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.CapeBuffaloEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CapeBuffaloRenderer extends ZawaMobRenderer<CapeBuffaloEntity, CapeBuffaloModel> {
    public CapeBuffaloRenderer(EntityRendererProvider.Context context) {
        super(context, new CapeBuffaloModel.Adult(context.bakeLayer(WOTWModelLayers.CAPE_BUFFALO_ADULT)), new CapeBuffaloModel.Child(context.bakeLayer(WOTWModelLayers.CAPE_BUFFALO_CHILD)), 0.6F);
    }

    @Override
    protected void scale(CapeBuffaloEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(CapeBuffaloEntity entity) {
        return false;
    }
}