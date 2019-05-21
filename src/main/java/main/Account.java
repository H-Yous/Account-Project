package main;

public class Account {

	private String firstName;
	private String lastName;
	private int accountNumber;
	
	public Account() {
		
	}
	
	public Account(String firstName, String lastName, int accountNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAccNum(int num) {
		this.accountNumber = num;
	}
}
