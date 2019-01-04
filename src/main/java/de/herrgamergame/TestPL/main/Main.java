package de.herrgamergame.TestPL.main;

import de.herrgamergame.TestPL.cmds.LebenCheck;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main instance;
    public String pr = "§aTest ";
    public String noperm = "§cDafür hast du keine Rechte";

    public void onEnable(){
        instance = this;
        System.out.println("Maven Test Online");
        register();
    }
    public void onDisable(){
        System.out.println("Maven Test Offline");
    }

    private void register(){
        //CMD
        getCommand("leben").setExecutor(new LebenCheck());

        //EVENT
    }


}
