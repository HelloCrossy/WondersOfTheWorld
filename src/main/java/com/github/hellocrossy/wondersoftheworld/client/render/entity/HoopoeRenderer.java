package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.HoopoeModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.HoopoeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HoopoeRenderer extends ZawaMobRenderer<HoopoeEntity, HoopoeModel> {
    public HoopoeRenderer(EntityRendererProvider.Context context) {
        super(context, new HoopoeModel.Adult(context.bakeLayer(WOTWModelLayers.HOOPOE_ADULT)), new HoopoeModel.Flying(context.bakeLayer(WOTWModelLayers.HOOPOE_FLYING)), new HoopoeModel.Child(context.bakeLayer(WOTWModelLayers.HOOPOE_CHILD)), 0.25F);
    }

    @Override
    protected void scale(HoopoeEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(HoopoeEntity entity) {
        return false;
    }
}
