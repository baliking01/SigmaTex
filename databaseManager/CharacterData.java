package databaseManager;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import entity.Player;
import item.Item;
import texture.EntityTexture;

public class CharacterData extends GameData{
	private int level;
	private int health;
	private int armor;
	private int coins;
	private int permissions;
	private Player playerSprite;
	private EntityTexture texture;
	private boolean isAlive;
	private Item[] items;
	
	public CharacterData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
	}
	public CharacterData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, boolean dataChange, boolean dataInsert,
			boolean dataRemove, LocalTime modificationTime, LocalDate modificationDate) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND, dataChange, dataInsert, dataRemove, modificationTime, modificationDate);
	}
	public CharacterData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, int level, int health, int armor, int coins,
			int permissions, Player playerSprite, EntityTexture texture, boolean isAlive, Item[] items) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
		this.level = level;
		this.health = health;
		this.armor = armor;
		this.coins = coins;
		this.permissions = permissions;
		this.playerSprite = playerSprite;
		this.texture = texture;
		this.isAlive = isAlive;
		this.items = items;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	public int getPermissions() {
		return permissions;
	}
	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}
	public Player getPlayerSprite() {
		return playerSprite;
	}
	public void setPlayerSprite(Player playerSprite) {
		this.playerSprite = playerSprite;
	}
	public EntityTexture getTexture() {
		return texture;
	}
	public void setTexture(EntityTexture texture) {
		this.texture = texture;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "CharacterData [level=" + level + ", health=" + health + ", armor=" + armor + ", coins=" + coins
				+ ", permissions=" + permissions + ", playerSprite=" + playerSprite + ", texture=" + texture
				+ ", isAlive=" + isAlive + ", items=" + Arrays.toString(items) + ", SQL_DML_COMMAND=" + SQL_DML_COMMAND
				+ ", SQL_DQL_COMMAND=" + SQL_DQL_COMMAND + "]";
	}
}
