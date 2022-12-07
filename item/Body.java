package item;

import texture.ItemTexture;

public class Body extends Accessory{
	private double luck;
	private boolean isActive;
	private boolean isPaired;
	
	public Body(int durability, ItemTexture texture, boolean isAcquired) {
		super(durability, texture, isAcquired);
	}
	public Body(int durability, ItemTexture texture, boolean isAcquired, Rarity rarity) {
		super(durability, texture, isAcquired, rarity);
	}
	public Body(int durability, ItemTexture texture, boolean isAcquired, double luck, boolean isActive,
			boolean isPaired) {
		super(durability, texture, isAcquired);
		this.luck = luck;
		this.isActive = isActive;
		this.isPaired = isPaired;
	}
	public double getLuck() {
		return luck;
	}
	public void setLuck(double luck) {
		this.luck = luck;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isPaired() {
		return isPaired;
	}
	public void setPaired(boolean isPaired) {
		this.isPaired = isPaired;
	}
	@Override
	public String toString() {
		return "Body [luck=" + luck + ", isActive=" + isActive + ", isPaired=" + isPaired + ", durability=" + durability
				+ ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}
}
