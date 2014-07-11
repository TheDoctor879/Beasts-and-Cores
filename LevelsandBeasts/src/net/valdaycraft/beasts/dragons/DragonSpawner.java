package net.valdaycraft.beasts.dragons;

import org.bukkit.ChatColor;
import org.bukkit.World.Environment;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class DragonSpawner implements Listener {
	
	@EventHandler
	public void DragonSpawnEvent(CreatureSpawnEvent e) {
		LivingEntity dragon = e.getEntity();
		if (dragon instanceof EnderDragon) {
			if (dragon.getWorld().getEnvironment() == Environment.THE_END) {
				dragon.setCustomName(ChatColor.DARK_PURPLE + "Usha");
			}
			if (dragon.getWorld().getEnvironment() == Environment.NORMAL) {
				dragon.setCustomName(ChatColor.GOLD + "Baphomet");
			}
			if (dragon.getWorld().getEnvironment() == Environment.NETHER) {
				dragon.setCustomName(ChatColor.RED + "Nether Dragon");
			}
		}
	}

}
