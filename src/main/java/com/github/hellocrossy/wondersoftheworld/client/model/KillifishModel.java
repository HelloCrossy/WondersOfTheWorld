package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.KillifishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class KillifishModel extends ZawaBaseAmbientModel<KillifishEntity> {

    public ModelPart Body;
    public ModelPart Tail;
    public ModelPart DorsalFin;
    public ModelPart AnalFin;
    public ModelPart LeftPelvicFin;
    public ModelPart LeftPectoralFin;
    public ModelPart RightPectoralFin;
    public ModelPart Head;
    public ModelPart RightPelvicFin;
    public ModelPart CaudalFinBottom;
    public ModelPart CaudalFin;
    public ModelPart Face;
    public ModelPart Neck;

    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public KillifishModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.RightPelvicFin = this.Body.getChild("RightPelvicFin");
        this.Head = this.Body.getChild("Head");
        this.Neck = this.Head.getChild("Neck");

        this.Face = this.Head.getChild("Face");
        this.LeftPectoralFin = this.Body.getChild("LeftPectoralFin");
        this.Tail = this.Body.getChild("Tail");
        this.CaudalFinBottom = this.Tail.getChild("CaudalFinBottom");

        this.CaudalFin = this.Tail.getChild("CaudalFin");
        this.AnalFin = this.Body.getChild("AnalFin");
        this.RightPectoralFin = this.Body.getChild("RightPectoralFin");
        this.LeftPelvicFin = this.Body.getChild("LeftPelvicFin");
        this.DorsalFin = this.Body.getChild("DorsalFin");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -3.5F, 3.0F, 4.0F, 7.0F), PartPose.offset(0.0F, 19.6F, 0.0F));
        PartDefinition RightPelvicFin = Body.addOrReplaceChild("RightPelvicFin", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(-0.7F, 2.0F, -2.7F, 0.40229837926888745F, -0.2275909337942703F, 0.0F));
        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -3.3F, 0.2275909337942703F, 0.0F, 0.0F));
        PartDefinition Neck = Head.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(6, 19).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.8F, -0.6F, -0.4098033003787853F, 0.0F, 0.0F));

        PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(18, 18).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -3.0F, 0.8196066007575706F, 0.0F, 0.0F));
        PartDefinition LeftPectoralFin = Body.addOrReplaceChild("LeftPectoralFin", CubeListBuilder.create().texOffs(20, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.4F, 0.8F, -2.7F, -0.12967796042712246F, 0.4098033003787853F, 0.0F));
        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(12, 11).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 4.0F), PartPose.offset(0.0F, -0.2F, 3.3F));
        PartDefinition CaudalFinBottom = Tail.addOrReplaceChild("CaudalFinBottom", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -1.5F, -2.1F, 0.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 3.8F, 1.4172072993561737F, 0.0F, 0.0F));

        PartDefinition CaudalFin = Tail.addOrReplaceChild("CaudalFin", CubeListBuilder.create().texOffs(12, 15).addBox(0.0F, -1.5F, -1.0F, 0.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 3.8F, 1.7243853542336192F, 0.0F, 0.0F));
        PartDefinition AnalFin = Body.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(0, 9).addBox(0.0F, 0.0F, -2.0F, 0.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 1.7F, 0.18762289458939044F, 0.0F, 0.0F));
        PartDefinition RightPectoralFin = Body.addOrReplaceChild("RightPectoralFin", CubeListBuilder.create().texOffs(20, 4).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.4F, 0.8F, -2.7F, -0.12967796042712246F, -0.4098033003787853F, 0.0F));
        PartDefinition LeftPelvicFin = Body.addOrReplaceChild("LeftPelvicFin", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.7F, 2.0F, -2.7F, 0.40229837926888745F, 0.2275909337942703F, 0.0F));
        PartDefinition DorsalFin = Body.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 7.0F), PartPose.offsetAndRotation(0.0F, -1.4F, -1.1F, -0.0781907508222411F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 32, 32);
    }

    @Override
    public void setupAnim(KillifishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
