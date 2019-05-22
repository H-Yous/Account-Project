package main;

public class App {
	public static void main(String args[]) {
		System.out.println("Hello world to the standard out");
		
		AccountManagement accm = new AccountManagement();
		
		accm.serv.add(accm.getMap(), new Account("John", "Doe", 1234));
		
		
		
	}
}
