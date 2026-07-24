package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.LowlandNyalaModel;
import com.github.hellocrossy.wondersoftheworld.entity.LowlandNyalaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LowlandNyalaRenderer extends ZawaMobRenderer<LowlandNyalaEntity, LowlandNyalaModel> {
    public LowlandNyalaRenderer(EntityRendererManager manager) {
        super(manager, new LowlandNyalaModel.AdultMale(), new LowlandNyalaModel.Child(), 0.5F);
        adultFemaleModel = new LowlandNyalaModel.AdultFemale();
    }

    @Override
    protected void scale(LowlandNyalaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

