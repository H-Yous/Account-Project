package main;

import java.util.HashMap;
import java.util.Map;

public class AccountManagement {

	private Map<Integer,Account> map;

	public void setMap() {
		map=new HashMap<Integer,Account>();
	}
	
	public Map<Integer, Account> getMap() {
		return this.map;
	}
}
