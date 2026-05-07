package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.AfricanWaterBuffaloModel;
import com.github.hellocrossy.wondersoftheworld.client.model.AfricanWaterBuffaloModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.AfricanWaterBuffaloEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AfricanWaterBuffaloRenderer extends ZawaMobRenderer<AfricanWaterBuffaloEntity, AfricanWaterBuffaloModel> {
    public AfricanWaterBuffaloRenderer(EntityRendererProvider.Context context) {
        super(context, new AfricanWaterBuffaloModel.Adult(context.bakeLayer(WOTWModelLayers.AFRICAN_WATER_BUFFALO_ADULT)), new AfricanWaterBuffaloModel.Child(context.bakeLayer(WOTWModelLayers.AFRICAN_WATER_BUFFALO_CHILD)), 1.2F);
    }

    @Override
    protected void scale(AfricanWaterBuffaloEntity entity, com.mojang.blaze3d.vertex.PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 1.05F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
    @Override
    protected boolean hasBabyVariants(AfricanWaterBuffaloEntity entity) {
        return false;
    }
}