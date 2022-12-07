package item;

import entity.Particle;
import texture.ItemTexture;

public class Foot extends Accessory{
	private double stability;
	private boolean isPaired;
	private Particle effect;
	private double staggerRecovery;
	
	public Foot(int durability, ItemTexture texture, boolean isAcquired) {
		super(durability, texture, isAcquired);
	}
	public Foot(int durability, ItemTexture texture, boolean isAcquired, Rarity rarity) {
		super(durability, texture, isAcquired, rarity);
	}
	public Foot(int durability, ItemTexture texture, boolean isAcquired, double stability, boolean isPaired,
			Particle effect, double staggerRecovery) {
		super(durability, texture, isAcquired);
		this.stability = stability;
		this.isPaired = isPaired;
		this.effect = effect;
		this.staggerRecovery = staggerRecovery;
	}
	public double getStability() {
		return stability;
	}
	public void setStability(double stability) {
		this.stability = stability;
	}
	public boolean isPaired() {
		return isPaired;
	}
	public void setPaired(boolean isPaired) {
		this.isPaired = isPaired;
	}
	public Particle getEffect() {
		return effect;
	}
	public void setEffect(Particle effect) {
		this.effect = effect;
	}
	public double getStaggerRecovery() {
		return staggerRecovery;
	}
	public void setStaggerRecovery(double staggerRecovery) {
		this.staggerRecovery = staggerRecovery;
	}
	@Override
	public String toString() {
		return "Foot [stability=" + stability + ", isPaired=" + isPaired + ", effect=" + effect + ", staggerRecovery="
				+ staggerRecovery + ", durability=" + durability + ", texture=" + texture + ", isAcquired=" + isAcquired
				+ "]";
	}
}
