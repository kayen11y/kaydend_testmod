package com.kaydend.testmod.item;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.kaydend.testmod.Testmod;
import com.kaydend.testmod.Items.testModItem;
import com.kaydend.testmod.help.Reference;
import com.sun.xml.internal.stream.Entity;

public class ItemCopperArmor extends ItemArmor {

	public ItemCopperArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		// TODO Auto-generated constructor stub
	}

	public String getArmorTexture(ItemStack armor, Entity entity, int slot,
			String type) {
		if (armor.getItem() == Testmod.copperLeggings) {
			return "kaydend_testmod:texture/models/armor/copper_layer_2";

		}

		else {

			return "kaydend_testmod:textures/models/armor/copper_layer_1";

		}
	}

}
