
public class MethodOverloading {

	int a; // global
	
	public  void test(int a)
	{
		this.a=a ;
	}
	
	public static void test(int a,int b)
	{
		
		System.out.println("test1");
	}
	public static void test(boolean b)
	{
		System.out.println("test2");
	}
	public void test(char c)
	
	{
		
		System.out.println("test3");
	}
	
	
public static void main(String[] args) {
	
	MethodOverloading mo=new MethodOverloading();
	mo.test(2);

	}


}


