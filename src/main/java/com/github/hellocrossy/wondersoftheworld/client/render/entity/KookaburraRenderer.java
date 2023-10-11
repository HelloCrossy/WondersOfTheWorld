package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.KookaburraModel;
import com.github.hellocrossy.wondersoftheworld.entity.HoopoeEntity;
import com.github.hellocrossy.wondersoftheworld.entity.KookaburraEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KookaburraRenderer extends ZawaMobRenderer<KookaburraEntity, KookaburraModel> {
    public KookaburraRenderer(EntityRendererManager manager) {
        super (manager, new KookaburraModel.Adult(), new KookaburraModel.Flying(), new KookaburraModel.Child(), 0.25F);
    }
    @Override
    protected void scale(KookaburraEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(KookaburraEntity entity) {
        return false;
    }
}
