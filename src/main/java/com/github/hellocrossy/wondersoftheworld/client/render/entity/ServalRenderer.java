package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.ServalModel;
import com.github.hellocrossy.wondersoftheworld.entity.ServalEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ServalRenderer extends ZawaMobRenderer<ServalEntity, ServalModel> {
    public ServalRenderer(EntityRendererProvider.Context context) {
        super(context, new ServalModel.Adult(), new ServalModel.Child(), 0.6F);
    }

    @Override
    protected void scale(ServalEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(ServalEntity entity) {
        return false;
    }
}