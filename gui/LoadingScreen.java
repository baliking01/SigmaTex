package gui;

import java.util.Arrays;

import texture.StaticTexture;

public class LoadingScreen extends GUI{
	private StaticTexture[] screens;
	private int overallDisplayTimeSeconds;
	private int displayTimeSeconds;
	private boolean showLoadingBar;
	
	public LoadingScreen(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}

	public LoadingScreen(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements, StaticTexture[] screens, int overallDisplayTimeSeconds,
			int displayTimeSeconds, boolean showLoadingBar) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.screens = screens;
		this.overallDisplayTimeSeconds = overallDisplayTimeSeconds;
		this.displayTimeSeconds = displayTimeSeconds;
		this.showLoadingBar = showLoadingBar;
	}

	public StaticTexture[] getScreens() {
		return screens;
	}

	public void setScreens(StaticTexture[] screens) {
		this.screens = screens;
	}

	public int getOverallDisplayTimeSeconds() {
		return overallDisplayTimeSeconds;
	}

	public void setOverallDisplayTimeSeconds(int overallDisplayTimeSeconds) {
		this.overallDisplayTimeSeconds = overallDisplayTimeSeconds;
	}

	public int getDisplayTimeSeconds() {
		return displayTimeSeconds;
	}

	public void setDisplayTimeSeconds(int displayTimeSeconds) {
		this.displayTimeSeconds = displayTimeSeconds;
	}

	public boolean isShowLoadingBar() {
		return showLoadingBar;
	}

	public void setShowLoadingBar(boolean showLoadingBar) {
		this.showLoadingBar = showLoadingBar;
	}

	@Override
	public String toString() {
		return "LoadingScreen [screens=" + Arrays.toString(screens) + ", overallDisplayTimeSeconds="
				+ overallDisplayTimeSeconds + ", displayTimeSeconds=" + displayTimeSeconds + ", showLoadingBar="
				+ showLoadingBar + ", positionX=" + positionX + ", positionY=" + positionY + ", boundingBox="
				+ Arrays.toString(boundingBox) + ", isNested=" + isNested + ", numberOfCompositeElements="
				+ numberOfCompositeElements + "]";
	}
}
