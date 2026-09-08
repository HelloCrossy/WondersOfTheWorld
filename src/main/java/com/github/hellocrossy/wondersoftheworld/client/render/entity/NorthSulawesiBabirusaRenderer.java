package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.NorthSulawesiBabirusaModel;
import com.github.hellocrossy.wondersoftheworld.entity.NorthSulawesiBabirusaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class NorthSulawesiBabirusaRenderer extends ZawaMobRenderer<NorthSulawesiBabirusaEntity, NorthSulawesiBabirusaModel> {
    public NorthSulawesiBabirusaRenderer(EntityRendererManager manager) {
        super(manager, new NorthSulawesiBabirusaModel.Adult(), new NorthSulawesiBabirusaModel.Child(), 0.375F);
    }

    @Override
    protected void scale(NorthSulawesiBabirusaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.9F : 1.15F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
