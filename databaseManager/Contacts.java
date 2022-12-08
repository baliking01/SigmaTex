package databaseManager;

import java.util.Arrays;

import entity.Player;

public class Contacts extends UserData{
	private String[] contactList;
	private Player[] PcontactList;
	
 	public Contacts(String sQL_DML_COMMAND, String sQL_DQL_COMMAND) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
	}

	public Contacts(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, String[] contactList, Player[] pcontactList) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
		this.contactList = contactList;
		PcontactList = pcontactList;
	}

	public String[] getContactList() {
		return contactList;
	}

	public void setContactList(String[] contactList) {
		this.contactList = contactList;
	}

	public Player[] getPcontactList() {
		return PcontactList;
	}

	public void setPcontactList(Player[] pcontactList) {
		PcontactList = pcontactList;
	}

	@Override
	public String toString() {
		return "Contacts [contactList=" + Arrays.toString(contactList) + ", PcontactList="
				+ Arrays.toString(PcontactList) + ", SQL_DML_COMMAND=" + SQL_DML_COMMAND + ", SQL_DQL_COMMAND="
				+ SQL_DQL_COMMAND + "]";
	}
}
