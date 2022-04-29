package dev.mrshawn.uuidchange;

import dev.mrshawn.uuidchange.commands.ChangeUUIDCMD;
import dev.mrshawn.uuidchange.commands.CheckUUIDCMD;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class UUIDChange extends JavaPlugin implements CommandExecutor {

	@Override
	public void onEnable() {
		getCommand("changeuuid").setExecutor(new ChangeUUIDCMD());
		getCommand("checkuuid").setExecutor(new CheckUUIDCMD());
	}

}
