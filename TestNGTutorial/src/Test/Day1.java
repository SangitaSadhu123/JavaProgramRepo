package Test;

import org.testng.annotations.Test;

public class Day1 
{
 
@Test (priority=1)
public void login()
{
	System.out.println("Hello");
	
}
	
@Test(priority=-1)
public void YYY()
{
	System.out.println("YYY");
	
}
@Test(priority=0)
public void a_login()
{
	System.out.println("AZero");
	
}

@Test(priority=-2)
public void ZZZ()
{
	System.out.println("ZZZ");
	
}
@Test
public void ZAA()
{
	System.out.println("ZAA");
	
}
@Test
public void YZAA()
{
	System.out.println("YZAA");
	
}
}
