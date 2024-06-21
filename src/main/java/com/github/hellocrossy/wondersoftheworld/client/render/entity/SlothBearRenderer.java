package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SlothBearModel;
import com.github.hellocrossy.wondersoftheworld.entity.SlothBearEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SlothBearRenderer extends ZawaMobRenderer<SlothBearEntity, SlothBearModel> {
    public SlothBearRenderer(EntityRendererManager manager) {
        super(manager, new SlothBearModel.Adult(), new SlothBearModel.Child(), 0.75F);
    }

    @Override
    protected void scale(SlothBearEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 1.30F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
