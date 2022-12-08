package gui;

import java.util.Arrays;

import texture.EntityTexture;
import texture.StaticTexture;

public class LevelProgressionBar extends Display{
	private double progressionPercent;
	private int overallTimeToFinish;
	private int timeToFinish;
	private boolean isFinished;
	
	public LevelProgressionBar(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}
	public LevelProgressionBar(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements, boolean borderCropped, EntityTexture dynamicTexture,
			StaticTexture staticTexture, int displayTimeSeconds, boolean isActive, boolean isVisible, double opacity) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements, borderCropped, dynamicTexture,
				staticTexture, displayTimeSeconds, isActive, isVisible, opacity);
	}
	public LevelProgressionBar(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements, double progressionPercent, int overallTimeToFinish, int timeToFinish,
			boolean isFinished) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.progressionPercent = progressionPercent;
		this.overallTimeToFinish = overallTimeToFinish;
		this.timeToFinish = timeToFinish;
		this.isFinished = isFinished;
	}
	public double getProgressionPercent() {
		return progressionPercent;
	}
	public void setProgressionPercent(double progressionPercent) {
		this.progressionPercent = progressionPercent;
	}
	public int getOverallTimeToFinish() {
		return overallTimeToFinish;
	}
	public void setOverallTimeToFinish(int overallTimeToFinish) {
		this.overallTimeToFinish = overallTimeToFinish;
	}
	public int getTimeToFinish() {
		return timeToFinish;
	}
	public void setTimeToFinish(int timeToFinish) {
		this.timeToFinish = timeToFinish;
	}
	public boolean isFinished() {
		return isFinished;
	}
	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
	@Override
	public String toString() {
		return "LevelProgressionBar [progressionPercent=" + progressionPercent + ", overallTimeToFinish="
				+ overallTimeToFinish + ", timeToFinish=" + timeToFinish + ", isFinished=" + isFinished + ", positionX="
				+ positionX + ", positionY=" + positionY + ", boundingBox=" + Arrays.toString(boundingBox)
				+ ", isNested=" + isNested + ", numberOfCompositeElements=" + numberOfCompositeElements + "]";
	}

}
