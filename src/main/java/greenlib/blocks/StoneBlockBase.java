package greenlib.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class StoneBlockBase extends BlockBase {

	public StoneBlockBase(String name) {
		super(Material.ROCK, name);
		
		setHardness(1.5f);
		setResistance(30f);
	}
	
	@Override
	public StoneBlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
