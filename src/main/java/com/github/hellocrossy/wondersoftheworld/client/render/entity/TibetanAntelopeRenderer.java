package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.TibetanAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.entity.TibetanAntelopeEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TibetanAntelopeRenderer extends ZawaMobRenderer<TibetanAntelopeEntity, TibetanAntelopeModel> {
    private final TibetanAntelopeModel adultModel;
    private final TibetanAntelopeModel babyModel;

    public TibetanAntelopeRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new TibetanAntelopeModel.Adult(), 0.75F);
        adultModel = model;
        babyModel = new TibetanAntelopeModel.Child();
    }
    @Override

    public void render(TibetanAntelopeEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(TibetanAntelopeEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount * 2];
        for (int i = 0; i < variantCount; i++) {
            adultTextures[i * 2] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/tibetan_antelope/tibetan_antelope_" + (i + 1) + "_female.png");
            adultTextures[i * 2 + 1] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/tibetan_antelope/tibetan_antelope_" + (i + 1) + "_male.png");
        }
    }

    @Override
    public void setupBabyTextures(TibetanAntelopeEntity entity) {
        babyTexture = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/tibetan_antelope/tibetan_baby.png");
    }
    @Override
    public ResourceLocation getTextureLocation(TibetanAntelopeEntity entity) {
        if (!entity.isBaby()) {
            int variantCount = entity.getTotalVariants();
            int variant = entity.getVariant();
            if (variant >= variantCount) {
                return UNKNOWN_VARIANT;
            } else {
                if (this.getAdultTextures() == null || this.getAdultTextures().length != variantCount * 2) {
                    this.setupAdultTextures(entity);
                }

                return this.getAdultTextures()[variant * 2 + entity.getGender().ordinal()];
            }
        } else {
            return super.getTextureLocation(entity);
        }
    }
}
