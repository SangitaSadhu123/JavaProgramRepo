
public class Demo 

{

	
int a=2; // non static variable
static int b=3;  //  static variable

	 public static void car()  //  static method
	 { 
System.out.println("abc");
System.out.println("xyx");
	 }
	 
	 public void cycle()  //  non static method
	 { 
System.out.println("abc");
System.out.println("xyx");
	 }
	 
	 public void get()  //  non static method
	 { 
System.out.println("abc");
cycle();
	 }	 
	 
	 
public static void main(String[] args) {

	
  System.out.println(Demo.b); // 3
  Demo.car();  // abc
  				//xyx

  
  // calling Non static member (variable or method)
  Demo d=new Demo();
  
  System.out.println(d.a);
  d.cycle();

	}

}
