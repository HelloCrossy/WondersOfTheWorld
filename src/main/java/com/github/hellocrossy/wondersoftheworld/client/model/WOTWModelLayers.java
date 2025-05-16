package com.github.hellocrossy.wondersoftheworld.client.model;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.google.common.collect.Sets;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@OnlyIn(Dist.CLIENT)
public class WOTWModelLayers {
    public static final Set<ModelLayerLocation> ALL_MODELS = Sets.newHashSet();
    public static final List<Tuple<ModelLayerLocation, Supplier<LayerDefinition>>> MODEL_LAYERS_LIST = new ArrayList<>();
    public static final ModelLayerLocation SERVAL_ADULT = register("serval", "adult", ServalModel.Adult::createBodyLayer);
    public static final ModelLayerLocation SERVAL_CHILD = register("serval", "child", ServalModel.Child::createBodyLayer);
    public static final ModelLayerLocation EMU_ADULT = register("emu", "adult", EmuModel.Adult::createBodyLayer);
    public static final ModelLayerLocation EMU_CHILD = register("emu", "child", EmuModel.Child::createBodyLayer);
    public static final ModelLayerLocation KIWI_ADULT = register("kiwi", "adult", KiwiModel.Adult::createBodyLayer);
    public static final ModelLayerLocation KIWI_CHILD = register("kiwi", "child", KiwiModel.Child::createBodyLayer);
    public static final ModelLayerLocation SAIGA_ANTELOPE_ADULT = register("saiga_antelope", "adult", SaigaAntelopeModel.Adult::createBodyLayer);
    public static final ModelLayerLocation SAIGA_ANTELOPE_CHILD = register("saiga_antelope", "child", SaigaAntelopeModel.Child::createBodyLayer);
    public static final ModelLayerLocation WESTERN_LOWLAND_BONGO_ADULT = register("western_lowland_bongo", "adult", WesternLowlandBongoModel.Adult::createBodyLayer);
    public static final ModelLayerLocation WESTERN_LOWLAND_BONGO_CHILD = register("western_lowland_bongo", "child", WesternLowlandBongoModel.Child::createBodyLayer);
    public static final ModelLayerLocation TAKIN_ADULT = register("takin", "adult", TakinModel.Adult::createBodyLayer);
    public static final ModelLayerLocation TAKIN_CHILD = register("takin", "child", TakinModel.Child::createBodyLayer);
    public static final ModelLayerLocation FENNEC_FOX_ADULT = register("fennec_fox", "adult", FennecFoxModel.Adult::createBodyLayer);
    public static final ModelLayerLocation FENNEC_FOX_CHILD = register("fennec_fox", "child", FennecFoxModel.Child::createBodyLayer);
    public static final ModelLayerLocation TIBETAN_ANTELOPE_ADULT = register("tibetan_antelope", "adult", TibetanAntelopeModel.Adult::createBodyLayer);
    public static final ModelLayerLocation TIBETAN_ANTELOPE_CHILD = register("tibetan_antelope", "child", TibetanAntelopeModel.Child::createBodyLayer);
    public static final ModelLayerLocation LOWLAND_NYALA_ADULT_MALE = register("lowland_nyala", "adult/male", LowlandNyalaModel.AdultMale::createBodyLayer);
    public static final ModelLayerLocation LOWLAND_NYALA_ADULT_FEMALE = register("lowland_nyala", "adult/female", LowlandNyalaModel.AdultFemale::createBodyLayer);
    public static final ModelLayerLocation LOWLAND_NYALA_CHILD = register("lowland_nyala", "child", LowlandNyalaModel.Child::createBodyLayer);
    public static final ModelLayerLocation MOUSE_DEER_ADULT = register("mouse_deer", "adult", MouseDeerModel.Adult::createBodyLayer);
    public static final ModelLayerLocation MOUSE_DEER_CHILD = register("mouse_deer", "child", MouseDeerModel.Child::createBodyLayer);
    public static final ModelLayerLocation HOOPOE_ADULT = register("hoopoe", "adult", HoopoeModel.Adult::createBodyLayer);
    public static final ModelLayerLocation HOOPOE_FLYING = register("hoopoe", "flying", HoopoeModel.Flying::createBodyLayer);
    public static final ModelLayerLocation HOOPOE_CHILD = register("hoopoe", "child", HoopoeModel.Child::createBodyLayer);
    public static final ModelLayerLocation MARGAY_ADULT = register("margay", "adult", MargayModel.Adult::createBodyLayer);
    public static final ModelLayerLocation MARGAY_CHILD = register("margay", "child", MargayModel.Child::createBodyLayer);
    public static final ModelLayerLocation CAIMAN_ADULT = register("caiman", "adult", CaimanModel.Adult::createBodyLayer);
    public static final ModelLayerLocation CAIMAN_CHILD = register("caiman", "child", CaimanModel.Child::createBodyLayer);
    public static final ModelLayerLocation HAMSTER_ADULT = register("hamster", "adult", HamsterModel.Adult::createBodyLayer);
    public static final ModelLayerLocation HAMSTER_CHILD = register("hamster", "child", HamsterModel.Child::createBodyLayer);
    public static final ModelLayerLocation GUANACO_ADULT = register("guanaco", "adult", GuanacoModel.Adult::createBodyLayer);
    public static final ModelLayerLocation GUANACO_CHILD = register("guanaco", "child", GuanacoModel.Child::createBodyLayer);
    public static final ModelLayerLocation CARACAL_ADULT = register("caracal", "adult", CaracalModel.Adult::createBodyLayer);
    public static final ModelLayerLocation CARACAL_CHILD = register("caracal", "child", CaracalModel.Child::createBodyLayer);
    public static final ModelLayerLocation SLOTH_BEAR_ADULT = register("sloth_bear", "adult", SlothBearModel.Adult::createBodyLayer);
    public static final ModelLayerLocation SLOTH_BEAR_CHILD = register("sloth_bear", "child", SlothBearModel.Child::createBodyLayer);
    public static final ModelLayerLocation PALLAS_CAT_ADULT = register("pallas_cat", "adult", PallasCatModel.Adult::createBodyLayer);
    public static final ModelLayerLocation PALLAS_CAT_CHILD = register("pallas_cat", "child", PallasCatModel.Child::createBodyLayer);
    public static final ModelLayerLocation MANAKIN_ADULT = register("manakin", "adult", ManakinModel.Adult::createBodyLayer);
    public static final ModelLayerLocation MANAKIN_FLYING = register("manakin", "flying", ManakinModel.Flying::createBodyLayer);
    public static final ModelLayerLocation MANAKIN_CHILD = register("manakin", "child", ManakinModel.Child::createBodyLayer);
    public static final ModelLayerLocation TAMARIN_ADULT = register("tamarin", "adult", TamarinModel.Adult::createBodyLayer);
    public static final ModelLayerLocation TAMARIN_CHILD = register("tamarin", "child", TamarinModel.Child::createBodyLayer);
    public static final ModelLayerLocation SQUIRREL_MONKEY_ADULT = register("squirrel_monkey", "adult", SquirrelMonkeyModel.Adult::createBodyLayer);
    public static final ModelLayerLocation SQUIRREL_MONKEY_CHILD = register("squirrel_monkey", "child", SquirrelMonkeyModel.Child::createBodyLayer);
    public static final ModelLayerLocation WARTHOG_ADULT = register("warthog", "adult", WarthogModel.Adult::createBodyLayer);
    public static final ModelLayerLocation WARTHOG_CHILD = register("warthog", "child", WarthogModel.Child::createBodyLayer);
    public static final ModelLayerLocation PYGMY_HIPPO_ADULT = register("pygmy_hippo", "adult", PygmyHippoModel.Adult::createBodyLayer);
    public static final ModelLayerLocation PYGMY_HIPPO_CHILD = register("pygmy_hippo", "child", PygmyHippoModel.Child::createBodyLayer);
    public static final ModelLayerLocation HAMMERKOP_ADULT = register("hammerkop", "adult", HammerkopModel.Adult::createBodyLayer);
    public static final ModelLayerLocation HAMMERKOP_FLYING = register("hammerkop", "flying", HammerkopModel.Flying::createBodyLayer);
    public static final ModelLayerLocation HAMMERKOP_CHILD = register("hammerkop", "child", HammerkopModel.Child::createBodyLayer);
    public static final ModelLayerLocation QUETZAL_ADULT = register("quetzal", "adult", QuetzalModel.Adult::createBodyLayer);
    public static final ModelLayerLocation QUETZAL_FLYING = register("quetzal", "flying", QuetzalModel.Flying::createBodyLayer);
    public static final ModelLayerLocation QUETZAL_CHILD = register("quetzal", "child", QuetzalModel.Child::createBodyLayer);

