package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.LowlandNyalaModel;
import com.github.hellocrossy.wondersoftheworld.client.model.OryxModel;
import com.github.hellocrossy.wondersoftheworld.client.model.TakinModel;
import com.github.hellocrossy.wondersoftheworld.entity.*;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class LowlandNyalaRenderer extends ZawaMobRenderer<LowlandNyalaEntity, LowlandNyalaModel> {
    private final LowlandNyalaModel Male;
    private final LowlandNyalaModel Female;
    private final LowlandNyalaModel Child;

    public LowlandNyalaRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new LowlandNyalaModel.Male(), 0.5F);
        Male = model;
        Female = new LowlandNyalaModel.Female();
        Child = new LowlandNyalaModel.Child();
    }
    @Override
    protected void scale(LowlandNyalaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.1F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    public void render(LowlandNyalaEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) {
            model = Child;

        } else {
            model = entity.getGender() == ZawaBaseEntity.Gender.FEMALE ? Female : Male; //this says to set model to female if gender is female, else set it to female...

        }

        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }


    @Override
    public void setupAdultTextures(LowlandNyalaEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount * 2];
        for (int i = 0; i < variantCount; i++) {
            adultTextures[i * 2] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/nyala/nyala_" + (i + 1) + "_female.png");
            adultTextures[i * 2 + 1] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/nyala/nyala_" + (i + 1) + "_male.png");
        }
    }

    @Override
    public void setupBabyTextures(LowlandNyalaEntity entity) {
        babyTexture = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/nyala/nyala_baby.png");
    }
    @Override
    public ResourceLocation getTextureLocation(LowlandNyalaEntity entity) {
        if (!entity.isBaby()) {
            int variantCount = entity.getTotalVariants();
            int variant = entity.getVariant();
            if (variant >= variantCount) {
                return UNKNOWN_VARIANT;
            } else {
                if (this.getAdultTextures() == null || this.getAdultTextures().length != variantCount * 1) {
                    this.setupAdultTextures(entity);
                }

                return this.getAdultTextures()[variant * 1 + entity.getGender().ordinal()];
            }
        } else {
            return super.getTextureLocation(entity);
        }
    }
}