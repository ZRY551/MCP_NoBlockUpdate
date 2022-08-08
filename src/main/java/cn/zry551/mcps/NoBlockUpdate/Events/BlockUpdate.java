package cn.zry551.mcps.NoBlockUpdate.Events;

import com.destroystokyo.paper.event.block.BlockDestroyEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.util.BlockIterator;

import java.util.ArrayList;
import java.util.List;

public class BlockUpdate implements Listener {
    public List<String> WorldList = new ArrayList<>();

    public BlockUpdate(List<String> ConfigList){
        this.WorldList = ConfigList;
    }

    @EventHandler
    public void Block_SpreadEvent(BlockSpreadEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_BreakEvent(BlockBreakEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_PlaceEvent(BlockPlaceEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_GrowEvent(BlockGrowEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_DestroyEvent(BlockDestroyEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_BurnEvent(BlockBurnEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_PhysicsEvent(BlockPhysicsEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_CookEvent(BlockCookEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_ExplodeEvent(BlockExplodeEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_PistonExtendEvent(BlockPistonExtendEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_PistonRetractEvent(BlockPistonRetractEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_ShearEntityEvent(BlockShearEntityEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_DropItemEvent(BlockDropItemEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_IgniteEvent(BlockIgniteEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_SpongeAbsorbEvent(SpongeAbsorbEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void Block_SignChangeEvent(SignChangeEvent e){
        if(WorldList.contains(e.getBlock().getWorld().getName())){
            e.setCancelled(true);
        }
    }






}
