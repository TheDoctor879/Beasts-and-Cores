package net.valdaycraft.beasts.zombies;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class HumidZombieSpawner implements Listener {
	
	String undead = "Chul Undead";

	@EventHandler
	public void SpawnEvent(CreatureSpawnEvent e) {
		if (e.getEntityType().equals(EntityType.ZOMBIE)) {
			LivingEntity ent = e.getEntity();
			Location entityLocation = ent.getLocation();
			if (ent instanceof Zombie) {
			    if (ent.getLocation().getBlock().getBiome().equals((Biome.JUNGLE_HILLS))) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.JUNGLE_EDGE_MOUNTAINS)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.JUNGLE_EDGE)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.JUNGLE)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.JUNGLE_MOUNTAINS)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			}
		}
	}
}
