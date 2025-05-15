package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.OscarEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class OscarModel extends ZawaBaseAmbientModel<OscarEntity> {
    public ModelPart Body;
    public ModelPart Tail;
    public ModelPart DorsalFin;
    public ModelPart LeftPelvicFin;
    public ModelPart RightPelvicFin;
    public ModelPart LeftPectoralFin;
    public ModelPart RightPectoralFin;
    public ModelPart Head;
    public ModelPart AnalFin;
    public ModelPart TailFinTop;
    public ModelPart TailFinBottom;
    public ModelPart Face;
    public ModelPart Forehead;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public OscarModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftPelvicFin = this.Body.getChild("LeftPelvicFin");
        this.Tail = this.Body.getChild("Tail");
        this.TailFinTop = this.Tail.getChild("TailFinTop");

        this.TailFinBottom = this.Tail.getChild("TailFinBottom");
        this.AnalFin = this.Body.getChild("AnalFin");
        this.DorsalFin = this.Body.getChild("DorsalFin");
        this.Head = this.Body.getChild("Head");
        this.Forehead = this.Head.getChild("Forehead");

        this.Face = this.Head.getChild("Face");
        this.RightPectoralFin = this.Body.getChild("RightPectoralFin");
        this.LeftPectoralFin = this.Body.getChild("LeftPectoralFin");
        this.RightPelvicFin = this.Body.getChild("RightPelvicFin");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F), PartPose.offset(0.0F, 18.6F, 0.0F));
        PartDefinition LeftPelvicFin = Body.addOrReplaceChild("LeftPelvicFin", CubeListBuilder.create().texOffs(4, 0).addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.7F, 1.4F, -0.8F, 0.7285004590772052F, 0.0F, 0.0F));
        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(6, 12).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 3.0F), PartPose.offset(0.0F, 0.0F, 2.7F));
        PartDefinition TailFinTop = Tail.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 2.4F, 1.6845917354353828F, 0.0F, 0.0F));

        PartDefinition TailFinBottom = Tail.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(18, 4).addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 2.5F, 1.3658947098950176F, 0.0F, 0.0F));
        PartDefinition AnalFin = Body.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(6, 16).addBox(0.0F, 0.0F, -1.0F, 0.0F, 6.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.1F, -0.4F, 1.4570009181544104F, 0.0F, 0.0F));
        PartDefinition DorsalFin = Body.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(0, 9).addBox(0.0F, 0.0F, -2.0F, 0.0F, 9.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.1F, -2.5F, 1.6845917354353828F, 0.0F, 0.0F));
        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -2.7F, 0.2275909337942703F, 0.0F, 0.0F));
        PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(15, 9).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -1.0471975511965976F, 0.0F, 0.0F));

        PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(13, 16).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -2.9F, 1.2292353975059285F, 0.0F, 0.0F));
        PartDefinition RightPectoralFin = Body.addOrReplaceChild("RightPectoralFin", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, 0.3F, -2.4F, -0.3642502295386026F, -0.4098033003787853F, 0.0F));
        PartDefinition LeftPectoralFin = Body.addOrReplaceChild("LeftPectoralFin", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.5F, 0.3F, -2.4F, -0.3642502295386026F, 0.4098033003787853F, 0.0F));
        PartDefinition RightPelvicFin = Body.addOrReplaceChild("RightPelvicFin", CubeListBuilder.create().texOffs(4, 0).addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.7F, 1.4F, -0.8F, 0.7285004590772052F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 32, 32);
    }

    @Override
    public void setupAnim(OscarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}