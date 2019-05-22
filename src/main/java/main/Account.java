package main;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="Accounts")
public class Account {
	
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int accountNumber;

	@Column(name="FirstName", length=100)
	
	@NotNull
	private String firstName;
	
	@Column(name="LastName", length = 100)
	
	@NotNull
	private String lastName;
	
	
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
	public String getFirstName() {
		return this.firstName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return this.lastName;
	}

	public void setAccNum(int num) {
		this.accountNumber = num;
	}
	public int getAccNum() {
		return this.accountNumber;
	}
}
