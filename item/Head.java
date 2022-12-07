package item;

import texture.ItemTexture;

public class Head extends Accessory{
	private double detectionDistance;
	private double concussionReduction;
	
	public Head(int durability, ItemTexture texture, boolean isAcquired) {
		super(durability, texture, isAcquired);
	}
	public Head(int durability, ItemTexture texture, boolean isAcquired, Rarity rarity) {
		super(durability, texture, isAcquired, rarity);
	}
	public Head(int durability, ItemTexture texture, boolean isAcquired, double detectionDistance,
			double concussionReduction) {
		super(durability, texture, isAcquired);
		this.detectionDistance = detectionDistance;
		this.concussionReduction = concussionReduction;
	}
	public double getDetectionDistance() {
		return detectionDistance;
	}
	public void setDetectionDistance(double detectionDistance) {
		this.detectionDistance = detectionDistance;
	}
	public double getConcussionReduction() {
		return concussionReduction;
	}
	public void setConcussionReduction(double concussionReduction) {
		this.concussionReduction = concussionReduction;
	}
	@Override
	public String toString() {
		return "Head [detectionDistance=" + detectionDistance + ", concussionReduction=" + concussionReduction
				+ ", durability=" + durability + ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}

}
