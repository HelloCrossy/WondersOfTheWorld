package com.github.hellocrossy.wondersoftheworld.block;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.item.WOTWItems;
import net.minecraft.Util;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.block.PlushBlock;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld.PLUSHIES_LIST;

public class WOTWBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, WondersOfTheWorld.MOD_ID);
    public static final RegistryObject<Block> CRACKED_STONE = registerWithItem("cracked_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_STONE_SLAB = registerWithItem("cracked_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CRACKED_STONE.get())));
    public static final RegistryObject<Block> CRACKED_STONE_STAIRS = registerWithItem("cracked_stone_stairs", () -> new StairBlock(() -> CRACKED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(CRACKED_STONE.get())));
    public static final RegistryObject<Block> MOSSY_CRACKED_STONE = registerWithItem("mossy_cracked_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_CRACKED_STONE_SLAB = registerWithItem("mossy_cracked_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MOSSY_CRACKED_STONE.get())));
    public static final RegistryObject<Block> MOSSY_CRACKED_STONE_STAIRS = registerWithItem("mossy_cracked_stone_stairs", () -> new StairBlock(() -> MOSSY_CRACKED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MOSSY_CRACKED_STONE.get())));
    public static final RegistryObject<Block> LIGHT_CRACKED_STONE = registerWithItem("light_cracked_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_CRACKED_STONE_SLAB = registerWithItem("light_cracked_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIGHT_CRACKED_STONE.get())));
    public static final RegistryObject<Block> LIGHT_CRACKED_STONE_STAIRS = registerWithItem("light_cracked_stone_stairs", () -> new StairBlock(() -> LIGHT_CRACKED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(LIGHT_CRACKED_STONE.get())));
    public static final RegistryObject<Block> DESERT_CRACKED_STONE = registerWithItem("desert_cracked_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DESERT_CRACKED_STONE_SLAB = registerWithItem("desert_cracked_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(DESERT_CRACKED_STONE.get())));
    public static final RegistryObject<Block> DESERT_CRACKED_STONE_STAIRS = registerWithItem("desert_cracked_stone_stairs", () -> new StairBlock(() -> DESERT_CRACKED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(DESERT_CRACKED_STONE.get())));
    public static final RegistryObject<Block> MESA_CRACKED_STONE = registerWithItem("mesa_cracked_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MESA_CRACKED_STONE_SLAB = registerWithItem("mesa_cracked_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MESA_CRACKED_STONE.get())));
    public static final RegistryObject<Block> MESA_CRACKED_STONE_STAIRS = registerWithItem("mesa_cracked_stone_stairs", () -> new StairBlock(() -> MESA_CRACKED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(MESA_CRACKED_STONE.get())));
    public static final RegistryObject<Block> ARCTIC_CRACKED_STONE = registerWithItem("arctic_cracked_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ARCTIC_CRACKED_STONE_SLAB = registerWithItem("arctic_cracked_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ARCTIC_CRACKED_STONE.get())));
    public static final RegistryObject<Block> ARCTIC_CRACKED_STONE_STAIRS = registerWithItem("arctic_cracked_stone_stairs", () -> new StairBlock(() -> ARCTIC_CRACKED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(ARCTIC_CRACKED_STONE.get())));
    public static final RegistryObject<Block> BREEZE_BLOCK = registerWithItem("breeze_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BREEZE_BLOCK_SLAB = registerWithItem("breeze_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BREEZE_BLOCK.get())));
    public static final RegistryObject<Block> BREEZE_BLOCK_STAIRS = registerWithItem("breeze_block_stairs", () -> new StairBlock(() -> (BREEZE_BLOCK.get()).defaultBlockState(), BlockBehaviour.Properties.copy(BREEZE_BLOCK.get())));
    public static final RegistryObject<Block> BREEZE_BLOCK_WALL = registerWithItem("breeze_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BREEZE_BLOCK.get())));
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK = registerWithItem("defined_breeze_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK_SLAB = registerWithItem("defined_breeze_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(DEFINED_BREEZE_BLOCK.get())));
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK_STAIRS = registerWithItem("defined_breeze_block_stairs", () -> new StairBlock(() -> (DEFINED_BREEZE_BLOCK.get()).defaultBlockState(), BlockBehaviour.Properties.copy(DEFINED_BREEZE_BLOCK.get())));
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK_WALL = registerWithItem("defined_breeze_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(DEFINED_BREEZE_BLOCK.get())));
    public static final RegistryObject<Block> RED_BRICK = registerWithItem("red_brick", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_BRICK_SLAB = registerWithItem("red_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RED_BRICK.get())));
    public static final RegistryObject<Block> RED_BRICK_STAIRS = registerWithItem("red_brick_stairs", () -> new StairBlock(() -> (RED_BRICK.get()).defaultBlockState(), BlockBehaviour.Properties.copy(RED_BRICK.get())));
    public static final RegistryObject<Block> RED_BRICK_WALL = registerWithItem("red_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(RED_BRICK.get())));
    public static final RegistryObject<Block> FINE_DIRT = registerWithItem("fine_dirt", () -> new Block(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F)));
    public static final RegistryObject<Block> FINE_SAND = registerWithItem("fine_sand", () -> new Block(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F)));
    public static final RegistryObject<Block> DRY_COBBLESTONE = registerWithItem("dry_cobblestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_BRICK = registerWithItem("black_brick", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_BRICK_SLAB = registerWithItem("black_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BLACK_BRICK.get())));
    public static final RegistryObject<Block> BLACK_BRICK_STAIRS = registerWithItem("black_brick_stairs", () -> new StairBlock(() -> (BLACK_BRICK.get()).defaultBlockState(), BlockBehaviour.Properties.copy(BLACK_BRICK.get())));
    public static final RegistryObject<Block> BLACK_BRICK_WALL = registerWithItem("black_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BLACK_BRICK.get())));
    public static final RegistryObject<Block> LIMESTONE = registerWithItem("limestone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIMESTONE_SLAB = registerWithItem("limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIMESTONE.get())));
    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerWithItem("limestone_stairs", () -> new StairBlock(() -> (LIMESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(LIMESTONE.get())));
    public static final RegistryObject<Block> STAINED_REBAR = registerWithItem("stained_rebar", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STAINED_REBAR_SLAB = registerWithItem("stained_rebar_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(STAINED_REBAR.get())));
    public static final RegistryObject<Block> STAINED_REBAR_STAIRS = registerWithItem("stained_rebar_stairs", () -> new StairBlock(() -> (STAINED_REBAR.get()).defaultBlockState(), BlockBehaviour.Properties.copy(STAINED_REBAR.get())));
    public static final RegistryObject<Block> STAINED_REBAR_WALL = registerWithItem("stained_rebar_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(STAINED_REBAR.get())));
    public static final RegistryObject<Block> VERTICAL_PLANKS = registerWithItem("vertical_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 6.0F)));
    public static final RegistryObject<Block> VERTICAL_PLANKS_SLAB = registerWithItem("vertical_planks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(VERTICAL_PLANKS.get())));
    public static final RegistryObject<Block> VERTICAL_PLANKS_STAIRS = registerWithItem("vertical_planks_stairs", () -> new StairBlock(() -> (VERTICAL_PLANKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(VERTICAL_PLANKS.get())));
    public static final RegistryObject<Block> KEEPER_DOOR = registerWithItem("keeper_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> KEEPER_TRAPDOOR = registerWithItem("keeper_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> AQUARIUM_DOOR = registerWithItem("aquarium_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<Block> AQUARIUM_TRAPDOOR = registerWithItem("aquarium_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final Map<String, RegistryObject<Block>> PLUSHIES = Util.make(new HashMap<>(), map -> {
        for (String plush : PLUSHIES_LIST)
            map.put(plush, REGISTRAR.register(plush + "_plush", () -> new PlushBlock(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).noOcclusion())));
    });


    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        WOTWItems.REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().tab(Zawa.DECORATIONS_GROUP)));
        return registryObject;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {
        RenderType cutoutMipped = RenderType.cutoutMipped();
        RenderType cutout = RenderType.cutout();
        ItemBlockRenderTypes.setRenderLayer(KEEPER_DOOR.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(KEEPER_TRAPDOOR.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(AQUARIUM_DOOR.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(AQUARIUM_TRAPDOOR.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(PLUSHIES.get("emu").get(), cutoutMipped);
    }
}
