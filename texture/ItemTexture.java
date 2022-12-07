package texture;

import java.util.Arrays;

public class ItemTexture {
	enum state{
		PERFECT,
		FINE,
		OKAY,
		DAMAGED,
		BADLY_DAMAGED
	}
	private int[][] subImages;
	private boolean isStatic;
	private state itemState;
	
	public ItemTexture() {
		super();
	}
	
	public ItemTexture(int[][] subImages, boolean isStatic, state itemState) {
		super();
		this.subImages = subImages;
		this.isStatic = isStatic;
		this.itemState = itemState;
	}

	public int[][] getSubImages() {
		return subImages;
	}

	public void setSubImages(int[][] subImages) {
		this.subImages = subImages;
	}

	public boolean isStatic() {
		return isStatic;
	}

	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}

	public state getItemState() {
		return itemState;
	}

	public void setItemState(state itemState) {
		this.itemState = itemState;
	}

	@Override
	public String toString() {
		return "ItemTexture [subImages=" + Arrays.toString(subImages) + ", isStatic=" + isStatic + ", itemState="
				+ itemState + "]";
	}
}
