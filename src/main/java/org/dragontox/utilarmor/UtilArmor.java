package org.dragontox.utilarmor;


import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.dragontox.utilarmor.proxy.CommonProxy;

@Mod(modid = UtilArmor.MODID, version = UtilArmor.VERSION)
public class UtilArmor
{
    public static final String MODID = "utilarmor";
    public static final String VERSION = "0.01";

    @SidedProxy(clientSide = "org.dragontox.utilarmor.proxy.ClientProxy" , serverSide = "org.dragontox.ultilarmor.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
