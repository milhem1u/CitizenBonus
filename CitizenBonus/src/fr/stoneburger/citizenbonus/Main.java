package fr.stoneburger.citizenbonus;

import org.bukkit.plugin.java.JavaPlugin;

import fr.stoneburger.citizenbonus.commands.CommandUpdate;

public class Main extends JavaPlugin {
	
	private static Main instance;
	 
	@Override
	public void onEnable() {
		instance = this;
		System.out.println("start");
		getCommand("updateskins").setExecutor(new CommandUpdate());
	}
	 
	@Override
	public void onDisable() {
		System.out.println("stop");
	}
	 
	public static Main getInstance() {
		return instance;
	}

}