    public static final ModelLayerLocation OSCAR = register("oscar", OscarModel::createBodyLayer);
    public static final ModelLayerLocation DISCUS_FISH = register("discus_fish", DiscusFishModel::createBodyLayer);
    public static final ModelLayerLocation TETRA = register("tetra", TetraModel::createBodyLayer);
    public static final ModelLayerLocation FLOWERHORN_CICHILID = register("flowerhorn_cichilid", FlowerhornCichlidModel::createBodyLayer);
    public static final ModelLayerLocation KILLIFISH = register("killifish", KillifishModel::createBodyLayer);

    public WOTWModelLayers() {
    }

    private static ModelLayerLocation register(String path, Supplier<LayerDefinition> layerDefinition) {
        return register(path, "main", layerDefinition);
    }

    private static ModelLayerLocation register(String path, String model, Supplier<LayerDefinition> layerDefinition) {
        ModelLayerLocation modellayerlocation = createLocation(path, model);
        MODEL_LAYERS_LIST.add(new Tuple<>(modellayerlocation, layerDefinition));
        if (!ALL_MODELS.add(modellayerlocation))
            throw new IllegalStateException("Duplicate registration for " + modellayerlocation);
        else return modellayerlocation;
    }

    private static ModelLayerLocation createLocation(String path, String model) {
        return new ModelLayerLocation(new ResourceLocation(WondersOfTheWorld.MOD_ID, path), model);
    }
}
