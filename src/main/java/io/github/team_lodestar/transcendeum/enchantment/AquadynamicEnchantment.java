
package io.github.team_lodestar.transcendeum.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import io.github.team_lodestar.transcendeum.block.BubbleBlock;
import io.github.team_lodestar.transcendeum.TheTranscendeumModElements;

@TheTranscendeumModElements.ModElement.Tag
public class AquadynamicEnchantment extends TheTranscendeumModElements.ModElement {
	@ObjectHolder("the_transcendeum:aquadynamic")
	public static final Enchantment enchantment = null;

	public AquadynamicEnchantment(TheTranscendeumModElements instance) {
		super(instance, 250);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("aquadynamic"));
	}

	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.COMMON, EnchantmentType.ARMOR_HEAD, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 3;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == BubbleBlock.block.asItem())
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return false;
		}

		@Override
		public boolean canGenerateInLoot() {
			return false;
		}

		@Override
		public boolean canVillagerTrade() {
			return false;
		}
	}
}
