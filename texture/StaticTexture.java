package texture;

import java.util.Arrays;

public class StaticTexture {
	private int[][] boundingBox;
	private boolean isInteractive;
	
	public StaticTexture() {
		super();
	}

	public StaticTexture(int[][] boundingBox, boolean isInteractive) {
		super();
		this.boundingBox = boundingBox;
		this.isInteractive = isInteractive;
	}

	public int[][] getBoundingBox() {
		return boundingBox;
	}

	public void setBoundingBox(int[][] boundingBox) {
		this.boundingBox = boundingBox;
	}

	public boolean isInteractive() {
		return isInteractive;
	}

	public void setInteractive(boolean isInteractive) {
		this.isInteractive = isInteractive;
	}

	@Override
	public String toString() {
		return "StaticTexture [boundingBox=" + Arrays.toString(boundingBox) + ", isInteractive=" + isInteractive + "]";
	}

}
