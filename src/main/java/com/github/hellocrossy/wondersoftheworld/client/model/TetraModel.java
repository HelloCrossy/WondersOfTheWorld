package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.TetraEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class TetraModel extends ZawaBaseAmbientModel<TetraEntity> {
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
    public ModelPart SoftDorsalFin;
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

    public TetraModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.Tail = this.Body.getChild("Tail");
        this.CaudalFin = this.Tail.getChild("CaudalFin");

        this.SoftDorsalFin = this.Tail.getChild("SoftDorsalFin");

        this.CaudalFinBottom = this.Tail.getChild("CaudalFinBottom");
        this.Head = this.Body.getChild("Head");
        this.Neck = this.Head.getChild("Neck");

        this.Face = this.Head.getChild("Face");
        this.LeftPectoralFin = this.Body.getChild("LeftPectoralFin");
        this.AnalFin = this.Body.getChild("AnalFin");
        this.DorsalFin = this.Body.getChild("DorsalFin");
        this.LeftPelvicFin = this.Body.getChild("LeftPelvicFin");
        this.RightPectoralFin = this.Body.getChild("RightPectoralFin");
        this.RightPelvicFin = this.Body.getChild("RightPelvicFin");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 21).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 4.0F, 6.0F), PartPose.offset(0.0F, 19.6F, 0.0F));
        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 4.0F), PartPose.offset(0.0F, -0.2F, 2.3F));
        PartDefinition CaudalFin = Tail.addOrReplaceChild("CaudalFin", CubeListBuilder.create().texOffs(58, 0).addBox(0.0F, -1.5F, -1.0F, 0.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 3.8F, 1.9198621771937625F, 0.0F, 0.0F));

        PartDefinition SoftDorsalFin = Tail.addOrReplaceChild("SoftDorsalFin", CubeListBuilder.create().texOffs(47, 0).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 2.0F, 2.321985919674168F, 0.0F, 0.0F));

        PartDefinition CaudalFinBottom = Tail.addOrReplaceChild("CaudalFinBottom", CubeListBuilder.create().texOffs(58, 6).addBox(0.0F, -1.5F, -1.0F, 0.0F, 5.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.4F, 3.8F, 1.2217304763960306F, 0.0F, 0.0F));
        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -2.8F, 0.2275909337942703F, 0.0F, 0.0F));
        PartDefinition Neck = Head.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(14, 6).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.8F, -0.6F, -0.4098033003787853F, 0.0F, 0.0F));

        PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -3.0F, 0.8196066007575706F, 0.0F, 0.0F));
        PartDefinition LeftPectoralFin = Body.addOrReplaceChild("LeftPectoralFin", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.5F, 0.8F, -2.7F, -0.3642502295386026F, 0.4098033003787853F, 0.0F));
        PartDefinition AnalFin = Body.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(34, 0).addBox(0.0F, 0.0F, -2.0F, 0.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.4F, 0.7740534966278743F, 0.0F, 0.0F));
        PartDefinition DorsalFin = Body.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(43, 0).addBox(0.0F, 0.0F, -3.0F, 0.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -0.3F, 2.321985919674168F, 0.0F, 0.0F));
        PartDefinition LeftPelvicFin = Body.addOrReplaceChild("LeftPelvicFin", CubeListBuilder.create().texOffs(30, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.7F, 2.0F, -0.8F, 0.9105382388075086F, 0.2275909337942703F, 0.0F));
        PartDefinition RightPectoralFin = Body.addOrReplaceChild("RightPectoralFin", CubeListBuilder.create().texOffs(15, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, 0.8F, -2.7F, -0.3642502295386026F, -0.4098033003787853F, 0.0F));
        PartDefinition RightPelvicFin = Body.addOrReplaceChild("RightPelvicFin", CubeListBuilder.create().texOffs(30, 3).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.7F, 2.0F, -0.8F, 0.9105382388075086F, -0.2275909337942703F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 32);
    }

    @Override
    public void setupAnim(TetraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}