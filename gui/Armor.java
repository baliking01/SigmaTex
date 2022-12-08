package gui;

import java.util.Arrays;

import entity.Player;
import texture.EntityTexture;
import texture.StaticTexture;

public class Armor extends Display{
	private int armor;
	private Player player;
	private String playerName;
	private boolean isDamaged;
	private boolean isEmpty;
	
	public Armor(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
	}
	public Armor(int positionX, int positionY, int[][] boundingBox, boolean isNested,
			int numberOfCompositeElements, boolean borderCropped, EntityTexture dynamicTexture,
			StaticTexture staticTexture, int displayTimeSeconds, boolean isActive, boolean isVisible, double opacity) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements, borderCropped, dynamicTexture,
				staticTexture, displayTimeSeconds, isActive, isVisible, opacity);
	}
	public Armor(int positionX, int positionY, int[][] boundingBox, boolean isNested, int numberOfCompositeElements,
			int armor, Player player, String playerName, boolean isDamaged, boolean isEmpty) {
		super(positionX, positionY, boundingBox, isNested, numberOfCompositeElements);
		this.armor = armor;
		this.player = player;
		this.playerName = playerName;
		this.isDamaged = isDamaged;
		this.isEmpty = isEmpty;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public boolean isDamaged() {
		return isDamaged;
	}
	public void setDamaged(boolean isDamaged) {
		this.isDamaged = isDamaged;
	}
	public boolean isEmpty() {
		return isEmpty;
	}
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	@Override
	public String toString() {
		return "Armor [armor=" + armor + ", player=" + player + ", playerName=" + playerName + ", isDamaged="
				+ isDamaged + ", isEmpty=" + isEmpty + ", positionX=" + positionX + ", positionY=" + positionY
				+ ", boundingBox=" + Arrays.toString(boundingBox) + ", isNested=" + isNested
				+ ", numberOfCompositeElements=" + numberOfCompositeElements + "]";
	}
}
