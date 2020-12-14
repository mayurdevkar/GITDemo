package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEX {
	
	@DataProvider
	public Object[][] getData() {
		//1.Combination - username and password
		
		Object[][] data = new Object[3][2];
		data[0][0] = "Mayur";
		data[0][1]= "Devkar";
		return data;
		
		
	}
	
	@Test(dataProvider = "getData")
	public void printData(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}

}
