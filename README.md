# Music Discs Plus (Forge) [![Versions](https://cf.way2muchnoise.eu/versions/musicdiscsplus_all.svg)](https://www.curseforge.com/minecraft/mc-mods/musicdiscsplus) [![Downloads](https://cf.way2muchnoise.eu/full_musicdiscsplus_downloads.svg)](https://www.curseforge.com/minecraft/mc-mods/musicdiscsplus)

[![Latest Release](https://img.shields.io/github/v/release/puppimaniax13/MusicDiscsPlus-Remastered?color=pink&style=for-the-badge)]()[![File Size](https://img.shields.io/github/repo-size/puppimaniax13/MusicDiscsPlus-Remastered?color=pink&style=for-the-badge)]()[![Most Recent Commit](https://img.shields.io/github/last-commit/puppimaniax13/MusicDiscsPlus-Remastered?color=pink&style=for-the-badge)]()[![License](https://img.shields.io/github/license/puppimaniax13/MusicDiscsPlus-Remastered?color=pink&style=for-the-badge)](https://github.com/puppimaniax13/MusicDiscsPlus-Remastered/blob/main/LICENSE)

This mod will add a variety of music discs with songs provided by you! Resource pack dependant!

## How to Customize Your Resource Pack
First you will want to download the [resource pack](https://github.com/puppimaniax13/MusicDiscsPlus-Resource-Pack). In order to edit it you will need to extract the files, **Windows** should allow you to do so without any 3rd party program, just right-click on the folder and click ***Extract All***. If you do not have this then you will need to use a third party program to extract the files such as *WinRA*R or *7ZIP*.

__________________________________________________________________________________________________________________

### Once you first open the resource pack you will see *3 Files*.

To change the **Icon** of the texture pack in Minecraft, replace the [**pack.png**](https://github.com/puppimaniax13/MusicDiscsPlus-Resource-Pack/blob/main/MusicDiscsPlusResourcePack/pack.png) with your own ***.png***. Make sure to change the name of your file to "**pack.png**" otherwise it will not work.


To change the **Description** open [**pack.mcmeta**](https://github.com/puppimaniax13/MusicDiscsPlus-Resource-Pack/blob/main/MusicDiscsPlusResourcePack/pack.mcmeta) with a text editor (such as Notepad, or [Sublime](https://www.sublimetext.com/)).

```json
{
  "pack": {
    "pack_format": 8,
    "description": "MusicDiscsPlus by: pupP"
  }
}
```
**pack_format** is to change the [version of Minecraft](https://minecraft.fandom.com/wiki/Resource_Pack#Pack_format) the Resource Pack is for.  
**description** is to change what shows up as the Resource Pack's description. To change the color of the pack you can use [Minecraft Color Codes](https://minecraft.fandom.com/wiki/Formatting_codes#Color_codes).

The third file is a folder titled **assets**. Open that folder, and you will find another folder, this one titled **musicdiscsplus-pupp**. Open that folder as well.

Now you will see **3 Folders**
1. **lang**
2. **sounds**
3. **textures**

_______________________

### Sounds
When opening the **sounds** folder you will find ***9 .ogg files***. It will be a list from **disc_001.ogg** through **disc_009.ogg**. These are example songs of how you should format your songs. This will also be the folder in which you place your songs.

#### How to get a song
I would recommend downloading your songs through a **YouTube to MP3** website. You can google search for such websites.

Once you have your file as a **.mp3** you will need to do a couple more things. Minecraft can only read ***.ogg*** file extensions for sound, so we will need to make your **.mp3** into a **.ogg**. You can use some software to do this. I use [**Audacity**](https://www.audacityteam.org/download/). I will be showing you how to save as a **.ogg** in the next step.

There are two formats of music when playing from a Jukebox, **Mono** and **Stereo**.
- **Mono** will allow your song to be played normally in a Jukebox, the farther away you get from the Jukebox the quieter the sound gets.
- **Stereo** allows the music played from the Jukebox to be heard throughout the whole world, as long as the Jukebox is in a loaded chunk.

If you want your Music Disc to be **Mono** then you will need a program to change the **.mp3** file from stereo to mono, and save it as a **.ogg**.
This is a demo of how to do such in [**Audacity**](https://www.audacityteam.org/download/).

![Demo](/disc_ogg_help.gif)

#### Most Important - Save your file as "disc_###" otherwise it will not be playable in minecraft!
______________

### Textures

When you open the **textures** file you will see another file called "**items**", open that as well. Inside **items** you will see 144 files that are labeled as **disc_001** through **disc_144**. These are how the music discs show up in Minecraft.

To edit the textures you can use an online Sprite maker such as [PixilArt](https://www.pixilart.com/). You can make it look as different or similar as you like. Try to keep the file size the same as 16x16 pixels, otherwise the resource pack size will start to grow with larger file sizes.

#### Make sure to save the file as "disc_###" otherwise the texture will not be replaced.

______________

### Lang
When opening the **lang** folder you will find a file titled [**en_us.json**](https://github.com/puppimaniax13/MusicDiscsPlus-Resource-Pack/blob/main/MusicDiscsPlusResourcePack/assets/musicdiscsplus-pupp/lang/en_us.json). To edit this you will once again need some form of text editor that can open ***.json*** files. When you open **en_us.json** it will look similar to this.
```json
{
"item.musicdiscsplus-pupp.disc_001.desc": "The King Chameleon - sad dream",
"item.musicdiscsplus-pupp.disc_002.desc": "Oblivion Remix",
"item.musicdiscsplus-pupp.disc_003.desc": "Boards of Canada - Reach for the Dead",
"item.musicdiscsplus-pupp.disc_004.desc": "Ben Prunty - Color Sky",
"item.musicdiscsplus-pupp.disc_005.desc": "The Flash Bulb - Morning Cathedral",
"item.musicdiscsplus-pupp.disc_006.desc": "Ben Prunty - Night Zen",
"item.musicdiscsplus-pupp.disc_007.desc": "Ben Prunty - Old War Machines",
"item.musicdiscsplus-pupp.disc_008.desc": "Ben Prunty - Last Stand",
"item.musicdiscsplus-pupp.disc_009.desc": "Ben Prunty - Space Cruise (Title)",
"item.musicdiscsplus-pupp.disc_010.desc": "Artist - Song Name",
...}
```
You can format how you want the music disc to be displayed with this code. Each name will correspond with what you put for the music in the sounds file. The proper Minecraft formatting would be `"Artist - Song Name"`

#### Do this for each song that you add to keep track of which disc they are inside of Minecraft.

____________

## Contributors

At the moment I am a Solo-Developer, a team/group would be nice to work with. I do not have a discord server either but feel free to contact me if you want to start or have me join your team. Any role would be nice, even someone to maintain a discord server.
