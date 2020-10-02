package resources;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class minecraftSpawn implements Listener {

    @EventHandler
    public void onFirstJoin(PlayerJoinEvent event) {

        event.setJoinMessage(null);

        if(!event.getPlayer().hasPlayedBefore()) {

            double x1 = Math.random() * 500;
            double x2 = Math.random() * -500;
            double x = x1 + x2;

            double y = 150;

            double z1 = Math.random() * 500;
            double z2 = Math.random() * -500;
            double z = z1 + z2;

            while (true) {

                Location loss = new Location(event.getPlayer().getWorld(), x, y, z);
                Block block = loss.getBlock();

                if(block.getType().equals(Material.AIR)) {
                    y -= 1;
                } else {
                    y += 1;
                    break;
                }

            }

            Location loc = new Location(event.getPlayer().getWorld(), x, y, z);

            event.getPlayer().getWorld().setSpawnLocation(loc);
            event.getPlayer().teleport(loc);

        }

    }
}