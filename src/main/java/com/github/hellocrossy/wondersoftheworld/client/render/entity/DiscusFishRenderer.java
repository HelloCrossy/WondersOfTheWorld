package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.DiscusFishModel;
import com.github.hellocrossy.wondersoftheworld.entity.DiscusFishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class DiscusFishRenderer extends ZawaMobRenderer<DiscusFishEntity, DiscusFishModel> {
    public DiscusFishRenderer(EntityRendererManager manager) {
        super(manager, new DiscusFishModel(), 0.3F);
    }

    @Override
    public void setupAdultTextures(DiscusFishEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/discus_fish/discus_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(DiscusFishEntity entity) {
    }
}

