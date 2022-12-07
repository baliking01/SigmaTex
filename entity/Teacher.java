package entity;

import java.util.Arrays;

import item.Item;
import texture.EntityTexture;

public class Teacher extends Enemy{
	private Item[] items;
	
	public Teacher(int positionX, int positionY, EntityTexture texture, int[][] boundingBox) {
		super(positionX, positionY, texture, boundingBox);
	}
	public Teacher(int positionX, int positionY, EntityTexture texture, int[][] boundingBox, int health, int armor,
			double speed, Player targeting, TYPE type, int damage) {
		super(positionX, positionY, texture, boundingBox, health, armor, speed, targeting, type, damage);
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Teacher [items=" + Arrays.toString(items) + ", PositionX=" + PositionX + ", PositionY=" + PositionY
				+ ", boundingBox=" + Arrays.toString(boundingBox) + ", texture=" + texture + "]";
	}
}
