package net.valdaycraft.beasts.skeletons;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class SkeletonSpawnEvent implements Listener {

	public static int nextInt = new Random().nextInt(200);
	
	@EventHandler
	public void skeletonBreed(CreatureSpawnEvent e) {
		if (e.getEntity()
				.equals(EntityType.SKELETON)) {
			LivingEntity en = e.getEntity();
			if (nextInt <= 55) {
				en.setCustomName(ChatColor.DARK_RED + "Flaring Bones");
			} else {
				en.setCustomName(ChatColor.AQUA + "Skilled Undead");
			}
		}
	}

}
