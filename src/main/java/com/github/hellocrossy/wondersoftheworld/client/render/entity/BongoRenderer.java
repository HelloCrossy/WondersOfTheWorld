package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.BongoModel;
import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BongoRenderer extends ZawaMobRenderer<BongoEntity, BongoModel> {
    private final BongoModel adultModel;
    private final BongoModel babyModel;

    public BongoRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new BongoModel.Adult(), 1.0F);
        adultModel = model;
        babyModel = new BongoModel.Child();
    }
    @Override

    public void render(BongoEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(BongoEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/bongo/bongo_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(BongoEntity entity) {
        babyTexture = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/bongo/bongo_baby.png");
    }
}

