package io.github.team_lodestar.transcendeum.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import java.util.Map;

import io.github.team_lodestar.transcendeum.block.CoriumVirililyBlockBlock;
import io.github.team_lodestar.transcendeum.TheTranscendeumMod;

public class CoriumVirililyRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheTranscendeumMod.LOGGER.warn("Failed to load dependency world for procedure CoriumVirililyRightClickedInAir!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheTranscendeumMod.LOGGER.warn("Failed to load dependency entity for procedure CoriumVirililyRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TheTranscendeumMod.LOGGER.warn("Failed to load dependency itemstack for procedure CoriumVirililyRightClickedInAir!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double raytrace_distance = 0;
		raytrace_distance = 1;
		for (int index0 = 0; index0 < (int) (5); index0++) {
			raytrace_distance = (raytrace_distance + 1);
			if ((world.getBlockState(new BlockPos(
					(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
									entity.getLook(1f).z * raytrace_distance),
							RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX()),
					(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
									entity.getLook(1f).z * raytrace_distance),
							RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY()),
					(int) (entity.world
							.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
											entity.getLook(1f).z * raytrace_distance),
									RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity))
							.getPos().getZ())))).getBlock() == Blocks.WATER
					&& world.isAirBlock(
							new BlockPos(
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f), entity.getEyePosition(1f)
											.add(entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
													entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX()),
									(int) (entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
															entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity))
											.getPos().getY() + 1),
									(int) (entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(
															entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
															entity.getLook(1f).z * raytrace_distance),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity))
											.getPos().getZ())))
					&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:lilies"))
							.contains((world.getBlockState(new BlockPos(
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX() + 1),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() + 1),
									(int) (entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
															entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity))
											.getPos().getZ())))).getBlock())
					&& !BlockTags.getCollection().getTagByID(new ResourceLocation("forge:lilies"))
							.contains((world.getBlockState(new BlockPos(
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX() - 1),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() + 1),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())))).getBlock())
					&& !BlockTags
							.getCollection().getTagByID(
									new ResourceLocation("forge:lilies"))
							.contains((world.getBlockState(new BlockPos(
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX()),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() + 1),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ() + 1))))
													.getBlock())
					&& !BlockTags
							.getCollection().getTagByID(
									new ResourceLocation("forge:lilies"))
							.contains((world.getBlockState(new BlockPos(
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX()),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() + 1),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ() - 1))))
													.getBlock())) {
				if (!world.isRemote()) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null,
								new BlockPos(
										(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
														entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX()),
										(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
														entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() + 1),
										(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
														entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lily_pad.place")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
												entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX()),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
												entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() + 1),
								(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
												entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ()),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lily_pad.place")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.setBlockState(
							new BlockPos(
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX()),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() + 1),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())),
							CoriumVirililyBlockBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos(
								(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
												entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX()),
								(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
												entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() + 1),
								(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
												entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(
									new BlockPos(
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
															entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX()),
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
															entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() + 1),
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
															entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())),
									_bs.with(_property, (entity.getHorizontalFacing())), 3);
						} else {
							world.setBlockState(
									new BlockPos(
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
															entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX()),
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
															entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() + 1),
											(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
															entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"),
											(entity.getHorizontalFacing()).getAxis()),
									3);
						}
					} catch (Exception e) {
					}
					if (!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) {
						(itemstack).shrink((int) 1);
					}
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == itemstack
							.getItem()) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
						}
					} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == itemstack.getItem()) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).swing(Hand.OFF_HAND, true);
						}
					}
					break;
				}
			}
		}
	}
}
