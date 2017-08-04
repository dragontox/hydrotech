package org.dragontox.utilarmor.creativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class creativeTabUtilArmor extends CreativeTabs {
    public creativeTabUtilArmor(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {

        return new ItemStack(Items.DIAMOND_CHESTPLATE);
    }
}
