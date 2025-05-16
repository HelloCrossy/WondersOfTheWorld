package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.CaracalModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.CaracalEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CaracalRenderer extends ZawaMobRenderer<CaracalEntity, CaracalModel> {
    public CaracalRenderer(EntityRendererProvider.Context context) {
        super(context, new CaracalModel.Adult(context.bakeLayer(WOTWModelLayers.CARACAL_ADULT)), new CaracalModel.Child(context.bakeLayer(WOTWModelLayers.CARACAL_CHILD)), 0.475F);
    }

    @Override
    protected void scale(CaracalEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}

