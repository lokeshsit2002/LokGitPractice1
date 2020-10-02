package TestNGTu;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoClass3 {
	@Test
	public void webHomeLoan()
	{
		System.out.println("webHomeLoan");
		System.out.println("webHomeLoan2");
		System.out.println("webHomeLoan1");
		System.out.println("webHomeLoan5");
		System.out.println("webHomeLoan4");
		System.out.println("webHomeLoan6");
		System.out.println("webHomeLoan3");
		System.out.println("Happy Friday1");
		System.out.println("Happy Saturday");
		System.out.println("Happy Sunday1");


	}
	@Test
	public void mobileHomeLoan()
	{
		System.out.println("mobileHomeLoan");
	}
	@Test
	public void mobileSignInHomeLoan()
	{
		System.out.println("mobileSignInHomeLoan");
	}
	@Test
	public void mobileSignOutHomeLoan()
	{
		System.out.println("mobileSignOutHomeLoan");
	}
	@BeforeClass
	public void BfClass()
	{
		System.out.println("I will execute before any test method in DemoClass3");
	}
	
	@BeforeMethod
	public void BeforeEvery()
	{
		System.out.println("I will execute before every test method in DemoClass3");
	}
	
	@AfterClass
	public void AfClass()
	{
		System.out.println("I will execute after all test methods in DemoClass3");
	}
	@AfterMethod
	public void AfterEvery()
	{
		System.out.println("I will execute after every test method in DemoClass3");
	}
	
	@Test(groups= {"Smoke"})
	public void APIHomeLoan()
	{
		System.out.println("APIHomeLoan");
	}

}
