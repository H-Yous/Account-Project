package main;

import java.util.Map;

public class Service {

	private int count = 1;
	
	public void add(Map<Integer, Account> map, Account account) {
		map.put(count, account);
		this.count++;
	}
	
	public void get(Map<Integer, Account> map, int key) {
		map.get(key);
	}
	
}
