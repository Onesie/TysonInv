package me.onesrodriguez.tysoninv.messages;

import org.bukkit.ChatColor;

public class MessageManager {

    public static void sendMSG(Player player, String msg) {
     	player.sendMessage("§8[§bTyson§ePets§8] " + msg);
    }

}
