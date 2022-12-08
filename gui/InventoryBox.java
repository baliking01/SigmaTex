package gui;

import java.util.Arrays;

import texture.ItemTexture;
import texture.StaticTexture;

public class InventoryBox extends Inventory{
	private ItemTexture item;
	private String name;
	private int amount;
	private String description;
	private boolean isSelected;

	public InventoryBox(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}
	
	public InventoryBox(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements, StaticTexture backGround, int[][] size, boolean isDisplayed,
			boolean isSelected) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements, backGround, size, isDisplayed,
				isSelected);
	}

	public InventoryBox(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements, ItemTexture item, String name, int amount, String description,
			boolean isSelected) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.item = item;
		this.name = name;
		this.amount = amount;
		this.description = description;
		this.isSelected = isSelected;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	@Override
	public String toString() {
		return "InventoryBox [item=" + item + ", name=" + name + ", amount=" + amount + ", description=" + description
				+ ", isSelected=" + isSelected + ", positionX=" + positionX + ", positionY=" + positionY
				+ ", boundingBox=" + Arrays.toString(boundingBox) + ", isNested=" + isNested
				+ ", numberOfCompositeElements=" + numberOfCompositeElements + "]";
	}
}
