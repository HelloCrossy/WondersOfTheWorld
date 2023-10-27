package com.github.hellocrossy.wondersoftheworld.item;

import com.github.hellocrossy.wondersoftheworld.WondersOfTheWorld;
import com.github.hellocrossy.wondersoftheworld.entity.WOTWEntities;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.item.ZawaEggItem;
import org.zawamod.zawa.world.item.ZawaFishBucketItem;

public class WOTWItems {
    public static final DeferredRegister<Item> REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, WondersOfTheWorld.MOD_ID);

public  static final RegistryObject<Item>
OSCAR = REGISTRAR.register("oscar", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
public static final RegistryObject<Item>
OSCAR_BUCKET = REGISTRAR.register("bucket_of_oscar", () -> new ZawaFishBucketItem(WOTWEntities.OSCAR, () -> Fluids.WATER,
        new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public  static final RegistryObject<Item>
            DISCUS_FISH = REGISTRAR.register("discus_fish", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item>
            DISCUS_FISH_BUCKET = REGISTRAR.register("bucket_of_discus", () -> new ZawaFishBucketItem(WOTWEntities.DISCUS_FISH, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item> EMU_EGG = REGISTRAR.register("emu_egg", () -> new ZawaEggItem(WOTWEntities.EMU, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> KIWI_EGG = REGISTRAR.register("kiwi_egg", () -> new ZawaEggItem(WOTWEntities.KIWI, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> TURACO_EGG = REGISTRAR.register("turaco_egg", () -> new ZawaEggItem(WOTWEntities.TURACO, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item> VULTURE_EGG = REGISTRAR.register("vulture_egg", () -> new ZawaEggItem(WOTWEntities.VULTURE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> KOOKABURRA_EGG = REGISTRAR.register("kookaburra_egg", () -> new ZawaEggItem(WOTWEntities.KOOKABURRA, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> HOOPOE_EGG = REGISTRAR.register("hoopoe_egg", () -> new ZawaEggItem(WOTWEntities.HOOPOE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> CAIMAN_EGG = REGISTRAR.register("caiman_egg", () -> new ZawaEggItem(WOTWEntities.CAIMAN, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));


}
