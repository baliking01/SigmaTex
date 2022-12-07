package entity;

import java.util.Arrays;

import texture.EntityTexture;

public class Particle extends Entity{
	private double speed;
	private double[][] directionVector;
	private boolean isFading;
	

	public Particle(int positionX, int positionY, EntityTexture texture, int[][] boundingBox) {
		super(positionX, positionY, texture, boundingBox);
	}


	public Particle(int positionX, int positionY, EntityTexture texture, int[][] boundingBox, double speed,
			double[][] directionVector, boolean isFading) {
		super(positionX, positionY, texture, boundingBox);
		this.speed = speed;
		this.directionVector = directionVector;
		this.isFading = isFading;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public double[][] getDirectionVector() {
		return directionVector;
	}


	public void setDirectionVector(double[][] directionVector) {
		this.directionVector = directionVector;
	}


	public boolean isFading() {
		return isFading;
	}


	public void setFading(boolean isFading) {
		this.isFading = isFading;
	}


	@Override
	public String toString() {
		return "Particle [speed=" + speed + ", directionVector=" + Arrays.toString(directionVector) + ", isFading="
				+ isFading + ", PositionX=" + PositionX + ", PositionY=" + PositionY + ", boundingBox="
				+ Arrays.toString(boundingBox) + ", texture=" + texture + "]";
	}
}
