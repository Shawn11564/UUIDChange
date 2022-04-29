package dev.mrshawn.uuidchange.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class CheckUUIDCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {

			UUID uuid = ((Player) sender).getUniqueId();
			sender.sendMessage("Your UUID is: " + uuid);

		}
		return false;
	}

}
