package ru.divided.mc.kurs

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class DiscordPlugin extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getLogger().info("Плагин был включен!");
        getCommand("discord").setExecutor(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Плагин был отключен.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.BLUE + "Присоединяйтесь к нашему Discord-серверу: https://discord.gg/your-discord-invite-link");
        } else {
            sender.sendMessage("Команда доступна только игрокам.");
        }
        return true;
    }
}