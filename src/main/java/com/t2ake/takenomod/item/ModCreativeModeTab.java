package com.t2ake.takenomod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAKENOMOD_TAB = new CreativeModeTab("takenomodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HAND.get());
        }
    };

}
