package net.pupp.musicdiscsplus.items;

import cpw.mods.util.Lazy;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.pupp.musicdiscsplus.MusicDiscsPlus;


public class MusicDiscsSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND = new DefferredRegister<>(ForgeRegistries.SOUND_EVENTS, MusicDiscsPlus.MOD_ID);

    public static final Lazy<SoundEvent> DISC_LAZY = Lazy.of(() -> new SoundEvent(new ResourceLocation(MusicDiscsPlus.MOD_ID, "item.disc")));

    public static final RegistryEvent<SoundEvent> DISC_001 = SOUNDS.register("item.disc.disc_001", DISC_LAZY);
}
