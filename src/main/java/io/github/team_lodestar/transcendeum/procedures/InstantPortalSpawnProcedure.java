package io.github.team_lodestar.transcendeum.procedures;

import net.minecraftforge.eventbus.api.Event;

public class InstantPortalSpawnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheTranscendeumMod.LOGGER.warn("Failed to load dependency world for procedure InstantPortalSpawn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheTranscendeumMod.LOGGER.warn("Failed to load dependency x for procedure InstantPortalSpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheTranscendeumMod.LOGGER.warn("Failed to load dependency y for procedure InstantPortalSpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheTranscendeumMod.LOGGER.warn("Failed to load dependency z for procedure InstantPortalSpawn!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheTranscendeumMod.LOGGER.warn("Failed to load dependency entity for procedure InstantPortalSpawn!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");

		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager()
					.getTemplateDefaulted(new ResourceLocation("the_transcendeum", "instant_portal"));

			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) z),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(TranscendeumItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}

}
