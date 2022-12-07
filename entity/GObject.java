package entity;

import java.util.Arrays;

import texture.EntityTexture;

public class GObject extends Entity{
	private boolean isDestructable;
	private int health;
	private int armor;
	
	public GObject(int positionX, int positionY, EntityTexture texture, int[][] boundingBox) {
		super(positionX, positionY, texture, boundingBox);
	}

	public GObject(int positionX, int positionY, EntityTexture texture, int[][] boundingBox, boolean isDestructable,
			int health, int armor) {
		super(positionX, positionY, texture, boundingBox);
		this.isDestructable = isDestructable;
		this.health = health;
		this.armor = armor;
	}

	public boolean isDestructable() {
		return isDestructable;
	}

	public void setDestructable(boolean isDestructable) {
		this.isDestructable = isDestructable;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	@Override
	public String toString() {
		return "GObject [isDestructable=" + isDestructable + ", health=" + health + ", armor=" + armor + ", PositionX="
				+ PositionX + ", PositionY=" + PositionY + ", boundingBox=" + Arrays.toString(boundingBox)
				+ ", texture=" + texture + "]";
	}
}
