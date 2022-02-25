package net.pupp.musicdiscsplus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.pupp.musicdiscsplus.items.MusicDiscsItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MusicDiscsPlus.MOD_ID)
public class MusicDiscsPlus
{
    public static final String MOD_ID = "musicdiscsplus";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public MusicDiscsPlus() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MusicDiscsItem.register(eventBus);

        eventBus.addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
