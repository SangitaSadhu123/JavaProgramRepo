import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChar {

	public static void main(String[] args) {
	

		String str="alphaadida";
		int c=0;
	char[] ch=str.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<>();
		
		
		for(Character duplicate:ch)
		{
			Integer j=hm.get(duplicate);
			hm.put(duplicate, (j==null)?1:j+1);
		}
	
	
		for(Map.Entry<Character,Integer> map:hm.entrySet()) {
			//System.out.println(map.getKey()+" "+map.getValue());
			int count=map.getValue();
			//System.out.println(count);
			
			if(count==1)
			
				c++;
				//System.out.println("non repeated character: "+map.getKey()+"----> "+count);
				}
		System.out.println(c);

	}
}
