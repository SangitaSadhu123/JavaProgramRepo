import java.util.HashMap;
import java.util.Map;

public class NumberOfCharCount {

	public static void main(String[] args) {
		
			String str="aaabbaaac";
			
		char ch[]=str.toCharArray();
		
			HashMap<Character, Integer> hm=new HashMap<>();
			
			
			for(Character duplicate:ch)
			{
				Integer j=hm.get(duplicate);  //2
				
				hm.put(duplicate, (j==null)?1:j+1);  
			}
		
			
			// iteratating the map 
			for(Map.Entry<Character,Integer> map:hm.entrySet()) {
				System.out.println(map.getKey()+" "+map.getValue());
			
		}
			

	}

}
