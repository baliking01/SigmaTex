package gui;

import java.util.Arrays;

import texture.Texture;

public class Settings extends Menu{
	private double[] values;
	private boolean[] isSelected;
	private int nestedSettings;
	
	public Settings(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}
	
	public Settings(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			String windowTitle, boolean isStatic, Texture mainBackground) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements, windowTitle, isStatic, mainBackground);
	}

	public Settings(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			double[] values, boolean[] isSelected, int nestedSettings) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.values = values;
		this.isSelected = isSelected;
		this.nestedSettings = nestedSettings;
	}

	public double[] getValues() {
		return values;
	}

	public void setValues(double[] values) {
		this.values = values;
	}

	public boolean[] getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(boolean[] isSelected) {
		this.isSelected = isSelected;
	}

	public int getNestedSettings() {
		return nestedSettings;
	}

	public void setNestedSettings(int nestedSettings) {
		this.nestedSettings = nestedSettings;
	}

	@Override
	public String toString() {
		return "Settings [values=" + Arrays.toString(values) + ", isSelected=" + Arrays.toString(isSelected)
				+ ", nestedSettings=" + nestedSettings + ", positionX=" + positionX + ", positionY=" + positionY
				+ ", boundingBox=" + Arrays.toString(boundingBox) + ", isNested=" + isNested
				+ ", numberOfCompositeElements=" + numberOfCompositeElements + "]";
	}
}
