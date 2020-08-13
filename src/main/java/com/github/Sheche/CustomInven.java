package com.github.Sheche;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomInven implements Listener {

    public void pitchInven(Player player) {
        Inventory inven = Bukkit.createInventory(null, 27, "Pitch");

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
        ItemStack nullItem = new ItemStack(Material.BLACK_CONCRETE);
        ItemStack tester = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);

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
        ItemMeta tMeta = tester.getItemMeta();

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
        nullMeta.setDisplayName(ChatColor.WHITE + "악기 설정");
        tMeta.setDisplayName(ChatColor.WHITE + "테스터: LunaXena");

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
        tester.setItemMeta(tMeta);

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
        inven.setItem(26, tester);

        player.openInventory(inven);
    }

    public void insInven(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 18, "Instrument");

        ItemStack item0 = new ItemStack(Material.OAK_LOG);
        ItemStack item1 = new ItemStack(Material.SAND);
        ItemStack item2 = new ItemStack(Material.GLASS);
        ItemStack item3 = new ItemStack(Material.STONE);
        ItemStack item4 = new ItemStack(Material.GOLD_BLOCK);
        ItemStack item5 = new ItemStack(Material.CLAY);
        ItemStack item6 = new ItemStack(Material.PACKED_ICE);
        ItemStack item7 = new ItemStack(Material.WHITE_WOOL);
        ItemStack item8 = new ItemStack(Material.BONE_BLOCK);
        ItemStack item9 = new ItemStack(Material.IRON_BLOCK);
        ItemStack item10 = new ItemStack(Material.SOUL_SAND);
        ItemStack item11 = new ItemStack(Material.PUMPKIN);
        ItemStack item12 = new ItemStack(Material.EMERALD_BLOCK);
        ItemStack item13 = new ItemStack(Material.HAY_BLOCK);
        ItemStack item14 = new ItemStack(Material.GLOWSTONE);
        ItemStack item15 = new ItemStack(Material.GRASS_BLOCK);
        ItemStack null1 = new ItemStack(Material.BLACK_CONCRETE);
        ItemStack tester = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);

        ItemMeta meta0 = item0.getItemMeta();
        ItemMeta meta1 = item1.getItemMeta();
        ItemMeta meta2 = item2.getItemMeta();
        ItemMeta meta3 = item3.getItemMeta();
        ItemMeta meta4 = item4.getItemMeta();
        ItemMeta meta5 = item5.getItemMeta();
        ItemMeta meta6 = item6.getItemMeta();
        ItemMeta meta7 = item7.getItemMeta();
        ItemMeta meta8 = item8.getItemMeta();
        ItemMeta meta9 = item9.getItemMeta();
        ItemMeta meta10 = item10.getItemMeta();
        ItemMeta meta11 = item11.getItemMeta();
        ItemMeta meta12 = item12.getItemMeta();
        ItemMeta meta13 = item13.getItemMeta();
        ItemMeta meta14 = item14.getItemMeta();
        ItemMeta meta15 = item15.getItemMeta();
        ItemMeta metaN1 = null1.getItemMeta();
        ItemMeta testerMeta = tester.getItemMeta();

        meta0.setDisplayName(ChatColor.WHITE + "더블 베이스");
        meta1.setDisplayName(ChatColor.WHITE + "작은 북");
        meta2.setDisplayName(ChatColor.WHITE + "클릭 스틱");
        meta3.setDisplayName(ChatColor.WHITE + "베이스 드럼");
        meta4.setDisplayName(ChatColor.WHITE + "종");
        meta5.setDisplayName(ChatColor.WHITE + "플루트");
        meta6.setDisplayName(ChatColor.WHITE + "차임벨");
        meta7.setDisplayName(ChatColor.WHITE + "기타");
        meta8.setDisplayName(ChatColor.WHITE + "실로폰");
        meta9.setDisplayName(ChatColor.WHITE + "철 실로폰");
        meta10.setDisplayName(ChatColor.WHITE + "카우벨");
        meta11.setDisplayName(ChatColor.WHITE + "디저리두");
        meta12.setDisplayName(ChatColor.WHITE + "비트");
        meta13.setDisplayName(ChatColor.WHITE + "벤조");
        meta14.setDisplayName(ChatColor.WHITE + "강한 하프");
        meta15.setDisplayName(ChatColor.WHITE + "하프 / 피아노");
        metaN1.setDisplayName(ChatColor.WHITE + "음 설정");
        testerMeta.setDisplayName(ChatColor.WHITE + "테스터: LunaXena");

        item0.setItemMeta(meta0);
        item1.setItemMeta(meta1);
        item2.setItemMeta(meta2);
        item3.setItemMeta(meta3);
        item4.setItemMeta(meta4);
        item5.setItemMeta(meta5);
        item6.setItemMeta(meta6);
        item7.setItemMeta(meta7);
        item8.setItemMeta(meta8);
        item9.setItemMeta(meta9);
        item10.setItemMeta(meta10);
        item11.setItemMeta(meta11);
        item12.setItemMeta(meta12);
        item13.setItemMeta(meta13);
        item14.setItemMeta(meta14);
        item15.setItemMeta(meta15);
        null1.setItemMeta(metaN1);
        tester.setItemMeta(testerMeta);

        inventory.setItem(0, item0);
        inventory.setItem(1, item1);
        inventory.setItem(2, item2);
        inventory.setItem(3, item3);
        inventory.setItem(4, item4);
        inventory.setItem(5, item5);
        inventory.setItem(6, item6);
        inventory.setItem(7, item7);
        inventory.setItem(8, item8);
        inventory.setItem(9, item9);
        inventory.setItem(10, item10);
        inventory.setItem(11, item11);
        inventory.setItem(12, item12);
        inventory.setItem(13, item13);
        inventory.setItem(14, item14);
        inventory.setItem(15, item15);
        inventory.setItem(16, null1);
        inventory.setItem(17, tester);

        player.openInventory(inventory);
    }
}
