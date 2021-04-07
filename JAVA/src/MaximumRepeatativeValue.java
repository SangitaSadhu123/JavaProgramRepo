import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumRepeatativeValue {

	public static void main(String[] args) {
		String str="java is session session session java";
		String splitword[]=str.split(" ");
		HashMap<String, Integer> hm=new HashMap<>();
		
		
		for(String duplicate:splitword)
		{
			Integer j=hm.get(duplicate);
			hm.put(duplicate, (j==null)?1:j+1);
		}
		
		int countMaxValue=Collections.max(hm.values());
		
		for(Map.Entry<String,Integer> map:hm.entrySet()) 
		{
			
			if(map.getValue()==countMaxValue)
			

				System.out.println("Maximum repeated value:  "+map.getKey()+" " +countMaxValue);
			
	}
		

	}

}
