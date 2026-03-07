package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SpectacledCaimanModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.SpectacledCaimanEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SpectacledCaimanRenderer extends ZawaMobRenderer<SpectacledCaimanEntity, SpectacledCaimanModel> {
    public SpectacledCaimanRenderer(EntityRendererProvider.Context context) {
        super(context, new SpectacledCaimanModel.Adult(context.bakeLayer(WOTWModelLayers.SPECTACLED_CAIMAN_ADULT)), new SpectacledCaimanModel.Child(context.bakeLayer(WOTWModelLayers.SPECTACLED_CAIMAN_CHILD)), 0.6F);
    }

    @Override
    protected void scale(SpectacledCaimanEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.455F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(SpectacledCaimanEntity entity) {
        return false;
    }
}