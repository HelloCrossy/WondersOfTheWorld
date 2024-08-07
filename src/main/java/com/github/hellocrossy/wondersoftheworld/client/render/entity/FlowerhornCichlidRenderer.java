package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.FlowerhornCichlidModel;
import com.github.hellocrossy.wondersoftheworld.entity.FlowerhornCichlidEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class FlowerhornCichlidRenderer extends ZawaMobRenderer<FlowerhornCichlidEntity, FlowerhornCichlidModel> {
    public FlowerhornCichlidRenderer(EntityRendererManager manager) {
        super(manager, new FlowerhornCichlidModel(), 0.2F);
    }

    @Override
    protected void scale(FlowerhornCichlidEntity entity, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.45F, 0.45F, 0.45F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(FlowerhornCichlidEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/flowerhorn_cichlid/flowerhorn_cichlid_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }
}
