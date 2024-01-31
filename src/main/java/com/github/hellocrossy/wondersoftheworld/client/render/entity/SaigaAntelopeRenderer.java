package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.SaigaAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SaigaAntelopeRenderer extends ZawaMobRenderer<SaigaAntelopeEntity, SaigaAntelopeModel> {
    public SaigaAntelopeRenderer(EntityRendererManager manager) {
        super(manager, new SaigaAntelopeModel.Adult(), new SaigaAntelopeModel.Child(), 0.5F);
    }
    @Override
    protected void scale(SaigaAntelopeEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 0.9F;
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

