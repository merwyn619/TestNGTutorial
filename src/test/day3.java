package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(timeOut=4000)
	public void MobileloginCarLoan3()
	{
		System.out.println("Selenium");
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileloginCarLoan(String urlname)
	{
		System.out.println("SignIn");
		System.out.println(urlname);
	}
	
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every method");
	}
	
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("I will execute after every method");
	}
	
	@Test(dataProvider="getData")
	public void MobileloginCarLoan2(String username, String password)
	{
		System.out.println("XE login");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeClass
	public void bClass() 
	{
		System.out.println("I will execute before class");
	}
	
	@AfterClass
	public void aClass() 
	{
		System.out.println("I will execute after class");
	}
	
	@Test(dependsOnMethods={"MobileloginCarLoan"})
	public void APILoginCarLoan()
	{
		System.out.println("API login");
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2]; 
		data[0][0]="firstusername";
		data[0][1]="firstpwd";
		
		data[1][0]="secondusername";
		data[1][1]="secondpwd";
		
		data[2][0]="thirdusername";
		data[2][1]="thridpwd";
		return data;
	}
}
