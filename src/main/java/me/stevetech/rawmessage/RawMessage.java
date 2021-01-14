package me.stevetech.rawmessage;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class RawMessage extends JavaPlugin {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("rawmsg") && sender.hasPermission("rawmessage")) {
            if (args.length > 2) {
                getServer().getPlayer(args[0]).sendMessage(ChatColor.translateAlternateColorCodes('&',
                        String.join(" ", Arrays.copyOfRange(args, 1, args.length))));
                return true;
            }
        }
        return false;
    }
}
