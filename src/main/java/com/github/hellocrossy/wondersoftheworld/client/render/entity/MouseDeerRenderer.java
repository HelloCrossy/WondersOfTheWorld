package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.MouseDeerModel;
import com.github.hellocrossy.wondersoftheworld.entity.MouseDeerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MouseDeerRenderer extends ZawaMobRenderer<MouseDeerEntity, MouseDeerModel> {
    public MouseDeerRenderer(EntityRendererManager manager) {
        super(manager, new MouseDeerModel.Adult(), new MouseDeerModel.Child(), 0.35F);

    }

    @Override
    protected void scale(MouseDeerEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(MouseDeerEntity entity) {
        return false;
    }
}