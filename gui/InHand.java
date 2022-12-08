package gui;

import java.util.Arrays;

import texture.EntityTexture;
import texture.ItemTexture;
import texture.StaticTexture;

public class InHand extends Display{
	private ItemTexture item;
	private String name;
	private int durability;
	
	public InHand(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}
	public InHand(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements, boolean borderCropped, EntityTexture dynamicTexture,
			StaticTexture staticTexture, int displayTimeSeconds, boolean isActive, boolean isVisible, double opacity) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements, borderCropped, dynamicTexture,
				staticTexture, displayTimeSeconds, isActive, isVisible, opacity);
	}
	public InHand(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			ItemTexture item, String name, int durability) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.item = item;
		this.name = name;
		this.durability = durability;
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
	@Override
	public String toString() {
		return "InHand [item=" + item + ", name=" + name + ", durability=" + durability + ", positionX=" + positionX
				+ ", positionY=" + positionY + ", boundingBox=" + Arrays.toString(boundingBox) + ", isNested="
				+ isNested + ", numberOfCompositeElements=" + numberOfCompositeElements + "]";
	}
}
