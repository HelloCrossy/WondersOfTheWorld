package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.TamarinModel;
import com.github.hellocrossy.wondersoftheworld.entity.TamarinEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TamarinRenderer extends ZawaMobRenderer<TamarinEntity, TamarinModel> {
    public TamarinRenderer(EntityRendererProvider.Context context) {
        super(context, new TamarinModel.Adult(), new TamarinModel.Child(), 0.25F);

    }

    @Override
    protected void scale(TamarinEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.3F : 0.6F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
