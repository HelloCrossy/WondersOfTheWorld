package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.KirksDikDikModel;
import com.github.hellocrossy.wondersoftheworld.entity.KirksDikDikEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KirksDikDikRenderer extends ZawaMobRenderer<KirksDikDikEntity, KirksDikDikModel> {
    public KirksDikDikRenderer(EntityRendererManager manager) {
        super(manager, new KirksDikDikModel.Adult(), new KirksDikDikModel.Child(), 0.25F);

    }

    @Override
    protected void scale(KirksDikDikEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
