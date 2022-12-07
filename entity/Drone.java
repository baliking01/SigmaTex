package entity;

import java.util.Arrays;

import texture.EntityTexture;

public class Drone extends Enemy{
	private final int maxFlightHeight;
	private int flightHeight;
	private Projectile projectile;
	
	public Drone(int positionX, int positionY, EntityTexture texture, int[][] boundingBox) {
		super(positionX, positionY, texture, boundingBox);
		maxFlightHeight = 100;
	}

	public Drone(int positionX, int positionY, EntityTexture texture, 
			int[][] boundingBox, int health, int armor,
			double speed, Player targeting, TYPE type, int damage) {
		super(positionX, positionY, texture, boundingBox, 
				health, armor, speed, targeting, type, damage);
		maxFlightHeight = 100;
	}

	public Drone(int positionX, int positionY, EntityTexture texture, int[][] boundingBox, int maxFlightHeight,
			int flightHeight, Projectile projectile) {
		super(positionX, positionY, texture, boundingBox);
		this.maxFlightHeight = maxFlightHeight;
		this.flightHeight = flightHeight;
		this.projectile = projectile;
	}

	public int getFlightHeight() {
		return flightHeight;
	}

	public void setFlightHeight(int flightHeight) {
		this.flightHeight = flightHeight;
	}

	public Projectile getProjectile() {
		return projectile;
	}

	public void setProjectile(Projectile projectile) {
		this.projectile = projectile;
	}

	public int getMaxFlightHeight() {
		return maxFlightHeight;
	}

	@Override
	public String toString() {
		return "Drone [maxFlightHeight=" + maxFlightHeight + ", flightHeight=" + flightHeight + ", projectile="
				+ projectile + ", PositionX=" + PositionX + ", PositionY=" + PositionY + ", boundingBox="
				+ Arrays.toString(boundingBox) + ", texture=" + texture + "]";
	}

}
