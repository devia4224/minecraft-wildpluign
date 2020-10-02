package resources;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class minecraftPlace implements Listener {


    @EventHandler
    public void onPlace(BlockPlaceEvent event) {

        Block block = event.getBlock();

        /* general */
        if(block.getType().equals(Material.OAK_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.ACACIA_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.BIRCH_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.CRIMSON_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.SPRUCE_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.DARK_OAK_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.JUNGLE_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.WARPED_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "표지판을 설치할 수 없습니다!");

        }

        /* wall */
        if(block.getType().equals(Material.OAK_WALL_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "기존의 블럭에 표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.ACACIA_WALL_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "기존의 블럭에 표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.BIRCH_WALL_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "기존의 블럭에 표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.CRIMSON_WALL_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "기존의 블럭에 표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.SPRUCE_WALL_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "기존의 블럭에 표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.JUNGLE_WALL_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "기존의 블럭에 표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.DARK_OAK_WALL_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "기존의 블럭에 표지판을 설치할 수 없습니다!");

        }
        if(block.getType().equals(Material.WARPED_WALL_SIGN)) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.RED + "기존의 블럭에 표지판을 설치할 수 없습니다!");

        }

    }

}