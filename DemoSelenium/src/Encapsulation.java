class Demo3
{
	private Demo3()
	{
		System.out.println("constructor is executing");
	}
	
public static Demo3 getter() {
		
		System.out.println("get method");
		return new Demo3();
	}	
}

public class Encapsulation {
	
	public static void main(String[] args) {
			
		Demo3.getter();
	
}
}
