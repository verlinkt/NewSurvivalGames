package io.github.verlinkt.NewSurvivalGames;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class NewSurvivalGames extends JavaPlugin {
	
	public void onEnable() {
		this.getLogger().info("Plugin enabled.");
		 
	}
	 
	public void onDisable() {
		this.getLogger().info("Plugin disabled.");
	 
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(cmd.getName().equalsIgnoreCase("sg")){ // Wenn der Spieler /basic eingibt, dann tue das folgende...
		    System.out.println("NewSurvivalGames by verlinkt - Version: dev0.1");
			return true;
		} // Wenn das passiert, wird die Funktion abbrechen und true als Wert zurückgeben. Wenn nicht, dann wird false als Wert zurückgegeben.
		return false; 
	}

}
