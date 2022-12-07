package item;

import texture.ItemTexture;

public class Item {
	protected int durability;
	protected ItemTexture texture;
	protected boolean isAcquired;
	
	public Item(int durability, ItemTexture texture, boolean isAcquired) {
		super();
		this.durability = durability;
		this.texture = texture;
		this.isAcquired = isAcquired;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public ItemTexture getTexture() {
		return texture;
	}

	public void setTexture(ItemTexture texture) {
		this.texture = texture;
	}

	public boolean isAcquired() {
		return isAcquired;
	}

	public void setAcquired(boolean isAcquired) {
		this.isAcquired = isAcquired;
	}

	@Override
	public String toString() {
		return "Item [durability=" + durability + ", texture=" + texture + ", isAcquired=" + isAcquired + "]";
	}
}
