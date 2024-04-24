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
            DISCUS_FISH_BUCKET = REGISTRAR.register("bucket_of_discus", () -> new ZawaFishBucketItem(WOTWEntities.DISCUS_FISH, () -> Fluids.WATER,
            new Item.Properties().stacksTo(1).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item> EMU_EGG = REGISTRAR.register("emu_egg", () -> new ZawaEggItem(WOTWEntities.EMU, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> KIWI_EGG = REGISTRAR.register("kiwi_egg", () -> new ZawaEggItem(WOTWEntities.KIWI, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item> HOOPOE_EGG = REGISTRAR.register("hoopoe_egg", () -> new ZawaEggItem(WOTWEntities.HOOPOE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));


}
