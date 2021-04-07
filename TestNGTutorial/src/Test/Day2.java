package Test;

import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void DefaultA()
	{
		System.out.println("Default");
		
	}
	@Test(priority=1)
	public void a_login()
	{
		System.out.println("Hello");
		
	}
	@Test(priority=0)
	public void b_login()
	{
		System.out.println("Zero");
		
	}
}
