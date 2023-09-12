package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.VultureModel;
import com.github.hellocrossy.wondersoftheworld.entity.VultureEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class VultureRenderer extends ZawaMobRenderer<VultureEntity, VultureModel> {
    public VultureRenderer(EntityRendererManager manager) {
        super (manager, new VultureModel.Adult(), new VultureModel.Flying(), new VultureModel.Child(), 1.0F);
    }
    @Override
    protected void scale(VultureEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
    @Override
    protected boolean hasBabyVariants(VultureEntity entity) {
        return false;
    }
    }

