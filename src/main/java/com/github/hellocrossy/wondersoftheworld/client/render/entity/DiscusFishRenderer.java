package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.DiscusFishModel;
import com.github.hellocrossy.wondersoftheworld.entity.DiscusFishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class DiscusFishRenderer extends ZawaMobRenderer<DiscusFishEntity, DiscusFishModel> {
    public DiscusFishRenderer(EntityRendererManager manager) {
        super(manager, new DiscusFishModel(), 0.3F);
    }

    @Override
    protected void scale(DiscusFishEntity entity, MatrixStack matrixStack, float partialTickTime) {
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
