package com.github.Sheche;

import org.bukkit.*;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InvenClick implements Listener {

    CustomInven c = new CustomInven();

    @EventHandler
    public void invenClick(InventoryClickEvent event) {

        try {

            Player player = (Player) event.getWhoClicked();
            ItemStack item = event.getCurrentItem();
            String itemName = item.getItemMeta().getDisplayName();
            String invTitle = player.getOpenInventory().getTitle();
            Location location = player.getLocation();

            if (invTitle.equals("Pitch")) {
                event.setCancelled(true);
                NoteBlock noteBlock = (NoteBlock) player.getTargetBlock(null, 4).getBlockData();
                String instrument = noteBlock.getInstrument().toString();

                try {
                    // 1 octave
                    if (itemName.equals(ChatColor.YELLOW + "F#")) {
                        noteBlock.setNote(Note.sharp(0, Note.Tone.F));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.5f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.5f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.5f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.5f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.5f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.5f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.5f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.5f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.5f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.5f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.5f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.5f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.5f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.5f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.5f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.5f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "G")) {
                        noteBlock.setNote(Note.natural(0, Note.Tone.G));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.529732f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.529732f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.529732f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.529732f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.529732f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.529732f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.529732f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.529732f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.529732f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.529732f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.529732f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.529732f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.529732f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.529732f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.529732f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.529732f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "G#")) {
                        noteBlock.setNote(Note.sharp(0, Note.Tone.G));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.561231f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.561231f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.561231f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.561231f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.561231f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.561231f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.561231f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.561231f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.561231f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.561231f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.561231f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.561231f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.561231f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.561231f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.561231f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.561231f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "A")) {
                        noteBlock.setNote(Note.natural(0, Note.Tone.A));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.594604f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.594604f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.594604f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.594604f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.594604f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.594604f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.594604f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.594604f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.594604f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.594604f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.594604f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.594604f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.594604f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.594604f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.594604f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.594604f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "A#")) {
                        noteBlock.setNote(Note.sharp(0, Note.Tone.A));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.629961f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.629961f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.629961f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.629961f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.629961f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.629961f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.629961f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.629961f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.629961f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.629961f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.629961f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.629961f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.629961f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.629961f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.629961f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.629961f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "B")) {
                        noteBlock.setNote(Note.natural(0, Note.Tone.B));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.667420f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.667420f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.667420f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.667420f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.667420f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.667420f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.667420f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.667420f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.667420f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.667420f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.667420f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.667420f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.667420f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.667420f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.667420f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.667420f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "C")) {
                        noteBlock.setNote(Note.natural(0, Note.Tone.C));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.707107f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.707107f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.707107f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.707107f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.707107f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.707107f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.707107f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.707107f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.707107f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.707107f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.707107f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.707107f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.707107f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.707107f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.707107f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.707107f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "C#")) {
                        noteBlock.setNote(Note.sharp(0, Note.Tone.C));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.749154f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.749154f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.749154f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.749154f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.749154f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.749154f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.749154f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.749154f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.749154f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.749154f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.749154f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.749154f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.749154f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.749154f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.749154f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.749154f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "D")) {
                        noteBlock.setNote(Note.natural(0, Note.Tone.D));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.793701f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.793701f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.793701f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.793701f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.793701f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.793701f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.793701f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.793701f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.793701f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.793701f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.793701f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.793701f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.793701f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.793701f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.793701f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.793701f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "D#")) {
                        noteBlock.setNote(Note.sharp(0, Note.Tone.D));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.840896f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.840896f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.840896f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.840896f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.840896f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.840896f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.840896f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.840896f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.840896f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.840896f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.840896f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.840896f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.840896f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.840896f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.840896f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.840896f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "E")) {
                        noteBlock.setNote(Note.natural(0, Note.Tone.E));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.890899f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.890899f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.890899f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.890899f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.890899f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.890899f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.890899f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.890899f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.890899f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.890899f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.890899f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.890899f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.890899f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.890899f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.890899f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.890899f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.GREEN + "F")) {
                        noteBlock.setNote(Note.natural(0, Note.Tone.F));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 0.943874f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 0.943874f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 0.943874f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 0.943874f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 0.943874f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 0.943874f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 0.943874f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 0.943874f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 0.943874f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 0.943874f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 0.943874f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 0.943874f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 0.943874f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 0.943874f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 0.943874f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.943874f);
                                break;
                        }
                    }

                    //2 octave
                    else if (itemName.equals(ChatColor.BLUE + "F#")) {
                        noteBlock.setNote(Note.sharp(1, Note.Tone.F));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "G")) {
                        noteBlock.setNote(Note.natural(1, Note.Tone.G));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.059463f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.059463f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.059463f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.059463f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.059463f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.059463f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.059463f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.059463f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.059463f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.059463f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.059463f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.059463f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.059463f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.059463f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.059463f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.059463f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "G#")) {
                        noteBlock.setNote(Note.sharp(1, Note.Tone.G));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.122462f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.122462f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.122462f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.122462f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.122462f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.122462f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.122462f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.122462f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.122462f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.122462f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.122462f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.122462f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.122462f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.122462f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.122462f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.122462f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "A")) {
                        noteBlock.setNote(Note.natural(1, Note.Tone.A));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.189207f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.189207f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.189207f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.189207f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.189207f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.189207f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.189207f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.189207f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.189207f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.189207f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.189207f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.189207f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.189207f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.189207f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.189207f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.189207f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "A#")) {
                        noteBlock.setNote(Note.sharp(1, Note.Tone.A));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.259921f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.259921f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.259921f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.259921f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.259921f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.259921f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.259921f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.259921f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.259921f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.259921f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.259921f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.259921f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.259921f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.259921f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.259921f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.259921f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "B")) {
                        noteBlock.setNote(Note.natural(1, Note.Tone.B));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.334840f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.334840f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.334840f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.334840f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.334840f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.334840f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.334840f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.334840f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.334840f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.334840f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.334840f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.334840f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.334840f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.334840f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.334840f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.334840f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "C")) {
                        noteBlock.setNote(Note.natural(1, Note.Tone.C));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.414214f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.414214f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.414214f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.414214f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.414214f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.414214f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.414214f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.414214f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.414214f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.414214f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.414214f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.414214f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.414214f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.414214f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.414214f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.414214f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "C#")) {
                        noteBlock.setNote(Note.sharp(1, Note.Tone.C));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.498307f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.498307f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.498307f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.498307f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.498307f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.498307f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.498307f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.498307f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.498307f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.498307f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.498307f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.498307f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.498307f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.498307f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.498307f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.498307f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "D")) {
                        noteBlock.setNote(Note.natural(1, Note.Tone.D));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.587401f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.587401f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.587401f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.587401f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.587401f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.587401f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.587401f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.587401f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.587401f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.587401f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.587401f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.587401f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.587401f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.587401f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.587401f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.587401f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "D#")) {
                        noteBlock.setNote(Note.sharp(1, Note.Tone.D));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.681793f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.681793f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.681793f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.681793f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.681793f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.681793f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.681793f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.681793f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.681793f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.681793f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.681793f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.681793f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.681793f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.681793f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.681793f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.681793f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "E")) {
                        noteBlock.setNote(Note.natural(1, Note.Tone.E));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.781797f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.781797f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.781797f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.781797f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.781797f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.781797f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.781797f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.781797f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.781797f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.781797f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.781797f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.781797f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.781797f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.781797f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.781797f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.781797f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.BLUE + "F")) {
                        noteBlock.setNote(Note.natural(1, Note.Tone.F));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1.887749f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1.887749f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1.887749f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1.887749f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1.887749f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1.887749f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1.887749f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1.887749f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1.887749f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1.887749f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1.887749f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1.887749f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1.887749f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1.887749f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1.887749f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.887749f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.DARK_BLUE + "F#")) {
                        noteBlock.setNote(Note.sharp(2, Note.Tone.F));
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        switch (instrument) {
                            case "BASS_GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 2f);
                                break;
                            case "SNARE_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 2f);
                                break;
                            case "STICKS":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 2f);
                                break;
                            case "BASS_DRUM":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 2f);
                                break;
                            case "BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 2f);
                                break;
                            case "FLUTE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 2f);
                                break;
                            case "CHIME":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 2f);
                                break;
                            case "GUITAR":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 2f);
                                break;
                            case "XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 2f);
                                break;
                            case "IRON_XYLOPHONE":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 2f);
                                break;
                            case "COW_BELL":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 2f);
                                break;
                            case "DIDGERIDOO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 2f);
                                break;
                            case "BIT":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 2f);
                                break;
                            case "BANJO":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 2f);
                                break;
                            case "PLING":
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 2f);
                                break;
                            default:
                                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 2f);
                                break;
                        }
                    }

                    else if (itemName.equals(ChatColor.WHITE + "악기 설정")) {
                        player.closeInventory();
                        c.insInven(player);

                    }

                } catch (NullPointerException e) {
                    System.out.print("");
                }

            }

            else if (invTitle.equals("Instrument")) {
                event.setCancelled(true);
                NoteBlock noteBlock = (NoteBlock) player.getTargetBlock(null, 4).getBlockData();
                BlockState blockState = player.getTargetBlock(null, 4).getState();

                try {
                    if (itemName.equals(ChatColor.WHITE + "더블 베이스")) {
                        noteBlock.setInstrument(Instrument.BASS_GUITAR);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "작은 북")) {
                        noteBlock.setInstrument(Instrument.SNARE_DRUM);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "클릭 스틱")) {
                        noteBlock.setInstrument(Instrument.STICKS);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "베이스 드럼")) {
                        noteBlock.setInstrument(Instrument.BASS_DRUM);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "종")) {
                        noteBlock.setInstrument(Instrument.BELL);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "플루트")) {
                        noteBlock.setInstrument(Instrument.FLUTE);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "차임벨")) {
                        noteBlock.setInstrument(Instrument.CHIME);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "기타")) {
                        noteBlock.setInstrument(Instrument.GUITAR);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "실로폰")) {
                        noteBlock.setInstrument(Instrument.XYLOPHONE);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "철 실로폰")) {
                        noteBlock.setInstrument(Instrument.IRON_XYLOPHONE);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "카우벨")) {
                        noteBlock.setInstrument(Instrument.COW_BELL);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "디저리두")) {
                        noteBlock.setInstrument(Instrument.DIDGERIDOO);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "비트")) {
                        noteBlock.setInstrument(Instrument.BIT);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "벤조")) {
                        noteBlock.setInstrument(Instrument.BANJO);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "강한 하프")) {
                        noteBlock.setInstrument(Instrument.PLING);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "하프 / 피아노")) {
                        noteBlock.setInstrument(Instrument.PIANO);
                        player.getTargetBlock(null, 4).setBlockData(noteBlock);
                        player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1f);
                    }

                    else if (itemName.equals(ChatColor.WHITE + "음 설정")) {
                        player.closeInventory();
                        c.pitchInven(player);
                    }
                }
                catch (NullPointerException e) {
                    System.out.print("");
                }

            }
        }

        catch (NullPointerException e) {
            System.out.print("");
        }

    }
}
