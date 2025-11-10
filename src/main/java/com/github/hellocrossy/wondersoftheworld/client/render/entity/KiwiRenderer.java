package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.KiwiModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.KiwiEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KiwiRenderer extends ZawaMobRenderer<KiwiEntity, KiwiModel> {
    public KiwiRenderer(EntityRendererProvider.Context context) {
        super(context, new KiwiModel.Adult(context.bakeLayer(WOTWModelLayers.KIWI_ADULT)), new KiwiModel.Child(context.bakeLayer(WOTWModelLayers.KIWI_CHILD)), 0.25F);
    }

    @Override
    protected void scale(KiwiEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(KiwiEntity entity) {
        return false;
    }
}

