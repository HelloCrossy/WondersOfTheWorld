package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.DiscusFishModel;
import com.github.hellocrossy.wondersoftheworld.entity.DiscusFishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class DiscusFishRenderer extends ZawaMobRenderer<DiscusFishEntity, DiscusFishModel> {
    public DiscusFishRenderer(EntityRendererManager manager) {
        super(manager, new DiscusFishModel(), 0.3F);
    }
        @Override
    protected void scale(DiscusFishEntity entity, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.6F, 0.6F, 0.6F);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

