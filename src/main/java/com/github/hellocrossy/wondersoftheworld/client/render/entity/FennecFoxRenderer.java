package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.FennecFoxModel;
import com.github.hellocrossy.wondersoftheworld.entity.FennecFoxEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class FennecFoxRenderer extends ZawaMobRenderer<FennecFoxEntity, FennecFoxModel> {
    public FennecFoxRenderer(EntityRendererManager manager) {
        super(manager, new FennecFoxModel.Adult(), new FennecFoxModel.Child(), 0.35F);
    }

    @Override
    protected void scale(FennecFoxEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}

