package greenlib.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public enum BlockData {
	STONETEST(Material.ROCK, "pickaxe", 30f, 1.5f, CreativeTabs.BUILDING_BLOCKS, 0),
	ORETEST(Material.ROCK,"pickaxe", 30f, 3f, CreativeTabs.MATERIALS, 1),;
	
	public Material mat;
	public String tool;
	public float res;
	public float hrd;
	public CreativeTabs cTab;
	public int harvest;

	BlockData(Material mat, String tool, float res, float hrd, CreativeTabs cTab, int harvest) {
		this.mat = mat;
		this.tool = tool;
		this.res = res;
		this.hrd = hrd;
		this.cTab = cTab;
		this.harvest = harvest;
	}
}
