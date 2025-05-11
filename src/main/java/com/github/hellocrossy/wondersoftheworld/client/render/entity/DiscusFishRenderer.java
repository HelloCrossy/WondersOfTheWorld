package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.DiscusFishModel;
import com.github.hellocrossy.wondersoftheworld.entity.DiscusFishEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class DiscusFishRenderer extends ZawaMobRenderer<DiscusFishEntity, DiscusFishModel> {
    public DiscusFishRenderer(EntityRendererProvider.Context context) {
        super(context, new DiscusFishModel(), 0.2F);
    }

    @Override
    protected void scale(DiscusFishEntity entity, PoseStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.6F, 0.6F, 0.6F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(DiscusFishEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/discus/discus_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }
}
