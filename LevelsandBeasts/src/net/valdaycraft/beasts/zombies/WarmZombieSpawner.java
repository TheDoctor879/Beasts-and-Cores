package net.valdaycraft.beasts.zombies;

import org.bukkit.ChatColor;
import org.bukkit.block.Biome;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class WarmZombieSpawner implements Listener{
	
	String mevi = "Mevi Undead";

	@EventHandler
	public void WarmCreeperSpawnEvent(CreatureSpawnEvent e) {
		LivingEntity creeper = e.getEntity();
		Biome l = creeper.getLocation().getBlock().getBiome();
		if (creeper instanceof Zombie) {
			if (l.equals(Biome.PLAINS)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.BIRCH_FOREST)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.BIRCH_FOREST_HILLS)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.BIRCH_FOREST_HILLS_MOUNTAINS)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.BIRCH_FOREST_MOUNTAINS)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.EXTREME_HILLS)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.EXTREME_HILLS_MOUNTAINS)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.EXTREME_HILLS_PLUS)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.EXTREME_HILLS_PLUS_MOUNTAINS)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.FOREST)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.FOREST_HILLS)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.SWAMPLAND)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.SWAMPLAND_MOUNTAINS)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.RIVER)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
			if (l.equals(Biome.STONE_BEACH)) {
				creeper.setCustomName(ChatColor.DARK_PURPLE + mevi);
			}
		}
	}

}