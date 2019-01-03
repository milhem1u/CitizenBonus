package fr.stoneburger.citizenbonus;

import org.bukkit.plugin.java.JavaPlugin;

import fr.stoneburger.citizenbonus.commands.CommandUpdate;

public class Main extends JavaPlugin {
	 
	@Override
	public void onEnable() {
		System.out.println("start");
		getCommand("updateskins").setExecutor(new CommandUpdate(this));
	}
	 
	@Override
	public void onDisable() {
		System.out.println("stop");
	}
	 

}
