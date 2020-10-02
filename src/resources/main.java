package resources;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;

public class main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new minecraftSpawn(), this);
        Bukkit.getPluginManager().registerEvents(new minecraftPlace(), this);
        Bukkit.getPluginManager().registerEvents(new minecraftQuit(), this);
        Bukkit.getPluginManager().registerEvents(new minecraftDeath(), this);
        Bukkit.getPluginManager().registerEvents(this, this);

        for(World world : Bukkit.getWorlds()) {

            world.setGameRule(GameRule.REDUCED_DEBUG_INFO, true);
            world.setGameRule(GameRule.ANNOUNCE_ADVANCEMENTS, false);

        }

        getLogger().info("플러그인이 활성화 되었습니다.");

    }

    @Override
    public void onDisable() {
        getLogger().info("플러그인이 비활성화 되었습니다.");
    }

    /* event */

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {

        event.setCancelled(true);
        event.getPlayer().sendMessage(ChatColor.RED + "현재 이 서버에서 채팅을 칠 수 없습니다!");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (label.equalsIgnoreCase("w")) {
            sender.sendMessage(ChatColor.RED + "해당 명령어를 사용할 수 없습니다");
            return true;
        }

        if (label.equalsIgnoreCase("me")) {
            sender.sendMessage(ChatColor.RED + "해당 명령어를 사용할 수 없습니다");
            return true;
        }

        if (label.equalsIgnoreCase("help")) {
            sender.sendMessage(ChatColor.RED + "해당 명령어를 사용할 수 없습니다");
            return true;
        }

        return false;
    }


}