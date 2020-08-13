package com.github.Sheche;

import org.bukkit.Instrument;
import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {

    CustomInven customInven = new CustomInven();
    static String cmd = "get";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase(cmd)) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                NoteBlock noteBlock = (NoteBlock) player.getTargetBlock(null, 4).getBlockData();

                player.sendMessage(noteBlock.getInstrument().name());
            }
        }
        return true;
    }
}
