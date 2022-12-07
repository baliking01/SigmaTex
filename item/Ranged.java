package item;

import entity.Particle;
import texture.ItemTexture;

public class Ranged extends Weapon{
	private boolean isLoaded;
	private int ammunition;
	private boolean isExplosive;
	private double reloadTime;
	
	
	public Ranged(int damage, int reach, double animationSpeed, Particle effects, boolean isAcquired,
			ItemTexture texture, double criticalChance) {
		super(damage, reach, animationSpeed, effects, isAcquired, texture, criticalChance);
	}


	public Ranged(int damage, int reach, double animationSpeed, Particle effects, boolean isAcquired,
			ItemTexture texture, double criticalChance, boolean isLoaded, int ammunition, boolean isExplosive,
			double reloadTime) {
		super(damage, reach, animationSpeed, effects, isAcquired, texture, criticalChance);
		this.isLoaded = isLoaded;
		this.ammunition = ammunition;
		this.isExplosive = isExplosive;
		this.reloadTime = reloadTime;
	}


	public boolean isLoaded() {
		return isLoaded;
	}


	public void setLoaded(boolean isLoaded) {
		this.isLoaded = isLoaded;
	}


	public int getAmmunition() {
		return ammunition;
	}


	public void setAmmunition(int ammunition) {
		this.ammunition = ammunition;
	}


	public boolean isExplosive() {
		return isExplosive;
	}


	public void setExplosive(boolean isExplosive) {
		this.isExplosive = isExplosive;
	}


	public double getReloadTime() {
		return reloadTime;
	}


	public void setReloadTime(double reloadTime) {
		this.reloadTime = reloadTime;
	}


	@Override
	public String toString() {
		return "Ranged [isLoaded=" + isLoaded + ", ammunition=" + ammunition + ", isExplosive=" + isExplosive
				+ ", reloadTime=" + reloadTime + ", durability=" + durability + ", texture=" + texture + ", isAcquired="
				+ isAcquired + "]";
	}
}
