package gui;

import java.util.Arrays;

import texture.StaticTexture;

public class Inventory extends GUI{
	private StaticTexture backGround;
	private int[][] size;
	private boolean isDisplayed;
	private boolean isSelected;
	
	public Inventory(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}

	public Inventory(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			StaticTexture backGround, int[][] size, boolean isDisplayed, boolean isSelected) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.backGround = backGround;
		this.size = size;
		this.isDisplayed = isDisplayed;
		this.isSelected = isSelected;
	}

	public StaticTexture getBackGround() {
		return backGround;
	}

	public void setBackGround(StaticTexture backGround) {
		this.backGround = backGround;
	}

	public int[][] getSize() {
		return size;
	}

	public void setSize(int[][] size) {
		this.size = size;
	}

	public boolean isDisplayed() {
		return isDisplayed;
	}

	public void setDisplayed(boolean isDisplayed) {
		this.isDisplayed = isDisplayed;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	@Override
	public String toString() {
		return "Inventory [backGround=" + backGround + ", size=" + Arrays.toString(size) + ", isDisplayed="
				+ isDisplayed + ", isSelected=" + isSelected + ", positionX=" + positionX + ", positionY=" + positionY
				+ ", boundingBox=" + Arrays.toString(boundingBox) + ", isNested=" + isNested
				+ ", numberOfCompositeElements=" + numberOfCompositeElements + "]";
	}
}
