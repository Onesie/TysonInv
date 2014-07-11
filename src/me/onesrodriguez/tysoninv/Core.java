package me.onesrodriguez.tysoninv;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin{
    
    public InvItems inv = new InvItems();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
       if(cmd.getName().equalsIgnoreCase("asdf")){
           
       }
       return true;
    }
    
    
    
    

}
