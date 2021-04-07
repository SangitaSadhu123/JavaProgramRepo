package Test;

import org.testng.annotations.Test;

public class Day3 {
	@Test(priority=-3)
	public void b_login()
	{
		System.out.println("Hello");
		
	}
		
	@Test(dependsOnMethods="b_login")
	public void a_logout()
	{
		System.out.println("YYY");
		
	}
		
	@Test(priority=-2)
	public void ZZZ()
	{
		System.out.println("ZZZ");
		
	}
	@Test
	public void AAA()
	{
		System.out.println("AAA");
		
	}

}
