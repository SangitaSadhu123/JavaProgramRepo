import java.util.*;

public class NumberOfStringCount {

	public static void main(String[] args) 
	{
		String str="java is session session java";
		
		String splitword[]=str.split(" ");
		
		
		HashMap<String, Integer> hm=new HashMap<>();
		
		
		for(String duplicate:splitword)
		{
			Integer j=hm.get(duplicate);
			hm.put(duplicate, (j==null)?1:j+1);
		}
	
		//System.out.println(hm);
		//System.out.println(hm.entrySet());
		
		
		for(Map.Entry<String,Integer> map:hm.entrySet()) 
		{
			System.out.println(map.getKey()+" "+map.getValue());
			
	}
		
		
		
		
	}

}
