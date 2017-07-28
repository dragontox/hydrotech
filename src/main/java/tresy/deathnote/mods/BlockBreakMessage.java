package tresy.deathnote.mods;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Tristan on 7/28/2017 in hydrotech
 */
public class BlockBreakMessage {
    
    @SubscribeEvent
    public void sendMessage(BreakEvent event) {
        event.getPlayer().sendMessage(new TextComponentString(TextFormatting.AQUA + "You broke a piece of the world"));
    }
}
