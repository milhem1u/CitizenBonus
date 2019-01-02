package fr.stoneburger.citizenbonus;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("start");
	}
	
	@Override
	public void onDisable() {
		System.out.println("stop");
	}

}
