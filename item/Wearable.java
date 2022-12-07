package item;

import texture.ItemTexture;

public class Wearable extends Armor{
	private double weight;
	private double blockStatusDuration;
	
	public Wearable(int durability, ItemTexture texture, boolean isAcquired) {
		super(durability, texture, isAcquired);
	}

	public Wearable(int durability, ItemTexture texture, boolean isAcquired, int armor, boolean isEquipped,
			double blockChance) {
		super(durability, texture, isAcquired, armor, isEquipped, blockChance);
	}
	
	public Wearable(int durability, ItemTexture texture, boolean isAcquired, double weight,
			double blockStatusDuration) {
		super(durability, texture, isAcquired);
		this.weight = weight;
		this.blockStatusDuration = blockStatusDuration;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBlockStatusDuration() {
		return blockStatusDuration;
	}

	public void setBlockStatusDuration(double blockStatusDuration) {
		this.blockStatusDuration = blockStatusDuration;
	}

	@Override
	public String toString() {
		return "Wearable [weight=" + weight + ", blockStatusDuration=" + blockStatusDuration + ", durability="
				+ durability + ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}
}
