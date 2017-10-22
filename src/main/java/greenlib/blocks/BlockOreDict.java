package greenlib.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOreDict extends BlockBase {

	private String oreName;
	public BlockOreDict(Material material, String name, float res, float hrd, String tool, int hLvl, String oreName) {
		super(material, name, hrd, hrd, tool, hLvl);
		this.oreName = oreName;
	}
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}
	
	@Override
	public BlockOreDict setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
