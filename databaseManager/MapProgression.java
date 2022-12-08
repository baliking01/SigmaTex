package databaseManager;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import entity.Enemy;
import gui.Armor;
import gui.HealthBar;
import texture.StaticTexture;

public class MapProgression extends GameData{
	private int positionX;
	private int positionY;
	private StaticTexture maptexture;
	private HealthBar health;
	private Armor armor;
	private Enemy[] enemies;
	
	public MapProgression(String sQL_DML_COMMAND, String sQL_DQL_COMMAND) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
	}
	public MapProgression(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, boolean dataChange, boolean dataInsert,
			boolean dataRemove, LocalTime modificationTime, LocalDate modificationDate) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND, dataChange, dataInsert, dataRemove, modificationTime, modificationDate);
	}
	public MapProgression(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, int positionX, int positionY,
			StaticTexture maptexture, HealthBar health, Armor armor, Enemy[] enemies) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
		this.positionX = positionX;
		this.positionY = positionY;
		this.maptexture = maptexture;
		this.health = health;
		this.armor = armor;
		this.enemies = enemies;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	public StaticTexture getMaptexture() {
		return maptexture;
	}
	public void setMaptexture(StaticTexture maptexture) {
		this.maptexture = maptexture;
	}
	public HealthBar getHealth() {
		return health;
	}
	public void setHealth(HealthBar health) {
		this.health = health;
	}
	public Armor getArmor() {
		return armor;
	}
	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	public Enemy[] getEnemies() {
		return enemies;
	}
	public void setEnemies(Enemy[] enemies) {
		this.enemies = enemies;
	}
	@Override
	public String toString() {
		return "MapProgression [positionX=" + positionX + ", positionY=" + positionY + ", maptexture=" + maptexture
				+ ", health=" + health + ", armor=" + armor + ", enemies=" + Arrays.toString(enemies)
				+ ", SQL_DML_COMMAND=" + SQL_DML_COMMAND + ", SQL_DQL_COMMAND=" + SQL_DQL_COMMAND + "]";
	}
}
