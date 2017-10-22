package greenlib.items;



import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static final ItemBase COPPER_INGOT = new ItemBase("copper_ingot").setCreativeTab(CreativeTabs.MATERIALS);
	
	public static void register(IForgeRegistry<Item> registry){
		registry.registerAll(COPPER_INGOT);
	}
	
	public static void registerModels() {
			COPPER_INGOT.registerItemModel();
	}
		
}
			

		


