package tresy.deathnote.common.item;

import net.minecraft.item.Item;
import tresy.deathnote.common.creativeTab.DeathnoteTabs;

/**
 * Created by Tristan on 8/11/2017 in hydrotech
 */
public class ItemDeathNote extends Item {
    
    public static Item deathNote;
    
    private static final String name = "deathnote";
    private static final String label = "Deathnote";
    
    public ItemDeathNote() {
        super();
        setMaxStackSize(1);
        setRegistryName(name);
        setUnlocalizedName(label);
        setCreativeTab(DeathnoteTabs.tab);
    }
    
}
