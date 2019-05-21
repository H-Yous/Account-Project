package main;

import java.util.Map;

public class Service {

	
	public void add(Map<Integer, Account> map, Account account) {
		map.put(account.getAccNum(), account);
	}
	
	public void get(Map<Integer, Account> map, int key) {
		map.get(key);
	}
	
}
