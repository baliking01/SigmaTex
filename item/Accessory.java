package item;

import texture.ItemTexture;

public class Accessory extends Item{
	enum Rarity{
		COMMON,
		UNCOMMON,
		RARE,
		LEGENDARY,
		MYTHIC,
	}
	private Rarity rarity;
	
	public Accessory(int durability, ItemTexture texture, boolean isAcquired) {
		super(durability, texture, isAcquired);
	}

	public Accessory(int durability, ItemTexture texture, boolean isAcquired, Rarity rarity) {
		super(durability, texture, isAcquired);
		this.rarity = rarity;
	}

	public Rarity getRarity() {
		return rarity;
	}

	public void setRarity(Rarity rarity) {
		this.rarity = rarity;
	}

	@Override
	public String toString() {
		return "Accessory [rarity=" + rarity + ", durability=" + durability + ", texture=" + texture + ", isAcquired="
				+ isAcquired + "]";
	}
}
