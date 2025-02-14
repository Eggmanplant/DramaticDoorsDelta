package com.fizzware.dramaticdoors.forge.addons.extradetails.client;

import me.pandamods.extra_details.api.client.render.block.ClientBlock;
import me.pandamods.extra_details.api.client.render.block.ClientBlockType;
import me.pandamods.extra_details.pandalib.cache.ObjectCache;
import me.pandamods.extra_details.pandalib.entity.MeshAnimatable;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class ShortDoorClientBlock extends ClientBlock implements MeshAnimatable
{
	private final ObjectCache cache = new ObjectCache();
	
	public ShortDoorClientBlock(ClientBlockType<?> type, BlockPos blockPos, BlockState blockState, ClientLevel level) {
		super(type, blockPos, blockState, level);
	}

	@Override
	public ObjectCache getCache() {
		return this.cache;
	}
}
