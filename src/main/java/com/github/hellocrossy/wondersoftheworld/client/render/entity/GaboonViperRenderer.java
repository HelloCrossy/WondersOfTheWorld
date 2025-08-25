package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.GaboonViperModel;
import com.github.hellocrossy.wondersoftheworld.client.model.HoopoeModel;
import com.github.hellocrossy.wondersoftheworld.entity.CapeBuffaloEntity;
import com.github.hellocrossy.wondersoftheworld.entity.GaboonViperEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GaboonViperRenderer extends ZawaMobRenderer<GaboonViperEntity, GaboonViperModel> {
    public GaboonViperRenderer(EntityRendererManager manager) {
        super(manager, new GaboonViperModel.Adult(), new GaboonViperModel.Child(), 0.25F);
    }

    @Override
    protected void scale(GaboonViperEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.6F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
