package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.TuracoModel;
import com.github.hellocrossy.wondersoftheworld.client.model.TuracoModel;
import com.github.hellocrossy.wondersoftheworld.entity.TuracoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TuracoRenderer extends ZawaMobRenderer<TuracoEntity, TuracoModel> {
    private final TuracoModel adultModel;
    private final TuracoModel babyModel;

    public TuracoRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new TuracoModel.Adult(), 1.0F);
        adultModel = model;
        babyModel = new TuracoModel.Child();
    }

    @Override
    public void render(TuracoEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(TuracoEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/turaco/turaco_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(TuracoEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/turaco/turaco_baby.png");
    }
}