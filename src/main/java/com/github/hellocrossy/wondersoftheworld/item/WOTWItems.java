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
import org.zawamod.zawa.world.item.PlushBlockItem;
import org.zawamod.zawa.world.item.ZawaEggItem;

import java.util.ArrayList;
import java.util.List;

import static com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld.PLUSHIES_LIST;

public class WOTWItems {
    public static final DeferredRegister<Item> ITEMS_REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, WondersOfTheWorld.MOD_ID);
    public static final DeferredRegister<Item> DECORATIONS_REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, WondersOfTheWorld.MOD_ID);

    public static final List<RegistryObject<Item>> PLUSHIES = Util.make(new ArrayList<>(), list -> {
        for (String plush : PLUSHIES_LIST)
            list.add(DECORATIONS_REGISTRAR.register(plush + "_plush", () -> new PlushBlockItem(WOTWBlocks.PLUSHIES.get(plush).get(), new Item.Properties())));
    });

    public static final RegistryObject<Item> OSCAR = ITEMS_REGISTRAR.register("oscar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSCAR_BUCKET = ITEMS_REGISTRAR.register("bucket_of_oscar", () -> new MobBucketItem(WOTWEntities.OSCAR, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DISCUS_FISH = ITEMS_REGISTRAR.register("discus_fish", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TETRA = ITEMS_REGISTRAR.register("tetra", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLOWERHORN_CICHILID = ITEMS_REGISTRAR.register("flowerhorn_cichlid", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DISCUS_FISH_BUCKET = ITEMS_REGISTRAR.register("bucket_of_discus", () -> new MobBucketItem(WOTWEntities.DISCUS_FISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TETRA_BUCKET = ITEMS_REGISTRAR.register("bucket_of_tetra", () -> new MobBucketItem(WOTWEntities.TETRA, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> FLOWERHORN_CICHILID_BUCKET = ITEMS_REGISTRAR.register("bucket_of_flowerhorn_cichlid", () -> new MobBucketItem(WOTWEntities.FLOWERHORN_CICHILID, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> KILLIFISH = ITEMS_REGISTRAR.register("killifish", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KILLIFISH_BUCKET = ITEMS_REGISTRAR.register("bucket_of_killifish", () -> new MobBucketItem(WOTWEntities.KILLIFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> EMU_EGG = ITEMS_REGISTRAR.register("emu_egg", () -> new ZawaEggItem(WOTWEntities.EMU, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> KIWI_EGG = ITEMS_REGISTRAR.register("kiwi_egg", () -> new ZawaEggItem(WOTWEntities.KIWI, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> HOOPOE_EGG = ITEMS_REGISTRAR.register("hoopoe_egg", () -> new ZawaEggItem(WOTWEntities.HOOPOE, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> CAIMAN_EGG = ITEMS_REGISTRAR.register("caiman_egg", () -> new ZawaEggItem(WOTWEntities.CAIMAN, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MANAKIN_EGG = ITEMS_REGISTRAR.register("manakin_egg", () -> new ZawaEggItem(WOTWEntities.MANAKIN, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> QUETZAL_EGG = ITEMS_REGISTRAR.register("quetzal_egg", () -> new ZawaEggItem(WOTWEntities.QUETZAL, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> HAMMERKOP_EGG = ITEMS_REGISTRAR.register("hammerkop_egg", () -> new ZawaEggItem(WOTWEntities.HAMMERKOP, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SOUTHERN_CARACARA_EGG = ITEMS_REGISTRAR.register("southern_caracara_egg", () -> new ZawaEggItem(WOTWEntities.SOUTHERN_CARACARA, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GABOON_VIPER_EGG = ITEMS_REGISTRAR.register("gaboon_viper_egg", () -> new ZawaEggItem(WOTWEntities.GABOON_VIPER, new Item.Properties().stacksTo(16)));
}
