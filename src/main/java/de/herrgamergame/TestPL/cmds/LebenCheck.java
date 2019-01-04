package de.herrgamergame.TestPL.cmds;

import de.herrgamergame.TestPL.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LebenCheck implements CommandExecutor {


    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(strings.length==3){
            String t = strings[1];
            Player target = Bukkit.getPlayer(t);
            double health =  Double.parseDouble(strings[2]);
            if(strings[0].equalsIgnoreCase("set")){
               if(commandSender.hasPermission("TestPL.setHealth")) {
                   target.setHealth(health);
                   target.playSound(target.getLocation(), Sound.LEVEL_UP, 1F, 1F);
               }else{
                   commandSender.sendMessage(Main.instance.noperm);
               }
            }
            if(strings[0].equalsIgnoreCase("add")){
                double oldHealth = target.getHealth();
                health = oldHealth + health;
                if(commandSender.hasPermission("TestPL.addHealth")) {
                    target.setHealth(health);
                    target.playSound(target.getLocation(), Sound.LEVEL_UP, 1F, 1F);
                }else{
                    commandSender.sendMessage(Main.instance.noperm);
                }
            }

        }


       if(strings.length==1){
           String t = strings[0];
           Player t1 = Bukkit.getPlayer(t);
           if(commandSender.hasPermission("TestPL.getHealth")) {
               commandSender.sendMessage(Main.instance.pr + "Der Spieler: " + t + " hat " + t1 + " Leben");
           }else{
               commandSender.sendMessage(Main.instance.noperm );
           }
           }
       if(strings.length==0){
           commandSender.sendMessage("--------------------------------------");
           commandSender.sendMessage("/leben add Name Amount");
           commandSender.sendMessage("/leben set Name Amount");
           commandSender.sendMessage("/leben Name");
           commandSender.sendMessage("---------------------------------------");
       }


        return true;
    }
}
