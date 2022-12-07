package entity;

import java.util.Arrays;

import item.Item;
import texture.EntityTexture;

public class Player extends Entity{
	private boolean isMoving;
	private boolean isAttacking;
	private short level;
	private short killCount;
	private int health;
	private int armor;
	private int permissions;
	private int coins;
	private Item[] items;
	
	public Player(int positionX, int positionY, EntityTexture texture, int[][] boundingBox) {
		super(positionX, positionY, texture, boundingBox);
		this.health = 100;
	}

	public Player(int positionX, int positionY, EntityTexture texture, int[][] boundingBox, boolean isMoving,
			boolean isAttacking, short level, short killCount, int health, int armor, int permissions, Item[] items, int coins) {
		super(positionX, positionY, texture, boundingBox);
		this.isMoving = isMoving;
		this.isAttacking = isAttacking;
		this.level = level;
		this.killCount = killCount;
		this.health = health;
		this.armor = armor;
		this.permissions = permissions;
		this.items = items;
		this.setCoins(coins);
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	public boolean isAttacking() {
		return isAttacking;
	}

	public void setAttacking(boolean isAttacking) {
		this.isAttacking = isAttacking;
	}

	public short getLevel() {
		return level;
	}

	public void setLevel(short level) {
		this.level = level;
	}

	public short getKillCount() {
		return killCount;
	}

	public void setKillCount(short killCount) {
		this.killCount = killCount;
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

	public int getPermissions() {
		return permissions;
	}

	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "Player [isMoving=" + isMoving + ", isAttacking=" + isAttacking + ", level=" + level + ", killCount="
				+ killCount + ", health=" + health + ", armor=" + armor + ", permissions=" + permissions + ", items="
				+ Arrays.toString(items) + ", PositionX=" + PositionX + ", PositionY=" + PositionY + ", boundingBox="
				+ Arrays.toString(boundingBox) + ", texture=" + texture + "]";
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}
}
