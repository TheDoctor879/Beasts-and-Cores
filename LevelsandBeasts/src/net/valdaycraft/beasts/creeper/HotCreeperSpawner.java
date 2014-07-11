package net.valdaycraft.beasts.creeper;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class HotCreeperSpawner implements Listener{
	
	@EventHandler
	public void HotCreeperSpawnEvent(CreatureSpawnEvent e) {
		LivingEntity creeper = e.getEntity();
		Location l = creeper.getLocation();
		if (creeper instanceof Creeper) {
			if (l.getBlock().getBiome().equals(Biome.BEACH)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.DESERT_HILLS)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.DESERT)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.DESERT_MOUNTAINS)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.SAVANNA)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.SAVANNA_MOUNTAINS)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.SAVANNA_PLATEAU)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.SAVANNA_PLATEAU_MOUNTAINS)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.MESA)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.MESA_BRYCE)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.MESA_PLATEAU)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.MESA_PLATEAU_FOREST)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.MESA_PLATEAU_FOREST_MOUNTAINS)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
			if (l.getBlock().getBiome().equals(Biome.MESA_PLATEAU_MOUNTAINS)) {
				((Creeper) creeper).setPowered(true);
				creeper.setCustomName(ChatColor.DARK_RED + "Diri Creeper");
			}
		}
	}

}
