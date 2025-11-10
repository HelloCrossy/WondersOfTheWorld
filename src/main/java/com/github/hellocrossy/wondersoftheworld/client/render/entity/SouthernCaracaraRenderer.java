package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SouthernCaracaraModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.SouthernCaracaraEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SouthernCaracaraRenderer extends ZawaMobRenderer<SouthernCaracaraEntity, SouthernCaracaraModel> {
    public SouthernCaracaraRenderer(EntityRendererProvider.Context context) {
        super(context, new SouthernCaracaraModel.Adult(context.bakeLayer(WOTWModelLayers.SOUTHERN_CARACARA_ADULT)), new SouthernCaracaraModel.Child(context.bakeLayer(WOTWModelLayers.SOUTHERN_CARACARA_CHILD)), 0.25F);
    }
    @Override
    protected void scale(SouthernCaracaraEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
