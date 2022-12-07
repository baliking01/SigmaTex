package item;

import texture.ItemTexture;

public class Collectable extends Item{
	private int numberCollected;
	
	public Collectable(int durability, ItemTexture texture, boolean isAcquired) {
		super(durability, texture, isAcquired);
	}

	public Collectable(int durability, ItemTexture texture, boolean isAcquired, int numberCollected) {
		super(durability, texture, isAcquired);
		this.numberCollected = numberCollected;
	}

	public int getNumberCollected() {
		return numberCollected;
	}

	public void setNumberCollected(int numberCollected) {
		this.numberCollected = numberCollected;
	}

	@Override
	public String toString() {
		return "Collectable [numberCollected=" + numberCollected + ", durability=" + durability + ", texture=" + texture
				+ ", isAcquired=" + isAcquired + "]";
	}
}
