package net.pupp.musicdiscsplus.items;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pupp.musicdiscsplus.MusicDiscsPlus;
import net.minecraft.world.item.RecordItem;

public class MusicDiscsItem {
    public static final DeferredRegister<Item> DISCS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MusicDiscsPlus.MOD_ID);

    public static final RegistryObject<Item> DISC_001 = DISCS.register("disc_001", () -> new DiscItem(10, DISC_001));

    public static void register(IEventBus eventBus) {
        DISCS.register(eventBus);
    }

}
