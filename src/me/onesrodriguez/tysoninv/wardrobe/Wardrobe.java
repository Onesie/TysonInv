package me.onesrodriguez.tysoninv.wardrobe;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Wardrobe {
    
    public static WardrobeItemStacks wardrobe = new WardrobeItemStacks();
    public static WardrobeItemMeta wardrobeMeta = new WardrobeItemMeta();
    
    public static void openWardrobe(Player player){
        Inventory inv = Bukkit.createInventory(null, 54, "§8What do you want to wear?");
        
        wardrobeMeta.setAlexMeta();
        wardrobeMeta.setLiamMeta();
        wardrobeMeta.setTysonMeta();
        wardrobeMeta.setVocalMeta();
        wardrobeMeta.setZanaMeta();
        wardrobeMeta.setNekkidMeta();
                
        inv.setItem(2, wardrobe.getNekkid);
        inv.setItem(7, wardrobe.getNekkid);
        inv.setItem(46, wardrobe.getNekkid);
        inv.setItem(52, wardrobe.getNekkid);
    }

}
