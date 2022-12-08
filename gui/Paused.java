package gui;
import java.time.LocalTime;
import java.util.Arrays;

import texture.Texture;

public class Paused extends Menu{
	private int secondsPassed;
	private LocalTime timeOfPause;
	private boolean isAlive;
	
	public Paused(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}
	
	public Paused(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			String windowTitle, boolean isStatic, Texture mainBackground) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements, windowTitle, isStatic, mainBackground);
	}

	public Paused(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			int secondsPassed, LocalTime timeOfPause, boolean isAlive) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.secondsPassed = secondsPassed;
		this.timeOfPause = timeOfPause;
		this.isAlive = isAlive;
	}

	public int getSecondsPassed() {
		return secondsPassed;
	}

	public void setSecondsPassed(int secondsPassed) {
		this.secondsPassed = secondsPassed;
	}

	public LocalTime getTimeOfPause() {
		return timeOfPause;
	}

	public void setTimeOfPause(LocalTime timeOfPause) {
		this.timeOfPause = timeOfPause;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	@Override
	public String toString() {
		return "Paused [secondsPassed=" + secondsPassed + ", timeOfPause=" + timeOfPause + ", isAlive=" + isAlive
				+ ", positionX=" + positionX + ", positionY=" + positionY + ", boundingBox="
				+ Arrays.toString(boundingBox) + ", isNested=" + isNested + ", numberOfCompositeElements="
				+ numberOfCompositeElements + "]";
	}
}
