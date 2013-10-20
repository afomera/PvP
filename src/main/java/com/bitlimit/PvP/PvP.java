package com.bitlimit.PvP;


import org.bukkit.plugin.java.JavaPlugin;

public class PvP extends JavaPlugin {

    @Override
    void onEnable(){
          new PvPListener.plugin = this();
    }

    @Override
    void onDiable () {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }

}
