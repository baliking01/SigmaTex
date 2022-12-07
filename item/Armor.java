package item;

import texture.ItemTexture;

public class Armor extends Item{
	private int armor;
	private boolean isEquipped;
	private double blockChance;
	
	public Armor(int durability, ItemTexture texture, boolean isAcquired) {
		super(durability, texture, isAcquired);
	}

	public Armor(int durability, ItemTexture texture, boolean isAcquired, int armor, boolean isEquipped,
			double blockChance) {
		super(durability, texture, isAcquired);
		this.armor = armor;
		this.isEquipped = isEquipped;
		this.blockChance = blockChance;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public boolean isEquipped() {
		return isEquipped;
	}

	public void setEquipped(boolean isEquipped) {
		this.isEquipped = isEquipped;
	}

	public double getBlockChance() {
		return blockChance;
	}

	public void setBlockChance(double blockChance) {
		this.blockChance = blockChance;
	}

	@Override
	public String toString() {
		return "Armor [armor=" + armor + ", isEquipped=" + isEquipped + ", blockChance=" + blockChance + ", durability="
				+ durability + ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}
}
