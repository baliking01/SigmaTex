package item;

import texture.ItemTexture;

public class Legs extends Accessory{
	private double staggerReduction;
	private double stability;
	
	public Legs(int durability, ItemTexture texture, boolean isAcquired) {
		super(durability, texture, isAcquired);
	}
	public Legs(int durability, ItemTexture texture, boolean isAcquired, Rarity rarity) {
		super(durability, texture, isAcquired, rarity);
	}
	public Legs(int durability, ItemTexture texture, boolean isAcquired, double staggerReduction, double stability) {
		super(durability, texture, isAcquired);
		this.staggerReduction = staggerReduction;
		this.stability = stability;
	}
	public double getStaggerReduction() {
		return staggerReduction;
	}
	public void setStaggerReduction(double staggerReduction) {
		this.staggerReduction = staggerReduction;
	}
	public double getStability() {
		return stability;
	}
	public void setStability(double stability) {
		this.stability = stability;
	}
	@Override
	public String toString() {
		return "Legs [staggerReduction=" + staggerReduction + ", stability=" + stability + ", durability=" + durability
				+ ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}
}
