package de.herrgamergame.TestPL.events;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class BowHit implements Listener {

    @EventHandler
    public void onBowHit(EntityDamageByEntityEvent e){
        Entity en = e.getEntity();


        if(en instanceof Projectile) {
         Projectile p = (Projectile) e.getDamager();
        if(p.getShooter() instanceof Player){
            Player player = (Player) p.getShooter();
            Player target = (Player) e.getEntity();
            if(player.getInventory().getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§4One-Hit-Bow")){
                target.setHealth(0);
            }else{

            }
        }else{

        }
        }else{

        }

    }
}
