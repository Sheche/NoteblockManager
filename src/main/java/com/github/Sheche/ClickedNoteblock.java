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
        EnumSet<Material> axes = EnumSet.of(Material.WOODEN_AXE, Material.STONE_AXE, Material.IRON_AXE, Material.GOLDEN_AXE, Material.DIAMOND_AXE, Material.NETHERITE_AXE);

        ItemStack item = player.getInventory().getItemInMainHand();

        if (action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (block != null && block.getType() == Material.NOTE_BLOCK) {
                if (player.isSneaking() && item != null && axes.contains(item.getType())) {
                    i.pitchInven(player);
                }
            }
        }
    }
}
