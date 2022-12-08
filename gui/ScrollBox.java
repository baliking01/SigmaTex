package gui;

import java.util.Arrays;

import texture.StaticTexture;

public class ScrollBox extends Inventory{
	private StaticTexture border;
	private double borderThickness;
	private int[][] currentPosition;
	private InventoryBox selectedItem;

	public ScrollBox(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}
	
	public ScrollBox(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements, StaticTexture backGround, int[][] size, boolean isDisplayed,
			boolean isSelected) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements, backGround, size, isDisplayed,
				isSelected);
	}

	public ScrollBox(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			StaticTexture border, double borderThickness, int[][] currentPosition, InventoryBox selectedItem) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.border = border;
		this.borderThickness = borderThickness;
		this.currentPosition = currentPosition;
		this.selectedItem = selectedItem;
	}

	public StaticTexture getBorder() {
		return border;
	}

	public void setBorder(StaticTexture border) {
		this.border = border;
	}

	public double getBorderThickness() {
		return borderThickness;
	}

	public void setBorderThickness(double borderThickness) {
		this.borderThickness = borderThickness;
	}

	public int[][] getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int[][] currentPosition) {
		this.currentPosition = currentPosition;
	}

	public InventoryBox getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(InventoryBox selectedItem) {
		this.selectedItem = selectedItem;
	}

	@Override
	public String toString() {
		return "ScrollBox [border=" + border + ", borderThickness=" + borderThickness + ", currentPosition="
				+ Arrays.toString(currentPosition) + ", selectedItem=" + selectedItem + ", positionX=" + positionX
				+ ", positionY=" + positionY + ", boundingBox=" + Arrays.toString(boundingBox) + ", isNested="
				+ isNested + ", numberOfCompositeElements=" + numberOfCompositeElements + "]";
	}
}
