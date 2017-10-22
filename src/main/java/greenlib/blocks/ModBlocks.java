package greenlib.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static final BlockBase COPPER_ORE = new BlockBase(BlockData.ORETEST.mat, BlockData.ORETEST.blockName, BlockData.ORETEST.res, BlockData.ORETEST.hrd, BlockData.ORETEST.tool, BlockData.ORETEST.harvest).setCreativeTab(BlockData.ORETEST.cTab);
	
		public static void register(IForgeRegistry<Block> registery) {
			registery.registerAll(COPPER_ORE);
		}

		public static void registerItemBlocks(IForgeRegistry<Item> registry) {
			registry.registerAll(COPPER_ORE.createItemBlock());
		}

		public static void registerModels() {
			COPPER_ORE.registerItemModel(Item.getItemFromBlock(COPPER_ORE));
		}
}
