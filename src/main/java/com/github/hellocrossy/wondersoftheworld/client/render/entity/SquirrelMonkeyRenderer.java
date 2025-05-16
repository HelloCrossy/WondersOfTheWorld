package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SquirrelMonkeyModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.SquirrelMonkeyEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SquirrelMonkeyRenderer extends ZawaMobRenderer<SquirrelMonkeyEntity, SquirrelMonkeyModel> {
    public SquirrelMonkeyRenderer(EntityRendererProvider.Context context) {
        super(context, new SquirrelMonkeyModel.Adult(context.bakeLayer(WOTWModelLayers.SQUIRREL_MONKEY_ADULT)), new SquirrelMonkeyModel.Child(context.bakeLayer(WOTWModelLayers.SQUIRREL_MONKEY_CHILD)), 0.35F);
    }

    @Override
    protected void scale(SquirrelMonkeyEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.45F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
