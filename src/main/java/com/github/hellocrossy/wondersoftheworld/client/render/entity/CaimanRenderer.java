package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.CaimanModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.CaimanEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CaimanRenderer extends ZawaMobRenderer<CaimanEntity, CaimanModel> {
    public CaimanRenderer(EntityRendererProvider.Context context) {
        super(context, new CaimanModel.Adult(context.bakeLayer(WOTWModelLayers.CAIMAN_ADULT)), new CaimanModel.Child(context.bakeLayer(WOTWModelLayers.CAIMAN_CHILD)), 0.6F);
    }

    @Override
    protected void scale(CaimanEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.455F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(CaimanEntity entity) {
        return false;
    }
}