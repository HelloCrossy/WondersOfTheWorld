package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.MargayModel;
import com.github.hellocrossy.wondersoftheworld.entity.MargayEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MargayRenderer extends ZawaMobRenderer<MargayEntity, MargayModel> {
    public MargayRenderer(EntityRendererManager manager) {
        super(manager, new MargayModel.Adult(), new MargayModel.Child(), 0.4F);

    }

    @Override
    protected void scale(MargayEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(MargayEntity entity) {
        return false;
    }
}