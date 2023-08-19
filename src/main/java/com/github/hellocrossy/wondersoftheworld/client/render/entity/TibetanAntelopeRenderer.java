package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.TibetanAntelopeModel;
import com.github.hellocrossy.wondersoftheworld.entity.TibetanAntelopeEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TibetanAntelopeRenderer extends ZawaMobRenderer<TibetanAntelopeEntity, TibetanAntelopeModel> {
    public TibetanAntelopeRenderer(EntityRendererManager manager) {
        super (manager, new TibetanAntelopeModel.Adult(), new TibetanAntelopeModel.Child(), 0.75F);    }
    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
