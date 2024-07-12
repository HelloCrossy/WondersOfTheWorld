package com.github.hellocrossy.wondersoftheworld.block;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.item.WOTWItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
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
import static net.minecraft.item.ItemModelsProperties.register;

public class WOTWBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, WondersOfTheWorld.MOD_ID);

    public static final RegistryObject<Block> CRACKED_STONE = registerWithItem("cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_CRACKED_STONE = registerWithItem("mossy_cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_CRACKED_STONE = registerWithItem("light_cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DESERT_CRACKED_STONE = registerWithItem("desert_cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MESA_CRACKED_STONE = registerWithItem("mesa_cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ARCTIC_CRACKED_STONE = registerWithItem("arctic_cracked_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BREEZE_BLOCK = registerWithItem("breeze_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BREEZE_BLOCK_SLAB = registerWithItem("breeze_block_slab", () -> {return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock)BREEZE_BLOCK.get()));});
    public static final RegistryObject<Block> BREEZE_BLOCK_STAIRS = registerWithItem("breeze_block_stairs", () -> {return new StairsBlock(() -> {return ((Block)BREEZE_BLOCK.get()).defaultBlockState();}, AbstractBlock.Properties.copy((AbstractBlock)BREEZE_BLOCK.get()));});
    public static final RegistryObject<Block> BREEZE_BLOCK_WALL = registerWithItem("breeze_block_wall", () -> {return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock)BREEZE_BLOCK.get()));});
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK = registerWithItem("defined_breeze_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK_SLAB = registerWithItem("defined_breeze_block_slab", () -> {return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock)DEFINED_BREEZE_BLOCK.get()));});
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK_STAIRS = registerWithItem("defined_breeze_block_stairs", () -> {return new StairsBlock(() -> {return ((Block)DEFINED_BREEZE_BLOCK.get()).defaultBlockState();}, AbstractBlock.Properties.copy((AbstractBlock)DEFINED_BREEZE_BLOCK.get()));});
    public static final RegistryObject<Block> DEFINED_BREEZE_BLOCK_WALL = registerWithItem("defined_breeze_block_wall", () -> {return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock)DEFINED_BREEZE_BLOCK.get()));});
    public static final RegistryObject<Block> RED_BRICK = registerWithItem("red_brick", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_BRICK_SLAB = registerWithItem("red_brick_slab", () -> {return new SlabBlock(AbstractBlock.Properties.copy((AbstractBlock)RED_BRICK.get()));});
    public static final RegistryObject<Block> RED_BRICK_STAIRS = registerWithItem("red_brick_stairs", () -> {return new StairsBlock(() -> {return ((Block)RED_BRICK.get()).defaultBlockState();}, AbstractBlock.Properties.copy((AbstractBlock)RED_BRICK.get()));});
    public static final RegistryObject<Block> RED_BRICK_WALL = registerWithItem("red_brick_wall", () -> {return new WallBlock(AbstractBlock.Properties.copy((AbstractBlock)RED_BRICK.get()));});
    public static final RegistryObject<Block> FINE_DIRT = registerWithItem("fine_dirt", () -> new Block(AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).harvestTool(ToolType.SHOVEL)));
    public static final RegistryObject<Block> FINE_SAND = registerWithItem("fine_sand", () -> new Block(AbstractBlock.Properties.of(Material.SAND).sound(SoundType.SAND).strength(0.5F).harvestTool(ToolType.SHOVEL)));
    public static final RegistryObject<Block> DRY_COBBLESTONE = registerWithItem("dry_cobblestone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
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
