package com.github.hellocrossy.wondersoftheworld.client.render.entity;

import com.github.hellocrossy.wondersoftheworld.client.model.SlothBearModel;
import com.github.hellocrossy.wondersoftheworld.entity.SlothBearEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SlothBearRenderer extends ZawaMobRenderer<SlothBearEntity, SlothBearModel> {
    public SlothBearRenderer(EntityRendererProvider.Context context) {
        super(context, new SlothBearModel.Adult(), new SlothBearModel.Child(), 0.75F);
    }

    @Override
    protected void scale(SlothBearEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 1.0F : 1.30F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
