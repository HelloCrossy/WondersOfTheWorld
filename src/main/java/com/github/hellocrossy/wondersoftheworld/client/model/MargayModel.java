package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.MargayEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class MargayModel extends ZawaBaseModel<MargayEntity> {
    public ModelRenderer bb_main;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(bb_main);
        }

        return this.parts;
    }

    public static class Adult extends MargayModel {
    
        public ModelRenderer cube_r1;
        public ModelRenderer cube_r2;
        public ModelRenderer cube_r3;
        public ModelRenderer cube_r4;
        public ModelRenderer cube_r5;
        public ModelRenderer cube_r6;
        public ModelRenderer cube_r7;
        public ModelRenderer cube_r8;
        public ModelRenderer cube_r9;
        public ModelRenderer cube_r10;
        public ModelRenderer cube_r11;
        public ModelRenderer cube_r12;
        public ModelRenderer cube_r13;
        public ModelRenderer cube_r14;
        public ModelRenderer cube_r15;
        public ModelRenderer cube_r16;
        public ModelRenderer cube_r17;
        public ModelRenderer cube_r18;
        public ModelRenderer cube_r19;
        public ModelRenderer cube_r20;
        public ModelRenderer cube_r21;
        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            bb_main = new ModelRenderer(this, 0, 0);
            bb_main.setPos(0.0F, 24.0F, 0.0F);
            bb_main.texOffs(27, 0).addBox(0.175F, -1.0F, -5.925F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(12, 37).addBox(-2.0F, -9.1342F, -4.2343F, 4.0F, 5.0F, 7.0F, 0.0F, false);
            bb_main.texOffs(28, 3).addBox(0.425F, -1.0F, 2.65F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(27, 0).addBox(-2.175F, -1.0F, -5.925F, 2.0F, 1.0F, 2.0F, 0.0F, true);
            bb_main.texOffs(28, 3).addBox(-2.425F, -1.0F, 2.65F, 2.0F, 1.0F, 2.0F, 0.0F, true);

            cube_r1 = new ModelRenderer(this, 0, 0);
            cube_r1.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.144F, 0.0F, 0.0F);
            cube_r1.texOffs(27, 17).addBox(-0.75F, -1.2648F, -3.9957F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r1.texOffs(27, 17).addBox(-0.25F, -1.2648F, -3.9957F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r2 = new ModelRenderer(this, 24, 13);
            cube_r2.setPos(-0.025F, -1.6716F, 12.0793F);
            bb_main.addChild(cube_r2);
            setRotateAngle(cube_r2, -0.3709F, 0.0F, 0.0F);
            cube_r2.addBox(-1.0F, -1.1F, -0.9F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r3 = new ModelRenderer(this, 27, 21);
            cube_r3.setPos(0.0F, -5.9194F, 6.2482F);
            bb_main.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.5716F, 0.0F, 0.0F);
            cube_r3.addBox(-0.975F, -0.375F, 2.6F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r4 = new ModelRenderer(this, 9, 11);
            cube_r4.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.0912F, 0.6639F, -0.7619F);
            cube_r4.addBox(0.1063F, -3.3446F, -1.201F, 2.0F, 2.0F, 1.0F, 0.0F, true);

            cube_r5 = new ModelRenderer(this, 0, 0);
            cube_r5.setPos(0.0F, -6.3675F, -4.5331F);
            bb_main.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.0262F, 0.0F, 0.0F);
            cube_r5.texOffs(0, 21).addBox(-2.3F, -1.278F, -1.0891F, 2.0F, 4.0F, 3.0F, 0.0F, true);
            cube_r5.texOffs(0, 21).addBox(0.3F, -1.278F, -1.0891F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r6 = new ModelRenderer(this, 0, 0);
            cube_r6.setPos(0.0F, -5.2457F, 3.532F);
            bb_main.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.048F, 0.0F, 0.0F);
            cube_r6.texOffs(21, 6).addBox(-2.5F, -2.0976F, -1.5382F, 2.0F, 4.0F, 3.0F, 0.0F, true);
            cube_r6.texOffs(21, 6).addBox(0.5F, -2.0976F, -1.5382F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r7 = new ModelRenderer(this, 0, 0);
            cube_r7.setPos(0.0F, -5.2457F, 3.532F);
            bb_main.addChild(cube_r7);
            setRotateAngle(cube_r7, 0.7505F, 0.0F, 0.0F);
            cube_r7.texOffs(10, 24).addBox(-2.425F, 0.7674F, -1.9208F, 2.0F, 2.0F, 2.0F, 0.0F, true);
            cube_r7.texOffs(10, 24).addBox(0.425F, 0.7674F, -1.9208F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r8 = new ModelRenderer(this, 0, 0);
            cube_r8.setPos(0.0F, -5.2457F, 3.532F);
            bb_main.addChild(cube_r8);
            setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
            cube_r8.texOffs(19, 23).addBox(-2.35F, 1.7838F, 0.033F, 2.0F, 3.0F, 2.0F, 0.0F, true);
            cube_r8.texOffs(19, 23).addBox(0.35F, 1.7838F, 0.033F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r9 = new ModelRenderer(this, 0, 0);
            cube_r9.setPos(0.0F, -6.3675F, -4.5331F);
            bb_main.addChild(cube_r9);
            setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
            cube_r9.texOffs(21, 18).addBox(-2.25F, 2.5857F, -0.4038F, 2.0F, 3.0F, 2.0F, 0.0F, true);
            cube_r9.texOffs(21, 18).addBox(0.25F, 2.5857F, -0.4038F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r10 = new ModelRenderer(this, 0, 28);
            cube_r10.setPos(0.0F, -2.8136F, 9.7161F);
            bb_main.addChild(cube_r10);
            setRotateAngle(cube_r10, -0.4843F, 0.0F, 0.0F);
            cube_r10.addBox(-1.0F, -1.088F, -0.1399F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r11 = new ModelRenderer(this, 24, 13);
            cube_r11.setPos(0.0F, -5.9886F, 6.3411F);
            bb_main.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
            cube_r11.addBox(-1.025F, -0.805F, 0.8601F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r12 = new ModelRenderer(this, 27, 21);
            cube_r12.setPos(0.0F, -5.9194F, 6.2482F);
            bb_main.addChild(cube_r12);
            setRotateAngle(cube_r12, -0.8901F, 0.0F, 0.0F);
            cube_r12.addBox(-0.975F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r13 = new ModelRenderer(this, 25, 26);
            cube_r13.setPos(0.0F, -5.9886F, 6.3411F);
            bb_main.addChild(cube_r13);
            setRotateAngle(cube_r13, -1.0341F, 0.0F, 0.0F);
            cube_r13.addBox(-1.0F, -0.7311F, -2.8509F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r14 = new ModelRenderer(this, 9, 11);
            cube_r14.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r14);
            setRotateAngle(cube_r14, -0.0912F, -0.6639F, 0.7619F);
            cube_r14.addBox(-2.1063F, -3.3446F, -1.201F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r15 = new ModelRenderer(this, 22, 0);
            cube_r15.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.8683F, 0.0F, 0.0F);
            cube_r15.addBox(-0.5F, 0.4496F, -1.8614F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r16 = new ModelRenderer(this, 14, 0);
            cube_r16.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r16);
            setRotateAngle(cube_r16, -0.7418F, 0.0F, 0.0F);
            cube_r16.addBox(-1.0F, -1.3299F, -1.8678F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r17 = new ModelRenderer(this, 34, 41);
            cube_r17.setPos(0.0F, -6.5856F, 3.9808F);
            bb_main.addChild(cube_r17);
            setRotateAngle(cube_r17, -0.1047F, 0.0F, 0.0F);
            cube_r17.addBox(-1.5F, -2.375F, -1.725F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            cube_r18 = new ModelRenderer(this, 0, 3);
            cube_r18.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r18);
            setRotateAngle(cube_r18, 0.5454F, 0.0F, 0.0F);
            cube_r18.addBox(-0.5F, -2.9337F, -3.3309F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r19 = new ModelRenderer(this, 0, 0);
            cube_r19.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r19);
            setRotateAngle(cube_r19, 0.2574F, 0.0F, 0.0F);
            cube_r19.addBox(-0.5F, -1.2152F, -3.7097F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r20 = new ModelRenderer(this, 9, 18);
            cube_r20.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r20);
            setRotateAngle(cube_r20, 0.0262F, 0.0F, 0.0F);
            cube_r20.addBox(-1.5F, -2.5539F, -3.2042F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            cube_r21 = new ModelRenderer(this, 0, 42);
            cube_r21.setPos(-0.05F, 5.95F, 0.775F);
            bb_main.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.2225F, 0.0F, 0.0F);
            cube_r21.addBox(-1.45F, -13.775F, -9.475F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            this.saveBase();

        }

        @Override
        public void setupAnim(MargayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                float speed = 1.0f;
                float degree = 1.0f;


            } else {
            }
        }
    }

    public static class Child extends MargayModel {
        public ModelRenderer cube_r1;
        public ModelRenderer cube_r2;
        public ModelRenderer cube_r3;
        public ModelRenderer cube_r4;
        public ModelRenderer cube_r5;
        public ModelRenderer cube_r6;
        public ModelRenderer cube_r7;
        public ModelRenderer cube_r8;
        public ModelRenderer cube_r9;
        public ModelRenderer cube_r10;
        public ModelRenderer cube_r11;
        public ModelRenderer cube_r12;
        public ModelRenderer cube_r13;
        public ModelRenderer cube_r14;
        public ModelRenderer cube_r15;
        public ModelRenderer cube_r16;
        public ModelRenderer cube_r17;
        public ModelRenderer cube_r18;
        public ModelRenderer cube_r19;
        public ModelRenderer cube_r20;
        public ModelRenderer cube_r21;
        public Child() {
            this.texWidth = 64;
            this.texHeight = 64;
            bb_main = new ModelRenderer(this, 0, 0);
            bb_main.setPos(0.0F, 24.0F, 0.0F);
            bb_main.texOffs(27, 0).addBox(0.175F, -1.0F, -5.925F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(12, 37).addBox(-2.0F, -9.1342F, -4.2343F, 4.0F, 5.0F, 7.0F, 0.0F, false);
            bb_main.texOffs(28, 3).addBox(0.425F, -1.0F, 2.65F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            bb_main.texOffs(27, 0).addBox(-2.175F, -1.0F, -5.925F, 2.0F, 1.0F, 2.0F, 0.0F, true);
            bb_main.texOffs(28, 3).addBox(-2.425F, -1.0F, 2.65F, 2.0F, 1.0F, 2.0F, 0.0F, true);

            cube_r1 = new ModelRenderer(this, 0, 0);
            cube_r1.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.144F, 0.0F, 0.0F);
            cube_r1.texOffs(27, 17).addBox(-0.75F, -1.2648F, -3.9957F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            cube_r1.texOffs(27, 17).addBox(-0.25F, -1.2648F, -3.9957F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r2 = new ModelRenderer(this, 24, 13);
            cube_r2.setPos(-0.025F, -1.6716F, 12.0793F);
            bb_main.addChild(cube_r2);
            setRotateAngle(cube_r2, -0.3709F, 0.0F, 0.0F);
            cube_r2.addBox(-1.0F, -1.1F, -0.9F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r3 = new ModelRenderer(this, 27, 21);
            cube_r3.setPos(0.0F, -5.9194F, 6.2482F);
            bb_main.addChild(cube_r3);
            setRotateAngle(cube_r3, -0.5716F, 0.0F, 0.0F);
            cube_r3.addBox(-0.975F, -0.375F, 2.6F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r4 = new ModelRenderer(this, 9, 11);
            cube_r4.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r4);
            setRotateAngle(cube_r4, -0.0912F, 0.6639F, -0.7619F);
            cube_r4.addBox(0.1063F, -3.3446F, -1.201F, 2.0F, 2.0F, 1.0F, 0.0F, true);

            cube_r5 = new ModelRenderer(this, 0, 0);
            cube_r5.setPos(0.0F, -6.3675F, -4.5331F);
            bb_main.addChild(cube_r5);
            setRotateAngle(cube_r5, -0.0262F, 0.0F, 0.0F);
            cube_r5.texOffs(0, 21).addBox(-2.3F, -1.278F, -1.0891F, 2.0F, 4.0F, 3.0F, 0.0F, true);
            cube_r5.texOffs(0, 21).addBox(0.3F, -1.278F, -1.0891F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r6 = new ModelRenderer(this, 0, 0);
            cube_r6.setPos(0.0F, -5.2457F, 3.532F);
            bb_main.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.048F, 0.0F, 0.0F);
            cube_r6.texOffs(21, 6).addBox(-2.5F, -2.0976F, -1.5382F, 2.0F, 4.0F, 3.0F, 0.0F, true);
            cube_r6.texOffs(21, 6).addBox(0.5F, -2.0976F, -1.5382F, 2.0F, 4.0F, 3.0F, 0.0F, false);

            cube_r7 = new ModelRenderer(this, 0, 0);
            cube_r7.setPos(0.0F, -5.2457F, 3.532F);
            bb_main.addChild(cube_r7);
            setRotateAngle(cube_r7, 0.7505F, 0.0F, 0.0F);
            cube_r7.texOffs(10, 24).addBox(-2.425F, 0.7674F, -1.9208F, 2.0F, 2.0F, 2.0F, 0.0F, true);
            cube_r7.texOffs(10, 24).addBox(0.425F, 0.7674F, -1.9208F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r8 = new ModelRenderer(this, 0, 0);
            cube_r8.setPos(0.0F, -5.2457F, 3.532F);
            bb_main.addChild(cube_r8);
            setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
            cube_r8.texOffs(19, 23).addBox(-2.35F, 1.7838F, 0.033F, 2.0F, 3.0F, 2.0F, 0.0F, true);
            cube_r8.texOffs(19, 23).addBox(0.35F, 1.7838F, 0.033F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r9 = new ModelRenderer(this, 0, 0);
            cube_r9.setPos(0.0F, -6.3675F, -4.5331F);
            bb_main.addChild(cube_r9);
            setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
            cube_r9.texOffs(21, 18).addBox(-2.25F, 2.5857F, -0.4038F, 2.0F, 3.0F, 2.0F, 0.0F, true);
            cube_r9.texOffs(21, 18).addBox(0.25F, 2.5857F, -0.4038F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r10 = new ModelRenderer(this, 0, 28);
            cube_r10.setPos(0.0F, -2.8136F, 9.7161F);
            bb_main.addChild(cube_r10);
            setRotateAngle(cube_r10, -0.4843F, 0.0F, 0.0F);
            cube_r10.addBox(-1.0F, -1.088F, -0.1399F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r11 = new ModelRenderer(this, 24, 13);
            cube_r11.setPos(0.0F, -5.9886F, 6.3411F);
            bb_main.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
            cube_r11.addBox(-1.025F, -0.805F, 0.8601F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r12 = new ModelRenderer(this, 27, 21);
            cube_r12.setPos(0.0F, -5.9194F, 6.2482F);
            bb_main.addChild(cube_r12);
            setRotateAngle(cube_r12, -0.8901F, 0.0F, 0.0F);
            cube_r12.addBox(-0.975F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r13 = new ModelRenderer(this, 25, 26);
            cube_r13.setPos(0.0F, -5.9886F, 6.3411F);
            bb_main.addChild(cube_r13);
            setRotateAngle(cube_r13, -1.0341F, 0.0F, 0.0F);
            cube_r13.addBox(-1.0F, -0.7311F, -2.8509F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r14 = new ModelRenderer(this, 9, 11);
            cube_r14.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r14);
            setRotateAngle(cube_r14, -0.0912F, -0.6639F, 0.7619F);
            cube_r14.addBox(-2.1063F, -3.3446F, -1.201F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r15 = new ModelRenderer(this, 22, 0);
            cube_r15.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.8683F, 0.0F, 0.0F);
            cube_r15.addBox(-0.5F, 0.4496F, -1.8614F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r16 = new ModelRenderer(this, 14, 0);
            cube_r16.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r16);
            setRotateAngle(cube_r16, -0.7418F, 0.0F, 0.0F);
            cube_r16.addBox(-1.0F, -1.3299F, -1.8678F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r17 = new ModelRenderer(this, 34, 41);
            cube_r17.setPos(0.0F, -6.5856F, 3.9808F);
            bb_main.addChild(cube_r17);
            setRotateAngle(cube_r17, -0.1047F, 0.0F, 0.0F);
            cube_r17.addBox(-1.5F, -2.375F, -1.725F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            cube_r18 = new ModelRenderer(this, 0, 3);
            cube_r18.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r18);
            setRotateAngle(cube_r18, 0.5454F, 0.0F, 0.0F);
            cube_r18.addBox(-0.5F, -2.9337F, -3.3309F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r19 = new ModelRenderer(this, 0, 0);
            cube_r19.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r19);
            setRotateAngle(cube_r19, 0.2574F, 0.0F, 0.0F);
            cube_r19.addBox(-0.5F, -1.2152F, -3.7097F, 1.0F, 1.0F, 2.0F, 0.0F, false);

            cube_r20 = new ModelRenderer(this, 9, 18);
            cube_r20.setPos(0.0F, -8.0757F, -5.7422F);
            bb_main.addChild(cube_r20);
            setRotateAngle(cube_r20, 0.0262F, 0.0F, 0.0F);
            cube_r20.addBox(-1.5F, -2.5539F, -3.2042F, 3.0F, 3.0F, 3.0F, 0.0F, false);

            cube_r21 = new ModelRenderer(this, 0, 42);
            cube_r21.setPos(-0.05F, 5.95F, 0.775F);
            bb_main.addChild(cube_r21);
            setRotateAngle(cube_r21, -0.2225F, 0.0F, 0.0F);
            cube_r21.addBox(-1.45F, -13.775F, -9.475F, 3.0F, 4.0F, 3.0F, 0.0F, false);
            this.saveBase();

        }

        @Override
        public void setupAnim(MargayEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            } else {
            }
        }
    }
}
