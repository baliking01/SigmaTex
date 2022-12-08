package databaseManager;

import java.util.Arrays;

import texture.StaticTexture;

public class ProfileData extends UserData{
	private String name;
	private int level;
	private int currency;
	private String[] contacts;
	private String[] achievements;
	private StaticTexture profileIcon;
	
	public ProfileData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
	}

	public ProfileData(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, String name, int level, int currency,
			String[] contacts, String[] achievements, StaticTexture profileIcon) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
		this.name = name;
		this.level = level;
		this.currency = currency;
		this.contacts = contacts;
		this.achievements = achievements;
		this.profileIcon = profileIcon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getCurrency() {
		return currency;
	}

	public void setCurrency(int currency) {
		this.currency = currency;
	}

	public String[] getContacts() {
		return contacts;
	}

	public void setContacts(String[] contacts) {
		this.contacts = contacts;
	}

	public String[] getAchievements() {
		return achievements;
	}

	public void setAchievements(String[] achievements) {
		this.achievements = achievements;
	}

	public StaticTexture getProfileIcon() {
		return profileIcon;
	}

	public void setProfileIcon(StaticTexture profileIcon) {
		this.profileIcon = profileIcon;
	}

	@Override
	public String toString() {
		return "ProfileData [name=" + name + ", level=" + level + ", currency=" + currency + ", contacts="
				+ Arrays.toString(contacts) + ", achievements=" + Arrays.toString(achievements) + ", profileIcon="
				+ profileIcon + ", SQL_DML_COMMAND=" + SQL_DML_COMMAND + ", SQL_DQL_COMMAND=" + SQL_DQL_COMMAND + "]";
	}
}
