package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.CaimanModel;
import com.github.hellocrossy.wondersoftheworld.client.model.MargayModel;
import com.github.hellocrossy.wondersoftheworld.entity.CaimanEntity;
import com.github.hellocrossy.wondersoftheworld.entity.MargayEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CaimanRenderer extends ZawaMobRenderer<CaimanEntity, CaimanModel> {
    public CaimanRenderer(EntityRendererManager manager) {
        super(manager, new CaimanModel.Adult(), new CaimanModel.Child(), 0.35F);

    }

    @Override
    protected void scale(CaimanEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(CaimanEntity entity) {
        return false;
    }
}