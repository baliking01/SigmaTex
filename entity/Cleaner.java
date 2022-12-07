package entity;

import java.util.Arrays;

import item.Item;
import texture.EntityTexture;

public class Cleaner extends Enemy{
	private Item[] items;
	
	public Cleaner(int positionX, int positionY, EntityTexture texture, int[][] boundingBox) {
		super(positionX, positionY, texture, boundingBox);
	}

	public Cleaner(int positionX, int positionY, EntityTexture texture, int[][] boundingBox, int health, int armor,
			double speed, Player targeting, TYPE type, int damage, Item[] items) {
		super(positionX, positionY, texture, boundingBox, health, armor, speed, targeting, type, damage);
		this.items = items;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cleaner [items=" + Arrays.toString(items) + ", PositionX=" + PositionX + ", PositionY=" + PositionY
				+ ", boundingBox=" + Arrays.toString(boundingBox) + ", texture=" + texture + "]";
	}
}
