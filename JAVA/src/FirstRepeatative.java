import java.util.HashMap;
import java.util.Map;

public class FirstRepeatative {

	public static void main(String[] args) {
	

				String str="aaabbc";
			char[] ch=str.toCharArray();
				HashMap<Character, Integer> hm=new HashMap<>();
				
				
				for(Character duplicate:ch)
				{
					Integer j=hm.get(duplicate);
					hm.put(duplicate, (j==null)?1:j+1);
					
				}
			
			
				for(Map.Entry<Character,Integer> map:hm.entrySet()) {
					
					int count=map.getValue(); // 3,2,1
					//System.out.println(count);
					if(count>1)
					{
						System.out.println("non repeated character " +map.getKey()+"---"+count);
						break;
					}
				
				
		
				}
		
		
		
	}

}
