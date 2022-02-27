#This is just the process of how I got certain repetitive code.

for x in range(1,145):
    print('public static final RegistryObject<SoundEvent> DISC_{0:03} = DISC_SOUNDS.register("music.disc_{0:03}", () -> new SoundEvent(new ResourceLocation(MusicDiscsPlus.MOD_ID, "music.disc_{0:03}")));'.format(x))
print("done")

for x in range(1,145):
    print('public static final RegistryObject<Item> DISC_{0:03} = DISCS.register("disc_{0:03}", () -> new DiscItem(10, SoundInit.DISC_{0:03}, (new Item.Properties()).stacksTo(1).tab(MusicDiscsCreativeModeTab.MUSIC_DISC_TAB).rarity(Rarity.RARE)));'.format(x))
print("done")

for x in range(1,145):
    print('  "music.disc_{0:03}": {{'.format(x))
    print('    "sounds": [')
    print('      "musicdiscsplus:disc_{0:03}"'.format(x))
    print('      ]')
    print('  },')
print("done")

for x in range(1,145):
    print('"item.musicdiscsplus.disc_{0:03}": "Music Disc",'.format(x))
    print('"item.musicdiscsplus.disc_{0:03}.desc": "Artist - Song",'.format(x))
print("done")