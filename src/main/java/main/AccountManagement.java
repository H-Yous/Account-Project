package main;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class AccountManagement {

	private Map<Integer,Account> map;
	Service serv = new Service();

	public void setMap() {
		map=new HashMap<Integer,Account>();
	}
	
	public Map<Integer, Account> getMap() {
		return this.map;
	}
	
	public JSONObject convertToJson() {
		Account acc1 = new Account("Humza", "Younus", 123);
		
		serv.add(map, acc1);
		
		JSONObject jsonobj = new JSONObject(map);
		return jsonobj;
	}
	
}
