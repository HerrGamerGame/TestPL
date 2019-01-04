package de.herrgamergame.TestPL.events;

import de.herrgamergame.TestPL.methodes.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        ItemBuilder.buildItem(Material.BOW,"§4One-Hit-Bow",player.getPlayer());

        event.setJoinMessage("");
    }
}
