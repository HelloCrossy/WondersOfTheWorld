package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.KiwiModel;
import com.github.hellocrossy.wondersoftheworld.entity.KiwiEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KiwiRenderer extends ZawaMobRenderer<KiwiEntity, KiwiModel> {
    private final KiwiModel adultModel;
    private final KiwiModel babyModel;

    public KiwiRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new KiwiModel.Adult(), 1.0F);
        adultModel = model;
        babyModel = new KiwiModel.Child();
    }

    @Override
    public void render(KiwiEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(KiwiEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/kiwi/kiwi_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(KiwiEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/kiwi/kiwi_baby.png");
    }
}
