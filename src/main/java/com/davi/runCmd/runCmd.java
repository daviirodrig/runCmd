package com.davi.runCmd;

import org.bukkit.plugin.java.JavaPlugin;

public class runCmd extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("run").setExecutor(new CommandRun());
    }

    @Override
    public void onDisable() {

    }
}
