package tresy.deathnote.client;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tresy.deathnote.common.creativeTab.DeathnoteTabs;
import tresy.deathnote.common.mods.BlockBreakMessage;
import tresy.deathnote.common.proxies.CommonProxy;

@Mod(modid = DeathnoteMod.MODID, name = DeathnoteMod.MODNAME, version = DeathnoteMod.VERSION)
public class DeathnoteMod {
    
    public static final String MODID = "deathnotemod";
    public static final String MODNAME = "Deathnote Mod";
    public static final String VERSION = "1.0.0";
    
    public static DeathnoteTabs deathnoteTabs;
    
    @SidedProxy(clientSide="tresy.deathnote.common.proxies.ClientProxy", serverSide="tresy.deathnote.common.proxies.ServerProxy")
    public static CommonProxy proxy;
    
    @Instance
    public static DeathnoteMod instance = new DeathnoteMod();
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent e){
        proxy.preInit(e);
        deathnoteTabs = new DeathnoteTabs();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
