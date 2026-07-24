package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.FlowerhornCichlidModel;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.FlowerhornCichlidEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class FlowerhornCichlidRenderer extends ZawaMobRenderer<FlowerhornCichlidEntity, FlowerhornCichlidModel> {
    public FlowerhornCichlidRenderer(EntityRendererProvider.Context context) {
        super(context, new FlowerhornCichlidModel(context.bakeLayer(WOTWModelLayers.FLOWERHORN_CICHILID)), 0.2F);
    }

    @Override
    protected void scale(FlowerhornCichlidEntity entity, PoseStack matrixStack, float partialTickTime) {
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
