
public class Demo1 {

	
	public Demo1()
	{
		
		System.out.println("aa");
	}
	
	public Demo1(int a) {
		
		
		System.out.println("parametarized1");
	}
public Demo1(char b) {
		
		
		System.out.println("parametarized2");
	}
public Demo1(char c,int b) {
	
	
	System.out.println("parametarized3");
}
	
	
	
	public static void main(String[] args) {
		
		
		
		Demo1 d=new Demo1(); // aa
		Demo1 d1=new Demo1(2); //parametarized
		
		Demo1 d2=new Demo1('c');
		Demo1 d3=new Demo1('b',3);
		

	}

}
