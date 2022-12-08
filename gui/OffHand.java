package gui;

import java.util.Arrays;

import texture.EntityTexture;
import texture.ItemTexture;
import texture.StaticTexture;

public class OffHand extends Display{
	private ItemTexture item;
	private String name;
	private int durability;
	private double shading;
	private double opacity;
	
	public OffHand(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}
	public OffHand(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements, boolean borderCropped, EntityTexture dynamicTexture,
			StaticTexture staticTexture, int displayTimeSeconds, boolean isActive, boolean isVisible, double opacity) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements, borderCropped, dynamicTexture,
				staticTexture, displayTimeSeconds, isActive, isVisible, opacity);
	}
	public OffHand(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			ItemTexture item, String name, int durability, double shading, double opacity) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.item = item;
		this.name = name;
		this.durability = durability;
		this.shading = shading;
		this.opacity = opacity;
	}
	public ItemTexture getItem() {
		return item;
	}
	public void setItem(ItemTexture item) {
		this.item = item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
	public double getShading() {
		return shading;
	}
	public void setShading(double shading) {
		this.shading = shading;
	}
	public double getOpacity() {
		return opacity;
	}
	public void setOpacity(double opacity) {
		this.opacity = opacity;
	}
	@Override
	public String toString() {
		return "OffHand [item=" + item + ", name=" + name + ", durability=" + durability + ", shading=" + shading
				+ ", opacity=" + opacity + ", positionX=" + positionX + ", positionY=" + positionY + ", boundingBox="
				+ Arrays.toString(boundingBox) + ", isNested=" + isNested + ", numberOfCompositeElements="
				+ numberOfCompositeElements + "]";
	}
}
