package item;

import entity.Particle;
import texture.ItemTexture;

public class Coin extends Collectable{
	private int positionX;
	private int positionY;
	private int amount;
	private Particle effect;
	
	public Coin(int durability, ItemTexture texture, boolean isAcquired) {
		super(durability, texture, isAcquired);
	}
	public Coin(int durability, ItemTexture texture, boolean isAcquired, int numberCollected) {
		super(durability, texture, isAcquired, numberCollected);
	}
	public Coin(int durability, ItemTexture texture, boolean isAcquired, int positionX, int positionY, int amount,
			Particle effect) {
		super(durability, texture, isAcquired);
		this.positionX = positionX;
		this.positionY = positionY;
		this.amount = amount;
		this.effect = effect;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Particle getEffect() {
		return effect;
	}
	public void setEffect(Particle effect) {
		this.effect = effect;
	}
	@Override
	public String toString() {
		return "Coin [positionX=" + positionX + ", positionY=" + positionY + ", amount=" + amount + ", effect=" + effect
				+ ", durability=" + durability + ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}
}
