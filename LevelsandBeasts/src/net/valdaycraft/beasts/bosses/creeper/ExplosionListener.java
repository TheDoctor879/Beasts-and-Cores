package net.valdaycraft.beasts.bosses.creeper;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class ExplosionListener implements Listener{
	
    Creeper creeper = CreeperKing.creep;
    
    Location l;
	
	@EventHandler
	public void onExplosion(EntityExplodeEvent e) {
		if (e.getEntityType().equals(EntityType.CREEPER)) {
			Creeper cr = (Creeper) e.getEntity();
			if (e.getEntity().equals(creeper)) {
				if (cr.getHealth() > 0D) {
					double health = cr.getHealth();
					double newHealth = health + 5;
					l = cr.getLocation();
					World world = cr.getWorld();
					Creeper beast = (Creeper) world.spawnEntity(l, EntityType.CREEPER);
					beast.setHealth(newHealth);
				}
			}
		}
	}
}
