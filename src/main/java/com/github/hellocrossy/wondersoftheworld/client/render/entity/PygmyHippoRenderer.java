package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.PygmyHippoModel;
import com.github.hellocrossy.wondersoftheworld.entity.PygmyHippoEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PygmyHippoRenderer extends ZawaMobRenderer<PygmyHippoEntity, PygmyHippoModel> {
    public PygmyHippoRenderer(EntityRendererProvider.Context context) {
        super(context, new PygmyHippoModel.Adult(), new PygmyHippoModel.Child(), 0.6F);
    }

    @Override
    protected void scale(PygmyHippoEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 1.3F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(PygmyHippoEntity entity) {
        return false;
    }
}