package gui;

import java.util.Arrays;

import texture.EntityTexture;
import texture.StaticTexture;

public class Display extends GUI{
	private boolean borderCropped;
	private EntityTexture dynamicTexture;
	private StaticTexture staticTexture;
	private int displayTimeSeconds;
	private boolean isActive;
	private boolean isVisible;
	private double opacity;
	
	public Display(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}

	public Display(int positionX, int positionY, int[][] boundingBox, boolean isNested,
				int numberOfCompositeElements, boolean borderCropped, EntityTexture dynamicTexture,
				StaticTexture staticTexture, int displayTimeSeconds, boolean isActive, boolean isVisible,
				double opacity) {
			super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
			this.borderCropped = borderCropped;
			this.dynamicTexture = dynamicTexture;
			this.staticTexture = staticTexture;
			this.displayTimeSeconds = displayTimeSeconds;
			this.isActive = isActive;
			this.isVisible = isVisible;
			this.opacity = opacity;
		}

	public boolean isBorderCropped() {
			return borderCropped;
	}

	public void setBorderCropped(boolean borderCropped) {
		this.borderCropped = borderCropped;
	}
	public EntityTexture getDynamicTexture() {
		return dynamicTexture;
	}
	public void setDynamicTexture(EntityTexture dynamicTexture) {
		this.dynamicTexture = dynamicTexture;
	}
	public StaticTexture getStaticTexture() {
		return staticTexture;
	}
	public void setStaticTexture(StaticTexture staticTexture) {
		this.staticTexture = staticTexture;
	}
	public int getDisplayTimeSeconds() {
		return displayTimeSeconds;
	}
	public void setDisplayTimeSeconds(int displayTimeSeconds) {
		this.displayTimeSeconds = displayTimeSeconds;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public double getOpacity() {
		return opacity;
	}
	public void setOpacity(double opacity) {
		this.opacity = opacity;
	}
	
	@Override
	public String toString() {
		return "Display [borderCropped=" + borderCropped + ", dynamicTexture=" + dynamicTexture + ", staticTexture="
				+ staticTexture + ", displayTimeSeconds=" + displayTimeSeconds + ", isActive=" + isActive
				+ ", isVisible=" + isVisible + ", opacity=" + opacity + ", positionX=" + positionX + ", positionY="
				+ positionY + ", boundingBox=" + Arrays.toString(boundingBox) + ", isNested=" + isNested
				+ ", numberOfCompositeElements=" + numberOfCompositeElements + "]";
	}
}
