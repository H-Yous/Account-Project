package main;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {

	
	
	@Test
	public void testCountName() {
		AccountManagement am = new AccountManagement();
		am.setMap();
		am.serv.add(am.getMap(), new Account("Humza", "Younus", 123));
		am.serv.add(am.getMap(), new Account("Humza", "Younus", 124));
		am.serv.add(am.getMap(), new Account("Farhaan", "LOL", 125));
		
		assertEquals(2, am.serv.checkName(am.getMap(), "Humza"));
	}
	
	
}
