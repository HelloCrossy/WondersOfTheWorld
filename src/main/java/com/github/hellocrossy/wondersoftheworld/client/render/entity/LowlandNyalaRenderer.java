package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.LowlandNyalaModel;
import com.github.hellocrossy.wondersoftheworld.entity.*;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class LowlandNyalaRenderer extends ZawaMobRenderer<LowlandNyalaEntity, LowlandNyalaModel> {
    private final LowlandNyalaModel adultModel1;
    private final LowlandNyalaModel adultModel2;

    public LowlandNyalaRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new LowlandNyalaModel.Male(), new LowlandNyalaModel.Child(), 0.25F);
        adultModel1 = adultModel;
        adultModel2 = new LowlandNyalaModel.Female();
    }
    @Override
    public void render(LowlandNyalaEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (!entity.isBaby()) {
            if (entity.getVariant() >= 6) {
                adultModel = adultModel1;
            } else {
                adultModel = adultModel2;
            }
        }
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }
}

