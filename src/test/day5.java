package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;

public class day5 {
	@BeforeTest
	public void f() {
		System.out.println("BeforeTest");
	}
	
	@BeforeSuite
		public void g() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
	public void h() {
		System.out.println("BeforeClass");
	}
	@Parameters({"url","key"})
	@Test(groups = {"smoke"})
	public void Login(String urlname, String keyname) {
		System.out.println(urlname);
		System.out.println(keyname);
	}
	
	@BeforeGroups
	public void b() {
		System.out.println("BeforeGroups");
	}
	
	@BeforeMethod
	public void c() {
		System.out.println("BeforeMethod");
	}
	
	@Test(enabled = false)
	public void d() {
		System.out.println("D");
	}
	
	@Test(timeOut = 4000)
	public void e() {
		System.out.println("E");
	}
	
	

}
