package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.OryxModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.OryxEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class OryxRenderer extends ZawaMobRenderer<OryxEntity, OryxModel> {
    public OryxRenderer(EntityRendererProvider.Context context) {
        super(context, new OryxModel.Adult(context.bakeLayer(WOTWModelLayers.ORYX_ADULT)), new OryxModel.Child(context.bakeLayer(WOTWModelLayers.ORYX_CHILD)), 0.7F);
    }

    @Override
    protected void scale(OryxEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
