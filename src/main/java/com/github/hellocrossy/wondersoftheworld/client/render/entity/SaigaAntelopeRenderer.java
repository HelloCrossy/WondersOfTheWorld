package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SaigaAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SaigaAntelopeRenderer extends ZawaMobRenderer<SaigaAntelopeEntity, SaigaAntelopeModel> {
    public SaigaAntelopeRenderer(EntityRendererProvider.Context context) {
        super(context, new SaigaAntelopeModel.Adult(), new SaigaAntelopeModel.Child(), 0.5F);
    }

    @Override
    protected void scale(SaigaAntelopeEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(SaigaAntelopeEntity entity) {
        return false;
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

