package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SableAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.SableAntelopeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SableAntelopeRenderer extends ZawaMobRenderer<SableAntelopeEntity, SableAntelopeModel> {
    public SableAntelopeRenderer(EntityRendererProvider.Context context) {
        super(context, new SableAntelopeModel.Adult(context.bakeLayer(WOTWModelLayers.SABLE_ANTELOPE_ADULT)), new SableAntelopeModel.Child(context.bakeLayer(WOTWModelLayers.SABLE_ANTELOPE_CHILD)), 0.7F);

    }

    @Override
    protected void scale(SableAntelopeEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(SableAntelopeEntity entity) {
        return false;
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}