package net.valdaycraft.beasts.bosses.creeper;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class CreeperKing {
	
	public static World world;
	
	public static Creeper creep;
	
	public static void setup(Player player) {
		Location bossSpawnLocation = player.getEyeLocation();
		world = player.getWorld();
		creep = (Creeper) world.spawnEntity(bossSpawnLocation, EntityType.CREEPER);
		creep.setHealth(250);
	}
}
