package net.pupp.musicdiscsplus.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pupp.musicdiscsplus.MusicDiscsPlus;

public class MusicDiscsItem {
    public static final DeferredRegister<Item> DISCS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MusicDiscsPlus.MOD_ID);

    public static final RegistryObject<Item> DISC_001 = DISCS.register("disc_001", () -> new Item(new Item.Properties().tab(MusicDiscsCreativeModeTab.MUSIC_DISC_TAB)));

    public static void register(IEventBus eventBus) {
        DISCS.register(eventBus);
    }



}
