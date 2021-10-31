package sec06.ch06_19;

public class Account {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	private int balance;
	
	public void setBalance(int balance) {
		if ( MIN_BALANCE > balance || balance > MAX_BALANCE) {
			getBalance();
		}
		else {
			this.balance = balance;			
		}
	}
	
	public int getBalance() {

		return balance;
	}
	
}
