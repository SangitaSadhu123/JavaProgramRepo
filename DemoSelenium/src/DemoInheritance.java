 class Father 
{
	 public Father()
	 {
		 //super();
		 System.out.println("Father is executing");
		 
	 }
	
	 public Father(int a)
	 {
		 //super();
		 System.out.println("Father is executing");
		 
	 }
	 
public static void swimmer()
	{
		System.out.println("good swimmer");
	}

}

 
 class GrandFather 
 {
 	 public GrandFather()
 	 {
 		 //super();
 		 System.out.println("Father is executing");
 		 
 	 }
 public static void swimmer()
 	{
 		System.out.println("good swimmer");
 	}

 }

	
public class DemoInheritance extends Father
{
	public DemoInheritance()
	{
		super();
		System.out.println("DemoInheritance is executing ");
	}
	
	
	public static void main(String[] args) {
	
		
		
		DemoInheritance d=new DemoInheritance();
		
	}

}
