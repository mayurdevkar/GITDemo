package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrized {
	
	@Parameters({"url"})
	@Test
	public void Login(String urlname)
	{
		System.out.println(urlname);
	}
	
	

}
