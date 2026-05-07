package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.MouseDeerModel;
import com.github.hellocrossy.wondersoftheworld.client.model.MouseDeerModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.MouseDeerEntity;
import com.github.hellocrossy.wondersoftheworld.entity.MargayEntity;
import com.github.hellocrossy.wondersoftheworld.entity.MouseDeerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.world.entity.animal.Macaw;

public class MouseDeerRenderer extends ZawaMobRenderer<MouseDeerEntity, MouseDeerModel> {
    public MouseDeerRenderer(EntityRendererProvider.Context context) {
        super(context, new MouseDeerModel.Adult(context.bakeLayer(WOTWModelLayers.MOUSE_DEER_ADULT)), new MouseDeerModel.Child(context.bakeLayer(WOTWModelLayers.MOUSE_DEER_CHILD)), 0.25F);
    }

    @Override
    protected void scale(MouseDeerEntity entity, com.mojang.blaze3d.vertex.PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}