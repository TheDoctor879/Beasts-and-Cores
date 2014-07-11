package net.valdaycraft.animals.piglets;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class PigletRegister implements Listener {
	
	public static Random rand = new Random();
	public static int Chance = rand.nextInt(100);
	
	@EventHandler
	public void PigletRegisterEvent(CreatureSpawnEvent e) {
		LivingEntity ent = e.getEntity();
		if (ent instanceof Pig) {
			if (Chance >= 76) {
				ent.setCustomName(ChatColor.LIGHT_PURPLE + "Boar");
			}
			else {
				ent.setCustomName(ChatColor.LIGHT_PURPLE + "Pig");
			}
		}
	}
}