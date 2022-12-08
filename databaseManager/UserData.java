package databaseManager;

public class UserData extends DataBaseManager{
	private static final String USER_TOKEN = "User ID";
	
	public UserData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
	}

	public static String getUserToken() {
		return USER_TOKEN;
	}

	@Override
	public String toString() {
		return "UserData [SQL_DML_COMMAND=" + SQL_DML_COMMAND + ", SQL_DQL_COMMAND=" + SQL_DQL_COMMAND + "]";
	}
}
