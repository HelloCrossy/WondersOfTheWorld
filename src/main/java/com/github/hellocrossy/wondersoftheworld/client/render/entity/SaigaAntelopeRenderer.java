package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.SaigaAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SaigaAntelopeRenderer extends ZawaMobRenderer<SaigaAntelopeEntity, SaigaAntelopeModel> {
    public SaigaAntelopeRenderer(EntityRendererManager manager) {
        super(manager, new SaigaAntelopeModel.Adult(), new SaigaAntelopeModel.Child(), 0.75F);
    }

    @Override
    protected boolean hasBabyVariants(SaigaAntelopeEntity entity) {
        return false;
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}

