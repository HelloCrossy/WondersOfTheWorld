package com.github.hellocrossy.wondersoftheworld.client.render.entity;
import com.github.hellocrossy.wondersoftheworld.client.model.KiwiModel;
import com.github.hellocrossy.wondersoftheworld.entity.KiwiEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KiwiRenderer extends ZawaMobRenderer<KiwiEntity, KiwiModel> {
    public KiwiRenderer(EntityRendererManager manager) {
        super (manager, new KiwiModel.Adult(), new KiwiModel.Child(), 0.25F);    }
    @Override
    protected boolean hasBabyVariants(KiwiEntity entity) {
        return false;
    }
    }

