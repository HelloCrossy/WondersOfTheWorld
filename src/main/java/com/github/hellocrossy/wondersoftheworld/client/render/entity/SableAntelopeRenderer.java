package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SableAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.client.model.SableAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.entity.SableAntelopeEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SableAntelopeRenderer extends ZawaMobRenderer<SableAntelopeEntity, SableAntelopeModel> {
    public SableAntelopeRenderer(EntityRendererManager manager) {
        super(manager, new SableAntelopeModel.Adult(), new SableAntelopeModel.Child(), 0.7F);

    }

    @Override
    protected void scale(SableAntelopeEntity entity, MatrixStack matrixStack, float partialTickTime) {
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