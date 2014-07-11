package net.valdaycraft.beasts.geese;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class GeeseRegister implements Listener {
	
	@EventHandler
	public void GeeseLocator(CreatureSpawnEvent e) {
		LivingEntity ent = e.getEntity();
		Random rand = new Random();
		int Chance = rand.nextInt(200);
		if (ent instanceof Chicken) {
			if (Chance <= 25) {
				ent.setCustomName(ChatColor.DARK_AQUA + "Goose");
			}
			else {
				ent.setCustomName(ChatColor.GRAY + "Chicken");
			}
		}
	}
}
