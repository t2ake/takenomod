package com.t2ake.takenomod.item;

import com.t2ake.takenomod.Takenomod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Takenomod.MOD_ID);

    public static final RegistryObject<Item> HAND = ITEMS.register("hand",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAKENOMOD_TAB)));

    public static final RegistryObject<Item> HAND_LEFT = ITEMS.register("hand_left",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAKENOMOD_TAB)));

//    public static final RegistryObject<BlockItem> HAND_BLOCK =

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
