package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL", "APIkey/username"})
	@Test
	public void WebloginHomeLoan(String uname, String key)
	{
		System.out.println("Web");
		System.out.println(uname);
		System.out.println(key);
	}
	
	@Test
	public void MobileloginHomeLoan()
	{
		System.out.println("Mob");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	
	@BeforeSuite
	public void bSuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(groups={"Smoke"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("API");
	}

	
}
