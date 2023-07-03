package com.t2ake.takenomod.block;

import com.t2ake.takenomod.Takenomod;
import com.t2ake.takenomod.item.ModCreativeModeTab;
import com.t2ake.takenomod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Takenomod.MOD_ID);

    public static  final RegistryObject<Block> HAND_BLOCK = registerBlock("hand_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.2f)), ModCreativeModeTab.TAKENOMOD_TAB);

    public static  final RegistryObject<Block> ONE_HAND_BLOCK = registerBlock("one_hand_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.1f)), ModCreativeModeTab.TAKENOMOD_TAB);
    public static  final RegistryObject<Block> TWO_HAND_BLOCK = registerBlock("two_hand_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.15f)), ModCreativeModeTab.TAKENOMOD_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn =BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends  Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
