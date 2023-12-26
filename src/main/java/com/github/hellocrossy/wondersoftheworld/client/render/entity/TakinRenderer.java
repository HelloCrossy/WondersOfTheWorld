package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.TakinModel;
import com.github.hellocrossy.wondersoftheworld.entity.TakinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TakinRenderer extends ZawaMobRenderer<TakinEntity, TakinModel> {
    public TakinRenderer(EntityRendererManager manager) {
        super (manager, new TakinModel.Adult(), new TakinModel.Child(), 0.7F);
    }
    @Override
    protected void scale(TakinEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.1F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(TakinEntity entity) {
        return false;
    }
}
