package resources;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class minecraftQuit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {

        event.setQuitMessage(null);

    }

}