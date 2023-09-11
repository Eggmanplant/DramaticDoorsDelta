package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class MacawCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_STORE, DDNames.SHORT_MACAW_STORE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "store_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SLIDING_GLASS, DDNames.SHORT_MACAW_SLIDING_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "store_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JAIL, DDNames.SHORT_MACAW_JAIL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jail_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL, DDNames.SHORT_MACAW_METAL_REINFORCED, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "reinforced_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_HOSPITAL, DDNames.SHORT_MACAW_METAL_HOSPITAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_hospital_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_REINFORCED, DDNames.SHORT_MACAW_METAL_REINFORCED, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_reinforced_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_WARNING, DDNames.SHORT_MACAW_METAL_WARNING, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_warning_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_METAL_WINDOWED, DDNames.SHORT_MACAW_METAL_WINDOWED, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "metal_windowed_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BARN, DDNames.SHORT_MACAW_OAK_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_barn_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BARN, DDNames.SHORT_MACAW_SPRUCE_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_barn_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BARN, DDNames.SHORT_MACAW_BIRCH_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_barn_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BARN, DDNames.SHORT_MACAW_JUNGLE_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_barn_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BARN, DDNames.SHORT_MACAW_ACACIA_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_barn_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BARN, DDNames.SHORT_MACAW_DARK_OAK_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_barn_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BARN, DDNames.SHORT_MACAW_MANGROVE_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_barn_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_BARN, DDNames.SHORT_MACAW_CHERRY_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_barn_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BARN, DDNames.SHORT_MACAW_BAMBOO_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_barn_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BARN, DDNames.SHORT_MACAW_CRIMSON_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_barn_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BARN, DDNames.SHORT_MACAW_WARPED_BARN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_barn_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);
		
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BARN_GLASS, DDNames.SHORT_MACAW_OAK_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_barn_glass_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, DDNames.SHORT_MACAW_SPRUCE_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_barn_glass_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, DDNames.SHORT_MACAW_BIRCH_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_barn_glass_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, DDNames.SHORT_MACAW_JUNGLE_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_barn_glass_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, DDNames.SHORT_MACAW_ACACIA_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_barn_glass_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, DDNames.SHORT_MACAW_DARK_OAK_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, DDNames.SHORT_MACAW_MANGROVE_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_barn_glass_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_BARN_GLASS, DDNames.SHORT_MACAW_CHERRY_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_barn_glass_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, DDNames.SHORT_MACAW_BAMBOO_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_barn_glass_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, DDNames.SHORT_MACAW_CRIMSON_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_barn_glass_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BARN_GLASS, DDNames.SHORT_MACAW_WARPED_BARN_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_barn_glass_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_OAK_STABLE, DDNames.SHORT_MACAW_OAK_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_stable_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_STABLE, DDNames.SHORT_MACAW_SPRUCE_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_stable_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_STABLE, DDNames.SHORT_MACAW_BIRCH_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_stable_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_STABLE, DDNames.SHORT_MACAW_JUNGLE_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_stable_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_STABLE, DDNames.SHORT_MACAW_ACACIA_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_stable_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_STABLE, DDNames.SHORT_MACAW_DARK_OAK_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_stable_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_STABLE, DDNames.SHORT_MACAW_MANGROVE_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_stable_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_STABLE, DDNames.SHORT_MACAW_CHERRY_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_stable_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_STABLE, DDNames.SHORT_MACAW_BAMBOO_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_stable_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_STABLE, DDNames.SHORT_MACAW_CRIMSON_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stable_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_STABLE, DDNames.SHORT_MACAW_WARPED_STABLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stable_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_OAK_STABLE_HEAD, DDNames.SHORT_MACAW_OAK_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_stable_head_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, DDNames.SHORT_MACAW_SPRUCE_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_stable_head_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, DDNames.SHORT_MACAW_BIRCH_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_stable_head_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, DDNames.SHORT_MACAW_JUNGLE_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_stable_head_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, DDNames.SHORT_MACAW_ACACIA_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_stable_head_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, DDNames.SHORT_MACAW_DARK_OAK_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_stable_head_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, DDNames.SHORT_MACAW_MANGROVE_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_stable_head_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_STABLE_HEAD, DDNames.SHORT_MACAW_CHERRY_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_stable_head_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, DDNames.SHORT_MACAW_BAMBOO_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_stable_head_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, DDNames.SHORT_MACAW_CRIMSON_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stable_head_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerStableDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, DDNames.SHORT_MACAW_WARPED_STABLE_HEAD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stable_head_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BARK_GLASS, DDNames.SHORT_MACAW_OAK_BARK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_bark_glass_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, DDNames.SHORT_MACAW_SPRUCE_BARK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_bark_glass_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, DDNames.SHORT_MACAW_BIRCH_BARK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_bark_glass_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, DDNames.SHORT_MACAW_JUNGLE_BARK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_bark_glass_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, DDNames.SHORT_MACAW_ACACIA_BARK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_bark_glass_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, DDNames.SHORT_MACAW_DARK_OAK_BARK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, DDNames.SHORT_MACAW_MANGROVE_BARK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_bark_glass_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_BARK_GLASS, DDNames.SHORT_MACAW_CHERRY_BARK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_bark_glass_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, DDNames.SHORT_MACAW_BAMBOO_BARK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_bark_glass_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, DDNames.SHORT_MACAW_CRIMSON_STEM_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_stem_glass_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_STEM_GLASS, DDNames.SHORT_MACAW_WARPED_STEM_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_stem_glass_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_GLASS, DDNames.SHORT_MACAW_OAK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_glass_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_GLASS, DDNames.SHORT_MACAW_SPRUCE_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_glass_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_GLASS, DDNames.SHORT_MACAW_BIRCH_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_glass_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_GLASS, DDNames.SHORT_MACAW_JUNGLE_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_glass_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_GLASS, DDNames.SHORT_MACAW_ACACIA_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_glass_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_GLASS, DDNames.SHORT_MACAW_DARK_OAK_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_glass_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_GLASS, DDNames.SHORT_MACAW_MANGROVE_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_glass_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_GLASS, DDNames.SHORT_MACAW_CHERRY_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_glass_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_GLASS, DDNames.SHORT_MACAW_BAMBOO_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_glass_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_GLASS, DDNames.SHORT_MACAW_CRIMSON_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_glass_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_GLASS, DDNames.SHORT_MACAW_WARPED_GLASS, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_glass_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_MODERN, DDNames.SHORT_MACAW_OAK_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_modern_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_MODERN, DDNames.SHORT_MACAW_SPRUCE_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_modern_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_MODERN, DDNames.SHORT_MACAW_BIRCH_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_modern_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_MODERN, DDNames.SHORT_MACAW_JUNGLE_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_modern_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_MODERN, DDNames.SHORT_MACAW_ACACIA_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_modern_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_MODERN, DDNames.SHORT_MACAW_DARK_OAK_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_modern_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_MODERN, DDNames.SHORT_MACAW_MANGROVE_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_modern_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_MODERN, DDNames.SHORT_MACAW_CHERRY_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_modern_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_MODERN, DDNames.SHORT_MACAW_BAMBOO_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_modern_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_MODERN, DDNames.SHORT_MACAW_CRIMSON_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_modern_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_MODERN, DDNames.SHORT_MACAW_WARPED_MODERN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_modern_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_OAK_JAPANESE, DDNames.SHORT_MACAW_OAK_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_japanese_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_JAPANESE, DDNames.SHORT_MACAW_SPRUCE_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_japanese_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_JAPANESE, DDNames.SHORT_MACAW_BIRCH_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_japanese_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_JAPANESE, DDNames.SHORT_MACAW_JUNGLE_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_japanese_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_JAPANESE, DDNames.SHORT_MACAW_ACACIA_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_japanese_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, DDNames.SHORT_MACAW_DARK_OAK_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_japanese_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_JAPANESE, DDNames.SHORT_MACAW_MANGROVE_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_japanese_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_JAPANESE, DDNames.SHORT_MACAW_CHERRY_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_japanese_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_JAPANESE, DDNames.SHORT_MACAW_BAMBOO_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_japanese_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_JAPANESE, DDNames.SHORT_MACAW_CRIMSON_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_japanese_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_JAPANESE, DDNames.SHORT_MACAW_WARPED_JAPANESE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_japanese_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_OAK_JAPANESE2, DDNames.SHORT_MACAW_OAK_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_japanese2_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, DDNames.SHORT_MACAW_SPRUCE_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_japanese2_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_JAPANESE2, DDNames.SHORT_MACAW_BIRCH_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_japanese2_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, DDNames.SHORT_MACAW_JUNGLE_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_japanese2_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_JAPANESE2, DDNames.SHORT_MACAW_ACACIA_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_japanese2_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, DDNames.SHORT_MACAW_DARK_OAK_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_japanese2_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, DDNames.SHORT_MACAW_MANGROVE_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_japanese2_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_JAPANESE2, DDNames.SHORT_MACAW_CHERRY_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_japanese2_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, DDNames.SHORT_MACAW_BAMBOO_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_japanese2_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, DDNames.SHORT_MACAW_CRIMSON_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_japanese2_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_JAPANESE2, DDNames.SHORT_MACAW_WARPED_JAPANESE2, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_japanese2_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_CLASSIC, DDNames.SHORT_MACAW_SPRUCE_CLASSIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_classic_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_CLASSIC, DDNames.SHORT_MACAW_BIRCH_CLASSIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_classic_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_CLASSIC, DDNames.SHORT_MACAW_JUNGLE_CLASSIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_classic_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_CLASSIC, DDNames.SHORT_MACAW_ACACIA_CLASSIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_classic_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, DDNames.SHORT_MACAW_DARK_OAK_CLASSIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_classic_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_CLASSIC, DDNames.SHORT_MACAW_MANGROVE_CLASSIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_classic_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_CLASSIC, DDNames.SHORT_MACAW_CHERRY_CLASSIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_classic_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_CLASSIC, DDNames.SHORT_MACAW_BAMBOO_CLASSIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_classic_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_CLASSIC, DDNames.SHORT_MACAW_CRIMSON_CLASSIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_classic_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_CLASSIC, DDNames.SHORT_MACAW_WARPED_CLASSIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_classic_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_COTTAGE, DDNames.SHORT_MACAW_OAK_COTTAGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_cottage_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_COTTAGE, DDNames.SHORT_MACAW_BIRCH_COTTAGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_cottage_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_COTTAGE, DDNames.SHORT_MACAW_JUNGLE_COTTAGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_cottage_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_COTTAGE, DDNames.SHORT_MACAW_ACACIA_COTTAGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_cottage_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, DDNames.SHORT_MACAW_DARK_OAK_COTTAGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_cottage_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_COTTAGE, DDNames.SHORT_MACAW_MANGROVE_COTTAGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_cottage_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_COTTAGE, DDNames.SHORT_MACAW_CHERRY_COTTAGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_cottage_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_COTTAGE, DDNames.SHORT_MACAW_BAMBOO_COTTAGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_cottage_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_COTTAGE, DDNames.SHORT_MACAW_CRIMSON_COTTAGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_cottage_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_COTTAGE, DDNames.SHORT_MACAW_WARPED_COTTAGE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_cottage_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_PAPER, DDNames.SHORT_MACAW_OAK_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_paper_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_PAPER, DDNames.SHORT_MACAW_SPRUCE_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_paper_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_PAPER, DDNames.SHORT_MACAW_JUNGLE_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_paper_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_PAPER, DDNames.SHORT_MACAW_ACACIA_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_paper_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_PAPER, DDNames.SHORT_MACAW_DARK_OAK_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_paper_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_PAPER, DDNames.SHORT_MACAW_MANGROVE_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_paper_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_PAPER, DDNames.SHORT_MACAW_CHERRY_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_paper_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_PAPER, DDNames.SHORT_MACAW_BAMBOO_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_paper_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_PAPER, DDNames.SHORT_MACAW_CRIMSON_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_paper_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_PAPER, DDNames.SHORT_MACAW_WARPED_PAPER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_paper_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BEACH, DDNames.SHORT_MACAW_OAK_BEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_beach_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BEACH, DDNames.SHORT_MACAW_SPRUCE_BEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_beach_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BEACH, DDNames.SHORT_MACAW_BIRCH_BEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_beach_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BEACH, DDNames.SHORT_MACAW_ACACIA_BEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_beach_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BEACH, DDNames.SHORT_MACAW_DARK_OAK_BEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_beach_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BEACH, DDNames.SHORT_MACAW_MANGROVE_BEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_beach_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_BEACH, DDNames.SHORT_MACAW_CHERRY_BEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_beach_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_BEACH, DDNames.SHORT_MACAW_BAMBOO_BEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_beach_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BEACH, DDNames.SHORT_MACAW_CRIMSON_BEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_beach_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BEACH, DDNames.SHORT_MACAW_WARPED_BEACH, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_beach_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_TROPICAL, DDNames.SHORT_MACAW_OAK_TROPICAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_tropical_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_TROPICAL, DDNames.SHORT_MACAW_SPRUCE_TROPICAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_tropical_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_TROPICAL, DDNames.SHORT_MACAW_BIRCH_TROPICAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_tropical_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_TROPICAL, DDNames.SHORT_MACAW_JUNGLE_TROPICAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_tropical_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, DDNames.SHORT_MACAW_DARK_OAK_TROPICAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_tropical_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_TROPICAL, DDNames.SHORT_MACAW_MANGROVE_TROPICAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_tropical_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_TROPICAL, DDNames.SHORT_MACAW_CHERRY_TROPICAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_tropical_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_TROPICAL, DDNames.SHORT_MACAW_BAMBOO_TROPICAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_tropical_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_TROPICAL, DDNames.SHORT_MACAW_CRIMSON_TROPICAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_tropical_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_TROPICAL, DDNames.SHORT_MACAW_WARPED_TROPICAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_tropical_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_FOUR_PANEL, DDNames.SHORT_MACAW_OAK_FOUR_PANEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_four_panel_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, DDNames.SHORT_MACAW_SPRUCE_FOUR_PANEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_four_panel_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, DDNames.SHORT_MACAW_BIRCH_FOUR_PANEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_four_panel_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, DDNames.SHORT_MACAW_JUNGLE_FOUR_PANEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_four_panel_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, DDNames.SHORT_MACAW_ACACIA_FOUR_PANEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_four_panel_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, DDNames.SHORT_MACAW_MANGROVE_FOUR_PANEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_four_panel_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_FOUR_PANEL, DDNames.SHORT_MACAW_CHERRY_FOUR_PANEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_four_panel_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, DDNames.SHORT_MACAW_BAMBOO_FOUR_PANEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_four_panel_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, DDNames.SHORT_MACAW_CRIMSON_FOUR_PANEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_four_panel_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, DDNames.SHORT_MACAW_WARPED_FOUR_PANEL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_four_panel_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_SWAMP, DDNames.SHORT_MACAW_OAK_SWAMP, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_swamp_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_SWAMP, DDNames.SHORT_MACAW_SPRUCE_SWAMP, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_swamp_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_SWAMP, DDNames.SHORT_MACAW_BIRCH_SWAMP, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_swamp_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_SWAMP, DDNames.SHORT_MACAW_JUNGLE_SWAMP, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_swamp_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_SWAMP, DDNames.SHORT_MACAW_ACACIA_SWAMP, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_swamp_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_SWAMP, DDNames.SHORT_MACAW_DARK_OAK_SWAMP, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_swamp_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_SWAMP, DDNames.SHORT_MACAW_CHERRY_SWAMP, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_swamp_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_SWAMP, DDNames.SHORT_MACAW_BAMBOO_SWAMP, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_swamp_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_SWAMP, DDNames.SHORT_MACAW_CRIMSON_SWAMP, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_swamp_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_SWAMP, DDNames.SHORT_MACAW_WARPED_SWAMP, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_swamp_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_WAFFLE, DDNames.SHORT_MACAW_OAK_WAFFLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_waffle_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_WAFFLE, DDNames.SHORT_MACAW_SPRUCE_WAFFLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_waffle_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_WAFFLE, DDNames.SHORT_MACAW_BIRCH_WAFFLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_waffle_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_WAFFLE, DDNames.SHORT_MACAW_JUNGLE_WAFFLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_waffle_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_WAFFLE, DDNames.SHORT_MACAW_ACACIA_WAFFLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_waffle_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_WAFFLE, DDNames.SHORT_MACAW_DARK_OAK_WAFFLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_waffle_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_WAFFLE, DDNames.SHORT_MACAW_MANGROVE_WAFFLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_waffle_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_WAFFLE, DDNames.SHORT_MACAW_BAMBOO_WAFFLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_waffle_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_WAFFLE, DDNames.SHORT_MACAW_CRIMSON_WAFFLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_waffle_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_WAFFLE, DDNames.SHORT_MACAW_WARPED_WAFFLE, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_waffle_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_BAMBOO, DDNames.SHORT_MACAW_OAK_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_bamboo_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_BAMBOO, DDNames.SHORT_MACAW_SPRUCE_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_bamboo_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_BAMBOO, DDNames.SHORT_MACAW_BIRCH_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_bamboo_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_BAMBOO, DDNames.SHORT_MACAW_JUNGLE_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_bamboo_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_BAMBOO, DDNames.SHORT_MACAW_ACACIA_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_bamboo_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, DDNames.SHORT_MACAW_DARK_OAK_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_bamboo_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_BAMBOO, DDNames.SHORT_MACAW_MANGROVE_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_bamboo_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_BAMBOO, DDNames.SHORT_MACAW_CHERRY_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_bamboo_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_BAMBOO, DDNames.SHORT_MACAW_CRIMSON_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_bamboo_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_BAMBOO, DDNames.SHORT_MACAW_WARPED_BAMBOO, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_bamboo_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_NETHER, DDNames.SHORT_MACAW_OAK_NETHER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_nether_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_NETHER, DDNames.SHORT_MACAW_SPRUCE_NETHER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_nether_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_NETHER, DDNames.SHORT_MACAW_BIRCH_NETHER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_nether_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_NETHER, DDNames.SHORT_MACAW_JUNGLE_NETHER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_nether_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_NETHER, DDNames.SHORT_MACAW_ACACIA_NETHER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_nether_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_NETHER, DDNames.SHORT_MACAW_DARK_OAK_NETHER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_nether_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_NETHER, DDNames.SHORT_MACAW_MANGROVE_NETHER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_nether_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_NETHER, DDNames.SHORT_MACAW_CHERRY_NETHER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_nether_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_NETHER, DDNames.SHORT_MACAW_BAMBOO_NETHER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_nether_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_WARPED_NETHER, DDNames.SHORT_MACAW_WARPED_NETHER, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "warped_nether_door"), Blocks.WARPED_DOOR), BlockSetType.WARPED, false);

		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_OAK_MYSTIC, DDNames.SHORT_MACAW_OAK_MYSTIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "oak_mystic_door"), Blocks.OAK_DOOR), BlockSetType.OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_SPRUCE_MYSTIC, DDNames.SHORT_MACAW_SPRUCE_MYSTIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "spruce_mystic_door"), Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BIRCH_MYSTIC, DDNames.SHORT_MACAW_BIRCH_MYSTIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "birch_mystic_door"), Blocks.BIRCH_DOOR), BlockSetType.BIRCH, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_JUNGLE_MYSTIC, DDNames.SHORT_MACAW_JUNGLE_MYSTIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "jungle_mystic_door"), Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_ACACIA_MYSTIC, DDNames.SHORT_MACAW_ACACIA_MYSTIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "acacia_mystic_door"), Blocks.ACACIA_DOOR), BlockSetType.ACACIA, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, DDNames.SHORT_MACAW_DARK_OAK_MYSTIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "dark_oak_mystic_door"), Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_MANGROVE_MYSTIC, DDNames.SHORT_MACAW_MANGROVE_MYSTIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "mangrove_mystic_door"), Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CHERRY_MYSTIC, DDNames.SHORT_MACAW_CHERRY_MYSTIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "cherry_mystic_door"), Blocks.CHERRY_DOOR), BlockSetType.CHERRY, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_BAMBOO_MYSTIC, DDNames.SHORT_MACAW_BAMBOO_MYSTIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "bamboo_mystic_door"), Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO, false);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_MACAW_CRIMSON_MYSTIC, DDNames.SHORT_MACAW_CRIMSON_MYSTIC, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("mcwdoors", "crimson_mystic_door"), Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON, false);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_STORE, new ResourceLocation("mcwdoors", "store_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SLIDING_GLASS, new ResourceLocation("mcwdoors", "sliding_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JAIL, new ResourceLocation("mcwdoors", "jail_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL, new ResourceLocation("mcwdoors", "metal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_HOSPITAL, new ResourceLocation("mcwdoors", "metal_hospital_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_REINFORCED, new ResourceLocation("mcwdoors", "metal_reinforced_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_WARNING, new ResourceLocation("mcwdoors", "metal_warning_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_METAL_WINDOWED, new ResourceLocation("mcwdoors", "metal_windowed_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARN, new ResourceLocation("mcwdoors", "oak_barn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARN, new ResourceLocation("mcwdoors", "spruce_barn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARN, new ResourceLocation("mcwdoors", "birch_barn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARN, new ResourceLocation("mcwdoors", "jungle_barn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARN, new ResourceLocation("mcwdoors", "acacia_barn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARN, new ResourceLocation("mcwdoors", "dark_oak_barn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BARN, new ResourceLocation("mcwdoors", "mangrove_barn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_BARN, new ResourceLocation("mcwdoors", "cherry_barn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_BARN, new ResourceLocation("mcwdoors", "bamboo_barn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BARN, new ResourceLocation("mcwdoors", "crimson_barn_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BARN, new ResourceLocation("mcwdoors", "warped_barn_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "oak_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, new ResourceLocation("mcwdoors", "spruce_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, new ResourceLocation("mcwdoors", "birch_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, new ResourceLocation("mcwdoors", "jungle_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, new ResourceLocation("mcwdoors", "acacia_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, new ResourceLocation("mcwdoors", "mangrove_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_BARN_GLASS, new ResourceLocation("mcwdoors", "cherry_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, new ResourceLocation("mcwdoors", "bamboo_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, new ResourceLocation("mcwdoors", "crimson_barn_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BARN_GLASS, new ResourceLocation("mcwdoors", "warped_barn_glass_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_STABLE, new ResourceLocation("mcwdoors", "oak_stable_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_STABLE, new ResourceLocation("mcwdoors", "spruce_stable_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_STABLE, new ResourceLocation("mcwdoors", "birch_stable_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_STABLE, new ResourceLocation("mcwdoors", "jungle_stable_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_STABLE, new ResourceLocation("mcwdoors", "acacia_stable_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_STABLE, new ResourceLocation("mcwdoors", "dark_oak_stable_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_STABLE, new ResourceLocation("mcwdoors", "mangrove_stable_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_STABLE, new ResourceLocation("mcwdoors", "cherry_stable_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_STABLE, new ResourceLocation("mcwdoors", "bamboo_stable_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STABLE, new ResourceLocation("mcwdoors", "crimson_stable_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STABLE, new ResourceLocation("mcwdoors", "warped_stable_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "oak_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, new ResourceLocation("mcwdoors", "spruce_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, new ResourceLocation("mcwdoors", "birch_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, new ResourceLocation("mcwdoors", "jungle_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, new ResourceLocation("mcwdoors", "acacia_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "dark_oak_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, new ResourceLocation("mcwdoors", "mangrove_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_STABLE_HEAD, new ResourceLocation("mcwdoors", "cherry_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, new ResourceLocation("mcwdoors", "bamboo_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, new ResourceLocation("mcwdoors", "crimson_stable_head_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, new ResourceLocation("mcwdoors", "warped_stable_head_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "oak_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, new ResourceLocation("mcwdoors", "spruce_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, new ResourceLocation("mcwdoors", "birch_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, new ResourceLocation("mcwdoors", "jungle_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, new ResourceLocation("mcwdoors", "acacia_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, new ResourceLocation("mcwdoors", "mangrove_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_BARK_GLASS, new ResourceLocation("mcwdoors", "cherry_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, new ResourceLocation("mcwdoors", "bamboo_bark_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, new ResourceLocation("mcwdoors", "crimson_stem_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_STEM_GLASS, new ResourceLocation("mcwdoors", "warped_stem_glass_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_GLASS, new ResourceLocation("mcwdoors", "oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_GLASS, new ResourceLocation("mcwdoors", "spruce_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_GLASS, new ResourceLocation("mcwdoors", "birch_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_GLASS, new ResourceLocation("mcwdoors", "jungle_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_GLASS, new ResourceLocation("mcwdoors", "acacia_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_GLASS, new ResourceLocation("mcwdoors", "mangrove_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_GLASS, new ResourceLocation("mcwdoors", "cherry_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_GLASS, new ResourceLocation("mcwdoors", "bamboo_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_GLASS, new ResourceLocation("mcwdoors", "crimson_glass_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_GLASS, new ResourceLocation("mcwdoors", "warped_glass_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_MODERN, new ResourceLocation("mcwdoors", "oak_modern_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_MODERN, new ResourceLocation("mcwdoors", "spruce_modern_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_MODERN, new ResourceLocation("mcwdoors", "birch_modern_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_MODERN, new ResourceLocation("mcwdoors", "jungle_modern_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_MODERN, new ResourceLocation("mcwdoors", "acacia_modern_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_MODERN, new ResourceLocation("mcwdoors", "dark_oak_modern_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_MODERN, new ResourceLocation("mcwdoors", "mangrove_modern_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_MODERN, new ResourceLocation("mcwdoors", "cherry_modern_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_MODERN, new ResourceLocation("mcwdoors", "bamboo_modern_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_MODERN, new ResourceLocation("mcwdoors", "crimson_modern_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_MODERN, new ResourceLocation("mcwdoors", "warped_modern_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_JAPANESE, new ResourceLocation("mcwdoors", "oak_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE, new ResourceLocation("mcwdoors", "spruce_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_JAPANESE, new ResourceLocation("mcwdoors", "birch_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE, new ResourceLocation("mcwdoors", "jungle_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_JAPANESE, new ResourceLocation("mcwdoors", "acacia_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, new ResourceLocation("mcwdoors", "dark_oak_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_JAPANESE, new ResourceLocation("mcwdoors", "mangrove_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_JAPANESE, new ResourceLocation("mcwdoors", "cherry_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_JAPANESE, new ResourceLocation("mcwdoors", "bamboo_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE, new ResourceLocation("mcwdoors", "crimson_japanese_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_JAPANESE, new ResourceLocation("mcwdoors", "warped_japanese_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "oak_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, new ResourceLocation("mcwdoors", "spruce_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_JAPANESE2, new ResourceLocation("mcwdoors", "birch_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, new ResourceLocation("mcwdoors", "jungle_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_JAPANESE2, new ResourceLocation("mcwdoors", "acacia_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "dark_oak_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, new ResourceLocation("mcwdoors", "mangrove_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_JAPANESE2, new ResourceLocation("mcwdoors", "cherry_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, new ResourceLocation("mcwdoors", "bamboo_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, new ResourceLocation("mcwdoors", "crimson_japanese2_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_JAPANESE2, new ResourceLocation("mcwdoors", "warped_japanese2_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_CLASSIC, new ResourceLocation("mcwdoors", "spruce_classic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_CLASSIC, new ResourceLocation("mcwdoors", "birch_classic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_CLASSIC, new ResourceLocation("mcwdoors", "jungle_classic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_CLASSIC, new ResourceLocation("mcwdoors", "acacia_classic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, new ResourceLocation("mcwdoors", "dark_oak_classic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_CLASSIC, new ResourceLocation("mcwdoors", "mangrove_classic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_CLASSIC, new ResourceLocation("mcwdoors", "cherry_classic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_CLASSIC, new ResourceLocation("mcwdoors", "bamboo_classic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_CLASSIC, new ResourceLocation("mcwdoors", "crimson_classic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_CLASSIC, new ResourceLocation("mcwdoors", "warped_classic_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_COTTAGE, new ResourceLocation("mcwdoors", "oak_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_COTTAGE, new ResourceLocation("mcwdoors", "birch_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_COTTAGE, new ResourceLocation("mcwdoors", "jungle_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_COTTAGE, new ResourceLocation("mcwdoors", "acacia_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, new ResourceLocation("mcwdoors", "dark_oak_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_COTTAGE, new ResourceLocation("mcwdoors", "mangrove_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_COTTAGE, new ResourceLocation("mcwdoors", "cherry_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_COTTAGE, new ResourceLocation("mcwdoors", "bamboo_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_COTTAGE, new ResourceLocation("mcwdoors", "crimson_cottage_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_COTTAGE, new ResourceLocation("mcwdoors", "warped_cottage_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_PAPER, new ResourceLocation("mcwdoors", "oak_paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_PAPER, new ResourceLocation("mcwdoors", "spruce_paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_PAPER, new ResourceLocation("mcwdoors", "jungle_paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_PAPER, new ResourceLocation("mcwdoors", "acacia_paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_PAPER, new ResourceLocation("mcwdoors", "dark_oak_paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_PAPER, new ResourceLocation("mcwdoors", "mangrove_paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_PAPER, new ResourceLocation("mcwdoors", "cherry_paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_PAPER, new ResourceLocation("mcwdoors", "bamboo_paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_PAPER, new ResourceLocation("mcwdoors", "crimson_paper_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_PAPER, new ResourceLocation("mcwdoors", "warped_paper_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BEACH, new ResourceLocation("mcwdoors", "oak_beach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BEACH, new ResourceLocation("mcwdoors", "spruce_beach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BEACH, new ResourceLocation("mcwdoors", "birch_beach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BEACH, new ResourceLocation("mcwdoors", "acacia_beach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BEACH, new ResourceLocation("mcwdoors", "dark_oak_beach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BEACH, new ResourceLocation("mcwdoors", "mangrove_beach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_BEACH, new ResourceLocation("mcwdoors", "cherry_beach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_BEACH, new ResourceLocation("mcwdoors", "bamboo_beach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BEACH, new ResourceLocation("mcwdoors", "crimson_beach_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BEACH, new ResourceLocation("mcwdoors", "warped_beach_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_TROPICAL, new ResourceLocation("mcwdoors", "oak_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_TROPICAL, new ResourceLocation("mcwdoors", "spruce_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_TROPICAL, new ResourceLocation("mcwdoors", "birch_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_TROPICAL, new ResourceLocation("mcwdoors", "jungle_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, new ResourceLocation("mcwdoors", "dark_oak_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_TROPICAL, new ResourceLocation("mcwdoors", "mangrove_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_TROPICAL, new ResourceLocation("mcwdoors", "cherry_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_TROPICAL, new ResourceLocation("mcwdoors", "bamboo_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_TROPICAL, new ResourceLocation("mcwdoors", "crimson_tropical_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_TROPICAL, new ResourceLocation("mcwdoors", "warped_tropical_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_FOUR_PANEL, new ResourceLocation("mcwdoors", "oak_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, new ResourceLocation("mcwdoors", "spruce_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, new ResourceLocation("mcwdoors", "birch_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, new ResourceLocation("mcwdoors", "jungle_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, new ResourceLocation("mcwdoors", "acacia_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, new ResourceLocation("mcwdoors", "mangrove_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_FOUR_PANEL, new ResourceLocation("mcwdoors", "cherry_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, new ResourceLocation("mcwdoors", "bamboo_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, new ResourceLocation("mcwdoors", "crimson_four_panel_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, new ResourceLocation("mcwdoors", "warped_four_panel_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_SWAMP, new ResourceLocation("mcwdoors", "oak_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_SWAMP, new ResourceLocation("mcwdoors", "spruce_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_SWAMP, new ResourceLocation("mcwdoors", "birch_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_SWAMP, new ResourceLocation("mcwdoors", "jungle_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_SWAMP, new ResourceLocation("mcwdoors", "acacia_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_SWAMP, new ResourceLocation("mcwdoors", "dark_oak_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_SWAMP, new ResourceLocation("mcwdoors", "cherry_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_SWAMP, new ResourceLocation("mcwdoors", "bamboo_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_SWAMP, new ResourceLocation("mcwdoors", "crimson_swamp_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_SWAMP, new ResourceLocation("mcwdoors", "warped_swamp_door"));

		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_WAFFLE, new ResourceLocation("mcwdoors", "oak_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_WAFFLE, new ResourceLocation("mcwdoors", "spruce_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_WAFFLE, new ResourceLocation("mcwdoors", "birch_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_WAFFLE, new ResourceLocation("mcwdoors", "jungle_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_WAFFLE, new ResourceLocation("mcwdoors", "acacia_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_WAFFLE, new ResourceLocation("mcwdoors", "dark_oak_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_WAFFLE, new ResourceLocation("mcwdoors", "mangrove_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_WAFFLE, new ResourceLocation("mcwdoors", "bamboo_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_WAFFLE, new ResourceLocation("mcwdoors", "crimson_waffle_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_WAFFLE, new ResourceLocation("mcwdoors", "warped_waffle_door"));

		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_BAMBOO, new ResourceLocation("mcwdoors", "oak_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_BAMBOO, new ResourceLocation("mcwdoors", "spruce_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_BAMBOO, new ResourceLocation("mcwdoors", "birch_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_BAMBOO, new ResourceLocation("mcwdoors", "jungle_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_BAMBOO, new ResourceLocation("mcwdoors", "acacia_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, new ResourceLocation("mcwdoors", "dark_oak_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_BAMBOO, new ResourceLocation("mcwdoors", "mangrove_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_BAMBOO, new ResourceLocation("mcwdoors", "cherry_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_BAMBOO, new ResourceLocation("mcwdoors", "crimson_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_BAMBOO, new ResourceLocation("mcwdoors", "warped_bamboo_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_NETHER, new ResourceLocation("mcwdoors", "oak_nether_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_NETHER, new ResourceLocation("mcwdoors", "spruce_nether_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_NETHER, new ResourceLocation("mcwdoors", "birch_nether_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_NETHER, new ResourceLocation("mcwdoors", "jungle_nether_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_NETHER, new ResourceLocation("mcwdoors", "acacia_nether_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_NETHER, new ResourceLocation("mcwdoors", "dark_oak_nether_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_NETHER, new ResourceLocation("mcwdoors", "mangrove_nether_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_NETHER, new ResourceLocation("mcwdoors", "cherry_nether_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_NETHER, new ResourceLocation("mcwdoors", "bamboo_nether_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_WARPED_NETHER, new ResourceLocation("mcwdoors", "warped_nether_door"));
		
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_OAK_MYSTIC, new ResourceLocation("mcwdoors", "oak_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_SPRUCE_MYSTIC, new ResourceLocation("mcwdoors", "spruce_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BIRCH_MYSTIC, new ResourceLocation("mcwdoors", "birch_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_JUNGLE_MYSTIC, new ResourceLocation("mcwdoors", "jungle_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_ACACIA_MYSTIC, new ResourceLocation("mcwdoors", "acacia_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, new ResourceLocation("mcwdoors", "dark_oak_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_MANGROVE_MYSTIC, new ResourceLocation("mcwdoors", "mangrove_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CHERRY_MYSTIC, new ResourceLocation("mcwdoors", "cherry_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_BAMBOO_MYSTIC, new ResourceLocation("mcwdoors", "bamboo_mystic_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_MACAW_CRIMSON_MYSTIC, new ResourceLocation("mcwdoors", "crimson_mystic_door"));
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_STORE, new ResourceLocation("mcwdoors", "store_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SLIDING_GLASS, new ResourceLocation("mcwdoors", "sliding_glass_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JAIL, new ResourceLocation("mcwdoors", "jail_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL, new ResourceLocation("mcwdoors", "metal_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_HOSPITAL, new ResourceLocation("mcwdoors", "metal_hospital_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_REINFORCED, new ResourceLocation("mcwdoors", "metal_reinforced_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_WARNING, new ResourceLocation("mcwdoors", "metal_warning_door"), "tall_macaw_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_METAL_WINDOWED, new ResourceLocation("mcwdoors", "metal_windowed_door"), "tall_macaw_metal_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BARN, new ResourceLocation("mcwdoors", "oak_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BARN, new ResourceLocation("mcwdoors", "spruce_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BARN, new ResourceLocation("mcwdoors", "birch_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BARN, new ResourceLocation("mcwdoors", "jungle_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BARN, new ResourceLocation("mcwdoors", "acacia_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BARN, new ResourceLocation("mcwdoors", "dark_oak_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_BARN, new ResourceLocation("mcwdoors", "mangrove_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_BARN, new ResourceLocation("mcwdoors", "cherry_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_BARN, new ResourceLocation("mcwdoors", "bamboo_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BARN, new ResourceLocation("mcwdoors", "crimson_barn_door"), "tall_macaw_barn_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BARN, new ResourceLocation("mcwdoors", "warped_barn_door"), "tall_macaw_barn_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "oak_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, new ResourceLocation("mcwdoors", "spruce_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, new ResourceLocation("mcwdoors", "birch_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, new ResourceLocation("mcwdoors", "jungle_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, new ResourceLocation("mcwdoors", "acacia_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, new ResourceLocation("mcwdoors", "dark_oak_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_BARN_GLASS, new ResourceLocation("mcwdoors", "mangrove_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_BARN_GLASS, new ResourceLocation("mcwdoors", "cherry_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_BARN_GLASS, new ResourceLocation("mcwdoors", "bamboo_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, new ResourceLocation("mcwdoors", "crimson_barn_glass_door"), "tall_macaw_barn_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BARN_GLASS, new ResourceLocation("mcwdoors", "warped_barn_glass_door"), "tall_macaw_barn_glass_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_STABLE, new ResourceLocation("mcwdoors", "oak_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_STABLE, new ResourceLocation("mcwdoors", "spruce_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_STABLE, new ResourceLocation("mcwdoors", "birch_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_STABLE, new ResourceLocation("mcwdoors", "jungle_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_STABLE, new ResourceLocation("mcwdoors", "acacia_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_STABLE, new ResourceLocation("mcwdoors", "dark_oak_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_STABLE, new ResourceLocation("mcwdoors", "mangrove_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_STABLE, new ResourceLocation("mcwdoors", "cherry_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_STABLE, new ResourceLocation("mcwdoors", "bamboo_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_STABLE, new ResourceLocation("mcwdoors", "crimson_stable_door"), "tall_macaw_stable_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_STABLE, new ResourceLocation("mcwdoors", "warped_stable_door"), "tall_macaw_stable_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "oak_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, new ResourceLocation("mcwdoors", "spruce_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, new ResourceLocation("mcwdoors", "birch_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, new ResourceLocation("mcwdoors", "jungle_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, new ResourceLocation("mcwdoors", "acacia_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, new ResourceLocation("mcwdoors", "dark_oak_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_STABLE_HEAD, new ResourceLocation("mcwdoors", "mangrove_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_STABLE_HEAD, new ResourceLocation("mcwdoors", "cherry_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_STABLE_HEAD, new ResourceLocation("mcwdoors", "bamboo_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, new ResourceLocation("mcwdoors", "crimson_stable_head_door"), "tall_macaw_stable_head_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, new ResourceLocation("mcwdoors", "warped_stable_head_door"), "tall_macaw_stable_head_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "oak_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, new ResourceLocation("mcwdoors", "spruce_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, new ResourceLocation("mcwdoors", "birch_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, new ResourceLocation("mcwdoors", "jungle_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, new ResourceLocation("mcwdoors", "acacia_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_BARK_GLASS, new ResourceLocation("mcwdoors", "mangrove_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_BARK_GLASS, new ResourceLocation("mcwdoors", "cherry_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_BARK_GLASS, new ResourceLocation("mcwdoors", "bamboo_bark_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, new ResourceLocation("mcwdoors", "crimson_stem_glass_door"), "tall_macaw_bark_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_STEM_GLASS, new ResourceLocation("mcwdoors", "warped_stem_glass_door"), "tall_macaw_bark_glass_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_GLASS, new ResourceLocation("mcwdoors", "oak_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_GLASS, new ResourceLocation("mcwdoors", "spruce_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_GLASS, new ResourceLocation("mcwdoors", "birch_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_GLASS, new ResourceLocation("mcwdoors", "jungle_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_GLASS, new ResourceLocation("mcwdoors", "acacia_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_GLASS, new ResourceLocation("mcwdoors", "dark_oak_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_GLASS, new ResourceLocation("mcwdoors", "mangrove_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_GLASS, new ResourceLocation("mcwdoors", "cherry_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_GLASS, new ResourceLocation("mcwdoors", "bamboo_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_GLASS, new ResourceLocation("mcwdoors", "crimson_glass_door"), "tall_macaw_glass_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_GLASS, new ResourceLocation("mcwdoors", "warped_glass_door"), "tall_macaw_glass_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_MODERN, new ResourceLocation("mcwdoors", "oak_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_MODERN, new ResourceLocation("mcwdoors", "spruce_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_MODERN, new ResourceLocation("mcwdoors", "birch_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_MODERN, new ResourceLocation("mcwdoors", "jungle_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_MODERN, new ResourceLocation("mcwdoors", "acacia_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_MODERN, new ResourceLocation("mcwdoors", "dark_oak_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_MODERN, new ResourceLocation("mcwdoors", "mangrove_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_MODERN, new ResourceLocation("mcwdoors", "cherry_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_MODERN, new ResourceLocation("mcwdoors", "bamboo_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_MODERN, new ResourceLocation("mcwdoors", "crimson_modern_door"), "tall_macaw_modern_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_MODERN, new ResourceLocation("mcwdoors", "warped_modern_door"), "tall_macaw_modern_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_JAPANESE, new ResourceLocation("mcwdoors", "oak_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE, new ResourceLocation("mcwdoors", "spruce_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_JAPANESE, new ResourceLocation("mcwdoors", "birch_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE, new ResourceLocation("mcwdoors", "jungle_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_JAPANESE, new ResourceLocation("mcwdoors", "acacia_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, new ResourceLocation("mcwdoors", "dark_oak_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_JAPANESE, new ResourceLocation("mcwdoors", "mangrove_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_JAPANESE, new ResourceLocation("mcwdoors", "cherry_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_JAPANESE, new ResourceLocation("mcwdoors", "bamboo_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE, new ResourceLocation("mcwdoors", "crimson_japanese_door"), "tall_macaw_japanese_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_JAPANESE, new ResourceLocation("mcwdoors", "warped_japanese_door"), "tall_macaw_japanese_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "oak_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, new ResourceLocation("mcwdoors", "spruce_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_JAPANESE2, new ResourceLocation("mcwdoors", "birch_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, new ResourceLocation("mcwdoors", "jungle_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_JAPANESE2, new ResourceLocation("mcwdoors", "acacia_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, new ResourceLocation("mcwdoors", "dark_oak_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_JAPANESE2, new ResourceLocation("mcwdoors", "mangrove_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_JAPANESE2, new ResourceLocation("mcwdoors", "cherry_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_JAPANESE2, new ResourceLocation("mcwdoors", "bamboo_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, new ResourceLocation("mcwdoors", "crimson_japanese2_door"), "tall_macaw_japanese2_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_JAPANESE2, new ResourceLocation("mcwdoors", "warped_japanese2_door"), "tall_macaw_japanese2_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_CLASSIC, new ResourceLocation("mcwdoors", "spruce_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_CLASSIC, new ResourceLocation("mcwdoors", "birch_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_CLASSIC, new ResourceLocation("mcwdoors", "jungle_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_CLASSIC, new ResourceLocation("mcwdoors", "acacia_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, new ResourceLocation("mcwdoors", "dark_oak_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_CLASSIC, new ResourceLocation("mcwdoors", "mangrove_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_CLASSIC, new ResourceLocation("mcwdoors", "cherry_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_CLASSIC, new ResourceLocation("mcwdoors", "bamboo_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_CLASSIC, new ResourceLocation("mcwdoors", "crimson_classic_door"), "tall_macaw_classic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_CLASSIC, new ResourceLocation("mcwdoors", "warped_classic_door"), "tall_macaw_classic_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_COTTAGE, new ResourceLocation("mcwdoors", "oak_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_COTTAGE, new ResourceLocation("mcwdoors", "birch_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_COTTAGE, new ResourceLocation("mcwdoors", "jungle_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_COTTAGE, new ResourceLocation("mcwdoors", "acacia_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, new ResourceLocation("mcwdoors", "dark_oak_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_COTTAGE, new ResourceLocation("mcwdoors", "mangrove_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_COTTAGE, new ResourceLocation("mcwdoors", "cherry_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_COTTAGE, new ResourceLocation("mcwdoors", "bamboo_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_COTTAGE, new ResourceLocation("mcwdoors", "crimson_cottage_door"), "tall_macaw_cottage_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_COTTAGE, new ResourceLocation("mcwdoors", "warped_cottage_door"), "tall_macaw_cottage_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_PAPER, new ResourceLocation("mcwdoors", "oak_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_PAPER, new ResourceLocation("mcwdoors", "spruce_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_PAPER, new ResourceLocation("mcwdoors", "jungle_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_PAPER, new ResourceLocation("mcwdoors", "acacia_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_PAPER, new ResourceLocation("mcwdoors", "dark_oak_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_PAPER, new ResourceLocation("mcwdoors", "mangrove_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_PAPER, new ResourceLocation("mcwdoors", "cherry_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_PAPER, new ResourceLocation("mcwdoors", "bamboo_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_PAPER, new ResourceLocation("mcwdoors", "crimson_paper_door"), "tall_macaw_paper_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_PAPER, new ResourceLocation("mcwdoors", "warped_paper_door"), "tall_macaw_paper_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BEACH, new ResourceLocation("mcwdoors", "oak_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BEACH, new ResourceLocation("mcwdoors", "spruce_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BEACH, new ResourceLocation("mcwdoors", "birch_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BEACH, new ResourceLocation("mcwdoors", "acacia_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BEACH, new ResourceLocation("mcwdoors", "dark_oak_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_BEACH, new ResourceLocation("mcwdoors", "mangrove_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_BEACH, new ResourceLocation("mcwdoors", "cherry_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_BEACH, new ResourceLocation("mcwdoors", "bamboo_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BEACH, new ResourceLocation("mcwdoors", "crimson_beach_door"), "tall_macaw_beach_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BEACH, new ResourceLocation("mcwdoors", "warped_beach_door"), "tall_macaw_beach_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_TROPICAL, new ResourceLocation("mcwdoors", "oak_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_TROPICAL, new ResourceLocation("mcwdoors", "spruce_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_TROPICAL, new ResourceLocation("mcwdoors", "birch_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_TROPICAL, new ResourceLocation("mcwdoors", "jungle_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, new ResourceLocation("mcwdoors", "dark_oak_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_TROPICAL, new ResourceLocation("mcwdoors", "mangrove_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_TROPICAL, new ResourceLocation("mcwdoors", "cherry_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_TROPICAL, new ResourceLocation("mcwdoors", "bamboo_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_TROPICAL, new ResourceLocation("mcwdoors", "crimson_tropical_door"), "tall_macaw_tropical_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_TROPICAL, new ResourceLocation("mcwdoors", "warped_tropical_door"), "tall_macaw_tropical_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_FOUR_PANEL, new ResourceLocation("mcwdoors", "oak_four_panel_door"), "tall_macaw_four_panel_door");			
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, new ResourceLocation("mcwdoors", "spruce_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, new ResourceLocation("mcwdoors", "birch_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, new ResourceLocation("mcwdoors", "jungle_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, new ResourceLocation("mcwdoors", "acacia_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_FOUR_PANEL, new ResourceLocation("mcwdoors", "mangrove_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_FOUR_PANEL, new ResourceLocation("mcwdoors", "cherry_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_FOUR_PANEL, new ResourceLocation("mcwdoors", "bamboo_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, new ResourceLocation("mcwdoors", "crimson_four_panel_door"), "tall_macaw_four_panel_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, new ResourceLocation("mcwdoors", "warped_four_panel_door"), "tall_macaw_four_panel_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_SWAMP, new ResourceLocation("mcwdoors", "oak_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_SWAMP, new ResourceLocation("mcwdoors", "spruce_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_SWAMP, new ResourceLocation("mcwdoors", "birch_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_SWAMP, new ResourceLocation("mcwdoors", "jungle_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_SWAMP, new ResourceLocation("mcwdoors", "acacia_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_SWAMP, new ResourceLocation("mcwdoors", "dark_oak_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_SWAMP, new ResourceLocation("mcwdoors", "cherry_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_SWAMP, new ResourceLocation("mcwdoors", "bamboo_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_SWAMP, new ResourceLocation("mcwdoors", "crimson_swamp_door"), "tall_macaw_swamp_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_SWAMP, new ResourceLocation("mcwdoors", "warped_swamp_door"), "tall_macaw_swamp_door");

		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_WAFFLE, new ResourceLocation("mcwdoors", "oak_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_WAFFLE, new ResourceLocation("mcwdoors", "spruce_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_WAFFLE, new ResourceLocation("mcwdoors", "birch_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_WAFFLE, new ResourceLocation("mcwdoors", "jungle_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_WAFFLE, new ResourceLocation("mcwdoors", "acacia_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_WAFFLE, new ResourceLocation("mcwdoors", "dark_oak_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_WAFFLE, new ResourceLocation("mcwdoors", "mangrove_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_WAFFLE, new ResourceLocation("mcwdoors", "bamboo_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_WAFFLE, new ResourceLocation("mcwdoors", "crimson_waffle_door"), "tall_macaw_waffle_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_WAFFLE, new ResourceLocation("mcwdoors", "warped_waffle_door"), "tall_macaw_waffle_door");

		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_BAMBOO, new ResourceLocation("mcwdoors", "oak_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_BAMBOO, new ResourceLocation("mcwdoors", "spruce_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_BAMBOO, new ResourceLocation("mcwdoors", "birch_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_BAMBOO, new ResourceLocation("mcwdoors", "jungle_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_BAMBOO, new ResourceLocation("mcwdoors", "acacia_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_BAMBOO, new ResourceLocation("mcwdoors", "dark_oak_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_BAMBOO, new ResourceLocation("mcwdoors", "mangrove_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_BAMBOO, new ResourceLocation("mcwdoors", "cherry_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_BAMBOO, new ResourceLocation("mcwdoors", "crimson_bamboo_door"), "tall_macaw_bamboo_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_BAMBOO, new ResourceLocation("mcwdoors", "warped_bamboo_door"), "tall_macaw_bamboo_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_NETHER, new ResourceLocation("mcwdoors", "oak_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_NETHER, new ResourceLocation("mcwdoors", "spruce_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_NETHER, new ResourceLocation("mcwdoors", "birch_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_NETHER, new ResourceLocation("mcwdoors", "jungle_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_NETHER, new ResourceLocation("mcwdoors", "acacia_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_NETHER, new ResourceLocation("mcwdoors", "dark_oak_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_NETHER, new ResourceLocation("mcwdoors", "mangrove_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_NETHER, new ResourceLocation("mcwdoors", "cherry_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_NETHER, new ResourceLocation("mcwdoors", "bamboo_nether_door"), "tall_macaw_nether_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_WARPED_NETHER, new ResourceLocation("mcwdoors", "warped_nether_door"), "tall_macaw_nether_door");
		
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_OAK_MYSTIC, new ResourceLocation("mcwdoors", "oak_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_SPRUCE_MYSTIC, new ResourceLocation("mcwdoors", "spruce_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BIRCH_MYSTIC, new ResourceLocation("mcwdoors", "birch_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_JUNGLE_MYSTIC, new ResourceLocation("mcwdoors", "jungle_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_ACACIA_MYSTIC, new ResourceLocation("mcwdoors", "acacia_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, new ResourceLocation("mcwdoors", "dark_oak_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_MANGROVE_MYSTIC, new ResourceLocation("mcwdoors", "mangrove_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CHERRY_MYSTIC, new ResourceLocation("mcwdoors", "cherry_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_BAMBOO_MYSTIC, new ResourceLocation("mcwdoors", "bamboo_mystic_door"), "tall_macaw_mystic_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_MACAW_CRIMSON_MYSTIC, new ResourceLocation("mcwdoors", "crimson_mystic_door"), "tall_macaw_mystic_door");
	}
}
