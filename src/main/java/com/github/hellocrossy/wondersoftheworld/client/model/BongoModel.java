package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.BongoEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class BongoModel extends ZawaBaseModel<BongoEntity> {
    protected ZawaModelRenderer CHEST;
    protected Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(CHEST);
        }

        return this.parts;
    }

    public static class Adult extends BongoModel {
        
        protected ZawaModelRenderer Chest_r1;
        protected ZawaModelRenderer BODY;
        protected ZawaModelRenderer Body_r1;
        protected ZawaModelRenderer HIPS;
        protected ZawaModelRenderer Hips_r1;
        protected ZawaModelRenderer TAIL;
        protected ZawaModelRenderer Tail1_r1;
        protected ZawaModelRenderer bone;
        protected ZawaModelRenderer Tail2_r1;
        protected ZawaModelRenderer bone2;
        protected ZawaModelRenderer Tail4_r1;
        protected ZawaModelRenderer Tail3_r1;
        protected ZawaModelRenderer THIGH;
        protected ZawaModelRenderer Thigh_r1;
        protected ZawaModelRenderer UPPERLEG;
        protected ZawaModelRenderer UpperLeg_r1;
        protected ZawaModelRenderer LOWERLEG;
        protected ZawaModelRenderer LowerLeg_r1;
        protected ZawaModelRenderer FOOT;
        protected ZawaModelRenderer Foot_r1;
        protected ZawaModelRenderer THIGH2;
        protected ZawaModelRenderer Thigh_r2;
        protected ZawaModelRenderer UPPERLEG2;
        protected ZawaModelRenderer UpperLeg_r2;
        protected ZawaModelRenderer LOWERLEG2;
        protected ZawaModelRenderer FOOT2;
        protected ZawaModelRenderer NECK;
        protected ZawaModelRenderer NeckBase_r1;
        protected ZawaModelRenderer Neck_r1;
        protected ZawaModelRenderer HEAD;
        protected ZawaModelRenderer RightHorn3_r1;
        protected ZawaModelRenderer LeftHorn3_r1;
        protected ZawaModelRenderer Mouth_r1;
        protected ZawaModelRenderer Ear1_r1;
        protected ZawaModelRenderer RightHorn1_r1;
        protected ZawaModelRenderer RightHorn2_r1;
        protected ZawaModelRenderer LeftHorn2_r1;
        protected ZawaModelRenderer Ear2_r1;
        protected ZawaModelRenderer Snout_r1;
        protected ZawaModelRenderer UpperSnout_r1;
        protected ZawaModelRenderer LeftHorn1_r1;
        protected ZawaModelRenderer Head_r1;
        protected ZawaModelRenderer ARMBASE;
        protected ZawaModelRenderer ArmBase_r1;
        protected ZawaModelRenderer ARM;
        protected ZawaModelRenderer Arm_r1;
        protected ZawaModelRenderer FOREARM;
        protected ZawaModelRenderer Forearm_r1;
        protected ZawaModelRenderer HAND;
        protected ZawaModelRenderer Hand_r1;
        protected ZawaModelRenderer ARMBASE2;
        protected ZawaModelRenderer ArmBase_r2;
        protected ZawaModelRenderer ARM2;
        protected ZawaModelRenderer Arm_r2;
        protected ZawaModelRenderer FOREARM2;
        protected ZawaModelRenderer Forearm_r2;
        protected ZawaModelRenderer HAND2;
        protected ZawaModelRenderer Hand_r2;

        public Adult() {
            texWidth = 128;
            texHeight = 128;

            CHEST = new ZawaModelRenderer(this, 0, 0);
            CHEST.setPos(0.0F, 6.9992F, -7.4782F);


            Chest_r1 = new ZawaModelRenderer(this, 89, 89);
            Chest_r1.setPos(0.0F, 0.0F, 0.0F);
            CHEST.addChild(Chest_r1);
            setRotateAngle(Chest_r1, 0.096F, 0.0F, 0.0F);
            Chest_r1.addBox(-3.0F, -5.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            BODY = new ZawaModelRenderer(this, 0, 0);
            BODY.setPos(0.0836F, -5.2179F, 2.0307F);
            CHEST.addChild(BODY);


            Body_r1 = new ZawaModelRenderer(this, 82, 105);
            Body_r1.setPos(0.0F, 0.95F, 0.5F);
            BODY.addChild(Body_r1);
            setRotateAngle(Body_r1, 0.0F, 0.0075F, -0.0045F);
            Body_r1.addBox(-3.5554F, -1.5001F, -0.5002F, 7.0F, 11.0F, 12.0F, 0.0F, false);

            HIPS = new ZawaModelRenderer(this, 0, 0);
            HIPS.setPos(-0.0836F, -0.4413F, 11.9186F);
            BODY.addChild(HIPS);


            Hips_r1 = new ZawaModelRenderer(this, 58, 112);
            Hips_r1.setPos(0.0F, 0.0F, 0.0F);
            HIPS.addChild(Hips_r1);
            setRotateAngle(Hips_r1, -0.2225F, 0.0F, 0.0F);
            Hips_r1.addBox(-3.0F, -0.0135F, 0.0913F, 6.0F, 10.0F, 6.0F, 0.0F, false);

            TAIL = new ZawaModelRenderer(this, 0, 0);
            TAIL.setPos(0.0F, 2.2418F, 5.6707F);
            HIPS.addChild(TAIL);


            Tail1_r1 = new ZawaModelRenderer(this, 13, 99);
            Tail1_r1.setPos(0.0F, 0.0F, 0.0F);
            TAIL.addChild(Tail1_r1);
            setRotateAngle(Tail1_r1, -1.4923F, 0.0F, 0.0F);
            Tail1_r1.texOffs(13, 99).addBox(-1.0F, -0.4134F, -0.7067F, 2.0F, 2.0F, 5.0F, 0.0F, false);

            bone = new ZawaModelRenderer(this, 0, 0);
            bone.setPos(0.0F, 4.1474F, -0.1861F);
            TAIL.addChild(bone);


            Tail2_r1 = new ZawaModelRenderer(this, 16, 106);
            Tail2_r1.setPos(0.0F, 0.6F, 0.4F);
            bone.addChild(Tail2_r1);
            setRotateAngle(Tail2_r1, -1.6842F, 0.0F, 0.0F);
            Tail2_r1.addBox(-1.0F, -0.4639F, -0.5927F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            bone2 = new ZawaModelRenderer(this, 0, 0);
            bone2.setPos(0.0F, 2.0477F, -0.1977F);
            bone.addChild(bone2);


            Tail4_r1 = new ZawaModelRenderer(this, 15, 118);
            Tail4_r1.setPos(0.0F, 3.0F, 0.0F);
            bone2.addChild(Tail4_r1);
            setRotateAngle(Tail4_r1, -1.6624F, 0.0F, 0.0F);
            Tail4_r1.texOffs(15, 118).addBox(-1.0F, -0.5184F, -0.7255F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            Tail3_r1 = new ZawaModelRenderer(this, 12, 110);
            Tail3_r1.setPos(0.0F, 0.0F, 0.0F);
            bone2.addChild(Tail3_r1);
            setRotateAngle(Tail3_r1, -1.6624F, 0.0F, 0.0F);
            Tail3_r1.addBox(-1.5F, -1.4179F, -0.538F, 3.0F, 3.0F, 5.0F, 0.0F, false);

            THIGH = new ZawaModelRenderer(this, 0, 0);
            THIGH.setPos(3.0F, 4.2268F, 1.698F);
            HIPS.addChild(THIGH);


            Thigh_r1 = new ZawaModelRenderer(this, 57, 76);
            Thigh_r1.setPos(0.0F, 1.0F, 0.0F);
            THIGH.addChild(Thigh_r1);
            setRotateAngle(Thigh_r1, -0.0872F, 0.0F, 0.0F);
            Thigh_r1.addBox(-2.5913F, -1.0128F, -2.7385F, 4.0F, 8.0F, 5.0F, 0.0F, false);

            UPPERLEG = new ZawaModelRenderer(this, 0, 0);
            UPPERLEG.setPos(0.0F, 7.8F, -2.1F);
            THIGH.addChild(UPPERLEG);


            UpperLeg_r1 = new ZawaModelRenderer(this, 60, 89);
            UpperLeg_r1.setPos(0.0F, 0.2F, 1.1F);
            UPPERLEG.addChild(UpperLeg_r1);
            setRotateAngle(UpperLeg_r1, 0.4014F, 0.0F, 0.0F);
            UpperLeg_r1.addBox(-2.025F, -1.3173F, -1.068F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            LOWERLEG = new ZawaModelRenderer(this, 0, 0);
            LOWERLEG.setPos(0.0F, 2.8F, 4.2F);
            UPPERLEG.addChild(LOWERLEG);


            LowerLeg_r1 = new ZawaModelRenderer(this, 62, 97);
            LowerLeg_r1.setPos(0.0F, 1.4F, -1.1F);
            LOWERLEG.addChild(LowerLeg_r1);
            setRotateAngle(LowerLeg_r1, 0.0F, 0.0F, 0.0F);
            LowerLeg_r1.addBox(-1.5F, -1.5423F, -0.8825F, 2.0F, 7.0F, 2.0F, 0.0F, false);

            FOOT = new ZawaModelRenderer(this, 0, 0);
            FOOT.setPos(0.0F, 6.4F, -1.1F);
            LOWERLEG.addChild(FOOT);


            Foot_r1 = new ZawaModelRenderer(this, 62, 106);
            Foot_r1.setPos(0.0F, 0.0F, 0.0F);
            FOOT.addChild(Foot_r1);
            setRotateAngle(Foot_r1, 0.0F, 0.0F, 0.0F);
            Foot_r1.addBox(-1.425F, -0.5668F, -1.5941F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            THIGH2 = new ZawaModelRenderer(this, 0, 0);
            THIGH2.setPos(-3.0F, 4.2268F, 1.698F);
            HIPS.addChild(THIGH2);


            Thigh_r2 = new ZawaModelRenderer(this, 57, 76);
            Thigh_r2.setPos(0.0F, 1.0F, 0.0F);
            THIGH2.addChild(Thigh_r2);
            setRotateAngle(Thigh_r2, -0.0872F, 0.0F, 0.0F);
            Thigh_r2.addBox(-1.4087F, -1.0128F, -2.7385F, 4.0F, 8.0F, 5.0F, 0.0F, true);

            UPPERLEG2 = new ZawaModelRenderer(this, 0, 0);
            UPPERLEG2.setPos(0.0F, 7.8F, -2.1F);
            THIGH2.addChild(UPPERLEG2);


            UpperLeg_r2 = new ZawaModelRenderer(this, 60, 89);
            UpperLeg_r2.setPos(0.0F, 0.2F, 1.1F);
            UPPERLEG2.addChild(UpperLeg_r2);
            setRotateAngle(UpperLeg_r2, 0.4014F, 0.0F, 0.0F);
            UpperLeg_r2.addBox(-0.975F, -1.3173F, -1.068F, 3.0F, 5.0F, 3.0F, 0.0F, true);

            LOWERLEG2 = new ZawaModelRenderer(this, 62, 97);
            LOWERLEG2.setPos(0.0F, 2.8F, 4.2F);
            UPPERLEG2.addChild(LOWERLEG2);
            LOWERLEG2.addBox(-0.5F, -0.1423F, -1.9825F, 2.0F, 7.0F, 2.0F, 0.0F, true);

            FOOT2 = new ZawaModelRenderer(this, 62, 106);
            FOOT2.setPos(0.0F, 6.4F, -1.1F);
            LOWERLEG2.addChild(FOOT2);
            FOOT2.addBox(-0.575F, -0.5668F, -1.5941F, 2.0F, 2.0F, 2.0F, 0.0F, true);

            NECK = new ZawaModelRenderer(this, 0, 0);
            NECK.setPos(0.0F, -1.8211F, -0.8222F);
            CHEST.addChild(NECK);


            NeckBase_r1 = new ZawaModelRenderer(this, 89, 76);
            NeckBase_r1.setPos(0.0F, 0.2F, -2.0F);
            NECK.addChild(NeckBase_r1);
            setRotateAngle(NeckBase_r1, -0.8683F, 0.0019F, 0.0F);
            NeckBase_r1.addBox(-1.5037F, -2.0363F, -5.1084F, 3.0F, 4.0F, 9.0F, 0.0F, false);

            Neck_r1 = new ZawaModelRenderer(this, 89, 63);
            Neck_r1.setPos(0.0F, -2.8F, 0.0F);
            NECK.addChild(Neck_r1);
            setRotateAngle(Neck_r1, -0.6108F, 0.0019F, 0.0F);
            Neck_r1.addBox(-2.0F, -0.5854F, -5.7713F, 4.0F, 5.0F, 8.0F, 0.0F, false);

            HEAD = new ZawaModelRenderer(this, 0, 0);
            HEAD.setPos(0.0F, -4.3F, -7.0F);
            NECK.addChild(HEAD);


            RightHorn3_r1 = new ZawaModelRenderer(this, 114, 16);
            RightHorn3_r1.setPos(-2.0F, -7.25F, 3.5F);
            HEAD.addChild(RightHorn3_r1);
            setRotateAngle(RightHorn3_r1, -0.61F, -0.0945F, -0.3443F);
            RightHorn3_r1.addBox(-0.1503F, -2.6064F, -0.5906F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            LeftHorn3_r1 = new ZawaModelRenderer(this, 114, 16);
            LeftHorn3_r1.setPos(1.75F, -7.25F, 3.25F);
            HEAD.addChild(LeftHorn3_r1);
            setRotateAngle(LeftHorn3_r1, -0.6087F, 0.0981F, 0.3444F);
            LeftHorn3_r1.addBox(-0.6525F, -2.8223F, -0.4205F, 1.0F, 3.0F, 1.0F, 0.0F, false);

            Mouth_r1 = new ZawaModelRenderer(this, 102, 46);
            Mouth_r1.setPos(0.0F, 0.5F, -3.75F);
            HEAD.addChild(Mouth_r1);
            setRotateAngle(Mouth_r1, 0.4756F, 0.0019F, 0.0F);
            Mouth_r1.addBox(-1.5205F, -0.5647F, -1.4471F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            Ear1_r1 = new ZawaModelRenderer(this, 112, 33);
            Ear1_r1.setPos(2.0F, -2.25F, 1.5F);
            HEAD.addChild(Ear1_r1);
            setRotateAngle(Ear1_r1, 0.5265F, -0.5457F, -0.6417F);
            Ear1_r1.addBox(-1.2054F, -0.5559F, -0.7642F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            RightHorn1_r1 = new ZawaModelRenderer(this, 111, 25);
            RightHorn1_r1.setPos(-1.25F, -3.0F, -0.75F);
            HEAD.addChild(RightHorn1_r1);
            setRotateAngle(RightHorn1_r1, -0.5792F, -0.0879F, -0.2276F);
            RightHorn1_r1.addBox(-1.1064F, -2.6986F, -0.4895F, 2.0F, 4.0F, 2.0F, 0.0F, true);

            RightHorn2_r1 = new ZawaModelRenderer(this, 113, 20);
            RightHorn2_r1.setPos(-1.75F, -4.75F, 0.75F);
            HEAD.addChild(RightHorn2_r1);
            setRotateAngle(RightHorn2_r1, -0.8215F, 0.2124F, -0.0256F);
            RightHorn2_r1.addBox(-0.7713F, -3.6962F, -0.5335F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            LeftHorn2_r1 = new ZawaModelRenderer(this, 113, 20);
            LeftHorn2_r1.setPos(2.25F, -4.75F, 1.0F);
            HEAD.addChild(LeftHorn2_r1);
            setRotateAngle(LeftHorn2_r1, -0.8214F, -0.2086F, 0.0255F);
            LeftHorn2_r1.addBox(-0.7946F, -3.5829F, -0.6209F, 1.0F, 4.0F, 1.0F, 0.0F, false);

            Ear2_r1 = new ZawaModelRenderer(this, 112, 33);
            Ear2_r1.setPos(-1.75F, -2.0F, 1.5F);
            HEAD.addChild(Ear2_r1);
            setRotateAngle(Ear2_r1, 0.5292F, 0.5487F, 0.643F);
            Ear2_r1.addBox(-3.1116F, -0.6814F, -0.905F, 4.0F, 2.0F, 1.0F, 0.0F, true);

            Snout_r1 = new ZawaModelRenderer(this, 91, 42);
            Snout_r1.setPos(0.0F, 0.5F, -2.0F);
            HEAD.addChild(Snout_r1);
            setRotateAngle(Snout_r1, 0.2662F, 0.0019F, 0.0436F);
            Snout_r1.addBox(-0.7235F, -0.8455F, -2.1346F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            UpperSnout_r1 = new ZawaModelRenderer(this, 101, 41);
            UpperSnout_r1.setPos(0.0F, -1.5F, -2.0F);
            HEAD.addChild(UpperSnout_r1);
            setRotateAngle(UpperSnout_r1, 0.8553F, 0.0019F, 0.0F);
            UpperSnout_r1.addBox(-1.0172F, -0.8163F, -3.1492F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            LeftHorn1_r1 = new ZawaModelRenderer(this, 111, 25);
            LeftHorn1_r1.setPos(1.25F, -2.75F, 0.5F);
            HEAD.addChild(LeftHorn1_r1);
            setRotateAngle(LeftHorn1_r1, -0.5783F, 0.0916F, 0.2276F);
            LeftHorn1_r1.addBox(-0.864F, -2.2098F, -1.6718F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            Head_r1 = new ZawaModelRenderer(this, 97, 31);
            Head_r1.setPos(0.0F, 0.0F, 0.0F);
            HEAD.addChild(Head_r1);
            setRotateAngle(Head_r1, -0.013F, 0.0019F, 0.0F);
            Head_r1.addBox(-2.5134F, -2.8065F, -2.0802F, 5.0F, 5.0F, 5.0F, 0.0F, false);

            ARMBASE = new ZawaModelRenderer(this, 0, 0);
            ARMBASE.setPos(3.0836F, 0.0321F, 0.0307F);
            CHEST.addChild(ARMBASE);


            ArmBase_r1 = new ZawaModelRenderer(this, 32, 75);
            ArmBase_r1.setPos(0.0F, 0.7F, -0.5F);
            ARMBASE.addChild(ArmBase_r1);
            setRotateAngle(ArmBase_r1, 0.0742F, 0.0F, 0.0F);
            ArmBase_r1.addBox(-1.9836F, -0.686F, -1.9869F, 3.0F, 7.0F, 5.0F, 0.0F, false);

            ARM = new ZawaModelRenderer(this, 0, 0);
            ARM.setPos(0.0F, 6.4F, 1.9F);
            ARMBASE.addChild(ARM);


            Arm_r1 = new ZawaModelRenderer(this, 34, 87);
            Arm_r1.setPos(0.0F, 0.3F, -0.4F);
            ARM.addChild(Arm_r1);
            setRotateAngle(Arm_r1, 0.0F, 0.0F, 0.0F);
            Arm_r1.addBox(-1.9464F, -0.5563F, -2.4256F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            FOREARM = new ZawaModelRenderer(this, 0, 0);
            FOREARM.setPos(-0.75F, 3.7F, -2.4F);
            ARM.addChild(FOREARM);


            Forearm_r1 = new ZawaModelRenderer(this, 36, 94);
            Forearm_r1.setPos(0.0F, 0.6F, 1.5F);
            FOREARM.addChild(Forearm_r1);
            setRotateAngle(Forearm_r1, 0.0F, 0.0F, 0.0F);
            Forearm_r1.addBox(-0.8939F, -0.8511F, -1.4178F, 2.0F, 6.0F, 2.0F, 0.0F, false);

            HAND = new ZawaModelRenderer(this, 0, 0);
            HAND.setPos(0.75F, 5.6F, 1.0F);
            FOREARM.addChild(HAND);


            Hand_r1 = new ZawaModelRenderer(this, 36, 103);
            Hand_r1.setPos(0.0F, 0.0F, 0.0F);
            HAND.addChild(Hand_r1);
            setRotateAngle(Hand_r1, 0.0F, 0.0436F, 0.0F);
            Hand_r1.addBox(-1.715F, -0.7313F, -1.5515F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            ARMBASE2 = new ZawaModelRenderer(this, 0, 0);
            ARMBASE2.setPos(-3.0836F, 0.0321F, 0.0307F);
            CHEST.addChild(ARMBASE2);


            ArmBase_r2 = new ZawaModelRenderer(this, 32, 75);
            ArmBase_r2.setPos(0.0F, 0.7F, -0.5F);
            ARMBASE2.addChild(ArmBase_r2);
            setRotateAngle(ArmBase_r2, 0.0742F, 0.0F, 0.0F);
            ArmBase_r2.addBox(-1.0164F, -0.686F, -1.9869F, 3.0F, 7.0F, 5.0F, 0.0F, true);

            ARM2 = new ZawaModelRenderer(this, 0, 0);
            ARM2.setPos(0.0F, 6.4F, 1.9F);
            ARMBASE2.addChild(ARM2);


            Arm_r2 = new ZawaModelRenderer(this, 34, 87);
            Arm_r2.setPos(0.0F, 0.3F, -0.4F);
            ARM2.addChild(Arm_r2);
            setRotateAngle(Arm_r2, 0.0F, 0.0F, 0.0F);
            Arm_r2.addBox(-1.0536F, -0.5563F, -2.4256F, 3.0F, 4.0F, 3.0F, 0.0F, true);

            FOREARM2 = new ZawaModelRenderer(this, 0, 0);
            FOREARM2.setPos(0.75F, 3.7F, -2.4F);
            ARM2.addChild(FOREARM2);


            Forearm_r2 = new ZawaModelRenderer(this, 36, 94);
            Forearm_r2.setPos(0.0F, 0.6F, 1.5F);
            FOREARM2.addChild(Forearm_r2);
            setRotateAngle(Forearm_r2, 0.0F, 0.0F, 0.0F);
            Forearm_r2.addBox(-1.1061F, -0.8511F, -1.4178F, 2.0F, 6.0F, 2.0F, 0.0F, true);

            HAND2 = new ZawaModelRenderer(this, 0, 0);
            HAND2.setPos(-0.75F, 5.6F, 1.0F);
            FOREARM2.addChild(HAND2);


            Hand_r2 = new ZawaModelRenderer(this, 36, 103);
            Hand_r2.setPos(0.0F, 0.0F, 0.0F);
            HAND2.addChild(Hand_r2);
            setRotateAngle(Hand_r2, 0.0F, -0.0436F, 0.0F);
            Hand_r2.addBox(-0.285F, -0.7313F, -1.5515F, 2.0F, 2.0F, 2.0F, 0.0F, true);
            this.saveBase();

        }

        @Override
        public void setupAnim(BongoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }

    public static class Child extends BongoModel {
        protected ZawaModelRenderer Face;
        protected ZawaModelRenderer cube_r1;
        protected ZawaModelRenderer cube_r2;
        protected ZawaModelRenderer cube_r3;
        protected ZawaModelRenderer cube_r4;
        protected ZawaModelRenderer cube_r5;
        protected ZawaModelRenderer cube_r6;
        protected ZawaModelRenderer Chest;
        protected ZawaModelRenderer cube_r7;
        protected ZawaModelRenderer cube_r8;
        protected ZawaModelRenderer cube_r9;
        protected ZawaModelRenderer cube_r10;
        protected ZawaModelRenderer cube_r11;
        protected ZawaModelRenderer cube_r12;
        protected ZawaModelRenderer cube_r13;
        protected ZawaModelRenderer Leg1;
        protected ZawaModelRenderer cube_r14;
        protected ZawaModelRenderer cube_r15;
        protected ZawaModelRenderer Leg2;
        protected ZawaModelRenderer cube_r16;
        protected ZawaModelRenderer cube_r17;
        protected ZawaModelRenderer Leg3;
        protected ZawaModelRenderer cube_r18;
        protected ZawaModelRenderer cube_r19;
        protected ZawaModelRenderer Leg4;
        protected ZawaModelRenderer cube_r20;
        protected ZawaModelRenderer cube_r21;

        public Child() {
            texWidth = 64;
            texHeight = 64;

            CHEST = new ZawaModelRenderer(this, 0, 0);
            CHEST.setPos(-1.9473F, 5.8939F, -8.845F);


            Face = new ZawaModelRenderer(this, 32, 9);
            Face.setPos(0.0F, 0.0F, 0.0F);
            CHEST.addChild(Face);
            Face.addBox(-0.0527F, -0.1939F, -3.28F, 4.0F, 4.0F, 4.0F, 0.0F, false);

            cube_r1 = new ZawaModelRenderer(this, 0, 5);
            cube_r1.setPos(1.9473F, -1.0157F, -2.5273F);
            Face.addChild(cube_r1);
            setRotateAngle(cube_r1, 0.8988F, 0.0F, 0.0F);
            cube_r1.addBox(-1.0F, -0.026F, -4.1433F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r2 = new ZawaModelRenderer(this, 38, 25);
            cube_r2.setPos(1.9473F, 1.9694F, -3.0687F);
            Face.addChild(cube_r2);
            setRotateAngle(cube_r2, 0.5192F, 0.0F, 0.0F);
            cube_r2.addBox(-1.5F, -0.8085F, -2.5977F, 3.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r3 = new ZawaModelRenderer(this, 0, 0);
            cube_r3.setPos(1.9473F, 1.9694F, -3.0687F);
            Face.addChild(cube_r3);
            setRotateAngle(cube_r3, 0.3098F, 0.0F, 0.0F);
            cube_r3.texOffs(22, 44).addBox(-0.75F, -0.3835F, -1.6227F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            cube_r3.texOffs(24, 28).addBox(-1.25F, -0.3835F, -1.6227F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r4 = new ZawaModelRenderer(this, 0, 0);
            cube_r4.setPos(1.9473F, 2.0444F, -3.0687F);
            Face.addChild(cube_r4);
            setRotateAngle(cube_r4, 0.1353F, 0.0F, 0.0F);
            cube_r4.addBox(-1.0F, -0.0835F, -1.7977F, 2.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r5 = new ZawaModelRenderer(this, 33, 0);
            cube_r5.setPos(3.8947F, 0.0F, 0.0F);
            Face.addChild(cube_r5);
            setRotateAngle(cube_r5, 0.5681F, -0.5207F, -0.6628F);
            cube_r5.addBox(-1.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, false);

            cube_r6 = new ZawaModelRenderer(this, 33, 0);
            cube_r6.setPos(0.0F, 0.0F, 0.0F);
            Face.addChild(cube_r6);
            setRotateAngle(cube_r6, 0.5681F, 0.5207F, 0.6628F);
            cube_r6.addBox(-2.5F, -0.8F, -0.9F, 4.0F, 2.0F, 1.0F, 0.0F, true);

            Chest = new ZawaModelRenderer(this, 0, 0);
            Chest.setPos(0.0F, 0.0F, 0.0F);
            CHEST.addChild(Chest);


            cube_r7 = new ZawaModelRenderer(this, 0, 0);
            cube_r7.setPos(1.9473F, 5.5851F, 9.3938F);
            Chest.addChild(cube_r7);
            setRotateAngle(cube_r7, -0.0218F, 0.0F, 0.0F);
            cube_r7.addBox(-3.0F, -4.025F, -5.5F, 6.0F, 8.0F, 10.0F, 0.0F, false);

            cube_r8 = new ZawaModelRenderer(this, 0, 18);
            cube_r8.setPos(1.9059F, 5.5738F, 14.7726F);
            Chest.addChild(cube_r8);
            setRotateAngle(cube_r8, -0.4931F, 0.0F, 0.0F);
            cube_r8.addBox(-2.5F, -2.825F, -2.575F, 5.0F, 7.0F, 4.0F, 0.0F, false);

            cube_r9 = new ZawaModelRenderer(this, 16, 45);
            cube_r9.setPos(1.4473F, 6.0558F, 20.0294F);
            Chest.addChild(cube_r9);
            setRotateAngle(cube_r9, -1.4661F, 0.0F, 0.0F);
            cube_r9.addBox(0.0F, 2.4762F, -2.4975F, 1.0F, 1.0F, 3.0F, 0.0F, false);

            cube_r10 = new ZawaModelRenderer(this, 0, 0);
            cube_r10.setPos(1.9473F, 8.3585F, 17.2788F);
            Chest.addChild(cube_r10);
            setRotateAngle(cube_r10, -1.597F, 0.0F, 0.0F);
            cube_r10.texOffs(8, 45).addBox(-0.5F, -0.3F, -1.575F, 1.0F, 1.0F, 3.0F, 0.0F, false);
            cube_r10.texOffs(0, 18).addBox(-0.5F, -0.3F, 3.775F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            cube_r10.texOffs(24, 38).addBox(-1.0F, -0.8F, -0.125F, 2.0F, 2.0F, 4.0F, 0.0F, false);

            cube_r11 = new ZawaModelRenderer(this, 22, 0);
            cube_r11.setPos(2.4473F, 3.7694F, 0.6437F);
            Chest.addChild(cube_r11);
            setRotateAngle(cube_r11, -0.6109F, 0.0F, 0.0F);
            cube_r11.addBox(-2.0F, -2.8F, -2.375F, 3.0F, 4.0F, 5.0F, 0.0F, false);

            cube_r12 = new ZawaModelRenderer(this, 0, 29);
            cube_r12.setPos(1.9473F, 5.2111F, 1.0006F);
            Chest.addChild(cube_r12);
            setRotateAngle(cube_r12, -0.8247F, 0.0F, 0.0F);
            cube_r12.addBox(-1.0F, -1.15F, -2.775F, 2.0F, 2.0F, 5.0F, 0.0F, false);

            cube_r13 = new ZawaModelRenderer(this, 18, 18);
            cube_r13.setPos(1.4473F, 2.6287F, 1.3476F);
            Chest.addChild(cube_r13);
            setRotateAngle(cube_r13, 0.096F, 0.0F, 0.0F);
            cube_r13.addBox(-2.0F, -0.55F, 0.0F, 5.0F, 7.0F, 3.0F, 0.0F, false);

            Leg1 = new ZawaModelRenderer(this, 0, 0);
            Leg1.setPos(0.0F, 0.0F, 0.0F);
            CHEST.addChild(Leg1);
            Leg1.texOffs(46, 15).addBox(-0.8777F, 16.1061F, 2.045F, 2.0F, 2.0F, 2.0F, 0.0F, true);
            Leg1.texOffs(0, 44).addBox(-0.9527F, 11.0561F, 2.745F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            cube_r14 = new ZawaModelRenderer(this, 34, 17);
            cube_r14.setPos(1.8473F, 8.0561F, 4.12F);
            Leg1.addChild(cube_r14);
            setRotateAngle(cube_r14, 0.0742F, 0.0F, 0.0F);
            cube_r14.addBox(-3.25F, -1.8026F, -1.9807F, 3.0F, 5.0F, 3.0F, 0.0F, true);

            cube_r15 = new ZawaModelRenderer(this, 44, 7);
            cube_r15.setPos(1.9473F, 14.9863F, 3.6455F);
            Leg1.addChild(cube_r15);
            setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
            cube_r15.addBox(-2.875F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

            Leg2 = new ZawaModelRenderer(this, 0, 0);
            Leg2.setPos(0.0F, 0.0F, 0.0F);
            CHEST.addChild(Leg2);
            Leg2.texOffs(46, 15).addBox(2.7723F, 16.1061F, 2.045F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            Leg2.texOffs(0, 44).addBox(2.8473F, 11.0561F, 2.745F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            cube_r16 = new ZawaModelRenderer(this, 34, 17);
            cube_r16.setPos(2.0473F, 8.0561F, 4.12F);
            Leg2.addChild(cube_r16);
            setRotateAngle(cube_r16, 0.0742F, 0.0F, 0.0F);
            cube_r16.addBox(0.25F, -1.8026F, -1.9807F, 3.0F, 5.0F, 3.0F, 0.0F, false);

            cube_r17 = new ZawaModelRenderer(this, 44, 7);
            cube_r17.setPos(1.9473F, 14.9863F, 3.6455F);
            Leg2.addChild(cube_r17);
            setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
            cube_r17.addBox(0.875F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

            Leg3 = new ZawaModelRenderer(this, 0, 0);
            Leg3.setPos(0.0F, 0.0F, 0.0F);
            CHEST.addChild(Leg3);
            Leg3.texOffs(46, 23).addBox(2.6723F, 16.1061F, 12.545F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            Leg3.texOffs(42, 29).addBox(2.6973F, 13.0306F, 13.0066F, 2.0F, 4.0F, 2.0F, 0.0F, false);

            cube_r18 = new ZawaModelRenderer(this, 28, 28);
            cube_r18.setPos(4.1973F, 7.0729F, 12.3891F);
            Leg3.addChild(cube_r18);
            setRotateAngle(cube_r18, -0.0872F, -0.0027F, -0.0304F);
            cube_r18.addBox(-1.75F, -2.0F, -1.25F, 3.0F, 6.0F, 4.0F, 0.0F, false);

            cube_r19 = new ZawaModelRenderer(this, 12, 38);
            cube_r19.setPos(3.6723F, 12.5502F, 12.0458F);
            Leg3.addChild(cube_r19);
            setRotateAngle(cube_r19, 0.4014F, 0.0F, 0.0F);
            cube_r19.addBox(-1.5F, -2.5F, -0.225F, 3.0F, 4.0F, 3.0F, 0.0F, false);

            Leg4 = new ZawaModelRenderer(this, 0, 0);
            Leg4.setPos(0.0F, 0.0F, 0.0F);
            CHEST.addChild(Leg4);
            Leg4.texOffs(42, 29).addBox(-0.8027F, 13.0306F, 13.0066F, 2.0F, 4.0F, 2.0F, 0.0F, true);
            Leg4.texOffs(46, 23).addBox(-0.7777F, 16.1061F, 12.545F, 2.0F, 2.0F, 2.0F, 0.0F, true);

            cube_r20 = new ZawaModelRenderer(this, 28, 28);
            cube_r20.setPos(-0.3027F, 7.0729F, 12.3891F);
            Leg4.addChild(cube_r20);
            setRotateAngle(cube_r20, -0.0872F, 0.0027F, 0.0304F);
            cube_r20.addBox(-1.25F, -2.0F, -1.25F, 3.0F, 6.0F, 4.0F, 0.0F, true);

            cube_r21 = new ZawaModelRenderer(this, 12, 38);
            cube_r21.setPos(0.2223F, 12.5502F, 12.0458F);
            Leg4.addChild(cube_r21);
            setRotateAngle(cube_r21, 0.4014F, 0.0F, 0.0F);
            cube_r21.addBox(-1.5F, -2.5F, -0.225F, 3.0F, 4.0F, 3.0F, 0.0F, true);
            this.saveBase();

        }

        @Override
        public void setupAnim(BongoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        }
    }
    }