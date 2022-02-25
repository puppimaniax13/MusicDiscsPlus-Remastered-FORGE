package net.pupp.musicdiscsplus.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MusicDiscsCreativeModeTab {
    public static final CreativeModeTab MUSIC_DISC_TAB = new CreativeModeTab("discstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MusicDiscsItem.DISC_001.get());
        }
    };
}
