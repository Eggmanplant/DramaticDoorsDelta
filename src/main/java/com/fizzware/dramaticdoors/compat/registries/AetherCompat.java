package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AetherCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_AETHER_SKYROOT, DDNames.SHORT_AETHER_SKYROOT, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("aether", "skyroot_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"), "tall_wooden_door");
	}
}
