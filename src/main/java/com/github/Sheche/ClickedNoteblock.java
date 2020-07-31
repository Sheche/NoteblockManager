package com.github.Sheche;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.EnumSet;

public class ClickedNoteblock implements Listener {

    @EventHandler
    public void onClickedNoteblock(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        CustomInven i = new CustomInven();

        ItemStack item = player.getInventory().getItemInMainHand();

        if (action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (block.getType().equals(Material.NOTE_BLOCK)) {
                if (player.isSneaking()) {
                    if (item.getType().equals(Material.WOODEN_AXE)) {
                        i.onInven(player);
                    } else if (item.getType().equals(Material.STONE_AXE)) {
                        i.onInven(player);
                    } else if (item.getType().equals(Material.IRON_AXE)) {
                        i.onInven(player);
                    } else if (item.getType().equals(Material.GOLDEN_AXE)) {
                        i.onInven(player);
                    } else if (item.getType().equals(Material.DIAMOND_AXE)) {
                        i.onInven(player);
                    } else if (item.getType().equals(Material.NETHERITE_AXE)) {
                        i.onInven(player);
                    }
                }
            }
        }
    }
}
