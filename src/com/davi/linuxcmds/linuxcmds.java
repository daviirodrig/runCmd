package com.davi.linuxcmds;

import org.bukkit.plugin.java.JavaPlugin;

public class linuxcmds extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("run").setExecutor(new ComandoRun());
    }

    @Override
    public void onDisable() {

    }
}
