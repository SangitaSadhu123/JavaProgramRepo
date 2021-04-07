
public class ABC {
	public static void main(String[] args) 
    { 
	String s1 =new String("HELLO"); 
    String s2 =new String("HELLO"); 
    
        
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true
        
        String a1 ="HELLO"; 
        String a2 ="HELLO"; 
        
            
            System.out.println(a1 == a2);  //true
            System.out.println(a1.equals(a2)); //true
    } 

}
