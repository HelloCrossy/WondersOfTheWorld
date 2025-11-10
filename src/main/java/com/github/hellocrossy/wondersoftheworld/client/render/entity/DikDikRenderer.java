package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.DikDikModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.DikDikEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class DikDikRenderer extends ZawaMobRenderer<DikDikEntity, DikDikModel> {
    public DikDikRenderer(EntityRendererProvider.Context context) {
        super(context, new DikDikModel.Adult(context.bakeLayer(WOTWModelLayers.DIK_DIK_ADULT)), new DikDikModel.Child(context.bakeLayer(WOTWModelLayers.DIK_DIK_CHILD)), 0.25F);

    }

    @Override
    protected void scale(DikDikEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
