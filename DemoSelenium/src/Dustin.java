interface ABC
{
	void set();
	void get();

}

public class Dustin implements ABC

{

	public void get()
	{
		System.out.println("get method");
		
		
	}
	public void set()
	{
		System.out.println("set method");
		
		
	}
	
	public static void main(String[] args) {
		Dustin d=new Dustin();
		d.get();
		d.set();

	}

}
