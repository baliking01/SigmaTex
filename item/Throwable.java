package item;

import entity.Particle;
import texture.ItemTexture;

public class Throwable extends Weapon{
	private boolean inHand;
	private boolean thrown;
	private double returnTime;
	
	public Throwable(int damage, int reach, double animationSpeed, Particle effects, boolean isAcquired,
			ItemTexture texture, double criticalChance) {
		super(damage, reach, animationSpeed, effects, isAcquired, texture, criticalChance);
		// TODO Auto-generated constructor stub
	}

	public boolean isInHand() {
		return inHand;
	}

	public void setInHand(boolean inHand) {
		this.inHand = inHand;
	}

	public boolean isThrown() {
		return thrown;
	}

	public void setThrown(boolean thrown) {
		this.thrown = thrown;
	}

	public double getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(double returnTime) {
		this.returnTime = returnTime;
	}

	@Override
	public String toString() {
		return "Throwable [inHand=" + inHand + ", thrown=" + thrown + ", returnTime=" + returnTime + ", durability="
				+ durability + ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}
	
	
	
}
