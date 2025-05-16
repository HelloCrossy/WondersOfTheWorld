package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.EmuModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.EmuEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class EmuRenderer extends ZawaMobRenderer<EmuEntity, EmuModel> {
    public EmuRenderer(EntityRendererProvider.Context context) {
        super(context, new EmuModel.Adult(context.bakeLayer(WOTWModelLayers.EMU_ADULT)), new EmuModel.Child(context.bakeLayer(WOTWModelLayers.EMU_CHILD)), 0.35F);
    }

    @Override
    protected void scale(EmuEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.85F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }

    @Override
    protected boolean hasBabyVariants(EmuEntity entity) {
        return false;
    }
}

