package com.github.Sheche;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Note;
import org.bukkit.Sound;
import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InvenClick implements Listener {

    @EventHandler
    public void invenClick(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();
        ItemStack item = event.getCurrentItem();

        Location location = player.getLocation();

        if (player.getOpenInventory().getTitle().equals("Noteblock")) {
            event.setCancelled(true);
            NoteBlock noteBlock = (NoteBlock) player.getTargetBlock(null, 4).getBlockData();
            String instrument = noteBlock.getInstrument().toString();

            try {
                // 1 octave
                if (item.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "F#")) {
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

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "G")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.529732f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "G#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.561231f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "A")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.594604f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "A#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.629961f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "B")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.B));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.667420f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "C")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.707107f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "C#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.749154f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "D")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.793701f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "D#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.840896f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "E")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.E));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.890899f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "F")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 0.943874f);
                }

                //2 octave
                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "F#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "G")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.059463f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "G#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.122462f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "A")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.189207f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "A#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.259921f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "B")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.B));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.334840f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "C")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.414214f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "C#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.498307f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "D")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.587401f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "D#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.681793f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "E")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.E));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.781797f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "F")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1.887749f);
                }

                else if (item.getItemMeta().getDisplayName().equals(ChatColor.DARK_BLUE + "F#")) {
                    noteBlock.setNote(Note.sharp(2, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 2f);
                }

                //null
                else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "blank")) {
                    player.sendMessage(ChatColor.WHITE + "Please select a Note.");
                }
            } catch (NullPointerException e) {
                System.out.print("");
            }

        }
    }
}
