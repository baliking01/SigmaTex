package entity;

import java.util.Arrays;

import texture.EntityTexture;

public class Projectile extends Entity{
	private double speed;
	private double[][] directionVector;
	private double initialForce;
	private boolean impact;
	private boolean isExplosive;
	private Particle particleTrail;
	
	public Projectile(int positionX, int positionY, EntityTexture texture, int[][] boundingBox) {
		super(positionX, positionY, texture, boundingBox);
	}

	public Projectile(int positionX, int positionY, EntityTexture texture, int[][] boundingBox, double speed,
			double[][] directionVector, double initialForce, boolean impact, boolean isExplosive,
			Particle particleTrail) {
		super(positionX, positionY, texture, boundingBox);
		this.speed = speed;
		this.directionVector = directionVector;
		this.initialForce = initialForce;
		this.impact = impact;
		this.isExplosive = isExplosive;
		this.particleTrail = particleTrail;
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

	public double getInitialForce() {
		return initialForce;
	}

	public void setInitialForce(double initialForce) {
		this.initialForce = initialForce;
	}

	public boolean isImpact() {
		return impact;
	}

	public void setImpact(boolean impact) {
		this.impact = impact;
	}

	public boolean isExplosive() {
		return isExplosive;
	}

	public void setExplosive(boolean isExplosive) {
		this.isExplosive = isExplosive;
	}

	public Particle getParticleTrail() {
		return particleTrail;
	}

	public void setParticleTrail(Particle particleTrail) {
		this.particleTrail = particleTrail;
	}
	
	public void setTrajectory() {
		/*Implement the following function for calculating
		 * the trajectory of any projectile 
		 * x(t) = x0 + v0 * t + 0.5g * t^2
		*/
	}

	@Override
	public String toString() {
		return "Projectile [speed=" + speed + ", directionVector=" + Arrays.toString(directionVector)
				+ ", initialForce=" + initialForce + ", impact=" + impact + ", isExplosive=" + isExplosive
				+ ", particleTrail=" + particleTrail + ", PositionX=" + PositionX + ", PositionY=" + PositionY
				+ ", boundingBox=" + Arrays.toString(boundingBox) + ", texture=" + texture + "]";
	}
}
