package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.TuracoModel;
import com.github.hellocrossy.wondersoftheworld.entity.TuracoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TuracoRenderer extends ZawaMobRenderer<TuracoEntity, TuracoModel> {
    public TuracoRenderer(EntityRendererManager manager) {
        super (manager, new TuracoModel.Adult(), new TuracoModel.Flying(), new TuracoModel.Child(), 0.8F);    }
    @Override
    protected void scale(TuracoEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.2F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(TuracoEntity entity) {
        return false;
    }
    }

