package tresy.deathnote.common.mods;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Tristan on 7/28/2017 in hydrotech
 */
public class BlockBreakMessage {
    
    @SubscribeEvent
    public void sendMessage(BreakEvent breakEvent) {
        String message = "You broke a piece of the world: ";
        String blockName = breakEvent.getState().getBlock().getLocalizedName();
        message += blockName;
        breakEvent.getPlayer().sendMessage(new TextComponentString(TextFormatting.AQUA + message));
    }
}
