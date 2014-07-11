package net.valdaycraft.animals.Ocelot;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Ocelot;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class OcelotRegister implements Listener{
	
	static Random rand = new Random();
	public static int OcelotChance = rand.nextInt(100);
	
	@EventHandler
	public void RegisterOcelot(CreatureSpawnEvent e) {
		LivingEntity ent = e.getEntity();
		if (ent instanceof Ocelot) {
			if (OcelotChance >= 87) {
				ent.setCustomName(ChatColor.YELLOW + "Ocelot");
			}
			else {
				ent.setCustomName(ChatColor.YELLOW + "Calm Lion");
			}
		}
	}

}
