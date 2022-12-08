package gui;

import java.util.Arrays;

public class GUI {
	protected int positionX;
	protected int positionY;
	protected int[][] boundingBox;
	protected boolean isNested;
	protected int numberOfCompositeElements;
	
	public GUI(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements) {
		super();
		this.positionX = positionX;
		this.positionY = positionY;
		this.boundingBox = boundingBox;
		this.isNested = isNested;
		this.numberOfCompositeElements = numberOfCompositeElements;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public int[][] getBoundingBox() {
		return boundingBox;
	}

	public void setBoundingBox(int[][] boundingBox) {
		this.boundingBox = boundingBox;
	}

	public boolean isNested() {
		return isNested;
	}

	public void setNested(boolean isNested) {
		this.isNested = isNested;
	}

	public int getNumberOfCompositeElements() {
		return numberOfCompositeElements;
	}

	public void setNumberOfCompositeElements(int numberOfCompositeElements) {
		this.numberOfCompositeElements = numberOfCompositeElements;
	}

	@Override
	public String toString() {
		return "GUI [positionX=" + positionX + ", positionY=" + positionY + ", boundingBox="
				+ Arrays.toString(boundingBox) + ", isNested=" + isNested + ", numberOfCompositeElements="
				+ numberOfCompositeElements + "]";
	}
}
