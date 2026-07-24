package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.GaboonViperModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.GaboonViperEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GaboonViperRenderer extends ZawaMobRenderer<GaboonViperEntity, GaboonViperModel> {
    public GaboonViperRenderer(EntityRendererProvider.Context context) {
        super(context, new GaboonViperModel.Adult(context.bakeLayer(WOTWModelLayers.GABOON_VIPER_ADULT)), new GaboonViperModel.Child(context.bakeLayer(WOTWModelLayers.GABOON_VIPER_CHILD)), 0.25F);
    }

    @Override
    protected void scale(GaboonViperEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.6F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
