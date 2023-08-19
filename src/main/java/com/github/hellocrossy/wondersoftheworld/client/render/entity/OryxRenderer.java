package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.OryxModel;
import com.github.hellocrossy.wondersoftheworld.entity.OryxEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class OryxRenderer extends ZawaMobRenderer<OryxEntity, OryxModel> {
    private final OryxModel oryxOne;
    private final OryxModel oryxTwo;

    public OryxRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new OryxModel.oryxOne(), new OryxModel.Child(), 0.25F);
        oryxOne = adultModel;
        oryxTwo = new OryxModel.oryxTwo();
    }

    @Override
    public void render(OryxEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (!entity.isBaby()) {
            if (entity.getVariant() >= 3) {
                adultModel = oryxOne;
            } else {
                adultModel = oryxTwo;
            }
        }
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }
}