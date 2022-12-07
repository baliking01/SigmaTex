package item;
import entity.Particle;
import texture.ItemTexture;

public class Weapon extends Item{
	private int damage;
	private int reach;
	private double animationSpeed;
	private double criticalChance;
	private Particle effects;
	
	public Weapon(int damage, int reach, double animationSpeed, Particle effects, boolean isAcquired, ItemTexture texture, double criticalChance) {
		super(reach, texture, isAcquired);
		this.damage = damage;
		this.reach = reach;
		this.animationSpeed = animationSpeed;
		this.effects = effects;
		this.setCriticalChance(criticalChance);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getReach() {
		return reach;
	}

	public void setReach(int reach) {
		this.reach = reach;
	}

	public double getAnimationSpeed() {
		return animationSpeed;
	}

	public void setAnimationSpeed(double animationSpeed) {
		this.animationSpeed = animationSpeed;
	}

	public Particle getEffects() {
		return effects;
	}

	public void setEffects(Particle effects) {
		this.effects = effects;
	}

	@Override
	public String toString() {
		return "Weapon [damage=" + damage + ", reach=" + reach + ", animationSpeed=" + animationSpeed + ", effects="
				+ effects + ", durability=" + durability + ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}

	public double getCriticalChance() {
		return criticalChance;
	}

	public void setCriticalChance(double criticalChance) {
		this.criticalChance = criticalChance;
	}
}
