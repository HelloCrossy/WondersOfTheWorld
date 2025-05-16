package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.PallasCatModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.PallasCatEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PallasCatRenderer extends ZawaMobRenderer<PallasCatEntity, PallasCatModel> {
    public PallasCatRenderer(EntityRendererProvider.Context context) {
        super(context, new PallasCatModel.Adult(context.bakeLayer(WOTWModelLayers.PALLAS_CAT_ADULT)), new PallasCatModel.Child(context.bakeLayer(WOTWModelLayers.PALLAS_CAT_CHILD)), 0.375F);
    }

    @Override
    protected void scale(PallasCatEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.65F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
