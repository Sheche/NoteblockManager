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

        ItemStack item0 = createItem(Material.MUSIC_DISC_CHIRP, ChatColor.YELLOW + "F#");
        ItemStack item1 = createItem(Material.MUSIC_DISC_CHIRP, ChatColor.GREEN + "G");
        ItemStack item2 = createItem(Material.MUSIC_DISC_BLOCKS, ChatColor.GREEN + "G#");
        ItemStack item3 = createItem(Material.MUSIC_DISC_BLOCKS, ChatColor.GREEN + "A");
        ItemStack item4 = createItem(Material.MUSIC_DISC_13, ChatColor.GREEN + "A#");
        ItemStack item5 = createItem(Material.MUSIC_DISC_13, ChatColor.GREEN + "B");
        ItemStack item6 = createItem(Material.MUSIC_DISC_FAR, ChatColor.GREEN + "C");
        ItemStack item7 = createItem(Material.MUSIC_DISC_FAR, ChatColor.GREEN + "C#");
        ItemStack item8 = createItem(Material.MUSIC_DISC_CAT, ChatColor.GREEN + "D");
        ItemStack item9 = createItem(Material.MUSIC_DISC_CAT, ChatColor.GREEN + "D#");
        ItemStack item10 = createItem(Material.MUSIC_DISC_WARD, ChatColor.GREEN + "E");
        ItemStack item11 = createItem(Material.MUSIC_DISC_WARD, ChatColor.GREEN + "F");
        ItemStack item12 = createItem(Material.MUSIC_DISC_WAIT, ChatColor.BLUE + "F#");
        ItemStack item13 = createItem(Material.MUSIC_DISC_WAIT, ChatColor.BLUE + "G");
        ItemStack item14 = createItem(Material.MUSIC_DISC_MALL, ChatColor.BLUE + "G#");
        ItemStack item15 = createItem(Material.MUSIC_DISC_MALL, ChatColor.BLUE + "A");
        ItemStack item16 = createItem(Material.MUSIC_DISC_MELLOHI, ChatColor.BLUE + "A#");
        ItemStack item17 = createItem(Material.MUSIC_DISC_MELLOHI, ChatColor.BLUE + "B");
        ItemStack item18 = createItem(Material.MUSIC_DISC_STAL, ChatColor.BLUE + "C");
        ItemStack item19 = createItem(Material.MUSIC_DISC_STAL, ChatColor.BLUE + "C#");
        ItemStack item20 = createItem(Material.MUSIC_DISC_STRAD, ChatColor.BLUE + "D");
        ItemStack item21 = createItem(Material.MUSIC_DISC_STRAD, ChatColor.BLUE + "D#");
        ItemStack item22 = createItem(Material.MUSIC_DISC_PIGSTEP, ChatColor.BLUE + "E");
        ItemStack item23 = createItem(Material.MUSIC_DISC_PIGSTEP, ChatColor.BLUE + "F");
        ItemStack item24 = createItem(Material.MUSIC_DISC_11, ChatColor.DARK_BLUE + "F#");
        ItemStack change = createItem(Material.BLACK_CONCRETE, ChatColor.WHITE + "악기 설정");
        ItemStack tester = createItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, ChatColor.WHITE + "테스터: LunaXena");

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
        inven.setItem(25, change);
        inven.setItem(26, tester);

        player.openInventory(inven);
    }

    public void insInven(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 18, "Instrument");

        ItemStack item0 = createItem(Material.OAK_LOG, ChatColor.WHITE + "더블 베이스");
        ItemStack item1 = createItem(Material.SAND, ChatColor.WHITE + "작은 북");
        ItemStack item2 = createItem(Material.GLASS, ChatColor.WHITE + "클릭 스틱");
        ItemStack item3 = createItem(Material.STONE, ChatColor.WHITE + "베이스 드럼");
        ItemStack item4 = createItem(Material.GOLD_BLOCK, ChatColor.WHITE + "종");
        ItemStack item5 = createItem(Material.CLAY, ChatColor.WHITE + "플루트");
        ItemStack item6 = createItem(Material.PACKED_ICE, ChatColor.WHITE + "차임벨");
        ItemStack item7 = createItem(Material.WHITE_WOOL, ChatColor.WHITE + "기타");
        ItemStack item8 = createItem(Material.BONE_BLOCK, ChatColor.WHITE + "실로폰");
        ItemStack item9 = createItem(Material.IRON_BLOCK, ChatColor.WHITE + "철 실로폰");
        ItemStack item10 = createItem(Material.SOUL_SAND, ChatColor.WHITE + "카우벨");
        ItemStack item11 = createItem(Material.PUMPKIN, ChatColor.WHITE + "디저리두");
        ItemStack item12 = createItem(Material.EMERALD_BLOCK, ChatColor.WHITE + "비트");
        ItemStack item13 = createItem(Material.HAY_BLOCK, ChatColor.WHITE + "벤조");
        ItemStack item14 = createItem(Material.GLOWSTONE, ChatColor.WHITE + "강한 하프");
        ItemStack item15 = createItem(Material.GRASS_BLOCK, ChatColor.WHITE + "하프 / 피아노");
        ItemStack null1 = createItem(Material.BLACK_CONCRETE, ChatColor.WHITE + "음 설정");
        ItemStack tester = createItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, ChatColor.WHITE + "테스터: LunaXena");

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

    public ItemStack createItem(Material material, String name) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }
}
