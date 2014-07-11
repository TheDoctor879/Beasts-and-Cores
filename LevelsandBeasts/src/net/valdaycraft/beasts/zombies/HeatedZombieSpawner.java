package net.valdaycraft.beasts.zombies;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class HeatedZombieSpawner implements Listener{
	
	String diri = "Diri Undead";
	
	@EventHandler
	public void HotCreeperSpawnEvent(CreatureSpawnEvent e) {
		LivingEntity creeper = e.getEntity();
		Location l = creeper.getLocation();
		if (creeper instanceof Zombie) {
			if (l.getBlock().getBiome().equals(Biome.BEACH)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.DESERT_HILLS)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.DESERT)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.DESERT_MOUNTAINS)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.SAVANNA)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.SAVANNA_MOUNTAINS)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.SAVANNA_PLATEAU)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.SAVANNA_PLATEAU_MOUNTAINS)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.MESA)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.MESA_BRYCE)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.MESA_PLATEAU)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.MESA_PLATEAU_FOREST)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.MESA_PLATEAU_FOREST_MOUNTAINS)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
			if (l.getBlock().getBiome().equals(Biome.MESA_PLATEAU_MOUNTAINS)) {
				creeper.setCustomName(ChatColor.DARK_RED + diri);
			}
		}
	}

}
