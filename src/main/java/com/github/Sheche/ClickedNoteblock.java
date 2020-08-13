package com.github.Sheche;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ClickedNoteblock implements Listener {

    @EventHandler
    public void onClickedNoteblock(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        CustomInven i = new CustomInven();

        ItemStack item = player.getInventory().getItemInMainHand();

        if (action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (block.getType() == Material.NOTE_BLOCK) {
                if (player.isSneaking()) {
                    if (item.getType() == Material.WOODEN_AXE) {
                        i.pitchInven(player);
                    }

                    else if (item.getType() == Material.STONE_AXE) {
                        i.pitchInven(player);
                    }

                    else if (item.getType() == Material.IRON_AXE) {
                        i.pitchInven(player);
                    }

                    else if (item.getType() == Material.GOLDEN_AXE) {
                        i.pitchInven(player);
                    }

                    else if (item.getType() == Material.DIAMOND_AXE) {
                        i.pitchInven(player);
                    }

                    else if (item.getType() == Material.NETHERITE_AXE) {
                        i.pitchInven(player);
                    }

                    else if (item.getType() == Material.GOLDEN_SWORD) {
                        i.insInven(player);
                    }
                }
            }
        }
    }
}
