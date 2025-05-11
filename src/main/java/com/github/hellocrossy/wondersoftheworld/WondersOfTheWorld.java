package com.github.hellocrossy.wondersoftheworld;

import com.github.hellocrossy.wondersoftheworld.block.WOTWBlocks;
import com.github.hellocrossy.wondersoftheworld.client.model.WOTWModelLayers;
import com.github.hellocrossy.wondersoftheworld.entity.WOTWEntities;
import com.github.hellocrossy.wondersoftheworld.item.WOTWItems;
import com.github.hellocrossy.wondersoftheworld.sounds.WOTWSounds;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.util.Tuple;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.function.Supplier;

@Mod(WondersOfTheWorld.MOD_ID)
public class WondersOfTheWorld {
    public static final String MOD_ID = "wondersoftheworld";
    public static final String[] PLUSHIES_LIST = new String[]{"emu", "scimitar_oryx", "takin", "bongo", "kiwi", "fennec_fox", "serval", "eurasian_hamster", "pallas_cat", "caracal"};

    public WondersOfTheWorld() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        WOTWEntities.REGISTRY.initialize();
        WOTWItems.REGISTRAR.register(bus);
        WOTWBlocks.REGISTRAR.register(bus);
        WOTWSounds.REGISTRAR.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::registerLayerDefinitions);
        bus.addListener(this::setupClient);
    }

    private void setup(final FMLCommonSetupEvent event) {
        WOTWEntities.registerSpawnPlacements();
    }

    private void setupClient(final FMLClientSetupEvent event) {
        WOTWEntities.registerRenderers();
        WOTWBlocks.setRenderLayers();
    }

    public void registerLayerDefinitions(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        for (Tuple<ModelLayerLocation, Supplier<LayerDefinition>> layer : WOTWModelLayers.MODEL_LAYERS_LIST) {
            event.registerLayerDefinition(layer.getA(), layer.getB());
        }
    }
}
