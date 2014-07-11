package net.valdaycraft.beasts.creeper;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class ColdCreeperSpawner implements Listener {
	
	@EventHandler
	public void SpawnEvent(CreatureSpawnEvent e) {
		if (e.getEntityType().equals(EntityType.CREEPER)) {
			LivingEntity ent = e.getEntity();
			Location entityLocation = ent.getLocation();
			if (ent instanceof Creeper) {
			    if (ent.getLocation().getBlock().getBiome().equals((Biome.TAIGA))) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.TAIGA_HILLS)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.TAIGA_MOUNTAINS)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.FROZEN_OCEAN)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.FROZEN_RIVER)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.ICE_MOUNTAINS)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
		        }
			    if (entityLocation.getBlock().getBiome().equals(Biome.ICE_PLAINS)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.ICE_PLAINS_SPIKES)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.COLD_BEACH)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.COLD_TAIGA_MOUNTAINS)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.COLD_TAIGA_HILLS)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.COLD_TAIGA)) {
				    ent.setCustomName(ChatColor.AQUA + "Creepsicle");
			    }
			}
		}
	}
}
