package de.herrgamergame.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable(){
        System.out.println("Maven Test Online");
        register();
    }
    public void onDisable(){
        System.out.println("Maven Test Offline");
    }

    public void register(){
        //CMD

        //EVENT
    }
}
