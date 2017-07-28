package tresy.deathnote.common.util;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * Created by Tristan on 7/29/2017 in hydrotech
 * Based on ServerTickHandler of Eractnod
 */
public class ServerTickHandler {
    public int timer;
    
    public ServerTickHandler(int timer){
        this.timer = timer;
    }
    
    @SubscribeEvent
    public int onServerTick(TickEvent.ServerTickEvent event){
        timer--;
        if (timer == 0){
            timer = 12000;
        }
        return timer;
    }
    
    
}