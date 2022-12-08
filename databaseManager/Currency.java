package databaseManager;

import java.util.Arrays;

public class Currency extends UserData{
	private int jmf_Amount;
	private String[] itemsPurchased;
	
	public Currency(String sQL_DML_COMMAND, String sQL_DQL_COMMAND) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
	}

	public Currency(String sQL_DML_COMMAND, String sQL_DQL_COMMAND, int jmf_Amount, String[] itemsPurchased) {
		super(sQL_DML_COMMAND, sQL_DQL_COMMAND);
		this.jmf_Amount = jmf_Amount;
		this.itemsPurchased = itemsPurchased;
	}

	public int getJmf_Amount() {
		return jmf_Amount;
	}

	public void setJmf_Amount(int jmf_Amount) {
		this.jmf_Amount = jmf_Amount;
	}

	public String[] getItemsPurchased() {
		return itemsPurchased;
	}

	public void setItemsPurchased(String[] itemsPurchased) {
		this.itemsPurchased = itemsPurchased;
	}

	@Override
	public String toString() {
		return "Currency [jmf_Amount=" + jmf_Amount + ", itemsPurchased=" + Arrays.toString(itemsPurchased)
				+ ", SQL_DML_COMMAND=" + SQL_DML_COMMAND + ", SQL_DQL_COMMAND=" + SQL_DQL_COMMAND + "]";
	}
}
