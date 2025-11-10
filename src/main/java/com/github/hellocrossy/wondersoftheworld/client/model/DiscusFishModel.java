package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.entity.DiscusFishEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class DiscusFishModel extends ZawaBaseAmbientModel<DiscusFishEntity> {

    public ModelPart Body;
    public ModelPart Tail;
    public ModelPart DorsalFin;
    public ModelPart RightPelvicFin;
    public ModelPart Head;
    public ModelPart AnalFin;
    public ModelPart LeftPelvicFin;
    public ModelPart LeftPectoralFin;
    public ModelPart RightPectoralFin;
    public ModelPart TailFin;
    public ModelPart Face;
    public ModelPart Forehead;

    private Iterable<ModelPart> parts;

    public DiscusFishModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.AnalFin = this.Body.getChild("AnalFin");
        this.LeftPelvicFin = this.Body.getChild("LeftPelvicFin");
        this.LeftPectoralFin = this.Body.getChild("LeftPectoralFin");
        this.Head = this.Body.getChild("Head");
        this.RightPelvicFin = this.Body.getChild("RightPelvicFin");
        this.RightPectoralFin = this.Body.getChild("RightPectoralFin");
        this.Face = this.Head.getChild("Face");
        this.Tail = this.Body.getChild("Tail");
        this.DorsalFin = this.Body.getChild("DorsalFin");
        this.Forehead = this.Head.getChild("Forehead");

        this.TailFin = this.Tail.getChild("TailFin");

    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(8, 19).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F), PartPose.offset(0.0F, 15.8F, 0.0F));
        PartDefinition AnalFin = Body.addOrReplaceChild("AnalFin", CubeListBuilder.create().texOffs(13, 0).addBox(0.0F, 0.0F, -2.5F, 0.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 3.1F, -1.0F, 1.4486232791552935F, 0.0F, 0.0F));
        PartDefinition LeftPelvicFin = Body.addOrReplaceChild("LeftPelvicFin", CubeListBuilder.create().texOffs(10, 3).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.6F, 3.0F, -2.5F, 0.27314402127920984F, 0.2275909337942703F, -0.13665927909957545F));
        PartDefinition LeftPectoralFin = Body.addOrReplaceChild("LeftPectoralFin", CubeListBuilder.create().texOffs(13, 1).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.4F, 1.2F, -2.5F, 0.3642502295386026F, 0.3642502295386026F, 0.0F));
        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -2.7F, 0.2275909337942703F, 0.0F, 0.0F));
        PartDefinition RightPelvicFin = Body.addOrReplaceChild("RightPelvicFin", CubeListBuilder.create().texOffs(10, 7).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, 3.0F, -2.5F, 0.27314402127920984F, -0.2275909337942703F, 0.13665927909957545F));
        PartDefinition RightPectoralFin = Body.addOrReplaceChild("RightPectoralFin", CubeListBuilder.create().texOffs(13, -1).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.4F, 1.2F, -2.5F, 0.3642502295386026F, -0.3642502295386026F, 0.0F));
        PartDefinition Face = Head.addOrReplaceChild("Face", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -2.9F, 1.2983504199059372F, 0.0F, 0.0F));
        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(2, 17).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 2.0F), PartPose.offset(0.0F, 0.0F, 2.7F));
        PartDefinition DorsalFin = Body.addOrReplaceChild("DorsalFin", CubeListBuilder.create().texOffs(21, 6).addBox(0.0F, 0.0F, -2.5F, 0.0F, 8.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -3.1F, -3.0F, 1.6580627893946132F, 0.0F, 0.0F));
        PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(11, 12).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -1.0471975511965976F, 0.0F, 0.0F));

        PartDefinition TailFin = Tail.addOrReplaceChild("TailFin", CubeListBuilder.create().texOffs(21, 17).addBox(0.0F, -0.4F, -2.0F, 0.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 1.5707963267948966F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 32);
    }

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    @Override
    public void setupAnim(DiscusFishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}