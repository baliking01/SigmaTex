package item;

import entity.Particle;
import texture.ItemTexture;

public class Melee extends Weapon{
	private double strikeDuration;
	private int areaEffectDamage;
	private int areaSize;
	
	public Melee(int damage, int reach, double animationSpeed, Particle effects, boolean isAcquired,
			ItemTexture texture, double criticalChance) {
		super(damage, reach, animationSpeed, effects, isAcquired, texture, criticalChance);
	}

	public Melee(int damage, int reach, double animationSpeed, Particle effects, boolean isAcquired,
			ItemTexture texture, double criticalChance, double strikeDuration, int areaEffectDamage, int areaSize) {
		super(damage, reach, animationSpeed, effects, isAcquired, texture, criticalChance);
		this.strikeDuration = strikeDuration;
		this.areaEffectDamage = areaEffectDamage;
		this.areaSize = areaSize;
	}

	public double getStrikeDuration() {
		return strikeDuration;
	}

	public void setStrikeDuration(double strikeDuration) {
		this.strikeDuration = strikeDuration;
	}

	public int getAreaEffectDamage() {
		return areaEffectDamage;
	}

	public void setAreaEffectDamage(int areaEffectDamage) {
		this.areaEffectDamage = areaEffectDamage;
	}

	public int getAreaSize() {
		return areaSize;
	}

	public void setAreaSize(int areaSize) {
		this.areaSize = areaSize;
	}

	@Override
	public String toString() {
		return "Melee [strikeDuration=" + strikeDuration + ", areaEffectDamage=" + areaEffectDamage + ", areaSize="
				+ areaSize + ", durability=" + durability + ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}
}
