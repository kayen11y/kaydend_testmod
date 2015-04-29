package com.kaydend.testmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.kaydend.testmod.help.Reference;
import com.kaydend.testmod.item.ItemCopperArmor;
import com.kaydend.testmod.item.ItemCopperAxe;
import com.kaydend.testmod.item.ItemCopperHoe;
import com.kaydend.testmod.item.ItemCopperPickaxe;
import com.kaydend.testmod.item.ItemCopperSpade;
import com.kaydend.testmod.item.ItemCopperSword;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class Testmod {
	
	
        public static Item copperIngot;
	    public static Block blockCopper;
	    public static Item copperPickaxe;
	    public static Item copperSpade;
	    public static Item copperSword;
	    public static Item copperHoe;
	    public static Item copperAxe;
	    public static Item copperHelmet;
	    public static Item copperChestplate;
	    public static Item copperLeggings;
	    public static Item copperBoots;
	    
	    
	    
	    
	    
	    
	    public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("copperToolMaterial", 4, 3000, 20.0F, 7.0F, 30);
	    public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("copperArmorMaterial", 5000, new int[]{20,30,25,20}, 30);
	    
		@Mod.EventHandler
		public void preInit(FMLPreInitializationEvent event){
			
			copperIngot = new Item().setUnlocalizedName("copperIngot").setTextureName("kaydend_testmod:copper_ingot").setCreativeTab(CreativeTabs.tabMaterials);
			blockCopper = new blockcopper(Material.ground).setBlockName("blockCopper").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName("kaydend_testmod:blockCopper");
			GameRegistry.registerBlock(blockCopper, blockCopper.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(copperIngot, copperIngot.getUnlocalizedName().substring(5));
			System.out.println(blockCopper.getUnlocalizedName().substring(5));
			copperPickaxe = new ItemCopperPickaxe(copperToolMaterial).setUnlocalizedName("ItemCopperPickaxe").setTextureName(Reference.modid + ":" + "ItemCopperPickAxe").setCreativeTab(CreativeTabs.tabCombat);
			copperSpade = new ItemCopperSpade(copperToolMaterial).setUnlocalizedName("ItemCopperSpade").setTextureName(Reference.modid + ":" + "ItemCopperSpade").setCreativeTab(CreativeTabs.tabCombat);
			copperSword = new ItemCopperSword(copperToolMaterial).setUnlocalizedName("ItemCopperSword").setTextureName(Reference.modid + ":" + "ItemCopperSword").setCreativeTab(CreativeTabs.tabCombat);
			copperHoe = new ItemCopperHoe(copperToolMaterial).setUnlocalizedName("ItemCopperHoe").setTextureName(Reference.modid + ":" + "ItemCopperHoe").setCreativeTab(CreativeTabs.tabCombat);
			copperAxe = new ItemCopperAxe(copperToolMaterial).setUnlocalizedName("ItemCopperAxe").setTextureName(Reference.modid + ":" + "ItemCopperAxe").setCreativeTab(CreativeTabs.tabCombat);
			copperHelmet = new ItemCopperArmor(copperArmorMaterial, 0, 0).setUnlocalizedName("ItemCopperHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.modid + ":" + "ItemCopperHelmet");
			copperChestplate = new ItemCopperArmor(copperArmorMaterial, 0, 1).setUnlocalizedName("ItemCopperChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.modid + ":" + "ItemCopperChestplate");
			copperLeggings = new ItemCopperArmor(copperArmorMaterial, 0, 2).setUnlocalizedName("ItemCopperLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.modid + ":" + "ItemCopperLeggings");
			copperBoots = new ItemCopperArmor(copperArmorMaterial, 0, 3).setUnlocalizedName("ItemCopperBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.modid + ":" + "ItemCopperBoots");
			
			
			
			
			
			GameRegistry.registerItem(copperPickaxe, copperPickaxe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(copperSpade, copperSpade.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(copperSword, copperSword.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(copperHoe, copperHoe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(copperAxe, copperAxe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(copperHelmet, copperHelmet.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(copperChestplate, copperChestplate.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(copperLeggings, copperLeggings.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(copperBoots, copperBoots.getUnlocalizedName().substring(5));
			GameRegistry.registerWorldGenerator(new CopperGen(), 0);
		
		
		
		}
		
		@Mod.EventHandler
		public void init(FMLInitializationEvent event)
		{
			GameRegistry.addRecipe(new ItemStack(blockCopper),   "III",
				                                                 "III",
				                                                 "III", 'I', copperIngot );
			
			GameRegistry.addRecipe(new ItemStack(copperPickaxe), "III",
					                                             " S ",
					                                             " S ", 'I', copperIngot, 'S', Items.stick);
			
			GameRegistry.addRecipe(new ItemStack(copperSpade), " I ",
					                                           " S ",
					                                           " S ", 'I', copperIngot, 'S', Items.stick);
			
			GameRegistry.addRecipe(new ItemStack(copperSword), " I ",
                                                               " I ",
                                                               " S ", 'I', copperIngot, 'S', Items.stick);
			
			GameRegistry.addRecipe(new ItemStack(copperAxe),   "II ",
                                                               "IS ",
                                                               " S ", 'I', copperIngot, 'S', Items.stick);
			
			GameRegistry.addRecipe(new ItemStack(copperHoe),   "II ",
                                                               " S ",
                                                               " S ", 'I', copperIngot, 'S', Items.stick);
			
			
		}
		@Mod.EventHandler
		public void postInit(FMLPostInitializationEvent event)
		{
			
		}
			

}
