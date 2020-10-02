package resources;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class minecraftDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {

        event.setDeathMessage(null);
        for (Player on : event.getEntity().getServer().getOnlinePlayers()) {
            on.sendMessage(ChatColor.RED + "이 서버에 있는 누군가가 죽었습니다");
        }

    }

}