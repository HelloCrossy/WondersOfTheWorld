package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.OscarModel;
import com.github.hellocrossy.wondersoftheworld.entity.OscarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class OscarRenderer extends ZawaMobRenderer<OscarEntity, OscarModel> {
    public OscarRenderer(EntityRendererManager manager) {
        super(manager, new OscarModel(), 0.3F);
    }
    @Override
    protected void scale(OscarEntity entity, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.5F, 0.5F, 0.5F);
        super.scale(entity, matrixStack, partialTickTime);
    }
}

