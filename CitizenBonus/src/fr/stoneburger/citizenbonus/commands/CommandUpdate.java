package fr.stoneburger.citizenbonus.commands;


import org.apache.commons.codec.binary.Base64;
import org.bukkit.Bukkit;
import org.bukkit.World;
//import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPlayer;
//import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;


public class CommandUpdate implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		String skin;
	    String sig = "kVWGmfZuMbHc0KhDjX0FrdNA4KK/JTFiSDUQu5O1Jw76/Y+ozfsxZUNkljzCke3cEhpTCdgZuy0nEaBI7WhdunacxBcm7r//a1W/Z5MBJKt3KZM8lySzHlUaM1cSIwRZIrGz5PDcqbgxm/GmOEiewehn6M5vEIBOoYwmCBNpYswVkIG/2qmcHsXUG3zzvzoYdTuKZuBHdGhWHr14TI19deW/Mqru2Bmc+bK1FrGrnT0urUiDIsDbjWXGdOYkci7vMPutlFHDHbFu0+HDalIpeRjI3IiVnwHPim9zu+fkYN92pAyAQeTa2AwmHTMO6/JY/o539HAvYbDcovMzXXZxzPWlozhw3ib+z+OwvsOuBcwPCeN1zhiUYQJFm5lR8d2IvwbNe2y40NWQm0oBI71rneNw2h5TH54muqLRJ297Sli35Ufs0z79I3gn5XTtfiSLFTicZzQ61Nq8CmcXKi4Q/eytHpPkmoNibPsr6BUJd6BI2XDg2YQzdBvpQcjd6azkuQL95arOdlk1UaBMIZwU5/yHaNfiG0Q7+fHTbIXchIHtdr668ly6S0CqOKmvztmcHYlUqV73WBB7GmoZS0tKz8cmMc1hmlvkh+DZ8BQ+EGBu6pYZE6NQ8x+Vv69XIeLUCR3c/JIQ69uGIUwPWa6ainNp//aSUVULsxVS6g3Iwi8=";
	    Property property;
		World w = Bukkit.getServer().getWorld("world");
		Plugin plugin = fr.stoneburger.citizenbonus.Main.getInstance();
		
		for (Player p : w.getPlayers()) {
            //if (p.hasMetadata("NPC")) {
            GameProfile gp = ((CraftPlayer)p).getProfile();
            //p.sendMessage(""+gp.getId()+"|||"+gp.getName());
            String id = gp.getId().toString();
            String[] res = id.split("-");
            String olol = "";
            for (String s : res) {
            	olol += s;
            }
            skin = new String(Base64.encodeBase64(("{\"timestamp\":1503497691710,\"profileId\":\""+olol+"\",\"profileName\":\""+gp.getName()+"\",\"signatureRequired\":false,\"textures\":{\"SKIN\":{\"url\":\"http://groupe-d-intervention-wow.e-monsite.com/medias/files/2019-01-01-cute-girl-12697496.png\"}}}").getBytes()));
            p.sendMessage("{\"timestamp\":1503497691710,\"profileId\":\""+olol+"\",\"profileName\":\""+gp.getName()+"\",\"signatureRequired\":false,\"textures\":{\"SKIN\":{\"url\":\"http://groupe-d-intervention-wow.e-monsite.com/medias/files/2019-01-01-cute-girl-12697496.png\"}}}");
            property = new Property("textures", skin, sig);
            gp.getProperties().clear();
            gp.getProperties().put("textures", property);
            p.hidePlayer(plugin,p);
            p.showPlayer(plugin,p);
            //}
		
		
		}
		/*for (Entity e : w.getEntities()) {
			GameProfile profile =
		}*/
	    
	    return false;
	}

}
