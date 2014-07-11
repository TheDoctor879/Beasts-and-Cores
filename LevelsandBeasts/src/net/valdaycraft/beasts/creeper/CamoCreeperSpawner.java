package net.valdaycraft.beasts.creeper;

import org.bukkit.ChatColor;
import org.bukkit.block.Biome;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class CamoCreeperSpawner implements Listener{
	
	@EventHandler
	public void CamoCreeperSpawnEvent(CreatureSpawnEvent e) {
		LivingEntity creeper = e.getEntity();
		Biome l = creeper.getLocation().getBlock().getBiome();
		if (creeper instanceof Creeper)
		    if (l.equals(Biome.JUNGLE)) {
			    creeper.setCustomName(ChatColor.DARK_GREEN + "Camo Creeper");
		    }
		    if (l.equals(Biome.JUNGLE_EDGE)) {
			    creeper.setCustomName(ChatColor.DARK_PURPLE + "Mevi Creeper");
		    }
		    if (l.equals(Biome.JUNGLE_EDGE_MOUNTAINS)) {
			    creeper.setCustomName(ChatColor.DARK_PURPLE + "Mevi Creeper");
		    }
		    if (l.equals(Biome.JUNGLE_HILLS)) {
			    creeper.setCustomName(ChatColor.DARK_PURPLE + "Mevi Creeper");
		    }
		    if (l.equals(Biome.JUNGLE_MOUNTAINS)) {
			    creeper.setCustomName(ChatColor.DARK_PURPLE + "Mevi Creeper");
		    }
	}
}