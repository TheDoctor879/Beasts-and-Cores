package net.valdaycraft.beasts.bosses;

import net.valdaycraft.beasts.bosses.creeper.CreeperKing;
import net.valdaycraft.beasts.bosses.pig.TribeLeader;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class BossCmd implements CommandExecutor{
	
	String permission = "beasts.bosses";
	
	static World world;
	
	ChatColor red = ChatColor.RED;
	ChatColor dr = ChatColor.DARK_RED;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("spawnboss"))
		{
			if (sender instanceof Player)
			{
				Player p = (Player) sender;
				if (p.hasPermission(permission))
				{
					if (args.length == 2) 
					{
						if (args.length == 1) 
						{
							if (args[0].equalsIgnoreCase("spawn")) 
							{
								if (!args[1].equalsIgnoreCase("Fraulesh") && !args[1].equalsIgnoreCase("Polymiq"))
								{
									sender.sendMessage(dr + "Error: " + red + "There is no bosses with the name " + args[1] + ".");
								}
								if (args[1].equalsIgnoreCase("Fraulesh")) 
								{
									CreeperKing.setup(p);
								}
								if (args[1].equalsIgnoreCase("Polymiq"))
								{
									TribeLeader.setup(p);
								}
							}
						}
					}
					else if (args.length != 2) {
						sender.sendMessage(dr + "Error: " + red + "Please specify whether you wish to remove or spawn a boss.");
					}
				}
				else if (!p.hasPermission(permission))
				{
					p.sendMessage(dr + "Error: " + red + "You do not have permission to execute that command!");
				}
			}
			else if (sender instanceof ConsoleCommandSender)
			{
				sender.sendMessage(dr + "Error: " + red + "The console can not send Player based commands!");
			}
		}
		return true;
	}
}