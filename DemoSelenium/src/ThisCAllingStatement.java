
public class ThisCAllingStatement {
	
	public ThisCAllingStatement()
	{
		
		this(2);
		System.out.println("aaa");
		
	}
	public ThisCAllingStatement(int a)
	{
		this(4,6);
		
		System.out.println("BBB");
	}
	public ThisCAllingStatement(int a,int b)
	{
		this(3,'r');
	
		System.out.println("CCC");
	}
	public ThisCAllingStatement(int a,char b)
	{
		System.out.println("DDD");
	}
	

	public static void main(String[] args) {
		
		ThisCAllingStatement ts=new ThisCAllingStatement();
		
	}

}
