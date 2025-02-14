package com.fizzware.dramaticdoors.tags;

import com.fizzware.dramaticdoors.DramaticDoors;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class DDBlockTags
{
	public static final TagKey<Block> SHORT_DOORS = TagKey.create(Registries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, "short_doors"));
	public static final TagKey<Block> SHORT_WOODEN_DOORS = TagKey.create(Registries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, "short_wooden_doors"));
	public static final TagKey<Block> HAND_OPENABLE_SHORT_METAL_DOORS = TagKey.create(Registries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, "hand_openable_short_metal_doors"));

	public static final TagKey<Block> TALL_DOORS = TagKey.create(Registries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, "tall_doors"));
	public static final TagKey<Block> TALL_WOODEN_DOORS = TagKey.create(Registries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, "tall_wooden_doors"));
	public static final TagKey<Block> HAND_OPENABLE_TALL_METAL_DOORS = TagKey.create(Registries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, "hand_openable_tall_metal_doors"));

	public static final TagKey<Block> EXTRA_DETAILS_BLACKLIST = TagKey.create(Registries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, "extra_details_blacklist"));
}
