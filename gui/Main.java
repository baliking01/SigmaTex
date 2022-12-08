package gui;

import java.util.Arrays;

import texture.Texture;

public class Main extends Menu{
	enum alignment{
		RIGHT,
		CENTER,
		LEFT,
		JUSTIFIED
	}
	enum orientation{
		HORIZONTAL,
		VERTICAL
	}
	private String[] dialogueBoxes;
	private alignment align;
	private orientation orientation;
	boolean isSelected;
			
	public Main(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}
	
	public Main(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			String windowTitle, boolean isStatic, Texture mainBackground) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements, windowTitle, isStatic, mainBackground);
	}

	public Main(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			String[] dialogueBoxes, alignment align, gui.Main.orientation orientation, boolean isSelected) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.dialogueBoxes = dialogueBoxes;
		this.align = align;
		this.orientation = orientation;
		this.isSelected = isSelected;
	}

	public String[] getDialogueBoxes() {
		return dialogueBoxes;
	}

	public void setDialogueBoxes(String[] dialogueBoxes) {
		this.dialogueBoxes = dialogueBoxes;
	}

	public alignment getAlign() {
		return align;
	}

	public void setAlign(alignment align) {
		this.align = align;
	}

	public orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(orientation orientation) {
		this.orientation = orientation;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	@Override
	public String toString() {
		return "Main [dialogueBoxes=" + Arrays.toString(dialogueBoxes) + ", align=" + align + ", orientation="
				+ orientation + ", isSelected=" + isSelected + ", positionX=" + positionX + ", positionY=" + positionY
				+ ", boundingBox=" + Arrays.toString(boundingBox) + ", isNested=" + isNested
				+ ", numberOfCompositeElements=" + numberOfCompositeElements + "]";
	}
}
