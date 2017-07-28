package tresy.deathnote.client;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import tresy.deathnote.common.mods.BlockBreakMessage;

@Mod(modid = DeathNoteMod.MODID, version = DeathNoteMod.VERSION)
public class DeathNoteMod {
    
    public static final String MODID = "deathnotemod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
    }
}
