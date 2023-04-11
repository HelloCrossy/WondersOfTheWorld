package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.SaigaAntelopeEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class SaigaAntelopeModel extends ZawaBaseModel<SaigaAntelopeEntity> {
    protected ZawaModelRenderer MAIN;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(MAIN);

        }

        return this.parts;
    }

    public static class Adult extends SaigaAntelopeModel {

        protected ZawaModelRenderer SAIGA;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer HIPS;
        protected ZawaModelRenderer Tail_r1;
        protected ZawaModelRenderer ThighLeft;
        protected ZawaModelRenderer UpperLegLeft;
        protected ZawaModelRenderer LowerLegLeft;
        protected ZawaModelRenderer FootLeft;
        protected ZawaModelRenderer ThighRight;
        protected ZawaModelRenderer UpperLegLeft;
        protected ZawaModelRenderer LowerLegLeft;
        protected ZawaModelRenderer FootRight;
        protected ZawaModelRenderer RIGHTFRONT;
        protected ZawaModelRenderer HandLeft_r1;
        protected ZawaModelRenderer ArmLeft_r1;
        protected ZawaModelRenderer UpperArmLeft_r1;
        protected ZawaModelRenderer LEFTFRONT;
        protected ZawaModelRenderer HandRight_r1;
        protected ZawaModelRenderer ArmRight_r1;
        protected ZawaModelRenderer UpperArmRight_r1;
        protected ZawaModelRenderer HEAD;
        protected ZawaModelRenderer NeckLower_r1;
        protected ZawaModelRenderer EarLeft_r1;
        protected ZawaModelRenderer EarRight_r1;
        protected ZawaModelRenderer shape58_r1;
        protected ZawaModelRenderer shape59_r1;
        protected ZawaModelRenderer shape57_r1;
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer Horn1Right;
        protected ZawaModelRenderer Horn3Right_r1;
        protected ZawaModelRenderer Horn2Right_r1;
        protected ZawaModelRenderer Horn1Left;
        protected ZawaModelRenderer Horn3Left_r1;
        protected ZawaModelRenderer Horn2Left_r1;
    }
