package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.TibetanAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TibetanAntelopeEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TibetanAntelopeRenderer extends ZawaMobRenderer<TibetanAntelopeEntity, TibetanAntelopeModel> {
    public TibetanAntelopeRenderer(EntityRendererManager manager) {
        super (manager, new TibetanAntelopeModel.Adult(), new TibetanAntelopeModel.Child(), 0.65F);    }
    @Override
    protected void scale(TibetanAntelopeEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
