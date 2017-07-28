package tresy.deathnote;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import tresy.deathnote.mods.BlockBreakMessage;

@Mod(modid = DeathNoteModReference.MODID, version = DeathNoteModReference.VERSION)
public class DeathNoteMod {

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
    }
}
