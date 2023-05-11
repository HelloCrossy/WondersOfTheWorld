package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.client.model.TuracoModel;
import com.github.hellocrossy.wondersoftheworld.client.model.VultureModel;
import com.github.hellocrossy.wondersoftheworld.entity.TuracoEntity;
import com.github.hellocrossy.wondersoftheworld.entity.VultureEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class VultureRenderer extends ZawaMobRenderer<VultureEntity, VultureModel> {
    private final VultureModel adultModel;
    private final VultureModel babyModel;

    public VultureRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new VultureModel.Adult(), 1.0F);
        adultModel = model;
        babyModel = new VultureModel.Child();
    }

    @Override
    public void render(VultureEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public void setupAdultTextures(VultureEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/vulture/vulture_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(VultureEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(WondersOfTheWorld.MOD_ID, "textures/entity/vulture/vulture_baby.png");
    }
}
