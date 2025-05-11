package com.github.hellocrossy.wondersoftheworld.item;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.block.WOTWBlocks;
import com.github.hellocrossy.wondersoftheworld.entity.WOTWEntities;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.item.PlushBlockItem;
import org.zawamod.zawa.world.item.ZawaEggItem;

import java.util.ArrayList;
import java.util.List;

import static com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld.PLUSHIES_LIST;

public class WOTWItems {
    public static final DeferredRegister<Item> REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, WondersOfTheWorld.MOD_ID);

    public static final List<RegistryObject<Item>> PLUSHIES = Util.make(new ArrayList<>(), list -> {
        for (String plush : PLUSHIES_LIST)
            list.add(REGISTRAR.register(plush + "_plush", () -> new PlushBlockItem(WOTWBlocks.PLUSHIES.get(plush).get(), new Item.Properties().tab(Zawa.DECORATIONS_GROUP))));
    });

    public static final RegistryObject<Item>
            OSCAR = REGISTRAR.register("oscar", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            OSCAR_BUCKET = REGISTRAR.register("bucket_of_oscar", () -> new MobBucketItem(WOTWEntities.OSCAR, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            DISCUS_FISH = REGISTRAR.register("discus_fish", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            TETRA = REGISTRAR.register("tetra", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            FLOWERHORN_CICHILID = REGISTRAR.register("flowerhorn_cichlid", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            DISCUS_FISH_BUCKET = REGISTRAR.register("bucket_of_discus", () -> new MobBucketItem(WOTWEntities.DISCUS_FISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            TETRA_BUCKET = REGISTRAR.register("bucket_of_tetra", () -> new MobBucketItem(WOTWEntities.TETRA, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            FLOWERHORN_CICHILID_BUCKET = REGISTRAR.register("bucket_of_flowerhorn_cichlid", () -> new MobBucketItem(WOTWEntities.FLOWERHORN_CICHILID, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            KILLIFISH = REGISTRAR.register("killifish", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            KILLIFISH_BUCKET = REGISTRAR.register("bucket_of_killifish", () -> new MobBucketItem(WOTWEntities.KILLIFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item> EMU_EGG = REGISTRAR.register("emu_egg", () -> new ZawaEggItem(WOTWEntities.EMU, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> KIWI_EGG = REGISTRAR.register("kiwi_egg", () -> new ZawaEggItem(WOTWEntities.KIWI, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> HOOPOE_EGG = REGISTRAR.register("hoopoe_egg", () -> new ZawaEggItem(WOTWEntities.HOOPOE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> CAIMAN_EGG = REGISTRAR.register("caiman_egg", () -> new ZawaEggItem(WOTWEntities.CAIMAN, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> MANAKIN_EGG = REGISTRAR.register("manakin_egg", () -> new ZawaEggItem(WOTWEntities.MANAKIN, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> QUETZAL_EGG = REGISTRAR.register("quetzal_egg", () -> new ZawaEggItem(WOTWEntities.QUETZAL, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> HAMMERKOP_EGG = REGISTRAR.register("hammerkop_egg", () -> new ZawaEggItem(WOTWEntities.HAMMERKOP, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));


}
