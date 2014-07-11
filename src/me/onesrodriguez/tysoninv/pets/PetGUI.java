package me.onesrodriguez.tysoninv.pets;

import com.dsh105.echopet.compat.api.entity.IPet;
import com.dsh105.echopet.compat.api.entity.PetType;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PetGUI {
    
    PetAPIHandler api = new PetAPIHandler();
    
    public void openPetGUI(Player player){
        Inventory inv = Bukkit.createInventory(null, 27, "§6TysonPets §8- §7Choose!");
        
        ItemStack horsePet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack skeletonPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack spiderPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack batPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack creeperPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack endermanPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack chickenPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack pigPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack wolfPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack catPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack zombiePet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack sheepPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack silverfishPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack witchPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack villagerPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack blazePet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack clearPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        ItemStack noPet = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
        
        IPet pet = api.getEchoPetAPI().getPet(player);
        
        
        
    }

}
