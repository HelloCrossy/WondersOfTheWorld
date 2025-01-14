package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.QuetzalModel;
import com.github.hellocrossy.wondersoftheworld.entity.QuetzalEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class QuetzalRenderer extends ZawaMobRenderer<QuetzalEntity, QuetzalModel> {
    public QuetzalRenderer(EntityRendererManager manager) {
        super(manager, new QuetzalModel.Adult(), new QuetzalModel.Flying(), new QuetzalModel.Child(), 0.25F);
    }
    @Override
    protected void scale(QuetzalEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(QuetzalEntity entity) {
        return false;
    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}