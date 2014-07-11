package net.valdaycraft.dnd;

import net.valdaycraft.animals.Ocelot.OcelotRegister;
import net.valdaycraft.animals.piglets.PigletRegister;
import net.valdaycraft.beasts.creeper.CamoCreeperSpawner;
import net.valdaycraft.beasts.creeper.ColdCreeperSpawner;
import net.valdaycraft.beasts.creeper.HotCreeperSpawner;
import net.valdaycraft.beasts.creeper.WarmCreeperSpawner;
import net.valdaycraft.beasts.dragons.DragonSpawner;
import net.valdaycraft.beasts.geese.GeeseRegister;
import net.valdaycraft.beasts.skeletons.SkeletonSpawnEvent;
import net.valdaycraft.beasts.zombies.ColdZombieSpawner;
import net.valdaycraft.beasts.zombies.HeatedZombieSpawner;
import net.valdaycraft.beasts.zombies.HumidZombieSpawner;
import net.valdaycraft.beasts.zombies.WarmZombieSpawner;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin{
	
	/**********************
	 ** onEnable() Method**
	 *********************/
	
	@Override
	public void onEnable() {
		System.out.println("System.getProperties() == " + System.getProperty("os.name"));
		
		saveConfig();
		
		PluginManager pn = Bukkit.getPluginManager();
		
		/***********************
		*******[Commands]*******
		***********************/
		/***********************
		**[Creeper Spawn Events]**
		***********************/
		pn.registerEvents(new ColdCreeperSpawner(), this);
		pn.registerEvents(new CamoCreeperSpawner(), this);
		pn.registerEvents(new HotCreeperSpawner(),  this);
		pn.registerEvents(new WarmCreeperSpawner(), this);
		/***********************
		**[Dragon Spawn Event]**
		***********************/
		pn.registerEvents(new DragonSpawner(), this);
		/************************
		**[Zombie Spawn Events]**
		************************/
		pn.registerEvents(new ColdZombieSpawner(), this);
		pn.registerEvents(new WarmZombieSpawner(), this);
		pn.registerEvents(new HeatedZombieSpawner(), this);
		pn.registerEvents(new HumidZombieSpawner(), this);
		/***********************************
		**[Geese & Chicken Register Event]**
		***********************************/
		pn.registerEvents(new GeeseRegister(), this);
		/**************************
		**[Skeleton Spawn Events]**
		**************************/
		pn.registerEvents(new SkeletonSpawnEvent(), this);
		/**************************
		**[Ocelot Register Event]**
		**************************/
		pn.registerEvents(new OcelotRegister(), this);
		/***********************
		**[Pig Register Event]**
		***********************/
		pn.registerEvents(new PigletRegister(), this);
	}
	@Override
	public void onDisable() {
		System.out.println("System.getProperties() == " + System.getProperty("os.name"));
		
		saveConfig();
	}
}
