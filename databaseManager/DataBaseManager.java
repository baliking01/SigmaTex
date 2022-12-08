package databaseManager;

public class DataBaseManager {
	protected final static String DATABASE_NAME = "SGMTX_GAME_METADATA_DB";
	protected String SQL_DML_COMMAND;
	protected String SQL_DQL_COMMAND;
	
	public DataBaseManager(String sQL_DML_COMMAND, String sQL_DQL_COMMAND) {
		SQL_DML_COMMAND = sQL_DML_COMMAND;
		SQL_DQL_COMMAND = sQL_DQL_COMMAND;
	}
	public String getSQL_DML_COMMAND() {
		return SQL_DML_COMMAND;
	}
	public void setSQL_DML_COMMAND(String sQL_DML_COMMAND) {
		SQL_DML_COMMAND = sQL_DML_COMMAND;
	}
	public String getSQL_DQL_COMMAND() {
		return SQL_DQL_COMMAND;
	}
	public void setSQL_DQL_COMMAND(String sQL_DQL_COMMAND) {
		SQL_DQL_COMMAND = sQL_DQL_COMMAND;
	}
	public static String getDatabaseName() {
		return DATABASE_NAME;
	}
	@Override
	public String toString() {
		return "DataBaseManager [SQL_DML_COMMAND=" + SQL_DML_COMMAND + ", SQL_DQL_COMMAND=" + SQL_DQL_COMMAND + "]";
	}
}
