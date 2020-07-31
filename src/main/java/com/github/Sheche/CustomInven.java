package com.github.Sheche;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomInven implements Listener {

    private NoteblockManager plugin = NoteblockManager.getPlugin(NoteblockManager.class);

    public void onInven(Player player) {
        Inventory inven = plugin.getServer().createInventory(null, 27, "Noteblock");

        //ItemStack
        ItemStack item0 = new ItemStack(Material.MUSIC_DISC_CHIRP);
        ItemStack item1 = new ItemStack(Material.MUSIC_DISC_CHIRP);
        ItemStack item2 = new ItemStack(Material.MUSIC_DISC_BLOCKS);
        ItemStack item3 = new ItemStack(Material.MUSIC_DISC_BLOCKS);
        ItemStack item4 = new ItemStack(Material.MUSIC_DISC_13);
        ItemStack item5 = new ItemStack(Material.MUSIC_DISC_13);
        ItemStack item6 = new ItemStack(Material.MUSIC_DISC_FAR);
        ItemStack item7 = new ItemStack(Material.MUSIC_DISC_FAR);
        ItemStack item8 = new ItemStack(Material.MUSIC_DISC_CAT);
        ItemStack item9 = new ItemStack(Material.MUSIC_DISC_CAT);
        ItemStack item10 = new ItemStack(Material.MUSIC_DISC_WARD);
        ItemStack item11 = new ItemStack(Material.MUSIC_DISC_WARD);
        ItemStack item12 = new ItemStack(Material.MUSIC_DISC_WAIT);
        ItemStack item13 = new ItemStack(Material.MUSIC_DISC_WAIT);
        ItemStack item14 = new ItemStack(Material.MUSIC_DISC_MALL);
        ItemStack item15 = new ItemStack(Material.MUSIC_DISC_MALL);
        ItemStack item16 = new ItemStack(Material.MUSIC_DISC_MELLOHI);
        ItemStack item17 = new ItemStack(Material.MUSIC_DISC_MELLOHI);
        ItemStack item18 = new ItemStack(Material.MUSIC_DISC_STAL);
        ItemStack item19 = new ItemStack(Material.MUSIC_DISC_STAL);
        ItemStack item20 = new ItemStack(Material.MUSIC_DISC_STRAD);
        ItemStack item21 = new ItemStack(Material.MUSIC_DISC_STRAD);
        ItemStack item22 = new ItemStack(Material.MUSIC_DISC_PIGSTEP);
        ItemStack item23 = new ItemStack(Material.MUSIC_DISC_PIGSTEP);
        ItemStack item24 = new ItemStack(Material.MUSIC_DISC_11);
        ItemStack nullItem = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);

        //SetMeta
        ItemMeta itemMeta0 = item0.getItemMeta();
        ItemMeta itemMeta1 = item1.getItemMeta();
        ItemMeta itemMeta2 = item2.getItemMeta();
        ItemMeta itemMeta3 = item3.getItemMeta();
        ItemMeta itemMeta4 = item4.getItemMeta();
        ItemMeta itemMeta5 = item5.getItemMeta();
        ItemMeta itemMeta6 = item6.getItemMeta();
        ItemMeta itemMeta7 = item7.getItemMeta();
        ItemMeta itemMeta8 = item8.getItemMeta();
        ItemMeta itemMeta9 = item9.getItemMeta();
        ItemMeta itemMeta10 = item10.getItemMeta();
        ItemMeta itemMeta11 = item11.getItemMeta();
        ItemMeta itemMeta12 = item12.getItemMeta();
        ItemMeta itemMeta13 = item13.getItemMeta();
        ItemMeta itemMeta14 = item14.getItemMeta();
        ItemMeta itemMeta15 = item15.getItemMeta();
        ItemMeta itemMeta16 = item16.getItemMeta();
        ItemMeta itemMeta17 = item17.getItemMeta();
        ItemMeta itemMeta18 = item18.getItemMeta();
        ItemMeta itemMeta19 = item19.getItemMeta();
        ItemMeta itemMeta20 = item20.getItemMeta();
        ItemMeta itemMeta21 = item21.getItemMeta();
        ItemMeta itemMeta22 = item22.getItemMeta();
        ItemMeta itemMeta23 = item23.getItemMeta();
        ItemMeta itemMeta24 = item24.getItemMeta();
        ItemMeta nullMeta = nullItem.getItemMeta();

        //ItemName
        itemMeta0.setDisplayName(ChatColor.YELLOW + "F#");
        itemMeta1.setDisplayName(ChatColor.GREEN + "G");
        itemMeta2.setDisplayName(ChatColor.GREEN + "G#");
        itemMeta3.setDisplayName(ChatColor.GREEN + "A");
        itemMeta4.setDisplayName(ChatColor.GREEN + "A#");
        itemMeta5.setDisplayName(ChatColor.GREEN + "B");
        itemMeta6.setDisplayName(ChatColor.GREEN + "C");
        itemMeta7.setDisplayName(ChatColor.GREEN + "C#");
        itemMeta8.setDisplayName(ChatColor.GREEN + "D");
        itemMeta9.setDisplayName(ChatColor.GREEN + "D#");
        itemMeta10.setDisplayName(ChatColor.GREEN + "E");
        itemMeta11.setDisplayName(ChatColor.GREEN + "F");
        itemMeta12.setDisplayName(ChatColor.BLUE + "F#");
        itemMeta13.setDisplayName(ChatColor.BLUE + "G");
        itemMeta14.setDisplayName(ChatColor.BLUE + "G#");
        itemMeta15.setDisplayName(ChatColor.BLUE + "A");
        itemMeta16.setDisplayName(ChatColor.BLUE + "A#");
        itemMeta17.setDisplayName(ChatColor.BLUE + "B");
        itemMeta18.setDisplayName(ChatColor.BLUE + "C");
        itemMeta19.setDisplayName(ChatColor.BLUE + "C#");
        itemMeta20.setDisplayName(ChatColor.BLUE + "D");
        itemMeta21.setDisplayName(ChatColor.BLUE + "D#");
        itemMeta22.setDisplayName(ChatColor.BLUE + "E");
        itemMeta23.setDisplayName(ChatColor.BLUE + "F");
        itemMeta24.setDisplayName(ChatColor.DARK_BLUE + "F#");
        nullMeta.setDisplayName(ChatColor.WHITE + "blank");

        //Apply
        item0.setItemMeta(itemMeta0);
        item1.setItemMeta(itemMeta1);
        item2.setItemMeta(itemMeta2);
        item3.setItemMeta(itemMeta3);
        item4.setItemMeta(itemMeta4);
        item5.setItemMeta(itemMeta5);
        item6.setItemMeta(itemMeta6);
        item7.setItemMeta(itemMeta7);
        item8.setItemMeta(itemMeta8);
        item9.setItemMeta(itemMeta9);
        item10.setItemMeta(itemMeta10);
        item11.setItemMeta(itemMeta11);
        item12.setItemMeta(itemMeta12);
        item13.setItemMeta(itemMeta13);
        item14.setItemMeta(itemMeta14);
        item15.setItemMeta(itemMeta15);
        item16.setItemMeta(itemMeta16);
        item17.setItemMeta(itemMeta17);
        item18.setItemMeta(itemMeta18);
        item19.setItemMeta(itemMeta19);
        item20.setItemMeta(itemMeta20);
        item21.setItemMeta(itemMeta21);
        item22.setItemMeta(itemMeta22);
        item23.setItemMeta(itemMeta23);
        item24.setItemMeta(itemMeta24);
        nullItem.setItemMeta(nullMeta);

        //Show Items
        inven.setItem(0, item0);
        inven.setItem(1, item1);
        inven.setItem(2, item2);
        inven.setItem(3, item3);
        inven.setItem(4, item4);
        inven.setItem(5, item5);
        inven.setItem(6, item6);
        inven.setItem(7, item7);
        inven.setItem(8, item8);
        inven.setItem(9, item9);
        inven.setItem(10, item10);
        inven.setItem(11, item11);
        inven.setItem(12, item12);
        inven.setItem(13, item13);
        inven.setItem(14, item14);
        inven.setItem(15, item15);
        inven.setItem(16, item16);
        inven.setItem(17, item17);
        inven.setItem(18, item18);
        inven.setItem(19, item19);
        inven.setItem(20, item20);
        inven.setItem(21, item21);
        inven.setItem(22, item22);
        inven.setItem(23, item23);
        inven.setItem(24, item24);
        inven.setItem(25, nullItem);
        inven.setItem(26, nullItem);

        player.openInventory(inven);
    }
}
