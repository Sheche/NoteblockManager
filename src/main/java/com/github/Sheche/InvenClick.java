package com.github.Sheche;

import org.bukkit.ChatColor;
import org.bukkit.Note;
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

        if (player.getOpenInventory().getTitle().equals("Noteblock")) {
            event.setCancelled(true);
            NoteBlock noteBlock = (NoteBlock) player.getTargetBlock(null, 4).getBlockData();
            try {
                // 1 octave
                if (item.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "F#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "G")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                }  else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "G#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "A")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "A#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "B")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.B));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "C")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "C#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "D")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "D#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "E")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.E));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "F")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                }

                //2 octave
                else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "F#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "G")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "G#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "A")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "A#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "B")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.B));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "C")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "C#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "D")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "D#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "E")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.E));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "F")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
                } else if (item.getItemMeta().getDisplayName().equals(ChatColor.DARK_BLUE + "F#")) {
                    noteBlock.setNote(Note.sharp(2, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.closeInventory();
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
