package greenlib.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static final StoneBlockBase testBlock = new StoneBlockBase("test_block").setCreativeTab(CreativeTabs.MISC);

		public static void register(IForgeRegistry<Block> registery) {
			registery.registerAll(testBlock);
		}

		public static void registerItemBlocks(IForgeRegistry<Item> registry) {
			registry.registerAll(testBlock.createItemBlock());
		}

		public static void registerModels() {
			testBlock.registerItemModel(Item.getItemFromBlock(testBlock));
		}
}
