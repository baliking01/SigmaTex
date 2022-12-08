package databaseManager;

import java.time.LocalDate;
import java.time.LocalTime;

import texture.ItemTexture;

public class ItemData extends GameData{
	private int durability;
	private ItemTexture texture;
	private int amount;
	private String metadata;
	
	public ItemData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
	}
	public ItemData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, boolean dataChange, boolean dataInsert,
			boolean dataRemove, LocalTime modificationTime, LocalDate modificationDate) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND, dataChange, dataInsert, dataRemove, modificationTime, modificationDate);
	}
	public ItemData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, int durability, ItemTexture texture, int amount,
			String metadata) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
		this.durability = durability;
		this.texture = texture;
		this.amount = amount;
		this.metadata = metadata;
	}
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
	public ItemTexture getTexture() {
		return texture;
	}
	public void setTexture(ItemTexture texture) {
		this.texture = texture;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMetadata() {
		return metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	@Override
	public String toString() {
		return "ItemData [durability=" + durability + ", texture=" + texture + ", amount=" + amount + ", metadata="
				+ metadata + ", SQL_DML_COMMAND=" + SQL_DML_COMMAND + ", SQL_DQL_COMMAND=" + SQL_DQL_COMMAND + "]";
	}
}
