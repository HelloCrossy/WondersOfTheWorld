package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.BongoModel;
import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BongoRenderer extends ZawaMobRenderer<BongoEntity, BongoModel> {
    public BongoRenderer(EntityRendererManager manager) {
        super(manager, new BongoModel.Adult(), new BongoModel.Child(), 0.7F);

    }

    @Override
    protected void scale(BongoEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(BongoEntity entity) {
        return false;
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

