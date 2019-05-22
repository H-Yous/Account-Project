package main;

import java.util.Map;

public class Service {
	private int count = 1;
	
	public void add(Map<Integer, Account> map, Account account) {
		map.put(count, account);
		count++;
	}
	
	public void get(Map<Integer, Account> map, int key) {
		map.get(key);
	}
	
	public int checkName(Map<Integer, Account> map, String checkName) {
		
		return (int) map.values().stream()
				.filter(x -> x.getFirstName().equals(checkName)).count();
		
	}
}
