package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class MysticsBiomesCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MB_CHERRY, DDNames.SHORT_MB_CHERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mysticsbiomes", "cherry_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MB_JACARANDA, DDNames.SHORT_MB_JACARANDA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mysticsbiomes", "jacaranda_door")), true, DDRegistry.MAIN_TAB);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MB_STRAWBERRY, DDNames.SHORT_MB_STRAWBERRY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mysticsbiomes", "strawberry_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MB_CHERRY, new ResourceLocation("mysticsbiomes", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MB_JACARANDA, new ResourceLocation("mysticsbiomes", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_MB_STRAWBERRY, new ResourceLocation("mysticsbiomes", "strawberry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MB_CHERRY, new ResourceLocation("mysticsbiomes", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MB_JACARANDA, new ResourceLocation("mysticsbiomes", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MB_STRAWBERRY, new ResourceLocation("mysticsbiomes", "strawberry_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MB_CHERRY, new ResourceLocation("mysticsbiomes", "cherry_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MB_JACARANDA, new ResourceLocation("mysticsbiomes", "jacaranda_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_MB_STRAWBERRY, new ResourceLocation("mysticsbiomes", "strawberry_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MB_CHERRY, new ResourceLocation("mysticsbiomes", "cherry_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MB_JACARANDA, new ResourceLocation("mysticsbiomes", "jacaranda_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MB_STRAWBERRY, new ResourceLocation("mysticsbiomes", "strawberry_door"), "tall_wooden_door");
	}
}