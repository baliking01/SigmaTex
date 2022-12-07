package item;

import texture.ItemTexture;

public class Shield extends Armor{
	private double blockAngle;
	private boolean isExposed;
	
	public Shield(int durability, ItemTexture texture, boolean isAcquired) {
		super(durability, texture, isAcquired);
	}
	
	public Shield(int durability, ItemTexture texture, boolean isAcquired, int armor, boolean isEquipped,
			double blockChance) {
		super(durability, texture, isAcquired, armor, isEquipped, blockChance);
	}

	public Shield(int durability, ItemTexture texture, boolean isAcquired, double blockAngle, boolean isExposed) {
		super(durability, texture, isAcquired);
		this.blockAngle = blockAngle;
		this.isExposed = isExposed;
	}

	public double getBlockAngle() {
		return blockAngle;
	}

	public void setBlockAngle(double blockAngle) {
		this.blockAngle = blockAngle;
	}

	public boolean isExposed() {
		return isExposed;
	}

	public void setExposed(boolean isExposed) {
		this.isExposed = isExposed;
	}

	@Override
	public String toString() {
		return "Shield [blockAngle=" + blockAngle + ", isExposed=" + isExposed + ", durability=" + durability
				+ ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}
}
