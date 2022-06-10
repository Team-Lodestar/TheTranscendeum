
package io.github.team_lodestar.transcendeum.item;

import net.minecraft.entity.ai.attributes.Attributes;

@TheTranscendeumModElements.ModElement.Tag
public class IndigoJamItem extends TheTranscendeumModElements.ModElement {

	@ObjectHolder("the_transcendeum:indigo_jam")
	public static final Item block = null;

	public IndigoJamItem(TheTranscendeumModElements instance) {
		super(instance, 434);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(TranscendeumItemsItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("indigo_jam");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 32;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
