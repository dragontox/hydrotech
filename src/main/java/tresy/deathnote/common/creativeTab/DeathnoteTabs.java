package tresy.deathnote.common.creativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Created by Tristan on 8/11/2017 in hydrotech
 */
@ParametersAreNonnullByDefault
public class DeathnoteTabs {
    
    public static class DeathnoteCreativeTab extends CreativeTabs {
        
        public DeathnoteCreativeTab() {
            super("deathnoteCreativeTab");
        }
        
        @Override
        public boolean hasSearchBar() {
            return true;
        }
    
        public String getTranslatedTabLabel(){
            return "Deathnote";
        }
    
    
        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.WRITABLE_BOOK);
        }
    }
    
    public static final CreativeTabs tab = new DeathnoteCreativeTab().setBackgroundImageName("item_search.png");
    
}
