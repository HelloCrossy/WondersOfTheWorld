package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.EurasianHoopoeModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.EurasianHoopoeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class EurasianHoopoeRenderer extends ZawaMobRenderer<EurasianHoopoeEntity, EurasianHoopoeModel> {
    public EurasianHoopoeRenderer(EntityRendererProvider.Context context) {
        super(context, new EurasianHoopoeModel.Adult(context.bakeLayer(WOTWModelLayers.EURASIAN_HOOPOE_ADULT)), new EurasianHoopoeModel.Flying(context.bakeLayer(WOTWModelLayers.EURASIAN_HOOPOE_FLYING)), new EurasianHoopoeModel.Child(context.bakeLayer(WOTWModelLayers.EURASIAN_HOOPOE_CHILD)), 0.25F);
    }

    @Override
    protected void scale(EurasianHoopoeEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(EurasianHoopoeEntity entity) {
        return false;
    }
}
