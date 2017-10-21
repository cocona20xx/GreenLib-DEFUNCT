package greenlib.items;



import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static final ItemBase copperIngot = new ItemBase("copper_ingot").setCreativeTab(CreativeTabs.MATERIALS);
	
	public static void register(IForgeRegistry<Item> registry){
		registry.registerAll(copperIngot);
	}
	
	public static void registerModels() {
			copperIngot.registerItemModel();
	}
		
}
			

		


