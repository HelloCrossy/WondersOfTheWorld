package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.MouseDeerModel;
import com.github.hellocrossy.wondersoftheworld.entity.MouseDeerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.world.entity.animal.Macaw;

public class MouseDeerRenderer extends ZawaMobRenderer<MouseDeerEntity, MouseDeerModel> {
    public MouseDeerRenderer(EntityRendererManager manager) {
        super(manager, new MouseDeerModel.Adult(), new MouseDeerModel.Child(), 0.25F);

    }

    @Override
    protected void scale(MouseDeerEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby() || entity.getVariant() > 0) {
            matrixStack.scale(0.9F, 0.9F, 0.9F);
        }
            super.scale(entity, matrixStack, partialTickTime);
        }
    }