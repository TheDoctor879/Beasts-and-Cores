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

public class ColdZombieSpawner implements Listener {

	String undead = "Zuded Undead";

	@EventHandler
	public void SpawnEvent(CreatureSpawnEvent e) {
		if (e.getEntityType().equals(EntityType.ZOMBIE)) {
			LivingEntity ent = e.getEntity();
			Location entityLocation = ent.getLocation();
			if (ent instanceof Zombie) {
			    if (ent.getLocation().getBlock().getBiome().equals((Biome.TAIGA))) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.TAIGA_HILLS)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.TAIGA_MOUNTAINS)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.FROZEN_OCEAN)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.FROZEN_RIVER)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.ICE_MOUNTAINS)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
		        }
			    if (entityLocation.getBlock().getBiome().equals(Biome.ICE_PLAINS)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.ICE_PLAINS_SPIKES)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.COLD_BEACH)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.COLD_TAIGA_MOUNTAINS)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.COLD_TAIGA_HILLS)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			    if (entityLocation.getBlock().getBiome().equals(Biome.COLD_TAIGA)) {
				    ent.setCustomName(ChatColor.AQUA + undead);
			    }
			}
		}
	}
}
