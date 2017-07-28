package tresy.deathnote.common.mods;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tresy.deathnote.common.util.ServerTickHandler;

/**
 * Created by Tristan on 7/28/2017 in hydrotech
 */
public class BlockBreakMessage {
    
    @SubscribeEvent
    public void detectBlockBreakEvent(BreakEvent breakEvent) {
        if (breakEvent.getState().getBlock().getUnlocalizedName().equalsIgnoreCase("tile.glass")) {
            brokeGlass(breakEvent.getPlayer());
        } else {
            brokeOther(breakEvent);
        }
    }
    
    public void brokeGlass(EntityPlayer player) {
        player.sendMessage(new TextComponentString(TextFormatting.RED + "YOU BROKE GLASS, DIE PIECE OF SHIT!"));
    
        ServerTickHandler handler = new ServerTickHandler(10000);
        int tick;
        
        do {
            tick = handler.onServerTick(null);
            System.out.println("waiting: " + tick);
        } while (tick != 1);
        
        player.onKillCommand();
    }
    
    public void brokeOther(BreakEvent breakEvent) {
        String message = "You broke a piece of the world: ";
        Block block = breakEvent.getState().getBlock();
        String blockName = block.getLocalizedName() + " " + block.getUnlocalizedName();
        message += blockName;
        
        sendInfoMessage(breakEvent.getPlayer(), message);
    }
    
    public void sendInfoMessage(EntityPlayer player, String message){
        sendMessage(player, new TextComponentString(TextFormatting.AQUA + message));
    }
    
    public void sendWarningMessage(EntityPlayer player, String message){
        sendMessage(player, new TextComponentString(TextFormatting.RED + message));
    }
    
    public void sendMessage(EntityPlayer player, TextComponentString textComponentString){
        player.sendMessage(textComponentString);
    }
}
