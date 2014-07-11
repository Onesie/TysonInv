package me.onesrodriguez.tysoninv.messages;

import org.bukkit.ChatColor;

public class MessageManager {

    public enum MessageType {

		NO_PERMS(ChatColor.RED),
		ERROR(ChatColor.RED),
		INFO(ChatColor.YELLOW),
                VISIBILITY_CHANGE(ChatColor.GRAY);

		private ChatColor color;

		MessageType(ChatColor color) {
			this.color = color;
		}

		public ChatColor getColor() {
			return color;
		}
	}
    
        private MessageManager() { 

        }

}
