package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.TibetanAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.TibetanAntelopeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TibetanAntelopeRenderer extends ZawaMobRenderer<TibetanAntelopeEntity, TibetanAntelopeModel> {
    public TibetanAntelopeRenderer(EntityRendererProvider.Context context) {
        super(context, new TibetanAntelopeModel.Adult(context.bakeLayer(WOTWModelLayers.TIBETAN_ANTELOPE_ADULT)), new TibetanAntelopeModel.Child(context.bakeLayer(WOTWModelLayers.TIBETAN_ANTELOPE_CHILD)), 0.65F);
    }

    @Override
    protected void scale(TibetanAntelopeEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
