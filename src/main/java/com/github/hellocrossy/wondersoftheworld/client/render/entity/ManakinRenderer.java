package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.ManakinModel;
import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.ManakinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ManakinRenderer extends ZawaMobRenderer<ManakinEntity, ManakinModel> {
    public ManakinRenderer(EntityRendererManager manager) {
        super(manager, new ManakinModel.Adult(), new ManakinModel.Child(), 0.2F);
    }

    @Override
    protected void scale(ManakinEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.3F : 0.85F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

    @Override
    protected boolean hasBabyVariants(ManakinEntity entity) {
        return false;
    }
    }
