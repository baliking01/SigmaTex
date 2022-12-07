package entity;
import java.util.Arrays;

import texture.EntityTexture;

public class Entity {
	protected int PositionX;
	protected int PositionY;
	protected int[][] boundingBox;
	protected EntityTexture texture;
	
	public Entity(int positionX, int positionY, EntityTexture texture, int[][] boundingBox) {
		this.PositionX = positionX;
		this.PositionY = positionY;
		this.boundingBox = boundingBox;
		this.texture = texture;
	}

	public int getPositionX() {
		return PositionX;
	}

	public void setPositionX(int positionX) {
		PositionX = positionX;
	}

	public int getPositionY() {
		return PositionY;
	}

	public void setPositionY(int positionY) {
		PositionY = positionY;
	}

	public EntityTexture getTexture() {
		return texture;
	}

	public void setTexture(EntityTexture texture) {
		this.texture = texture;
	}

	public int[][] getBoundingBox() {
		return boundingBox;
	}

	public void setBoundingBox(int[][] boundingBox) {
		this.boundingBox = boundingBox;
	}

	@Override
	public String toString() {
		return "Entity [PositionX=" + PositionX + ", PositionY=" + PositionY + ", boundingBox="
				+ Arrays.toString(boundingBox) + ", texture=" + texture + "]";
	}
}
