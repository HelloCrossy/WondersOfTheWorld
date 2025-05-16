package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.GuanacoModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.GuanacoEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GuanacoRenderer extends ZawaMobRenderer<GuanacoEntity, GuanacoModel> {
    public GuanacoRenderer(EntityRendererProvider.Context context) {
        super(context, new GuanacoModel.Adult(context.bakeLayer(WOTWModelLayers.GUANACO_ADULT)), new GuanacoModel.Child(context.bakeLayer(WOTWModelLayers.GUANACO_CHILD)), 0.8F);
    }

    @Override
    protected void scale(GuanacoEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.1F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(GuanacoEntity entity) {
        return false;
    }
}
