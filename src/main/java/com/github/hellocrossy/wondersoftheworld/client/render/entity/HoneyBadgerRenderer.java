package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.HoneyBadgerModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.HoneyBadgerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HoneyBadgerRenderer extends ZawaMobRenderer<HoneyBadgerEntity, HoneyBadgerModel> {
    public HoneyBadgerRenderer(EntityRendererProvider.Context context) {
        super(context, new HoneyBadgerModel.Adult(context.bakeLayer(WOTWModelLayers.HONEY_BADGER_ADULT)), new HoneyBadgerModel.Child(context.bakeLayer(WOTWModelLayers.HONEY_BADGER_CHILD)), 0.375F);
    }

    @Override
    protected void scale(HoneyBadgerEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
