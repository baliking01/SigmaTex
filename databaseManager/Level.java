package databaseManager;

public class Level extends UserData{
	private int Level;
	private int generalProgression;
	private int requiredForNextLevel;
	
	public Level(String sQL_DML_COMMAND, String sQL_DQL_COMMAND) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
	}

	public Level(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, int level, int generalProgression,
			int requiredForNextLevel) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
		Level = level;
		this.generalProgression = generalProgression;
		this.requiredForNextLevel = requiredForNextLevel;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}

	public int getGeneralProgression() {
		return generalProgression;
	}

	public void setGeneralProgression(int generalProgression) {
		this.generalProgression = generalProgression;
	}

	public int getRequiredForNextLevel() {
		return requiredForNextLevel;
	}

	public void setRequiredForNextLevel(int requiredForNextLevel) {
		this.requiredForNextLevel = requiredForNextLevel;
	}

	@Override
	public String toString() {
		return "Level [Level=" + Level + ", generalProgression=" + generalProgression + ", requiredForNextLevel="
				+ requiredForNextLevel + ", SQL_DML_COMMAND=" + SQL_DML_COMMAND + ", SQL_DQL_COMMAND=" + SQL_DQL_COMMAND
				+ "]";
	}
}
