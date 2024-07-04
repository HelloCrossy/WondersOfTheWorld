package com.github.hellocrossy.wondersoftheworld.block;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.item.WOTWItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.block.PlushBlock;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld.PLUSHIES_LIST;

public class WOTWBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, WondersOfTheWorld.MOD_ID);

    public static final RegistryObject<Block> CRACKED_STONE = registerWithItem("cracked_stone", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_CRACKED_STONE = registerWithItem("mossy_cracked_stone", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_CRACKED_STONE = registerWithItem("light_cracked_stone", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DESERT_CRACKED_STONE = registerWithItem("desert_cracked_stone", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MESA_CRACKED_STONE = registerWithItem("mesa_cracked_stone", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARCTIC_CRACKED_STONE = registerWithItem("arctic_cracked_stone", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BREEZE_BLOCK = registerWithItem("breeze_block", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK = registerWithItem("defined_breeze_block", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FINE_DIRT = registerWithItem("fine_dirt", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND)));
    public static final RegistryObject<Block> FINE_SAND = registerWithItem("fine_sand", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND)));
    public static final RegistryObject<Block> DRY_COBBLESTONE = registerWithItem("dry_cobblestone", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_BRICK = registerWithItem("red_brick", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE)));
    public static final Map<String, RegistryObject<Block>> PLUSHIES = Util.make(new HashMap<>(), map -> {
        for (String plush : PLUSHIES_LIST)
            map.put(plush, REGISTRAR.register(plush + "_plush", () -> new PlushBlock(AbstractBlock.Properties.of(Material.WOOL).sound(SoundType.WOOL).noOcclusion())));


    });
    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        WOTWItems.REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().tab(Zawa.DECORATIONS_GROUP)));
        return registryObject;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {
        RenderType cutoutMipped = RenderType.cutoutMipped();
        RenderTypeLookup.setRenderLayer(PLUSHIES.get("emu").get(), cutoutMipped);
    }
}
