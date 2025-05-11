package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.MouseDeerModel;
import com.github.hellocrossy.wondersoftheworld.entity.MouseDeerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MouseDeerRenderer extends ZawaMobRenderer<MouseDeerEntity, MouseDeerModel> {
    public MouseDeerRenderer(EntityRendererProvider.Context context) {
        super(context, new MouseDeerModel.Adult(), new MouseDeerModel.Child(), 0.25F);

    }

    @Override
    protected void scale(MouseDeerEntity entity, PoseStack matrixStack, float partialTickTime) {
        if (entity.isBaby() || entity.getVariant() > 0) {
            matrixStack.scale(0.9F, 0.9F, 0.9F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }
}