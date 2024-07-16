package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.entity.CaracalEntity;
import com.github.hellocrossy.wondersoftheworld.client.model.CaracalModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CaracalRenderer extends ZawaMobRenderer<CaracalEntity, CaracalModel> {
    public CaracalRenderer(EntityRendererManager manager) {
        super(manager, new CaracalModel.Adult(), new CaracalModel.Child(), 0.475F);
    }

    @Override
    protected void scale(CaracalEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}

