package com.github.hellocrossy.wondersoftheworld.block;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.item.WOTWItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
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
    public static final RegistryObject<Block> CRACKED_STONE = registerWithItem("cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_STONE_SLAB = registerWithItem("cracked_stone_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> CRACKED_STONE_STAIRS = registerWithItem("cracked_stone_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) CRACKED_STONE.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> MOSSY_CRACKED_STONE = registerWithItem("mossy_cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_CRACKED_STONE_SLAB = registerWithItem("mossy_cracked_stone_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) MOSSY_CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> MOSSY_CRACKED_STONE_STAIRS = registerWithItem("mossy_cracked_stone_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) MOSSY_CRACKED_STONE.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) MOSSY_CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> LIGHT_CRACKED_STONE = registerWithItem("light_cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_CRACKED_STONE_SLAB = registerWithItem("light_cracked_stone_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) LIGHT_CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> LIGHT_CRACKED_STONE_STAIRS = registerWithItem("light_cracked_stone_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) LIGHT_CRACKED_STONE.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) LIGHT_CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> DESERT_CRACKED_STONE = registerWithItem("desert_cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DESERT_CRACKED_STONE_SLAB = registerWithItem("desert_cracked_stone_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) DESERT_CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> DESERT_CRACKED_STONE_STAIRS = registerWithItem("desert_cracked_stone_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) DESERT_CRACKED_STONE.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) DESERT_CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> MESA_CRACKED_STONE = registerWithItem("mesa_cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MESA_CRACKED_STONE_SLAB = registerWithItem("mesa_cracked_stone_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) MESA_CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> MESA_CRACKED_STONE_STAIRS = registerWithItem("mesa_cracked_stone_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) MESA_CRACKED_STONE.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) MESA_CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> ARCTIC_CRACKED_STONE = registerWithItem("arctic_cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ARCTIC_CRACKED_STONE_SLAB = registerWithItem("arctic_cracked_stone_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) ARCTIC_CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> ARCTIC_CRACKED_STONE_STAIRS = registerWithItem("arctic_cracked_stone_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) ARCTIC_CRACKED_STONE.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) ARCTIC_CRACKED_STONE.get()));
    });
    public static final RegistryObject<Block> BREEZE_BLOCK = registerWithItem("breeze_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BREEZE_BLOCK_SLAB = registerWithItem("breeze_block_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) BREEZE_BLOCK.get()));
    });
    public static final RegistryObject<Block> BREEZE_BLOCK_STAIRS = registerWithItem("breeze_block_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) BREEZE_BLOCK.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) BREEZE_BLOCK.get()));
    });
    public static final RegistryObject<Block> BREEZE_BLOCK_WALL = registerWithItem("breeze_block_wall", () -> {
        return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock) BREEZE_BLOCK.get()));
    });
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK = registerWithItem("defined_breeze_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK_SLAB = registerWithItem("defined_breeze_block_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) DEFINED_BREEZE_BLOCK.get()));
    });
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK_STAIRS = registerWithItem("defined_breeze_block_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) DEFINED_BREEZE_BLOCK.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) DEFINED_BREEZE_BLOCK.get()));
    });
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK_WALL = registerWithItem("defined_breeze_block_wall", () -> {
        return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock) DEFINED_BREEZE_BLOCK.get()));
    });
    public static final RegistryObject<Block> RED_BRICK = registerWithItem("red_brick", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_BRICK_SLAB = registerWithItem("red_brick_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) RED_BRICK.get()));
    });
    public static final RegistryObject<Block> RED_BRICK_STAIRS = registerWithItem("red_brick_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) RED_BRICK.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) RED_BRICK.get()));
    });
    public static final RegistryObject<Block> RED_BRICK_WALL = registerWithItem("red_brick_wall", () -> {
        return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock) RED_BRICK.get()));
    });
    public static final RegistryObject<Block> FINE_DIRT = registerWithItem("fine_dirt", () -> new Block(AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).harvestTool(ToolType.SHOVEL)));
    public static final RegistryObject<Block> FINE_SAND = registerWithItem("fine_sand", () -> new Block(AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).harvestTool(ToolType.SHOVEL)));
    public static final RegistryObject<Block> DRY_COBBLESTONE = registerWithItem("dry_cobblestone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_BRICK = registerWithItem("black_brick", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_BRICK_SLAB = registerWithItem("black_brick_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) BLACK_BRICK.get()));
    });
    public static final RegistryObject<Block> BLACK_BRICK_STAIRS = registerWithItem("black_brick_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) BLACK_BRICK.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) BLACK_BRICK.get()));
    });
    public static final RegistryObject<Block> BLACK_BRICK_WALL = registerWithItem("black_brick_wall", () -> {
        return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock) BLACK_BRICK.get()));
    });
    public static final RegistryObject<Block> LIMESTONE = registerWithItem("limestone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIMESTONE_SLAB = registerWithItem("limestone_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) LIMESTONE.get()));
    });
    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerWithItem("limestone_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) LIMESTONE.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) LIMESTONE.get()));
    });
    public static final RegistryObject<Block> STAINED_REBAR = registerWithItem("stained_rebar", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STAINED_REBAR_SLAB = registerWithItem("stained_rebar_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) STAINED_REBAR.get()));
    });
    public static final RegistryObject<Block> STAINED_REBAR_STAIRS = registerWithItem("stained_rebar_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) STAINED_REBAR.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) STAINED_REBAR.get()));
    });
    public static final RegistryObject<Block> STAINED_REBAR_WALL = registerWithItem("stained_rebar_wall", () -> {
        return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock) STAINED_REBAR.get()));
    });
    public static final RegistryObject<Block> VERTICAL_PLANKS = registerWithItem("vertical_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 6.0F).harvestTool(ToolType.AXE)));
    public static final RegistryObject<Block> VERTICAL_PLANKS_SLAB = registerWithItem("vertical_planks_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) VERTICAL_PLANKS.get()));
    });
    public static final RegistryObject<Block> VERTICAL_PLANKS_STAIRS = registerWithItem("vertical_planks_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) VERTICAL_PLANKS.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) VERTICAL_PLANKS.get()));
    });
    public static final RegistryObject<Block> KEEPER_DOOR = registerWithItem("keeper_door", () -> {
        return new DoorBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).noOcclusion());

    });
    public static final RegistryObject<Block> KEEPER_TRAPDOOR = registerWithItem("keeper_trapdoor", () -> {
        return new TrapDoorBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).noOcclusion());

    });
    public static final RegistryObject<Block> AQUARIUM_DOOR = registerWithItem("aquarium_door", () -> {
        return new DoorBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).noOcclusion());

    });
    public static final RegistryObject<Block> AQUARIUM_TRAPDOOR = registerWithItem("aquarium_trapdoor", () -> {
        return new TrapDoorBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).noOcclusion());

    });
    public static final RegistryObject<Block> LIGHT_GRAY_ASPHALT = registerWithItem("light_gray_asphalt", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_ASPHALT_SLAB = registerWithItem("light_gray_asphalt_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) LIGHT_GRAY_ASPHALT.get()));
    });
    public static final RegistryObject<Block> LIGHT_GRAY_ASPHALT_STAIRS = registerWithItem("light_gray_asphalt_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) LIGHT_GRAY_ASPHALT.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) LIGHT_GRAY_ASPHALT.get()));
    });
    public static final RegistryObject<Block> LIGHT_GRAY_ASPHALT_WALL = registerWithItem("light_gray_asphalt_wall", () -> {
        return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock) LIGHT_GRAY_ASPHALT.get()));
    });
    public static final RegistryObject<Block> GRAY_ASPHALT = registerWithItem("gray_asphalt", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_ASPHALT_SLAB = registerWithItem("gray_asphalt_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) GRAY_ASPHALT.get()));
    });
    public static final RegistryObject<Block> GRAY_ASPHALT_STAIRS = registerWithItem("gray_asphalt_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) GRAY_ASPHALT.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) GRAY_ASPHALT.get()));
    });
    public static final RegistryObject<Block> GRAY_ASPHALT_WALL = registerWithItem("gray_asphalt_wall", () -> {
        return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock) GRAY_ASPHALT.get()));
    });
    public static final RegistryObject<Block> WHITE_ASPHALT = registerWithItem("white_asphalt", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_ASPHALT_SLAB = registerWithItem("white_asphalt_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) WHITE_ASPHALT.get()));
    });
    public static final RegistryObject<Block> WHITE_ASPHALT_STAIRS = registerWithItem("white_asphalt_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) WHITE_ASPHALT.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) WHITE_ASPHALT.get()));
    });
    public static final RegistryObject<Block> WHITE_ASPHALT_WALL = registerWithItem("white_asphalt_wall", () -> {
        return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock) WHITE_ASPHALT.get()));
    });
    public static final RegistryObject<Block> ASPHALT = registerWithItem("asphalt", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ASPHALT_SLAB = registerWithItem("asphalt_slab", () -> {
        return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock) ASPHALT.get()));
    });
    public static final RegistryObject<Block> ASPHALT_STAIRS = registerWithItem("asphalt_stairs", () -> {
        return new StairsBlock(() -> {
            return ((Block) ASPHALT.get()).defaultBlockState();
        }, AbstractBlock.Properties.copy((AbstractBlock) ASPHALT.get()));
    });
    public static final RegistryObject<Block> ASPHALT_WALL = registerWithItem("asphalt_wall", () -> {
        return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock) ASPHALT.get()));
    });
    public static final RegistryObject<Block> TEXTURED_DIRT = registerWithItem("textured_dirt", () -> new Block(AbstractBlock.Properties.of(Material.DIRT).sound(SoundType.GRASS).strength(0.5F).harvestTool(ToolType.SHOVEL)));

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
        RenderType cutout = RenderType.cutout();
        RenderTypeLookup.setRenderLayer(KEEPER_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(KEEPER_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(AQUARIUM_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(AQUARIUM_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(PLUSHIES.get("emu").get(), cutoutMipped);
    }
}
