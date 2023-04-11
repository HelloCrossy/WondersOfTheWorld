package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.EmuModel;
import com.github.hellocrossy.wondersoftheworld.entity.EmuEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TakaheEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class EmuRenderer extends ZawaMobRenderer<EmuEntity, EmuModel> {
    private final EmuModel adultModel;
    private final EmuModel babyModel;

    public EmuRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new EmuModel.Adult(), 1.0F);
        adultModel = model;
        babyModel = new EmuModel.Child();
    }

    @Override
    public void render(EmuEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(EmuEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/emu/emu_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(EmuEntity entity) {
        babyTexture = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/emu/emu_baby.png");
    }
}
