package com.github.hellocrossy.wondersoftheworld.item;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.block.WOTWBlocks;
import com.github.hellocrossy.wondersoftheworld.entity.WOTWEntities;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.item.PlushBlockItem;
import org.zawamod.zawa.world.item.ZawaEggItem;
import org.zawamod.zawa.world.item.ZawaFishBucketItem;

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
            OSCAR_BUCKET = REGISTRAR.register("bucket_of_oscar", () -> new ZawaFishBucketItem(WOTWEntities.OSCAR, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            DISCUS_FISH = REGISTRAR.register("discus_fish", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            TETRA = REGISTRAR.register("tetra", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            FLOWERHORN_CICHILID = REGISTRAR.register("flowerhorn_cichlid", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            DISCUS_FISH_BUCKET = REGISTRAR.register("bucket_of_discus", () -> new ZawaFishBucketItem(WOTWEntities.DISCUS_FISH, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            TETRA_BUCKET = REGISTRAR.register("bucket_of_tetra", () -> new ZawaFishBucketItem(WOTWEntities.TETRA, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item>
            FLOWERHORN_CICHILID_BUCKET = REGISTRAR.register("bucket_of_flowerhorn_cichlid", () -> new ZawaFishBucketItem(WOTWEntities.FLOWERHORN_CICHILID, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            KILLIFISH = REGISTRAR.register("killifish", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            KILLIFISH_BUCKET = REGISTRAR.register("bucket_of_killifish", () -> new ZawaFishBucketItem(WOTWEntities.KILLIFISH, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item> EMU_EGG = REGISTRAR.register("emu_egg", () -> new ZawaEggItem(WOTWEntities.EMU, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> KIWI_EGG = REGISTRAR.register("kiwi_egg", () -> new ZawaEggItem(WOTWEntities.KIWI, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> EURASIAN_HOOPOE_EGG = REGISTRAR.register("eurasian_hoopoe_egg", () -> new ZawaEggItem(WOTWEntities.EURASIAN_HOOPOE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> SPECTACLED_CAIMAN_EGG = REGISTRAR.register("spectacled_caiman_egg", () -> new ZawaEggItem(WOTWEntities.SPECTACLED_CAIMAN, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> MANAKIN_EGG = REGISTRAR.register("manakin_egg", () -> new ZawaEggItem(WOTWEntities.MANAKIN, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> QUETZAL_EGG = REGISTRAR.register("quetzal_egg", () -> new ZawaEggItem(WOTWEntities.QUETZAL, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> HAMMERKOP_EGG = REGISTRAR.register("hammerkop_egg", () -> new ZawaEggItem(WOTWEntities.HAMMERKOP, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> SOUTHERN_CARACARA_EGG = REGISTRAR.register("southern_caracara_egg", () -> new ZawaEggItem(WOTWEntities.SOUTHERN_CARACARA, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> GABOON_VIPER_EGG = REGISTRAR.register("gaboon_viper_egg", () -> new ZawaEggItem(WOTWEntities.GABOON_VIPER, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));


}
