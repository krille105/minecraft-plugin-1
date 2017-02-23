package waypoint;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;
import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main extends JavaPlugin {

	private static Main instance;

	@SuppressWarnings("unchecked")
	@Override
	public void onEnable(){

	}

	@Override
	public void onDisable() {

	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("newcuboid") && sender instanceof Player) {

		}
		return false;
	}
}
