package greenlib.items;

import net.minecraftforge.oredict.OreDictionary;

public class ItemOreDict extends ItemBase {
	
	private String oreDictName;

	public ItemOreDict(String name, String oreDictName) {
		super(name);
		this.oreDictName = oreDictName;
	}
	
	public void initOreDict(){
		OreDictionary.registerOre(oreDictName, this);
	}

}
