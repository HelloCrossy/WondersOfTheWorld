package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.WesternLowlandBongoModel;
import com.github.hellocrossy.wondersoftheworld.entity.WesternLowlandBongoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WesternLowlandBongoRenderer extends ZawaMobRenderer<WesternLowlandBongoEntity, WesternLowlandBongoModel> {
    public WesternLowlandBongoRenderer(EntityRendererManager manager) {
        super(manager, new WesternLowlandBongoModel.Adult(), new WesternLowlandBongoModel.Child(), 0.7F);

    }

    @Override
    protected void scale(WesternLowlandBongoEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

