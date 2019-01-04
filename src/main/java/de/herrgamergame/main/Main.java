package de.herrgamergame.main;

import de.herrgamergame.cmds.LebenCheck;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main instance;
    public String pr = "§aTest";

    public void onEnable(){
        instance = this;
        System.out.println("Maven Test Online");
        register();
    }
    public void onDisable(){
        System.out.println("Maven Test Offline");
    }

    public void register(){
        //CMD
        getCommand("leben").setExecutor(new LebenCheck());

        //EVENT
    }


}
