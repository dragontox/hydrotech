package org.dragontox.utilarmor;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.dragontox.utilarmor.creativeTab.creativeTabUtilArmor;
import org.dragontox.utilarmor.proxy.CommonProxy;

@Mod(modid = UtilArmor.MODID, version = UtilArmor.VERSION)
public class UtilArmor
{
    public static final String MODID = "utilarmor";
    public static final String VERSION = "0.01";
    public static creativeTabUtilArmor TabUtilArmor;

    @SidedProxy(clientSide = "org.dragontox.utilarmor.proxy.ClientProxy" , serverSide = "org.dragontox.ultilarmor.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
        TabUtilArmor = new creativeTabUtilArmor(CreativeTabs.getNextID(), "Util_Armor");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }
}
