package tresy.deathnote.common.mods;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandKill;
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
        
        if (breakEvent.getState().getBlock().getUnlocalizedName().equalsIgnoreCase("tile.glass")) {
            brokeGlass(breakEvent);
        } else {
            brokeOther(breakEvent);
        }
    }
    
    public void brokeGlass(BreakEvent breakEvent) {
        
        breakEvent.getPlayer().sendMessage(new TextComponentString(TextFormatting.RED + "YOU BROKE GLASS, DIE PIECE OF SHIT!"));
        breakEvent.getPlayer().onKillCommand();
    }
    
    public void brokeOther(BreakEvent breakEvent) {
        String message = "You broke a piece of the world: ";
        String blockName = breakEvent.getState().getBlock().getLocalizedName() + " " + breakEvent.getState().getBlock().getUnlocalizedName();
        message += blockName;
        
        breakEvent.getPlayer().sendMessage(new TextComponentString(TextFormatting.AQUA + message));
    }
}
