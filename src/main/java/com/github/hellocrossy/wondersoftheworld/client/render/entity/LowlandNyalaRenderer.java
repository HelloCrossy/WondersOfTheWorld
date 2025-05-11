package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.LowlandNyalaModel;
import com.github.hellocrossy.wondersoftheworld.entity.LowlandNyalaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LowlandNyalaRenderer extends ZawaMobRenderer<LowlandNyalaEntity, LowlandNyalaModel> {
    public LowlandNyalaRenderer(EntityRendererProvider.Context context) {
        super(context, new LowlandNyalaModel.AdultMale(), new LowlandNyalaModel.Child(), 0.5F);
        adultFemaleModel = new LowlandNyalaModel.AdultFemale();
    }

    @Override
    protected void scale(LowlandNyalaEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(LowlandNyalaEntity entity) {
        return false;
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

