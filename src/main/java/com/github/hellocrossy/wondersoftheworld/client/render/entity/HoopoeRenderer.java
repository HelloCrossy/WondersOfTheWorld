package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.HoopoeModel;
import com.github.hellocrossy.wondersoftheworld.entity.HoopoeEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HoopoeRenderer extends ZawaMobRenderer<HoopoeEntity, HoopoeModel> {
    public HoopoeRenderer(EntityRendererManager manager) {
        super (manager, new HoopoeModel.Adult(), new HoopoeModel.Flying(), new HoopoeModel.Child(), 0.25F);
    }
    @Override
    protected void scale(HoopoeEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(HoopoeEntity entity) {
        return false;
    }
}
