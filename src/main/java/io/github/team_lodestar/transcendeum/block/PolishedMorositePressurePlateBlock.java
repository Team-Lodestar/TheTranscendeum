
package io.github.team_lodestar.transcendeum.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@TheTranscendeumModElements.ModElement.Tag
public class PolishedMorositePressurePlateBlock extends TheTranscendeumModElements.ModElement {

	@ObjectHolder("the_transcendeum:polished_morosite_pressure_plate")
	public static final Block block = null;

	public PolishedMorositePressurePlateBlock(TheTranscendeumModElements instance) {
		super(instance, 176);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(TranscendeumBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends PressurePlateBlock {

		public CustomBlock() {
			super(Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(0.9f, 0.9f)
					.setLightLevel(s -> 0).harvestLevel(0).harvestTool(ToolType.PICKAXE).setRequiresTool().tickRandomly());

			setRegistryName("polished_morosite_pressure_plate");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
