package de.herrgamergame.cmds;

import de.herrgamergame.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LebenCheck implements CommandExecutor {


    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender.hasPermission("TestPL.LebenCheck")){
            if(strings.length==1){
                Player t = Bukkit.getPlayer(strings[0]);
                if(t!=null) {
                    final double leben;
                    leben = t.getHealth();

                    commandSender.sendMessage(Main.instance.pr + "Der Spieler " + t.getName() + " hat " + leben);
                }else{
                    commandSender.sendMessage(Main.instance.pr +"Der Spieler " + t.getName() + " ist nicht §cOnline");
                }
            }else{
                commandSender.sendMessage(Main.instance.pr + "/leben Name");
            }

        }else{
            commandSender.sendMessage(Main.instance.pr +"Keine Rechte dafür");
        }


        return false;
    }
}
