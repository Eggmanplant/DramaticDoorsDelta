package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CobblemonCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_APRICORN, DDNames.SHORT_APRICORN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("cobblemon", "apricorn_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"), "tall_wooden_door");
	}
}
