package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.OscarModel;
import com.github.hellocrossy.wondersoftheworld.entity.OscarEntity;
import com.github.hellocrossy.wondersoftheworld.entity.ServalEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class OscarRenderer extends ZawaMobRenderer<OscarEntity, OscarModel> {
    public OscarRenderer(EntityRendererManager manager) {
        super(manager, new OscarModel(), 0.3F);
    }
    @Override
    protected void scale(OscarEntity entity, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.5F, 0.5F, 0.5F);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    public void setupAdultTextures(OscarEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/oscar/oscar_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(OscarEntity entity) {
    }
}

