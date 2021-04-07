import java.util.HashMap;
import java.util.Map;

public class NonRepeatedValueFromString {

	public static void main(String[] args) {

		String str="java is session session java";
		String splitword[]=str.split(" ");
		HashMap<String, Integer> hm=new HashMap<>();
		
		
		for(String duplicate:splitword)
		{
			Integer j=hm.get(duplicate);
			hm.put(duplicate, (j==null)?1:j+1);
			
		}
	
		
		for(Map.Entry<String,Integer> map:hm.entrySet()) 
		{
			//System.out.println(map.getKey()+" "+map.getValue());
			
			
			int count=map.getValue(); //2,2,1
			if(count==1)
				System.out.println("1st repeated string   "+map.getKey());
			
	}
		
		

	}

}
