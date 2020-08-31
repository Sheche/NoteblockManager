package com.github.Sheche;

import org.bukkit.*;
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
        Player player = (Player) event.getWhoClicked();
        String invTitle = player.getOpenInventory().getTitle();

        if (!invTitle.equals("Pitch") && !invTitle.equals("Instrument"))
            return;

        Location location = player.getLocation();
        ItemStack item = event.getCurrentItem();
        String itemName = null;

        if (item != null)
            itemName = item.getItemMeta().getDisplayName();


        if (invTitle.equals("Pitch")) {
            event.setCancelled(true);
            NoteBlock noteBlock = (NoteBlock) player.getTargetBlock(null, 4).getBlockData();
            String instrument = noteBlock.getInstrument().toString();

            // 1 octave
            if (itemName != null) {
                if (itemName.equals(ChatColor.YELLOW + "F#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.5f);
                } else if (itemName.equals(ChatColor.GREEN + "G")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.529732f);
                } else if (itemName.equals(ChatColor.GREEN + "G#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.561231f);
                } else if (itemName.equals(ChatColor.GREEN + "A")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.594604f);
                } else if (itemName.equals(ChatColor.GREEN + "A#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.629961f);
                } else if (itemName.equals(ChatColor.GREEN + "B")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.B));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.667420f);
                } else if (itemName.equals(ChatColor.GREEN + "C")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.707107f);
                } else if (itemName.equals(ChatColor.GREEN + "C#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.749154f);
                } else if (itemName.equals(ChatColor.GREEN + "D")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.793701f);
                } else if (itemName.equals(ChatColor.GREEN + "D#")) {
                    noteBlock.setNote(Note.sharp(0, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.840896f);
                } else if (itemName.equals(ChatColor.GREEN + "E")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.E));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.890899f);
                } else if (itemName.equals(ChatColor.GREEN + "F")) {
                    noteBlock.setNote(Note.natural(0, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 0.943874f);
                }

                //2 octave
                else if (itemName.equals(ChatColor.BLUE + "F#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1f);
                } else if (itemName.equals(ChatColor.BLUE + "G")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.059463f);
                } else if (itemName.equals(ChatColor.BLUE + "G#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.G));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.122462f);
                } else if (itemName.equals(ChatColor.BLUE + "A")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.189207f);
                } else if (itemName.equals(ChatColor.BLUE + "A#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.A));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.259921f);
                } else if (itemName.equals(ChatColor.BLUE + "B")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.B));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.334840f);
                } else if (itemName.equals(ChatColor.BLUE + "C")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.414214f);
                } else if (itemName.equals(ChatColor.BLUE + "C#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.C));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.498307f);
                } else if (itemName.equals(ChatColor.BLUE + "D")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.587401f);
                } else if (itemName.equals(ChatColor.BLUE + "D#")) {
                    noteBlock.setNote(Note.sharp(1, Note.Tone.D));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.681793f);
                } else if (itemName.equals(ChatColor.BLUE + "E")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.E));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.781797f);
                } else if (itemName.equals(ChatColor.BLUE + "F")) {
                    noteBlock.setNote(Note.natural(1, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 1.887749f);
                } else if (itemName.equals(ChatColor.DARK_BLUE + "F#")) {
                    noteBlock.setNote(Note.sharp(2, Note.Tone.F));
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    pSound(player, instrument, 2f);
                } else if (itemName.equals(ChatColor.WHITE + "악기 설정")) {
                    player.closeInventory();
                    c.insInven(player);
                }

            }
        } else if (invTitle.equals("Instrument")) {
            event.setCancelled(true);
            NoteBlock noteBlock = (NoteBlock) player.getTargetBlock(null, 4).getBlockData();
            if (itemName != null) {
                if (itemName.equals(ChatColor.WHITE + "더블 베이스")) {
                    noteBlock.setInstrument(Instrument.BASS_GUITAR);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "작은 북")) {
                    noteBlock.setInstrument(Instrument.SNARE_DRUM);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "클릭 스틱")) {
                    noteBlock.setInstrument(Instrument.STICKS);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "베이스 드럼")) {
                    noteBlock.setInstrument(Instrument.BASS_DRUM);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "종")) {
                    noteBlock.setInstrument(Instrument.BELL);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "플루트")) {
                    noteBlock.setInstrument(Instrument.FLUTE);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "차임벨")) {
                    noteBlock.setInstrument(Instrument.CHIME);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "기타")) {
                    noteBlock.setInstrument(Instrument.GUITAR);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "실로폰")) {
                    noteBlock.setInstrument(Instrument.XYLOPHONE);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "철 실로폰")) {
                    noteBlock.setInstrument(Instrument.IRON_XYLOPHONE);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "카우벨")) {
                    noteBlock.setInstrument(Instrument.COW_BELL);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "디저리두")) {
                    noteBlock.setInstrument(Instrument.DIDGERIDOO);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "비트")) {
                    noteBlock.setInstrument(Instrument.BIT);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "벤조")) {
                    noteBlock.setInstrument(Instrument.BANJO);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "강한 하프")) {
                    noteBlock.setInstrument(Instrument.PLING);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "하프 / 피아노")) {
                    noteBlock.setInstrument(Instrument.PIANO);
                    player.getTargetBlock(null, 4).setBlockData(noteBlock);
                    player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, 1f);
                } else if (itemName.equals(ChatColor.WHITE + "음 설정")) {
                    player.closeInventory();
                    c.pitchInven(player);
                }

            }
        }
    }

    public void pSound(Player player, String name, float pitch) {
        Location location = player.getLocation();
        switch (name) {
            case "BASS_GUITAR":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASS, 100, pitch);
                break;
            case "SNARE_DRUM":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_SNARE, 100, pitch);
                break;
            case "STICKS":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HAT, 100, pitch);
                break;
            case "BASS_DRUM":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 100, pitch);
                break;
            case "BELL":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BELL, 100, pitch);
                break;
            case "FLUTE":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_FLUTE, 100, pitch);
                break;
            case "CHIME":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_CHIME, 100, pitch);
                break;
            case "GUITAR":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 100, pitch);
                break;
            case "XYLOPHONE":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 100, pitch);
                break;
            case "IRON_XYLOPHONE":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 100, pitch);
                break;
            case "COW_BELL":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 100, pitch);
                break;
            case "DIDGERIDOO":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_DIDGERIDOO, 100, pitch);
                break;
            case "BIT":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BIT, 100, pitch);
                break;
            case "BANJO":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_BANJO, 100, pitch);
                break;
            case "PLING":
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_PLING, 100, pitch);
                break;
            default:
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_HARP, 100, pitch);
                break;
        }
    }
}
