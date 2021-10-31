package sec06.ch06_20;

public class Account {
	private String ano;
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {     // ano Getter
		return ano;
	}

	public void setAno(String ano) {		// ano Setter
		this.ano = ano;
	}

	public String getOwner() {	// owner Getter
		return owner;
	}

	public void setOwner(String owner) {	// owner Setter
		this.owner = owner;
	}

	public int getBalance() {	// balance Getter
		return balance;
	}

	public void setBalance(int balance) {			// balance Setter
		this.balance = balance;
	}
}
