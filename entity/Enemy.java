package entity;

import java.util.Arrays;

import texture.EntityTexture;

public class Enemy extends Entity{
	enum TYPE{
		RANGED,
		MELEE,
		FRANGED,	//Flying Ranged
		FMELEE		// Flying Melee
	}
	private int health;
	private int armor;
	private double speed;
	private Player targeting;
	private TYPE type;
	private int damage;
	
	public Enemy(int positionX, int positionY, EntityTexture texture, int[][] boundingBox) {
		super(positionX, positionY, texture, boundingBox);
	}

	public Enemy(int positionX, int positionY, EntityTexture texture, int[][] boundingBox, int health, int armor,
			double speed, Player targeting, TYPE type, int damage) {
		super(positionX, positionY, texture, boundingBox);
		this.health = health;
		this.armor = armor;
		this.speed = speed;
		this.targeting = targeting;
		this.type = type;
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
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

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Player getTargeting() {
		return targeting;
	}

	public void setTargeting(Player targeting) {
		this.targeting = targeting;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Enemy [health=" + health + ", armor=" + armor + ", speed=" + speed + ", targeting=" + targeting
				+ ", type=" + type + ", damage=" + damage + ", PositionX=" + PositionX + ", PositionY=" + PositionY
				+ ", boundingBox=" + Arrays.toString(boundingBox) + ", texture=" + texture + "]";
	}
}
