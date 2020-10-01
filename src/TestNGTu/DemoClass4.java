package TestNGTu;

import org.testng.annotations.Test;

public class DemoClass4 {
	@Test(groups= {"Smoke"})
	public void webCarLoan()
	{
		System.out.println("webCarLoan");
		System.out.println("webCarLoan1");
	}
	@Test
	public void mobileCarLoan()
	{
		System.out.println("mobileCarLoan");
	}
	@Test
	public void APICarLoan()
	{
		System.out.println("APICarLoan");
	}

}
