package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.KirksDikDikModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.KirksDikDikEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KirksDikDikRenderer extends ZawaMobRenderer<KirksDikDikEntity, KirksDikDikModel> {
    public KirksDikDikRenderer(EntityRendererProvider.Context context) {
        super(context, new KirksDikDikModel.Adult(context.bakeLayer(WOTWModelLayers.KIRKS_DIK_DIK_ADULT)), new KirksDikDikModel.Child(context.bakeLayer(WOTWModelLayers.KIRKS_DIK_DIK_CHILD)), 0.25F);

    }

    @Override
    protected void scale(KirksDikDikEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
