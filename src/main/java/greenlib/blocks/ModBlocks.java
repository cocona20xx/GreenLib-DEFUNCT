package greenlib.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static final BlockBase TEST = new BlockBase(BlockData.STONETEST.mat, BlockData.STONETEST.name(), BlockData.STONETEST.res, BlockData.STONETEST.hrd, BlockData.STONETEST.tool, BlockData.STONETEST.harvest).setCreativeTab(BlockData.STONETEST.cTab);
	
		public static void register(IForgeRegistry<Block> registery) {
			registery.registerAll(TEST);
		}

		public static void registerItemBlocks(IForgeRegistry<Item> registry) {
			registry.registerAll(TEST.createItemBlock());
		}

		public static void registerModels() {
			TEST.registerItemModel(Item.getItemFromBlock(TEST));
		}
}
