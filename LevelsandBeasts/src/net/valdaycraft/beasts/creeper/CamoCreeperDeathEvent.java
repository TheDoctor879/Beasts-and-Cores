package net.valdaycraft.beasts.creeper;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class CamoCreeperDeathEvent {
	
	String mevi = "Mevi Creeper";
	
	@EventHandler
	public void Explosion(EntityDeathEvent e) {
		LivingEntity creeper = e.getEntity();
		List<ItemStack> stack = e.getDrops();
		if (creeper instanceof Creeper) {
			if (creeper.getCustomName().equals(mevi)) {
				e.getDrops().remove(stack);
				e.getDrops().add(new ItemStack(Material.CROPS));
			}
		}
	}
}