package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.RufousElephantShrewModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.RufousElephantShrewEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RufousElephantShrewRenderer extends ZawaMobRenderer<RufousElephantShrewEntity, RufousElephantShrewModel> {
    public RufousElephantShrewRenderer(EntityRendererProvider.Context context) {
        super(context, new RufousElephantShrewModel.Adult(context.bakeLayer(WOTWModelLayers.RUFOUS_ELEPHANT_SHREW_ADULT)), new RufousElephantShrewModel.Child(context.bakeLayer(WOTWModelLayers.RUFOUS_ELEPHANT_SHREW_CHILD)), 0.175F);
    }

    @Override
    protected void scale(RufousElephantShrewEntity entity, com.mojang.blaze3d.vertex.PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.55F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(RufousElephantShrewEntity entity) {
        return false;
    }
}

