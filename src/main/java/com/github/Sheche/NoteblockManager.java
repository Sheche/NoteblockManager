package com.github.Sheche;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class NoteblockManager extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\n\n Noteblock Manager is enabled. \n\n");
        getServer().getPluginManager().registerEvents(new CustomInven(), this);
        getServer().getPluginManager().registerEvents(new InvenClick(), this);
        getServer().getPluginManager().registerEvents(new ClickedNoteblock(), this);
    }
}
