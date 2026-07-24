package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.TakinModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.TakinEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TakinRenderer extends ZawaMobRenderer<TakinEntity, TakinModel> {
    public TakinRenderer(EntityRendererProvider.Context context) {
        super(context, new TakinModel.Adult(context.bakeLayer(WOTWModelLayers.TAKIN_ADULT)), new TakinModel.Child(context.bakeLayer(WOTWModelLayers.TAKIN_CHILD)), 0.85F);
    }

    @Override
    protected void scale(TakinEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(TakinEntity entity) {
        return false;
    }
}
