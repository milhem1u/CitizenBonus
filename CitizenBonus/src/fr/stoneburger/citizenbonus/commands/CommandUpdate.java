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

import fr.stoneburger.citizenbonus.Main;


public class CommandUpdate implements CommandExecutor {
	
	protected final Main plugin;
	
	public CommandUpdate(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		String skin;
	    //String sig = "kVWGmfZuMbHc0KhDjX0FrdNA4KK/JTFiSDUQu5O1Jw76/Y+ozfsxZUNkljzCke3cEhpTCdgZuy0nEaBI7WhdunacxBcm7r//a1W/Z5MBJKt3KZM8lySzHlUaM1cSIwRZIrGz5PDcqbgxm/GmOEiewehn6M5vEIBOoYwmCBNpYswVkIG/2qmcHsXUG3zzvzoYdTuKZuBHdGhWHr14TI19deW/Mqru2Bmc+bK1FrGrnT0urUiDIsDbjWXGdOYkci7vMPutlFHDHbFu0+HDalIpeRjI3IiVnwHPim9zu+fkYN92pAyAQeTa2AwmHTMO6/JY/o539HAvYbDcovMzXXZxzPWlozhw3ib+z+OwvsOuBcwPCeN1zhiUYQJFm5lR8d2IvwbNe2y40NWQm0oBI71rneNw2h5TH54muqLRJ297Sli35Ufs0z79I3gn5XTtfiSLFTicZzQ61Nq8CmcXKi4Q/eytHpPkmoNibPsr6BUJd6BI2XDg2YQzdBvpQcjd6azkuQL95arOdlk1UaBMIZwU5/yHaNfiG0Q7+fHTbIXchIHtdr668ly6S0CqOKmvztmcHYlUqV73WBB7GmoZS0tKz8cmMc1hmlvkh+DZ8BQ+EGBu6pYZE6NQ8x+Vv69XIeLUCR3c/JIQ69uGIUwPWa6ainNp//aSUVULsxVS6g3Iwi8=";
	    //String skin = "eyJ0aW1lc3RhbXAiOjE1NDY1NDUxMjU4MjAsInByb2ZpbGVJZCI6ImVmYWY1NzU3NzgxZTQ3YWViYzE0Y2Q4MmM5MWM3ZjgyIiwicHJvZmlsZU5hbWUiOiJNaW5lU2tpbiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWVhMmYxMDc5MjJkNDNjY2NkMDk3ODJmZWRmZWZlMTU5MmJkY2E4N2E3OTYzMDc5N2NlOTliN2Y3MWM4MjQ5NyJ9fX0=";
		String sig = "CZqE4lb9G/aFvqhyI7oCl6O6VCfl6aooMA8HUTmgz4FOLLJu753SRrLmLcHKYLJxjZl35t/3cv7Y5a9a5Mrfa41/wN13QZQ8Wt9J8xuqAEC16v4ujcR1ifa64cuBQUMM77yddqLbNjZmIKb71Y2Ij7svuWqFQuDcSPpmhJQmkGFU9A3qI47O2CXTzwY4Q1gwefSIpgzE+vrap30/cogTFiI5i4SvUMmPTnNDxUeZnKmNKIUxrrABnn6Pp27maFGg0pGk0hZH5Nac637qHmiu4597Tk0zf/qgUXAi3NGGAPCaEPplbmQf0OKxUj1CrA+F1ShT7dpaOGPT6dXW0Zb1t0o9dEU/WotoXjHHP2U8EXamsnneprjQLyFOq2Qoi5aEsKFa3bTjpN/MNZmEw4vZnHoMsbxkqTBO+CFvHVuIhRtXGO3womnGUFM40/axqpo+HHs5eP7da1fN9zf8FywZWOzm3OjFQyrugCb8ZpZwRBaGjeoY8z56bAqeK9kge5yURIDLogmPQx92uqBEsZ0NvMlDqMl3i/tCZaspX/5DA1EGwYPe8QSbDXX5gvq2M49a8nJ1nFjnfaQYV5AkzoEQxxi5+DcEtabXwzCp7aA6Bm2ToXC+sBl0Wjb5oxMhgzAP9QL/XnYVA2jdfNik1Mz3VIrl5bxhPQiLZAU6jzvSQfE=";
	    Property property;
		World w = Bukkit.getServer().getWorld("world");
	
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
            skin = new String(Base64.encodeBase64(("{\"timestamp\":1503497691710,\"profileId\":\""+olol+"\",\"profileName\":\""+gp.getName()+"\",\"signatureRequired\":false,\"textures\":{\"SKIN\":{\"url\":\"http://textures.minecraft.net/texture/eea2f107922d43cccd09782fedfefe1592bdca87a79630797ce99b7f71c82497\"}}}").getBytes()));
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
