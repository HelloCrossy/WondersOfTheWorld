package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.FennecFoxModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.FennecFoxEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class FennecFoxRenderer extends ZawaMobRenderer<FennecFoxEntity, FennecFoxModel> {
    public FennecFoxRenderer(EntityRendererProvider.Context context) {
        super(context, new FennecFoxModel.Adult(context.bakeLayer(WOTWModelLayers.FENNEC_FOX_ADULT)), new FennecFoxModel.Child(context.bakeLayer(WOTWModelLayers.FENNEC_FOX_ADULT)), 0.375F);
    }

    @Override
    protected void scale(FennecFoxEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}

