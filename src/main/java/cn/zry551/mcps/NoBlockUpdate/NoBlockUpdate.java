package cn.zry551.mcps.NoBlockUpdate;

import cn.zry551.mcps.NoBlockUpdate.Events.BlockUpdate;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public final class NoBlockUpdate extends JavaPlugin {
    public Logger Log = getLogger();
    public NoBlockUpdate Self = this;
    public FileConfiguration Config = getConfig();
    public List<String> WorldList = new ArrayList<>();




    @Override
    public void onEnable() {
        // Plugin startup logic
        Log.info("NoBlockPlugin On Enable");
        saveDefaultConfig();
        try {
            WorldList = Config.getStringList("EnableWorlds");
        }catch (NullPointerException ex){
            this.Error_ConfigNoWorlds();
        }
        if(WorldList == null){
            this.Error_ConfigNoWorlds();
        }else{
            if(WorldList.isEmpty()){
                Log.warning("Warning : 'EnableWorlds' in config is Empty !");
            }
            Log.info("Registering Event Handler ......");
            Bukkit.getPluginManager().registerEvents(new BlockUpdate(WorldList),this);





        }



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Log.info("NoBlockPlugin On Disable");


    }



    public void Error_ConfigNoWorlds(){
        Log.info("Can't Load NoBlockPlugin because 'EnableWorlds' in config is null !");
        Log.info("Disabling this Plugin ......");
        getPluginLoader().disablePlugin(this);


    }
}
