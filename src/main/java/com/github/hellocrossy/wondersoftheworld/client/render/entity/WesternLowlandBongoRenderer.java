package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.client.model.WesternLowlandBongoModel;
import com.github.hellocrossy.wondersoftheworld.entity.WesternLowlandBongoEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class WesternLowlandBongoRenderer extends ZawaMobRenderer<WesternLowlandBongoEntity, WesternLowlandBongoModel> {
    public WesternLowlandBongoRenderer(EntityRendererProvider.Context context) {
        super(context, new WesternLowlandBongoModel.Adult(context.bakeLayer(WOTWModelLayers.WESTERN_LOWLAND_BONGO_ADULT)), new WesternLowlandBongoModel.Child(context.bakeLayer(WOTWModelLayers.WESTERN_LOWLAND_BONGO_CHILD)), 0.7F);

    }

    @Override
    protected void scale(WesternLowlandBongoEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.95F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

