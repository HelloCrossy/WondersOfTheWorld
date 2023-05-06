package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.OryxModel;
import com.github.hellocrossy.wondersoftheworld.entity.OryxEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class OryxRenderer extends ZawaMobRenderer<OryxEntity, OryxModel> {
    private final OryxModel oryxOne;
    private final OryxModel oryxTwo;
    private final OryxModel babyModel;

    public OryxRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new OryxModel.oryxOne(), 0.5F);
        oryxOne = model;
        oryxTwo = new OryxModel.oryxTwo();
        babyModel = new OryxModel.Child();
    }

    @Override
    public void render(OryxEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) { // Still need to set the baby model
            model = babyModel;

        } else {

            if (entity.getVariant() > 0 && entity.getVariant() < 3) {
                model = oryxOne;

            } else {
                model = oryxTwo;
            }
        }

        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }


    @Override
    public void setupAdultTextures(OryxEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/oryx/oryx_" + (i + 1) + ".png");
        }



    @Override
    public void setupBabyTextures(OryxEntity entity) {
        babyTexture = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/oryx/oryx_baby.png");
    }
}