package com.kaydend.testmod.Items;

import com.kaydend.testmod.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class testModItem extends Item {

	
	public testModItem(){
		
		super();
		setCreativeTab(CreativeTabs.tabMaterials);
		setTextureName("testmod:copper_ingot");
		
	}
	
}
