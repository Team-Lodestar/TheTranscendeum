
package io.github.team_lodestar.transcendeum.item;

import net.minecraft.entity.ai.attributes.Attributes;

@TheTranscendeumModElements.ModElement.Tag
public class BerthelShardItem extends TheTranscendeumModElements.ModElement {

	@ObjectHolder("the_transcendeum:berthel_shard")
	public static final Item block = null;

	public BerthelShardItem(TheTranscendeumModElements instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(TranscendeumItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("berthel_shard");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
