package com.fizzware.dramaticdoors.blockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class TallNetheriteDoorBlockEntity extends BlockEntity
{
	// Not yet implemented.
	public TallNetheriteDoorBlockEntity(BlockEntityType<?> betype, BlockPos pos, BlockState state) {
		super(betype, pos, state);
	}

	@Override
	public void saveAdditional(CompoundTag tag) {
		super.saveAdditional(tag);
	}
	
	@Override
	public void load(CompoundTag tag) {
		super.load(tag);
	}
}