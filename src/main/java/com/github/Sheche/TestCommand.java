package com.github.Sheche;

import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {

    static String cmd = "test";
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase(cmd)) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                NoteBlock noteBlock = (NoteBlock) player.getTargetBlock(null, 4).getBlockData();

                String instrument = noteBlock.getInstrument().name();

                player.sendMessage("This is a " + instrument);
            }
        }
        return true;
    }
}
