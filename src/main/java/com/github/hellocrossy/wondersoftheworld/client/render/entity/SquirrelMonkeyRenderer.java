package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SquirrelMonkeyModel;
import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.SquirrelMonkeyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SquirrelMonkeyRenderer extends ZawaMobRenderer<SquirrelMonkeyEntity, SquirrelMonkeyModel> {
    public SquirrelMonkeyRenderer(EntityRendererManager manager) {
        super(manager, new SquirrelMonkeyModel.Adult(), new SquirrelMonkeyModel.Child(), 0.35F);
    }
    @Override
    protected void scale(SquirrelMonkeyEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.55F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
