package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.KillifishModel;
import com.github.hellocrossy.wondersoftheworld.entity.KillifishEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class KillifishRenderer extends ZawaMobRenderer<KillifishEntity, KillifishModel> {
    public KillifishRenderer(EntityRendererManager manager) {
        super(manager, new KillifishModel(), 0.2F);
    }

    @Override
    protected void scale(KillifishEntity entity, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.4F, 0.4F, 0.4F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(KillifishEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/killifish/killifish_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }
}

