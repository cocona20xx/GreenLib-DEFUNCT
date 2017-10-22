package greenlib.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static final BlockOreDict COPPER_ORE = new BlockOreDict(BlockData.ORETEST.mat, BlockData.ORETEST.blockName, BlockData.ORETEST.res, BlockData.ORETEST.hrd, BlockData.ORETEST.tool, BlockData.ORETEST.harvest, BlockData.ORETEST.oredictName).setCreativeTab(BlockData.ORETEST.cTab);
	
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
