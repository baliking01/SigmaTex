package databaseManager;

import java.time.LocalDate;
import java.time.LocalTime;

public class GameData extends DataBaseManager{
	private boolean dataChange;
	private boolean dataInsert;
	private boolean dataRemove;
	private LocalTime modificationTime;
	private LocalDate modificationDate;
	
	public GameData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
	}

	public GameData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, boolean dataChange, boolean dataInsert,
			boolean dataRemove, LocalTime modificationTime, LocalDate modificationDate) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
		this.dataChange = dataChange;
		this.dataInsert = dataInsert;
		this.dataRemove = dataRemove;
		this.modificationTime = modificationTime;
		this.modificationDate = modificationDate;
	}

	public boolean isDataChange() {
		return dataChange;
	}

	public void setDataChange(boolean dataChange) {
		this.dataChange = dataChange;
	}

	public boolean isDataInsert() {
		return dataInsert;
	}

	public void setDataInsert(boolean dataInsert) {
		this.dataInsert = dataInsert;
	}

	public boolean isDataRemove() {
		return dataRemove;
	}

	public void setDataRemove(boolean dataRemove) {
		this.dataRemove = dataRemove;
	}

	public LocalTime getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(LocalTime modificationTime) {
		this.modificationTime = modificationTime;
	}

	public LocalDate getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(LocalDate modificationDate) {
		this.modificationDate = modificationDate;
	}

	@Override
	public String toString() {
		return "GameData [dataChange=" + dataChange + ", dataInsert=" + dataInsert + ", dataRemove=" + dataRemove
				+ ", modificationTime=" + modificationTime + ", modificationDate=" + modificationDate
				+ ", SQL_DML_COMMAND=" + SQL_DML_COMMAND + ", SQL_DQL_COMMAND=" + SQL_DQL_COMMAND + "]";
	}
}
