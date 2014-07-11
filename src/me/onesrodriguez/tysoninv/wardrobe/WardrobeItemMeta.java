package me.onesrodriguez.tysoninv.wardrobe;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class WardrobeItemMeta {
    
        public static WardrobeItemStacks wardrobe = new WardrobeItemStacks();
        
        ItemMeta nekkidMeta = wardrobe.getNekkid.getItemMeta();

        SkullMeta alexMeta = (SkullMeta) wardrobe.alexHead.getItemMeta();
        SkullMeta tysonMeta = (SkullMeta) wardrobe.tysonHead.getItemMeta();
        SkullMeta liamMeta = (SkullMeta) wardrobe.liamHead.getItemMeta();
        SkullMeta zanaMeta = (SkullMeta) wardrobe.zanaHead.getItemMeta();
        SkullMeta vocalMeta = (SkullMeta) wardrobe.vocalHead.getItemMeta();
        
        public void setNekkidMeta() {
            List<String> nekkidLore = new ArrayList<String>();
            nekkidLore.add("§7Take dem clothes off and do yo thang.");
            nekkidMeta.setDisplayName("§7§oGet Nekkid");
            nekkidMeta.setLore(nekkidLore);
            wardrobe.getNekkid.setItemMeta(nekkidMeta);
        }

        public void setAlexMeta() {
            List<String> alexLore = new ArrayList<String>();
            alexLore.add("§3\u00bb Wear the developer (OnesRodriguez)'s head and feel §dm§a§cg§ei§4c§6a§9l.");
            alexMeta.setDisplayName("§3OnesRodriguez's Head");
            alexMeta.setLore(alexLore);
            alexMeta.setOwner("OnesRodriguez");
            wardrobe.alexHead.setItemMeta(alexMeta);
        }

        public void setTysonMeta() {
            List<String> tysonLore = new ArrayList<String>();
            tysonLore.add("§e\u00bb Wear the owner (TysonPhilip)'s head and feel owner-y.");
            tysonMeta.setDisplayName("§eTysonPhilip's Head");
            tysonMeta.setLore(tysonLore);
            tysonMeta.setOwner("TysonPhilip");
            wardrobe.tysonHead.setItemMeta(tysonMeta);
        }

        public void setLiamMeta() {
            List<String> liamLore = new ArrayList<String>();
            liamLore.add("§4\u00bb Wear the admin (RazerLiam)'s head and feel like a lemon.");
            liamMeta.setDisplayName("§4RazerLiam's Head");
            liamMeta.setLore(liamLore);
            liamMeta.setOwner("RazerLiam");
            wardrobe.liamHead.setItemMeta(liamMeta);
        }

        public void setZanaMeta() {
            List<String> zanaLore = new ArrayList<String>();
            zanaLore.add("§4\u00bb Wear the admin (Zanaboss)'s head and feel like his mom.");
            zanaMeta.setDisplayName("§4Zanaboss's Head");
            zanaMeta.setLore(zanaLore);
            zanaMeta.setOwner("Zanaboss");
            wardrobe.zanaHead.setItemMeta(zanaMeta);
        }

        public void setVocalMeta() {
            List<String> vocalLore = new ArrayList<String>();
            vocalLore.add("§e\u00bb Wear the owner (VocaloidForLife)'s head and make people §o#DealWithIt§r§e.");
            vocalMeta.setDisplayName("§eVocaloidForLife's Head");
            vocalMeta.setLore(vocalLore);
            vocalMeta.setOwner("VocaloidForLife");
            wardrobe.vocalHead.setItemMeta(vocalMeta);
        }

}
