package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.FlowerhornCichlidEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.ModelPart;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class FlowerhornCichlidModel extends ZawaBaseAmbientModel<FlowerhornCichlidEntity> {

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
    public ModelPart Horn;

    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public FlowerhornCichlidModel(ModelPart root) {
        this.Chest = root.getChild("Chest");
        this.texWidth = 64;
        this.texHeight = 32;
        partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -2.7F, 0.2275909337942703F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("TailFinBottom", CubeListBuilder.create().texOffs(52, 0).addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 2.5F, 1.3658947098950176F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("TailFinTop", CubeListBuilder.create().texOffs(52, 4).addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 2.4F, 1.6845917354353828F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LeftPectoralFin", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(1.5F, 0.3F, -2.4F, -0.3642502295386026F, 0.4098033003787853F, 0.0F));
        partDefinition.addOrReplaceChild("LeftPelvicFin", CubeListBuilder.create().texOffs(30, 0).addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.7F, 1.4F, -0.8F, 0.7285004590772052F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(2, 17).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 0.0F, 2.7F));
        partDefinition.addOrReplaceChild("RightPectoralFin", CubeListBuilder.create().texOffs(15, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-1.5F, 0.3F, -2.4F, -0.3642502295386026F, -0.4098033003787853F, 0.0F));
        partDefinition.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(35, -1).addBox(0.0F, 0.0F, -1.0F, 0.0F, 6.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 3.1F, -0.4F, 1.4570009181544104F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(8, 19).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 18.6F, 0.0F));
        partDefinition.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -2.9F, 1.2292353975059285F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(43, -1).addBox(0.0F, 0.0F, -2.0F, 0.0F, 9.0F, 3.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -3.1F, -2.5F, 1.6845917354353828F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightPelvicFin", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, 0.0F, -2.0F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(-0.7F, 1.4F, -0.8F, 0.7285004590772052F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Horn", CubeListBuilder.create().texOffs(27, 12).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -0.1F, -0.6F, 0.04555309164612875F, 0.0F, 0.0F));
        this.Head = this.Body.getChild("Head");
        this.TailFinBottom = this.Tail.getChild("TailFinBottom");
        this.TailFinTop = this.Tail.getChild("TailFinTop");
        this.LeftPectoralFin = this.Body.getChild("LeftPectoralFin");
        this.LeftPelvicFin = this.Body.getChild("LeftPelvicFin");
        this.Tail = this.Body.getChild("Tail");
        this.RightPectoralFin = this.Body.getChild("RightPectoralFin");
        this.AnalFin = this.Body.getChild("AnalFin");
        this.Face = this.Head.getChild("Face");
        this.DorsalFin = this.Body.getChild("DorsalFin");
        this.RightPelvicFin = this.Body.getChild("RightPelvicFin");
        this.Horn = this.Head.getChild("Horn");

    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

// paste partDefinition.addOrReplaceChild lines here

        return LayerDefinition.create(meshDefinition, texWidth, texHeight);
    }

    @Override
    public void setupAnim(FlowerhornCichlidEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}