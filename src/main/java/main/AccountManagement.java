package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.*;

import org.json.JSONObject;

public class AccountManagement {

	private Map<Integer,Account> map;
	Service serv = new Service();
	
	
	public void setMap() {
		map=new HashMap<Integer,Account>();
	}
	
	public Map<Integer, Account> getMap() {
		return map;
	}
	
	public JSONObject convertToJson() {
		
		JSONObject jsonobj = new JSONObject(map);
		return jsonobj;
	}
	
	
	
	
	
}
