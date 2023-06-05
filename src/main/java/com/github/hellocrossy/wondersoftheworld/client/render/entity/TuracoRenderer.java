package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.TuracoModel;
import com.github.hellocrossy.wondersoftheworld.client.model.TuracoModel;
import com.github.hellocrossy.wondersoftheworld.entity.FennecFoxEntity;
import com.github.hellocrossy.wondersoftheworld.entity.TuracoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TuracoRenderer extends ZawaMobRenderer<TuracoEntity, TuracoModel> {
    private final TuracoModel adultModel;
    private final TuracoModel babyModel;
    private final TuracoModel flyingModel;

    public TuracoRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new TuracoModel.Adult(), 0.5F);
        adultModel = model;
        flyingModel = new TuracoModel.Flying();
        babyModel = new TuracoModel.Child();
    }
    @Override
    protected void scale(TuracoEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.8F : 1.2F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    public void render(TuracoEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) model = babyModel;
        else model = entity.isFlying() ? flyingModel : adultModel;
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
