package texture;

import java.awt.image.BufferedImage;
import java.util.Arrays;

public class EntityTexture extends Texture{
	private int[][] subImages;
	private boolean isStatic;
	
	public EntityTexture() {
		super();
	}
	public EntityTexture(BufferedImage image, int[] imageDimensions, int[] subImageDimensions,
			int[][] subImages, boolean isStatic) {
		super();
		this.subImages = subImages;
		this.isStatic = isStatic;
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
	@Override
	public String toString() {
		return "EntityTexture [subImages=" + Arrays.toString(subImages) + ", isStatic=" + isStatic + ", image=" + image
				+ ", imageDimensions=" + Arrays.toString(imageDimensions) + ", subImageDimensions="
				+ Arrays.toString(subImageDimensions) + "]";
	}

}
