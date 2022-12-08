package gui;

import java.util.Arrays;

import texture.Texture;

public class Menu extends GUI{
	private String WindowTitle;
	private boolean isStatic;
	private Texture mainBackground;
	
	public Menu(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}

	public Menu(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			String windowTitle, boolean isStatic, Texture mainBackground) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		WindowTitle = windowTitle;
		this.isStatic = isStatic;
		this.mainBackground = mainBackground;
	}

	public String getWindowTitle() {
		return WindowTitle;
	}

	public void setWindowTitle(String windowTitle) {
		WindowTitle = windowTitle;
	}

	public boolean isStatic() {
		return isStatic;
	}

	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}

	public Texture getMainBackground() {
		return mainBackground;
	}

	public void setMainBackground(Texture mainBackground) {
		this.mainBackground = mainBackground;
	}

	@Override
	public String toString() {
		return "Menu [WindowTitle=" + WindowTitle + ", isStatic=" + isStatic + ", mainBackground=" + mainBackground
				+ ", positionX=" + positionX + ", positionY=" + positionY + ", boundingBox="
				+ Arrays.toString(boundingBox) + ", isNested=" + isNested + ", numberOfCompositeElements="
				+ numberOfCompositeElements + "]";
	}
}
